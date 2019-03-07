#ifndef GMCSDK_DEF_H
#define GMCSDK_DEF_H


const unsigned int LEN_ID = 64;
const unsigned int LEN_NAME = 64;
const unsigned int LEN_SYMBOL = 32;
const unsigned int LEN_INFO = 128;
const unsigned int LEN_EXCHANGE = 8;
const unsigned int LEN_ISO_DATATIME = 36;
const unsigned int LEN_FREQUENCY = 8;
const unsigned int DEPTH_OF_QUOTE = 10;

enum StrategyMode
{
	MODE_UNDEF = 0,          //未定义， 策略不会运行
	MODE_LIVE = 1,           //实盘与仿真模式
	MODE_BACKTEST = 2        //回测模式
};

enum OrderStatus
{
	OrderStatus_Unknown = 0,
	OrderStatus_New = 1,                   //已报
	OrderStatus_PartiallyFilled = 2,       //部成
	OrderStatus_Filled = 3,                //已成
	OrderStatus_DoneForDay = 4,            //
	OrderStatus_Canceled = 5,              //已撤
	OrderStatus_PendingCancel = 6,         //待撤
	OrderStatus_Stopped = 7,               //
	OrderStatus_Rejected = 8,              //已拒绝
	OrderStatus_Suspended = 9,             //挂起
	OrderStatus_PendingNew = 10,           //待报
	OrderStatus_Calculated = 11,           //
	OrderStatus_Expired = 12,              //已过期
	OrderStatus_AcceptedForBidding = 13,   //
	OrderStatus_PendingReplace = 14,       //
};

//执行回报类型
enum ExecType
{
	ExecType_Unknown = 0,
	ExecType_New = 1,                      //已报
	ExecType_DoneForDay = 4,               //
	ExecType_Canceled = 5,                 //已撤销
	ExecType_PendingCancel = 6,            //待撤销
	ExecType_Stopped = 7,                  //
	ExecType_Rejected = 8,                 //已拒绝
	ExecType_Suspended = 9,                //挂起
	ExecType_PendingNew = 10,              //待报
	ExecType_Calculated = 11,              //
	ExecType_Expired = 12,                 //过期
	ExecType_Restated = 13,                //
	ExecType_PendingReplace = 14,          //
	ExecType_Trade = 15,                   //成交
	ExecType_TradeCorrect = 16,            //
	ExecType_TradeCancel = 17,             //
	ExecType_OrderStatus = 18,             //委托状态
	ExecType_CancelRejected = 19,          //撤单被拒绝
};

//委托拒绝原因
enum OrderRejectReason
{
	OrderRejectReason_Unknown = 0,                           //未知原因
	OrderRejectReason_RiskRuleCheckFailed = 1,               //不符合风控规则 
	OrderRejectReason_NoEnoughCash = 2,                      //资金不足
	OrderRejectReason_NoEnoughPosition = 3,                  //仓位不足
	OrderRejectReason_IllegalAccountId = 4,                  //非法账户ID
	OrderRejectReason_IllegalStrategyId = 5,                 //非法策略ID
	OrderRejectReason_IllegalSymbol = 6,                     //非法交易代码
	OrderRejectReason_IllegalVolume = 7,                     //非法委托量
	OrderRejectReason_IllegalPrice = 8,                      //非法委托价
	OrderRejectReason_AccountDisabled = 10,                  //交易账号被禁止交易
	OrderRejectReason_AccountDisconnected = 11,              //交易账号未连接
	OrderRejectReason_AccountLoggedout = 12,                 //交易账号未登录
	OrderRejectReason_NotInTradingSession = 13,              //非交易时段
	OrderRejectReason_OrderTypeNotSupported = 14,            //委托类型不支持
	OrderRejectReason_Throttle = 15,                         //流控限制
	OrderRejectReason_SymbolSusppended = 16,                 //交易代码停牌
	OrderRejectReason_Internal = 999,                        //内部错误

	CancelOrderRejectReason_OrderFinalized = 101,            //委托已完成
	CancelOrderRejectReason_UnknownOrder = 102,              //未知委托
	CancelOrderRejectReason_BrokerOption = 103,              //柜台设置
	CancelOrderRejectReason_AlreadyInPendingCancel = 104,    //委托撤销中
};

