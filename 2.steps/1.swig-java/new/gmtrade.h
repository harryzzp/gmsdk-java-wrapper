#ifndef GMTRADE_H
#define GMTRADE_H

#include <stddef.h>
#include "gmtrade_def.h"

#ifdef WIN32
#ifdef GMSDKC_EXPORTS  
#define GM_TRADE_API __declspec(dllexport)
#else
#define GM_TRADE_API __declspec(dllimport)
#endif
#else
#define GM_TRADE_API
#endif

namespace gmtrade
{

	class GM_TRADE_API Trade
	{
	public:
		Trade(const char *token);
		Trade();
		virtual ~Trade();

	public: //��������

		//��ʼ�����¼�
		int start();

		//ֹͣ�����¼�
		void stop();

		//�����û�token
		void set_token(const char *token);

		//���÷����ַ
		void set_endpoint(const char *serv_addr);


	public: //���׺���

		int login(const char *account_ids);

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

		//ί���µ�
		Order place_order(const char *symbol, int volume, int side, int order_type, int position_effect, double price = 0, int order_duration = 0, int order_qualifier = 0, double stop_price = 0, const char *account = NULL);

		//��ѯ�ʽ�
		int get_cash(Cash &cash, const char *accounts = NULL);

		//��ѯί��
		DataArray<Order>* get_orders(const char *account = NULL);

		//��ѯδ��ί��
		DataArray<Order>* get_unfinished_orders(const char *account = NULL);

		//��ѯ�ɽ�
		DataArray<ExecRpt>* get_execution_reports(const char *account = NULL);

		//��ѯ�ֲ�
		DataArray<Position>* get_position(const char *account = NULL);


	public: //�¼�����

		//ί�б仯
		virtual void on_order_status(Order *order);
		//ִ�лر�
		virtual void on_execution_report(ExecRpt *rpt);
		//ʵ���˺�״̬�仯
		virtual void on_account_status(AccountStatus *account_status);
		//�������
		virtual void on_error(int error_code, const char *error_msg);
		//�����Ѿ�������
		virtual void on_trade_data_connected();
		//�������ӶϿ���
		virtual void on_trade_data_disconnected();

	};

} //namespace gmtrade

#endif
