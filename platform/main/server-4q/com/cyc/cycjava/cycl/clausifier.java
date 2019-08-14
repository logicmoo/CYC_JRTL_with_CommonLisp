/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$within_ask$;
import static com.cyc.cycjava.cycl.control_vars.within_askP;
import static com.cyc.cycjava.cycl.control_vars.within_assertP;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.el_utilities.copy_sentence;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_bounded_existential_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_general_existential_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.cycl_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.el_abnormal_p;
import static com.cyc.cycjava.cycl.el_utilities.el_bounded_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_exact_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_max_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_min_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_logical_operator_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_meets_pragmatic_requirement_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negative_sentences;
import static com.cyc.cycjava.cycl.el_utilities.el_positive_sentences;
import static com.cyc.cycjava.cycl.el_utilities.el_quantified_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_unary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.explicitify_implicit_existential_quantifiers;
import static com.cyc.cycjava.cycl.el_utilities.funcall_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_disjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_existential_max;
import static com.cyc.cycjava.cycl.el_utilities.make_existential_min;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.cycjava.cycl.el_utilities.make_quaternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_universal;
import static com.cyc.cycjava.cycl.el_utilities.nadd_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.nmap_formula_args;
import static com.cyc.cycjava.cycl.el_utilities.occurs_as_sequence_variableP;
import static com.cyc.cycjava.cycl.el_utilities.pass_through_if_junction;
import static com.cyc.cycjava.cycl.el_utilities.pass_through_if_logical_op;
import static com.cyc.cycjava.cycl.el_utilities.pass_through_if_logical_op_or_quantified;
import static com.cyc.cycjava.cycl.el_utilities.pass_through_if_relation_syntax;
import static com.cyc.cycjava.cycl.el_utilities.possibly_el_quantified_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_el_regularly_quantified_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.quantified_sub_sentence;
import static com.cyc.cycjava.cycl.el_utilities.quantified_sub_sentence_argnum;
import static com.cyc.cycjava.cycl.el_utilities.quantified_var;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_sequence_variables;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_term_variables;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.strip_sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_ternary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.pairlis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class clausifier extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new clausifier();

 public static final String myName = "com.cyc.cycjava.cycl.clausifier";


    // defparameter
    // Definitions
    @LispMethod(comment = "used for standardizing EL variables in the canonicalizer\ndefparameter")
    public static final SubLSymbol $canonical_variable_name_stem$ = makeSymbol("*CANONICAL-VARIABLE-NAME-STEM*");

    // defparameter
    @LispMethod(comment = "Whether to cache the function that converts EL sentences to CNF clausal form\ndefparameter")
    /**
     * Whether to cache the function that converts EL sentences to CNF clausal form
     */
    public static final SubLSymbol $use_cnf_cacheP$ = makeSymbol("*USE-CNF-CACHE?*");

    // defparameter
    // a temporary stack to record universals introduced by the clausifier
    /**
     * a temporary stack to record universals introduced by the clausifier
     */
    @LispMethod(comment = "a temporary stack to record universals introduced by the clausifier\ndefparameter")
    private static final SubLSymbol $newly_introduced_universals$ = makeSymbol("*NEWLY-INTRODUCED-UNIVERSALS*");

    // defparameter
    /**
     * bound to the outermost implication in the do-implications recursive descent
     */
    @LispMethod(comment = "bound to the outermost implication in the do-implications recursive descent\ndefparameter")
    private static final SubLSymbol $outermost_implication$ = makeSymbol("*OUTERMOST-IMPLICATION*");

    // defparameter
    /**
     * bound to the innermost implication in the do-implications recursive descent
     */
    @LispMethod(comment = "bound to the innermost implication in the do-implications recursive descent\ndefparameter")
    private static final SubLSymbol $innermost_implication$ = makeSymbol("*INNERMOST-IMPLICATION*");

    // defparameter
    // Temporary control variable, @todo hard-code to t
    /**
     * Temporary control variable, @todo hard-code to t
     */
    @LispMethod(comment = "Temporary control variable, @todo hard-code to t\ndefparameter")
    private static final SubLSymbol $eliminate_existential_with_var_only_in_antecedentP$ = makeSymbol("*ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?*");

    // defparameter
    // private dynamic variable used for quantification information
    /**
     * private dynamic variable used for quantification information
     */
    @LispMethod(comment = "private dynamic variable used for quantification information\ndefparameter")
    private static final SubLSymbol $quantifier_info_list$ = makeSymbol("*QUANTIFIER-INFO-LIST*");

    // deflexical
    /**
     * The K^N over which a wff violation will be thrown rather than descending into
     * exponential madness.
     */
    @LispMethod(comment = "The K^N over which a wff violation will be thrown rather than descending into\r\nexponential madness.\ndeflexical\nThe K^N over which a wff violation will be thrown rather than descending into\nexponential madness.")
    private static final SubLSymbol $czer_bad_exponential_threshold$ = makeSymbol("*CZER-BAD-EXPONENTIAL-THRESHOLD*");

    // defparameter
    /**
     * Stores the sentence provided as input to el-xnf. Used while reporting wff
     * violations.
     */
    @LispMethod(comment = "Stores the sentence provided as input to el-xnf. Used while reporting wff\r\nviolations.\ndefparameter\nStores the sentence provided as input to el-xnf. Used while reporting wff\nviolations.")
    private static final SubLSymbol $clausifier_input_sentence$ = makeSymbol("*CLAUSIFIER-INPUT-SENTENCE*");

    // defparameter
    /**
     * Stores the mt provided as input to el-xnf. Used while reporting wff
     * violations.
     */
    @LispMethod(comment = "Stores the mt provided as input to el-xnf. Used while reporting wff\r\nviolations.\ndefparameter\nStores the mt provided as input to el-xnf. Used while reporting wff\nviolations.")
    private static final SubLSymbol $clausifier_input_mt$ = makeSymbol("*CLAUSIFIER-INPUT-MT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$el_var = makeString("el-var");

    private static final SubLSymbol DO_IMPLICATIONS_RECURSIVE = makeSymbol("DO-IMPLICATIONS-RECURSIVE");

    private static final SubLSymbol DO_NEGATIONS_DESTRUCTIVE = makeSymbol("DO-NEGATIONS-DESTRUCTIVE");

    private static final SubLSymbol $HELLO_YOU_SILLY_COMPILER = makeKeyword("HELLO-YOU-SILLY-COMPILER");





    static private final SubLString $str9$_s_is_not_a_quantified_sentence = makeString("~s is not a quantified sentence");

    private static final SubLSymbol NEGATE_NEGATION = makeSymbol("NEGATE-NEGATION");

    private static final SubLSymbol NEGATE_FORMULA = makeSymbol("NEGATE-FORMULA");



    static private final SubLString $str13$_s_contained_the_invalid_bound__D = makeString("~s contained the invalid bound ~D");



    static private final SubLSymbol $sym17$CYC_VAR_ = makeSymbol("CYC-VAR?");



    private static final SubLSymbol RECURSIVELY_STANDARDIZE_VARIABLES = makeSymbol("RECURSIVELY-STANDARDIZE-VARIABLES");

    private static final SubLSymbol EL_UNIQUIFY_STANDARDIZE = makeSymbol("EL-UNIQUIFY-STANDARDIZE");

    private static final SubLSymbol EL_VAR_WITHOUT_QUOTE = makeSymbol("EL-VAR-WITHOUT-QUOTE");

    static private final SubLString $str23$_ = makeString("-");

    private static final SubLSymbol CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = makeSymbol("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $QUANTIFIED_SEQUENCE_VARIABLE = makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");

    private static final SubLSymbol EXISTENTIALS_OUT_INT = makeSymbol("EXISTENTIALS-OUT-INT");

    static private final SubLString $str29$Unexpected_sentence_type_in_exist = makeString("Unexpected sentence type in existentials-out-int: ~S");



    static private final SubLString $str36$Skolemizer_failed_to_classify_var = makeString("Skolemizer failed to classify variable ~a in sentence ~a~%");

    static private final SubLString $str37$skolem_constants_not_yet_supporte = makeString("skolem constants not yet supported");







    static private final SubLString $str41$make_skolem_fn_fn_doesn_t_know_ho = makeString("make-skolem-fn-fn doesn't know how to handle the quantifier ~S");

    static private final SubLString $str43$Unexpected_value_for__forbid_quan = makeString("Unexpected value for *forbid-quantified-sequence-variables?*: ~s");

    private static final SubLSymbol UNIVERSALS_OUT = makeSymbol("UNIVERSALS-OUT");

    static private final SubLString $str45$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in universals-out.");

    private static final SubLSymbol DISJUNCTIONS_IN = makeSymbol("DISJUNCTIONS-IN");

    static private final SubLString $str47$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in disjunctions-in.");

    private static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

    private static final SubLSymbol $BAD_EXPONENTIAL_DISJUNCTION = makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");

    private static final SubLInteger $int$200000 = makeInteger(200000);

    private static final SubLSymbol FORMULA_ARITY = makeSymbol("FORMULA-ARITY");

    static private final SubLString $str52$_s_is_not_a_conjunction__so_it_is = makeString("~s is not a conjunction, so it is not a CNF sentence.");

    static private final SubLString $str53$_s_is_not_a_disjunction__so__S_is = makeString("~s is not a disjunction, so ~S is not a CNF sentence.");

    private static final SubLSymbol CONJUNCTIONS_IN = makeSymbol("CONJUNCTIONS-IN");

    static private final SubLString $str55$Got_the_unexpected_formula__S_in_ = makeString("Got the unexpected formula ~S in conjunctions-in.");

    private static final SubLSymbol EL_DISJUNCTION_P = makeSymbol("EL-DISJUNCTION-P");

    private static final SubLSymbol $BAD_EXPONENTIAL_CONJUNCTION = makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");

    static private final SubLString $str58$_s_is_not_a_disjunction__so_it_is = makeString("~s is not a disjunction, so it is not a DNF sentence.");

    static private final SubLString $str59$_s_is_not_a_conjunction__so__S_is = makeString("~s is not a conjunction, so ~S is not a DNF sentence.");

    private static final SubLSymbol PACKAGE_XNF_CLAUSE = makeSymbol("PACKAGE-XNF-CLAUSE");

    static private final SubLSymbol $sym62$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol LEADING_UNIVERSAL_VARIABLES_1 = makeSymbol("LEADING-UNIVERSAL-VARIABLES-1");

    static private final SubLSymbol $sym64$STRING_ = makeSymbol("STRING<");



    private static final SubLSymbol CACHED_CNF_CLAUSAL_FORM = makeSymbol("CACHED-CNF-CLAUSAL-FORM");

    public static final SubLSymbol $cached_cnf_clausal_form_caching_state$ = makeSymbol("*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*");



    public static final SubLObject do_implications_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $outermost_implication$.currentBinding(thread);
                    try {
                        $outermost_implication$.bind(sentence, thread);
                        result = com.cyc.cycjava.cycl.clausifier.do_implications_recursive(sentence);
                    } finally {
                        $outermost_implication$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

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

    /**
     * Removes all implications and equivalences from SENTENCE,
     * returning a logically equivalent sentence.
     * Converts (#$implies <form1> <form2>) to (#$or (#$not <form1>) <form2>).
     * Does not simplify nested negations, disjunctions, or conjunctions.
     */
    @LispMethod(comment = "Removes all implications and equivalences from SENTENCE,\r\nreturning a logically equivalent sentence.\r\nConverts (#$implies <form1> <form2>) to (#$or (#$not <form1>) <form2>).\r\nDoes not simplify nested negations, disjunctions, or conjunctions.\nRemoves all implications and equivalences from SENTENCE,\nreturning a logically equivalent sentence.\nConverts (#$implies <form1> <form2>) to (#$or (#$not <form1>) <form2>).\nDoes not simplify nested negations, disjunctions, or conjunctions.")
    public static final SubLObject do_implications_recursive_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_utilities.encapsulate_formulaP(sentence)) {
                if (NIL != com.cyc.cycjava.cycl.clausifier.eliminate_existential_with_var_only_in_antecedentP(sentence, $innermost_implication$.getDynamicValue(thread), $outermost_implication$.getDynamicValue(thread))) {
                    return quantified_sub_sentence(sentence);
                } else {
                    return czer_utilities.encapsulate_formula(sentence, UNPROVIDED);
                }
            } else {
                if (NIL == el_formula_p(sentence)) {
                    return sentence;
                } else {
                    {
                        SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
                        SubLObject tempformula = sentence;
                        SubLObject sentence_1 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
                        SubLObject result = NIL;
                        if ((NIL != el_implication_p(sentence_1)) && (NIL != el_meets_pragmatic_requirement_p(cycl_utilities.sentence_arg2(sentence_1, UNPROVIDED)))) {
                            {
                                SubLObject disjunct_1 = NIL;
                                {
                                    SubLObject _prev_bind_0 = $innermost_implication$.currentBinding(thread);
                                    try {
                                        $innermost_implication$.bind(sentence_1, thread);
                                        {
                                            SubLObject _prev_bind_0_2 = $within_ask$.currentBinding(thread);
                                            try {
                                                $within_ask$.bind(T, thread);
                                                disjunct_1 = make_negation(funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_1, ONE_INTEGER));
                                            } finally {
                                                $within_ask$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                        result = make_disjunction(list(disjunct_1, funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_1, TWO_INTEGER)));
                                    } finally {
                                        $innermost_implication$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        } else {
                            if (NIL != el_implication_p(sentence_1)) {
                                {
                                    SubLObject disjunct_1 = NIL;
                                    {
                                        SubLObject _prev_bind_0 = $innermost_implication$.currentBinding(thread);
                                        try {
                                            $innermost_implication$.bind(sentence_1, thread);
                                            {
                                                SubLObject _prev_bind_0_3 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = czer_vars.$within_negationP$.currentBinding(thread);
                                                try {
                                                    at_vars.$within_disjunctionP$.bind(T, thread);
                                                    at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                                                    czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                                                    disjunct_1 = make_negation(funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_1, ONE_INTEGER));
                                                } finally {
                                                    czer_vars.$within_negationP$.rebind(_prev_bind_2, thread);
                                                    at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                                                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            result = make_disjunction(list(disjunct_1, funcall_formula_arg(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_1, TWO_INTEGER)));
                                        } finally {
                                            $innermost_implication$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } else {
                                result = pass_through_if_logical_op_or_quantified(symbol_function(DO_IMPLICATIONS_RECURSIVE), sentence_1);
                            }
                        }
                        if (NIL != seqvar) {
                            return nadd_sequence_var_to_end(seqvar, result);
                        } else {
                            return result;
                        }
                    }
                }
            }
        }
    }

    /**
     * Removes all implications and equivalences from SENTENCE,
     * returning a logically equivalent sentence.
     * Converts (#$implies <form1> <form2>) to (#$or (#$not <form1>) <form2>).
     * Does not simplify nested negations, disjunctions, or conjunctions.
     */
    @LispMethod(comment = "Removes all implications and equivalences from SENTENCE,\r\nreturning a logically equivalent sentence.\r\nConverts (#$implies <form1> <form2>) to (#$or (#$not <form1>) <form2>).\r\nDoes not simplify nested negations, disjunctions, or conjunctions.\nRemoves all implications and equivalences from SENTENCE,\nreturning a logically equivalent sentence.\nConverts (#$implies <form1> <form2>) to (#$or (#$not <form1>) <form2>).\nDoes not simplify nested negations, disjunctions, or conjunctions.")
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

    public static final SubLObject eliminate_existential_with_var_only_in_antecedentP_alt(SubLObject existential, SubLObject innermost_implication, SubLObject outermost_implication) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $eliminate_existential_with_var_only_in_antecedentP$.getDynamicValue(thread)) {
                return NIL;
            }
            if (((innermost_implication == outermost_implication) && (NIL != misc_utilities.initialized_p(innermost_implication))) && (NIL != el_existential_p(existential))) {
                {
                    SubLObject var = quantified_var(existential);
                    return sublisp_null(cycl_utilities.expression_find(var, cycl_utilities.formula_arg2(innermost_implication, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
            return NIL;
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

    /**
     * Removes all negations except for negated atomic sentences,
     * by using DeMorgan's Law and other transformations.
     * Assumes that the only operators in SENTENCE are #$and, #$or, #$not, and quantifiers.
     */
    @LispMethod(comment = "Removes all negations except for negated atomic sentences,\r\nby using DeMorgan\'s Law and other transformations.\r\nAssumes that the only operators in SENTENCE are #$and, #$or, #$not, and quantifiers.\nRemoves all negations except for negated atomic sentences,\nby using DeMorgan\'s Law and other transformations.\nAssumes that the only operators in SENTENCE are #$and, #$or, #$not, and quantifiers.")
    public static final SubLObject do_negations_alt(SubLObject sentence) {
        return com.cyc.cycjava.cycl.clausifier.do_negations_destructive(copy_formula(sentence));
    }

    /**
     * Removes all negations except for negated atomic sentences,
     * by using DeMorgan's Law and other transformations.
     * Assumes that the only operators in SENTENCE are #$and, #$or, #$not, and quantifiers.
     */
    @LispMethod(comment = "Removes all negations except for negated atomic sentences,\r\nby using DeMorgan\'s Law and other transformations.\r\nAssumes that the only operators in SENTENCE are #$and, #$or, #$not, and quantifiers.\nRemoves all negations except for negated atomic sentences,\nby using DeMorgan\'s Law and other transformations.\nAssumes that the only operators in SENTENCE are #$and, #$or, #$not, and quantifiers.")
    public static SubLObject do_negations(final SubLObject sentence) {
        return do_negations_destructive(copy_formula(sentence));
    }

    /**
     * A destructive version of @xref do-negations.
     */
    @LispMethod(comment = "A destructive version of @xref do-negations.")
    public static final SubLObject do_negations_destructive_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
                SubLObject tempformula = sentence;
                SubLObject sentence_4 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
                SubLObject result = NIL;
                if (NIL != czer_utilities.encapsulate_formulaP(sentence_4)) {
                    result = czer_utilities.encapsulate_formula(sentence_4, UNPROVIDED);
                } else {
                    if (NIL == el_formula_p(sentence_4)) {
                        result = sentence_4;
                    } else {
                        if (NIL != czer_utilities.true_negated_varP(sentence_4, UNPROVIDED)) {
                            result = com.cyc.cycjava.cycl.clausifier.lift_negation(sentence_4);
                        } else {
                            if (NIL != czer_utilities.true_negated_formulaP(sentence_4)) {
                                if (NIL != czer_utilities.within_disjunctionP()) {
                                    result = com.cyc.cycjava.cycl.clausifier.lift_negation(sentence_4);
                                } else {
                                    {
                                        SubLObject _prev_bind_0 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                                        try {
                                            czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
                                            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                                            result = make_unary_formula(cycl_utilities.formula_operator(sentence_4), funcall_formula_arg(symbol_function(DO_NEGATIONS_DESTRUCTIVE), sentence_4, ONE_INTEGER));
                                        } finally {
                                            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_1, thread);
                                            czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } else {
                                if (NIL != el_implication_p(sentence_4)) {
                                    result = com.cyc.cycjava.cycl.clausifier.do_negations_destructive(com.cyc.cycjava.cycl.clausifier.do_implications(sentence_4));
                                } else {
                                    if (NIL != el_negation_p(sentence_4)) {
                                        if (NIL != cycl_utilities.opaque_argP(sentence_4, ONE_INTEGER)) {
                                            result = sentence_4;
                                        } else {
                                            {
                                                SubLObject new_sentence = NIL;
                                                {
                                                    SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
                                                    try {
                                                        czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                                                        new_sentence = com.cyc.cycjava.cycl.clausifier.negation_in(sentence_4);
                                                    } finally {
                                                        czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                                if (NIL != el_negation_p(new_sentence)) {
                                                    result = new_sentence;
                                                } else {
                                                    result = com.cyc.cycjava.cycl.clausifier.do_negations_destructive(new_sentence);
                                                }
                                            }
                                        }
                                    } else {
                                        result = pass_through_if_logical_op_or_quantified(symbol_function(DO_NEGATIONS_DESTRUCTIVE), sentence_4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != seqvar) {
                    return nadd_sequence_var_to_end(seqvar, result);
                } else {
                    return result;
                }
            }
        }
    }

    /**
     * A destructive version of @xref do-negations.
     */
    @LispMethod(comment = "A destructive version of @xref do-negations.")
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

    /**
     * Negates SENTENCE by using the following transformations:
     * <ol>
     * <li>#$True becomes #$False
     * <li>#$False becomes #$True
     * <li>(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))
     * <li>(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))
     * <li>(#$not <form1>) becomes <form1>, but <form1> is recursively simplified
     * <li>(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>))
     * <li>(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>))
     * <li>(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))
     * <li>(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))
     * <li>(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
     * (#$thereExistAtMost  (- NUM 1) ?X <form1>)
     * </ol>
     * Any sentence not meeting any of the above criteria is negated by simply wrapping a #$not around it.
     */
    @LispMethod(comment = "Negates SENTENCE by using the following transformations:\r\n<ol>\r\n<li>#$True becomes #$False\r\n<li>#$False becomes #$True\r\n<li>(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))\r\n<li>(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))\r\n<li>(#$not <form1>) becomes <form1>, but <form1> is recursively simplified\r\n<li>(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>))\r\n<li>(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>))\r\n<li>(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\r\n<li>(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\r\n<li>(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\r\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\r\n</ol>\r\nAny sentence not meeting any of the above criteria is negated by simply wrapping a #$not around it.\nNegates SENTENCE by using the following transformations:\n<ol>\n<li>#$True becomes #$False\n<li>#$False becomes #$True\n<li>(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))\n<li>(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))\n<li>(#$not <form1>) becomes <form1>, but <form1> is recursively simplified\n<li>(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>))\n<li>(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>))\n<li>(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\n<li>(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\n<li>(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\n</ol>\nAny sentence not meeting any of the above criteria is negated by simply wrapping a #$not around it.")
    public static final SubLObject negate_formula_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (sentence == $$True) {
                return $$False;
            } else {
                if (sentence == $$False) {
                    return $$True;
                } else {
                    if (NIL != czer_utilities.encapsulate_formulaP(sentence)) {
                        return com.cyc.cycjava.cycl.clausifier.negate_encapsulate_sentence(sentence);
                    } else {
                        if (NIL != el_conjunction_p(sentence)) {
                            return com.cyc.cycjava.cycl.clausifier.negate_conjunction(sentence);
                        } else {
                            if (NIL != el_disjunction_p(sentence)) {
                                return com.cyc.cycjava.cycl.clausifier.negate_disjunction_destructive(sentence);
                            } else {
                                if (NIL != el_negation_p(sentence)) {
                                    {
                                        SubLObject result = NIL;
                                        {
                                            SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
                                            try {
                                                czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                                                result = com.cyc.cycjava.cycl.clausifier.negation_in(com.cyc.cycjava.cycl.clausifier.negate_negation(sentence));
                                            } finally {
                                                czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        return result;
                                    }
                                } else {
                                    if (NIL != cycl_universal_p(sentence)) {
                                        return com.cyc.cycjava.cycl.clausifier.negate_universal(sentence);
                                    } else {
                                        if (NIL != el_existential_p(sentence)) {
                                            return com.cyc.cycjava.cycl.clausifier.negate_existential(sentence);
                                        } else {
                                            if (NIL != el_existential_min_p(sentence)) {
                                                return com.cyc.cycjava.cycl.clausifier.negate_existential_min(sentence);
                                            } else {
                                                if (NIL != el_existential_max_p(sentence)) {
                                                    return com.cyc.cycjava.cycl.clausifier.negate_existential_max(sentence);
                                                } else {
                                                    if (NIL != el_existential_exact_p(sentence)) {
                                                        return com.cyc.cycjava.cycl.clausifier.negate_existential_exact(sentence);
                                                    } else {
                                                        if (NIL != czer_utilities.true_negated_varP(sentence, UNPROVIDED)) {
                                                            return com.cyc.cycjava.cycl.clausifier.lift_negation(sentence);
                                                        } else {
                                                            if (NIL != czer_utilities.true_negated_formulaP(sentence)) {
                                                                return com.cyc.cycjava.cycl.clausifier.negate_true_sentence(sentence);
                                                            } else {
                                                                if (NIL != el_implication_p(sentence)) {
                                                                    return uncanonicalizer.implications_in(com.cyc.cycjava.cycl.clausifier.do_negations_destructive(com.cyc.cycjava.cycl.clausifier.do_implications(cycl_utilities.negate(sentence))));
                                                                } else {
                                                                    return make_negation(sentence);
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
                        }
                    }
                }
            }
        }
    }

    /**
     * Negates SENTENCE by using the following transformations:
     * <ol>
     * <li>#$True becomes #$False
     * <li>#$False becomes #$True
     * <li>(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))
     * <li>(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))
     * <li>(#$not <form1>) becomes <form1>, but <form1> is recursively simplified
     * <li>(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>))
     * <li>(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>))
     * <li>(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))
     * <li>(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))
     * <li>(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
     * (#$thereExistAtMost  (- NUM 1) ?X <form1>)
     * </ol>
     * Any sentence not meeting any of the above criteria is negated by simply wrapping a #$not around it.
     */
    @LispMethod(comment = "Negates SENTENCE by using the following transformations:\r\n<ol>\r\n<li>#$True becomes #$False\r\n<li>#$False becomes #$True\r\n<li>(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))\r\n<li>(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))\r\n<li>(#$not <form1>) becomes <form1>, but <form1> is recursively simplified\r\n<li>(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>))\r\n<li>(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>))\r\n<li>(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\r\n<li>(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\r\n<li>(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\r\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\r\n</ol>\r\nAny sentence not meeting any of the above criteria is negated by simply wrapping a #$not around it.\nNegates SENTENCE by using the following transformations:\n<ol>\n<li>#$True becomes #$False\n<li>#$False becomes #$True\n<li>(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))\n<li>(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))\n<li>(#$not <form1>) becomes <form1>, but <form1> is recursively simplified\n<li>(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>))\n<li>(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>))\n<li>(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\n<li>(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\n<li>(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\n</ol>\nAny sentence not meeting any of the above criteria is negated by simply wrapping a #$not around it.")
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

    /**
     * Moves a negation inwards by the following transformations:
     * 1. (#$not #$True) becomes #$False
     * 2. (#$not #$False) becomes #$True
     * 3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))
     * 4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))
     * 5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified
     * 6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))
     * 7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))
     * 8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))
     * 9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))
     * 10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
     * (#$thereExistAtMost  (- NUM 1) ?X <form1>)
     * Note that negated implications or other forms are not simplified.
     * If this function does make a simplification, it is guaranteed to return something that is not a negation.
     * If you pass a sentence that is not a negation, it will return that sentence without any changes.
     */
    @LispMethod(comment = "Moves a negation inwards by the following transformations:\r\n1. (#$not #$True) becomes #$False\r\n2. (#$not #$False) becomes #$True\r\n3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))\r\n4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))\r\n5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified\r\n6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))\r\n7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))\r\n8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\r\n9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\r\n10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\r\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\r\nNote that negated implications or other forms are not simplified.\r\nIf this function does make a simplification, it is guaranteed to return something that is not a negation.\r\nIf you pass a sentence that is not a negation, it will return that sentence without any changes.\nMoves a negation inwards by the following transformations:\n1. (#$not #$True) becomes #$False\n2. (#$not #$False) becomes #$True\n3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))\n4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))\n5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified\n6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))\n7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))\n8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\n9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\n10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\nNote that negated implications or other forms are not simplified.\nIf this function does make a simplification, it is guaranteed to return something that is not a negation.\nIf you pass a sentence that is not a negation, it will return that sentence without any changes.")
    public static final SubLObject negation_in_alt(SubLObject sentence) {
        if (NIL == el_negation_p(sentence)) {
            return sentence;
        }
        return com.cyc.cycjava.cycl.clausifier.negate_formula(cycl_utilities.formula_arg1(sentence, $REGULARIZE));
    }

    /**
     * Moves a negation inwards by the following transformations:
     * 1. (#$not #$True) becomes #$False
     * 2. (#$not #$False) becomes #$True
     * 3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))
     * 4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))
     * 5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified
     * 6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))
     * 7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))
     * 8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))
     * 9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))
     * 10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
     * (#$thereExistAtMost  (- NUM 1) ?X <form1>)
     * Note that negated implications or other forms are not simplified.
     * If this function does make a simplification, it is guaranteed to return something that is not a negation.
     * If you pass a sentence that is not a negation, it will return that sentence without any changes.
     */
    @LispMethod(comment = "Moves a negation inwards by the following transformations:\r\n1. (#$not #$True) becomes #$False\r\n2. (#$not #$False) becomes #$True\r\n3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))\r\n4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))\r\n5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified\r\n6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))\r\n7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))\r\n8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\r\n9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\r\n10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\r\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\r\nNote that negated implications or other forms are not simplified.\r\nIf this function does make a simplification, it is guaranteed to return something that is not a negation.\r\nIf you pass a sentence that is not a negation, it will return that sentence without any changes.\nMoves a negation inwards by the following transformations:\n1. (#$not #$True) becomes #$False\n2. (#$not #$False) becomes #$True\n3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))\n4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))\n5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified\n6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))\n7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))\n8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))\n9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))\n10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\n(#$thereExistAtMost  (- NUM 1) ?X <form1>)\nNote that negated implications or other forms are not simplified.\nIf this function does make a simplification, it is guaranteed to return something that is not a negation.\nIf you pass a sentence that is not a negation, it will return that sentence without any changes.")
    public static SubLObject negation_in(final SubLObject sentence) {
        if (NIL == el_negation_p(sentence)) {
            return sentence;
        }
        return negate_formula(cycl_utilities.formula_arg1(sentence, $REGULARIZE));
    }/**
     * Moves a negation inwards by the following transformations:
     * 1. (#$not #$True) becomes #$False
     * 2. (#$not #$False) becomes #$True
     * 3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))
     * 4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))
     * 5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified
     * 6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))
     * 7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))
     * 8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))
     * 9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))
     * 10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
     * (#$thereExistAtMost  (- NUM 1) ?X <form1>)
     * Note that negated implications or other forms are not simplified.
     * If this function does make a simplification, it is guaranteed to return something that is not a negation.
     * If you pass a sentence that is not a negation, it will return that sentence without any changes.
     */


    public static final SubLObject negate_quantified_sentence_alt(SubLObject sentence) {
        if (NIL != cycl_universal_p(sentence)) {
            return com.cyc.cycjava.cycl.clausifier.negate_universal(sentence);
        } else {
            if (NIL != el_existential_p(sentence)) {
                return com.cyc.cycjava.cycl.clausifier.negate_existential(sentence);
            } else {
                if (NIL != el_existential_min_p(sentence)) {
                    return com.cyc.cycjava.cycl.clausifier.negate_existential_min(sentence);
                } else {
                    if (NIL != el_existential_max_p(sentence)) {
                        return com.cyc.cycjava.cycl.clausifier.negate_existential_max(sentence);
                    } else {
                        if (NIL != el_existential_exact_p(sentence)) {
                            return com.cyc.cycjava.cycl.clausifier.negate_existential_exact(sentence);
                        } else {
                            el_error(FOUR_INTEGER, $str_alt9$_s_is_not_a_quantified_sentence, sentence, UNPROVIDED, UNPROVIDED);
                            return sentence;
                        }
                    }
                }
            }
        }
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

    /**
     *
     *
     * @return EL sentence; negation of SENTENCE.
    Assumes that SENTENCE is atomic and does no simplification.
     */
    @LispMethod(comment = "@return EL sentence; negation of SENTENCE.\r\nAssumes that SENTENCE is atomic and does no simplification.")
    public static final SubLObject negate_atomic_alt(SubLObject sentence) {
        return make_negation(sentence);
    }

    /**
     *
     *
     * @return EL sentence; negation of SENTENCE.
    Assumes that SENTENCE is atomic and does no simplification.
     */
    @LispMethod(comment = "@return EL sentence; negation of SENTENCE.\r\nAssumes that SENTENCE is atomic and does no simplification.")
    public static SubLObject negate_atomic(final SubLObject sentence) {
        return make_negation(sentence);
    }

    /**
     * Assumes that NEGATION is a negation.
     * Moves negations inwards by the following transformation:
     * (#$not <form1>) becomes <form1>
     */
    @LispMethod(comment = "Assumes that NEGATION is a negation.\r\nMoves negations inwards by the following transformation:\r\n(#$not <form1>) becomes <form1>\nAssumes that NEGATION is a negation.\nMoves negations inwards by the following transformation:\n(#$not <form1>) becomes <form1>")
    public static final SubLObject negate_negation_alt(SubLObject negation) {
        return cycl_utilities.formula_arg1(negation, UNPROVIDED);
    }

    /**
     * Assumes that NEGATION is a negation.
     * Moves negations inwards by the following transformation:
     * (#$not <form1>) becomes <form1>
     */
    @LispMethod(comment = "Assumes that NEGATION is a negation.\r\nMoves negations inwards by the following transformation:\r\n(#$not <form1>) becomes <form1>\nAssumes that NEGATION is a negation.\nMoves negations inwards by the following transformation:\n(#$not <form1>) becomes <form1>")
    public static SubLObject negate_negation(final SubLObject negation) {
        return cycl_utilities.formula_arg1(negation, UNPROVIDED);
    }/**
     * Assumes that NEGATION is a negation.
     * Moves negations inwards by the following transformation:
     * (#$not <form1>) becomes <form1>
     */


    /**
     * Assuming NEGATIONS are valid negated el sentences, return their un-negated versions.
     */
    @LispMethod(comment = "Assuming NEGATIONS are valid negated el sentences, return their un-negated versions.")
    public static final SubLObject negate_negations_alt(SubLObject negations) {
        return list_utilities.nmapcar(symbol_function(NEGATE_NEGATION), negations);
    }

    /**
     * Assuming NEGATIONS are valid negated el sentences, return their un-negated versions.
     */
    @LispMethod(comment = "Assuming NEGATIONS are valid negated el sentences, return their un-negated versions.")
    public static SubLObject negate_negations(final SubLObject negations) {
        return list_utilities.nmapcar(symbol_function(NEGATE_NEGATION), negations);
    }/**
     * Assuming NEGATIONS are valid negated el sentences, return their un-negated versions.
     */


    /**
     * Assumes that CONJUNCTION is a conjunction.
     * Moves negations inwards by the following transformation:
     * (#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))
     */
    @LispMethod(comment = "Assumes that CONJUNCTION is a conjunction.\r\nMoves negations inwards by the following transformation:\r\n(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))\nAssumes that CONJUNCTION is a conjunction.\nMoves negations inwards by the following transformation:\n(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))")
    public static final SubLObject negate_conjunction_alt(SubLObject conjunction) {
        return simplifier.ndisjoin(Mapping.mapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, UNPROVIDED)), UNPROVIDED);
    }

    /**
     * Assumes that CONJUNCTION is a conjunction.
     * Moves negations inwards by the following transformation:
     * (#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))
     */
    @LispMethod(comment = "Assumes that CONJUNCTION is a conjunction.\r\nMoves negations inwards by the following transformation:\r\n(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))\nAssumes that CONJUNCTION is a conjunction.\nMoves negations inwards by the following transformation:\n(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))")
    public static SubLObject negate_conjunction(final SubLObject conjunction) {
        return simplifier.ndisjoin(Mapping.mapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, UNPROVIDED)), UNPROVIDED);
    }/**
     * Assumes that CONJUNCTION is a conjunction.
     * Moves negations inwards by the following transformation:
     * (#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))
     */


    /**
     * A destructive version of @xref negate-conjunction.
     */
    @LispMethod(comment = "A destructive version of @xref negate-conjunction.")
    public static final SubLObject negate_conjunction_destructive_alt(SubLObject conjunction) {
        return simplifier.ndisjoin(list_utilities.nmapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, UNPROVIDED)), UNPROVIDED);
    }

    @LispMethod(comment = "A destructive version of @xref negate-conjunction.")
    public static SubLObject negate_conjunction_destructive(final SubLObject conjunction) {
        return simplifier.ndisjoin(list_utilities.nmapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, UNPROVIDED)), UNPROVIDED);
    }/**
     * A destructive version of @xref negate-conjunction.
     */


    /**
     * Assumes that DISJUNCTION is a disjunction.
     * Moves negations inwards by the following transformation:
     * (#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))
     */
    @LispMethod(comment = "Assumes that DISJUNCTION is a disjunction.\r\nMoves negations inwards by the following transformation:\r\n(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))\nAssumes that DISJUNCTION is a disjunction.\nMoves negations inwards by the following transformation:\n(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))")
    public static final SubLObject negate_disjunction_destructive_alt(SubLObject disjunction) {
        return simplifier.nconjoin(list_utilities.nmapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(disjunction, UNPROVIDED)), UNPROVIDED);
    }

    @LispMethod(comment = "Assumes that DISJUNCTION is a disjunction.\r\nMoves negations inwards by the following transformation:\r\n(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))\nAssumes that DISJUNCTION is a disjunction.\nMoves negations inwards by the following transformation:\n(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))")
    public static SubLObject negate_disjunction_destructive(final SubLObject disjunction) {
        return simplifier.nconjoin(list_utilities.nmapcar(symbol_function(NEGATE_FORMULA), cycl_utilities.formula_args(disjunction, UNPROVIDED)), UNPROVIDED);
    }/**
     * Assumes that DISJUNCTION is a disjunction.
     * Moves negations inwards by the following transformation:
     * (#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))
     */


    /**
     * Assumes that UNIVERSAL is a universally quantified sentence.
     * Moves negations inwards by the following transformation:
     * (#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>)).
     */
    @LispMethod(comment = "Assumes that UNIVERSAL is a universally quantified sentence.\r\nMoves negations inwards by the following transformation:\r\n(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>)).\nAssumes that UNIVERSAL is a universally quantified sentence.\nMoves negations inwards by the following transformation:\n(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>)).")
    public static final SubLObject negate_universal_alt(SubLObject universal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject quantifier = unmake_binary_formula(universal);
                SubLObject variable = thread.secondMultipleValue();
                SubLObject subform = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return make_existential(variable, com.cyc.cycjava.cycl.clausifier.negate_formula(subform));
            }
        }
    }

    @LispMethod(comment = "Assumes that UNIVERSAL is a universally quantified sentence.\r\nMoves negations inwards by the following transformation:\r\n(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>)).\nAssumes that UNIVERSAL is a universally quantified sentence.\nMoves negations inwards by the following transformation:\n(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>)).")
    public static SubLObject negate_universal(final SubLObject universal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = unmake_binary_formula(universal);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return make_existential(variable, negate_formula(subform));
    }/**
     * Assumes that UNIVERSAL is a universally quantified sentence.
     * Moves negations inwards by the following transformation:
     * (#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>)).
     */


    /**
     * Assumes that EXISTENTIAL is a existentially quantified sentence.
     * Moves negations inwards by the following transformation:
     * (#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>)).
     */
    @LispMethod(comment = "Assumes that EXISTENTIAL is a existentially quantified sentence.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>)).\nAssumes that EXISTENTIAL is a existentially quantified sentence.\nMoves negations inwards by the following transformation:\n(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>)).")
    public static final SubLObject negate_existential_alt(SubLObject existential) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject quantifier = unmake_binary_formula(existential);
                SubLObject variable = thread.secondMultipleValue();
                SubLObject subform = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return make_universal(variable, com.cyc.cycjava.cycl.clausifier.negate_formula(subform));
            }
        }
    }

    @LispMethod(comment = "Assumes that EXISTENTIAL is a existentially quantified sentence.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>)).\nAssumes that EXISTENTIAL is a existentially quantified sentence.\nMoves negations inwards by the following transformation:\n(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>)).")
    public static SubLObject negate_existential(final SubLObject existential) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quantifier = unmake_binary_formula(existential);
        final SubLObject variable = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return make_universal(variable, negate_formula(subform));
    }/**
     * Assumes that EXISTENTIAL is a existentially quantified sentence.
     * Moves negations inwards by the following transformation:
     * (#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>)).
     */


    /**
     * Assumes that EXISTENTIAL-MIN is an existential with a lower bound.
     * Moves negations inwards by the following transformation:
     * (#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>)).
     */
    @LispMethod(comment = "Assumes that EXISTENTIAL-MIN is an existential with a lower bound.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>)).\nAssumes that EXISTENTIAL-MIN is an existential with a lower bound.\nMoves negations inwards by the following transformation:\n(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>)).")
    public static final SubLObject negate_existential_min_alt(SubLObject existential_min) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject quantifier = unmake_ternary_formula(existential_min);
                SubLObject number = thread.secondMultipleValue();
                SubLObject variable = thread.thirdMultipleValue();
                SubLObject subform = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (!number.isInteger()) {
                    return make_existential_max(make_binary_formula($$DifferenceFn, number, ONE_INTEGER), variable, subform);
                } else {
                    if (number.numE(ONE_INTEGER)) {
                        return make_universal(variable, com.cyc.cycjava.cycl.clausifier.negate_formula(subform));
                    } else {
                        if (number.numG(ONE_INTEGER)) {
                            return make_existential_max(subtract(number, ONE_INTEGER), variable, subform);
                        } else {
                            el_error(FOUR_INTEGER, $str_alt13$_s_contained_the_invalid_bound__D, existential_min, number, UNPROVIDED);
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Assumes that EXISTENTIAL-MIN is an existential with a lower bound.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>)).\nAssumes that EXISTENTIAL-MIN is an existential with a lower bound.\nMoves negations inwards by the following transformation:\n(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>)).")
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
    }/**
     * Assumes that EXISTENTIAL-MIN is an existential with a lower bound.
     * Moves negations inwards by the following transformation:
     * (#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>)).
     */


    /**
     * Assumes that EXISTENTIAL-MAX is an existential with an upper bound.
     * Moves negations inwards by the following transformation:
     * (#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>)).
     */
    @LispMethod(comment = "Assumes that EXISTENTIAL-MAX is an existential with an upper bound.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>)).\nAssumes that EXISTENTIAL-MAX is an existential with an upper bound.\nMoves negations inwards by the following transformation:\n(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>)).")
    public static final SubLObject negate_existential_max_alt(SubLObject existential_max) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject quantifier = unmake_ternary_formula(existential_max);
                SubLObject number = thread.secondMultipleValue();
                SubLObject variable = thread.thirdMultipleValue();
                SubLObject subform = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (!number.isInteger()) {
                    return make_existential_min(make_binary_formula($$PlusFn, number, ONE_INTEGER), variable, subform);
                } else {
                    if (number.numG(ZERO_INTEGER)) {
                        return make_existential_min(add(number, ONE_INTEGER), variable, subform);
                    } else {
                        el_error(FOUR_INTEGER, $str_alt13$_s_contained_the_invalid_bound__D, existential_max, number, UNPROVIDED);
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Assumes that EXISTENTIAL-MAX is an existential with an upper bound.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>)).\nAssumes that EXISTENTIAL-MAX is an existential with an upper bound.\nMoves negations inwards by the following transformation:\n(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>)).")
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
    }/**
     * Assumes that EXISTENTIAL-MAX is an existential with an upper bound.
     * Moves negations inwards by the following transformation:
     * (#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>)).
     */


    /**
     * Assumes that EXISTENTIAL-EXACT is an existential with an exact bound.
     * Moves negations inwards by the following transformation:
     * (#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
     * (#$thereExistAtMost  (- NUM 1) ?X <form1>).
     */
    @LispMethod(comment = "Assumes that EXISTENTIAL-EXACT is an existential with an exact bound.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\r\n(#$thereExistAtMost  (- NUM 1) ?X <form1>).\nAssumes that EXISTENTIAL-EXACT is an existential with an exact bound.\nMoves negations inwards by the following transformation:\n(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\n(#$thereExistAtMost  (- NUM 1) ?X <form1>).")
    public static final SubLObject negate_existential_exact_alt(SubLObject existential_exact) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject quantifier = unmake_ternary_formula(existential_exact);
                SubLObject number = thread.secondMultipleValue();
                SubLObject variable = thread.thirdMultipleValue();
                SubLObject subform = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (!number.isInteger()) {
                    return simplifier.ndisjoin(list(make_existential_min(make_binary_formula($$PlusFn, number, ONE_INTEGER), variable, subform), make_existential_max(make_binary_formula($$DifferenceFn, number, ONE_INTEGER), variable, subform)), UNPROVIDED);
                } else {
                    if (number.numE(ONE_INTEGER)) {
                        return simplifier.ndisjoin(list(make_universal(variable, com.cyc.cycjava.cycl.clausifier.negate_formula(subform)), make_existential_min(TWO_INTEGER, variable, subform)), UNPROVIDED);
                    } else {
                        if (number.numG(ONE_INTEGER)) {
                            return simplifier.ndisjoin(list(make_existential_min(add(number, ONE_INTEGER), variable, subform), make_existential_max(subtract(number, ONE_INTEGER), variable, subform)), UNPROVIDED);
                        } else {
                            el_error(FOUR_INTEGER, $str_alt13$_s_contained_the_invalid_bound__D, existential_exact, number, UNPROVIDED);
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Assumes that EXISTENTIAL-EXACT is an existential with an exact bound.\r\nMoves negations inwards by the following transformation:\r\n(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\r\n(#$thereExistAtMost  (- NUM 1) ?X <form1>).\nAssumes that EXISTENTIAL-EXACT is an existential with an exact bound.\nMoves negations inwards by the following transformation:\n(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)\n(#$thereExistAtMost  (- NUM 1) ?X <form1>).")
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
    }/**
     * Assumes that EXISTENTIAL-EXACT is an existential with an exact bound.
     * Moves negations inwards by the following transformation:
     * (#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
     * (#$thereExistAtMost  (- NUM 1) ?X <form1>).
     */


    public static final SubLObject negate_true_sentence_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sub_sentence = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$within_negationP$.currentBinding(thread);
                    try {
                        czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                        czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                        sub_sentence = com.cyc.cycjava.cycl.clausifier.do_negations_destructive(cycl_utilities.sentence_arg1(sentence, UNPROVIDED));
                    } finally {
                        czer_vars.$within_negationP$.rebind(_prev_bind_1, thread);
                        czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
                    }
                }
                return com.cyc.cycjava.cycl.clausifier.negate_atomic(make_unary_formula(cycl_utilities.sentence_arg0(sentence), sub_sentence));
            }
        }
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

    public static final SubLObject negate_encapsulate_sentence_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $within_ask$.getDynamicValue(thread)) && (NIL != possibly_el_quantified_sentence_p(sentence))) {
                return czer_utilities.make_intensional_lit(com.cyc.cycjava.cycl.clausifier.negate_quantified_sentence(sentence));
            } else {
                return com.cyc.cycjava.cycl.clausifier.negate_atomic(czer_utilities.encapsulate_formula(sentence, UNPROVIDED));
            }
        }
    }

    public static SubLObject negate_encapsulate_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $within_ask$.getDynamicValue(thread)) && (NIL != possibly_el_quantified_sentence_p(sentence))) {
            return czer_utilities.make_intensional_lit(negate_quantified_sentence(sentence));
        }
        return negate_atomic(czer_utilities.encapsulate_formula(sentence, UNPROVIDED));
    }

    /**
     * used for trueSentence
     */
    @LispMethod(comment = "used for trueSentence")
    public static final SubLObject lift_negation_alt(SubLObject sentence) {
        if (NIL != el_unary_formula_p(sentence)) {
            {
                SubLObject operator = cycl_utilities.sentence_arg0(sentence);
                SubLObject sub_sentence = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
                if (NIL != czer_utilities.true_negated_varP(sentence, UNPROVIDED)) {
                    {
                        SubLObject unnegated_arg = cycl_utilities.sentence_arg1(sub_sentence, UNPROVIDED);
                        return com.cyc.cycjava.cycl.clausifier.negate_atomic(make_unary_formula(operator, unnegated_arg));
                    }
                } else {
                    if (NIL != el_negation_p(sub_sentence)) {
                        {
                            SubLObject unnegated_arg = com.cyc.cycjava.cycl.clausifier.do_negations_destructive(cycl_utilities.sentence_arg1(sub_sentence, UNPROVIDED));
                            return com.cyc.cycjava.cycl.clausifier.negate_atomic(make_unary_formula(operator, unnegated_arg));
                        }
                    } else {
                        if (NIL != el_quantified_negation_p(sub_sentence)) {
                            {
                                SubLObject unnegated_arg = com.cyc.cycjava.cycl.clausifier.negate_quantified_sentence(sub_sentence);
                                return com.cyc.cycjava.cycl.clausifier.negate_atomic(make_unary_formula(operator, unnegated_arg));
                            }
                        } else {
                            return sentence;
                        }
                    }
                }
            }
        } else {
            return sentence;
        }
    }

    @LispMethod(comment = "used for trueSentence")
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
    }/**
     * used for trueSentence
     */


    public static final SubLObject czer_explicitify_implicit_quantifiers_alt(SubLObject sentence) {
        if (NIL != com.cyc.cycjava.cycl.clausifier.assume_free_vars_are_existentially_boundP()) {
            return com.cyc.cycjava.cycl.clausifier.czer_explicitify_implicit_existential_quantifiers(sentence);
        } else {
            return com.cyc.cycjava.cycl.clausifier.czer_explicitify_implicit_universal_quantifiers(sentence);
        }
    }

    public static SubLObject czer_explicitify_implicit_quantifiers(final SubLObject sentence) {
        if (NIL != assume_free_vars_are_existentially_boundP()) {
            return czer_explicitify_implicit_existential_quantifiers(sentence);
        }
        return czer_explicitify_implicit_universal_quantifiers(sentence);
    }

    /**
     * Wraps SENTENCE in #$forAll statements (if needed) to quantify all the free variables within SENTENCE.
     * Should appear within a binding of *newly-introduced-universals*
     *
     * @see explicitify-implicit-universal-quantifiers
     */
    @LispMethod(comment = "Wraps SENTENCE in #$forAll statements (if needed) to quantify all the free variables within SENTENCE.\r\nShould appear within a binding of *newly-introduced-universals*\r\n\r\n@see explicitify-implicit-universal-quantifiers\nWraps SENTENCE in #$forAll statements (if needed) to quantify all the free variables within SENTENCE.\nShould appear within a binding of *newly-introduced-universals*")
    public static final SubLObject czer_explicitify_implicit_universal_quantifiers_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject free_vars = sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = free_vars;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    sentence = make_universal(var, sentence);
                    if ($newly_introduced_universals$.getDynamicValue(thread).isList()) {
                        $newly_introduced_universals$.setDynamicValue(cons(var, $newly_introduced_universals$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return sentence;
        }
    }

    @LispMethod(comment = "Wraps SENTENCE in #$forAll statements (if needed) to quantify all the free variables within SENTENCE.\r\nShould appear within a binding of *newly-introduced-universals*\r\n\r\n@see explicitify-implicit-universal-quantifiers\nWraps SENTENCE in #$forAll statements (if needed) to quantify all the free variables within SENTENCE.\nShould appear within a binding of *newly-introduced-universals*")
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
    }/**
     * Wraps SENTENCE in #$forAll statements (if needed) to quantify all the free variables within SENTENCE.
     * Should appear within a binding of *newly-introduced-universals*
     *
     * @see explicitify-implicit-universal-quantifiers
     */


    /**
     * Wraps SENTENCE in #$thereExists statements (if needed) to quantify all the free variables within SENTENCE.
     */
    @LispMethod(comment = "Wraps SENTENCE in #$thereExists statements (if needed) to quantify all the free variables within SENTENCE.")
    public static final SubLObject czer_explicitify_implicit_existential_quantifiers_alt(SubLObject sentence) {
        return explicitify_implicit_existential_quantifiers(sentence);
    }

    @LispMethod(comment = "Wraps SENTENCE in #$thereExists statements (if needed) to quantify all the free variables within SENTENCE.")
    public static SubLObject czer_explicitify_implicit_existential_quantifiers(final SubLObject sentence) {
        return explicitify_implicit_existential_quantifiers(sentence);
    }/**
     * Wraps SENTENCE in #$thereExists statements (if needed) to quantify all the free variables within SENTENCE.
     */


    public static final SubLObject assume_free_vars_are_existentially_boundP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return czer_vars.$assume_free_vars_are_existentially_boundP$.getDynamicValue(thread);
        }
    }

    public static SubLObject assume_free_vars_are_existentially_boundP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return czer_vars.$assume_free_vars_are_existentially_boundP$.getDynamicValue(thread);
    }

    /**
     * Renames all variables into a canonical order, with the innermost variables having smaller indices.
     * protected version created to be used outside the canonicalizer.
     * Assumes that all universal quantification is explicit.
     * Binds the el variable namespace.
     *
     * @unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*
     */
    @LispMethod(comment = "Renames all variables into a canonical order, with the innermost variables having smaller indices.\r\nprotected version created to be used outside the canonicalizer.\r\nAssumes that all universal quantification is explicit.\r\nBinds the el variable namespace.\r\n\r\n@unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*\nRenames all variables into a canonical order, with the innermost variables having smaller indices.\nprotected version created to be used outside the canonicalizer.\nAssumes that all universal quantification is explicit.\nBinds the el variable namespace.")
    public static final SubLObject standardize_sentence_variables_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sentence, EL_FORMULA_P);
            {
                SubLObject v_return = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                    try {
                        czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                        czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread))) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
                        czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$standardize_variables_memory$.getDynamicValue(thread))) : NIL, thread);
                        v_return = com.cyc.cycjava.cycl.clausifier.standardize_variables(copy_tree(sentence));
                    } finally {
                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_1, thread);
                        czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_return;
            }
        }
    }

    @LispMethod(comment = "Renames all variables into a canonical order, with the innermost variables having smaller indices.\r\nprotected version created to be used outside the canonicalizer.\r\nAssumes that all universal quantification is explicit.\r\nBinds the el variable namespace.\r\n\r\n@unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*\nRenames all variables into a canonical order, with the innermost variables having smaller indices.\nprotected version created to be used outside the canonicalizer.\nAssumes that all universal quantification is explicit.\nBinds the el variable namespace.")
    public static SubLObject standardize_sentence_variables(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_formula_p(sentence) : "! el_utilities.el_formula_p(sentence) " + ("el_utilities.el_formula_p(sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(sentence) ") + sentence;
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
    }/**
     * Renames all variables into a canonical order, with the innermost variables having smaller indices.
     * protected version created to be used outside the canonicalizer.
     * Assumes that all universal quantification is explicit.
     * Binds the el variable namespace.
     *
     * @unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*
     */


    /**
     * Renames all variables into a canonical order, with the innermost variables having smaller indices.
     * Assumes that all universal quantification is explicit.
     * Assumes that the EL variable namespace is bound.
     *
     * @unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*
     */
    @LispMethod(comment = "Renames all variables into a canonical order, with the innermost variables having smaller indices.\r\nAssumes that all universal quantification is explicit.\r\nAssumes that the EL variable namespace is bound.\r\n\r\n@unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*\nRenames all variables into a canonical order, with the innermost variables having smaller indices.\nAssumes that all universal quantification is explicit.\nAssumes that the EL variable namespace is bound.")
    public static final SubLObject standardize_variables_alt(SubLObject sentence) {
        if (NIL != groundP(sentence, UNPROVIDED)) {
            return sentence;
        }
        {
            SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
            SubLObject tempformula = sentence;
            SubLObject sentence_5 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
            SubLObject result = NIL;
            czer_main.initialize_symbol_suffix_table(sentence_5);
            result = com.cyc.cycjava.cycl.clausifier.recursively_standardize_variables(sentence_5);
            result = czer_main.el_nununiquify_vars_int(result, T, UNPROVIDED);
            if (NIL != seqvar) {
                return nadd_sequence_var_to_end(seqvar, result);
            } else {
                return result;
            }
        }
    }

    @LispMethod(comment = "Renames all variables into a canonical order, with the innermost variables having smaller indices.\r\nAssumes that all universal quantification is explicit.\r\nAssumes that the EL variable namespace is bound.\r\n\r\n@unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*\nRenames all variables into a canonical order, with the innermost variables having smaller indices.\nAssumes that all universal quantification is explicit.\nAssumes that the EL variable namespace is bound.")
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
    }/**
     * Renames all variables into a canonical order, with the innermost variables having smaller indices.
     * Assumes that all universal quantification is explicit.
     * Assumes that the EL variable namespace is bound.
     *
     * @unknown check if the variables are already named with a prefix of *canonical-variable-name-stem*
     */


    /**
     * Renames all quantified variables into a canonical order, with the innermost variables having smaller indices.
     * Variables at the same depth are ordered from left to right.
     * Assumes that *standardize-variables-memory* is bound.
     * Also assumes that implications and other weird logical operators have been removed.
     */
    @LispMethod(comment = "Renames all quantified variables into a canonical order, with the innermost variables having smaller indices.\r\nVariables at the same depth are ordered from left to right.\r\nAssumes that *standardize-variables-memory* is bound.\r\nAlso assumes that implications and other weird logical operators have been removed.\nRenames all quantified variables into a canonical order, with the innermost variables having smaller indices.\nVariables at the same depth are ordered from left to right.\nAssumes that *standardize-variables-memory* is bound.\nAlso assumes that implications and other weird logical operators have been removed.")
    public static final SubLObject recursively_standardize_variables_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_formula_p(sentence)) {
                return sentence;
            } else {
                if ((NIL != cycl_grammar.fast_escape_quote_term_p(sentence)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(sentence))) {
                    {
                        SubLObject standardized = NIL;
                        {
                            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                            try {
                                czer_vars.$inside_quote$.bind(NIL, thread);
                                standardized = make_unary_formula(cycl_utilities.formula_arg0(sentence), com.cyc.cycjava.cycl.clausifier.recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, UNPROVIDED)));
                            } finally {
                                czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return standardized;
                    }
                } else {
                    if (NIL != cycl_grammar.fast_quote_term_p(sentence)) {
                        if (NIL == list_utilities.tree_find_if($sym17$CYC_VAR_, sentence, UNPROVIDED)) {
                            return sentence;
                        }
                        {
                            SubLObject standardized = NIL;
                            {
                                SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                                try {
                                    czer_vars.$inside_quote$.bind(T, thread);
                                    standardized = make_unary_formula($$Quote, com.cyc.cycjava.cycl.clausifier.recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, UNPROVIDED)));
                                } finally {
                                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                                }
                            }
                            return standardized;
                        }
                    } else {
                        if (NIL != possibly_el_regularly_quantified_sentence_p(sentence)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject quantifier = unmake_binary_formula(sentence);
                                SubLObject old_var = thread.secondMultipleValue();
                                SubLObject subform = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject standardized_subform = funcall_formula_arg(RECURSIVELY_STANDARDIZE_VARIABLES, sentence, TWO_INTEGER);
                                    SubLObject new_var = com.cyc.cycjava.cycl.clausifier.el_uniquify_standardize(old_var);
                                    SubLObject replace_old_var = com.cyc.cycjava.cycl.clausifier.el_var_without_quote(old_var);
                                    SubLObject replace_new_var = com.cyc.cycjava.cycl.clausifier.el_var_without_quote(new_var);
                                    SubLObject standardized = NIL;
                                    com.cyc.cycjava.cycl.clausifier.remember_variable_rename(replace_old_var, replace_new_var);
                                    {
                                        SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                                        try {
                                            czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                                            standardized = make_binary_formula(quantifier, new_var, cycl_utilities.expression_nsubst_free_vars(replace_new_var, replace_old_var, standardized_subform, UNPROVIDED));
                                        } finally {
                                            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    return standardized;
                                }
                            }
                        } else {
                            if (NIL != el_bounded_existential_p(sentence)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject quantifier = unmake_ternary_formula(sentence);
                                    SubLObject bound = thread.secondMultipleValue();
                                    SubLObject old_var = thread.thirdMultipleValue();
                                    SubLObject subform = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject standardized_subform = funcall_formula_arg(RECURSIVELY_STANDARDIZE_VARIABLES, sentence, THREE_INTEGER);
                                        SubLObject new_var = com.cyc.cycjava.cycl.clausifier.el_uniquify_standardize(old_var);
                                        SubLObject replace_old_var = com.cyc.cycjava.cycl.clausifier.el_var_without_quote(old_var);
                                        SubLObject replace_new_var = com.cyc.cycjava.cycl.clausifier.el_var_without_quote(new_var);
                                        SubLObject standardized = NIL;
                                        com.cyc.cycjava.cycl.clausifier.remember_variable_rename(replace_old_var, replace_new_var);
                                        {
                                            SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                                            try {
                                                czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                                                standardized = make_ternary_formula(quantifier, bound, new_var, cycl_utilities.expression_nsubst_free_vars(replace_new_var, replace_old_var, standardized_subform, UNPROVIDED));
                                            } finally {
                                                czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        return standardized;
                                    }
                                }
                            } else {
                                if (NIL != czer_trampolines.czer_scoping_formulaP(sentence)) {
                                    {
                                        SubLObject scoped_vars = czer_trampolines.czer_scoped_vars(sentence);
                                        SubLObject unique_vars = Mapping.mapcar(EL_UNIQUIFY_STANDARDIZE, scoped_vars);
                                        SubLObject scoping_args = czer_trampolines.czer_scoping_args(cycl_utilities.formula_operator(sentence));
                                        SubLObject replace_scoped_vars = Mapping.mapcar(EL_VAR_WITHOUT_QUOTE, scoped_vars);
                                        SubLObject replace_unique_vars = Mapping.mapcar(EL_VAR_WITHOUT_QUOTE, unique_vars);
                                        SubLObject new_sentence = NIL;
                                        SubLObject terms = cycl_utilities.formula_terms(sentence, $IGNORE);
                                        SubLObject list_var = NIL;
                                        SubLObject arg = NIL;
                                        SubLObject argnum = NIL;
                                        for (list_var = terms, arg = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                                            if (NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                new_sentence = cons(arg, new_sentence);
                                            } else {
                                                new_sentence = cons(funcall_formula_arg(RECURSIVELY_STANDARDIZE_VARIABLES, sentence, argnum), new_sentence);
                                            }
                                        }
                                        com.cyc.cycjava.cycl.clausifier.remember_variables_rename(replace_scoped_vars, replace_unique_vars);
                                        return nreverse(cycl_utilities.expression_sublis(pairlis(replace_scoped_vars, replace_unique_vars, UNPROVIDED), new_sentence, UNPROVIDED, UNPROVIDED));
                                    }
                                } else {
                                    return pass_through_if_relation_syntax(RECURSIVELY_STANDARDIZE_VARIABLES, sentence);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Renames all quantified variables into a canonical order, with the innermost variables having smaller indices.\r\nVariables at the same depth are ordered from left to right.\r\nAssumes that *standardize-variables-memory* is bound.\r\nAlso assumes that implications and other weird logical operators have been removed.\nRenames all quantified variables into a canonical order, with the innermost variables having smaller indices.\nVariables at the same depth are ordered from left to right.\nAssumes that *standardize-variables-memory* is bound.\nAlso assumes that implications and other weird logical operators have been removed.")
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
    }/**
     * Renames all quantified variables into a canonical order, with the innermost variables having smaller indices.
     * Variables at the same depth are ordered from left to right.
     * Assumes that *standardize-variables-memory* is bound.
     * Also assumes that implications and other weird logical operators have been removed.
     */


    public static final SubLObject el_uniquify_standardize_alt(SubLObject var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == czer_vars.$inside_quote$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.clausifier.el_uniquify(var);
            } else {
                if ((NIL != cycl_grammar.fast_escape_quote_term_p(var)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(var))) {
                    return make_unary_formula(cycl_utilities.formula_arg0(var), com.cyc.cycjava.cycl.clausifier.el_uniquify(cycl_utilities.formula_arg1(var, UNPROVIDED)));
                } else {
                    return var;
                }
            }
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

    public static final SubLObject el_var_without_quote_alt(SubLObject var) {
        if ((NIL != cycl_grammar.fast_escape_quote_term_p(var)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(var))) {
            return cycl_utilities.formula_arg1(var, UNPROVIDED);
        } else {
            return var;
        }
    }

    public static SubLObject el_var_without_quote(final SubLObject var) {
        if ((NIL != cycl_grammar.fast_escape_quote_term_p(var)) || (NIL != cycl_grammar.fast_quasi_quote_term_p(var))) {
            return cycl_utilities.formula_arg1(var, UNPROVIDED);
        }
        return var;
    }

    /**
     * Remembers which variables are being renamed, and what their new names are.
     * Assumes that *standardize-variables-memory* is bound.
     */
    @LispMethod(comment = "Remembers which variables are being renamed, and what their new names are.\r\nAssumes that *standardize-variables-memory* is bound.\nRemembers which variables are being renamed, and what their new names are.\nAssumes that *standardize-variables-memory* is bound.")
    public static final SubLObject remember_variable_rename_alt(SubLObject old_var, SubLObject new_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            czer_vars.$standardize_variables_memory$.setDynamicValue(cons(cons(old_var, new_var), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    @LispMethod(comment = "Remembers which variables are being renamed, and what their new names are.\r\nAssumes that *standardize-variables-memory* is bound.\nRemembers which variables are being renamed, and what their new names are.\nAssumes that *standardize-variables-memory* is bound.")
    public static SubLObject remember_variable_rename(final SubLObject old_var, final SubLObject new_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$standardize_variables_memory$.setDynamicValue(cons(cons(old_var, new_var), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
        return NIL;
    }/**
     * Remembers which variables are being renamed, and what their new names are.
     * Assumes that *standardize-variables-memory* is bound.
     */


    /**
     * Remembers which variables are being renamed, and what their new names are.
     * Assumes that *standardize-variables-memory* is bound.
     */
    @LispMethod(comment = "Remembers which variables are being renamed, and what their new names are.\r\nAssumes that *standardize-variables-memory* is bound.\nRemembers which variables are being renamed, and what their new names are.\nAssumes that *standardize-variables-memory* is bound.")
    public static final SubLObject remember_variables_rename_alt(SubLObject old_vars, SubLObject new_vars) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            czer_vars.$standardize_variables_memory$.setDynamicValue(append(pairlis(old_vars, new_vars, UNPROVIDED), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    @LispMethod(comment = "Remembers which variables are being renamed, and what their new names are.\r\nAssumes that *standardize-variables-memory* is bound.\nRemembers which variables are being renamed, and what their new names are.\nAssumes that *standardize-variables-memory* is bound.")
    public static SubLObject remember_variables_rename(final SubLObject old_vars, final SubLObject new_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$standardize_variables_memory$.setDynamicValue(append(pairlis(old_vars, new_vars, UNPROVIDED), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), thread);
        return NIL;
    }/**
     * Remembers which variables are being renamed, and what their new names are.
     * Assumes that *standardize-variables-memory* is bound.
     */


    /**
     * Assumes that *el-symbol-suffix-table* is bound.
     */
    @LispMethod(comment = "Assumes that *el-symbol-suffix-table* is bound.")
    public static final SubLObject el_uniquify_alt(SubLObject var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject integer = czer_main.extract_name_uniquifying_post_hyphen_integer(var);
                SubLObject symbol = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == symbol) {
                    symbol = var;
                }
                if (NIL == integer) {
                    integer = ZERO_INTEGER;
                }
                {
                    SubLObject n = gethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), UNPROVIDED);
                    if (NIL == n) {
                        n = MINUS_ONE_INTEGER;
                    }
                    n = max(n, integer);
                    n = add(n, ONE_INTEGER);
                    sethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), n);
                    {
                        SubLObject unique_string = (n.isZero()) ? ((SubLObject) (format_nil.format_nil_a(cycl_variables.variable_name(symbol)))) : cconcatenate(format_nil.format_nil_a_no_copy(cycl_variables.variable_name(symbol)), new SubLObject[]{ $str_alt23$_, format_nil.format_nil_a_no_copy(string_utilities.object_to_string(n)) });
                        if (NIL != cycl_variables.keyword_varP(symbol)) {
                            return cycl_variables.make_keyword_var(unique_string);
                        } else {
                            return cycl_variables.make_el_var(unique_string);
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Assumes that *el-symbol-suffix-table* is bound.")
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
    }/**
     * Assumes that *el-symbol-suffix-table* is bound.
     */


    /**
     * Removes all existentials by replacing them with Skolem constants or Skolem sentences.
     */
    @LispMethod(comment = "Removes all existentials by replacing them with Skolem constants or Skolem sentences.")
    public static final SubLObject existentials_out_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$turn_existentials_into_skolemsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.tree_find_if(CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, sentence, UNPROVIDED)) {
                    return sentence;
                }
                {
                    SubLObject error = NIL;
                    try {
                        try {
                            try {
                                {
                                    SubLObject _prev_bind_0 = $quantifier_info_list$.currentBinding(thread);
                                    try {
                                        $quantifier_info_list$.bind(NIL, thread);
                                        sentence = com.cyc.cycjava.cycl.clausifier.existentials_out_int(sentence);
                                    } finally {
                                        $quantifier_info_list$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                error = Errors.handleThrowable(ccatch_env_var, $QUANTIFIED_SEQUENCE_VARIABLE);
                            }
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE);
                        }
                    } catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
                    }
                    if (NIL != error) {
                        if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                            wff.note_wff_violation(error);
                        }
                        return NIL;
                    }
                }
            }
            return sentence;
        }
    }

    @LispMethod(comment = "Removes all existentials by replacing them with Skolem constants or Skolem sentences.")
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
    }/**
     * Removes all existentials by replacing them with Skolem constants or Skolem sentences.
     */


    /**
     * Removes all existentials by replacing them with Skolem constants or Skolem sentences.
     * Keeps a list of the quantifiers whose scope we are within to determine the free variables in the Skolem sentences.
     * Assumes that *quantifier-info-list* is bound.
     */
    @LispMethod(comment = "Removes all existentials by replacing them with Skolem constants or Skolem sentences.\r\nKeeps a list of the quantifiers whose scope we are within to determine the free variables in the Skolem sentences.\r\nAssumes that *quantifier-info-list* is bound.\nRemoves all existentials by replacing them with Skolem constants or Skolem sentences.\nKeeps a list of the quantifiers whose scope we are within to determine the free variables in the Skolem sentences.\nAssumes that *quantifier-info-list* is bound.")
    public static final SubLObject existentials_out_int_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = sentence;
                {
                    SubLObject _prev_bind_0 = $quantifier_info_list$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                    try {
                        $quantifier_info_list$.bind($quantifier_info_list$.getDynamicValue(thread), thread);
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                        if (NIL != cycl_universal_p(sentence)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject quantifier = unmake_binary_formula(sentence);
                                SubLObject var = thread.secondMultipleValue();
                                SubLObject subform = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                $quantifier_info_list$.setDynamicValue(cons(list(quantifier, NIL, var, sentence_free_term_variables(subform, UNPROVIDED, UNPROVIDED), sentence_free_sequence_variables(subform, UNPROVIDED, UNPROVIDED)), $quantifier_info_list$.getDynamicValue(thread)), thread);
                                result = make_universal(var, funcall_formula_arg(symbol_function(EXISTENTIALS_OUT_INT), sentence, TWO_INTEGER));
                            }
                        } else {
                            if (NIL != el_existential_p(sentence)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject quantifier = unmake_binary_formula(sentence);
                                    SubLObject var = thread.secondMultipleValue();
                                    SubLObject subform = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    $quantifier_info_list$.setDynamicValue(cons(list(quantifier, NIL, var, sentence_free_term_variables(subform, UNPROVIDED, UNPROVIDED), sentence_free_sequence_variables(subform, UNPROVIDED, UNPROVIDED)), $quantifier_info_list$.getDynamicValue(thread)), thread);
                                    result = funcall_formula_arg(symbol_function(EXISTENTIALS_OUT_INT), sentence, TWO_INTEGER);
                                }
                            } else {
                                if (NIL != el_bounded_existential_p(sentence)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject quantifier = unmake_ternary_formula(sentence);
                                        SubLObject num = thread.secondMultipleValue();
                                        SubLObject var = thread.thirdMultipleValue();
                                        SubLObject subform = thread.fourthMultipleValue();
                                        thread.resetMultipleValues();
                                        $quantifier_info_list$.setDynamicValue(cons(list(quantifier, num, var, sentence_free_term_variables(subform, UNPROVIDED, UNPROVIDED), sentence_free_sequence_variables(subform, UNPROVIDED, UNPROVIDED)), $quantifier_info_list$.getDynamicValue(thread)), thread);
                                        result = funcall_formula_arg(symbol_function(EXISTENTIALS_OUT_INT), sentence, THREE_INTEGER);
                                    }
                                } else {
                                    if (NIL != el_logical_operator_formula_p(sentence)) {
                                        result = pass_through_if_logical_op(symbol_function(EXISTENTIALS_OUT_INT), sentence);
                                    } else {
                                        if ((NIL != within_askP()) && (NIL != ist_sentence_p(sentence))) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject ist = unmake_binary_formula(sentence);
                                                SubLObject mt = thread.secondMultipleValue();
                                                SubLObject subsentence = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject canonical_subsentence = com.cyc.cycjava.cycl.clausifier.existentials_out_int(subsentence);
                                                    result = com.cyc.cycjava.cycl.clausifier.skolemize_atomic_sentence(make_ist_sentence(mt, canonical_subsentence), $quantifier_info_list$.getDynamicValue(thread));
                                                }
                                            }
                                        } else {
                                            if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
                                                result = com.cyc.cycjava.cycl.clausifier.skolemize_atomic_sentence(sentence, $quantifier_info_list$.getDynamicValue(thread));
                                            } else {
                                                if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                                                    result = com.cyc.cycjava.cycl.clausifier.skolemize_atomic_sentence(sentence, $quantifier_info_list$.getDynamicValue(thread));
                                                } else {
                                                    el_error(FOUR_INTEGER, $str_alt29$Unexpected_sentence_type_in_exist, sentence, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_1, thread);
                        $quantifier_info_list$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Removes all existentials by replacing them with Skolem constants or Skolem sentences.\r\nKeeps a list of the quantifiers whose scope we are within to determine the free variables in the Skolem sentences.\r\nAssumes that *quantifier-info-list* is bound.\nRemoves all existentials by replacing them with Skolem constants or Skolem sentences.\nKeeps a list of the quantifiers whose scope we are within to determine the free variables in the Skolem sentences.\nAssumes that *quantifier-info-list* is bound.")
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
    }/**
     * Removes all existentials by replacing them with Skolem constants or Skolem sentences.
     * Keeps a list of the quantifiers whose scope we are within to determine the free variables in the Skolem sentences.
     * Assumes that *quantifier-info-list* is bound.
     */


    /**
     * Replaces existentially quantified variables with unreified Skolem functions.
     * ;;{{{
     * These aren't real Skolem functions, but indicators that tell the canonicalizer how to make the Skolem functions later.
     * e.g. If the original sentence were:
     * (#$forAll ?X (#$thereExists ?Y (#$forAll ?Z (#$thereExists ?W (<predicate> ?W ?X ?Y ?Z)))))
     * and we were skolemizing the atomic sentence (<predicate> ?W ?X ?Y ?Z),
     * then QUANTIFIER-INFO-LIST would contain:
     * ((#$thereExists NIL ?W NIL NIL) (#$forAll NIL ?Z NIL NIL) (#$thereExists NIL ?Y NIL NIL) (#$forAll NIL ?X NIL NIL)).
     * So, for each existential variable, we find the variables it depends on by looking down the list QUANTIFIER-INFO-LIST,
     * taking note of each universal variable that follows the existential variable we are skolemizing.
     * ;;}}}
     */
    @LispMethod(comment = "Replaces existentially quantified variables with unreified Skolem functions.\r\n;;{{{\r\nThese aren\'t real Skolem functions, but indicators that tell the canonicalizer how to make the Skolem functions later.\r\ne.g. If the original sentence were:\r\n(#$forAll ?X (#$thereExists ?Y (#$forAll ?Z (#$thereExists ?W (<predicate> ?W ?X ?Y ?Z)))))\r\nand we were skolemizing the atomic sentence (<predicate> ?W ?X ?Y ?Z),\r\nthen QUANTIFIER-INFO-LIST would contain:\r\n((#$thereExists NIL ?W NIL NIL) (#$forAll NIL ?Z NIL NIL) (#$thereExists NIL ?Y NIL NIL) (#$forAll NIL ?X NIL NIL)).\r\nSo, for each existential variable, we find the variables it depends on by looking down the list QUANTIFIER-INFO-LIST,\r\ntaking note of each universal variable that follows the existential variable we are skolemizing.\r\n;;}}}\nReplaces existentially quantified variables with unreified Skolem functions.\n;;{{{\nThese aren\'t real Skolem functions, but indicators that tell the canonicalizer how to make the Skolem functions later.\ne.g. If the original sentence were:\n(#$forAll ?X (#$thereExists ?Y (#$forAll ?Z (#$thereExists ?W (<predicate> ?W ?X ?Y ?Z)))))\nand we were skolemizing the atomic sentence (<predicate> ?W ?X ?Y ?Z),\nthen QUANTIFIER-INFO-LIST would contain:\n((#$thereExists NIL ?W NIL NIL) (#$forAll NIL ?Z NIL NIL) (#$thereExists NIL ?Y NIL NIL) (#$forAll NIL ?X NIL NIL)).\nSo, for each existential variable, we find the variables it depends on by looking down the list QUANTIFIER-INFO-LIST,\ntaking note of each universal variable that follows the existential variable we are skolemizing.\n;;}}}")
    public static final SubLObject skolemize_atomic_sentence_alt(SubLObject sentence, SubLObject quantifier_info_list) {
        {
            SubLObject result = sentence;
            SubLObject quantifier_info_list_in_scope = NIL;
            SubLObject curr_quant_info = NIL;
            SubLObject curr_quant = NIL;
            SubLObject curr_num = NIL;
            SubLObject curr_var = NIL;
            SubLObject curr_free_term_vars = NIL;
            SubLObject curr_free_sequence_vars = NIL;
            for (quantifier_info_list_in_scope = quantifier_info_list, curr_quant_info = quantifier_info_list_in_scope.first(), curr_quant = curr_quant_info.first(), curr_num = second(curr_quant_info), curr_var = third(curr_quant_info), curr_free_term_vars = fourth(curr_quant_info), curr_free_sequence_vars = fifth(curr_quant_info); NIL != quantifier_info_list_in_scope; quantifier_info_list_in_scope = quantifier_info_list_in_scope.rest() , curr_quant_info = quantifier_info_list_in_scope.first() , curr_quant = curr_quant_info.first() , curr_num = second(curr_quant_info) , curr_var = third(curr_quant_info) , curr_free_term_vars = fourth(curr_quant_info) , curr_free_sequence_vars = fifth(curr_quant_info)) {
                if (NIL != cyc_const_general_existential_operator_p(curr_quant)) {
                    result = com.cyc.cycjava.cycl.clausifier.skolemize_variable(result, curr_quant, curr_num, curr_var, curr_free_term_vars, curr_free_sequence_vars, quantifier_info_list_in_scope);
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Replaces existentially quantified variables with unreified Skolem functions.\r\n;;{{{\r\nThese aren\'t real Skolem functions, but indicators that tell the canonicalizer how to make the Skolem functions later.\r\ne.g. If the original sentence were:\r\n(#$forAll ?X (#$thereExists ?Y (#$forAll ?Z (#$thereExists ?W (<predicate> ?W ?X ?Y ?Z)))))\r\nand we were skolemizing the atomic sentence (<predicate> ?W ?X ?Y ?Z),\r\nthen QUANTIFIER-INFO-LIST would contain:\r\n((#$thereExists NIL ?W NIL NIL) (#$forAll NIL ?Z NIL NIL) (#$thereExists NIL ?Y NIL NIL) (#$forAll NIL ?X NIL NIL)).\r\nSo, for each existential variable, we find the variables it depends on by looking down the list QUANTIFIER-INFO-LIST,\r\ntaking note of each universal variable that follows the existential variable we are skolemizing.\r\n;;}}}\nReplaces existentially quantified variables with unreified Skolem functions.\n;;{{{\nThese aren\'t real Skolem functions, but indicators that tell the canonicalizer how to make the Skolem functions later.\ne.g. If the original sentence were:\n(#$forAll ?X (#$thereExists ?Y (#$forAll ?Z (#$thereExists ?W (<predicate> ?W ?X ?Y ?Z)))))\nand we were skolemizing the atomic sentence (<predicate> ?W ?X ?Y ?Z),\nthen QUANTIFIER-INFO-LIST would contain:\n((#$thereExists NIL ?W NIL NIL) (#$forAll NIL ?Z NIL NIL) (#$thereExists NIL ?Y NIL NIL) (#$forAll NIL ?X NIL NIL)).\nSo, for each existential variable, we find the variables it depends on by looking down the list QUANTIFIER-INFO-LIST,\ntaking note of each universal variable that follows the existential variable we are skolemizing.\n;;}}}")
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
    }/**
     * Replaces existentially quantified variables with unreified Skolem functions.
     * ;;{{{
     * These aren't real Skolem functions, but indicators that tell the canonicalizer how to make the Skolem functions later.
     * e.g. If the original sentence were:
     * (#$forAll ?X (#$thereExists ?Y (#$forAll ?Z (#$thereExists ?W (<predicate> ?W ?X ?Y ?Z)))))
     * and we were skolemizing the atomic sentence (<predicate> ?W ?X ?Y ?Z),
     * then QUANTIFIER-INFO-LIST would contain:
     * ((#$thereExists NIL ?W NIL NIL) (#$forAll NIL ?Z NIL NIL) (#$thereExists NIL ?Y NIL NIL) (#$forAll NIL ?X NIL NIL)).
     * So, for each existential variable, we find the variables it depends on by looking down the list QUANTIFIER-INFO-LIST,
     * taking note of each universal variable that follows the existential variable we are skolemizing.
     * ;;}}}
     */


    /**
     * Within SENTENCE, replaces all occurrences of CURR-VAR with a Skolem function.
     * ;{{{
     * The universals that appear in both QUANTIFIER-INFO-LIST-IN-SCOPE and either of CURR-FREE-TERM-VARS or CURR-FREE-SEQUENCE-VARS
     * will be the Skolem function's parameters.
     * These are not real, reified Skolem functions, but they indicate to the canonicalizer how to reify the Skolem functions later.
     * Here are some examples of which variables the Skolem function will have as parameters.
     * Take for example the statement that everyone has a cat as a mother:
     * (#$forAll ?Y (#$thereExists ?X (#$and (#$mother ?Y ?X) (#$isa ?X #$Cat)))).
     * In the above example, both ?X's would be replaced by Skolem functions with parameter ?Y.
     * However, in the following example, ?X will be replaced by a Skolem constant instead, since its value does not depend on ?Y.
     * (#$forAll ?Y (#$thereExists ?X (#$isa ?X #$Cat))).
     * This function knows the difference by the variables in the lists CURR-FREE-TERM-VARS and CURR-FREE-SEQUENCE-VARS.
     * If we are skolemizing variable ?S in a sentence of the form ... (#$thereExists ?X <subform>),
     * CURR-FREE-TERM-VARS contains all the free term variables in <subform>, even if the atomic sentence we are processing is a subsubsubform.
     * CURR-FREE-SEQUENCE-VARS is the same thing for sequence variables.
     * ;}}}
     */
    @LispMethod(comment = "Within SENTENCE, replaces all occurrences of CURR-VAR with a Skolem function.\r\n;{{{\r\nThe universals that appear in both QUANTIFIER-INFO-LIST-IN-SCOPE and either of CURR-FREE-TERM-VARS or CURR-FREE-SEQUENCE-VARS\r\nwill be the Skolem function\'s parameters.\r\nThese are not real, reified Skolem functions, but they indicate to the canonicalizer how to reify the Skolem functions later.\r\nHere are some examples of which variables the Skolem function will have as parameters.\r\nTake for example the statement that everyone has a cat as a mother:\r\n(#$forAll ?Y (#$thereExists ?X (#$and (#$mother ?Y ?X) (#$isa ?X #$Cat)))).\r\nIn the above example, both ?X\'s would be replaced by Skolem functions with parameter ?Y.\r\nHowever, in the following example, ?X will be replaced by a Skolem constant instead, since its value does not depend on ?Y.\r\n(#$forAll ?Y (#$thereExists ?X (#$isa ?X #$Cat))).\r\nThis function knows the difference by the variables in the lists CURR-FREE-TERM-VARS and CURR-FREE-SEQUENCE-VARS.\r\nIf we are skolemizing variable ?S in a sentence of the form ... (#$thereExists ?X <subform>),\r\nCURR-FREE-TERM-VARS contains all the free term variables in <subform>, even if the atomic sentence we are processing is a subsubsubform.\r\nCURR-FREE-SEQUENCE-VARS is the same thing for sequence variables.\r\n;}}}\nWithin SENTENCE, replaces all occurrences of CURR-VAR with a Skolem function.\n;{{{\nThe universals that appear in both QUANTIFIER-INFO-LIST-IN-SCOPE and either of CURR-FREE-TERM-VARS or CURR-FREE-SEQUENCE-VARS\nwill be the Skolem function\'s parameters.\nThese are not real, reified Skolem functions, but they indicate to the canonicalizer how to reify the Skolem functions later.\nHere are some examples of which variables the Skolem function will have as parameters.\nTake for example the statement that everyone has a cat as a mother:\n(#$forAll ?Y (#$thereExists ?X (#$and (#$mother ?Y ?X) (#$isa ?X #$Cat)))).\nIn the above example, both ?X\'s would be replaced by Skolem functions with parameter ?Y.\nHowever, in the following example, ?X will be replaced by a Skolem constant instead, since its value does not depend on ?Y.\n(#$forAll ?Y (#$thereExists ?X (#$isa ?X #$Cat))).\nThis function knows the difference by the variables in the lists CURR-FREE-TERM-VARS and CURR-FREE-SEQUENCE-VARS.\nIf we are skolemizing variable ?S in a sentence of the form ... (#$thereExists ?X <subform>),\nCURR-FREE-TERM-VARS contains all the free term variables in <subform>, even if the atomic sentence we are processing is a subsubsubform.\nCURR-FREE-SEQUENCE-VARS is the same thing for sequence variables.\n;}}}")
    public static final SubLObject skolemize_variable_alt(SubLObject sentence, SubLObject curr_quant, SubLObject curr_num, SubLObject curr_var, SubLObject curr_free_term_vars, SubLObject curr_free_sequence_vars, SubLObject quantifier_info_list_in_scope) {
        if (NIL != com.cyc.cycjava.cycl.clausifier.drop_all_existentialsP()) {
            return sentence;
        } else {
            if ((NIL != occurs_as_sequence_variableP(curr_var, sentence)) && (NIL != com.cyc.cycjava.cycl.clausifier.forbid_quantified_sequence_variablesP())) {
                sublisp_throw($QUANTIFIED_SEQUENCE_VARIABLE, list($QUANTIFIED_SEQUENCE_VARIABLE, curr_var, sentence));
            } else {
                {
                    SubLObject curr_dependent_term_vars = NIL;
                    SubLObject curr_dependent_sequence_vars = NIL;
                    SubLObject cdolist_list_var = quantifier_info_list_in_scope;
                    SubLObject quant_info = NIL;
                    for (quant_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , quant_info = cdolist_list_var.first()) {
                        {
                            SubLObject quant = quant_info.first();
                            SubLObject var = third(quant_info);
                            SubLObject free_term_vars = fourth(quant_info);
                            SubLObject free_sequence_vars = fifth(quant_info);
                            if ($$forAll == quant) {
                                {
                                    SubLObject var_status = com.cyc.cycjava.cycl.clausifier.determine_skolem_var_status(var, curr_free_term_vars, free_term_vars, curr_free_sequence_vars, free_sequence_vars);
                                    SubLObject pcase_var = var_status;
                                    if (pcase_var.eql($NEITHER)) {
                                    } else {
                                        if (pcase_var.eql($TERM)) {
                                            curr_dependent_term_vars = cons(var, curr_dependent_term_vars);
                                        } else {
                                            if (pcase_var.eql($SEQ)) {
                                                curr_dependent_sequence_vars = cons(var, curr_dependent_sequence_vars);
                                            } else {
                                                if (pcase_var.eql($BOTH)) {
                                                    sublisp_throw($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, list($AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, var, curr_var, sentence));
                                                } else {
                                                    if (pcase_var.eql($UNDETERMINED)) {
                                                        el_error(ONE_INTEGER, $str_alt36$Skolemizer_failed_to_classify_var, var, sentence, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (length(curr_dependent_sequence_vars).numG(ONE_INTEGER)) {
                        sublisp_throw($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, list($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, curr_var, curr_dependent_sequence_vars));
                    } else {
                        if (((NIL != com.cyc.cycjava.cycl.clausifier.leave_skolem_constants_aloneP()) && (NIL == curr_dependent_term_vars)) && (NIL == curr_dependent_sequence_vars)) {
                            return sentence;
                        } else {
                            return cycl_utilities.expression_nsubst_free_vars(com.cyc.cycjava.cycl.clausifier.make_skolem_fn_fn(curr_var, curr_dependent_term_vars, curr_quant, curr_num, curr_dependent_sequence_vars.first()), curr_var, copy_expression(sentence), symbol_function(EQUAL));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Within SENTENCE, replaces all occurrences of CURR-VAR with a Skolem function.\r\n;{{{\r\nThe universals that appear in both QUANTIFIER-INFO-LIST-IN-SCOPE and either of CURR-FREE-TERM-VARS or CURR-FREE-SEQUENCE-VARS\r\nwill be the Skolem function\'s parameters.\r\nThese are not real, reified Skolem functions, but they indicate to the canonicalizer how to reify the Skolem functions later.\r\nHere are some examples of which variables the Skolem function will have as parameters.\r\nTake for example the statement that everyone has a cat as a mother:\r\n(#$forAll ?Y (#$thereExists ?X (#$and (#$mother ?Y ?X) (#$isa ?X #$Cat)))).\r\nIn the above example, both ?X\'s would be replaced by Skolem functions with parameter ?Y.\r\nHowever, in the following example, ?X will be replaced by a Skolem constant instead, since its value does not depend on ?Y.\r\n(#$forAll ?Y (#$thereExists ?X (#$isa ?X #$Cat))).\r\nThis function knows the difference by the variables in the lists CURR-FREE-TERM-VARS and CURR-FREE-SEQUENCE-VARS.\r\nIf we are skolemizing variable ?S in a sentence of the form ... (#$thereExists ?X <subform>),\r\nCURR-FREE-TERM-VARS contains all the free term variables in <subform>, even if the atomic sentence we are processing is a subsubsubform.\r\nCURR-FREE-SEQUENCE-VARS is the same thing for sequence variables.\r\n;}}}\nWithin SENTENCE, replaces all occurrences of CURR-VAR with a Skolem function.\n;{{{\nThe universals that appear in both QUANTIFIER-INFO-LIST-IN-SCOPE and either of CURR-FREE-TERM-VARS or CURR-FREE-SEQUENCE-VARS\nwill be the Skolem function\'s parameters.\nThese are not real, reified Skolem functions, but they indicate to the canonicalizer how to reify the Skolem functions later.\nHere are some examples of which variables the Skolem function will have as parameters.\nTake for example the statement that everyone has a cat as a mother:\n(#$forAll ?Y (#$thereExists ?X (#$and (#$mother ?Y ?X) (#$isa ?X #$Cat)))).\nIn the above example, both ?X\'s would be replaced by Skolem functions with parameter ?Y.\nHowever, in the following example, ?X will be replaced by a Skolem constant instead, since its value does not depend on ?Y.\n(#$forAll ?Y (#$thereExists ?X (#$isa ?X #$Cat))).\nThis function knows the difference by the variables in the lists CURR-FREE-TERM-VARS and CURR-FREE-SEQUENCE-VARS.\nIf we are skolemizing variable ?S in a sentence of the form ... (#$thereExists ?X <subform>),\nCURR-FREE-TERM-VARS contains all the free term variables in <subform>, even if the atomic sentence we are processing is a subsubsubform.\nCURR-FREE-SEQUENCE-VARS is the same thing for sequence variables.\n;}}}")
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
    }/**
     * Within SENTENCE, replaces all occurrences of CURR-VAR with a Skolem function.
     * ;{{{
     * The universals that appear in both QUANTIFIER-INFO-LIST-IN-SCOPE and either of CURR-FREE-TERM-VARS or CURR-FREE-SEQUENCE-VARS
     * will be the Skolem function's parameters.
     * These are not real, reified Skolem functions, but they indicate to the canonicalizer how to reify the Skolem functions later.
     * Here are some examples of which variables the Skolem function will have as parameters.
     * Take for example the statement that everyone has a cat as a mother:
     * (#$forAll ?Y (#$thereExists ?X (#$and (#$mother ?Y ?X) (#$isa ?X #$Cat)))).
     * In the above example, both ?X's would be replaced by Skolem functions with parameter ?Y.
     * However, in the following example, ?X will be replaced by a Skolem constant instead, since its value does not depend on ?Y.
     * (#$forAll ?Y (#$thereExists ?X (#$isa ?X #$Cat))).
     * This function knows the difference by the variables in the lists CURR-FREE-TERM-VARS and CURR-FREE-SEQUENCE-VARS.
     * If we are skolemizing variable ?S in a sentence of the form ... (#$thereExists ?X <subform>),
     * CURR-FREE-TERM-VARS contains all the free term variables in <subform>, even if the atomic sentence we are processing is a subsubsubform.
     * CURR-FREE-SEQUENCE-VARS is the same thing for sequence variables.
     * ;}}}
     */


    /**
     *
     *
     * @param VAR;
     * 		the universally scoped variable whose status we need to determine wrt an existential.
     * 		Example: In a sentence of the form (forAll ?X (forAll ?Y (implies (isa ?Y Ort) (thereExists ?Z (mother ?X ?Z)))))
     * 		The subsentence in consideration would be (mother ?X ?Z), its free term vars
     * 		would be ?X and ?Z, and the free term vars in the scope would be ?X and ?Y.
     * 		If VAR is ?X, the result would be :term.  If VAR is ?Y, the result would be :term or :neither, depending on *minimal-skolem-arity?*
     * @return keywordp; :neither, :term, :seq, :both, or :undetermined
     */
    @LispMethod(comment = "@param VAR;\r\n\t\tthe universally scoped variable whose status we need to determine wrt an existential.\r\n\t\tExample: In a sentence of the form (forAll ?X (forAll ?Y (implies (isa ?Y Ort) (thereExists ?Z (mother ?X ?Z)))))\r\n\t\tThe subsentence in consideration would be (mother ?X ?Z), its free term vars\r\n\t\twould be ?X and ?Z, and the free term vars in the scope would be ?X and ?Y.\r\n\t\tIf VAR is ?X, the result would be :term.  If VAR is ?Y, the result would be :term or :neither, depending on *minimal-skolem-arity?*\r\n@return keywordp; :neither, :term, :seq, :both, or :undetermined")
    public static final SubLObject determine_skolem_var_status_alt(SubLObject var, SubLObject subsent_free_term_vars, SubLObject free_term_vars_in_scope, SubLObject subsent_free_seqvars, SubLObject free_seqvars_in_scope) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var_status = $UNDETERMINED;
                if (NIL != member(var, subsent_free_term_vars, UNPROVIDED, UNPROVIDED)) {
                    if ((NIL != subl_promotions.memberP(var, subsent_free_seqvars, UNPROVIDED, UNPROVIDED)) || (NIL != member(var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED))) {
                        var_status = $BOTH;
                    } else {
                        var_status = $TERM;
                    }
                } else {
                    if (NIL != member(var, subsent_free_seqvars, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != subl_promotions.memberP(var, free_term_vars_in_scope, UNPROVIDED, UNPROVIDED)) {
                            var_status = $BOTH;
                        } else {
                            var_status = $SEQ;
                        }
                    } else {
                        if (NIL != czer_vars.$minimal_skolem_arityP$.getDynamicValue(thread)) {
                            var_status = $NEITHER;
                        } else {
                            if (NIL != member(var, free_term_vars_in_scope, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != subl_promotions.memberP(var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED)) {
                                    var_status = $BOTH;
                                } else {
                                    var_status = $TERM;
                                }
                            } else {
                                if (NIL != member(var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED)) {
                                    var_status = $SEQ;
                                } else {
                                    var_status = $NEITHER;
                                }
                            }
                        }
                    }
                }
                return var_status;
            }
        }
    }

    /**
     *
     *
     * @param VAR;
     * 		the universally scoped variable whose status we need to determine wrt an existential.
     * 		Example: In a sentence of the form (forAll ?X (forAll ?Y (implies (isa ?Y Ort) (thereExists ?Z (mother ?X ?Z)))))
     * 		The subsentence in consideration would be (mother ?X ?Z), its free term vars
     * 		would be ?X and ?Z, and the free term vars in the scope would be ?X and ?Y.
     * 		If VAR is ?X, the result would be :term.  If VAR is ?Y, the result would be :term or :neither, depending on *minimal-skolem-arity?*
     * @return keywordp; :neither, :term, :seq, :both, or :undetermined
     */
    @LispMethod(comment = "@param VAR;\r\n\t\tthe universally scoped variable whose status we need to determine wrt an existential.\r\n\t\tExample: In a sentence of the form (forAll ?X (forAll ?Y (implies (isa ?Y Ort) (thereExists ?Z (mother ?X ?Z)))))\r\n\t\tThe subsentence in consideration would be (mother ?X ?Z), its free term vars\r\n\t\twould be ?X and ?Z, and the free term vars in the scope would be ?X and ?Y.\r\n\t\tIf VAR is ?X, the result would be :term.  If VAR is ?Y, the result would be :term or :neither, depending on *minimal-skolem-arity?*\r\n@return keywordp; :neither, :term, :seq, :both, or :undetermined")
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

    /**
     *
     *
     * @param DEPENDENT-SEQUENCE-VAR;
     * 		nil or cycl-variable-p
     */
    @LispMethod(comment = "@param DEPENDENT-SEQUENCE-VAR;\r\n\t\tnil or cycl-variable-p")
    public static final SubLObject make_skolem_fn_fn_alt(SubLObject var, SubLObject dependent_term_vars, SubLObject quant, SubLObject num, SubLObject dependent_sequence_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL == dependent_term_vars) && (NIL == dependent_sequence_var)) && (NIL != czer_vars.$use_skolem_constantsP$.getDynamicValue(thread))) {
                Errors.warn($str_alt37$skolem_constants_not_yet_supporte);
            } else {
                {
                    SubLObject result = NIL;
                    if ($$thereExists == quant) {
                        result = make_ternary_formula($$SkolemFunctionFn, dependent_term_vars, var, dependent_sequence_var);
                    } else {
                        if ((NIL != kb_control_vars.quant_kb_loaded_p()) && (NIL != cyc_const_bounded_existential_operator_p(quant))) {
                            result = make_quaternary_formula($$SkolemFuncNFn, dependent_term_vars, var, dependent_sequence_var, el_math_utilities.quantified_interval(quant, num));
                        } else {
                            el_error(FOUR_INTEGER, $str_alt41$make_skolem_fn_fn_doesn_t_know_ho, quant, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param DEPENDENT-SEQUENCE-VAR;
     * 		nil or cycl-variable-p
     */
    @LispMethod(comment = "@param DEPENDENT-SEQUENCE-VAR;\r\n\t\tnil or cycl-variable-p")
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

    /**
     *
     *
     * @return booleanp; whether the clausifier should, when canonicalizing
    existentials, simply drop them (like it does by default during asks)?
     */
    @LispMethod(comment = "@return booleanp; whether the clausifier should, when canonicalizing\r\nexistentials, simply drop them (like it does by default during asks)?")
    public static final SubLObject drop_all_existentialsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != $within_ask$.getDynamicValue(thread)) && (NIL == czer_vars.$skolemize_during_asksP$.getDynamicValue(thread))) || (NIL != czer_vars.$drop_all_existentialsP$.getDynamicValue(thread)));
        }
    }

    /**
     *
     *
     * @return booleanp; whether the clausifier should, when canonicalizing
    existentials, simply drop them (like it does by default during asks)?
     */
    @LispMethod(comment = "@return booleanp; whether the clausifier should, when canonicalizing\r\nexistentials, simply drop them (like it does by default during asks)?")
    public static SubLObject drop_all_existentialsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $within_ask$.getDynamicValue(thread)) && (NIL == czer_vars.$skolemize_during_asksP$.getDynamicValue(thread))) || (NIL != czer_vars.$drop_all_existentialsP$.getDynamicValue(thread)));
    }

    public static final SubLObject leave_skolem_constants_aloneP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != com.cyc.cycjava.cycl.clausifier.drop_all_existentialsP()) || (NIL != czer_vars.$leave_skolem_constants_aloneP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject leave_skolem_constants_aloneP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != drop_all_existentialsP()) || (NIL != czer_vars.$leave_skolem_constants_aloneP$.getDynamicValue(thread)));
    }

    public static final SubLObject forbid_quantified_sequence_variablesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (T == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
                return T;
            } else {
                if (NIL == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
                    return NIL;
                } else {
                    if ($ASSERT_ONLY == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread)) {
                        return within_assertP();
                    } else {
                        return Errors.error($str_alt43$Unexpected_value_for__forbid_quan, czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue(thread));
                    }
                }
            }
        }
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

    /**
     * removes all #$forAll statements from SENTENCE, unless they are inside an atomic sentence.
     * Assumes that the only logical operators in SENTENCE are #$forAll, #$and, #$or, and #$not,
     * and that #$not only appears around an atomic sentence.
     * Also assumes that the outermost #$ist's have been removed.
     */
    @LispMethod(comment = "removes all #$forAll statements from SENTENCE, unless they are inside an atomic sentence.\r\nAssumes that the only logical operators in SENTENCE are #$forAll, #$and, #$or, and #$not,\r\nand that #$not only appears around an atomic sentence.\r\nAlso assumes that the outermost #$ist\'s have been removed.\nremoves all #$forAll statements from SENTENCE, unless they are inside an atomic sentence.\nAssumes that the only logical operators in SENTENCE are #$forAll, #$and, #$or, and #$not,\nand that #$not only appears around an atomic sentence.\nAlso assumes that the outermost #$ist\'s have been removed.")
    public static final SubLObject universals_out_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycl_universal_p(sentence)) {
                {
                    SubLObject result = funcall_formula_arg(UNIVERSALS_OUT, sentence, quantified_sub_sentence_argnum(sentence));
                    if (NIL != czer_vars.$implicitify_universalsP$.getDynamicValue(thread)) {
                        return result;
                    } else {
                        if (!$newly_introduced_universals$.getDynamicValue(thread).isList()) {
                            return result;
                        } else {
                            if (NIL != member(quantified_var(sentence), $newly_introduced_universals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                return result;
                            } else {
                                return make_universal(quantified_var(sentence), result);
                            }
                        }
                    }
                }
            } else {
                if ((NIL != el_conjunction_p(sentence)) || (NIL != el_disjunction_p(sentence))) {
                    return pass_through_if_junction(UNIVERSALS_OUT, sentence);
                } else {
                    if ((NIL != possibly_el_quantified_sentence_p(sentence)) || (NIL != el_logical_operator_formula_p(sentence))) {
                        return sentence;
                    } else {
                        if (NIL != cycl_grammar.cycl_literal_p(sentence)) {
                            return sentence;
                        } else {
                            if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                                return sentence;
                            } else {
                                el_error(FOUR_INTEGER, $str_alt45$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED);
                                return sentence;
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "removes all #$forAll statements from SENTENCE, unless they are inside an atomic sentence.\r\nAssumes that the only logical operators in SENTENCE are #$forAll, #$and, #$or, and #$not,\r\nand that #$not only appears around an atomic sentence.\r\nAlso assumes that the outermost #$ist\'s have been removed.\nremoves all #$forAll statements from SENTENCE, unless they are inside an atomic sentence.\nAssumes that the only logical operators in SENTENCE are #$forAll, #$and, #$or, and #$not,\nand that #$not only appears around an atomic sentence.\nAlso assumes that the outermost #$ist\'s have been removed.")
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
    }/**
     * removes all #$forAll statements from SENTENCE, unless they are inside an atomic sentence.
     * Assumes that the only logical operators in SENTENCE are #$forAll, #$and, #$or, and #$not,
     * and that #$not only appears around an atomic sentence.
     * Also assumes that the outermost #$ist's have been removed.
     */


    public static final SubLObject disjunctions_in_alt(SubLObject sentence) {
        if (NIL != com.cyc.cycjava.cycl.clausifier.bad_exponential_disjunctionP(sentence)) {
            return com.cyc.cycjava.cycl.clausifier.handle_bad_exponential_disjunction(sentence);
        } else {
            return com.cyc.cycjava.cycl.clausifier.disjunctions_in_int(sentence);
        }
    }

    public static SubLObject disjunctions_in(final SubLObject sentence) {
        if (NIL != bad_exponential_disjunctionP(sentence)) {
            return handle_bad_exponential_disjunction(sentence);
        }
        return disjunctions_in_int(sentence);
    }

    /**
     * Moves disjunctions inwards inside SENTENCE by repeatedly applying the following transformation:
     * (#$or <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form1> <form2>) (#$or <form1> <form3>)).
     * (#$or <form0> <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form0> <form1> <form2>) (#$or <form0> <form1> <form3>)).
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
     * and that #$not only encloses atomic sentences.
     * The order is scrambled when the disjunctions are pushed inwards.
     *
     * @unknown this is exponential in the worst case -- example:
    (or
    (and A1 A2 A3)
    (and B1 B2 B3)
    ...
    (and Z1 Z2 Z3))
    will take O(3^26).  In general for clauses of this form it is
    O(K^N) where K is the average number of conjuncts and N is the number of disjuncts.
     */
    @LispMethod(comment = "Moves disjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\r\n(#$or <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form1> <form2>) (#$or <form1> <form3>)).\r\n(#$or <form0> <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form0> <form1> <form2>) (#$or <form0> <form1> <form3>)).\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\r\nand that #$not only encloses atomic sentences.\r\nThe order is scrambled when the disjunctions are pushed inwards.\r\n\r\n@unknown this is exponential in the worst case -- example:\r\n(or\r\n(and A1 A2 A3)\r\n(and B1 B2 B3)\r\n...\r\n(and Z1 Z2 Z3))\r\nwill take O(3^26).  In general for clauses of this form it is\r\nO(K^N) where K is the average number of conjuncts and N is the number of disjuncts.\nMoves disjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\n(#$or <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form1> <form2>) (#$or <form1> <form3>)).\n(#$or <form0> <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form0> <form1> <form2>) (#$or <form0> <form1> <form3>)).\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\nand that #$not only encloses atomic sentences.\nThe order is scrambled when the disjunctions are pushed inwards.")
    public static final SubLObject disjunctions_in_int_alt(SubLObject sentence) {
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
                        if (NIL != el_conjunction_p(sentence)) {
                            result = nmap_formula_args(DISJUNCTIONS_IN, sentence, UNPROVIDED);
                        } else {
                            if (NIL != el_disjunction_p(sentence)) {
                                if (NIL != cycl_utilities.opaque_argP(sentence, ONE_INTEGER)) {
                                    result = sentence;
                                } else {
                                    sentence = nmap_formula_args(DISJUNCTIONS_IN, sentence, UNPROVIDED);
                                    {
                                        SubLObject nested_conjunction = com.cyc.cycjava.cycl.clausifier.first_conjunction(cycl_utilities.formula_args(sentence, UNPROVIDED));
                                        if (NIL != nested_conjunction) {
                                            {
                                                SubLObject other_disjuncts = delete(nested_conjunction, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                if (NIL != other_disjuncts) {
                                                    {
                                                        SubLObject new_conjuncts = NIL;
                                                        SubLObject args = cycl_utilities.formula_args(nested_conjunction, $IGNORE);
                                                        SubLObject cdolist_list_var = args;
                                                        SubLObject conjunct = NIL;
                                                        for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject new_disjuncts = cons(conjunct, other_disjuncts);
                                                                new_conjuncts = cons(simplifier.disjoin(new_disjuncts, UNPROVIDED), new_conjuncts);
                                                            }
                                                        }
                                                        result = simplifier.nconjoin(list_utilities.nmapcar(DISJUNCTIONS_IN, new_conjuncts), UNPROVIDED);
                                                    }
                                                } else {
                                                    result = nested_conjunction;
                                                }
                                            }
                                        } else {
                                            result = sentence;
                                        }
                                    }
                                }
                            } else {
                                if ((NIL != possibly_el_quantified_sentence_p(sentence)) || (NIL != el_logical_operator_formula_p(sentence))) {
                                    result = sentence;
                                } else {
                                    if (NIL != el_grammar.el_literal_p(sentence)) {
                                        result = sentence;
                                    } else {
                                        if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                                            result = sentence;
                                        } else {
                                            el_error(FOUR_INTEGER, $str_alt47$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED);
                                            result = sentence;
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

    @LispMethod(comment = "Moves disjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\r\n(#$or <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form1> <form2>) (#$or <form1> <form3>)).\r\n(#$or <form0> <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form0> <form1> <form2>) (#$or <form0> <form1> <form3>)).\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\r\nand that #$not only encloses atomic sentences.\r\nThe order is scrambled when the disjunctions are pushed inwards.\r\n\r\n@unknown this is exponential in the worst case -- example:\r\n(or\r\n(and A1 A2 A3)\r\n(and B1 B2 B3)\r\n...\r\n(and Z1 Z2 Z3))\r\nwill take O(3^26).  In general for clauses of this form it is\r\nO(K^N) where K is the average number of conjuncts and N is the number of disjuncts.\nMoves disjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\n(#$or <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form1> <form2>) (#$or <form1> <form3>)).\n(#$or <form0> <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form0> <form1> <form2>) (#$or <form0> <form1> <form3>)).\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\nand that #$not only encloses atomic sentences.\nThe order is scrambled when the disjunctions are pushed inwards.")
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
    }/**
     * Moves disjunctions inwards inside SENTENCE by repeatedly applying the following transformation:
     * (#$or <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form1> <form2>) (#$or <form1> <form3>)).
     * (#$or <form0> <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form0> <form1> <form2>) (#$or <form0> <form1> <form3>)).
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
     * and that #$not only encloses atomic sentences.
     * The order is scrambled when the disjunctions are pushed inwards.
     *
     * @unknown this is exponential in the worst case -- example:
    (or
    (and A1 A2 A3)
    (and B1 B2 B3)
    ...
    (and Z1 Z2 Z3))
    will take O(3^26).  In general for clauses of this form it is
    O(K^N) where K is the average number of conjuncts and N is the number of disjuncts.
     */


    /**
     * Returns the first conjunction in the list SENTENCES.
     */
    @LispMethod(comment = "Returns the first conjunction in the list SENTENCES.")
    public static final SubLObject first_conjunction_alt(SubLObject sentences) {
        return find_if(symbol_function(EL_CONJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the first conjunction in the list SENTENCES.")
    public static SubLObject first_conjunction(final SubLObject sentences) {
        return find_if(symbol_function(EL_CONJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the first conjunction in the list SENTENCES.
     */


    /**
     *
     *
     * @return booleanp; whether SENTENCE is too explosive to be put
    into CNF using the straightforward algorithm.
     */
    @LispMethod(comment = "@return booleanp; whether SENTENCE is too explosive to be put\r\ninto CNF using the straightforward algorithm.")
    public static final SubLObject bad_exponential_disjunctionP_alt(SubLObject sentence) {
        if (NIL != el_disjunction_p(sentence)) {
            return com.cyc.cycjava.cycl.clausifier.bad_exponential_sentenceP(sentence, EL_CONJUNCTION_P);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether SENTENCE is too explosive to be put
    into CNF using the straightforward algorithm.
     */
    @LispMethod(comment = "@return booleanp; whether SENTENCE is too explosive to be put\r\ninto CNF using the straightforward algorithm.")
    public static SubLObject bad_exponential_disjunctionP(final SubLObject sentence) {
        if (NIL != el_disjunction_p(sentence)) {
            return bad_exponential_sentenceP(sentence, EL_CONJUNCTION_P);
        }
        return NIL;
    }

    /**
     * Should be caught by all callers of czer functions
     */
    @LispMethod(comment = "Should be caught by all callers of czer functions")
    public static final SubLObject handle_bad_exponential_disjunction_alt(SubLObject sentence) {
        return sublisp_throw($BAD_EXPONENTIAL_DISJUNCTION, sentence);
    }

    @LispMethod(comment = "Should be caught by all callers of czer functions")
    public static SubLObject handle_bad_exponential_disjunction(final SubLObject sentence) {
        return sublisp_throw($BAD_EXPONENTIAL_DISJUNCTION, sentence);
    }/**
     * Should be caught by all callers of czer functions
     */


    public static final SubLObject bad_exponential_sentenceP_alt(SubLObject sentence, SubLObject arg_test_func) {
        {
            SubLObject n = count_if(arg_test_func, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (n.numGE(FIVE_INTEGER)) {
                {
                    SubLObject problem_args = list_utilities.remove_if_not(arg_test_func, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != problem_args) {
                        {
                            SubLObject k = com.cyc.cycjava.cycl.clausifier.average_arity(problem_args);
                            if (k.numG(ONE_INTEGER)) {
                                {
                                    SubLObject kXn = expt(k, n);
                                    if (kXn.numG($czer_bad_exponential_threshold$.getGlobalValue())) {
                                        return T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject average_arity_alt(SubLObject formulas) {
        return number_utilities.average(formulas, FORMULA_ARITY);
    }

    public static SubLObject average_arity(final SubLObject formulas) {
        return number_utilities.average(formulas, FORMULA_ARITY);
    }

    /**
     * Assumes that SENTENCE is a subset of CNF (either in cnf, a disjunction, or a literal)
     * and returns a version of SENTENCE that is in strict CNF form.
     * For example, (#$genls #$Dog #$Mammal) would be forced into (#$and (#or (#$genls #$Dog #$Mammal))).
     * Also, it scrambles the order of the arguments inside the conjunctions and disjunctions.
     */
    @LispMethod(comment = "Assumes that SENTENCE is a subset of CNF (either in cnf, a disjunction, or a literal)\r\nand returns a version of SENTENCE that is in strict CNF form.\r\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$and (#or (#$genls #$Dog #$Mammal))).\r\nAlso, it scrambles the order of the arguments inside the conjunctions and disjunctions.\nAssumes that SENTENCE is a subset of CNF (either in cnf, a disjunction, or a literal)\nand returns a version of SENTENCE that is in strict CNF form.\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$and (#or (#$genls #$Dog #$Mammal))).\nAlso, it scrambles the order of the arguments inside the conjunctions and disjunctions.")
    public static final SubLObject force_into_cnf_alt(SubLObject sentence) {
        if (NIL == el_conjunction_p(sentence)) {
            sentence = make_conjunction(list(sentence));
        }
        {
            SubLObject new_args = NIL;
            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != el_disjunction_p(arg)) {
                    new_args = cons(arg, new_args);
                } else {
                    new_args = cons(make_disjunction(list(arg)), new_args);
                }
            }
            return make_conjunction(new_args);
        }
    }

    @LispMethod(comment = "Assumes that SENTENCE is a subset of CNF (either in cnf, a disjunction, or a literal)\r\nand returns a version of SENTENCE that is in strict CNF form.\r\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$and (#or (#$genls #$Dog #$Mammal))).\r\nAlso, it scrambles the order of the arguments inside the conjunctions and disjunctions.\nAssumes that SENTENCE is a subset of CNF (either in cnf, a disjunction, or a literal)\nand returns a version of SENTENCE that is in strict CNF form.\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$and (#or (#$genls #$Dog #$Mammal))).\nAlso, it scrambles the order of the arguments inside the conjunctions and disjunctions.")
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
    }/**
     * Assumes that SENTENCE is a subset of CNF (either in cnf, a disjunction, or a literal)
     * and returns a version of SENTENCE that is in strict CNF form.
     * For example, (#$genls #$Dog #$Mammal) would be forced into (#$and (#or (#$genls #$Dog #$Mammal))).
     * Also, it scrambles the order of the arguments inside the conjunctions and disjunctions.
     */


    /**
     *
     *
     * @param sentence
     * 		EL sentence; a conjunction of possibly disjoined literals.
     * @return clauses; a list of cnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)
    Removes #$and, #$or and #$not while translating a sentence of the form
    (#$and (#$or <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)
    (#$or (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)
    ...)
    into
    ( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))
    ((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))
    ...
    )
     */
    @LispMethod(comment = "@param sentence\r\n\t\tEL sentence; a conjunction of possibly disjoined literals.\r\n@return clauses; a list of cnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)\r\nRemoves #$and, #$or and #$not while translating a sentence of the form\r\n(#$and (#$or <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)\r\n(#$or (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)\r\n...)\r\ninto\r\n( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))\r\n((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))\r\n...\r\n)")
    public static final SubLObject cnf_operators_out_alt(SubLObject sentence) {
        if (((NIL == sentence) || (sentence == $$True)) || (sentence == $$False)) {
            return sentence;
        }
        if (NIL != cycl_variables.el_varP(sentence)) {
            sentence = czer_utilities.encapsulate_formula(sentence, UNPROVIDED);
        }
        sentence = com.cyc.cycjava.cycl.clausifier.force_into_cnf(sentence);
        if (NIL == el_conjunction_p(sentence)) {
            el_error(FOUR_INTEGER, $str_alt52$_s_is_not_a_conjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        {
            SubLObject clause_list = NIL;
            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject conjunct = NIL;
            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                if (NIL == el_disjunction_p(conjunct)) {
                    el_error(FOUR_INTEGER, $str_alt53$_s_is_not_a_disjunction__so__S_is, conjunct, sentence, UNPROVIDED);
                    return NIL;
                }
                clause_list = cons(com.cyc.cycjava.cycl.clausifier.package_xnf_clause(cycl_utilities.formula_args(conjunct, UNPROVIDED)), clause_list);
            }
            return nreverse(clause_list);
        }
    }

    /**
     *
     *
     * @param sentence
     * 		EL sentence; a conjunction of possibly disjoined literals.
     * @return clauses; a list of cnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)
    Removes #$and, #$or and #$not while translating a sentence of the form
    (#$and (#$or <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)
    (#$or (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)
    ...)
    into
    ( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))
    ((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))
    ...
    )
     */
    @LispMethod(comment = "@param sentence\r\n\t\tEL sentence; a conjunction of possibly disjoined literals.\r\n@return clauses; a list of cnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)\r\nRemoves #$and, #$or and #$not while translating a sentence of the form\r\n(#$and (#$or <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)\r\n(#$or (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)\r\n...)\r\ninto\r\n( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))\r\n((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))\r\n...\r\n)")
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

    /**
     *
     *
     * @param clause
     * 		list; a list of implicitly disjoined literals.
     * 		Goes through CLAUSE looking for negated atomic sentences.
     * 		It puts them into <neg-lits> and puts the rest into <pos-lits>.
     * @return list; (<neg-lits> <pos-lits>)
     */
    @LispMethod(comment = "@param clause\r\n\t\tlist; a list of implicitly disjoined literals.\r\n\t\tGoes through CLAUSE looking for negated atomic sentences.\r\n\t\tIt puts them into <neg-lits> and puts the rest into <pos-lits>.\r\n@return list; (<neg-lits> <pos-lits>)")
    public static final SubLObject package_cnf_clause_alt(SubLObject clause) {
        return com.cyc.cycjava.cycl.clausifier.package_xnf_clause(clause);
    }

    /**
     *
     *
     * @param clause
     * 		list; a list of implicitly disjoined literals.
     * 		Goes through CLAUSE looking for negated atomic sentences.
     * 		It puts them into <neg-lits> and puts the rest into <pos-lits>.
     * @return list; (<neg-lits> <pos-lits>)
     */
    @LispMethod(comment = "@param clause\r\n\t\tlist; a list of implicitly disjoined literals.\r\n\t\tGoes through CLAUSE looking for negated atomic sentences.\r\n\t\tIt puts them into <neg-lits> and puts the rest into <pos-lits>.\r\n@return list; (<neg-lits> <pos-lits>)")
    public static SubLObject package_cnf_clause(final SubLObject clause) {
        return package_xnf_clause(clause);
    }

    /**
     * A destructive version of @xref package-cnf-clause.
     */
    @LispMethod(comment = "A destructive version of @xref package-cnf-clause.")
    public static final SubLObject npackage_cnf_clause_alt(SubLObject clause) {
        return com.cyc.cycjava.cycl.clausifier.npackage_xnf_clause(clause);
    }

    @LispMethod(comment = "A destructive version of @xref package-cnf-clause.")
    public static SubLObject npackage_cnf_clause(final SubLObject clause) {
        return npackage_xnf_clause(clause);
    }/**
     * A destructive version of @xref package-cnf-clause.
     */


    public static final SubLObject conjunctions_in_alt(SubLObject sentence) {
        if (NIL != com.cyc.cycjava.cycl.clausifier.bad_exponential_conjunctionP(sentence)) {
            return com.cyc.cycjava.cycl.clausifier.handle_bad_exponential_conjunction(sentence);
        } else {
            return com.cyc.cycjava.cycl.clausifier.conjunctions_in_int(sentence);
        }
    }

    public static SubLObject conjunctions_in(final SubLObject sentence) {
        if (NIL != bad_exponential_conjunctionP(sentence)) {
            return handle_bad_exponential_conjunction(sentence);
        }
        return conjunctions_in_int(sentence);
    }

    /**
     * Moves conjunctions inwards inside SENTENCE by repeatedly applying the following transformation:
     * (#$and <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form1> <form2>) (#$and <form1> <form3>)).
     * (#$and <form0> <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form0> <form1> <form2>) (#$and <form0> <form1> <form3>)).
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
     * and that #$not only encloses atomic sentences.
     * The order is scrambled when the conjunctions are pushed inwards.
     *
     * @unknown this is exponential in the worse case, see disjunctions-in for details.
     */
    @LispMethod(comment = "Moves conjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\r\n(#$and <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form1> <form2>) (#$and <form1> <form3>)).\r\n(#$and <form0> <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form0> <form1> <form2>) (#$and <form0> <form1> <form3>)).\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\r\nand that #$not only encloses atomic sentences.\r\nThe order is scrambled when the conjunctions are pushed inwards.\r\n\r\n@unknown this is exponential in the worse case, see disjunctions-in for details.\nMoves conjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\n(#$and <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form1> <form2>) (#$and <form1> <form3>)).\n(#$and <form0> <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form0> <form1> <form2>) (#$and <form0> <form1> <form3>)).\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\nand that #$not only encloses atomic sentences.\nThe order is scrambled when the conjunctions are pushed inwards.")
    public static final SubLObject conjunctions_in_int_alt(SubLObject sentence) {
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
                        if (NIL != el_disjunction_p(sentence)) {
                            result = nmap_formula_args(CONJUNCTIONS_IN, sentence, UNPROVIDED);
                        } else {
                            if (NIL != el_conjunction_p(sentence)) {
                                if (NIL != cycl_utilities.opaque_argP(sentence, ONE_INTEGER)) {
                                    result = sentence;
                                } else {
                                    sentence = nmap_formula_args(CONJUNCTIONS_IN, sentence, UNPROVIDED);
                                    {
                                        SubLObject nested_disjunction = com.cyc.cycjava.cycl.clausifier.first_disjunction(cycl_utilities.formula_args(sentence, UNPROVIDED));
                                        if (NIL != nested_disjunction) {
                                            {
                                                SubLObject other_conjuncts = delete(nested_disjunction, cycl_utilities.formula_args(sentence, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                if (NIL != other_conjuncts) {
                                                    {
                                                        SubLObject new_disjuncts = NIL;
                                                        SubLObject args = cycl_utilities.formula_args(nested_disjunction, $IGNORE);
                                                        SubLObject cdolist_list_var = args;
                                                        SubLObject disjunct = NIL;
                                                        for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                                                            {
                                                                SubLObject new_conjuncts = cons(disjunct, other_conjuncts);
                                                                new_disjuncts = cons(simplifier.conjoin(new_conjuncts, UNPROVIDED), new_disjuncts);
                                                            }
                                                        }
                                                        result = simplifier.ndisjoin(list_utilities.nmapcar(CONJUNCTIONS_IN, new_disjuncts), UNPROVIDED);
                                                    }
                                                } else {
                                                    result = nested_disjunction;
                                                }
                                            }
                                        } else {
                                            result = sentence;
                                        }
                                    }
                                }
                            } else {
                                if ((NIL != possibly_el_quantified_sentence_p(sentence)) || (NIL != el_logical_operator_formula_p(sentence))) {
                                    result = sentence;
                                } else {
                                    if (NIL != el_grammar.el_literal_p(sentence)) {
                                        result = sentence;
                                    } else {
                                        if (NIL != el_grammar.el_non_formula_sentence_p(sentence)) {
                                            result = sentence;
                                        } else {
                                            el_error(FOUR_INTEGER, $str_alt55$Got_the_unexpected_formula__S_in_, sentence, UNPROVIDED, UNPROVIDED);
                                            result = sentence;
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

    @LispMethod(comment = "Moves conjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\r\n(#$and <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form1> <form2>) (#$and <form1> <form3>)).\r\n(#$and <form0> <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form0> <form1> <form2>) (#$and <form0> <form1> <form3>)).\r\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\r\nand that #$not only encloses atomic sentences.\r\nThe order is scrambled when the conjunctions are pushed inwards.\r\n\r\n@unknown this is exponential in the worse case, see disjunctions-in for details.\nMoves conjunctions inwards inside SENTENCE by repeatedly applying the following transformation:\n(#$and <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form1> <form2>) (#$and <form1> <form3>)).\n(#$and <form0> <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form0> <form1> <form2>) (#$and <form0> <form1> <form3>)).\nAssumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,\nand that #$not only encloses atomic sentences.\nThe order is scrambled when the conjunctions are pushed inwards.")
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
    }/**
     * Moves conjunctions inwards inside SENTENCE by repeatedly applying the following transformation:
     * (#$and <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form1> <form2>) (#$and <form1> <form3>)).
     * (#$and <form0> <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form0> <form1> <form2>) (#$and <form0> <form1> <form3>)).
     * Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
     * and that #$not only encloses atomic sentences.
     * The order is scrambled when the conjunctions are pushed inwards.
     *
     * @unknown this is exponential in the worse case, see disjunctions-in for details.
     */


    /**
     * Returns the first disjunction in the list SENTENCES.
     */
    @LispMethod(comment = "Returns the first disjunction in the list SENTENCES.")
    public static final SubLObject first_disjunction_alt(SubLObject sentences) {
        return find_if(symbol_function(EL_DISJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns the first disjunction in the list SENTENCES.")
    public static SubLObject first_disjunction(final SubLObject sentences) {
        return find_if(symbol_function(EL_DISJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Returns the first disjunction in the list SENTENCES.
     */


    /**
     *
     *
     * @return booleanp; whether SENTENCE is too explosive to be put
    into DNF using the straightforward algorithm.
     */
    @LispMethod(comment = "@return booleanp; whether SENTENCE is too explosive to be put\r\ninto DNF using the straightforward algorithm.")
    public static final SubLObject bad_exponential_conjunctionP_alt(SubLObject sentence) {
        if (NIL != el_conjunction_p(sentence)) {
            return com.cyc.cycjava.cycl.clausifier.bad_exponential_sentenceP(sentence, EL_DISJUNCTION_P);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether SENTENCE is too explosive to be put
    into DNF using the straightforward algorithm.
     */
    @LispMethod(comment = "@return booleanp; whether SENTENCE is too explosive to be put\r\ninto DNF using the straightforward algorithm.")
    public static SubLObject bad_exponential_conjunctionP(final SubLObject sentence) {
        if (NIL != el_conjunction_p(sentence)) {
            return bad_exponential_sentenceP(sentence, EL_DISJUNCTION_P);
        }
        return NIL;
    }

    /**
     * Should be caught by all callers of czer functions
     */
    @LispMethod(comment = "Should be caught by all callers of czer functions")
    public static final SubLObject handle_bad_exponential_conjunction_alt(SubLObject sentence) {
        return sublisp_throw($BAD_EXPONENTIAL_CONJUNCTION, sentence);
    }

    @LispMethod(comment = "Should be caught by all callers of czer functions")
    public static SubLObject handle_bad_exponential_conjunction(final SubLObject sentence) {
        return sublisp_throw($BAD_EXPONENTIAL_CONJUNCTION, sentence);
    }/**
     * Should be caught by all callers of czer functions
     */


    /**
     * Assumes that SENTENCE is a subset of DNF (either in dnf, a conjunction, or a literal)
     * and returns a version of SENTENCE that is in strict DNF form.
     * For example, (#$genls #$Dog #$Mammal) would be forced into (#$or (#$and (#$genls #$Dog #$Mammal))).
     * Also, it scrambles the order of the arguments inside the disjunctions and conjunctions.
     *
     * @unknown this function is dumb.
     */
    @LispMethod(comment = "Assumes that SENTENCE is a subset of DNF (either in dnf, a conjunction, or a literal)\r\nand returns a version of SENTENCE that is in strict DNF form.\r\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$or (#$and (#$genls #$Dog #$Mammal))).\r\nAlso, it scrambles the order of the arguments inside the disjunctions and conjunctions.\r\n\r\n@unknown this function is dumb.\nAssumes that SENTENCE is a subset of DNF (either in dnf, a conjunction, or a literal)\nand returns a version of SENTENCE that is in strict DNF form.\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$or (#$and (#$genls #$Dog #$Mammal))).\nAlso, it scrambles the order of the arguments inside the disjunctions and conjunctions.")
    public static final SubLObject force_into_dnf_alt(SubLObject sentence) {
        if (NIL == el_disjunction_p(sentence)) {
            sentence = make_disjunction(list(sentence));
        }
        {
            SubLObject new_args = NIL;
            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != el_conjunction_p(arg)) {
                    new_args = cons(arg, new_args);
                } else {
                    new_args = cons(make_conjunction(list(arg)), new_args);
                }
            }
            return make_disjunction(new_args);
        }
    }

    @LispMethod(comment = "Assumes that SENTENCE is a subset of DNF (either in dnf, a conjunction, or a literal)\r\nand returns a version of SENTENCE that is in strict DNF form.\r\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$or (#$and (#$genls #$Dog #$Mammal))).\r\nAlso, it scrambles the order of the arguments inside the disjunctions and conjunctions.\r\n\r\n@unknown this function is dumb.\nAssumes that SENTENCE is a subset of DNF (either in dnf, a conjunction, or a literal)\nand returns a version of SENTENCE that is in strict DNF form.\nFor example, (#$genls #$Dog #$Mammal) would be forced into (#$or (#$and (#$genls #$Dog #$Mammal))).\nAlso, it scrambles the order of the arguments inside the disjunctions and conjunctions.")
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
    }/**
     * Assumes that SENTENCE is a subset of DNF (either in dnf, a conjunction, or a literal)
     * and returns a version of SENTENCE that is in strict DNF form.
     * For example, (#$genls #$Dog #$Mammal) would be forced into (#$or (#$and (#$genls #$Dog #$Mammal))).
     * Also, it scrambles the order of the arguments inside the disjunctions and conjunctions.
     *
     * @unknown this function is dumb.
     */


    /**
     *
     *
     * @param sentence
     * 		EL sentence; a disjunction of possibly conjoined literals.
     * @return clauses; a list of dnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)
    Removes #$or, #$and and #$not while translating a sentence of the form
    (#$or (#$and <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)
    (#$and (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)
    ...)
    into
    ( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))
    ((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))
    ...
    )
     */
    @LispMethod(comment = "@param sentence\r\n\t\tEL sentence; a disjunction of possibly conjoined literals.\r\n@return clauses; a list of dnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)\r\nRemoves #$or, #$and and #$not while translating a sentence of the form\r\n(#$or (#$and <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)\r\n(#$and (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)\r\n...)\r\ninto\r\n( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))\r\n((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))\r\n...\r\n)")
    public static final SubLObject dnf_operators_out_alt(SubLObject sentence) {
        if (((NIL == sentence) || (sentence == $$True)) || (sentence == $$False)) {
            return sentence;
        }
        if (NIL != cycl_variables.el_varP(sentence)) {
            sentence = czer_utilities.encapsulate_formula(sentence, UNPROVIDED);
        }
        sentence = com.cyc.cycjava.cycl.clausifier.force_into_dnf(sentence);
        if (NIL == el_disjunction_p(sentence)) {
            el_error(FOUR_INTEGER, $str_alt58$_s_is_not_a_disjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        {
            SubLObject clause_list = NIL;
            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject disjunct = NIL;
            for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                if (NIL == el_conjunction_p(disjunct)) {
                    el_error(FOUR_INTEGER, $str_alt59$_s_is_not_a_conjunction__so__S_is, disjunct, sentence, UNPROVIDED);
                    return NIL;
                }
                clause_list = cons(com.cyc.cycjava.cycl.clausifier.package_xnf_clause(cycl_utilities.formula_args(disjunct, UNPROVIDED)), clause_list);
            }
            return nreverse(clause_list);
        }
    }

    /**
     *
     *
     * @param sentence
     * 		EL sentence; a disjunction of possibly conjoined literals.
     * @return clauses; a list of dnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)
    Removes #$or, #$and and #$not while translating a sentence of the form
    (#$or (#$and <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)
    (#$and (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)
    ...)
    into
    ( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))
    ((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))
    ...
    )
     */
    @LispMethod(comment = "@param sentence\r\n\t\tEL sentence; a disjunction of possibly conjoined literals.\r\n@return clauses; a list of dnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)\r\nRemoves #$or, #$and and #$not while translating a sentence of the form\r\n(#$or (#$and <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...)\r\n(#$and (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...)\r\n...)\r\ninto\r\n( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))\r\n((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))\r\n...\r\n)")
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

    /**
     *
     *
     * @param clause
     * 		list; a list of implicitly conjoined literals.
     * 		Goes through CLAUSE looking for negated atomic sentences.
     * 		It puts them into <neg-lits> and puts the rest into <pos-lits>.
     * @return list; (<neg-lits> <pos-lits>)
     */
    @LispMethod(comment = "@param clause\r\n\t\tlist; a list of implicitly conjoined literals.\r\n\t\tGoes through CLAUSE looking for negated atomic sentences.\r\n\t\tIt puts them into <neg-lits> and puts the rest into <pos-lits>.\r\n@return list; (<neg-lits> <pos-lits>)")
    public static final SubLObject package_dnf_clause_alt(SubLObject clause) {
        return com.cyc.cycjava.cycl.clausifier.package_xnf_clause(clause);
    }

    /**
     *
     *
     * @param clause
     * 		list; a list of implicitly conjoined literals.
     * 		Goes through CLAUSE looking for negated atomic sentences.
     * 		It puts them into <neg-lits> and puts the rest into <pos-lits>.
     * @return list; (<neg-lits> <pos-lits>)
     */
    @LispMethod(comment = "@param clause\r\n\t\tlist; a list of implicitly conjoined literals.\r\n\t\tGoes through CLAUSE looking for negated atomic sentences.\r\n\t\tIt puts them into <neg-lits> and puts the rest into <pos-lits>.\r\n@return list; (<neg-lits> <pos-lits>)")
    public static SubLObject package_dnf_clause(final SubLObject clause) {
        return package_xnf_clause(clause);
    }

    public static final SubLObject clausifier_input_sentence_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $clausifier_input_sentence$.getDynamicValue(thread);
        }
    }

    public static SubLObject clausifier_input_sentence() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $clausifier_input_sentence$.getDynamicValue(thread);
    }

    public static final SubLObject clausifier_input_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $clausifier_input_mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject clausifier_input_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $clausifier_input_mt$.getDynamicValue(thread);
    }

    /**
     * Transforms an EL sentence so that it is ready to be put into either CNF or DNF form.
     * At the end of this step, the only operators in SENTENCE will be #$and, #$or, and #$not,
     * and #$not will only enclose atomic sentences.
     * Most transformations are syntactic except for the precanonicalizations.
     *
     * @return 0 EL sentence
    Assumes the EL var namespace is bound.
     */
    @LispMethod(comment = "Transforms an EL sentence so that it is ready to be put into either CNF or DNF form.\r\nAt the end of this step, the only operators in SENTENCE will be #$and, #$or, and #$not,\r\nand #$not will only enclose atomic sentences.\r\nMost transformations are syntactic except for the precanonicalizations.\r\n\r\n@return 0 EL sentence\r\nAssumes the EL var namespace is bound.\nTransforms an EL sentence so that it is ready to be put into either CNF or DNF form.\nAt the end of this step, the only operators in SENTENCE will be #$and, #$or, and #$not,\nand #$not will only enclose atomic sentences.\nMost transformations are syntactic except for the precanonicalizations.")
    public static final SubLObject el_xnf_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $clausifier_input_sentence$.currentBinding(thread);
                SubLObject _prev_bind_1 = $clausifier_input_mt$.currentBinding(thread);
                try {
                    $clausifier_input_sentence$.bind(sentence, thread);
                    $clausifier_input_mt$.bind(mt, thread);
                    thread.resetMultipleValues();
                    {
                        SubLObject sentence_6 = com.cyc.cycjava.cycl.clausifier.el_xnf_int(sentence, mt);
                        SubLObject mt_7 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        sentence = sentence_6;
                        mt = mt_7;
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject sentence_8 = postcanonicalizer.postcanonicalizations(sentence, mt);
                        SubLObject mt_9 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        sentence = sentence_8;
                        mt = mt_9;
                    }
                } finally {
                    $clausifier_input_mt$.rebind(_prev_bind_1, thread);
                    $clausifier_input_sentence$.rebind(_prev_bind_0, thread);
                }
            }
            sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
            return values(sentence, mt);
        }
    }

    @LispMethod(comment = "Transforms an EL sentence so that it is ready to be put into either CNF or DNF form.\r\nAt the end of this step, the only operators in SENTENCE will be #$and, #$or, and #$not,\r\nand #$not will only enclose atomic sentences.\r\nMost transformations are syntactic except for the precanonicalizations.\r\n\r\n@return 0 EL sentence\r\nAssumes the EL var namespace is bound.\nTransforms an EL sentence so that it is ready to be put into either CNF or DNF form.\nAt the end of this step, the only operators in SENTENCE will be #$and, #$or, and #$not,\nand #$not will only enclose atomic sentences.\nMost transformations are syntactic except for the precanonicalizations.")
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
    }/**
     * Transforms an EL sentence so that it is ready to be put into either CNF or DNF form.
     * At the end of this step, the only operators in SENTENCE will be #$and, #$or, and #$not,
     * and #$not will only enclose atomic sentences.
     * Most transformations are syntactic except for the precanonicalizations.
     *
     * @return 0 EL sentence
    Assumes the EL var namespace is bound.
     */


    public static final SubLObject el_xnf_int_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sentence_10 = precanonicalizer.precanonicalizations(sentence, mt);
                SubLObject mt_11 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                sentence = sentence_10;
                mt = mt_11;
            }
            sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
            sentence = com.cyc.cycjava.cycl.clausifier.do_implications(sentence);
            sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
            sentence = com.cyc.cycjava.cycl.clausifier.do_negations_destructive(sentence);
            sentence = com.cyc.cycjava.cycl.clausifier.standardize_variables(sentence);
            {
                SubLObject _prev_bind_0 = $newly_introduced_universals$.currentBinding(thread);
                try {
                    $newly_introduced_universals$.bind(NIL, thread);
                    sentence = com.cyc.cycjava.cycl.clausifier.czer_explicitify_implicit_quantifiers(sentence);
                    sentence = com.cyc.cycjava.cycl.clausifier.existentials_out(sentence);
                    sentence = com.cyc.cycjava.cycl.clausifier.universals_out(sentence);
                } finally {
                    $newly_introduced_universals$.rebind(_prev_bind_0, thread);
                }
            }
            return values(sentence, mt);
        }
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

    public static final SubLObject package_xnf_clauses_alt(SubLObject v_clauses) {
        if ($$True == v_clauses) {
            return v_clauses;
        } else {
            if ($$False == v_clauses) {
                return v_clauses;
            } else {
                return Mapping.mapcar(symbol_function(PACKAGE_XNF_CLAUSE), v_clauses);
            }
        }
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

    /**
     *
     *
     * @param clause
     * 		list; a list of literals.
     * 		Goes through CLAUSE looking for negated atomic sentences.
     * 		It puts them into <neg-lits> and puts the rest into <pos-lits>.
     * @return list; (<neg-lits> <pos-lits>)
     */
    @LispMethod(comment = "@param clause\r\n\t\tlist; a list of literals.\r\n\t\tGoes through CLAUSE looking for negated atomic sentences.\r\n\t\tIt puts them into <neg-lits> and puts the rest into <pos-lits>.\r\n@return list; (<neg-lits> <pos-lits>)")
    public static final SubLObject package_xnf_clause_alt(SubLObject clause) {
        {
            SubLObject neg_lits = Mapping.mapcar(symbol_function(FORMULA_ARG1), el_negative_sentences(clause));
            SubLObject pos_lits = el_positive_sentences(clause);
            return clauses.make_xnf(neg_lits, pos_lits);
        }
    }

    /**
     *
     *
     * @param clause
     * 		list; a list of literals.
     * 		Goes through CLAUSE looking for negated atomic sentences.
     * 		It puts them into <neg-lits> and puts the rest into <pos-lits>.
     * @return list; (<neg-lits> <pos-lits>)
     */
    @LispMethod(comment = "@param clause\r\n\t\tlist; a list of literals.\r\n\t\tGoes through CLAUSE looking for negated atomic sentences.\r\n\t\tIt puts them into <neg-lits> and puts the rest into <pos-lits>.\r\n@return list; (<neg-lits> <pos-lits>)")
    public static SubLObject package_xnf_clause(final SubLObject clause) {
        final SubLObject neg_lits = Mapping.mapcar(symbol_function(FORMULA_ARG1), el_negative_sentences(clause));
        final SubLObject pos_lits = el_positive_sentences(clause);
        return clauses.make_xnf(neg_lits, pos_lits);
    }

    /**
     * A destructive version of @xref package-xnf-clause.
     */
    @LispMethod(comment = "A destructive version of @xref package-xnf-clause.")
    public static final SubLObject npackage_xnf_clause_alt(SubLObject clause) {
        {
            SubLObject neg_lits = list_utilities.nmapcar(symbol_function(FORMULA_ARG1), el_negative_sentences(clause));
            SubLObject pos_lits = el_positive_sentences(clause);
            return clauses.make_xnf(neg_lits, pos_lits);
        }
    }

    @LispMethod(comment = "A destructive version of @xref package-xnf-clause.")
    public static SubLObject npackage_xnf_clause(final SubLObject clause) {
        final SubLObject neg_lits = list_utilities.nmapcar(symbol_function(FORMULA_ARG1), el_negative_sentences(clause));
        final SubLObject pos_lits = el_positive_sentences(clause);
        return clauses.make_xnf(neg_lits, pos_lits);
    }/**
     * A destructive version of @xref package-xnf-clause.
     */


    public static final SubLObject canon_fast_gafP_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
            SubLObject tempformula = (NIL != seqvar) ? ((SubLObject) (append(strip_sequence_var(sentence), list(seqvar)))) : sentence;
            SubLObject sentence_12 = tempformula;
            return makeBoolean(((((NIL != el_formula_p(sentence_12)) && (NIL == find_if(symbol_function(EL_FORMULA_P), sentence_12, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == find_if(symbol_function($sym62$EL_VAR_), sentence_12, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(sentence_12)))) && (NIL == precanonicalizer.precanonicalizationsP(sentence_12, mt, T)));
        }
    }

    public static SubLObject canon_fast_gafP(final SubLObject sentence, final SubLObject mt) {
        final SubLObject seqvar = sequence_var(sentence, UNPROVIDED);
        final SubLObject sentence_$12;
        final SubLObject tempformula = sentence_$12 = (NIL != seqvar) ? append(strip_sequence_var(sentence), list(seqvar)) : sentence;
        return makeBoolean(((((NIL != el_formula_p(sentence_$12)) && (NIL == find_if(symbol_function(EL_FORMULA_P), sentence_$12, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == find_if(symbol_function($sym62$EL_VAR_), sentence_$12, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(sentence_$12)))) && (NIL == precanonicalizer.precanonicalizationsP(sentence_$12, mt, T)));
    }

    /**
     * Constructively transforms an EL sentence into conjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
     */
    @LispMethod(comment = "Constructively transforms an EL sentence into conjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\nConstructively transforms an EL sentence into conjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
    public static final SubLObject el_cnf_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                try {
                    czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread))) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
                    czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$standardize_variables_memory$.getDynamicValue(thread))) : NIL, thread);
                    thread.resetMultipleValues();
                    {
                        SubLObject sentence_13 = com.cyc.cycjava.cycl.clausifier.el_cnf_int(sentence, mt, NIL);
                        SubLObject mt_14 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        sentence = sentence_13;
                        mt = mt_14;
                    }
                } finally {
                    czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                    czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                }
            }
            return values(sentence, mt);
        }
    }

    @LispMethod(comment = "Constructively transforms an EL sentence into conjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\nConstructively transforms an EL sentence into conjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
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
    }/**
     * Constructively transforms an EL sentence into conjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
     */


    /**
     * Destructively transforms an EL sentence into conjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
    Assumes the EL variable namespace is bound.
     */
    @LispMethod(comment = "Destructively transforms an EL sentence into conjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\r\nAssumes the EL variable namespace is bound.\nDestructively transforms an EL sentence into conjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
    public static final SubLObject el_cnf_destructive_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.clausifier.el_cnf_int(sentence, mt, T);
    }

    @LispMethod(comment = "Destructively transforms an EL sentence into conjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\r\nAssumes the EL variable namespace is bound.\nDestructively transforms an EL sentence into conjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
    public static SubLObject el_cnf_destructive(final SubLObject sentence, final SubLObject mt) {
        return el_cnf_int(sentence, mt, T);
    }/**
     * Destructively transforms an EL sentence into conjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
    Assumes the EL variable namespace is bound.
     */


    /**
     * Assumes the EL variable namespace is bound.
     */
    @LispMethod(comment = "Assumes the EL variable namespace is bound.")
    public static final SubLObject el_cnf_int_alt(SubLObject sentence, SubLObject mt, SubLObject destructiveP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == destructiveP) {
                sentence = copy_sentence(sentence);
            }
            if (NIL != com.cyc.cycjava.cycl.clausifier.canon_fast_gafP(sentence, mt)) {
                sentence = simplifier.simplify_cycl_literal_syntax(sentence, UNPROVIDED);
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject sentence_15 = com.cyc.cycjava.cycl.clausifier.el_xnf(sentence, mt);
                    SubLObject mt_16 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sentence = sentence_15;
                    mt = mt_16;
                }
                if (NIL != wff_macros.within_wffP()) {
                    sentence = com.cyc.cycjava.cycl.clausifier.disjunctions_in(sentence);
                } else {
                    {
                        SubLObject error = NIL;
                        try {
                            sentence = com.cyc.cycjava.cycl.clausifier.disjunctions_in(sentence);
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_DISJUNCTION);
                        }
                        if (NIL != error) {
                            sentence = NIL;
                        }
                    }
                }
                sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
            }
            return values(sentence, mt);
        }
    }

    @LispMethod(comment = "Assumes the EL variable namespace is bound.")
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
    }/**
     * Assumes the EL variable namespace is bound.
     */


    /**
     * Constructively transforms an EL sentence into disjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
     */
    @LispMethod(comment = "Constructively transforms an EL sentence into disjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\nConstructively transforms an EL sentence into disjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
    public static final SubLObject el_dnf_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                try {
                    czer_vars.$el_symbol_suffix_table$.bind(NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread))) : make_hash_table($int$32, symbol_function(EQL), UNPROVIDED), thread);
                    czer_vars.$standardize_variables_memory$.bind(NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? ((SubLObject) (czer_vars.$standardize_variables_memory$.getDynamicValue(thread))) : NIL, thread);
                    thread.resetMultipleValues();
                    {
                        SubLObject sentence_17 = com.cyc.cycjava.cycl.clausifier.el_dnf_int(sentence, mt, NIL);
                        SubLObject mt_18 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        sentence = sentence_17;
                        mt = mt_18;
                    }
                } finally {
                    czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                    czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                }
            }
            return values(sentence, mt);
        }
    }

    @LispMethod(comment = "Constructively transforms an EL sentence into disjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\nConstructively transforms an EL sentence into disjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
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
    }/**
     * Constructively transforms an EL sentence into disjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
     */


    /**
     * Destructively transforms an EL sentence into disjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
    Assumes the EL variable namespace is bound.
     */
    @LispMethod(comment = "Destructively transforms an EL sentence into disjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\r\nAssumes the EL variable namespace is bound.\nDestructively transforms an EL sentence into disjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
    public static final SubLObject el_dnf_destructive_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.clausifier.el_dnf_int(sentence, mt, T);
    }

    @LispMethod(comment = "Destructively transforms an EL sentence into disjunctive normal form.\r\nReturns a well-formed EL sentence, or NIL if there was an error.\r\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.\r\n\r\n@return 0 EL sentence\r\nAssumes the EL variable namespace is bound.\nDestructively transforms an EL sentence into disjunctive normal form.\nReturns a well-formed EL sentence, or NIL if there was an error.\nSemantic checks are performed only at the beginning and end - all internal processing is purely syntactic.")
    public static SubLObject el_dnf_destructive(final SubLObject sentence, final SubLObject mt) {
        return el_dnf_int(sentence, mt, T);
    }/**
     * Destructively transforms an EL sentence into disjunctive normal form.
     * Returns a well-formed EL sentence, or NIL if there was an error.
     * Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
     *
     * @return 0 EL sentence
    Assumes the EL variable namespace is bound.
     */


    /**
     * Assumes the EL variable namespace is bound.
     */
    @LispMethod(comment = "Assumes the EL variable namespace is bound.")
    public static final SubLObject el_dnf_int_alt(SubLObject sentence, SubLObject mt, SubLObject destructiveP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == destructiveP) {
                sentence = copy_sentence(sentence);
            }
            if (NIL != com.cyc.cycjava.cycl.clausifier.canon_fast_gafP(sentence, mt)) {
                sentence = simplifier.simplify_cycl_literal_syntax(sentence, UNPROVIDED);
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject sentence_19 = com.cyc.cycjava.cycl.clausifier.el_xnf(sentence, mt);
                    SubLObject mt_20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sentence = sentence_19;
                    mt = mt_20;
                }
                if (NIL != wff_macros.within_wffP()) {
                    sentence = com.cyc.cycjava.cycl.clausifier.conjunctions_in(sentence);
                } else {
                    {
                        SubLObject error = NIL;
                        try {
                            sentence = com.cyc.cycjava.cycl.clausifier.conjunctions_in(sentence);
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $BAD_EXPONENTIAL_CONJUNCTION);
                        }
                        if (NIL != error) {
                            sentence = NIL;
                        }
                    }
                }
                sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
            }
            return values(sentence, mt);
        }
    }

    @LispMethod(comment = "Assumes the EL variable namespace is bound.")
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
    }/**
     * Assumes the EL variable namespace is bound.
     */


    public static final SubLObject leading_universal_variables_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject copied_sentence = copy_sentence(sentence);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                    try {
                        czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                        czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                        copied_sentence = precanonicalizer.precanonicalizations(copied_sentence, mt);
                        copied_sentence = com.cyc.cycjava.cycl.clausifier.do_implications(copied_sentence);
                        copied_sentence = com.cyc.cycjava.cycl.clausifier.do_negations_destructive(copied_sentence);
                        copied_sentence = com.cyc.cycjava.cycl.clausifier.czer_explicitify_implicit_universal_quantifiers(copied_sentence);
                        copied_sentence = com.cyc.cycjava.cycl.clausifier.standardize_variables(copied_sentence);
                        copied_sentence = com.cyc.cycjava.cycl.clausifier.existentials_out(copied_sentence);
                        copied_sentence = czer_main.el_nununiquify_vars(copied_sentence);
                        copied_sentence = com.cyc.cycjava.cycl.clausifier.universals_out(copied_sentence);
                        copied_sentence = com.cyc.cycjava.cycl.clausifier.leading_universal_variables_1(copied_sentence);
                    } finally {
                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    public static final SubLObject leading_universal_variables_1_alt(SubLObject sentence) {
        if (NIL != czer_utilities.encapsulate_formulaP(sentence)) {
        } else {
            if (sentence.isAtom()) {
            } else {
                if (NIL != el_negation_p(sentence)) {
                } else {
                    if ((NIL != el_conjunction_p(sentence)) || (NIL != el_disjunction_p(sentence))) {
                        return list_utilities.mapappend(symbol_function(LEADING_UNIVERSAL_VARIABLES_1), cycl_utilities.formula_args(sentence, UNPROVIDED));
                    } else {
                        if (NIL != cycl_universal_p(sentence)) {
                            return cons(quantified_var(sentence), com.cyc.cycjava.cycl.clausifier.leading_universal_variables_1(quantified_sub_sentence(sentence)));
                        }
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject sort_vars_alt(SubLObject vars) {
        return Sort.sort(copy_list(vars), symbol_function($sym64$STRING_), symbol_function(STR));
    }

    public static SubLObject sort_vars(final SubLObject vars) {
        return Sort.sort(copy_list(vars), symbol_function($sym64$STRING_), symbol_function(STR));
    }

    /**
     *
     *
     * @param conjuncts
     * 		list; a list of conjoined sentences
     * @param disjuncts
     * 		list; a list of disjoined sentences
     * 		Distributes the disjuncts over the conjuncts (DeMorgan's theorem)
     */
    @LispMethod(comment = "@param conjuncts\r\n\t\tlist; a list of conjoined sentences\r\n@param disjuncts\r\n\t\tlist; a list of disjoined sentences\r\n\t\tDistributes the disjuncts over the conjuncts (DeMorgan\'s theorem)")
    public static final SubLObject distribute_conjunction_alt(SubLObject conjuncts, SubLObject disjuncts, SubLObject conjunction_operator) {
        if (conjunction_operator == UNPROVIDED) {
            conjunction_operator = $$and;
        }
        if (conjuncts.isCons() && (NIL != list_utilities.proper_list_p(disjuncts))) {
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = disjuncts;
                SubLObject disjunct = NIL;
                for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                    ans = cons(listS(conjunction_operator, disjunct, conjuncts), ans);
                }
                return nreverse(ans);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param conjuncts
     * 		list; a list of conjoined sentences
     * @param disjuncts
     * 		list; a list of disjoined sentences
     * 		Distributes the disjuncts over the conjuncts (DeMorgan's theorem)
     */
    @LispMethod(comment = "@param conjuncts\r\n\t\tlist; a list of conjoined sentences\r\n@param disjuncts\r\n\t\tlist; a list of disjoined sentences\r\n\t\tDistributes the disjuncts over the conjuncts (DeMorgan\'s theorem)")
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

    /**
     * Transforms SENTENCE into either CNF or DNF.
     *
     * @return 0 el sentence; the CNF or DNF form of the EL sentence SENTENCE.
     * @see cnf-clausal-form
     * @see dnf-clausal-form
     */
    @LispMethod(comment = "Transforms SENTENCE into either CNF or DNF.\r\n\r\n@return 0 el sentence; the CNF or DNF form of the EL sentence SENTENCE.\r\n@see cnf-clausal-form\r\n@see dnf-clausal-form")
    public static final SubLObject clausal_form_alt(SubLObject sentence, SubLObject mt, SubLObject form) {
        if (form == UNPROVIDED) {
            form = $CNF;
        }
        {
            SubLObject pcase_var = form;
            if (pcase_var.eql($CNF)) {
                return com.cyc.cycjava.cycl.clausifier.cnf_clausal_form(sentence, mt);
            } else {
                if (pcase_var.eql($DNF)) {
                    return com.cyc.cycjava.cycl.clausifier.dnf_clausal_form(sentence, mt);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Transforms SENTENCE into either CNF or DNF.\r\n\r\n@return 0 el sentence; the CNF or DNF form of the EL sentence SENTENCE.\r\n@see cnf-clausal-form\r\n@see dnf-clausal-form")
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
    }/**
     * Transforms SENTENCE into either CNF or DNF.
     *
     * @return 0 el sentence; the CNF or DNF form of the EL sentence SENTENCE.
     * @see cnf-clausal-form
     * @see dnf-clausal-form
     */


    /**
     *
     *
     * @return 0 EL sentence; the CNF form of the EL sentence SENTENCE.
     */
    @LispMethod(comment = "@return 0 EL sentence; the CNF form of the EL sentence SENTENCE.")
    public static final SubLObject cnf_clausal_form_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $use_cnf_cacheP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.clausifier.cached_cnf_clausal_form(sentence, mt);
            } else {
                return com.cyc.cycjava.cycl.clausifier.cnf_clausal_form_int(sentence, mt);
            }
        }
    }

    /**
     *
     *
     * @return 0 EL sentence; the CNF form of the EL sentence SENTENCE.
     */
    @LispMethod(comment = "@return 0 EL sentence; the CNF form of the EL sentence SENTENCE.")
    public static SubLObject cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_cnf_cacheP$.getDynamicValue(thread)) {
            return cached_cnf_clausal_form(sentence, mt);
        }
        return cnf_clausal_form_int(sentence, mt);
    }

    public static final SubLObject clear_cached_cnf_clausal_form_alt() {
        {
            SubLObject cs = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_cnf_clausal_form() {
        final SubLObject cs = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_cnf_clausal_form_alt(SubLObject sentence, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_cnf_clausal_form_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_cnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_cnf_clausal_form_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; first element is an EL sentence; the CNF form of the EL sentence SENTENCE, second element is the binding list for the variables.
     */
    @LispMethod(comment = "@return list; first element is an EL sentence; the CNF form of the EL sentence SENTENCE, second element is the binding list for the variables.")
    public static final SubLObject cached_cnf_clausal_form_internal_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.clausifier.cnf_clausal_form_int(sentence, mt);
    }

    /**
     *
     *
     * @return list; first element is an EL sentence; the CNF form of the EL sentence SENTENCE, second element is the binding list for the variables.
     */
    @LispMethod(comment = "@return list; first element is an EL sentence; the CNF form of the EL sentence SENTENCE, second element is the binding list for the variables.")
    public static SubLObject cached_cnf_clausal_form_internal(final SubLObject sentence, final SubLObject mt) {
        return cnf_clausal_form_int(sentence, mt);
    }

    public static final SubLObject cached_cnf_clausal_form_alt(SubLObject sentence, SubLObject mt) {
        {
            SubLObject caching_state = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CNF_CLAUSAL_FORM, $cached_cnf_clausal_form_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$48);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw72$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (sentence.equal(cached_args.first())) {
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
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.clausifier.cached_cnf_clausal_form_internal(sentence, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
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

    public static final SubLObject cnf_clausal_form_int_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject cnf = com.cyc.cycjava.cycl.clausifier.el_cnf(sentence, mt);
                SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(com.cyc.cycjava.cycl.clausifier.cnf_operators_out(cnf), new_mt);
            }
        }
    }

    public static SubLObject cnf_clausal_form_int(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnf = el_cnf(sentence, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(cnf_operators_out(cnf), new_mt);
    }

    /**
     *
     *
     * @return 0 EL sentence; the DNF form of the EL sentence SENTENCE.
     */
    @LispMethod(comment = "@return 0 EL sentence; the DNF form of the EL sentence SENTENCE.")
    public static final SubLObject dnf_clausal_form_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject dnf = com.cyc.cycjava.cycl.clausifier.el_dnf(sentence, mt);
                SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(com.cyc.cycjava.cycl.clausifier.dnf_operators_out(dnf), new_mt);
            }
        }
    }

    /**
     *
     *
     * @return 0 EL sentence; the DNF form of the EL sentence SENTENCE.
     */
    @LispMethod(comment = "@return 0 EL sentence; the DNF form of the EL sentence SENTENCE.")
    public static SubLObject dnf_clausal_form(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject dnf = el_dnf(sentence, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(dnf_operators_out(dnf), new_mt);
    }

    public static SubLObject declare_clausifier_file() {
        declareFunction("do_implications", "DO-IMPLICATIONS", 1, 0, false);
        new clausifier.$do_implications$UnaryFunction();
        declareFunction("do_implications_recursive", "DO-IMPLICATIONS-RECURSIVE", 1, 0, false);
        declareFunction("eliminate_existential_with_var_only_in_antecedentP", "ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?", 3, 0, false);
        declareFunction("do_negations", "DO-NEGATIONS", 1, 0, false);
        declareFunction("do_negations_destructive", "DO-NEGATIONS-DESTRUCTIVE", 1, 0, false);
        new clausifier.$do_negations_destructive$UnaryFunction();
        declareFunction("negate_formula", "NEGATE-FORMULA", 1, 0, false);
        declareFunction("negation_in", "NEGATION-IN", 1, 0, false);
        declareFunction("negate_quantified_sentence", "NEGATE-QUANTIFIED-SENTENCE", 1, 0, false);
        declareFunction("negate_atomic", "NEGATE-ATOMIC", 1, 0, false);
        declareFunction("negate_negation", "NEGATE-NEGATION", 1, 0, false);
        declareFunction("negate_negations", "NEGATE-NEGATIONS", 1, 0, false);
        declareFunction("negate_conjunction", "NEGATE-CONJUNCTION", 1, 0, false);
        declareFunction("negate_conjunction_destructive", "NEGATE-CONJUNCTION-DESTRUCTIVE", 1, 0, false);
        declareFunction("negate_disjunction_destructive", "NEGATE-DISJUNCTION-DESTRUCTIVE", 1, 0, false);
        declareFunction("negate_universal", "NEGATE-UNIVERSAL", 1, 0, false);
        declareFunction("negate_existential", "NEGATE-EXISTENTIAL", 1, 0, false);
        declareFunction("negate_existential_min", "NEGATE-EXISTENTIAL-MIN", 1, 0, false);
        declareFunction("negate_existential_max", "NEGATE-EXISTENTIAL-MAX", 1, 0, false);
        declareFunction("negate_existential_exact", "NEGATE-EXISTENTIAL-EXACT", 1, 0, false);
        declareFunction("negate_true_sentence", "NEGATE-TRUE-SENTENCE", 1, 0, false);
        declareFunction("negate_encapsulate_sentence", "NEGATE-ENCAPSULATE-SENTENCE", 1, 0, false);
        declareFunction("lift_negation", "LIFT-NEGATION", 1, 0, false);
        declareFunction("czer_explicitify_implicit_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-QUANTIFIERS", 1, 0, false);
        declareFunction("czer_explicitify_implicit_universal_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false);
        declareFunction("czer_explicitify_implicit_existential_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false);
        declareFunction("assume_free_vars_are_existentially_boundP", "ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?", 0, 0, false);
        declareFunction("standardize_sentence_variables", "STANDARDIZE-SENTENCE-VARIABLES", 1, 0, false);
        declareFunction("standardize_variables", "STANDARDIZE-VARIABLES", 1, 0, false);
        declareFunction("recursively_standardize_variables", "RECURSIVELY-STANDARDIZE-VARIABLES", 1, 0, false);
        new clausifier.$recursively_standardize_variables$UnaryFunction();
        declareFunction("el_uniquify_standardize", "EL-UNIQUIFY-STANDARDIZE", 1, 0, false);
        declareFunction("el_var_without_quote", "EL-VAR-WITHOUT-QUOTE", 1, 0, false);
        declareFunction("remember_variable_rename", "REMEMBER-VARIABLE-RENAME", 2, 0, false);
        declareFunction("remember_variables_rename", "REMEMBER-VARIABLES-RENAME", 2, 0, false);
        declareFunction("el_uniquify", "EL-UNIQUIFY", 1, 0, false);
        declareFunction("existentials_out", "EXISTENTIALS-OUT", 1, 0, false);
        declareFunction("existentials_out_int", "EXISTENTIALS-OUT-INT", 1, 0, false);
        declareFunction("skolemize_atomic_sentence", "SKOLEMIZE-ATOMIC-SENTENCE", 2, 0, false);
        declareFunction("skolemize_variable", "SKOLEMIZE-VARIABLE", 7, 0, false);
        declareFunction("determine_skolem_var_status", "DETERMINE-SKOLEM-VAR-STATUS", 5, 0, false);
        declareFunction("make_skolem_fn_fn", "MAKE-SKOLEM-FN-FN", 5, 0, false);
        declareFunction("drop_all_existentialsP", "DROP-ALL-EXISTENTIALS?", 0, 0, false);
        declareFunction("leave_skolem_constants_aloneP", "LEAVE-SKOLEM-CONSTANTS-ALONE?", 0, 0, false);
        declareFunction("forbid_quantified_sequence_variablesP", "FORBID-QUANTIFIED-SEQUENCE-VARIABLES?", 0, 0, false);
        declareFunction("universals_out", "UNIVERSALS-OUT", 1, 0, false);
        new clausifier.$universals_out$UnaryFunction();
        declareFunction("disjunctions_in", "DISJUNCTIONS-IN", 1, 0, false);
        declareFunction("disjunctions_in_int", "DISJUNCTIONS-IN-INT", 1, 0, false);
        declareFunction("first_conjunction", "FIRST-CONJUNCTION", 1, 0, false);
        declareFunction("bad_exponential_disjunctionP", "BAD-EXPONENTIAL-DISJUNCTION?", 1, 0, false);
        declareFunction("handle_bad_exponential_disjunction", "HANDLE-BAD-EXPONENTIAL-DISJUNCTION", 1, 0, false);
        declareFunction("bad_exponential_sentenceP", "BAD-EXPONENTIAL-SENTENCE?", 2, 0, false);
        declareFunction("average_arity", "AVERAGE-ARITY", 1, 0, false);
        declareFunction("force_into_cnf", "FORCE-INTO-CNF", 1, 0, false);
        declareFunction("cnf_operators_out", "CNF-OPERATORS-OUT", 1, 0, false);
        declareFunction("package_cnf_clause", "PACKAGE-CNF-CLAUSE", 1, 0, false);
        declareFunction("npackage_cnf_clause", "NPACKAGE-CNF-CLAUSE", 1, 0, false);
        declareFunction("conjunctions_in", "CONJUNCTIONS-IN", 1, 0, false);
        new clausifier.$conjunctions_in$UnaryFunction();
        declareFunction("conjunctions_in_int", "CONJUNCTIONS-IN-INT", 1, 0, false);
        declareFunction("first_disjunction", "FIRST-DISJUNCTION", 1, 0, false);
        declareFunction("bad_exponential_conjunctionP", "BAD-EXPONENTIAL-CONJUNCTION?", 1, 0, false);
        declareFunction("handle_bad_exponential_conjunction", "HANDLE-BAD-EXPONENTIAL-CONJUNCTION", 1, 0, false);
        declareFunction("force_into_dnf", "FORCE-INTO-DNF", 1, 0, false);
        declareFunction("dnf_operators_out", "DNF-OPERATORS-OUT", 1, 0, false);
        declareFunction("package_dnf_clause", "PACKAGE-DNF-CLAUSE", 1, 0, false);
        declareFunction("clausifier_input_sentence", "CLAUSIFIER-INPUT-SENTENCE", 0, 0, false);
        declareFunction("clausifier_input_mt", "CLAUSIFIER-INPUT-MT", 0, 0, false);
        declareFunction("el_xnf", "EL-XNF", 2, 0, false);
        declareFunction("el_xnf_int", "EL-XNF-INT", 2, 0, false);
        declareFunction("package_xnf_clauses", "PACKAGE-XNF-CLAUSES", 1, 0, false);
        declareFunction("package_xnf_clause", "PACKAGE-XNF-CLAUSE", 1, 0, false);
        declareFunction("npackage_xnf_clause", "NPACKAGE-XNF-CLAUSE", 1, 0, false);
        declareFunction("canon_fast_gafP", "CANON-FAST-GAF?", 2, 0, false);
        declareFunction("el_cnf", "EL-CNF", 2, 0, false);
        declareFunction("el_cnf_destructive", "EL-CNF-DESTRUCTIVE", 2, 0, false);
        declareFunction("el_cnf_int", "EL-CNF-INT", 3, 0, false);
        declareFunction("el_dnf", "EL-DNF", 2, 0, false);
        declareFunction("el_dnf_destructive", "EL-DNF-DESTRUCTIVE", 2, 0, false);
        declareFunction("el_dnf_int", "EL-DNF-INT", 3, 0, false);
        declareFunction("leading_universal_variables", "LEADING-UNIVERSAL-VARIABLES", 2, 0, false);
        declareFunction("leading_universal_variables_1", "LEADING-UNIVERSAL-VARIABLES-1", 1, 0, false);
        declareFunction("sort_vars", "SORT-VARS", 1, 0, false);
        declareFunction("distribute_conjunction", "DISTRIBUTE-CONJUNCTION", 2, 1, false);
        declareFunction("clausal_form", "CLAUSAL-FORM", 2, 1, false);
        declareFunction("cnf_clausal_form", "CNF-CLAUSAL-FORM", 2, 0, false);
        declareFunction("clear_cached_cnf_clausal_form", "CLEAR-CACHED-CNF-CLAUSAL-FORM", 0, 0, false);
        declareFunction("remove_cached_cnf_clausal_form", "REMOVE-CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
        declareFunction("cached_cnf_clausal_form_internal", "CACHED-CNF-CLAUSAL-FORM-INTERNAL", 2, 0, false);
        declareFunction("cached_cnf_clausal_form", "CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
        declareFunction("cnf_clausal_form_int", "CNF-CLAUSAL-FORM-INT", 2, 0, false);
        declareFunction("dnf_clausal_form", "DNF-CLAUSAL-FORM", 2, 0, false);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$el_var = makeString("el-var");

    static private final SubLString $str_alt9$_s_is_not_a_quantified_sentence = makeString("~s is not a quantified sentence");

    static private final SubLString $str_alt13$_s_contained_the_invalid_bound__D = makeString("~s contained the invalid bound ~D");

    static private final SubLString $str_alt23$_ = makeString("-");

    static private final SubLString $str_alt29$Unexpected_sentence_type_in_exist = makeString("Unexpected sentence type in existentials-out-int: ~S");

    static private final SubLString $str_alt36$Skolemizer_failed_to_classify_var = makeString("Skolemizer failed to classify variable ~a in sentence ~a~%");

    static private final SubLString $str_alt37$skolem_constants_not_yet_supporte = makeString("skolem constants not yet supported");

    static private final SubLString $str_alt41$make_skolem_fn_fn_doesn_t_know_ho = makeString("make-skolem-fn-fn doesn't know how to handle the quantifier ~S");

    static private final SubLString $str_alt43$Unexpected_value_for__forbid_quan = makeString("Unexpected value for *forbid-quantified-sequence-variables?*: ~s");

    static private final SubLString $str_alt45$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in universals-out.");

    static private final SubLString $str_alt47$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in disjunctions-in.");

    static private final SubLString $str_alt52$_s_is_not_a_conjunction__so_it_is = makeString("~s is not a conjunction, so it is not a CNF sentence.");

    static private final SubLString $str_alt53$_s_is_not_a_disjunction__so__S_is = makeString("~s is not a disjunction, so ~S is not a CNF sentence.");

    static private final SubLString $str_alt55$Got_the_unexpected_formula__S_in_ = makeString("Got the unexpected formula ~S in conjunctions-in.");

    static private final SubLString $str_alt58$_s_is_not_a_disjunction__so_it_is = makeString("~s is not a disjunction, so it is not a DNF sentence.");

    static private final SubLString $str_alt59$_s_is_not_a_conjunction__so__S_is = makeString("~s is not a conjunction, so ~S is not a DNF sentence.");

    public static final SubLSymbol $kw72$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 510 ms
 */