//委托方向
enum OrderSide
{
	OrderSide_Unknown = 0,
	OrderSide_Buy = 1,    //买入
	OrderSide_Sell = 2,    //卖出
};

//委托类型
enum OrderType
{
	OrderType_Unknown = 0,
	OrderType_Limit = 1,    //限价委托
	OrderType_Market = 2,    //市价委托
	OrderType_Stop = 3,    //止损止盈委托
};

//委托时间属性
enum OrderDuration
{
	OrderDuration_Unknown = 0,
	OrderDuration_FAK = 1,  //即时成交剩余撤销(fill and kill)
	OrderDuration_FOK = 2,  //即时全额成交或撤销(fill or kill)
	OrderDuration_GFD = 3,  //当日有效(good for day)
	OrderDuration_GFS = 4,  //本节有效(good for section)
	OrderDuration_GTD = 5,  //指定日期前有效(goodl till date)
	OrderDuration_GTC = 6,  //撤销前有效(good till cancel)
	OrderDuration_GFA = 7,  //集合竞价前有效(good for auction)
};

//委托成交属性
enum OrderQualifier
{
	OrderQualifier_Unknown = 0,
	OrderQualifier_BOC = 1,  //对方最优价格(best of counterparty)
	OrderQualifier_BOP = 2,  //己方最优价格(best of party)
	OrderQualifier_B5TC = 3,  //最优五档剩余撤销(best 5 then cancel)
	OrderQualifier_B5TL = 4,  //最优五档剩余转限价(best 5 then limit)
};


//持仓方向
enum PositionSide
{
	PositionSide_Unknown = 0,
	PositionSide_Long = 1,   //多方向
	PositionSide_Short = 2,   //空方向
};

//开平标志
enum PositionEffect
{
	PositionEffect_Unknown = 0,
	PositionEffect_Open = 1,     //开仓
	PositionEffect_Close = 2,     //平仓,具体语义取决于对应的交易所
	PositionEffect_CloseToday = 3,     //平今仓
	PositionEffect_CloseYesterday = 4,     //平昨仓
};

//资金持仓变更原因
enum CashPositionChangeReason
{
	CashPositionChangeReason_Unknown = 0,
	CashPositionChangeReason_Trade = 1,  //交易
	CashPositionChangeReason_Inout = 2,  //出入金/出入持仓
	CashPositionChangeReason_Dividend = 3,  //分红送股
};

enum AccountState
{
	State_UNKNOWN = 0,       //未知
	State_CONNECTING = 1,    //连接中
	State_CONNECTED = 2,     //已连接
	State_LOGGEDIN = 3,      //已登录
	State_DISCONNECTING = 4, //断开中
	State_DISCONNECTED = 5,  //已断开
	State_ERROR = 6          //错误
};


typedef char Symbol[LEN_SYMBOL];
typedef char TradingDate[LEN_ISO_DATATIME];

struct Bar
{
	char                    symbol[LEN_SYMBOL];
	double                  bob;                          ///bar的开始时间
	double                  eob;                          ///bar的结束时间
	float                   open;                         ///<开盘价
	float                   close;                        ///<收盘价
	float                   high;                         ///<最高价
	float                   low;                          ///<最低价
	double                  volume;                       ///<成交量
	double                  amount;                       ///<成交金额
	float                   pre_close;                    ///昨收盘价，只有日频数据赋值

	long long               position;                     ///<持仓量
	char                    frequency[LEN_FREQUENCY];     ///bar频度
};

struct Quote
{
	float      bid_price;                            ///本档委买价
	long long  bid_volume;                           ///本档委买量
	float      ask_price;                            ///本档委卖价
	long long  ask_volume;                           ///本档委卖量
};

struct Tick
{
	char                   symbol[LEN_SYMBOL];
	double                 created_at;               ///<utc时间，精确到毫秒
	float                  price;                    ///<最新价
	float                  open;                     ///<开盘价
	float                  high;                     ///<最高价
	float                  low;                      ///<最低价
	double                 cum_volume;               ///<成交总量
	double                 cum_amount;               ///<成交总金额/最新成交额,累计值
	long long              cum_position;             ///<合约持仓量(期),累计值
	double                 last_amount;              ///<瞬时成交额
	int                    last_volume;              ///<瞬时成交量
	int                    trade_type;               ///(保留)交易类型,对应多开,多平等类型
	Quote                  quotes[DEPTH_OF_QUOTE];   ///报价, 下标从0开始，0-表示第一档，1-表示第二档，依次类推

};


