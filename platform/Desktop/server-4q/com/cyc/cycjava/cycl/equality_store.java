package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class equality_store extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.equality_store";
    public static final String myFingerPrint = "5870b87a7f24e8ab9ab7bd0b236ff65a1b27eaf90148bcaf1469f3443fc1932e";
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 1473L)
    private static SubLSymbol $some_equality_assertions_somewhere_set$;
    private static final SubLObject $const0$equals;
    private static final SubLSymbol $kw1$TRUE;
    private static final SubLSymbol $sym2$_SOME_EQUALITY_ASSERTIONS_SOMEWHERE_SET_;
    private static final SubLString $str3$Initializing_some_equality_assert;
    private static final SubLSymbol $sym4$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const5$EverythingPSC;
    private static final SubLSymbol $kw6$GAF;
    private static final SubLSymbol $sym7$DECACHE_SOME_EQUALITY_ASSERTIONS_SOMEWHERE;
    private static final SubLObject $const8$rewriteOf;
    private static final SubLSymbol $sym9$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 858L)
    public static SubLObject some_equality_assertionsP(final SubLObject obj, SubLObject mt) {
        if (mt == equality_store.UNPROVIDED) {
            mt = (SubLObject)equality_store.NIL;
        }
        if (equality_store.NIL != forts.fort_p(obj)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL != some_equality_assertions_somewhereP(obj) && (equality_store.NIL != kb_gp_mapping.some_spec_pred_value_in_relevant_mts(obj, equality_store.$const0$equals, mt, (SubLObject)equality_store.ONE_INTEGER, (SubLObject)equality_store.$kw1$TRUE) || equality_store.NIL != kb_gp_mapping.some_spec_pred_value_in_relevant_mts(obj, equality_store.$const0$equals, mt, (SubLObject)equality_store.TWO_INTEGER, (SubLObject)equality_store.$kw1$TRUE)));
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 1539L)
    public static SubLObject some_equality_assertions_somewhereP(final SubLObject obj) {
        if (equality_store.NIL != forts.fort_p(obj)) {
            if (equality_store.NIL == set.set_p(equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue())) {
                initialize_some_equality_assertions_somewhere_set();
            }
            return set.set_memberP(obj, equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue());
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 1900L)
    public static SubLObject clear_some_equality_assertions_somewhere_set() {
        if (equality_store.NIL != equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue()) {
            set.clear_set(equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue());
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 2088L)
    public static SubLObject initialize_some_equality_assertions_somewhere_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (equality_store.NIL != constant_handles.valid_constantP(equality_store.$const0$equals, (SubLObject)equality_store.UNPROVIDED)) {
            final SubLObject str = (SubLObject)equality_store.$str3$Initializing_some_equality_assert;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)equality_store.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)equality_store.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)equality_store.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)equality_store.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((equality_store.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : equality_store.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject estimated_size = Numbers.multiply((SubLObject)equality_store.TWO_INTEGER, kb_gp_mapping.num_spec_pred_index(equality_store.$const0$equals, (SubLObject)equality_store.UNPROVIDED));
                equality_store.$some_equality_assertions_somewhere_set$.setGlobalValue(set.new_set((SubLObject)equality_store.EQL, estimated_size));
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)equality_store.$sym4$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(equality_store.$const5$EverythingPSC, thread);
                    SubLObject cdolist_list_var = genl_predicates.all_spec_preds(equality_store.$const0$equals, (SubLObject)equality_store.UNPROVIDED, (SubLObject)equality_store.UNPROVIDED);
                    SubLObject spec_pred = (SubLObject)equality_store.NIL;
                    spec_pred = cdolist_list_var.first();
                    while (equality_store.NIL != cdolist_list_var) {
                        final SubLObject pred_var = spec_pred;
                        if (equality_store.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str_$3 = (SubLObject)equality_store.NIL;
                            final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$7 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_4_$8 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_5_$9 = utilities_macros.$progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_6_$10 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_7_$11 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind((SubLObject)equality_store.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)equality_store.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)equality_store.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)equality_store.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((equality_store.NIL != str_$3) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : equality_store.T), thread);
                                utilities_macros.noting_progress_preamble(str_$3);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = (SubLObject)equality_store.NIL;
                                final SubLObject token_var = (SubLObject)equality_store.NIL;
                                while (equality_store.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (equality_store.NIL != valid) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator = (SubLObject)equality_store.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)equality_store.$kw6$GAF, (SubLObject)equality_store.NIL, (SubLObject)equality_store.NIL);
                                            SubLObject done_var_$12 = (SubLObject)equality_store.NIL;
                                            final SubLObject token_var_$13 = (SubLObject)equality_store.NIL;
                                            while (equality_store.NIL == done_var_$12) {
                                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                                final SubLObject valid_$14 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$13.eql(ass));
                                                if (equality_store.NIL != valid_$14) {
                                                    cache_some_equality_assertions_somewhere(ass);
                                                }
                                                done_var_$12 = (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL == valid_$14);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)equality_store.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (equality_store.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL == valid);
                                }
                                utilities_macros.noting_progress_postamble();
                            }
                            finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$11, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$10, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_5_$9, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$8, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$7, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$6, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        spec_pred = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 2539L)
    public static SubLObject decache_some_equality_assertions_somewhere(final SubLObject argument, final SubLObject assertion) {
        if (equality_store.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            if (equality_store.NIL != forts.fort_p(arg1)) {
                recache_some_equality_assertions_somewhere(arg1);
            }
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            if (equality_store.NIL != forts.fort_p(arg2)) {
                recache_some_equality_assertions_somewhere(arg2);
            }
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 3016L)
    public static SubLObject cache_some_equality_assertions_somewhere(final SubLObject assertion) {
        if (equality_store.NIL != assertions_high.gaf_assertionP(assertion) && equality_store.NIL != assertions_high.assertion_arguments(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (equality_store.NIL != hlmt.valid_hlmt_p(mt, (SubLObject)equality_store.UNPROVIDED)) {
                final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                if (equality_store.NIL != forts.valid_fortP(arg1)) {
                    set.set_add(arg1, equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue());
                }
                if (equality_store.NIL != forts.valid_fortP(arg2)) {
                    set.set_add(arg2, equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue());
                }
            }
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 3532L)
    public static SubLObject recache_some_equality_assertions_somewhere(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (equality_store.NIL == equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue()) {
            initialize_some_equality_assertions_somewhere_set();
        }
        set.set_remove(fort, equality_store.$some_equality_assertions_somewhere_set$.getGlobalValue());
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)equality_store.$sym4$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(equality_store.$const5$EverythingPSC, thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds(equality_store.$const0$equals, (SubLObject)equality_store.UNPROVIDED, (SubLObject)equality_store.UNPROVIDED);
            SubLObject spec_pred = (SubLObject)equality_store.NIL;
            spec_pred = cdolist_list_var.first();
            while (equality_store.NIL != cdolist_list_var) {
                final SubLObject pred_var = spec_pred;
                if (equality_store.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)equality_store.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)equality_store.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)equality_store.NIL;
                    final SubLObject token_var = (SubLObject)equality_store.NIL;
                    while (equality_store.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (equality_store.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)equality_store.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)equality_store.$kw6$GAF, (SubLObject)equality_store.NIL, (SubLObject)equality_store.NIL);
                                SubLObject done_var_$16 = (SubLObject)equality_store.NIL;
                                final SubLObject token_var_$17 = (SubLObject)equality_store.NIL;
                                while (equality_store.NIL == done_var_$16) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                    final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(ass));
                                    if (equality_store.NIL != valid_$18 && equality_store.NIL != assertions_high.assertion_arguments(ass)) {
                                        cache_some_equality_assertions_somewhere(ass);
                                    }
                                    done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL == valid_$18);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)equality_store.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (equality_store.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL == valid);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)equality_store.$sym4$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(equality_store.$const5$EverythingPSC, thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds(equality_store.$const0$equals, (SubLObject)equality_store.UNPROVIDED, (SubLObject)equality_store.UNPROVIDED);
            SubLObject spec_pred = (SubLObject)equality_store.NIL;
            spec_pred = cdolist_list_var.first();
            while (equality_store.NIL != cdolist_list_var) {
                final SubLObject pred_var = spec_pred;
                if (equality_store.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)equality_store.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)equality_store.TWO_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)equality_store.NIL;
                    final SubLObject token_var = (SubLObject)equality_store.NIL;
                    while (equality_store.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (equality_store.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)equality_store.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)equality_store.$kw6$GAF, (SubLObject)equality_store.NIL, (SubLObject)equality_store.NIL);
                                SubLObject done_var_$17 = (SubLObject)equality_store.NIL;
                                final SubLObject token_var_$18 = (SubLObject)equality_store.NIL;
                                while (equality_store.NIL == done_var_$17) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                    final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(ass));
                                    if (equality_store.NIL != valid_$19 && equality_store.NIL != assertions_high.assertion_arguments(ass)) {
                                        cache_some_equality_assertions_somewhere(ass);
                                    }
                                    done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL == valid_$19);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)equality_store.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (equality_store.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL == valid);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 4130L)
    public static SubLObject some_source_rewrite_of_assertionsP(final SubLObject obj, SubLObject mt) {
        if (mt == equality_store.UNPROVIDED) {
            mt = (SubLObject)equality_store.NIL;
        }
        if (equality_store.NIL != forts.fort_p(obj)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(equality_store.NIL != some_source_rewrite_of_assertions_somewhereP(obj) && equality_store.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(obj, equality_store.$const8$rewriteOf, mt, (SubLObject)equality_store.TWO_INTEGER, (SubLObject)equality_store.$kw1$TRUE));
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 4513L)
    public static SubLObject some_source_rewrite_of_assertions_somewhereP(final SubLObject obj) {
        if (equality_store.NIL != forts.fort_p(obj)) {
            return somewhere_cache.some_pred_assertion_somewhereP(equality_store.$const8$rewriteOf, obj, (SubLObject)equality_store.TWO_INTEGER, (SubLObject)equality_store.UNPROVIDED);
        }
        return (SubLObject)equality_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/equality-store.lisp", position = 4869L)
    public static SubLObject dispreferred_term_in_expressionP(final SubLObject expression) {
        return cycl_utilities.expression_find_if((SubLObject)equality_store.$sym9$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, expression, (SubLObject)equality_store.UNPROVIDED, (SubLObject)equality_store.UNPROVIDED);
    }
    
    public static SubLObject declare_equality_store_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "some_equality_assertionsP", "SOME-EQUALITY-ASSERTIONS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "some_equality_assertions_somewhereP", "SOME-EQUALITY-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "clear_some_equality_assertions_somewhere_set", "CLEAR-SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "initialize_some_equality_assertions_somewhere_set", "INITIALIZE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "decache_some_equality_assertions_somewhere", "DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "cache_some_equality_assertions_somewhere", "CACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "recache_some_equality_assertions_somewhere", "RECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "some_source_rewrite_of_assertionsP", "SOME-SOURCE-REWRITE-OF-ASSERTIONS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "some_source_rewrite_of_assertions_somewhereP", "SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.equality_store", "dispreferred_term_in_expressionP", "DISPREFERRED-TERM-IN-EXPRESSION?", 1, 0, false);
        return (SubLObject)equality_store.NIL;
    }
    
    public static SubLObject init_equality_store_file() {
        equality_store.$some_equality_assertions_somewhere_set$ = SubLFiles.deflexical("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*", (SubLObject)(maybeDefault((SubLObject)equality_store.$sym2$_SOME_EQUALITY_ASSERTIONS_SOMEWHERE_SET_, equality_store.$some_equality_assertions_somewhere_set$, equality_store.NIL)));
        return (SubLObject)equality_store.NIL;
    }
    
    public static SubLObject setup_equality_store_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)equality_store.$sym2$_SOME_EQUALITY_ASSERTIONS_SOMEWHERE_SET_);
        utilities_macros.register_kb_function((SubLObject)equality_store.$sym7$DECACHE_SOME_EQUALITY_ASSERTIONS_SOMEWHERE);
        return (SubLObject)equality_store.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_equality_store_file();
    }
    
    @Override
	public void initializeVariables() {
        init_equality_store_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_equality_store_file();
    }
    
    static {
        me = (SubLFile)new equality_store();
        equality_store.$some_equality_assertions_somewhere_set$ = null;
        $const0$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw1$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym2$_SOME_EQUALITY_ASSERTIONS_SOMEWHERE_SET_ = SubLObjectFactory.makeSymbol("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*");
        $str3$Initializing_some_equality_assert = SubLObjectFactory.makeString("Initializing some equality assertions somewhere...");
        $sym4$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const5$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw6$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym7$DECACHE_SOME_EQUALITY_ASSERTIONS_SOMEWHERE = SubLObjectFactory.makeSymbol("DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE");
        $const8$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $sym9$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = SubLObjectFactory.makeSymbol("SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?");
    }
}

/*

	Total time: 261 ms
	
*/