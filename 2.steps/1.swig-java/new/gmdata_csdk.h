
#ifndef GMCSDK_H
#define GMCSDK_H

#include "gmdata_def.h"

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

//��ȡ�����ַ
GM_API int gmi_get_serv_addr(const char * serv_id, char **addr);

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

//���ݴ������ȡ������Ϣ
GM_API const char* gmi_strerror(int errorno);

GM_API char * gmi_gbk2utf(const char *gbk);
GM_API char * gmi_utf2gbk(const char *utf8);

//����sdk��Ϣ
GM_API void gmi_set_version(const char *sdk_version, const char *sdk_lang, const char *sdk_arch = NULL, const char *sdk_os = NULL);

//��ʱ��
GM_API void gmi_set_timer(int interval);

//��ȡc-sdk�汾��
GM_API const char* gmi_get_c_version();


//������ API //////////////////////////////////////////////////////////////////////////////

//�������� symbols='SHSE.600000,SZSE.000001', 
GM_API int gmi_subscribe(const char *symbols, const char * frequency, bool unsubscribe_previous);

//�˶�����
GM_API int gmi_unsubscribe(const char *symbols, const char * frequency);

//��ȡtick����
GM_API int gmi_current(const char *symbols, Tick **res, int *count);

//��ȡtick���� res = data::api::Ticks
GM_API int gmi_current_pb(const char *symbols, const char *fields, void **res, int *res_len);

//��ȡ��ʷ��tick
GM_API int gmi_history_ticks(const char *symbols, const char *start_time, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Tick **res, int *count);

//��ȡ��ʷ��tick req = history.api.GetHistoryTicksReq, res = data.api.Ticks;
GM_API int gmi_history_ticks_pb(void *req, int req_len, void **res, int *res_len);

//��ȡ��ʷ��bar
GM_API int gmi_history_bars(const char *symbols, const char *frequency, const char *start_time, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Bar **res, int *count);

//��ȡ��ʷ��bar req = history.api.GetHistoryBarsReq, res = data.api.Bars;
GM_API int gmi_history_bars_pb(void *req, int req_len, void **res, int *res_len);

//��ȡ���n��tick
GM_API int gmi_history_ticks_n(const char *symbol, int n, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Tick **res, int *count);

//��ȡ���n��tick req = history.api.GetHistoryTicksNReq, res = data.api.Ticks;
GM_API int gmi_history_ticks_n_pb(void *req, int req_len, void **res, int *res_len);

//��ȡ���n��bar
GM_API int gmi_history_bars_n(const char *symbol, const char *frequency, int n, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Bar **res, int *count);

//��ȡ���n��bar req = history.api.GetHistoryBarsNReq, res = data.api.Bars;
GM_API int gmi_history_bars_n_pb(void *req, int req_len, void **res, int *res_len);


//���������� API ////////////////////////////////////////////////////////////////////////////

// req = fundamental.api.GetInstrumentsReq res = data.api.Instruments
GM_API int gmi_get_instruments(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetFundamentalsReq res = fundamental.api.GetFundamentalsRsp
GM_API int gmi_get_fundamentals(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetFundamentalsNReq res = fundamental.api.GetFundamentalsRsp
GM_API int gmi_get_fundamentals_n(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetInstrumentInfosReq res = data.api.InstrumentInfos
GM_API int gmi_get_instrumentInfos(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetFuzzyMatchInstrumentInfosReq res = data.api.InstrumentInfos
GM_API int gmi_get_fuzzy_match_instrumentInfos(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetHistoryInstrumentsReq res = data.api.Instruments
GM_API int gmi_get_history_instruments(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetConstituentsReq res = data.api.Constituents
GM_API int gmi_get_constituents(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetSectorReq res = fundamental.api.GetSectorRsp
GM_API int gmi_get_sector(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetIndustryReq res = fundamental.api.GetIndustryRsp
GM_API int gmi_get_industry(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetConceptReq res = fundamental.api.GetConceptRsp
GM_API int gmi_get_concept(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetTradingDatesReq res = fundamental.api.GetTradingDatesRsp
GM_API int gmi_get_trading_dates(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetPreviousTradingDateReq res = fundamental.api.GetPreviousTradingDateRsp
GM_API int gmi_get_previous_trading_date(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetNextTradingDateReq res = fundamental.api.GetNextTradingDateRsp
GM_API int gmi_get_next_trading_date(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetDividendsReq res = data.api.Dividends
GM_API int gmi_get_dividends(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetDividendsSnapshotReq res = data.api.Dividends
GM_API int gmi_get_dividends_snapshot(void *req, int req_len, void **res, int *res_len);

// req = fundamental.api.GetContinuousContractsReq res = data.api.ContinuousContracts
GM_API int gmi_get_continuous_contracts(void *req, int req_len, void **res, int *res_len);


#endif
