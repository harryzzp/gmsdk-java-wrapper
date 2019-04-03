#ifndef GMDATA_H
#define GMDATA_H
#include <stdio.h>
#include "gmdata_def.h"

namespace gmdata
{

	class GM_DATA_API Data
	{
	public:
		Data(const char *token);
		Data();
		virtual ~Data();

	public: //基础函数

		// 设置token
		void set_token(const char *token);

		// 自定义服务地址
		void set_endpoint(const char *addr);

		//开始接收行情
		int start();

		//停止接收行情
		void stop();


	public: //数据函数

		// 订阅行情
		int subscribe(const char *symbols, const char * frequency, bool unsubscribe_previous = false);

		// 退订行情
		int unsubscribe(const char *symbols, const char * frequency);

		// 查询当前行情快照
		DataArray<Tick>* current(const char *symbols);

		// 查询历史Tick行情
		DataArray<Tick>* history_ticks(const char *symbols, const char *start_time, const char *end_time, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		// 查询历史Bar行情
		DataArray<Bar>* history_bars(const char *symbols, const char *frequency, const char *start_time, const char *end_time, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		// 查询最新n条Tick行情
		DataArray<Tick>* history_ticks_n(const char *symbols, int n, const char *end_time = NULL, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		//查询最新n条Bar行情
		DataArray<Bar>* history_bars_n(const char *symbols, const char *frequency, int n, const char *end_time = NULL, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		// 查询基本面数据
		DataSet* get_fundamentals(const char *table, const char *symbols, const char *start_date, const char *end_date, const char *fields, const char *filter = NULL, const char *order_by = NULL, int limit = 1000);

		// 查询基本面数据最新n条
		DataSet* get_fundamentals_n(const char *table, const char *symbols, const char *end_date, const char *fields, int n = 1, const char *filter = NULL, const char * order_by = NULL);

		// 查询最新交易标的信息
		DataSet* get_instruments(const char *exchanges = NULL, const char *sec_types = NULL, const char* fields = NULL);

		// 查询交易标的历史数据
		DataSet* get_history_instruments(const char *symbols, const char *start_date, const char *end_date, const char *fields = NULL);

		// 查询交易标的基本信息
		DataSet* get_instrumentinfos(const char *symbols = NULL, const char *exchanges = NULL, const char * sec_types = NULL, const char *names = NULL, const char *fields = NULL);

		// 查询指数成份股
		DataSet* get_constituents(const char *index, const char *trade_date = NULL);

		// 查询行业股票列表
		DataArray<Symbol>* get_industry(const char *code);

		// 查询概念板块股票列表
		DataArray<Symbol>* get_concept(const char *code);

		// 查询交易日列表
		DataArray<TradingDate>* get_trading_dates(const char *exchange, const char *start_date, const char *end_date);

		// 返回指定日期的上一个交易日
		int get_previous_trading_date(const char *exchange, const char *date, char *output_date);

		// 返回指定日期的下一个交易日
		int get_next_trading_date(const char *exchange, const char *date, char *output_date);

		// 查询分红送配
		DataSet* get_dividend(const char *symbol, const char *start_date, const char *end_date);

		// 获取连续合约
		DataSet* get_continuous_contracts(const char *csymbol, const char *start_date, const char *end_date);


	public: //事件函数

		//收到Tick行情
		virtual void on_tick(Tick *tick);
		//收到bar行情
		virtual void on_bar(Bar *bar);
		//错误产生
		virtual void on_error(int error_code, const char *error_msg);
		//数据已经连接上
		virtual void on_market_data_connected();
		//数据连接断开了
		virtual void on_market_data_disconnected();
	};

} //namespace gmdata

#endif
