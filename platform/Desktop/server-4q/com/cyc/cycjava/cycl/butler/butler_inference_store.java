package com.cyc.cycjava.cycl.butler;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.number_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class butler_inference_store extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.butler.butler_inference_store";
    public static final String myFingerPrint = "c01f40744b3a875905f3b7e40e9636b2fb98300bad337ee9c1606cb1f1aeaba7";
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 878L)
    private static SubLSymbol $butler_inference_store_ks$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 1024L)
    private static SubLSymbol $butler_inference_store_access_path$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25378L)
    private static SubLSymbol $butler_inference_store_constant_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25462L)
    private static SubLSymbol $butler_inference_store_variable_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25524L)
    private static SubLSymbol $butler_inference_store_nart_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25582L)
    private static SubLSymbol $butler_inference_store_naut_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25640L)
    private static SubLSymbol $butler_inference_store_fully_bound_formula_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25713L)
    private static SubLSymbol $butler_inference_store_not_fully_bound_formula_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25790L)
    private static SubLSymbol $butler_inference_store_string_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25850L)
    private static SubLSymbol $butler_inference_store_number_type$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 27273L)
    private static SubLSymbol $butler_inference_store_good_status$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 27345L)
    private static SubLSymbol $butler_inference_store_neutral_status$;
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 27408L)
    private static SubLSymbol $butler_inference_store_no_good_status$;
    private static final SubLObject $const0$ButlerInferenceStore_KS;
    private static final SubLString $str1$Could_not_find_access_path_for_Bu;
    private static final SubLSymbol $sym2$STRINGP;
    private static final SubLSymbol $sym3$SQL_STATEMENT_P;
    private static final SubLSymbol $sym4$PROBLEM_STORE_P;
    private static final SubLSymbol $kw5$DBMS_SERVER;
    private static final SubLSymbol $kw6$PORT;
    private static final SubLSymbol $kw7$SUBPROTOCOL;
    private static final SubLSymbol $kw8$PROXY_SERVER;
    private static final SubLSymbol $kw9$TIMEOUT;
    private static final SubLSymbol $kw10$THROW;
    private static final SubLSymbol $sym11$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw12$RETURN;
    private static final SubLSymbol $kw13$SKIP;
    private static final SubLFloat $float14$0_5;
    private static final SubLSymbol $sym15$PROBABILITY_P;
    private static final SubLString $str16$INSERT_into_problem_stores__guid_;
    private static final SubLString $str17$____;
    private static final SubLString $str18$___;
    private static final SubLString $str19$___;
    private static final SubLString $str20$__;
    private static final SubLString $str21$SELECT_id_FROM_problem_stores_WHE;
    private static final SubLString $str22$_;
    private static final SubLString $str23$INSERT_into_problems__prob_store_;
    private static final SubLString $str24$__;
    private static final SubLString $str25$_;
    private static final SubLSymbol $kw26$IGNORE;
    private static final SubLString $str27$INSERT_INTO_complex_expressions__;
    private static final SubLString $str28$INSERT_INTO_expressions__external;
    private static final SubLString $str29$SELECT_id_FROM_expressions_WHERE_;
    private static final SubLString $str30$SELECT_DISTINCT_system__kb__machi;
    private static final SubLList $list31;
    private static final SubLString $str32$SELECT_DISTINCT_e1_external_id__e;
    private static final SubLString $str33$_AND_ps_id___p_prob_store_AND_ps_;
    private static final SubLString $str34$__AND_e1_id___p_sentence_AND_e2_i;
    private static final SubLList $list35;
    private static final SubLString $str36$SELECT_COUNT_DISTINCT_p_prob_stor;
    private static final SubLString $str37$__AND_e2_external_id____;
    private static final SubLString $str38$SELECT_COUNT_DISTINCT_p_prob_stor;
    private static final SubLString $str39$SELECT_DISTINCT_e1_external_id__e;
    private static final SubLString $str40$_GROUP_BY_e1_external_id__e2_exte;
    private static final SubLList $list41;
    private static final SubLString $str42$SELECT_DISTINCT_e_external_id__CO;
    private static final SubLString $str43$_GROUP_BY_e_external_id_ORDER_BY_;
    private static final SubLList $list44;
    private static final SubLString $str45$SELECT_DISTINCT_e1_external_id__e;
    private static final SubLString $str46$SELECT_DISTINCT_e_external_id__CO;
    private static final SubLString $str47$_LIMIT_;
    private static final SubLString $str48$SELECT_DISTINCT_e3_external_id__e;
    private static final SubLString $str49$__AND_p1_sentence___e1_id_AND_e2_;
    private static final SubLString $str50$__AND_p1_mt___e2_id_AND_p2_prob_s;
    private static final SubLList $list51;
    private static final SubLString $str52$SELECT_DISTINCT_e2_external_id_FR;
    private static final SubLString $str53$__AND_p1_sentence___e1_id_AND_p2_;
    private static final SubLList $list54;
    private static final SubLString $str55$SELECT_DISTINCT_e1_external_id__e;
    private static final SubLString $str56$_AND_c_simple_exp___e3_id_AND_e3_;
    private static final SubLString $str57$SELECT_DISTINCT_e1_external_id_FR;
    private static final SubLString $str58$_AND_c_simple_exp___e2_id_AND_e2_;
    private static final SubLString $str59$SELECT_DISTINCT_e1_external_id__e;
    private static final SubLString $str60$_AND_p_sentence___e1_id_AND_p_mt_;
    private static final SubLString $str61$SELECT_DISTINCT_e_external_id_FRO;
    private static final SubLString $str62$_AND_p_sentence___e_id;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw66$N;
    private static final SubLSymbol $kw67$STATUS;
    private static final SubLSymbol $kw68$DONE;
    private static final SubLSymbol $sym69$ITERATOR;
    private static final SubLSymbol $sym70$ROW;
    private static final SubLSymbol $sym71$CLET;
    private static final SubLSymbol $sym72$BUTLER_INFERENCE_STORE_MOST_INTERESTING_PROBLEM_QUERIES;
    private static final SubLSymbol $sym73$DO_ITERATOR_WITHOUT_VALUES;
    private static final SubLSymbol $sym74$CDESTRUCTURING_BIND;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$ITERATOR;
    private static final SubLSymbol $sym78$ROW;
    private static final SubLSymbol $sym79$BUTLER_INFERENCE_STORE_PROBLEM_QUERIES_WITH_STATUS;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLString $str82$Currently_cannot_handle_expressio;
    private static final SubLString $str83$YYYY_MM_DD_HH_MM_SS;
    private static final SubLSymbol $sym84$BUTLER_INFERENCE_STORE_ITERATOR_DONE;
    private static final SubLSymbol $sym85$BUTLER_INFERENCE_STORE_ITERATOR_NEXT;
    private static final SubLSymbol $sym86$BUTLER_INFERENCE_STORE_ITERATOR_FINALIZE;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$QUOTE;
    private static final SubLSymbol $sym89$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym90$BUTLER_INFERENCE_STORE_ID_STATUS;
    private static final SubLSymbol $sym91$SQL_TIME_STAMP_TO_UNIVERSAL_TIME;
    private static final SubLSymbol $kw92$GOOD;
    private static final SubLSymbol $kw93$NEUTRAL;
    private static final SubLSymbol $kw94$NO_GOOD;
    private static final SubLString $str95$Unknown_status__s;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 1087L)
    public static SubLObject butler_inference_store_access_path() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject access_path = butler_inference_store.$butler_inference_store_access_path$.getGlobalValue();
        if (butler_inference_store.NIL == sksi_access_path.access_path_p(access_path)) {
            final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(butler_inference_store.$butler_inference_store_ks$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                access_path = sksi_access_path.sksi_determine_access_path(butler_inference_store.$butler_inference_store_ks$.getGlobalValue(), (SubLObject)butler_inference_store.UNPROVIDED, (SubLObject)butler_inference_store.UNPROVIDED);
                butler_inference_store.$butler_inference_store_access_path$.setGlobalValue(access_path);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (butler_inference_store.NIL == sksi_access_path.access_path_p(access_path)) {
            Errors.warn((SubLObject)butler_inference_store.$str1$Could_not_find_access_path_for_Bu);
        }
        return access_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 1613L)
    public static SubLObject reset_bulter_inference_store_access_path() {
        butler_inference_store.$butler_inference_store_access_path$.setGlobalValue((SubLObject)butler_inference_store.NIL);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 1740L)
    public static SubLObject butler_inference_store_execute_sql_query(final SubLObject sql, SubLObject statement) {
        if (statement == butler_inference_store.UNPROVIDED) {
            statement = (SubLObject)butler_inference_store.NIL;
        }
        assert butler_inference_store.NIL != Types.stringp(sql) : sql;
        if (butler_inference_store.NIL != statement && !butler_inference_store.assertionsDisabledInClass && butler_inference_store.NIL == sdbc.sql_statement_p(statement)) {
            throw new AssertionError(statement);
        }
        if (butler_inference_store.NIL != statement) {
            return sdbc.sqls_execute_query(statement, sql, (SubLObject)butler_inference_store.UNPROVIDED);
        }
        final SubLObject access_path = butler_inference_store_access_path();
        SubLObject result = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != sksi_access_path.access_path_p(access_path)) {
            result = sksi_sks_interaction.sksi_execute_sql_query(sql, access_path);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 2164L)
    public static SubLObject butler_inference_store_execute_sql_update(final SubLObject sql, SubLObject statement) {
        if (statement == butler_inference_store.UNPROVIDED) {
            statement = (SubLObject)butler_inference_store.NIL;
        }
        assert butler_inference_store.NIL != Types.stringp(sql) : sql;
        if (butler_inference_store.NIL != statement && !butler_inference_store.assertionsDisabledInClass && butler_inference_store.NIL == sdbc.sql_statement_p(statement)) {
            throw new AssertionError(statement);
        }
        if (butler_inference_store.NIL != statement) {
            return sdbc.sqls_execute_update(statement, sql);
        }
        final SubLObject access_path = butler_inference_store_access_path();
        SubLObject result = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != sksi_access_path.access_path_p(access_path)) {
            result = sksi_sks_interaction.sksi_execute_sql_update(sql, access_path);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 2591L)
    public static SubLObject butler_write_problem_store_to_inference_store(final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert butler_inference_store.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : problem_store;
        final SubLObject access_path = butler_inference_store_access_path();
        SubLObject count = (SubLObject)butler_inference_store.ZERO_INTEGER;
        SubLObject error = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != sksi_access_path.access_path_p(access_path)) {
            final SubLObject db = sksi_access_path.access_path_db(access_path);
            final SubLObject user = sksi_access_path.access_path_user(access_path);
            final SubLObject password = sksi_access_path.access_path_password(access_path);
            final SubLObject server = sksi_access_path.access_path_server(access_path);
            final SubLObject port = sksi_access_path.access_path_port(access_path);
            final SubLObject proxy_server = sksi_access_path.access_path_proxy_server(access_path);
            final SubLObject proxy_port = sksi_access_path.access_path_proxy_port(access_path);
            final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
            final SubLObject timeout = sksi_access_path.access_path_timeout(access_path);
            final SubLObject conn_server = (butler_inference_store.NIL != proxy_server) ? proxy_server : server;
            final SubLObject conn_port = (butler_inference_store.NIL != proxy_port) ? proxy_port : port;
            final SubLObject conn_timeout = (butler_inference_store.NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
            SubLObject statement = (SubLObject)butler_inference_store.NIL;
            SubLObject connection = (SubLObject)butler_inference_store.NIL;
            try {
                connection = sdbc.new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { butler_inference_store.$kw5$DBMS_SERVER, server, butler_inference_store.$kw6$PORT, conn_port, butler_inference_store.$kw7$SUBPROTOCOL, subprotocol, butler_inference_store.$kw8$PROXY_SERVER, conn_server, butler_inference_store.$kw9$TIMEOUT, conn_timeout }));
                if (butler_inference_store.NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                }
                else {
                    statement = connection;
                }
                if (butler_inference_store.NIL != sdbc.sql_open_statement_p(statement)) {
                    final SubLObject connection_$1 = sdbc.sqls_get_connection(statement);
                    final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$1);
                    SubLObject commit_error = (SubLObject)butler_inference_store.NIL;
                    SubLObject rollback_result = (SubLObject)butler_inference_store.NIL;
                    SubLObject auto_commit_result = (SubLObject)butler_inference_store.NIL;
                    SubLObject errors = (SubLObject)butler_inference_store.NIL;
                    if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit)) {
                        errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                    }
                    else {
                        sdbc.sqlc_set_error_handling(connection_$1, (SubLObject)butler_inference_store.$kw10$THROW);
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)butler_inference_store.$sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if (butler_inference_store.NIL != auto_commit) {
                                        sdbc.sqlc_set_auto_commit(connection_$1, (SubLObject)butler_inference_store.NIL);
                                    }
                                    if (butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store, statement)) {
                                        count = (SubLObject)butler_inference_store.ONE_INTEGER;
                                    }
                                    sdbc.sqlc_commit(connection_$1);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)butler_inference_store.NIL);
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
                        sdbc.sqlc_set_error_handling(connection_$1, (SubLObject)butler_inference_store.$kw12$RETURN);
                        if (butler_inference_store.NIL != commit_error) {
                            errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                            rollback_result = sdbc.sqls_handle_rollback(connection_$1);
                            if (butler_inference_store.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                            }
                        }
                        if (butler_inference_store.NIL != auto_commit) {
                            auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$1, (SubLObject)butler_inference_store.T);
                        }
                        if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                            errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                        }
                    }
                    if (butler_inference_store.NIL != errors) {
                        error = sdbc.sqls_handle_transaction_errors(errors);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)butler_inference_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (butler_inference_store.NIL != sdbc.sql_connection_p(connection)) {
                        sdbc.sqlc_close(connection);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        if (butler_inference_store.NIL != error) {
            count = (SubLObject)butler_inference_store.ZERO_INTEGER;
            sdbc.sdbc_error_warn(error);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 3254L)
    public static SubLObject butler_write_all_problem_stores_to_inference_store(SubLObject multiple_transactionsP) {
        if (multiple_transactionsP == butler_inference_store.UNPROVIDED) {
            multiple_transactionsP = (SubLObject)butler_inference_store.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject access_path = butler_inference_store_access_path();
        SubLObject count = (SubLObject)butler_inference_store.ZERO_INTEGER;
        if (butler_inference_store.NIL != sksi_access_path.access_path_p(access_path)) {
            if (butler_inference_store.NIL != multiple_transactionsP) {
                final SubLObject idx = inference_datastructures_problem_store.problem_store_id_index();
                if (butler_inference_store.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                    final SubLObject idx_$2 = idx;
                    if (butler_inference_store.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = (SubLObject)butler_inference_store.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject problem_store;
                        SubLObject error;
                        SubLObject db;
                        SubLObject user;
                        SubLObject password;
                        SubLObject server;
                        SubLObject port;
                        SubLObject proxy_server;
                        SubLObject proxy_port;
                        SubLObject subprotocol;
                        SubLObject timeout;
                        SubLObject conn_server;
                        SubLObject conn_port;
                        SubLObject conn_timeout;
                        SubLObject statement;
                        SubLObject connection;
                        SubLObject connection_$3;
                        SubLObject auto_commit;
                        SubLObject commit_error;
                        SubLObject rollback_result;
                        SubLObject auto_commit_result;
                        SubLObject errors;
                        SubLObject _prev_bind_0;
                        SubLObject _prev_bind_2;
                        SubLObject _values;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)butler_inference_store.NIL, v_iteration = (SubLObject)butler_inference_store.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)butler_inference_store.ONE_INTEGER)) {
                            id = ((butler_inference_store.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)butler_inference_store.ONE_INTEGER) : v_iteration);
                            problem_store = Vectors.aref(vector_var, id);
                            if (butler_inference_store.NIL == id_index.id_index_tombstone_p(problem_store) || butler_inference_store.NIL == id_index.id_index_skip_tombstones_p((SubLObject)butler_inference_store.$kw13$SKIP)) {
                                if (butler_inference_store.NIL != id_index.id_index_tombstone_p(problem_store)) {
                                    problem_store = (SubLObject)butler_inference_store.$kw13$SKIP;
                                }
                                error = (SubLObject)butler_inference_store.NIL;
                                db = sksi_access_path.access_path_db(access_path);
                                user = sksi_access_path.access_path_user(access_path);
                                password = sksi_access_path.access_path_password(access_path);
                                server = sksi_access_path.access_path_server(access_path);
                                port = sksi_access_path.access_path_port(access_path);
                                proxy_server = sksi_access_path.access_path_proxy_server(access_path);
                                proxy_port = sksi_access_path.access_path_proxy_port(access_path);
                                subprotocol = sksi_access_path.access_path_subprotocol(access_path);
                                timeout = sksi_access_path.access_path_timeout(access_path);
                                conn_server = ((butler_inference_store.NIL != proxy_server) ? proxy_server : server);
                                conn_port = ((butler_inference_store.NIL != proxy_port) ? proxy_port : port);
                                conn_timeout = ((butler_inference_store.NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread));
                                statement = (SubLObject)butler_inference_store.NIL;
                                connection = (SubLObject)butler_inference_store.NIL;
                                try {
                                    connection = sdbc.new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { butler_inference_store.$kw5$DBMS_SERVER, server, butler_inference_store.$kw6$PORT, conn_port, butler_inference_store.$kw7$SUBPROTOCOL, subprotocol, butler_inference_store.$kw8$PROXY_SERVER, conn_server, butler_inference_store.$kw9$TIMEOUT, conn_timeout }));
                                    if (butler_inference_store.NIL != sdbc.sql_open_connection_p(connection)) {
                                        statement = sdbc.sqlc_create_statement(connection);
                                    }
                                    else {
                                        statement = connection;
                                    }
                                    if (butler_inference_store.NIL != sdbc.sql_open_statement_p(statement)) {
                                        connection_$3 = sdbc.sqls_get_connection(statement);
                                        auto_commit = sdbc.sqlc_get_auto_commit(connection_$3);
                                        commit_error = (SubLObject)butler_inference_store.NIL;
                                        rollback_result = (SubLObject)butler_inference_store.NIL;
                                        auto_commit_result = (SubLObject)butler_inference_store.NIL;
                                        errors = (SubLObject)butler_inference_store.NIL;
                                        if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit)) {
                                            errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                                        }
                                        else {
                                            sdbc.sqlc_set_error_handling(connection_$3, (SubLObject)butler_inference_store.$kw10$THROW);
                                            try {
                                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)butler_inference_store.$sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        if (butler_inference_store.NIL != auto_commit) {
                                                            sdbc.sqlc_set_auto_commit(connection_$3, (SubLObject)butler_inference_store.NIL);
                                                        }
                                                        if (butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store, statement)) {
                                                            count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                        }
                                                        sdbc.sqlc_commit(connection_$3);
                                                    }
                                                    catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, (SubLObject)butler_inference_store.NIL);
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
                                            sdbc.sqlc_set_error_handling(connection_$3, (SubLObject)butler_inference_store.$kw12$RETURN);
                                            if (butler_inference_store.NIL != commit_error) {
                                                errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                                rollback_result = sdbc.sqls_handle_rollback(connection_$3);
                                                if (butler_inference_store.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                    errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                                                }
                                            }
                                            if (butler_inference_store.NIL != auto_commit) {
                                                auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$3, (SubLObject)butler_inference_store.T);
                                            }
                                            if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                                errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                                            }
                                        }
                                        if (butler_inference_store.NIL != errors) {
                                            error = sdbc.sqls_handle_transaction_errors(errors);
                                        }
                                    }
                                }
                                finally {
                                    _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)butler_inference_store.T, thread);
                                        _values = Values.getValuesAsVector();
                                        if (butler_inference_store.NIL != sdbc.sql_connection_p(connection)) {
                                            sdbc.sqlc_close(connection);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                                if (butler_inference_store.NIL != error) {
                                    sdbc.sdbc_error_warn(error);
                                }
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx;
                    if (butler_inference_store.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3)) {
                        final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$3);
                        SubLObject id2 = (SubLObject)butler_inference_store.NIL;
                        SubLObject problem_store2 = (SubLObject)butler_inference_store.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                id2 = Hashtables.getEntryKey(cdohash_entry);
                                problem_store2 = Hashtables.getEntryValue(cdohash_entry);
                                SubLObject error2 = (SubLObject)butler_inference_store.NIL;
                                final SubLObject db2 = sksi_access_path.access_path_db(access_path);
                                final SubLObject user2 = sksi_access_path.access_path_user(access_path);
                                final SubLObject password2 = sksi_access_path.access_path_password(access_path);
                                final SubLObject server2 = sksi_access_path.access_path_server(access_path);
                                final SubLObject port2 = sksi_access_path.access_path_port(access_path);
                                final SubLObject proxy_server2 = sksi_access_path.access_path_proxy_server(access_path);
                                final SubLObject proxy_port2 = sksi_access_path.access_path_proxy_port(access_path);
                                final SubLObject subprotocol2 = sksi_access_path.access_path_subprotocol(access_path);
                                final SubLObject timeout2 = sksi_access_path.access_path_timeout(access_path);
                                final SubLObject conn_server2 = (butler_inference_store.NIL != proxy_server2) ? proxy_server2 : server2;
                                final SubLObject conn_port2 = (butler_inference_store.NIL != proxy_port2) ? proxy_port2 : port2;
                                final SubLObject conn_timeout2 = (butler_inference_store.NIL != timeout2) ? timeout2 : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
                                SubLObject statement2 = (SubLObject)butler_inference_store.NIL;
                                SubLObject connection2 = (SubLObject)butler_inference_store.NIL;
                                try {
                                    connection2 = sdbc.new_sql_connection(db2, user2, password2, (SubLObject)ConsesLow.list(new SubLObject[] { butler_inference_store.$kw5$DBMS_SERVER, server2, butler_inference_store.$kw6$PORT, conn_port2, butler_inference_store.$kw7$SUBPROTOCOL, subprotocol2, butler_inference_store.$kw8$PROXY_SERVER, conn_server2, butler_inference_store.$kw9$TIMEOUT, conn_timeout2 }));
                                    if (butler_inference_store.NIL != sdbc.sql_open_connection_p(connection2)) {
                                        statement2 = sdbc.sqlc_create_statement(connection2);
                                    }
                                    else {
                                        statement2 = connection2;
                                    }
                                    if (butler_inference_store.NIL != sdbc.sql_open_statement_p(statement2)) {
                                        final SubLObject connection_$4 = sdbc.sqls_get_connection(statement2);
                                        final SubLObject auto_commit2 = sdbc.sqlc_get_auto_commit(connection_$4);
                                        SubLObject commit_error2 = (SubLObject)butler_inference_store.NIL;
                                        SubLObject rollback_result2 = (SubLObject)butler_inference_store.NIL;
                                        SubLObject auto_commit_result2 = (SubLObject)butler_inference_store.NIL;
                                        SubLObject errors2 = (SubLObject)butler_inference_store.NIL;
                                        if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit2)) {
                                            errors2 = (SubLObject)ConsesLow.cons(auto_commit2, errors2);
                                        }
                                        else {
                                            sdbc.sqlc_set_error_handling(connection_$4, (SubLObject)butler_inference_store.$kw10$THROW);
                                            try {
                                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)butler_inference_store.$sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        if (butler_inference_store.NIL != auto_commit2) {
                                                            sdbc.sqlc_set_auto_commit(connection_$4, (SubLObject)butler_inference_store.NIL);
                                                        }
                                                        if (butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store2, statement2)) {
                                                            count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                        }
                                                        sdbc.sqlc_commit(connection_$4);
                                                    }
                                                    catch (Throwable catch_var2) {
                                                        Errors.handleThrowable(catch_var2, (SubLObject)butler_inference_store.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                                                }
                                            }
                                            catch (Throwable ccatch_env_var2) {
                                                commit_error2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            }
                                            finally {
                                                thread.throwStack.pop();
                                            }
                                            sdbc.sqlc_set_error_handling(connection_$4, (SubLObject)butler_inference_store.$kw12$RETURN);
                                            if (butler_inference_store.NIL != commit_error2) {
                                                errors2 = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error2), errors2);
                                                rollback_result2 = sdbc.sqls_handle_rollback(connection_$4);
                                                if (butler_inference_store.NIL != sdbc.sdbc_error_p(rollback_result2)) {
                                                    errors2 = (SubLObject)ConsesLow.cons(rollback_result2, errors2);
                                                }
                                            }
                                            if (butler_inference_store.NIL != auto_commit2) {
                                                auto_commit_result2 = sdbc.sqlc_set_auto_commit(connection_$4, (SubLObject)butler_inference_store.T);
                                            }
                                            if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit_result2)) {
                                                errors2 = (SubLObject)ConsesLow.cons(auto_commit_result2, errors2);
                                            }
                                        }
                                        if (butler_inference_store.NIL != errors2) {
                                            error2 = sdbc.sqls_handle_transaction_errors(errors2);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)butler_inference_store.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (butler_inference_store.NIL != sdbc.sql_connection_p(connection2)) {
                                            sdbc.sqlc_close(connection2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                                if (butler_inference_store.NIL != error2) {
                                    sdbc.sdbc_error_warn(error2);
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            else {
                SubLObject error3 = (SubLObject)butler_inference_store.NIL;
                final SubLObject db3 = sksi_access_path.access_path_db(access_path);
                final SubLObject user3 = sksi_access_path.access_path_user(access_path);
                final SubLObject password3 = sksi_access_path.access_path_password(access_path);
                final SubLObject server3 = sksi_access_path.access_path_server(access_path);
                final SubLObject port3 = sksi_access_path.access_path_port(access_path);
                final SubLObject proxy_server3 = sksi_access_path.access_path_proxy_server(access_path);
                final SubLObject proxy_port3 = sksi_access_path.access_path_proxy_port(access_path);
                final SubLObject subprotocol3 = sksi_access_path.access_path_subprotocol(access_path);
                final SubLObject timeout3 = sksi_access_path.access_path_timeout(access_path);
                final SubLObject conn_server3 = (butler_inference_store.NIL != proxy_server3) ? proxy_server3 : server3;
                final SubLObject conn_port3 = (butler_inference_store.NIL != proxy_port3) ? proxy_port3 : port3;
                final SubLObject conn_timeout3 = (butler_inference_store.NIL != timeout3) ? timeout3 : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
                SubLObject statement3 = (SubLObject)butler_inference_store.NIL;
                SubLObject connection3 = (SubLObject)butler_inference_store.NIL;
                try {
                    connection3 = sdbc.new_sql_connection(db3, user3, password3, (SubLObject)ConsesLow.list(new SubLObject[] { butler_inference_store.$kw5$DBMS_SERVER, server3, butler_inference_store.$kw6$PORT, conn_port3, butler_inference_store.$kw7$SUBPROTOCOL, subprotocol3, butler_inference_store.$kw8$PROXY_SERVER, conn_server3, butler_inference_store.$kw9$TIMEOUT, conn_timeout3 }));
                    if (butler_inference_store.NIL != sdbc.sql_open_connection_p(connection3)) {
                        statement3 = sdbc.sqlc_create_statement(connection3);
                    }
                    else {
                        statement3 = connection3;
                    }
                    if (butler_inference_store.NIL != sdbc.sql_open_statement_p(statement3)) {
                        final SubLObject connection_$5 = sdbc.sqls_get_connection(statement3);
                        final SubLObject auto_commit3 = sdbc.sqlc_get_auto_commit(connection_$5);
                        SubLObject commit_error3 = (SubLObject)butler_inference_store.NIL;
                        SubLObject rollback_result3 = (SubLObject)butler_inference_store.NIL;
                        SubLObject auto_commit_result3 = (SubLObject)butler_inference_store.NIL;
                        SubLObject errors3 = (SubLObject)butler_inference_store.NIL;
                        if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit3)) {
                            errors3 = (SubLObject)ConsesLow.cons(auto_commit3, errors3);
                        }
                        else {
                            sdbc.sqlc_set_error_handling(connection_$5, (SubLObject)butler_inference_store.$kw10$THROW);
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_5 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)butler_inference_store.$sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (butler_inference_store.NIL != auto_commit3) {
                                            sdbc.sqlc_set_auto_commit(connection_$5, (SubLObject)butler_inference_store.NIL);
                                        }
                                        final SubLObject idx2 = inference_datastructures_problem_store.problem_store_id_index();
                                        if (butler_inference_store.NIL == id_index.id_index_objects_empty_p(idx2, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                                            final SubLObject idx_$4 = idx2;
                                            if (butler_inference_store.NIL == id_index.id_index_dense_objects_empty_p(idx_$4, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                                                final SubLObject vector_var2 = id_index.id_index_dense_objects(idx_$4);
                                                final SubLObject backwardP_var2 = (SubLObject)butler_inference_store.NIL;
                                                SubLObject length2;
                                                SubLObject v_iteration2;
                                                SubLObject id3;
                                                SubLObject problem_store3;
                                                for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)butler_inference_store.NIL, v_iteration2 = (SubLObject)butler_inference_store.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)butler_inference_store.ONE_INTEGER)) {
                                                    id3 = ((butler_inference_store.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)butler_inference_store.ONE_INTEGER) : v_iteration2);
                                                    problem_store3 = Vectors.aref(vector_var2, id3);
                                                    if (butler_inference_store.NIL == id_index.id_index_tombstone_p(problem_store3) || butler_inference_store.NIL == id_index.id_index_skip_tombstones_p((SubLObject)butler_inference_store.$kw13$SKIP)) {
                                                        if (butler_inference_store.NIL != id_index.id_index_tombstone_p(problem_store3)) {
                                                            problem_store3 = (SubLObject)butler_inference_store.$kw13$SKIP;
                                                        }
                                                        if (butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store3, statement3)) {
                                                            count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                            }
                                            final SubLObject idx_$5 = idx2;
                                            if (butler_inference_store.NIL == id_index.id_index_sparse_objects_empty_p(idx_$5)) {
                                                final SubLObject cdohash_table2 = id_index.id_index_sparse_objects(idx_$5);
                                                SubLObject id4 = (SubLObject)butler_inference_store.NIL;
                                                SubLObject problem_store4 = (SubLObject)butler_inference_store.NIL;
                                                final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
                                                try {
                                                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                                                        final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                                                        id4 = Hashtables.getEntryKey(cdohash_entry2);
                                                        problem_store4 = Hashtables.getEntryValue(cdohash_entry2);
                                                        if (butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store4, statement3)) {
                                                            count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                                                }
                                            }
                                        }
                                        sdbc.sqlc_commit(connection_$5);
                                    }
                                    catch (Throwable catch_var3) {
                                        Errors.handleThrowable(catch_var3, (SubLObject)butler_inference_store.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_5, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var3) {
                                commit_error3 = Errors.handleThrowable(ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$5, (SubLObject)butler_inference_store.$kw12$RETURN);
                            if (butler_inference_store.NIL != commit_error3) {
                                errors3 = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error3), errors3);
                                rollback_result3 = sdbc.sqls_handle_rollback(connection_$5);
                                if (butler_inference_store.NIL != sdbc.sdbc_error_p(rollback_result3)) {
                                    errors3 = (SubLObject)ConsesLow.cons(rollback_result3, errors3);
                                }
                            }
                            if (butler_inference_store.NIL != auto_commit3) {
                                auto_commit_result3 = sdbc.sqlc_set_auto_commit(connection_$5, (SubLObject)butler_inference_store.T);
                            }
                            if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit_result3)) {
                                errors3 = (SubLObject)ConsesLow.cons(auto_commit_result3, errors3);
                            }
                        }
                        if (butler_inference_store.NIL != errors3) {
                            error3 = sdbc.sqls_handle_transaction_errors(errors3);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)butler_inference_store.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        if (butler_inference_store.NIL != sdbc.sql_connection_p(connection3)) {
                            sdbc.sqlc_close(connection3);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                    }
                }
                if (butler_inference_store.NIL != error3) {
                    count = (SubLObject)butler_inference_store.ZERO_INTEGER;
                    sdbc.sdbc_error_warn(error3);
                }
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 4490L)
    public static SubLObject butler_write_random_problem_stores_to_inference_store(SubLObject p, SubLObject multiple_transactionsP) {
        if (p == butler_inference_store.UNPROVIDED) {
            p = (SubLObject)butler_inference_store.$float14$0_5;
        }
        if (multiple_transactionsP == butler_inference_store.UNPROVIDED) {
            multiple_transactionsP = (SubLObject)butler_inference_store.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert butler_inference_store.NIL != number_utilities.probability_p(p) : p;
        final SubLObject access_path = butler_inference_store_access_path();
        SubLObject count = (SubLObject)butler_inference_store.ZERO_INTEGER;
        if (butler_inference_store.NIL != sksi_access_path.access_path_p(access_path)) {
            if (butler_inference_store.NIL != multiple_transactionsP) {
                final SubLObject idx = inference_datastructures_problem_store.problem_store_id_index();
                if (butler_inference_store.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                    final SubLObject idx_$9 = idx;
                    if (butler_inference_store.NIL == id_index.id_index_dense_objects_empty_p(idx_$9, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = (SubLObject)butler_inference_store.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject problem_store;
                        SubLObject error;
                        SubLObject db;
                        SubLObject user;
                        SubLObject password;
                        SubLObject server;
                        SubLObject port;
                        SubLObject proxy_server;
                        SubLObject proxy_port;
                        SubLObject subprotocol;
                        SubLObject timeout;
                        SubLObject conn_server;
                        SubLObject conn_port;
                        SubLObject conn_timeout;
                        SubLObject statement;
                        SubLObject connection;
                        SubLObject connection_$10;
                        SubLObject auto_commit;
                        SubLObject commit_error;
                        SubLObject rollback_result;
                        SubLObject auto_commit_result;
                        SubLObject errors;
                        SubLObject _prev_bind_0;
                        SubLObject _prev_bind_2;
                        SubLObject _values;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)butler_inference_store.NIL, v_iteration = (SubLObject)butler_inference_store.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)butler_inference_store.ONE_INTEGER)) {
                            id = ((butler_inference_store.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)butler_inference_store.ONE_INTEGER) : v_iteration);
                            problem_store = Vectors.aref(vector_var, id);
                            if (butler_inference_store.NIL == id_index.id_index_tombstone_p(problem_store) || butler_inference_store.NIL == id_index.id_index_skip_tombstones_p((SubLObject)butler_inference_store.$kw13$SKIP)) {
                                if (butler_inference_store.NIL != id_index.id_index_tombstone_p(problem_store)) {
                                    problem_store = (SubLObject)butler_inference_store.$kw13$SKIP;
                                }
                                if (butler_inference_store.NIL != number_utilities.true_with_probability(p)) {
                                    error = (SubLObject)butler_inference_store.NIL;
                                    db = sksi_access_path.access_path_db(access_path);
                                    user = sksi_access_path.access_path_user(access_path);
                                    password = sksi_access_path.access_path_password(access_path);
                                    server = sksi_access_path.access_path_server(access_path);
                                    port = sksi_access_path.access_path_port(access_path);
                                    proxy_server = sksi_access_path.access_path_proxy_server(access_path);
                                    proxy_port = sksi_access_path.access_path_proxy_port(access_path);
                                    subprotocol = sksi_access_path.access_path_subprotocol(access_path);
                                    timeout = sksi_access_path.access_path_timeout(access_path);
                                    conn_server = ((butler_inference_store.NIL != proxy_server) ? proxy_server : server);
                                    conn_port = ((butler_inference_store.NIL != proxy_port) ? proxy_port : port);
                                    conn_timeout = ((butler_inference_store.NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread));
                                    statement = (SubLObject)butler_inference_store.NIL;
                                    connection = (SubLObject)butler_inference_store.NIL;
                                    try {
                                        connection = sdbc.new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { butler_inference_store.$kw5$DBMS_SERVER, server, butler_inference_store.$kw6$PORT, conn_port, butler_inference_store.$kw7$SUBPROTOCOL, subprotocol, butler_inference_store.$kw8$PROXY_SERVER, conn_server, butler_inference_store.$kw9$TIMEOUT, conn_timeout }));
                                        if (butler_inference_store.NIL != sdbc.sql_open_connection_p(connection)) {
                                            statement = sdbc.sqlc_create_statement(connection);
                                        }
                                        else {
                                            statement = connection;
                                        }
                                        if (butler_inference_store.NIL != sdbc.sql_open_statement_p(statement)) {
                                            connection_$10 = sdbc.sqls_get_connection(statement);
                                            auto_commit = sdbc.sqlc_get_auto_commit(connection_$10);
                                            commit_error = (SubLObject)butler_inference_store.NIL;
                                            rollback_result = (SubLObject)butler_inference_store.NIL;
                                            auto_commit_result = (SubLObject)butler_inference_store.NIL;
                                            errors = (SubLObject)butler_inference_store.NIL;
                                            if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit)) {
                                                errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                                            }
                                            else {
                                                sdbc.sqlc_set_error_handling(connection_$10, (SubLObject)butler_inference_store.$kw10$THROW);
                                                try {
                                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                    _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind((SubLObject)butler_inference_store.$sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            if (butler_inference_store.NIL != auto_commit) {
                                                                sdbc.sqlc_set_auto_commit(connection_$10, (SubLObject)butler_inference_store.NIL);
                                                            }
                                                            if (butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store, statement)) {
                                                                count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                            }
                                                            sdbc.sqlc_commit(connection_$10);
                                                        }
                                                        catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, (SubLObject)butler_inference_store.NIL);
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
                                                sdbc.sqlc_set_error_handling(connection_$10, (SubLObject)butler_inference_store.$kw12$RETURN);
                                                if (butler_inference_store.NIL != commit_error) {
                                                    errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                                                    rollback_result = sdbc.sqls_handle_rollback(connection_$10);
                                                    if (butler_inference_store.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                                        errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                                                    }
                                                }
                                                if (butler_inference_store.NIL != auto_commit) {
                                                    auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$10, (SubLObject)butler_inference_store.T);
                                                }
                                                if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                                                    errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                                                }
                                            }
                                            if (butler_inference_store.NIL != errors) {
                                                error = sdbc.sqls_handle_transaction_errors(errors);
                                            }
                                        }
                                    }
                                    finally {
                                        _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)butler_inference_store.T, thread);
                                            _values = Values.getValuesAsVector();
                                            if (butler_inference_store.NIL != sdbc.sql_connection_p(connection)) {
                                                sdbc.sqlc_close(connection);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                    if (butler_inference_store.NIL != error) {
                                        sdbc.sdbc_error_warn(error);
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject idx_$10 = idx;
                    if (butler_inference_store.NIL == id_index.id_index_sparse_objects_empty_p(idx_$10)) {
                        final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$10);
                        SubLObject id2 = (SubLObject)butler_inference_store.NIL;
                        SubLObject problem_store2 = (SubLObject)butler_inference_store.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                id2 = Hashtables.getEntryKey(cdohash_entry);
                                problem_store2 = Hashtables.getEntryValue(cdohash_entry);
                                if (butler_inference_store.NIL != number_utilities.true_with_probability(p)) {
                                    SubLObject error2 = (SubLObject)butler_inference_store.NIL;
                                    final SubLObject db2 = sksi_access_path.access_path_db(access_path);
                                    final SubLObject user2 = sksi_access_path.access_path_user(access_path);
                                    final SubLObject password2 = sksi_access_path.access_path_password(access_path);
                                    final SubLObject server2 = sksi_access_path.access_path_server(access_path);
                                    final SubLObject port2 = sksi_access_path.access_path_port(access_path);
                                    final SubLObject proxy_server2 = sksi_access_path.access_path_proxy_server(access_path);
                                    final SubLObject proxy_port2 = sksi_access_path.access_path_proxy_port(access_path);
                                    final SubLObject subprotocol2 = sksi_access_path.access_path_subprotocol(access_path);
                                    final SubLObject timeout2 = sksi_access_path.access_path_timeout(access_path);
                                    final SubLObject conn_server2 = (butler_inference_store.NIL != proxy_server2) ? proxy_server2 : server2;
                                    final SubLObject conn_port2 = (butler_inference_store.NIL != proxy_port2) ? proxy_port2 : port2;
                                    final SubLObject conn_timeout2 = (butler_inference_store.NIL != timeout2) ? timeout2 : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
                                    SubLObject statement2 = (SubLObject)butler_inference_store.NIL;
                                    SubLObject connection2 = (SubLObject)butler_inference_store.NIL;
                                    try {
                                        connection2 = sdbc.new_sql_connection(db2, user2, password2, (SubLObject)ConsesLow.list(new SubLObject[] { butler_inference_store.$kw5$DBMS_SERVER, server2, butler_inference_store.$kw6$PORT, conn_port2, butler_inference_store.$kw7$SUBPROTOCOL, subprotocol2, butler_inference_store.$kw8$PROXY_SERVER, conn_server2, butler_inference_store.$kw9$TIMEOUT, conn_timeout2 }));
                                        if (butler_inference_store.NIL != sdbc.sql_open_connection_p(connection2)) {
                                            statement2 = sdbc.sqlc_create_statement(connection2);
                                        }
                                        else {
                                            statement2 = connection2;
                                        }
                                        if (butler_inference_store.NIL != sdbc.sql_open_statement_p(statement2)) {
                                            final SubLObject connection_$11 = sdbc.sqls_get_connection(statement2);
                                            final SubLObject auto_commit2 = sdbc.sqlc_get_auto_commit(connection_$11);
                                            SubLObject commit_error2 = (SubLObject)butler_inference_store.NIL;
                                            SubLObject rollback_result2 = (SubLObject)butler_inference_store.NIL;
                                            SubLObject auto_commit_result2 = (SubLObject)butler_inference_store.NIL;
                                            SubLObject errors2 = (SubLObject)butler_inference_store.NIL;
                                            if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit2)) {
                                                errors2 = (SubLObject)ConsesLow.cons(auto_commit2, errors2);
                                            }
                                            else {
                                                sdbc.sqlc_set_error_handling(connection_$11, (SubLObject)butler_inference_store.$kw10$THROW);
                                                try {
                                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                    final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind((SubLObject)butler_inference_store.$sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            if (butler_inference_store.NIL != auto_commit2) {
                                                                sdbc.sqlc_set_auto_commit(connection_$11, (SubLObject)butler_inference_store.NIL);
                                                            }
                                                            if (butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store2, statement2)) {
                                                                count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                            }
                                                            sdbc.sqlc_commit(connection_$11);
                                                        }
                                                        catch (Throwable catch_var2) {
                                                            Errors.handleThrowable(catch_var2, (SubLObject)butler_inference_store.NIL);
                                                        }
                                                    }
                                                    finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_3, thread);
                                                    }
                                                }
                                                catch (Throwable ccatch_env_var2) {
                                                    commit_error2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                }
                                                finally {
                                                    thread.throwStack.pop();
                                                }
                                                sdbc.sqlc_set_error_handling(connection_$11, (SubLObject)butler_inference_store.$kw12$RETURN);
                                                if (butler_inference_store.NIL != commit_error2) {
                                                    errors2 = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error2), errors2);
                                                    rollback_result2 = sdbc.sqls_handle_rollback(connection_$11);
                                                    if (butler_inference_store.NIL != sdbc.sdbc_error_p(rollback_result2)) {
                                                        errors2 = (SubLObject)ConsesLow.cons(rollback_result2, errors2);
                                                    }
                                                }
                                                if (butler_inference_store.NIL != auto_commit2) {
                                                    auto_commit_result2 = sdbc.sqlc_set_auto_commit(connection_$11, (SubLObject)butler_inference_store.T);
                                                }
                                                if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit_result2)) {
                                                    errors2 = (SubLObject)ConsesLow.cons(auto_commit_result2, errors2);
                                                }
                                            }
                                            if (butler_inference_store.NIL != errors2) {
                                                error2 = sdbc.sqls_handle_transaction_errors(errors2);
                                            }
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)butler_inference_store.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (butler_inference_store.NIL != sdbc.sql_connection_p(connection2)) {
                                                sdbc.sqlc_close(connection2);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                    if (butler_inference_store.NIL == error2) {
                                        continue;
                                    }
                                    sdbc.sdbc_error_warn(error2);
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            else {
                SubLObject error3 = (SubLObject)butler_inference_store.NIL;
                final SubLObject db3 = sksi_access_path.access_path_db(access_path);
                final SubLObject user3 = sksi_access_path.access_path_user(access_path);
                final SubLObject password3 = sksi_access_path.access_path_password(access_path);
                final SubLObject server3 = sksi_access_path.access_path_server(access_path);
                final SubLObject port3 = sksi_access_path.access_path_port(access_path);
                final SubLObject proxy_server3 = sksi_access_path.access_path_proxy_server(access_path);
                final SubLObject proxy_port3 = sksi_access_path.access_path_proxy_port(access_path);
                final SubLObject subprotocol3 = sksi_access_path.access_path_subprotocol(access_path);
                final SubLObject timeout3 = sksi_access_path.access_path_timeout(access_path);
                final SubLObject conn_server3 = (butler_inference_store.NIL != proxy_server3) ? proxy_server3 : server3;
                final SubLObject conn_port3 = (butler_inference_store.NIL != proxy_port3) ? proxy_port3 : port3;
                final SubLObject conn_timeout3 = (butler_inference_store.NIL != timeout3) ? timeout3 : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
                SubLObject statement3 = (SubLObject)butler_inference_store.NIL;
                SubLObject connection3 = (SubLObject)butler_inference_store.NIL;
                try {
                    connection3 = sdbc.new_sql_connection(db3, user3, password3, (SubLObject)ConsesLow.list(new SubLObject[] { butler_inference_store.$kw5$DBMS_SERVER, server3, butler_inference_store.$kw6$PORT, conn_port3, butler_inference_store.$kw7$SUBPROTOCOL, subprotocol3, butler_inference_store.$kw8$PROXY_SERVER, conn_server3, butler_inference_store.$kw9$TIMEOUT, conn_timeout3 }));
                    if (butler_inference_store.NIL != sdbc.sql_open_connection_p(connection3)) {
                        statement3 = sdbc.sqlc_create_statement(connection3);
                    }
                    else {
                        statement3 = connection3;
                    }
                    if (butler_inference_store.NIL != sdbc.sql_open_statement_p(statement3)) {
                        final SubLObject connection_$12 = sdbc.sqls_get_connection(statement3);
                        final SubLObject auto_commit3 = sdbc.sqlc_get_auto_commit(connection_$12);
                        SubLObject commit_error3 = (SubLObject)butler_inference_store.NIL;
                        SubLObject rollback_result3 = (SubLObject)butler_inference_store.NIL;
                        SubLObject auto_commit_result3 = (SubLObject)butler_inference_store.NIL;
                        SubLObject errors3 = (SubLObject)butler_inference_store.NIL;
                        if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit3)) {
                            errors3 = (SubLObject)ConsesLow.cons(auto_commit3, errors3);
                        }
                        else {
                            sdbc.sqlc_set_error_handling(connection_$12, (SubLObject)butler_inference_store.$kw10$THROW);
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_5 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)butler_inference_store.$sym11$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        if (butler_inference_store.NIL != auto_commit3) {
                                            sdbc.sqlc_set_auto_commit(connection_$12, (SubLObject)butler_inference_store.NIL);
                                        }
                                        final SubLObject idx2 = inference_datastructures_problem_store.problem_store_id_index();
                                        if (butler_inference_store.NIL == id_index.id_index_objects_empty_p(idx2, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                                            final SubLObject idx_$11 = idx2;
                                            if (butler_inference_store.NIL == id_index.id_index_dense_objects_empty_p(idx_$11, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                                                final SubLObject vector_var2 = id_index.id_index_dense_objects(idx_$11);
                                                final SubLObject backwardP_var2 = (SubLObject)butler_inference_store.NIL;
                                                SubLObject length2;
                                                SubLObject v_iteration2;
                                                SubLObject id3;
                                                SubLObject problem_store3;
                                                for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)butler_inference_store.NIL, v_iteration2 = (SubLObject)butler_inference_store.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)butler_inference_store.ONE_INTEGER)) {
                                                    id3 = ((butler_inference_store.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)butler_inference_store.ONE_INTEGER) : v_iteration2);
                                                    problem_store3 = Vectors.aref(vector_var2, id3);
                                                    if (butler_inference_store.NIL == id_index.id_index_tombstone_p(problem_store3) || butler_inference_store.NIL == id_index.id_index_skip_tombstones_p((SubLObject)butler_inference_store.$kw13$SKIP)) {
                                                        if (butler_inference_store.NIL != id_index.id_index_tombstone_p(problem_store3)) {
                                                            problem_store3 = (SubLObject)butler_inference_store.$kw13$SKIP;
                                                        }
                                                        if (butler_inference_store.NIL != number_utilities.true_with_probability(p) && butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store3, statement3)) {
                                                            count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                            }
                                            final SubLObject idx_$12 = idx2;
                                            if (butler_inference_store.NIL == id_index.id_index_sparse_objects_empty_p(idx_$12)) {
                                                final SubLObject cdohash_table2 = id_index.id_index_sparse_objects(idx_$12);
                                                SubLObject id4 = (SubLObject)butler_inference_store.NIL;
                                                SubLObject problem_store4 = (SubLObject)butler_inference_store.NIL;
                                                final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
                                                try {
                                                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                                                        final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                                                        id4 = Hashtables.getEntryKey(cdohash_entry2);
                                                        problem_store4 = Hashtables.getEntryValue(cdohash_entry2);
                                                        if (butler_inference_store.NIL != number_utilities.true_with_probability(p) && butler_inference_store.NIL != butler_write_problem_store_to_inference_store_int(problem_store4, statement3)) {
                                                            count = Numbers.add(count, (SubLObject)butler_inference_store.ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                                                }
                                            }
                                        }
                                        sdbc.sqlc_commit(connection_$12);
                                    }
                                    catch (Throwable catch_var3) {
                                        Errors.handleThrowable(catch_var3, (SubLObject)butler_inference_store.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_5, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var3) {
                                commit_error3 = Errors.handleThrowable(ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            sdbc.sqlc_set_error_handling(connection_$12, (SubLObject)butler_inference_store.$kw12$RETURN);
                            if (butler_inference_store.NIL != commit_error3) {
                                errors3 = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error3), errors3);
                                rollback_result3 = sdbc.sqls_handle_rollback(connection_$12);
                                if (butler_inference_store.NIL != sdbc.sdbc_error_p(rollback_result3)) {
                                    errors3 = (SubLObject)ConsesLow.cons(rollback_result3, errors3);
                                }
                            }
                            if (butler_inference_store.NIL != auto_commit3) {
                                auto_commit_result3 = sdbc.sqlc_set_auto_commit(connection_$12, (SubLObject)butler_inference_store.T);
                            }
                            if (butler_inference_store.NIL != sdbc.sdbc_error_p(auto_commit_result3)) {
                                errors3 = (SubLObject)ConsesLow.cons(auto_commit_result3, errors3);
                            }
                        }
                        if (butler_inference_store.NIL != errors3) {
                            error3 = sdbc.sqls_handle_transaction_errors(errors3);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)butler_inference_store.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        if (butler_inference_store.NIL != sdbc.sql_connection_p(connection3)) {
                            sdbc.sqlc_close(connection3);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                    }
                }
                if (butler_inference_store.NIL != error3) {
                    count = (SubLObject)butler_inference_store.ZERO_INTEGER;
                    sdbc.sdbc_error_warn(error3);
                }
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 5990L)
    public static SubLObject butler_write_problem_store_to_inference_store_int(final SubLObject problem_store, final SubLObject statement) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject problem_store_id = butler_inference_store_insert_problem_store(problem_store, statement);
        final SubLObject already_presentP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (butler_inference_store.NIL == already_presentP && problem_store_id.isInteger()) {
            final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(problem_store);
            if (butler_inference_store.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                final SubLObject idx_$16 = idx;
                if (butler_inference_store.NIL == id_index.id_index_dense_objects_empty_p(idx_$16, (SubLObject)butler_inference_store.$kw13$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                    final SubLObject backwardP_var = (SubLObject)butler_inference_store.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject problem;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)butler_inference_store.NIL, v_iteration = (SubLObject)butler_inference_store.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)butler_inference_store.ONE_INTEGER)) {
                        id = ((butler_inference_store.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)butler_inference_store.ONE_INTEGER) : v_iteration);
                        problem = Vectors.aref(vector_var, id);
                        if (butler_inference_store.NIL == id_index.id_index_tombstone_p(problem) || butler_inference_store.NIL == id_index.id_index_skip_tombstones_p((SubLObject)butler_inference_store.$kw13$SKIP)) {
                            if (butler_inference_store.NIL != id_index.id_index_tombstone_p(problem)) {
                                problem = (SubLObject)butler_inference_store.$kw13$SKIP;
                            }
                            if (butler_inference_store.NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                                butler_inference_store_insert_problem(problem, problem_store_id, statement);
                            }
                        }
                    }
                }
                final SubLObject idx_$17 = idx;
                if (butler_inference_store.NIL == id_index.id_index_sparse_objects_empty_p(idx_$17)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$17);
                    SubLObject id2 = (SubLObject)butler_inference_store.NIL;
                    SubLObject problem2 = (SubLObject)butler_inference_store.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            problem2 = Hashtables.getEntryValue(cdohash_entry);
                            if (butler_inference_store.NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
                                butler_inference_store_insert_problem(problem2, problem_store_id, statement);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(butler_inference_store.NIL == already_presentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 6563L)
    public static SubLObject butler_inference_store_insert_problem_store(final SubLObject problem_store, final SubLObject statement) {
        final SubLObject guid_string = Guids.guid_to_string(inference_datastructures_problem_store.problem_store_guid(problem_store));
        final SubLObject system = system_info.cyc_revision_string();
        final SubLObject kb = control_vars.kb_loaded();
        final SubLObject machine = Environment.get_machine_name((SubLObject)butler_inference_store.UNPROVIDED);
        final SubLObject creation_time = universal_time_to_sql_timestamp(inference_datastructures_problem_store.problem_store_creation_time(problem_store));
        final SubLObject insert_sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str16$INSERT_into_problem_stores__guid_, new SubLObject[] { format_nil.format_nil_a_no_copy(guid_string), butler_inference_store.$str17$____, format_nil.format_nil_a_no_copy(system), butler_inference_store.$str18$___, format_nil.format_nil_a_no_copy(kb), butler_inference_store.$str19$___, format_nil.format_nil_a_no_copy(machine), butler_inference_store.$str17$____, format_nil.format_nil_a_no_copy(creation_time), butler_inference_store.$str20$__ });
        final SubLObject query_sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str21$SELECT_id_FROM_problem_stores_WHE, new SubLObject[] { format_nil.format_nil_a_no_copy(guid_string), butler_inference_store.$str22$_ });
        SubLObject problem_store_id = butler_inference_store_query_for_single_value(query_sql, statement);
        final SubLObject already_presentP = list_utilities.sublisp_boolean(problem_store_id);
        if (butler_inference_store.NIL == already_presentP) {
            butler_inference_store_execute_sql_update(insert_sql, statement);
            problem_store_id = butler_inference_store_query_for_single_value(query_sql, statement);
        }
        return Values.values(problem_store_id, already_presentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 7632L)
    public static SubLObject butler_inference_store_insert_problem(final SubLObject problem, final SubLObject problem_store_id, final SubLObject statement) {
        final SubLObject sentence = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
        final SubLObject suid = inference_datastructures_problem.problem_suid(problem);
        final SubLObject status = inference_datastructures_problem.problem_status(problem);
        final SubLObject sentence_id = butler_inference_store_insert_problem_query_sentence(sentence, statement);
        final SubLObject mt_id = butler_inference_store_insert_problem_query_mt(mt, statement);
        final SubLObject status_id = butler_inference_store_status_id(status);
        final SubLObject insert_sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str23$INSERT_into_problems__prob_store_, new SubLObject[] { format_nil.format_nil_a_no_copy(problem_store_id), butler_inference_store.$str24$__, format_nil.format_nil_a_no_copy(sentence_id), butler_inference_store.$str24$__, format_nil.format_nil_a_no_copy(mt_id), butler_inference_store.$str24$__, format_nil.format_nil_a_no_copy(suid), butler_inference_store.$str24$__, format_nil.format_nil_a_no_copy(status_id), butler_inference_store.$str25$_ });
        butler_inference_store_execute_sql_update(insert_sql, statement);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 8423L)
    public static SubLObject butler_inference_store_insert_problem_query_sentence(final SubLObject sentence, final SubLObject statement) {
        if (butler_inference_store.NIL != variables.fully_bound_p(sentence)) {
            return butler_inference_store_insert_expression(sentence, butler_inference_store.$butler_inference_store_fully_bound_formula_type$.getGlobalValue(), statement);
        }
        return butler_inference_store_insert_expression(sentence, butler_inference_store.$butler_inference_store_not_fully_bound_formula_type$.getGlobalValue(), statement);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 8817L)
    public static SubLObject butler_inference_store_insert_problem_query_mt(final SubLObject mt, final SubLObject statement) {
        if (butler_inference_store.NIL != constant_handles.constant_p(mt)) {
            return butler_inference_store_insert_expression(mt, butler_inference_store.$butler_inference_store_constant_type$.getGlobalValue(), statement);
        }
        if (butler_inference_store.NIL != nart_handles.nart_p(mt)) {
            return butler_inference_store_insert_expression(mt, butler_inference_store.$butler_inference_store_nart_type$.getGlobalValue(), statement);
        }
        if (butler_inference_store.NIL != narts_high.naut_p(mt)) {
            return butler_inference_store_insert_expression(mt, butler_inference_store.$butler_inference_store_naut_type$.getGlobalValue(), statement);
        }
        return butler_inference_store_unknown_expression_type_warning(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 9336L)
    public static SubLObject butler_inference_store_insert_expression(final SubLObject expression, final SubLObject type, final SubLObject statement) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject expression_id = butler_inference_store_insert_expression_int(expression, type, statement);
        final SubLObject already_presentP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (butler_inference_store.NIL == already_presentP && butler_inference_store.NIL != butler_inference_store_complex_type_p(type)) {
            final SubLObject terms = cycl_utilities.formula_terms(expression, (SubLObject)butler_inference_store.$kw26$IGNORE);
            SubLObject list_var = (SubLObject)butler_inference_store.NIL;
            SubLObject subexpression = (SubLObject)butler_inference_store.NIL;
            SubLObject argnum = (SubLObject)butler_inference_store.NIL;
            list_var = terms;
            subexpression = list_var.first();
            for (argnum = (SubLObject)butler_inference_store.ZERO_INTEGER; butler_inference_store.NIL != list_var; list_var = list_var.rest(), subexpression = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                final SubLObject type_$18 = butler_inference_store_expression_type(subexpression);
                if (butler_inference_store.NIL != type_$18) {
                    butler_inference_store_insert_subexpression(subexpression, type_$18, argnum, expression_id, statement);
                }
                else if (butler_inference_store.NIL != assertion_handles.assertion_p(subexpression)) {
                    final SubLObject formula = assertions_high.assertion_formula(subexpression);
                    final SubLObject formula_type = butler_inference_store_expression_type(formula);
                    final SubLObject mt = assertions_high.assertion_mt(subexpression);
                    final SubLObject mt_type = butler_inference_store_expression_type(mt);
                    if (butler_inference_store.NIL != formula_type) {
                        butler_inference_store_insert_subexpression(formula, formula_type, argnum, expression_id, statement);
                    }
                    else {
                        butler_inference_store_unknown_expression_type_warning(formula);
                    }
                    if (butler_inference_store.NIL != mt_type) {
                        butler_inference_store_insert_subexpression(mt, mt_type, argnum, expression_id, statement);
                    }
                    else {
                        butler_inference_store_unknown_expression_type_warning(mt);
                    }
                }
                else {
                    butler_inference_store_unknown_expression_type_warning(subexpression);
                }
            }
        }
        return expression_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 10687L)
    public static SubLObject butler_inference_store_insert_subexpression(final SubLObject subexpression, final SubLObject type, final SubLObject argnum, final SubLObject expression_id, final SubLObject statement) {
        final SubLObject subexpression_id = butler_inference_store_insert_expression(subexpression, type, statement);
        final SubLObject insert_sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str27$INSERT_INTO_complex_expressions__, new SubLObject[] { format_nil.format_nil_a_no_copy(expression_id), butler_inference_store.$str24$__, format_nil.format_nil_a_no_copy(argnum), butler_inference_store.$str24$__, format_nil.format_nil_a_no_copy(subexpression_id), butler_inference_store.$str25$_ });
        butler_inference_store_execute_sql_update(insert_sql, statement);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 11144L)
    public static SubLObject butler_inference_store_insert_expression_int(final SubLObject expression, final SubLObject type, final SubLObject statement) {
        final SubLObject external_id_string = kb_utilities.hl_external_id_string(expression);
        final SubLObject insert_sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str28$INSERT_INTO_expressions__external, new SubLObject[] { format_nil.format_nil_a_no_copy(external_id_string), butler_inference_store.$str18$___, format_nil.format_nil_a_no_copy(type), butler_inference_store.$str25$_ });
        final SubLObject query_sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str29$SELECT_id_FROM_expressions_WHERE_, new SubLObject[] { format_nil.format_nil_a_no_copy(external_id_string), butler_inference_store.$str22$_ });
        SubLObject expression_id = butler_inference_store_query_for_single_value(query_sql, statement);
        final SubLObject already_presentP = list_utilities.sublisp_boolean(expression_id);
        if (butler_inference_store.NIL == already_presentP) {
            butler_inference_store_execute_sql_update(insert_sql, statement);
            expression_id = butler_inference_store_query_for_single_value(query_sql, statement);
        }
        return Values.values(expression_id, already_presentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 11921L)
    public static SubLObject butler_inference_store_problem_store_properties(final SubLObject guid) {
        final SubLObject guid_string = Guids.guid_to_string(guid);
        final SubLObject sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str30$SELECT_DISTINCT_system__kb__machi, new SubLObject[] { format_nil.format_nil_a_no_copy(guid_string), butler_inference_store.$str22$_ });
        SubLObject current;
        final SubLObject datum = current = butler_inference_store_query_for_single_row(sql, (SubLObject)butler_inference_store.UNPROVIDED);
        final SubLObject id = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list31);
        current = current.rest();
        final SubLObject system = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list31);
        current = current.rest();
        final SubLObject kb = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list31);
        current = current.rest();
        final SubLObject machine = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list31);
        current = current.rest();
        final SubLObject creation_time = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list31);
        current = current.rest();
        if (butler_inference_store.NIL == current) {
            return Values.values(system, kb, machine, creation_time);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)butler_inference_store.$list31);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 12522L)
    public static SubLObject butler_inference_store_problem_properties(final SubLObject problem_store_guid, final SubLObject problem_suid) {
        final SubLObject guid_string = Guids.guid_to_string(problem_store_guid);
        final SubLObject sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str32$SELECT_DISTINCT_e1_external_id__e, new SubLObject[] { format_nil.format_nil_a_no_copy(problem_suid), butler_inference_store.$str33$_AND_ps_id___p_prob_store_AND_ps_, format_nil.format_nil_a_no_copy(guid_string), butler_inference_store.$str34$__AND_e1_id___p_sentence_AND_e2_i });
        SubLObject current;
        final SubLObject datum = current = butler_inference_store_query_for_single_row(sql, (SubLObject)butler_inference_store.UNPROVIDED);
        final SubLObject id = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list35);
        current = current.rest();
        SubLObject sentence = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list35);
        current = current.rest();
        SubLObject mt = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list35);
        current = current.rest();
        SubLObject status = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list35);
        current = current.rest();
        if (butler_inference_store.NIL == current) {
            if (butler_inference_store.NIL != sentence) {
                sentence = kb_utilities.find_object_by_hl_external_id_string(sentence);
            }
            if (butler_inference_store.NIL != mt) {
                mt = kb_utilities.find_object_by_hl_external_id_string(mt);
            }
            if (butler_inference_store.NIL != status) {
                status = butler_inference_store_id_status(status);
            }
            return Values.values(sentence, mt, status);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)butler_inference_store.$list35);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 13493L)
    public static SubLObject butler_inference_store_problem_query_problem_store_count(final SubLObject sentence, SubLObject mt) {
        if (mt == butler_inference_store.UNPROVIDED) {
            mt = (SubLObject)butler_inference_store.NIL;
        }
        SubLObject sql = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != mt) {
            final SubLObject sentence_id = kb_utilities.hl_external_id_string(sentence);
            final SubLObject mt_id = kb_utilities.hl_external_id_string(mt);
            sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str36$SELECT_COUNT_DISTINCT_p_prob_stor, new SubLObject[] { format_nil.format_nil_a_no_copy(sentence_id), butler_inference_store.$str37$__AND_e2_external_id____, format_nil.format_nil_a_no_copy(mt_id), butler_inference_store.$str22$_ });
        }
        else {
            final SubLObject sentence_id = kb_utilities.hl_external_id_string(sentence);
            sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str38$SELECT_COUNT_DISTINCT_p_prob_stor, new SubLObject[] { format_nil.format_nil_a_no_copy(sentence_id), butler_inference_store.$str22$_ });
        }
        return butler_inference_store_query_for_single_value(sql, (SubLObject)butler_inference_store.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 14466L)
    public static SubLObject butler_inference_store_most_interesting_problem_queries(SubLObject n, SubLObject consider_mtP, SubLObject status) {
        if (n == butler_inference_store.UNPROVIDED) {
            n = (SubLObject)butler_inference_store.NIL;
        }
        if (consider_mtP == butler_inference_store.UNPROVIDED) {
            consider_mtP = (SubLObject)butler_inference_store.NIL;
        }
        if (status == butler_inference_store.UNPROVIDED) {
            status = (SubLObject)butler_inference_store.NIL;
        }
        final SubLObject status_id = (SubLObject)((butler_inference_store.NIL != status) ? butler_inference_store_status_id(status) : butler_inference_store.NIL);
        SubLObject sql = (SubLObject)butler_inference_store.NIL;
        SubLObject funcs = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != status && butler_inference_store.NIL == status_id) {
            return iteration.new_null_iterator();
        }
        if (butler_inference_store.NIL != status_id && butler_inference_store.NIL != consider_mtP) {
            sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str39$SELECT_DISTINCT_e1_external_id__e, new SubLObject[] { format_nil.format_nil_a_no_copy(status_id), butler_inference_store.$str40$_GROUP_BY_e1_external_id__e2_exte });
            funcs = (SubLObject)butler_inference_store.$list41;
        }
        else if (butler_inference_store.NIL != status_id) {
            sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str42$SELECT_DISTINCT_e_external_id__CO, new SubLObject[] { format_nil.format_nil_a_no_copy(status_id), butler_inference_store.$str43$_GROUP_BY_e_external_id_ORDER_BY_ });
            funcs = (SubLObject)butler_inference_store.$list44;
        }
        else if (butler_inference_store.NIL != consider_mtP) {
            sql = (SubLObject)butler_inference_store.$str45$SELECT_DISTINCT_e1_external_id__e;
            funcs = (SubLObject)butler_inference_store.$list41;
        }
        else {
            sql = (SubLObject)butler_inference_store.$str46$SELECT_DISTINCT_e_external_id__CO;
            funcs = (SubLObject)butler_inference_store.$list44;
        }
        if (butler_inference_store.NIL != subl_promotions.positive_integer_p(n)) {
            sql = Sequences.cconcatenate(sql, Sequences.cconcatenate((SubLObject)butler_inference_store.$str47$_LIMIT_, format_nil.format_nil_s_no_copy(n)));
        }
        return new_butler_inference_store_query_iterator(sql, funcs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 16836L)
    public static SubLObject butler_inference_store_problem_query_related_problem_queries(final SubLObject sentence, SubLObject mt) {
        if (mt == butler_inference_store.UNPROVIDED) {
            mt = (SubLObject)butler_inference_store.NIL;
        }
        SubLObject sql = (SubLObject)butler_inference_store.NIL;
        SubLObject funcs = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != mt) {
            final SubLObject sentence_id = kb_utilities.hl_external_id_string(sentence);
            final SubLObject mt_id = kb_utilities.hl_external_id_string(mt);
            sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str48$SELECT_DISTINCT_e3_external_id__e, new SubLObject[] { format_nil.format_nil_a_no_copy(sentence_id), butler_inference_store.$str49$__AND_p1_sentence___e1_id_AND_e2_, format_nil.format_nil_a_no_copy(mt_id), butler_inference_store.$str50$__AND_p1_mt___e2_id_AND_p2_prob_s });
            funcs = (SubLObject)butler_inference_store.$list51;
        }
        else {
            final SubLObject sentence_id = kb_utilities.hl_external_id_string(sentence);
            sql = Sequences.cconcatenate((SubLObject)butler_inference_store.$str52$SELECT_DISTINCT_e2_external_id_FR, new SubLObject[] { format_nil.format_nil_a_no_copy(sentence_id), butler_inference_store.$str53$__AND_p1_sentence___e1_id_AND_p2_ });
            funcs = (SubLObject)butler_inference_store.$list54;
        }
        return new_butler_inference_store_query_iterator(sql, funcs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 18335L)
    public static SubLObject butler_inference_store_problem_queries_with_term_in_sentence_arg(final SubLObject v_term, final SubLObject argnum, SubLObject consider_mtP) {
        if (consider_mtP == butler_inference_store.UNPROVIDED) {
            consider_mtP = (SubLObject)butler_inference_store.NIL;
        }
        final SubLObject term_id = kb_utilities.hl_external_id_string(v_term);
        final SubLObject sql = (butler_inference_store.NIL != consider_mtP) ? Sequences.cconcatenate((SubLObject)butler_inference_store.$str55$SELECT_DISTINCT_e1_external_id__e, new SubLObject[] { format_nil.format_nil_a_no_copy(argnum), butler_inference_store.$str56$_AND_c_simple_exp___e3_id_AND_e3_, format_nil.format_nil_a_no_copy(term_id), butler_inference_store.$str22$_ }) : Sequences.cconcatenate((SubLObject)butler_inference_store.$str57$SELECT_DISTINCT_e1_external_id_FR, new SubLObject[] { format_nil.format_nil_a_no_copy(argnum), butler_inference_store.$str58$_AND_c_simple_exp___e2_id_AND_e2_, format_nil.format_nil_a_no_copy(term_id), butler_inference_store.$str22$_ });
        final SubLObject funcs = (SubLObject)((butler_inference_store.NIL != consider_mtP) ? butler_inference_store.$list51 : butler_inference_store.$list54);
        return new_butler_inference_store_query_iterator(sql, funcs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 19605L)
    public static SubLObject butler_inference_store_problem_queries_with_status(final SubLObject status, SubLObject consider_mtP) {
        if (consider_mtP == butler_inference_store.UNPROVIDED) {
            consider_mtP = (SubLObject)butler_inference_store.NIL;
        }
        final SubLObject status_id = butler_inference_store_status_id(status);
        if (butler_inference_store.NIL != status_id) {
            final SubLObject sql = (butler_inference_store.NIL != consider_mtP) ? Sequences.cconcatenate((SubLObject)butler_inference_store.$str59$SELECT_DISTINCT_e1_external_id__e, new SubLObject[] { format_nil.format_nil_a_no_copy(status_id), butler_inference_store.$str60$_AND_p_sentence___e1_id_AND_p_mt_ }) : Sequences.cconcatenate((SubLObject)butler_inference_store.$str61$SELECT_DISTINCT_e_external_id_FRO, new SubLObject[] { format_nil.format_nil_a_no_copy(status_id), butler_inference_store.$str62$_AND_p_sentence___e_id });
            final SubLObject funcs = (SubLObject)((butler_inference_store.NIL != consider_mtP) ? butler_inference_store.$list51 : butler_inference_store.$list54);
            return new_butler_inference_store_query_iterator(sql, funcs);
        }
        return iteration.new_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 20650L)
    public static SubLObject do_butler_inference_store_most_interesting_problem_queries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)butler_inference_store.$list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_store_count_var = (SubLObject)butler_inference_store.NIL;
        SubLObject sentence_var = (SubLObject)butler_inference_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)butler_inference_store.$list63);
        problem_store_count_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)butler_inference_store.$list63);
        sentence_var = current.first();
        current = current.rest();
        final SubLObject mt_var = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list63);
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)butler_inference_store.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)butler_inference_store.NIL;
        SubLObject current_$19 = (SubLObject)butler_inference_store.NIL;
        while (butler_inference_store.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)butler_inference_store.$list63);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)butler_inference_store.$list63);
            if (butler_inference_store.NIL == conses_high.member(current_$19, (SubLObject)butler_inference_store.$list64, (SubLObject)butler_inference_store.UNPROVIDED, (SubLObject)butler_inference_store.UNPROVIDED)) {
                bad = (SubLObject)butler_inference_store.T;
            }
            if (current_$19 == butler_inference_store.$kw65$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (butler_inference_store.NIL != bad && butler_inference_store.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)butler_inference_store.$list63);
        }
        final SubLObject n_tail = cdestructuring_bind.property_list_member((SubLObject)butler_inference_store.$kw66$N, current);
        final SubLObject n = (SubLObject)((butler_inference_store.NIL != n_tail) ? conses_high.cadr(n_tail) : butler_inference_store.NIL);
        final SubLObject status_tail = cdestructuring_bind.property_list_member((SubLObject)butler_inference_store.$kw67$STATUS, current);
        final SubLObject status = (SubLObject)((butler_inference_store.NIL != status_tail) ? conses_high.cadr(status_tail) : butler_inference_store.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)butler_inference_store.$kw68$DONE, current);
        final SubLObject done = (SubLObject)((butler_inference_store.NIL != done_tail) ? conses_high.cadr(done_tail) : butler_inference_store.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)butler_inference_store.$sym69$ITERATOR;
        final SubLObject row = (SubLObject)butler_inference_store.$sym70$ROW;
        return (SubLObject)((butler_inference_store.NIL != mt_var) ? ConsesLow.list((SubLObject)butler_inference_store.$sym71$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)butler_inference_store.$sym72$BUTLER_INFERENCE_STORE_MOST_INTERESTING_PROBLEM_QUERIES, n, (SubLObject)butler_inference_store.T, status))), (SubLObject)ConsesLow.list((SubLObject)butler_inference_store.$sym73$DO_ITERATOR_WITHOUT_VALUES, (SubLObject)ConsesLow.list(row, iterator, (SubLObject)butler_inference_store.$kw68$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)butler_inference_store.$sym74$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(sentence_var, mt_var, problem_store_count_var), row, ConsesLow.append(body, (SubLObject)butler_inference_store.NIL)))) : ConsesLow.list((SubLObject)butler_inference_store.$sym71$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)butler_inference_store.$sym72$BUTLER_INFERENCE_STORE_MOST_INTERESTING_PROBLEM_QUERIES, n, (SubLObject)butler_inference_store.NIL, status))), (SubLObject)ConsesLow.list((SubLObject)butler_inference_store.$sym73$DO_ITERATOR_WITHOUT_VALUES, (SubLObject)ConsesLow.list(row, iterator, (SubLObject)butler_inference_store.$kw68$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)butler_inference_store.$sym74$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(sentence_var, problem_store_count_var), row, ConsesLow.append(body, (SubLObject)butler_inference_store.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 21393L)
    public static SubLObject do_butler_inference_store_problem_queries_with_status(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)butler_inference_store.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject status = (SubLObject)butler_inference_store.NIL;
        SubLObject sentence_var = (SubLObject)butler_inference_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)butler_inference_store.$list75);
        status = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)butler_inference_store.$list75);
        sentence_var = current.first();
        current = current.rest();
        final SubLObject mt_var = (SubLObject)(current.isCons() ? current.first() : butler_inference_store.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)butler_inference_store.$list75);
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)butler_inference_store.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)butler_inference_store.NIL;
        SubLObject current_$20 = (SubLObject)butler_inference_store.NIL;
        while (butler_inference_store.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)butler_inference_store.$list75);
            current_$20 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)butler_inference_store.$list75);
            if (butler_inference_store.NIL == conses_high.member(current_$20, (SubLObject)butler_inference_store.$list76, (SubLObject)butler_inference_store.UNPROVIDED, (SubLObject)butler_inference_store.UNPROVIDED)) {
                bad = (SubLObject)butler_inference_store.T;
            }
            if (current_$20 == butler_inference_store.$kw65$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (butler_inference_store.NIL != bad && butler_inference_store.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)butler_inference_store.$list75);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)butler_inference_store.$kw68$DONE, current);
        final SubLObject done = (SubLObject)((butler_inference_store.NIL != done_tail) ? conses_high.cadr(done_tail) : butler_inference_store.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)butler_inference_store.$sym77$ITERATOR;
        final SubLObject row = (SubLObject)butler_inference_store.$sym78$ROW;
        return (SubLObject)((butler_inference_store.NIL != mt_var) ? ConsesLow.list((SubLObject)butler_inference_store.$sym71$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.listS((SubLObject)butler_inference_store.$sym79$BUTLER_INFERENCE_STORE_PROBLEM_QUERIES_WITH_STATUS, status, (SubLObject)butler_inference_store.$list80))), (SubLObject)ConsesLow.list((SubLObject)butler_inference_store.$sym73$DO_ITERATOR_WITHOUT_VALUES, (SubLObject)ConsesLow.list(row, iterator, (SubLObject)butler_inference_store.$kw68$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)butler_inference_store.$sym74$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(sentence_var, mt_var), row, ConsesLow.append(body, (SubLObject)butler_inference_store.NIL)))) : ConsesLow.list((SubLObject)butler_inference_store.$sym71$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.listS((SubLObject)butler_inference_store.$sym79$BUTLER_INFERENCE_STORE_PROBLEM_QUERIES_WITH_STATUS, status, (SubLObject)butler_inference_store.$list81))), (SubLObject)ConsesLow.list((SubLObject)butler_inference_store.$sym73$DO_ITERATOR_WITHOUT_VALUES, (SubLObject)ConsesLow.list(row, iterator, (SubLObject)butler_inference_store.$kw68$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)butler_inference_store.$sym74$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(sentence_var), row, ConsesLow.append(body, (SubLObject)butler_inference_store.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 22028L)
    public static SubLObject butler_inference_store_unknown_expression_type_warning(final SubLObject expression) {
        return Errors.warn((SubLObject)butler_inference_store.$str82$Currently_cannot_handle_expressio, expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 22221L)
    public static SubLObject butler_inference_store_query_for_single_value(final SubLObject sql, SubLObject statement) {
        if (statement == butler_inference_store.UNPROVIDED) {
            statement = (SubLObject)butler_inference_store.NIL;
        }
        final SubLObject result_set = butler_inference_store_execute_sql_query(sql, statement);
        SubLObject value = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != sdbc.sql_open_result_set_p(result_set)) {
            if (!sdbc.sqlrs_row_count(result_set).isZero()) {
                sdbc.sqlrs_next(result_set);
                value = sdbc.sqlrs_get_object(result_set, (SubLObject)butler_inference_store.ONE_INTEGER);
            }
            sksi_result_set_iterators.finalize_result_set(result_set);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 22627L)
    public static SubLObject butler_inference_store_query_for_single_row(final SubLObject sql, SubLObject statement) {
        if (statement == butler_inference_store.UNPROVIDED) {
            statement = (SubLObject)butler_inference_store.NIL;
        }
        final SubLObject result_set = butler_inference_store_execute_sql_query(sql, statement);
        SubLObject row = (SubLObject)butler_inference_store.NIL;
        if (butler_inference_store.NIL != sdbc.sql_open_result_set_p(result_set)) {
            if (!sdbc.sqlrs_row_count(result_set).isZero()) {
                sdbc.sqlrs_next(result_set);
                row = sksi_result_set_iterators.sqlrs_current_row_as_list(result_set);
            }
            sksi_result_set_iterators.finalize_result_set(result_set);
        }
        return row;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 23032L)
    public static SubLObject universal_time_to_sql_timestamp(final SubLObject universal_time) {
        return date_utilities.cyc_date_encode_string_internal((SubLObject)butler_inference_store.$str83$YYYY_MM_DD_HH_MM_SS, date_utilities.universal_time_to_cycl_date(universal_time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 23209L)
    public static SubLObject sql_time_stamp_to_universal_time(final SubLObject time_stamp) {
        return date_utilities.cycl_date_to_universal_time(date_utilities.cyc_date_decode_string_internal((SubLObject)butler_inference_store.$str83$YYYY_MM_DD_HH_MM_SS, time_stamp));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 23378L)
    public static SubLObject new_butler_inference_store_query_iterator(final SubLObject sql, final SubLObject decoding_functions) {
        final SubLObject result_set = butler_inference_store_execute_sql_query(sql, (SubLObject)butler_inference_store.UNPROVIDED);
        if (butler_inference_store.NIL != sdbc.sql_open_result_set_p(result_set)) {
            return iteration.new_iterator(butler_inference_store_iterator_state(result_set, decoding_functions), (SubLObject)butler_inference_store.$sym84$BUTLER_INFERENCE_STORE_ITERATOR_DONE, (SubLObject)butler_inference_store.$sym85$BUTLER_INFERENCE_STORE_ITERATOR_NEXT, (SubLObject)butler_inference_store.$sym86$BUTLER_INFERENCE_STORE_ITERATOR_FINALIZE);
        }
        return iteration.new_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 23853L)
    public static SubLObject butler_inference_store_iterator_state(final SubLObject result_set, final SubLObject decoding_functions) {
        return (SubLObject)ConsesLow.list(sksi_result_set_iterators.new_sqlrs_iterator(result_set, (SubLObject)butler_inference_store.UNPROVIDED, (SubLObject)butler_inference_store.UNPROVIDED), decoding_functions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 24007L)
    public static SubLObject butler_inference_store_iterator_done(final SubLObject state) {
        SubLObject sub_iterator = (SubLObject)butler_inference_store.NIL;
        SubLObject decoding_functions = (SubLObject)butler_inference_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)butler_inference_store.$list87);
        sub_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)butler_inference_store.$list87);
        decoding_functions = current.first();
        current = current.rest();
        if (butler_inference_store.NIL == current) {
            return iteration.iteration_done(sub_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)butler_inference_store.$list87);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 24208L)
    public static SubLObject butler_inference_store_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sub_iterator = (SubLObject)butler_inference_store.NIL;
        SubLObject decoding_functions = (SubLObject)butler_inference_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)butler_inference_store.$list87);
        sub_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)butler_inference_store.$list87);
        decoding_functions = current.first();
        current = current.rest();
        if (butler_inference_store.NIL == current) {
            SubLObject next = (SubLObject)butler_inference_store.NIL;
            thread.resetMultipleValues();
            final SubLObject raw_row = iteration.iteration_next(sub_iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (butler_inference_store.NIL != validP) {
                SubLObject raw_next = (SubLObject)butler_inference_store.NIL;
                SubLObject raw_next_$21 = (SubLObject)butler_inference_store.NIL;
                SubLObject decoding_function = (SubLObject)butler_inference_store.NIL;
                SubLObject decoding_function_$22 = (SubLObject)butler_inference_store.NIL;
                raw_next = raw_row;
                raw_next_$21 = raw_next.first();
                decoding_function = decoding_functions;
                decoding_function_$22 = decoding_function.first();
                while (butler_inference_store.NIL != decoding_function || butler_inference_store.NIL != raw_next) {
                    next = (SubLObject)ConsesLow.cons(butler_inference_store_iterator_decoding_funcall(decoding_function_$22, raw_next_$21), next);
                    raw_next = raw_next.rest();
                    raw_next_$21 = raw_next.first();
                    decoding_function = decoding_function.rest();
                    decoding_function_$22 = decoding_function.first();
                }
                next = Sequences.nreverse(next);
            }
            return Values.values(next, state, (SubLObject)SubLObjectFactory.makeBoolean(butler_inference_store.NIL == validP));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)butler_inference_store.$list87);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 24709L)
    public static SubLObject butler_inference_store_iterator_decoding_funcall(final SubLObject function, final SubLObject arg) {
        if (function.eql((SubLObject)butler_inference_store.$sym88$QUOTE) || function.eql((SubLObject)butler_inference_store.IDENTITY)) {
            return arg;
        }
        if (function.eql((SubLObject)butler_inference_store.$sym88$QUOTE) || function.eql((SubLObject)butler_inference_store.$sym89$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING)) {
            return kb_utilities.find_object_by_hl_external_id_string(arg);
        }
        if (function.eql((SubLObject)butler_inference_store.$sym88$QUOTE) || function.eql((SubLObject)butler_inference_store.$sym90$BUTLER_INFERENCE_STORE_ID_STATUS)) {
            return butler_inference_store_id_status(arg);
        }
        if (function.eql((SubLObject)butler_inference_store.$sym88$QUOTE) || function.eql((SubLObject)butler_inference_store.$sym91$SQL_TIME_STAMP_TO_UNIVERSAL_TIME)) {
            return sql_time_stamp_to_universal_time(arg);
        }
        return Functions.funcall(function, arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25169L)
    public static SubLObject butler_inference_store_iterator_finalize(final SubLObject state) {
        SubLObject sub_iterator = (SubLObject)butler_inference_store.NIL;
        SubLObject decoding_functions = (SubLObject)butler_inference_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)butler_inference_store.$list87);
        sub_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)butler_inference_store.$list87);
        decoding_functions = current.first();
        current = current.rest();
        if (butler_inference_store.NIL == current) {
            return iteration.iteration_finalize(sub_iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)butler_inference_store.$list87);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 25910L)
    public static SubLObject butler_inference_store_simple_type_p(final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(type.eql(butler_inference_store.$butler_inference_store_constant_type$.getGlobalValue()) || type.eql(butler_inference_store.$butler_inference_store_variable_type$.getGlobalValue()) || type.eql(butler_inference_store.$butler_inference_store_string_type$.getGlobalValue()) || type.eql(butler_inference_store.$butler_inference_store_number_type$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 26197L)
    public static SubLObject butler_inference_store_complex_type_p(final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(type.eql(butler_inference_store.$butler_inference_store_nart_type$.getGlobalValue()) || type.eql(butler_inference_store.$butler_inference_store_naut_type$.getGlobalValue()) || type.eql(butler_inference_store.$butler_inference_store_fully_bound_formula_type$.getGlobalValue()) || type.eql(butler_inference_store.$butler_inference_store_not_fully_bound_formula_type$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 26507L)
    public static SubLObject butler_inference_store_expression_type(final SubLObject expression) {
        if (butler_inference_store.NIL != constant_handles.constant_p(expression)) {
            return butler_inference_store.$butler_inference_store_constant_type$.getGlobalValue();
        }
        if (butler_inference_store.NIL != variables.variable_p(expression)) {
            return butler_inference_store.$butler_inference_store_variable_type$.getGlobalValue();
        }
        if (butler_inference_store.NIL != nart_handles.nart_p(expression)) {
            return butler_inference_store.$butler_inference_store_nart_type$.getGlobalValue();
        }
        if (butler_inference_store.NIL != narts_high.naut_p(expression)) {
            return butler_inference_store.$butler_inference_store_naut_type$.getGlobalValue();
        }
        if (expression.isString()) {
            return butler_inference_store.$butler_inference_store_string_type$.getGlobalValue();
        }
        if (expression.isNumber()) {
            return butler_inference_store.$butler_inference_store_number_type$.getGlobalValue();
        }
        if (butler_inference_store.NIL != assertion_handles.assertion_p(expression)) {
            return (SubLObject)butler_inference_store.NIL;
        }
        if (butler_inference_store.NIL != variables.fully_bound_p(expression)) {
            return butler_inference_store.$butler_inference_store_fully_bound_formula_type$.getGlobalValue();
        }
        if (butler_inference_store.NIL != variables.not_fully_bound_p(expression)) {
            return butler_inference_store.$butler_inference_store_not_fully_bound_formula_type$.getGlobalValue();
        }
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 27471L)
    public static SubLObject butler_inference_store_status_id(final SubLObject status) {
        final SubLObject pcase_var;
        final SubLObject provability_status = pcase_var = ((butler_inference_store.NIL != inference_datastructures_enumerated_types.provability_status_p(status)) ? status : inference_datastructures_enumerated_types.provability_status_from_problem_status(status));
        if (pcase_var.eql((SubLObject)butler_inference_store.$kw92$GOOD)) {
            return butler_inference_store.$butler_inference_store_good_status$.getGlobalValue();
        }
        if (pcase_var.eql((SubLObject)butler_inference_store.$kw93$NEUTRAL)) {
            return butler_inference_store.$butler_inference_store_neutral_status$.getGlobalValue();
        }
        if (pcase_var.eql((SubLObject)butler_inference_store.$kw94$NO_GOOD)) {
            return butler_inference_store.$butler_inference_store_no_good_status$.getGlobalValue();
        }
        return Errors.warn((SubLObject)butler_inference_store.$str95$Unknown_status__s, status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/butler-inference-store.lisp", position = 27966L)
    public static SubLObject butler_inference_store_id_status(final SubLObject id) {
        if (id.eql(butler_inference_store.$butler_inference_store_good_status$.getGlobalValue())) {
            return (SubLObject)butler_inference_store.$kw92$GOOD;
        }
        if (id.eql(butler_inference_store.$butler_inference_store_neutral_status$.getGlobalValue())) {
            return (SubLObject)butler_inference_store.$kw93$NEUTRAL;
        }
        if (id.eql(butler_inference_store.$butler_inference_store_no_good_status$.getGlobalValue())) {
            return (SubLObject)butler_inference_store.$kw94$NO_GOOD;
        }
        return (SubLObject)butler_inference_store.NIL;
    }
    
    public static SubLObject declare_butler_inference_store_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_access_path", "BUTLER-INFERENCE-STORE-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "reset_bulter_inference_store_access_path", "RESET-BULTER-INFERENCE-STORE-ACCESS-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_execute_sql_query", "BUTLER-INFERENCE-STORE-EXECUTE-SQL-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_execute_sql_update", "BUTLER-INFERENCE-STORE-EXECUTE-SQL-UPDATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_write_problem_store_to_inference_store", "BUTLER-WRITE-PROBLEM-STORE-TO-INFERENCE-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_write_all_problem_stores_to_inference_store", "BUTLER-WRITE-ALL-PROBLEM-STORES-TO-INFERENCE-STORE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_write_random_problem_stores_to_inference_store", "BUTLER-WRITE-RANDOM-PROBLEM-STORES-TO-INFERENCE-STORE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_write_problem_store_to_inference_store_int", "BUTLER-WRITE-PROBLEM-STORE-TO-INFERENCE-STORE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_insert_problem_store", "BUTLER-INFERENCE-STORE-INSERT-PROBLEM-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_insert_problem", "BUTLER-INFERENCE-STORE-INSERT-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_insert_problem_query_sentence", "BUTLER-INFERENCE-STORE-INSERT-PROBLEM-QUERY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_insert_problem_query_mt", "BUTLER-INFERENCE-STORE-INSERT-PROBLEM-QUERY-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_insert_expression", "BUTLER-INFERENCE-STORE-INSERT-EXPRESSION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_insert_subexpression", "BUTLER-INFERENCE-STORE-INSERT-SUBEXPRESSION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_insert_expression_int", "BUTLER-INFERENCE-STORE-INSERT-EXPRESSION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_problem_store_properties", "BUTLER-INFERENCE-STORE-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_problem_properties", "BUTLER-INFERENCE-STORE-PROBLEM-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_problem_query_problem_store_count", "BUTLER-INFERENCE-STORE-PROBLEM-QUERY-PROBLEM-STORE-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_most_interesting_problem_queries", "BUTLER-INFERENCE-STORE-MOST-INTERESTING-PROBLEM-QUERIES", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_problem_query_related_problem_queries", "BUTLER-INFERENCE-STORE-PROBLEM-QUERY-RELATED-PROBLEM-QUERIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_problem_queries_with_term_in_sentence_arg", "BUTLER-INFERENCE-STORE-PROBLEM-QUERIES-WITH-TERM-IN-SENTENCE-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_problem_queries_with_status", "BUTLER-INFERENCE-STORE-PROBLEM-QUERIES-WITH-STATUS", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.butler.butler_inference_store", "do_butler_inference_store_most_interesting_problem_queries", "DO-BUTLER-INFERENCE-STORE-MOST-INTERESTING-PROBLEM-QUERIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.butler.butler_inference_store", "do_butler_inference_store_problem_queries_with_status", "DO-BUTLER-INFERENCE-STORE-PROBLEM-QUERIES-WITH-STATUS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_unknown_expression_type_warning", "BUTLER-INFERENCE-STORE-UNKNOWN-EXPRESSION-TYPE-WARNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_query_for_single_value", "BUTLER-INFERENCE-STORE-QUERY-FOR-SINGLE-VALUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_query_for_single_row", "BUTLER-INFERENCE-STORE-QUERY-FOR-SINGLE-ROW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "universal_time_to_sql_timestamp", "UNIVERSAL-TIME-TO-SQL-TIMESTAMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "sql_time_stamp_to_universal_time", "SQL-TIME-STAMP-TO-UNIVERSAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "new_butler_inference_store_query_iterator", "NEW-BUTLER-INFERENCE-STORE-QUERY-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_iterator_state", "BUTLER-INFERENCE-STORE-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_iterator_done", "BUTLER-INFERENCE-STORE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_iterator_next", "BUTLER-INFERENCE-STORE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_iterator_decoding_funcall", "BUTLER-INFERENCE-STORE-ITERATOR-DECODING-FUNCALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_iterator_finalize", "BUTLER-INFERENCE-STORE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_simple_type_p", "BUTLER-INFERENCE-STORE-SIMPLE-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_complex_type_p", "BUTLER-INFERENCE-STORE-COMPLEX-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_expression_type", "BUTLER-INFERENCE-STORE-EXPRESSION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_status_id", "BUTLER-INFERENCE-STORE-STATUS-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.butler_inference_store", "butler_inference_store_id_status", "BUTLER-INFERENCE-STORE-ID-STATUS", 1, 0, false);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    public static SubLObject init_butler_inference_store_file() {
        butler_inference_store.$butler_inference_store_ks$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-KS*", butler_inference_store.$const0$ButlerInferenceStore_KS);
        butler_inference_store.$butler_inference_store_access_path$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-ACCESS-PATH*", (SubLObject)butler_inference_store.NIL);
        butler_inference_store.$butler_inference_store_constant_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-CONSTANT-TYPE*", (SubLObject)butler_inference_store.ONE_INTEGER);
        butler_inference_store.$butler_inference_store_variable_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-VARIABLE-TYPE*", (SubLObject)butler_inference_store.TWO_INTEGER);
        butler_inference_store.$butler_inference_store_nart_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-NART-TYPE*", (SubLObject)butler_inference_store.THREE_INTEGER);
        butler_inference_store.$butler_inference_store_naut_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-NAUT-TYPE*", (SubLObject)butler_inference_store.FOUR_INTEGER);
        butler_inference_store.$butler_inference_store_fully_bound_formula_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-FULLY-BOUND-FORMULA-TYPE*", (SubLObject)butler_inference_store.FIVE_INTEGER);
        butler_inference_store.$butler_inference_store_not_fully_bound_formula_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-NOT-FULLY-BOUND-FORMULA-TYPE*", (SubLObject)butler_inference_store.SIX_INTEGER);
        butler_inference_store.$butler_inference_store_string_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-STRING-TYPE*", (SubLObject)butler_inference_store.SEVEN_INTEGER);
        butler_inference_store.$butler_inference_store_number_type$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-NUMBER-TYPE*", (SubLObject)butler_inference_store.EIGHT_INTEGER);
        butler_inference_store.$butler_inference_store_good_status$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-GOOD-STATUS*", (SubLObject)butler_inference_store.ONE_INTEGER);
        butler_inference_store.$butler_inference_store_neutral_status$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-NEUTRAL-STATUS*", (SubLObject)butler_inference_store.TWO_INTEGER);
        butler_inference_store.$butler_inference_store_no_good_status$ = SubLFiles.deflexical("*BUTLER-INFERENCE-STORE-NO-GOOD-STATUS*", (SubLObject)butler_inference_store.THREE_INTEGER);
        return (SubLObject)butler_inference_store.NIL;
    }
    
    public static SubLObject setup_butler_inference_store_file() {
        return (SubLObject)butler_inference_store.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_butler_inference_store_file();
    }
    
    @Override
	public void initializeVariables() {
        init_butler_inference_store_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_butler_inference_store_file();
    }
    
    static {
        me = (SubLFile)new butler_inference_store();
        butler_inference_store.$butler_inference_store_ks$ = null;
        butler_inference_store.$butler_inference_store_access_path$ = null;
        butler_inference_store.$butler_inference_store_constant_type$ = null;
        butler_inference_store.$butler_inference_store_variable_type$ = null;
        butler_inference_store.$butler_inference_store_nart_type$ = null;
        butler_inference_store.$butler_inference_store_naut_type$ = null;
        butler_inference_store.$butler_inference_store_fully_bound_formula_type$ = null;
        butler_inference_store.$butler_inference_store_not_fully_bound_formula_type$ = null;
        butler_inference_store.$butler_inference_store_string_type$ = null;
        butler_inference_store.$butler_inference_store_number_type$ = null;
        butler_inference_store.$butler_inference_store_good_status$ = null;
        butler_inference_store.$butler_inference_store_neutral_status$ = null;
        butler_inference_store.$butler_inference_store_no_good_status$ = null;
        $const0$ButlerInferenceStore_KS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ButlerInferenceStore-KS"));
        $str1$Could_not_find_access_path_for_Bu = SubLObjectFactory.makeString("Could not find access path for Butler inference store.");
        $sym2$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym3$SQL_STATEMENT_P = SubLObjectFactory.makeSymbol("SQL-STATEMENT-P");
        $sym4$PROBLEM_STORE_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-P");
        $kw5$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw6$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw7$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $kw8$PROXY_SERVER = SubLObjectFactory.makeKeyword("PROXY-SERVER");
        $kw9$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $kw10$THROW = SubLObjectFactory.makeKeyword("THROW");
        $sym11$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw12$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw13$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $float14$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym15$PROBABILITY_P = SubLObjectFactory.makeSymbol("PROBABILITY-P");
        $str16$INSERT_into_problem_stores__guid_ = SubLObjectFactory.makeString("INSERT into problem_stores (guid, system, kb, machine, creation_time) VALUES ('");
        $str17$____ = SubLObjectFactory.makeString("', '");
        $str18$___ = SubLObjectFactory.makeString("', ");
        $str19$___ = SubLObjectFactory.makeString(", '");
        $str20$__ = SubLObjectFactory.makeString("')");
        $str21$SELECT_id_FROM_problem_stores_WHE = SubLObjectFactory.makeString("SELECT id FROM problem_stores WHERE guid = '");
        $str22$_ = SubLObjectFactory.makeString("'");
        $str23$INSERT_into_problems__prob_store_ = SubLObjectFactory.makeString("INSERT into problems (prob_store, sentence, mt, suid, status) VALUES (");
        $str24$__ = SubLObjectFactory.makeString(", ");
        $str25$_ = SubLObjectFactory.makeString(")");
        $kw26$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str27$INSERT_INTO_complex_expressions__ = SubLObjectFactory.makeString("INSERT INTO complex_expressions (complex_exp, argnum, simple_exp) VALUES (");
        $str28$INSERT_INTO_expressions__external = SubLObjectFactory.makeString("INSERT INTO expressions (external_id, type) VALUES ('");
        $str29$SELECT_id_FROM_expressions_WHERE_ = SubLObjectFactory.makeString("SELECT id FROM expressions WHERE external_id = '");
        $str30$SELECT_DISTINCT_system__kb__machi = SubLObjectFactory.makeString("SELECT DISTINCT system, kb, machine, creation_time FROM problem_stores where guid = '");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM"), (SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATION-TIME"));
        $str32$SELECT_DISTINCT_e1_external_id__e = SubLObjectFactory.makeString("SELECT DISTINCT e1.external_id, e2.external_id, p.status FROM problems p, problem_stores ps, expressions e1, expressions e2 WHERE p.suid = ");
        $str33$_AND_ps_id___p_prob_store_AND_ps_ = SubLObjectFactory.makeString(" AND ps.id = p.prob_store AND ps.guid = '");
        $str34$__AND_e1_id___p_sentence_AND_e2_i = SubLObjectFactory.makeString("' AND e1.id = p.sentence AND e2.id = p.mt");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"));
        $str36$SELECT_COUNT_DISTINCT_p_prob_stor = SubLObjectFactory.makeString("SELECT COUNT(DISTINCT p.prob_store) FROM problems p, expressions e1, expressions e2 WHERE p.sentence = e1.id AND p.mt = e2.id AND e1.external_id = '");
        $str37$__AND_e2_external_id____ = SubLObjectFactory.makeString("' AND e2.external_id = '");
        $str38$SELECT_COUNT_DISTINCT_p_prob_stor = SubLObjectFactory.makeString("SELECT COUNT(DISTINCT p.prob_store) FROM problems p, expressions e WHERE p.sentence = e.id AND e.external_id = '");
        $str39$SELECT_DISTINCT_e1_external_id__e = SubLObjectFactory.makeString("SELECT DISTINCT e1.external_id, e2.external_id, COUNT(DISTINCT p.prob_store) FROM problems p, expressions e1, expressions e2 WHERE e1.id = p.sentence AND e2.id = p.mt AND p.status = ");
        $str40$_GROUP_BY_e1_external_id__e2_exte = SubLObjectFactory.makeString(" GROUP BY e1.external_id, e2.external_id ORDER BY count DESC");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), (SubLObject)butler_inference_store.IDENTITY);
        $str42$SELECT_DISTINCT_e_external_id__CO = SubLObjectFactory.makeString("SELECT DISTINCT e.external_id, COUNT(DISTINCT p.prob_store) FROM problems p, expressions e WHERE e.id = p.sentence AND p.status = ");
        $str43$_GROUP_BY_e_external_id_ORDER_BY_ = SubLObjectFactory.makeString(" GROUP BY e.external_id ORDER BY count DESC");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), (SubLObject)butler_inference_store.IDENTITY);
        $str45$SELECT_DISTINCT_e1_external_id__e = SubLObjectFactory.makeString("SELECT DISTINCT e1.external_id, e2.external_id, COUNT(DISTINCT p.prob_store) FROM problems p, expressions e1, expressions e2 WHERE e1.id = p.sentence AND e2.id = p.mt GROUP BY e1.external_id, e2.external_id ORDER BY count DESC");
        $str46$SELECT_DISTINCT_e_external_id__CO = SubLObjectFactory.makeString("SELECT DISTINCT e.external_id, COUNT(DISTINCT p.prob_store) FROM problems p, expressions e WHERE e.id = p.sentence GROUP BY e.external_id ORDER BY count DESC");
        $str47$_LIMIT_ = SubLObjectFactory.makeString(" LIMIT ");
        $str48$SELECT_DISTINCT_e3_external_id__e = SubLObjectFactory.makeString("SELECT DISTINCT e3.external_id, e4.external_id FROM problems p1, problems p2, expressions e1, expressions e2, expressions e3, expressions e4 WHERE e1.external_id = '");
        $str49$__AND_p1_sentence___e1_id_AND_e2_ = SubLObjectFactory.makeString("' AND p1.sentence = e1.id AND e2.external_id = '");
        $str50$__AND_p1_mt___e2_id_AND_p2_prob_s = SubLObjectFactory.makeString("' AND p1.mt = e2.id AND p2.prob_store = p1.prob_store AND p2.sentence = e3.id AND p2.mt = e4.id");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"));
        $str52$SELECT_DISTINCT_e2_external_id_FR = SubLObjectFactory.makeString("SELECT DISTINCT e2.external_id FROM problems p1, problems p2, expressions e1, expressions e2 WHERE e1.external_id = '");
        $str53$__AND_p1_sentence___e1_id_AND_p2_ = SubLObjectFactory.makeString("' AND p1.sentence = e1.id AND p2.prob_store = p1.prob_store AND p2.sentence = e2.id");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"));
        $str55$SELECT_DISTINCT_e1_external_id__e = SubLObjectFactory.makeString("SELECT DISTINCT e1.external_id, e2.external_id FROM problems p, expressions e1, expressions e2, expressions e3, complex_expressions c WHERE p.sentence = e1.id AND p.mt = e2.id AND c.complex_exp = e1.id AND c.argnum = ");
        $str56$_AND_c_simple_exp___e3_id_AND_e3_ = SubLObjectFactory.makeString(" AND c.simple_exp = e3.id AND e3.external_id = '");
        $str57$SELECT_DISTINCT_e1_external_id_FR = SubLObjectFactory.makeString("SELECT DISTINCT e1.external_id FROM problems p, expressions e1, expressions e2, complex_expressions c WHERE p.sentence = e1.id AND c.complex_exp = e1.id AND c.argnum = ");
        $str58$_AND_c_simple_exp___e2_id_AND_e2_ = SubLObjectFactory.makeString(" AND c.simple_exp = e2.id AND e2.external_id = '");
        $str59$SELECT_DISTINCT_e1_external_id__e = SubLObjectFactory.makeString("SELECT DISTINCT e1.external_id, e2.external_id FROM problems p, expressions e1, expressions e2 WHERE p.status = ");
        $str60$_AND_p_sentence___e1_id_AND_p_mt_ = SubLObjectFactory.makeString(" AND p.sentence = e1.id AND p.mt = e2.id");
        $str61$SELECT_DISTINCT_e_external_id_FRO = SubLObjectFactory.makeString("SELECT DISTINCT e.external_id FROM problems p, expressions e WHERE p.status = ");
        $str62$_AND_p_sentence___e_id = SubLObjectFactory.makeString(" AND p.sentence = e.id");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-COUNT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("N"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw65$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw66$N = SubLObjectFactory.makeKeyword("N");
        $kw67$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw68$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym69$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym70$ROW = SubLObjectFactory.makeUninternedSymbol("ROW");
        $sym71$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym72$BUTLER_INFERENCE_STORE_MOST_INTERESTING_PROBLEM_QUERIES = SubLObjectFactory.makeSymbol("BUTLER-INFERENCE-STORE-MOST-INTERESTING-PROBLEM-QUERIES");
        $sym73$DO_ITERATOR_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("DO-ITERATOR-WITHOUT-VALUES");
        $sym74$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym77$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym78$ROW = SubLObjectFactory.makeUninternedSymbol("ROW");
        $sym79$BUTLER_INFERENCE_STORE_PROBLEM_QUERIES_WITH_STATUS = SubLObjectFactory.makeSymbol("BUTLER-INFERENCE-STORE-PROBLEM-QUERIES-WITH-STATUS");
        $list80 = ConsesLow.list((SubLObject)butler_inference_store.T);
        $list81 = ConsesLow.list((SubLObject)butler_inference_store.NIL);
        $str82$Currently_cannot_handle_expressio = SubLObjectFactory.makeString("Currently cannot handle expression ~s");
        $str83$YYYY_MM_DD_HH_MM_SS = SubLObjectFactory.makeString("YYYY-MM-DD HH:MM:SS");
        $sym84$BUTLER_INFERENCE_STORE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("BUTLER-INFERENCE-STORE-ITERATOR-DONE");
        $sym85$BUTLER_INFERENCE_STORE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("BUTLER-INFERENCE-STORE-ITERATOR-NEXT");
        $sym86$BUTLER_INFERENCE_STORE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("BUTLER-INFERENCE-STORE-ITERATOR-FINALIZE");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING-FUNCTIONS"));
        $sym88$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym89$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING");
        $sym90$BUTLER_INFERENCE_STORE_ID_STATUS = SubLObjectFactory.makeSymbol("BUTLER-INFERENCE-STORE-ID-STATUS");
        $sym91$SQL_TIME_STAMP_TO_UNIVERSAL_TIME = SubLObjectFactory.makeSymbol("SQL-TIME-STAMP-TO-UNIVERSAL-TIME");
        $kw92$GOOD = SubLObjectFactory.makeKeyword("GOOD");
        $kw93$NEUTRAL = SubLObjectFactory.makeKeyword("NEUTRAL");
        $kw94$NO_GOOD = SubLObjectFactory.makeKeyword("NO-GOOD");
        $str95$Unknown_status__s = SubLObjectFactory.makeString("Unknown status ~s");
    }
}

/*

	Total time: 1265 ms
	 synthetic 
*/