package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_kernel extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "babcee533184bc37a169f7393dc46790b1e9283cb48566db5ecad4ecdc3631ea";
    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 1100L)
    public static SubLSymbol $new_cyc_trivial_query_enabledP$;
    private static SubLSymbol $BROWSABLE_;
    private static SubLSymbol $sym1$QUERY_RESULTS_FOR_JAVA;
    private static SubLList $list2;
    private static SubLSymbol $sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM;
    private static SubLSymbol $sym4$MULTIPLE_VALUE_LIST;
    private static SubLSymbol $sym5$INFERENCE_P;
    private static SubLSymbol $sym6$INFERENCE_IDS;
    private static SubLSymbol $sym7$POSSIBLY_INFERENCE_SENTENCE_P;
    private static SubLSymbol $sym8$POSSIBLY_MT_P;
    private static SubLSymbol $sym9$QUERY_PROPERTIES_P;
    private static SubLSymbol $sym10$PROPERTY_LIST_P;
    private static SubLSymbol $sym11$QUERY_PROPERTY_P;
    private static SubLSymbol $INFERENCE_ABORT_TARGET;
    private static SubLSymbol $NON_TRIVIAL;
    private static SubLSymbol $ABORT;
    private static SubLSymbol $sym15$NEW_CYC_QUERY;
    private static SubLList $list16;
    private static SubLString $str17$Creates__runs__and_destroys_an_in;
    private static SubLList $list18;
    private static SubLList $list19;
    private static SubLSymbol $COMPLETE_USER_TIME;
    private static SubLSymbol $COMPLETE_SYSTEM_TIME;
    private static SubLSymbol $COMPLETE_TOTAL_TIME;
    private static SubLSymbol $sym23$LISTP;
    private static SubLSymbol $RECURSIVE_INFERENCES;
    private static SubLSymbol $RECURSIVE_INFERENCE_ROOT_PROBLEMS;
    private static SubLSymbol $MOTIVATING_TACTIC;
    private static SubLSymbol $sym27$QUERY_STATIC_OR_META_PROPERTIES_P;
    private static SubLSymbol $CONDITIONAL_SENTENCE_;
    private static SubLString $str29$Unhandled_inference_error_during_;
    private static SubLSymbol $SUSPENDED;
    private static SubLSymbol $sym31$DNF_P;
    private static SubLSymbol $NON_EXPLANATORY_SENTENCE;
    private static SubLSymbol $sym33$PROBLEM_STORE_PROPERTY_P;
    private static SubLSymbol $sym34$CONTINUABLE_INFERENCE_P;
    private static SubLSymbol $sym35$QUERY_DYNAMIC_PROPERTIES_P;
    private static SubLString $str36$Inference_was_destroyed_while_run;
    private static SubLSymbol $INFERENCE_ERROR;
    private static SubLSymbol $sym38$INFERENCE_ERROR_HANDLER;
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $SUPPORTS;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS;
    private static SubLList $list43;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS;
    private static SubLList $list45;
    private static SubLSymbol $BINDINGS_AND_HYPOTHETICAL_BINDINGS;
    private static SubLString $str47$Unexpected_return_type_specified_;
    private static SubLString $str48$Ill_formed__template_return_type_;
    private static SubLSymbol $PRAGMATIC_SUPPORTS;
    private static SubLList $list50;
    private static SubLSymbol $sym51$FORMAT;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $ILL_FORMED;
    private static SubLSymbol $sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static SubLList $list55;
    private static SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER;
    private static SubLSymbol $sym57$CSETQ;
    private static SubLString $str58$_A;
    private static SubLSymbol $TAUTOLOGY;
    private static SubLSymbol $CONTRADICTION;
    private static SubLString $str61$Unexpected_inference_status__s;
    private static SubLSymbol $sym62$INFERENCE_ANSWER_LANGUAGE_P;
    private static SubLSymbol $HL;
    private static SubLSymbol $sym64$INFERENCE_ANSWER_BINDINGS;
    private static SubLSymbol $sym65$INFERENCE_ANSWER_EL_BINDINGS;
    private static SubLList $list66;
    private static SubLSymbol $sym67$CONVERT_HL_SUPPORT_TO_EL_SUPPORT;

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 1300L)
    public static SubLObject new_browsable_cyc_query(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject new_properties = conses_high.copy_list(v_properties);
        new_properties = conses_high.putf(v_properties, $BROWSABLE_, T);
        return new_cyc_query(sentence, mt, new_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 1700L)
    public static SubLObject new_browsable_cyc_query_from_dnf(SubLObject dnf, SubLObject mt, SubLObject scoped_vars, SubLObject v_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject new_properties = conses_high.copy_list(v_properties);
        new_properties = conses_high.putf(v_properties, $BROWSABLE_, T);
        return new_cyc_query_from_dnf(dnf, mt, scoped_vars, new_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 2000L)
    public static SubLObject query_results_for_java(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
        form = current.first();
        current = current.rest();
        if (NIL == current) {
            return list($sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM, list($sym4$MULTIPLE_VALUE_LIST, form));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 2200L)
    public static SubLObject query_results_for_java_transform(SubLObject results_list) {
        return transform_list_utilities.ntransform(results_list, $sym5$INFERENCE_P, $sym6$INFERENCE_IDS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 2400L)
    public static SubLObject new_cyc_query(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, $sym7$POSSIBLY_INFERENCE_SENTENCE_P);
        if (NIL != mt) {
            enforceType(mt, $sym8$POSSIBLY_MT_P);
        }
        enforceType(query_properties, $sym9$QUERY_PROPERTIES_P);
        enforceType(sentence, $sym7$POSSIBLY_INFERENCE_SENTENCE_P);
        SubLObject plist_var = query_properties;
        enforceType(plist_var, $sym10$PROPERTY_LIST_P);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            enforceType(property, $sym11$QUERY_PROPERTY_P);
        }
        if (NIL != mt) {
            enforceType(mt, $sym8$POSSIBLY_MT_P);
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_$1 = NIL;
        SubLObject clock_time = NIL;
        SubLObject time_var = Time.get_internal_real_time();
        SubLObject resource_tracking_env_var = Time.get_internal_real_time();
        SubLObject _prev_bind_0 = control_vars.$janus_within_somethingP$.currentBinding(thread);
        try {
            control_vars.$janus_within_somethingP$.bind(T, thread);
            SubLObject aborted_p = NIL;
            try {
                thread.throwStack.push($INFERENCE_ABORT_TARGET);
                SubLObject _prev_bind_0_$2 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                try {
                    inference_strategist.$within_inference_control_processP$.bind(T, thread);
                    if (NIL != $new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) {
                        thread.resetMultipleValues();
                        SubLObject result_$3 = inference_trivial.new_cyc_trivial_query_int(sentence, mt, query_properties);
                        SubLObject halt_reason_$4 = thread.secondMultipleValue();
                        SubLObject metrics_$5 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$3;
                        halt_reason = halt_reason_$4;
                        metrics = metrics_$5;
                    }
                    if (NIL == $new_cyc_trivial_query_enabledP$.getDynamicValue(thread) || $NON_TRIVIAL == halt_reason) {
                        SubLObject input_query_properties = conses_high.copy_list(query_properties);
                        SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                        SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                        SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                        SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                        SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                        SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                        inference = new_continuable_inference_int(sentence, mt, input_static_properties, query_static_properties);
                        inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                        kbq_query_run.possibly_set_kbq_runstate_inference(inference);
                        thread.resetMultipleValues();
                        SubLObject result_$4 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                        SubLObject halt_reason_$5 = thread.secondMultipleValue();
                        SubLObject inference_$8 = thread.thirdMultipleValue();
                        SubLObject metrics_$6 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$4;
                        halt_reason = halt_reason_$5;
                        inference = inference_$8;
                        metrics = metrics_$6;
                    }
                } finally {
                    inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0_$2, thread);
                }
            } catch (Throwable ccatch_env_var) {
                aborted_p = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ABORT_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != aborted_p) {
                halt_reason = $ABORT;
                inference_strategist.query_abort();
            }
        } finally {
            control_vars.$janus_within_somethingP$.rebind(_prev_bind_0, thread);
        }
        janus.janus_note_query_finished(sentence, mt, query_properties, result, halt_reason);
        timing_info_$1 = Time.compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = utilities_macros.convert_process_resource_tracking_timing_info_to_seconds(utilities_macros.nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$1));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return Values.values(result, halt_reason, inference, metrics);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 6000L)
    public static SubLObject update_query_metrics_wrt_timing_info(SubLObject metrics, SubLObject timing_info) {
        if (NIL != metrics) {
            SubLObject complete_user_time = utilities_macros.process_resource_tracking_user_time(timing_info);
            SubLObject complete_system_time = utilities_macros.process_resource_tracking_system_time(timing_info);
            SubLObject complete_total_time = utilities_macros.process_resource_tracking_wall_clock_time(timing_info);
            metrics = Sequences.nsubstitute(complete_user_time, $COMPLETE_USER_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            metrics = Sequences.nsubstitute(complete_system_time, $COMPLETE_SYSTEM_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            metrics = Sequences.nsubstitute(complete_total_time, $COMPLETE_TOTAL_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return metrics;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 6700L)
    public static SubLObject new_cyc_query_from_dnf(SubLObject dnf, SubLObject mt, SubLObject scoped_vars, SubLObject query_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt && !assertionsDisabledInClass && NIL == hlmt.possibly_mt_p(mt)) {
            throw new AssertionError(mt);
        }
        assert NIL != Types.listp(scoped_vars) : scoped_vars;
        SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_$10 = NIL;
        SubLObject clock_time = NIL;
        SubLObject time_var = Time.get_internal_real_time();
        SubLObject resource_tracking_env_var = Time.get_internal_real_time();
        SubLObject aborted_p = NIL;
        try {
            thread.throwStack.push($INFERENCE_ABORT_TARGET);
            SubLObject _prev_bind_0 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
            try {
                inference_strategist.$within_inference_control_processP$.bind(T, thread);
                if (NIL != $new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) {
                    thread.resetMultipleValues();
                    SubLObject result_$11 = inference_trivial.new_cyc_trivial_query_from_dnf_int(dnf, mt, scoped_vars, query_properties);
                    SubLObject halt_reason_$12 = thread.secondMultipleValue();
                    SubLObject metrics_$13 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$11;
                    halt_reason = halt_reason_$12;
                    metrics = metrics_$13;
                }
                if (NIL == $new_cyc_trivial_query_enabledP$.getDynamicValue(thread) || $NON_TRIVIAL == halt_reason) {
                    SubLObject input_query_properties = conses_high.copy_list(query_properties);
                    SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                    SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                    SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                    SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                    SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                    SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                    inference = new_continuable_inference_from_dnf_int(dnf, mt, scoped_vars, input_static_properties, query_static_properties);
                    inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                    thread.resetMultipleValues();
                    SubLObject result_$12 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                    SubLObject halt_reason_$13 = thread.secondMultipleValue();
                    SubLObject inference_$16 = thread.thirdMultipleValue();
                    SubLObject metrics_$14 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$12;
                    halt_reason = halt_reason_$13;
                    inference = inference_$16;
                    metrics = metrics_$14;
                }
            } finally {
                inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            aborted_p = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ABORT_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != aborted_p) {
            halt_reason = $ABORT;
            inference_strategist.query_abort();
        }
        timing_info_$10 = Time.compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = utilities_macros.convert_process_resource_tracking_timing_info_to_seconds(utilities_macros.nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$10));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return Values.values(result, halt_reason, inference, metrics);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 8800L)
    public static SubLObject new_cyc_query_int(SubLObject inference, SubLObject input_dynamic_properties, SubLObject query_dynamic_properties, SubLObject problem_store_privateP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
        SubLObject destroy_storeP = makeBoolean(NIL != problem_store_privateP && NIL == inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties));
        SubLObject browsableP = inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties);
        if (NIL != destroy_storeP) {
            SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            inference_datastructures_problem_store.note_problem_store_destruction_imminent(store);
        }
        SubLObject outer_tactic = inference_worker.currently_executing_tactic();
        if (NIL != outer_tactic) {
            inference_datastructures_tactic.push_tactic_property(outer_tactic, $RECURSIVE_INFERENCES, inference);
            inference_datastructures_tactic.push_tactic_property(outer_tactic, $RECURSIVE_INFERENCE_ROOT_PROBLEMS, inference_datastructures_inference.inference_root_problem(inference));
            inference_datastructures_inference.set_inference_property(inference, $MOTIVATING_TACTIC, outer_tactic);
        }
        SubLObject results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject continued_inference = NIL;
        SubLObject metrics = NIL;
        try {
            SubLObject _prev_bind_0 = inference_worker.$currently_active_problem_store$.currentBinding(thread);
            try {
                inference_worker.$currently_active_problem_store$.bind(inference_datastructures_inference.inference_problem_store(inference), thread);
                if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                    thread.resetMultipleValues();
                    SubLObject results_$18 = continue_inference_int(inference, input_dynamic_properties, query_dynamic_properties);
                    SubLObject halt_reason_$19 = thread.secondMultipleValue();
                    SubLObject continued_inference_$20 = thread.thirdMultipleValue();
                    SubLObject metrics_$21 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$18;
                    halt_reason = halt_reason_$19;
                    continued_inference = continued_inference_$20;
                    metrics = metrics_$21;
                } else {
                    thread.resetMultipleValues();
                    SubLObject results_$19 = handle_non_continuable_inference_status(inference);
                    SubLObject halt_reason_$20 = thread.secondMultipleValue();
                    SubLObject metrics_$22 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$19;
                    halt_reason = halt_reason_$20;
                    metrics = metrics_$22;
                }
            } finally {
                inference_worker.$currently_active_problem_store$.rebind(_prev_bind_0, thread);
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                SubLObject inference_problem_store = inference_datastructures_inference.inference_problem_store(inference);
                SubLObject destroy_inferenceP = makeBoolean(NIL == browsableP);
                if (NIL != destroy_inferenceP) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
                if (NIL != destroy_storeP) {
                    inference_datastructures_problem_store.destroy_problem_store(inference_problem_store);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != browsableP) {
            return Values.values(results, halt_reason, inference, metrics);
        }
        return Values.values(results, halt_reason, NIL, metrics);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 10800L)
    public static SubLObject new_continuable_inference(SubLObject sentence, SubLObject mt, SubLObject query_static_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        assert NIL != el_utilities.possibly_inference_sentence_p(sentence) : sentence;
        if (NIL != mt && !assertionsDisabledInClass && NIL == hlmt.possibly_mt_p(mt)) {
            throw new AssertionError(mt);
        }
        assert NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) : query_static_properties;
        janus.janus_note_new_continuable_inference(sentence, mt, query_static_properties);
        SubLObject input_static_properties = conses_high.copy_list(query_static_properties);
        SubLObject overridden_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(query_static_properties));
        return new_continuable_inference_int(sentence, mt, input_static_properties, overridden_static_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 12300L)
    public static SubLObject new_continuable_inference_int(SubLObject sentence, SubLObject mt, SubLObject input_static_properties, SubLObject query_static_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (input_static_properties == UNPROVIDED) {
            input_static_properties = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completed_without_errorP = NIL;
        SubLObject inference = NIL;
        try {
            thread.resetMultipleValues();
            SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
            SubLObject non_explanatory_sentence = thread.secondMultipleValue();
            SubLObject problem_store_privateP = thread.thirdMultipleValue();
            SubLObject store = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            SubLObject hypothesizeP = conses_high.getf(inference_static_properties, $CONDITIONAL_SENTENCE_, UNPROVIDED);
            SubLObject disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.inference_properties_disjunction_free_el_vars_policy(inference_static_properties);
            SubLObject strategy_type = inference_strategist.strategy_type_from_sentence_and_static_properties(sentence, mt, query_static_properties);
            SubLObject _prev_bind_0 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
            try {
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(inference_datastructures_problem_store.problem_store_new_terms_allowedP(store), thread);
                inference = inference_strategist.simplest_inference_prepare_new(store, sentence, mt, strategy_type, disjunction_free_el_vars_policy, hypothesizeP, non_explanatory_sentence, problem_store_privateP);
                initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
                completed_without_errorP = T;
            } finally {
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (NIL == completed_without_errorP && NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    inference_datastructures_inference.set_inference_suspend_status(inference, inference_datastructures_enumerated_types.new_inference_error_suspend_status($str29$Unhandled_inference_error_during_));
                    inference_datastructures_inference.set_inference_status(inference, $SUSPENDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 13700L)
    public static SubLObject new_continuable_inference_from_dnf(SubLObject dnf, SubLObject mt, SubLObject scoped_vars, SubLObject query_static_properties) {
        if (scoped_vars == UNPROVIDED) {
            scoped_vars = NIL;
        }
        if (query_static_properties == UNPROVIDED) {
            query_static_properties = NIL;
        }
        assert NIL != clauses.dnf_p(dnf) : dnf;
        assert NIL != hlmt.possibly_mt_p(mt) : mt;
        assert NIL != Types.listp(scoped_vars) : scoped_vars;
        assert NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) : query_static_properties;
        SubLObject input_static_properties = conses_high.copy_list(query_static_properties);
        SubLObject overridden_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(query_static_properties));
        return new_continuable_inference_from_dnf_int(dnf, mt, scoped_vars, input_static_properties, overridden_static_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 14300L)
    public static SubLObject new_continuable_inference_from_dnf_int(SubLObject dnf, SubLObject mt, SubLObject scoped_vars, SubLObject input_static_properties, SubLObject query_static_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
        SubLObject non_explanatory_sentence = thread.secondMultipleValue();
        SubLObject problem_store_privateP = thread.thirdMultipleValue();
        SubLObject store = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject strategy_type = inference_strategist.strategy_type_from_dnf_and_static_properties(dnf, mt, query_static_properties);
        SubLObject inference = inference_strategist.simplest_inference_prepare_new_from_dnf(store, dnf, mt, strategy_type, scoped_vars, non_explanatory_sentence, problem_store_privateP);
        initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 15100L)
    public static SubLObject extract_some_inference_properties(SubLObject query_static_properties) {
        SubLObject inference_static_properties = inference_datastructures_enumerated_types.extract_inference_static_properties(query_static_properties);
        SubLObject non_explanatory_sentence = conses_high.getf(inference_static_properties, $NON_EXPLANATORY_SENTENCE, UNPROVIDED);
        SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
        SubLObject store = problem_store_from_properties(query_static_properties);
        return Values.values(inference_static_properties, non_explanatory_sentence, problem_store_privateP, store);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 15800L)
    public static SubLObject initialize_inference_properties(SubLObject inference, SubLObject input_static_properties, SubLObject inference_static_properties, SubLObject query_static_properties) {
        inference_datastructures_inference.set_inference_input_query_properties(inference, input_static_properties);
        inference_datastructures_inference.inference_set_static_properties(inference, inference_static_properties);
        SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        SubLObject strategy_static_properties = inference_datastructures_enumerated_types.extract_strategy_static_properties(query_static_properties);
        inference_tactician.strategy_initialize_properties(strategy, strategy_static_properties);
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 16300L)
    public static SubLObject problem_store_from_properties(SubLObject static_properties) {
        SubLObject problem_store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
        if (NIL != problem_store) {
            return problem_store;
        }
        SubLObject problem_store_properties = extract_problem_store_properties_from_query_static_properties(static_properties);
        return inference_datastructures_problem_store.new_problem_store(problem_store_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 16700L)
    public static SubLObject extract_problem_store_properties_from_query_static_properties(SubLObject query_static_properties) {
        return list_utilities.filter_plist(query_static_properties, $sym33$PROBLEM_STORE_PROPERTY_P);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 16900L)
    public static SubLObject continue_inference(SubLObject inference, SubLObject query_dynamic_properties) {
        if (query_dynamic_properties == UNPROVIDED) {
            query_dynamic_properties = NIL;
        }
        enforceType(inference, $sym34$CONTINUABLE_INFERENCE_P);
        assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) : query_dynamic_properties;
        SubLObject input_dynamic_properties = conses_high.copy_list(query_dynamic_properties);
        SubLObject overridden_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(inference_strategist.explicify_inference_mode_defaults(query_dynamic_properties));
        return continue_inference_int(inference, input_dynamic_properties, overridden_dynamic_properties);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 17800L)
    public static SubLObject continue_inference_int(SubLObject inference, SubLObject input_dynamic_properties, SubLObject overridden_dynamic_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        inference_update_properties(inference, input_dynamic_properties, overridden_dynamic_properties);
        inference_strategist.consider_switching_strategies(inference);
        inference_datastructures_inference.reset_inference_new_answers(inference);
        SubLObject _prev_bind_0 = inference_macros.$controlling_inferences$.currentBinding(thread);
        try {
            inference_macros.$controlling_inferences$.bind(cons(inference, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
            inference_strategist.inference_run(inference);
        } finally {
            inference_macros.$controlling_inferences$.rebind(_prev_bind_0, thread);
        }
        return inference_postprocess(inference);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 18200L)
    public static SubLObject inference_update_properties(SubLObject inference, SubLObject input_dynamic_properties, SubLObject query_dynamic_properties) {
        SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
        if (NIL != inference_datastructures_inference.prepared_inference_p(inference)) {
            inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
            inference_strategist.strengthen_query_properties_using_inference(inference);
        } else {
            inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
        }
        inference_datastructures_inference.update_inference_input_query_properties(inference, input_dynamic_properties);
        SubLObject strategy_dynamic_properties = inference_datastructures_enumerated_types.extract_strategy_dynamic_properties(query_dynamic_properties);
        SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        inference_tactician.strategy_update_properties(strategy, strategy_dynamic_properties);
        inference_datastructures_problem_store.finalize_problem_store_properties(inference_datastructures_inference.inference_problem_store(inference));
        return inference;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 19100L)
    public static SubLObject inference_postprocess(SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject return_inference = NIL;
        SubLObject metrics = NIL;
        SubLObject error_message = NIL;
        if (NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
            if (NIL == inference_datastructures_inference.valid_inference_p(inference)) {
                Errors.error($str36$Inference_was_destroyed_while_run);
            }
            SubLObject answers = inference_datastructures_inference.inference_all_new_answers(inference);
            halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
            if (NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                return_inference = inference;
            }
            metrics = inference_datastructures_inference.inference_compute_metrics(inference);
            result = inference_result_from_answers(inference, answers);
            if (NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference)) {
                result = filter_out_extra_inference_results(result, inference);
            }
            if (NIL != inference_datastructures_inference.inference_cache_resultsP(inference)) {
                SubLObject cdolist_list_var = answers;
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    inference_strategist.cache_inference_answer(v_answer);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
            }
        } else {
            try {
                thread.throwStack.push($INFERENCE_ERROR);
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function($sym38$INFERENCE_ERROR_HANDLER), thread);
                    try {
                        if (NIL == inference_datastructures_inference.valid_inference_p(inference)) {
                            Errors.error($str36$Inference_was_destroyed_while_run);
                        }
                        SubLObject answers2 = inference_datastructures_inference.inference_all_new_answers(inference);
                        halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
                        if (NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                            return_inference = inference;
                        }
                        metrics = inference_datastructures_inference.inference_compute_metrics(inference);
                        result = inference_result_from_answers(inference, answers2);
                        if (NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference)) {
                            result = filter_out_extra_inference_results(result, inference);
                        }
                        if (NIL != inference_datastructures_inference.inference_cache_resultsP(inference)) {
                            SubLObject cdolist_list_var2 = answers2;
                            SubLObject v_answer2 = NIL;
                            v_answer2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                inference_strategist.cache_inference_answer(v_answer2);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                v_answer2 = cdolist_list_var2.first();
                            }
                        }
                    } catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        }
        if (NIL != error_message) {
            halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
        }
        return Values.values(result, halt_reason, return_inference, metrics);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 20000L)
    public static SubLObject inference_result_from_answers(SubLObject inference, SubLObject answers) {
        SubLObject answer_language = inference_datastructures_inference.inference_answer_language(inference);
        SubLObject return_type = inference_datastructures_inference.inference_return_type(inference);
        SubLObject result = NIL;
        SubLObject pcase_var = return_type;
        if (pcase_var.eql($ANSWER)) {
            result = answers;
        } else if (pcase_var.eql($BINDINGS)) {
            result = inference_result_from_answers_via_template(answers, $BINDINGS);
        } else if (pcase_var.eql($SUPPORTS)) {
            result = inference_result_from_answers_via_template(answers, $SUPPORTS);
        } else if (pcase_var.eql($BINDINGS_AND_SUPPORTS)) {
            result = inference_result_from_answers_via_template(answers, $list43);
        } else if (pcase_var.eql($BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS)) {
            result = inference_result_from_answers_via_template(answers, $list45);
        } else if (pcase_var.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            SubLObject hypothetical_bindings = inference_datastructures_inference.inference_hypothetical_bindings(inference);
            result = list(inference_answers_to_bindings(answers, answer_language), hypothetical_bindings);
        } else if (NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
            SubLObject template = inference_template_return_type_template(return_type);
            result = inference_result_from_answers_via_template(answers, template);
        } else if (NIL != inference_datastructures_enumerated_types.inference_format_return_type_p(return_type)) {
            result = inference_answers_via_format(answers, return_type);
        } else {
            Errors.error($str47$Unexpected_return_type_specified_, return_type);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 21600L)
    public static SubLObject inference_result_from_all_answers(SubLObject inference) {
        SubLObject answers = inference_datastructures_inference.inference_all_answers(inference, UNPROVIDED);
        return inference_result_from_answers(inference, answers);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 21800L)
    public static SubLObject inference_template_return_type_template(SubLObject return_type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.lengthE(return_type, TWO_INTEGER, UNPROVIDED)) {
            Errors.error($str48$Ill_formed__template_return_type_, return_type);
        }
        return conses_high.second(return_type);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 22000L)
    public static SubLObject inference_result_from_answers_via_template(SubLObject answers, SubLObject template) {
        SubLObject process_supportsP = list_utilities.simple_tree_findP($SUPPORTS, template);
        SubLObject process_pragmatic_supportsP = list_utilities.simple_tree_findP($PRAGMATIC_SUPPORTS, template);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject v_bindings = inference_datastructures_inference.inference_answer_result_bindings(v_answer);
            SubLObject result = inference_one_result_from_bindings_via_template(v_bindings, template);
            if (NIL == process_supportsP && NIL == process_pragmatic_supportsP) {
                results = cons(result, results);
            } else if (inference_datastructures_inference.inference_answer_justification_count(v_answer).isZero()) {
                SubLObject supports = NIL;
                SubLObject pragmatic_supports = NIL;
                SubLObject support_result = result;
                support_result = conses_high.subst(supports, $SUPPORTS, support_result, UNPROVIDED, UNPROVIDED);
                support_result = conses_high.subst(pragmatic_supports, $PRAGMATIC_SUPPORTS, support_result, UNPROVIDED, UNPROVIDED);
                results = cons(support_result, results);
            } else {
                SubLObject cdolist_list_var_$25 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                SubLObject justification = NIL;
                justification = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    SubLObject supports2 = inference_datastructures_inference.inference_answer_justification_supports(justification);
                    SubLObject pragmatic_supports2 = inference_datastructures_inference.inference_answer_justification_pragmatic_supports(justification);
                    SubLObject support_result2 = result;
                    support_result2 = conses_high.subst(supports2, $SUPPORTS, support_result2, UNPROVIDED, UNPROVIDED);
                    support_result2 = conses_high.subst(pragmatic_supports2, $PRAGMATIC_SUPPORTS, support_result2, UNPROVIDED, UNPROVIDED);
                    results = cons(support_result2, results);
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    justification = cdolist_list_var_$25.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 23400L)
    public static SubLObject inference_result_from_binding_lists_via_template(SubLObject binding_lists, SubLObject template) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject v_bindings = NIL;
        v_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject result = inference_one_result_from_bindings_via_template(v_bindings, template);
            results = cons(result, results);
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 23800L)
    public static SubLObject inference_one_result_from_bindings_via_template(SubLObject v_bindings, SubLObject template) {
        SubLObject subst_bindingsP = list_utilities.simple_tree_findP($BINDINGS, template);
        SubLObject result = bindings.apply_bindings(v_bindings, template);
        if (NIL != subst_bindingsP) {
            result = conses_high.subst(v_bindings, $BINDINGS, result, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 24100L)
    public static SubLObject inference_answers_via_format(SubLObject answers, SubLObject return_type) {
        SubLObject results = NIL;
        SubLObject format = NIL;
        SubLObject control_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(return_type, return_type, $list50);
        format = return_type.first();
        SubLObject current = return_type.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, return_type, $list50);
        control_string = current.first();
        SubLObject v_variables;
        current = (v_variables = current.rest());
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject format_args = v_variables;
            SubLObject v_bindings = inference_datastructures_inference.inference_answer_result_bindings(v_answer);
            format_args = bindings.apply_bindings(v_bindings, format_args);
            SubLObject result = Functions.apply(Symbols.symbol_function($sym51$FORMAT), NIL, new SubLObject[] { control_string, format_args });
            results = cons(result, results);
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 24600L)
    public static SubLObject inference_all_answer_result_bindings(SubLObject inference) {
        SubLObject binding_lists = NIL;
        SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$26 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = $SKIP;
                        }
                        binding_lists = cons(inference_datastructures_inference.inference_answer_result_bindings(v_answer), binding_lists);
                    }
                }
            }
            SubLObject idx_$27 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$27) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$27);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$27);
                SubLObject end_id = id_index.id_index_next_id(idx_$27);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject v_answer2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(v_answer2)) {
                        binding_lists = cons(inference_datastructures_inference.inference_answer_result_bindings(v_answer2), binding_lists);
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(binding_lists);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 25100L)
    public static SubLObject filter_out_extra_inference_results(SubLObject results, SubLObject inference) {
        SubLObject number = inference_datastructures_inference.inference_max_number(inference);
        if (NIL != number) {
            return list_utilities.first_n(number, results);
        }
        return results;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 25300L)
    public static SubLObject handle_non_continuable_inference_status(SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject reason = NIL;
        SubLObject metrics = NIL;
        SubLObject pcase_var = inference_datastructures_inference.inference_status(inference);
        if (pcase_var.eql($ILL_FORMED)) {
            SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
            SubLObject mt = inference_datastructures_inference.inference_mt(inference);
            if (NIL != el_query && NIL != mt) {
                SubLObject message_var = NIL;
                SubLObject was_appendingP = Eval.eval($sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                Eval.eval($list55);
                try {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind($sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                fi.signal_fi_error(fi.fi_not_wff_error(el_query, mt));
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    } catch (Throwable ccatch_env_var) {
                        message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        Eval.eval(list($sym57$CSETQ, $sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                if (message_var.isString()) {
                    Errors.warn($str58$_A, message_var);
                }
            }
            v_answer = NIL;
            reason = $ILL_FORMED;
        } else if (pcase_var.eql($TAUTOLOGY)) {
            v_answer = cyc_kernel.closed_query_success_token();
            reason = $TAUTOLOGY;
        } else if (pcase_var.eql($CONTRADICTION)) {
            v_answer = NIL;
            reason = $CONTRADICTION;
        } else {
            Errors.error($str61$Unexpected_inference_status__s, inference_datastructures_inference.inference_status(inference));
        }
        return Values.values(v_answer, reason, metrics);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 26400L)
    public static SubLObject inference_answers_to_bindings(SubLObject answers, SubLObject answer_language) {
        assert NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) : answer_language;
        if ($HL == answer_language) {
            return Mapping.mapcar($sym64$INFERENCE_ANSWER_BINDINGS, answers);
        }
        return Mapping.mapcar($sym65$INFERENCE_ANSWER_EL_BINDINGS, answers);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 26700L)
    public static SubLObject inference_answer_to_bindings(SubLObject v_answer, SubLObject answer_language) {
        assert NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) : answer_language;
        if ($HL == answer_language) {
            return inference_datastructures_inference.inference_answer_bindings(v_answer);
        }
        return inference_answer_el_bindings(v_answer);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 27000L)
    public static SubLObject inference_answer_el_bindings(SubLObject v_answer) {
        SubLObject answer_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        return inference_bindings_hl_to_el(answer_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 27200L)
    public static SubLObject inference_bindings_hl_to_el(SubLObject hl_bindings) {
        SubLObject el_bindings = NIL;
        SubLObject cdolist_list_var = hl_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list66);
            variable = current.first();
            current = (value = current.rest());
            SubLObject el_value = inference_answer_hl_to_el(value);
            el_bindings = cons(bindings.make_variable_binding(variable, el_value), el_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        el_bindings = Sequences.nreverse(el_bindings);
        return el_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 27500L)
    public static SubLObject inference_answer_hl_to_el(SubLObject expression) {
        expression = fi.assertion_expand(expression);
        expression = narts_high.nart_expand(expression);
        return expression;
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 28100L)
    public static SubLObject inference_answer_supports(SubLObject v_answer) {
        SubLObject results = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            results = cons(supports, results);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 28500L)
    public static SubLObject inference_answer_bindings_and_supports(SubLObject v_answer) {
        SubLObject pairs = NIL;
        SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            pairs = cons(list(v_bindings, supports), pairs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sequences.nreverse(pairs);
    }

    @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 29000L)
    public static SubLObject inference_answer_el_bindings_and_supports(SubLObject v_answer) {
        SubLObject pairs = NIL;
        SubLObject el_bindings = inference_answer_el_bindings(v_answer);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject v_hl_supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            SubLObject el_supports = Mapping.mapcar($sym67$CONVERT_HL_SUPPORT_TO_EL_SUPPORT, v_hl_supports);
            pairs = cons(list(el_bindings, el_supports), pairs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sequences.nreverse(pairs);
    }

    public static SubLObject declare_inference_kernel_file() {
        declareFunction("new_browsable_cyc_query", "NEW-BROWSABLE-CYC-QUERY", 1, 2, false);
        declareFunction("new_browsable_cyc_query_from_dnf", "NEW-BROWSABLE-CYC-QUERY-FROM-DNF", 2, 2, false);
        declareMacro("query_results_for_java", "QUERY-RESULTS-FOR-JAVA");
        declareFunction("query_results_for_java_transform", "QUERY-RESULTS-FOR-JAVA-TRANSFORM", 1, 0, false);
        declareFunction("new_cyc_query", "NEW-CYC-QUERY", 1, 2, false);
        declareFunction("update_query_metrics_wrt_timing_info", "UPDATE-QUERY-METRICS-WRT-TIMING-INFO", 2, 0, false);
        declareFunction("new_cyc_query_from_dnf", "NEW-CYC-QUERY-FROM-DNF", 2, 2, false);
        declareFunction("new_cyc_query_int", "NEW-CYC-QUERY-INT", 4, 0, false);
        declareFunction("new_continuable_inference", "NEW-CONTINUABLE-INFERENCE", 1, 2, false);
        declareFunction("new_continuable_inference_int", "NEW-CONTINUABLE-INFERENCE-INT", 1, 3, false);
        declareFunction("new_continuable_inference_from_dnf", "NEW-CONTINUABLE-INFERENCE-FROM-DNF", 2, 2, false);
        declareFunction("new_continuable_inference_from_dnf_int", "NEW-CONTINUABLE-INFERENCE-FROM-DNF-INT", 5, 0, false);
        declareFunction("extract_some_inference_properties", "EXTRACT-SOME-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction("initialize_inference_properties", "INITIALIZE-INFERENCE-PROPERTIES", 4, 0, false);
        declareFunction("problem_store_from_properties", "PROBLEM-STORE-FROM-PROPERTIES", 1, 0, false);
        declareFunction("extract_problem_store_properties_from_query_static_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES-FROM-QUERY-STATIC-PROPERTIES", 1, 0, false);
        declareFunction("continue_inference", "CONTINUE-INFERENCE", 1, 1, false);
        declareFunction("continue_inference_int", "CONTINUE-INFERENCE-INT", 3, 0, false);
        declareFunction("inference_update_properties", "INFERENCE-UPDATE-PROPERTIES", 3, 0, false);
        declareFunction("inference_postprocess", "INFERENCE-POSTPROCESS", 1, 0, false);
        declareFunction("inference_result_from_answers", "INFERENCE-RESULT-FROM-ANSWERS", 2, 0, false);
        declareFunction("inference_result_from_all_answers", "INFERENCE-RESULT-FROM-ALL-ANSWERS", 1, 0, false);
        declareFunction("inference_template_return_type_template", "INFERENCE-TEMPLATE-RETURN-TYPE-TEMPLATE", 1, 0, false);
        declareFunction("inference_result_from_answers_via_template", "INFERENCE-RESULT-FROM-ANSWERS-VIA-TEMPLATE", 2, 0, false);
        declareFunction("inference_result_from_binding_lists_via_template", "INFERENCE-RESULT-FROM-BINDING-LISTS-VIA-TEMPLATE", 2, 0, false);
        declareFunction("inference_one_result_from_bindings_via_template", "INFERENCE-ONE-RESULT-FROM-BINDINGS-VIA-TEMPLATE", 2, 0, false);
        declareFunction("inference_answers_via_format", "INFERENCE-ANSWERS-VIA-FORMAT", 2, 0, false);
        declareFunction("inference_all_answer_result_bindings", "INFERENCE-ALL-ANSWER-RESULT-BINDINGS", 1, 0, false);
        declareFunction("filter_out_extra_inference_results", "FILTER-OUT-EXTRA-INFERENCE-RESULTS", 2, 0, false);
        declareFunction("handle_non_continuable_inference_status", "HANDLE-NON-CONTINUABLE-INFERENCE-STATUS", 1, 0, false);
        declareFunction("inference_answers_to_bindings", "INFERENCE-ANSWERS-TO-BINDINGS", 2, 0, false);
        declareFunction("inference_answer_to_bindings", "INFERENCE-ANSWER-TO-BINDINGS", 2, 0, false);
        declareFunction("inference_answer_el_bindings", "INFERENCE-ANSWER-EL-BINDINGS", 1, 0, false);
        declareFunction("inference_bindings_hl_to_el", "INFERENCE-BINDINGS-HL-TO-EL", 1, 0, false);
        new $inference_bindings_hl_to_el$UnaryFunction();
        declareFunction("inference_answer_hl_to_el", "INFERENCE-ANSWER-HL-TO-EL", 1, 0, false);
        declareFunction("inference_answer_supports", "INFERENCE-ANSWER-SUPPORTS", 1, 0, false);
        declareFunction("inference_answer_bindings_and_supports", "INFERENCE-ANSWER-BINDINGS-AND-SUPPORTS", 1, 0, false);
        declareFunction("inference_answer_el_bindings_and_supports", "INFERENCE-ANSWER-EL-BINDINGS-AND-SUPPORTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_kernel_file() {
        $new_cyc_trivial_query_enabledP$ = defvar("*NEW-CYC-TRIVIAL-QUERY-ENABLED?*", T);
        return NIL;
    }

    public static SubLObject setup_inference_kernel_file() {
        access_macros.register_external_symbol($sym1$QUERY_RESULTS_FOR_JAVA);
        access_macros.register_macro_helper($sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM, $sym1$QUERY_RESULTS_FOR_JAVA);
        utilities_macros.register_cyc_api_function($sym15$NEW_CYC_QUERY, $list16, $str17$Creates__runs__and_destroys_an_in, $list18, $list19);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_kernel_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_kernel_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_kernel_file();
    }

    static {
        me = new inference_kernel();
        $new_cyc_trivial_query_enabledP$ = null;
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $sym1$QUERY_RESULTS_FOR_JAVA = makeSymbol("QUERY-RESULTS-FOR-JAVA");
        $list2 = list(makeSymbol("FORM"));
        $sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM = makeSymbol("QUERY-RESULTS-FOR-JAVA-TRANSFORM");
        $sym4$MULTIPLE_VALUE_LIST = makeSymbol("MULTIPLE-VALUE-LIST");
        $sym5$INFERENCE_P = makeSymbol("INFERENCE-P");
        $sym6$INFERENCE_IDS = makeSymbol("INFERENCE-IDS");
        $sym7$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");
        $sym8$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
        $sym9$QUERY_PROPERTIES_P = makeSymbol("QUERY-PROPERTIES-P");
        $sym10$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
        $sym11$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
        $INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");
        $NON_TRIVIAL = makeKeyword("NON-TRIVIAL");
        $ABORT = makeKeyword("ABORT");
        $sym15$NEW_CYC_QUERY = makeSymbol("NEW-CYC-QUERY");
        $list16 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));
        $str17$Creates__runs__and_destroys_an_in = makeString(
                "Creates, runs, and destroys an inference.  Returns the results,\nwhose format is specified by the :return property of QUERY-PROPERTIES.\nIf :problem-store is specified in QUERY-PROPERTIES, uses that store,\notherwise creates a new one and destroys it afterwards.\n@param QUERY-PROPERTIES query-properties-p; see the definition of\n  query-properties-p for explanations of all query properties.\n@return 0 results, format specified by :return property\n@return 1 query-halt-reason-p, why the query halted\n@return 2 nil or inference-p; the inference object used to carry out\nthis inference, if the inference was specified to be :continuable?\nor :browsable?.  This inference object can be examined or continued.\nOne example use of the inference object is for sharing a problem store;\none can extract the problem store from the inference\n (@see inference-problem-store), and then start a new cyc query passing\nin the :problem-store property with the value you got from the first\ninference.  Don't forget to @xref destroy-problem-store when you're done.\n@return 3 metrics, format specified by :metrics property");
        $list18 = list(list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P")), list(makeSymbol("MT"), list(makeSymbol("NIL-OR"), makeSymbol("POSSIBLY-MT-P"))), list(makeSymbol("QUERY-PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")));
        $list19 = list(makeSymbol("LISTP"), makeSymbol("QUERY-HALT-REASON-P"), list(makeSymbol("NIL-OR"), makeSymbol("INFERENCE-P")), makeSymbol("LISTP"));
        $COMPLETE_USER_TIME = makeKeyword("COMPLETE-USER-TIME");
        $COMPLETE_SYSTEM_TIME = makeKeyword("COMPLETE-SYSTEM-TIME");
        $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");
        $sym23$LISTP = makeSymbol("LISTP");
        $RECURSIVE_INFERENCES = makeKeyword("RECURSIVE-INFERENCES");
        $RECURSIVE_INFERENCE_ROOT_PROBLEMS = makeKeyword("RECURSIVE-INFERENCE-ROOT-PROBLEMS");
        $MOTIVATING_TACTIC = makeKeyword("MOTIVATING-TACTIC");
        $sym27$QUERY_STATIC_OR_META_PROPERTIES_P = makeSymbol("QUERY-STATIC-OR-META-PROPERTIES-P");
        $CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
        $str29$Unhandled_inference_error_during_ = makeString("Unhandled inference error during setup");
        $SUSPENDED = makeKeyword("SUSPENDED");
        $sym31$DNF_P = makeSymbol("DNF-P");
        $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");
        $sym33$PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $sym34$CONTINUABLE_INFERENCE_P = makeSymbol("CONTINUABLE-INFERENCE-P");
        $sym35$QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");
        $str36$Inference_was_destroyed_while_run = makeString("Inference was destroyed while running.");
        $INFERENCE_ERROR = makeKeyword("INFERENCE-ERROR");
        $sym38$INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");
        $ANSWER = makeKeyword("ANSWER");
        $BINDINGS = makeKeyword("BINDINGS");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $list43 = list(makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));
        $BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");
        $list45 = list(makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("PRAGMATIC-SUPPORTS"));
        $BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $str47$Unexpected_return_type_specified_ = makeString("Unexpected return type specified: ~a");
        $str48$Ill_formed__template_return_type_ = makeString("Ill-formed :template return type ~a");
        $PRAGMATIC_SUPPORTS = makeKeyword("PRAGMATIC-SUPPORTS");
        $list50 = list(makeSymbol("FORMAT"), makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("VARIABLES"));
        $sym51$FORMAT = makeSymbol("FORMAT");
        $SKIP = makeKeyword("SKIP");
        $ILL_FORMED = makeKeyword("ILL-FORMED");
        $sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list55 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);
        $sym56$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym57$CSETQ = makeSymbol("CSETQ");
        $str58$_A = makeString("~A");
        $TAUTOLOGY = makeKeyword("TAUTOLOGY");
        $CONTRADICTION = makeKeyword("CONTRADICTION");
        $str61$Unexpected_inference_status__s = makeString("Unexpected inference status ~s");
        $sym62$INFERENCE_ANSWER_LANGUAGE_P = makeSymbol("INFERENCE-ANSWER-LANGUAGE-P");
        $HL = makeKeyword("HL");
        $sym64$INFERENCE_ANSWER_BINDINGS = makeSymbol("INFERENCE-ANSWER-BINDINGS");
        $sym65$INFERENCE_ANSWER_EL_BINDINGS = makeSymbol("INFERENCE-ANSWER-EL-BINDINGS");
        $list66 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
        $sym67$CONVERT_HL_SUPPORT_TO_EL_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-EL-SUPPORT");
    }

    public static class $inference_bindings_hl_to_el$UnaryFunction extends UnaryFunction {
        public $inference_bindings_hl_to_el$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-BINDINGS-HL-TO-EL"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_bindings_hl_to_el(arg1);
        }
    }
}
/*
 *
 * Total time: 485 ms synthetic
 */