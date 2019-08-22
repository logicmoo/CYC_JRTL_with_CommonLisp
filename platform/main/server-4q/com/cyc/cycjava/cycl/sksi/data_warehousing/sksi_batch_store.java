package com.cyc.cycjava.cycl.sksi.data_warehousing;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_batch_store extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_batch_store();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store";

    public static final String myFingerPrint = "bc763b2ab3a6687cee7d5772b42e3e6e9b09feeb60aa4490a135872926baced8";

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));





















    private static final SubLList $list11 = list(makeSymbol("RAW-TUPLE"), makeSymbol("&OPTIONAL"), makeSymbol("CSQL-CONDITIONS"));



    public static SubLObject sksi_store_ist_logical_sentences_in_sk_source(final SubLObject list_of_ist_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject source_type = sksi_kb_accessors.sk_source_ks_type(sk_source);
                    if ($$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_ist_logical_sentences_in_db(list_of_ist_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, $INSERT);
                    } else {
                        SubLObject cdolist_list_var = list_of_ist_logical_sentences;
                        SubLObject ist_logical_sentence = NIL;
                        ist_logical_sentence = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_store_ist_logical_sentence(ist_logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            ist_logical_sentence = cdolist_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_delete_ist_logical_sentences_from_sk_source(final SubLObject list_of_ist_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject source_type = sksi_kb_accessors.sk_source_ks_type(sk_source);
                    if ($$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_ist_logical_sentences_in_db(list_of_ist_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, $DELETE);
                    } else {
                        SubLObject cdolist_list_var = list_of_ist_logical_sentences;
                        SubLObject ist_logical_sentence = NIL;
                        ist_logical_sentence = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_delete_ist_logical_sentence(ist_logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            ist_logical_sentence = cdolist_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_store_logical_sentences_in_sk_source(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject source_type = sksi_kb_accessors.sk_source_ks_type(sk_source);
                    if ($$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_logical_sentences_in_db(list_of_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, $INSERT, UNPROVIDED, UNPROVIDED);
                    } else {
                        SubLObject cdolist_list_var = list_of_logical_sentences;
                        SubLObject logical_sentence = NIL;
                        logical_sentence = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_store_logical_sentence(logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            logical_sentence = cdolist_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_delete_logical_sentences_from_sk_source(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject source_type = sksi_kb_accessors.sk_source_ks_type(sk_source);
                    if ($$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_logical_sentences_in_db(list_of_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, $DELETE, UNPROVIDED, UNPROVIDED);
                    } else {
                        SubLObject cdolist_list_var = list_of_logical_sentences;
                        SubLObject logical_sentence = NIL;
                        logical_sentence = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_delete_logical_sentence(logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            logical_sentence = cdolist_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_store_mt_contents_in_sk_source(final SubLObject mt, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject logical_sentences = Mapping.mapcar(ASSERTION_FORMULA, kb_mapping.gather_mt_index(mt));
                sksi_store_logical_sentences_in_sk_source(logical_sentences, sk_source, logical_schema, physical_schema, meta_mt, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_delete_mt_contents_from_sk_source(final SubLObject mt, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject logical_sentences = Mapping.mapcar(ASSERTION_FORMULA, kb_mapping.gather_mt_index(mt));
                sksi_delete_logical_sentences_from_sk_source(logical_sentences, sk_source, logical_schema, physical_schema, meta_mt, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_store_or_delete_ist_logical_sentences_in_db(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject access_path, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error = NIL;
        if (NIL != sksi_access_path.access_path_p(access_path)) {
            final SubLObject db = sksi_access_path.access_path_db(access_path);
            final SubLObject user = sksi_access_path.access_path_user(access_path);
            final SubLObject password = sksi_access_path.access_path_password(access_path);
            final SubLObject server = sksi_access_path.access_path_server(access_path);
            final SubLObject port = sksi_access_path.access_path_port(access_path);
            final SubLObject proxy_server = sksi_access_path.access_path_proxy_server(access_path);
            final SubLObject proxy_port = sksi_access_path.access_path_proxy_port(access_path);
            final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
            final SubLObject timeout = sksi_access_path.access_path_timeout(access_path);
            final SubLObject conn_server = (NIL != proxy_server) ? proxy_server : server;
            final SubLObject conn_port = (NIL != proxy_port) ? proxy_port : port;
            final SubLObject conn_timeout = (NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
            SubLObject statement = NIL;
            SubLObject connection = NIL;
            try {
                connection = sdbc.new_sql_connection(db, user, password, list(new SubLObject[]{ $DBMS_SERVER, server, $PORT, conn_port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, conn_server, $TIMEOUT, conn_timeout }));
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                } else {
                    statement = connection;
                }
                if (NIL != sdbc.sql_open_statement_p(statement)) {
                    final SubLObject connection_$11 = sdbc.sqls_get_connection(statement);
                    final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$11);
                    SubLObject commit_error = NIL;
                    SubLObject rollback_result = NIL;
                    SubLObject auto_commit_result = NIL;
                    SubLObject errors = NIL;
                    if (NIL != sdbc.sdbc_error_p(auto_commit)) {
                        errors = cons(auto_commit, errors);
                    } else {
                        sdbc.sqlc_set_error_handling(connection_$11, $THROW);
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if (NIL != auto_commit) {
                                        sdbc.sqlc_set_auto_commit(connection_$11, NIL);
                                    }
                                    final SubLObject _prev_bind_0_$12 = sksi_reformulate.$memoize_sksi_reformulateP$.currentBinding(thread);
                                    try {
                                        sksi_reformulate.$memoize_sksi_reformulateP$.bind(NIL, thread);
                                        SubLObject cdolist_list_var = list_of_logical_sentences;
                                        SubLObject logical_sentence = NIL;
                                        logical_sentence = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            thread.resetMultipleValues();
                                            final SubLObject raw_tuples = sksi_incremental_edit.sksi_translate_ist_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source);
                                            final SubLObject physical_fields = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject cdolist_list_var_$13 = raw_tuples;
                                            SubLObject raw_tuple_conditions_pair = NIL;
                                            raw_tuple_conditions_pair = cdolist_list_var_$13.first();
                                            while (NIL != cdolist_list_var_$13) {
                                                SubLObject current;
                                                final SubLObject datum = current = raw_tuple_conditions_pair;
                                                SubLObject raw_tuple = NIL;
                                                destructuring_bind_must_consp(current, datum, $list11);
                                                raw_tuple = current.first();
                                                current = current.rest();
                                                final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list11);
                                                current = current.rest();
                                                if (NIL == current) {
                                                    final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, operator, csql_conditions);
                                                    if (NIL == sksi_csql_utilities.invalid_csql_expressionP(csql)) {
                                                        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
                                                        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, UNPROVIDED);
                                                        sksi_sks_interaction.sksi_add_batch_sql_update(sql, statement);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list11);
                                                }
                                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                raw_tuple_conditions_pair = cdolist_list_var_$13.first();
                                            } 
                                            cdolist_list_var = cdolist_list_var.rest();
                                            logical_sentence = cdolist_list_var.first();
                                        } 
                                        result = sksi_sks_interaction.sksi_execute_batch_sql_updates(statement);
                                    } finally {
                                        sksi_reformulate.$memoize_sksi_reformulateP$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    sdbc.sqlc_commit(connection_$11);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            commit_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        sdbc.sqlc_set_error_handling(connection_$11, $RETURN);
                        if (NIL != commit_error) {
                            errors = cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                            rollback_result = sdbc.sqls_handle_rollback(connection_$11);
                            if (NIL != sdbc.sdbc_error_p(rollback_result)) {
                                errors = cons(rollback_result, errors);
                            }
                        }
                        if (NIL != auto_commit) {
                            auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$11, T);
                        }
                        if (NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                            errors = cons(auto_commit_result, errors);
                        }
                    }
                    if (NIL != errors) {
                        error = sdbc.sqls_handle_transaction_errors(errors);
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != sdbc.sql_connection_p(connection)) {
                        sdbc.sqlc_close(connection);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (NIL != error) {
                result = error;
            }
        }
        return result;
    }

    public static SubLObject sksi_store_or_delete_logical_sentences_in_db(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject access_path, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject operator, SubLObject get_auto_generated_keysP, SubLObject execute_batchP) {
        if (get_auto_generated_keysP == UNPROVIDED) {
            get_auto_generated_keysP = NIL;
        }
        if (execute_batchP == UNPROVIDED) {
            execute_batchP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject auto_generated_keys = NIL;
        SubLObject sql_statements_to_be_executed = NIL;
        if (NIL != sksi_access_path.access_path_p(access_path)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(meta_mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(meta_mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(meta_mt), thread);
                final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
                SubLObject all_sql_statements = NIL;
                SubLObject all_auto_key_fields = NIL;
                SubLObject failureP = NIL;
                if (NIL == failureP) {
                    SubLObject csome_list_var = list_of_logical_sentences;
                    SubLObject logical_sentence = NIL;
                    logical_sentence = csome_list_var.first();
                    while ((NIL == failureP) && (NIL != csome_list_var)) {
                        thread.resetMultipleValues();
                        final SubLObject raw_tuples = sksi_incremental_edit.sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, UNPROVIDED);
                        final SubLObject physical_fields = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != raw_tuples) && (NIL != physical_fields)) {
                            SubLObject some_successP = NIL;
                            SubLObject cdolist_list_var = raw_tuples;
                            SubLObject raw_tuple_conditions_pair = NIL;
                            raw_tuple_conditions_pair = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = raw_tuple_conditions_pair;
                                SubLObject raw_tuple = NIL;
                                destructuring_bind_must_consp(current, datum, $list11);
                                raw_tuple = current.first();
                                current = current.rest();
                                final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
                                destructuring_bind_must_listp(current, datum, $list11);
                                current = current.rest();
                                if (NIL == current) {
                                    thread.resetMultipleValues();
                                    final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, operator, csql_conditions);
                                    final SubLObject auto_key_fields = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == sksi_csql_utilities.invalid_csql_expressionP(csql)) {
                                        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, UNPROVIDED);
                                        some_successP = T;
                                        all_sql_statements = cons(sql, all_sql_statements);
                                        all_auto_key_fields = union(all_auto_key_fields, auto_key_fields, UNPROVIDED, UNPROVIDED);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list11);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                raw_tuple_conditions_pair = cdolist_list_var.first();
                            } 
                            if (NIL == some_successP) {
                                failureP = T;
                            }
                        } else {
                            failureP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        logical_sentence = csome_list_var.first();
                    } 
                }
                all_sql_statements = nreverse(all_sql_statements);
                if ((NIL != failureP) && (NIL == sksi_database_fusion.within_sksi_database_fusionP())) {
                    result = NIL;
                } else
                    if (NIL != execute_batchP) {
                        thread.resetMultipleValues();
                        final SubLObject result_$14 = sksi_sks_interaction.sksi_batch_execute_sql_statements(sk_source, access_path, all_sql_statements, get_auto_generated_keysP, all_auto_key_fields);
                        final SubLObject auto_generated_keys_$15 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$14;
                        auto_generated_keys = auto_generated_keys_$15;
                    } else {
                        sql_statements_to_be_executed = all_sql_statements;
                    }

            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return values(result, auto_generated_keys, sql_statements_to_be_executed);
    }

    public static SubLObject declare_sksi_batch_store_file() {
        declareFunction(me, "sksi_store_ist_logical_sentences_in_sk_source", "SKSI-STORE-IST-LOGICAL-SENTENCES-IN-SK-SOURCE", 4, 2, false);
        declareFunction(me, "sksi_delete_ist_logical_sentences_from_sk_source", "SKSI-DELETE-IST-LOGICAL-SENTENCES-FROM-SK-SOURCE", 4, 2, false);
        declareFunction(me, "sksi_store_logical_sentences_in_sk_source", "SKSI-STORE-LOGICAL-SENTENCES-IN-SK-SOURCE", 4, 2, false);
        declareFunction(me, "sksi_delete_logical_sentences_from_sk_source", "SKSI-DELETE-LOGICAL-SENTENCES-FROM-SK-SOURCE", 4, 2, false);
        declareFunction(me, "sksi_store_mt_contents_in_sk_source", "SKSI-STORE-MT-CONTENTS-IN-SK-SOURCE", 4, 1, false);
        declareFunction(me, "sksi_delete_mt_contents_from_sk_source", "SKSI-DELETE-MT-CONTENTS-FROM-SK-SOURCE", 4, 1, false);
        declareFunction(me, "sksi_store_or_delete_ist_logical_sentences_in_db", "SKSI-STORE-OR-DELETE-IST-LOGICAL-SENTENCES-IN-DB", 7, 0, false);
        declareFunction(me, "sksi_store_or_delete_logical_sentences_in_db", "SKSI-STORE-OR-DELETE-LOGICAL-SENTENCES-IN-DB", 7, 2, false);
        return NIL;
    }

    public static SubLObject init_sksi_batch_store_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_batch_store_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_batch_store_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_batch_store_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_batch_store_file();
    }

    
}

/**
 * Total time: 320 ms
 */
