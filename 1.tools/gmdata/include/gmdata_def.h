#ifndef GMDATA_DEF_H
#define GMDATA_DEF_H


#ifdef WIN32
#ifdef GMSDKC_EXPORTS  
#define GM_DATA_API __declspec(dllexport)
#else
#define GM_DATA_API __declspec(dllimport)
#endif
#else
#define GM_DATA_API
#endif

const unsigned int LEN_DATA_SYMBOL = 32;
const unsigned int LEN_EXCHANGE = 8;
const unsigned int LEN_ISO_DATATIME = 36;
const unsigned int LEN_FREQUENCY = 8;
const unsigned int DEPTH_OF_QUOTE = 10;


typedef char Symbol[LEN_DATA_SYMBOL];
typedef char TradingDate[LEN_ISO_DATATIME];

struct Bar
{
	char                    symbol[LEN_DATA_SYMBOL];
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
	char                   symbol[LEN_DATA_SYMBOL];
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

namespace gmdata
{
	//结果集合
	class DataSet
	{
	public:
		//获取api调用结果, 0: 成功， 非0: 错误码
		virtual int status() = 0;

		//判断是否已经是到达结果集末尾
		virtual bool is_end() = 0;

		//移到下一条记录
		virtual void next() = 0;

		//获取整型值
		virtual int get_integer(const char *key) = 0;

		//获取长整型值
		virtual long long get_long_integer(const char *key) = 0;

		//获取浮点型值
		virtual double get_real(const char *key) = 0;

		//获取字符串型值
		virtual const char* get_string(const char *key) = 0;

		//释放数据集合
		virtual void release() = 0;

		//打印数据
		virtual const char* debug_string() = 0;
	};

	//结果数组
	template <typename T>
	class DataArray
	{
	public:
		//获取api调用结果, 0: 成功， 非0: 错误码
		virtual int status() = 0;

		//返回结构数组的指针
		virtual T* data() = 0;

		//返回数据的长度
		virtual int count() = 0;

		//返回下标为i的结构引用，从0开始
		virtual T& at(int i) = 0;

		//释放数据集合
		virtual void release() = 0;
	};

} //namespace gmdata

#endif