struct Order
{
	char         strategy_id[LEN_ID];                     //策略ID                                      
	char         account_id[LEN_ID];                      //账号ID                                      
	char         account_name[LEN_NAME];                  //账户登录名                                  

	char         cl_ord_id[LEN_ID];                       //委托客户端ID                                
	char         order_id[LEN_ID];                        //委托柜台ID                                  
	char         ex_ord_id[LEN_ID];                       //委托交易所ID                                

	char         symbol[LEN_SYMBOL];                      //symbol                                      
	int          side;                                    //买卖方向，取值参考enum OrderSide            
	int          position_effect;                         //开平标志，取值参考enum PositionEffect       
	int          position_side;                           //持仓方向，取值参考enum PositionSide         

	int          order_type;                              //委托类型，取值参考enum OrderType            
	int          order_duration;                          //委托时间属性，取值参考enum OrderDuration    
	int          order_qualifier;                         //委托成交属性，取值参考enum OrderQualifier   
	int          order_src;                               //委托来源，取值参考enum OrderSrc             

	int          status;                                  //委托状态，取值参考enum OrderStatus          
	int          ord_rej_reason;                          //委托拒绝原因，取值参考enum OrderRejectReason
	char         ord_rej_reason_detail[LEN_INFO];         //委托拒绝原因描述                            

	double       price;                                   //委托价格                                    
	double       stop_price;                              //委托止损/止盈触发价格                       

	int          order_style;                             //委托风格，取值参考 enum OrderStyle          
	long long    volume;                                  //委托量                                      
	double       value;                                   //委托额                                      
	double       percent;                                 //委托百分比                                  
	long long    target_volume;                           //委托目标量                                  
	double       target_value;                            //委托目标额                                  
	double       target_percent;                          //委托目标百分比                              

	long long    filled_volume;                           //已成量                                      
	double       filled_vwap;                             //已成均价                                    
	double       filled_amount;                           //已成金额                                    
	double       filled_commission;                       //已成手续费                                  

	long long    created_at;                              //委托创建时间                                
	long long    updated_at;                              //委托更新时间  
};

struct ExecRpt
{
	char               strategy_id[LEN_ID];                  //策略ID                                                                                                        
	char               account_id[LEN_ID];                   //账号ID                                                       
	char               account_name[LEN_NAME];               //账户登录名                                                                                                    

	char               cl_ord_id[LEN_ID];                    //委托客户端ID                                                                                                  
	char               order_id[LEN_ID];                     //委托柜台ID                                                                                                    
	char               exec_id[LEN_ID];                      //委托回报ID                                                                                                    

	char               symbol[LEN_SYMBOL];                   //symbol                                                                                                        

	int                position_effect;                      //开平标志，取值参考enum PositionEffect                                                                         
	int                side;                                 //买卖方向，取值参考enum OrderSide                                                                              
	int                ord_rej_reason;                       //委托拒绝原因，取值参考enum OrderRejectReason                                                                  
	char               ord_rej_reason_detail[LEN_INFO];      //委托拒绝原因描述                                                                                              
	int                exec_type;                            //执行回报类型, 取值参考enum ExecType                                                                           

	double             price;                                //委托成交价格                                                                                                  
	long long          volume;                               //委托成交量                                                                                                    
	double             amount;                               //委托成交金额                                                                                                  
	double             commission;                           //委托成交手续费                                                                                                
	double             cost;                                 //委托成交成本金额  
	long long          created_at;                           //回报创建时间

};

struct Cash
{
	char          account_id[LEN_ID];                        //账号ID               
	char          account_name[LEN_NAME];                    //账户登录名                                                                   

	int           currency;                                  //币种                                                                         

	double        nav;                                        //净值(cum_inout + cum_pnl + fpnl - cum_commission)                            
	double        pnl;                                        //净收益(nav-cum_inout)                                                        
	double        fpnl;                                       //浮动盈亏(sum(each position fpnl))                                            
	double        frozen;                                     //持仓占用资金                                                                 
	double        order_frozen;                               //挂单冻结资金                                                                 
	double        available;                                  //可用资金                                                                     
															  //no  leverage:  available=(cum_inout + cum_pnl - cum_commission - frozen - order_frozen)        
															  //has leverage:  fpnl     =(fpnl>0 ? fpnl : (frozen < |fpnl|) ? (frozen-|fpnl|) : 0)             
															  //               available=(cum_inout + cum_pnl - cum_commission - frozen - order_frozen + fpnl) 
	double        balance;                                    //资金余额                                                                     

