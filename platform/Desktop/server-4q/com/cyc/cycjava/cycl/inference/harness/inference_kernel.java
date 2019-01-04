package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_kernel extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_kernel";
    public static final String myFingerPrint = "babcee533184bc37a169f7393dc46790b1e9283cb48566db5ecad4ecdc3631ea";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 1144L)
    public static SubLSymbol $new_cyc_trivial_query_enabledP$;
    private static final SubLSymbol $kw0$BROWSABLE_;
    private static final SubLSymbol $sym1$QUERY_RESULTS_FOR_JAVA;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM;
    private static final SubLSymbol $sym4$MULTIPLE_VALUE_LIST;
    private static final SubLSymbol $sym5$INFERENCE_P;
    private static final SubLSymbol $sym6$INFERENCE_IDS;
    private static final SubLSymbol $sym7$POSSIBLY_INFERENCE_SENTENCE_P;
    private static final SubLSymbol $sym8$POSSIBLY_MT_P;
    private static final SubLSymbol $sym9$QUERY_PROPERTIES_P;
    private static final SubLSymbol $sym10$PROPERTY_LIST_P;
    private static final SubLSymbol $sym11$QUERY_PROPERTY_P;
    private static final SubLSymbol $kw12$INFERENCE_ABORT_TARGET;
    private static final SubLSymbol $kw13$NON_TRIVIAL;
    private static final SubLSymbol $kw14$ABORT;
    private static final SubLSymbol $sym15$NEW_CYC_QUERY;
    private static final SubLList $list16;
    private static final SubLString $str17$Creates__runs__and_destroys_an_in;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$COMPLETE_USER_TIME;
    private static final SubLSymbol $kw21$COMPLETE_SYSTEM_TIME;
    private static final SubLSymbol $kw22$COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $sym23$LISTP;
    private static final SubLSymbol $kw24$RECURSIVE_INFERENCES;
    private static final SubLSymbol $kw25$RECURSIVE_INFERENCE_ROOT_PROBLEMS;
    private static final SubLSymbol $kw26$MOTIVATING_TACTIC;
    private static final SubLSymbol $sym27$QUERY_STATIC_OR_META_PROPERTIES_P;
    private static final SubLSymbol $kw28$CONDITIONAL_SENTENCE_;
    private static final SubLString $str29$Unhandled_inference_error_during_;
    private static final SubLSymbol $kw30$SUSPENDED;
    private static final SubLSymbol $sym31$DNF_P;
    private static final SubLSymbol $kw32$NON_EXPLANATORY_SENTENCE;
    private static final SubLSymbol $sym33$PROBLEM_STORE_PROPERTY_P;
    private static final SubLSymbol $sym34$CONTINUABLE_INFERENCE_P;
    private static final SubLSymbol $sym35$QUERY_DYNAMIC_PROPERTIES_P;
    private static final SubLString $str36$Inference_was_destroyed_while_run;
    private static final SubLSymbol $kw37$INFERENCE_ERROR;
    private static final SubLSymbol $sym38$INFERENCE_ERROR_HANDLER;
    private static final SubLSymbol $kw39$ANSWER;
    private static final SubLSymbol $kw40$BINDINGS;
    private static final SubLSymbol $kw41$SUPPORTS;
    private static final SubLSymbol $kw42$BINDINGS_AND_SUPPORTS;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS;
    private static final SubLList $list45;
    private static final SubLSymbol $kw46$BINDINGS_AND_HYPOTHETICAL_BINDINGS;
    private static final SubLString $str47$Unexpected_return_type_specified_;
    private static final SubLString $str48$Ill_formed__template_return_type_;
    private static final SubLSymbol $kw49$PRAGMATIC_SUPPORTS;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$FORMAT;
    private static final SubLSymbol $kw52$SKIP;
    private static final SubLSymbol $kw53$ILL_FORMED;
    private static final SubLSymbol $sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym57$CSETQ;
    private static final SubLString $str58$_A;
    private static final SubLSymbol $kw59$TAUTOLOGY;
    private static final SubLSymbol $kw60$CONTRADICTION;
    private static final SubLString $str61$Unexpected_inference_status__s;
    private static final SubLSymbol $sym62$INFERENCE_ANSWER_LANGUAGE_P;
    private static final SubLSymbol $kw63$HL;
    private static final SubLSymbol $sym64$INFERENCE_ANSWER_BINDINGS;
    private static final SubLSymbol $sym65$INFERENCE_ANSWER_EL_BINDINGS;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$CONVERT_HL_SUPPORT_TO_EL_SUPPORT;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 1374L)
    public static SubLObject new_browsable_cyc_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == inference_kernel.UNPROVIDED) {
            mt = (SubLObject)inference_kernel.NIL;
        }
        if (v_properties == inference_kernel.UNPROVIDED) {
            v_properties = (SubLObject)inference_kernel.NIL;
        }
        SubLObject new_properties = conses_high.copy_list(v_properties);
        new_properties = conses_high.putf(v_properties, (SubLObject)inference_kernel.$kw0$BROWSABLE_, (SubLObject)inference_kernel.T);
        return new_cyc_query(sentence, mt, new_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 1733L)
    public static SubLObject new_browsable_cyc_query_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject v_properties) {
        if (scoped_vars == inference_kernel.UNPROVIDED) {
            scoped_vars = (SubLObject)inference_kernel.NIL;
        }
        if (v_properties == inference_kernel.UNPROVIDED) {
            v_properties = (SubLObject)inference_kernel.NIL;
        }
        SubLObject new_properties = conses_high.copy_list(v_properties);
        new_properties = conses_high.putf(v_properties, (SubLObject)inference_kernel.$kw0$BROWSABLE_, (SubLObject)inference_kernel.T);
        return new_cyc_query_from_dnf(dnf, mt, scoped_vars, new_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 2061L)
    public static SubLObject query_results_for_java(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = (SubLObject)inference_kernel.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_kernel.$list2);
        form = current.first();
        current = current.rest();
        if (inference_kernel.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)inference_kernel.$sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM, (SubLObject)ConsesLow.list((SubLObject)inference_kernel.$sym4$MULTIPLE_VALUE_LIST, form));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_kernel.$list2);
        return (SubLObject)inference_kernel.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 2295L)
    public static SubLObject query_results_for_java_transform(final SubLObject results_list) {
        return transform_list_utilities.ntransform(results_list, (SubLObject)inference_kernel.$sym5$INFERENCE_P, (SubLObject)inference_kernel.$sym6$INFERENCE_IDS, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 2462L)
    public static SubLObject new_cyc_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == inference_kernel.UNPROVIDED) {
            mt = (SubLObject)inference_kernel.NIL;
        }
        if (query_properties == inference_kernel.UNPROVIDED) {
            query_properties = (SubLObject)inference_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, inference_kernel.$sym7$POSSIBLY_INFERENCE_SENTENCE_P);
        if (inference_kernel.NIL != mt) {
            enforceType(mt, inference_kernel.$sym8$POSSIBLY_MT_P);
        }
        enforceType(query_properties, inference_kernel.$sym9$QUERY_PROPERTIES_P);
        enforceType(sentence, inference_kernel.$sym7$POSSIBLY_INFERENCE_SENTENCE_P);
        final SubLObject plist_var = query_properties;
        enforceType(plist_var, inference_kernel.$sym10$PROPERTY_LIST_P);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)inference_kernel.NIL, remainder = plist_var; inference_kernel.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            enforceType(property, inference_kernel.$sym11$QUERY_PROPERTY_P);
        }
        if (inference_kernel.NIL != mt) {
            enforceType(mt, inference_kernel.$sym8$POSSIBLY_MT_P);
        }
        SubLObject result = (SubLObject)inference_kernel.NIL;
        SubLObject halt_reason = (SubLObject)inference_kernel.NIL;
        SubLObject inference = (SubLObject)inference_kernel.NIL;
        SubLObject metrics = (SubLObject)inference_kernel.NIL;
        SubLObject timing_info = (SubLObject)inference_kernel.NIL;
        SubLObject timing_info_$1 = (SubLObject)inference_kernel.NIL;
        SubLObject clock_time = (SubLObject)inference_kernel.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject resource_tracking_env_var = Time.get_internal_real_time();
        final SubLObject _prev_bind_0 = control_vars.$janus_within_somethingP$.currentBinding(thread);
        try {
            control_vars.$janus_within_somethingP$.bind((SubLObject)inference_kernel.T, thread);
            SubLObject aborted_p = (SubLObject)inference_kernel.NIL;
            try {
                thread.throwStack.push(inference_kernel.$kw12$INFERENCE_ABORT_TARGET);
                final SubLObject _prev_bind_0_$2 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                try {
                    inference_strategist.$within_inference_control_processP$.bind((SubLObject)inference_kernel.T, thread);
                    if (inference_kernel.NIL != inference_kernel.$new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) {
                        thread.resetMultipleValues();
                        final SubLObject result_$3 = inference_trivial.new_cyc_trivial_query_int(sentence, mt, query_properties);
                        final SubLObject halt_reason_$4 = thread.secondMultipleValue();
                        final SubLObject metrics_$5 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$3;
                        halt_reason = halt_reason_$4;
                        metrics = metrics_$5;
                    }
                    if (inference_kernel.NIL == inference_kernel.$new_cyc_trivial_query_enabledP$.getDynamicValue(thread) || inference_kernel.$kw13$NON_TRIVIAL == halt_reason) {
                        final SubLObject input_query_properties = conses_high.copy_list(query_properties);
                        final SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                        final SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                        final SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                        final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                        final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                        final SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                        inference = new_continuable_inference_int(sentence, mt, input_static_properties, query_static_properties);
                        inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                        kbq_query_run.possibly_set_kbq_runstate_inference(inference);
                        thread.resetMultipleValues();
                        final SubLObject result_$4 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                        final SubLObject halt_reason_$5 = thread.secondMultipleValue();
                        final SubLObject inference_$8 = thread.thirdMultipleValue();
                        final SubLObject metrics_$6 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$4;
                        halt_reason = halt_reason_$5;
                        inference = inference_$8;
                        metrics = metrics_$6;
                    }
                }
                finally {
                    inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                aborted_p = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_kernel.$kw12$INFERENCE_ABORT_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            if (inference_kernel.NIL != aborted_p) {
                halt_reason = (SubLObject)inference_kernel.$kw14$ABORT;
                inference_strategist.query_abort();
            }
        }
        finally {
            control_vars.$janus_within_somethingP$.rebind(_prev_bind_0, thread);
        }
        janus.janus_note_query_finished(sentence, mt, query_properties, result, halt_reason);
        timing_info_$1 = Time.compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = utilities_macros.convert_process_resource_tracking_timing_info_to_seconds(utilities_macros.nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$1));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return Values.values(result, halt_reason, inference, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 6057L)
    public static SubLObject update_query_metrics_wrt_timing_info(SubLObject metrics, final SubLObject timing_info) {
        if (inference_kernel.NIL != metrics) {
            final SubLObject complete_user_time = utilities_macros.process_resource_tracking_user_time(timing_info);
            final SubLObject complete_system_time = utilities_macros.process_resource_tracking_system_time(timing_info);
            final SubLObject complete_total_time = utilities_macros.process_resource_tracking_wall_clock_time(timing_info);
            metrics = Sequences.nsubstitute(complete_user_time, (SubLObject)inference_kernel.$kw20$COMPLETE_USER_TIME, metrics, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
            metrics = Sequences.nsubstitute(complete_system_time, (SubLObject)inference_kernel.$kw21$COMPLETE_SYSTEM_TIME, metrics, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
            metrics = Sequences.nsubstitute(complete_total_time, (SubLObject)inference_kernel.$kw22$COMPLETE_TOTAL_TIME, metrics, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
        }
        return metrics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 6763L)
    public static SubLObject new_cyc_query_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject query_properties) {
        if (scoped_vars == inference_kernel.UNPROVIDED) {
            scoped_vars = (SubLObject)inference_kernel.NIL;
        }
        if (query_properties == inference_kernel.UNPROVIDED) {
            query_properties = (SubLObject)inference_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_kernel.NIL != mt && !inference_kernel.assertionsDisabledInClass && inference_kernel.NIL == hlmt.possibly_mt_p(mt)) {
            throw new AssertionError(mt);
        }
        assert inference_kernel.NIL != Types.listp(scoped_vars) : scoped_vars;
        final SubLObject plist_var = query_properties;
        assert inference_kernel.NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)inference_kernel.NIL, remainder = plist_var; inference_kernel.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert inference_kernel.NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        SubLObject result = (SubLObject)inference_kernel.NIL;
        SubLObject halt_reason = (SubLObject)inference_kernel.NIL;
        SubLObject inference = (SubLObject)inference_kernel.NIL;
        SubLObject metrics = (SubLObject)inference_kernel.NIL;
        SubLObject timing_info = (SubLObject)inference_kernel.NIL;
        SubLObject timing_info_$10 = (SubLObject)inference_kernel.NIL;
        SubLObject clock_time = (SubLObject)inference_kernel.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject resource_tracking_env_var = Time.get_internal_real_time();
        SubLObject aborted_p = (SubLObject)inference_kernel.NIL;
        try {
            thread.throwStack.push(inference_kernel.$kw12$INFERENCE_ABORT_TARGET);
            final SubLObject _prev_bind_0 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
            try {
                inference_strategist.$within_inference_control_processP$.bind((SubLObject)inference_kernel.T, thread);
                if (inference_kernel.NIL != inference_kernel.$new_cyc_trivial_query_enabledP$.getDynamicValue(thread)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$11 = inference_trivial.new_cyc_trivial_query_from_dnf_int(dnf, mt, scoped_vars, query_properties);
                    final SubLObject halt_reason_$12 = thread.secondMultipleValue();
                    final SubLObject metrics_$13 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$11;
                    halt_reason = halt_reason_$12;
                    metrics = metrics_$13;
                }
                if (inference_kernel.NIL == inference_kernel.$new_cyc_trivial_query_enabledP$.getDynamicValue(thread) || inference_kernel.$kw13$NON_TRIVIAL == halt_reason) {
                    final SubLObject input_query_properties = conses_high.copy_list(query_properties);
                    final SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                    final SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                    final SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                    final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                    final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                    final SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                    inference = new_continuable_inference_from_dnf_int(dnf, mt, scoped_vars, input_static_properties, query_static_properties);
                    inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                    thread.resetMultipleValues();
                    final SubLObject result_$12 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                    final SubLObject halt_reason_$13 = thread.secondMultipleValue();
                    final SubLObject inference_$16 = thread.thirdMultipleValue();
                    final SubLObject metrics_$14 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$12;
                    halt_reason = halt_reason_$13;
                    inference = inference_$16;
                    metrics = metrics_$14;
                }
            }
            finally {
                inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            aborted_p = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_kernel.$kw12$INFERENCE_ABORT_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (inference_kernel.NIL != aborted_p) {
            halt_reason = (SubLObject)inference_kernel.$kw14$ABORT;
            inference_strategist.query_abort();
        }
        timing_info_$10 = Time.compute_with_process_resource_tracking_results(resource_tracking_env_var);
        clock_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = utilities_macros.convert_process_resource_tracking_timing_info_to_seconds(utilities_macros.nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_$10));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return Values.values(result, halt_reason, inference, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 8873L)
    public static SubLObject new_cyc_query_int(final SubLObject inference, final SubLObject input_dynamic_properties, final SubLObject query_dynamic_properties, final SubLObject problem_store_privateP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
        final SubLObject destroy_storeP = (SubLObject)SubLObjectFactory.makeBoolean(inference_kernel.NIL != problem_store_privateP && inference_kernel.NIL == inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties));
        final SubLObject browsableP = inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties);
        if (inference_kernel.NIL != destroy_storeP) {
            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            inference_datastructures_problem_store.note_problem_store_destruction_imminent(store);
        }
        final SubLObject outer_tactic = inference_worker.currently_executing_tactic();
        if (inference_kernel.NIL != outer_tactic) {
            inference_datastructures_tactic.push_tactic_property(outer_tactic, (SubLObject)inference_kernel.$kw24$RECURSIVE_INFERENCES, inference);
            inference_datastructures_tactic.push_tactic_property(outer_tactic, (SubLObject)inference_kernel.$kw25$RECURSIVE_INFERENCE_ROOT_PROBLEMS, inference_datastructures_inference.inference_root_problem(inference));
            inference_datastructures_inference.set_inference_property(inference, (SubLObject)inference_kernel.$kw26$MOTIVATING_TACTIC, outer_tactic);
        }
        SubLObject results = (SubLObject)inference_kernel.NIL;
        SubLObject halt_reason = (SubLObject)inference_kernel.NIL;
        SubLObject continued_inference = (SubLObject)inference_kernel.NIL;
        SubLObject metrics = (SubLObject)inference_kernel.NIL;
        try {
            final SubLObject _prev_bind_0 = inference_worker.$currently_active_problem_store$.currentBinding(thread);
            try {
                inference_worker.$currently_active_problem_store$.bind(inference_datastructures_inference.inference_problem_store(inference), thread);
                if (inference_kernel.NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
                    thread.resetMultipleValues();
                    final SubLObject results_$18 = continue_inference_int(inference, input_dynamic_properties, query_dynamic_properties);
                    final SubLObject halt_reason_$19 = thread.secondMultipleValue();
                    final SubLObject continued_inference_$20 = thread.thirdMultipleValue();
                    final SubLObject metrics_$21 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$18;
                    halt_reason = halt_reason_$19;
                    continued_inference = continued_inference_$20;
                    metrics = metrics_$21;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject results_$19 = handle_non_continuable_inference_status(inference);
                    final SubLObject halt_reason_$20 = thread.secondMultipleValue();
                    final SubLObject metrics_$22 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    results = results_$19;
                    halt_reason = halt_reason_$20;
                    metrics = metrics_$22;
                }
            }
            finally {
                inference_worker.$currently_active_problem_store$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                final SubLObject inference_problem_store = inference_datastructures_inference.inference_problem_store(inference);
                final SubLObject destroy_inferenceP = (SubLObject)SubLObjectFactory.makeBoolean(inference_kernel.NIL == browsableP);
                if (inference_kernel.NIL != destroy_inferenceP) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
                if (inference_kernel.NIL != destroy_storeP) {
                    inference_datastructures_problem_store.destroy_problem_store(inference_problem_store);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (inference_kernel.NIL != browsableP) {
            return Values.values(results, halt_reason, inference, metrics);
        }
        return Values.values(results, halt_reason, (SubLObject)inference_kernel.NIL, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 10855L)
    public static SubLObject new_continuable_inference(final SubLObject sentence, SubLObject mt, SubLObject query_static_properties) {
        if (mt == inference_kernel.UNPROVIDED) {
            mt = (SubLObject)inference_kernel.NIL;
        }
        if (query_static_properties == inference_kernel.UNPROVIDED) {
            query_static_properties = (SubLObject)inference_kernel.NIL;
        }
        assert inference_kernel.NIL != el_utilities.possibly_inference_sentence_p(sentence) : sentence;
        if (inference_kernel.NIL != mt && !inference_kernel.assertionsDisabledInClass && inference_kernel.NIL == hlmt.possibly_mt_p(mt)) {
            throw new AssertionError(mt);
        }
        assert inference_kernel.NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) : query_static_properties;
        janus.janus_note_new_continuable_inference(sentence, mt, query_static_properties);
        final SubLObject input_static_properties = conses_high.copy_list(query_static_properties);
        final SubLObject overridden_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(query_static_properties));
        return new_continuable_inference_int(sentence, mt, input_static_properties, overridden_static_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 12322L)
    public static SubLObject new_continuable_inference_int(final SubLObject sentence, SubLObject mt, SubLObject input_static_properties, SubLObject query_static_properties) {
        if (mt == inference_kernel.UNPROVIDED) {
            mt = (SubLObject)inference_kernel.NIL;
        }
        if (input_static_properties == inference_kernel.UNPROVIDED) {
            input_static_properties = (SubLObject)inference_kernel.NIL;
        }
        if (query_static_properties == inference_kernel.UNPROVIDED) {
            query_static_properties = (SubLObject)inference_kernel.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completed_without_errorP = (SubLObject)inference_kernel.NIL;
        SubLObject inference = (SubLObject)inference_kernel.NIL;
        try {
            thread.resetMultipleValues();
            final SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
            final SubLObject non_explanatory_sentence = thread.secondMultipleValue();
            final SubLObject problem_store_privateP = thread.thirdMultipleValue();
            final SubLObject store = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject hypothesizeP = conses_high.getf(inference_static_properties, (SubLObject)inference_kernel.$kw28$CONDITIONAL_SENTENCE_, (SubLObject)inference_kernel.UNPROVIDED);
            final SubLObject disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.inference_properties_disjunction_free_el_vars_policy(inference_static_properties);
            final SubLObject strategy_type = inference_strategist.strategy_type_from_sentence_and_static_properties(sentence, mt, query_static_properties);
            final SubLObject _prev_bind_0 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
            try {
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(inference_datastructures_problem_store.problem_store_new_terms_allowedP(store), thread);
                inference = inference_strategist.simplest_inference_prepare_new(store, sentence, mt, strategy_type, disjunction_free_el_vars_policy, hypothesizeP, non_explanatory_sentence, problem_store_privateP);
                initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
                completed_without_errorP = (SubLObject)inference_kernel.T;
            }
            finally {
                czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_kernel.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (inference_kernel.NIL == completed_without_errorP && inference_kernel.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    inference_datastructures_inference.set_inference_suspend_status(inference, inference_datastructures_enumerated_types.new_inference_error_suspend_status((SubLObject)inference_kernel.$str29$Unhandled_inference_error_during_));
                    inference_datastructures_inference.set_inference_status(inference, (SubLObject)inference_kernel.$kw30$SUSPENDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return inference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 13797L)
    public static SubLObject new_continuable_inference_from_dnf(final SubLObject dnf, final SubLObject mt, SubLObject scoped_vars, SubLObject query_static_properties) {
        if (scoped_vars == inference_kernel.UNPROVIDED) {
            scoped_vars = (SubLObject)inference_kernel.NIL;
        }
        if (query_static_properties == inference_kernel.UNPROVIDED) {
            query_static_properties = (SubLObject)inference_kernel.NIL;
        }
        assert inference_kernel.NIL != clauses.dnf_p(dnf) : dnf;
        assert inference_kernel.NIL != hlmt.possibly_mt_p(mt) : mt;
        assert inference_kernel.NIL != Types.listp(scoped_vars) : scoped_vars;
        assert inference_kernel.NIL != inference_datastructures_enumerated_types.query_static_or_meta_properties_p(query_static_properties) : query_static_properties;
        final SubLObject input_static_properties = conses_high.copy_list(query_static_properties);
        final SubLObject overridden_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(query_static_properties));
        return new_continuable_inference_from_dnf_int(dnf, mt, scoped_vars, input_static_properties, overridden_static_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 14395L)
    public static SubLObject new_continuable_inference_from_dnf_int(final SubLObject dnf, final SubLObject mt, final SubLObject scoped_vars, final SubLObject input_static_properties, final SubLObject query_static_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
        final SubLObject non_explanatory_sentence = thread.secondMultipleValue();
        final SubLObject problem_store_privateP = thread.thirdMultipleValue();
        final SubLObject store = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject strategy_type = inference_strategist.strategy_type_from_dnf_and_static_properties(dnf, mt, query_static_properties);
        final SubLObject inference = inference_strategist.simplest_inference_prepare_new_from_dnf(store, dnf, mt, strategy_type, scoped_vars, non_explanatory_sentence, problem_store_privateP);
        initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
        return inference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 15159L)
    public static SubLObject extract_some_inference_properties(final SubLObject query_static_properties) {
        final SubLObject inference_static_properties = inference_datastructures_enumerated_types.extract_inference_static_properties(query_static_properties);
        final SubLObject non_explanatory_sentence = conses_high.getf(inference_static_properties, (SubLObject)inference_kernel.$kw32$NON_EXPLANATORY_SENTENCE, (SubLObject)inference_kernel.UNPROVIDED);
        final SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
        final SubLObject store = problem_store_from_properties(query_static_properties);
        return Values.values(inference_static_properties, non_explanatory_sentence, problem_store_privateP, store);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 15816L)
    public static SubLObject initialize_inference_properties(final SubLObject inference, final SubLObject input_static_properties, final SubLObject inference_static_properties, final SubLObject query_static_properties) {
        inference_datastructures_inference.set_inference_input_query_properties(inference, input_static_properties);
        inference_datastructures_inference.inference_set_static_properties(inference, inference_static_properties);
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        final SubLObject strategy_static_properties = inference_datastructures_enumerated_types.extract_strategy_static_properties(query_static_properties);
        inference_tactician.strategy_initialize_properties(strategy, strategy_static_properties);
        return inference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 16348L)
    public static SubLObject problem_store_from_properties(final SubLObject static_properties) {
        final SubLObject problem_store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
        if (inference_kernel.NIL != problem_store) {
            return problem_store;
        }
        final SubLObject problem_store_properties = extract_problem_store_properties_from_query_static_properties(static_properties);
        return inference_datastructures_problem_store.new_problem_store(problem_store_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 16721L)
    public static SubLObject extract_problem_store_properties_from_query_static_properties(final SubLObject query_static_properties) {
        return list_utilities.filter_plist(query_static_properties, (SubLObject)inference_kernel.$sym33$PROBLEM_STORE_PROPERTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 16900L)
    public static SubLObject continue_inference(final SubLObject inference, SubLObject query_dynamic_properties) {
        if (query_dynamic_properties == inference_kernel.UNPROVIDED) {
            query_dynamic_properties = (SubLObject)inference_kernel.NIL;
        }
        enforceType(inference, inference_kernel.$sym34$CONTINUABLE_INFERENCE_P);
        assert inference_kernel.NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(query_dynamic_properties) : query_dynamic_properties;
        final SubLObject input_dynamic_properties = conses_high.copy_list(query_dynamic_properties);
        final SubLObject overridden_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(inference_strategist.explicify_inference_mode_defaults(query_dynamic_properties));
        return continue_inference_int(inference, input_dynamic_properties, overridden_dynamic_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 17818L)
    public static SubLObject continue_inference_int(final SubLObject inference, final SubLObject input_dynamic_properties, final SubLObject overridden_dynamic_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_update_properties(inference, input_dynamic_properties, overridden_dynamic_properties);
        inference_strategist.consider_switching_strategies(inference);
        inference_datastructures_inference.reset_inference_new_answers(inference);
        final SubLObject _prev_bind_0 = inference_macros.$controlling_inferences$.currentBinding(thread);
        try {
            inference_macros.$controlling_inferences$.bind((SubLObject)ConsesLow.cons(inference, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
            inference_strategist.inference_run(inference);
        }
        finally {
            inference_macros.$controlling_inferences$.rebind(_prev_bind_0, thread);
        }
        return inference_postprocess(inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 18226L)
    public static SubLObject inference_update_properties(final SubLObject inference, final SubLObject input_dynamic_properties, final SubLObject query_dynamic_properties) {
        final SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
        if (inference_kernel.NIL != inference_datastructures_inference.prepared_inference_p(inference)) {
            inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
            inference_strategist.strengthen_query_properties_using_inference(inference);
        }
        else {
            inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
        }
        inference_datastructures_inference.update_inference_input_query_properties(inference, input_dynamic_properties);
        final SubLObject strategy_dynamic_properties = inference_datastructures_enumerated_types.extract_strategy_dynamic_properties(query_dynamic_properties);
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        inference_tactician.strategy_update_properties(strategy, strategy_dynamic_properties);
        inference_datastructures_problem_store.finalize_problem_store_properties(inference_datastructures_inference.inference_problem_store(inference));
        return inference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 19194L)
    public static SubLObject inference_postprocess(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_kernel.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject result = (SubLObject)inference_kernel.NIL;
        SubLObject halt_reason = (SubLObject)inference_kernel.NIL;
        SubLObject return_inference = (SubLObject)inference_kernel.NIL;
        SubLObject metrics = (SubLObject)inference_kernel.NIL;
        SubLObject error_message = (SubLObject)inference_kernel.NIL;
        if (inference_kernel.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
            if (inference_kernel.NIL == inference_datastructures_inference.valid_inference_p(inference)) {
                Errors.error((SubLObject)inference_kernel.$str36$Inference_was_destroyed_while_run);
            }
            final SubLObject answers = inference_datastructures_inference.inference_all_new_answers(inference);
            halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
            if (inference_kernel.NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                return_inference = inference;
            }
            metrics = inference_datastructures_inference.inference_compute_metrics(inference);
            result = inference_result_from_answers(inference, answers);
            if (inference_kernel.NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference)) {
                result = filter_out_extra_inference_results(result, inference);
            }
            if (inference_kernel.NIL != inference_datastructures_inference.inference_cache_resultsP(inference)) {
                SubLObject cdolist_list_var = answers;
                SubLObject v_answer = (SubLObject)inference_kernel.NIL;
                v_answer = cdolist_list_var.first();
                while (inference_kernel.NIL != cdolist_list_var) {
                    inference_strategist.cache_inference_answer(v_answer);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
            }
        }
        else {
            try {
                thread.throwStack.push(inference_kernel.$kw37$INFERENCE_ERROR);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)inference_kernel.$sym38$INFERENCE_ERROR_HANDLER), thread);
                    try {
                        if (inference_kernel.NIL == inference_datastructures_inference.valid_inference_p(inference)) {
                            Errors.error((SubLObject)inference_kernel.$str36$Inference_was_destroyed_while_run);
                        }
                        final SubLObject answers2 = inference_datastructures_inference.inference_all_new_answers(inference);
                        halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
                        if (inference_kernel.NIL != inference_datastructures_inference.inference_browsableP(inference)) {
                            return_inference = inference;
                        }
                        metrics = inference_datastructures_inference.inference_compute_metrics(inference);
                        result = inference_result_from_answers(inference, answers2);
                        if (inference_kernel.NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference)) {
                            result = filter_out_extra_inference_results(result, inference);
                        }
                        if (inference_kernel.NIL != inference_datastructures_inference.inference_cache_resultsP(inference)) {
                            SubLObject cdolist_list_var2 = answers2;
                            SubLObject v_answer2 = (SubLObject)inference_kernel.NIL;
                            v_answer2 = cdolist_list_var2.first();
                            while (inference_kernel.NIL != cdolist_list_var2) {
                                inference_strategist.cache_inference_answer(v_answer2);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                v_answer2 = cdolist_list_var2.first();
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)inference_kernel.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_kernel.$kw37$INFERENCE_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        if (inference_kernel.NIL != error_message) {
            halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
        }
        return Values.values(result, halt_reason, return_inference, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 20097L)
    public static SubLObject inference_result_from_answers(final SubLObject inference, final SubLObject answers) {
        final SubLObject answer_language = inference_datastructures_inference.inference_answer_language(inference);
        final SubLObject return_type = inference_datastructures_inference.inference_return_type(inference);
        SubLObject result = (SubLObject)inference_kernel.NIL;
        final SubLObject pcase_var = return_type;
        if (pcase_var.eql((SubLObject)inference_kernel.$kw39$ANSWER)) {
            result = answers;
        }
        else if (pcase_var.eql((SubLObject)inference_kernel.$kw40$BINDINGS)) {
            result = inference_result_from_answers_via_template(answers, (SubLObject)inference_kernel.$kw40$BINDINGS);
        }
        else if (pcase_var.eql((SubLObject)inference_kernel.$kw41$SUPPORTS)) {
            result = inference_result_from_answers_via_template(answers, (SubLObject)inference_kernel.$kw41$SUPPORTS);
        }
        else if (pcase_var.eql((SubLObject)inference_kernel.$kw42$BINDINGS_AND_SUPPORTS)) {
            result = inference_result_from_answers_via_template(answers, (SubLObject)inference_kernel.$list43);
        }
        else if (pcase_var.eql((SubLObject)inference_kernel.$kw44$BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS)) {
            result = inference_result_from_answers_via_template(answers, (SubLObject)inference_kernel.$list45);
        }
        else if (pcase_var.eql((SubLObject)inference_kernel.$kw46$BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
            final SubLObject hypothetical_bindings = inference_datastructures_inference.inference_hypothetical_bindings(inference);
            result = (SubLObject)ConsesLow.list(inference_answers_to_bindings(answers, answer_language), hypothetical_bindings);
        }
        else if (inference_kernel.NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) {
            final SubLObject template = inference_template_return_type_template(return_type);
            result = inference_result_from_answers_via_template(answers, template);
        }
        else if (inference_kernel.NIL != inference_datastructures_enumerated_types.inference_format_return_type_p(return_type)) {
            result = inference_answers_via_format(answers, return_type);
        }
        else {
            Errors.error((SubLObject)inference_kernel.$str47$Unexpected_return_type_specified_, return_type);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 21668L)
    public static SubLObject inference_result_from_all_answers(final SubLObject inference) {
        final SubLObject answers = inference_datastructures_inference.inference_all_answers(inference, (SubLObject)inference_kernel.UNPROVIDED);
        return inference_result_from_answers(inference, answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 21849L)
    public static SubLObject inference_template_return_type_template(final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_kernel.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_kernel.NIL == list_utilities.lengthE(return_type, (SubLObject)inference_kernel.TWO_INTEGER, (SubLObject)inference_kernel.UNPROVIDED)) {
            Errors.error((SubLObject)inference_kernel.$str48$Ill_formed__template_return_type_, return_type);
        }
        return conses_high.second(return_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 22037L)
    public static SubLObject inference_result_from_answers_via_template(final SubLObject answers, final SubLObject template) {
        final SubLObject process_supportsP = list_utilities.simple_tree_findP((SubLObject)inference_kernel.$kw41$SUPPORTS, template);
        final SubLObject process_pragmatic_supportsP = list_utilities.simple_tree_findP((SubLObject)inference_kernel.$kw49$PRAGMATIC_SUPPORTS, template);
        SubLObject results = (SubLObject)inference_kernel.NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)inference_kernel.NIL;
        v_answer = cdolist_list_var.first();
        while (inference_kernel.NIL != cdolist_list_var) {
            final SubLObject v_bindings = inference_datastructures_inference.inference_answer_result_bindings(v_answer);
            final SubLObject result = inference_one_result_from_bindings_via_template(v_bindings, template);
            if (inference_kernel.NIL == process_supportsP && inference_kernel.NIL == process_pragmatic_supportsP) {
                results = (SubLObject)ConsesLow.cons(result, results);
            }
            else if (inference_datastructures_inference.inference_answer_justification_count(v_answer).isZero()) {
                final SubLObject supports = (SubLObject)inference_kernel.NIL;
                final SubLObject pragmatic_supports = (SubLObject)inference_kernel.NIL;
                SubLObject support_result = result;
                support_result = conses_high.subst(supports, (SubLObject)inference_kernel.$kw41$SUPPORTS, support_result, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
                support_result = conses_high.subst(pragmatic_supports, (SubLObject)inference_kernel.$kw49$PRAGMATIC_SUPPORTS, support_result, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
                results = (SubLObject)ConsesLow.cons(support_result, results);
            }
            else {
                SubLObject cdolist_list_var_$25 = inference_datastructures_inference.inference_answer_justifications(v_answer);
                SubLObject justification = (SubLObject)inference_kernel.NIL;
                justification = cdolist_list_var_$25.first();
                while (inference_kernel.NIL != cdolist_list_var_$25) {
                    final SubLObject supports2 = inference_datastructures_inference.inference_answer_justification_supports(justification);
                    final SubLObject pragmatic_supports2 = inference_datastructures_inference.inference_answer_justification_pragmatic_supports(justification);
                    SubLObject support_result2 = result;
                    support_result2 = conses_high.subst(supports2, (SubLObject)inference_kernel.$kw41$SUPPORTS, support_result2, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
                    support_result2 = conses_high.subst(pragmatic_supports2, (SubLObject)inference_kernel.$kw49$PRAGMATIC_SUPPORTS, support_result2, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
                    results = (SubLObject)ConsesLow.cons(support_result2, results);
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    justification = cdolist_list_var_$25.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 23483L)
    public static SubLObject inference_result_from_binding_lists_via_template(final SubLObject binding_lists, final SubLObject template) {
        SubLObject results = (SubLObject)inference_kernel.NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject v_bindings = (SubLObject)inference_kernel.NIL;
        v_bindings = cdolist_list_var.first();
        while (inference_kernel.NIL != cdolist_list_var) {
            final SubLObject result = inference_one_result_from_bindings_via_template(v_bindings, template);
            results = (SubLObject)ConsesLow.cons(result, results);
            cdolist_list_var = cdolist_list_var.rest();
            v_bindings = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 23826L)
    public static SubLObject inference_one_result_from_bindings_via_template(final SubLObject v_bindings, final SubLObject template) {
        final SubLObject subst_bindingsP = list_utilities.simple_tree_findP((SubLObject)inference_kernel.$kw40$BINDINGS, template);
        SubLObject result = bindings.apply_bindings(v_bindings, template);
        if (inference_kernel.NIL != subst_bindingsP) {
            result = conses_high.subst(v_bindings, (SubLObject)inference_kernel.$kw40$BINDINGS, result, (SubLObject)inference_kernel.UNPROVIDED, (SubLObject)inference_kernel.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 24150L)
    public static SubLObject inference_answers_via_format(final SubLObject answers, final SubLObject return_type) {
        SubLObject results = (SubLObject)inference_kernel.NIL;
        SubLObject format = (SubLObject)inference_kernel.NIL;
        SubLObject control_string = (SubLObject)inference_kernel.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(return_type, return_type, (SubLObject)inference_kernel.$list50);
        format = return_type.first();
        SubLObject current = return_type.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, return_type, (SubLObject)inference_kernel.$list50);
        control_string = current.first();
        final SubLObject v_variables;
        current = (v_variables = current.rest());
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)inference_kernel.NIL;
        v_answer = cdolist_list_var.first();
        while (inference_kernel.NIL != cdolist_list_var) {
            SubLObject format_args = v_variables;
            final SubLObject v_bindings = inference_datastructures_inference.inference_answer_result_bindings(v_answer);
            format_args = bindings.apply_bindings(v_bindings, format_args);
            final SubLObject result = Functions.apply(Symbols.symbol_function((SubLObject)inference_kernel.$sym51$FORMAT), (SubLObject)inference_kernel.NIL, new SubLObject[] { control_string, format_args });
            results = (SubLObject)ConsesLow.cons(result, results);
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 24664L)
    public static SubLObject inference_all_answer_result_bindings(final SubLObject inference) {
        SubLObject binding_lists = (SubLObject)inference_kernel.NIL;
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (inference_kernel.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_kernel.$kw52$SKIP)) {
            final SubLObject idx_$26 = idx;
            if (inference_kernel.NIL == id_index.id_index_dense_objects_empty_p(idx_$26, (SubLObject)inference_kernel.$kw52$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var = (SubLObject)inference_kernel.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_answer;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_kernel.NIL, v_iteration = (SubLObject)inference_kernel.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_kernel.ONE_INTEGER)) {
                    id = ((inference_kernel.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_kernel.ONE_INTEGER) : v_iteration);
                    v_answer = Vectors.aref(vector_var, id);
                    if (inference_kernel.NIL == id_index.id_index_tombstone_p(v_answer) || inference_kernel.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_kernel.$kw52$SKIP)) {
                        if (inference_kernel.NIL != id_index.id_index_tombstone_p(v_answer)) {
                            v_answer = (SubLObject)inference_kernel.$kw52$SKIP;
                        }
                        binding_lists = (SubLObject)ConsesLow.cons(inference_datastructures_inference.inference_answer_result_bindings(v_answer), binding_lists);
                    }
                }
            }
            final SubLObject idx_$27 = idx;
            if (inference_kernel.NIL == id_index.id_index_sparse_objects_empty_p(idx_$27) || inference_kernel.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_kernel.$kw52$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$27);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$27);
                final SubLObject end_id = id_index.id_index_next_id(idx_$27);
                final SubLObject v_default = (SubLObject)((inference_kernel.NIL != id_index.id_index_skip_tombstones_p((SubLObject)inference_kernel.$kw52$SKIP)) ? inference_kernel.NIL : inference_kernel.$kw52$SKIP);
                while (id2.numL(end_id)) {
                    final SubLObject v_answer2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (inference_kernel.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_kernel.$kw52$SKIP) || inference_kernel.NIL == id_index.id_index_tombstone_p(v_answer2)) {
                        binding_lists = (SubLObject)ConsesLow.cons(inference_datastructures_inference.inference_answer_result_bindings(v_answer2), binding_lists);
                    }
                    id2 = Numbers.add(id2, (SubLObject)inference_kernel.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(binding_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 25105L)
    public static SubLObject filter_out_extra_inference_results(final SubLObject results, final SubLObject inference) {
        final SubLObject number = inference_datastructures_inference.inference_max_number(inference);
        if (inference_kernel.NIL != number) {
            return list_utilities.first_n(number, results);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 25395L)
    public static SubLObject handle_non_continuable_inference_status(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)inference_kernel.NIL;
        SubLObject reason = (SubLObject)inference_kernel.NIL;
        final SubLObject metrics = (SubLObject)inference_kernel.NIL;
        final SubLObject pcase_var = inference_datastructures_inference.inference_status(inference);
        if (pcase_var.eql((SubLObject)inference_kernel.$kw53$ILL_FORMED)) {
            final SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
            final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
            if (inference_kernel.NIL != el_query && inference_kernel.NIL != mt) {
                SubLObject message_var = (SubLObject)inference_kernel.NIL;
                final SubLObject was_appendingP = Eval.eval((SubLObject)inference_kernel.$sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                Eval.eval((SubLObject)inference_kernel.$list55);
                try {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)inference_kernel.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                fi.signal_fi_error(fi.fi_not_wff_error(el_query, mt));
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)inference_kernel.NIL);
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_kernel.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Eval.eval((SubLObject)ConsesLow.list((SubLObject)inference_kernel.$sym57$CSETQ, (SubLObject)inference_kernel.$sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                if (message_var.isString()) {
                    Errors.warn((SubLObject)inference_kernel.$str58$_A, message_var);
                }
            }
            v_answer = (SubLObject)inference_kernel.NIL;
            reason = (SubLObject)inference_kernel.$kw53$ILL_FORMED;
        }
        else if (pcase_var.eql((SubLObject)inference_kernel.$kw59$TAUTOLOGY)) {
            v_answer = cyc_kernel.closed_query_success_token();
            reason = (SubLObject)inference_kernel.$kw59$TAUTOLOGY;
        }
        else if (pcase_var.eql((SubLObject)inference_kernel.$kw60$CONTRADICTION)) {
            v_answer = (SubLObject)inference_kernel.NIL;
            reason = (SubLObject)inference_kernel.$kw60$CONTRADICTION;
        }
        else {
            Errors.error((SubLObject)inference_kernel.$str61$Unexpected_inference_status__s, inference_datastructures_inference.inference_status(inference));
        }
        return Values.values(v_answer, reason, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 26474L)
    public static SubLObject inference_answers_to_bindings(final SubLObject answers, final SubLObject answer_language) {
        assert inference_kernel.NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) : answer_language;
        if (inference_kernel.$kw63$HL == answer_language) {
            return Mapping.mapcar((SubLObject)inference_kernel.$sym64$INFERENCE_ANSWER_BINDINGS, answers);
        }
        return Mapping.mapcar((SubLObject)inference_kernel.$sym65$INFERENCE_ANSWER_EL_BINDINGS, answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 26769L)
    public static SubLObject inference_answer_to_bindings(final SubLObject v_answer, final SubLObject answer_language) {
        assert inference_kernel.NIL != inference_datastructures_enumerated_types.inference_answer_language_p(answer_language) : answer_language;
        if (inference_kernel.$kw63$HL == answer_language) {
            return inference_datastructures_inference.inference_answer_bindings(v_answer);
        }
        return inference_answer_el_bindings(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 27034L)
    public static SubLObject inference_answer_el_bindings(final SubLObject v_answer) {
        final SubLObject answer_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        return inference_bindings_hl_to_el(answer_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 27212L)
    public static SubLObject inference_bindings_hl_to_el(final SubLObject hl_bindings) {
        SubLObject el_bindings = (SubLObject)inference_kernel.NIL;
        SubLObject cdolist_list_var = hl_bindings;
        SubLObject binding = (SubLObject)inference_kernel.NIL;
        binding = cdolist_list_var.first();
        while (inference_kernel.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = (SubLObject)inference_kernel.NIL;
            SubLObject value = (SubLObject)inference_kernel.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_kernel.$list66);
            variable = current.first();
            current = (value = current.rest());
            final SubLObject el_value = inference_answer_hl_to_el(value);
            el_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(variable, el_value), el_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        el_bindings = Sequences.nreverse(el_bindings);
        return el_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 27580L)
    public static SubLObject inference_answer_hl_to_el(SubLObject expression) {
        expression = fi.assertion_expand(expression);
        expression = narts_high.nart_expand(expression);
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 28138L)
    public static SubLObject inference_answer_supports(final SubLObject v_answer) {
        SubLObject results = (SubLObject)inference_kernel.NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = (SubLObject)inference_kernel.NIL;
        justification = cdolist_list_var.first();
        while (inference_kernel.NIL != cdolist_list_var) {
            final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            results = (SubLObject)ConsesLow.cons(supports, results);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 28527L)
    public static SubLObject inference_answer_bindings_and_supports(final SubLObject v_answer) {
        SubLObject pairs = (SubLObject)inference_kernel.NIL;
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = (SubLObject)inference_kernel.NIL;
        justification = cdolist_list_var.first();
        while (inference_kernel.NIL != cdolist_list_var) {
            final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_bindings, supports), pairs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sequences.nreverse(pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 29007L)
    public static SubLObject inference_answer_el_bindings_and_supports(final SubLObject v_answer) {
        SubLObject pairs = (SubLObject)inference_kernel.NIL;
        final SubLObject el_bindings = inference_answer_el_bindings(v_answer);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
        SubLObject justification = (SubLObject)inference_kernel.NIL;
        justification = cdolist_list_var.first();
        while (inference_kernel.NIL != cdolist_list_var) {
            final SubLObject v_hl_supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
            final SubLObject el_supports = Mapping.mapcar((SubLObject)inference_kernel.$sym67$CONVERT_HL_SUPPORT_TO_EL_SUPPORT, v_hl_supports);
            pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(el_bindings, el_supports), pairs);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return Sequences.nreverse(pairs);
    }
    
    public static SubLObject declare_inference_kernel_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_browsable_cyc_query", "NEW-BROWSABLE-CYC-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_browsable_cyc_query_from_dnf", "NEW-BROWSABLE-CYC-QUERY-FROM-DNF", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "query_results_for_java", "QUERY-RESULTS-FOR-JAVA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "query_results_for_java_transform", "QUERY-RESULTS-FOR-JAVA-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_cyc_query", "NEW-CYC-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "update_query_metrics_wrt_timing_info", "UPDATE-QUERY-METRICS-WRT-TIMING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_cyc_query_from_dnf", "NEW-CYC-QUERY-FROM-DNF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_cyc_query_int", "NEW-CYC-QUERY-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_continuable_inference", "NEW-CONTINUABLE-INFERENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_continuable_inference_int", "NEW-CONTINUABLE-INFERENCE-INT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_continuable_inference_from_dnf", "NEW-CONTINUABLE-INFERENCE-FROM-DNF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "new_continuable_inference_from_dnf_int", "NEW-CONTINUABLE-INFERENCE-FROM-DNF-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "extract_some_inference_properties", "EXTRACT-SOME-INFERENCE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "initialize_inference_properties", "INITIALIZE-INFERENCE-PROPERTIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "problem_store_from_properties", "PROBLEM-STORE-FROM-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "extract_problem_store_properties_from_query_static_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES-FROM-QUERY-STATIC-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "continue_inference", "CONTINUE-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "continue_inference_int", "CONTINUE-INFERENCE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_update_properties", "INFERENCE-UPDATE-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_postprocess", "INFERENCE-POSTPROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_result_from_answers", "INFERENCE-RESULT-FROM-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_result_from_all_answers", "INFERENCE-RESULT-FROM-ALL-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_template_return_type_template", "INFERENCE-TEMPLATE-RETURN-TYPE-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_result_from_answers_via_template", "INFERENCE-RESULT-FROM-ANSWERS-VIA-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_result_from_binding_lists_via_template", "INFERENCE-RESULT-FROM-BINDING-LISTS-VIA-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_one_result_from_bindings_via_template", "INFERENCE-ONE-RESULT-FROM-BINDINGS-VIA-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answers_via_format", "INFERENCE-ANSWERS-VIA-FORMAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_all_answer_result_bindings", "INFERENCE-ALL-ANSWER-RESULT-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "filter_out_extra_inference_results", "FILTER-OUT-EXTRA-INFERENCE-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "handle_non_continuable_inference_status", "HANDLE-NON-CONTINUABLE-INFERENCE-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answers_to_bindings", "INFERENCE-ANSWERS-TO-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answer_to_bindings", "INFERENCE-ANSWER-TO-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answer_el_bindings", "INFERENCE-ANSWER-EL-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_bindings_hl_to_el", "INFERENCE-BINDINGS-HL-TO-EL", 1, 0, false);
        new $inference_bindings_hl_to_el$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answer_hl_to_el", "INFERENCE-ANSWER-HL-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answer_supports", "INFERENCE-ANSWER-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answer_bindings_and_supports", "INFERENCE-ANSWER-BINDINGS-AND-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_kernel", "inference_answer_el_bindings_and_supports", "INFERENCE-ANSWER-EL-BINDINGS-AND-SUPPORTS", 1, 0, false);
        return (SubLObject)inference_kernel.NIL;
    }
    
    public static SubLObject init_inference_kernel_file() {
        inference_kernel.$new_cyc_trivial_query_enabledP$ = SubLFiles.defvar("*NEW-CYC-TRIVIAL-QUERY-ENABLED?*", (SubLObject)inference_kernel.T);
        return (SubLObject)inference_kernel.NIL;
    }
    
    public static SubLObject setup_inference_kernel_file() {
        access_macros.register_external_symbol((SubLObject)inference_kernel.$sym1$QUERY_RESULTS_FOR_JAVA);
        access_macros.register_macro_helper((SubLObject)inference_kernel.$sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM, (SubLObject)inference_kernel.$sym1$QUERY_RESULTS_FOR_JAVA);
        utilities_macros.register_cyc_api_function((SubLObject)inference_kernel.$sym15$NEW_CYC_QUERY, (SubLObject)inference_kernel.$list16, (SubLObject)inference_kernel.$str17$Creates__runs__and_destroys_an_in, (SubLObject)inference_kernel.$list18, (SubLObject)inference_kernel.$list19);
        return (SubLObject)inference_kernel.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_kernel_file();
    }
    
    public void initializeVariables() {
        init_inference_kernel_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_kernel_file();
    }
    
    static {
        me = (SubLFile)new inference_kernel();
        inference_kernel.$new_cyc_trivial_query_enabledP$ = null;
        $kw0$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $sym1$QUERY_RESULTS_FOR_JAVA = SubLObjectFactory.makeSymbol("QUERY-RESULTS-FOR-JAVA");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $sym3$QUERY_RESULTS_FOR_JAVA_TRANSFORM = SubLObjectFactory.makeSymbol("QUERY-RESULTS-FOR-JAVA-TRANSFORM");
        $sym4$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $sym5$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym6$INFERENCE_IDS = SubLObjectFactory.makeSymbol("INFERENCE-IDS");
        $sym7$POSSIBLY_INFERENCE_SENTENCE_P = SubLObjectFactory.makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");
        $sym8$POSSIBLY_MT_P = SubLObjectFactory.makeSymbol("POSSIBLY-MT-P");
        $sym9$QUERY_PROPERTIES_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-P");
        $sym10$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym11$QUERY_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $kw12$INFERENCE_ABORT_TARGET = SubLObjectFactory.makeKeyword("INFERENCE-ABORT-TARGET");
        $kw13$NON_TRIVIAL = SubLObjectFactory.makeKeyword("NON-TRIVIAL");
        $kw14$ABORT = SubLObjectFactory.makeKeyword("ABORT");
        $sym15$NEW_CYC_QUERY = SubLObjectFactory.makeSymbol("NEW-CYC-QUERY");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES"));
        $str17$Creates__runs__and_destroys_an_in = SubLObjectFactory.makeString("Creates, runs, and destroys an inference.  Returns the results,\nwhose format is specified by the :return property of QUERY-PROPERTIES.\nIf :problem-store is specified in QUERY-PROPERTIES, uses that store,\notherwise creates a new one and destroys it afterwards.\n@param QUERY-PROPERTIES query-properties-p; see the definition of\n  query-properties-p for explanations of all query properties.\n@return 0 results, format specified by :return property\n@return 1 query-halt-reason-p, why the query halted\n@return 2 nil or inference-p; the inference object used to carry out\nthis inference, if the inference was specified to be :continuable?\nor :browsable?.  This inference object can be examined or continued.\nOne example use of the inference object is for sharing a problem store;\none can extract the problem store from the inference\n (@see inference-problem-store), and then start a new cyc query passing\nin the :problem-store property with the value you got from the first\ninference.  Don't forget to @xref destroy-problem-store when you're done.\n@return 3 metrics, format specified by :metrics property");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-P")));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-HALT-REASON-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-P")), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $kw20$COMPLETE_USER_TIME = SubLObjectFactory.makeKeyword("COMPLETE-USER-TIME");
        $kw21$COMPLETE_SYSTEM_TIME = SubLObjectFactory.makeKeyword("COMPLETE-SYSTEM-TIME");
        $kw22$COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $sym23$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw24$RECURSIVE_INFERENCES = SubLObjectFactory.makeKeyword("RECURSIVE-INFERENCES");
        $kw25$RECURSIVE_INFERENCE_ROOT_PROBLEMS = SubLObjectFactory.makeKeyword("RECURSIVE-INFERENCE-ROOT-PROBLEMS");
        $kw26$MOTIVATING_TACTIC = SubLObjectFactory.makeKeyword("MOTIVATING-TACTIC");
        $sym27$QUERY_STATIC_OR_META_PROPERTIES_P = SubLObjectFactory.makeSymbol("QUERY-STATIC-OR-META-PROPERTIES-P");
        $kw28$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $str29$Unhandled_inference_error_during_ = SubLObjectFactory.makeString("Unhandled inference error during setup");
        $kw30$SUSPENDED = SubLObjectFactory.makeKeyword("SUSPENDED");
        $sym31$DNF_P = SubLObjectFactory.makeSymbol("DNF-P");
        $kw32$NON_EXPLANATORY_SENTENCE = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE");
        $sym33$PROBLEM_STORE_PROPERTY_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $sym34$CONTINUABLE_INFERENCE_P = SubLObjectFactory.makeSymbol("CONTINUABLE-INFERENCE-P");
        $sym35$QUERY_DYNAMIC_PROPERTIES_P = SubLObjectFactory.makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");
        $str36$Inference_was_destroyed_while_run = SubLObjectFactory.makeString("Inference was destroyed while running.");
        $kw37$INFERENCE_ERROR = SubLObjectFactory.makeKeyword("INFERENCE-ERROR");
        $sym38$INFERENCE_ERROR_HANDLER = SubLObjectFactory.makeSymbol("INFERENCE-ERROR-HANDLER");
        $kw39$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $kw40$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw41$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw42$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $kw44$BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS"));
        $kw46$BINDINGS_AND_HYPOTHETICAL_BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $str47$Unexpected_return_type_specified_ = SubLObjectFactory.makeString("Unexpected return type specified: ~a");
        $str48$Ill_formed__template_return_type_ = SubLObjectFactory.makeString("Ill-formed :template return type ~a");
        $kw49$PRAGMATIC_SUPPORTS = SubLObjectFactory.makeKeyword("PRAGMATIC-SUPPORTS");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"));
        $sym51$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $kw52$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw53$ILL_FORMED = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $sym54$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)inference_kernel.NIL);
        $sym56$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym57$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str58$_A = SubLObjectFactory.makeString("~A");
        $kw59$TAUTOLOGY = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $kw60$CONTRADICTION = SubLObjectFactory.makeKeyword("CONTRADICTION");
        $str61$Unexpected_inference_status__s = SubLObjectFactory.makeString("Unexpected inference status ~s");
        $sym62$INFERENCE_ANSWER_LANGUAGE_P = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-LANGUAGE-P");
        $kw63$HL = SubLObjectFactory.makeKeyword("HL");
        $sym64$INFERENCE_ANSWER_BINDINGS = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-BINDINGS");
        $sym65$INFERENCE_ANSWER_EL_BINDINGS = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-EL-BINDINGS");
        $list66 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym67$CONVERT_HL_SUPPORT_TO_EL_SUPPORT = SubLObjectFactory.makeSymbol("CONVERT-HL-SUPPORT-TO-EL-SUPPORT");
    }
    
    public static final class $inference_bindings_hl_to_el$UnaryFunction extends UnaryFunction
    {
        public $inference_bindings_hl_to_el$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-BINDINGS-HL-TO-EL"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_kernel.inference_bindings_hl_to_el(arg1);
        }
    }
}

/*

	Total time: 485 ms
	 synthetic 
*/