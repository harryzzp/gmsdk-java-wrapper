%module(directors="1") gmdata
 
%{
/* i文件中（例如变量类型）使用到的头文件 */
#include "gmdata.h"
%}

/* SWIG要解析的头文件 */
%feature("director") Data;
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

%include <carrays.i>
%extend gmdata::Data { 
	int get_previous_trading_date(const char *exchange, const char *date)
	{
		char output_date[32] = {0};
		int ret = self->get_previous_trading_date(exchange, date, output_date);
		if(0 == ret)
		{
			char tmp[32] = { 0 };
			int result = 0;

			memcpy(tmp, output_date, 4);
			result += atoi(tmp) * 10000;

			memset(tmp, 0, 32);
			memcpy(tmp, output_date + 5, 2);
			result += atoi(tmp) * 100;

			memset(tmp, 0, 32);
			memcpy(tmp, output_date + 8, 2);
			result += atoi(tmp);

			return result;
		}
		else
		{
			return 0;
		}
	}

	int get_next_trading_date(const char *exchange, const char *date)
	{
		char output_date[32] = {0};
		int ret = self->get_next_trading_date(exchange, date, output_date);
		if(0 == ret)
		{
			char tmp[32] = { 0 };
			int result = 0;

			memcpy(tmp, output_date, 4);
			result += atoi(tmp) * 10000;

			memset(tmp, 0, 32);
			memcpy(tmp, output_date + 5, 2);
			result += atoi(tmp) * 100;

			memset(tmp, 0, 32);
			memcpy(tmp, output_date + 8, 2);
			result += atoi(tmp);

			return result;
		}
		else
		{
			return 0;
		}
	}
}