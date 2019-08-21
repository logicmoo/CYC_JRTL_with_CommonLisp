package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.clausifier.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class clausifier extends SubLTranslatedFile {
    public static final SubLFile me = new clausifier();

    public static final String myName = "com.cyc.cycjava.cycl.clausifier";

    public static final String myFingerPrint = "2a26a042856369a0884fd745608529436586d0f3e3ea3dcd653ed8f7d9756594";

    // defparameter
    public static final SubLSymbol $canonical_variable_name_stem$ = makeSymbol("*CANONICAL-VARIABLE-NAME-STEM*");

    // defparameter
    public static final SubLSymbol $use_cnf_cacheP$ = makeSymbol("*USE-CNF-CACHE?*");

    // defparameter
    // a temporary stack to record universals introduced by the clausifier
    private static final SubLSymbol $newly_introduced_universals$ = makeSymbol("*NEWLY-INTRODUCED-UNIVERSALS*");

    // defparameter
    /**
     * bound to the outermost implication in the do-implications recursive descent
     */
    private static final SubLSymbol $outermost_implication$ = makeSymbol("*OUTERMOST-IMPLICATION*");

    // defparameter
    /**
     * bound to the innermost implication in the do-implications recursive descent
     */
    private static final SubLSymbol $innermost_implication$ = makeSymbol("*INNERMOST-IMPLICATION*");

    // defparameter
    // Temporary control variable, @todo hard-code to t
    private static final SubLSymbol $eliminate_existential_with_var_only_in_antecedentP$ = makeSymbol("*ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?*");

    // defparameter
    // private dynamic variable used for quantification information
    private static final SubLSymbol $quantifier_info_list$ = makeSymbol("*QUANTIFIER-INFO-LIST*");

    // deflexical
    /**
     * The K^N over which a wff violation will be thrown rather than descending into
     * exponential madness.
     */
    private static final SubLSymbol $czer_bad_exponential_threshold$ = makeSymbol("*CZER-BAD-EXPONENTIAL-THRESHOLD*");

    // defparameter
    /**
     * Stores the sentence provided as input to el-xnf. Used while reporting wff
     * violations.
     */
    private static final SubLSymbol $clausifier_input_sentence$ = makeSymbol("*CLAUSIFIER-INPUT-SENTENCE*");

    // defparameter
    /**
     * Stores the mt provided as input to el-xnf. Used while reporting wff
     * violations.
     */
    private static final SubLSymbol $clausifier_input_mt$ = makeSymbol("*CLAUSIFIER-INPUT-MT*");



    // Internal Constants
    public static final SubLString $str0$el_var = makeString("el-var");





    public static final SubLSymbol DO_IMPLICATIONS_RECURSIVE = makeSymbol("DO-IMPLICATIONS-RECURSIVE");

    public static final SubLSymbol DO_NEGATIONS_DESTRUCTIVE = makeSymbol("DO-NEGATIONS-DESTRUCTIVE");

    private static final SubLSymbol $HELLO_YOU_SILLY_COMPILER = makeKeyword("HELLO-YOU-SILLY-COMPILER");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));



    public static final SubLString $str9$_s_is_not_a_quantified_sentence = makeString("~s is not a quantified sentence");

    public static final SubLSymbol NEGATE_NEGATION = makeSymbol("NEGATE-NEGATION");

    public static final SubLSymbol NEGATE_FORMULA = makeSymbol("NEGATE-FORMULA");

    private static final SubLObject $$DifferenceFn = reader_make_constant_shell(makeString("DifferenceFn"));

    public static final SubLString $str13$_s_contained_the_invalid_bound__D = makeString("~s contained the invalid bound ~D");

    private static final SubLObject $$PlusFn = reader_make_constant_shell(makeString("PlusFn"));





    public static final SubLSymbol $sym17$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    public static final SubLSymbol RECURSIVELY_STANDARDIZE_VARIABLES = makeSymbol("RECURSIVELY-STANDARDIZE-VARIABLES");

    public static final SubLSymbol EL_UNIQUIFY_STANDARDIZE = makeSymbol("EL-UNIQUIFY-STANDARDIZE");

    public static final SubLSymbol EL_VAR_WITHOUT_QUOTE = makeSymbol("EL-VAR-WITHOUT-QUOTE");



    public static final SubLString $str23$_ = makeString("-");

    public static final SubLSymbol CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = makeSymbol("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $QUANTIFIED_SEQUENCE_VARIABLE = makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");

    public static final SubLSymbol EXISTENTIALS_OUT_INT = makeSymbol("EXISTENTIALS-OUT-INT");

    public static final SubLString $str29$Unexpected_sentence_type_in_exist = makeString("Unexpected sentence type in existentials-out-int: ~S");

    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));











    public static final SubLString $str36$Skolemizer_failed_to_classify_var = makeString("Skolemizer failed to classify variable ~a in sentence ~a~%");

    public static final SubLString $str37$skolem_constants_not_yet_supporte = makeString("skolem constants not yet supported");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$SkolemFunctionFn = reader_make_constant_shell(makeString("SkolemFunctionFn"));

    private static final SubLObject $$SkolemFuncNFn = reader_make_constant_shell(makeString("SkolemFuncNFn"));

    public static final SubLString $str41$make_skolem_fn_fn_doesn_t_know_ho = makeString("make-skolem-fn-fn doesn't know how to handle the quantifier ~S");



    public static final SubLString $str43$Unexpected_value_for__forbid_quan = makeString("Unexpected value for *forbid-quantified-sequence-variables?*: ~s");

    public static final SubLSymbol UNIVERSALS_OUT = makeSymbol("UNIVERSALS-OUT");

    public static final SubLString $str45$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in universals-out.");

    public static final SubLSymbol DISJUNCTIONS_IN = makeSymbol("DISJUNCTIONS-IN");

    public static final SubLString $str47$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in disjunctions-in.");

    public static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

    private static final SubLSymbol $BAD_EXPONENTIAL_DISJUNCTION = makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");

    private static final SubLInteger $int$200000 = makeInteger(200000);

    public static final SubLSymbol FORMULA_ARITY = makeSymbol("FORMULA-ARITY");

    public static final SubLString $str52$_s_is_not_a_conjunction__so_it_is = makeString("~s is not a conjunction, so it is not a CNF sentence.");

    public static final SubLString $str53$_s_is_not_a_disjunction__so__S_is = makeString("~s is not a disjunction, so ~S is not a CNF sentence.");

    public static final SubLSymbol CONJUNCTIONS_IN = makeSymbol("CONJUNCTIONS-IN");

    public static final SubLString $str55$Got_the_unexpected_formula__S_in_ = makeString("Got the unexpected formula ~S in conjunctions-in.");

    public static final SubLSymbol EL_DISJUNCTION_P = makeSymbol("EL-DISJUNCTION-P");

    private static final SubLSymbol $BAD_EXPONENTIAL_CONJUNCTION = makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");

    public static final SubLString $str58$_s_is_not_a_disjunction__so_it_is = makeString("~s is not a disjunction, so it is not a DNF sentence.");

    public static final SubLString $str59$_s_is_not_a_conjunction__so__S_is = makeString("~s is not a conjunction, so ~S is not a DNF sentence.");

    public static final SubLSymbol PACKAGE_XNF_CLAUSE = makeSymbol("PACKAGE-XNF-CLAUSE");



    public static final SubLSymbol $sym62$EL_VAR_ = makeSymbol("EL-VAR?");

    public static final SubLSymbol LEADING_UNIVERSAL_VARIABLES_1 = makeSymbol("LEADING-UNIVERSAL-VARIABLES-1");

    public static final SubLSymbol $sym64$STRING_ = makeSymbol("STRING<");



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));





    public static final SubLSymbol CACHED_CNF_CLAUSAL_FORM = makeSymbol("CACHED-CNF-CLAUSAL-FORM");

    public static final SubLSymbol $cached_cnf_clausal_form_caching_state$ = makeSymbol("*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*");

    private static final SubLInteger $int$48 = makeInteger(48);

    public static SubLObject do_implications(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $outermost_implication$.currentBinding(thread);
        try {
            $outermost_implication$.bind(sentence, thread);
            result = do_implications_recursive(sentence);
        } finally {
            $outermost_implication$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject do_implications_recursive(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_utilities.encapsulate_formulaP(sentence)) {
            if (NIL != eliminate_existential_with_var_only_in_antecedentP(sentence, $innermost_implication$.getDynamicValue(thread), $outermost_implication$.getDynamicValue(thread))) {
                return do_implications_recursive(quantified_sub_sentence(sentence));
            }
            return czer_utilities.encapsulate_formula(sentence, UNPROVIDED);
        } else {
            if (NIL == el_formula_p(sentence)) {
                return sentence;
            }
            final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
            final SubLObject sentence_$1 = (NIL != seqvar) ? strip_sequence_var(sentence) : sentence;
            SubLObject result = NIL;
            if ((NIL != el_implication_p(sentence_$1)) && (NIL != el_meets_pragmatic_requirement_p(cycl_utilities.sentence_arg2(sentence_$1, UNPROVIDED)))) {
                SubLObject disjunct_1 = NIL;
                final SubLObject _prev_bind_0 = $innermost_implication$.currentBinding(thread);
                try {
                    $innermost_implication$.bind(sentence_$1, thread);
                    final SubLObject _prev_bind_0_$2 = $within_ask$.currentBinding(thread);
                    try {
                        $within_ask$.bind(T, thread);
                        disjunct_1 = make_negation(funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_$1, ONE_INTEGER));
                    } finally {
                        $within_ask$.rebind(_prev_bind_0_$2, thread);
                    }
                    result = make_disjunction(list(disjunct_1, funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_$1, TWO_INTEGER)));
                } finally {
                    $innermost_implication$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != el_implication_p(sentence_$1)) {
                    SubLObject disjunct_1 = NIL;
                    final SubLObject _prev_bind_0 = $innermost_implication$.currentBinding(thread);
                    try {
                        $innermost_implication$.bind(sentence_$1, thread);
                        final SubLObject _prev_bind_0_$3 = at_vars.$within_disjunctionP$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = czer_vars.$within_negationP$.currentBinding(thread);
                        try {
                            at_vars.$within_disjunctionP$.bind(T, thread);
                            at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                            czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                            disjunct_1 = make_negation(funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_$1, ONE_INTEGER));
                        } finally {
                            czer_vars.$within_negationP$.rebind(_prev_bind_3, thread);
                            at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_2, thread);
                            at_vars.$within_disjunctionP$.rebind(_prev_bind_0_$3, thread);
                        }
                        result = make_disjunction(list(disjunct_1, funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_$1, TWO_INTEGER)));
                    } finally {
                        $innermost_implication$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    result = pass_through_if_logical_op_or_quantified(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_$1);
                }

            if (NIL != seqvar) {
                return nadd_sequence_var_to_end(seqvar, result);
            }
            return result;
        }
    }

    public static SubLObject eliminate_existential_with_var_only_in_antecedentP(final SubLObject existential, final SubLObject innermost_implication, final SubLObject outermost_implication) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $eliminate_existential_with_var_only_in_antecedentP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (((innermost_implication.eql(outermost_implication) && (NIL != misc_utilities.initialized_p(innermost_implication))) && (NIL != el_existential_p(existential))) && (NIL == el_abnormal_p(cycl_utilities.formula_arg2(outermost_implication, UNPROVIDED)))) {
            final SubLObject var = quantified_var(existential);
            return sublisp_null(cycl_utilities.expression_find(var, cycl_utilities.formula_arg2(innermost_implication, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject do_negations(final SubLObject sentence) {
        return do_negations_destructive(copy_formula(sentence));
    }

    public static SubLObject do_negations_destructive(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
        final SubLObject sentence_$4 = (NIL != seqvar) ? strip_sequence_var(sentence) : sentence;
        SubLObject result = NIL;
        if (NIL != czer_utilities.encapsulate_formulaP(sentence_$4)) {
            result = czer_utilities.encapsulate_formula(sentence_$4, UNPROVIDED);
        } else
            if (NIL == el_formula_p(sentence_$4)) {
                result = sentence_$4;
            } else
                if (NIL != czer_utilities.true_negated_varP(sentence_$4, UNPROVIDED)) {
                    result = lift_negation(sentence_$4);
                } else
                    if (NIL != czer_utilities.true_negated_formulaP(sentence_$4)) {
                        if (NIL != czer_utilities.within_disjunctionP()) {
                            result = lift_negation(sentence_$4);
                        } else {
                            final SubLObject _prev_bind_0 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                            try {
                                czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
                                czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                                result = make_unary_formula(cycl_utilities.formula_operator(sentence_$4), funcall_formula_arg(symbol_function(DO_NEGATIONS_DESTRUCTIVE), sentence_$4, ONE_INTEGER));
                            } finally {
                                czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_2, thread);
                                czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else
                        if (NIL != el_implication_p(sentence_$4)) {
                            result = do_negations_destructive(do_implications(sentence_$4));
                        } else
                            if (NIL != el_negation_p(sentence_$4)) {
                                if (NIL != cycl_utilities.opaque_argP(sentence_$4, ONE_INTEGER)) {
                                    result = sentence_$4;
                                } else {
                                    SubLObject new_sentence = NIL;
                                    final SubLObject _prev_bind_3 = czer_vars.$within_negationP$.currentBinding(thread);
                                    try {
                                        czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                                        new_sentence = negation_in(sentence_$4);
                                    } finally {
                                        czer_vars.$within_negationP$.rebind(_prev_bind_3, thread);
                                    }
                                    if (NIL != el_negation_p(new_sentence)) {
                                        result = new_sentence;
                                    } else {
                                        result = do_negations_destructive(new_sentence);
                                    }
                                }
                            } else {
                                result = pass_through_if_logical_op_or_quantified(symbol_function(DO_NEGATIONS_DESTRUCTIVE), sentence_$4);
                            }





        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }

    public static SubLObject negate_formula(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sentence.eql($$True)) {
            return $$False;
        }
        if (sentence.eql($$False)) {
            return $$True;
        }
        if (NIL != czer_utilities.encapsulate_formulaP(sentence)) {
            return negate_encapsulate_sentence(sentence);
        }
        if (NIL != el_conjunction_p(sentence)) {
            return negate_conjunction(sentence);
        }
        if (NIL != el_disjunction_p(sentence)) {
            return negate_disjunction_destructive(sentence);
        }
        if (NIL != el_negation_p(sentence)) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
            try {
                czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                result = negation_in(negate_negation(sentence));
            } finally {
                czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        if (NIL != cycl_universal_p(sentence)) {
            return negate_universal(sentence);
        }
        if (NIL != el_existential_p(sentence)) {
            return negate_existential(sentence);
        }
        if (NIL != el_existential_min_p(sentence)) {
            return negate_existential_min(sentence);
        }
        if (NIL != el_existential_max_p(sentence)) {
            return negate_existential_max(sentence);
        }
        if (NIL != el_existential_exact_p(sentence)) {
            return negate_existential_exact(sentence);
        }
        if (NIL != czer_utilities.true_negated_varP(sentence, UNPROVIDED)) {
            return lift_negation(sentence);
        }
        if (NIL != czer_utilities.true_negated_formulaP(sentence)) {
            return negate_true_sentence(sentence);
        }
        if (NIL != el_implication_p(sentence)) {
            return uncanonicalizer.implications_in(do_negations_destructive(do_implications(cycl_utilities.negate(sentence))));
        }
        return make_negation(sentence);
    }

    public static SubLObject negation_in(final SubLObject sentence) {
        if (NIL == el_negation_p(sentence)) {
            return sentence;
        }
        return negate_formula(cycl_utilities.formula_arg1(sentence, $REGULARIZE));
    }

    public static SubLObject negate_quantified_sentence(final SubLObject sentence) {
        if (NIL != cycl_universal_p(sentence)) {
            return negate_universal(sentence);
        }
        if (NIL != el_existential_p(sentence)) {
            return negate_existential(sentence);
        }
        if (NIL != el_existential_min_p(sentence)) {
            return negate_existential_min(sentence);
        }
        if (NIL != el_existential_max_p(sentence)) {
            return negate_existential_max(sentence);
        }
        if (NIL != el_existential_exact_p(sentence)) {
            return negate_existential_exact(sentence);
        }
        el_error(FOUR_INTEGER, $str9$_s_is_not_a_quantified_sentence, sentence, UNPROVIDED, UNPROVIDED);
        return sentence;
    }

    public static SubLObject negate_atomic(final SubLObject sentence) {
        return make_negation(sentence);
    }

    public static SubLObject negate_negation(final SubLObject negation) {
        return cycl_utilities.formula_arg1(negation, UNPROVIDED);
    }

    public static SubLObject negate_negations(final SubLObject negations) {
        return list_utilities.nmapcar(symbol_function(NEGATE_NEGATION), negations);
    }

    public static SubLObject negate_conjunction(final SubLObject conjunction) {
        return simplifier.ndisjoin(Mapping.mapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, UNPROVIDED)), UNPROVIDED);
    }

    public static SubLObject negate_conjunction_destructive(final SubLObject conjunction) {
        return simplifier.ndisjoin(list_utilities.nmapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, UNPROVIDED)), UNPROVIDED);
    }

    public static SubLObject negate_disjunction_destructive(final SubLObject disjunction) {
        return simplifier.nconjoin(list_utilities.nmapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(disjunction, UNPROVIDED)), UNPROVIDED);
    }

    public static SubLObject negate_universal(final SubLObject universal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = unmake_binary_formula(universal);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return make_existential(variable, negate_formula(subform));
    }

    public static SubLObject negate_existential(final SubLObject existential) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = unmake_binary_formula(existential);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return make_universal(variable, negate_formula(subform));
    }

    public static SubLObject negate_existential_min(final SubLObject existential_min) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = unmake_ternary_formula(existential_min);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject subform = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (!number.isInteger()) {
            return make_existential_max(make_binary_formula($$DifferenceFn, number, ONE_INTEGER), variable, subform);
        }
        if (number.numE(ONE_INTEGER)) {
            return make_universal(variable, negate_formula(subform));
        }
        if (number.numG(ONE_INTEGER)) {
            return make_existential_max(subtract(number, ONE_INTEGER), variable, subform);
        }
        el_error(FOUR_INTEGER, $str13$_s_contained_the_invalid_bound__D, existential_min, number, UNPROVIDED);
        return NIL;
    }

    public static SubLObject negate_existential_max(final SubLObject existential_max) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = unmake_ternary_formula(existential_max);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject subform = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (!number.isInteger()) {
            return make_existential_min(make_binary_formula($$PlusFn, number, ONE_INTEGER), variable, subform);
        }
        if (number.numG(ZERO_INTEGER)) {
            return make_existential_min(add(number, ONE_INTEGER), variable, subform);
        }
        el_error(FOUR_INTEGER, $str13$_s_contained_the_invalid_bound__D, existential_max, number, UNPROVIDED);
        return NIL;
    }

    public static SubLObject negate_existential_exact(final SubLObject existential_exact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = unmake_ternary_formula(existential_exact);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject variable = thread.thirdMultipleValue();
        final SubLObject subform = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (!number.isInteger()) {
            return simplifier.ndisjoin(list(make_existential_min(make_binary_formula($$PlusFn, number, ONE_INTEGER), variable, subform), make_existential_max(make_binary_formula($$DifferenceFn, number, ONE_INTEGER), variable, subform)), UNPROVIDED);
        }
        if (number.numE(ONE_INTEGER)) {
            return simplifier.ndisjoin(list(make_universal(variable, negate_formula(subform)), make_existential_min(TWO_INTEGER, variable, subform)), UNPROVIDED);
        }
        if (number.numG(ONE_INTEGER)) {
            return simplifier.ndisjoin(list(make_existential_min(add(number, ONE_INTEGER), variable, subform), make_existential_max(subtract(number, ONE_INTEGER), variable, subform)), UNPROVIDED);
        }
        el_error(FOUR_INTEGER, $str13$_s_contained_the_invalid_bound__D, existential_exact, number, UNPROVIDED);
        return NIL;
    }

    public static SubLObject negate_true_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sub_sentence = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$within_negationP$.currentBinding(thread);
        try {
            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
            czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
            sub_sentence = do_negations_destructive(cycl_utilities.sentence_arg1(sentence, UNPROVIDED));
        } finally {
            czer_vars.$within_negationP$.rebind(_prev_bind_2, thread);
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
        }
        return negate_atomic(make_unary_formula(cycl_utilities.sentence_arg0(sentence), sub_sentence));
    }

    public static SubLObject negate_encapsulate_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $within_ask$.getDynamicValue(thread)) && (NIL != possibly_el_quantified_sentence_p(sentence))) {
            return czer_utilities.make_intensional_lit(negate_quantified_sentence(sentence));
        }
        return negate_atomic(czer_utilities.encapsulate_formula(sentence, UNPROVIDED));
    }

    public static SubLObject lift_negation(final SubLObject sentence) {
        if (NIL == el_unary_formula_p(sentence)) {
            return sentence;
        }
        final SubLObject operator = cycl_utilities.sentence_arg0(sentence);
        final SubLObject sub_sentence = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        if (NIL != czer_utilities.true_negated_varP(sentence, UNPROVIDED)) {
            final SubLObject unnegated_arg = cycl_utilities.sentence_arg1(sub_sentence, UNPROVIDED);
            return negate_atomic(make_unary_formula(operator, unnegated_arg));
        }
        if (NIL != el_negation_p(sub_sentence)) {
            final SubLObject unnegated_arg = do_negations_destructive(cycl_utilities.sentence_arg1(sub_sentence, UNPROVIDED));
            return negate_atomic(make_unary_formula(operator, unnegated_arg));
        }
        if (NIL != el_quantified_negation_p(sub_sentence)) {
            final SubLObject unnegated_arg = negate_quantified_sentence(sub_sentence);
            return negate_atomic(make_unary_formula(operator, unnegated_arg));
        }
        return sentence;
    }

    public static SubLObject czer_explicitify_implicit_quantifiers(final SubLObject sentence) {
        if (NIL != assume_free_vars_are_existentially_boundP()) {
            return czer_explicitify_implicit_existential_quantifiers(sentence);
        }
        return czer_explicitify_implicit_universal_quantifiers(sentence);
    }

    public static SubLObject czer_explicitify_implicit_universal_quantifiers(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject free_vars = cdolist_list_var = sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentence = make_universal(var, sentence);
            if ($newly_introduced_universals$.getDynamicValue(thread).isList()) {
                $newly_introduced_universals$.setDynamicValue(cons(var, $newly_introduced_universals$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return sentence;
    }

    public static SubLObject czer_explicitify_implicit_existential_quantifiers(final SubLObject sentence) {
        return explicitify_implicit_existential_quantifiers(sentence);
    }

    public static SubLObject assume_free_vars_are_existentially_boundP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$assume_free_vars_are_existentially_boundP$.getDynamicValue(thread);
    }

    public static SubLObject standardize_sentence_variables(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_formula_p(sentence) : "el_utilities.el_formula_p(sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(sentence) " + sentence;
        SubLObject v_return = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
            czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : NIL, thread);
            v_return = standardize_variables(copy_tree(sentence));
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_3, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_2, thread);
            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return v_return;
    }

    public static SubLObject standardize_variables(final SubLObject sentence) {
        if (NIL != groundP(sentence, UNPROVIDED)) {
            return sentence;
        }
        final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
        final SubLObject sentence_$5 = (NIL != seqvar) ? strip_sequence_var(sentence) : sentence;
        SubLObject result = NIL;
        czer_main.initialize_symbol_suffix_table(sentence_$5);
        result = recursively_standardize_variables(sentence_$5);
        result = czer_main.el_nununiquify_vars_int(result, T, UNPROVIDED);
        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }

    public static SubLObject recursively_standardize_variables(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_p(sentence)) {
            return sentence;
        }
        if ((NIL != cycl_grammar.fast_escape_quote_term_p(sentence)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(sentence))) {
            SubLObject standardized = NIL;
            final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
                czer_vars.$inside_quote$.bind(NIL, thread);
                standardized = make_unary_formula(cycl_utilities.formula_arg0(sentence), recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, UNPROVIDED)));
            } finally {
                czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
            return standardized;
        }
        if (NIL != cycl_grammar.fast_quote_term_p(sentence)) {
            if (NIL == list_utilities.tree_find_if($sym17$CYC_VAR_, sentence, UNPROVIDED)) {
                return sentence;
            }
            SubLObject standardized = NIL;
            final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
                czer_vars.$inside_quote$.bind(T, thread);
                standardized = make_unary_formula($$Quote, recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, UNPROVIDED)));
            } finally {
                czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
            return standardized;
        } else {
            if (NIL != possibly_el_regularly_quantified_sentence_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = unmake_binary_formula(sentence);
                final SubLObject old_var = thread.secondMultipleValue();
                final SubLObject subform = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject standardized_subform = funcall_formula_arg(RECURSIVELY_STANDARDIZE_VARIABLES, sentence, TWO_INTEGER);
                final SubLObject new_var = el_uniquify_standardize(old_var);
                final SubLObject replace_old_var = el_var_without_quote(old_var);
                final SubLObject replace_new_var = el_var_without_quote(new_var);
                SubLObject standardized2 = NIL;
                remember_variable_rename(replace_old_var, replace_new_var);
                final SubLObject _prev_bind_2 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                try {
                    czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                    standardized2 = make_binary_formula(quantifier, new_var, cycl_utilities.expression_nsubst_free_vars(replace_new_var, replace_old_var, standardized_subform, UNPROVIDED));
                } finally {
                    czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_2, thread);
                }
                return standardized2;
            }
            if (NIL != el_bounded_existential_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = unmake_ternary_formula(sentence);
                final SubLObject bound = thread.secondMultipleValue();
                final SubLObject old_var2 = thread.thirdMultipleValue();
                final SubLObject subform2 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                final SubLObject standardized_subform2 = funcall_formula_arg(RECURSIVELY_STANDARDIZE_VARIABLES, sentence, THREE_INTEGER);
                final SubLObject new_var2 = el_uniquify_standardize(old_var2);
                final SubLObject replace_old_var2 = el_var_without_quote(old_var2);
                final SubLObject replace_new_var2 = el_var_without_quote(new_var2);
                SubLObject standardized3 = NIL;
                remember_variable_rename(replace_old_var2, replace_new_var2);
                final SubLObject _prev_bind_3 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                try {
                    czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                    standardized3 = make_ternary_formula(quantifier, bound, new_var2, cycl_utilities.expression_nsubst_free_vars(replace_new_var2, replace_old_var2, standardized_subform2, UNPROVIDED));
                } finally {
                    czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_3, thread);
                }
                return standardized3;
            }
            if (NIL != czer_trampolines.czer_scoping_formulaP(sentence)) {
                final SubLObject scoped_vars = czer_trampolines.czer_scoped_vars(sentence);
                final SubLObject unique_vars = Mapping.mapcar(EL_UNIQUIFY_STANDARDIZE, scoped_vars);
                final SubLObject scoping_args = czer_trampolines.czer_scoping_args(cycl_utilities.formula_operator(sentence));
                final SubLObject replace_scoped_vars = Mapping.mapcar(EL_VAR_WITHOUT_QUOTE, scoped_vars);
                final SubLObject replace_unique_vars = Mapping.mapcar(EL_VAR_WITHOUT_QUOTE, unique_vars);
                SubLObject new_sentence = NIL;
                final SubLObject terms = cycl_utilities.formula_terms(sentence, $IGNORE);
                SubLObject list_var = NIL;
                SubLObject arg = NIL;
                SubLObject argnum = NIL;
                list_var = terms;
                arg = list_var.first();
                for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                    if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                        new_sentence = cons(arg, new_sentence);
                    } else {
                        new_sentence = cons(funcall_formula_arg(RECURSIVELY_STANDARDIZE_VARIABLES, sentence, argnum), new_sentence);
                    }
                }
                remember_variables_rename(replace_scoped_vars, replace_unique_vars);
                return nreverse(cycl_utilities.expression_sublis(pairlis(replace_scoped_vars, replace_unique_vars, UNPROVIDED), new_sentence, UNPROVIDED, UNPROVIDED));
            }
            return pass_through_if_relation_syntax(RECURSIVELY_STANDARDIZE_VARIABLES, sentence);
        }
    }

    public static SubLObject el_uniquify_standardize(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$inside_quote$.getDynamicValue(thread)) {
            return el_uniquify(var);
        }
        if ((NIL != cycl_grammar.fast_escape_quote_term_p(var)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(var))) {
            return make_unary_formula(cycl_utilities.formula_arg0(var), el_uniquify(cycl_utilities.formula_arg1(var, UNPROVIDED)));
        }
        return var;
    }

    public static SubLObject el_var_without_quote(final SubLObject var) {
        if ((NIL != cycl_grammar.fast_escape_quote_term_p(var)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(var))) {
            return cycl_utilities.formula_arg1(var, UNPROVIDED);
        }
        return var;
    }

    public static SubLObject remember_variable_rename(final SubLObject old_var, final SubLObject new_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$standardize_variables_memory$.setDynamicValue(cons(cons(old_var, new_var), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject remember_variables_rename(final SubLObject old_vars, final SubLObject new_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$standardize_variables_memory$.setDynamicValue(append(pairlis(old_vars, new_vars, UNPROVIDED), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject el_uniquify(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject integer = czer_main.extract_name_uniquifying_post_hyphen_integer(var);
        SubLObject symbol = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == symbol) {
            symbol = var;
        }
        if (NIL == integer) {
            integer = ZERO_INTEGER;
        }
        SubLObject n = gethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == n) {
            n = MINUS_ONE_INTEGER;
        }
        n = max(n, integer);
        n = add(n, ONE_INTEGER);
        sethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), n);
        final SubLObject unique_string = (n.isZero()) ? format_nil.format_nil_a(cycl_variables.variable_name(symbol)) : cconcatenate(format_nil.format_nil_a_no_copy(cycl_variables.variable_name(symbol)), new SubLObject[]{ $str23$_, format_nil.format_nil_a_no_copy(string_utilities.object_to_string(n)) });
        if (NIL != cycl_variables.keyword_varP(symbol)) {
            return cycl_variables.make_keyword_var(unique_string);
        }
        return cycl_variables.make_el_var(unique_string);
    }

    public static SubLObject existentials_out(SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$turn_existentials_into_skolemsP$.getDynamicValue(thread)) {
            if (NIL == list_utilities.tree_find_if(CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, sentence, UNPROVIDED)) {
                return sentence;
            }
            SubLObject error = NIL;
            try {
                thread.throwStack.push($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
                try {
                    thread.throwStack.push($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE);
                    try {
                        thread.throwStack.push($QUANTIFIED_SEQUENCE_VARIABLE);
                        final SubLObject _prev_bind_0 = $quantifier_info_list$.currentBinding(thread);
                        try {
                            $quantifier_info_list$.bind(NIL, thread);
                            sentence = existentials_out_int(sentence);
                        } finally {
                            $quantifier_info_list$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $QUANTIFIED_SEQUENCE_VARIABLE);
                    } finally {
                        thread.throwStack.pop();
                    }
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE);
                } finally {
                    thread.throwStack.pop();
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error) {
                if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                    wff.note_wff_violation(error);
                }
                return NIL;
            }
        }
        return sentence;
    }

    public static SubLObject existentials_out_int(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = sentence;
        final SubLObject _prev_bind_0 = $quantifier_info_list$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            $quantifier_info_list$.bind($quantifier_info_list$.getDynamicValue(thread), thread);
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if (NIL != cycl_universal_p(sentence)) {
                thread.resetMultipleValues();
                final SubLObject quantifier = unmake_binary_formula(sentence);
                final SubLObject var = thread.secondMultipleValue();
                final SubLObject subform = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                $quantifier_info_list$.setDynamicValue(cons(list(quantifier, NIL, var, sentence_free_term_variables(subform, UNPROVIDED, UNPROVIDED), sentence_free_sequence_variables(subform, UNPROVIDED, UNPROVIDED)), $quantifier_info_list$.getDynamicValue(thread)), thread);
                result = make_universal(var, funcall_formula_arg(symbol_function(EXISTENTIALS_OUT_INT), sentence, TWO_INTEGER));
            } else
                if (NIL != el_existential_p(sentence)) {
                    thread.resetMultipleValues();
                    final SubLObject quantifier = unmake_binary_formula(sentence);
                    final SubLObject var = thread.secondMultipleValue();
                    final SubLObject subform = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    $quantifier_info_list$.setDynamicValue(cons(list(quantifier, NIL, var, sentence_free_term_variables(subform, UNPROVIDED, UNPROVIDED), sentence_free_sequence_variables(subform, UNPROVIDED, UNPROVIDED)), $quantifier_info_list$.getDynamicValue(thread)), thread);
                    result = funcall_formula_arg(symbol_function(EXISTENTIALS_OUT_INT), sentence, TWO_INTEGER);
                } else
                    if (NIL != el_bounded_existential_p(sentence)) {
                        thread.resetMultipleValues();
                        final SubLObject quantifier = unmake_ternary_formula(sentence);
                        final SubLObject num = thread.secondMultipleValue();
                        final SubLObject var2 = thread.thirdMultipleValue();
                        final SubLObject subform2 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        $quantifier_info_list$.setDynamicValue(cons(list(quantifier, num, var2, sentence_free_term_variables(subform2, UNPROVIDED, UNPROVIDED), sentence_free_sequence_variables(subform2, UNPROVIDED, UNPROVIDED)), $quantifier_info_list$.getDynamicValue(thread)), thread);
                        result = funcall_formula_arg(symbol_function(EXISTENTIALS_OUT_INT), sentence, THREE_INTEGER);
                    } else
                        if (NIL != el_logical_operator_formula_p(sentence)) {
                            result = pass_through_if_logical_op(symbol_function(EXISTENTIALS_OUT_INT), sentence);
                        } else
                            if ((NIL != within_askP()) && (NIL != ist_sentence_p(sentence, UNPROVIDED))) {
                                thread.resetMultipleValues();
                                final SubLObject ist = unmake_binary_formula(sentence);
                                final SubLObject mt = thread.secondMultipleValue();
                                final SubLObject subsentence = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                final SubLObject canonical_subsentence = existentials_out_int(subsentence);
                                result = skolemize_atomic_sentence(make_ist_sentence(mt, canonical_subsentence), $quantifier_info_list$.getDynamicValue(thread));
                            } else
                                if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
                                    result = skolemize_atomic_sentence(sentence, $quantifier_info_list$.getDynamicValue(thread));
                                } else
                                    if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                                        result = skolemize_atomic_sentence(sentence, $quantifier_info_list$.getDynamicValue(thread));
                                    } else {
                                        el_error(FOUR_INTEGER, $str29$Unexpected_sentence_type_in_exist, sentence, UNPROVIDED, UNPROVIDED);
                                    }






        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_5, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_4, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_2, thread);
            $quantifier_info_list$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject skolemize_atomic_sentence(final SubLObject sentence, final SubLObject quantifier_info_list) {
        SubLObject result = sentence;
        SubLObject quantifier_info_list_in_scope = NIL;
        SubLObject curr_quant_info = NIL;
        SubLObject curr_quant = NIL;
        SubLObject curr_num = NIL;
        SubLObject curr_var = NIL;
        SubLObject curr_free_term_vars = NIL;
        SubLObject curr_free_sequence_vars = NIL;
        quantifier_info_list_in_scope = quantifier_info_list;
        curr_quant_info = quantifier_info_list_in_scope.first();
        curr_quant = curr_quant_info.first();
        curr_num = second(curr_quant_info);
        curr_var = third(curr_quant_info);
        curr_free_term_vars = fourth(curr_quant_info);
        curr_free_sequence_vars = fifth(curr_quant_info);
        while (NIL != quantifier_info_list_in_scope) {
            if (NIL != cyc_const_general_existential_operator_p(curr_quant)) {
                result = skolemize_variable(result, curr_quant, curr_num, curr_var, curr_free_term_vars, curr_free_sequence_vars, quantifier_info_list_in_scope);
            }
            quantifier_info_list_in_scope = quantifier_info_list_in_scope.rest();
            curr_quant_info = quantifier_info_list_in_scope.first();
            curr_quant = curr_quant_info.first();
            curr_num = second(curr_quant_info);
            curr_var = third(curr_quant_info);
            curr_free_term_vars = fourth(curr_quant_info);
            curr_free_sequence_vars = fifth(curr_quant_info);
        } 
        return result;
    }

    public static SubLObject skolemize_variable(final SubLObject sentence, final SubLObject curr_quant, final SubLObject curr_num, final SubLObject curr_var, final SubLObject curr_free_term_vars, final SubLObject curr_free_sequence_vars, final SubLObject quantifier_info_list_in_scope) {
        if (NIL != drop_all_existentialsP()) {
            return sentence;
        }
        if ((NIL != occurs_as_sequence_variableP(curr_var, sentence)) && (NIL != forbid_quantified_sequence_variablesP())) {
            sublisp_throw($QUANTIFIED_SEQUENCE_VARIABLE, list($QUANTIFIED_SEQUENCE_VARIABLE, curr_var, sentence));
        } else {
            SubLObject curr_dependent_term_vars = NIL;
            SubLObject curr_dependent_sequence_vars = NIL;
            SubLObject cdolist_list_var = quantifier_info_list_in_scope;
            SubLObject quant_info = NIL;
            quant_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject quant = quant_info.first();
                final SubLObject var = third(quant_info);
                final SubLObject free_term_vars = fourth(quant_info);
                final SubLObject free_sequence_vars = fifth(quant_info);
                if ($$forAll.eql(quant)) {
                    final SubLObject pcase_var;
                    final SubLObject var_status = pcase_var = determine_skolem_var_status(var, curr_free_term_vars, free_term_vars, curr_free_sequence_vars, free_sequence_vars);
                    if (!pcase_var.eql($NEITHER)) {
                        if (pcase_var.eql($TERM)) {
                            curr_dependent_term_vars = cons(var, curr_dependent_term_vars);
                        } else
                            if (pcase_var.eql($SEQ)) {
                                curr_dependent_sequence_vars = cons(var, curr_dependent_sequence_vars);
                            } else
                                if (pcase_var.eql($BOTH)) {
                                    sublisp_throw($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, list($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, var, curr_var, sentence));
                                } else
                                    if (pcase_var.eql($UNDETERMINED)) {
                                        el_error(ONE_INTEGER, $str36$Skolemizer_failed_to_classify_var, var, sentence, UNPROVIDED);
                                    }



                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                quant_info = cdolist_list_var.first();
            } 
            if (length(curr_dependent_sequence_vars).numG(ONE_INTEGER)) {
                sublisp_throw($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, list($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, curr_var, curr_dependent_sequence_vars));
            } else {
                if (((NIL != leave_skolem_constants_aloneP()) && (NIL == curr_dependent_term_vars)) && (NIL == curr_dependent_sequence_vars)) {
                    return sentence;
                }
                return cycl_utilities.expression_nsubst_free_vars(make_skolem_fn_fn(curr_var, curr_dependent_term_vars, curr_quant, curr_num, curr_dependent_sequence_vars.first()), curr_var, copy_expression(sentence), symbol_function(EQUAL));
            }
        }
        return NIL;
    }

    public static SubLObject determine_skolem_var_status(final SubLObject var, final SubLObject subsent_free_term_vars, final SubLObject free_term_vars_in_scope, final SubLObject subsent_free_seqvars, final SubLObject free_seqvars_in_scope) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject var_status = $UNDETERMINED;
        if (NIL != member(var, subsent_free_term_vars, UNPROVIDED, UNPROVIDED)) {
            if ((NIL != subl_promotions.memberP(var, subsent_free_seqvars, UNPROVIDED, UNPROVIDED)) || (NIL != member(var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED))) {
                var_status = $BOTH;
            } else {
                var_status = $TERM;
            }
        } else
            if (NIL != member(var, subsent_free_seqvars, UNPROVIDED, UNPROVIDED)) {
                if (NIL != subl_promotions.memberP(var, free_term_vars_in_scope, UNPROVIDED, UNPROVIDED)) {
                    var_status = $BOTH;
                } else {
                    var_status = $SEQ;
                }
            } else
                if (NIL != czer_vars.$minimal_skolem_arityP$.getDynamicValue(thread)) {
                    var_status = $NEITHER;
                } else
                    if (NIL != member(var, free_term_vars_in_scope, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != subl_promotions.memberP(var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED)) {
                            var_status = $BOTH;
                        } else {
                            var_status = $TERM;
                        }
                    } else
                        if (NIL != member(var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED)) {
                            var_status = $SEQ;
                        } else {
                            var_status = $NEITHER;
                        }




        return var_status;
    }

    public static SubLObject make_skolem_fn_fn(final SubLObject var, final SubLObject dependent_term_vars, final SubLObject quant, final SubLObject num, final SubLObject dependent_sequence_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == dependent_term_vars) && (NIL == dependent_sequence_var)) && (NIL != czer_vars.$use_skolem_constantsP$.getDynamicValue(thread))) {
            Errors.warn($str37$skolem_constants_not_yet_supporte);
            return NIL;
        }
        SubLObject result = NIL;
        if ($$thereExists.eql(quant)) {
            result = make_ternary_formula($$SkolemFunctionFn, dependent_term_vars, var, dependent_sequence_var);
        } else {
            if ((NIL == kb_control_vars.quant_kb_loaded_p()) || (NIL == cyc_const_bounded_existential_operator_p(quant))) {
                el_error(FOUR_INTEGER, $str41$make_skolem_fn_fn_doesn_t_know_ho, quant, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            result = make_quaternary_formula($$SkolemFuncNFn, dependent_term_vars, var, dependent_sequence_var, el_math_utilities.quantified_interval(quant, num));
        }
        return result;
    }

    public static SubLObject drop_all_existentialsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $within_ask$.getDynamicValue(thread)) && (NIL == czer_vars.$skolemize_during_asksP$.getDynamicValue(thread))) || (NIL != czer_vars.$drop_all_existentialsP$.getDynamicValue(thread)));
    }

    public static SubLObject leave_skolem_constants_aloneP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != drop_all_existentialsP()) || (NIL != czer_vars.$leave_skolem_constants_aloneP$.getDynamicValue(thread)));
    }

    public static SubLObject forbid_quantified_sequence_variablesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (T == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
            return T;
        }
        if (NIL == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
            return NIL;
        }
        if ($ASSERT_ONLY == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
            return within_assertP();
        }
        return Errors.error($str43$Unexpected_value_for__forbid_quan, czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread));
    }

    public static SubLObject universals_out(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_universal_p(sentence)) {
            final SubLObject result = funcall_formula_arg(UNIVERSALS_OUT, sentence, quantified_sub_sentence_argnum(sentence));
            if (NIL != czer_vars.$implicitify_universalsP$.getDynamicValue(thread)) {
                return result;
            }
            if (!$newly_introduced_universals$.getDynamicValue(thread).isList()) {
                return result;
            }
            if (NIL != member(quantified_var(sentence), $newly_introduced_universals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                return result;
            }
            return make_universal(quantified_var(sentence), result);
        } else {
            if ((NIL != el_conjunction_p(sentence)) || (NIL != el_disjunction_p(sentence))) {
                return pass_through_if_junction(UNIVERSALS_OUT, sentence);
            }
            if ((NIL != possibly_el_quantified_sentence_p(sentence)) || (NIL != el_logical_operator_formula_p(sentence))) {
                return sentence;
            }
            if (NIL != cycl_grammar.cycl_literal_p(sentence)) {
                return sentence;
            }
            if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                return sentence;
            }
            el_error(FOUR_INTEGER, $str45$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED);
            return sentence;
        }
    }

    public static SubLObject disjunctions_in(final SubLObject sentence) {
        if (NIL != bad_exponential_disjunctionP(sentence)) {
            return handle_bad_exponential_disjunction(sentence);
        }
        return disjunctions_in_int(sentence);
    }

    public static SubLObject disjunctions_in_int(SubLObject sentence) {
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
            if (NIL != el_conjunction_p(sentence)) {
                result = nmap_formula_args(DISJUNCTIONS_IN, sentence, UNPROVIDED);
            } else
                if (NIL != el_disjunction_p(sentence)) {
                    if (NIL != cycl_utilities.opaque_argP(sentence, ONE_INTEGER)) {
                        result = sentence;
                    } else {
                        sentence = nmap_formula_args(DISJUNCTIONS_IN, sentence, UNPROVIDED);
                        final SubLObject nested_conjunction = first_conjunction(cycl_utilities.formula_args(sentence, UNPROVIDED));
                        if (NIL != nested_conjunction) {
                            final SubLObject other_disjuncts = delete(nested_conjunction, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != other_disjuncts) {
                                SubLObject new_conjuncts = NIL;
                                SubLObject cdolist_list_var;
                                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(nested_conjunction, $IGNORE);
                                SubLObject conjunct = NIL;
                                conjunct = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject new_disjuncts = cons(conjunct, other_disjuncts);
                                    new_conjuncts = cons(simplifier.disjoin(new_disjuncts, UNPROVIDED), new_conjuncts);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    conjunct = cdolist_list_var.first();
                                } 
                                result = simplifier.nconjoin(list_utilities.nmapcar(DISJUNCTIONS_IN, new_conjuncts), UNPROVIDED);
                            } else {
                                result = nested_conjunction;
                            }
                        } else {
                            result = sentence;
                        }
                    }
                } else
                    if ((NIL != possibly_el_quantified_sentence_p(sentence)) || (NIL != el_logical_operator_formula_p(sentence))) {
                        result = sentence;
                    } else
                        if (NIL != el_grammar.el_literal_p(sentence)) {
                            result = sentence;
                        } else
                            if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                                result = sentence;
                            } else {
                                el_error(FOUR_INTEGER, $str47$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED);
                                result = sentence;
                            }




        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject first_conjunction(final SubLObject sentences) {
        return find_if(symbol_function(EL_CONJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject bad_exponential_disjunctionP(final SubLObject sentence) {
        if (NIL != el_disjunction_p(sentence)) {
            return bad_exponential_sentenceP(sentence, EL_CONJUNCTION_P);
        }
        return NIL;
    }

    public static SubLObject handle_bad_exponential_disjunction(final SubLObject sentence) {
        return sublisp_throw($BAD_EXPONENTIAL_DISJUNCTION, sentence);
    }

    public static SubLObject bad_exponential_sentenceP(final SubLObject sentence, final SubLObject arg_test_func) {
        final SubLObject n = count_if(arg_test_func, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (n.numGE(FIVE_INTEGER)) {
            final SubLObject problem_args = list_utilities.remove_if_not(arg_test_func, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != problem_args) {
                final SubLObject k = average_arity(problem_args);
                if (k.numG(ONE_INTEGER)) {
                    final SubLObject kXn = expt(k, n);
                    if (kXn.numG($czer_bad_exponential_threshold$.getGlobalValue())) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject average_arity(final SubLObject formulas) {
        return number_utilities.average(formulas, FORMULA_ARITY);
    }

    public static SubLObject force_into_cnf(SubLObject sentence) {
        if (NIL == el_conjunction_p(sentence)) {
            sentence = make_conjunction(list(sentence));
        }
        SubLObject new_args = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_disjunction_p(arg)) {
                new_args = cons(arg, new_args);
            } else {
                new_args = cons(make_disjunction(list(arg)), new_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        new_args = nreverse(new_args);
        return make_conjunction(new_args);
    }

    public static SubLObject cnf_operators_out(SubLObject sentence) {
        if (((NIL == sentence) || sentence.eql($$True)) || sentence.eql($$False)) {
            return sentence;
        }
        if (NIL != cycl_variables.el_varP(sentence)) {
            sentence = czer_utilities.encapsulate_formula(sentence, UNPROVIDED);
        }
        sentence = force_into_cnf(sentence);
        if (NIL == el_conjunction_p(sentence)) {
            el_error(FOUR_INTEGER, $str52$_s_is_not_a_conjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        SubLObject clause_list = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == el_disjunction_p(conjunct)) {
                el_error(FOUR_INTEGER, $str53$_s_is_not_a_disjunction__so__S_is, conjunct, sentence, UNPROVIDED);
                return NIL;
            }
            clause_list = cons(package_xnf_clause(cycl_utilities.formula_args(conjunct, UNPROVIDED)), clause_list);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return nreverse(clause_list);
    }

    public static SubLObject package_cnf_clause(final SubLObject clause) {
        return package_xnf_clause(clause);
    }

    public static SubLObject npackage_cnf_clause(final SubLObject clause) {
        return npackage_xnf_clause(clause);
    }

    public static SubLObject conjunctions_in(final SubLObject sentence) {
        if (NIL != bad_exponential_conjunctionP(sentence)) {
            return handle_bad_exponential_conjunction(sentence);
        }
        return conjunctions_in_int(sentence);
    }

    public static SubLObject conjunctions_in_int(SubLObject sentence) {
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
            if (NIL != el_disjunction_p(sentence)) {
                result = nmap_formula_args(CONJUNCTIONS_IN, sentence, UNPROVIDED);
            } else
                if (NIL != el_conjunction_p(sentence)) {
                    if (NIL != cycl_utilities.opaque_argP(sentence, ONE_INTEGER)) {
                        result = sentence;
                    } else {
                        sentence = nmap_formula_args(CONJUNCTIONS_IN, sentence, UNPROVIDED);
                        final SubLObject nested_disjunction = first_disjunction(cycl_utilities.formula_args(sentence, UNPROVIDED));
                        if (NIL != nested_disjunction) {
                            final SubLObject other_conjuncts = delete(nested_disjunction, cycl_utilities.formula_args(sentence, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != other_conjuncts) {
                                SubLObject new_disjuncts = NIL;
                                SubLObject cdolist_list_var;
                                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(nested_disjunction, $IGNORE);
                                SubLObject disjunct = NIL;
                                disjunct = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject new_conjuncts = cons(disjunct, other_conjuncts);
                                    new_disjuncts = cons(simplifier.conjoin(new_conjuncts, UNPROVIDED), new_disjuncts);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    disjunct = cdolist_list_var.first();
                                } 
                                result = simplifier.ndisjoin(list_utilities.nmapcar(CONJUNCTIONS_IN, new_disjuncts), UNPROVIDED);
                            } else {
                                result = nested_disjunction;
                            }
                        } else {
                            result = sentence;
                        }
                    }
                } else
                    if ((NIL != possibly_el_quantified_sentence_p(sentence)) || (NIL != el_logical_operator_formula_p(sentence))) {
                        result = sentence;
                    } else
                        if (NIL != el_grammar.el_literal_p(sentence)) {
                            result = sentence;
                        } else
                            if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                                result = sentence;
                            } else {
                                el_error(FOUR_INTEGER, $str55$Got_the_unexpected_formula__S_in_, sentence, UNPROVIDED, UNPROVIDED);
                                result = sentence;
                            }




        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject first_disjunction(final SubLObject sentences) {
        return find_if(symbol_function(EL_DISJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject bad_exponential_conjunctionP(final SubLObject sentence) {
        if (NIL != el_conjunction_p(sentence)) {
            return bad_exponential_sentenceP(sentence, EL_DISJUNCTION_P);
        }
        return NIL;
    }

    public static SubLObject handle_bad_exponential_conjunction(final SubLObject sentence) {
        return sublisp_throw($BAD_EXPONENTIAL_CONJUNCTION, sentence);
    }

    public static SubLObject force_into_dnf(SubLObject sentence) {
        if (NIL == el_disjunction_p(sentence)) {
            sentence = make_disjunction(list(sentence));
        }
        SubLObject new_args = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_conjunction_p(arg)) {
                new_args = cons(arg, new_args);
            } else {
                new_args = cons(make_conjunction(list(arg)), new_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return make_disjunction(new_args);
    }

    public static SubLObject dnf_operators_out(SubLObject sentence) {
        if (((NIL == sentence) || sentence.eql($$True)) || sentence.eql($$False)) {
            return sentence;
        }
        if (NIL != cycl_variables.el_varP(sentence)) {
            sentence = czer_utilities.encapsulate_formula(sentence, UNPROVIDED);
        }
        sentence = force_into_dnf(sentence);
        if (NIL == el_disjunction_p(sentence)) {
            el_error(FOUR_INTEGER, $str58$_s_is_not_a_disjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        SubLObject clause_list = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject disjunct = NIL;
        disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == el_conjunction_p(disjunct)) {
                el_error(FOUR_INTEGER, $str59$_s_is_not_a_conjunction__so__S_is, disjunct, sentence, UNPROVIDED);
                return NIL;
            }
            clause_list = cons(package_xnf_clause(cycl_utilities.formula_args(disjunct, UNPROVIDED)), clause_list);
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        } 
        return nreverse(clause_list);
    }

    public static SubLObject package_dnf_clause(final SubLObject clause) {
        return package_xnf_clause(clause);
    }

    public static SubLObject clausifier_input_sentence() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $clausifier_input_sentence$.getDynamicValue(thread);
    }

    public static SubLObject clausifier_input_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $clausifier_input_mt$.getDynamicValue(thread);
    }

    public static SubLObject el_xnf(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $clausifier_input_sentence$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $clausifier_input_mt$.currentBinding(thread);
        try {
            $clausifier_input_sentence$.bind(sentence, thread);
            $clausifier_input_mt$.bind(mt, thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$6 = el_xnf_int(sentence, mt);
            final SubLObject mt_$7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$6;
            mt = mt_$7;
            thread.resetMultipleValues();
            final SubLObject sentence_$7 = postcanonicalizer.postcanonicalizations(sentence, mt);
            final SubLObject mt_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$7;
            mt = mt_$8;
        } finally {
            $clausifier_input_mt$.rebind(_prev_bind_2, thread);
            $clausifier_input_sentence$.rebind(_prev_bind_0, thread);
        }
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
        return values(sentence, mt);
    }

    public static SubLObject el_xnf_int(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_$10 = precanonicalizer.precanonicalizations(sentence, mt);
        final SubLObject mt_$11 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$10;
        mt = mt_$11;
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
        sentence = do_implications(sentence);
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
        sentence = do_negations_destructive(sentence);
        sentence = standardize_variables(sentence);
        final SubLObject _prev_bind_0 = $newly_introduced_universals$.currentBinding(thread);
        try {
            $newly_introduced_universals$.bind(NIL, thread);
            sentence = czer_explicitify_implicit_quantifiers(sentence);
            sentence = existentials_out(sentence);
            sentence = universals_out(sentence);
        } finally {
            $newly_introduced_universals$.rebind(_prev_bind_0, thread);
        }
        return values(sentence, mt);
    }

    public static SubLObject package_xnf_clauses(final SubLObject v_clauses) {
        if ($$True.eql(v_clauses)) {
            return v_clauses;
        }
        if ($$False.eql(v_clauses)) {
            return v_clauses;
        }
        return Mapping.mapcar(symbol_function(PACKAGE_XNF_CLAUSE), v_clauses);
    }

    public static SubLObject package_xnf_clause(final SubLObject clause) {
        final SubLObject neg_lits = Mapping.mapcar(symbol_function(FORMULA_ARG1), el_negative_sentences(clause));
        final SubLObject pos_lits = el_positive_sentences(clause);
        return clauses.make_xnf(neg_lits, pos_lits);
    }

    public static SubLObject npackage_xnf_clause(final SubLObject clause) {
        final SubLObject neg_lits = list_utilities.nmapcar(symbol_function(FORMULA_ARG1), el_negative_sentences(clause));
        final SubLObject pos_lits = el_positive_sentences(clause);
        return clauses.make_xnf(neg_lits, pos_lits);
    }

    public static SubLObject canon_fast_gafP(final SubLObject sentence, final SubLObject mt) {
        final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
        final SubLObject sentence_$12;
        final SubLObject tempformula = sentence_$12 = (NIL != seqvar) ? append(strip_sequence_var(sentence), list(seqvar)) : sentence;
        return makeBoolean(((((NIL != el_formula_p(sentence_$12)) && (NIL == find_if(symbol_function(EL_FORMULA_P), sentence_$12, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == find_if(symbol_function($sym62$EL_VAR_), sentence_$12, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(sentence_$12)))) && (NIL == precanonicalizer.precanonicalizationsP(sentence_$12, mt, T)));
    }

    public static SubLObject el_cnf(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : NIL, thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$13 = el_cnf_int(sentence, mt, NIL);
            final SubLObject mt_$14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$13;
            mt = mt_$14;
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return values(sentence, mt);
    }

    public static SubLObject el_cnf_destructive(final SubLObject sentence, final SubLObject mt) {
        return el_cnf_int(sentence, mt, T);
    }

    public static SubLObject el_cnf_int(SubLObject sentence, SubLObject mt, final SubLObject destructiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == destructiveP) {
            sentence = copy_sentence(sentence);
        }
        if (NIL != canon_fast_gafP(sentence, mt)) {
            sentence = simplifier.simplify_cycl_literal_syntax(sentence, UNPROVIDED);
        } else {
            thread.resetMultipleValues();
            final SubLObject sentence_$15 = el_xnf(sentence, mt);
            final SubLObject mt_$16 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$15;
            mt = mt_$16;
            if (NIL != wff_macros.within_wffP()) {
                sentence = disjunctions_in(sentence);
            } else {
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($BAD_EXPONENTIAL_DISJUNCTION);
                    sentence = disjunctions_in(sentence);
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_DISJUNCTION);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    sentence = NIL;
                }
            }
            sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
        }
        return values(sentence, mt);
    }

    public static SubLObject el_dnf(SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? czer_vars.$standardize_variables_memory$.getDynamicValue(thread) : NIL, thread);
            thread.resetMultipleValues();
            final SubLObject sentence_$17 = el_dnf_int(sentence, mt, NIL);
            final SubLObject mt_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$17;
            mt = mt_$18;
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return values(sentence, mt);
    }

    public static SubLObject el_dnf_destructive(final SubLObject sentence, final SubLObject mt) {
        return el_dnf_int(sentence, mt, T);
    }

    public static SubLObject el_dnf_int(SubLObject sentence, SubLObject mt, final SubLObject destructiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == destructiveP) {
            sentence = copy_sentence(sentence);
        }
        if (NIL != canon_fast_gafP(sentence, mt)) {
            sentence = simplifier.simplify_cycl_literal_syntax(sentence, UNPROVIDED);
        } else {
            thread.resetMultipleValues();
            final SubLObject sentence_$19 = el_xnf(sentence, mt);
            final SubLObject mt_$20 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$19;
            mt = mt_$20;
            if (NIL != wff_macros.within_wffP()) {
                sentence = conjunctions_in(sentence);
            } else {
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($BAD_EXPONENTIAL_CONJUNCTION);
                    sentence = conjunctions_in(sentence);
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_CONJUNCTION);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    sentence = NIL;
                }
            }
            sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
        }
        return values(sentence, mt);
    }

    public static SubLObject leading_universal_variables(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject copied_sentence = copy_sentence(sentence);
        final SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            copied_sentence = precanonicalizer.precanonicalizations(copied_sentence, mt);
            copied_sentence = do_implications(copied_sentence);
            copied_sentence = do_negations_destructive(copied_sentence);
            copied_sentence = czer_explicitify_implicit_universal_quantifiers(copied_sentence);
            copied_sentence = standardize_variables(copied_sentence);
            copied_sentence = existentials_out(copied_sentence);
            copied_sentence = czer_main.el_nununiquify_vars(copied_sentence);
            copied_sentence = universals_out(copied_sentence);
            copied_sentence = leading_universal_variables_1(copied_sentence);
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject leading_universal_variables_1(final SubLObject sentence) {
        if (NIL == czer_utilities.encapsulate_formulaP(sentence)) {
            if (!sentence.isAtom()) {
                if (NIL == el_negation_p(sentence)) {
                    if ((NIL != el_conjunction_p(sentence)) || (NIL != el_disjunction_p(sentence))) {
                        return list_utilities.mapappend(symbol_function(LEADING_UNIVERSAL_VARIABLES_1), cycl_utilities.formula_args(sentence, UNPROVIDED));
                    }
                    if (NIL != cycl_universal_p(sentence)) {
                        return cons(quantified_var(sentence), leading_universal_variables_1(quantified_sub_sentence(sentence)));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject sort_vars(final SubLObject vars) {
        return Sort.sort(copy_list(vars), symbol_function($sym64$STRING_), symbol_function(STR));
    }

    public static SubLObject distribute_conjunction(final SubLObject conjuncts, final SubLObject disjuncts, SubLObject conjunction_operator) {
        if (conjunction_operator == UNPROVIDED) {
            conjunction_operator = $$and;
        }
        if (conjuncts.isCons() && (NIL != list_utilities.proper_list_p(disjuncts))) {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = disjuncts;
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(listS(conjunction_operator, disjunct, conjuncts), ans);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            } 
            return nreverse(ans);
        }
        return NIL;
    }

    public static SubLObject clausal_form(final SubLObject sentence, final SubLObject mt, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $CNF;
        }
        final SubLObject pcase_var = form;
        if (pcase_var.eql($CNF)) {
            return cnf_clausal_form(sentence, mt);
        }
        if (pcase_var.eql($DNF)) {
            return dnf_clausal_form(sentence, mt);
        }
        return NIL;
    }

    public static SubLObject cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_cnf_cacheP$.getDynamicValue(thread)) {
            return cached_cnf_clausal_form(sentence, mt);
        }
        return cnf_clausal_form_int(sentence, mt);
    }

    public static SubLObject clear_cached_cnf_clausal_form() {
        final SubLObject cs = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_cnf_clausal_form_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_cnf_clausal_form_internal(final SubLObject sentence, final SubLObject mt) {
        return cnf_clausal_form_int(sentence, mt);
    }

    public static SubLObject cached_cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        SubLObject caching_state = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CNF_CLAUSAL_FORM, $cached_cnf_clausal_form_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$48);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_cnf_clausal_form_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject cnf_clausal_form_int(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnf = el_cnf(sentence, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(cnf_operators_out(cnf), new_mt);
    }

    public static SubLObject dnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject dnf = el_dnf(sentence, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(dnf_operators_out(dnf), new_mt);
    }

    public static SubLObject declare_clausifier_file() {
        declareFunction(me, "do_implications", "DO-IMPLICATIONS", 1, 0, false);
        new clausifier.$do_implications$UnaryFunction();
        declareFunction(me, "do_implications_recursive", "DO-IMPLICATIONS-RECURSIVE", 1, 0, false);
        declareFunction(me, "eliminate_existential_with_var_only_in_antecedentP", "ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?", 3, 0, false);
        declareFunction(me, "do_negations", "DO-NEGATIONS", 1, 0, false);
        declareFunction(me, "do_negations_destructive", "DO-NEGATIONS-DESTRUCTIVE", 1, 0, false);
        new clausifier.$do_negations_destructive$UnaryFunction();
        declareFunction(me, "negate_formula", "NEGATE-FORMULA", 1, 0, false);
        declareFunction(me, "negation_in", "NEGATION-IN", 1, 0, false);
        declareFunction(me, "negate_quantified_sentence", "NEGATE-QUANTIFIED-SENTENCE", 1, 0, false);
        declareFunction(me, "negate_atomic", "NEGATE-ATOMIC", 1, 0, false);
        declareFunction(me, "negate_negation", "NEGATE-NEGATION", 1, 0, false);
        declareFunction(me, "negate_negations", "NEGATE-NEGATIONS", 1, 0, false);
        declareFunction(me, "negate_conjunction", "NEGATE-CONJUNCTION", 1, 0, false);
        declareFunction(me, "negate_conjunction_destructive", "NEGATE-CONJUNCTION-DESTRUCTIVE", 1, 0, false);
        declareFunction(me, "negate_disjunction_destructive", "NEGATE-DISJUNCTION-DESTRUCTIVE", 1, 0, false);
        declareFunction(me, "negate_universal", "NEGATE-UNIVERSAL", 1, 0, false);
        declareFunction(me, "negate_existential", "NEGATE-EXISTENTIAL", 1, 0, false);
        declareFunction(me, "negate_existential_min", "NEGATE-EXISTENTIAL-MIN", 1, 0, false);
        declareFunction(me, "negate_existential_max", "NEGATE-EXISTENTIAL-MAX", 1, 0, false);
        declareFunction(me, "negate_existential_exact", "NEGATE-EXISTENTIAL-EXACT", 1, 0, false);
        declareFunction(me, "negate_true_sentence", "NEGATE-TRUE-SENTENCE", 1, 0, false);
        declareFunction(me, "negate_encapsulate_sentence", "NEGATE-ENCAPSULATE-SENTENCE", 1, 0, false);
        declareFunction(me, "lift_negation", "LIFT-NEGATION", 1, 0, false);
        declareFunction(me, "czer_explicitify_implicit_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-QUANTIFIERS", 1, 0, false);
        declareFunction(me, "czer_explicitify_implicit_universal_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false);
        declareFunction(me, "czer_explicitify_implicit_existential_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false);
        declareFunction(me, "assume_free_vars_are_existentially_boundP", "ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?", 0, 0, false);
        declareFunction(me, "standardize_sentence_variables", "STANDARDIZE-SENTENCE-VARIABLES", 1, 0, false);
        declareFunction(me, "standardize_variables", "STANDARDIZE-VARIABLES", 1, 0, false);
        declareFunction(me, "recursively_standardize_variables", "RECURSIVELY-STANDARDIZE-VARIABLES", 1, 0, false);
        new clausifier.$recursively_standardize_variables$UnaryFunction();
        declareFunction(me, "el_uniquify_standardize", "EL-UNIQUIFY-STANDARDIZE", 1, 0, false);
        declareFunction(me, "el_var_without_quote", "EL-VAR-WITHOUT-QUOTE", 1, 0, false);
        declareFunction(me, "remember_variable_rename", "REMEMBER-VARIABLE-RENAME", 2, 0, false);
        declareFunction(me, "remember_variables_rename", "REMEMBER-VARIABLES-RENAME", 2, 0, false);
        declareFunction(me, "el_uniquify", "EL-UNIQUIFY", 1, 0, false);
        declareFunction(me, "existentials_out", "EXISTENTIALS-OUT", 1, 0, false);
        declareFunction(me, "existentials_out_int", "EXISTENTIALS-OUT-INT", 1, 0, false);
        declareFunction(me, "skolemize_atomic_sentence", "SKOLEMIZE-ATOMIC-SENTENCE", 2, 0, false);
        declareFunction(me, "skolemize_variable", "SKOLEMIZE-VARIABLE", 7, 0, false);
        declareFunction(me, "determine_skolem_var_status", "DETERMINE-SKOLEM-VAR-STATUS", 5, 0, false);
        declareFunction(me, "make_skolem_fn_fn", "MAKE-SKOLEM-FN-FN", 5, 0, false);
        declareFunction(me, "drop_all_existentialsP", "DROP-ALL-EXISTENTIALS?", 0, 0, false);
        declareFunction(me, "leave_skolem_constants_aloneP", "LEAVE-SKOLEM-CONSTANTS-ALONE?", 0, 0, false);
        declareFunction(me, "forbid_quantified_sequence_variablesP", "FORBID-QUANTIFIED-SEQUENCE-VARIABLES?", 0, 0, false);
        declareFunction(me, "universals_out", "UNIVERSALS-OUT", 1, 0, false);
        new clausifier.$universals_out$UnaryFunction();
        declareFunction(me, "disjunctions_in", "DISJUNCTIONS-IN", 1, 0, false);
        declareFunction(me, "disjunctions_in_int", "DISJUNCTIONS-IN-INT", 1, 0, false);
        declareFunction(me, "first_conjunction", "FIRST-CONJUNCTION", 1, 0, false);
        declareFunction(me, "bad_exponential_disjunctionP", "BAD-EXPONENTIAL-DISJUNCTION?", 1, 0, false);
        declareFunction(me, "handle_bad_exponential_disjunction", "HANDLE-BAD-EXPONENTIAL-DISJUNCTION", 1, 0, false);
        declareFunction(me, "bad_exponential_sentenceP", "BAD-EXPONENTIAL-SENTENCE?", 2, 0, false);
        declareFunction(me, "average_arity", "AVERAGE-ARITY", 1, 0, false);
        declareFunction(me, "force_into_cnf", "FORCE-INTO-CNF", 1, 0, false);
        declareFunction(me, "cnf_operators_out", "CNF-OPERATORS-OUT", 1, 0, false);
        declareFunction(me, "package_cnf_clause", "PACKAGE-CNF-CLAUSE", 1, 0, false);
        declareFunction(me, "npackage_cnf_clause", "NPACKAGE-CNF-CLAUSE", 1, 0, false);
        declareFunction(me, "conjunctions_in", "CONJUNCTIONS-IN", 1, 0, false);
        new clausifier.$conjunctions_in$UnaryFunction();
        declareFunction(me, "conjunctions_in_int", "CONJUNCTIONS-IN-INT", 1, 0, false);
        declareFunction(me, "first_disjunction", "FIRST-DISJUNCTION", 1, 0, false);
        declareFunction(me, "bad_exponential_conjunctionP", "BAD-EXPONENTIAL-CONJUNCTION?", 1, 0, false);
        declareFunction(me, "handle_bad_exponential_conjunction", "HANDLE-BAD-EXPONENTIAL-CONJUNCTION", 1, 0, false);
        declareFunction(me, "force_into_dnf", "FORCE-INTO-DNF", 1, 0, false);
        declareFunction(me, "dnf_operators_out", "DNF-OPERATORS-OUT", 1, 0, false);
        declareFunction(me, "package_dnf_clause", "PACKAGE-DNF-CLAUSE", 1, 0, false);
        declareFunction(me, "clausifier_input_sentence", "CLAUSIFIER-INPUT-SENTENCE", 0, 0, false);
        declareFunction(me, "clausifier_input_mt", "CLAUSIFIER-INPUT-MT", 0, 0, false);
        declareFunction(me, "el_xnf", "EL-XNF", 2, 0, false);
        declareFunction(me, "el_xnf_int", "EL-XNF-INT", 2, 0, false);
        declareFunction(me, "package_xnf_clauses", "PACKAGE-XNF-CLAUSES", 1, 0, false);
        declareFunction(me, "package_xnf_clause", "PACKAGE-XNF-CLAUSE", 1, 0, false);
        declareFunction(me, "npackage_xnf_clause", "NPACKAGE-XNF-CLAUSE", 1, 0, false);
        declareFunction(me, "canon_fast_gafP", "CANON-FAST-GAF?", 2, 0, false);
        declareFunction(me, "el_cnf", "EL-CNF", 2, 0, false);
        declareFunction(me, "el_cnf_destructive", "EL-CNF-DESTRUCTIVE", 2, 0, false);
        declareFunction(me, "el_cnf_int", "EL-CNF-INT", 3, 0, false);
        declareFunction(me, "el_dnf", "EL-DNF", 2, 0, false);
        declareFunction(me, "el_dnf_destructive", "EL-DNF-DESTRUCTIVE", 2, 0, false);
        declareFunction(me, "el_dnf_int", "EL-DNF-INT", 3, 0, false);
        declareFunction(me, "leading_universal_variables", "LEADING-UNIVERSAL-VARIABLES", 2, 0, false);
        declareFunction(me, "leading_universal_variables_1", "LEADING-UNIVERSAL-VARIABLES-1", 1, 0, false);
        declareFunction(me, "sort_vars", "SORT-VARS", 1, 0, false);
        declareFunction(me, "distribute_conjunction", "DISTRIBUTE-CONJUNCTION", 2, 1, false);
        declareFunction(me, "clausal_form", "CLAUSAL-FORM", 2, 1, false);
        declareFunction(me, "cnf_clausal_form", "CNF-CLAUSAL-FORM", 2, 0, false);
        declareFunction(me, "clear_cached_cnf_clausal_form", "CLEAR-CACHED-CNF-CLAUSAL-FORM", 0, 0, false);
        declareFunction(me, "remove_cached_cnf_clausal_form", "REMOVE-CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
        declareFunction(me, "cached_cnf_clausal_form_internal", "CACHED-CNF-CLAUSAL-FORM-INTERNAL", 2, 0, false);
        declareFunction(me, "cached_cnf_clausal_form", "CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
        declareFunction(me, "cnf_clausal_form_int", "CNF-CLAUSAL-FORM-INT", 2, 0, false);
        declareFunction(me, "dnf_clausal_form", "DNF-CLAUSAL-FORM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_clausifier_file() {
        defparameter("*CANONICAL-VARIABLE-NAME-STEM*", $str0$el_var);
        defparameter("*USE-CNF-CACHE?*", T);
        defparameter("*NEWLY-INTRODUCED-UNIVERSALS*", $ERROR);
        defparameter("*OUTERMOST-IMPLICATION*", $UNINITIALIZED);
        defparameter("*INNERMOST-IMPLICATION*", $UNINITIALIZED);
        defparameter("*ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?*", T);
        defparameter("*QUANTIFIER-INFO-LIST*", NIL);
        deflexical("*CZER-BAD-EXPONENTIAL-THRESHOLD*", $int$200000);
        defparameter("*CLAUSIFIER-INPUT-SENTENCE*", NIL);
        defparameter("*CLAUSIFIER-INPUT-MT*", NIL);
        deflexical("*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_clausifier_file() {
        memoization_state.note_globally_cached_function(CACHED_CNF_CLAUSAL_FORM);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_clausifier_file();
    }

    @Override
    public void initializeVariables() {
        init_clausifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_clausifier_file();
    }

    static {




















































































    }

    public static final class $do_implications$UnaryFunction extends UnaryFunction {
        public $do_implications$UnaryFunction() {
            super(extractFunctionNamed("DO-IMPLICATIONS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return do_implications(arg1);
        }
    }

    public static final class $do_negations_destructive$UnaryFunction extends UnaryFunction {
        public $do_negations_destructive$UnaryFunction() {
            super(extractFunctionNamed("DO-NEGATIONS-DESTRUCTIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return do_negations_destructive(arg1);
        }
    }

    public static final class $recursively_standardize_variables$UnaryFunction extends UnaryFunction {
        public $recursively_standardize_variables$UnaryFunction() {
            super(extractFunctionNamed("RECURSIVELY-STANDARDIZE-VARIABLES"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return recursively_standardize_variables(arg1);
        }
    }

    public static final class $universals_out$UnaryFunction extends UnaryFunction {
        public $universals_out$UnaryFunction() {
            super(extractFunctionNamed("UNIVERSALS-OUT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return universals_out(arg1);
        }
    }

    public static final class $conjunctions_in$UnaryFunction extends UnaryFunction {
        public $conjunctions_in$UnaryFunction() {
            super(extractFunctionNamed("CONJUNCTIONS-IN"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return conjunctions_in(arg1);
        }
    }
}

/**
 * Total time: 510 ms
 */