	double        cum_inout;                                  //累计出入金                                                                   
	double        cum_trade;                                  //累计交易额                                                                   
	double        cum_pnl;                                    //累计平仓收益(没扣除手续费)                                                   
	double        cum_commission;                             //累计手续费                                                                   

	double        last_trade;                                 //上一次交易额                                                                 
	double        last_pnl;                                   //上一次收益                                                                   
	double        last_commission;                            //上一次手续费                                                                 
	double        last_inout;                                 //上一次出入金                                                                 
	int           change_reason;                              //资金变更原因，取值参考enum CashPositionChangeReason                          
	char          change_event_id[LEN_ID];                    //触发资金变更事件的ID     

	long long     created_at;                                 //资金初始时间
	long long     updated_at;                                 //资金变更时间

};

struct Position
{
	char                 account_id[LEN_ID];              //账号ID                                       
	char                 account_name[LEN_NAME];          //账户登录名                                                                                       

	char                 symbol[LEN_SYMBOL];              //symbol                                       
	int                  side;                            //持仓方向，取值参考enum PositionSide          
	long long            volume;                          //总持仓量; 昨持仓量(volume-volume_today)                                                          
	long long            volume_today;                    //今日持仓量                                                                                       
	double               vwap;                            //持仓均价                                                                                         
	double               amount;                          //持仓额(volume*vwap*multiplier)                                                                   

	double               price;                           //当前行情价格                                                                                     
	double               fpnl;                            //持仓浮动盈亏((price-vwap)*volume*multiplier)                                                     
	double               cost;                            //持仓成本(vwap*volume*multiplier*margin_ratio)                                                    
	long long            order_frozen;                    //挂单冻结仓位                                                                                     
	long long            order_frozen_today;              //挂单冻结今仓仓位                                                                                 
	long long            available;                       //可平总仓位(volume-order_frozen); 可平昨仓位(available-available_today)                           
	long long            available_today;                 //可平今仓位(volume_today-order_frozen_today)                                                      

	double               last_price;                      //上一次成交价                                                                                     
	long long            last_volume;                     //上一次成交量                                                                                     
	long long            last_inout;                      //上一次出入持仓量                                                                                 
	int                  change_reason;                   //仓位变更原因，取值参考enum CashPositionChangeReason                                              
	char                 change_event_id[LEN_ID];         //触发资金变更事件的ID                                                                             

	int                  has_dividend;                    //持仓区间有分红配送   
	long long            created_at;                      //建仓时间
	long long            updated_at;                      //仓位变更时间

};

struct Account 
{
	char            account_id[LEN_ID];           //账号ID
	char            account_name[LEN_NAME];       //账户登录名
	char            title[LEN_NAME];              //账号名称
	char            intro[LEN_INFO];              //账号描述
	char            comment[LEN_INFO];            //账号备注
};

struct AccountStatus
{
	char            account_id[LEN_ID];           //账号ID
	char            account_name[LEN_NAME];       //账户登录名
	int             state;                        //账户状态
	int             error_code;                   //错误码
	char            error_msg[LEN_INFO];          //错误信息
};

struct Parameter
{
	char   key[LEN_ID];          //参数键
	double value;                //参数值
	double min;                  //可设置的最小值
	double max;                  //可设置的最大值
	char   name[LEN_NAME];       //参数名
	char   intro[LEN_INFO];      //参数说明
	char   group[LEN_NAME];      //组名
	bool   readonly;             //是否只读
};

struct Indicator
{
	char      account_id[LEN_ID];             //账号ID
	double    pnl_ratio;                      //累计收益率(pnl/cum_inout)
	double    pnl_ratio_annual;               //年化收益率
	double    sharp_ratio;                    //夏普比率
	double    max_drawdown;                   //最大回撤
	double    risk_ratio;                     //风险比率
	int       open_count;                     //开仓次数
	int       close_count;                    //平仓次数
	int       win_count;                      //盈利次数
	int       lose_count;                     //亏损次数
	double    win_ratio;                      //胜率

	long long  created_at;                    //指标创建时间
	long long  updated_at;                    //指标变更时间
};


#endif
