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

public: //��������

	//���в���
	int run();

	//ֹͣ����
	void stop();

	//���ò���ID
	void set_strategy_id(const char *strategy_id);

	//�����û�token
	void set_token(const char *token);

	//���ò�������ģʽ
	void set_mode(int mode);

	//��ʱ����
	int schedule(const char *data_rule, const char *time_rule);

	//��ǰʱ��
	long long now();

	//���ûز����
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

public: //���ݺ���

		// ��������
	int subscribe(const char *symbols, const char * frequency, bool unsubscribe_previous = false);

	// �˶�����
	int unsubscribe(const char *symbols, const char * frequency);


public: //���׺���

	//��ѯ�����˺�
	DataArray<Account>* get_accounts();

	//��ָ����ί��
	Order order_volume(const char *symbol, int volume, int side, int order_type, int position_effect, double price = 0, const char *account = NULL);

	//��ָ����ֵί��
	Order order_value(const char *symbol, double value, int side, int order_type, int position_effect, double price = 0, const char *account = NULL);

	//�����ʲ�ָ������ί��
	Order order_percent(const char *symbol, double percent, int side, int order_type, int position_effect, double price = 0, const char *account = NULL);

	//���ֵ�Ŀ��ֲ���
	Order order_target_volume(const char *symbol, int volume, int position_side, int order_type, double price = 0, const char *account = NULL);

	//���ֵ�Ŀ��ֲֶ�
	Order order_target_value(const char *symbol, double value, int position_side, int order_type, double price = 0, const char *account = NULL);

	//���ֵ�Ŀ��ֱֲ��������ʲ��ı�����
	Order order_target_percent(const char *symbol, double percent, int position_side, int order_type, double price = 0, const char *account = NULL);

	//ƽ��ǰ���п�ƽ�ֲ�
	DataArray<Order>* order_close_all();

	//ί�г���
	int order_cancel(const char *cl_ord_id, const char *account = NULL);

	//��������ί��
	int order_cancel_all();

	//��ѯί��
	DataArray<Order>* get_orders(const char *account = NULL);

	//��ѯδ��ί��
	DataArray<Order>* get_unfinished_orders(const char *account = NULL);

	//��ѯ�ɽ�
	DataArray<ExecRpt>* get_execution_reports(const char *account = NULL);

	//��ѯ�ʽ�
	DataArray<Cash>* get_cash(const char *accounts = NULL);

	//��ѯ�ֲ�
	DataArray<Position>* get_position(const char *account = NULL);


public: //���Բ����ຯ��

	//��Ӳ���
	int add_parameters(Parameter *params, int count);

	//ɾ������
	int del_parameters(const char *keys);

	//���ò���
	int set_parameters(Parameter *params, int count);

	//��ȡ����
	DataArray<Parameter>* get_parameters();

	//���ñ��
	int set_symbols(const char *symbols);

	//��ȡ���
	DataArray<Symbol>* get_symbols();


public: //�¼�����

		//��ʼ�����
		virtual void on_init();
		//�յ�Tick����
		virtual void on_tick(Tick *tick);
		//�յ�bar����
		virtual void on_bar(Bar *bar);
		//ί�б仯
		virtual void on_order_status(Order *order);
		//ִ�лر�
		virtual void on_execution_report(ExecRpt *rpt);
		//�����仯
		virtual void on_parameter(Parameter *param);
		//��ʱ���񴥷�
		virtual void on_schedule(const char *data_rule, const char *time_rule);
		//�ز���ɺ��յ���Ч����
		virtual void on_backtest_finished(Indicator *indicator);
		//ʵ���˺�״̬�仯
		virtual void on_account_status(AccountStatus *account_status);
		//�������
		virtual void on_error(int error_code, const char *error_msg);
		//�յ�����ֹͣ�ź�
		virtual void on_stop();
		//�����Ѿ�������
		virtual void on_market_data_connected();
		//�����Ѿ�������
		virtual void on_trade_data_connected();
		//�������ӶϿ���
		virtual void on_market_data_disconnected();
		//�������ӶϿ���
		virtual void on_trade_data_disconnected();

};




#endif
