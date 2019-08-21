/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_results;
import com.cyc.cycjava.cycl.clause_utilities;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ABNORMAL
 * source file: /cyc/top/cycl/inference/harness/abnormal.lisp
 * created:     2019/07/03 17:37:48
 */
public final class abnormal extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new abnormal();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.abnormal";


    // defvar
    // Definitions
    // When non-nil, #$abnormal reasoning is performed to defeat proofs.
    /**
     * When non-nil, #$abnormal reasoning is performed to defeat proofs.
     */
    @LispMethod(comment = "When non-nil, #$abnormal reasoning is performed to defeat proofs.\ndefvar")
    public static final SubLSymbol $abnormality_checking_enabled$ = makeSymbol("*ABNORMALITY-CHECKING-ENABLED*");

    // defparameter
    // When non-nil, support #$except abnormality checking.
    /**
     * When non-nil, support #$except abnormality checking.
     */
    @LispMethod(comment = "When non-nil, support #$except abnormality checking.\ndefparameter")
    private static final SubLSymbol $abnormality_except_support_enabled$ = makeSymbol("*ABNORMALITY-EXCEPT-SUPPORT-ENABLED*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $abnormality_transformation_depth$ = makeSymbol("*ABNORMALITY-TRANSFORMATION-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $browse_abnormal_inferencesP$ = makeSymbol("*BROWSE-ABNORMAL-INFERENCES?*");



    private static final SubLSymbol VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");

    private static final SubLInteger $int$_100 = makeInteger(-100);

    private static final SubLSymbol $kw16$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    private static final SubLString $str18$Assume_it_isn_t_abnormal = makeString("Assume it isn't abnormal");

    private static final SubLString $str19$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all node-variables for ~S");

    private static final SubLString $str21$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all bindings for ~S");

    private static final SubLString $str22$_S_are_exceptions_to__S = makeString("~S are exceptions to ~S");

    public static final SubLObject abnormality_except_support_enabledP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $abnormality_except_support_enabled$.getDynamicValue(thread);
        }
    }

    public static SubLObject abnormality_except_support_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $abnormality_except_support_enabled$.getDynamicValue(thread);
    }

    /**
     * Return T iff RULE is a rule that has some exceptions somewhere.
     */
    @LispMethod(comment = "Return T iff RULE is a rule that has some exceptions somewhere.")
    public static final SubLObject rule_has_exceptionsP_alt(SubLObject rule) {
        return makeBoolean(((NIL != assertions_high.rule_assertionP(rule)) && (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule))) && ((kb_indexing.num_gaf_arg_index(rule, TWO_INTEGER, $$abnormal, UNPROVIDED).isPositive() || kb_indexing.num_exception_rule_index(rule, UNPROVIDED, UNPROVIDED).isPositive()) || (NIL != (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_except_support_enabledP() ? ((SubLObject) (assertion_utilities.excepted_assertionP(rule))) : NIL))));
    }

    /**
     * Return T iff RULE is a rule that has some exceptions somewhere.
     */
    @LispMethod(comment = "Return T iff RULE is a rule that has some exceptions somewhere.")
    public static SubLObject rule_has_exceptionsP(final SubLObject rule) {
        return makeBoolean(((NIL != assertions_high.rule_assertionP(rule)) && (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule))) && ((kb_indexing.num_gaf_arg_index(rule, TWO_INTEGER, $$abnormal, UNPROVIDED).isPositive() || kb_indexing.num_exception_rule_index(rule, UNPROVIDED, UNPROVIDED).isPositive()) || (NIL != (NIL != abnormality_except_support_enabledP() ? assertion_utilities.excepted_assertionP(rule, UNPROVIDED, UNPROVIDED) : NIL))));
    }

    /**
     * Return non-nil iff RULE-BINDINGS can be proven to be abnormal wrt RULE in
     * in problem-store STORE under the assumptions of TRANSFORMATION-MT.
     */
    @LispMethod(comment = "Return non-nil iff RULE-BINDINGS can be proven to be abnormal wrt RULE in\r\nin problem-store STORE under the assumptions of TRANSFORMATION-MT.\nReturn non-nil iff RULE-BINDINGS can be proven to be abnormal wrt RULE in\nin problem-store STORE under the assumptions of TRANSFORMATION-MT.")
    public static final SubLObject rule_bindings_abnormalP_alt(SubLObject store, SubLObject rule, SubLObject rule_bindings, SubLObject transformation_mt) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.rule_has_exceptionsP(rule)) {
            {
                SubLObject bound_values_to_check = Mapping.mapcar(VARIABLE_BINDING_VALUE, inference_worker.canonicalize_proof_bindings(rule_bindings));
                return com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_check_internal(bound_values_to_check, rule, transformation_mt, store);
            }
        }
        return NIL;
    }

    /**
     * Return non-nil iff RULE-BINDINGS can be proven to be abnormal wrt RULE in
     * in problem-store STORE under the assumptions of TRANSFORMATION-MT.
     */
    @LispMethod(comment = "Return non-nil iff RULE-BINDINGS can be proven to be abnormal wrt RULE in\r\nin problem-store STORE under the assumptions of TRANSFORMATION-MT.\nReturn non-nil iff RULE-BINDINGS can be proven to be abnormal wrt RULE in\nin problem-store STORE under the assumptions of TRANSFORMATION-MT.")
    public static SubLObject rule_bindings_abnormalP(final SubLObject store, final SubLObject rule, final SubLObject rule_bindings, final SubLObject transformation_mt) {
        if (NIL != rule_has_exceptionsP(rule)) {
            final SubLObject bound_values_to_check = Mapping.mapcar(VARIABLE_BINDING_VALUE, inference_worker.canonicalize_proof_bindings(rule_bindings));
            return abnormality_check_internal(bound_values_to_check, rule, transformation_mt, store);
        }
        return NIL;
    }

    public static final SubLObject abnormality_check_internal_alt(SubLObject bound_values_to_check, SubLObject rule, SubLObject transformation_mt, SubLObject store) {
        {
            SubLObject sentence = com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_check_sentence(bound_values_to_check, rule);
            SubLObject query_dnf = clause_utilities.make_gaf_dnf(sentence);
            SubLObject query_properties = com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_check_query_properties(store);
            SubLObject bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, NIL, query_properties);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_query_used_illegal_proofP(bindings_and_supports, rule)) {
                query_properties = remf(query_properties, $PROBLEM_STORE);
                bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, NIL, query_properties);
            }
            return list_utilities.sublisp_boolean(bindings_and_supports);
        }
    }

    public static SubLObject abnormality_check_internal(final SubLObject bound_values_to_check, final SubLObject rule, final SubLObject transformation_mt, final SubLObject store) {
        final SubLObject sentence = abnormality_check_sentence(bound_values_to_check, rule);
        final SubLObject query_dnf = clause_utilities.make_gaf_dnf(sentence);
        SubLObject query_properties = abnormality_check_query_properties(store);
        SubLObject bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, NIL, query_properties);
        if (NIL != abnormality_query_used_illegal_proofP(bindings_and_supports, rule)) {
            query_properties = remf(query_properties, $PROBLEM_STORE);
            bindings_and_supports = inference_kernel.new_cyc_query_from_dnf(query_dnf, transformation_mt, NIL, query_properties);
        }
        final SubLObject justification = second(bindings_and_supports.first());
        if (NIL != justification) {
            return justification;
        }
        if (NIL != list_utilities.sublisp_boolean(bindings_and_supports)) {
            return $ABNORMAL;
        }
        return NIL;
    }

    public static final SubLObject abnormality_check_sentence_alt(SubLObject bound_values_to_check, SubLObject rule) {
        return make_binary_formula($$abnormal, make_formula($$TheList, bound_values_to_check, UNPROVIDED), rule);
    }

    public static SubLObject abnormality_check_sentence(final SubLObject bound_values_to_check, final SubLObject rule) {
        return make_binary_formula($$abnormal, make_formula($$TheList, bound_values_to_check, UNPROVIDED), rule);
    }

    public static final SubLObject abnormality_check_query_properties_alt(SubLObject store) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list(new SubLObject[]{ $PROBLEM_STORE, store, $MAX_NUMBER, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, $abnormality_transformation_depth$.getDynamicValue(thread), $RESULT_UNIQUENESS, $BINDINGS, $RETURN, $BINDINGS_AND_SUPPORTS, $ANSWER_LANGUAGE, $HL, $kw12$ALLOW_ABNORMALITY_CHECKING_, NIL });
        }
    }

    public static SubLObject abnormality_check_query_properties(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(new SubLObject[]{ $PROBLEM_STORE, store, $MAX_NUMBER, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, $abnormality_transformation_depth$.getDynamicValue(thread), $RESULT_UNIQUENESS, $BINDINGS, $RETURN, $BINDINGS_AND_SUPPORTS, $ANSWER_LANGUAGE, $HL, $BROWSABLE_, $browse_abnormal_inferencesP$.getDynamicValue(thread), $MIN_RULE_UTILITY, $int$_100, $kw16$ALLOW_ABNORMALITY_CHECKING_, NIL });
    }

    public static final SubLObject abnormality_query_used_illegal_proofP_alt(SubLObject bindings_and_supports, SubLObject rule) {
        {
            SubLObject justifications = Mapping.mapcar(SECOND, bindings_and_supports);
            SubLObject cdolist_list_var = justifications;
            SubLObject justification = NIL;
            for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_justification_used_illegal_proofP(justification, rule)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject abnormality_query_used_illegal_proofP(final SubLObject bindings_and_supports, final SubLObject rule) {
        SubLObject cdolist_list_var;
        final SubLObject justifications = cdolist_list_var = Mapping.mapcar(SECOND, bindings_and_supports);
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

    /**
     * A justification for an #$abnormal query may not use the rule which is being checked for abnormality.
     * This could happen due to problem (store) reuse.
     */
    @LispMethod(comment = "A justification for an #$abnormal query may not use the rule which is being checked for abnormality.\r\nThis could happen due to problem (store) reuse.\nA justification for an #$abnormal query may not use the rule which is being checked for abnormality.\nThis could happen due to problem (store) reuse.")
    public static final SubLObject abnormality_justification_used_illegal_proofP_alt(SubLObject justification, SubLObject rule) {
        return subl_promotions.memberP(rule, justification, UNPROVIDED, UNPROVIDED);
    }

    /**
     * A justification for an #$abnormal query may not use the rule which is being checked for abnormality.
     * This could happen due to problem (store) reuse.
     */
    @LispMethod(comment = "A justification for an #$abnormal query may not use the rule which is being checked for abnormality.\r\nThis could happen due to problem (store) reuse.\nA justification for an #$abnormal query may not use the rule which is being checked for abnormality.\nThis could happen due to problem (store) reuse.")
    public static SubLObject abnormality_justification_used_illegal_proofP(final SubLObject justification, final SubLObject rule) {
        return subl_promotions.memberP(rule, justification, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Reject backward inference if the given bindings are abnormal wrt RULE.
     *
     * @param SOURCE-BINDINGS
     * 		the bindings that were used at this step with RULE.
     * @param NODE-BINDINGS
     * 		the bindings established from all child branches
     * 		of the proof tree that bubble up to this node.
     */
    @LispMethod(comment = "Reject backward inference if the given bindings are abnormal wrt RULE.\r\n\r\n@param SOURCE-BINDINGS\r\n\t\tthe bindings that were used at this step with RULE.\r\n@param NODE-BINDINGS\r\n\t\tthe bindings established from all child branches\r\n\t\tof the proof tree that bubble up to this node.")
    public static final SubLObject backward_abnormality_check_alt(SubLObject rule, SubLObject source_bindings, SubLObject node_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $abnormality_checking_enabled$.getDynamicValue(thread)) {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.rule_has_exceptionsP(rule)) {
                    {
                        SubLObject rule_variables = NIL;
                        SubLObject node_variables = NIL;
                        SubLObject bound_values_to_check = NIL;
                        rule_variables = assertions_high.assertion_free_hl_variables(rule);
                        node_variables = nsublis(source_bindings, rule_variables, UNPROVIDED, UNPROVIDED);
                        bound_values_to_check = nsublis(node_bindings, node_variables, UNPROVIDED, UNPROVIDED);
                        if (NIL == variables.fully_bound_p(bound_values_to_check)) {
                            Errors.cerror($str_alt14$Assume_it_isn_t_abnormal, $str_alt15$Abnormality_checker_doesn_t_have_, rule);
                            return NIL;
                        }
                        {
                            SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                            try {
                                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_check_internal(bound_values_to_check, rule, mt_relevance_macros.$mt$.getDynamicValue(thread), NIL)) {
                                    com.cyc.cycjava.cycl.inference.harness.abnormal.signal_abnormal(bound_values_to_check, rule);
                                }
                            } finally {
                                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Reject backward inference if the given bindings are abnormal wrt RULE.
     *
     * @param SOURCE-BINDINGS
     * 		the bindings that were used at this step with RULE.
     * @param NODE-BINDINGS
     * 		the bindings established from all child branches
     * 		of the proof tree that bubble up to this node.
     */
    @LispMethod(comment = "Reject backward inference if the given bindings are abnormal wrt RULE.\r\n\r\n@param SOURCE-BINDINGS\r\n\t\tthe bindings that were used at this step with RULE.\r\n@param NODE-BINDINGS\r\n\t\tthe bindings established from all child branches\r\n\t\tof the proof tree that bubble up to this node.")
    public static SubLObject backward_abnormality_check(final SubLObject rule, final SubLObject source_bindings, final SubLObject node_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $abnormality_checking_enabled$.getDynamicValue(thread)) && (NIL != rule_has_exceptionsP(rule))) {
            SubLObject rule_variables = NIL;
            SubLObject node_variables = NIL;
            SubLObject bound_values_to_check = NIL;
            rule_variables = assertions_high.assertion_free_hl_variables(rule);
            node_variables = nsublis(source_bindings, rule_variables, UNPROVIDED, UNPROVIDED);
            bound_values_to_check = nsublis(node_bindings, node_variables, UNPROVIDED, UNPROVIDED);
            if (NIL == variables.fully_bound_p(bound_values_to_check)) {
                Errors.cerror($str18$Assume_it_isn_t_abnormal, $str19$Abnormality_checker_doesn_t_have_, rule);
                return NIL;
            }
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
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

    /**
     *
     *
     * @return booleanp; Like @xref forward-abnormality-check except doesn't throw anything,
    just returns a nice, simple boolean.
     */
    @LispMethod(comment = "@return booleanp; Like @xref forward-abnormality-check except doesn\'t throw anything,\r\njust returns a nice, simple boolean.")
    public static final SubLObject forward_bindings_abnormalP_alt(SubLObject propagation_mt, SubLObject rule, SubLObject trigger_bindings, SubLObject inference_bindings) {
        {
            SubLObject abnormalP = NIL;
            try {
                com.cyc.cycjava.cycl.inference.harness.abnormal.forward_abnormality_check(propagation_mt, rule, trigger_bindings, inference_bindings);
            } catch (Throwable ccatch_env_var) {
                abnormalP = Errors.handleThrowable(ccatch_env_var, $INFERENCE_REJECTED);
            }
            return abnormalP;
        }
    }

    /**
     *
     *
     * @return booleanp; Like @xref forward-abnormality-check except doesn't throw anything,
    just returns a nice, simple boolean.
     */
    @LispMethod(comment = "@return booleanp; Like @xref forward-abnormality-check except doesn\'t throw anything,\r\njust returns a nice, simple boolean.")
    public static SubLObject forward_bindings_abnormalP(final SubLObject propagation_mt, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abnormalP = NIL;
        try {
            thread.throwStack.push($INFERENCE_REJECTED);
            forward_abnormality_check(propagation_mt, rule, trigger_bindings, inference_bindings);
        } catch (final Throwable ccatch_env_var) {
            abnormalP = Errors.handleThrowable(ccatch_env_var, $INFERENCE_REJECTED);
        } finally {
            thread.throwStack.pop();
        }
        return abnormalP;
    }

    /**
     * Reject forward inference if the given bindings are abnormal wrt RULE.
     */
    @LispMethod(comment = "Reject forward inference if the given bindings are abnormal wrt RULE.")
    public static final SubLObject forward_abnormality_check_alt(SubLObject propagation_mt, SubLObject rule, SubLObject trigger_bindings, SubLObject inference_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $abnormality_checking_enabled$.getDynamicValue(thread)) {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.rule_has_exceptionsP(rule)) {
                    {
                        SubLObject rule_variables = NIL;
                        SubLObject bound_values_to_check = NIL;
                        rule_variables = assertions_high.assertion_free_hl_variables(rule);
                        bound_values_to_check = rule_variables;
                        bound_values_to_check = nsublis(trigger_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
                        bound_values_to_check = nsublis(inference_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
                        if (NIL == variables.fully_bound_p(bound_values_to_check)) {
                            Errors.cerror($str_alt14$Assume_it_isn_t_abnormal, $str_alt17$Abnormality_checker_doesn_t_have_, rule);
                            return NIL;
                        }
                        {
                            SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                            try {
                                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.abnormal.abnormality_check_internal(bound_values_to_check, rule, propagation_mt, NIL)) {
                                    com.cyc.cycjava.cycl.inference.harness.abnormal.signal_abnormal(bound_values_to_check, rule);
                                }
                            } finally {
                                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Reject forward inference if the given bindings are abnormal wrt RULE.
     */
    @LispMethod(comment = "Reject forward inference if the given bindings are abnormal wrt RULE.")
    public static SubLObject forward_abnormality_check(final SubLObject propagation_mt, final SubLObject rule, final SubLObject trigger_bindings, final SubLObject inference_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $abnormality_checking_enabled$.getDynamicValue(thread)) && (NIL != rule_has_exceptionsP(rule))) {
            SubLObject rule_variables = NIL;
            SubLObject bound_values_to_check = NIL;
            rule_variables = bound_values_to_check = assertions_high.assertion_free_hl_variables(rule);
            bound_values_to_check = nsublis(trigger_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
            bound_values_to_check = nsublis(inference_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
            if (NIL == variables.fully_bound_p(bound_values_to_check)) {
                Errors.cerror($str18$Assume_it_isn_t_abnormal, $str21$Abnormality_checker_doesn_t_have_, rule);
                return NIL;
            }
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
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

    public static final SubLObject signal_abnormal_alt(SubLObject v_bindings, SubLObject rule) {
        return backward_results.reject_inference(list($ABNORMAL, $str_alt19$_S_are_exceptions_to__S, v_bindings, rule));
    }

    public static SubLObject signal_abnormal(final SubLObject v_bindings, final SubLObject rule) {
        return backward_results.reject_inference(list($ABNORMAL, $str22$_S_are_exceptions_to__S, v_bindings, rule));
    }

    public static SubLObject declare_abnormal_file() {
        declareFunction("abnormality_except_support_enabledP", "ABNORMALITY-EXCEPT-SUPPORT-ENABLED?", 0, 0, false);
        declareFunction("rule_has_exceptionsP", "RULE-HAS-EXCEPTIONS?", 1, 0, false);
        declareFunction("rule_bindings_abnormalP", "RULE-BINDINGS-ABNORMAL?", 4, 0, false);
        declareFunction("abnormality_check_internal", "ABNORMALITY-CHECK-INTERNAL", 4, 0, false);
        declareFunction("abnormality_check_sentence", "ABNORMALITY-CHECK-SENTENCE", 2, 0, false);
        declareFunction("abnormality_check_query_properties", "ABNORMALITY-CHECK-QUERY-PROPERTIES", 1, 0, false);
        declareFunction("abnormality_query_used_illegal_proofP", "ABNORMALITY-QUERY-USED-ILLEGAL-PROOF?", 2, 0, false);
        declareFunction("abnormality_justification_used_illegal_proofP", "ABNORMALITY-JUSTIFICATION-USED-ILLEGAL-PROOF?", 2, 0, false);
        declareFunction("backward_abnormality_check", "BACKWARD-ABNORMALITY-CHECK", 3, 0, false);
        declareFunction("forward_bindings_abnormalP", "FORWARD-BINDINGS-ABNORMAL?", 4, 0, false);
        declareFunction("forward_abnormality_check", "FORWARD-ABNORMALITY-CHECK", 4, 0, false);
        declareFunction("signal_abnormal", "SIGNAL-ABNORMAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_abnormal_file() {
        defvar("*ABNORMALITY-CHECKING-ENABLED*", T);
        defparameter("*ABNORMALITY-EXCEPT-SUPPORT-ENABLED*", T);
        defvar("*ABNORMALITY-TRANSFORMATION-DEPTH*", ONE_INTEGER);
        defparameter("*BROWSE-ABNORMAL-INFERENCES?*", NIL);
        return NIL;
    }

    public static final SubLSymbol $kw12$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    static private final SubLString $str_alt14$Assume_it_isn_t_abnormal = makeString("Assume it isn't abnormal");

    static private final SubLString $str_alt15$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all node-variables for ~S");

    public static SubLObject setup_abnormal_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_abnormal_file();
    }

    static private final SubLString $str_alt17$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all bindings for ~S");

    @Override
    public void initializeVariables() {
        init_abnormal_file();
    }

    static private final SubLString $str_alt19$_S_are_exceptions_to__S = makeString("~S are exceptions to ~S");

    @Override
    public void runTopLevelForms() {
        setup_abnormal_file();
    }

    static {
    }
}

/**
 * Total time: 43 ms
 */
