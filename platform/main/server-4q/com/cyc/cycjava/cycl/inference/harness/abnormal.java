package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_results;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class abnormal extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.abnormal";
    public static String myFingerPrint = "d400dd4ee17eaf4bf5510471b022d207cd7d2218a41e137a2e1f6f58f52a1ca8";
    @SubL(source = "cycl/inference/harness.lisp", position = 400L)
    public static SubLSymbol $abnormality_checking_enabled$;
    @SubL(source = "cycl/inference/harness.lisp", position = 600L)
    private static SubLSymbol $abnormality_except_support_enabled$;
    @SubL(source = "cycl/inference/harness.lisp", position = 2900L)
    public static SubLSymbol $abnormality_transformation_depth$;
    @SubL(source = "cycl/inference/harness.lisp", position = 2900L)
    private static SubLSymbol $browse_abnormal_inferencesP$;
    private static SubLObject $$abnormal;
    private static SubLSymbol $sym1$VARIABLE_BINDING_VALUE;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLSymbol $ABNORMAL;
    private static SubLObject $$TheList;
    private static SubLSymbol $MAX_NUMBER;
    private static SubLSymbol $MAX_TRANSFORMATION_DEPTH;
    private static SubLSymbol $RESULT_UNIQUENESS;
    private static SubLSymbol $BINDINGS;
    private static SubLSymbol $RETURN;
    private static SubLSymbol $BINDINGS_AND_SUPPORTS;
    private static SubLSymbol $ANSWER_LANGUAGE;
    private static SubLSymbol $HL;
    private static SubLSymbol $BROWSABLE_;
    private static SubLSymbol $MIN_RULE_UTILITY;
    private static SubLInteger $int$_100;
    private static SubLSymbol $ALLOW_ABNORMALITY_CHECKING_;
    private static SubLSymbol $sym17$SECOND;
    private static SubLString $str18$Assume_it_isn_t_abnormal;
    private static SubLString $str19$Abnormality_checker_doesn_t_have_;
    private static SubLSymbol $INFERENCE_REJECTED;
    private static SubLString $str21$Abnormality_checker_doesn_t_have_;
    private static SubLString $str22$_S_are_exceptions_to__S;

    @SubL(source = "cycl/inference/harness.lisp", position = 800L)
    public static SubLObject abnormality_except_support_enabledP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $abnormality_except_support_enabled$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 900L)
    public static SubLObject rule_has_exceptionsP(SubLObject rule) {
        return makeBoolean(NIL != assertions_high.rule_assertionP(rule) && NIL != assertion_utilities.assertion_has_meta_assertionsP(rule) && (kb_indexing.num_gaf_arg_index(rule, TWO_INTEGER, $$abnormal, UNPROVIDED).isPositive()
                || kb_indexing.num_exception_rule_index(rule, UNPROVIDED, UNPROVIDED).isPositive() || NIL != ((NIL != abnormality_except_support_enabledP()) ? assertion_utilities.excepted_assertionP(rule, UNPROVIDED, UNPROVIDED) : NIL)));
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 1300L)
    public static SubLObject rule_bindings_abnormalP(SubLObject store, SubLObject rule, SubLObject rule_bindings, SubLObject transformation_mt) {
        if (NIL != rule_has_exceptionsP(rule)) {
            SubLObject bound_values_to_check = Mapping.mapcar($sym1$VARIABLE_BINDING_VALUE, inference_worker.canonicalize_proof_bindings(rule_bindings));
            return abnormality_check_internal(bound_values_to_check, rule, transformation_mt, store);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 1800L)
    public static SubLObject abnormality_check_internal(SubLObject bound_values_to_check, SubLObject rule, SubLObject transformation_mt, SubLObject store) {
        SubLObject sentence = abnormality_check_sentence(bound_values_to_check, rule);
        SubLObject query_dnf = clause_utilities.make_gaf_dnf(sentence);
        SubLObject query_properties = abnormality_check_query_properties(store);
        SubLObject bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, NIL, query_properties);
        if (NIL != abnormality_query_used_illegal_proofP(bindings_and_supports, rule)) {
            query_properties = conses_high.remf(query_properties, $PROBLEM_STORE);
            bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, NIL, query_properties);
        }
        SubLObject justification = conses_high.second(bindings_and_supports.first());
        if (NIL != justification) {
            return justification;
        }
        if (NIL != list_utilities.sublisp_boolean(bindings_and_supports)) {
            return $ABNORMAL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 2700L)
    public static SubLObject abnormality_check_sentence(SubLObject bound_values_to_check, SubLObject rule) {
        return el_utilities.make_binary_formula($$abnormal, el_utilities.make_formula($$TheList, bound_values_to_check, UNPROVIDED), rule);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 3000L)
    public static SubLObject abnormality_check_query_properties(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return list(new SubLObject[] { $PROBLEM_STORE, store, $MAX_NUMBER, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, $abnormality_transformation_depth$.getDynamicValue(thread), $RESULT_UNIQUENESS, $BINDINGS, $RETURN, $BINDINGS_AND_SUPPORTS, $ANSWER_LANGUAGE, $HL,
                $BROWSABLE_, $browse_abnormal_inferencesP$.getDynamicValue(thread), $MIN_RULE_UTILITY, $int$_100, $ALLOW_ABNORMALITY_CHECKING_, NIL });
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 3900L)
    public static SubLObject abnormality_query_used_illegal_proofP(SubLObject bindings_and_supports, SubLObject rule) {
        SubLObject cdolist_list_var;
        SubLObject justifications = cdolist_list_var = Mapping.mapcar($sym17$SECOND, bindings_and_supports);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != abnormality_justification_used_illegal_proofP(justification, rule)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 4200L)
    public static SubLObject abnormality_justification_used_illegal_proofP(SubLObject justification, SubLObject rule) {
        return subl_promotions.memberP(rule, justification, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 4500L)
    public static SubLObject backward_abnormality_check(SubLObject rule, SubLObject source_bindings, SubLObject node_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $abnormality_checking_enabled$.getDynamicValue(thread) && NIL != rule_has_exceptionsP(rule)) {
            SubLObject rule_variables = NIL;
            SubLObject node_variables = NIL;
            SubLObject bound_values_to_check = NIL;
            rule_variables = assertions_high.assertion_free_hl_variables(rule);
            node_variables = conses_high.nsublis(source_bindings, rule_variables, UNPROVIDED, UNPROVIDED);
            bound_values_to_check = conses_high.nsublis(node_bindings, node_variables, UNPROVIDED, UNPROVIDED);
            if (NIL == variables.fully_bound_p(bound_values_to_check)) {
                Errors.cerror($str18$Assume_it_isn_t_abnormal, $str19$Abnormality_checker_doesn_t_have_, rule);
                return NIL;
            }
            SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                if (NIL != abnormality_check_internal(bound_values_to_check, rule, mt_relevance_macros.$mt$.getDynamicValue(thread), NIL)) {
                    signal_abnormal(bound_values_to_check, rule);
                }
            } finally {
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5600L)
    public static SubLObject forward_bindings_abnormalP(SubLObject propagation_mt, SubLObject rule, SubLObject trigger_bindings, SubLObject inference_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abnormalP = NIL;
        try {
            thread.throwStack.push($INFERENCE_REJECTED);
            forward_abnormality_check(propagation_mt, rule, trigger_bindings, inference_bindings);
        } catch (Throwable ccatch_env_var) {
            abnormalP = Errors.handleThrowable(ccatch_env_var, $INFERENCE_REJECTED);
        } finally {
            thread.throwStack.pop();
        }
        return abnormalP;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 6100L)
    public static SubLObject forward_abnormality_check(SubLObject propagation_mt, SubLObject rule, SubLObject trigger_bindings, SubLObject inference_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $abnormality_checking_enabled$.getDynamicValue(thread) && NIL != rule_has_exceptionsP(rule)) {
            SubLObject rule_variables = NIL;
            SubLObject bound_values_to_check = NIL;
            rule_variables = (bound_values_to_check = assertions_high.assertion_free_hl_variables(rule));
            bound_values_to_check = conses_high.nsublis(trigger_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
            bound_values_to_check = conses_high.nsublis(inference_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
            if (NIL == variables.fully_bound_p(bound_values_to_check)) {
                Errors.cerror($str18$Assume_it_isn_t_abnormal, $str21$Abnormality_checker_doesn_t_have_, rule);
                return NIL;
            }
            SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                if (NIL != abnormality_check_internal(bound_values_to_check, rule, propagation_mt, NIL)) {
                    signal_abnormal(bound_values_to_check, rule);
                }
            } finally {
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 7100L)
    public static SubLObject signal_abnormal(SubLObject v_bindings, SubLObject rule) {
        return backward_results.reject_inference(list($ABNORMAL, $str22$_S_are_exceptions_to__S, v_bindings, rule));
    }

    public static SubLObject declare_abnormal_file() {
        declareFunction(myName, "abnormality_except_support_enabledP", "ABNORMALITY-EXCEPT-SUPPORT-ENABLED?", 0, 0, false);
        declareFunction(myName, "rule_has_exceptionsP", "RULE-HAS-EXCEPTIONS?", 1, 0, false);
        declareFunction(myName, "rule_bindings_abnormalP", "RULE-BINDINGS-ABNORMAL?", 4, 0, false);
        declareFunction(myName, "abnormality_check_internal", "ABNORMALITY-CHECK-INTERNAL", 4, 0, false);
        declareFunction(myName, "abnormality_check_sentence", "ABNORMALITY-CHECK-SENTENCE", 2, 0, false);
        declareFunction(myName, "abnormality_check_query_properties", "ABNORMALITY-CHECK-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(myName, "abnormality_query_used_illegal_proofP", "ABNORMALITY-QUERY-USED-ILLEGAL-PROOF?", 2, 0, false);
        declareFunction(myName, "abnormality_justification_used_illegal_proofP", "ABNORMALITY-JUSTIFICATION-USED-ILLEGAL-PROOF?", 2, 0, false);
        declareFunction(myName, "backward_abnormality_check", "BACKWARD-ABNORMALITY-CHECK", 3, 0, false);
        declareFunction(myName, "forward_bindings_abnormalP", "FORWARD-BINDINGS-ABNORMAL?", 4, 0, false);
        declareFunction(myName, "forward_abnormality_check", "FORWARD-ABNORMALITY-CHECK", 4, 0, false);
        declareFunction(myName, "signal_abnormal", "SIGNAL-ABNORMAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_abnormal_file() {
        $abnormality_checking_enabled$ = defvar("*ABNORMALITY-CHECKING-ENABLED*", T);
        $abnormality_except_support_enabled$ = defparameter("*ABNORMALITY-EXCEPT-SUPPORT-ENABLED*", T);
        $abnormality_transformation_depth$ = defvar("*ABNORMALITY-TRANSFORMATION-DEPTH*", ONE_INTEGER);
        $browse_abnormal_inferencesP$ = defparameter("*BROWSE-ABNORMAL-INFERENCES?*", NIL);
        return NIL;
    }

    public static SubLObject setup_abnormal_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_abnormal_file();
    }

    @Override
    public void initializeVariables() {
        init_abnormal_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_abnormal_file();
    }

    static {
        me = new abnormal();
        $abnormality_checking_enabled$ = null;
        $abnormality_except_support_enabled$ = null;
        $abnormality_transformation_depth$ = null;
        $browse_abnormal_inferencesP$ = null;
        $$abnormal = makeConstSym(("abnormal"));
        $sym1$VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $ABNORMAL = makeKeyword("ABNORMAL");
        $$TheList = makeConstSym(("TheList"));
        $MAX_NUMBER = makeKeyword("MAX-NUMBER");
        $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
        $BINDINGS = makeKeyword("BINDINGS");
        $RETURN = makeKeyword("RETURN");
        $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
        $HL = makeKeyword("HL");
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");
        $int$_100 = makeInteger(-100);
        $ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $sym17$SECOND = makeSymbol("SECOND");
        $str18$Assume_it_isn_t_abnormal = makeString("Assume it isn't abnormal");
        $str19$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all node-variables for ~S");
        $INFERENCE_REJECTED = makeKeyword("INFERENCE-REJECTED");
        $str21$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all bindings for ~S");
        $str22$_S_are_exceptions_to__S = makeString("~S are exceptions to ~S");
    }
}
/*
 *
 * Total time: 43 ms
 *
 */