package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.cycjava.cycl.rkf_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.rkf_query_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_query_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_query_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_query_utilities";

    public static final String myFingerPrint = "b011ef69fb887bd24d059e8f9578374b38ac3d318fa99c90ae1eadb60d307fc7";

    // deflexical
    private static final SubLSymbol $rkf_default_new_query_properties$ = makeSymbol("*RKF-DEFAULT-NEW-QUERY-PROPERTIES*");

    // defparameter
    public static final SubLSymbol $rkf_known_time_cutoff$ = makeSymbol("*RKF-KNOWN-TIME-CUTOFF*");







    public static final SubLString $str3$RKF_CHOOSE_QUERY_METHOD__This_is_ = makeString("RKF-CHOOSE-QUERY-METHOD: This is a legacy function and will go away; use RKF-DETERMINE-QUERY-TYPE instead.");

    public static final SubLSymbol RKF_TRUTH = makeSymbol("RKF-TRUTH");

    public static final SubLSymbol RKF_QUERY = makeSymbol("RKF-QUERY");

    public static final SubLString $str6$Unsupported_query_type__A_ = makeString("Unsupported query type ~A.");



    public static final SubLString $str8$__RKF_ASK_timed_out_after__S_seco = makeString("~&RKF-ASK timed out after ~S seconds on ~S in ~S.~%");

    private static final SubLSymbol $kw9$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");







    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    public static final SubLList $list14 = list(makeSymbol("BINDING"), makeSymbol("JUSTIFICATION"));







    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    public static final SubLList $list20 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    public static final SubLList $list21 = list(makeSymbol("PROS"), makeSymbol("CONS"));

    private static final SubLObject $$TheResultOfParsing = reader_make_constant_shell(makeString("TheResultOfParsing"));





    private static final SubLSymbol $kw25$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    public static final SubLSymbol RKF_KNOWN = makeSymbol("RKF-KNOWN");

    public static SubLObject rkf_determine_query_type(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != closedP(formula, UNPROVIDED)) {
            return $TRUTH;
        }
        if (NIL != el_implication_p(formula)) {
            return $PROVE;
        }
        return $ASK;
    }

    public static SubLObject rkf_choose_query_method(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        Errors.warn($str3$RKF_CHOOSE_QUERY_METHOD__This_is_);
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = rkf_determine_query_type(formula, mt);
        if (pcase_var.eql($TRUTH)) {
            return RKF_TRUTH;
        }
        return RKF_QUERY;
    }

    public static SubLObject rkf_generic_query(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject classification = pcase_var = rkf_determine_query_type(formula, mt);
        if (pcase_var.eql($TRUTH)) {
            thread.resetMultipleValues();
            final SubLObject pro = rkf_truth(formula, mt, backchain, number, time, depth);
            final SubLObject cons = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values($TRUTH, pro, cons);
        }
        if (pcase_var.eql($PROVE)) {
            thread.resetMultipleValues();
            final SubLObject results = rkf_prove(formula, mt, backchain, number, time, depth);
            final SubLObject status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values($PROVE, results, status);
        }
        if (pcase_var.eql($ASK)) {
            thread.resetMultipleValues();
            final SubLObject results = rkf_ask(formula, mt, backchain, number, time, depth);
            final SubLObject status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values($ASK, results, status);
        }
        Errors.error($str6$Unsupported_query_type__A_, classification);
        return NIL;
    }

    public static SubLObject rkf_query(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = rkf_determine_query_type(formula, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject status = NIL;
        if (type == $PROVE) {
            thread.resetMultipleValues();
            final SubLObject res = rkf_prove(formula, mt, backchain, number, time, depth);
            final SubLObject stat = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = res;
            status = stat;
        } else {
            thread.resetMultipleValues();
            final SubLObject res = rkf_ask(formula, mt, backchain, number, time, depth);
            final SubLObject stat = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = res;
            status = stat;
        }
        return values(result, status);
    }

    public static SubLObject rkf_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject status = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject ask_result = ask_utilities.ask_justified(formula, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != number_utilities.positive_number_p(time)) && ($MAX_TIME == ask_status)) {
                Errors.warn($str8$__RKF_ASK_timed_out_after__S_seco, time, formula, mt);
            }
            result = ask_result;
            status = ask_status;
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return values(result, status);
    }

    public static SubLObject rkf_prove(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject status = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject ask_result = prove.prove_justified(formula, mt, backchain, number, time, depth);
            final SubLObject ask_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = ask_result;
            status = ask_status;
        } finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_2, thread);
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return values(result, status);
    }

    public static SubLObject rkf_new_query(final SubLObject sentence, final SubLObject rkf_mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject status = NIL;
        SubLObject inference = NIL;
        v_properties = list_utilities.merge_plist(v_properties, $rkf_default_new_query_properties$.getGlobalValue());
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(sentence, rkf_mt, v_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject maybe_inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = results;
        status = halt_reason;
        inference = maybe_inference;
        return values(result, status, inference);
    }

    public static SubLObject rkf_ask_new_cycl_query_specification(final SubLObject query_spec, SubLObject mt, SubLObject substitutions) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        final SubLObject additional_properties = $rkf_default_new_query_properties$.getGlobalValue();
        return new_cycl_query_specification.new_cycl_query_specification_ask(query_spec, mt, substitutions, additional_properties);
    }

    public static SubLObject rkf_expand_justifications(final SubLObject results) {
        SubLObject expanded_results = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject binding = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            binding = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject new_justifications = hl_supports.hl_justification_expand(justification);
                expanded_results = cons(list(binding, new_justifications), expanded_results);
            } else {
                cdestructuring_bind_error(datum, $list14);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return nreverse(expanded_results);
    }

    public static SubLObject rkf_extract_bindings_from_results(final SubLObject results) {
        SubLObject v_bindings = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject binding = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            binding = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                v_bindings = cons(binding, v_bindings);
            } else {
                cdestructuring_bind_error(datum, $list14);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return nreverse(v_bindings);
    }

    public static SubLObject rkf_truth(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = ONE_INTEGER;
        }
        if (time == UNPROVIDED) {
            time = TEN_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        return rkf_truth_internal(formula, mt, backchain, number, time, depth);
    }

    public static SubLObject rkf_truth_inference_properties(final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        return list(new SubLObject[]{ $ANSWER_LANGUAGE, $HL, $kw9$CACHE_INFERENCE_RESULTS_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS, $RESULT_UNIQUENESS, $PROOF, $MAX_NUMBER, number, $MAX_TIME, time, $MAX_TRANSFORMATION_DEPTH, backchain, $MAX_PROOF_DEPTH, depth });
    }

    public static SubLObject rkf_truth_internal(final SubLObject formula, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sorted_true_arguments = NIL;
        SubLObject sorted_false_arguments = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            $within_assert$.bind(NIL, thread);
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            final SubLObject v_properties = rkf_truth_inference_properties(backchain, number, time, depth);
            SubLObject cdolist_list_var = inference_kernel.new_cyc_query(formula, mt, v_properties);
            SubLObject true_result = NIL;
            true_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = true_result;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list20);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                        if (NIL == member(item_var, sorted_true_arguments, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            sorted_true_arguments = cons(item_var, sorted_true_arguments);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                true_result = cdolist_list_var.first();
            } 
            cdolist_list_var = inference_kernel.new_cyc_query(cycl_utilities.negate(formula), mt, v_properties);
            SubLObject false_result = NIL;
            false_result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = false_result;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list20);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != cyc_kernel.closed_query_bindings_p(v_bindings)) {
                        final SubLObject item_var = rkf_argument_communicator.rkf_sort_supports(supports);
                        if (NIL == member(item_var, sorted_false_arguments, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            sorted_false_arguments = cons(item_var, sorted_false_arguments);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                false_result = cdolist_list_var.first();
            } 
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return list(nreverse(sorted_true_arguments), nreverse(sorted_false_arguments));
    }

    public static SubLObject rkf_justify(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != assertion_handles.assertion_p(formula)) {
            return list(hl_supports.hl_justify(formula));
        }
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        SubLObject current;
        final SubLObject datum = current = rkf_truth(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pros = NIL;
        SubLObject cons = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        pros = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        cons = current.first();
        current = current.rest();
        if (NIL == current) {
            return NIL != cons ? NIL : pros;
        }
        cdestructuring_bind_error(datum, $list21);
        return NIL;
    }

    public static SubLObject rkf_unknown(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL != cycl_utilities.formula_find($$TheResultOfParsing, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return makeBoolean(((NIL == rkf_contradiction_finder.rkf_rejected(formula, mt, UNPROVIDED, UNPROVIDED)) && (NIL == rkf_redundancy_detector.rkf_redundant(formula, mt, UNPROVIDED, UNPROVIDED))) && (NIL == rkf_known(formula, mt, UNPROVIDED)));
    }

    public static SubLObject rkf_known_inference_properties(final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $ANSWER_LANGUAGE, $HL, $kw9$CACHE_INFERENCE_RESULTS_, NIL, $RESULT_UNIQUENESS, $BINDINGS, $kw25$NEGATION_BY_FAILURE_, $negation_by_failure$.getDynamicValue(thread), $MAX_NUMBER, ONE_INTEGER, $MAX_TIME, $rkf_known_time_cutoff$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER });
    }

    public static SubLObject rkf_known(final SubLObject formula, SubLObject mt, SubLObject problem_store) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (problem_store == UNPROVIDED) {
            problem_store = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.formula_find($$TheResultOfParsing, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject known = NIL;
        SubLObject timed_outP = NIL;
        thread.resetMultipleValues();
        final SubLObject results = inference_kernel.new_cyc_query(formula, mt, rkf_known_inference_properties(problem_store));
        final SubLObject exit_condition = thread.secondMultipleValue();
        thread.resetMultipleValues();
        known = list_utilities.sublisp_boolean(results);
        timed_outP = eq($MAX_TIME, exit_condition);
        return values(known, timed_outP);
    }

    public static SubLObject rkf_load_test_question(final SubLObject tq_id, final SubLObject rkf_mt) {
        final SubLObject tq_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(tq_id, rkf_mt);
        return tq_spec;
    }

    public static SubLObject rkf_make_similar_test_question(final SubLObject formula, final SubLObject tq_id, final SubLObject rkf_mt) {
        final SubLObject tq_spec = rkf_load_test_question(tq_id, rkf_mt);
        new_cycl_query_specification.reset_new_cycl_query_specification_formula(tq_spec, formula);
        new_cycl_query_specification.reset_new_cycl_query_specification_mt(tq_spec, rkf_mt);
        return tq_spec;
    }

    public static SubLObject declare_rkf_query_utilities_file() {
        declareFunction(me, "rkf_determine_query_type", "RKF-DETERMINE-QUERY-TYPE", 1, 1, false);
        declareFunction(me, "rkf_choose_query_method", "RKF-CHOOSE-QUERY-METHOD", 1, 1, false);
        declareFunction(me, "rkf_generic_query", "RKF-GENERIC-QUERY", 1, 5, false);
        declareFunction(me, "rkf_query", "RKF-QUERY", 1, 5, false);
        declareFunction(me, "rkf_ask", "RKF-ASK", 1, 5, false);
        declareFunction(me, "rkf_prove", "RKF-PROVE", 1, 5, false);
        declareFunction(me, "rkf_new_query", "RKF-NEW-QUERY", 2, 1, false);
        declareFunction(me, "rkf_ask_new_cycl_query_specification", "RKF-ASK-NEW-CYCL-QUERY-SPECIFICATION", 1, 2, false);
        declareFunction(me, "rkf_expand_justifications", "RKF-EXPAND-JUSTIFICATIONS", 1, 0, false);
        declareFunction(me, "rkf_extract_bindings_from_results", "RKF-EXTRACT-BINDINGS-FROM-RESULTS", 1, 0, false);
        declareFunction(me, "rkf_truth", "RKF-TRUTH", 1, 5, false);
        declareFunction(me, "rkf_truth_inference_properties", "RKF-TRUTH-INFERENCE-PROPERTIES", 4, 0, false);
        declareFunction(me, "rkf_truth_internal", "RKF-TRUTH-INTERNAL", 6, 0, false);
        declareFunction(me, "rkf_justify", "RKF-JUSTIFY", 1, 1, false);
        declareFunction(me, "rkf_unknown", "RKF-UNKNOWN", 1, 1, false);
        declareFunction(me, "rkf_known_inference_properties", "RKF-KNOWN-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(me, "rkf_known", "RKF-KNOWN", 1, 2, false);
        declareFunction(me, "rkf_load_test_question", "RKF-LOAD-TEST-QUESTION", 2, 0, false);
        declareFunction(me, "rkf_make_similar_test_question", "RKF-MAKE-SIMILAR-TEST-QUESTION", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_query_utilities_file() {
        deflexical("*RKF-DEFAULT-NEW-QUERY-PROPERTIES*", list($kw9$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $HL, $RETURN, $BINDINGS_AND_SUPPORTS));
        defparameter("*RKF-KNOWN-TIME-CUTOFF*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_query_utilities_file() {
        register_external_symbol(RKF_KNOWN);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_query_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_query_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_query_utilities_file();
    }

    static {






























    }
}

/**
 * Total time: 162 ms
 */
