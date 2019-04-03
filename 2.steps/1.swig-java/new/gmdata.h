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

	public: //��������

		// ����token
		void set_token(const char *token);

		// �Զ�������ַ
		void set_endpoint(const char *addr);

		//��ʼ��������
		int start();

		//ֹͣ��������
		void stop();


	public: //���ݺ���

		// ��������
		int subscribe(const char *symbols, const char * frequency, bool unsubscribe_previous = false);

		// �˶�����
		int unsubscribe(const char *symbols, const char * frequency);

		// ��ѯ��ǰ�������
		DataArray<Tick>* current(const char *symbols);

		// ��ѯ��ʷTick����
		DataArray<Tick>* history_ticks(const char *symbols, const char *start_time, const char *end_time, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		// ��ѯ��ʷBar����
		DataArray<Bar>* history_bars(const char *symbols, const char *frequency, const char *start_time, const char *end_time, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		// ��ѯ����n��Tick����
		DataArray<Tick>* history_ticks_n(const char *symbols, int n, const char *end_time = NULL, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		//��ѯ����n��Bar����
		DataArray<Bar>* history_bars_n(const char *symbols, const char *frequency, int n, const char *end_time = NULL, int adjust = 0, const char *adjust_end_time = NULL, bool skip_suspended = true, const char *fill_missing = NULL);

		// ��ѯ����������
		DataSet* get_fundamentals(const char *table, const char *symbols, const char *start_date, const char *end_date, const char *fields, const char *filter = NULL, const char *order_by = NULL, int limit = 1000);

		// ��ѯ��������������n��
		DataSet* get_fundamentals_n(const char *table, const char *symbols, const char *end_date, const char *fields, int n = 1, const char *filter = NULL, const char * order_by = NULL);

		// ��ѯ���½��ױ����Ϣ
		DataSet* get_instruments(const char *exchanges = NULL, const char *sec_types = NULL, const char* fields = NULL);

		// ��ѯ���ױ����ʷ����
		DataSet* get_history_instruments(const char *symbols, const char *start_date, const char *end_date, const char *fields = NULL);

		// ��ѯ���ױ�Ļ�����Ϣ
		DataSet* get_instrumentinfos(const char *symbols = NULL, const char *exchanges = NULL, const char * sec_types = NULL, const char *names = NULL, const char *fields = NULL);

		// ��ѯָ���ɷݹ�
		DataSet* get_constituents(const char *index, const char *trade_date = NULL);

		// ��ѯ��ҵ��Ʊ�б�
		DataArray<Symbol>* get_industry(const char *code);

		// ��ѯ�������Ʊ�б�
		DataArray<Symbol>* get_concept(const char *code);

		// ��ѯ�������б�
		DataArray<TradingDate>* get_trading_dates(const char *exchange, const char *start_date, const char *end_date);

		// ����ָ�����ڵ���һ��������
		int get_previous_trading_date(const char *exchange, const char *date, char *output_date);

		// ����ָ�����ڵ���һ��������
		int get_next_trading_date(const char *exchange, const char *date, char *output_date);

		// ��ѯ�ֺ�����
		DataSet* get_dividend(const char *symbol, const char *start_date, const char *end_date);

		// ��ȡ������Լ
		DataSet* get_continuous_contracts(const char *csymbol, const char *start_date, const char *end_date);


	public: //�¼�����

		//�յ�Tick����
		virtual void on_tick(Tick *tick);
		//�յ�bar����
		virtual void on_bar(Bar *bar);
		//�������
		virtual void on_error(int error_code, const char *error_msg);
		//�����Ѿ�������
		virtual void on_market_data_connected();
		//�������ӶϿ���
		virtual void on_market_data_disconnected();
	};

} //namespace gmdata

#endif
