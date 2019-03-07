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
