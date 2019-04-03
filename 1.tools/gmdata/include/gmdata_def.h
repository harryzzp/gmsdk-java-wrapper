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
	double                  bob;                          ///bar�Ŀ�ʼʱ��
	double                  eob;                          ///bar�Ľ���ʱ��
	float                   open;                         ///<���̼�
	float                   close;                        ///<���̼�
	float                   high;                         ///<��߼�
	float                   low;                          ///<��ͼ�
	double                  volume;                       ///<�ɽ���
	double                  amount;                       ///<�ɽ����
	float                   pre_close;                    ///�����̼ۣ�ֻ����Ƶ���ݸ�ֵ

	long long               position;                     ///<�ֲ���
	char                    frequency[LEN_FREQUENCY];     ///barƵ��
};

struct Quote
{
	float      bid_price;                            ///����ί���
	long long  bid_volume;                           ///����ί����
	float      ask_price;                            ///����ί����
	long long  ask_volume;                           ///����ί����
};

struct Tick
{
	char                   symbol[LEN_DATA_SYMBOL];
	double                 created_at;               ///<utcʱ�䣬��ȷ������
	float                  price;                    ///<���¼�
	float                  open;                     ///<���̼�
	float                  high;                     ///<��߼�
	float                  low;                      ///<��ͼ�
	double                 cum_volume;               ///<�ɽ�����
	double                 cum_amount;               ///<�ɽ��ܽ��/���³ɽ���,�ۼ�ֵ
	long long              cum_position;             ///<��Լ�ֲ���(��),�ۼ�ֵ
	double                 last_amount;              ///<˲ʱ�ɽ���
	int                    last_volume;              ///<˲ʱ�ɽ���
	int                    trade_type;               ///(����)��������,��Ӧ�࿪,��ƽ������
	Quote                  quotes[DEPTH_OF_QUOTE];   ///����, �±��0��ʼ��0-��ʾ��һ����1-��ʾ�ڶ�������������

};

namespace gmdata
{
	//�������
	class DataSet
	{
	public:
		//��ȡapi���ý��, 0: �ɹ��� ��0: ������
		virtual int status() = 0;

		//�ж��Ƿ��Ѿ��ǵ�������ĩβ
		virtual bool is_end() = 0;

		//�Ƶ���һ����¼
		virtual void next() = 0;

		//��ȡ����ֵ
		virtual int get_integer(const char *key) = 0;

		//��ȡ������ֵ
		virtual long long get_long_integer(const char *key) = 0;

		//��ȡ������ֵ
		virtual double get_real(const char *key) = 0;

		//��ȡ�ַ�����ֵ
		virtual const char* get_string(const char *key) = 0;

		//�ͷ����ݼ���
		virtual void release() = 0;

		//��ӡ����
		virtual const char* debug_string() = 0;
	};

	//�������
	template <typename T>
	class DataArray
	{
	public:
		//��ȡapi���ý��, 0: �ɹ��� ��0: ������
		virtual int status() = 0;

		//���ؽṹ�����ָ��
		virtual T* data() = 0;

		//�������ݵĳ���
		virtual int count() = 0;

		//�����±�Ϊi�Ľṹ���ã���0��ʼ
		virtual T& at(int i) = 0;

		//�ͷ����ݼ���
		virtual void release() = 0;
	};

} //namespace gmdata

#endif
