/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.el_utilities.cycl_subl_symbol_symbol;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_arity;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_formal_args;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_p;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_query;
import static com.cyc.cycjava.cycl.el_utilities.lambda_function_arity;
import static com.cyc.cycjava.cycl.el_utilities.lambda_function_expression;
import static com.cyc.cycjava.cycl.el_utilities.lambda_function_formal_args;
import static com.cyc.cycjava.cycl.el_utilities.lambda_function_p;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.sefify;
import static com.cyc.cycjava.cycl.inference.ask_utilities.inference_recursive_query_unique_bindings;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RELATION-EVALUATION
 * source file: /cyc/top/cycl/relation-evaluation.lisp
 * created:     2019/07/03 17:37:25
 */
public final class relation_evaluation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new relation_evaluation();

 public static final String myName = "com.cyc.cycjava.cycl.relation_evaluation";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cyc_evaluate_gather_justificationsP$ = makeSymbol("*CYC-EVALUATE-GATHER-JUSTIFICATIONS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cyc_evaluate_supports$ = makeSymbol("*CYC-EVALUATE-SUPPORTS*");

    // defparameter
    // This is bound to the current relation being evaluated.
    /**
     * This is bound to the current relation being evaluated.
     */
    @LispMethod(comment = "This is bound to the current relation being evaluated.\ndefparameter")
    public static final SubLSymbol $cyc_evaluate_relation$ = makeSymbol("*CYC-EVALUATE-RELATION*");

    // defparameter
    // Bound to T when a contextualized relation is evaluated.
    /**
     * Bound to T when a contextualized relation is evaluated.
     */
    @LispMethod(comment = "Bound to T when a contextualized relation is evaluated.\ndefparameter")
    private static final SubLSymbol $cyc_evaluate_some_contextualized_relationP$ = makeSymbol("*CYC-EVALUATE-SOME-CONTEXTUALIZED-RELATION?*");





    private static final SubLSymbol SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");



    private static final SubLList $list9 = list(makeSymbol("FAILURE-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol THROW_UNEVALUATABLE = makeSymbol("THROW-UNEVALUATABLE");

    private static final SubLSymbol NOTING_UNEVALUATABLE = makeSymbol("NOTING-UNEVALUATABLE");

    private static final SubLSymbol $sym15$CATCH_THIS = makeUninternedSymbol("CATCH-THIS");

    private static final SubLString $str20$Error_from__cyc_evaluate__A____A = makeString("Error from (cyc-evaluate ~A): ~A");

    private static final SubLSymbol UNKNOWN_SCALAR_INTERVAL_P = makeSymbol("UNKNOWN-SCALAR-INTERVAL-P");



    private static final SubLSymbol $RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");

    private static final SubLSymbol CYC_EVALUATE_ARG = makeSymbol("CYC-EVALUATE-ARG");

    private static final SubLSymbol CYC_FUNCTION_TO_ARG = makeSymbol("CYC-FUNCTION-TO-ARG");

    private static final SubLSymbol CYC_LAMBDA = makeSymbol("CYC-LAMBDA");

    private static final SubLSymbol CACHED_EVALUATION_FUNCTION = makeSymbol("CACHED-EVALUATION-FUNCTION");

    private static final SubLSymbol $cached_evaluation_function_caching_state$ = makeSymbol("*CACHED-EVALUATION-FUNCTION-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_EVALUATION_FUNCTION = makeSymbol("CLEAR-CACHED-EVALUATION-FUNCTION");



    private static final SubLSymbol $sym31$_VALUE = makeSymbol("?VALUE");

    private static final SubLSymbol MAKE_VARIABLE_BINDING = makeSymbol("MAKE-VARIABLE-BINDING");

    private static final SubLSymbol $kw34$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    // Definitions
    /**
     * Admits more than evaluatable-function-p
     *
     * @see evaluatable-function-p
     */
    @LispMethod(comment = "Admits more than evaluatable-function-p\r\n\r\n@see evaluatable-function-p")
    public static final SubLObject evaluatable_functionP_alt(SubLObject function) {
        return makeBoolean((((NIL != forts.fort_p(function)) && (NIL != fort_types_interface.evaluatable_function_p(function))) || (NIL != com.cyc.cycjava.cycl.relation_evaluation.function_to_arg_function_p(function))) || (NIL != lambda_function_p(function)));
    }

    // Definitions
    /**
     * Admits more than evaluatable-function-p
     *
     * @see evaluatable-function-p
     */
    @LispMethod(comment = "Admits more than evaluatable-function-p\r\n\r\n@see evaluatable-function-p")
    public static SubLObject evaluatable_functionP(final SubLObject function) {
        return makeBoolean((((NIL != forts.fort_p(function)) && (NIL != fort_types_interface.evaluatable_function_p(function))) || (NIL != function_to_arg_function_p(function))) || (NIL != lambda_function_p(function)));
    }

    public static final SubLObject evaluatable_predicateP_alt(SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(predicate)) && (NIL != fort_types_interface.evaluatable_predicate_p(predicate, mt)));
    }

    public static SubLObject evaluatable_predicateP(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(predicate)) && (NIL != fort_types_interface.evaluatable_predicate_p(predicate, mt)));
    }

    public static final SubLObject evaluatable_relationP_alt(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = makeBoolean((NIL != com.cyc.cycjava.cycl.relation_evaluation.evaluatable_functionP(relation)) || (NIL != com.cyc.cycjava.cycl.relation_evaluation.evaluatable_predicateP(relation, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject evaluatable_relationP(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = makeBoolean((NIL != evaluatable_functionP(relation)) || (NIL != evaluatable_predicateP(relation, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject evaluatable_expressionP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != backward_utilities.inference_closed_termP(v_object))) && (NIL != com.cyc.cycjava.cycl.relation_evaluation.evaluatable_relationP(cycl_utilities.formula_operator(v_object))));
    }

    public static SubLObject evaluatable_expressionP(final SubLObject v_object) {
        return makeBoolean(((NIL != el_formula_p(v_object)) && (NIL != backward_utilities.inference_closed_termP(v_object))) && (NIL != evaluatable_relationP(cycl_utilities.formula_operator(v_object))));
    }

    public static final SubLObject evaluation_defn_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(fort, $$evaluationDefn, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject evaluation_defn(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(fort, $$evaluationDefn, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cyc_evaluate_gathering_justificationsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cyc_evaluate_gather_justificationsP$.getDynamicValue(thread);
        }
    }

    public static SubLObject cyc_evaluate_gathering_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cyc_evaluate_gather_justificationsP$.getDynamicValue(thread);
    }

    public static final SubLObject cyc_evaluate_note_support_alt(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(support, SUPPORT_P);
            if (NIL != $cyc_evaluate_gather_justificationsP$.getDynamicValue(thread)) {
                {
                    SubLObject item_var = support;
                    if (NIL == member(item_var, $cyc_evaluate_supports$.getDynamicValue(thread), SUPPORT_EQUAL, symbol_function(IDENTITY))) {
                        $cyc_evaluate_supports$.setDynamicValue(cons(item_var, $cyc_evaluate_supports$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return support;
        }
    }

    public static SubLObject cyc_evaluate_note_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        if ((NIL != $cyc_evaluate_gather_justificationsP$.getDynamicValue(thread)) && (NIL == member(support, $cyc_evaluate_supports$.getDynamicValue(thread), SUPPORT_EQUAL, symbol_function(IDENTITY)))) {
            $cyc_evaluate_supports$.setDynamicValue(cons(support, $cyc_evaluate_supports$.getDynamicValue(thread)), thread);
        }
        return support;
    }

    /**
     * Return a list of supports that justify the evaluation of EXPRESSION,
     * or NIL if the expression is unevaluatable.
     */
    @LispMethod(comment = "Return a list of supports that justify the evaluation of EXPRESSION,\r\nor NIL if the expression is unevaluatable.\nReturn a list of supports that justify the evaluation of EXPRESSION,\nor NIL if the expression is unevaluatable.")
    public static final SubLObject cyc_evaluate_justify_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supports = NIL;
                {
                    SubLObject _prev_bind_0 = $cyc_evaluate_gather_justificationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cyc_evaluate_supports$.currentBinding(thread);
                    try {
                        $cyc_evaluate_gather_justificationsP$.bind(T, thread);
                        $cyc_evaluate_supports$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result = com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate(expression);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                supports = nreverse($cyc_evaluate_supports$.getDynamicValue(thread));
                            }
                        }
                    } finally {
                        $cyc_evaluate_supports$.rebind(_prev_bind_1, thread);
                        $cyc_evaluate_gather_justificationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return supports;
            }
        }
    }

    /**
     * Return a list of supports that justify the evaluation of EXPRESSION,
     * or NIL if the expression is unevaluatable.
     */
    @LispMethod(comment = "Return a list of supports that justify the evaluation of EXPRESSION,\r\nor NIL if the expression is unevaluatable.\nReturn a list of supports that justify the evaluation of EXPRESSION,\nor NIL if the expression is unevaluatable.")
    public static SubLObject cyc_evaluate_justify(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = $cyc_evaluate_gather_justificationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cyc_evaluate_supports$.currentBinding(thread);
        try {
            $cyc_evaluate_gather_justificationsP$.bind(T, thread);
            $cyc_evaluate_supports$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result = cyc_evaluate(expression);
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                supports = nreverse($cyc_evaluate_supports$.getDynamicValue(thread));
            }
        } finally {
            $cyc_evaluate_supports$.rebind(_prev_bind_2, thread);
            $cyc_evaluate_gather_justificationsP$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    public static final SubLObject note_cyc_evaluate_argument_support_alt(SubLObject evaluated_arg, SubLObject input_arg) {
        if (NIL != com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_gathering_justificationsP()) {
            {
                SubLObject sentence = removal_modules_evaluate.make_evaluate_sentence(evaluated_arg, input_arg);
                SubLObject support = removal_modules_evaluation.make_eval_support(sentence, UNPROVIDED);
                com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_note_support(support);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject note_cyc_evaluate_argument_support(final SubLObject evaluated_arg, final SubLObject input_arg) {
        if (NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject sentence = removal_modules_evaluate.make_evaluate_sentence(evaluated_arg, input_arg);
            final SubLObject support = removal_modules_evaluation.make_eval_support(sentence, UNPROVIDED);
            cyc_evaluate_note_support(support);
            return T;
        }
        return NIL;
    }

    public static final SubLObject note_cyc_evaluate_final_support_alt(SubLObject result, SubLObject relation, SubLObject args) {
        if (NIL != com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_gathering_justificationsP()) {
            {
                SubLObject expression = make_formula(relation, args, UNPROVIDED);
                SubLObject sentence = (NIL != com.cyc.cycjava.cycl.relation_evaluation.evaluatable_functionP(relation)) ? ((SubLObject) (removal_modules_evaluate.make_evaluate_sentence(result, expression))) : expression;
                SubLObject support = removal_modules_evaluation.make_eval_support(sentence, UNPROVIDED);
                com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_note_support(support);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject note_cyc_evaluate_final_support(final SubLObject result, final SubLObject relation, final SubLObject args) {
        if (NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject expression = make_formula(relation, args, UNPROVIDED);
            final SubLObject sentence = (NIL != evaluatable_functionP(relation)) ? removal_modules_evaluate.make_evaluate_sentence(result, expression) : expression;
            final SubLObject support = removal_modules_evaluation.make_eval_support(sentence, UNPROVIDED);
            cyc_evaluate_note_support(support);
            return T;
        }
        return NIL;
    }

    public static final SubLObject note_cyc_evaluate_expansion_support_alt(SubLObject result, SubLObject expanded_formula) {
        if (NIL != com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_gathering_justificationsP()) {
            {
                SubLObject relation = cycl_utilities.formula_operator(expanded_formula);
                SubLObject sentence = (NIL != com.cyc.cycjava.cycl.relation_evaluation.evaluatable_functionP(relation)) ? ((SubLObject) (removal_modules_evaluate.make_evaluate_sentence(result, expanded_formula))) : expanded_formula;
                SubLObject support = removal_modules_evaluation.make_eval_support(sentence, UNPROVIDED);
                com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_note_support(support);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject note_cyc_evaluate_expansion_support(final SubLObject result, final SubLObject expanded_formula) {
        if (NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject relation = cycl_utilities.formula_operator(expanded_formula);
            final SubLObject sentence = (NIL != evaluatable_functionP(relation)) ? removal_modules_evaluate.make_evaluate_sentence(result, expanded_formula) : expanded_formula;
            final SubLObject support = (NIL != evaluatable_functionP(relation)) ? removal_modules_evaluation.make_eval_support(sentence, UNPROVIDED) : arguments.make_hl_support($QUERY, sentence, UNPROVIDED, UNPROVIDED);
            cyc_evaluate_note_support(support);
            return T;
        }
        return NIL;
    }

    public static final SubLObject note_expansion_support_alt(SubLObject unexpanded_formula, SubLObject expanded_formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_gathering_justificationsP()) {
                thread.resetMultipleValues();
                {
                    SubLObject justified_formula = verbosifier.el_expand_all_justified(unexpanded_formula, mt);
                    SubLObject justified_mt = thread.secondMultipleValue();
                    SubLObject supports = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (justified_formula.equal(expanded_formula)) {
                        {
                            SubLObject cdolist_list_var = supports;
                            SubLObject support = NIL;
                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_note_support(support);
                            }
                        }
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject note_expansion_support(final SubLObject unexpanded_formula, final SubLObject expanded_formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cyc_evaluate_gathering_justificationsP()) {
            thread.resetMultipleValues();
            final SubLObject justified_formula = verbosifier.el_expand_all_evaluatable_justified(unexpanded_formula, mt);
            final SubLObject justified_mt = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (justified_formula.equal(expanded_formula)) {
                SubLObject cdolist_list_var = supports;
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cyc_evaluate_note_support(support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject note_evaluation_function_support_alt(SubLObject relation, SubLObject evaluation_function) {
        if (NIL != com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_gathering_justificationsP()) {
            {
                SubLObject gafs = kb_mapping_utilities.pred_u_v_holds_gafs($$evaluationDefn, relation, evaluation_function, ONE_INTEGER, TWO_INTEGER, $TRUE);
                SubLObject support = gafs.first();
                if (NIL != support) {
                    com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_note_support(support);
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject note_evaluation_function_support(final SubLObject relation, final SubLObject evaluation_function) {
        if (NIL != cyc_evaluate_gathering_justificationsP()) {
            final SubLObject subl_function_term = make_unary_formula($$SubLQuoteFn, evaluation_function);
            final SubLObject gafs = kb_mapping_utilities.pred_u_v_holds_gafs($$evaluationDefn, relation, subl_function_term, ONE_INTEGER, TWO_INTEGER, $TRUE);
            final SubLObject support = gafs.first();
            if (NIL != support) {
                cyc_evaluate_note_support(support);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject noting_unevaluatable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject failure_var = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        failure_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CCATCH, $UNEVALUATABLE, failure_var, append(body, NIL));
    }

    /**
     * Indicate the the current evaluation is not valid.
     */
    @LispMethod(comment = "Indicate the the current evaluation is not valid.")
    public static final SubLObject throw_unevaluatable_alt() {
        sublisp_throw($UNEVALUATABLE, T);
        return NIL;
    }

    @LispMethod(comment = "Indicate the the current evaluation is not valid.")
    public static SubLObject throw_unevaluatable() {
        sublisp_throw($UNEVALUATABLE, T);
        return NIL;
    }/**
     * Indicate the the current evaluation is not valid.
     */


    public static SubLObject noting_evaluation_failure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject failure_var = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        failure_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(NOTING_UNEVALUATABLE, failure_var, listS(CATCH_ERROR_MESSAGE, list(failure_var), append(body, NIL)));
    }

    public static SubLObject ignoring_unevaluatable(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject catch_this = $sym15$CATCH_THIS;
        return list(CLET, list(list(catch_this)), listS(NOTING_UNEVALUATABLE, catch_this, list(IGNORE, catch_this), append(body, NIL)));
    }

    /**
     * Unless we've already found one, check if RELATION is contextualized, and note if it is.
     */
    @LispMethod(comment = "Unless we\'ve already found one, check if RELATION is contextualized, and note if it is.")
    public static final SubLObject possibly_note_contextualized_evaluatable_relation_alt(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread)) {
                $cyc_evaluate_some_contextualized_relationP$.setDynamicValue(fort_types_interface.evaluatable_relation_contextualized_p(relation), thread);
            }
            return $cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread);
        }
    }

    /**
     * Unless we've already found one, check if RELATION is contextualized, and note if it is.
     */
    @LispMethod(comment = "Unless we\'ve already found one, check if RELATION is contextualized, and note if it is.")
    public static SubLObject possibly_note_contextualized_evaluatable_relation(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread)) {
            $cyc_evaluate_some_contextualized_relationP$.setDynamicValue(fort_types_interface.evaluatable_relation_contextualized_p(relation), thread);
        }
        return $cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread);
    }

    /**
     * Evaluate the evaluatable EXPRESSION and return the result.
     * A second returned value is T iff the result was valid.
     * A third returned value is T iff the evaluation included evaluation of a contextualized relation.
     */
    @LispMethod(comment = "Evaluate the evaluatable EXPRESSION and return the result.\r\nA second returned value is T iff the result was valid.\r\nA third returned value is T iff the evaluation included evaluation of a contextualized relation.\nEvaluate the evaluatable EXPRESSION and return the result.\nA second returned value is T iff the result was valid.\nA third returned value is T iff the evaluation included evaluation of a contextualized relation.")
    public static final SubLObject cyc_evaluate_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                SubLObject unevaluatable = NIL;
                SubLObject contextualizedP = NIL;
                {
                    SubLObject _prev_bind_0 = $cyc_evaluate_some_contextualized_relationP$.currentBinding(thread);
                    try {
                        $cyc_evaluate_some_contextualized_relationP$.bind(NIL, thread);
                        try {
                            v_answer = com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_internal(expression, T);
                            contextualizedP = list_utilities.sublisp_boolean($cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread));
                        } catch (Throwable ccatch_env_var) {
                            unevaluatable = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
                        }
                    } finally {
                        $cyc_evaluate_some_contextualized_relationP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != unevaluatable) {
                    return com.cyc.cycjava.cycl.relation_evaluation.invalid_evaluation();
                } else {
                    return com.cyc.cycjava.cycl.relation_evaluation.valid_evaluation(v_answer, contextualizedP);
                }
            }
        }
    }

    /**
     * Evaluate the evaluatable EXPRESSION and return the result.
     * A second returned value is T iff the result was valid.
     * A third returned value is T iff the evaluation included evaluation of a contextualized relation.
     */
    @LispMethod(comment = "Evaluate the evaluatable EXPRESSION and return the result.\r\nA second returned value is T iff the result was valid.\r\nA third returned value is T iff the evaluation included evaluation of a contextualized relation.\nEvaluate the evaluatable EXPRESSION and return the result.\nA second returned value is T iff the result was valid.\nA third returned value is T iff the evaluation included evaluation of a contextualized relation.")
    public static SubLObject cyc_evaluate(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject unevaluatable = NIL;
        SubLObject contextualizedP = NIL;
        if (NIL != list_utilities.simple_tree_find($UNTRANSLATABLE, expression)) {
            return valid_evaluation($UNTRANSLATABLE, NIL);
        }
        final SubLObject _prev_bind_0 = $cyc_evaluate_some_contextualized_relationP$.currentBinding(thread);
        try {
            $cyc_evaluate_some_contextualized_relationP$.bind(NIL, thread);
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($UNEVALUATABLE);
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            v_answer = cyc_evaluate_internal(expression, T);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error_message) {
                    Errors.warn($str20$Error_from__cyc_evaluate__A____A, sefify(expression), error_message);
                    unevaluatable = T;
                }
                contextualizedP = list_utilities.sublisp_boolean($cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread));
            } catch (final Throwable ccatch_env_var) {
                unevaluatable = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $cyc_evaluate_some_contextualized_relationP$.rebind(_prev_bind_0, thread);
        }
        if ((((NIL == cycl_grammar.cycl_atomic_sentence_p(expression)) && (NIL != unevaluatable)) && (NIL == kb_control_vars.within_forward_inferenceP())) && (NIL != contains_an_unknown_scalar_intervalP(expression))) {
            v_answer = simplify_unknown_scalar_interval_evaluation(expression);
            contextualizedP = list_utilities.sublisp_boolean($cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread));
            unevaluatable = NIL;
        }
        if (NIL != unevaluatable) {
            return invalid_evaluation();
        }
        return valid_evaluation(v_answer, contextualizedP);
    }

    public static SubLObject contains_an_unknown_scalar_intervalP(final SubLObject expression) {
        return cycl_utilities.expression_find_if(UNKNOWN_SCALAR_INTERVAL_P, expression, NIL, UNPROVIDED);
    }

    public static SubLObject unknown_scalar_interval_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.fort_has_typeP(v_object, $$UnknownScalarInterval, mt_vars.$anect_mt$.getGlobalValue())));
    }

    public static SubLObject simplify_unknown_scalar_interval_evaluation(final SubLObject expression) {
        return czer_main.canonicalize_term(expression, UNPROVIDED);
    }

    /**
     * For each item in ITEM-LIST, evaluate (FUNCTION item) and return a list of (item . evaluation) pairs.
     * If ALLOW-PARTIAL? is non-nil, unevaluatable items are ignored.
     */
    @LispMethod(comment = "For each item in ITEM-LIST, evaluate (FUNCTION item) and return a list of (item . evaluation) pairs.\r\nIf ALLOW-PARTIAL? is non-nil, unevaluatable items are ignored.\nFor each item in ITEM-LIST, evaluate (FUNCTION item) and return a list of (item . evaluation) pairs.\nIf ALLOW-PARTIAL? is non-nil, unevaluatable items are ignored.")
    public static final SubLObject cyc_evaluate_all_unary_alt(SubLObject function, SubLObject item_list, SubLObject allow_partialP) {
        if (allow_partialP == UNPROVIDED) {
            allow_partialP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                SubLObject contextualizedP = NIL;
                SubLObject cdolist_list_var = item_list;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject item_answer = com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate(list(function, item));
                        SubLObject valid = thread.secondMultipleValue();
                        SubLObject this_one_contextualizedP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            v_answer = cons(cons(item, item_answer), v_answer);
                            if (NIL != this_one_contextualizedP) {
                                contextualizedP = T;
                            }
                        } else {
                            if (NIL == allow_partialP) {
                                return com.cyc.cycjava.cycl.relation_evaluation.invalid_evaluation();
                            }
                        }
                    }
                }
                return com.cyc.cycjava.cycl.relation_evaluation.valid_evaluation(nreverse(v_answer), contextualizedP);
            }
        }
    }

    /**
     * For each item in ITEM-LIST, evaluate (FUNCTION item) and return a list of (item . evaluation) pairs.
     * If ALLOW-PARTIAL? is non-nil, unevaluatable items are ignored.
     */
    @LispMethod(comment = "For each item in ITEM-LIST, evaluate (FUNCTION item) and return a list of (item . evaluation) pairs.\r\nIf ALLOW-PARTIAL? is non-nil, unevaluatable items are ignored.\nFor each item in ITEM-LIST, evaluate (FUNCTION item) and return a list of (item . evaluation) pairs.\nIf ALLOW-PARTIAL? is non-nil, unevaluatable items are ignored.")
    public static SubLObject cyc_evaluate_all_unary(final SubLObject function, final SubLObject item_list, SubLObject allow_partialP) {
        if (allow_partialP == UNPROVIDED) {
            allow_partialP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject contextualizedP = NIL;
        SubLObject cdolist_list_var = item_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject item_answer = cyc_evaluate(list(function, item));
            final SubLObject valid = thread.secondMultipleValue();
            final SubLObject this_one_contextualizedP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                v_answer = cons(cons(item, item_answer), v_answer);
                if (NIL != this_one_contextualizedP) {
                    contextualizedP = T;
                }
            } else
                if (NIL == allow_partialP) {
                    return invalid_evaluation();
                }

            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return valid_evaluation(nreverse(v_answer), contextualizedP);
    }

    public static final SubLObject cyc_evaluate_sort_alt(SubLObject sequence, SubLObject predicate, SubLObject key, SubLObject contextualizedP) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (contextualizedP == UNPROVIDED) {
            contextualizedP = NIL;
        }
        {
            SubLObject v_answer = NIL;
            SubLObject unevaluatable = NIL;
            try {
                v_answer = Sort.sort(sequence, predicate, key);
            } catch (Throwable ccatch_env_var) {
                unevaluatable = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
            }
            if (NIL != unevaluatable) {
                return com.cyc.cycjava.cycl.relation_evaluation.invalid_evaluation();
            } else {
                return com.cyc.cycjava.cycl.relation_evaluation.valid_evaluation(v_answer, contextualizedP);
            }
        }
    }

    public static SubLObject cyc_evaluate_sort(final SubLObject sequence, final SubLObject predicate, SubLObject key, SubLObject contextualizedP) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (contextualizedP == UNPROVIDED) {
            contextualizedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject unevaluatable = NIL;
        try {
            thread.throwStack.push($UNEVALUATABLE);
            v_answer = Sort.sort(sequence, predicate, key);
        } catch (final Throwable ccatch_env_var) {
            unevaluatable = Errors.handleThrowable(ccatch_env_var, $UNEVALUATABLE);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != unevaluatable) {
            return invalid_evaluation();
        }
        return valid_evaluation(v_answer, contextualizedP);
    }

    public static final SubLObject valid_evaluation_alt(SubLObject v_answer, SubLObject contextualizedP) {
        return values(v_answer, T, contextualizedP);
    }

    public static SubLObject valid_evaluation(final SubLObject v_answer, final SubLObject contextualizedP) {
        return values(v_answer, T, contextualizedP);
    }

    public static final SubLObject invalid_evaluation_alt() {
        return values(NIL, NIL, NIL);
    }

    public static SubLObject invalid_evaluation() {
        return values(NIL, NIL, NIL);
    }

    public static final SubLObject cyc_evaluate_internal_alt(SubLObject formula, SubLObject consider_expansionP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relation = cycl_utilities.formula_operator(formula);
                if (NIL == com.cyc.cycjava.cycl.relation_evaluation.evaluatable_relationP(relation)) {
                    com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject evaluation_function = com.cyc.cycjava.cycl.relation_evaluation.evaluation_function(relation);
                    if (!((NIL != eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function)) || ((NIL != consider_expansionP) && (NIL != czer_utilities.relation_has_expansionP(relation, UNPROVIDED))))) {
                        com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                    }
                    {
                        SubLObject input_args = cycl_utilities.formula_args(formula, UNPROVIDED);
                        SubLObject args = com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_args(input_args);
                        SubLObject v_answer = NIL;
                        com.cyc.cycjava.cycl.relation_evaluation.possibly_note_contextualized_evaluatable_relation(relation);
                        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function)) {
                            {
                                SubLObject _prev_bind_0 = $cyc_evaluate_relation$.currentBinding(thread);
                                try {
                                    $cyc_evaluate_relation$.bind(relation, thread);
                                    {
                                        SubLObject v_arity = com.cyc.cycjava.cycl.relation_evaluation.evaluation_arity(relation);
                                        if (NIL == v_arity) {
                                            v_answer = eval_in_api.possibly_cyc_api_funcall_1(evaluation_function, args);
                                        } else {
                                            if (!v_arity.numE(length(args))) {
                                                com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                                            }
                                            v_answer = eval_in_api.possibly_cyc_api_apply(evaluation_function, args);
                                        }
                                    }
                                } finally {
                                    $cyc_evaluate_relation$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (input_args.equal(args)) {
                                com.cyc.cycjava.cycl.relation_evaluation.note_evaluation_function_support(relation, evaluation_function);
                            } else {
                                com.cyc.cycjava.cycl.relation_evaluation.note_cyc_evaluate_final_support(v_answer, relation, args);
                            }
                            return v_answer;
                        } else {
                            {
                                SubLObject expanded_formula = verbosifier.el_expand_all(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                if (($RECURSION_LIMIT_EXCEEDED == expanded_formula) || expanded_formula.equal(formula)) {
                                    com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                                }
                                {
                                    SubLObject v_answer_1 = NIL;
                                    v_answer_1 = com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_if_evaluatable(expanded_formula, NIL);
                                    com.cyc.cycjava.cycl.relation_evaluation.note_cyc_evaluate_expansion_support(v_answer_1, expanded_formula);
                                    com.cyc.cycjava.cycl.relation_evaluation.note_expansion_support(formula, expanded_formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                    return v_answer_1;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_evaluate_internal(final SubLObject formula, final SubLObject consider_expansionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject relation = cycl_utilities.formula_operator(formula);
        if (NIL == evaluatable_relationP(relation)) {
            throw_unevaluatable();
        }
        final SubLObject evaluation_function = evaluation_function(relation);
        if ((NIL == eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function)) && ((NIL == consider_expansionP) || (NIL == czer_utilities.relation_has_expansionP(relation, UNPROVIDED)))) {
            throw_unevaluatable();
        }
        final SubLObject input_args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject args = cyc_evaluate_args(input_args);
        SubLObject v_answer = NIL;
        possibly_note_contextualized_evaluatable_relation(relation);
        if (NIL != eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function)) {
            final SubLObject _prev_bind_0 = $cyc_evaluate_relation$.currentBinding(thread);
            try {
                $cyc_evaluate_relation$.bind(relation, thread);
                final SubLObject v_arity = evaluation_arity(relation);
                if (NIL == v_arity) {
                    v_answer = eval_in_api.possibly_cyc_api_funcall_1(evaluation_function, args);
                } else {
                    if (!v_arity.numE(length(args))) {
                        throw_unevaluatable();
                    }
                    v_answer = eval_in_api.possibly_cyc_api_apply(evaluation_function, args);
                }
            } finally {
                $cyc_evaluate_relation$.rebind(_prev_bind_0, thread);
            }
            if (input_args.equal(args)) {
                note_evaluation_function_support(relation, evaluation_function);
            } else {
                note_cyc_evaluate_final_support(v_answer, relation, args);
            }
            return v_answer;
        }
        final SubLObject expanded_formula = verbosifier.el_expand_all_evaluatable(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        if (($RECURSION_LIMIT_EXCEEDED == expanded_formula) || expanded_formula.equal(formula)) {
            throw_unevaluatable();
        }
        SubLObject v_answer_$2 = NIL;
        v_answer_$2 = cyc_evaluate_if_evaluatable(expanded_formula, NIL);
        if ((v_answer_$2.equal(expanded_formula) && (NIL != el_grammar.el_sentence_p(expanded_formula))) && (NIL == ask_utilities.recursive_query(expanded_formula, UNPROVIDED, UNPROVIDED))) {
            v_answer_$2 = NIL;
        }
        if (NIL != v_answer_$2) {
            note_cyc_evaluate_expansion_support(v_answer_$2, expanded_formula);
            note_expansion_support(formula, expanded_formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
            return v_answer_$2;
        }
        return NIL;
    }

    /**
     * recursively evaluate any evaluatable ARGS
     */
    @LispMethod(comment = "recursively evaluate any evaluatable ARGS")
    public static final SubLObject cyc_evaluate_args_alt(SubLObject args) {
        return Mapping.mapcar(symbol_function(CYC_EVALUATE_ARG), args);
    }

    /**
     * recursively evaluate any evaluatable ARGS
     */
    @LispMethod(comment = "recursively evaluate any evaluatable ARGS")
    public static SubLObject cyc_evaluate_args(final SubLObject args) {
        return Mapping.mapcar(symbol_function(CYC_EVALUATE_ARG), args);
    }

    public static final SubLObject cyc_evaluate_arg_alt(SubLObject input_arg) {
        return com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_if_evaluatable(input_arg, T);
    }

    public static SubLObject cyc_evaluate_arg(final SubLObject input_arg) {
        return cyc_evaluate_if_evaluatable(input_arg, T);
    }

    /**
     * Recursively evaluate EXPRESSION if needed.
     */
    @LispMethod(comment = "Recursively evaluate EXPRESSION if needed.")
    public static final SubLObject cyc_evaluate_if_evaluatable_alt(SubLObject expression, SubLObject consider_expansionP) {
        if (consider_expansionP == UNPROVIDED) {
            consider_expansionP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.relation_evaluation.evaluatable_expressionP(expression)) {
                return expression;
            }
            {
                SubLObject evaluated_expression = NIL;
                {
                    SubLObject _prev_bind_0 = $cyc_evaluate_gather_justificationsP$.currentBinding(thread);
                    try {
                        $cyc_evaluate_gather_justificationsP$.bind(NIL, thread);
                        evaluated_expression = com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate_internal(expression, consider_expansionP);
                    } finally {
                        $cyc_evaluate_gather_justificationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                com.cyc.cycjava.cycl.relation_evaluation.note_cyc_evaluate_argument_support(evaluated_expression, expression);
                return evaluated_expression;
            }
        }
    }

    /**
     * Recursively evaluate EXPRESSION if needed.
     */
    @LispMethod(comment = "Recursively evaluate EXPRESSION if needed.")
    public static SubLObject cyc_evaluate_if_evaluatable(final SubLObject expression, SubLObject consider_expansionP) {
        if (consider_expansionP == UNPROVIDED) {
            consider_expansionP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == evaluatable_expressionP(expression)) {
            return expression;
        }
        SubLObject evaluated_expression = NIL;
        final SubLObject _prev_bind_0 = $cyc_evaluate_gather_justificationsP$.currentBinding(thread);
        try {
            $cyc_evaluate_gather_justificationsP$.bind(NIL, thread);
            evaluated_expression = cyc_evaluate_internal(expression, consider_expansionP);
        } finally {
            $cyc_evaluate_gather_justificationsP$.rebind(_prev_bind_0, thread);
        }
        note_cyc_evaluate_argument_support(evaluated_expression, expression);
        return evaluated_expression;
    }

    public static final SubLObject evaluation_function_alt(SubLObject relation) {
        if (NIL != forts.fort_p(relation)) {
            return com.cyc.cycjava.cycl.relation_evaluation.cached_evaluation_function(relation);
        } else {
            if (NIL != com.cyc.cycjava.cycl.relation_evaluation.function_to_arg_function_p(relation)) {
                return CYC_FUNCTION_TO_ARG;
            } else {
                if (NIL != lambda_function_p(relation)) {
                    return CYC_LAMBDA;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject evaluation_function(final SubLObject relation) {
        if (NIL != forts.fort_p(relation)) {
            return cached_evaluation_function(relation);
        }
        if (NIL != function_to_arg_function_p(relation)) {
            return CYC_FUNCTION_TO_ARG;
        }
        if (NIL != lambda_function_p(relation)) {
            return CYC_LAMBDA;
        }
        return NIL;
    }

    /**
     * Return the expected evaluation arity for RELATION.
     */
    @LispMethod(comment = "Return the expected evaluation arity for RELATION.")
    public static final SubLObject evaluation_arity_alt(SubLObject relation) {
        if (NIL != forts.fort_p(relation)) {
            return arity.arity(relation);
        } else {
            if (NIL != com.cyc.cycjava.cycl.relation_evaluation.function_to_arg_function_p(relation)) {
                {
                    SubLObject predicate = cycl_utilities.nat_arg2(relation, UNPROVIDED);
                    if (NIL != forts.fort_p(predicate)) {
                        {
                            SubLObject predicate_arity = arity.arity(predicate);
                            if (predicate_arity.isInteger() && predicate_arity.numG(ZERO_INTEGER)) {
                                return subtract(predicate_arity, ONE_INTEGER);
                            }
                        }
                    } else {
                        if (NIL != kappa_predicate_p(predicate)) {
                            {
                                SubLObject predicate_arity = kappa_predicate_arity(predicate);
                                if (predicate_arity.isInteger() && predicate_arity.numG(ZERO_INTEGER)) {
                                    return subtract(predicate_arity, ONE_INTEGER);
                                }
                            }
                        } else {
                            return NIL;
                        }
                    }
                }
            } else {
                if (NIL != lambda_function_p(relation)) {
                    return lambda_function_arity(relation);
                } else {
                    return NIL;
                }
            }
        }
        return NIL;
    }

    /**
     * Return the expected evaluation arity for RELATION.
     */
    @LispMethod(comment = "Return the expected evaluation arity for RELATION.")
    public static SubLObject evaluation_arity(final SubLObject relation) {
        if (NIL != forts.fort_p(relation)) {
            return arity.arity(relation);
        }
        if (NIL != function_to_arg_function_p(relation)) {
            final SubLObject predicate = cycl_utilities.nat_arg2(relation, UNPROVIDED);
            if (NIL != forts.fort_p(predicate)) {
                final SubLObject predicate_arity = arity.arity(predicate);
                if (predicate_arity.isInteger() && predicate_arity.numG(ZERO_INTEGER)) {
                    return subtract(predicate_arity, ONE_INTEGER);
                }
            } else {
                if (NIL == kappa_predicate_p(predicate)) {
                    return NIL;
                }
                final SubLObject predicate_arity = kappa_predicate_arity(predicate);
                if (predicate_arity.isInteger() && predicate_arity.numG(ZERO_INTEGER)) {
                    return subtract(predicate_arity, ONE_INTEGER);
                }
            }
            return NIL;
        }
        if (NIL != lambda_function_p(relation)) {
            return lambda_function_arity(relation);
        }
        return NIL;
    }

    public static final SubLObject clear_cached_evaluation_function_alt() {
        {
            SubLObject cs = $cached_evaluation_function_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_evaluation_function() {
        final SubLObject cs = $cached_evaluation_function_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_evaluation_function_alt(SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_evaluation_function_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_evaluation_function(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_evaluation_function_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_evaluation_function_internal_alt(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.relation_evaluation.evaluation_defn(relation, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject cached_evaluation_function_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = evaluation_defn(relation, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject cached_evaluation_function_alt(SubLObject relation) {
        {
            SubLObject caching_state = $cached_evaluation_function_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_EVALUATION_FUNCTION, $cached_evaluation_function_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_EVALUATION_FUNCTION);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, $kw16$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw16$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.relation_evaluation.cached_evaluation_function_internal(relation)));
                    memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_evaluation_function(final SubLObject relation) {
        SubLObject caching_state = $cached_evaluation_function_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_EVALUATION_FUNCTION, $cached_evaluation_function_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_EVALUATION_FUNCTION);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_evaluation_function_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject function_to_arg_function_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$FunctionToArg)) && (NIL != formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && cycl_utilities.nat_arg1(v_object, UNPROVIDED).isInteger()) && ((NIL != forts.fort_p(cycl_utilities.nat_arg2(v_object, UNPROVIDED))) || (NIL != kappa_predicate_p(cycl_utilities.nat_arg2(v_object, UNPROVIDED)))));
    }

    public static SubLObject function_to_arg_function_p(final SubLObject v_object) {
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$FunctionToArg)) && (NIL != formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && cycl_utilities.nat_arg1(v_object, UNPROVIDED).isInteger()) && ((NIL != forts.fort_p(cycl_utilities.nat_arg2(v_object, UNPROVIDED))) || (NIL != kappa_predicate_p(cycl_utilities.nat_arg2(v_object, UNPROVIDED)))));
    }

    public static final SubLObject cyc_function_to_arg_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject function_arg = cycl_utilities.nat_arg1($cyc_evaluate_relation$.getDynamicValue(thread), UNPROVIDED);
                SubLObject predicate = cycl_utilities.nat_arg2($cyc_evaluate_relation$.getDynamicValue(thread), UNPROVIDED);
                if (!function_arg.isInteger()) {
                    com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                }
                {
                    SubLObject call_arguments = delete(NIL, list(arg1, arg2, arg3, arg4, arg5, arg6), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != forts.fort_p(predicate)) {
                        {
                            SubLObject query = make_formula(predicate, call_arguments, UNPROVIDED);
                            SubLObject arg_position = nthcdr(subtract(function_arg, ONE_INTEGER), query);
                            SubLObject variable = $sym18$_VALUE;
                            rplacd(arg_position, cons(variable, arg_position.rest()));
                            {
                                SubLObject value = com.cyc.cycjava.cycl.relation_evaluation.cyc_function_to_arg_query(query, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                if (NIL == value) {
                                    com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                                }
                                return bindings.variable_binding_value(value.first().first());
                            }
                        }
                    } else {
                        if (NIL != kappa_predicate_p(predicate)) {
                            {
                                SubLObject kappa_query = kappa_predicate_query(predicate);
                                SubLObject formal_arguments = kappa_predicate_formal_args(predicate);
                                SubLObject answer_arg = nth(subtract(function_arg, ONE_INTEGER), formal_arguments);
                                SubLObject formal_argument_bindings = Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), remove(answer_arg, formal_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new SubLObject[]{ call_arguments });
                                kappa_query = bindings.apply_bindings(formal_argument_bindings, kappa_query);
                                {
                                    SubLObject value = com.cyc.cycjava.cycl.relation_evaluation.cyc_function_to_arg_query(kappa_query, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                    if (NIL == value) {
                                        com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                                    }
                                    return bindings.variable_binding_value(value.first().first());
                                }
                            }
                        } else {
                            com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cyc_function_to_arg(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function_arg = cycl_utilities.nat_arg1($cyc_evaluate_relation$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject predicate = cycl_utilities.nat_arg2($cyc_evaluate_relation$.getDynamicValue(thread), UNPROVIDED);
        if (!function_arg.isInteger()) {
            throw_unevaluatable();
        }
        final SubLObject call_arguments = delete(NIL, list(arg1, arg2, arg3, arg4, arg5, arg6), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject query = make_formula(predicate, call_arguments, UNPROVIDED);
            final SubLObject arg_position = nthcdr(subtract(function_arg, ONE_INTEGER), query);
            final SubLObject variable = $sym31$_VALUE;
            rplacd(arg_position, cons(variable, arg_position.rest()));
            final SubLObject value = cyc_function_to_arg_query(query, mt_relevance_macros.$mt$.getDynamicValue(thread));
            if (NIL == value) {
                throw_unevaluatable();
            }
            return bindings.variable_binding_value(value.first().first());
        }
        if (NIL != kappa_predicate_p(predicate)) {
            SubLObject kappa_query = kappa_predicate_query(predicate);
            final SubLObject formal_arguments = kappa_predicate_formal_args(predicate);
            final SubLObject answer_arg = nth(subtract(function_arg, ONE_INTEGER), formal_arguments);
            final SubLObject formal_argument_bindings = Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), remove(answer_arg, formal_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new SubLObject[]{ call_arguments });
            kappa_query = bindings.apply_bindings(formal_argument_bindings, kappa_query);
            final SubLObject value2 = cyc_function_to_arg_query(kappa_query, mt_relevance_macros.$mt$.getDynamicValue(thread));
            if (NIL == value2) {
                throw_unevaluatable();
            }
            return bindings.variable_binding_value(value2.first().first());
        }
        throw_unevaluatable();
        return NIL;
    }

    public static final SubLObject cyc_function_to_arg_query_alt(SubLObject query, SubLObject mt) {
        {
            SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(query, mt);
            query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
            query_properties = putf(query_properties, $kw21$ALLOW_INDETERMINATE_RESULTS_, T);
            query_properties = putf(query_properties, $ANSWER_LANGUAGE, $HL);
            return inference_recursive_query_unique_bindings(query, mt, query_properties);
        }
    }

    public static SubLObject cyc_function_to_arg_query(final SubLObject query, final SubLObject mt) {
        SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(query, mt);
        query_properties = putf(query_properties, $MAX_NUMBER, ONE_INTEGER);
        query_properties = putf(query_properties, $kw34$ALLOW_INDETERMINATE_RESULTS_, T);
        query_properties = putf(query_properties, $ANSWER_LANGUAGE, $HL);
        return ask_utilities.inference_recursive_query_unique_bindings(query, mt, query_properties);
    }

    public static final SubLObject cyc_lambda_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject call_arguments = delete(NIL, list(arg1, arg2, arg3, arg4, arg5, arg6), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject lambda = $cyc_evaluate_relation$.getDynamicValue(thread);
                SubLObject formal_arguments = lambda_function_formal_args(lambda);
                SubLObject formal_argument_bindings = Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), formal_arguments, new SubLObject[]{ call_arguments });
                SubLObject expression = lambda_function_expression(lambda);
                SubLObject answer_expression = bindings.apply_bindings(formal_argument_bindings, expression);
                if (NIL != com.cyc.cycjava.cycl.relation_evaluation.evaluatable_expressionP(answer_expression)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject evaluated_answer = com.cyc.cycjava.cycl.relation_evaluation.cyc_evaluate(answer_expression);
                        SubLObject evaluation_valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == evaluation_valid) {
                            com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable();
                        }
                        answer_expression = evaluated_answer;
                    }
                }
                return answer_expression;
            }
        }
    }

    public static SubLObject cyc_lambda(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject call_arguments = delete(NIL, list(arg1, arg2, arg3, arg4, arg5, arg6), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject lambda = $cyc_evaluate_relation$.getDynamicValue(thread);
        final SubLObject formal_arguments = lambda_function_formal_args(lambda);
        final SubLObject formal_argument_bindings = Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), formal_arguments, new SubLObject[]{ call_arguments });
        final SubLObject expression = lambda_function_expression(lambda);
        SubLObject answer_expression = bindings.apply_bindings(formal_argument_bindings, expression);
        if (NIL != evaluatable_expressionP(answer_expression)) {
            thread.resetMultipleValues();
            final SubLObject evaluated_answer = cyc_evaluate(answer_expression);
            final SubLObject evaluation_valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == evaluation_valid) {
                throw_unevaluatable();
            }
            answer_expression = evaluated_answer;
        }
        return answer_expression;
    }

    public static SubLObject declare_relation_evaluation_file() {
        declareFunction("evaluatable_functionP", "EVALUATABLE-FUNCTION?", 1, 0, false);
        declareFunction("evaluatable_predicateP", "EVALUATABLE-PREDICATE?", 1, 1, false);
        declareFunction("evaluatable_relationP", "EVALUATABLE-RELATION?", 1, 0, false);
        declareFunction("evaluatable_expressionP", "EVALUATABLE-EXPRESSION?", 1, 0, false);
        declareFunction("evaluation_defn", "EVALUATION-DEFN", 1, 1, false);
        declareFunction("cyc_evaluate_gathering_justificationsP", "CYC-EVALUATE-GATHERING-JUSTIFICATIONS?", 0, 0, false);
        declareFunction("cyc_evaluate_note_support", "CYC-EVALUATE-NOTE-SUPPORT", 1, 0, false);
        declareFunction("cyc_evaluate_justify", "CYC-EVALUATE-JUSTIFY", 1, 0, false);
        declareFunction("note_cyc_evaluate_argument_support", "NOTE-CYC-EVALUATE-ARGUMENT-SUPPORT", 2, 0, false);
        declareFunction("note_cyc_evaluate_final_support", "NOTE-CYC-EVALUATE-FINAL-SUPPORT", 3, 0, false);
        declareFunction("note_cyc_evaluate_expansion_support", "NOTE-CYC-EVALUATE-EXPANSION-SUPPORT", 2, 0, false);
        declareFunction("note_expansion_support", "NOTE-EXPANSION-SUPPORT", 3, 0, false);
        declareFunction("note_evaluation_function_support", "NOTE-EVALUATION-FUNCTION-SUPPORT", 2, 0, false);
        declareMacro("noting_unevaluatable", "NOTING-UNEVALUATABLE");
        declareFunction("throw_unevaluatable", "THROW-UNEVALUATABLE", 0, 0, false);
        declareMacro("noting_evaluation_failure", "NOTING-EVALUATION-FAILURE");
        declareMacro("ignoring_unevaluatable", "IGNORING-UNEVALUATABLE");
        declareFunction("possibly_note_contextualized_evaluatable_relation", "POSSIBLY-NOTE-CONTEXTUALIZED-EVALUATABLE-RELATION", 1, 0, false);
        declareFunction("cyc_evaluate", "CYC-EVALUATE", 1, 0, false);
        declareFunction("contains_an_unknown_scalar_intervalP", "CONTAINS-AN-UNKNOWN-SCALAR-INTERVAL?", 1, 0, false);
        declareFunction("unknown_scalar_interval_p", "UNKNOWN-SCALAR-INTERVAL-P", 1, 0, false);
        declareFunction("simplify_unknown_scalar_interval_evaluation", "SIMPLIFY-UNKNOWN-SCALAR-INTERVAL-EVALUATION", 1, 0, false);
        declareFunction("cyc_evaluate_all_unary", "CYC-EVALUATE-ALL-UNARY", 2, 1, false);
        declareFunction("cyc_evaluate_sort", "CYC-EVALUATE-SORT", 2, 2, false);
        declareFunction("valid_evaluation", "VALID-EVALUATION", 2, 0, false);
        declareFunction("invalid_evaluation", "INVALID-EVALUATION", 0, 0, false);
        declareFunction("cyc_evaluate_internal", "CYC-EVALUATE-INTERNAL", 2, 0, false);
        declareFunction("cyc_evaluate_args", "CYC-EVALUATE-ARGS", 1, 0, false);
        declareFunction("cyc_evaluate_arg", "CYC-EVALUATE-ARG", 1, 0, false);
        new relation_evaluation.$cyc_evaluate_arg$UnaryFunction();
        declareFunction("cyc_evaluate_if_evaluatable", "CYC-EVALUATE-IF-EVALUATABLE", 1, 1, false);
        declareFunction("evaluation_function", "EVALUATION-FUNCTION", 1, 0, false);
        declareFunction("evaluation_arity", "EVALUATION-ARITY", 1, 0, false);
        declareFunction("clear_cached_evaluation_function", "CLEAR-CACHED-EVALUATION-FUNCTION", 0, 0, false);
        new relation_evaluation.$clear_cached_evaluation_function$ZeroArityFunction();
        declareFunction("remove_cached_evaluation_function", "REMOVE-CACHED-EVALUATION-FUNCTION", 1, 0, false);
        declareFunction("cached_evaluation_function_internal", "CACHED-EVALUATION-FUNCTION-INTERNAL", 1, 0, false);
        declareFunction("cached_evaluation_function", "CACHED-EVALUATION-FUNCTION", 1, 0, false);
        declareFunction("function_to_arg_function_p", "FUNCTION-TO-ARG-FUNCTION-P", 1, 0, false);
        declareFunction("cyc_function_to_arg", "CYC-FUNCTION-TO-ARG", 0, 6, false);
        declareFunction("cyc_function_to_arg_query", "CYC-FUNCTION-TO-ARG-QUERY", 2, 0, false);
        declareFunction("cyc_lambda", "CYC-LAMBDA", 0, 6, false);
        return NIL;
    }

    public static SubLObject init_relation_evaluation_file() {
        defparameter("*CYC-EVALUATE-GATHER-JUSTIFICATIONS?*", NIL);
        defparameter("*CYC-EVALUATE-SUPPORTS*", NIL);
        defparameter("*CYC-EVALUATE-RELATION*", NIL);
        defparameter("*CYC-EVALUATE-SOME-CONTEXTUALIZED-RELATION?*", $UNBOUND);
        deflexical("*CACHED-EVALUATION-FUNCTION-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_relation_evaluation_file() {
        register_external_symbol(THROW_UNEVALUATABLE);
        note_funcall_helper_function(UNKNOWN_SCALAR_INTERVAL_P);
        memoization_state.note_globally_cached_function(CACHED_EVALUATION_FUNCTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_relation_evaluation_file();
    }

    @Override
    public void initializeVariables() {
        init_relation_evaluation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_relation_evaluation_file();
    }

    public static final SubLSymbol $kw16$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static {
    }

    public static final class $cyc_evaluate_arg$UnaryFunction extends UnaryFunction {
        public $cyc_evaluate_arg$UnaryFunction() {
            super(extractFunctionNamed("CYC-EVALUATE-ARG"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_evaluate_arg(arg1);
        }
    }

    static private final SubLSymbol $sym18$_VALUE = makeSymbol("?VALUE");

    public static final SubLSymbol $kw21$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    public static final class $clear_cached_evaluation_function$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cached_evaluation_function$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CACHED-EVALUATION-FUNCTION"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cached_evaluation_function();
        }
    }
}

/**
 * Total time: 472 ms
 */
