/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cycl_utilities.$opaque_arg_function$;
import static com.cyc.cycjava.cycl.cycl_utilities.atomic_sentence_predicate;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_find_if;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_ntransform;
import static com.cyc.cycjava.cycl.cycl_utilities.expression_transform;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_arg0;
import static com.cyc.cycjava.cycl.cycl_utilities.formula_find_if;
import static com.cyc.cycjava.cycl.cycl_utilities.sentence_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.sentence_arg2;
import static com.cyc.cycjava.cycl.cycl_utilities.sentence_args;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.el_utilities.el_bounded_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implicit_meta_literal_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.evaluatable_el_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.existential_bound;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_bounded_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_regularly_quantified_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.nadd_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.quantified_sub_sentence;
import static com.cyc.cycjava.cycl.el_utilities.quantified_var;
import static com.cyc.cycjava.cycl.el_utilities.sentence_quantifier;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.strip_sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.subl_escape_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class precanonicalizer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new precanonicalizer();

 public static final String myName = "com.cyc.cycjava.cycl.precanonicalizer";


    private static final SubLSymbol UNICODE_STRING_P = makeSymbol("UNICODE-STRING-P");

    private static final SubLSymbol UNICODE_STRING_TO_CYCL_SAFE_STRING = makeSymbol("UNICODE-STRING-TO-CYCL-SAFE-STRING");

    private static final SubLSymbol $sym2$IMMEDIATELY_EVALUATABLE_EXPRESSION_ = makeSymbol("IMMEDIATELY-EVALUATABLE-EXPRESSION?");

    private static final SubLSymbol $sym3$EXPANDIBLE_EL_RELATION_EXPRESSION_ = makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?");

    private static final SubLSymbol $sym4$EL_EVALUATABLE_EXPRESSION_ = makeSymbol("EL-EVALUATABLE-EXPRESSION?");

    private static final SubLSymbol EL_IMPLICIT_META_LITERAL_SENTENCE_P = makeSymbol("EL-IMPLICIT-META-LITERAL-SENTENCE-P");

    private static final SubLSymbol PRECANONICALIZATIONS_INT = makeSymbol("PRECANONICALIZATIONS-INT");

    private static final SubLSymbol $RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");

    private static final SubLSymbol $EL_UNEVALUATABLE_EXPRESSION = makeKeyword("EL-UNEVALUATABLE-EXPRESSION");

    private static final SubLSymbol $sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_OR_QUOTE_ = makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE-OR-QUOTE?");

    private static final SubLSymbol TRANSFORM_EVALUATION_EXPRESSION_OR_THROW = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION-OR-THROW");



    static private final SubLSymbol $sym14$EL_UNEVALUATABLE_EXPRESSION_ = makeSymbol("EL-UNEVALUATABLE-EXPRESSION?");

    private static final SubLSymbol TRANSFORM_EVALUATION_EXPRESSION = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");





    static private final SubLSymbol $sym19$IMMEDIATELY_UNEVALUATABLE_EXPRESSION_ = makeSymbol("IMMEDIATELY-UNEVALUATABLE-EXPRESSION?");

    private static final SubLSymbol IMPLICIT_META_LITERALS_OUT_INT = makeSymbol("IMPLICIT-META-LITERALS-OUT-INT");

    static private final SubLString $str21$_s_is_not_a_well_formed_sentence = makeString("~s is not a well-formed sentence");















    static private final SubLString $str29$no_assertion_for_meta_arg___s = makeString("no assertion for meta-arg: ~s");

    public static SubLObject early_precanonicalizationsP(final SubLObject sentence, final SubLObject mt) {
        return early_precanonicalization_unicode_string_applicableP(sentence, mt);
    }

    public static SubLObject early_precanonicalizations(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != early_precanonicalization_unicode_string_applicableP(sentence, mt)) {
            thread.resetMultipleValues();
            final SubLObject sentence_$1 = early_precanonicalization_unicode_string_apply(sentence, mt);
            final SubLObject mt_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$1;
            mt = mt_$2;
        }
        return values(sentence, mt);
    }

    public static SubLObject early_precanonicalization_unicode_string_applicableP(final SubLObject sentence, final SubLObject mt) {
        return makeBoolean((NIL != cycl_utilities.expression_find_if(UNICODE_STRING_P, sentence, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if(UNICODE_STRING_P, mt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject early_precanonicalization_unicode_string_apply(final SubLObject sentence, final SubLObject mt) {
        return values(cycl_utilities.expression_ntransform(sentence, UNICODE_STRING_P, UNICODE_STRING_TO_CYCL_SAFE_STRING, T, UNPROVIDED), cycl_utilities.expression_ntransform(mt, UNICODE_STRING_P, UNICODE_STRING_TO_CYCL_SAFE_STRING, T, UNPROVIDED));
    }

    // Definitions
    public static final SubLObject immediate_precanonicalizationsP_alt(SubLObject form) {
        return list_utilities.tree_find_if($sym0$IMMEDIATELY_EVALUATABLE_EXPRESSION_, form, UNPROVIDED);
    }

    // Definitions
    public static SubLObject immediate_precanonicalizationsP(final SubLObject form) {
        return list_utilities.tree_find_if($sym2$IMMEDIATELY_EVALUATABLE_EXPRESSION_, form, UNPROVIDED);
    }

    public static final SubLObject immediate_precanonicalizations_alt(SubLObject form) {
        if (NIL != com.cyc.cycjava.cycl.precanonicalizer.immediate_precanonicalizationsP(form)) {
            return com.cyc.cycjava.cycl.precanonicalizer.immediately_evaluatable_expressions_out(form);
        } else {
            return form;
        }
    }

    public static SubLObject immediate_precanonicalizations(final SubLObject form) {
        if (NIL != immediate_precanonicalizationsP(form)) {
            return immediately_evaluatable_expressions_out(form);
        }
        return form;
    }

    /**
     *
     *
     * @param FORMULA-IS-AN-ASENT-WITH-NO-SUBFORMULAS?;
     * 		when called by @xref canon-fast-gaf?,
     * 		we can assume that FORMULA is an atomic sentence with no subformulas, so some of these tests
     * 		can be sped up or bypassed entirely.
     */
    @LispMethod(comment = "@param FORMULA-IS-AN-ASENT-WITH-NO-SUBFORMULAS?;\r\n\t\twhen called by @xref canon-fast-gaf?,\r\n\t\twe can assume that FORMULA is an atomic sentence with no subformulas, so some of these tests\r\n\t\tcan be sped up or bypassed entirely.")
    public static final SubLObject precanonicalizationsP_alt(SubLObject formula, SubLObject mt, SubLObject formula_is_an_asent_with_no_subformulasP) {
        if (formula_is_an_asent_with_no_subformulasP == UNPROVIDED) {
            formula_is_an_asent_with_no_subformulasP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == hlmt.hlmt_p(mt)) {
                return NIL;
            }
            {
                SubLObject resultP = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != el_formula_p(formula)) {
                            if (NIL != (NIL != formula_is_an_asent_with_no_subformulasP ? ((SubLObject) (verbosifier.expandible_el_relation_expressionP(formula, UNPROVIDED))) : formula_find_if(symbol_function($sym1$EXPANDIBLE_EL_RELATION_EXPRESSION_), formula, NIL, UNPROVIDED))) {
                                resultP = T;
                            } else {
                                if ((NIL == formula_is_an_asent_with_no_subformulasP) && (NIL != formula_find_if(symbol_function($sym2$EL_EVALUATABLE_EXPRESSION_), formula, NIL, UNPROVIDED))) {
                                    resultP = T;
                                } else {
                                    if (NIL != (NIL != formula_is_an_asent_with_no_subformulasP ? ((SubLObject) (el_implicit_meta_literal_sentence_p(formula))) : formula_find_if(symbol_function(EL_IMPLICIT_META_LITERAL_SENTENCE_P), formula, NIL, UNPROVIDED))) {
                                        resultP = T;
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return resultP;
            }
        }
    }

    /**
     *
     *
     * @param FORMULA-IS-AN-ASENT-WITH-NO-SUBFORMULAS?;
     * 		when called by @xref canon-fast-gaf?,
     * 		we can assume that FORMULA is an atomic sentence with no subformulas, so some of these tests
     * 		can be sped up or bypassed entirely.
     */
    @LispMethod(comment = "@param FORMULA-IS-AN-ASENT-WITH-NO-SUBFORMULAS?;\r\n\t\twhen called by @xref canon-fast-gaf?,\r\n\t\twe can assume that FORMULA is an atomic sentence with no subformulas, so some of these tests\r\n\t\tcan be sped up or bypassed entirely.")
    public static SubLObject precanonicalizationsP(final SubLObject formula, final SubLObject mt, SubLObject formula_is_an_asent_with_no_subformulasP) {
        if (formula_is_an_asent_with_no_subformulasP == UNPROVIDED) {
            formula_is_an_asent_with_no_subformulasP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == hlmt.hlmt_p(mt)) {
            return NIL;
        }
        SubLObject resultP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != el_formula_p(formula)) {
                if (NIL != (NIL != formula_is_an_asent_with_no_subformulasP ? verbosifier.expandible_el_relation_expressionP(formula, UNPROVIDED) : cycl_utilities.formula_find_if(symbol_function($sym3$EXPANDIBLE_EL_RELATION_EXPRESSION_), formula, NIL, UNPROVIDED))) {
                    resultP = T;
                } else
                    if ((NIL == formula_is_an_asent_with_no_subformulasP) && (NIL != cycl_utilities.formula_find_if(symbol_function($sym4$EL_EVALUATABLE_EXPRESSION_), formula, NIL, UNPROVIDED))) {
                        resultP = T;
                    } else
                        if (NIL != (NIL != formula_is_an_asent_with_no_subformulasP ? el_implicit_meta_literal_sentence_p(formula) : cycl_utilities.formula_find_if(symbol_function(EL_IMPLICIT_META_LITERAL_SENTENCE_P), formula, NIL, UNPROVIDED))) {
                            resultP = T;
                        }


            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }

    /**
     * A non-destructive version of @xref precanonicalizations.
     */
    @LispMethod(comment = "A non-destructive version of @xref precanonicalizations.")
    public static final SubLObject safe_precanonicalizations_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = formula;
                SubLObject result_mt = mt;
                if (NIL != com.cyc.cycjava.cycl.precanonicalizer.precanonicalizationsP(formula, mt, UNPROVIDED)) {
                    {
                        SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                        SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                        try {
                            czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread))) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
                            czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$standardize_variables_memory$.getDynamicValue(thread))) : NIL, thread);
                            {
                                SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
                                {
                                    SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
                                    try {
                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                        {
                                            SubLObject original_memoization_process = NIL;
                                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                {
                                                    SubLObject current_proc = current_process();
                                                    if (NIL == original_memoization_process) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                    } else {
                                                        if (original_memoization_process != current_proc) {
                                                            Errors.error($str_alt5$Invalid_attempt_to_reuse_memoizat);
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject result_2 = com.cyc.cycjava.cycl.precanonicalizer.precanonicalizations_int(formula, mt);
                                                    SubLObject result_mt_3 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    result = result_2;
                                                    result_mt = result_mt_3;
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        } finally {
                            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(result, result_mt);
            }
        }
    }

    /**
     * A non-destructive version of @xref precanonicalizations.
     */
    @LispMethod(comment = "A non-destructive version of @xref precanonicalizations.")
    public static SubLObject safe_precanonicalizations(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = formula;
        SubLObject result_mt = mt;
        if (NIL != precanonicalizationsP(formula, mt, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
            try {
                czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
                czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : NIL, thread);
                final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$3 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject result_$4 = precanonicalizations_int(formula, mt);
                        final SubLObject result_mt_$5 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$4;
                        result_mt = result_mt_$5;
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
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
                czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
            }
        }
        return values(result, result_mt);
    }

    /**
     * Performs some simplifications on FORMULA to prepare it for canonicalization.
     * It recursively transforms EL relations, evaluates evaluatable expressions,
     * and then it removes exceptions and pragmatic requirements.
     * This is a destructive operation.
     * Assumes the EL var namespace is bound.
     */
    @LispMethod(comment = "Performs some simplifications on FORMULA to prepare it for canonicalization.\r\nIt recursively transforms EL relations, evaluates evaluatable expressions,\r\nand then it removes exceptions and pragmatic requirements.\r\nThis is a destructive operation.\r\nAssumes the EL var namespace is bound.\nPerforms some simplifications on FORMULA to prepare it for canonicalization.\nIt recursively transforms EL relations, evaluates evaluatable expressions,\nand then it removes exceptions and pragmatic requirements.\nThis is a destructive operation.\nAssumes the EL var namespace is bound.")
    public static final SubLObject precanonicalizations_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_formula = formula;
                SubLObject new_mt = mt;
                if (NIL != com.cyc.cycjava.cycl.precanonicalizer.precanonicalizationsP(formula, mt, UNPROVIDED)) {
                    {
                        SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    SubLObject original_memoization_process = NIL;
                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                        {
                                            SubLObject current_proc = current_process();
                                            if (NIL == original_memoization_process) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                            } else {
                                                if (original_memoization_process != current_proc) {
                                                    Errors.error($str_alt5$Invalid_attempt_to_reuse_memoizat);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject new_formula_5 = com.cyc.cycjava.cycl.precanonicalizer.precanonicalizations_int(formula, mt);
                                            SubLObject new_mt_6 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            new_formula = new_formula_5;
                                            new_mt = new_mt_6;
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return values(new_formula, new_mt);
            }
        }
    }

    /**
     * Performs some simplifications on FORMULA to prepare it for canonicalization.
     * It recursively transforms EL relations, evaluates evaluatable expressions,
     * and then it removes exceptions and pragmatic requirements.
     * This is a destructive operation.
     * Assumes the EL var namespace is bound.
     */
    @LispMethod(comment = "Performs some simplifications on FORMULA to prepare it for canonicalization.\r\nIt recursively transforms EL relations, evaluates evaluatable expressions,\r\nand then it removes exceptions and pragmatic requirements.\r\nThis is a destructive operation.\r\nAssumes the EL var namespace is bound.\nPerforms some simplifications on FORMULA to prepare it for canonicalization.\nIt recursively transforms EL relations, evaluates evaluatable expressions,\nand then it removes exceptions and pragmatic requirements.\nThis is a destructive operation.\nAssumes the EL var namespace is bound.")
    public static SubLObject precanonicalizations(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_formula = formula;
        SubLObject new_mt = mt;
        if (NIL != precanonicalizationsP(formula, mt, UNPROVIDED)) {
            final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject new_formula_$7 = precanonicalizations_int(formula, mt);
                    final SubLObject new_mt_$8 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_formula = new_formula_$7;
                    new_mt = new_mt_$8;
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
        }
        return values(new_formula, new_mt);
    }

    /**
     * Performs some simplifications on FORMULA to prepare it for canonicalization.
     * It recursively transforms EL relations, evaluates evaluatable expressions,
     * and then it removes exceptions and pragmatic requirements.
     * This is a destructive operation.
     * Assumes the EL var namespace is bound.
     */
    @LispMethod(comment = "Performs some simplifications on FORMULA to prepare it for canonicalization.\r\nIt recursively transforms EL relations, evaluates evaluatable expressions,\r\nand then it removes exceptions and pragmatic requirements.\r\nThis is a destructive operation.\r\nAssumes the EL var namespace is bound.\nPerforms some simplifications on FORMULA to prepare it for canonicalization.\nIt recursively transforms EL relations, evaluates evaluatable expressions,\nand then it removes exceptions and pragmatic requirements.\nThis is a destructive operation.\nAssumes the EL var namespace is bound.")
    public static final SubLObject precanonicalizations_int_internal_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            formula = copy_formula(formula);
            mt = hlmt.copy_hlmt(mt);
            formula = simplifier.simplify_sequence_variables_1(formula);
            if (NIL != czer_vars.$expand_el_relationsP$.getDynamicValue(thread)) {
                {
                    SubLObject error = NIL;
                    try {
                        try {
                            thread.resetMultipleValues();
                            {
                                SubLObject formula_8 = verbosifier.el_relations_out(formula, mt, UNPROVIDED, UNPROVIDED);
                                SubLObject mt_9 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                formula = formula_8;
                                mt = mt_9;
                            }
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $INVALID_EXPANSION);
                        }
                    } catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $RECURSION_LIMIT_EXCEEDED);
                    }
                    if (NIL != error) {
                        if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                            wff.note_wff_violation(error);
                        }
                        return values(NIL, mt);
                    }
                }
                formula = com.cyc.cycjava.cycl.precanonicalizer.el_evaluatable_expressions_out(formula);
                mt = com.cyc.cycjava.cycl.precanonicalizer.el_evaluatable_expressions_out(mt);
            }
            if ((NIL != formula) && (NIL != mt)) {
                formula = com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out(formula);
                {
                    SubLObject _prev_bind_0 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
                    try {
                        czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
                        formula = simplifier.simplify_cycl_sentence(formula, UNPROVIDED);
                    } finally {
                        czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return values(formula, mt);
        }
    }

    /**
     * Performs some simplifications on FORMULA to prepare it for canonicalization.
     * It recursively transforms EL relations, evaluates evaluatable expressions,
     * and then it removes exceptions and pragmatic requirements.
     * This is a destructive operation.
     * Assumes the EL var namespace is bound.
     */
    @LispMethod(comment = "Performs some simplifications on FORMULA to prepare it for canonicalization.\r\nIt recursively transforms EL relations, evaluates evaluatable expressions,\r\nand then it removes exceptions and pragmatic requirements.\r\nThis is a destructive operation.\r\nAssumes the EL var namespace is bound.\nPerforms some simplifications on FORMULA to prepare it for canonicalization.\nIt recursively transforms EL relations, evaluates evaluatable expressions,\nand then it removes exceptions and pragmatic requirements.\nThis is a destructive operation.\nAssumes the EL var namespace is bound.")
    public static SubLObject precanonicalizations_int_internal(SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        formula = copy_formula(formula);
        mt = hlmt.copy_hlmt(mt);
        formula = simplifier.simplify_sequence_variables_1(formula);
        if (NIL != czer_vars.$expand_el_relationsP$.getDynamicValue(thread)) {
            SubLObject error = NIL;
            try {
                thread.throwStack.push($RECURSION_LIMIT_EXCEEDED);
                try {
                    thread.throwStack.push($INVALID_EXPANSION);
                    thread.resetMultipleValues();
                    final SubLObject formula_$10 = verbosifier.el_relations_out(formula, mt, UNPROVIDED, UNPROVIDED);
                    final SubLObject mt_$11 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    formula = formula_$10;
                    mt = mt_$11;
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $INVALID_EXPANSION);
                } finally {
                    thread.throwStack.pop();
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $RECURSION_LIMIT_EXCEEDED);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error) {
                if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                    wff.note_wff_violation(error);
                }
                return values(NIL, mt);
            }
            formula = el_evaluatable_expressions_out(formula);
            mt = el_evaluatable_expressions_out(mt);
        }
        if ((NIL != formula) && (NIL != mt)) {
            formula = implicit_meta_literals_out(formula);
            final SubLObject _prev_bind_0 = czer_vars.$simplify_non_wff_literalP$.currentBinding(thread);
            try {
                czer_vars.$simplify_non_wff_literalP$.bind(NIL, thread);
                formula = simplifier.simplify_cycl_sentence(formula, UNPROVIDED);
            } finally {
                czer_vars.$simplify_non_wff_literalP$.rebind(_prev_bind_0, thread);
            }
        }
        return values(formula, mt);
    }

    public static final SubLObject precanonicalizations_int_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.precanonicalizer.precanonicalizations_int_internal(formula, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PRECANONICALIZATIONS_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PRECANONICALIZATIONS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PRECANONICALIZATIONS_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.precanonicalizer.precanonicalizations_int_internal(formula, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject precanonicalizations_int(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return precanonicalizations_int_internal(formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PRECANONICALIZATIONS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PRECANONICALIZATIONS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PRECANONICALIZATIONS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(precanonicalizations_int_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Performs transformations on FORMULA to remove evaluatable expressions.
     * Does not recursively expand evaluatable expressions.
     * This is a destructive operation.
     */
    @LispMethod(comment = "Performs transformations on FORMULA to remove evaluatable expressions.\r\nDoes not recursively expand evaluatable expressions.\r\nThis is a destructive operation.\nPerforms transformations on FORMULA to remove evaluatable expressions.\nDoes not recursively expand evaluatable expressions.\nThis is a destructive operation.")
    public static final SubLObject el_evaluatable_expressions_out_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error = NIL;
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $opaque_arg_function$.currentBinding(thread);
                        try {
                            $opaque_arg_function$.bind($sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_, thread);
                            result = expression_ntransform(formula, symbol_function($sym2$EL_EVALUATABLE_EXPRESSION_), symbol_function(TRANSFORM_EVALUATION_EXPRESSION_OR_THROW), UNPROVIDED, UNPROVIDED);
                        } finally {
                            $opaque_arg_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $EL_UNEVALUATABLE_EXPRESSION);
                }
                if (NIL != error) {
                    if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                        wff.note_wff_violation(error);
                    }
                    return NIL;
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Performs transformations on FORMULA to remove evaluatable expressions.\r\nDoes not recursively expand evaluatable expressions.\r\nThis is a destructive operation.\nPerforms transformations on FORMULA to remove evaluatable expressions.\nDoes not recursively expand evaluatable expressions.\nThis is a destructive operation.")
    public static SubLObject el_evaluatable_expressions_out(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($EL_UNEVALUATABLE_EXPRESSION);
            final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                cycl_utilities.$opaque_arg_function$.bind($sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_OR_QUOTE_, thread);
                result = cycl_utilities.expression_ntransform(formula, symbol_function($sym4$EL_EVALUATABLE_EXPRESSION_), symbol_function(TRANSFORM_EVALUATION_EXPRESSION_OR_THROW), UNPROVIDED, UNPROVIDED);
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $EL_UNEVALUATABLE_EXPRESSION);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                wff.note_wff_violation(error);
            }
            return NIL;
        }
        return result;
    }/**
     * Performs transformations on FORMULA to remove evaluatable expressions.
     * Does not recursively expand evaluatable expressions.
     * This is a destructive operation.
     */


    /**
     * Like @xref TRANSFORM-EVALUATION-EXPRESSION, but
     *
     * @throws :el-unevaluatable-expression
     * 		if evaluation fails.
     */
    @LispMethod(comment = "Like @xref TRANSFORM-EVALUATION-EXPRESSION, but\r\n\r\n@throws :el-unevaluatable-expression\r\n\t\tif evaluation fails.")
    public static final SubLObject transform_evaluation_expression_or_throw_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = relation_evaluation.cyc_evaluate(expression);
                SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    return value;
                } else {
                    return sublisp_throw($EL_UNEVALUATABLE_EXPRESSION, list($EL_UNEVALUATABLE_EXPRESSION, expression));
                }
            }
        }
    }

    @LispMethod(comment = "Like @xref TRANSFORM-EVALUATION-EXPRESSION, but\r\n\r\n@throws :el-unevaluatable-expression\r\n\t\tif evaluation fails.")
    public static SubLObject transform_evaluation_expression_or_throw(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = relation_evaluation.cyc_evaluate(expression);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            return value;
        }
        return sublisp_throw($EL_UNEVALUATABLE_EXPRESSION, list($EL_UNEVALUATABLE_EXPRESSION, expression));
    }/**
     * Like @xref TRANSFORM-EVALUATION-EXPRESSION, but
     *
     * @throws :el-unevaluatable-expression
     * 		if evaluation fails.
     */


    public static final SubLObject transform_evaluation_expression_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = relation_evaluation.cyc_evaluate(expression);
                SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    return value;
                } else {
                    return expression;
                }
            }
        }
    }

    public static SubLObject transform_evaluation_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = relation_evaluation.cyc_evaluate(expression);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != validP) {
            return value;
        }
        return expression;
    }

    public static final SubLObject el_evaluatable_expressionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.precanonicalizer.el_evaluatable_functorP(formula_arg0(v_object), mt)) && (NIL != evaluatable_el_expressionP(v_object))) && (NIL != com.cyc.cycjava.cycl.precanonicalizer.el_evaluatable_subexpressionsP(v_object, mt)));
    }

    public static SubLObject el_evaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != el_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt)) && (NIL != evaluatable_el_expressionP(v_object))) && (NIL != el_evaluatable_subexpressionsP(v_object, mt)));
    }

    public static final SubLObject el_evaluatable_functorP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_object)) {
            return makeBoolean((NIL != com.cyc.cycjava.cycl.precanonicalizer.el_evaluatable_functor_somewhereP(v_object)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, $$evaluateAtEL, mt, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject el_evaluatable_functorP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(v_object)) {
            return makeBoolean((NIL != el_evaluatable_functor_somewhereP(v_object)) && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, $$evaluateAtEL, mt, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject el_evaluatable_functor_somewhereP_alt(SubLObject v_object) {
        return somewhere_cache.some_pred_assertion_somewhereP($$evaluateAtEL, v_object, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject el_evaluatable_functor_somewhereP(final SubLObject v_object) {
        return somewhere_cache.some_pred_assertion_somewhereP($$evaluateAtEL, v_object, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject el_evaluatable_subexpressionsP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_evaluatableP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        el_evaluatableP = makeBoolean(NIL == expression_find_if($sym14$EL_UNEVALUATABLE_EXPRESSION_, v_object, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return el_evaluatableP;
            }
        }
    }

    public static SubLObject el_evaluatable_subexpressionsP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_evaluatableP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            el_evaluatableP = makeBoolean(NIL == cycl_utilities.expression_find_if($sym14$EL_UNEVALUATABLE_EXPRESSION_, v_object, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return el_evaluatableP;
    }

    public static final SubLObject el_unevaluatable_expressionP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != relation_evaluation.evaluatable_expressionP(v_object))) && (NIL == com.cyc.cycjava.cycl.precanonicalizer.el_evaluatable_functorP(formula_arg0(v_object), mt)));
    }

    public static SubLObject el_unevaluatable_expressionP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != relation_evaluation.evaluatable_expressionP(v_object))) && (NIL == el_evaluatable_functorP(cycl_utilities.formula_arg0(v_object), mt)));
    }

    /**
     * Performs transformations on FORMULA to remove immediately-evaluatable expressions.
     * Does not recursively expand evaluatable expressions.
     * This is a constructive operation.
     */
    @LispMethod(comment = "Performs transformations on FORMULA to remove immediately-evaluatable expressions.\r\nDoes not recursively expand evaluatable expressions.\r\nThis is a constructive operation.\nPerforms transformations on FORMULA to remove immediately-evaluatable expressions.\nDoes not recursively expand evaluatable expressions.\nThis is a constructive operation.")
    public static final SubLObject immediately_evaluatable_expressions_out_alt(SubLObject formula) {
        return expression_transform(formula, $sym0$IMMEDIATELY_EVALUATABLE_EXPRESSION_, TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Performs transformations on FORMULA to remove immediately-evaluatable expressions.\r\nDoes not recursively expand evaluatable expressions.\r\nThis is a constructive operation.\nPerforms transformations on FORMULA to remove immediately-evaluatable expressions.\nDoes not recursively expand evaluatable expressions.\nThis is a constructive operation.")
    public static SubLObject immediately_evaluatable_expressions_out(final SubLObject formula) {
        return cycl_utilities.expression_transform(formula, $sym2$IMMEDIATELY_EVALUATABLE_EXPRESSION_, TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }/**
     * Performs transformations on FORMULA to remove immediately-evaluatable expressions.
     * Does not recursively expand evaluatable expressions.
     * This is a constructive operation.
     */


    public static final SubLObject immediately_evaluatable_expressionP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.precanonicalizer.immediately_evaluatable_functorP(formula_arg0(v_object))) && (NIL != evaluatable_el_expressionP(v_object))) && (NIL != com.cyc.cycjava.cycl.precanonicalizer.immediately_evaluatable_subexpressionsP(v_object)));
    }

    public static SubLObject immediately_evaluatable_expressionP(final SubLObject v_object) {
        return makeBoolean(((NIL != immediately_evaluatable_functorP(cycl_utilities.formula_arg0(v_object))) && (NIL != evaluatable_el_expressionP(v_object))) && (NIL != immediately_evaluatable_subexpressionsP(v_object)));
    }

    public static final SubLObject immediately_evaluatable_functorP_alt(SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return com.cyc.cycjava.cycl.precanonicalizer.immediately_evaluatable_functor_somewhereP(v_object);
        }
        return NIL;
    }

    public static SubLObject immediately_evaluatable_functorP(final SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return immediately_evaluatable_functor_somewhereP(v_object);
        }
        return NIL;
    }

    public static final SubLObject immediately_evaluatable_functor_somewhereP_alt(SubLObject v_object) {
        return somewhere_cache.some_pred_assertion_somewhereP($$evaluateImmediately, v_object, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject immediately_evaluatable_functor_somewhereP(final SubLObject v_object) {
        return somewhere_cache.some_pred_assertion_somewhereP($$evaluateImmediately, v_object, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject immediately_evaluatable_subexpressionsP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject immediately_evaluatableP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        immediately_evaluatableP = makeBoolean(NIL == expression_find_if($sym19$IMMEDIATELY_UNEVALUATABLE_EXPRESSION_, v_object, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return immediately_evaluatableP;
            }
        }
    }

    public static SubLObject immediately_evaluatable_subexpressionsP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject immediately_evaluatableP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            immediately_evaluatableP = makeBoolean(NIL == cycl_utilities.expression_find_if($sym19$IMMEDIATELY_UNEVALUATABLE_EXPRESSION_, v_object, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return immediately_evaluatableP;
    }

    public static final SubLObject immediately_unevaluatable_expressionP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != relation_evaluation.evaluatable_expressionP(v_object))) && (NIL == com.cyc.cycjava.cycl.precanonicalizer.immediately_evaluatable_functorP(formula_arg0(v_object))));
    }

    public static SubLObject immediately_unevaluatable_expressionP(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != relation_evaluation.evaluatable_expressionP(v_object))) && (NIL == immediately_evaluatable_functorP(cycl_utilities.formula_arg0(v_object))));
    }

    public static final SubLObject implicit_meta_literals_out_alt(SubLObject sentence) {
        if (NIL == formula_find_if(symbol_function(EL_IMPLICIT_META_LITERAL_SENTENCE_P), sentence, NIL, UNPROVIDED)) {
            return sentence;
        }
        {
            SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
            SubLObject tempformula = sentence;
            SubLObject sentence_10 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
            SubLObject result = NIL;
            result = com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(sentence_10);
            if (NIL != seqvar) {
                return nadd_sequence_var_to_end(seqvar, result);
            } else {
                return result;
            }
        }
    }

    public static SubLObject implicit_meta_literals_out(final SubLObject sentence) {
        if (NIL == cycl_utilities.formula_find_if(symbol_function(EL_IMPLICIT_META_LITERAL_SENTENCE_P), sentence, NIL, UNPROVIDED)) {
            return sentence;
        }
        final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
        final SubLObject sentence_$12 = (NIL != seqvar) ? strip_sequence_var(sentence) : sentence;
        SubLObject result = NIL;
        result = implicit_meta_literals_out_int(sentence_$12);
        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }

    /**
     * Converts exceptions at the EL level into #$abnormal statements,
     * and pragmatic requirements into #$meetsPragmaticRequirement statements.
     */
    @LispMethod(comment = "Converts exceptions at the EL level into #$abnormal statements,\r\nand pragmatic requirements into #$meetsPragmaticRequirement statements.\nConverts exceptions at the EL level into #$abnormal statements,\nand pragmatic requirements into #$meetsPragmaticRequirement statements.")
    public static final SubLObject implicit_meta_literals_out_int_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        if (NIL != el_negation_p(sentence)) {
                            result = make_negation(com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(sentence_arg1(sentence, UNPROVIDED)));
                        } else {
                            if (NIL != el_conjunction_p(sentence)) {
                                result = simplifier.conjoin(Mapping.mapcar(symbol_function(IMPLICIT_META_LITERALS_OUT_INT), sentence_args(sentence, UNPROVIDED)), UNPROVIDED);
                            } else {
                                if (NIL != el_disjunction_p(sentence)) {
                                    result = simplifier.disjoin(Mapping.mapcar(symbol_function(IMPLICIT_META_LITERALS_OUT_INT), sentence_args(sentence, UNPROVIDED)), UNPROVIDED);
                                } else {
                                    if (NIL != el_implication_p(sentence)) {
                                        result = make_implication(com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(sentence_arg1(sentence, UNPROVIDED)), com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(sentence_arg2(sentence, UNPROVIDED)));
                                    } else {
                                        if (NIL != el_implicit_meta_literal_sentence_p(sentence)) {
                                            result = com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_for_implict_meta_literal_sentence(sentence);
                                        } else {
                                            if (NIL != el_grammar.el_regularly_quantified_sentence_p(sentence)) {
                                                result = make_regularly_quantified_sentence(sentence_quantifier(sentence), quantified_var(sentence), com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(quantified_sub_sentence(sentence)));
                                            } else {
                                                if (NIL != el_bounded_existential_p(sentence)) {
                                                    result = make_bounded_existential(sentence_quantifier(sentence), existential_bound(sentence), quantified_var(sentence), com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(quantified_sub_sentence(sentence)));
                                                } else {
                                                    if (NIL != subl_escape_p(sentence)) {
                                                        result = sentence;
                                                    } else {
                                                        if (NIL != el_grammar.el_atomic_sentence_p(sentence)) {
                                                            result = sentence;
                                                        } else {
                                                            if (NIL != el_grammar.non_el_formula_sentence_p(sentence)) {
                                                                result = sentence;
                                                            } else {
                                                                el_error(FOUR_INTEGER, $str_alt21$_s_is_not_a_well_formed_sentence, sentence, UNPROVIDED, UNPROVIDED);
                                                                result = sentence;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Converts exceptions at the EL level into #$abnormal statements,\r\nand pragmatic requirements into #$meetsPragmaticRequirement statements.\nConverts exceptions at the EL level into #$abnormal statements,\nand pragmatic requirements into #$meetsPragmaticRequirement statements.")
    public static SubLObject implicit_meta_literals_out_int(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if (NIL != el_negation_p(sentence)) {
                result = make_negation(implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED)));
            } else
                if (NIL != el_conjunction_p(sentence)) {
                    result = simplifier.conjoin(Mapping.mapcar(symbol_function(IMPLICIT_META_LITERALS_OUT_INT), cycl_utilities.sentence_args(sentence, UNPROVIDED)), UNPROVIDED);
                } else
                    if (NIL != el_disjunction_p(sentence)) {
                        result = simplifier.disjoin(Mapping.mapcar(symbol_function(IMPLICIT_META_LITERALS_OUT_INT), cycl_utilities.sentence_args(sentence, UNPROVIDED)), UNPROVIDED);
                    } else
                        if (NIL != el_implication_p(sentence)) {
                            result = make_implication(implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED)), implicit_meta_literals_out_int(cycl_utilities.sentence_arg2(sentence, UNPROVIDED)));
                        } else
                            if (NIL != el_implicit_meta_literal_sentence_p(sentence)) {
                                result = implicit_meta_literals_out_for_implict_meta_literal_sentence(sentence);
                            } else
                                if (NIL != el_grammar.el_regularly_quantified_sentence_p(sentence)) {
                                    result = make_regularly_quantified_sentence(sentence_quantifier(sentence), quantified_var(sentence), implicit_meta_literals_out_int(quantified_sub_sentence(sentence)));
                                } else
                                    if (NIL != el_bounded_existential_p(sentence)) {
                                        result = make_bounded_existential(sentence_quantifier(sentence), existential_bound(sentence), quantified_var(sentence), implicit_meta_literals_out_int(quantified_sub_sentence(sentence)));
                                    } else
                                        if (NIL != subl_escape_p(sentence)) {
                                            result = sentence;
                                        } else
                                            if (NIL != el_grammar.el_atomic_sentence_p(sentence)) {
                                                result = sentence;
                                            } else
                                                if (NIL != el_grammar.non_el_formula_sentence_p(sentence)) {
                                                    result = sentence;
                                                } else {
                                                    el_error(FOUR_INTEGER, $str21$_s_is_not_a_well_formed_sentence, sentence, UNPROVIDED, UNPROVIDED);
                                                    result = sentence;
                                                }









        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Converts exceptions at the EL level into #$abnormal statements,
     * and pragmatic requirements into #$meetsPragmaticRequirement statements.
     */


    public static final SubLObject implicit_meta_literals_out_for_implict_meta_literal_sentence_alt(SubLObject sentence) {
        {
            SubLObject rule = sentence_arg2(sentence, UNPROVIDED);
            SubLObject assertions = czer_meta.find_assertions_cycl(rule, UNPROVIDED);
            SubLObject abnormals = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != term.kb_assertionP(assertion)) {
                    {
                        SubLObject pcase_var = atomic_sentence_predicate(sentence);
                        if (pcase_var.eql($$exceptWhen)) {
                            abnormals = cons(make_implication(com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(sentence_arg1(sentence, UNPROVIDED)), make_binary_formula($$abnormal, make_el_formula($$TheList, assertions_high.assertion_el_variables(assertion), UNPROVIDED), assertion)), abnormals);
                        } else {
                            if (pcase_var.eql($$exceptFor)) {
                                abnormals = cons(make_binary_formula($$abnormal, make_unary_formula($$TheList, sentence_arg1(sentence, UNPROVIDED)), assertion), abnormals);
                            } else {
                                if (pcase_var.eql($$pragmaticRequirement)) {
                                    abnormals = cons(make_implication(make_unary_formula($$querySentence, com.cyc.cycjava.cycl.precanonicalizer.implicit_meta_literals_out_int(sentence_arg1(sentence, UNPROVIDED))), make_binary_formula($$meetsPragmaticRequirement, make_el_formula($$TheList, assertions_high.assertion_el_variables(assertion), UNPROVIDED), assertion)), abnormals);
                                }
                            }
                        }
                    }
                } else {
                    el_error(THREE_INTEGER, $str_alt29$no_assertion_for_meta_arg___s, rule, UNPROVIDED, UNPROVIDED);
                    return sentence;
                }
            }
            if (NIL == abnormals) {
                return sentence;
            } else {
                if (NIL != list_utilities.singletonP(abnormals)) {
                    return abnormals.first();
                } else {
                    return simplifier.conjoin(abnormals, UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject implicit_meta_literals_out_for_implict_meta_literal_sentence(final SubLObject sentence) {
        final SubLObject rule = cycl_utilities.sentence_arg2(sentence, UNPROVIDED);
        final SubLObject assertions = czer_meta.find_assertions_cycl(rule, UNPROVIDED);
        SubLObject abnormals = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == term.kb_assertionP(assertion)) {
                el_error(THREE_INTEGER, $str29$no_assertion_for_meta_arg___s, rule, UNPROVIDED, UNPROVIDED);
                return sentence;
            }
            final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(sentence);
            if (pcase_var.eql($$exceptWhen)) {
                abnormals = cons(make_implication(implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED)), make_binary_formula($$abnormal, make_el_formula($$TheList, assertions_high.assertion_el_variables(assertion), UNPROVIDED), assertion)), abnormals);
            } else
                if (pcase_var.eql($$exceptFor)) {
                    abnormals = cons(make_binary_formula($$abnormal, make_unary_formula($$TheList, cycl_utilities.sentence_arg1(sentence, UNPROVIDED)), assertion), abnormals);
                } else
                    if (pcase_var.eql($$pragmaticRequirement)) {
                        abnormals = cons(make_implication(make_unary_formula($$querySentence, implicit_meta_literals_out_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED))), make_binary_formula($$meetsPragmaticRequirement, make_el_formula($$TheList, assertions_high.assertion_el_variables(assertion), UNPROVIDED), assertion)), abnormals);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        if (NIL == abnormals) {
            return sentence;
        }
        if (NIL != list_utilities.singletonP(abnormals)) {
            return abnormals.first();
        }
        return simplifier.conjoin(abnormals, UNPROVIDED);
    }

    public static SubLObject declare_precanonicalizer_file() {
        declareFunction("early_precanonicalizationsP", "EARLY-PRECANONICALIZATIONS?", 2, 0, false);
        declareFunction("early_precanonicalizations", "EARLY-PRECANONICALIZATIONS", 2, 0, false);
        declareFunction("early_precanonicalization_unicode_string_applicableP", "EARLY-PRECANONICALIZATION-UNICODE-STRING-APPLICABLE?", 2, 0, false);
        declareFunction("early_precanonicalization_unicode_string_apply", "EARLY-PRECANONICALIZATION-UNICODE-STRING-APPLY", 2, 0, false);
        declareFunction("immediate_precanonicalizationsP", "IMMEDIATE-PRECANONICALIZATIONS?", 1, 0, false);
        declareFunction("immediate_precanonicalizations", "IMMEDIATE-PRECANONICALIZATIONS", 1, 0, false);
        declareFunction("precanonicalizationsP", "PRECANONICALIZATIONS?", 2, 1, false);
        declareFunction("safe_precanonicalizations", "SAFE-PRECANONICALIZATIONS", 2, 0, false);
        declareFunction("precanonicalizations", "PRECANONICALIZATIONS", 2, 0, false);
        declareFunction("precanonicalizations_int_internal", "PRECANONICALIZATIONS-INT-INTERNAL", 2, 0, false);
        declareFunction("precanonicalizations_int", "PRECANONICALIZATIONS-INT", 2, 0, false);
        declareFunction("el_evaluatable_expressions_out", "EL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        declareFunction("transform_evaluation_expression_or_throw", "TRANSFORM-EVALUATION-EXPRESSION-OR-THROW", 1, 0, false);
        declareFunction("transform_evaluation_expression", "TRANSFORM-EVALUATION-EXPRESSION", 1, 0, false);
        declareFunction("el_evaluatable_expressionP", "EL-EVALUATABLE-EXPRESSION?", 1, 1, false);
        new precanonicalizer.$el_evaluatable_expressionP$UnaryFunction();
        new precanonicalizer.$el_evaluatable_expressionP$BinaryFunction();
        declareFunction("el_evaluatable_functorP", "EL-EVALUATABLE-FUNCTOR?", 1, 1, false);
        declareFunction("el_evaluatable_functor_somewhereP", "EL-EVALUATABLE-FUNCTOR-SOMEWHERE?", 1, 0, false);
        declareFunction("el_evaluatable_subexpressionsP", "EL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false);
        declareFunction("el_unevaluatable_expressionP", "EL-UNEVALUATABLE-EXPRESSION?", 1, 1, false);
        declareFunction("immediately_evaluatable_expressions_out", "IMMEDIATELY-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
        declareFunction("immediately_evaluatable_expressionP", "IMMEDIATELY-EVALUATABLE-EXPRESSION?", 1, 0, false);
        declareFunction("immediately_evaluatable_functorP", "IMMEDIATELY-EVALUATABLE-FUNCTOR?", 1, 0, false);
        declareFunction("immediately_evaluatable_functor_somewhereP", "IMMEDIATELY-EVALUATABLE-FUNCTOR-SOMEWHERE?", 1, 0, false);
        declareFunction("immediately_evaluatable_subexpressionsP", "IMMEDIATELY-EVALUATABLE-SUBEXPRESSIONS?", 1, 0, false);
        declareFunction("immediately_unevaluatable_expressionP", "IMMEDIATELY-UNEVALUATABLE-EXPRESSION?", 1, 0, false);
        declareFunction("implicit_meta_literals_out", "IMPLICIT-META-LITERALS-OUT", 1, 0, false);
        declareFunction("implicit_meta_literals_out_int", "IMPLICIT-META-LITERALS-OUT-INT", 1, 0, false);
        declareFunction("implicit_meta_literals_out_for_implict_meta_literal_sentence", "IMPLICIT-META-LITERALS-OUT-FOR-IMPLICT-META-LITERAL-SENTENCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_precanonicalizer_file() {
        return NIL;
    }

    public static SubLObject setup_precanonicalizer_file() {
        memoization_state.note_memoized_function(PRECANONICALIZATIONS_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_precanonicalizer_file();
    }

    @Override
    public void initializeVariables() {
        init_precanonicalizer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_precanonicalizer_file();
    }

    static {
    }

    public static final class $el_evaluatable_expressionP$UnaryFunction extends UnaryFunction {
        public $el_evaluatable_expressionP$UnaryFunction() {
            super(extractFunctionNamed("EL-EVALUATABLE-EXPRESSION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return el_evaluatable_expressionP(arg1, precanonicalizer.$el_evaluatable_expressionP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $el_evaluatable_expressionP$BinaryFunction extends BinaryFunction {
        public $el_evaluatable_expressionP$BinaryFunction() {
            super(extractFunctionNamed("EL-EVALUATABLE-EXPRESSION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return el_evaluatable_expressionP(arg1, arg2);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$IMMEDIATELY_EVALUATABLE_EXPRESSION_ = makeSymbol("IMMEDIATELY-EVALUATABLE-EXPRESSION?");

    static private final SubLSymbol $sym1$EXPANDIBLE_EL_RELATION_EXPRESSION_ = makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?");

    static private final SubLSymbol $sym2$EL_EVALUATABLE_EXPRESSION_ = makeSymbol("EL-EVALUATABLE-EXPRESSION?");

    static private final SubLString $str_alt5$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_ = makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE?");

    static private final SubLString $str_alt21$_s_is_not_a_well_formed_sentence = makeString("~s is not a well-formed sentence");

    static private final SubLString $str_alt29$no_assertion_for_meta_arg___s = makeString("no assertion for meta-arg: ~s");
}

/**
 * Total time: 244 ms
 */
