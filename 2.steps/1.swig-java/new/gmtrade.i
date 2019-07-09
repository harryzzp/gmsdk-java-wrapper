%module(directors="1") gmtrade
 
%{
/* i文件中（例如变量类型）使用到的头文件 */
#include "gmtrade.h"
%}

/* SWIG要解析的头文件 */
%feature("director") Trade;
%include "gmtrade_def.h"
%include "gmtrade.h"

namespace gmtrade {
%template(AccountStatusDataArray) DataArray<AccountStatus>;
%template(ExecRptDataArray) DataArray<ExecRpt>;
%template(OrderDataArray) DataArray<Order>;
%template(PositionDataArray) DataArray<Position>;
}