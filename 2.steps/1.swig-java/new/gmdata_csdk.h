
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


//基础 API //////////////////////////////////////////////////////////////////////////////

typedef void(*EventCallback)(const char *msg_type, void *data, int data_len);

//设置事件回调, 回调data均为c结构体
GM_API void gmi_set_event_callback(EventCallback cb);

//设置事件回调, 回调data均为protobuf序列化流
GM_API void gmi_set_event_callback_pb(EventCallback cb);

//设置api-key
GM_API int gmi_set_token(const char *token);

//自定义服务地址
GM_API void gmi_set_serv_addr(const char *addr);

//获取服务地址
GM_API int gmi_get_serv_addr(const char * serv_id, char **addr);

//运行策略
GM_API int gmi_run();

//开始运行策略
GM_API int gmi_start();

//实盘模式初始化
GM_API int gmi_init();

//运行策略
GM_API int gmi_poll();

//停止策略
GM_API int gmi_stop();

//根据错误码获取错误信息
GM_API const char* gmi_strerror(int errorno);

GM_API char * gmi_gbk2utf(const char *gbk);
GM_API char * gmi_utf2gbk(const char *utf8);

//设置sdk信息
GM_API void gmi_set_version(const char *sdk_version, const char *sdk_lang, const char *sdk_arch = NULL, const char *sdk_os = NULL);

//定时器
GM_API void gmi_set_timer(int interval);

//获取c-sdk版本号
GM_API const char* gmi_get_c_version();


//数据类 API //////////////////////////////////////////////////////////////////////////////

//订阅行情 symbols='SHSE.600000,SZSE.000001', 
GM_API int gmi_subscribe(const char *symbols, const char * frequency, bool unsubscribe_previous);

//退订行情
GM_API int gmi_unsubscribe(const char *symbols, const char * frequency);

//获取tick快照
GM_API int gmi_current(const char *symbols, Tick **res, int *count);

//获取tick快照 res = data::api::Ticks
GM_API int gmi_current_pb(const char *symbols, const char *fields, void **res, int *res_len);

//获取历史的tick
GM_API int gmi_history_ticks(const char *symbols, const char *start_time, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Tick **res, int *count);

//获取历史的tick req = history.api.GetHistoryTicksReq, res = data.api.Ticks;
GM_API int gmi_history_ticks_pb(void *req, int req_len, void **res, int *res_len);

//获取历史的bar
GM_API int gmi_history_bars(const char *symbols, const char *frequency, const char *start_time, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Bar **res, int *count);

//获取历史的bar req = history.api.GetHistoryBarsReq, res = data.api.Bars;
GM_API int gmi_history_bars_pb(void *req, int req_len, void **res, int *res_len);

//获取最近n条tick
GM_API int gmi_history_ticks_n(const char *symbol, int n, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Tick **res, int *count);

//获取最近n条tick req = history.api.GetHistoryTicksNReq, res = data.api.Ticks;
GM_API int gmi_history_ticks_n_pb(void *req, int req_len, void **res, int *res_len);

//获取最近n条bar
GM_API int gmi_history_bars_n(const char *symbol, const char *frequency, int n, const char *end_time, bool skip_suspended, const char *fill_missing, int adjust, Bar **res, int *count);

//获取最近n条bar req = history.api.GetHistoryBarsNReq, res = data.api.Bars;
GM_API int gmi_history_bars_n_pb(void *req, int req_len, void **res, int *res_len);


//基本面数据 API ////////////////////////////////////////////////////////////////////////////

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
