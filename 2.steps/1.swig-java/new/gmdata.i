%module(directors="1") gmdata
 
%{
/* i文件中（例如变量类型）使用到的头文件 */
#include "gmdata.h"
%}

/* SWIG要解析的头文件 */
%feature("director") GmData;
%include "gmdata_def.h"
%include "gmdata.h"

namespace gmdata {
%template(BarDataArray) DataArray<Bar>;
%template(TickDataArray) DataArray<Tick>;
%template(SymbolDataArray) DataArray<Symbol>;
%template(TradingDateDataArray) DataArray<TradingDate>;
}

%include <carrays.i>
%extend Tick { 
	Quote getQuoteAt(int index) 
	{
		return self->quotes[index];
	}
}