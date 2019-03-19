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