package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class after_adding extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "029dedfcf09de50224069b5696f4f7eb7421e4c27cd06bd35146ce7a44ef04d6";
    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 700L)
    public static SubLSymbol $debug_after_addingsP$;
    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 800L)
    public static SubLSymbol $gaf_after_adding_predicates$;
    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1000L)
    private static SubLSymbol $gaf_after_addings_hash$;
    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1100L)
    private static SubLSymbol $gaf_after_removings_hash$;
    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 2100L)
    public static SubLSymbol $after_addings_disabledP$;
    private static SubLList $list0;
    private static SubLSymbol $sym1$_GAF_AFTER_ADDINGS_HASH_;
    private static SubLSymbol $sym2$_GAF_AFTER_REMOVINGS_HASH_;
    private static SubLSymbol $sym3$CLET;
    private static SubLList $list4;
    private static SubLSymbol $sym5$ARGUMENT_P;
    private static SubLSymbol $sym6$ASSERTION_P;
    private static SubLList $list7;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym9$IGNORE_ERRORS_HANDLER;
    private static SubLSymbol $AFTER_ADDING;
    private static SubLInteger $int$100;
    private static SubLSymbol $sym12$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$EverythingPSC;
    private static SubLObject $$afterAdding;
    private static SubLSymbol $GAF;
    private static SubLList $list16;
    private static SubLObject $$afterRemoving;
    private static SubLList $list18;
    private static SubLSymbol $sym19$FORT_P;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $sym21$PROPAGATE_GAF_AFTER_ADDING;
    private static SubLSymbol $sym22$SYMBOLP;
    private static SubLSymbol $sym23$HLMT_P;
    private static SubLSymbol $sym24$RELEVANT_MT_IS_SPEC_MT;
    private static SubLSymbol $sym25$REPROPAGATE_GAF_AFTER_ADDING_INTERNAL;
    private static SubLSymbol $sym26$RELEVANT_MT_IS_GENL_MT;

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1200L)
    public static SubLObject clear_after_addings() {
        clear_gaf_after_addings();
        rule_after_adding.clear_rule_after_addings();
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1300L)
    public static SubLObject clear_gaf_after_addings() {
        if (NIL != $gaf_after_addings_hash$.getGlobalValue()) {
            Hashtables.clrhash($gaf_after_addings_hash$.getGlobalValue());
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1500L)
    public static SubLObject clear_after_removings() {
        clear_gaf_after_removings();
        rule_after_adding.clear_rule_after_removings();
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1600L)
    public static SubLObject clear_gaf_after_removings() {
        if (NIL != $gaf_after_removings_hash$.getGlobalValue()) {
            Hashtables.clrhash($gaf_after_removings_hash$.getGlobalValue());
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1700L)
    public static SubLObject disable_after_addings(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym3$CLET, $list4, append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 2300L)
    public static SubLObject handle_after_addings(SubLObject argument, SubLObject assertion) {
        handle_gaf_after_addings(argument, assertion);
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            rule_after_adding.handle_rule_after_addings(argument, assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 2500L)
    public static SubLObject handle_gaf_after_addings(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.argument_p(argument) : argument;
        assert NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (NIL == $after_addings_disabledP$.getDynamicValue(thread) && NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != forts.fort_p(pred)) {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject cdolist_list_var = get_gaf_after_addings(pred);
                    SubLObject info = NIL;
                    info = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        SubLObject datum = current = info;
                        SubLObject fun = NIL;
                        SubLObject fun_mt = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                        fun = current.first();
                        current = (fun_mt = current.rest());
                        if (fun.isFunctionSpec() && NIL != mt_relevance_macros.relevant_mtP(fun_mt)) {
                            if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function($sym9$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                            SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                            SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                            SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                            if (NIL != last_metric_type && NIL != last_metric) {
                                                inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, ZERO_INTEGER);
                                            }
                                            SubLObject _prev_bind_0_$2 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$3 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                            SubLObject _prev_bind_2_$4 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                            SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                            try {
                                                hl_macros.$forward_inference_metric_last_metric_type$.bind($AFTER_ADDING, thread);
                                                hl_macros.$forward_inference_metric_last_metric$.bind(fun, thread);
                                                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                                                hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                                                try {
                                                    handle_gaf_after_adding(fun, argument, assertion);
                                                } finally {
                                                    SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                        SubLObject _values = Values.getValuesAsVector();
                                                        inference_metrics.increment_forward_inference_metrics($AFTER_ADDING, fun, NIL, NIL, NIL);
                                                        Values.restoreValuesFromVector(_values);
                                                    } finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                                    }
                                                }
                                            } finally {
                                                hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                                                hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$4, thread);
                                                hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$3, thread);
                                                hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$2, thread);
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            } else {
                                SubLObject last_metric_type2 = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                                SubLObject last_metric2 = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                                SubLObject last_gaf2 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                                SubLObject last_rule2 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                                if (NIL != last_metric_type2 && NIL != last_metric2) {
                                    inference_metrics.increment_forward_inference_metrics(last_metric_type2, last_metric2, last_gaf2, last_rule2, ZERO_INTEGER);
                                }
                                SubLObject _prev_bind_0_$4 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                                SubLObject _prev_bind_1_$4 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                                SubLObject _prev_bind_2_$5 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                                SubLObject _prev_bind_5 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                                try {
                                    hl_macros.$forward_inference_metric_last_metric_type$.bind($AFTER_ADDING, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.bind(fun, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind(NIL, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind(NIL, thread);
                                    try {
                                        handle_gaf_after_adding(fun, argument, assertion);
                                    } finally {
                                        SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            inference_metrics.increment_forward_inference_metrics($AFTER_ADDING, fun, NIL, NIL, NIL);
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                } finally {
                                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_5, thread);
                                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_2_$5, thread);
                                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_1_$4, thread);
                                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        info = cdolist_list_var.first();
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 3400L)
    public static SubLObject handle_after_removings(SubLObject argument, SubLObject assertion) {
        handle_gaf_after_removings(argument, assertion);
        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            rule_after_adding.handle_rule_after_removings(argument, assertion);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 3700L)
    public static SubLObject handle_gaf_after_removings(SubLObject argument, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.argument_p(argument) : argument;
        assert NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL != forts.fort_p(pred)) {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    SubLObject cdolist_list_var = get_gaf_after_removings(pred);
                    SubLObject info = NIL;
                    info = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        SubLObject datum = current = info;
                        SubLObject fun = NIL;
                        SubLObject fun_mt = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                        fun = current.first();
                        current = (fun_mt = current.rest());
                        if (fun.isFunctionSpec() && NIL != mt_relevance_macros.relevant_mtP(fun_mt)) {
                            if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function($sym9$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            handle_gaf_after_removing(fun, argument, assertion);
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            } else {
                                handle_gaf_after_removing(fun, argument, assertion);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        info = cdolist_list_var.first();
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 4300L)
    public static SubLObject get_gaf_after_addings(SubLObject pred) {
        if (NIL == $gaf_after_addings_hash$.getGlobalValue()) {
            initialize_gaf_after_addings_hash();
        }
        SubLObject result = Hashtables.gethash_without_values(pred, $gaf_after_addings_hash$.getGlobalValue(), NIL);
        if (NIL != somewhere_cache.somewhere_cached_pred_p(pred)) {
            result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 4700L)
    public static SubLObject get_gaf_after_removings(SubLObject pred) {
        if (NIL == $gaf_after_removings_hash$.getGlobalValue()) {
            initialize_gaf_after_removings_hash();
        }
        SubLObject result = Hashtables.gethash_without_values(pred, $gaf_after_removings_hash$.getGlobalValue(), NIL);
        if (NIL != somewhere_cache.somewhere_cached_pred_p(pred)) {
            result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5000L)
    public static SubLObject handle_gaf_after_adding(SubLObject function, SubLObject argument, SubLObject assertion) {
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
            Functions.funcall(function, argument, assertion);
        } finally {
            if (NIL != release) {
                Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5100L)
    public static SubLObject handle_gaf_after_removing(SubLObject function, SubLObject argument, SubLObject assertion) {
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
            Functions.funcall(function, argument, assertion);
        } finally {
            if (NIL != release) {
                Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5300L)
    public static SubLObject rebuild_after_adding_caches() {
        rebuild_gaf_after_adding_caches();
        rule_after_adding.rebuild_rule_after_adding_caches();
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5500L)
    public static SubLObject rebuild_gaf_after_adding_caches() {
        initialize_gaf_after_addings_hash();
        initialize_gaf_after_removings_hash();
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5600L)
    public static SubLObject initialize_gaf_after_addings_hash() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $gaf_after_addings_hash$.getGlobalValue()) {
            Hashtables.clrhash($gaf_after_addings_hash$.getGlobalValue());
        } else {
            $gaf_after_addings_hash$.setGlobalValue(Hashtables.make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym12$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject pred_var = $$afterAdding;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                SubLObject str = NIL;
                SubLObject _prev_bind_0_$11 = utilities_macros.$progress_start_time$.currentBinding(thread);
                SubLObject _prev_bind_1_$12 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind(T, thread);
                    utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                    utilities_macros.noting_progress_preamble(str);
                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$13 = NIL;
                                SubLObject token_var_$14 = NIL;
                                while (NIL == done_var_$13) {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$14);
                                    SubLObject valid_$15 = makeBoolean(!token_var_$14.eql(ass));
                                    if (NIL != valid_$15) {
                                        SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        SubLObject datum = current = formula;
                                        SubLObject gaf_after_adding_pred = NIL;
                                        SubLObject pred = NIL;
                                        SubLObject gaf_after_adding = NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
                                        gaf_after_adding_pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
                                        pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
                                        gaf_after_adding = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != forts.valid_fortP(pred)) {
                                                gaf_after_adding = el_utilities.cycl_subl_symbol_symbol(gaf_after_adding);
                                                SubLObject item_var = cons(gaf_after_adding, assertions_high.assertion_mt(ass));
                                                if (NIL == conses_high.member(item_var, Hashtables.gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                                    Hashtables.sethash(pred, $gaf_after_addings_hash$.getGlobalValue(), cons(item_var, Hashtables.gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED)));
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
                                        }
                                    }
                                    done_var_$13 = makeBoolean(NIL == valid_$15);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                } finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$12, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 6300L)
    public static SubLObject initialize_gaf_after_removings_hash() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (!$gaf_after_removings_hash$.getGlobalValue().isHashtable()) {
            $gaf_after_removings_hash$.setGlobalValue(Hashtables.make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        } else {
            Hashtables.clrhash($gaf_after_removings_hash$.getGlobalValue());
        }
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym12$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject pred_var = $$afterRemoving;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                SubLObject str = NIL;
                SubLObject _prev_bind_0_$17 = utilities_macros.$progress_start_time$.currentBinding(thread);
                SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind(T, thread);
                    utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                    utilities_macros.noting_progress_preamble(str);
                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$19 = NIL;
                                SubLObject token_var_$20 = NIL;
                                while (NIL == done_var_$19) {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(ass));
                                    if (NIL != valid_$21) {
                                        SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        SubLObject datum = current = formula;
                                        SubLObject gaf_after_removing_pred = NIL;
                                        SubLObject pred = NIL;
                                        SubLObject gaf_after_removing = NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
                                        gaf_after_removing_pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
                                        pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
                                        gaf_after_removing = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != forts.valid_fortP(pred)) {
                                                gaf_after_removing = el_utilities.cycl_subl_symbol_symbol(gaf_after_removing);
                                                SubLObject item_var = cons(gaf_after_removing, assertions_high.assertion_mt(ass));
                                                if (NIL == conses_high.member(item_var, Hashtables.gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                                    Hashtables.sethash(pred, $gaf_after_removings_hash$.getGlobalValue(), cons(item_var, Hashtables.gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED)));
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, $list18);
                                        }
                                    }
                                    done_var_$19 = makeBoolean(NIL == valid_$21);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                } finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 7000L)
    public static SubLObject recache_gaf_after_addings(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        if (NIL == $gaf_after_addings_hash$.getGlobalValue()) {
            initialize_gaf_after_addings_hash();
        }
        Hashtables.remhash(predicate, $gaf_after_addings_hash$.getGlobalValue());
        SubLObject ans = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym12$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject pred_var = $$afterAdding;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, NIL, pred_var)) {
                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, NIL, pred_var);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$23 = NIL;
                            SubLObject token_var_$24 = NIL;
                            while (NIL == done_var_$23) {
                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(ass));
                                if (NIL != valid_$25 && NIL != assertions_high.assertion_arguments(ass)) {
                                    SubLObject gaf_after_adding = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                    SubLObject item_var = cons(gaf_after_adding, assertions_high.assertion_mt(ass));
                                    if (NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$23 = makeBoolean(NIL == valid_$25);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != ans) {
            Hashtables.sethash(predicate, $gaf_after_addings_hash$.getGlobalValue(), Sequences.nreverse(ans));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 7600L)
    public static SubLObject recache_gaf_after_removings(SubLObject predicate) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        if (NIL == $gaf_after_removings_hash$.getGlobalValue()) {
            initialize_gaf_after_removings_hash();
        }
        Hashtables.remhash(predicate, $gaf_after_removings_hash$.getGlobalValue());
        SubLObject ans = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym12$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject pred_var = $$afterRemoving;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, NIL, pred_var)) {
                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, NIL, pred_var);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$27 = NIL;
                            SubLObject token_var_$28 = NIL;
                            while (NIL == done_var_$27) {
                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(ass));
                                if (NIL != valid_$29 && NIL != assertions_high.assertion_arguments(ass)) {
                                    SubLObject gaf_after_removing = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, TWO_INTEGER));
                                    SubLObject item_var = cons(gaf_after_removing, assertions_high.assertion_mt(ass));
                                    if (NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$27 = makeBoolean(NIL == valid_$29);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != ans) {
            Hashtables.sethash(predicate, $gaf_after_removings_hash$.getGlobalValue(), Sequences.nreverse(ans));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 8200L)
    public static SubLObject propagate_gaf_after_adding(SubLObject argument, SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : argument;
        if (NIL != assertions_high.gaf_assertionP(assertion) && NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
            SubLObject formula = assertions_high.gaf_formula(assertion);
            if (el_utilities.literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                SubLObject predicate = el_utilities.literal_arg1(formula, UNPROVIDED);
                SubLObject function = el_utilities.cycl_subl_symbol_symbol(el_utilities.literal_arg2(formula, UNPROVIDED));
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if (NIL != forts.fort_p(predicate) && function.isSymbol() && NIL != Symbols.fboundp(function) && function != $sym21$PROPAGATE_GAF_AFTER_ADDING) {
                    repropagate_gaf_after_adding(predicate, function, mt);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 9000L)
    public static SubLObject repropagate_gaf_after_adding(SubLObject predicate, SubLObject function, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : predicate;
        assert NIL != Types.symbolp(function) : function;
        assert NIL != hlmt.hlmt_p(mt) : mt;
        if (NIL != Symbols.fboundp(function)) {
            SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                control_vars.$mapping_target$.bind(function, thread);
                mt_relevance_macros.$relevant_mt_function$.bind($sym24$RELEVANT_MT_IS_SPEC_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_predicate_extent_index(Symbols.symbol_function($sym25$REPROPAGATE_GAF_AFTER_ADDING_INTERNAL), predicate, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 9500L)
    public static SubLObject repropagate_gaf_after_adding_internal(SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym26$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(assertions_high.assertion_mt(assertion), thread);
            SubLObject cdolist_list_var = v_arguments;
            SubLObject argument = NIL;
            argument = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == $debug_after_addingsP$.getDynamicValue(thread)) {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        SubLObject _prev_bind_0_$31 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function($sym9$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                handle_gaf_after_adding(control_vars.$mapping_target$.getDynamicValue(thread), argument, assertion);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$31, thread);
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    } finally {
                        thread.throwStack.pop();
                    }
                } else {
                    handle_gaf_after_adding(control_vars.$mapping_target$.getDynamicValue(thread), argument, assertion);
                }
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 9900L)
    public static SubLObject initial_assertion_argumentP(SubLObject argument, SubLObject assertion) {
        return assertion_sole_argumentP(argument, assertion);
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 10100L)
    public static SubLObject final_assertion_argumentP(SubLObject argument, SubLObject assertion) {
        return assertion_sole_argumentP(argument, assertion);
    }

    @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 10200L)
    public static SubLObject assertion_sole_argumentP(SubLObject argument, SubLObject assertion) {
        SubLObject assertion_arguments = assertions_high.assertion_arguments(assertion);
        return makeBoolean(NIL != list_utilities.singletonP(assertion_arguments) && NIL != subl_promotions.memberP(argument, assertion_arguments, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject declare_after_adding_file() {
        declareFunction("clear_after_addings", "CLEAR-AFTER-ADDINGS", 0, 0, false);
        declareFunction("clear_gaf_after_addings", "CLEAR-GAF-AFTER-ADDINGS", 0, 0, false);
        declareFunction("clear_after_removings", "CLEAR-AFTER-REMOVINGS", 0, 0, false);
        declareFunction("clear_gaf_after_removings", "CLEAR-GAF-AFTER-REMOVINGS", 0, 0, false);
        declareMacro("disable_after_addings", "DISABLE-AFTER-ADDINGS");
        declareFunction("handle_after_addings", "HANDLE-AFTER-ADDINGS", 2, 0, false);
        declareFunction("handle_gaf_after_addings", "HANDLE-GAF-AFTER-ADDINGS", 2, 0, false);
        declareFunction("handle_after_removings", "HANDLE-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("handle_gaf_after_removings", "HANDLE-GAF-AFTER-REMOVINGS", 2, 0, false);
        declareFunction("get_gaf_after_addings", "GET-GAF-AFTER-ADDINGS", 1, 0, false);
        declareFunction("get_gaf_after_removings", "GET-GAF-AFTER-REMOVINGS", 1, 0, false);
        declareFunction("handle_gaf_after_adding", "HANDLE-GAF-AFTER-ADDING", 3, 0, false);
        declareFunction("handle_gaf_after_removing", "HANDLE-GAF-AFTER-REMOVING", 3, 0, false);
        declareFunction("rebuild_after_adding_caches", "REBUILD-AFTER-ADDING-CACHES", 0, 0, false);
        declareFunction("rebuild_gaf_after_adding_caches", "REBUILD-GAF-AFTER-ADDING-CACHES", 0, 0, false);
        declareFunction("initialize_gaf_after_addings_hash", "INITIALIZE-GAF-AFTER-ADDINGS-HASH", 0, 0, false);
        declareFunction("initialize_gaf_after_removings_hash", "INITIALIZE-GAF-AFTER-REMOVINGS-HASH", 0, 0, false);
        declareFunction("recache_gaf_after_addings", "RECACHE-GAF-AFTER-ADDINGS", 1, 0, false);
        declareFunction("recache_gaf_after_removings", "RECACHE-GAF-AFTER-REMOVINGS", 1, 0, false);
        declareFunction("propagate_gaf_after_adding", "PROPAGATE-GAF-AFTER-ADDING", 2, 0, false);
        declareFunction("repropagate_gaf_after_adding", "REPROPAGATE-GAF-AFTER-ADDING", 3, 0, false);
        declareFunction("repropagate_gaf_after_adding_internal", "REPROPAGATE-GAF-AFTER-ADDING-INTERNAL", 1, 0, false);
        declareFunction("initial_assertion_argumentP", "INITIAL-ASSERTION-ARGUMENT?", 2, 0, false);
        declareFunction("final_assertion_argumentP", "FINAL-ASSERTION-ARGUMENT?", 2, 0, false);
        declareFunction("assertion_sole_argumentP", "ASSERTION-SOLE-ARGUMENT?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_after_adding_file() {
        $debug_after_addingsP$ = defparameter("*DEBUG-AFTER-ADDINGS?*", NIL);
        $gaf_after_adding_predicates$ = deflexical("*GAF-AFTER-ADDING-PREDICATES*", $list0);
        $gaf_after_addings_hash$ = deflexical("*GAF-AFTER-ADDINGS-HASH*", (maybeDefault($sym1$_GAF_AFTER_ADDINGS_HASH_, $gaf_after_addings_hash$, NIL)));
        $gaf_after_removings_hash$ = deflexical("*GAF-AFTER-REMOVINGS-HASH*", (maybeDefault($sym2$_GAF_AFTER_REMOVINGS_HASH_, $gaf_after_removings_hash$, NIL)));
        $after_addings_disabledP$ = defparameter("*AFTER-ADDINGS-DISABLED?*", NIL);
        return NIL;
    }

    public static SubLObject setup_after_adding_file() {
        subl_macro_promotions.declare_defglobal($sym1$_GAF_AFTER_ADDINGS_HASH_);
        subl_macro_promotions.declare_defglobal($sym2$_GAF_AFTER_REMOVINGS_HASH_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_after_adding_file();
    }

    @Override
    public void initializeVariables() {
        init_after_adding_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_after_adding_file();
    }

    static {
        me = new after_adding();
        $debug_after_addingsP$ = null;
        $gaf_after_adding_predicates$ = null;
        $gaf_after_addings_hash$ = null;
        $gaf_after_removings_hash$ = null;
        $after_addings_disabledP$ = null;
        $list0 = list(makeConstSym(("afterAdding")), makeConstSym(("afterRemoving")));
        $sym1$_GAF_AFTER_ADDINGS_HASH_ = makeSymbol("*GAF-AFTER-ADDINGS-HASH*");
        $sym2$_GAF_AFTER_REMOVINGS_HASH_ = makeSymbol("*GAF-AFTER-REMOVINGS-HASH*");
        $sym3$CLET = makeSymbol("CLET");
        $list4 = list(list(makeSymbol("*AFTER-ADDINGS-DISABLED?*"), T));
        $sym5$ARGUMENT_P = makeSymbol("ARGUMENT-P");
        $sym6$ASSERTION_P = makeSymbol("ASSERTION-P");
        $list7 = cons(makeSymbol("FUN"), makeSymbol("FUN-MT"));
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym9$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $AFTER_ADDING = makeKeyword("AFTER-ADDING");
        $int$100 = makeInteger(100);
        $sym12$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $$afterAdding = makeConstSym(("afterAdding"));
        $GAF = makeKeyword("GAF");
        $list16 = list(makeSymbol("GAF-AFTER-ADDING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-ADDING"));
        $$afterRemoving = makeConstSym(("afterRemoving"));
        $list18 = list(makeSymbol("GAF-AFTER-REMOVING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-REMOVING"));
        $sym19$FORT_P = makeSymbol("FORT-P");
        $TRUE = makeKeyword("TRUE");
        $sym21$PROPAGATE_GAF_AFTER_ADDING = makeSymbol("PROPAGATE-GAF-AFTER-ADDING");
        $sym22$SYMBOLP = makeSymbol("SYMBOLP");
        $sym23$HLMT_P = makeSymbol("HLMT-P");
        $sym24$RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");
        $sym25$REPROPAGATE_GAF_AFTER_ADDING_INTERNAL = makeSymbol("REPROPAGATE-GAF-AFTER-ADDING-INTERNAL");
        $sym26$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
    }
}
/*
 *
 * Total time: 400 ms
 *
 */