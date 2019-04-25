package com.cyc.cycjava.cycl.sksi.data_warehousing;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_batch_store extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store";
    public static final String myFingerPrint = "bc763b2ab3a6687cee7d5772b42e3e6e9b09feeb60aa4490a135872926baced8";
    private static final SubLObject $const0$Database_Physical;
    private static final SubLSymbol $kw1$INSERT;
    private static final SubLSymbol $kw2$DELETE;
    private static final SubLSymbol $sym3$ASSERTION_FORMULA;
    private static final SubLSymbol $kw4$DBMS_SERVER;
    private static final SubLSymbol $kw5$PORT;
    private static final SubLSymbol $kw6$SUBPROTOCOL;
    private static final SubLSymbol $kw7$PROXY_SERVER;
    private static final SubLSymbol $kw8$TIMEOUT;
    private static final SubLSymbol $kw9$THROW;
    private static final SubLSymbol $sym10$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$RETURN;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 3651L)
    public static SubLObject sksi_store_ist_logical_sentences_in_sk_source(final SubLObject list_of_ist_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_batch_store.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_batch_store.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_batch_store.UNPROVIDED);
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
                    if (sksi_batch_store.$const0$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_ist_logical_sentences_in_db(list_of_ist_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, (SubLObject)sksi_batch_store.$kw1$INSERT);
                    }
                    else {
                        SubLObject cdolist_list_var = list_of_ist_logical_sentences;
                        SubLObject ist_logical_sentence = (SubLObject)sksi_batch_store.NIL;
                        ist_logical_sentence = cdolist_list_var.first();
                        while (sksi_batch_store.NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_store_ist_logical_sentence(ist_logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            ist_logical_sentence = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 4869L)
    public static SubLObject sksi_delete_ist_logical_sentences_from_sk_source(final SubLObject list_of_ist_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_batch_store.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_batch_store.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_batch_store.UNPROVIDED);
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
                    if (sksi_batch_store.$const0$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_ist_logical_sentences_in_db(list_of_ist_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, (SubLObject)sksi_batch_store.$kw2$DELETE);
                    }
                    else {
                        SubLObject cdolist_list_var = list_of_ist_logical_sentences;
                        SubLObject ist_logical_sentence = (SubLObject)sksi_batch_store.NIL;
                        ist_logical_sentence = cdolist_list_var.first();
                        while (sksi_batch_store.NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_delete_ist_logical_sentence(ist_logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            ist_logical_sentence = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 5942L)
    public static SubLObject sksi_store_logical_sentences_in_sk_source(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_batch_store.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_batch_store.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_batch_store.UNPROVIDED);
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
                    if (sksi_batch_store.$const0$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_logical_sentences_in_db(list_of_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, (SubLObject)sksi_batch_store.$kw1$INSERT, (SubLObject)sksi_batch_store.UNPROVIDED, (SubLObject)sksi_batch_store.UNPROVIDED);
                    }
                    else {
                        SubLObject cdolist_list_var = list_of_logical_sentences;
                        SubLObject logical_sentence = (SubLObject)sksi_batch_store.NIL;
                        logical_sentence = cdolist_list_var.first();
                        while (sksi_batch_store.NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_store_logical_sentence(logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            logical_sentence = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 7100L)
    public static SubLObject sksi_delete_logical_sentences_from_sk_source(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_batch_store.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_batch_store.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_batch_store.UNPROVIDED);
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
                    if (sksi_batch_store.$const0$Database_Physical.eql(source_type)) {
                        sksi_store_or_delete_logical_sentences_in_db(list_of_logical_sentences, sk_source, access_path, logical_schema, physical_schema, meta_mt, (SubLObject)sksi_batch_store.$kw2$DELETE, (SubLObject)sksi_batch_store.UNPROVIDED, (SubLObject)sksi_batch_store.UNPROVIDED);
                    }
                    else {
                        SubLObject cdolist_list_var = list_of_logical_sentences;
                        SubLObject logical_sentence = (SubLObject)sksi_batch_store.NIL;
                        logical_sentence = cdolist_list_var.first();
                        while (sksi_batch_store.NIL != cdolist_list_var) {
                            sksi_incremental_edit.sksi_delete_logical_sentence(logical_sentence, sk_source, logical_schema, physical_schema, meta_mt, access_path);
                            cdolist_list_var = cdolist_list_var.rest();
                            logical_sentence = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 8153L)
    public static SubLObject sksi_store_mt_contents_in_sk_source(final SubLObject mt, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt) {
        if (meta_mt == sksi_batch_store.UNPROVIDED) {
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
                final SubLObject logical_sentences = Mapping.mapcar((SubLObject)sksi_batch_store.$sym3$ASSERTION_FORMULA, kb_mapping.gather_mt_index(mt));
                sksi_store_logical_sentences_in_sk_source(logical_sentences, sk_source, logical_schema, physical_schema, meta_mt, (SubLObject)sksi_batch_store.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 8905L)
    public static SubLObject sksi_delete_mt_contents_from_sk_source(final SubLObject mt, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt) {
        if (meta_mt == sksi_batch_store.UNPROVIDED) {
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
                final SubLObject logical_sentences = Mapping.mapcar((SubLObject)sksi_batch_store.$sym3$ASSERTION_FORMULA, kb_mapping.gather_mt_index(mt));
                sksi_delete_logical_sentences_from_sk_source(logical_sentences, sk_source, logical_schema, physical_schema, meta_mt, (SubLObject)sksi_batch_store.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 9570L)
    public static SubLObject sksi_store_or_delete_ist_logical_sentences_in_db(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject access_path, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_batch_store.NIL;
        SubLObject error = (SubLObject)sksi_batch_store.NIL;
        if (sksi_batch_store.NIL != sksi_access_path.access_path_p(access_path)) {
            final SubLObject db = sksi_access_path.access_path_db(access_path);
            final SubLObject user = sksi_access_path.access_path_user(access_path);
            final SubLObject password = sksi_access_path.access_path_password(access_path);
            final SubLObject server = sksi_access_path.access_path_server(access_path);
            final SubLObject port = sksi_access_path.access_path_port(access_path);
            final SubLObject proxy_server = sksi_access_path.access_path_proxy_server(access_path);
            final SubLObject proxy_port = sksi_access_path.access_path_proxy_port(access_path);
            final SubLObject subprotocol = sksi_access_path.access_path_subprotocol(access_path);
            final SubLObject timeout = sksi_access_path.access_path_timeout(access_path);
            final SubLObject conn_server = (sksi_batch_store.NIL != proxy_server) ? proxy_server : server;
            final SubLObject conn_port = (sksi_batch_store.NIL != proxy_port) ? proxy_port : port;
            final SubLObject conn_timeout = (sksi_batch_store.NIL != timeout) ? timeout : sksi_sks_interaction.$sksi_open_sql_connection_default_timeout$.getDynamicValue(thread);
            SubLObject statement = (SubLObject)sksi_batch_store.NIL;
            SubLObject connection = (SubLObject)sksi_batch_store.NIL;
            try {
                connection = sdbc.new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_batch_store.$kw4$DBMS_SERVER, server, sksi_batch_store.$kw5$PORT, conn_port, sksi_batch_store.$kw6$SUBPROTOCOL, subprotocol, sksi_batch_store.$kw7$PROXY_SERVER, conn_server, sksi_batch_store.$kw8$TIMEOUT, conn_timeout }));
                if (sksi_batch_store.NIL != sdbc.sql_open_connection_p(connection)) {
                    statement = sdbc.sqlc_create_statement(connection);
                }
                else {
                    statement = connection;
                }
                if (sksi_batch_store.NIL != sdbc.sql_open_statement_p(statement)) {
                    final SubLObject connection_$11 = sdbc.sqls_get_connection(statement);
                    final SubLObject auto_commit = sdbc.sqlc_get_auto_commit(connection_$11);
                    SubLObject commit_error = (SubLObject)sksi_batch_store.NIL;
                    SubLObject rollback_result = (SubLObject)sksi_batch_store.NIL;
                    SubLObject auto_commit_result = (SubLObject)sksi_batch_store.NIL;
                    SubLObject errors = (SubLObject)sksi_batch_store.NIL;
                    if (sksi_batch_store.NIL != sdbc.sdbc_error_p(auto_commit)) {
                        errors = (SubLObject)ConsesLow.cons(auto_commit, errors);
                    }
                    else {
                        sdbc.sqlc_set_error_handling(connection_$11, (SubLObject)sksi_batch_store.$kw9$THROW);
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)sksi_batch_store.$sym10$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if (sksi_batch_store.NIL != auto_commit) {
                                        sdbc.sqlc_set_auto_commit(connection_$11, (SubLObject)sksi_batch_store.NIL);
                                    }
                                    final SubLObject _prev_bind_0_$12 = sksi_reformulate.$memoize_sksi_reformulateP$.currentBinding(thread);
                                    try {
                                        sksi_reformulate.$memoize_sksi_reformulateP$.bind((SubLObject)sksi_batch_store.NIL, thread);
                                        SubLObject cdolist_list_var = list_of_logical_sentences;
                                        SubLObject logical_sentence = (SubLObject)sksi_batch_store.NIL;
                                        logical_sentence = cdolist_list_var.first();
                                        while (sksi_batch_store.NIL != cdolist_list_var) {
                                            thread.resetMultipleValues();
                                            final SubLObject raw_tuples = sksi_incremental_edit.sksi_translate_ist_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source);
                                            final SubLObject physical_fields = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject cdolist_list_var_$13 = raw_tuples;
                                            SubLObject raw_tuple_conditions_pair = (SubLObject)sksi_batch_store.NIL;
                                            raw_tuple_conditions_pair = cdolist_list_var_$13.first();
                                            while (sksi_batch_store.NIL != cdolist_list_var_$13) {
                                                SubLObject current;
                                                final SubLObject datum = current = raw_tuple_conditions_pair;
                                                SubLObject raw_tuple = (SubLObject)sksi_batch_store.NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_batch_store.$list11);
                                                raw_tuple = current.first();
                                                current = current.rest();
                                                final SubLObject csql_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_batch_store.NIL);
                                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_batch_store.$list11);
                                                current = current.rest();
                                                if (sksi_batch_store.NIL == current) {
                                                    final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, operator, csql_conditions);
                                                    if (sksi_batch_store.NIL == sksi_csql_utilities.invalid_csql_expressionP(csql)) {
                                                        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
                                                        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, (SubLObject)sksi_batch_store.UNPROVIDED);
                                                        sksi_sks_interaction.sksi_add_batch_sql_update(sql, statement);
                                                    }
                                                }
                                                else {
                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_batch_store.$list11);
                                                }
                                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                raw_tuple_conditions_pair = cdolist_list_var_$13.first();
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            logical_sentence = cdolist_list_var.first();
                                        }
                                        result = sksi_sks_interaction.sksi_execute_batch_sql_updates(statement);
                                    }
                                    finally {
                                        sksi_reformulate.$memoize_sksi_reformulateP$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    sdbc.sqlc_commit(connection_$11);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)sksi_batch_store.NIL);
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
                        sdbc.sqlc_set_error_handling(connection_$11, (SubLObject)sksi_batch_store.$kw12$RETURN);
                        if (sksi_batch_store.NIL != commit_error) {
                            errors = (SubLObject)ConsesLow.cons(sdbc.sqls_handle_commit_error(commit_error), errors);
                            rollback_result = sdbc.sqls_handle_rollback(connection_$11);
                            if (sksi_batch_store.NIL != sdbc.sdbc_error_p(rollback_result)) {
                                errors = (SubLObject)ConsesLow.cons(rollback_result, errors);
                            }
                        }
                        if (sksi_batch_store.NIL != auto_commit) {
                            auto_commit_result = sdbc.sqlc_set_auto_commit(connection_$11, (SubLObject)sksi_batch_store.T);
                        }
                        if (sksi_batch_store.NIL != sdbc.sdbc_error_p(auto_commit_result)) {
                            errors = (SubLObject)ConsesLow.cons(auto_commit_result, errors);
                        }
                    }
                    if (sksi_batch_store.NIL != errors) {
                        error = sdbc.sqls_handle_transaction_errors(errors);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_store.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (sksi_batch_store.NIL != sdbc.sql_connection_p(connection)) {
                        sdbc.sqlc_close(connection);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (sksi_batch_store.NIL != error) {
                result = error;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-store.lisp", position = 10947L)
    public static SubLObject sksi_store_or_delete_logical_sentences_in_db(final SubLObject list_of_logical_sentences, final SubLObject sk_source, final SubLObject access_path, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject operator, SubLObject get_auto_generated_keysP, SubLObject execute_batchP) {
        if (get_auto_generated_keysP == sksi_batch_store.UNPROVIDED) {
            get_auto_generated_keysP = (SubLObject)sksi_batch_store.NIL;
        }
        if (execute_batchP == sksi_batch_store.UNPROVIDED) {
            execute_batchP = (SubLObject)sksi_batch_store.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_batch_store.NIL;
        SubLObject auto_generated_keys = (SubLObject)sksi_batch_store.NIL;
        SubLObject sql_statements_to_be_executed = (SubLObject)sksi_batch_store.NIL;
        if (sksi_batch_store.NIL != sksi_access_path.access_path_p(access_path)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(meta_mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(meta_mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(meta_mt), thread);
                final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
                SubLObject all_sql_statements = (SubLObject)sksi_batch_store.NIL;
                SubLObject all_auto_key_fields = (SubLObject)sksi_batch_store.NIL;
                SubLObject failureP = (SubLObject)sksi_batch_store.NIL;
                if (sksi_batch_store.NIL == failureP) {
                    SubLObject csome_list_var = list_of_logical_sentences;
                    SubLObject logical_sentence = (SubLObject)sksi_batch_store.NIL;
                    logical_sentence = csome_list_var.first();
                    while (sksi_batch_store.NIL == failureP && sksi_batch_store.NIL != csome_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject raw_tuples = sksi_incremental_edit.sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, (SubLObject)sksi_batch_store.UNPROVIDED);
                        final SubLObject physical_fields = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (sksi_batch_store.NIL != raw_tuples && sksi_batch_store.NIL != physical_fields) {
                            SubLObject some_successP = (SubLObject)sksi_batch_store.NIL;
                            SubLObject cdolist_list_var = raw_tuples;
                            SubLObject raw_tuple_conditions_pair = (SubLObject)sksi_batch_store.NIL;
                            raw_tuple_conditions_pair = cdolist_list_var.first();
                            while (sksi_batch_store.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = raw_tuple_conditions_pair;
                                SubLObject raw_tuple = (SubLObject)sksi_batch_store.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_batch_store.$list11);
                                raw_tuple = current.first();
                                current = current.rest();
                                final SubLObject csql_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_batch_store.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_batch_store.$list11);
                                current = current.rest();
                                if (sksi_batch_store.NIL == current) {
                                    thread.resetMultipleValues();
                                    final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, operator, csql_conditions);
                                    final SubLObject auto_key_fields = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (sksi_batch_store.NIL == sksi_csql_utilities.invalid_csql_expressionP(csql)) {
                                        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, (SubLObject)sksi_batch_store.UNPROVIDED);
                                        some_successP = (SubLObject)sksi_batch_store.T;
                                        all_sql_statements = (SubLObject)ConsesLow.cons(sql, all_sql_statements);
                                        all_auto_key_fields = conses_high.union(all_auto_key_fields, auto_key_fields, (SubLObject)sksi_batch_store.UNPROVIDED, (SubLObject)sksi_batch_store.UNPROVIDED);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_batch_store.$list11);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                raw_tuple_conditions_pair = cdolist_list_var.first();
                            }
                            if (sksi_batch_store.NIL == some_successP) {
                                failureP = (SubLObject)sksi_batch_store.T;
                            }
                        }
                        else {
                            failureP = (SubLObject)sksi_batch_store.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        logical_sentence = csome_list_var.first();
                    }
                }
                all_sql_statements = Sequences.nreverse(all_sql_statements);
                if (sksi_batch_store.NIL != failureP && sksi_batch_store.NIL == sksi_database_fusion.within_sksi_database_fusionP()) {
                    result = (SubLObject)sksi_batch_store.NIL;
                }
                else if (sksi_batch_store.NIL != execute_batchP) {
                    thread.resetMultipleValues();
                    final SubLObject result_$14 = sksi_sks_interaction.sksi_batch_execute_sql_statements(sk_source, access_path, all_sql_statements, get_auto_generated_keysP, all_auto_key_fields);
                    final SubLObject auto_generated_keys_$15 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$14;
                    auto_generated_keys = auto_generated_keys_$15;
                }
                else {
                    sql_statements_to_be_executed = all_sql_statements;
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(result, auto_generated_keys, sql_statements_to_be_executed);
    }
    
    public static SubLObject declare_sksi_batch_store_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_store_ist_logical_sentences_in_sk_source", "SKSI-STORE-IST-LOGICAL-SENTENCES-IN-SK-SOURCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_delete_ist_logical_sentences_from_sk_source", "SKSI-DELETE-IST-LOGICAL-SENTENCES-FROM-SK-SOURCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_store_logical_sentences_in_sk_source", "SKSI-STORE-LOGICAL-SENTENCES-IN-SK-SOURCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_delete_logical_sentences_from_sk_source", "SKSI-DELETE-LOGICAL-SENTENCES-FROM-SK-SOURCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_store_mt_contents_in_sk_source", "SKSI-STORE-MT-CONTENTS-IN-SK-SOURCE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_delete_mt_contents_from_sk_source", "SKSI-DELETE-MT-CONTENTS-FROM-SK-SOURCE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_store_or_delete_ist_logical_sentences_in_db", "SKSI-STORE-OR-DELETE-IST-LOGICAL-SENTENCES-IN-DB", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_store", "sksi_store_or_delete_logical_sentences_in_db", "SKSI-STORE-OR-DELETE-LOGICAL-SENTENCES-IN-DB", 7, 2, false);
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    public static SubLObject init_sksi_batch_store_file() {
        return (SubLObject)sksi_batch_store.NIL;
    }
    
    public static SubLObject setup_sksi_batch_store_file() {
        return (SubLObject)sksi_batch_store.NIL;
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
    
    static {
        me = (SubLFile)new sksi_batch_store();
        $const0$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $kw1$INSERT = SubLObjectFactory.makeKeyword("INSERT");
        $kw2$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $sym3$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $kw4$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw5$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw6$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $kw7$PROXY_SERVER = SubLObjectFactory.makeKeyword("PROXY-SERVER");
        $kw8$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $kw9$THROW = SubLObjectFactory.makeKeyword("THROW");
        $sym10$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW-TUPLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-CONDITIONS"));
        $kw12$RETURN = SubLObjectFactory.makeKeyword("RETURN");
    }
}

/*

	Total time: 320 ms
	
*/