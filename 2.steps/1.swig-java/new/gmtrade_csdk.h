
#ifndef GMCSDK_H
#define GMCSDK_H

#include "gmtrade_def.h"

#ifdef WIN32
#ifdef GMSDKC_EXPORTS  
#define GM_API extern "C" __declspec(dllexport)
#else
#define GM_API extern "C" __declspec(dllimport)
#endif
#else
#define GM_API extern "C"
#endif


//���� API //////////////////////////////////////////////////////////////////////////////

typedef void(*EventCallback)(const char *msg_type, void *data, int data_len);

//�����¼��ص�, �ص�data��Ϊc�ṹ��
GM_API void gmi_set_event_callback(EventCallback cb);

//�����¼��ص�, �ص�data��Ϊprotobuf���л���
GM_API void gmi_set_event_callback_pb(EventCallback cb);

//����api-key
GM_API int gmi_set_token(const char *token);

//�Զ�������ַ
GM_API void gmi_set_serv_addr(const char *addr);

//���в���
GM_API int gmi_run();

//��ʼ���в���
GM_API int gmi_start();

//ʵ��ģʽ��ʼ��
GM_API int gmi_init();

//���в���
GM_API int gmi_poll();

//ֹͣ����
GM_API int gmi_stop();

//��ȡc-sdk�汾��
GM_API const char* gmi_get_c_version();

//���ݴ������ȡ������Ϣ
GM_API const char* gmi_strerror(int errorno);

//��ȡ��չ������Ϣ
GM_API const char* gmi_get_ext_errormsg();

GM_API char * gmi_gbk2utf(const char *gbk);
GM_API char * gmi_utf2gbk(const char *utf8);

//����sdk��Ϣ
GM_API void gmi_set_version(const char *sdk_version, const char *sdk_lang, const char *sdk_arch = NULL, const char *sdk_os = NULL);

//��ʱ��
GM_API void gmi_set_timer(int interval);

//������ API //////////////////////////////////////////////////////////////////////////////

//����Ĭ���˺�
GM_API int gmi_login(const char *account_ids);

//�µ�ί��
GM_API int gmi_place_order(Order *orders, int order_count, int is_combined, Order **res, int *count);

//�µ�ί�� req = core.api.Orders, res = core.api.Orders
GM_API int gmi_place_order_pb(void *req, int req_len, void **res, int *res_len);

//ƽ���в�λ
GM_API int gmi_close_all_positions(const char *account_ids, Order **res, int *count);

//ƽ���в�λ req = trade.api.CloseAllPositionsReq, res = core.api.Orders
GM_API int gmi_close_all_positions_pb(void *req, int req_len, void **res, int *res_len);

//����ί�� 
GM_API int gmi_cancel_orders(Order *orders, int count);

//����ί�� req = core.api.Orders
GM_API int gmi_cancel_orders_pb(void *req, int req_len);

//��������ί��
GM_API int gmi_cancel_all_orders(const char *account_ids = NULL);

//��������ί�� req = trade.api.CancelAllOrdersReq
GM_API int gmi_cancel_all_orders_pb(void *req, int req_len);

//��ѯί��
GM_API int gmi_get_orders(const char *account, const char *symbols, const char *cl_ord_ids, Order **res, int *count);

//��ѯί�� req = trade.api.GetOrdersReq, res = core.api.Orders
GM_API int gmi_get_orders_pb(void *req, int req_len, void **res, int *res_len);

//��ѯδ��ί��
GM_API int gmi_get_unfinished_orders(const char *account, Order **res, int *count);

//��ѯδ��ί�� req = trade.api.GetUnfinishedOrdersReq, res = core.api.Orders
GM_API int gmi_get_unfinished_orders_pb(void *req, int req_len, void **res, int *res_len);

//��ѯ�ʽ�
GM_API int gmi_get_cash(const char *account, Cash **cash, int *count);

//��ѯ�ʽ�  req = trade.api.GetCashReq, res = core.api.Cashes
GM_API int gmi_get_cash_pb(void *req, int req_len, void **res, int *res_len);

//��ѯ�ֲ�
GM_API int gmi_get_positions(const char *account, const char *symbol, int side, Position **res, int *count);

//��ѯ�ֲ� req = trade.api.GetPositionsReq, res = core.api.Positions
GM_API int gmi_get_positions_pb(void *req, int req_len, void **res, int *res_len);

//��ѯ�ɽ�
GM_API int gmi_get_execution_reports(const char *account, const char *cl_ord_id, int exec_type, ExecRpt **res, int *count);

//��ѯ�ɽ� req = trade.api.GetExecrptsReq, res = core.api.ExecRpts
GM_API int gmi_get_execution_reports_pb(void *req, int req_len, void **res, int *res_len);

//��ȡ�����˻�״̬
GM_API int gmi_get_account_status(const char *accounts, AccountStatus **res, int *count);

//��ȡ�����˻�״̬ req = tradegw.api.GetAccountStatusesReq, res = core.api.AccountStatuses
GM_API int gmi_get_account_status_pb(void *req, int req_len, void **res, int *res_len);

#endif
