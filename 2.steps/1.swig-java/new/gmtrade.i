%module(directors="1") gmtrade
 
%{
/* i文件中（例如变量类型）使用到的头文件 */
#include "gmtrade.h"
%}

/* SWIG要解析的头文件 */
%feature("director") GmTrade;
%include "gmtrade_def.h"
%include "gmtrade.h"

namespace gmtrade {
/* %template(AccountDataArray) DataArray<Account>; */
/* %template(CashDataArray) DataArray<Cash>; */
%template(ExecRptDataArray) DataArray<ExecRpt>;
%template(OrderDataArray) DataArray<Order>;
/* %template(ParameterDataArray) DataArray<Parameter>; */
%template(PositionDataArray) DataArray<Position>;
}