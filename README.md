# gmsdk-java-wrapper
掘金C++ SDK的Java接口打包实现

## 介绍
本项目实现了在Windows平台上，使用SWIG封装掘金C++版本的SDK，生成JNI代码以及可被调用的DLL动态库。

## 使用说明
- 如果你不想自己编译，希望直接拿来开发客户端系统，可以使用目录./2.steps/1.swig-java/src/下的Java代码作为JNI接口，加载./3.release目录下的dll动态库
- 注意JDK调用时，区分32位和64位的dll
- 尚未全面测试，请谨慎使用

## 目录结构:
1. tools
- 包括项目编译需要的依赖库、swigwin和掘金C++版SDK
2. steps
- 1. swig-java
    - swig编译Java需要的.h头文件
    - 自己编写的.i文件
    - 生成的.cxx, .cpp文件
- 2. wrap-dll
    - VC++项目：gmsdk_wrap 
3. release
- 通过steps编译生成的dll文件

## 编译教程
### 本项目中使用的编译开发环境：
- JDK1.8.0_192 x64
- Visual Studio 2017
- Windows Server 2019
### SWIG生成Java接口文件
1. 解压安装swigwin-3.0.12.zip,配置本地环境变量PATH，方便直接运行swig.exe
2. iconv.h和libiconv.lib可解决乱码（目前没有使用）
3. 解压sdk0-cpp-windows-32&64-3.0.4.zip,拷贝sdk-cpp-windows-32&64-3.0.4\gmsdk\include目录中的.h文件到1.swig-java目录
4. 在1.swig-java目录中创建gmsdk.i文件
```
%module(directors="1") gmsdk
 
%{
/* i文件中（例如变量类型）使用到的头文件 */
#include "strategy.h"
%}

/* SWIG要解析的头文件 */
%feature("director") Strategy;
%include "gmapi.h"
%include "error.h"
%include "gmdef.h"
%include "strategy.h"

/* 初始化 template class */
/* 参考用例：%template(doubleList) List<double>; */
%template(AccountDataArray) DataArray<Account>;
%template(BarDataArray) DataArray<Bar>;
%template(CashDataArray) DataArray<Cash>;
%template(ExecRptDataArray) DataArray<ExecRpt>;
%template(OrderDataArray) DataArray<Order>;
%template(ParameterDataArray) DataArray<Parameter>;
%template(PositionDataArray) DataArray<Position>;
%template(SymbolDataArray) DataArray<Symbol>;
%template(TickDataArray) DataArray<Tick>;
%template(TradingDateDataArray) DataArray<TradingDate>;

%include <carrays.i>
%extend Tick { 
	Quote getQuoteAt(int index) 
	{
		return self->quotes[index];
	}
}

```
5. 在1.swig-java目录打开PowerShell，运行SWIG生成Java文件到预先创建的src目录
```PowerShell
swig -c++ -java -package io.ft.api.gm -outdir ./src -o gmsdk_wrap.cpp gmsdk.i
```
6. 同时生成gmsdk_wrap.h和gmsdk_wrap.cpp文件，SWIG命令说明如下
```
-c++ 指定当前语言是C++还是C，默认是C，只有这两种，没有其他的
-java 生成的包装语言,可以使其他任何一种支持的语言 如-python -csharp
-package 生成的Java包名
-outdir Java文件的输出目录
-o 输出的CXX文件名，这里我们重定向到.cpp文件方便后面编译
```
### VC++编译DLL动态库（以64位为例）
1. 用VS2017打开./2.steps/2.wrap-dll/gmsdk_wrap目录中的gmsdk_wrap.sln加载项目，注意需要修改项目属性：
- 配置：Release
- 平台：x64
- 配置属性-常规-项目默认值-配置类型：动态库(.dll)
- 配置属性-C/C++-代码生成-运行库：多线程(/MT)
- 配置属性-C/C++-预编译头-预编译头：不适用预编译头
2. 拷贝以下文件，并作为现有项添加到VS工程
```
error.h
gmapi.h
gmdef.h
strategy.h
gmsdk_wrap.h
gmsdk_wrap.cpp
gmsdk.dll
gmsdk.lib
```
4. 因为gmsdk_wrap.cpp文件中包含jni.h，所以需要将JDK1.8.0_192目录include下的jni.h和include\win32文件夹下的jni_md.h, jawt_md.h一共三个文件拷贝到VS的include目录(我的是C:\Program Files (x86)\Microsoft Visual Studio\2017\Enterprise\VC\Auxiliary\VS\include)
```
jni.h
jni_md.h
jawt_md.h
```
4. 按F7生成解决方案，编译成功后可在项目的x64目录中找到可供JNI调用的gmsdk_wrap.dll
5. 将sdk提供的gmsdk.dll，src目录中的Java文件，以及刚才生成的gmsdk_wrap.dll添加到你的Java工程就可以调用掘金的C++SDK了

## 相关项目
简单写了一个[gmsdk-java-demo](https://github.com/harryzzp/gmsdk-java-demo)项目，利用本项目编译出的依赖项调用掘金接口，仅供参考。
