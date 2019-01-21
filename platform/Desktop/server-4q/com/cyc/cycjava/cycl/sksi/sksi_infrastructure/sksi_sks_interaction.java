package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.rdf.sparql_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_interaction extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction";
    public static final String myFingerPrint = "e2f7ffa4f5e1e9419f24fc190c19c7864db531720a08abcdd3a7762e08a74529";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 16920L)
    private static SubLSymbol $sksi_http_request_caching_strategy$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18084L)
    private static SubLSymbol $get_results_from_sksi_web_page_subl_method_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18731L)
    private static SubLSymbol $sksi_http_request_keep_alive$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18881L)
    private static SubLSymbol $sksi_http_request_wide_newlines$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 19047L)
    public static SubLSymbol $sksi_sparql_request_wide_newlines$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 19217L)
    private static SubLSymbol $sksi_http_request_open_connection_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 19414L)
    private static SubLSymbol $sksi_http_request_overall_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 19652L)
    private static SubLSymbol $sksi_http_automatically_redirect$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 26337L)
    private static SubLSymbol $oracle_sparql_progress_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 27640L)
    public static SubLSymbol $sksi_sparql_iterativity_limits$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 40558L)
    public static SubLSymbol $sksi_open_sql_connection_default_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 40630L)
    public static SubLSymbol $sksi_open_web_connection_default_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 40701L)
    public static SubLSymbol $sksi_open_sql_source_default_max_tries$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 40771L)
    public static SubLSymbol $sksi_open_sql_source_default_interval$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 47191L)
    private static SubLSymbol $sksi_fht_source_default_size$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 47316L)
    private static SubLSymbol $sksi_fht_source_default_average_bucket_size$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 48798L)
    private static SubLSymbol $result_set_sql_connection_statement_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50048L)
    private static SubLSymbol $cached_get_result_set_from_sql_source_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50432L)
    private static SubLSymbol $sksi_sparql_request_open_connection_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50832L)
    private static SubLSymbol $sksi_sparql_request_overall_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 51086L)
    private static SubLSymbol $query_interrupt_on_sparql_execution$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 51230L)
    private static SubLSymbol $sparql_evaluation_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 52095L)
    public static SubLSymbol $sparql_result_stream_iterator_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 54271L)
    private static SubLSymbol $sparql_oracle_joseki_subprotocol$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 54349L)
    private static SubLSymbol $sparql_oracle_sesame_subprotocol$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 54422L)
    private static SubLSymbol $sparql_triclops_subprotocol$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 57472L)
    private static SubLSymbol $sparql_oracle_default_server_parallelism$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 57630L)
    private static SubLSymbol $sparql_oracle_fs_prefix_pragma_template$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 57844L)
    private static SubLSymbol $sparql_oracle_ht_prefix_pragma_template$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 58916L)
    private static SubLSymbol $sparql_oracle_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62198L)
    private static SubLSymbol $cached_get_result_set_from_sparql_source_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 67139L)
    public static SubLSymbol $access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 89677L)
    private static SubLSymbol $structured_knowledge_sources_assumed_available$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 93769L)
    private static SubLSymbol $sksi_sql_statement_pool_max_size$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97036L)
    private static SubLSymbol $sksi_resourcing_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97290L)
    public static SubLSymbol $sksi_global_resourcingP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97343L)
    private static SubLSymbol $sksi_default_connection_max_idle_seconds$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLSymbol $dtp_sksi_resourcing_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 103035L)
    public static SubLSymbol $sksi_connection_global_cache_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 112863L)
    private static SubLSymbol $sksi_salient_query_string$;
    private static final SubLSymbol $kw0$NORMAL;
    private static final SubLObject $const1$Database_Physical;
    private static final SubLObject $const2$WebPage_AIS;
    private static final SubLObject $const3$CycKB;
    private static final SubLObject $const4$FileHashTable_File;
    private static final SubLObject $const5$RDFTripleStore_Physical;
    private static final SubLSymbol $kw6$CACHE;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$WHERE;
    private static final SubLString $str10$malformed_csql_subexpression__a__;
    private static final SubLObject $const11$rowInSourceClaims;
    private static final SubLSymbol $kw12$CSQL;
    private static final SubLObject $const13$sourceClaims;
    private static final SubLObject $const14$MSAccess;
    private static final SubLObject $const15$PostgreSQL;
    private static final SubLObject $const16$MySQL_TheProgram;
    private static final SubLObject $const17$ApacheDerby;
    private static final SubLObject $const18$MSSQLServer;
    private static final SubLObject $const19$IBM_DB2_TheProgram;
    private static final SubLObject $const20$Sybase_IQ;
    private static final SubLObject $const21$OracleDatabaseServer_TheProgram;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$PHYSICAL_FIELD_INDEXICAL_P;
    private static final SubLList $list25;
    private static final SubLObject $const26$CSQLStrictlyEquals;
    private static final SubLString $str27$time_to_support__S_operator;
    private static final SubLString $str28$No_default_value_provided_for__A;
    private static final SubLSymbol $kw29$INPUT;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$ANYTHING;
    private static final SubLObject $const32$CSQLAnd;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw35$SUBLBOOLEAN;
    private static final SubLSymbol $kw36$SUBL;
    private static final SubLSymbol $kw37$SUBLUNBOUNDONLY;
    private static final SubLString $str38$Parsing_method__S_is_not_yet_supp;
    private static final SubLSymbol $kw39$MEMOIZE;
    private static final SubLSymbol $kw40$NONE;
    private static final SubLString $str41$_S_not_a_valid_value_for__sksi_ht;
    private static final SubLSymbol $sym42$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_MEMOIZED;
    private static final SubLSymbol $sym43$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_CACHED;
    private static final SubLSymbol $sym44$_GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_CACHED_CACHING_STATE_;
    private static final SubLList $list45;
    private static final SubLInteger $int46$30;
    private static final SubLSymbol $sym47$SKSI_TOKENIZED_HTTP_REQUEST;
    private static final SubLSymbol $kw48$GET;
    private static final SubLInteger $int49$80;
    private static final SubLString $str50$http___;
    private static final SubLString $str51$_;
    private static final SubLObject $const52$salientURL;
    private static final SubLSymbol $kw53$ERROR;
    private static final SubLSymbol $kw54$OPEN_CONNECTION;
    private static final SubLString $str55$Opening_the_TCP_connection_timed_;
    private static final SubLSymbol $kw56$OVERALL;
    private static final SubLString $str57$The_HTTP_request_timed_out_;
    private static final SubLSymbol $sym58$SKSI_SUBL_PARSING_PROGRAM_P;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$CLET;
    private static final SubLSymbol $sym61$QUOTE;
    private static final SubLObject $const62$ExpandSubLFn;
    private static final SubLObject $const63$SubLQuoteFn;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$SELECT;
    private static final SubLString $str66$malformed_csql_expression__a;
    private static final SubLList $list67;
    private static final SubLString $str68$unknown_cache_for_csql__a_and_acc;
    private static final SubLString $str69$___A____;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$SPARQL_RESULT_SET_ITERATOR_DONE_P;
    private static final SubLSymbol $sym72$SPARQL_RESULT_SET_ITERATOR_NEXT;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$CUNWIND_PROTECT;
    private static final SubLSymbol $sym77$PROGN;
    private static final SubLSymbol $sym78$CSETQ;
    private static final SubLSymbol $sym79$SKSI_EXECUTE_SQL_QUERY;
    private static final SubLSymbol $sym80$PUNLESS;
    private static final SubLSymbol $sym81$SQL_RESULT_SET_P;
    private static final SubLSymbol $sym82$ERROR;
    private static final SubLString $str83$Problem_executing_query___a_;
    private static final SubLSymbol $sym84$FINALIZE_RESULT_SET;
    private static final SubLSymbol $sym85$STRINGP;
    private static final SubLSymbol $sym86$ACCESS_PATH_P;
    private static final SubLString $str87$__SKSI__A_;
    private static final SubLString $str88$Executing_SQL_____Source___S__;
    private static final SubLString $str89$Module___S__;
    private static final SubLString $str90$Query____S__;
    private static final SubLString $str91$Query_Result___S__;
    private static final SubLString $str92$Executing_SQL_____Source___S____U;
    private static final SubLString $str93$SQL_Update_Result___S__;
    private static final SubLString $str94$Batch_executing__s_SQL_statements;
    private static final SubLSymbol $kw95$DBMS_SERVER;
    private static final SubLSymbol $kw96$PORT;
    private static final SubLSymbol $kw97$SUBPROTOCOL;
    private static final SubLSymbol $kw98$PROXY_SERVER;
    private static final SubLSymbol $kw99$TIMEOUT;
    private static final SubLSymbol $kw100$THROW;
    private static final SubLSymbol $sym101$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str102$LOCK_TABLE_;
    private static final SubLString $str103$_IN_EXCLUSIVE_MODE;
    private static final SubLString $str104$_WRITE;
    private static final SubLSymbol $kw105$RETURN;
    private static final SubLString $str106$Batch_execution_resulted_in_error;
    private static final SubLString $str107$Batch_execution_completed_success;
    private static final SubLString $str108$SELECT_;
    private static final SubLString $str109$_FROM_;
    private static final SubLString $str110$_ORDER_BY_;
    private static final SubLString $str111$_DESC_LIMIT_;
    private static final SubLString $str112$SELECT___FROM__SELECT_;
    private static final SubLString $str113$_DESC__WHERE_rownum_BETWEEN_;
    private static final SubLString $str114$_AND_;
    private static final SubLString $str115$Auto_generated_key_retrieval_is_n;
    private static final SubLSymbol $sym116$SKSI_EXECUTE_SQL_SCRIPT_FROM_FILE;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$SKSI_EXECUTE_SQL_SCRIPT;
    private static final SubLString $str119$SELECT;
    private static final SubLFloat $float120$0_1;
    private static final SubLSymbol $kw121$DBMS_PORT;
    private static final SubLSymbol $kw122$ALL;
    private static final SubLSymbol $kw123$KEY_FIRST;
    private static final SubLSymbol $kw124$KEY_VALUE_FIRST;
    private static final SubLSymbol $kw125$KEY;
    private static final SubLSymbol $kw126$KEY_VALUE;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$CAR;
    private static final SubLInteger $int129$32;
    private static final SubLInteger $int130$256;
    private static final SubLString $str131$The_file_already_exists_;
    private static final SubLSymbol $sym132$_RESULT_SET_SQL_CONNECTION_STATEMENT_CACHE_;
    private static final SubLSymbol $sym133$CACHED_GET_RESULT_SET_FROM_SQL_SOURCE;
    private static final SubLSymbol $sym134$_CACHED_GET_RESULT_SET_FROM_SQL_SOURCE_CACHING_STATE_;
    private static final SubLInteger $int135$500;
    private static final SubLInteger $int136$3600;
    private static final SubLSymbol $sym137$DICTIONARY_P;
    private static final SubLSymbol $sym138$ALIST_P;
    private static final SubLString $str139$ticket;
    private static final SubLString $str140$oracle_joseki;
    private static final SubLString $str141$oracle_sesame;
    private static final SubLString $str142$triclops;
    private static final SubLString $str143$_ticket;
    private static final SubLString $str144$type_id;
    private static final SubLList $list145;
    private static final SubLSymbol $sym146$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list147;
    private static final SubLString $str148$_A;
    private static final SubLString $str149$http___oracle_com_semtech_ordered;
    private static final SubLString $str150$http___oracle_com_semtech_ALL_PUL;
    private static final SubLString $str151$ORACLE_SEM_FS_NS;
    private static final SubLString $str152$_timeout_;
    private static final SubLString $str153$;
    private static final SubLString $str154$_dop_;
    private static final SubLString $str155$ORACLE_SEM_HT_NS;
    private static final SubLString $str156$_joseki_querymgt;
    private static final SubLString $str157$abortqid_;
    private static final SubLString $str158$_openrdf_sesame_querymgt;
    private static final SubLString $str159$_processes;
    private static final SubLString $str160$ticket_;
    private static final SubLSymbol $kw161$POST;
    private static final SubLSymbol $kw162$QUERY;
    private static final SubLSymbol $kw163$METHOD;
    private static final SubLSymbol $kw164$KEEP_ALIVE_;
    private static final SubLSymbol $kw165$WIDE_NEWLINES_;
    private static final SubLSymbol $kw166$ACCEPT_TYPES;
    private static final SubLSymbol $sym167$CACHED_GET_RESULT_SET_FROM_SPARQL_SOURCE;
    private static final SubLSymbol $sym168$_CACHED_GET_RESULT_SET_FROM_SPARQL_SOURCE_CACHING_STATE_;
    private static final SubLString $str169$Needs_to_be_re_implemented_withou;
    private static final SubLString $str170$WHERE;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLString $str173$query_;
    private static final SubLString $str174$jonny2_cyc_com;
    private static final SubLInteger $int175$8080;
    private static final SubLString $str176$_SemanticDB_SPARQL_;
    private static final SubLList $list177;
    private static final SubLString $str178$sparql_query_xml_tokens_error___S;
    private static final SubLString $str179$query;
    private static final SubLSymbol $kw180$PRIVATE;
    private static final SubLSymbol $kw181$MACHINE;
    private static final SubLSymbol $kw182$URL;
    private static final SubLSymbol $sym183$_ACCESS_PATH_;
    private static final SubLString $str184$ASK__;
    private static final SubLList $list185;
    private static final SubLString $str186$http___www_clevelandclinic_org_he;
    private static final SubLObject $const187$baseNamespaceForSKS;
    private static final SubLObject $const188$nameSpacePrefixForSKS;
    private static final SubLList $list189;
    private static final SubLString $str190$_sparql;
    private static final SubLString $str191$results;
    private static final SubLSymbol $sym192$TEST_SKSI_IST_GRAPH;
    private static final SubLSymbol $kw193$TEST;
    private static final SubLSymbol $kw194$OWNER;
    private static final SubLSymbol $kw195$CLASSES;
    private static final SubLSymbol $kw196$KB;
    private static final SubLSymbol $kw197$TINY;
    private static final SubLSymbol $kw198$WORKING_;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$SKSI_SPARQL_XML_TOKENS_TO_RESULT_SET;
    private static final SubLObject $list201;
    private static final SubLString $str202$File_hash_table_does_not_exist_;
    private static final SubLString $str203$The_following_problem_was_encount;
    private static final SubLString $str204$__The_following_problem_was_encou;
    private static final SubLString $str205$__The_following_problem_was_encou;
    private static final SubLString $str206$Continue_without_accessing_;
    private static final SubLString $str207$_;
    private static final SubLSymbol $kw208$UNREACHABLE;
    private static final SubLSymbol $kw209$DB_EXECUTION;
    private static final SubLSymbol $kw210$SKS_EXECUTION;
    private static final SubLSymbol $kw211$SKS;
    private static final SubLSymbol $sym212$_SKSI_RESOURCING_CACHE_;
    private static final SubLInteger $int213$600;
    private static final SubLSymbol $sym214$SKSI_RESOURCING_CACHE;
    private static final SubLSymbol $sym215$SKSI_RESOURCING_CACHE_P;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLList $list218;
    private static final SubLList $list219;
    private static final SubLSymbol $sym220$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym221$SKSI_RESOURCING_CACHE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list222;
    private static final SubLSymbol $sym223$SKSI_RESOURCING_CACHE_CONNECTIONS;
    private static final SubLSymbol $sym224$_CSETF_SKSI_RESOURCING_CACHE_CONNECTIONS;
    private static final SubLSymbol $sym225$SKSI_RESOURCING_CACHE_STATEMENTS;
    private static final SubLSymbol $sym226$_CSETF_SKSI_RESOURCING_CACHE_STATEMENTS;
    private static final SubLSymbol $sym227$SKSI_RESOURCING_CACHE_USED_STATEMENTS;
    private static final SubLSymbol $sym228$_CSETF_SKSI_RESOURCING_CACHE_USED_STATEMENTS;
    private static final SubLSymbol $sym229$SKSI_RESOURCING_CACHE_ACCESS_TIMES;
    private static final SubLSymbol $sym230$_CSETF_SKSI_RESOURCING_CACHE_ACCESS_TIMES;
    private static final SubLSymbol $sym231$SKSI_RESOURCING_CACHE_LOCK;
    private static final SubLSymbol $sym232$_CSETF_SKSI_RESOURCING_CACHE_LOCK;
    private static final SubLSymbol $sym233$SKSI_RESOURCING_CACHE_MAX_POOL_SIZE;
    private static final SubLSymbol $sym234$_CSETF_SKSI_RESOURCING_CACHE_MAX_POOL_SIZE;
    private static final SubLSymbol $sym235$SKSI_RESOURCING_CACHE_MAX_IDLE;
    private static final SubLSymbol $sym236$_CSETF_SKSI_RESOURCING_CACHE_MAX_IDLE;
    private static final SubLSymbol $kw237$CONNECTIONS;
    private static final SubLSymbol $kw238$STATEMENTS;
    private static final SubLSymbol $kw239$USED_STATEMENTS;
    private static final SubLSymbol $kw240$ACCESS_TIMES;
    private static final SubLSymbol $kw241$LOCK;
    private static final SubLSymbol $kw242$MAX_POOL_SIZE;
    private static final SubLSymbol $kw243$MAX_IDLE;
    private static final SubLString $str244$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw245$BEGIN;
    private static final SubLSymbol $sym246$MAKE_SKSI_RESOURCING_CACHE;
    private static final SubLSymbol $kw247$SLOT;
    private static final SubLSymbol $kw248$END;
    private static final SubLSymbol $sym249$VISIT_DEFSTRUCT_OBJECT_SKSI_RESOURCING_CACHE_METHOD;
    private static final SubLString $str250$SKSI_SQL_resourcing_cache_;
    private static final SubLList $list251;
    private static final SubLSymbol $sym252$WITH_LOCK_HELD;
    private static final SubLSymbol $sym253$_SKSI_CONNECTION_GLOBAL_CACHE_LOCK_;
    private static final SubLString $str254$SKSI_SQL_global_connection_cache_;
    private static final SubLSymbol $sym255$_EXIT;
    private static final SubLSymbol $kw256$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym257$IGNORE_ERRORS_HANDLER;
    private static final SubLFloat $float258$0_2;
    private static final SubLSymbol $kw259$IGNORE;
    private static final SubLSymbol $sym260$VALID_SKSI_ERROR_HANDLING_MODE_P;
    private static final SubLSymbol $kw261$UP;
    private static final SubLSymbol $kw262$DOWN;
    private static final SubLList $list263;
    private static final SubLSymbol $kw264$SKSI;
    private static final SubLSymbol $sym265$MEMOIZED_SALIENT_SKSI_QUERY_STRING;
    private static final SubLSymbol $sym266$SKSI_TACTIC_P;
    private static final SubLSymbol $kw267$EXECUTED_OR_IN_PROGRESS;
    private static final SubLSymbol $sym268$TACTIC_P;
    private static final SubLSymbol $sym269$SPARQL_EXTRACT_VARIABLE_NAMES;
    private static final SubLList $list270;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 1444L)
    public static SubLObject generate_iterator_from_csql(final SubLObject csql, final SubLObject sk_source, SubLObject content_mt, SubLObject start_row, SubLObject end_row, SubLObject translation_style) {
        if (content_mt == sksi_sks_interaction.UNPROVIDED) {
            content_mt = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (start_row == sksi_sks_interaction.UNPROVIDED) {
            start_row = (SubLObject)sksi_sks_interaction.ZERO_INTEGER;
        }
        if (end_row == sksi_sks_interaction.UNPROVIDED) {
            end_row = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (translation_style == sksi_sks_interaction.UNPROVIDED) {
            translation_style = (SubLObject)sksi_sks_interaction.$kw0$NORMAL;
        }
        if (sksi_sks_interaction.NIL != sksi_csql_utilities.invalid_csql_expressionP(csql)) {
            return iteration.new_null_iterator();
        }
        if (sksi_sks_interaction.NIL != sksi_csql_utilities.boolean_csqlP(csql)) {
            return generate_boolean_from_csql(csql, sk_source, content_mt);
        }
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        final SubLObject type = sksi_access_path.structured_knowledge_source_type(access_path);
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql(sksi_sks_interaction.$const1$Database_Physical)) {
            result = generate_db_iterator_from_csql(csql, access_path, start_row, end_row, translation_style);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const2$WebPage_AIS)) {
            result = generate_web_page_iterator_from_csql(csql, access_path);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const3$CycKB)) {
            result = generate_kb_iterator_from_csql(csql, access_path);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const4$FileHashTable_File)) {
            result = generate_fht_iterator_from_csql(csql, access_path);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const5$RDFTripleStore_Physical)) {
            result = generate_rdf_iterator_from_csql(csql, access_path);
        }
        else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw6$CACHE)) {
            result = generate_cache_iterator_from_csql(csql, access_path);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 2859L)
    public static SubLObject generate_boolean_from_csql(final SubLObject csql, final SubLObject sk_source, SubLObject content_mt) {
        if (content_mt == sksi_sks_interaction.UNPROVIDED) {
            content_mt = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL != sksi_csql_utilities.invalid_csql_expressionP(csql)) {
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = sksi_access_path.structured_knowledge_source_type(access_path);
        if (pcase_var.eql(sksi_sks_interaction.$const1$Database_Physical)) {
            result = generate_db_boolean_from_csql(csql, access_path);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const2$WebPage_AIS)) {
            result = generate_web_page_boolean_from_csql(csql, access_path);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const3$CycKB)) {
            result = generate_kb_boolean_from_csql(csql, access_path);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const4$FileHashTable_File)) {
            result = generate_fht_boolean_from_csql(csql, access_path);
        }
        else if (pcase_var.eql(sksi_sks_interaction.$const5$RDFTripleStore_Physical)) {
            result = generate_rdf_boolean_from_csql(csql, access_path);
        }
        else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw6$CACHE)) {
            result = generate_cache_boolean_from_csql(csql, access_path);
        }
        if (sksi_sks_interaction.NIL != result && sksi_sks_interaction.NIL != sk_source && sksi_sks_interaction.NIL != content_mt) {
            SubLObject cdolist_list_var;
            final SubLObject supports = cdolist_list_var = boolean_csql_to_sksi_supports(csql, sk_source, content_mt);
            SubLObject support = (SubLObject)sksi_sks_interaction.NIL;
            support = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                sksi_hl_support_utilities.note_sksi_support(support);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return (SubLObject)((sksi_sks_interaction.NIL != result) ? ConsesLow.list(result) : result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 4227L)
    public static SubLObject boolean_csql_to_sksi_supports(final SubLObject csql, final SubLObject sk_source, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select_keyword = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject fields = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject tables = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_sks_interaction.$list7);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list7);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list7);
        tables = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_sks_interaction.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_sks_interaction.$list7);
        current = current.rest();
        if (sksi_sks_interaction.NIL == current) {
            if (sksi_sks_interaction.NIL == where) {
                return (SubLObject)sksi_sks_interaction.NIL;
            }
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = where;
            SubLObject where_keyword = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject where_clauses = (SubLObject)sksi_sks_interaction.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)sksi_sks_interaction.$list8);
            where_keyword = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)sksi_sks_interaction.$list8);
            where_clauses = current_$2.first();
            current_$2 = current_$2.rest();
            if (sksi_sks_interaction.NIL == current_$2) {
                if (sksi_sks_interaction.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_sks_interaction.$kw9$WHERE != where_keyword) {
                    Errors.error((SubLObject)sksi_sks_interaction.$str10$malformed_csql_subexpression__a__, where);
                }
                SubLObject supports = (SubLObject)sksi_sks_interaction.NIL;
                thread.resetMultipleValues();
                final SubLObject row_in_source_claims = sksi_csql_utilities.csql_to_cycl_int(where_clauses, sk_source, conses_high.second(tables));
                final SubLObject source_claims = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_sks_interaction.NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(row_in_source_claims)) {
                    final SubLObject support_sentence = el_utilities.make_el_formula(sksi_sks_interaction.$const11$rowInSourceClaims, (SubLObject)ConsesLow.list(sk_source, row_in_source_claims), (SubLObject)sksi_sks_interaction.UNPROVIDED);
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)sksi_sks_interaction.$kw12$CSQL, support_sentence, content_mt, (SubLObject)sksi_sks_interaction.UNPROVIDED), supports);
                }
                if (sksi_sks_interaction.NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(source_claims)) {
                    final SubLObject support_sentence = el_utilities.make_el_formula(sksi_sks_interaction.$const13$sourceClaims, (SubLObject)ConsesLow.list(sk_source, source_claims), (SubLObject)sksi_sks_interaction.UNPROVIDED);
                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)sksi_sks_interaction.$kw12$CSQL, support_sentence, content_mt, (SubLObject)sksi_sks_interaction.UNPROVIDED), supports);
                }
                return supports;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)sksi_sks_interaction.$list8);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_sks_interaction.$list7);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 5255L)
    public static SubLObject generate_db_iterator_from_csql(final SubLObject csql, final SubLObject access_path, SubLObject start_row, SubLObject end_row, SubLObject translation_style) {
        if (start_row == sksi_sks_interaction.UNPROVIDED) {
            start_row = (SubLObject)sksi_sks_interaction.ZERO_INTEGER;
        }
        if (end_row == sksi_sks_interaction.UNPROVIDED) {
            end_row = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (translation_style == sksi_sks_interaction.UNPROVIDED) {
            translation_style = (SubLObject)sksi_sks_interaction.$kw0$NORMAL;
        }
        final SubLObject result_set = generate_sdbc_result_set_from_csql(csql, access_path, translation_style);
        if (sksi_sks_interaction.NIL != sdbc.sql_result_set_p(result_set)) {
            final SubLObject iterator = sksi_result_set_iterators.new_sqlrs_iterator(result_set, start_row, end_row);
            return iterator;
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 5883L)
    public static SubLObject generate_db_boolean_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLObject result_set = generate_sdbc_result_set_from_csql(csql, access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL != sdbc.sql_result_set_p(result_set)) {
            final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
            SubLObject v_answer = (SubLObject)sksi_sks_interaction.NIL;
            final SubLObject pcase_var = sql_flavor;
            if (pcase_var.eql(sksi_sks_interaction.$const14$MSAccess)) {
                v_answer = sdbc.sqlrs_next(result_set);
            }
            else if (pcase_var.eql(sksi_sks_interaction.$const15$PostgreSQL) || pcase_var.eql(sksi_sks_interaction.$const16$MySQL_TheProgram)) {
                v_answer = sdbc.sqlrs_next(result_set);
            }
            else if (pcase_var.eql(sksi_sks_interaction.$const17$ApacheDerby) || pcase_var.eql(sksi_sks_interaction.$const18$MSSQLServer) || pcase_var.eql(sksi_sks_interaction.$const19$IBM_DB2_TheProgram) || pcase_var.eql(sksi_sks_interaction.$const20$Sybase_IQ)) {
                sdbc.sqlrs_next(result_set);
                final SubLObject row = sksi_result_set_iterators.sqlrs_current_row_as_list(result_set);
                if (sksi_sks_interaction.NIL != list_utilities.singletonP(row)) {
                    v_answer = (SubLObject)SubLObjectFactory.makeBoolean(!row.first().isZero());
                }
            }
            else if (pcase_var.eql(sksi_sks_interaction.$const21$OracleDatabaseServer_TheProgram)) {
                sdbc.sqlrs_next(result_set);
                final SubLObject row = sksi_result_set_iterators.sqlrs_current_row_as_list(result_set);
                if (sksi_sks_interaction.NIL != list_utilities.singletonP(row)) {
                    final SubLObject value = row.first();
                    v_answer = (SubLObject)SubLObjectFactory.makeBoolean((value.isString() && !string_utilities.string_to_integer(value).isZero()) || (value.isInteger() && !value.isZero()));
                }
            }
            sksi_result_set_iterators.finalize_result_set(result_set);
            return v_answer;
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 7575L)
    public static SubLObject generate_sdbc_result_set_from_csql(final SubLObject csql, final SubLObject access_path, SubLObject translation_style) {
        if (translation_style == sksi_sks_interaction.UNPROVIDED) {
            translation_style = (SubLObject)sksi_sks_interaction.$kw0$NORMAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, translation_style);
        if (!sql.isString()) {
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL != sksi_result_set_iterators.$sksi_caching_enabledP$.getDynamicValue(thread)) {
            return cached_get_result_set_from_sql_source(sql, access_path);
        }
        return get_result_set_from_sql_source(sql, access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 8005L)
    public static SubLObject generate_web_page_iterator_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLObject result_set = generate_web_page_result_set(csql, access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        return iteration.new_list_iterator(result_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 8277L)
    public static SubLObject generate_web_page_boolean_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLObject result_set = generate_web_page_result_set(csql, access_path, (SubLObject)sksi_sks_interaction.T);
        return list_utilities.sublisp_boolean(result_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 8499L)
    public static SubLObject generate_web_page_result_set(final SubLObject csql, final SubLObject access_path, SubLObject use_boolean_if_availableP) {
        if (use_boolean_if_availableP == sksi_sks_interaction.UNPROVIDED) {
            use_boolean_if_availableP = (SubLObject)sksi_sks_interaction.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select_keyword = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject csql_fields = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject tables = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_sks_interaction.$list22);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list22);
        csql_fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list22);
        tables = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_sks_interaction.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_sks_interaction.$list22);
        current = current.rest();
        if (sksi_sks_interaction.NIL == current) {
            SubLObject current_$4;
            final SubLObject datum_$3 = current_$4 = where;
            final SubLObject where_keyword = (SubLObject)(current_$4.isCons() ? current_$4.first() : sksi_sks_interaction.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current_$4, datum_$3, (SubLObject)sksi_sks_interaction.$list23);
            current_$4 = current_$4.rest();
            final SubLObject where_clauses = (SubLObject)(current_$4.isCons() ? current_$4.first() : sksi_sks_interaction.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current_$4, datum_$3, (SubLObject)sksi_sks_interaction.$list23);
            current_$4 = current_$4.rest();
            if (sksi_sks_interaction.NIL == current_$4) {
                final SubLObject query_template = sksi_access_path.access_path_query_template(access_path);
                final SubLObject query = sksi_web_query_template_to_query(query_template, where_clauses, sksi_access_path.access_path_sks(access_path));
                final SubLObject physical_field_names = sksi_access_path.access_path_physical_field_names(access_path);
                thread.resetMultipleValues();
                final SubLObject where_pattern = sksi_web_query_patterns(physical_field_names, csql_fields, where_clauses);
                final SubLObject field_positions = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject result_set = sksi_web_page_result_set(access_path, query, use_boolean_if_availableP, where_pattern);
                final SubLObject filtered_result_set = sksi_filter_result_set(result_set, where_pattern, field_positions);
                return filtered_result_set;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)sksi_sks_interaction.$list23);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_sks_interaction.$list22);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 9770L)
    public static SubLObject sksi_web_query_template_to_query(final SubLObject raw_query_template, final SubLObject where_clauses, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_template = raw_query_template;
        SubLObject relevant_physical_field_indexicals = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sks));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            relevant_physical_field_indexicals = (cdolist_list_var = list_utilities.tree_gather(raw_query_template, (SubLObject)sksi_sks_interaction.$sym24$PHYSICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED));
            SubLObject relevant_physical_field_indexical = (SubLObject)sksi_sks_interaction.NIL;
            relevant_physical_field_indexical = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                final SubLObject physical_field_indexical_name = sksi_kb_accessors.physical_field_indexical_name(relevant_physical_field_indexical);
                SubLObject cdolist_list_var_$5 = where_clauses;
                SubLObject where_clause = (SubLObject)sksi_sks_interaction.NIL;
                where_clause = cdolist_list_var_$5.first();
                while (sksi_sks_interaction.NIL != cdolist_list_var_$5) {
                    SubLObject current;
                    final SubLObject datum = current = where_clause;
                    SubLObject where_operator = (SubLObject)sksi_sks_interaction.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list25);
                    where_operator = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list25);
                    final SubLObject temp = current.rest();
                    current = current.first();
                    SubLObject field_type = (SubLObject)sksi_sks_interaction.NIL;
                    SubLObject field_name = (SubLObject)sksi_sks_interaction.NIL;
                    SubLObject field_table = (SubLObject)sksi_sks_interaction.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list25);
                    field_type = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list25);
                    field_name = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list25);
                    field_table = current.first();
                    current = current.rest();
                    if (sksi_sks_interaction.NIL == current) {
                        current = temp;
                        SubLObject value = (SubLObject)sksi_sks_interaction.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list25);
                        value = current.first();
                        current = current.rest();
                        if (sksi_sks_interaction.NIL == current) {
                            if (sksi_sks_interaction.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !sksi_sks_interaction.$const26$CSQLStrictlyEquals.eql(where_operator)) {
                                Errors.error((SubLObject)sksi_sks_interaction.$str27$time_to_support__S_operator, where_operator);
                            }
                            if (field_name.equal(physical_field_indexical_name)) {
                                query_template = conses_high.subst(value, relevant_physical_field_indexical, query_template, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_interaction.$list25);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_interaction.$list25);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    where_clause = cdolist_list_var_$5.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                relevant_physical_field_indexical = cdolist_list_var.first();
            }
            SubLObject cdolist_list_var2;
            final SubLObject relevant_physical_field_indexicals_$6 = cdolist_list_var2 = list_utilities.tree_gather(query_template, (SubLObject)sksi_sks_interaction.$sym24$PHYSICAL_FIELD_INDEXICAL_P, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            SubLObject relevant_physical_field_indexical2 = (SubLObject)sksi_sks_interaction.NIL;
            relevant_physical_field_indexical2 = cdolist_list_var2.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var2) {
                final SubLObject current_physical_field = sksi_kb_accessors.physical_field_for_indexical(relevant_physical_field_indexical2);
                final SubLObject default_value = sksi_kb_accessors.physical_field_default_value(current_physical_field, sksi_kb_accessors.physical_field_schema(current_physical_field), (SubLObject)sksi_sks_interaction.UNPROVIDED);
                if (sksi_sks_interaction.NIL == default_value) {
                    Errors.error((SubLObject)sksi_sks_interaction.$str28$No_default_value_provided_for__A, current_physical_field);
                }
                query_template = conses_high.subst(default_value, relevant_physical_field_indexical2, query_template, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                relevant_physical_field_indexical2 = cdolist_list_var2.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject query = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != query_template) {
            query = relation_evaluation.cyc_evaluate(query_template);
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 11713L)
    public static SubLObject sksi_web_query_patterns(final SubLObject physical_field_names, final SubLObject csql_fields, final SubLObject where_clauses) {
        final SubLObject where_pattern = sksi_web_query_where_pattern(physical_field_names, where_clauses);
        final SubLObject field_positions = sksi_web_query_field_positions(physical_field_names, csql_fields);
        return Values.values(where_pattern, field_positions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 12034L)
    public static SubLObject sksi_web_query_where_pattern(final SubLObject physical_field_names, final SubLObject where_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL == where_clauses) {
            return (SubLObject)sksi_sks_interaction.$kw29$INPUT;
        }
        SubLObject where_pattern = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject cdolist_list_var = physical_field_names;
        SubLObject field_name = (SubLObject)sksi_sks_interaction.NIL;
        field_name = cdolist_list_var.first();
        while (sksi_sks_interaction.NIL != cdolist_list_var) {
            SubLObject filter_conditions = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject cdolist_list_var_$7 = where_clauses;
            SubLObject where_clause = (SubLObject)sksi_sks_interaction.NIL;
            where_clause = cdolist_list_var_$7.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var_$7) {
                SubLObject current;
                final SubLObject datum = current = where_clause;
                SubLObject where_operator = (SubLObject)sksi_sks_interaction.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list30);
                where_operator = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list30);
                final SubLObject temp = current.rest();
                current = current.first();
                SubLObject where_field_type = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject where_field_name = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject where_table = (SubLObject)sksi_sks_interaction.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list30);
                where_field_type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list30);
                where_field_name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list30);
                where_table = current.first();
                current = current.rest();
                if (sksi_sks_interaction.NIL == current) {
                    current = temp;
                    SubLObject value = (SubLObject)sksi_sks_interaction.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list30);
                    value = current.first();
                    current = current.rest();
                    if (sksi_sks_interaction.NIL == current) {
                        if (field_name.equal(where_field_name)) {
                            if (sksi_sks_interaction.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !sksi_sks_interaction.$const26$CSQLStrictlyEquals.eql(where_operator)) {
                                Errors.error((SubLObject)sksi_sks_interaction.$str27$time_to_support__S_operator, where_operator);
                            }
                            if (where_field_name.equal(field_name)) {
                                filter_conditions = (SubLObject)ConsesLow.cons(value, filter_conditions);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_interaction.$list30);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_interaction.$list30);
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                where_clause = cdolist_list_var_$7.first();
            }
            filter_conditions = Sequences.nreverse(filter_conditions);
            if (sksi_sks_interaction.NIL == filter_conditions) {
                where_pattern = (SubLObject)ConsesLow.cons((SubLObject)sksi_sks_interaction.$kw31$ANYTHING, where_pattern);
            }
            else if (sksi_sks_interaction.NIL != list_utilities.singletonP(filter_conditions)) {
                where_pattern = (SubLObject)ConsesLow.cons(filter_conditions.first(), where_pattern);
            }
            else {
                where_pattern = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(sksi_sks_interaction.$const32$CSQLAnd, filter_conditions), where_pattern);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_name = cdolist_list_var.first();
        }
        return Sequences.nreverse(where_pattern);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 13378L)
    public static SubLObject sksi_web_query_field_positions(final SubLObject physical_field_names, final SubLObject csql_fields) {
        if (sksi_sks_interaction.NIL != sksi_csql_utilities.boolean_csql_selectP(csql_fields)) {
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        SubLObject positions = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject cdolist_list_var = csql_fields;
        SubLObject field = (SubLObject)sksi_sks_interaction.NIL;
        field = cdolist_list_var.first();
        while (sksi_sks_interaction.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = field;
            SubLObject field_keyword = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject field_name = (SubLObject)sksi_sks_interaction.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list33);
            field_keyword = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list33);
            field_name = current.first();
            current = current.rest();
            final SubLObject table = (SubLObject)(current.isCons() ? current.first() : sksi_sks_interaction.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_sks_interaction.$list33);
            current = current.rest();
            final SubLObject namespace = (SubLObject)(current.isCons() ? current.first() : sksi_sks_interaction.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_sks_interaction.$list33);
            current = current.rest();
            if (sksi_sks_interaction.NIL == current) {
                final SubLObject position = Sequences.position(field_name, physical_field_names, Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUAL), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                assert sksi_sks_interaction.NIL != subl_promotions.non_negative_integer_p(position) : position;
                positions = (SubLObject)ConsesLow.cons(position, positions);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_interaction.$list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        }
        return Sequences.nreverse(positions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 14069L)
    public static SubLObject sksi_web_page_result_set(final SubLObject access_path, final SubLObject query, SubLObject use_boolean_if_availableP, SubLObject where_pattern) {
        if (use_boolean_if_availableP == sksi_sks_interaction.UNPROVIDED) {
            use_boolean_if_availableP = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (where_pattern == sksi_sks_interaction.UNPROVIDED) {
            where_pattern = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLObject server = sksi_access_path.access_path_server(access_path);
        final SubLObject port = sksi_access_path.access_path_port(access_path);
        final SubLObject method = sksi_access_path.access_path_request_method(access_path);
        final SubLObject url = sksi_access_path.access_path_url(access_path);
        final SubLObject timeout = sksi_access_path.access_path_timeout(access_path);
        final SubLObject connection_data = (SubLObject)ConsesLow.list(server, port, method, url, timeout, query);
        final SubLObject parsing_method = sksi_access_path.access_path_parsing_method(access_path);
        final SubLObject parsing_program = sksi_access_path.access_path_parsing_program(access_path);
        if (sksi_sks_interaction.NIL != use_boolean_if_availableP) {
            final SubLObject pcase_var = parsing_method;
            if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw35$SUBLBOOLEAN)) {
                return (SubLObject)((sksi_sks_interaction.NIL != get_results_from_subl_parsing_function(get_results_from_sksi_web_page_subl_method(access_path, connection_data), parsing_program)) ? ConsesLow.list(where_pattern) : sksi_sks_interaction.NIL);
            }
            if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw36$SUBL)) {
                return get_results_from_subl_parsing_function(get_results_from_sksi_web_page_subl_method(access_path, connection_data), parsing_program);
            }
            if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw37$SUBLUNBOUNDONLY)) {
                return sksi_web_page_result_set_for_unbound_only(access_path, connection_data, parsing_program, where_pattern);
            }
            Errors.error((SubLObject)sksi_sks_interaction.$str38$Parsing_method__S_is_not_yet_supp, parsing_method);
        }
        else {
            if (parsing_method == sksi_sks_interaction.$kw37$SUBLUNBOUNDONLY) {
                return sksi_web_page_result_set_for_unbound_only(access_path, connection_data, parsing_program, where_pattern);
            }
            if (parsing_method == sksi_sks_interaction.$kw36$SUBL) {
                return get_results_from_subl_parsing_function(get_results_from_sksi_web_page_subl_method(access_path, connection_data), parsing_program);
            }
            Errors.error((SubLObject)sksi_sks_interaction.$str38$Parsing_method__S_is_not_yet_supp, parsing_method);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 16089L)
    public static SubLObject sksi_web_page_result_set_for_unbound_only(final SubLObject access_path, final SubLObject connection_data, final SubLObject parsing_program, final SubLObject where_pattern) {
        final SubLObject results = get_results_from_subl_parsing_function(get_results_from_sksi_web_page_subl_method(access_path, connection_data), parsing_program);
        SubLObject final_result = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        result = cdolist_list_var.first();
        while (sksi_sks_interaction.NIL != cdolist_list_var) {
            final_result = (SubLObject)ConsesLow.cons(list_utilities.nreplace_nested_nth(where_pattern, (SubLObject)ConsesLow.list(result.first()), conses_high.cadr(result)), final_result);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return final_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 16538L)
    public static SubLObject test_sksi_web_page_result_set(final SubLObject sk_source, final SubLObject query, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject access_path = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            access_path = sksi_access_path.external_source_access_path(sk_source, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sksi_web_page_result_set(access_path, query, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 17133L)
    public static SubLObject get_results_from_sksi_web_page_subl_method(final SubLObject access_path, final SubLObject connection_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = sksi_sks_interaction.$sksi_http_request_caching_strategy$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw39$MEMOIZE)) {
            return get_results_from_sksi_web_page_subl_method_memoized(access_path, connection_data);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw6$CACHE)) {
            return get_results_from_sksi_web_page_subl_method_cached(access_path, connection_data);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw40$NONE)) {
            return get_results_from_sksi_web_page_subl_method_none(access_path, connection_data);
        }
        Errors.error((SubLObject)sksi_sks_interaction.$str41$_S_not_a_valid_value_for__sksi_ht, sksi_sks_interaction.$sksi_http_request_caching_strategy$.getDynamicValue(thread));
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 17802L)
    public static SubLObject get_results_from_sksi_web_page_subl_method_memoized_internal(final SubLObject access_path, final SubLObject connection_data) {
        return get_results_from_sksi_web_page_subl_method_int(access_path, connection_data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 17802L)
    public static SubLObject get_results_from_sksi_web_page_subl_method_memoized(final SubLObject access_path, final SubLObject connection_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL == v_memoization_state) {
            return get_results_from_sksi_web_page_subl_method_memoized_internal(access_path, connection_data);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_sks_interaction.$sym42$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_MEMOIZED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_sks_interaction.$sym42$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_MEMOIZED, (SubLObject)sksi_sks_interaction.TWO_INTEGER, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.EQUAL, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_sks_interaction.$sym42$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(access_path, connection_data);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_sks_interaction.NIL;
            collision = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (access_path.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_sks_interaction.NIL != cached_args && sksi_sks_interaction.NIL == cached_args.rest() && connection_data.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_results_from_sksi_web_page_subl_method_memoized_internal(access_path, connection_data)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(access_path, connection_data));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18084L)
    public static SubLObject clear_get_results_from_sksi_web_page_subl_method_cached() {
        final SubLObject cs = sksi_sks_interaction.$get_results_from_sksi_web_page_subl_method_cached_caching_state$.getGlobalValue();
        if (sksi_sks_interaction.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18084L)
    public static SubLObject remove_get_results_from_sksi_web_page_subl_method_cached(final SubLObject access_path, final SubLObject connection_data) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_sks_interaction.$get_results_from_sksi_web_page_subl_method_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(access_path, connection_data), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18084L)
    public static SubLObject get_results_from_sksi_web_page_subl_method_cached_internal(final SubLObject access_path, final SubLObject connection_data) {
        return get_results_from_sksi_web_page_subl_method_int(access_path, connection_data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18084L)
    public static SubLObject get_results_from_sksi_web_page_subl_method_cached(final SubLObject access_path, final SubLObject connection_data) {
        SubLObject caching_state = sksi_sks_interaction.$get_results_from_sksi_web_page_subl_method_cached_caching_state$.getGlobalValue();
        if (sksi_sks_interaction.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_sks_interaction.$sym43$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_CACHED, (SubLObject)sksi_sks_interaction.$sym44$_GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_CACHED_CACHING_STATE_, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.EQUAL, (SubLObject)sksi_sks_interaction.TWO_INTEGER, (SubLObject)sksi_sks_interaction.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(access_path, connection_data);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_sks_interaction.NIL;
            collision = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (access_path.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_sks_interaction.NIL != cached_args && sksi_sks_interaction.NIL == cached_args.rest() && connection_data.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_results_from_sksi_web_page_subl_method_cached_internal(access_path, connection_data)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(access_path, connection_data));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18287L)
    public static SubLObject get_results_from_sksi_web_page_subl_method_none(final SubLObject access_path, final SubLObject connection_data) {
        return get_results_from_sksi_web_page_subl_method_int(access_path, connection_data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 18468L)
    public static SubLObject get_results_from_sksi_web_page_subl_method_int(final SubLObject access_path, final SubLObject connection_data) {
        SubLObject server = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject port = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject method = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject url = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject timeout = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject query = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(connection_data, connection_data, (SubLObject)sksi_sks_interaction.$list45);
        server = connection_data.first();
        SubLObject current = connection_data.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, connection_data, (SubLObject)sksi_sks_interaction.$list45);
        port = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, connection_data, (SubLObject)sksi_sks_interaction.$list45);
        method = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, connection_data, (SubLObject)sksi_sks_interaction.$list45);
        url = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, connection_data, (SubLObject)sksi_sks_interaction.$list45);
        timeout = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, connection_data, (SubLObject)sksi_sks_interaction.$list45);
        query = current.first();
        current = current.rest();
        if (sksi_sks_interaction.NIL == current) {
            return sksi_tokenized_http_request(access_path, server, url, timeout, query, method, port);
        }
        cdestructuring_bind.cdestructuring_bind_error(connection_data, (SubLObject)sksi_sks_interaction.$list45);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 19888L)
    public static SubLObject sksi_tokenized_http_request_internal(final SubLObject access_path, final SubLObject machine, final SubLObject url, SubLObject connection_timeout, SubLObject query, SubLObject method, SubLObject port) {
        if (connection_timeout == sksi_sks_interaction.UNPROVIDED) {
            connection_timeout = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (query == sksi_sks_interaction.UNPROVIDED) {
            query = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (method == sksi_sks_interaction.UNPROVIDED) {
            method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        }
        if (port == sksi_sks_interaction.UNPROVIDED) {
            port = (SubLObject)sksi_sks_interaction.$int49$80;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_url = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str50$http___, new SubLObject[] { machine, url });
        SubLObject cyc_query = inference_worker.currently_active_problem_query();
        if (sksi_sks_interaction.NIL != inference_datastructures_problem_query.single_literal_problem_query_p(cyc_query)) {
            cyc_query = inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(cyc_query);
            if (query.isString()) {
                support_url = Sequences.cconcatenate(support_url, new SubLObject[] { sksi_sks_interaction.$str51$_, query });
            }
            sksi_hl_support_utilities.note_sksi_support(arguments.make_hl_support((SubLObject)sksi_sks_interaction.$kw12$CSQL, (SubLObject)ConsesLow.list(sksi_sks_interaction.$const52$salientURL, cyc_query, support_url), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED));
        }
        if (sksi_sks_interaction.NIL == connection_timeout) {
            connection_timeout = sksi_sks_interaction.$sksi_http_request_open_connection_timeout$.getDynamicValue(thread);
        }
        thread.resetMultipleValues();
        final SubLObject tokens = xml_parsing_utilities.xml_tokenized_http_request(machine, url, query, method, port, sksi_sks_interaction.$sksi_http_request_keep_alive$.getDynamicValue(thread), sksi_sks_interaction.$sksi_http_request_wide_newlines$.getDynamicValue(thread), connection_timeout, sksi_sks_interaction.$sksi_http_request_overall_timeout$.getDynamicValue(thread), sksi_sks_interaction.$sksi_http_automatically_redirect$.getDynamicValue(thread), (SubLObject)sksi_sks_interaction.UNPROVIDED);
        final SubLObject status = thread.secondMultipleValue();
        final SubLObject error_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_sks_interaction.NIL != tokens) {
            return tokens;
        }
        final SubLObject pcase_var = status;
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw53$ERROR)) {
            return sksi_unreachable_sks_error(access_path, error_message);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw54$OPEN_CONNECTION)) {
            return sksi_unreachable_sks_error(access_path, (SubLObject)sksi_sks_interaction.$str55$Opening_the_TCP_connection_timed_);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw56$OVERALL)) {
            return sksi_unreachable_sks_error(access_path, (SubLObject)sksi_sks_interaction.$str57$The_HTTP_request_timed_out_);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 19888L)
    public static SubLObject sksi_tokenized_http_request(final SubLObject access_path, final SubLObject machine, final SubLObject url, SubLObject connection_timeout, SubLObject query, SubLObject method, SubLObject port) {
        if (connection_timeout == sksi_sks_interaction.UNPROVIDED) {
            connection_timeout = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (query == sksi_sks_interaction.UNPROVIDED) {
            query = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (method == sksi_sks_interaction.UNPROVIDED) {
            method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        }
        if (port == sksi_sks_interaction.UNPROVIDED) {
            port = (SubLObject)sksi_sks_interaction.$int49$80;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL == v_memoization_state) {
            return sksi_tokenized_http_request_internal(access_path, machine, url, connection_timeout, query, method, port);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_sks_interaction.$sym47$SKSI_TOKENIZED_HTTP_REQUEST, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_sks_interaction.$sym47$SKSI_TOKENIZED_HTTP_REQUEST, (SubLObject)sksi_sks_interaction.SEVEN_INTEGER, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.EQUAL, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_sks_interaction.$sym47$SKSI_TOKENIZED_HTTP_REQUEST, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(access_path, machine, url, connection_timeout, query, method, port);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_sks_interaction.NIL;
            collision = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (access_path.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (machine.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (url.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (connection_timeout.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (query.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (method.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (sksi_sks_interaction.NIL != cached_args && sksi_sks_interaction.NIL == cached_args.rest() && port.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_tokenized_http_request_internal(access_path, machine, url, connection_timeout, query, method, port)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(access_path, machine, url, connection_timeout, query, method, port));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 21305L)
    public static SubLObject get_results_from_subl_parsing_function(final SubLObject tokens, final SubLObject parsing_program) {
        assert sksi_sks_interaction.NIL != sksi_subl_parsing_program_p(parsing_program) : parsing_program;
        SubLObject expand_subl = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parsing_program, parsing_program, (SubLObject)sksi_sks_interaction.$list59);
        expand_subl = parsing_program.first();
        SubLObject current = parsing_program.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parsing_program, (SubLObject)sksi_sks_interaction.$list59);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tokens_var = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, parsing_program, (SubLObject)sksi_sks_interaction.$list59);
        tokens_var = current.first();
        current = current.rest();
        if (sksi_sks_interaction.NIL == current) {
            current = temp;
            SubLObject program_body = (SubLObject)sksi_sks_interaction.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, parsing_program, (SubLObject)sksi_sks_interaction.$list59);
            program_body = current.first();
            current = current.rest();
            if (sksi_sks_interaction.NIL == current) {
                return Eval.eval((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym60$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tokens_var, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym61$QUOTE, ConsesLow.append(tokens, (SubLObject)sksi_sks_interaction.NIL)))), program_body));
            }
            cdestructuring_bind.cdestructuring_bind_error(parsing_program, (SubLObject)sksi_sks_interaction.$list59);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parsing_program, (SubLObject)sksi_sks_interaction.$list59);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 21623L)
    public static SubLObject sksi_subl_parsing_program_p(final SubLObject v_object) {
        if (sksi_sks_interaction.NIL != el_utilities.possibly_naut_p(v_object)) {
            if (sksi_sks_interaction.NIL != el_utilities.formula_arityE(v_object, (SubLObject)sksi_sks_interaction.TWO_INTEGER, (SubLObject)sksi_sks_interaction.UNPROVIDED) && sksi_sks_interaction.$const62$ExpandSubLFn.eql(cycl_utilities.formula_operator(v_object))) {
                return (SubLObject)sksi_sks_interaction.T;
            }
            if (sksi_sks_interaction.NIL != el_utilities.formula_arityE(v_object, (SubLObject)sksi_sks_interaction.ONE_INTEGER, (SubLObject)sksi_sks_interaction.UNPROVIDED) && sksi_sks_interaction.$const63$SubLQuoteFn.eql(cycl_utilities.formula_operator(v_object))) {
                return (SubLObject)sksi_sks_interaction.T;
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 21924L)
    public static SubLObject sksi_filter_result_set(final SubLObject result_set, final SubLObject where_pattern, final SubLObject field_positions) {
        SubLObject filtered_result_set = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.$kw29$INPUT == where_pattern) {
            filtered_result_set = result_set;
        }
        else {
            SubLObject cdolist_list_var = result_set;
            SubLObject tuple = (SubLObject)sksi_sks_interaction.NIL;
            tuple = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                if (sksi_sks_interaction.NIL != pattern_match.pattern_matches_tree(where_pattern, tuple)) {
                    filtered_result_set = (SubLObject)ConsesLow.cons(tuple, filtered_result_set);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tuple = cdolist_list_var.first();
            }
            filtered_result_set = Sequences.nreverse(filtered_result_set);
        }
        if (sksi_sks_interaction.NIL != field_positions) {
            SubLObject selected_result_set = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject cdolist_list_var2 = filtered_result_set;
            SubLObject tuple2 = (SubLObject)sksi_sks_interaction.NIL;
            tuple2 = cdolist_list_var2.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var2) {
                final SubLObject selected_tuple = compute_selected_tuple(tuple2, field_positions);
                selected_result_set = (SubLObject)ConsesLow.cons(selected_tuple, selected_result_set);
                cdolist_list_var2 = cdolist_list_var2.rest();
                tuple2 = cdolist_list_var2.first();
            }
            return Sequences.nreverse(selected_result_set);
        }
        return filtered_result_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 22970L)
    public static SubLObject compute_selected_tuple(final SubLObject tuple, final SubLObject field_positions) {
        return list_utilities.sequence_elements(tuple, field_positions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 23201L)
    public static SubLObject generate_kb_iterator_from_csql(final SubLObject csql, final SubLObject access_path) {
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 23394L)
    public static SubLObject generate_kb_boolean_from_csql(final SubLObject csql, final SubLObject access_path) {
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 23551L)
    public static SubLObject generate_fht_iterator_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key = sksi_csql_interpretation.csql_to_key_and_value_expressions(csql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        final SubLObject key_value = thread.secondMultipleValue();
        final SubLObject where_clause_existsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_sks_interaction.NIL == where_clause_existsP) {
            return get_result_iterator_from_fht_source(csql, access_path);
        }
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != key) {
            result = get_result_for_key_from_fht_source(key, access_path);
        }
        else if (sksi_sks_interaction.NIL != key_value) {
            result = get_result_for_key_value_from_fht_source(key_value, access_path);
        }
        return sksi_result_set_iterators.new_fht_result_iterator(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 24346L)
    public static SubLObject generate_fht_boolean_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key = sksi_csql_interpretation.csql_to_key_and_value_expressions(csql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        final SubLObject key_value = thread.secondMultipleValue();
        final SubLObject where_clause_existsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject value_test_fn = sksi_access_path.access_path_value_test_function(access_path);
        final SubLObject result = Functions.funcall(value_test_fn, key_value, get_result_for_key_from_fht_source(key, access_path));
        if (sksi_sks_interaction.NIL != result) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sksi_sks_interaction.EMPTY_SUBL_OBJECT_ARRAY));
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 24856L)
    public static SubLObject generate_cache_iterator_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select_keyword = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject fields = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject from = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_sks_interaction.$list64);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list64);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list64);
        from = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_sks_interaction.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_sks_interaction.$list64);
        current = current.rest();
        if (sksi_sks_interaction.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_sks_interaction.$list64);
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_sks_interaction.$kw65$SELECT != select_keyword) {
            Errors.error((SubLObject)sksi_sks_interaction.$str66$malformed_csql_expression__a, csql);
        }
        final SubLObject tables = conses_high.second(from);
        if (sksi_sks_interaction.NIL != list_utilities.singletonP(tables) && sksi_sks_interaction.$list67.equal(tables.first())) {
            return sksi_cache.generate_language_spoken_iterator_from_csql(csql);
        }
        Errors.error((SubLObject)sksi_sks_interaction.$str68$unknown_cache_for_csql__a_and_acc, csql, access_path);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 25704L)
    public static SubLObject generate_cache_boolean_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select_keyword = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject fields = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject from = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_sks_interaction.$list64);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list64);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_sks_interaction.$list64);
        from = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_sks_interaction.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_sks_interaction.$list64);
        current = current.rest();
        if (sksi_sks_interaction.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_sks_interaction.$list64);
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_sks_interaction.$kw65$SELECT != select_keyword) {
            Errors.error((SubLObject)sksi_sks_interaction.$str66$malformed_csql_expression__a, csql);
        }
        final SubLObject tables = conses_high.second(from);
        if (sksi_sks_interaction.NIL != list_utilities.singletonP(tables) && sksi_sks_interaction.$list67.equal(tables.first())) {
            return sksi_cache.generate_language_spoken_boolean_from_csql(csql);
        }
        Errors.error((SubLObject)sksi_sks_interaction.$str68$unknown_cache_for_csql__a_and_acc, csql, access_path);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 26413L)
    public static SubLObject generate_rdf_iterator_from_csql(final SubLObject csql, final SubLObject access_path) {
        return new_sparql_result_set_iterator(csql, access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 26668L)
    public static SubLObject generate_rdf_boolean_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLObject result_set = generate_sparql_result_set_from_csql(csql, access_path);
        return list_utilities.sublisp_boolean(result_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 26923L)
    public static SubLObject generate_sparql_result_set_from_csql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sparql = sksi_csql_sparql_interpretation.csql_to_sparql(csql, access_path);
        if (sksi_sks_interaction.NIL != sksi_sks_interaction.$oracle_sparql_progress_stream$.getDynamicValue(thread)) {
            final SubLObject oracle_sparql = sksi_csql_oracle_sparql_interpretation.csql_to_oracle_sparql(csql, access_path);
            PrintLow.format(sksi_sks_interaction.$oracle_sparql_progress_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_interaction.$str69$___A____, oracle_sparql);
        }
        return (SubLObject)(sparql.isString() ? get_result_set_from_sparql_source(sparql, access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED) : sksi_sks_interaction.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 27731L)
    public static SubLObject new_sparql_result_set_iterator(final SubLObject csql, final SubLObject access_path, SubLObject limits) {
        if (limits == sksi_sks_interaction.UNPROVIDED) {
            limits = sksi_sks_interaction.$sksi_sparql_iterativity_limits$.getDynamicValue();
        }
        if (limits.equal((SubLObject)sksi_sks_interaction.$list70)) {
            final SubLObject result_set = generate_sparql_result_set_from_csql(csql, access_path);
            return iteration.new_list_iterator(result_set);
        }
        return iteration.new_iterator(make_sparql_result_set_iterator_state(csql, access_path, limits), (SubLObject)sksi_sks_interaction.$sym71$SPARQL_RESULT_SET_ITERATOR_DONE_P, (SubLObject)sksi_sks_interaction.$sym72$SPARQL_RESULT_SET_ITERATOR_NEXT, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 28377L)
    public static SubLObject make_sparql_result_set_iterator_state(final SubLObject csql, final SubLObject access_path, final SubLObject limits) {
        final SubLObject pending_results = iteration.new_null_iterator();
        final SubLObject pending_limits = iteration.new_list_iterator(limits);
        final SubLObject processed_results = set.new_set(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUAL), (SubLObject)sksi_sks_interaction.UNPROVIDED);
        return (SubLObject)ConsesLow.list(pending_results, pending_limits, processed_results, csql, access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 28682L)
    public static SubLObject sparql_result_set_iterator_done_p(final SubLObject state) {
        SubLObject pending_results = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject pending_limits = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_sks_interaction.$list73);
        pending_results = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_sks_interaction.$list73);
        pending_limits = current.first();
        final SubLObject rest;
        current = (rest = current.rest());
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL != iteration.iteration_done(pending_results) && sksi_sks_interaction.NIL != iteration.iteration_done(pending_limits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 28924L)
    public static SubLObject sparql_result_set_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pending_results = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject pending_limits = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject processed_results = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject csql = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject access_path = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_sks_interaction.$list74);
        pending_results = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_sks_interaction.$list74);
        pending_limits = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_sks_interaction.$list74);
        processed_results = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_sks_interaction.$list74);
        csql = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_sks_interaction.$list74);
        access_path = current.first();
        current = current.rest();
        if (sksi_sks_interaction.NIL == current) {
            while (sksi_sks_interaction.NIL == iteration.iteration_done(pending_results) || sksi_sks_interaction.NIL == iteration.iteration_done(pending_limits)) {
                while (sksi_sks_interaction.NIL == iteration.iteration_done(pending_results)) {
                    thread.resetMultipleValues();
                    final SubLObject pending_result = iteration.iteration_next(pending_results);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_sks_interaction.NIL != validP && sksi_sks_interaction.NIL == set.set_memberP(pending_result, processed_results)) {
                        set.set_add(pending_result, processed_results);
                        return Values.values(pending_result, state, (SubLObject)sksi_sks_interaction.NIL);
                    }
                }
                if (sksi_sks_interaction.NIL == iteration.iteration_done(pending_limits)) {
                    thread.resetMultipleValues();
                    final SubLObject pending_limit = iteration.iteration_next(pending_limits);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_sks_interaction.NIL == validP) {
                        continue;
                    }
                    SubLObject result_set = (SubLObject)sksi_sks_interaction.NIL;
                    final SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sparql_limit_override$.currentBinding(thread);
                    try {
                        sksi_csql_sparql_interpretation.$sparql_limit_override$.bind(pending_limit, thread);
                        result_set = generate_sparql_result_set_from_csql(csql, access_path);
                    }
                    finally {
                        sksi_csql_sparql_interpretation.$sparql_limit_override$.rebind(_prev_bind_0, thread);
                    }
                    pending_results = iteration.new_list_iterator(result_set);
                    ConsesLow.set_nth((SubLObject)sksi_sks_interaction.ZERO_INTEGER, state, pending_results);
                    if (sksi_sks_interaction.NIL == pending_limit || !Sequences.length(result_set).numL(pending_limit)) {
                        continue;
                    }
                    pending_limits = iteration.new_null_iterator();
                    ConsesLow.set_nth((SubLObject)sksi_sks_interaction.ONE_INTEGER, state, pending_limits);
                }
            }
            set.clear_set(processed_results);
            return Values.values((SubLObject)sksi_sks_interaction.NIL, state, (SubLObject)sksi_sks_interaction.T);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_sks_interaction.$list74);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 30311L)
    public static SubLObject with_sksi_result_set_from_execute_query(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_set = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject sql_string = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject access_path = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list75);
        result_set = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list75);
        sql_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list75);
        access_path = current.first();
        current = current.rest();
        if (sksi_sks_interaction.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym60$CLET, (SubLObject)ConsesLow.list(result_set), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym76$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_interaction.$sym77$PROGN, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym78$CSETQ, result_set, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym79$SKSI_EXECUTE_SQL_QUERY, sql_string, access_path)), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym80$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym81$SQL_RESULT_SET_P, result_set), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym82$ERROR, (SubLObject)sksi_sks_interaction.$str83$Problem_executing_query___a_, sql_string)), ConsesLow.append(body, (SubLObject)sksi_sks_interaction.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym84$FINALIZE_RESULT_SET, result_set)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_sks_interaction.$list75);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 30970L)
    public static SubLObject sksi_execute_sqls_query(final SubLObject statement, final SubLObject sql) {
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject inferences_var = inference_macros.current_controlling_inferences();
        final SubLObject inference_var = inference_macros.current_controlling_inference();
        final SubLObject tactic_var = inference_worker.currently_executing_tactic();
        SubLObject start_time = (SubLObject)sksi_sks_interaction.NIL;
        try {
            inference_datastructures_inference.possibly_signal_sksi_query_start(inference_var, tactic_var);
            start_time = inference_datastructures_inference.inference_time_so_far(inference_var, (SubLObject)sksi_sks_interaction.NIL);
            inference_datastructures_inference.possibly_add_inference_sksi_query_start_time(inferences_var, start_time);
            inference_possibly_note_salient_sksi_query_string(sql);
            result = sdbc.sqls_execute_query(statement, sql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_sks_interaction.T);
                final SubLObject _values = Values.getValuesAsVector();
                inference_datastructures_inference.possibly_signal_sksi_query_end(inference_var, tactic_var);
                inference_datastructures_inference.possibly_increment_inference_sksi_query_total_time(inferences_var, Numbers.subtract(inference_datastructures_inference.inference_time_so_far(inference_var, (SubLObject)sksi_sks_interaction.NIL), start_time));
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 31244L)
    public static SubLObject sksi_execute_sqls_update(final SubLObject statement, final SubLObject sql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            final SubLObject start_time = Time.get_internal_real_time();
            SubLObject end_time = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
            result = sdbc.sqls_execute_update(statement, sql);
            end_time = Time.get_internal_real_time();
            sksi_infrastructure_macros.$sksi_sql_update_time$.setDynamicValue(Numbers.add(sksi_infrastructure_macros.$sksi_sql_update_time$.getDynamicValue(thread), numeric_date_utilities.elapsed_seconds_between_internal_real_times(start_time, end_time)), thread);
            sksi_infrastructure_macros.$sksi_sql_update_count$.setDynamicValue(Numbers.add(sksi_infrastructure_macros.$sksi_sql_update_count$.getDynamicValue(thread), (SubLObject)sksi_sks_interaction.ONE_INTEGER), thread);
            return result;
        }
        return sdbc.sqls_execute_update(statement, sql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 31747L)
    public static SubLObject sksi_execute_batch_sql_updates(final SubLObject statement) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            final SubLObject start_time = Time.get_internal_real_time();
            SubLObject end_time = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
            result = sdbc.sqls_execute_batch(statement);
            end_time = Time.get_internal_real_time();
            sksi_infrastructure_macros.$sksi_sql_update_time$.setDynamicValue(Numbers.add(sksi_infrastructure_macros.$sksi_sql_update_time$.getDynamicValue(thread), numeric_date_utilities.elapsed_seconds_between_internal_real_times(start_time, end_time)), thread);
            sksi_infrastructure_macros.$sksi_sql_batch_update_count$.setDynamicValue(Numbers.add(sksi_infrastructure_macros.$sksi_sql_batch_update_count$.getDynamicValue(thread), (SubLObject)sksi_sks_interaction.ONE_INTEGER), thread);
            return result;
        }
        return sdbc.sqls_execute_batch(statement);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 32282L)
    public static SubLObject sksi_add_batch_sql_update(final SubLObject sql, final SubLObject statement) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != sksi_infrastructure_macros.sksi_profiling_onP()) {
            sksi_infrastructure_macros.$sksi_sql_update_count$.setDynamicValue(Numbers.add(sksi_infrastructure_macros.$sksi_sql_update_count$.getDynamicValue(thread), (SubLObject)sksi_sks_interaction.ONE_INTEGER), thread);
        }
        return sdbc.sqls_add_batch(statement, sql);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 32449L)
    public static SubLObject sksi_execute_sql_query(final SubLObject sql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_interaction.NIL != Types.stringp(sql) : sql;
        assert sksi_sks_interaction.NIL != sksi_access_path.access_path_p(access_path) : access_path;
        thread.resetMultipleValues();
        final SubLObject connection = get_sql_connection_and_statement(access_path);
        final SubLObject statement = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return sksi_execute_sql_query_int(sql, connection, statement, access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 32951L)
    public static SubLObject sksi_execute_sql_query_int(final SubLObject sql, final SubLObject connection, final SubLObject statement, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(statement)) {
            if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.ONE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str88$Executing_SQL_____Source___S__), (SubLObject)sksi_sks_interaction.ONE_INTEGER, sksi_access_path.access_path_sks(access_path));
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.TWO_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str89$Module___S__), (SubLObject)sksi_sks_interaction.TWO_INTEGER, inference_worker.currently_executing_hl_module());
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.ONE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str90$Query____S__), (SubLObject)sksi_sks_interaction.ONE_INTEGER, sql);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            SubLObject success_var = (SubLObject)sksi_sks_interaction.NIL;
            try {
                result = sksi_execute_sqls_query(statement, sql);
                success_var = (SubLObject)sksi_sks_interaction.T;
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_sks_interaction.NIL == success_var) {
                        sksi_abort_and_release_sql_statement_and_connection(statement, connection);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.ONE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str91$Query_Result___S__), (SubLObject)sksi_sks_interaction.ONE_INTEGER, result);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            if (sksi_sks_interaction.NIL != sdbc.sql_result_set_p(result)) {
                cache_sql_connection_statement_for_result_set(result, connection, statement);
            }
            else {
                sksi_abort_and_release_sql_statement_and_connection(statement, connection);
                if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(result)) {
                    sksi_db_execution_error(access_path, result, sql);
                    result = (SubLObject)sksi_sks_interaction.NIL;
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 33986L)
    public static SubLObject sksi_abort_and_release_sql_statement_and_connection(final SubLObject statement, final SubLObject connection) {
        if (sksi_sks_interaction.NIL != within_sksi_sql_connection_resourcingP()) {
            sksi_abort_sql_statement_and_connection(statement, connection, (SubLObject)sksi_sks_interaction.NIL);
            release_sql_connection_and_statement(connection, statement);
        }
        else {
            sksi_abort_sql_statement_and_connection(statement, connection, (SubLObject)sksi_sks_interaction.T);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 34358L)
    public static SubLObject sksi_execute_sql_update(final SubLObject sql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_interaction.NIL != Types.stringp(sql) : sql;
        assert sksi_sks_interaction.NIL != sksi_access_path.access_path_p(access_path) : access_path;
        thread.resetMultipleValues();
        final SubLObject connection = get_sql_connection_and_statement(access_path);
        final SubLObject statement = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject result = sksi_execute_sql_update_int(sql, connection, statement, access_path);
        release_sql_connection_and_statement(connection, statement);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 34773L)
    public static SubLObject sksi_execute_sql_update_int(final SubLObject sql, final SubLObject connection, final SubLObject statement, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(statement)) {
            if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.ONE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str92$Executing_SQL_____Source___S____U), new SubLObject[] { sksi_sks_interaction.ONE_INTEGER, sksi_access_path.access_path_sks(access_path), sql });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            SubLObject success_var = (SubLObject)sksi_sks_interaction.NIL;
            try {
                result = sksi_execute_sqls_update(statement, sql);
                success_var = (SubLObject)sksi_sks_interaction.T;
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_sks_interaction.NIL == success_var) {
                        sksi_abort_sql_statement_and_connection(statement, connection, (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL == within_sksi_sql_connection_resourcingP()));
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.ONE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str93$SQL_Update_Result___S__), (SubLObject)sksi_sks_interaction.ONE_INTEGER, result);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(result)) {
                sksi_db_execution_error(access_path, result, sql);
                result = (SubLObject)sksi_sks_interaction.NIL;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 35400L)
    public static SubLObject sksi_batch_execute_sql_statements(final SubLObject sk_source, final SubLObject access_path, final SubLObject sql_statements, SubLObject get_auto_generated_keysP, SubLObject auto_key_fields) {
        if (get_auto_generated_keysP == sksi_sks_interaction.UNPROVIDED) {
            get_auto_generated_keysP = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (auto_key_fields == sksi_sks_interaction.UNPROVIDED) {
            auto_key_fields = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject auto_generated_keys = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != sql_statements) {
            if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.TWO_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str94$Batch_executing__s_SQL_statements), new SubLObject[] { sksi_sks_interaction.TWO_INTEGER, Sequences.length(sql_statements), sk_source });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            final SubLObject table_name = (SubLObject)((sksi_sks_interaction.NIL != get_auto_generated_keysP) ? sksi_kb_accessors.sk_source_name(sk_source) : sksi_sks_interaction.NIL);
            final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
            SubLObject error = (SubLObject)sksi_sks_interaction.NIL;
            final SubLObject db = sksi_access_path.access_path_db(access_path);
            final SubLObject user = sksi_access_path.access_path_user(access_path);
            final SubLObject password = sksi_access_path.access_path_password(access_path);
            final SubLObject server = sksi_access_path.access_path_server(access_path);
            final SubLObject port = sksi_access_path.access_path_port(access_path);
            final SubLObject proxy_server = sksi_access_path.access_path_proxy_server(access_path);
            final SubLObject proxy_port = sksi_access_path.access_path_proxy_port(access_path);
            final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
            final SubLObject timeout = sksi_access_path.access_path_timeout(access_path);
            final SubLObject conn_server = (sksi_sks_interaction.NIL != proxy_server) ? proxy_server : server;
            final SubLObject conn_port = (sksi_sks_interaction.NIL != proxy_port) ? proxy_port : port;
            final SubLObject conn_timeout = (sksi_sks_interaction.NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
            SubLObject statement = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject connection = (SubLObject)sksi_sks_interaction.NIL;
            try {
                connection = sdbc.new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw95$DBMS_SERVER, server, sksi_sks_interaction.$kw96$PORT, conn_port, sksi_sks_interaction.$kw97$SUBPROTOCOL, subprotocol, sksi_sks_interaction.$kw98$PROXY_SERVER, conn_server, sksi_sks_interaction.$kw99$TIMEOUT, conn_timeout }));
                if (sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                }
                else {
                    statement = connection;
                }
                if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(statement)) {
                    final SubLObject connection_$8 = sdbc.sqls_get_connection(statement);
                    final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$8);
                    SubLObject commit_error = (SubLObject)sksi_sks_interaction.NIL;
                    SubLObject rollback_result = (SubLObject)sksi_sks_interaction.NIL;
                    SubLObject auto_commit_result = (SubLObject)sksi_sks_interaction.NIL;
                    SubLObject errors = (SubLObject)sksi_sks_interaction.NIL;
                    if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(auto_commit)) {
                        errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                    }
                    else {
                        sdbc.sqlc_set_error_handling(connection_$8, (SubLObject)sksi_sks_interaction.$kw100$THROW);
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)sksi_sks_interaction.$sym101$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if (sksi_sks_interaction.NIL != auto_commit) {
                                        sdbc.sqlc_set_auto_commit(connection_$8, (SubLObject)sksi_sks_interaction.NIL);
                                    }
                                    SubLObject cdolist_list_var = sql_statements;
                                    SubLObject sql = (SubLObject)sksi_sks_interaction.NIL;
                                    sql = cdolist_list_var.first();
                                    while (sksi_sks_interaction.NIL != cdolist_list_var) {
                                        sksi_add_batch_sql_update(sql, statement);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        sql = cdolist_list_var.first();
                                    }
                                    if (sksi_sks_interaction.NIL != get_auto_generated_keysP) {
                                        final SubLObject pcase_var = sql_flavor;
                                        if (pcase_var.eql(sksi_sks_interaction.$const21$OracleDatabaseServer_TheProgram) || pcase_var.eql(sksi_sks_interaction.$const15$PostgreSQL)) {
                                            sdbc.sqls_execute_update(statement, Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str102$LOCK_TABLE_, new SubLObject[] { format_nil.format_nil_a_no_copy(table_name), sksi_sks_interaction.$str103$_IN_EXCLUSIVE_MODE }));
                                        }
                                        else if (pcase_var.eql(sksi_sks_interaction.$const16$MySQL_TheProgram)) {
                                            sdbc.sqls_execute_update(statement, Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str102$LOCK_TABLE_, new SubLObject[] { format_nil.format_nil_a_no_copy(table_name), sksi_sks_interaction.$str104$_WRITE }));
                                        }
                                    }
                                    result = sksi_execute_batch_sql_updates(statement);
                                    if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(result)) {
                                        sksi_db_execution_error(access_path, result, sdbc.sqls_sql(statement));
                                    }
                                    else if (sksi_sks_interaction.NIL != get_auto_generated_keysP) {
                                        auto_generated_keys = get_n_largest_auto_generated_keys(statement, table_name, auto_key_fields, conses_high.list_length(sql_statements), sql_flavor);
                                    }
                                    sdbc.sqlc_commit(connection_$8);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_interaction.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        sdbc.sqlc_set_error_handling(connection_$8, (SubLObject)sksi_sks_interaction.$kw105$RETURN);
                        if (sksi_sks_interaction.NIL != commit_error) {
                            errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                            rollback_result = sdbc.sqls_handle_rollback(connection_$8);
                            if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                            }
                        }
                        if (sksi_sks_interaction.NIL != auto_commit) {
                            auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$8, (SubLObject)sksi_sks_interaction.T);
                        }
                        if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                            errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                        }
                    }
                    if (sksi_sks_interaction.NIL != errors) {
                        error = sdbc.sqls_handle_transaction_errors(errors);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_sks_interaction.NIL != sdbc.sql_connection_p(connection)) {
                        sdbc.sqlc_close(connection);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(error)) {
                sksi_db_execution_error(access_path, error, (SubLObject)sksi_sks_interaction.NIL);
                result = error;
            }
            if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(result)) {
                if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.TWO_INTEGER)) {
                    PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str106$Batch_execution_resulted_in_error), (SubLObject)sksi_sks_interaction.TWO_INTEGER, sdbc.sdbc_error_message(result));
                    streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                }
            }
            else if (sksi_sks_interaction.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_sks_interaction.TWO_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str87$__SKSI__A_, (SubLObject)sksi_sks_interaction.$str107$Batch_execution_completed_success), (SubLObject)sksi_sks_interaction.TWO_INTEGER);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        return Values.values(result, auto_generated_keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 37347L)
    public static SubLObject get_n_largest_auto_generated_keys(final SubLObject statement, final SubLObject table_name, final SubLObject auto_key_fields, final SubLObject n, final SubLObject sql_flavor) {
        SubLObject auto_generated_keys = (SubLObject)sksi_sks_interaction.NIL;
        if (sql_flavor.eql(sksi_sks_interaction.$const15$PostgreSQL) || sql_flavor.eql(sksi_sks_interaction.$const16$MySQL_TheProgram)) {
            SubLObject cdolist_list_var = auto_key_fields;
            SubLObject auto_key_field = (SubLObject)sksi_sks_interaction.NIL;
            auto_key_field = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                final SubLObject sql = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str108$SELECT_, new SubLObject[] { format_nil.format_nil_a_no_copy(auto_key_field), sksi_sks_interaction.$str109$_FROM_, format_nil.format_nil_a_no_copy(table_name), sksi_sks_interaction.$str110$_ORDER_BY_, format_nil.format_nil_a_no_copy(auto_key_field), sksi_sks_interaction.$str111$_DESC_LIMIT_, format_nil.format_nil_d_no_copy(n) });
                SubLObject field_auto_keys = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
                result = sdbc.sqls_execute_query(statement, sql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                if (sksi_sks_interaction.NIL != sdbc.sql_result_set_p(result)) {
                    while (sksi_sks_interaction.NIL != sdbc.sqlrs_next(result)) {
                        field_auto_keys = (SubLObject)ConsesLow.cons(sdbc.sqlrs_get_object(result, (SubLObject)sksi_sks_interaction.ONE_INTEGER), field_auto_keys);
                    }
                }
                auto_generated_keys = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(auto_key_field, field_auto_keys), auto_generated_keys);
                cdolist_list_var = cdolist_list_var.rest();
                auto_key_field = cdolist_list_var.first();
            }
        }
        else if (sql_flavor.eql(sksi_sks_interaction.$const21$OracleDatabaseServer_TheProgram)) {
            SubLObject cdolist_list_var = auto_key_fields;
            SubLObject auto_key_field = (SubLObject)sksi_sks_interaction.NIL;
            auto_key_field = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                final SubLObject sql = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str112$SELECT___FROM__SELECT_, new SubLObject[] { format_nil.format_nil_a_no_copy(auto_key_field), sksi_sks_interaction.$str109$_FROM_, format_nil.format_nil_a_no_copy(table_name), sksi_sks_interaction.$str110$_ORDER_BY_, format_nil.format_nil_a_no_copy(auto_key_field), sksi_sks_interaction.$str113$_DESC__WHERE_rownum_BETWEEN_, format_nil.format_nil_d_no_copy((SubLObject)sksi_sks_interaction.ONE_INTEGER), sksi_sks_interaction.$str114$_AND_, format_nil.format_nil_d_no_copy(n) });
                SubLObject field_auto_keys = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
                result = sdbc.sqls_execute_query(statement, sql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                if (sksi_sks_interaction.NIL != sdbc.sql_result_set_p(result)) {
                    while (sksi_sks_interaction.NIL != sdbc.sqlrs_next(result)) {
                        field_auto_keys = (SubLObject)ConsesLow.cons(sdbc.sqlrs_get_object(result, (SubLObject)sksi_sks_interaction.ONE_INTEGER), field_auto_keys);
                    }
                }
                auto_generated_keys = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(auto_key_field, field_auto_keys), auto_generated_keys);
                cdolist_list_var = cdolist_list_var.rest();
                auto_key_field = cdolist_list_var.first();
            }
        }
        else {
            Errors.error((SubLObject)sksi_sks_interaction.$str115$Auto_generated_key_retrieval_is_n, sql_flavor);
        }
        return Sequences.nreverse(auto_generated_keys);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 39174L)
    public static SubLObject sksi_execute_sql_script_from_file(final SubLObject filename, final SubLObject sk_source) {
        final SubLObject file_string = file_utilities.slurp_file(filename);
        final SubLObject script = (SubLObject)((sksi_sks_interaction.NIL != string_utilities.non_empty_string_p(file_string)) ? string_utilities.string_tokenize(file_string, (SubLObject)sksi_sks_interaction.$list117, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.T, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED) : sksi_sks_interaction.NIL);
        return sksi_execute_sql_script(script, sk_source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 39591L)
    public static SubLObject sksi_execute_sql_script(final SubLObject script, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        SubLObject error = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject db = sksi_access_path.access_path_db(access_path);
        final SubLObject user = sksi_access_path.access_path_user(access_path);
        final SubLObject password = sksi_access_path.access_path_password(access_path);
        final SubLObject server = sksi_access_path.access_path_server(access_path);
        final SubLObject port = sksi_access_path.access_path_port(access_path);
        final SubLObject proxy_server = sksi_access_path.access_path_proxy_server(access_path);
        final SubLObject proxy_port = sksi_access_path.access_path_proxy_port(access_path);
        final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
        final SubLObject timeout = sksi_access_path.access_path_timeout(access_path);
        final SubLObject conn_server = (sksi_sks_interaction.NIL != proxy_server) ? proxy_server : server;
        final SubLObject conn_port = (sksi_sks_interaction.NIL != proxy_port) ? proxy_port : port;
        final SubLObject conn_timeout = (sksi_sks_interaction.NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
        SubLObject statement = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject connection = (SubLObject)sksi_sks_interaction.NIL;
        try {
            connection = sdbc.new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw95$DBMS_SERVER, server, sksi_sks_interaction.$kw96$PORT, conn_port, sksi_sks_interaction.$kw97$SUBPROTOCOL, subprotocol, sksi_sks_interaction.$kw98$PROXY_SERVER, conn_server, sksi_sks_interaction.$kw99$TIMEOUT, conn_timeout }));
            if (sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(statement)) {
                final SubLObject connection_$9 = sdbc.sqls_get_connection(statement);
                final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$9);
                SubLObject commit_error = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject rollback_result = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject auto_commit_result = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject errors = (SubLObject)sksi_sks_interaction.NIL;
                if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(auto_commit)) {
                    errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                }
                else {
                    sdbc.sqlc_set_error_handling(connection_$9, (SubLObject)sksi_sks_interaction.$kw100$THROW);
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)sksi_sks_interaction.$sym101$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (sksi_sks_interaction.NIL != auto_commit) {
                                    sdbc.sqlc_set_auto_commit(connection_$9, (SubLObject)sksi_sks_interaction.NIL);
                                }
                                SubLObject cdolist_list_var = script;
                                SubLObject sql = (SubLObject)sksi_sks_interaction.NIL;
                                sql = cdolist_list_var.first();
                                while (sksi_sks_interaction.NIL != cdolist_list_var) {
                                    sql = string_utilities.left_trim_whitespace(sql);
                                    if (sksi_sks_interaction.NIL == string_utilities.empty_string_p(sql)) {
                                        if (sksi_sks_interaction.NIL != string_utilities.starts_with_by_test(sql, (SubLObject)sksi_sks_interaction.$str119$SELECT, Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUALP))) {
                                            final SubLObject result_set = sdbc.sqls_execute_query(statement, sql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                                            if (sksi_sks_interaction.NIL != sdbc.sql_open_result_set_p(result_set)) {
                                                sdbc.sqlrs_close(result_set);
                                            }
                                        }
                                        else {
                                            sdbc.sqls_execute_update(statement, sql);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sql = cdolist_list_var.first();
                                }
                                sdbc.sqlc_commit(connection_$9);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_interaction.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        commit_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    sdbc.sqlc_set_error_handling(connection_$9, (SubLObject)sksi_sks_interaction.$kw105$RETURN);
                    if (sksi_sks_interaction.NIL != commit_error) {
                        errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                        rollback_result = sdbc.sqls_handle_rollback(connection_$9);
                        if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(rollback_result)) {
                            errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                        }
                    }
                    if (sksi_sks_interaction.NIL != auto_commit) {
                        auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$9, (SubLObject)sksi_sks_interaction.T);
                    }
                    if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                        errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                    }
                }
                if (sksi_sks_interaction.NIL != errors) {
                    error = sdbc.sqls_handle_transaction_errors(errors);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (sksi_sks_interaction.NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (sksi_sks_interaction.NIL != error) {
            sdbc.sdbc_error_warn(error);
        }
        return Types.sublisp_null(error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 40841L)
    public static SubLObject open_sql_source(final SubLObject access_path, SubLObject max_tries, SubLObject interval) {
        if (max_tries == sksi_sks_interaction.UNPROVIDED) {
            max_tries = sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.getDynamicValue();
        }
        if (interval == sksi_sks_interaction.UNPROVIDED) {
            interval = sksi_sks_interaction.$sksi_open_sql_source_default_interval$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject db = sksi_access_path.access_path_db(access_path);
        final SubLObject user = sksi_access_path.access_path_user(access_path);
        final SubLObject password = sksi_access_path.access_path_password(access_path);
        final SubLObject server = sksi_access_path.access_path_server(access_path);
        final SubLObject port = sksi_access_path.access_path_port(access_path);
        SubLObject proxy_server = sksi_access_path.access_path_proxy_server(access_path);
        SubLObject proxy_port = sksi_access_path.access_path_proxy_port(access_path);
        final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
        final SubLObject timeout = sksi_access_path.access_path_timeout(access_path);
        final SubLObject conn_timeout = (sksi_sks_interaction.NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
        if (sksi_sks_interaction.NIL == proxy_port) {
            proxy_port = sdbc.$sql_port$.getGlobalValue();
        }
        if (sksi_sks_interaction.NIL == proxy_server) {
            proxy_server = server;
        }
        final SubLObject plist = (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw95$DBMS_SERVER, server, sksi_sks_interaction.$kw121$DBMS_PORT, port, sksi_sks_interaction.$kw97$SUBPROTOCOL, subprotocol, sksi_sks_interaction.$kw98$PROXY_SERVER, proxy_server, sksi_sks_interaction.$kw96$PORT, proxy_port, sksi_sks_interaction.$kw99$TIMEOUT, conn_timeout });
        SubLObject result = sdbc.new_sql_connection(db, user, password, plist);
        if (sksi_sks_interaction.NIL == sdbc.sql_open_connection_p(result)) {
            if (sksi_sks_interaction.NIL != number_utilities.positive_number_p(interval)) {
                SubLObject v_tries;
                for (v_tries = (SubLObject)sksi_sks_interaction.NIL, v_tries = (SubLObject)sksi_sks_interaction.ONE_INTEGER; sksi_sks_interaction.NIL == sdbc.sql_open_connection_p(result) && !v_tries.numGE(max_tries); result = sdbc.new_sql_connection(db, user, password, plist), v_tries = Numbers.add(v_tries, (SubLObject)sksi_sks_interaction.ONE_INTEGER)) {
                    Threads.sleep(interval);
                }
            }
            else {
                SubLObject v_tries;
                for (v_tries = (SubLObject)sksi_sks_interaction.NIL, v_tries = (SubLObject)sksi_sks_interaction.ONE_INTEGER; sksi_sks_interaction.NIL == sdbc.sql_open_connection_p(result) && !v_tries.numGE(max_tries); result = sdbc.new_sql_connection(db, user, password, plist), v_tries = Numbers.add(v_tries, (SubLObject)sksi_sks_interaction.ONE_INTEGER)) {}
            }
        }
        if (sksi_sks_interaction.NIL != sdbc.sdbc_error_p(result)) {
            result = sksi_unreachable_db_sks_error(access_path, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 42947L)
    public static SubLObject sksi_open_sql_connection_and_statement(final SubLObject access_path) {
        final SubLObject connection = open_sql_source(access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        final SubLObject statement = (SubLObject)((sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection)) ? sdbc.sqlc_create_statement(connection) : sksi_sks_interaction.NIL);
        return Values.values(connection, statement);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 43216L)
    public static SubLObject sksi_abort_sql_statement_and_connection(final SubLObject statement, final SubLObject connection, SubLObject close_statement_connectionP) {
        if (close_statement_connectionP == sksi_sks_interaction.UNPROVIDED) {
            close_statement_connectionP = (SubLObject)sksi_sks_interaction.T;
        }
        try {
            sksi_abort_sql_statement(statement);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_sks_interaction.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (sksi_sks_interaction.NIL != close_statement_connectionP) {
                    sksi_close_sql_statement_and_connection(statement, connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 43525L)
    public static SubLObject sksi_abort_sql_statement(final SubLObject statement) {
        if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(statement)) {
            sdbc.sqls_cancel(statement);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 43665L)
    public static SubLObject sksi_close_sql_statement_and_connection(final SubLObject statement, final SubLObject connection) {
        try {
            if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(statement)) {
                sdbc.sqls_close(statement);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_sks_interaction.T);
                final SubLObject _values = Values.getValuesAsVector();
                sksi_close_sql_connection(connection);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 43894L)
    public static SubLObject sksi_close_sql_connection(final SubLObject connection) {
        return (SubLObject)((sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection)) ? sdbc.sqlc_close(connection) : sksi_sks_interaction.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 44028L)
    public static SubLObject get_result_iterator_from_fht_source(final SubLObject csql, final SubLObject access_path) {
        final SubLObject fht = open_fht_source(access_path);
        final SubLObject pcase_var;
        final SubLObject selected_field_type = pcase_var = get_selected_field_type_from_csql(csql);
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw122$ALL)) {
            return sksi_result_set_iterators.new_sksi_file_hash_table_iterator(fht);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw123$KEY_FIRST)) {
            return sksi_result_set_iterators.new_sksi_file_hash_table_iterator(fht);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw124$KEY_VALUE_FIRST)) {
            return sksi_result_set_iterators.new_sksi_reverse_file_hash_table_iterator(fht);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw125$KEY)) {
            return sksi_result_set_iterators.new_sksi_file_hash_table_keys_iterator(fht);
        }
        if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw126$KEY_VALUE)) {
            return sksi_result_set_iterators.new_sksi_file_hash_table_values_iterator(fht);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 44644L)
    public static SubLObject get_selected_field_type_from_csql(final SubLObject csql) {
        final SubLObject fields = conses_high.second(csql);
        if (fields.equal((SubLObject)sksi_sks_interaction.$list127)) {
            return (SubLObject)sksi_sks_interaction.$kw122$ALL;
        }
        if (sksi_sks_interaction.NIL != list_utilities.tree_find((SubLObject)sksi_sks_interaction.$kw125$KEY, fields, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED) && sksi_sks_interaction.NIL != list_utilities.tree_find((SubLObject)sksi_sks_interaction.$kw126$KEY_VALUE, fields, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED)) {
            if (Sequences.position((SubLObject)sksi_sks_interaction.$kw125$KEY, fields, Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), Symbols.symbol_function((SubLObject)sksi_sks_interaction.$sym128$CAR), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED).numL(Sequences.position((SubLObject)sksi_sks_interaction.$kw126$KEY_VALUE, fields, Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), Symbols.symbol_function((SubLObject)sksi_sks_interaction.$sym128$CAR), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED))) {
                return (SubLObject)sksi_sks_interaction.$kw123$KEY_FIRST;
            }
            return (SubLObject)sksi_sks_interaction.$kw124$KEY_VALUE_FIRST;
        }
        else {
            if (sksi_sks_interaction.NIL != list_utilities.tree_find((SubLObject)sksi_sks_interaction.$kw125$KEY, fields, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED)) {
                return (SubLObject)sksi_sks_interaction.$kw125$KEY;
            }
            if (sksi_sks_interaction.NIL != list_utilities.tree_find((SubLObject)sksi_sks_interaction.$kw126$KEY_VALUE, fields, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED)) {
                return (SubLObject)sksi_sks_interaction.$kw126$KEY_VALUE;
            }
            return (SubLObject)sksi_sks_interaction.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 45101L)
    public static SubLObject get_result_for_key_from_fht_source(final SubLObject key, final SubLObject access_path) {
        final SubLObject fht = open_fht_source(access_path);
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != file_hash_table.file_hash_table_p(fht)) {
            try {
                result = file_hash_table.get_file_hash_table(key, fht, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_sks_interaction.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    finalize_fht_source(fht);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return result;
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 45485L)
    public static SubLObject get_result_for_key_value_from_fht_source(final SubLObject key_value, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = open_fht_source(access_path);
        final SubLObject value_test_fn = sksi_access_path.access_path_value_test_function(access_path);
        SubLObject v_answer = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != file_hash_table.file_hash_table_p(fht)) {
            try {
                SubLObject continuation = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject next;
                for (SubLObject completeP = (SubLObject)sksi_sks_interaction.NIL; sksi_sks_interaction.NIL == completeP; completeP = Types.sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = file_hash_table.get_file_hash_table_any(fht, continuation, (SubLObject)sksi_sks_interaction.NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_sks_interaction.NIL != next) {
                        final SubLObject key = the_key;
                        final SubLObject value = the_value;
                        if (sksi_sks_interaction.NIL != Functions.funcall(value_test_fn, value, key_value)) {
                            v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key), v_answer);
                        }
                    }
                    continuation = next;
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    finalize_fht_source(fht);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return v_answer;
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 46149L)
    public static SubLObject put_key_value_under_key_in_fht_source(final SubLObject key, final SubLObject key_value, final SubLObject access_path) {
        final SubLObject fht = open_fht_source(access_path);
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != file_hash_table.file_hash_table_p(fht)) {
            try {
                result = file_hash_table.put_file_hash_table(key, fht, key_value);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_sks_interaction.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    finalize_fht_source(fht);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return result;
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 46580L)
    public static SubLObject remove_key_value_under_key_in_fht_source(final SubLObject key, final SubLObject key_value, final SubLObject access_path) {
        final SubLObject fht = open_fht_source(access_path);
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != file_hash_table.file_hash_table_p(fht)) {
            try {
                final SubLObject actual_value = file_hash_table.get_file_hash_table(key, fht, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                final SubLObject test_fn = sksi_access_path.access_path_value_test_function(access_path);
                if (sksi_sks_interaction.NIL != Functions.funcall(test_fn, actual_value, key_value)) {
                    result = file_hash_table.remove_file_hash_table(key, fht);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_sks_interaction.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    finalize_fht_source(fht);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return result;
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 47387L)
    public static SubLObject create_fht_source(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = sksi_access_path.access_path_filename(access_path);
        final SubLObject test_fn = sksi_access_path.access_path_key_test_function(access_path);
        final SubLObject serialization = sksi_access_path.access_path_serialization_type(access_path);
        if (sksi_sks_interaction.NIL != filename && sksi_sks_interaction.NIL != Filesys.probe_file(filename)) {
            return sksi_create_fht_sks_error(access_path, (SubLObject)sksi_sks_interaction.$str131$The_file_already_exists_);
        }
        SubLObject fht = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject error_message = (SubLObject)sksi_sks_interaction.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_sks_interaction.$sym101$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    fht = file_hash_table.create_file_hash_table(filename, sksi_sks_interaction.$sksi_fht_source_default_size$.getGlobalValue(), sksi_sks_interaction.$sksi_fht_source_default_average_bucket_size$.getGlobalValue(), test_fn, serialization);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_interaction.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_sks_interaction.NIL != error_message) {
            return sksi_create_fht_sks_error(access_path, error_message);
        }
        return file_hash_table.finalize_file_hash_table(fht);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 48109L)
    public static SubLObject open_fht_source(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = sksi_access_path.access_path_filename(access_path);
        final SubLObject test_fn = sksi_access_path.access_path_key_test_function(access_path);
        final SubLObject serialization = sksi_access_path.access_path_serialization_type(access_path);
        if (sksi_sks_interaction.NIL == filename || sksi_sks_interaction.NIL == Filesys.probe_file(filename)) {
            return sksi_unreachable_fht_sks_error(access_path, (SubLObject)sksi_sks_interaction.NIL);
        }
        SubLObject fht = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject error_message = (SubLObject)sksi_sks_interaction.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_sks_interaction.$sym101$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    fht = file_hash_table.open_file_hash_table(filename, test_fn, serialization);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_interaction.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_sks_interaction.NIL != error_message) {
            return sksi_unreachable_fht_sks_error(access_path, error_message);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 48715L)
    public static SubLObject finalize_fht_source(final SubLObject fht) {
        return file_hash_table.finalize_file_hash_table(fht);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 49443L)
    public static SubLObject cache_sql_connection_statement_for_result_set(final SubLObject result_set, final SubLObject connection, final SubLObject statement) {
        return dictionary_utilities.synchronized_dictionary_enter(sksi_sks_interaction.$result_set_sql_connection_statement_cache$.getGlobalValue(), result_set, (SubLObject)ConsesLow.list(connection, statement));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 49671L)
    public static SubLObject uncache_sql_connection_statement_for_result_set(final SubLObject result_set) {
        return dictionary_utilities.synchronized_dictionary_remove(sksi_sks_interaction.$result_set_sql_connection_statement_cache$.getGlobalValue(), result_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 49854L)
    public static SubLObject get_sql_connection_statement_for_result_set(final SubLObject result_set) {
        return dictionary_utilities.synchronized_dictionary_lookup_without_values(sksi_sks_interaction.$result_set_sql_connection_statement_cache$.getGlobalValue(), result_set, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50048L)
    public static SubLObject clear_cached_get_result_set_from_sql_source() {
        final SubLObject cs = sksi_sks_interaction.$cached_get_result_set_from_sql_source_caching_state$.getGlobalValue();
        if (sksi_sks_interaction.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50048L)
    public static SubLObject remove_cached_get_result_set_from_sql_source(final SubLObject sql, final SubLObject access_path) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_sks_interaction.$cached_get_result_set_from_sql_source_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sql, access_path), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50048L)
    public static SubLObject cached_get_result_set_from_sql_source_internal(final SubLObject sql, final SubLObject access_path) {
        return get_result_set_from_sql_source(sql, access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50048L)
    public static SubLObject cached_get_result_set_from_sql_source(final SubLObject sql, final SubLObject access_path) {
        SubLObject caching_state = sksi_sks_interaction.$cached_get_result_set_from_sql_source_caching_state$.getGlobalValue();
        if (sksi_sks_interaction.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_sks_interaction.$sym133$CACHED_GET_RESULT_SET_FROM_SQL_SOURCE, (SubLObject)sksi_sks_interaction.$sym134$_CACHED_GET_RESULT_SET_FROM_SQL_SOURCE_CACHING_STATE_, (SubLObject)sksi_sks_interaction.$int135$500, (SubLObject)sksi_sks_interaction.EQUAL, (SubLObject)sksi_sks_interaction.TWO_INTEGER, (SubLObject)sksi_sks_interaction.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sql, access_path);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_sks_interaction.NIL;
            collision = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sql.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_sks_interaction.NIL != cached_args && sksi_sks_interaction.NIL == cached_args.rest() && access_path.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_get_result_set_from_sql_source_internal(sql, access_path)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sql, access_path));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 50316L)
    public static SubLObject get_result_set_from_sql_source(final SubLObject sql, final SubLObject access_path) {
        return sksi_execute_sql_query(sql, access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 51455L)
    public static SubLObject get_result_set_from_sparql_source(final SubLObject sparql, final SubLObject access_path, SubLObject params, SubLObject extract_rdf_literalsP) {
        if (params == sksi_sks_interaction.UNPROVIDED) {
            params = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (extract_rdf_literalsP == sksi_sks_interaction.UNPROVIDED) {
            extract_rdf_literalsP = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread)) {
            PrintLow.format(kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread), (SubLObject)sksi_sks_interaction.$str69$___A____, sparql);
        }
        if (sksi_sks_interaction.NIL != sksi_sks_interaction.$sparql_evaluation_enabledP$.getDynamicValue(thread) && sksi_sks_interaction.NIL != sksi_result_set_iterators.$sksi_caching_enabledP$.getDynamicValue(thread)) {
            return cached_get_result_set_from_sparql_source(sparql, access_path, params, extract_rdf_literalsP);
        }
        return get_result_set_from_sparql_source_guts(sparql, access_path, params, extract_rdf_literalsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 52236L)
    public static SubLObject get_result_set_from_sparql_source_guts(SubLObject sparql, final SubLObject access_path, SubLObject params, final SubLObject extract_rdf_literalsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_interaction.NIL != Types.stringp(sparql) : sparql;
        assert sksi_sks_interaction.NIL != dictionary.dictionary_p(access_path) : access_path;
        assert sksi_sks_interaction.NIL != list_utilities.alist_p(params) : params;
        final SubLObject variable_names = sparql_extract_variable_names(sparql);
        final SubLObject prefix_map = sksi_access_path.access_path_rdf_prefix_map(access_path);
        final SubLObject booleanP = sparql_extract_booleanP(sparql);
        SubLObject result_set = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != sksi_sks_interaction.$query_interrupt_on_sparql_execution$.getDynamicValue(thread)) {
            inference_strategist.query_interrupt((SubLObject)sksi_sks_interaction.TEN_INTEGER);
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLObject inferences = inference_macros.current_controlling_inferences();
        final SubLObject inference = list_utilities.last_one(inferences);
        SubLObject start = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject end = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject count = (SubLObject)sksi_sks_interaction.NIL;
        try {
            start = (SubLObject)((sksi_sks_interaction.NIL != inference) ? inference_datastructures_inference.inference_cumulative_time_so_far(inference, (SubLObject)sksi_sks_interaction.NIL) : sksi_sks_interaction.NIL);
            SubLObject sparql_ticket = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject xml_stream = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject completedP = (SubLObject)sksi_sks_interaction.NIL;
            try {
                final SubLObject inferences_var = inference_macros.current_controlling_inferences();
                final SubLObject inference_var = inference_macros.current_controlling_inference();
                final SubLObject tactic_var = inference_worker.currently_executing_tactic();
                SubLObject start_time = (SubLObject)sksi_sks_interaction.NIL;
                try {
                    inference_datastructures_inference.possibly_signal_sksi_query_start(inference_var, tactic_var);
                    start_time = inference_datastructures_inference.inference_time_so_far(inference_var, (SubLObject)sksi_sks_interaction.NIL);
                    inference_datastructures_inference.possibly_add_inference_sksi_query_start_time(inferences_var, start_time);
                    if (sksi_sks_interaction.NIL == sksi_sks_interaction.$sparql_evaluation_enabledP$.getDynamicValue(thread)) {
                        sksi_query_utilities.sksi_suspend_cost_recording_for_current_iterator();
                    }
                    else {
                        sparql_ticket = sparql_request_query_ticket(access_path);
                        if (sksi_sks_interaction.NIL != sparql_ticket) {
                            params = list_utilities.alist_enter(params, (SubLObject)sksi_sks_interaction.$str139$ticket, sparql_ticket, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                        }
                        sparql = preprocess_sparql_for_backend(sparql, sparql_ticket, access_path);
                        inference_possibly_note_salient_sksi_query_string(sparql);
                        xml_stream = open_sparql_query_result_stream(sparql, access_path, params);
                        stream_wait_until_read_char(xml_stream);
                        result_set = sparql_result_stream.batch_process_sparql_result_stream(xml_stream, variable_names, prefix_map, booleanP, extract_rdf_literalsP);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        inference_datastructures_inference.possibly_signal_sksi_query_end(inference_var, tactic_var);
                        inference_datastructures_inference.possibly_increment_inference_sksi_query_total_time(inferences_var, Numbers.subtract(inference_datastructures_inference.inference_time_so_far(inference_var, (SubLObject)sksi_sks_interaction.NIL), start_time));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                completedP = (SubLObject)sksi_sks_interaction.T;
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (sksi_sks_interaction.NIL != xml_stream) {
                        close_sparql_result_stream(xml_stream);
                        if (sksi_sks_interaction.NIL == completedP && sksi_sks_interaction.NIL != sparql_ticket) {
                            sparql_abort_query(sparql_ticket, access_path);
                        }
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                end = (SubLObject)((sksi_sks_interaction.NIL != inference) ? inference_datastructures_inference.inference_cumulative_time_so_far(inference, (SubLObject)sksi_sks_interaction.NIL) : sksi_sks_interaction.NIL);
                count = Sequences.length(result_set);
                inference_datastructures_inference.possibly_add_inference_sparql_query_profile(inferences, start, end, count);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return result_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 54490L)
    public static SubLObject sparql_oracle_subprotocolP(final SubLObject subprotocol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(subprotocol.equal(sksi_sks_interaction.$sparql_oracle_joseki_subprotocol$.getGlobalValue()) || subprotocol.equal(sksi_sks_interaction.$sparql_oracle_sesame_subprotocol$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 54680L)
    public static SubLObject sparql_request_query_ticket(final SubLObject access_path) {
        final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
        SubLObject sparql_ticket = (SubLObject)sksi_sks_interaction.NIL;
        if (subprotocol.equal(sksi_sks_interaction.$sparql_oracle_joseki_subprotocol$.getGlobalValue())) {
            sparql_ticket = sparql_oracle_joseki_request_query_ticket(access_path);
        }
        else if (subprotocol.equal(sksi_sks_interaction.$sparql_oracle_sesame_subprotocol$.getGlobalValue())) {
            sparql_ticket = sparql_oracle_sesame_request_query_ticket(access_path);
        }
        else if (subprotocol.equal(sksi_sks_interaction.$sparql_triclops_subprotocol$.getGlobalValue())) {
            sparql_ticket = sparql_triclops_request_query_ticket(access_path);
        }
        return sparql_ticket;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 55413L)
    public static SubLObject sparql_triclops_request_query_ticket(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine = sksi_access_path.access_path_server(access_path);
        final SubLObject port = sksi_access_path.access_path_port(access_path);
        final SubLObject url = (SubLObject)sksi_sks_interaction.$str143$_ticket;
        final SubLObject query = (SubLObject)sksi_sks_interaction.$str144$type_id;
        final SubLObject method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        final SubLObject keep_aliveP = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject wide_newlinesP = sksi_sks_interaction.$sksi_sparql_request_wide_newlines$.getDynamicValue(thread);
        final SubLObject open_connection_timeout = sksi_sks_interaction.$sksi_sparql_request_open_connection_timeout$.getDynamicValue(thread);
        final SubLObject overall_timeout = (SubLObject)sksi_sks_interaction.TEN_INTEGER;
        thread.resetMultipleValues();
        final SubLObject tokens = xml_parsing_utilities.xml_tokenized_http_request(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, overall_timeout, (SubLObject)sksi_sks_interaction.T, (SubLObject)sksi_sks_interaction.$list145);
        final SubLObject errorP = thread.secondMultipleValue();
        final SubLObject error_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject sparql_ticket = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL == errorP && sksi_sks_interaction.NIL != tokens) {
            SubLObject message_var = (SubLObject)sksi_sks_interaction.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)sksi_sks_interaction.$sym146$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)sksi_sks_interaction.$list147);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)sksi_sks_interaction.$sym101$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject token = list_utilities.last_one(tokens);
                            final SubLObject parsed = string_utilities.split_string(token, (SubLObject)ConsesLow.list(Characters.code_char((SubLObject)sksi_sks_interaction.THIRTEEN_INTEGER)));
                            final SubLObject candidate = string_utilities.trim_whitespace(list_utilities.last_one(parsed));
                            if (sksi_sks_interaction.NIL != Guids.guid_string_p(candidate)) {
                                sparql_ticket = candidate;
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_interaction.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym78$CSETQ, (SubLObject)sksi_sks_interaction.$sym146$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)sksi_sks_interaction.$str148$_A, message_var);
            }
        }
        return sparql_ticket;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 56407L)
    public static SubLObject sparql_oracle_joseki_request_query_ticket(SubLObject access_path) {
        if (access_path == sksi_sks_interaction.UNPROVIDED) {
            access_path = (SubLObject)sksi_sks_interaction.NIL;
        }
        return Sxhash.sxhash(Guids.new_guid());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 56542L)
    public static SubLObject sparql_oracle_sesame_request_query_ticket(SubLObject access_path) {
        if (access_path == sksi_sks_interaction.UNPROVIDED) {
            access_path = (SubLObject)sksi_sks_interaction.NIL;
        }
        return sparql_oracle_joseki_request_query_ticket(access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 56746L)
    public static SubLObject preprocess_sparql_for_backend(SubLObject sparql, final SubLObject sparql_ticket, SubLObject access_path) {
        if (access_path == sksi_sks_interaction.UNPROVIDED) {
            access_path = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL != sparql_ticket) {
            final SubLObject protocol = sksi_access_path.access_path_subprotocol(access_path);
            if (protocol.equal(sksi_sks_interaction.$sparql_oracle_joseki_subprotocol$.getGlobalValue()) || protocol.equal(sksi_sks_interaction.$sparql_oracle_sesame_subprotocol$.getGlobalValue())) {
                final SubLObject select_start = Sequences.search((SubLObject)sksi_sks_interaction.$str119$SELECT, sparql, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                if (sksi_sks_interaction.NIL != select_start) {
                    final SubLObject pre_select = string_utilities.substring(sparql, (SubLObject)sksi_sks_interaction.ZERO_INTEGER, select_start);
                    final SubLObject select_remainder = string_utilities.substring(sparql, select_start, (SubLObject)sksi_sks_interaction.NIL);
                    final SubLObject prefix_pragma = compute_sparql_oracle_prefix_pragma(sparql_ticket);
                    final SubLObject processed_sparql = sparql = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(pre_select), new SubLObject[] { format_nil.format_nil_a_no_copy(prefix_pragma), format_nil.format_nil_a_no_copy(select_remainder) });
                }
            }
        }
        return sparql;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 58032L)
    public static SubLObject compute_sparql_oracle_prefix_pragma(final SubLObject sparql_ticket) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject prefix_pragma = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject stream = (SubLObject)sksi_sks_interaction.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject prefix = (SubLObject)sksi_sks_interaction.$str151$ORACLE_SEM_FS_NS;
            final SubLObject timeout = compute_sparql_oracle_query_timeout();
            final SubLObject parallelism = sksi_sks_interaction.$sparql_oracle_default_server_parallelism$.getDynamicValue(thread);
            final SubLObject timeout_pragma = (SubLObject)((sksi_sks_interaction.NIL != timeout) ? Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str152$_timeout_, format_nil.format_nil_a_no_copy(timeout)) : sksi_sks_interaction.$str153$);
            final SubLObject dop = (SubLObject)(parallelism.numG((SubLObject)sksi_sks_interaction.ONE_INTEGER) ? Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str154$_dop_, format_nil.format_nil_a_no_copy(parallelism)) : sksi_sks_interaction.$str153$);
            final SubLObject prefix_uri = PrintLow.format((SubLObject)sksi_sks_interaction.NIL, sksi_sks_interaction.$sparql_oracle_fs_prefix_pragma_template$.getGlobalValue(), new SubLObject[] { sparql_ticket, timeout_pragma, dop });
            sksi_csql_sparql_interpretation.sparql_write_prefix_uri_pair(prefix, prefix_uri, stream);
            prefix = (SubLObject)sksi_sks_interaction.$str155$ORACLE_SEM_HT_NS;
            final SubLObject prefix_uri2 = PrintLow.format((SubLObject)sksi_sks_interaction.NIL, sksi_sks_interaction.$sparql_oracle_ht_prefix_pragma_template$.getGlobalValue());
            sksi_csql_sparql_interpretation.sparql_write_prefix_uri_pair(prefix, prefix_uri2, stream);
            prefix_pragma = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return prefix_pragma;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 58968L)
    public static SubLObject compute_sparql_oracle_query_timeout() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != sksi_sks_interaction.$sparql_oracle_timeout$.getDynamicValue(thread)) {
            final SubLObject inference = inference_macros.current_controlling_inference();
            if (sksi_sks_interaction.NIL != inference) {
                final SubLObject max_time = inference_datastructures_inference.inference_max_time(inference);
                if (max_time.isNumber()) {
                    return Numbers.ceiling(Numbers.min(max_time, sksi_sks_interaction.$sparql_oracle_timeout$.getDynamicValue(thread)), (SubLObject)sksi_sks_interaction.UNPROVIDED);
                }
            }
            return Numbers.ceiling(sksi_sks_interaction.$sparql_oracle_timeout$.getDynamicValue(thread), (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 59326L)
    public static SubLObject close_sparql_result_stream(final SubLObject stream) {
        return streams_high.close(stream, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 59429L)
    public static SubLObject sparql_abort_query(final SubLObject sparql_ticket, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine = sksi_access_path.access_path_server(access_path);
        final SubLObject port = sksi_access_path.access_path_port(access_path);
        final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
        SubLObject url = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject query = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject method = (SubLObject)sksi_sks_interaction.NIL;
        if (subprotocol.equal(sksi_sks_interaction.$sparql_oracle_joseki_subprotocol$.getGlobalValue())) {
            url = (SubLObject)sksi_sks_interaction.$str156$_joseki_querymgt;
            query = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str157$abortqid_, format_nil.format_nil_a_no_copy(sparql_ticket));
            method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        }
        else if (subprotocol.equal(sksi_sks_interaction.$sparql_oracle_sesame_subprotocol$.getGlobalValue())) {
            url = (SubLObject)sksi_sks_interaction.$str158$_openrdf_sesame_querymgt;
            query = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str157$abortqid_, format_nil.format_nil_a_no_copy(sparql_ticket));
            method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        }
        else {
            if (!subprotocol.equal(sksi_sks_interaction.$sparql_triclops_subprotocol$.getGlobalValue())) {
                return (SubLObject)sksi_sks_interaction.NIL;
            }
            url = (SubLObject)sksi_sks_interaction.$str159$_processes;
            query = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str160$ticket_, format_nil.format_nil_a_no_copy(sparql_ticket));
            method = (SubLObject)sksi_sks_interaction.$kw161$POST;
        }
        final SubLObject keep_aliveP = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject wide_newlinesP = sksi_sks_interaction.$sksi_sparql_request_wide_newlines$.getDynamicValue(thread);
        final SubLObject open_connection_timeout = sksi_sks_interaction.$sksi_sparql_request_open_connection_timeout$.getDynamicValue(thread);
        final SubLObject overall_timeout = (SubLObject)sksi_sks_interaction.TEN_INTEGER;
        thread.resetMultipleValues();
        final SubLObject tokens = xml_parsing_utilities.xml_tokenized_http_request(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, overall_timeout, (SubLObject)sksi_sks_interaction.T, (SubLObject)sksi_sks_interaction.$list145);
        final SubLObject errorP = thread.secondMultipleValue();
        final SubLObject error_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL == errorP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 61021L)
    public static SubLObject test_sparql_abort_query(final SubLObject sparql_ticket, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine = sksi_access_path.access_path_server(access_path);
        final SubLObject port = sksi_access_path.access_path_port(access_path);
        final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
        SubLObject url = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject query = (SubLObject)sksi_sks_interaction.NIL;
        SubLObject method = (SubLObject)sksi_sks_interaction.NIL;
        if (subprotocol.equal(sksi_sks_interaction.$sparql_oracle_joseki_subprotocol$.getGlobalValue())) {
            url = (SubLObject)sksi_sks_interaction.$str156$_joseki_querymgt;
            query = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str157$abortqid_, format_nil.format_nil_a_no_copy(sparql_ticket));
            method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        }
        else {
            if (!subprotocol.equal(sksi_sks_interaction.$sparql_triclops_subprotocol$.getGlobalValue())) {
                return (SubLObject)sksi_sks_interaction.NIL;
            }
            url = (SubLObject)sksi_sks_interaction.$str159$_processes;
            query = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str160$ticket_, format_nil.format_nil_a_no_copy(sparql_ticket));
            method = (SubLObject)sksi_sks_interaction.$kw161$POST;
        }
        final SubLObject keep_aliveP = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject wide_newlinesP = sksi_sks_interaction.$sksi_sparql_request_wide_newlines$.getDynamicValue(thread);
        final SubLObject overall_timeout = (SubLObject)sksi_sks_interaction.TEN_INTEGER;
        return web_utilities.test_http_request(machine, url, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw162$QUERY, query, sksi_sks_interaction.$kw163$METHOD, method, sksi_sks_interaction.$kw96$PORT, port, sksi_sks_interaction.$kw164$KEEP_ALIVE_, keep_aliveP, sksi_sks_interaction.$kw165$WIDE_NEWLINES_, wide_newlinesP, sksi_sks_interaction.$kw99$TIMEOUT, overall_timeout, sksi_sks_interaction.$kw166$ACCEPT_TYPES, sksi_sks_interaction.$list145 }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62198L)
    public static SubLObject clear_cached_get_result_set_from_sparql_source() {
        final SubLObject cs = sksi_sks_interaction.$cached_get_result_set_from_sparql_source_caching_state$.getGlobalValue();
        if (sksi_sks_interaction.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62198L)
    public static SubLObject remove_cached_get_result_set_from_sparql_source(final SubLObject sparql, final SubLObject access_path, final SubLObject params, final SubLObject extract_rdf_literalsP) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_sks_interaction.$cached_get_result_set_from_sparql_source_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sparql, access_path, params, extract_rdf_literalsP), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62198L)
    public static SubLObject cached_get_result_set_from_sparql_source_internal(final SubLObject sparql, final SubLObject access_path, final SubLObject params, final SubLObject extract_rdf_literalsP) {
        return get_result_set_from_sparql_source_guts(sparql, access_path, params, extract_rdf_literalsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62198L)
    public static SubLObject cached_get_result_set_from_sparql_source(final SubLObject sparql, final SubLObject access_path, final SubLObject params, final SubLObject extract_rdf_literalsP) {
        SubLObject caching_state = sksi_sks_interaction.$cached_get_result_set_from_sparql_source_caching_state$.getGlobalValue();
        if (sksi_sks_interaction.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_sks_interaction.$sym167$CACHED_GET_RESULT_SET_FROM_SPARQL_SOURCE, (SubLObject)sksi_sks_interaction.$sym168$_CACHED_GET_RESULT_SET_FROM_SPARQL_SOURCE_CACHING_STATE_, (SubLObject)sksi_sks_interaction.$int135$500, (SubLObject)sksi_sks_interaction.EQUAL, (SubLObject)sksi_sks_interaction.FOUR_INTEGER, (SubLObject)sksi_sks_interaction.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(sparql, access_path, params, extract_rdf_literalsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_sks_interaction.NIL;
            collision = cdolist_list_var.first();
            while (sksi_sks_interaction.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sparql.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (access_path.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (params.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_sks_interaction.NIL != cached_args && sksi_sks_interaction.NIL == cached_args.rest() && extract_rdf_literalsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_get_result_set_from_sparql_source_internal(sparql, access_path, params, extract_rdf_literalsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sparql, access_path, params, extract_rdf_literalsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62544L)
    public static SubLObject save_sparql_result_set_cache(final SubLObject filename) {
        return Errors.error((SubLObject)sksi_sks_interaction.$str169$Needs_to_be_re_implemented_withou);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62700L)
    public static SubLObject load_sparql_result_set_cache(final SubLObject filename) {
        return Errors.error((SubLObject)sksi_sks_interaction.$str169$Needs_to_be_re_implemented_withou);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 62856L)
    public static SubLObject sparql_extract_variable_names(final SubLObject sparql) {
        final SubLObject select_start = Sequences.search((SubLObject)sksi_sks_interaction.$str119$SELECT, sparql, (SubLObject)sksi_sks_interaction.EQUALP, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL != select_start) {
            final SubLObject where_start = Sequences.search((SubLObject)sksi_sks_interaction.$str170$WHERE, sparql, Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUALP), Symbols.symbol_function((SubLObject)sksi_sks_interaction.IDENTITY), (SubLObject)sksi_sks_interaction.ZERO_INTEGER, (SubLObject)sksi_sks_interaction.NIL, select_start, (SubLObject)sksi_sks_interaction.NIL);
            if (sksi_sks_interaction.NIL != where_start) {
                final SubLObject variables_string = string_utilities.reduce_whitespace(string_utilities.substring(sparql, Numbers.add(select_start, (SubLObject)sksi_sks_interaction.SIX_INTEGER), where_start));
                final SubLObject possible_raw_variable_names = Sequences.delete((SubLObject)sksi_sks_interaction.$str153$, string_utilities.split_string(variables_string, (SubLObject)sksi_sks_interaction.$list171), Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUAL), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                SubLObject variable_names = (SubLObject)sksi_sks_interaction.NIL;
                SubLObject cdolist_list_var = possible_raw_variable_names;
                SubLObject possible_var_name = (SubLObject)sksi_sks_interaction.NIL;
                possible_var_name = cdolist_list_var.first();
                while (sksi_sks_interaction.NIL != cdolist_list_var) {
                    if (sksi_sks_interaction.NIL != conses_high.member(string_utilities.first_char(possible_var_name), (SubLObject)sksi_sks_interaction.$list172, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED)) {
                        variable_names = (SubLObject)ConsesLow.cons(string_utilities.strip_first(possible_var_name), variable_names);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    possible_var_name = cdolist_list_var.first();
                }
                return Sequences.nreverse(variable_names);
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 64338L)
    public static SubLObject sparql_query_xml_tokens(final SubLObject sparql, SubLObject access_path) {
        if (access_path == sksi_sks_interaction.UNPROVIDED) {
            access_path = dictionary.new_dictionary((SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject machine = sksi_access_path.access_path_server(access_path);
        SubLObject port = sksi_access_path.access_path_port(access_path);
        SubLObject url = sksi_access_path.access_path_api_access_relative_path(access_path);
        final SubLObject query = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str173$query_, format_nil.format_nil_a_no_copy(web_utilities.html_url_encode(sparql, (SubLObject)sksi_sks_interaction.UNPROVIDED)));
        final SubLObject method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        final SubLObject keep_aliveP = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject wide_newlinesP = sksi_sks_interaction.$sksi_sparql_request_wide_newlines$.getDynamicValue(thread);
        final SubLObject open_connection_timeout = sksi_sks_interaction.$sksi_sparql_request_open_connection_timeout$.getDynamicValue(thread);
        final SubLObject overall_timeout = sksi_sks_interaction.$sksi_sparql_request_overall_timeout$.getDynamicValue(thread);
        if (sksi_sks_interaction.NIL == machine) {
            machine = (SubLObject)sksi_sks_interaction.$str174$jonny2_cyc_com;
        }
        if (sksi_sks_interaction.NIL == port) {
            port = (SubLObject)sksi_sks_interaction.$int175$8080;
        }
        if (sksi_sks_interaction.NIL == url) {
            url = (SubLObject)sksi_sks_interaction.$str176$_SemanticDB_SPARQL_;
        }
        thread.resetMultipleValues();
        final SubLObject tokens = xml_parsing_utilities.xml_tokenized_http_request(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, overall_timeout, (SubLObject)sksi_sks_interaction.T, (SubLObject)sksi_sks_interaction.$list177);
        final SubLObject errorP = thread.secondMultipleValue();
        final SubLObject error_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_sks_interaction.NIL != errorP) {
            sksi_query_utilities.sksi_suspend_cost_recording_for_current_iterator();
            Errors.warn((SubLObject)sksi_sks_interaction.$str178$sparql_query_xml_tokens_error___S, errorP, error_message);
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 65569L)
    public static SubLObject open_sparql_query_result_stream(final SubLObject sparql, SubLObject access_path, SubLObject params) {
        if (access_path == sksi_sks_interaction.UNPROVIDED) {
            access_path = dictionary.new_dictionary((SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        if (params == sksi_sks_interaction.UNPROVIDED) {
            params = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject machine = sksi_access_path.access_path_server(access_path);
        SubLObject port = sksi_access_path.access_path_port(access_path);
        SubLObject url = sksi_access_path.access_path_api_access_relative_path(access_path);
        final SubLObject all_params = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)sksi_sks_interaction.$str179$query, sparql), params);
        final SubLObject query = web_utilities.html_assocation_list_to_url_parameters(all_params);
        final SubLObject method = (SubLObject)sksi_sks_interaction.$kw48$GET;
        final SubLObject keep_aliveP = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject wide_newlinesP = sksi_sks_interaction.$sksi_sparql_request_wide_newlines$.getDynamicValue(thread);
        final SubLObject open_connection_timeout = sksi_sks_interaction.$sksi_sparql_request_open_connection_timeout$.getDynamicValue(thread);
        if (sksi_sks_interaction.NIL == machine) {
            machine = (SubLObject)sksi_sks_interaction.$str174$jonny2_cyc_com;
        }
        if (sksi_sks_interaction.NIL == port) {
            port = (SubLObject)sksi_sks_interaction.$int175$8080;
        }
        if (sksi_sks_interaction.NIL == url) {
            url = (SubLObject)sksi_sks_interaction.$str176$_SemanticDB_SPARQL_;
        }
        final SubLObject stream = subl_promotions.open_tcp_stream_with_timeout(machine, port, open_connection_timeout, (SubLObject)sksi_sks_interaction.$kw180$PRIVATE);
        web_utilities.send_http_request(stream, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw181$MACHINE, machine, sksi_sks_interaction.$kw96$PORT, port, sksi_sks_interaction.$kw163$METHOD, method, sksi_sks_interaction.$kw182$URL, url, sksi_sks_interaction.$kw162$QUERY, query, sksi_sks_interaction.$kw164$KEEP_ALIVE_, keep_aliveP, sksi_sks_interaction.$kw165$WIDE_NEWLINES_, wide_newlinesP, sksi_sks_interaction.$kw166$ACCEPT_TYPES, sksi_sks_interaction.$list177 }));
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 66942L)
    public static SubLObject stream_wait_until_read_char(final SubLObject stream) {
        final SubLObject v_char = streams_high.read_char(stream, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL != v_char) {
            streams_high.unread_char(v_char, stream);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 67180L)
    public static SubLObject sparql_test(final SubLObject sparql, SubLObject stream, SubLObject count_onlyP) {
        if (stream == sksi_sks_interaction.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (count_onlyP == sksi_sks_interaction.UNPROVIDED) {
            count_onlyP = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLObject access_path = (sksi_sks_interaction.NIL != sksi_sks_interaction.$access_path$.getGlobalValue()) ? sksi_sks_interaction.$access_path$.getGlobalValue() : dictionary.new_dictionary((SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        final SubLObject tokens = sparql_query_xml_tokens(sparql, access_path);
        SubLObject count = (SubLObject)sksi_sks_interaction.ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)sksi_sks_interaction.NIL;
        token = cdolist_list_var.first();
        while (sksi_sks_interaction.NIL != cdolist_list_var) {
            count = Numbers.add(count, (SubLObject)sksi_sks_interaction.ONE_INTEGER);
            if (sksi_sks_interaction.NIL == count_onlyP) {
                print_high.princ(token, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        if (sksi_sks_interaction.NIL == count_onlyP) {
            streams_high.force_output(stream);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 67583L)
    public static SubLObject sparql_test_result_set(final SubLObject sparql, SubLObject access_path) {
        if (access_path == sksi_sks_interaction.UNPROVIDED) {
            access_path = sksi_sks_interaction.$access_path$.getGlobalValue();
        }
        if (sksi_sks_interaction.NIL == access_path) {
            final SubLObject base = sparql_extract_rdf_base(sparql);
            final SubLObject prefix_map = sparql_extract_rdf_prefix_map(sparql);
            access_path = sparql_prefix_map_to_minimal_access_path(base, prefix_map);
        }
        return get_result_set_from_sparql_source(sparql, access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 67966L)
    public static SubLObject sparql_extract_booleanP(final SubLObject sparql) {
        return list_utilities.sublisp_boolean(Sequences.search((SubLObject)sksi_sks_interaction.$str184$ASK__, sparql, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 68096L)
    public static SubLObject sparql_extract_rdf_prefix_map(final SubLObject sparql) {
        return (SubLObject)sksi_sks_interaction.$list185;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 68521L)
    public static SubLObject sparql_extract_rdf_base(final SubLObject sparql) {
        return (SubLObject)sksi_sks_interaction.$str186$http___www_clevelandclinic_org_he;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 68715L)
    public static SubLObject sparql_prefix_map_to_minimal_access_path(final SubLObject base, final SubLObject prefix_map) {
        final SubLObject access_path = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), (SubLObject)sksi_sks_interaction.ONE_INTEGER);
        dictionary.dictionary_enter(access_path, sksi_sks_interaction.$const187$baseNamespaceForSKS, base);
        dictionary.dictionary_enter(access_path, sksi_sks_interaction.$const188$nameSpacePrefixForSKS, prefix_map);
        return access_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 68997L)
    public static SubLObject sksi_sparql_xml_tokens_to_result_set(final SubLObject xml_tokens, SubLObject variable_names, final SubLObject prefix_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.getDynamicValue(thread)) {
            variable_names = (SubLObject)sksi_sks_interaction.$list189;
        }
        final SubLObject sparql_start = xml_parsing_utilities.advance_xml_tokens_to(xml_tokens, (SubLObject)sksi_sks_interaction.$str190$_sparql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        final SubLObject results_tokens = xml_parsing_utilities.xml_extract_token_sequence(sparql_start, (SubLObject)sksi_sks_interaction.$str191$results);
        SubLObject result_set = sparql_utilities.sparql_extract_result_set(variable_names, results_tokens, prefix_map);
        if (sksi_sks_interaction.NIL != sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.getDynamicValue(thread) && sksi_sks_interaction.NIL != result_set) {
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.setDynamicValue(result_set.first().first(), thread);
            result_set = (SubLObject)ConsesLow.list(cyc_kernel.closed_query_success_token());
        }
        return result_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 71030L)
    public static SubLObject test_sksi_ist_graph(final SubLObject xml_tokens, final SubLObject variable_names, final SubLObject prefix_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.currentBinding(thread);
        try {
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.bind(variables.get_variable((SubLObject)sksi_sks_interaction.ZERO_INTEGER), thread);
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.bind((SubLObject)sksi_sks_interaction.NIL, thread);
            sksi_sparql_xml_tokens_to_result_set(xml_tokens, variable_names, prefix_map);
            result = sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.getDynamicValue(thread);
        }
        finally {
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_result$.rebind(_prev_bind_2, thread);
            sksi_csql_sparql_interpretation.$sksi_sparql_ist_graph_variable$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 87865L)
    public static SubLObject sksi_unreachable_db_sks_error(final SubLObject access_path, final SubLObject error) {
        return sksi_unreachable_sks_error(access_path, sdbc.sdbc_error_message(error));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 88635L)
    public static SubLObject sksi_db_execution_error(final SubLObject access_path, final SubLObject error, final SubLObject sql) {
        return sksi_sks_execution_error(access_path, sdbc.sdbc_error_message(error), sql, (SubLObject)sksi_sks_interaction.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 88781L)
    public static SubLObject sksi_unreachable_fht_sks_error(final SubLObject access_path, SubLObject error_message) {
        if (sksi_sks_interaction.NIL == error_message) {
            error_message = (SubLObject)sksi_sks_interaction.$str202$File_hash_table_does_not_exist_;
        }
        return sksi_unreachable_sks_error(access_path, error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 89223L)
    public static SubLObject sksi_create_fht_sks_error(final SubLObject access_path, final SubLObject error_message) {
        final SubLObject sks = sksi_access_path.access_path_sks(access_path);
        PrintLow.format((SubLObject)sksi_sks_interaction.T, (SubLObject)sksi_sks_interaction.$str203$The_following_problem_was_encount, sks);
        return Errors.warn(error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 90221L)
    public static SubLObject all_structured_knowledge_sources_assumed_availableP() {
        return Equality.eq(sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.getGlobalValue(), (SubLObject)sksi_sks_interaction.$kw122$ALL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 90361L)
    public static SubLObject note_sks_available(final SubLObject sks) {
        if (sksi_sks_interaction.NIL == all_structured_knowledge_sources_assumed_availableP() && sksi_sks_interaction.NIL == conses_high.member(sks, sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQL), Symbols.symbol_function((SubLObject)sksi_sks_interaction.IDENTITY))) {
            sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.setGlobalValue((SubLObject)ConsesLow.cons(sks, sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.getGlobalValue()));
        }
        return sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 90597L)
    public static SubLObject unnote_sks_available(final SubLObject sks) {
        if (sksi_sks_interaction.NIL == all_structured_knowledge_sources_assumed_availableP()) {
            sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.setGlobalValue(Sequences.delete(sks, sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.getGlobalValue(), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED));
        }
        return sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 90895L)
    public static SubLObject sks_assumed_availableP(final SubLObject sks) {
        if (sksi_sks_interaction.NIL != all_structured_knowledge_sources_assumed_availableP()) {
            return (SubLObject)sksi_sks_interaction.T;
        }
        return subl_promotions.memberP(sks, sksi_sks_interaction.$structured_knowledge_sources_assumed_available$.getGlobalValue(), (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 91091L)
    public static SubLObject sksi_sks_error(final SubLObject access_path, final SubLObject error_message, SubLObject statement, SubLObject error_type) {
        if (statement == sksi_sks_interaction.UNPROVIDED) {
            statement = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (error_type == sksi_sks_interaction.UNPROVIDED) {
            error_type = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_access_path.access_path_sks(access_path);
        if (sksi_sks_interaction.NIL != sksi_debugging.sksi_warn_on_sks_errorsP() || sksi_sks_interaction.NIL != sksi_debugging.sksi_break_on_sks_errorsP()) {
            if (statement.isString()) {
                PrintLow.format((SubLObject)sksi_sks_interaction.T, (SubLObject)sksi_sks_interaction.$str204$__The_following_problem_was_encou, sks, statement);
            }
            else {
                PrintLow.format((SubLObject)sksi_sks_interaction.T, (SubLObject)sksi_sks_interaction.$str205$__The_following_problem_was_encou, sks);
            }
        }
        if (sksi_sks_interaction.NIL != sksi_debugging.sksi_possibly_act_on_custom_sks_error_action(error_message, sks, error_type)) {
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL != sksi_debugging.sksi_ignore_sks_errorsP()) {
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL != sksi_debugging.sksi_warn_on_sks_errorsP()) {
            return Errors.warn(error_message);
        }
        if (sksi_sks_interaction.NIL == sksi_debugging.sksi_break_on_sks_errorsP()) {
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        if (sksi_sks_interaction.NIL != Errors.$continue_cerrorP$.getDynamicValue(thread) || sksi_sks_interaction.NIL == Errors.$break_on_errorP$.getDynamicValue(thread)) {
            return Errors.warn(error_message);
        }
        final SubLObject cont_string = Sequences.cconcatenate((SubLObject)sksi_sks_interaction.$str206$Continue_without_accessing_, new SubLObject[] { format_nil.format_nil_a_no_copy(sks), sksi_sks_interaction.$str207$_ });
        return Errors.cerror(cont_string, error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 92315L)
    public static SubLObject sksi_unreachable_sks_error(final SubLObject access_path, final SubLObject error_message) {
        return sksi_sks_error(access_path, error_message, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.$kw208$UNREACHABLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 92456L)
    public static SubLObject sksi_sks_execution_error(final SubLObject access_path, final SubLObject error_message, final SubLObject statement, final SubLObject db_errorP) {
        return sksi_sks_error(access_path, error_message, statement, (SubLObject)((sksi_sks_interaction.NIL != db_errorP) ? sksi_sks_interaction.$kw209$DB_EXECUTION : sksi_sks_interaction.$kw210$SKS_EXECUTION));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 92653L)
    public static SubLObject get_sql_connection_and_statement(final SubLObject access_path) {
        if (sksi_sks_interaction.NIL != within_sksi_global_resourcingP()) {
            return get_sql_connection_and_statement_from_global_cache(access_path);
        }
        if (sksi_sks_interaction.NIL != within_sksi_local_resourcingP()) {
            return get_sql_connection_and_statement_from_local_cache(access_path);
        }
        return sksi_open_sql_connection_and_statement(access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 93215L)
    public static SubLObject release_sql_connection_and_statement(final SubLObject connection, final SubLObject statement) {
        if (sksi_sks_interaction.NIL != within_sksi_global_resourcingP()) {
            return release_sql_connection_and_statement_to_global_cache(connection, statement);
        }
        if (sksi_sks_interaction.NIL != within_sksi_local_resourcingP()) {
            return release_sql_connection_and_statement_to_local_cache(connection, statement);
        }
        return sksi_close_sql_statement_and_connection(statement, connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 93623L)
    public static SubLObject within_sksi_sql_connection_resourcingP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL != within_sksi_global_resourcingP() || sksi_sks_interaction.NIL != within_sksi_local_resourcingP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 94033L)
    public static SubLObject within_sksi_local_resourcingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_p(sksi_macros.$sksi_sql_connection_cache$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 94209L)
    public static SubLObject get_sql_connection_and_statement_from_local_cache(final SubLObject access_path) {
        final SubLObject connection = get_sql_connection_from_local_cache(access_path);
        final SubLObject statement = (SubLObject)((sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection)) ? get_sql_statement_from_local_cache(connection) : sksi_sks_interaction.NIL);
        return Values.values(connection, statement);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 94520L)
    public static SubLObject get_sql_connection_from_local_cache(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copy_access_path = dictionary_utilities.copy_dictionary(access_path);
        dictionary.dictionary_remove(copy_access_path, (SubLObject)sksi_sks_interaction.$kw211$SKS);
        SubLObject connection = dictionary.dictionary_lookup_without_values(sksi_macros.$sksi_sql_connection_cache$.getDynamicValue(thread), copy_access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL == sdbc.sql_open_connection_p(connection)) {
            if (sksi_sks_interaction.NIL != sdbc.sql_connection_p(connection)) {
                dictionary.dictionary_remove(sksi_macros.$sksi_sql_statement_cache$.getDynamicValue(thread), connection);
            }
            connection = open_sql_source(copy_access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        dictionary.dictionary_enter(sksi_macros.$sksi_sql_connection_cache$.getDynamicValue(thread), copy_access_path, connection);
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 95110L)
    public static SubLObject get_sql_statement_from_local_cache(final SubLObject connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject statement_queue = dictionary.dictionary_lookup_without_values(sksi_macros.$sksi_sql_statement_cache$.getDynamicValue(thread), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        SubLObject statement = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != queues.queue_p(statement_queue)) {
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(sksi_macros.$sksi_sql_statement_pool_lock$.getDynamicValue(thread));
                for (SubLObject q = statement_queue, done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL != statement || sksi_sks_interaction.NIL != queues.queue_empty_p(q)); sksi_sks_interaction.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL != statement || sksi_sks_interaction.NIL != queues.queue_empty_p(q))) {
                    final SubLObject candidate = queues.dequeue(q);
                    if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(candidate)) {
                        statement = candidate;
                    }
                }
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(sksi_macros.$sksi_sql_statement_pool_lock$.getDynamicValue(thread));
                }
            }
        }
        if (sksi_sks_interaction.NIL == sdbc.sql_open_statement_p(statement)) {
            statement = sdbc.sqlc_create_statement(connection);
        }
        return statement;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 95651L)
    public static SubLObject release_sql_connection_and_statement_to_local_cache(final SubLObject connection, final SubLObject statement) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection) && sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(statement)) {
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(sksi_macros.$sksi_sql_statement_pool_lock$.getDynamicValue(thread));
                SubLObject statement_queue = dictionary.dictionary_lookup_without_values(sksi_macros.$sksi_sql_statement_cache$.getDynamicValue(thread), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                if (sksi_sks_interaction.NIL == queues.queue_p(statement_queue)) {
                    statement_queue = queues.create_queue((SubLObject)sksi_sks_interaction.UNPROVIDED);
                    dictionary.dictionary_enter(sksi_macros.$sksi_sql_statement_cache$.getDynamicValue(thread), connection, statement_queue);
                }
                if (!sksi_sks_interaction.$sksi_sql_statement_pool_max_size$.getGlobalValue().isInteger() || !queues.queue_size(statement_queue).numGE(sksi_sks_interaction.$sksi_sql_statement_pool_max_size$.getGlobalValue())) {
                    queues.enqueue(statement, statement_queue);
                }
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(sksi_macros.$sksi_sql_statement_pool_lock$.getDynamicValue(thread));
                }
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 96345L)
    public static SubLObject finalize_sql_connection_and_statement_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != within_sksi_local_resourcingP()) {
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(sksi_macros.$sksi_sql_statement_pool_lock$.getDynamicValue(thread));
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_macros.$sksi_sql_statement_cache$.getDynamicValue(thread))); sksi_sks_interaction.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject connection = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject statement_queue = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    dictionary.dictionary_remove(sksi_macros.$sksi_sql_statement_cache$.getDynamicValue(thread), connection);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(sksi_macros.$sksi_sql_statement_pool_lock$.getDynamicValue(thread));
                }
            }
            SubLObject iteration_state2;
            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_macros.$sksi_sql_connection_cache$.getDynamicValue(thread))); sksi_sks_interaction.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                thread.resetMultipleValues();
                final SubLObject access_path = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                final SubLObject connection = thread.secondMultipleValue();
                thread.resetMultipleValues();
                sksi_close_sql_connection(connection);
                dictionary.dictionary_remove(sksi_macros.$sksi_sql_connection_cache$.getDynamicValue(thread), access_path);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
        }
        return (SubLObject)sksi_sks_interaction.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97411L)
    public static SubLObject within_sksi_global_resourcingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_sks_interaction.$sksi_global_resourcingP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97496L)
    public static SubLObject sksi_global_resourcing_initializedP() {
        return sksi_resourcing_cache_p(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)sksi_sks_interaction.ZERO_INTEGER);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sksi_resourcing_cache_native.class) ? sksi_sks_interaction.T : sksi_sks_interaction.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_connections(final SubLObject v_object) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_statements(final SubLObject v_object) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_used_statements(final SubLObject v_object) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_access_times(final SubLObject v_object) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_lock(final SubLObject v_object) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_max_pool_size(final SubLObject v_object) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject sksi_resourcing_cache_max_idle(final SubLObject v_object) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject _csetf_sksi_resourcing_cache_connections(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject _csetf_sksi_resourcing_cache_statements(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject _csetf_sksi_resourcing_cache_used_statements(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject _csetf_sksi_resourcing_cache_access_times(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject _csetf_sksi_resourcing_cache_lock(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject _csetf_sksi_resourcing_cache_max_pool_size(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject _csetf_sksi_resourcing_cache_max_idle(final SubLObject v_object, final SubLObject value) {
        assert sksi_sks_interaction.NIL != sksi_resourcing_cache_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject make_sksi_resourcing_cache(SubLObject arglist) {
        if (arglist == sksi_sks_interaction.UNPROVIDED) {
            arglist = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sksi_resourcing_cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_sks_interaction.NIL, next = arglist; sksi_sks_interaction.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw237$CONNECTIONS)) {
                _csetf_sksi_resourcing_cache_connections(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw238$STATEMENTS)) {
                _csetf_sksi_resourcing_cache_statements(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw239$USED_STATEMENTS)) {
                _csetf_sksi_resourcing_cache_used_statements(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw240$ACCESS_TIMES)) {
                _csetf_sksi_resourcing_cache_access_times(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw241$LOCK)) {
                _csetf_sksi_resourcing_cache_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw242$MAX_POOL_SIZE)) {
                _csetf_sksi_resourcing_cache_max_pool_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_sks_interaction.$kw243$MAX_IDLE)) {
                _csetf_sksi_resourcing_cache_max_idle(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_sks_interaction.$str244$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject visit_defstruct_sksi_resourcing_cache(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw245$BEGIN, (SubLObject)sksi_sks_interaction.$sym246$MAKE_SKSI_RESOURCING_CACHE, (SubLObject)sksi_sks_interaction.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw247$SLOT, (SubLObject)sksi_sks_interaction.$kw237$CONNECTIONS, sksi_resourcing_cache_connections(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw247$SLOT, (SubLObject)sksi_sks_interaction.$kw238$STATEMENTS, sksi_resourcing_cache_statements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw247$SLOT, (SubLObject)sksi_sks_interaction.$kw239$USED_STATEMENTS, sksi_resourcing_cache_used_statements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw247$SLOT, (SubLObject)sksi_sks_interaction.$kw240$ACCESS_TIMES, sksi_resourcing_cache_access_times(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw247$SLOT, (SubLObject)sksi_sks_interaction.$kw241$LOCK, sksi_resourcing_cache_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw247$SLOT, (SubLObject)sksi_sks_interaction.$kw242$MAX_POOL_SIZE, sksi_resourcing_cache_max_pool_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw247$SLOT, (SubLObject)sksi_sks_interaction.$kw243$MAX_IDLE, sksi_resourcing_cache_max_idle(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_sks_interaction.$kw248$END, (SubLObject)sksi_sks_interaction.$sym246$MAKE_SKSI_RESOURCING_CACHE, (SubLObject)sksi_sks_interaction.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 97971L)
    public static SubLObject visit_defstruct_object_sksi_resourcing_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sksi_resourcing_cache(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 98146L)
    public static SubLObject new_sksi_resourcing_cache(SubLObject max_pool_size, SubLObject max_idle) {
        if (max_pool_size == sksi_sks_interaction.UNPROVIDED) {
            max_pool_size = (SubLObject)sksi_sks_interaction.NIL;
        }
        if (max_idle == sksi_sks_interaction.UNPROVIDED) {
            max_idle = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLObject v_cache = make_sksi_resourcing_cache((SubLObject)sksi_sks_interaction.UNPROVIDED);
        _csetf_sksi_resourcing_cache_connections(v_cache, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUALP), (SubLObject)sksi_sks_interaction.UNPROVIDED));
        _csetf_sksi_resourcing_cache_statements(v_cache, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), (SubLObject)sksi_sks_interaction.UNPROVIDED));
        _csetf_sksi_resourcing_cache_used_statements(v_cache, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), (SubLObject)sksi_sks_interaction.UNPROVIDED));
        _csetf_sksi_resourcing_cache_access_times(v_cache, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), (SubLObject)sksi_sks_interaction.UNPROVIDED));
        _csetf_sksi_resourcing_cache_lock(v_cache, Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_sks_interaction.$str250$SKSI_SQL_resourcing_cache_))));
        _csetf_sksi_resourcing_cache_max_pool_size(v_cache, max_pool_size);
        _csetf_sksi_resourcing_cache_max_idle(v_cache, max_idle);
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 98871L)
    public static SubLObject with_sksi_global_resourcing_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_cache = (SubLObject)sksi_sks_interaction.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_sks_interaction.$list251);
        v_cache = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_sks_interaction.$sym252$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.$sym231$SKSI_RESOURCING_CACHE_LOCK, v_cache)), ConsesLow.append(body, (SubLObject)sksi_sks_interaction.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 99022L)
    public static SubLObject sksi_add_connection_to_cache(final SubLObject v_cache, final SubLObject access_path, final SubLObject connection) {
        final SubLObject key = sksi_generate_cache_key_from_access_path(access_path);
        final SubLObject lock = sksi_resourcing_cache_lock(v_cache);
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(lock);
            dictionary.dictionary_enter(sksi_resourcing_cache_connections(v_cache), key, connection);
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 99372L)
    public static SubLObject sksi_add_statement_to_cache(final SubLObject v_cache, final SubLObject connection, final SubLObject statement) {
        final SubLObject lock = sksi_resourcing_cache_lock(v_cache);
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject statement_cache = sksi_resourcing_cache_statements(v_cache);
            SubLObject statement_queue = dictionary.dictionary_lookup_without_values(statement_cache, connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            if (sksi_sks_interaction.NIL == statement_queue) {
                statement_queue = queues.create_queue((SubLObject)sksi_sks_interaction.UNPROVIDED);
                dictionary.dictionary_enter(statement_cache, connection, statement_queue);
            }
            if (!sksi_resourcing_cache_max_pool_size(v_cache).isInteger() || !queues.queue_size(statement_queue).numGE(sksi_resourcing_cache_max_pool_size(v_cache))) {
                queues.enqueue(statement, statement_queue);
            }
            final SubLObject used_statements_set = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_used_statements(v_cache), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            if (sksi_sks_interaction.NIL != set.set_p(used_statements_set)) {
                set.set_remove(statement, used_statements_set);
            }
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 100212L)
    public static SubLObject sksi_note_access_time_in_cache(final SubLObject v_cache, final SubLObject connection) {
        final SubLObject lock = sksi_resourcing_cache_lock(v_cache);
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(lock);
            dictionary.dictionary_enter(sksi_resourcing_cache_access_times(v_cache), connection, Time.get_universal_time());
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 100440L)
    public static SubLObject sksi_retrieve_connection_from_cache(final SubLObject v_cache, final SubLObject access_path) {
        final SubLObject key = sksi_generate_cache_key_from_access_path(access_path);
        SubLObject connection = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject lock = sksi_resourcing_cache_lock(v_cache);
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(lock);
            connection = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_connections(v_cache), key, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 100777L)
    public static SubLObject sksi_retrieve_statement_from_cache(final SubLObject v_cache, final SubLObject connection) {
        SubLObject statement = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject lock = sksi_resourcing_cache_lock(v_cache);
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject statement_queue = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_statements(v_cache), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            if (sksi_sks_interaction.NIL != queues.queue_p(statement_queue)) {
                for (SubLObject q = statement_queue, done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL != statement || sksi_sks_interaction.NIL != queues.queue_empty_p(q)); sksi_sks_interaction.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL != statement || sksi_sks_interaction.NIL != queues.queue_empty_p(q))) {
                    final SubLObject candidate = queues.dequeue(q);
                    if (sksi_sks_interaction.NIL != sdbc.sql_open_statement_p(candidate)) {
                        statement = candidate;
                        SubLObject used_statements_set = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_used_statements(v_cache), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                        if (sksi_sks_interaction.NIL == set.set_p(used_statements_set)) {
                            used_statements_set = set.new_set(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), (SubLObject)sksi_sks_interaction.UNPROVIDED);
                            dictionary.dictionary_enter(sksi_resourcing_cache_used_statements(v_cache), connection, used_statements_set);
                        }
                        set.set_add(statement, used_statements_set);
                    }
                }
            }
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return statement;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 101966L)
    public static SubLObject sksi_add_statement_to_used_statements_set(final SubLObject v_cache, final SubLObject connection, final SubLObject statement) {
        final SubLObject lock = sksi_resourcing_cache_lock(v_cache);
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(lock);
            SubLObject used_statements_set = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_used_statements(v_cache), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            if (sksi_sks_interaction.NIL == set.set_p(used_statements_set)) {
                used_statements_set = set.new_set(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), (SubLObject)sksi_sks_interaction.UNPROVIDED);
                dictionary.dictionary_enter(sksi_resourcing_cache_used_statements(v_cache), connection, used_statements_set);
            }
            set.set_add(statement, used_statements_set);
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 102559L)
    public static SubLObject sksi_last_cache_access_time(final SubLObject v_cache, final SubLObject connection) {
        SubLObject time = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject lock = sksi_resourcing_cache_lock(v_cache);
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(lock);
            time = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_access_times(v_cache), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 102818L)
    public static SubLObject sksi_generate_cache_key_from_access_path(final SubLObject access_path) {
        final SubLObject new_access_path = dictionary_utilities.copy_dictionary(access_path);
        dictionary.dictionary_remove(new_access_path, (SubLObject)sksi_sks_interaction.$kw211$SKS);
        return new_access_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 103170L)
    public static SubLObject get_sql_connection_and_statement_from_global_cache(final SubLObject access_path) {
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(sksi_sks_interaction.$sksi_connection_global_cache_lock$.getGlobalValue());
            SubLObject connection = (SubLObject)sksi_sks_interaction.NIL;
            SubLObject statement = (SubLObject)sksi_sks_interaction.NIL;
            if (sksi_sks_interaction.NIL == sksi_global_resourcing_initializedP()) {
                sksi_initialize_global_resourcing((SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            }
            connection = sksi_retrieve_connection_from_cache(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), access_path);
            if (sksi_sks_interaction.NIL == sdbc.sql_open_connection_p(connection)) {
                connection = open_sql_source(access_path, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                sksi_add_connection_to_cache(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), access_path, connection);
            }
            if (sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection)) {
                sksi_note_access_time_in_cache(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), connection);
                statement = sksi_retrieve_statement_from_cache(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), connection);
                if (sksi_sks_interaction.NIL == sdbc.sql_open_statement_p(statement)) {
                    statement = sdbc.sqlc_create_statement(connection);
                    sksi_add_statement_to_used_statements_set(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), connection, statement);
                }
            }
            return Values.values(connection, statement);
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(sksi_sks_interaction.$sksi_connection_global_cache_lock$.getGlobalValue());
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 104281L)
    public static SubLObject release_sql_connection_and_statement_to_global_cache(final SubLObject connection, final SubLObject statement) {
        SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
        try {
            release = Locks.seize_lock(sksi_sks_interaction.$sksi_connection_global_cache_lock$.getGlobalValue());
            sksi_note_access_time_in_cache(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), connection);
            sksi_add_statement_to_cache(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), connection, statement);
            return (SubLObject)sksi_sks_interaction.NIL;
        }
        finally {
            if (sksi_sks_interaction.NIL != release) {
                Locks.release_lock(sksi_sks_interaction.$sksi_connection_global_cache_lock$.getGlobalValue());
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 104597L)
    public static SubLObject sksi_resourced_connection_has_active_statementsP(final SubLObject connection) {
        SubLObject activeP = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != within_sksi_global_resourcingP() && sksi_sks_interaction.NIL != sksi_global_resourcing_initializedP()) {
            final SubLObject lock = sksi_resourcing_cache_lock(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(lock);
                final SubLObject used_statements_set = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_used_statements(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()), connection, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                activeP = set.non_empty_set_p(used_statements_set);
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return activeP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 105076L)
    public static SubLObject sksi_resourced_connection_idle_too_longP(final SubLObject connection) {
        SubLObject too_idleP = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL != within_sksi_global_resourcingP() && sksi_sks_interaction.NIL != sksi_global_resourcing_initializedP()) {
            final SubLObject lock = sksi_resourcing_cache_lock(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(lock);
                final SubLObject last_access_time = sksi_last_cache_access_time(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), connection);
                final SubLObject max_idle = sksi_resourcing_cache_max_idle(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
                if (sksi_sks_interaction.NIL != numeric_date_utilities.universal_time_p(last_access_time)) {
                    too_idleP = Numbers.numG(subl_promotions.elapsed_universal_time(last_access_time, (SubLObject)sksi_sks_interaction.UNPROVIDED), max_idle);
                }
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return too_idleP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 105655L)
    public static SubLObject sksi_initialize_global_resourcing(SubLObject max_pool_size, SubLObject max_idle) {
        if (max_pool_size == sksi_sks_interaction.UNPROVIDED) {
            max_pool_size = sksi_sks_interaction.$sksi_sql_statement_pool_max_size$.getGlobalValue();
        }
        if (max_idle == sksi_sks_interaction.UNPROVIDED) {
            max_idle = sksi_sks_interaction.$sksi_default_connection_max_idle_seconds$.getGlobalValue();
        }
        sksi_sks_interaction.$sksi_resourcing_cache$.setGlobalValue(new_sksi_resourcing_cache(max_pool_size, max_idle));
        sksi_sks_interaction.$sksi_global_resourcingP$.setDynamicValue((SubLObject)sksi_sks_interaction.T);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 105978L)
    public static SubLObject sksi_finalize_global_resourcing() {
        if (sksi_sks_interaction.NIL != sksi_global_resourcing_initializedP()) {
            sksi_close_resourced_connections();
            final SubLObject lock = sksi_resourcing_cache_lock(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(lock);
                sksi_sks_interaction.$sksi_resourcing_cache$.setGlobalValue((SubLObject)sksi_sks_interaction.NIL);
                sksi_sks_interaction.$sksi_global_resourcingP$.setDynamicValue((SubLObject)sksi_sks_interaction.NIL);
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 106280L)
    public static SubLObject sksi_close_resourced_connections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_sks_interaction.NIL != sksi_global_resourcing_initializedP()) {
            final SubLObject lock = sksi_resourcing_cache_lock(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(lock);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_resourcing_cache_connections(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()))); sksi_sks_interaction.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject connection = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject ignore_errors_tag = (SubLObject)sksi_sks_interaction.NIL;
                    try {
                        thread.throwStack.push(sksi_sks_interaction.$kw256$IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_sks_interaction.$sym257$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                sksi_close_sql_connection(connection);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_interaction.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_sks_interaction.$kw256$IGNORE_ERRORS_TARGET);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                dictionary.clear_dictionary(sksi_resourcing_cache_connections(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()));
                dictionary.clear_dictionary(sksi_resourcing_cache_statements(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()));
                dictionary.clear_dictionary(sksi_resourcing_cache_used_statements(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()));
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 107011L)
    public static SubLObject sksi_close_resourced_connections_for_sks(final SubLObject sks) {
        final SubLObject access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL != sksi_access_path.access_path_p(access_path)) {
            sksi_reap_connection_for_access_path(access_path);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 107246L)
    public static SubLObject sksi_reset_global_resourcing_max_idle_time(final SubLObject seconds) {
        if (sksi_sks_interaction.NIL != sksi_global_resourcing_initializedP()) {
            final SubLObject lock = sksi_resourcing_cache_lock(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(lock);
                _csetf_sksi_resourcing_cache_max_idle(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue(), seconds);
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 107526L)
    public static SubLObject sksi_possibly_reap_connections(SubLObject forceP) {
        if (forceP == sksi_sks_interaction.UNPROVIDED) {
            forceP = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sksi_resourcing_cache_connections(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()))); sksi_sks_interaction.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject connection = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_sks_interaction.NIL != forceP || sksi_sks_interaction.NIL != sksi_possibly_remove_from_resourcing_cacheP(connection)) {
                sksi_reap_connection(key);
            }
            else if (sksi_sks_interaction.NIL == sdbc.sql_open_connection_p(connection)) {
                sksi_reap_connection(key);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 107921L)
    public static SubLObject sksi_reap_connection_for_access_path(final SubLObject access_path) {
        final SubLObject key = sksi_generate_cache_key_from_access_path(access_path);
        return sksi_reap_connection(key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 108101L)
    public static SubLObject sksi_possibly_remove_from_resourcing_cacheP(final SubLObject connection) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL == sksi_resourced_connection_has_active_statementsP(connection) && sksi_sks_interaction.NIL != sksi_resourced_connection_idle_too_longP(connection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 108322L)
    public static SubLObject sksi_reap_connection(final SubLObject key) {
        if (sksi_sks_interaction.NIL != within_sksi_global_resourcingP() && sksi_sks_interaction.NIL != sksi_global_resourcing_initializedP()) {
            final SubLObject lock = sksi_resourcing_cache_lock(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue());
            SubLObject release = (SubLObject)sksi_sks_interaction.NIL;
            try {
                release = Locks.seize_lock(lock);
                final SubLObject connection = dictionary.dictionary_lookup_without_values(sksi_resourcing_cache_connections(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()), key, (SubLObject)sksi_sks_interaction.UNPROVIDED);
                if (sksi_sks_interaction.NIL != connection) {
                    dictionary.dictionary_remove(sksi_resourcing_cache_statements(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()), connection);
                    dictionary.dictionary_remove(sksi_resourcing_cache_used_statements(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()), connection);
                    dictionary.dictionary_remove(sksi_resourcing_cache_access_times(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()), connection);
                    if (sksi_sks_interaction.NIL != sdbc.sql_open_connection_p(connection)) {
                        sksi_close_sql_connection(connection);
                    }
                    dictionary.dictionary_remove(sksi_resourcing_cache_connections(sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue()), key);
                }
            }
            finally {
                if (sksi_sks_interaction.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 109153L)
    public static SubLObject sk_source_status_fast(final SubLObject sks, SubLObject meta_mt) {
        if (meta_mt == sksi_sks_interaction.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject status = (SubLObject)sksi_sks_interaction.$kw53$ERROR;
        SubLObject ignore_errors_tag = (SubLObject)sksi_sks_interaction.NIL;
        try {
            thread.throwStack.push(sksi_sks_interaction.$kw256$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_sks_interaction.$sym257$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$10 = sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.currentBinding(thread);
                    try {
                        sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.bind((SubLObject)sksi_sks_interaction.ONE_INTEGER, thread);
                        sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.bind((SubLObject)sksi_sks_interaction.$float258$0_2, thread);
                        sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.bind((SubLObject)sksi_sks_interaction.$float258$0_2, thread);
                        assert sksi_sks_interaction.NIL != sksi_debugging.valid_sksi_error_handling_mode_p((SubLObject)sksi_sks_interaction.$kw259$IGNORE) : sksi_sks_interaction.$kw259$IGNORE;
                        final SubLObject _prev_bind_0_$11 = sksi_debugging.$sksi_error_handling_mode$.currentBinding(thread);
                        try {
                            sksi_debugging.$sksi_error_handling_mode$.bind((SubLObject)sksi_sks_interaction.$kw259$IGNORE, thread);
                            if (sksi_sks_interaction.NIL != sksi_infrastructure_utilities.sk_source_accessibleP(sks, meta_mt)) {
                                status = (SubLObject)sksi_sks_interaction.$kw261$UP;
                            }
                            else {
                                status = (SubLObject)sksi_sks_interaction.$kw262$DOWN;
                            }
                        }
                        finally {
                            sksi_debugging.$sksi_error_handling_mode$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                    finally {
                        sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.rebind(_prev_bind_3, thread);
                        sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.rebind(_prev_bind_2, thread);
                        sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_sks_interaction.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_sks_interaction.$kw256$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 109713L)
    public static SubLObject get_rs_iterator_for_sql_query_from_db_sks(final SubLObject sks, final SubLObject sql, SubLObject meta_mt) {
        if (meta_mt == sksi_sks_interaction.UNPROVIDED) {
            meta_mt = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rs_iterator = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_interaction.NIL, meta_mt);
            final SubLObject result_set = get_result_set_from_sql_source(sql, access_path);
            if (sksi_sks_interaction.NIL != sdbc.sql_result_set_p(result_set)) {
                rs_iterator = sksi_result_set_iterators.new_sqlrs_iterator(result_set, (SubLObject)sksi_sks_interaction.UNPROVIDED, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return rs_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 110810L)
    public static SubLObject sksi_execute_db_sks_update(final SubLObject sks, final SubLObject sql, SubLObject meta_mt) {
        if (meta_mt == sksi_sks_interaction.UNPROVIDED) {
            meta_mt = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject update_result = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject access_path = sksi_access_path.external_source_access_path(sks, (SubLObject)sksi_sks_interaction.NIL, meta_mt);
            if (sksi_sks_interaction.NIL != sksi_access_path.access_path_p(access_path)) {
                update_result = sksi_execute_sql_update(sql, access_path);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return update_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 111442L)
    public static SubLObject sksi_execute_db_sks_update_in_mapping_mt(final SubLObject sks, final SubLObject sql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return sksi_execute_db_sks_update(sks, sql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 111658L)
    public static SubLObject sksi_execute_csql(final SubLObject sks, final SubLObject csql, SubLObject mapping_mt) {
        if (mapping_mt == sksi_sks_interaction.UNPROVIDED) {
            mapping_mt = (SubLObject)sksi_sks_interaction.NIL;
        }
        final SubLObject sql_flavor = sksi_kb_accessors.sk_source_sql_flavor(sks);
        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        return sksi_execute_db_sks_update(sks, sql, mapping_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 111875L)
    public static SubLObject sksi_execute_csql_in_mapping_mt(final SubLObject sks, final SubLObject csql) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            return sksi_execute_csql(sks, csql, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 112075L)
    public static SubLObject sksi_tactic_p(final SubLObject v_object) {
        if (sksi_sks_interaction.NIL != inference_datastructures_tactic.tactic_p(v_object)) {
            final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_sks_interaction.NIL != list_utilities.member_eqP(inference_modules.hl_module_type(hl_module), (SubLObject)sksi_sks_interaction.$list263) || sksi_sks_interaction.NIL != list_utilities.member_eqP((SubLObject)sksi_sks_interaction.$kw264$SKSI, inference_modules.hl_module_subtypes(hl_module)));
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 112511L)
    public static SubLObject inference_possibly_note_salient_sksi_query_string(final SubLObject sksi_query_string) {
        assert sksi_sks_interaction.NIL != Types.stringp(sksi_query_string) : sksi_query_string;
        final SubLObject tactic = inference_worker.currently_executing_tactic();
        if (sksi_sks_interaction.NIL != sksi_tactic_p(tactic)) {
            return sksi_tactic_note_salient_query_string(tactic, sksi_query_string);
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 112920L)
    public static SubLObject memoized_salient_sksi_query_string_internal(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_sks_interaction.$sksi_salient_query_string$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 112920L)
    public static SubLObject memoized_salient_sksi_query_string(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_sks_interaction.NIL;
        if (sksi_sks_interaction.NIL == v_memoization_state) {
            return memoized_salient_sksi_query_string_internal(tactic);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_sks_interaction.$sym265$MEMOIZED_SALIENT_SKSI_QUERY_STRING, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        if (sksi_sks_interaction.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_sks_interaction.$sym265$MEMOIZED_SALIENT_SKSI_QUERY_STRING, (SubLObject)sksi_sks_interaction.ONE_INTEGER, (SubLObject)sksi_sks_interaction.NIL, (SubLObject)sksi_sks_interaction.EQ, (SubLObject)sksi_sks_interaction.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_sks_interaction.$sym265$MEMOIZED_SALIENT_SKSI_QUERY_STRING, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, tactic, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_salient_sksi_query_string_internal(tactic)));
            memoization_state.caching_state_put(caching_state, tactic, results, (SubLObject)sksi_sks_interaction.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 113071L)
    public static SubLObject sksi_tactic_salient_query_string(final SubLObject sksi_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_interaction.NIL != sksi_tactic_p(sksi_tactic) : sksi_tactic;
        if (sksi_sks_interaction.NIL != inference_datastructures_tactic.tactic_has_statusP(sksi_tactic, (SubLObject)sksi_sks_interaction.$kw267$EXECUTED_OR_IN_PROGRESS)) {
            final SubLObject store = inference_datastructures_tactic.tactic_store(sksi_tactic);
            SubLObject string = (SubLObject)sksi_sks_interaction.NIL;
            final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    string = memoized_salient_sksi_query_string(sksi_tactic);
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            return string;
        }
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-interaction.lisp", position = 113658L)
    public static SubLObject sksi_tactic_note_salient_query_string(final SubLObject sksi_tactic, final SubLObject sksi_query_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_sks_interaction.NIL != inference_datastructures_tactic.tactic_p(sksi_tactic) : sksi_tactic;
        assert sksi_sks_interaction.NIL != Types.stringp(sksi_query_string) : sksi_query_string;
        final SubLObject store = inference_datastructures_tactic.tactic_store(sksi_tactic);
        SubLObject result = (SubLObject)sksi_sks_interaction.NIL;
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$13 = sksi_sks_interaction.$sksi_salient_query_string$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_salient_query_string$.bind(sksi_query_string, thread);
                    result = memoized_salient_sksi_query_string(sksi_tactic);
                }
                finally {
                    sksi_sks_interaction.$sksi_salient_query_string$.rebind(_prev_bind_0_$13, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_sks_interaction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    public static SubLObject declare_sksi_sks_interaction_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_iterator_from_csql", "GENERATE-ITERATOR-FROM-CSQL", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_boolean_from_csql", "GENERATE-BOOLEAN-FROM-CSQL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "boolean_csql_to_sksi_supports", "BOOLEAN-CSQL-TO-SKSI-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_db_iterator_from_csql", "GENERATE-DB-ITERATOR-FROM-CSQL", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_db_boolean_from_csql", "GENERATE-DB-BOOLEAN-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_sdbc_result_set_from_csql", "GENERATE-SDBC-RESULT-SET-FROM-CSQL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_web_page_iterator_from_csql", "GENERATE-WEB-PAGE-ITERATOR-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_web_page_boolean_from_csql", "GENERATE-WEB-PAGE-BOOLEAN-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_web_page_result_set", "GENERATE-WEB-PAGE-RESULT-SET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_web_query_template_to_query", "SKSI-WEB-QUERY-TEMPLATE-TO-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_web_query_patterns", "SKSI-WEB-QUERY-PATTERNS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_web_query_where_pattern", "SKSI-WEB-QUERY-WHERE-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_web_query_field_positions", "SKSI-WEB-QUERY-FIELD-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_web_page_result_set", "SKSI-WEB-PAGE-RESULT-SET", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_web_page_result_set_for_unbound_only", "SKSI-WEB-PAGE-RESULT-SET-FOR-UNBOUND-ONLY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "test_sksi_web_page_result_set", "TEST-SKSI-WEB-PAGE-RESULT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_sksi_web_page_subl_method", "GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_sksi_web_page_subl_method_memoized_internal", "GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_sksi_web_page_subl_method_memoized", "GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "clear_get_results_from_sksi_web_page_subl_method_cached", "CLEAR-GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "remove_get_results_from_sksi_web_page_subl_method_cached", "REMOVE-GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_sksi_web_page_subl_method_cached_internal", "GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_sksi_web_page_subl_method_cached", "GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_sksi_web_page_subl_method_none", "GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-NONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_sksi_web_page_subl_method_int", "GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_tokenized_http_request_internal", "SKSI-TOKENIZED-HTTP-REQUEST-INTERNAL", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_tokenized_http_request", "SKSI-TOKENIZED-HTTP-REQUEST", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_results_from_subl_parsing_function", "GET-RESULTS-FROM-SUBL-PARSING-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_subl_parsing_program_p", "SKSI-SUBL-PARSING-PROGRAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_filter_result_set", "SKSI-FILTER-RESULT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "compute_selected_tuple", "COMPUTE-SELECTED-TUPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_kb_iterator_from_csql", "GENERATE-KB-ITERATOR-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_kb_boolean_from_csql", "GENERATE-KB-BOOLEAN-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_fht_iterator_from_csql", "GENERATE-FHT-ITERATOR-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_fht_boolean_from_csql", "GENERATE-FHT-BOOLEAN-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_cache_iterator_from_csql", "GENERATE-CACHE-ITERATOR-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_cache_boolean_from_csql", "GENERATE-CACHE-BOOLEAN-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_rdf_iterator_from_csql", "GENERATE-RDF-ITERATOR-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_rdf_boolean_from_csql", "GENERATE-RDF-BOOLEAN-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "generate_sparql_result_set_from_csql", "GENERATE-SPARQL-RESULT-SET-FROM-CSQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "new_sparql_result_set_iterator", "NEW-SPARQL-RESULT-SET-ITERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "make_sparql_result_set_iterator_state", "MAKE-SPARQL-RESULT-SET-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_result_set_iterator_done_p", "SPARQL-RESULT-SET-ITERATOR-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_result_set_iterator_next", "SPARQL-RESULT-SET-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "with_sksi_result_set_from_execute_query", "WITH-SKSI-RESULT-SET-FROM-EXECUTE-QUERY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sqls_query", "SKSI-EXECUTE-SQLS-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sqls_update", "SKSI-EXECUTE-SQLS-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_batch_sql_updates", "SKSI-EXECUTE-BATCH-SQL-UPDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_add_batch_sql_update", "SKSI-ADD-BATCH-SQL-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sql_query", "SKSI-EXECUTE-SQL-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sql_query_int", "SKSI-EXECUTE-SQL-QUERY-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_abort_and_release_sql_statement_and_connection", "SKSI-ABORT-AND-RELEASE-SQL-STATEMENT-AND-CONNECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sql_update", "SKSI-EXECUTE-SQL-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sql_update_int", "SKSI-EXECUTE-SQL-UPDATE-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_batch_execute_sql_statements", "SKSI-BATCH-EXECUTE-SQL-STATEMENTS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_n_largest_auto_generated_keys", "GET-N-LARGEST-AUTO-GENERATED-KEYS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sql_script_from_file", "SKSI-EXECUTE-SQL-SCRIPT-FROM-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_sql_script", "SKSI-EXECUTE-SQL-SCRIPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "open_sql_source", "OPEN-SQL-SOURCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_open_sql_connection_and_statement", "SKSI-OPEN-SQL-CONNECTION-AND-STATEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_abort_sql_statement_and_connection", "SKSI-ABORT-SQL-STATEMENT-AND-CONNECTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_abort_sql_statement", "SKSI-ABORT-SQL-STATEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_close_sql_statement_and_connection", "SKSI-CLOSE-SQL-STATEMENT-AND-CONNECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_close_sql_connection", "SKSI-CLOSE-SQL-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_result_iterator_from_fht_source", "GET-RESULT-ITERATOR-FROM-FHT-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_selected_field_type_from_csql", "GET-SELECTED-FIELD-TYPE-FROM-CSQL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_result_for_key_from_fht_source", "GET-RESULT-FOR-KEY-FROM-FHT-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_result_for_key_value_from_fht_source", "GET-RESULT-FOR-KEY-VALUE-FROM-FHT-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "put_key_value_under_key_in_fht_source", "PUT-KEY-VALUE-UNDER-KEY-IN-FHT-SOURCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "remove_key_value_under_key_in_fht_source", "REMOVE-KEY-VALUE-UNDER-KEY-IN-FHT-SOURCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "create_fht_source", "CREATE-FHT-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "open_fht_source", "OPEN-FHT-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "finalize_fht_source", "FINALIZE-FHT-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "cache_sql_connection_statement_for_result_set", "CACHE-SQL-CONNECTION-STATEMENT-FOR-RESULT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "uncache_sql_connection_statement_for_result_set", "UNCACHE-SQL-CONNECTION-STATEMENT-FOR-RESULT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_sql_connection_statement_for_result_set", "GET-SQL-CONNECTION-STATEMENT-FOR-RESULT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "clear_cached_get_result_set_from_sql_source", "CLEAR-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "remove_cached_get_result_set_from_sql_source", "REMOVE-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "cached_get_result_set_from_sql_source_internal", "CACHED-GET-RESULT-SET-FROM-SQL-SOURCE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "cached_get_result_set_from_sql_source", "CACHED-GET-RESULT-SET-FROM-SQL-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_result_set_from_sql_source", "GET-RESULT-SET-FROM-SQL-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_result_set_from_sparql_source", "GET-RESULT-SET-FROM-SPARQL-SOURCE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_result_set_from_sparql_source_guts", "GET-RESULT-SET-FROM-SPARQL-SOURCE-GUTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_oracle_subprotocolP", "SPARQL-ORACLE-SUBPROTOCOL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_request_query_ticket", "SPARQL-REQUEST-QUERY-TICKET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_triclops_request_query_ticket", "SPARQL-TRICLOPS-REQUEST-QUERY-TICKET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_oracle_joseki_request_query_ticket", "SPARQL-ORACLE-JOSEKI-REQUEST-QUERY-TICKET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_oracle_sesame_request_query_ticket", "SPARQL-ORACLE-SESAME-REQUEST-QUERY-TICKET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "preprocess_sparql_for_backend", "PREPROCESS-SPARQL-FOR-BACKEND", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "compute_sparql_oracle_prefix_pragma", "COMPUTE-SPARQL-ORACLE-PREFIX-PRAGMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "compute_sparql_oracle_query_timeout", "COMPUTE-SPARQL-ORACLE-QUERY-TIMEOUT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "close_sparql_result_stream", "CLOSE-SPARQL-RESULT-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_abort_query", "SPARQL-ABORT-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "test_sparql_abort_query", "TEST-SPARQL-ABORT-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "clear_cached_get_result_set_from_sparql_source", "CLEAR-CACHED-GET-RESULT-SET-FROM-SPARQL-SOURCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "remove_cached_get_result_set_from_sparql_source", "REMOVE-CACHED-GET-RESULT-SET-FROM-SPARQL-SOURCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "cached_get_result_set_from_sparql_source_internal", "CACHED-GET-RESULT-SET-FROM-SPARQL-SOURCE-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "cached_get_result_set_from_sparql_source", "CACHED-GET-RESULT-SET-FROM-SPARQL-SOURCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "save_sparql_result_set_cache", "SAVE-SPARQL-RESULT-SET-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "load_sparql_result_set_cache", "LOAD-SPARQL-RESULT-SET-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_extract_variable_names", "SPARQL-EXTRACT-VARIABLE-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_query_xml_tokens", "SPARQL-QUERY-XML-TOKENS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "open_sparql_query_result_stream", "OPEN-SPARQL-QUERY-RESULT-STREAM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "stream_wait_until_read_char", "STREAM-WAIT-UNTIL-READ-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_test", "SPARQL-TEST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_test_result_set", "SPARQL-TEST-RESULT-SET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_extract_booleanP", "SPARQL-EXTRACT-BOOLEAN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_extract_rdf_prefix_map", "SPARQL-EXTRACT-RDF-PREFIX-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_extract_rdf_base", "SPARQL-EXTRACT-RDF-BASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sparql_prefix_map_to_minimal_access_path", "SPARQL-PREFIX-MAP-TO-MINIMAL-ACCESS-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_sparql_xml_tokens_to_result_set", "SKSI-SPARQL-XML-TOKENS-TO-RESULT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "test_sksi_ist_graph", "TEST-SKSI-IST-GRAPH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_unreachable_db_sks_error", "SKSI-UNREACHABLE-DB-SKS-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_db_execution_error", "SKSI-DB-EXECUTION-ERROR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_unreachable_fht_sks_error", "SKSI-UNREACHABLE-FHT-SKS-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_create_fht_sks_error", "SKSI-CREATE-FHT-SKS-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "all_structured_knowledge_sources_assumed_availableP", "ALL-STRUCTURED-KNOWLEDGE-SOURCES-ASSUMED-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "note_sks_available", "NOTE-SKS-AVAILABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "unnote_sks_available", "UNNOTE-SKS-AVAILABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sks_assumed_availableP", "SKS-ASSUMED-AVAILABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_sks_error", "SKSI-SKS-ERROR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_unreachable_sks_error", "SKSI-UNREACHABLE-SKS-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_sks_execution_error", "SKSI-SKS-EXECUTION-ERROR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_sql_connection_and_statement", "GET-SQL-CONNECTION-AND-STATEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "release_sql_connection_and_statement", "RELEASE-SQL-CONNECTION-AND-STATEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "within_sksi_sql_connection_resourcingP", "WITHIN-SKSI-SQL-CONNECTION-RESOURCING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "within_sksi_local_resourcingP", "WITHIN-SKSI-LOCAL-RESOURCING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_sql_connection_and_statement_from_local_cache", "GET-SQL-CONNECTION-AND-STATEMENT-FROM-LOCAL-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_sql_connection_from_local_cache", "GET-SQL-CONNECTION-FROM-LOCAL-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_sql_statement_from_local_cache", "GET-SQL-STATEMENT-FROM-LOCAL-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "release_sql_connection_and_statement_to_local_cache", "RELEASE-SQL-CONNECTION-AND-STATEMENT-TO-LOCAL-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "finalize_sql_connection_and_statement_cache", "FINALIZE-SQL-CONNECTION-AND-STATEMENT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "within_sksi_global_resourcingP", "WITHIN-SKSI-GLOBAL-RESOURCING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_global_resourcing_initializedP", "SKSI-GLOBAL-RESOURCING-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_print_function_trampoline", "SKSI-RESOURCING-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_p", "SKSI-RESOURCING-CACHE-P", 1, 0, false);
        new $sksi_resourcing_cache_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_connections", "SKSI-RESOURCING-CACHE-CONNECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_statements", "SKSI-RESOURCING-CACHE-STATEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_used_statements", "SKSI-RESOURCING-CACHE-USED-STATEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_access_times", "SKSI-RESOURCING-CACHE-ACCESS-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_lock", "SKSI-RESOURCING-CACHE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_max_pool_size", "SKSI-RESOURCING-CACHE-MAX-POOL-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourcing_cache_max_idle", "SKSI-RESOURCING-CACHE-MAX-IDLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "_csetf_sksi_resourcing_cache_connections", "_CSETF-SKSI-RESOURCING-CACHE-CONNECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "_csetf_sksi_resourcing_cache_statements", "_CSETF-SKSI-RESOURCING-CACHE-STATEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "_csetf_sksi_resourcing_cache_used_statements", "_CSETF-SKSI-RESOURCING-CACHE-USED-STATEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "_csetf_sksi_resourcing_cache_access_times", "_CSETF-SKSI-RESOURCING-CACHE-ACCESS-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "_csetf_sksi_resourcing_cache_lock", "_CSETF-SKSI-RESOURCING-CACHE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "_csetf_sksi_resourcing_cache_max_pool_size", "_CSETF-SKSI-RESOURCING-CACHE-MAX-POOL-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "_csetf_sksi_resourcing_cache_max_idle", "_CSETF-SKSI-RESOURCING-CACHE-MAX-IDLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "make_sksi_resourcing_cache", "MAKE-SKSI-RESOURCING-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "visit_defstruct_sksi_resourcing_cache", "VISIT-DEFSTRUCT-SKSI-RESOURCING-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "visit_defstruct_object_sksi_resourcing_cache_method", "VISIT-DEFSTRUCT-OBJECT-SKSI-RESOURCING-CACHE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "new_sksi_resourcing_cache", "NEW-SKSI-RESOURCING-CACHE", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "with_sksi_global_resourcing_lock_held", "WITH-SKSI-GLOBAL-RESOURCING-LOCK-HELD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_add_connection_to_cache", "SKSI-ADD-CONNECTION-TO-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_add_statement_to_cache", "SKSI-ADD-STATEMENT-TO-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_note_access_time_in_cache", "SKSI-NOTE-ACCESS-TIME-IN-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_retrieve_connection_from_cache", "SKSI-RETRIEVE-CONNECTION-FROM-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_retrieve_statement_from_cache", "SKSI-RETRIEVE-STATEMENT-FROM-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_add_statement_to_used_statements_set", "SKSI-ADD-STATEMENT-TO-USED-STATEMENTS-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_last_cache_access_time", "SKSI-LAST-CACHE-ACCESS-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_generate_cache_key_from_access_path", "SKSI-GENERATE-CACHE-KEY-FROM-ACCESS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_sql_connection_and_statement_from_global_cache", "GET-SQL-CONNECTION-AND-STATEMENT-FROM-GLOBAL-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "release_sql_connection_and_statement_to_global_cache", "RELEASE-SQL-CONNECTION-AND-STATEMENT-TO-GLOBAL-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourced_connection_has_active_statementsP", "SKSI-RESOURCED-CONNECTION-HAS-ACTIVE-STATEMENTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_resourced_connection_idle_too_longP", "SKSI-RESOURCED-CONNECTION-IDLE-TOO-LONG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_initialize_global_resourcing", "SKSI-INITIALIZE-GLOBAL-RESOURCING", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_finalize_global_resourcing", "SKSI-FINALIZE-GLOBAL-RESOURCING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_close_resourced_connections", "SKSI-CLOSE-RESOURCED-CONNECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_close_resourced_connections_for_sks", "SKSI-CLOSE-RESOURCED-CONNECTIONS-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_reset_global_resourcing_max_idle_time", "SKSI-RESET-GLOBAL-RESOURCING-MAX-IDLE-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_possibly_reap_connections", "SKSI-POSSIBLY-REAP-CONNECTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_reap_connection_for_access_path", "SKSI-REAP-CONNECTION-FOR-ACCESS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_possibly_remove_from_resourcing_cacheP", "SKSI-POSSIBLY-REMOVE-FROM-RESOURCING-CACHE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_reap_connection", "SKSI-REAP-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sk_source_status_fast", "SK-SOURCE-STATUS-FAST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "get_rs_iterator_for_sql_query_from_db_sks", "GET-RS-ITERATOR-FOR-SQL-QUERY-FROM-DB-SKS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_db_sks_update", "SKSI-EXECUTE-DB-SKS-UPDATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_db_sks_update_in_mapping_mt", "SKSI-EXECUTE-DB-SKS-UPDATE-IN-MAPPING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_csql", "SKSI-EXECUTE-CSQL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_execute_csql_in_mapping_mt", "SKSI-EXECUTE-CSQL-IN-MAPPING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_tactic_p", "SKSI-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "inference_possibly_note_salient_sksi_query_string", "INFERENCE-POSSIBLY-NOTE-SALIENT-SKSI-QUERY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "memoized_salient_sksi_query_string_internal", "MEMOIZED-SALIENT-SKSI-QUERY-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "memoized_salient_sksi_query_string", "MEMOIZED-SALIENT-SKSI-QUERY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_tactic_salient_query_string", "SKSI-TACTIC-SALIENT-QUERY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction", "sksi_tactic_note_salient_query_string", "SKSI-TACTIC-NOTE-SALIENT-QUERY-STRING", 2, 0, false);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    public static SubLObject init_sksi_sks_interaction_file() {
        sksi_sks_interaction.$sksi_http_request_caching_strategy$ = SubLFiles.defparameter("*SKSI-HTTP-REQUEST-CACHING-STRATEGY*", (SubLObject)sksi_sks_interaction.$kw39$MEMOIZE);
        sksi_sks_interaction.$get_results_from_sksi_web_page_subl_method_cached_caching_state$ = SubLFiles.deflexical("*GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED-CACHING-STATE*", (SubLObject)sksi_sks_interaction.NIL);
        sksi_sks_interaction.$sksi_http_request_keep_alive$ = SubLFiles.defparameter("*SKSI-HTTP-REQUEST-KEEP-ALIVE*", (SubLObject)sksi_sks_interaction.T);
        sksi_sks_interaction.$sksi_http_request_wide_newlines$ = SubLFiles.defparameter("*SKSI-HTTP-REQUEST-WIDE-NEWLINES*", (SubLObject)sksi_sks_interaction.T);
        sksi_sks_interaction.$sksi_sparql_request_wide_newlines$ = SubLFiles.defparameter("*SKSI-SPARQL-REQUEST-WIDE-NEWLINES*", (SubLObject)sksi_sks_interaction.T);
        sksi_sks_interaction.$sksi_http_request_open_connection_timeout$ = SubLFiles.defparameter("*SKSI-HTTP-REQUEST-OPEN-CONNECTION-TIMEOUT*", (SubLObject)sksi_sks_interaction.ONE_INTEGER);
        sksi_sks_interaction.$sksi_http_request_overall_timeout$ = SubLFiles.defparameter("*SKSI-HTTP-REQUEST-OVERALL-TIMEOUT*", (SubLObject)sksi_sks_interaction.$int46$30);
        sksi_sks_interaction.$sksi_http_automatically_redirect$ = SubLFiles.defparameter("*SKSI-HTTP-AUTOMATICALLY-REDIRECT*", (SubLObject)sksi_sks_interaction.T);
        sksi_sks_interaction.$oracle_sparql_progress_stream$ = SubLFiles.defvar("*ORACLE-SPARQL-PROGRESS-STREAM*", (SubLObject)sksi_sks_interaction.NIL);
        sksi_sks_interaction.$sksi_sparql_iterativity_limits$ = SubLFiles.defparameter("*SKSI-SPARQL-ITERATIVITY-LIMITS*", (SubLObject)sksi_sks_interaction.$list70);
        sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$ = SubLFiles.defparameter("*SKSI-OPEN-SQL-CONNECTION-DEFAULT-TIMEOUT*", (SubLObject)sksi_sks_interaction.THREE_INTEGER);
        sksi_sks_interaction.$sksi_open_web_connection_default_timeout$ = SubLFiles.defparameter("*SKSI-OPEN-WEB-CONNECTION-DEFAULT-TIMEOUT*", (SubLObject)sksi_sks_interaction.TEN_INTEGER);
        sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$ = SubLFiles.defparameter("*SKSI-OPEN-SQL-SOURCE-DEFAULT-MAX-TRIES*", (SubLObject)sksi_sks_interaction.TEN_INTEGER);
        sksi_sks_interaction.$sksi_open_sql_source_default_interval$ = SubLFiles.defparameter("*SKSI-OPEN-SQL-SOURCE-DEFAULT-INTERVAL*", (SubLObject)sksi_sks_interaction.$float120$0_1);
        sksi_sks_interaction.$sksi_fht_source_default_size$ = SubLFiles.deflexical("*SKSI-FHT-SOURCE-DEFAULT-SIZE*", (SubLObject)sksi_sks_interaction.$int129$32);
        sksi_sks_interaction.$sksi_fht_source_default_average_bucket_size$ = SubLFiles.deflexical("*SKSI-FHT-SOURCE-DEFAULT-AVERAGE-BUCKET-SIZE*", (SubLObject)sksi_sks_interaction.$int130$256);
        sksi_sks_interaction.$result_set_sql_connection_statement_cache$ = SubLFiles.deflexical("*RESULT-SET-SQL-CONNECTION-STATEMENT-CACHE*", (sksi_sks_interaction.NIL != Symbols.boundp((SubLObject)sksi_sks_interaction.$sym132$_RESULT_SET_SQL_CONNECTION_STATEMENT_CACHE_)) ? sksi_sks_interaction.$result_set_sql_connection_statement_cache$.getGlobalValue() : dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQ), (SubLObject)sksi_sks_interaction.UNPROVIDED));
        sksi_sks_interaction.$cached_get_result_set_from_sql_source_caching_state$ = SubLFiles.deflexical("*CACHED-GET-RESULT-SET-FROM-SQL-SOURCE-CACHING-STATE*", (SubLObject)sksi_sks_interaction.NIL);
        sksi_sks_interaction.$sksi_sparql_request_open_connection_timeout$ = SubLFiles.defparameter("*SKSI-SPARQL-REQUEST-OPEN-CONNECTION-TIMEOUT*", (SubLObject)sksi_sks_interaction.FIVE_INTEGER);
        sksi_sks_interaction.$sksi_sparql_request_overall_timeout$ = SubLFiles.defparameter("*SKSI-SPARQL-REQUEST-OVERALL-TIMEOUT*", (SubLObject)sksi_sks_interaction.$int136$3600);
        sksi_sks_interaction.$query_interrupt_on_sparql_execution$ = SubLFiles.defvar("*QUERY-INTERRUPT-ON-SPARQL-EXECUTION*", (SubLObject)sksi_sks_interaction.NIL);
        sksi_sks_interaction.$sparql_evaluation_enabledP$ = SubLFiles.defvar("*SPARQL-EVALUATION-ENABLED?*", (SubLObject)sksi_sks_interaction.T);
        sksi_sks_interaction.$sparql_result_stream_iterator_enabledP$ = SubLFiles.defvar("*SPARQL-RESULT-STREAM-ITERATOR-ENABLED?*", (SubLObject)sksi_sks_interaction.T);
        sksi_sks_interaction.$sparql_oracle_joseki_subprotocol$ = SubLFiles.defconstant("*SPARQL-ORACLE-JOSEKI-SUBPROTOCOL*", (SubLObject)sksi_sks_interaction.$str140$oracle_joseki);
        sksi_sks_interaction.$sparql_oracle_sesame_subprotocol$ = SubLFiles.defconstant("*SPARQL-ORACLE-SESAME-SUBPROTOCOL*", (SubLObject)sksi_sks_interaction.$str141$oracle_sesame);
        sksi_sks_interaction.$sparql_triclops_subprotocol$ = SubLFiles.defconstant("*SPARQL-TRICLOPS-SUBPROTOCOL*", (SubLObject)sksi_sks_interaction.$str142$triclops);
        sksi_sks_interaction.$sparql_oracle_default_server_parallelism$ = SubLFiles.defparameter("*SPARQL-ORACLE-DEFAULT-SERVER-PARALLELISM*", (SubLObject)sksi_sks_interaction.FOUR_INTEGER);
        sksi_sks_interaction.$sparql_oracle_fs_prefix_pragma_template$ = SubLFiles.deflexical("*SPARQL-ORACLE-FS-PREFIX-PRAGMA-TEMPLATE*", (SubLObject)sksi_sks_interaction.$str149$http___oracle_com_semtech_ordered);
        sksi_sks_interaction.$sparql_oracle_ht_prefix_pragma_template$ = SubLFiles.deflexical("*SPARQL-ORACLE-HT-PREFIX-PRAGMA-TEMPLATE*", (SubLObject)sksi_sks_interaction.$str150$http___oracle_com_semtech_ALL_PUL);
        sksi_sks_interaction.$sparql_oracle_timeout$ = SubLFiles.defparameter("*SPARQL-ORACLE-TIMEOUT*", (SubLObject)sksi_sks_interaction.NIL);
        sksi_sks_interaction.$cached_get_result_set_from_sparql_source_caching_state$ = SubLFiles.deflexical("*CACHED-GET-RESULT-SET-FROM-SPARQL-SOURCE-CACHING-STATE*", (SubLObject)sksi_sks_interaction.NIL);
        sksi_sks_interaction.$access_path$ = SubLFiles.deflexical("*ACCESS-PATH*", (SubLObject)((sksi_sks_interaction.NIL != Symbols.boundp((SubLObject)sksi_sks_interaction.$sym183$_ACCESS_PATH_)) ? sksi_sks_interaction.$access_path$.getGlobalValue() : sksi_sks_interaction.NIL));
        sksi_sks_interaction.$structured_knowledge_sources_assumed_available$ = SubLFiles.deflexical("*STRUCTURED-KNOWLEDGE-SOURCES-ASSUMED-AVAILABLE*", (SubLObject)sksi_sks_interaction.NIL);
        sksi_sks_interaction.$sksi_sql_statement_pool_max_size$ = SubLFiles.deflexical("*SKSI-SQL-STATEMENT-POOL-MAX-SIZE*", (SubLObject)sksi_sks_interaction.TEN_INTEGER);
        sksi_sks_interaction.$sksi_resourcing_cache$ = SubLFiles.deflexical("*SKSI-RESOURCING-CACHE*", (SubLObject)((sksi_sks_interaction.NIL != Symbols.boundp((SubLObject)sksi_sks_interaction.$sym212$_SKSI_RESOURCING_CACHE_)) ? sksi_sks_interaction.$sksi_resourcing_cache$.getGlobalValue() : sksi_sks_interaction.NIL));
        sksi_sks_interaction.$sksi_global_resourcingP$ = SubLFiles.defparameter("*SKSI-GLOBAL-RESOURCING?*", (SubLObject)sksi_sks_interaction.T);
        sksi_sks_interaction.$sksi_default_connection_max_idle_seconds$ = SubLFiles.deflexical("*SKSI-DEFAULT-CONNECTION-MAX-IDLE-SECONDS*", (SubLObject)sksi_sks_interaction.$int213$600);
        sksi_sks_interaction.$dtp_sksi_resourcing_cache$ = SubLFiles.defconstant("*DTP-SKSI-RESOURCING-CACHE*", (SubLObject)sksi_sks_interaction.$sym214$SKSI_RESOURCING_CACHE);
        sksi_sks_interaction.$sksi_connection_global_cache_lock$ = SubLFiles.deflexical("*SKSI-CONNECTION-GLOBAL-CACHE-LOCK*", (sksi_sks_interaction.NIL != Symbols.boundp((SubLObject)sksi_sks_interaction.$sym253$_SKSI_CONNECTION_GLOBAL_CACHE_LOCK_)) ? sksi_sks_interaction.$sksi_connection_global_cache_lock$.getGlobalValue() : Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_sks_interaction.$str254$SKSI_SQL_global_connection_cache_))));
        sksi_sks_interaction.$sksi_salient_query_string$ = SubLFiles.defparameter("*SKSI-SALIENT-QUERY-STRING*", (SubLObject)sksi_sks_interaction.NIL);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    public static SubLObject setup_sksi_sks_interaction_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_sks_interaction.$sym42$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_MEMOIZED);
        memoization_state.note_globally_cached_function((SubLObject)sksi_sks_interaction.$sym43$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_CACHED);
        memoization_state.note_memoized_function((SubLObject)sksi_sks_interaction.$sym47$SKSI_TOKENIZED_HTTP_REQUEST);
        access_macros.register_external_symbol((SubLObject)sksi_sks_interaction.$sym116$SKSI_EXECUTE_SQL_SCRIPT_FROM_FILE);
        access_macros.register_external_symbol((SubLObject)sksi_sks_interaction.$sym118$SKSI_EXECUTE_SQL_SCRIPT);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_interaction.$sym132$_RESULT_SET_SQL_CONNECTION_STATEMENT_CACHE_);
        memoization_state.note_globally_cached_function((SubLObject)sksi_sks_interaction.$sym133$CACHED_GET_RESULT_SET_FROM_SQL_SOURCE);
        memoization_state.note_globally_cached_function((SubLObject)sksi_sks_interaction.$sym167$CACHED_GET_RESULT_SET_FROM_SPARQL_SOURCE);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_interaction.$sym183$_ACCESS_PATH_);
        generic_testing.define_test_case_table_int((SubLObject)sksi_sks_interaction.$sym192$TEST_SKSI_IST_GRAPH, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw193$TEST, Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUAL), sksi_sks_interaction.$kw194$OWNER, sksi_sks_interaction.NIL, sksi_sks_interaction.$kw195$CLASSES, sksi_sks_interaction.NIL, sksi_sks_interaction.$kw196$KB, sksi_sks_interaction.$kw197$TINY, sksi_sks_interaction.$kw198$WORKING_, sksi_sks_interaction.T }), (SubLObject)sksi_sks_interaction.$list199);
        generic_testing.define_test_case_table_int((SubLObject)sksi_sks_interaction.$sym200$SKSI_SPARQL_XML_TOKENS_TO_RESULT_SET, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw193$TEST, Symbols.symbol_function((SubLObject)sksi_sks_interaction.EQUAL), sksi_sks_interaction.$kw194$OWNER, sksi_sks_interaction.NIL, sksi_sks_interaction.$kw195$CLASSES, sksi_sks_interaction.NIL, sksi_sks_interaction.$kw196$KB, sksi_sks_interaction.$kw197$TINY, sksi_sks_interaction.$kw198$WORKING_, sksi_sks_interaction.T }), sksi_sks_interaction.$list201);
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_interaction.$sym212$_SKSI_RESOURCING_CACHE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_sks_interaction.$dtp_sksi_resourcing_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_interaction.$sym221$SKSI_RESOURCING_CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_sks_interaction.$list222);
        Structures.def_csetf((SubLObject)sksi_sks_interaction.$sym223$SKSI_RESOURCING_CACHE_CONNECTIONS, (SubLObject)sksi_sks_interaction.$sym224$_CSETF_SKSI_RESOURCING_CACHE_CONNECTIONS);
        Structures.def_csetf((SubLObject)sksi_sks_interaction.$sym225$SKSI_RESOURCING_CACHE_STATEMENTS, (SubLObject)sksi_sks_interaction.$sym226$_CSETF_SKSI_RESOURCING_CACHE_STATEMENTS);
        Structures.def_csetf((SubLObject)sksi_sks_interaction.$sym227$SKSI_RESOURCING_CACHE_USED_STATEMENTS, (SubLObject)sksi_sks_interaction.$sym228$_CSETF_SKSI_RESOURCING_CACHE_USED_STATEMENTS);
        Structures.def_csetf((SubLObject)sksi_sks_interaction.$sym229$SKSI_RESOURCING_CACHE_ACCESS_TIMES, (SubLObject)sksi_sks_interaction.$sym230$_CSETF_SKSI_RESOURCING_CACHE_ACCESS_TIMES);
        Structures.def_csetf((SubLObject)sksi_sks_interaction.$sym231$SKSI_RESOURCING_CACHE_LOCK, (SubLObject)sksi_sks_interaction.$sym232$_CSETF_SKSI_RESOURCING_CACHE_LOCK);
        Structures.def_csetf((SubLObject)sksi_sks_interaction.$sym233$SKSI_RESOURCING_CACHE_MAX_POOL_SIZE, (SubLObject)sksi_sks_interaction.$sym234$_CSETF_SKSI_RESOURCING_CACHE_MAX_POOL_SIZE);
        Structures.def_csetf((SubLObject)sksi_sks_interaction.$sym235$SKSI_RESOURCING_CACHE_MAX_IDLE, (SubLObject)sksi_sks_interaction.$sym236$_CSETF_SKSI_RESOURCING_CACHE_MAX_IDLE);
        Equality.identity((SubLObject)sksi_sks_interaction.$sym214$SKSI_RESOURCING_CACHE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_sks_interaction.$dtp_sksi_resourcing_cache$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_sks_interaction.$sym249$VISIT_DEFSTRUCT_OBJECT_SKSI_RESOURCING_CACHE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)sksi_sks_interaction.$sym253$_SKSI_CONNECTION_GLOBAL_CACHE_LOCK_);
        memoization_state.note_memoized_function((SubLObject)sksi_sks_interaction.$sym265$MEMOIZED_SALIENT_SKSI_QUERY_STRING);
        generic_testing.define_test_case_table_int((SubLObject)sksi_sks_interaction.$sym269$SPARQL_EXTRACT_VARIABLE_NAMES, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_sks_interaction.$kw193$TEST, sksi_sks_interaction.EQUAL, sksi_sks_interaction.$kw194$OWNER, sksi_sks_interaction.NIL, sksi_sks_interaction.$kw195$CLASSES, sksi_sks_interaction.NIL, sksi_sks_interaction.$kw196$KB, sksi_sks_interaction.$kw197$TINY, sksi_sks_interaction.$kw198$WORKING_, sksi_sks_interaction.T }), (SubLObject)sksi_sks_interaction.$list270);
        return (SubLObject)sksi_sks_interaction.NIL;
    }
    
    private static SubLObject _constant_201_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:05 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 393\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<literal>"), SubLObjectFactory.makeString("1885"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1885")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:08 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 313\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)sksi_sks_interaction.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:09 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 456\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#float\">"), SubLObjectFactory.makeString("78.04222106933594"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("78.04222106933594")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:23 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 456\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#float\">"), SubLObjectFactory.makeString("27.17416572570801"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("27.17416572570801")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)sksi_sks_interaction.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:32 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 448\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#date\">"), SubLObjectFactory.makeString("1998-07-21"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1998-07-21")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:37 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 418\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/Edinburgh"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/Edinburgh>")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:38 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 456\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"_star_fake\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"_star_fake\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), SubLObjectFactory.makeString("1"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("*")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.NIL))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:38 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 456\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"_star_fake\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"_star_fake\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), SubLObjectFactory.makeString("1"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("*")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.NIL))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:39 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 521\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/Brooklyn"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/New_York"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/Brooklyn>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/New_York>")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:39 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 518\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/England"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/London"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/England>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/London>")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:40 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 741\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/Acid_rock"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/Blues-rock"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/Hard_rock"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/Psychedelic_rock"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/Acid_rock>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/Blues-rock>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/Hard_rock>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/Psychedelic_rock>")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:41 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 456\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"_star_fake\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"_star_fake\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), SubLObjectFactory.makeString("1"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("*")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.NIL))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:41 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 422\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("http://dbpedia.org/resource/Truman_Capote"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<http://dbpedia.org/resource/Truman_Capote>")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:50:43 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 456\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"_star_fake\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"_star_fake\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), SubLObjectFactory.makeString("1"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("*")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_sks_interaction.NIL))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.1 200 OK\n\nServer: Virtuoso/05.09.3035 (Solaris) x86_64-sun-solaris2.10-64  VDB\n\nConnection: close\n\nDate: Fri, 23 Jan 2009 18:51:08 GMT\n\nAccept-Ranges: bytes\n\nContent-Type: application/sparql-results+xml; charset=UTF-8\n\nContent-Length: 448\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" ?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/2001/sw/DataAccess/rf1/result2.xsd\">"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<variable name=\"obj\"/>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"true\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n   "), SubLObjectFactory.makeString("<binding name=\"obj\">"), SubLObjectFactory.makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#date\">"), SubLObjectFactory.makeString("1923-11-18"), SubLObjectFactory.makeString("</literal>"), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("obj")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1923-11-18")))) });
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_sks_interaction_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_sks_interaction_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_sks_interaction_file();
    }
    
    static {
        me = (SubLFile)new sksi_sks_interaction();
        sksi_sks_interaction.$sksi_http_request_caching_strategy$ = null;
        sksi_sks_interaction.$get_results_from_sksi_web_page_subl_method_cached_caching_state$ = null;
        sksi_sks_interaction.$sksi_http_request_keep_alive$ = null;
        sksi_sks_interaction.$sksi_http_request_wide_newlines$ = null;
        sksi_sks_interaction.$sksi_sparql_request_wide_newlines$ = null;
        sksi_sks_interaction.$sksi_http_request_open_connection_timeout$ = null;
        sksi_sks_interaction.$sksi_http_request_overall_timeout$ = null;
        sksi_sks_interaction.$sksi_http_automatically_redirect$ = null;
        sksi_sks_interaction.$oracle_sparql_progress_stream$ = null;
        sksi_sks_interaction.$sksi_sparql_iterativity_limits$ = null;
        sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$ = null;
        sksi_sks_interaction.$sksi_open_web_connection_default_timeout$ = null;
        sksi_sks_interaction.$sksi_open_sql_source_default_max_tries$ = null;
        sksi_sks_interaction.$sksi_open_sql_source_default_interval$ = null;
        sksi_sks_interaction.$sksi_fht_source_default_size$ = null;
        sksi_sks_interaction.$sksi_fht_source_default_average_bucket_size$ = null;
        sksi_sks_interaction.$result_set_sql_connection_statement_cache$ = null;
        sksi_sks_interaction.$cached_get_result_set_from_sql_source_caching_state$ = null;
        sksi_sks_interaction.$sksi_sparql_request_open_connection_timeout$ = null;
        sksi_sks_interaction.$sksi_sparql_request_overall_timeout$ = null;
        sksi_sks_interaction.$query_interrupt_on_sparql_execution$ = null;
        sksi_sks_interaction.$sparql_evaluation_enabledP$ = null;
        sksi_sks_interaction.$sparql_result_stream_iterator_enabledP$ = null;
        sksi_sks_interaction.$sparql_oracle_joseki_subprotocol$ = null;
        sksi_sks_interaction.$sparql_oracle_sesame_subprotocol$ = null;
        sksi_sks_interaction.$sparql_triclops_subprotocol$ = null;
        sksi_sks_interaction.$sparql_oracle_default_server_parallelism$ = null;
        sksi_sks_interaction.$sparql_oracle_fs_prefix_pragma_template$ = null;
        sksi_sks_interaction.$sparql_oracle_ht_prefix_pragma_template$ = null;
        sksi_sks_interaction.$sparql_oracle_timeout$ = null;
        sksi_sks_interaction.$cached_get_result_set_from_sparql_source_caching_state$ = null;
        sksi_sks_interaction.$access_path$ = null;
        sksi_sks_interaction.$structured_knowledge_sources_assumed_available$ = null;
        sksi_sks_interaction.$sksi_sql_statement_pool_max_size$ = null;
        sksi_sks_interaction.$sksi_resourcing_cache$ = null;
        sksi_sks_interaction.$sksi_global_resourcingP$ = null;
        sksi_sks_interaction.$sksi_default_connection_max_idle_seconds$ = null;
        sksi_sks_interaction.$dtp_sksi_resourcing_cache$ = null;
        sksi_sks_interaction.$sksi_connection_global_cache_lock$ = null;
        sksi_sks_interaction.$sksi_salient_query_string$ = null;
        $kw0$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $const1$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $const2$WebPage_AIS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebPage-AIS"));
        $const3$CycKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycKB"));
        $const4$FileHashTable_File = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FileHashTable-File"));
        $const5$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $kw6$CACHE = SubLObjectFactory.makeKeyword("CACHE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHERE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-CLAUSES"));
        $kw9$WHERE = SubLObjectFactory.makeKeyword("WHERE");
        $str10$malformed_csql_subexpression__a__ = SubLObjectFactory.makeString("malformed csql subexpression ~a, expected :where");
        $const11$rowInSourceClaims = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rowInSourceClaims"));
        $kw12$CSQL = SubLObjectFactory.makeKeyword("CSQL");
        $const13$sourceClaims = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceClaims"));
        $const14$MSAccess = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MSAccess"));
        $const15$PostgreSQL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PostgreSQL"));
        $const16$MySQL_TheProgram = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MySQL-TheProgram"));
        $const17$ApacheDerby = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApacheDerby"));
        $const18$MSSQLServer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MSSQLServer"));
        $const19$IBM_DB2_TheProgram = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IBM-DB2-TheProgram"));
        $const20$Sybase_IQ = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sybase-IQ"));
        $const21$OracleDatabaseServer_TheProgram = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OracleDatabaseServer-TheProgram"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-CLAUSES"));
        $sym24$PHYSICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHERE-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $const26$CSQLStrictlyEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals"));
        $str27$time_to_support__S_operator = SubLObjectFactory.makeString("time to support ~S operator");
        $str28$No_default_value_provided_for__A = SubLObjectFactory.makeString("No default value provided for ~A");
        $kw29$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHERE-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHERE-FIELD-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-FIELD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $kw31$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $const32$CSQLAnd = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLAnd"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"));
        $sym34$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw35$SUBLBOOLEAN = SubLObjectFactory.makeKeyword("SUBLBOOLEAN");
        $kw36$SUBL = SubLObjectFactory.makeKeyword("SUBL");
        $kw37$SUBLUNBOUNDONLY = SubLObjectFactory.makeKeyword("SUBLUNBOUNDONLY");
        $str38$Parsing_method__S_is_not_yet_supp = SubLObjectFactory.makeString("Parsing method ~S is not yet supported");
        $kw39$MEMOIZE = SubLObjectFactory.makeKeyword("MEMOIZE");
        $kw40$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str41$_S_not_a_valid_value_for__sksi_ht = SubLObjectFactory.makeString("~S not a valid value for *sksi-http-request-caching-strategy*");
        $sym42$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_MEMOIZED = SubLObjectFactory.makeSymbol("GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-MEMOIZED");
        $sym43$GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_CACHED = SubLObjectFactory.makeSymbol("GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED");
        $sym44$_GET_RESULTS_FROM_SKSI_WEB_PAGE_SUBL_METHOD_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED-CACHING-STATE*");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SERVER"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("URL"), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"));
        $int46$30 = SubLObjectFactory.makeInteger(30);
        $sym47$SKSI_TOKENIZED_HTTP_REQUEST = SubLObjectFactory.makeSymbol("SKSI-TOKENIZED-HTTP-REQUEST");
        $kw48$GET = SubLObjectFactory.makeKeyword("GET");
        $int49$80 = SubLObjectFactory.makeInteger(80);
        $str50$http___ = SubLObjectFactory.makeString("http://");
        $str51$_ = SubLObjectFactory.makeString("?");
        $const52$salientURL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientURL"));
        $kw53$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw54$OPEN_CONNECTION = SubLObjectFactory.makeKeyword("OPEN-CONNECTION");
        $str55$Opening_the_TCP_connection_timed_ = SubLObjectFactory.makeString("Opening the TCP connection timed out.");
        $kw56$OVERALL = SubLObjectFactory.makeKeyword("OVERALL");
        $str57$The_HTTP_request_timed_out_ = SubLObjectFactory.makeString("The HTTP request timed out.");
        $sym58$SKSI_SUBL_PARSING_PROGRAM_P = SubLObjectFactory.makeSymbol("SKSI-SUBL-PARSING-PROGRAM-P");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPAND-SUBL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("PROGRAM-BODY"));
        $sym60$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym61$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $const62$ExpandSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $const63$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"));
        $kw65$SELECT = SubLObjectFactory.makeKeyword("SELECT");
        $str66$malformed_csql_expression__a = SubLObjectFactory.makeString("malformed csql expression ~a");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("Language_Spoken"));
        $str68$unknown_cache_for_csql__a_and_acc = SubLObjectFactory.makeString("unknown cache for csql ~a and access path ~a");
        $str69$___A____ = SubLObjectFactory.makeString("~&~A~%~%");
        $list70 = ConsesLow.list((SubLObject)sksi_sks_interaction.NIL);
        $sym71$SPARQL_RESULT_SET_ITERATOR_DONE_P = SubLObjectFactory.makeSymbol("SPARQL-RESULT-SET-ITERATOR-DONE-P");
        $sym72$SPARQL_RESULT_SET_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SPARQL-RESULT-SET-ITERATOR-NEXT");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENDING-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-LIMITS"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENDING-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("PENDING-LIMITS"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSED-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS-PATH"));
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-SET"), (SubLObject)SubLObjectFactory.makeSymbol("SQL-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS-PATH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym76$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym77$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym78$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym79$SKSI_EXECUTE_SQL_QUERY = SubLObjectFactory.makeSymbol("SKSI-EXECUTE-SQL-QUERY");
        $sym80$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym81$SQL_RESULT_SET_P = SubLObjectFactory.makeSymbol("SQL-RESULT-SET-P");
        $sym82$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str83$Problem_executing_query___a_ = SubLObjectFactory.makeString("Problem executing query: ~a.");
        $sym84$FINALIZE_RESULT_SET = SubLObjectFactory.makeSymbol("FINALIZE-RESULT-SET");
        $sym85$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym86$ACCESS_PATH_P = SubLObjectFactory.makeSymbol("ACCESS-PATH-P");
        $str87$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str88$Executing_SQL_____Source___S__ = SubLObjectFactory.makeString("Executing SQL ~%  Source: ~S~%");
        $str89$Module___S__ = SubLObjectFactory.makeString("Module: ~S~%");
        $str90$Query____S__ = SubLObjectFactory.makeString("Query:  ~S~%");
        $str91$Query_Result___S__ = SubLObjectFactory.makeString("Query Result: ~S~%");
        $str92$Executing_SQL_____Source___S____U = SubLObjectFactory.makeString("Executing SQL ~%  Source: ~S~%  Update:~% ~S~%");
        $str93$SQL_Update_Result___S__ = SubLObjectFactory.makeString("SQL Update Result: ~S~%");
        $str94$Batch_executing__s_SQL_statements = SubLObjectFactory.makeString("Batch executing ~s SQL statements.~% Source: ~s.~%");
        $kw95$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw96$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw97$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $kw98$PROXY_SERVER = SubLObjectFactory.makeKeyword("PROXY-SERVER");
        $kw99$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $kw100$THROW = SubLObjectFactory.makeKeyword("THROW");
        $sym101$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str102$LOCK_TABLE_ = SubLObjectFactory.makeString("LOCK TABLE ");
        $str103$_IN_EXCLUSIVE_MODE = SubLObjectFactory.makeString(" IN EXCLUSIVE MODE");
        $str104$_WRITE = SubLObjectFactory.makeString(" WRITE");
        $kw105$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $str106$Batch_execution_resulted_in_error = SubLObjectFactory.makeString("Batch execution resulted in error: ~s~%");
        $str107$Batch_execution_completed_success = SubLObjectFactory.makeString("Batch execution completed successfully.~%");
        $str108$SELECT_ = SubLObjectFactory.makeString("SELECT ");
        $str109$_FROM_ = SubLObjectFactory.makeString(" FROM ");
        $str110$_ORDER_BY_ = SubLObjectFactory.makeString(" ORDER BY ");
        $str111$_DESC_LIMIT_ = SubLObjectFactory.makeString(" DESC LIMIT ");
        $str112$SELECT___FROM__SELECT_ = SubLObjectFactory.makeString("SELECT * FROM (SELECT ");
        $str113$_DESC__WHERE_rownum_BETWEEN_ = SubLObjectFactory.makeString(" DESC) WHERE rownum BETWEEN ");
        $str114$_AND_ = SubLObjectFactory.makeString(" AND ");
        $str115$Auto_generated_key_retrieval_is_n = SubLObjectFactory.makeString("Auto-generated key retrieval is not yet supported for ~a");
        $sym116$SKSI_EXECUTE_SQL_SCRIPT_FROM_FILE = SubLObjectFactory.makeSymbol("SKSI-EXECUTE-SQL-SCRIPT-FROM-FILE");
        $list117 = ConsesLow.list((SubLObject)Characters.CHAR_semicolon);
        $sym118$SKSI_EXECUTE_SQL_SCRIPT = SubLObjectFactory.makeSymbol("SKSI-EXECUTE-SQL-SCRIPT");
        $str119$SELECT = SubLObjectFactory.makeString("SELECT");
        $float120$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $kw121$DBMS_PORT = SubLObjectFactory.makeKeyword("DBMS-PORT");
        $kw122$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw123$KEY_FIRST = SubLObjectFactory.makeKeyword("KEY-FIRST");
        $kw124$KEY_VALUE_FIRST = SubLObjectFactory.makeKeyword("KEY-VALUE-FIRST");
        $kw125$KEY = SubLObjectFactory.makeKeyword("KEY");
        $kw126$KEY_VALUE = SubLObjectFactory.makeKeyword("KEY-VALUE");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $sym128$CAR = SubLObjectFactory.makeSymbol("CAR");
        $int129$32 = SubLObjectFactory.makeInteger(32);
        $int130$256 = SubLObjectFactory.makeInteger(256);
        $str131$The_file_already_exists_ = SubLObjectFactory.makeString("The file already exists.");
        $sym132$_RESULT_SET_SQL_CONNECTION_STATEMENT_CACHE_ = SubLObjectFactory.makeSymbol("*RESULT-SET-SQL-CONNECTION-STATEMENT-CACHE*");
        $sym133$CACHED_GET_RESULT_SET_FROM_SQL_SOURCE = SubLObjectFactory.makeSymbol("CACHED-GET-RESULT-SET-FROM-SQL-SOURCE");
        $sym134$_CACHED_GET_RESULT_SET_FROM_SQL_SOURCE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-GET-RESULT-SET-FROM-SQL-SOURCE-CACHING-STATE*");
        $int135$500 = SubLObjectFactory.makeInteger(500);
        $int136$3600 = SubLObjectFactory.makeInteger(3600);
        $sym137$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $sym138$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $str139$ticket = SubLObjectFactory.makeString("ticket");
        $str140$oracle_joseki = SubLObjectFactory.makeString("oracle-joseki");
        $str141$oracle_sesame = SubLObjectFactory.makeString("oracle-sesame");
        $str142$triclops = SubLObjectFactory.makeString("triclops");
        $str143$_ticket = SubLObjectFactory.makeString("/ticket");
        $str144$type_id = SubLObjectFactory.makeString("type=id");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/plan"), (SubLObject)SubLObjectFactory.makeString("text/html"));
        $sym146$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)sksi_sks_interaction.NIL);
        $str148$_A = SubLObjectFactory.makeString("~A");
        $str149$http___oracle_com_semtech_ordered = SubLObjectFactory.makeString("http://oracle.com/semtech#ordered,s2s,plain_sql_opt=f,ods=4,qid=~A~A~A");
        $str150$http___oracle_com_semtech_ALL_PUL = SubLObjectFactory.makeString("http://oracle.com/semtech#ALL_PULL_PARENT_BGP,ALL_BGP_HASH,ALL_ORDERED,NO_PUSH_VALUE");
        $str151$ORACLE_SEM_FS_NS = SubLObjectFactory.makeString("ORACLE_SEM_FS_NS");
        $str152$_timeout_ = SubLObjectFactory.makeString(",timeout=");
        $str153$ = SubLObjectFactory.makeString("");
        $str154$_dop_ = SubLObjectFactory.makeString(",dop=");
        $str155$ORACLE_SEM_HT_NS = SubLObjectFactory.makeString("ORACLE_SEM_HT_NS");
        $str156$_joseki_querymgt = SubLObjectFactory.makeString("/joseki/querymgt");
        $str157$abortqid_ = SubLObjectFactory.makeString("abortqid=");
        $str158$_openrdf_sesame_querymgt = SubLObjectFactory.makeString("/openrdf-sesame/querymgt");
        $str159$_processes = SubLObjectFactory.makeString("/processes");
        $str160$ticket_ = SubLObjectFactory.makeString("ticket=");
        $kw161$POST = SubLObjectFactory.makeKeyword("POST");
        $kw162$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw163$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw164$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw165$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw166$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $sym167$CACHED_GET_RESULT_SET_FROM_SPARQL_SOURCE = SubLObjectFactory.makeSymbol("CACHED-GET-RESULT-SET-FROM-SPARQL-SOURCE");
        $sym168$_CACHED_GET_RESULT_SET_FROM_SPARQL_SOURCE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-GET-RESULT-SET-FROM-SPARQL-SOURCE-CACHING-STATE*");
        $str169$Needs_to_be_re_implemented_withou = SubLObjectFactory.makeString("Needs to be re-implemented without function caching macros.");
        $str170$WHERE = SubLObjectFactory.makeString("WHERE");
        $list171 = ConsesLow.list((SubLObject)Characters.CHAR_space);
        $list172 = ConsesLow.list((SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_dollar);
        $str173$query_ = SubLObjectFactory.makeString("query=");
        $str174$jonny2_cyc_com = SubLObjectFactory.makeString("jonny2.cyc.com");
        $int175$8080 = SubLObjectFactory.makeInteger(8080);
        $str176$_SemanticDB_SPARQL_ = SubLObjectFactory.makeString("/SemanticDB/SPARQL/");
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application/sparql-results+xml"), (SubLObject)SubLObjectFactory.makeString("application/xml"));
        $str178$sparql_query_xml_tokens_error___S = SubLObjectFactory.makeString("sparql-query-xml-tokens error (~S ~S)");
        $str179$query = SubLObjectFactory.makeString("query");
        $kw180$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw181$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw182$URL = SubLObjectFactory.makeKeyword("URL");
        $sym183$_ACCESS_PATH_ = SubLObjectFactory.makeSymbol("*ACCESS-PATH*");
        $str184$ASK__ = SubLObjectFactory.makeString("ASK {");
        $list185 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("owl"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/07/owl#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ptrec"), (SubLObject)SubLObjectFactory.makeString("tag:info@semanticdb.ccf.org,2007:PatientRecordTerms#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xsd"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#")));
        $str186$http___www_clevelandclinic_org_he = SubLObjectFactory.makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#");
        $const187$baseNamespaceForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baseNamespaceForSKS"));
        $const188$nameSpacePrefixForSKS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpacePrefixForSKS"));
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("CONTEXT"));
        $str190$_sparql = SubLObjectFactory.makeString("<sparql");
        $str191$results = SubLObjectFactory.makeString("results");
        $sym192$TEST_SKSI_IST_GRAPH = SubLObjectFactory.makeSymbol("TEST-SKSI-IST-GRAPH");
        $kw193$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw194$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw195$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw196$KB = SubLObjectFactory.makeKeyword("KB");
        $kw197$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw198$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("HTTP/1.0 200 OK\n\nServer: SimpleHTTP/0.6 Python/2.4.2\n\nDate: Fri, 23 Jan 2009 20:55:16 GMT\n\nContent-type: application/xml\n\nContent-Length: 428\n\n\n\n"), SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<?xml-stylesheet type='text/xml' href='/xslt/xml-to-html.xslt'?>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("<sparql xmlns=\"http://www.w3.org/2005/sparql-results#\">"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<head>"), SubLObjectFactory.makeString("\n    "), SubLObjectFactory.makeString("<variable name=\"CONTEXT\"/>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</head>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("<results distinct=\"false\" ordered=\"false\">"), SubLObjectFactory.makeString("\n    "), SubLObjectFactory.makeString("<result>"), SubLObjectFactory.makeString("\n      "), SubLObjectFactory.makeString("<binding name=\"CONTEXT\">"), SubLObjectFactory.makeString("\n        "), SubLObjectFactory.makeString("<uri>"), SubLObjectFactory.makeString("ahttp://semanticdb.ccf.org/SemanticDB/CVIR/39932466.xml"), SubLObjectFactory.makeString("</uri>"), SubLObjectFactory.makeString("\n      "), SubLObjectFactory.makeString("</binding>"), SubLObjectFactory.makeString("\n    "), SubLObjectFactory.makeString("</result>"), SubLObjectFactory.makeString("\n  "), SubLObjectFactory.makeString("</results>"), SubLObjectFactory.makeString("\n"), SubLObjectFactory.makeString("</sparql>"), SubLObjectFactory.makeString("\n") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("CONTEXT")), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("csqr"), (SubLObject)SubLObjectFactory.makeString("tag:info@semanticdb.ccf.org,2008:CardiacSurgeryQualityReport#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cyc"), (SubLObject)SubLObjectFactory.makeString("http://sw.cyc.com/2006/07/27/cyc#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("dnode"), (SubLObject)SubLObjectFactory.makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("owl"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/07/owl#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ptrec"), (SubLObject)SubLObjectFactory.makeString("tag:info@semanticdb.ccf.org,2007:PatientRecordTerms#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sts"), (SubLObject)SubLObjectFactory.makeString("tag:info@semanticdb.ccf.org,2008:STS.2.61#")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xsd"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#")) })), (SubLObject)SubLObjectFactory.makeString("<ahttp://semanticdb.ccf.org/SemanticDB/CVIR/39932466.xml>")));
        $sym200$SKSI_SPARQL_XML_TOKENS_TO_RESULT_SET = SubLObjectFactory.makeSymbol("SKSI-SPARQL-XML-TOKENS-TO-RESULT-SET");
        $list201 = _constant_201_initializer();
        $str202$File_hash_table_does_not_exist_ = SubLObjectFactory.makeString("File hash table does not exist.");
        $str203$The_following_problem_was_encount = SubLObjectFactory.makeString("The following problem was encountered while trying to create the knowledge source ~A :~%");
        $str204$__The_following_problem_was_encou = SubLObjectFactory.makeString("~%The following problem was encountered while trying to execute the following statement in the knowledge source ~A :~%~A~%");
        $str205$__The_following_problem_was_encou = SubLObjectFactory.makeString("~%The following problem was encountered while trying to access the knowledge source ~A :~%");
        $str206$Continue_without_accessing_ = SubLObjectFactory.makeString("Continue without accessing ");
        $str207$_ = SubLObjectFactory.makeString(".");
        $kw208$UNREACHABLE = SubLObjectFactory.makeKeyword("UNREACHABLE");
        $kw209$DB_EXECUTION = SubLObjectFactory.makeKeyword("DB-EXECUTION");
        $kw210$SKS_EXECUTION = SubLObjectFactory.makeKeyword("SKS-EXECUTION");
        $kw211$SKS = SubLObjectFactory.makeKeyword("SKS");
        $sym212$_SKSI_RESOURCING_CACHE_ = SubLObjectFactory.makeSymbol("*SKSI-RESOURCING-CACHE*");
        $int213$600 = SubLObjectFactory.makeInteger(600);
        $sym214$SKSI_RESOURCING_CACHE = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE");
        $sym215$SKSI_RESOURCING_CACHE_P = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-P");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONNECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("STATEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("USED-STATEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS-TIMES"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-POOL-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-IDLE"));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONNECTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("STATEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("USED-STATEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-TIMES"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-POOL-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-IDLE"));
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-CONNECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-STATEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-USED-STATEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-ACCESS-TIMES"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-MAX-POOL-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-MAX-IDLE"));
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-CONNECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-STATEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-USED-STATEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-ACCESS-TIMES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-MAX-POOL-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-MAX-IDLE"));
        $sym220$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym221$SKSI_RESOURCING_CACHE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-PRINT-FUNCTION-TRAMPOLINE");
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-P"));
        $sym223$SKSI_RESOURCING_CACHE_CONNECTIONS = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-CONNECTIONS");
        $sym224$_CSETF_SKSI_RESOURCING_CACHE_CONNECTIONS = SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-CONNECTIONS");
        $sym225$SKSI_RESOURCING_CACHE_STATEMENTS = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-STATEMENTS");
        $sym226$_CSETF_SKSI_RESOURCING_CACHE_STATEMENTS = SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-STATEMENTS");
        $sym227$SKSI_RESOURCING_CACHE_USED_STATEMENTS = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-USED-STATEMENTS");
        $sym228$_CSETF_SKSI_RESOURCING_CACHE_USED_STATEMENTS = SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-USED-STATEMENTS");
        $sym229$SKSI_RESOURCING_CACHE_ACCESS_TIMES = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-ACCESS-TIMES");
        $sym230$_CSETF_SKSI_RESOURCING_CACHE_ACCESS_TIMES = SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-ACCESS-TIMES");
        $sym231$SKSI_RESOURCING_CACHE_LOCK = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-LOCK");
        $sym232$_CSETF_SKSI_RESOURCING_CACHE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-LOCK");
        $sym233$SKSI_RESOURCING_CACHE_MAX_POOL_SIZE = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-MAX-POOL-SIZE");
        $sym234$_CSETF_SKSI_RESOURCING_CACHE_MAX_POOL_SIZE = SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-MAX-POOL-SIZE");
        $sym235$SKSI_RESOURCING_CACHE_MAX_IDLE = SubLObjectFactory.makeSymbol("SKSI-RESOURCING-CACHE-MAX-IDLE");
        $sym236$_CSETF_SKSI_RESOURCING_CACHE_MAX_IDLE = SubLObjectFactory.makeSymbol("_CSETF-SKSI-RESOURCING-CACHE-MAX-IDLE");
        $kw237$CONNECTIONS = SubLObjectFactory.makeKeyword("CONNECTIONS");
        $kw238$STATEMENTS = SubLObjectFactory.makeKeyword("STATEMENTS");
        $kw239$USED_STATEMENTS = SubLObjectFactory.makeKeyword("USED-STATEMENTS");
        $kw240$ACCESS_TIMES = SubLObjectFactory.makeKeyword("ACCESS-TIMES");
        $kw241$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw242$MAX_POOL_SIZE = SubLObjectFactory.makeKeyword("MAX-POOL-SIZE");
        $kw243$MAX_IDLE = SubLObjectFactory.makeKeyword("MAX-IDLE");
        $str244$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw245$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym246$MAKE_SKSI_RESOURCING_CACHE = SubLObjectFactory.makeSymbol("MAKE-SKSI-RESOURCING-CACHE");
        $kw247$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw248$END = SubLObjectFactory.makeKeyword("END");
        $sym249$VISIT_DEFSTRUCT_OBJECT_SKSI_RESOURCING_CACHE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKSI-RESOURCING-CACHE-METHOD");
        $str250$SKSI_SQL_resourcing_cache_ = SubLObjectFactory.makeString("SKSI SQL resourcing cache ");
        $list251 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym252$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym253$_SKSI_CONNECTION_GLOBAL_CACHE_LOCK_ = SubLObjectFactory.makeSymbol("*SKSI-CONNECTION-GLOBAL-CACHE-LOCK*");
        $str254$SKSI_SQL_global_connection_cache_ = SubLObjectFactory.makeString("SKSI SQL global connection cache lock ");
        $sym255$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw256$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym257$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $float258$0_2 = (SubLFloat)SubLObjectFactory.makeDouble(0.2);
        $kw259$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym260$VALID_SKSI_ERROR_HANDLING_MODE_P = SubLObjectFactory.makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P");
        $kw261$UP = SubLObjectFactory.makeKeyword("UP");
        $kw262$DOWN = SubLObjectFactory.makeKeyword("DOWN");
        $list263 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE"));
        $kw264$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $sym265$MEMOIZED_SALIENT_SKSI_QUERY_STRING = SubLObjectFactory.makeSymbol("MEMOIZED-SALIENT-SKSI-QUERY-STRING");
        $sym266$SKSI_TACTIC_P = SubLObjectFactory.makeSymbol("SKSI-TACTIC-P");
        $kw267$EXECUTED_OR_IN_PROGRESS = SubLObjectFactory.makeKeyword("EXECUTED-OR-IN-PROGRESS");
        $sym268$TACTIC_P = SubLObjectFactory.makeSymbol("TACTIC-P");
        $sym269$SPARQL_EXTRACT_VARIABLE_NAMES = SubLObjectFactory.makeSymbol("SPARQL-EXTRACT-VARIABLE-NAMES");
        $list270 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("BASE <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#>\nPREFIX owl: <http://www.w3.org/2000/07/owl#>\nPREFIX ptrec: <tag:info@semanticdb.ccf.org,2007:PatientRecordTerms#>\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\nPREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\nSELECT ?VAR0 ?VAR1 ?VAR2 ?VAR3\nWHERE {\n  ?VAR0 ptrec:hasCoronaryBypassConduit  \"internal thoracic artery\" .\n  ?VAR1 <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#contains> ?VAR0 .\n  ?VAR2 <http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#contains> ?VAR1 .\n  ?VAR2 rdf:type ?VAR3 .\n}")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("VAR0"), (SubLObject)SubLObjectFactory.makeString("VAR1"), (SubLObject)SubLObjectFactory.makeString("VAR2"), (SubLObject)SubLObjectFactory.makeString("VAR3"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("select distinct ?Concept where {<http://dbpedia.org/resource/Tina_Turner> rdf:type ?Concept}")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Concept"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("select distinct $Concept where {<http://dbpedia.org/resource/Tina_Turner> rdf:type $Concept}")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Concept"))));
    }
    
    public static final class $sksi_resourcing_cache_native extends SubLStructNative
    {
        public SubLObject $connections;
        public SubLObject $statements;
        public SubLObject $used_statements;
        public SubLObject $access_times;
        public SubLObject $lock;
        public SubLObject $max_pool_size;
        public SubLObject $max_idle;
        private static final SubLStructDeclNative structDecl;
        
        public $sksi_resourcing_cache_native() {
            this.$connections = (SubLObject)CommonSymbols.NIL;
            this.$statements = (SubLObject)CommonSymbols.NIL;
            this.$used_statements = (SubLObject)CommonSymbols.NIL;
            this.$access_times = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$max_pool_size = (SubLObject)CommonSymbols.NIL;
            this.$max_idle = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sksi_resourcing_cache_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$connections;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$statements;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$used_statements;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$access_times;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$max_pool_size;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$max_idle;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$connections = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$statements = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$used_statements = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$access_times = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$max_pool_size = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$max_idle = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sksi_resourcing_cache_native.class, sksi_sks_interaction.$sym214$SKSI_RESOURCING_CACHE, sksi_sks_interaction.$sym215$SKSI_RESOURCING_CACHE_P, sksi_sks_interaction.$list216, sksi_sks_interaction.$list217, new String[] { "$connections", "$statements", "$used_statements", "$access_times", "$lock", "$max_pool_size", "$max_idle" }, sksi_sks_interaction.$list218, sksi_sks_interaction.$list219, sksi_sks_interaction.$sym220$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $sksi_resourcing_cache_p$UnaryFunction extends UnaryFunction
    {
        public $sksi_resourcing_cache_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-RESOURCING-CACHE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_sks_interaction.sksi_resourcing_cache_p(arg1);
        }
    }
}

/*

	Total time: 1485 ms
	
*/