package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class forward_propagate_assertions extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.forward_propagate_assertions";
    public static String myFingerPrint = "0d325bd78fc1451a2e616f80e4de19cab14912623c0a871964fdd9395f34fb88";
    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 900L)
    public static SubLSymbol $forward_propagate_assertions_skolem_depth$;
    private static SubLSymbol $sym0$HLMT_P;
    private static SubLSymbol $sym1$LISTP;
    private static SubLSymbol $sym2$ASSERTION_P;
    private static SubLString $str3$ASSERTIONS_was_not_a_list_of_asse;
    private static SubLSymbol $sym4$FORWARD_PROPAGATE_P;
    private static SubLObject $$InferencePSC;
    private static SubLSymbol $ERROR;
    private static SubLSymbol $MAX_TIME;
    private static SubLSymbol $EXHAUST_TOTAL;
    private static SubLSymbol $sym9$RULE_ASSERTION_;
    private static SubLSymbol $ASSERTION_FORWARD_PROPAGATION;
    private static SubLSymbol $DEPTH;
    private static SubLSymbol $sym12$QUEUE_P;
    private static SubLString $str13$_____Level__S;
    private static SubLString $str14$__ERROR_from__S_____a;
    private static SubLSymbol $NUMBER;
    private static SubLSymbol $TIME;
    private static SubLSymbol $EXHAUST;
    private static SubLSymbol $ALL;
    private static SubLSymbol $sym19$GAF_ASSERTION_;
    private static SubLString $str20$Seed_GAF__a_is_not_visible_from_s;
    private static SubLSymbol $sym21$NON_DOTTED_LIST_P;
    private static SubLString $str22$Specified_rule__a_is_not_visible_;
    private static SubLSymbol $sym23$_EXIT;
    private static SubLSymbol $sym24$HL_ASSERTIBLE_P;
    private static SubLSymbol $sym25$DEDUCTION_SPEC_P;

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 1100L)
    public static SubLObject forward_propagate_mt(SubLObject source_mt, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (target_mt == UNPROVIDED) {
            target_mt = source_mt;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(source_mt) : source_mt;
        assert NIL != hlmt.hlmt_p(target_mt) : target_mt;
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(kb_mapping.gather_mt_index(source_mt), target_mt, number, time, depth);
            } finally {
                SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 2100L)
    public static SubLObject forward_propagate_assertions_in_mt(SubLObject assertions, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(assertions) : assertions;
        assert NIL != hlmt.hlmt_p(target_mt) : target_mt;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.every_in_list(Symbols.symbol_function($sym2$ASSERTION_P), assertions, UNPROVIDED)) {
            Errors.error($str3$ASSERTIONS_was_not_a_list_of_asse);
        }
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
            } finally {
                SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 3100L)
    public static SubLObject forward_propagate_assertion_in_mt(SubLObject assertion, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert NIL != hlmt.hlmt_p(target_mt) : target_mt;
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(list(assertion), target_mt, number, time, depth);
            } finally {
                SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 3900L)
    public static SubLObject inference_forward_propagate_mt(SubLObject forward_propagate, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forward_propagate && !assertionsDisabledInClass && NIL == inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate)) {
            throw new AssertionError(forward_propagate);
        }
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, time.isInteger() ? numeric_date_utilities.time_from_now(time) : NIL, depth);
            } finally {
                SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 4500L)
    public static SubLObject forward_propagate_assertion_against_rules_in_mt(SubLObject assertion, SubLObject rules, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return forward_propagate_assertions_against_rules_in_mt(list(assertion), rules, target_mt, number, time, depth);
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 4700L)
    public static SubLObject forward_propagate_assertions_against_rules_in_mt(SubLObject assertions, SubLObject rules, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject suspend_status = NIL;
        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            thread.resetMultipleValues();
            SubLObject this_total = forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
            SubLObject this_suspend_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total = Numbers.add(total, this_total);
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return Values.values(total, suspend_status);
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 5200L)
    public static SubLObject forward_consequences_of_assertion(SubLObject assertion, SubLObject propagation_mt, SubLObject max_time) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $$InferencePSC;
        }
        if (max_time == UNPROVIDED) {
            max_time = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject halt_reason = $ERROR;
        SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            SubLObject timed_outP = NIL;
            if (NIL != max_time) {
                SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    SubLObject _prev_bind_0_$5 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            SubLObject _prev_bind_0_$6 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer(max_time, tag);
                                result = forward.forward_propagate_assertion_int(assertion, propagation_mt, NIL);
                            } finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    } finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$5, thread);
                    }
                } catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                result = forward.forward_propagate_assertion_int(assertion, propagation_mt, NIL);
            }
            halt_reason = (NIL != timed_outP) ? $MAX_TIME : $EXHAUST_TOTAL;
        } finally {
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, halt_reason);
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 6100L)
    public static SubLObject forward_propagate_assertions_in_mt_internal(SubLObject assertions, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        assertions = list_utilities.sort_via_test(conses_high.copy_list(assertions), Symbols.symbol_function($sym9$RULE_ASSERTION_), UNPROVIDED);
        SubLObject before_count = kb_indexing.num_mt_index(target_mt);
        SubLObject time_cutoff = time.isInteger() ? numeric_date_utilities.time_from_now(time) : NIL;
        SubLObject forward_propagate = inference_datastructures_forward_propagate.new_forward_propagate(UNPROVIDED);
        SubLObject reason = NIL;
        inference_datastructures_forward_propagate.enqueue_forward_propagate_assertions_to_new_queue(forward_propagate, assertions);
        forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, time_cutoff, depth);
        return Values.values(Numbers.subtract(kb_indexing.num_mt_index(target_mt), before_count), reason);
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 6800L)
    public static SubLObject forward_propagate_assertions_from_struct(SubLObject forward_propagate, SubLObject target_mt, SubLObject number, SubLObject time_cutoff, SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        try {
            thread.throwStack.push($ASSERTION_FORWARD_PROPAGATION);
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(target_mt, thread);
                SubLObject level = ZERO_INTEGER;
                SubLObject before_count = kb_indexing.num_mt_index(target_mt);
                while (NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) || NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                    if (depth.isInteger() && level.numGE(depth)) {
                        Dynamic.sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $DEPTH);
                    }
                    if (NIL != queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                        inference_datastructures_forward_propagate.swap_forward_propagate_queues(forward_propagate);
                    }
                    assert NIL != queues.queue_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) : inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate);
                    SubLObject _prev_bind_0_$8 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate), thread);
                        if (NIL != forward.$tracing_forward_inference$.getDynamicValue(thread)) {
                            PrintLow.format(T, $str13$_____Level__S, Numbers.add(level, ONE_INTEGER));
                        }
                        SubLObject _prev_bind_0_$9 = control_vars.$allow_forward_skolemization$.currentBinding(thread);
                        try {
                            control_vars.$allow_forward_skolemization$.bind(makeBoolean(NIL != control_vars.$allow_forward_skolemization$.getDynamicValue(thread) && level.numL($forward_propagate_assertions_skolem_depth$.getDynamicValue(thread))), thread);
                            while (NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                                SubLObject assertion = inference_datastructures_forward_propagate.dequeue_forward_propagate_assertion_from_old_queue(forward_propagate);
                                SubLObject error_message = NIL;
                                forward.forward_propagate_assertion(assertion, target_mt);
                                if (NIL != error_message && NIL != forward.$tracing_forward_inference$.getDynamicValue(thread)) {
                                    PrintLow.format(T, $str14$__ERROR_from__S_____a, assertion, error_message);
                                }
                                if (number.isInteger() && Numbers.subtract(kb_indexing.num_mt_index(target_mt), before_count).numGE(number)) {
                                    Dynamic.sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $NUMBER);
                                }
                                if (NIL != time_cutoff && NIL != Time.time_has_arrivedP(time_cutoff)) {
                                    Dynamic.sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $TIME);
                                }
                            }
                        } finally {
                            control_vars.$allow_forward_skolemization$.rebind(_prev_bind_0_$9, thread);
                        }
                    } finally {
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$8, thread);
                    }
                    level = Numbers.add(level, ONE_INTEGER);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            reason = $EXHAUST;
        } catch (Throwable ccatch_env_var) {
            reason = Errors.handleThrowable(ccatch_env_var, $ASSERTION_FORWARD_PROPAGATION);
        } finally {
            thread.throwStack.pop();
        }
        return reason;
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 9200L)
    public static SubLObject generate_consequences(SubLObject seed_gaf, SubLObject rules, SubLObject mt, SubLObject max_time) {
        if (rules == UNPROVIDED) {
            rules = $ALL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (max_time == UNPROVIDED) {
            max_time = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : mt;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            assert NIL != assertions_high.gaf_assertionP(seed_gaf) : seed_gaf;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(seed_gaf))) {
                Errors.error($str20$Seed_GAF__a_is_not_visible_from_s, seed_gaf, mt);
            }
            if ($ALL != rules) {
                SubLObject list_var = rules;
                assert NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                elem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assert NIL != assertions_high.rule_assertionP(elem) : elem;
                    cdolist_list_var = cdolist_list_var.rest();
                    elem = cdolist_list_var.first();
                }
                SubLObject cdolist_list_var2 = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(rule))) {
                        Errors.error($str22$Specified_rule__a_is_not_visible_, rule, mt);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    rule = cdolist_list_var2.first();
                }
            }
            SubLObject queryables = NIL;
            SubLObject halt_reason = NIL;
            SubLObject consequences = NIL;
            SubLObject _prev_bind_0_$10 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                thread.resetMultipleValues();
                SubLObject consequences_$11 = forward_consequences_of_assertion(seed_gaf, mt, max_time);
                SubLObject halt_reason_$12 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                consequences = consequences_$11;
                halt_reason = halt_reason_$12;
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$10, thread);
            }
            SubLObject cdolist_list_var3 = consequences;
            SubLObject assertible = NIL;
            assertible = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                queryables = cons(hl_assertible_to_queryable(assertible), queryables);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertible = cdolist_list_var3.first();
            }
            return Values.values(queryables, halt_reason);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 10300L)
    public static SubLObject hl_assertible_to_queryable(SubLObject assertible) {
        assert NIL != hl_storage_modules.hl_assertible_p(assertible) : assertible;
        SubLObject argument_spec = hl_storage_modules.hl_assertible_argument_spec(assertible);
        SubLObject hl_assertion_spec_var_$13;
        SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$13 = hl_storage_modules.hl_assertible_hl_assertion_spec(assertible);
        SubLObject cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$13);
        SubLObject mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$13);
        assert NIL != deductions_high.deduction_spec_p(argument_spec) : argument_spec;
        SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
        SubLObject query_el_formula = uncanonicalizer.cnf_el_formula(cnf, mt, UNPROVIDED);
        SubLObject queryable = list(query_el_formula, mt, supports);
        return queryable;
    }

    public static SubLObject declare_forward_propagate_assertions_file() {
        declareFunction(myName, "forward_propagate_mt", "FORWARD-PROPAGATE-MT", 1, 4, false);
        declareFunction(myName, "forward_propagate_assertions_in_mt", "FORWARD-PROPAGATE-ASSERTIONS-IN-MT", 2, 3, false);
        declareFunction(myName, "forward_propagate_assertion_in_mt", "FORWARD-PROPAGATE-ASSERTION-IN-MT", 2, 3, false);
        declareFunction(myName, "inference_forward_propagate_mt", "INFERENCE-FORWARD-PROPAGATE-MT", 5, 0, false);
        declareFunction(myName, "forward_propagate_assertion_against_rules_in_mt", "FORWARD-PROPAGATE-ASSERTION-AGAINST-RULES-IN-MT", 3, 3, false);
        declareFunction(myName, "forward_propagate_assertions_against_rules_in_mt", "FORWARD-PROPAGATE-ASSERTIONS-AGAINST-RULES-IN-MT", 3, 3, false);
        declareFunction(myName, "forward_consequences_of_assertion", "FORWARD-CONSEQUENCES-OF-ASSERTION", 1, 2, false);
        declareFunction(myName, "forward_propagate_assertions_in_mt_internal", "FORWARD-PROPAGATE-ASSERTIONS-IN-MT-INTERNAL", 5, 0, false);
        declareFunction(myName, "forward_propagate_assertions_from_struct", "FORWARD-PROPAGATE-ASSERTIONS-FROM-STRUCT", 5, 0, false);
        declareFunction(myName, "generate_consequences", "GENERATE-CONSEQUENCES", 1, 3, false);
        declareFunction(myName, "hl_assertible_to_queryable", "HL-ASSERTIBLE-TO-QUERYABLE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_forward_propagate_assertions_file() {
        $forward_propagate_assertions_skolem_depth$ = SubLFiles.defparameter("*FORWARD-PROPAGATE-ASSERTIONS-SKOLEM-DEPTH*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_forward_propagate_assertions_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_forward_propagate_assertions_file();
    }

    @Override
    public void initializeVariables() {
        init_forward_propagate_assertions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_forward_propagate_assertions_file();
    }

    static {
        me = new forward_propagate_assertions();
        $forward_propagate_assertions_skolem_depth$ = null;
        $sym0$HLMT_P = makeSymbol("HLMT-P");
        $sym1$LISTP = makeSymbol("LISTP");
        $sym2$ASSERTION_P = makeSymbol("ASSERTION-P");
        $str3$ASSERTIONS_was_not_a_list_of_asse = makeString("ASSERTIONS was not a list of assertions");
        $sym4$FORWARD_PROPAGATE_P = makeSymbol("FORWARD-PROPAGATE-P");
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $ERROR = makeKeyword("ERROR");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $EXHAUST_TOTAL = makeKeyword("EXHAUST-TOTAL");
        $sym9$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
        $ASSERTION_FORWARD_PROPAGATION = makeKeyword("ASSERTION-FORWARD-PROPAGATION");
        $DEPTH = makeKeyword("DEPTH");
        $sym12$QUEUE_P = makeSymbol("QUEUE-P");
        $str13$_____Level__S = makeString("~%;; Level ~S");
        $str14$__ERROR_from__S_____a = makeString("~%ERROR from ~S~%  ~a");
        $NUMBER = makeKeyword("NUMBER");
        $TIME = makeKeyword("TIME");
        $EXHAUST = makeKeyword("EXHAUST");
        $ALL = makeKeyword("ALL");
        $sym19$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
        $str20$Seed_GAF__a_is_not_visible_from_s = makeString("Seed GAF ~a is not visible from specified mt ~a");
        $sym21$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
        $str22$Specified_rule__a_is_not_visible_ = makeString("Specified rule ~a is not visible from specified mt ~a");
        $sym23$_EXIT = makeSymbol("%EXIT");
        $sym24$HL_ASSERTIBLE_P = makeSymbol("HL-ASSERTIBLE-P");
        $sym25$DEDUCTION_SPEC_P = makeSymbol("DEDUCTION-SPEC-P");
    }
}
/*
 *
 * Total time: 175 ms synthetic
 */