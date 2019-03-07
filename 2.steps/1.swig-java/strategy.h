#ifndef GMCXXSDK_STRATEGY_H
#define GMCXXSDK_STRATEGY_H

#include "gmapi.h"

#define GM_CLASS GM_CXX_API 

class GM_CLASS Strategy
{
public:
	Strategy(const char *token, const char *strategy_id, int mode);
	Strategy();
	virtual ~Strategy();

public: //基础函数

	//运行策略
	int run();

	//停止策略
	void stop();

	//设置策略ID
	void set_strategy_id(const char *strategy_id);

	//设置用户token
	void set_token(const char *token);

	//设置策略运行模式
	void set_mode(int mode);

	//定时任务
	int schedule(const char *data_rule, const char *time_rule);

	//当前时间
	long long now();

	//设置回测参数
	int set_backtest_config(
		const char  *start_time,
		const char  *end_time,
		double initial_cash = 1000000,
		double transaction_ratio = 1,
		double commission_ratio = 0,
		double slippage_ratio = 0,
		int    adjust = 0,
		int    check_cache = 1
	);

public: //数据函数

		// 订阅行情
	int subscribe(const char *symbols, const char * frequency, bool unsubscribe_previous = false);

	// 退订行情
	int unsubscribe(const char *symbols, const char * frequency);


public: //交易函数

	//查询交易账号
	DataArray<Account>* get_accounts();

	//按指定量委托
	Order order_volume(const char *symbol, int volume, int side, int order_type, int position_effect, double price = 0, const char *account = NULL);

	//按指定价值委托
	Order order_value(const char *symbol, double value, int side, int order_type, int position_effect, double price = 0, const char *account = NULL);

	//按总资产指定比例委托
	Order order_percent(const char *symbol, double percent, int side, int order_type, int position_effect, double price = 0, const char *account = NULL);

	//调仓到目标持仓量
	Order order_target_volume(const char *symbol, int volume, int position_side, int order_type, double price = 0, const char *account = NULL);

	//调仓到目标持仓额
	Order order_target_value(const char *symbol, double value, int position_side, int order_type, double price = 0, const char *account = NULL);

	//调仓到目标持仓比例（总资产的比例）
	Order order_target_percent(const char *symbol, double percent, int position_side, int order_type, double price = 0, const char *account = NULL);

	//平当前所有可平持仓
	DataArray<Order>* order_close_all();

	//委托撤单
	int order_cancel(const char *cl_ord_id, const char *account = NULL);

	//撤销所有委托
	int order_cancel_all();

	//查询委托
	DataArray<Order>* get_orders(const char *account = NULL);

	//查询未结委托
	DataArray<Order>* get_unfinished_orders(const char *account = NULL);

	//查询成交
	DataArray<ExecRpt>* get_execution_reports(const char *account = NULL);

	//查询资金
	DataArray<Cash>* get_cash(const char *accounts = NULL);

	//查询持仓
	DataArray<Position>* get_position(const char *account = NULL);


public: //策略参数类函数

	//添加参数
	int add_parameters(Parameter *params, int count);

	//删除参数
	int del_parameters(const char *keys);

	//设置参数
	int set_parameters(Parameter *params, int count);

	//获取参数
	DataArray<Parameter>* get_parameters();

	//设置标的
	int set_symbols(const char *symbols);

	//获取标的
	DataArray<Symbol>* get_symbols();


public: //事件函数

		//初始化完成
		virtual void on_init();
		//收到Tick行情
		virtual void on_tick(Tick *tick);
		//收到bar行情
		virtual void on_bar(Bar *bar);
		//委托变化
		virtual void on_order_status(Order *order);
		//执行回报
		virtual void on_execution_report(ExecRpt *rpt);
		//参数变化
		virtual void on_parameter(Parameter *param);
		//定时任务触发
		virtual void on_schedule(const char *data_rule, const char *time_rule);
		//回测完成后收到绩效报告
		virtual void on_backtest_finished(Indicator *indicator);
		//实盘账号状态变化
		virtual void on_account_status(AccountStatus *account_status);
		//错误产生
		virtual void on_error(int error_code, const char *error_msg);
		//收到策略停止信号
		virtual void on_stop();
		//数据已经连接上
		virtual void on_market_data_connected();
		//交易已经连接上
		virtual void on_trade_data_connected();
		//数据连接断开了
		virtual void on_market_data_disconnected();
		//交易连接断开了
		virtual void on_trade_data_disconnected();

};




#endif
