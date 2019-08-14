/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.ab_litP;
import static com.cyc.cycjava.cycl.el_utilities.ab_lits;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.copy_clause;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.designated_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_bounded_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_exception_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negative_sentences;
import static com.cyc.cycjava.cycl.el_utilities.el_non_atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_positive_sentences;
import static com.cyc.cycjava.cycl.el_utilities.el_pragmatic_requirement_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.el_var_listP;
import static com.cyc.cycjava.cycl.el_utilities.equals_lits;
import static com.cyc.cycjava.cycl.el_utilities.evaluate_lits;
import static com.cyc.cycjava.cycl.el_utilities.formula_quantified_vars;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literalP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.meets_pragmatic_requirement_asents;
import static com.cyc.cycjava.cycl.el_utilities.nadd_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.relation_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.scoping_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.strip_sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.tou_lits;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_ternary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      UNCANONICALIZER
 * source file: /cyc/top/cycl/uncanonicalizer.lisp
 * created:     2019/07/03 17:37:33
 */
public final class uncanonicalizer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new uncanonicalizer();

 public static final String myName = "com.cyc.cycjava.cycl.uncanonicalizer";


    // defparameter
    // Definitions
    @LispMethod(comment = "A dictionary of the variables in the formula being uncanonicalized.  May change as variables are ununiquified.\ndefparameter")
    private static final SubLSymbol $ununiquified_el_vars$ = makeSymbol("*UNUNIQUIFIED-EL-VARS*");

    // defparameter
    /**
     * should the uncanonicalizer cache the el formula it computes for each
     * assertion?
     */
    @LispMethod(comment = "should the uncanonicalizer cache the el formula it computes for each\r\nassertion?\ndefparameter\nshould the uncanonicalizer cache the el formula it computes for each\nassertion?")
    public static final SubLSymbol $cache_el_formulaP$ = makeSymbol("*CACHE-EL-FORMULA?*");

    // deflexical
    // extend this as necessary
    /**
     * extend this as necessary
     */
    @LispMethod(comment = "extend this as necessary\ndeflexical")
    private static final SubLSymbol $potentially_interestingly_uncanonicalizable_tense_terms$ = makeSymbol("*POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERMS*");

    // defparameter
    // variables whose leading universal quantification should be retained?
    /**
     * variables whose leading universal quantification should be retained?
     */
    @LispMethod(comment = "variables whose leading universal quantification should be retained?\ndefparameter")
    private static final SubLSymbol $retain_leading_universals$ = makeSymbol("*RETAIN-LEADING-UNIVERSALS*");

    // defparameter
    // A list of all variables that are universally quantified
    /**
     * A list of all variables that are universally quantified
     */
    @LispMethod(comment = "A list of all variables that are universally quantified\ndefparameter")
    private static final SubLSymbol $vars_to_universalize$ = makeSymbol("*VARS-TO-UNIVERSALIZE*");

    // defparameter
    /**
     * A hash table to store free-variables and the skolem functions that reference
     * them
     */
    @LispMethod(comment = "A hash table to store free-variables and the skolem functions that reference\r\nthem\ndefparameter\nA hash table to store free-variables and the skolem functions that reference\nthem")
    private static final SubLSymbol $universal_vars_to_skolem$ = makeSymbol("*UNIVERSAL-VARS-TO-SKOLEM*");

    // defparameter
    /**
     * max number of conjuncts that will be attempted to put in dnf during
     * uncanonicalization
     */
    @LispMethod(comment = "max number of conjuncts that will be attempted to put in dnf during\r\nuncanonicalization\ndefparameter\nmax number of conjuncts that will be attempted to put in dnf during\nuncanonicalization")
    public static final SubLSymbol $uncanonicalizer_dnf_threshold$ = makeSymbol("*UNCANONICALIZER-DNF-THRESHOLD*");

    // deflexical
    // A list of variables to use for zero-arity skolems
    /**
     * A list of variables to use for zero-arity skolems
     */
    @LispMethod(comment = "A list of variables to use for zero-arity skolems\ndeflexical")
    private static final SubLSymbol $default_skolem_vars$ = makeSymbol("*DEFAULT-SKOLEM-VARS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("CNF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list(list(makeSymbol("*UNUNIQUIFIED-EL-VARS*"), list(makeSymbol("NEW-DICTIONARY"))));

    private static final SubLSymbol CLAUSE_VARIABLES = makeSymbol("CLAUSE-VARIABLES");

    static private final SubLList $list6 = list(list(makeSymbol("REMEMBER-UNUNIQUIFIED-EL-VAR"), makeSymbol("VAR"), makeSymbol("VAR")));

    private static final SubLSymbol ASSERTION_EL_FORMULA_MEMOIZED = makeSymbol("ASSERTION-EL-FORMULA-MEMOIZED");

    private static final SubLSymbol SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");

    private static final SubLSymbol ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");

    private static final SubLList $list12 = list(makeSymbol("ASSERTION"));

    private static final SubLString $str13$Return_the_EL_formula_for_ASSERTI = makeString("Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.");

    private static final SubLList $list14 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));

    static private final SubLList $list15 = list(makeSymbol("LISTP"));

    private static final SubLSymbol ASSERTION_EL_IST_FORMULA = makeSymbol("ASSERTION-EL-IST-FORMULA");

    private static final SubLString $str17$Return_the_el_formula_in___ist_fo = makeString("Return the el formula in #$ist format for ASSERTION.");

    private static final SubLList $list18 = list(makeSymbol("CONSP"));

    private static final SubLSymbol $sym19$FAST_FI_NOT_EL_TERM_ = makeSymbol("FAST-FI-NOT-EL-TERM?");

    private static final SubLSymbol $sym20$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");

    private static final SubLSymbol $sym21$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_ = makeSymbol("POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?");

    private static final SubLSymbol $sym22$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol("QUOTED-TERM-WITH-HL-VAR?");











    private static final SubLList $list28 = list(reader_make_constant_shell("IntervalEndedByFn"), reader_make_constant_shell("IntervalStartedByFn"));

    private static final SubLSymbol CACHED_ASSERTION_EL_FORMULA_INT = makeSymbol("CACHED-ASSERTION-EL-FORMULA-INT");

    private static final SubLSymbol $cached_assertion_el_formula_int_caching_state$ = makeSymbol("*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLInteger $int$1024 = makeInteger(1024);

    static private final SubLList $list34 = list(makeKeyword("TREE-FIND"), list(reader_make_constant_shell("UncanonicalizerAssertionFn"), list(reader_make_constant_shell("SubLQuoteFn"), list($BIND, makeSymbol("EL-FORMULA")))));





    private static final SubLSymbol INDEX_LITS_TO_REMOVE = makeSymbol("INDEX-LITS-TO-REMOVE");

    private static final SubLSymbol DNF_LITERALS = makeSymbol("DNF-LITERALS");

    private static final SubLSymbol CLAUSE_FROM_EL_LITERALS = makeSymbol("CLAUSE-FROM-EL-LITERALS");

    private static final SubLSymbol CNF_LITERALS = makeSymbol("CNF-LITERALS");



    static private final SubLList $list43 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLList $list44 = list(makeSymbol("PRAG-PRED"), makeSymbol("VAR-LIST"), makeSymbol("ASSERTION"));

    private static final SubLSymbol NEGATE = makeSymbol("NEGATE");









    static private final SubLList $list50 = list(makeSymbol("AB-PRED"), makeSymbol("EXCEPTION-LIST"), makeSymbol("ASSERTION"));

    static private final SubLSymbol $sym51$CYC_VAR_ = makeSymbol("CYC-VAR?");







    private static final SubLSymbol NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");

    private static final SubLSymbol REMOVE_TRUESENTENCE_REFS = makeSymbol("REMOVE-TRUESENTENCE-REFS");

    static private final SubLList $list58 = list(makeSymbol("QUANTIFIER"), makeSymbol("VAR"), makeSymbol("SUBSENT"));

    static private final SubLList $list59 = list(makeSymbol("QUANTIFIER"), makeSymbol("N"), makeSymbol("VAR"), makeSymbol("SUBSENT"));

    static private final SubLList $list60 = list(makeSymbol("NEG-FORM"), makeSymbol("NEW-FORMULA"));

    static private final SubLString $str61$unanticipated_formula___s = makeString("unanticipated formula: ~s");

    private static final SubLSymbol TRUE_SENTENCE_VARS = makeSymbol("TRUE-SENTENCE-VARS");

    private static final SubLSymbol UNDO_VARIABLES = makeSymbol("UNDO-VARIABLES");

    static private final SubLString $str64$_S_is_not_well_formed_ = makeString("~S is not well formed.");



    private static final SubLSymbol UNREMOVE_UNIVERSALS_INT = makeSymbol("UNREMOVE-UNIVERSALS-INT");



    static private final SubLSymbol $sym68$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");

    private static final SubLSymbol UNDO_EXISTENTIALS_AND_REFD_UNIVERSALS = makeSymbol("UNDO-EXISTENTIALS-AND-REFD-UNIVERSALS");

















    static private final SubLList $list78 = list(makeSymbol("UNIT"), makeSymbol("MIN"), makeSymbol("MAX"));





    private static final SubLSymbol UNDO_IMPLICATIONS = makeSymbol("UNDO-IMPLICATIONS");

    private static final SubLSymbol UNCANON_DNF_1 = makeSymbol("UNCANON-DNF-1");

    static private final SubLString $str83$_s_is_not_well_formed_ = makeString("~s is not well formed.");

    private static final SubLSymbol IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");

    static private final SubLSymbol $sym85$SIMPLIFIABLE_IST_EXPRESSION_ = makeSymbol("SIMPLIFIABLE-IST-EXPRESSION?");

    private static final SubLSymbol SIMPLIFY_IST_EXPRESSION = makeSymbol("SIMPLIFY-IST-EXPRESSION");

    static private final SubLString $str88$unable_to_simplify___ist_expressi = makeString("unable to simplify #$ist expression ~s");

    private static final SubLSymbol REMOVE_LEADING_UNIVERSALS = makeSymbol("REMOVE-LEADING-UNIVERSALS");

    private static final SubLSymbol SKOLEM_FUNCTION_VAR = makeSymbol("SKOLEM-FUNCTION-VAR");

    static private final SubLSymbol $sym91$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol SKOLEM_NUMBER = makeSymbol("SKOLEM-NUMBER");

    static private final SubLSymbol $sym93$_ = makeSymbol(">");

    private static final SubLSymbol NUM_ARGS_OF_SKOLEM_FN = makeSymbol("NUM-ARGS-OF-SKOLEM-FN");

    private static final SubLSymbol TERM_OF_UNIT = makeSymbol("TERM-OF-UNIT");

    static private final SubLSymbol $sym96$SKOLEM_CONSTANT_ = makeSymbol("SKOLEM-CONSTANT?");

    static private final SubLSymbol $sym98$REIFIED_SKOLEM_CONSTANT_TERM_ = makeSymbol("REIFIED-SKOLEM-CONSTANT-TERM?");

    static private final SubLSymbol $sym100$KB_ASSERTION_ = makeSymbol("KB-ASSERTION?");

    private static final SubLSymbol WRAPPED_ASSERTION_EL_FORMULA_WRT_MT = makeSymbol("WRAPPED-ASSERTION-EL-FORMULA-WRT-MT");

    static private final SubLSymbol $sym102$OPAQUE_ARG_WRT_SKOLEM_ = makeSymbol("OPAQUE-ARG-WRT-SKOLEM?");

    static private final SubLList $list103 = list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"), makeSymbol("?A"), makeSymbol("?B"), makeSymbol("?C"), makeSymbol("?D"), makeSymbol("?E"));

    private static final SubLSymbol VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");

    private static final SubLSymbol NOT_DIGIT_CHAR_P = makeSymbol("NOT-DIGIT-CHAR-P");

    private static final SubLSymbol NAT_FUNCTOR = makeSymbol("NAT-FUNCTOR");

    private static final SubLSymbol $sym109$REMOVABLE_TOU_LIT_ = makeSymbol("REMOVABLE-TOU-LIT?");

    private static final SubLSymbol LITERAL_ARG1 = makeSymbol("LITERAL-ARG1");

    private static final SubLSymbol DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");

    public static final SubLObject remembering_ununiquified_el_vars_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cnf = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            cnf = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt2, listS(CDOLIST, list(VAR, list(CLAUSE_VARIABLES, cnf)), $list_alt6), append(body, NIL));
            }
        }
    }

    public static SubLObject remembering_ununiquified_el_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cnf = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        cnf = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list2, listS(CDOLIST, list(VAR, list(CLAUSE_VARIABLES, cnf)), $list6), append(body, NIL));
    }

    public static final SubLObject assertion_el_formula_memoized_internal_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula(assertion);
    }

    public static SubLObject assertion_el_formula_memoized_internal(final SubLObject assertion) {
        return assertion_el_formula(assertion);
    }

    public static final SubLObject assertion_el_formula_memoized_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula_memoized_internal(assertion);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ASSERTION_EL_FORMULA_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ASSERTION_EL_FORMULA_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ASSERTION_EL_FORMULA_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, $kw8$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula_memoized_internal(assertion)));
                        memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject assertion_el_formula_memoized(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return assertion_el_formula_memoized_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ASSERTION_EL_FORMULA_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ASSERTION_EL_FORMULA_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ASSERTION_EL_FORMULA_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(assertion_el_formula_memoized_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.
     */
    @LispMethod(comment = "Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.")
    public static final SubLObject assertion_el_formula_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject formula = assertions_high.assertion_formula(assertion);
                SubLObject mt = NIL;
                SubLObject result = NIL;
                SubLObject error_message = NIL;
                if (NIL != skolems.skolem_defining_assertionP(assertion)) {
                    {
                        SubLObject skolem = cycl_utilities.expression_find_if(SKOLEM_FUNCTION_P, cons(formula, mt), T, UNPROVIDED);
                        SubLObject skolem_defn_assertions = skolems.skolem_defn_assertions(skolems.skolem_canonical_sibling(skolem), UNPROVIDED);
                        if (NIL != skolem_defn_assertions) {
                            assertion = skolem_defn_assertions.first();
                        }
                    }
                }
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (NIL != com.cyc.cycjava.cycl.uncanonicalizer.interesting_uncanonicalizationsP(assertion)) {
                                    if (NIL == $cache_el_formulaP$.getDynamicValue(thread)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject result_1 = com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula_int(assertion);
                                            SubLObject mt_2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            result = result_1;
                                            mt = mt_2;
                                        }
                                    } else {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject result_3 = com.cyc.cycjava.cycl.uncanonicalizer.cached_assertion_el_formula_int(assertion);
                                            SubLObject mt_4 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            result = result_3;
                                            mt = mt_4;
                                        }
                                    }
                                } else {
                                    result = fi.perform_fi_substitutions(copy_tree(formula), assertions_high.assertion_el_variables(assertion));
                                    mt = assertions_high.assertion_mt(assertion);
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    result = fi.perform_fi_substitutions(copy_tree(formula), assertions_high.assertion_el_variables(assertion));
                }
                mt = cycl_utilities.hl_to_el(mt);
                return values(result, mt);
            }
        }
    }

    /**
     * Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.
     */
    @LispMethod(comment = "Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.")
    public static SubLObject assertion_el_formula(SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        final SubLObject formula = assertions_high.assertion_formula(assertion);
        SubLObject mt = NIL;
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        if (NIL != skolems.skolem_defining_assertionP(assertion)) {
            final SubLObject skolem = cycl_utilities.expression_find_if(SKOLEM_FUNCTION_P, cons(formula, mt), T, UNPROVIDED);
            final SubLObject skolem_defn_assertions = skolems.skolem_defn_assertions(skolems.skolem_canonical_sibling(skolem), UNPROVIDED);
            if (NIL != skolem_defn_assertions) {
                assertion = skolem_defn_assertions.first();
            }
        }
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != interesting_uncanonicalizationsP(assertion)) {
                        if (NIL == $cache_el_formulaP$.getDynamicValue(thread)) {
                            thread.resetMultipleValues();
                            final SubLObject result_$1 = assertion_el_formula_int(assertion);
                            final SubLObject mt_$2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_$1;
                            mt = mt_$2;
                        } else {
                            thread.resetMultipleValues();
                            final SubLObject result_$2 = cached_assertion_el_formula_int(assertion);
                            final SubLObject mt_$3 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_$2;
                            mt = mt_$3;
                        }
                    } else {
                        result = fi.perform_fi_substitutions(copy_tree(formula), assertions_high.assertion_el_variables(assertion));
                        mt = assertions_high.assertion_mt(assertion);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            result = fi.perform_fi_substitutions(copy_tree(formula), assertions_high.assertion_el_variables(assertion));
        }
        mt = cycl_utilities.hl_to_el(mt);
        return values(result, mt);
    }

    /**
     * Return the el formula for the mt of ASSERTION.
     */
    @LispMethod(comment = "Return the el formula for the mt of ASSERTION.")
    public static final SubLObject assertion_elmt_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            thread.resetMultipleValues();
            {
                SubLObject el_formula = com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula(assertion);
                SubLObject elmt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return elmt;
            }
        }
    }

    /**
     * Return the el formula for the mt of ASSERTION.
     */
    @LispMethod(comment = "Return the el formula for the mt of ASSERTION.")
    public static SubLObject assertion_elmt(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        thread.resetMultipleValues();
        final SubLObject el_formula = assertion_el_formula(assertion);
        final SubLObject elmt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return elmt;
    }

    /**
     * Return the el formula in #$ist format for ASSERTION.
     */
    @LispMethod(comment = "Return the el formula in #$ist format for ASSERTION.")
    public static final SubLObject assertion_el_ist_formula_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            thread.resetMultipleValues();
            {
                SubLObject el_formula = com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula(assertion);
                SubLObject elmt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return make_ist_sentence(elmt, el_formula);
            }
        }
    }

    /**
     * Return the el formula in #$ist format for ASSERTION.
     */
    @LispMethod(comment = "Return the el formula in #$ist format for ASSERTION.")
    public static SubLObject assertion_el_ist_formula(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        thread.resetMultipleValues();
        final SubLObject el_formula = assertion_el_formula(assertion);
        final SubLObject elmt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return make_ist_sentence(elmt, el_formula);
    }

    public static final SubLObject interesting_uncanonicalizationsP_alt(SubLObject assertion) {
        {
            SubLObject sentence = assertions_high.assertion_formula(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            return makeBoolean((((NIL != cycl_utilities.expression_find_if($sym20$FAST_FI_NOT_EL_TERM_, sentence, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if($sym21$FAST_REIFIED_SKOLEM_, mt, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.expression_find_if($sym22$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_, mt, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.expression_find_if($sym23$QUOTED_TERM_WITH_HL_VAR_, sentence, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject interesting_uncanonicalizationsP(final SubLObject assertion) {
        final SubLObject sentence = assertions_high.assertion_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return makeBoolean((((NIL != cycl_utilities.expression_find_if($sym19$FAST_FI_NOT_EL_TERM_, sentence, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if($sym20$FAST_REIFIED_SKOLEM_, mt, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.expression_find_if($sym21$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_, mt, UNPROVIDED, UNPROVIDED))) || (NIL != cycl_utilities.expression_find_if($sym22$QUOTED_TERM_WITH_HL_VAR_, sentence, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject fast_fi_not_el_termP_alt(SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return makeBoolean(((((v_object.eql($$termOfUnit) || v_object.eql($$evaluate)) || v_object.eql($$equals)) || v_object.eql($$SkolemFunctionFn)) || v_object.eql($$trueSentence)) || (NIL != term.fast_reified_skolemP(v_object)));
        } else {
            if (NIL != term.kb_assertionP(v_object)) {
                return T;
            } else {
                if (NIL != cycl_variables.el_varP(v_object)) {
                    return makeBoolean(!v_object.eql(com.cyc.cycjava.cycl.uncanonicalizer.ununiquify_el_var(v_object)));
                }
            }
        }
        return NIL;
    }

    public static SubLObject fast_fi_not_el_termP(final SubLObject v_object) {
        if (NIL != forts.fort_p(v_object)) {
            return makeBoolean(((((v_object.eql($$termOfUnit) || v_object.eql($$evaluate)) || v_object.eql($$equals)) || v_object.eql($$SkolemFunctionFn)) || v_object.eql($$trueSentence)) || (NIL != term.fast_reified_skolemP(v_object)));
        }
        if (NIL != term.kb_assertionP(v_object)) {
            return T;
        }
        if (NIL != cycl_variables.el_varP(v_object)) {
            return makeBoolean(!v_object.eql(ununiquify_el_var(v_object)));
        }
        return NIL;
    }

    public static final SubLObject potentially_interestingly_uncanonicalizable_tense_termP_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != subl_promotions.memberP(v_object, $potentially_interestingly_uncanonicalizable_tense_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject potentially_interestingly_uncanonicalizable_tense_termP(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != subl_promotions.memberP(v_object, $potentially_interestingly_uncanonicalizable_tense_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject clear_cached_assertion_el_formula_int_alt() {
        {
            SubLObject cs = $cached_assertion_el_formula_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_assertion_el_formula_int() {
        final SubLObject cs = $cached_assertion_el_formula_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_assertion_el_formula_int_alt(SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_assertion_el_formula_int_caching_state$.getGlobalValue(), list(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_assertion_el_formula_int(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_assertion_el_formula_int_caching_state$.getGlobalValue(), list(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_assertion_el_formula_int_internal_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula_int(assertion);
    }

    public static SubLObject cached_assertion_el_formula_int_internal(final SubLObject assertion) {
        return assertion_el_formula_int(assertion);
    }

    public static final SubLObject cached_assertion_el_formula_int_alt(SubLObject assertion) {
        {
            SubLObject caching_state = $cached_assertion_el_formula_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ASSERTION_EL_FORMULA_INT, $cached_assertion_el_formula_int_caching_state$, NIL, EQL, ONE_INTEGER, $int$1024);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, $kw8$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw8$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.uncanonicalizer.cached_assertion_el_formula_int_internal(assertion)));
                    memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_assertion_el_formula_int(final SubLObject assertion) {
        SubLObject caching_state = $cached_assertion_el_formula_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_ASSERTION_EL_FORMULA_INT, $cached_assertion_el_formula_int_caching_state$, $int$2048, EQL, ONE_INTEGER, $int$1024);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_assertion_el_formula_int_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Return the Epistemological Level formula for ASSERTION.
     */
    @LispMethod(comment = "Return the Epistemological Level formula for ASSERTION.")
    public static final SubLObject assertion_el_formula_int_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == wff_vars.$within_wffP$.getDynamicValue(thread)) {
                wff.reset_wff_state();
            }
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                SubLObject el_formula = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        {
                            SubLObject symbols = assertions_high.assertion_el_variables(assertion);
                            SubLObject el_cnf = com.cyc.cycjava.cycl.uncanonicalizer.nsubst_hl_vars(copy_clause(assertions_high.assertion_cnf(assertion)), symbols);
                            SubLObject truth = assertions_high.assertion_truth(assertion);
                            {
                                SubLObject _prev_bind_0_5 = $ununiquified_el_vars$.currentBinding(thread);
                                try {
                                    $ununiquified_el_vars$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                                    {
                                        SubLObject cdolist_list_var = clause_utilities.clause_variables(el_cnf, UNPROVIDED);
                                        SubLObject var = NIL;
                                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                            com.cyc.cycjava.cycl.uncanonicalizer.remember_ununiquified_el_var(var, var);
                                        }
                                        {
                                            SubLObject cnf = com.cyc.cycjava.cycl.uncanonicalizer.el_explicitify_implicit_meta_literals(el_cnf);
                                            SubLObject index_lits = com.cyc.cycjava.cycl.uncanonicalizer.index_lits_to_remove(cnf);
                                            SubLObject pos_lits = (truth == $FALSE) ? ((SubLObject) (NIL)) : set_difference(clauses.pos_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                                            SubLObject neg_lits = (truth == $FALSE) ? ((SubLObject) (set_difference(clauses.pos_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED))) : set_difference(clauses.neg_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                                            SubLObject el_implication = NIL;
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject el_cnfs = com.cyc.cycjava.cycl.uncanonicalizer.el_cnfs(list(clauses.make_cnf(neg_lits, pos_lits)), index_lits, mt);
                                                SubLObject el_mt = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                el_cnfs = czer_main.canonicalize_clauses_commutative_terms_destructive(czer_main.sort_clauses(el_cnfs));
                                                el_cnfs = com.cyc.cycjava.cycl.uncanonicalizer.unwrap_el_formulas_of_assertions_destructive(el_cnfs);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject el_implication_6 = com.cyc.cycjava.cycl.uncanonicalizer.el_cnfs_to_el_implication(el_cnfs, el_mt);
                                                    SubLObject el_mt_7 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    el_implication = el_implication_6;
                                                    el_mt = el_mt_7;
                                                }
                                                el_formula = com.cyc.cycjava.cycl.uncanonicalizer.undo_variables(el_implication);
                                                mt = el_mt;
                                            }
                                        }
                                    }
                                } finally {
                                    $ununiquified_el_vars$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        }
                    } finally {
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(el_formula, mt);
            }
        }
    }

    /**
     * Return the Epistemological Level formula for ASSERTION.
     */
    @LispMethod(comment = "Return the Epistemological Level formula for ASSERTION.")
    public static SubLObject assertion_el_formula_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == wff_vars.$within_wffP$.getDynamicValue(thread)) {
            wff.reset_wff_state();
        }
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject el_formula = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            final SubLObject symbols = assertions_high.assertion_el_variables(assertion);
            final SubLObject el_cnf = nsubst_hl_vars(copy_clause(assertions_high.assertion_cnf(assertion)), symbols);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject _prev_bind_0_$5 = $ununiquified_el_vars$.currentBinding(thread);
            try {
                $ununiquified_el_vars$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                SubLObject cdolist_list_var = clause_utilities.clause_variables(el_cnf, UNPROVIDED);
                SubLObject var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    remember_ununiquified_el_var(var, var);
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                } 
                final SubLObject cnf = el_explicitify_implicit_meta_literals(el_cnf);
                final SubLObject index_lits = index_lits_to_remove(cnf);
                final SubLObject pos_lits = (truth == $FALSE) ? NIL : set_difference(clauses.pos_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                final SubLObject neg_lits = (truth == $FALSE) ? set_difference(clauses.pos_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED) : set_difference(clauses.neg_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                SubLObject el_implication = NIL;
                thread.resetMultipleValues();
                SubLObject el_cnfs = el_cnfs(list(clauses.make_cnf(neg_lits, pos_lits)), index_lits, mt);
                SubLObject el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                el_cnfs = czer_main.canonicalize_clauses_commutative_terms_destructive(czer_main.sort_clauses(el_cnfs));
                el_cnfs = unwrap_el_formulas_of_assertions_destructive(el_cnfs);
                thread.resetMultipleValues();
                final SubLObject el_implication_$6 = el_cnfs_to_el_implication(el_cnfs, el_mt);
                final SubLObject el_mt_$7 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                el_implication = el_implication_$6;
                el_mt = el_mt_$7;
                el_formula = undo_variables(el_implication);
                mt = el_mt;
            } finally {
                $ununiquified_el_vars$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(el_formula, mt);
    }

    public static final SubLObject unwrap_el_formulas_of_assertions_destructive_alt(SubLObject el_cnfs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt34;
                SubLObject last_el_cnfs = NIL;
                SubLObject pattern_result = NIL;
                while (!el_cnfs.equal(last_el_cnfs)) {
                    last_el_cnfs = el_cnfs;
                    thread.resetMultipleValues();
                    {
                        SubLObject success = formula_pattern_match.formula_matches_pattern(el_cnfs, pattern);
                        SubLObject v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != success) {
                            {
                                SubLObject el_formula = list_utilities.alist_lookup_without_values(v_bindings, EL_FORMULA, UNPROVIDED, UNPROVIDED);
                                pattern_result = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, el_formula));
                                el_cnfs = cycl_utilities.expression_subst(el_formula, pattern_result, el_cnfs, symbol_function(EQUAL), UNPROVIDED);
                            }
                        }
                    }
                } 
            }
            return el_cnfs;
        }
    }

    public static SubLObject unwrap_el_formulas_of_assertions_destructive(SubLObject el_cnfs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list34;
        // TODO see what shis should be
        SubLObject el_formula = NIL;
        // 
        // 
        // 
        for (SubLObject last_el_cnfs = NIL, // 
        pattern_result = NIL; !el_cnfs.equal(last_el_cnfs); el_cnfs = cycl_utilities.expression_subst(el_formula, pattern_result, el_cnfs, symbol_function(EQUAL), UNPROVIDED)) {
            // 
            last_el_cnfs = el_cnfs;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(el_cnfs, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                el_formula = list_utilities.alist_lookup_without_values(v_bindings, EL_FORMULA, UNPROVIDED, UNPROVIDED);
                pattern_result = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, el_formula));
            }
        }
        return el_cnfs;
    }

    /**
     * Return the Epistemological Level formula for ASSERTION.
     */
    @LispMethod(comment = "Return the Epistemological Level formula for ASSERTION.")
    public static final SubLObject new_assertion_el_formula_int_alt(SubLObject assertion) {
        wff.reset_wff_state();
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject symbols = assertions_high.assertion_el_variables(assertion);
            SubLObject el_formula = com.cyc.cycjava.cycl.uncanonicalizer.cnf_el_formula(cnf, mt, symbols);
            return values(el_formula, mt);
        }
    }

    /**
     * Return the Epistemological Level formula for ASSERTION.
     */
    @LispMethod(comment = "Return the Epistemological Level formula for ASSERTION.")
    public static SubLObject new_assertion_el_formula_int(final SubLObject assertion) {
        wff.reset_wff_state();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject symbols = assertions_high.assertion_el_variables(assertion);
        final SubLObject el_formula = cnf_el_formula(cnf, mt, symbols);
        return values(el_formula, mt);
    }

    public static final SubLObject cnf_el_formula_alt(SubLObject cnf, SubLObject mt, SubLObject symbols) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_formula = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $vars_to_universalize$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        $vars_to_universalize$.bind($retain_leading_universals$.getDynamicValue(thread), thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        {
                            SubLObject cnf_0 = copy_tree(cnf);
                            SubLObject cnf_1 = com.cyc.cycjava.cycl.uncanonicalizer.nsubst_hl_vars(cnf_0, symbols);
                            SubLObject cnf_2 = com.cyc.cycjava.cycl.uncanonicalizer.el_explicitify_implicit_meta_literals(cnf_1);
                            SubLObject index_lits = com.cyc.cycjava.cycl.uncanonicalizer.index_lits_to_remove(cnf_2);
                            SubLObject pos_lits = set_difference(clauses.pos_lits(cnf_2), index_lits, symbol_function(EQUAL), UNPROVIDED);
                            SubLObject neg_lits = set_difference(clauses.neg_lits(cnf_2), index_lits, symbol_function(EQUAL), UNPROVIDED);
                            SubLObject cnfs = list(clauses.make_cnf(neg_lits, pos_lits));
                            SubLObject el_cnfs = com.cyc.cycjava.cycl.uncanonicalizer.unwrap_el_formulas_of_assertions_destructive(czer_main.canonicalize_clauses_commutative_terms_destructive(czer_main.sort_clauses(com.cyc.cycjava.cycl.uncanonicalizer.el_cnfs(cnfs, index_lits, UNPROVIDED))));
                            SubLObject el_implication = com.cyc.cycjava.cycl.uncanonicalizer.el_cnfs_to_el_implication(el_cnfs, mt);
                            el_formula = com.cyc.cycjava.cycl.uncanonicalizer.undo_variables(el_implication);
                        }
                    } finally {
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_3, thread);
                        $vars_to_universalize$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return el_formula;
            }
        }
    }

    public static SubLObject cnf_el_formula(final SubLObject cnf, SubLObject mt, SubLObject symbols) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_formula = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $vars_to_universalize$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$simplify_literalP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            $vars_to_universalize$.bind($retain_leading_universals$.getDynamicValue(thread), thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            final SubLObject cnf_0 = copy_tree(cnf);
            final SubLObject cnf_2 = nsubst_hl_vars(cnf_0, symbols);
            final SubLObject cnf_3 = el_explicitify_implicit_meta_literals(cnf_2);
            final SubLObject index_lits = index_lits_to_remove(cnf_3);
            final SubLObject pos_lits = set_difference(clauses.pos_lits(cnf_3), index_lits, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject neg_lits = set_difference(clauses.neg_lits(cnf_3), index_lits, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject cnfs = list(clauses.make_cnf(neg_lits, pos_lits));
            final SubLObject el_cnfs = unwrap_el_formulas_of_assertions_destructive(czer_main.canonicalize_clauses_commutative_terms_destructive(czer_main.sort_clauses(el_cnfs(cnfs, index_lits, UNPROVIDED))));
            final SubLObject el_implication = el_cnfs_to_el_implication(el_cnfs, mt);
            el_formula = undo_variables(el_implication);
        } finally {
            czer_vars.$simplify_literalP$.rebind(_prev_bind_4, thread);
            $vars_to_universalize$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return el_formula;
    }

    public static final SubLObject cnfs_el_formula_alt(SubLObject hl_cnfs, SubLObject mt, SubLObject symbols) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_formula = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $vars_to_universalize$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        $vars_to_universalize$.bind($retain_leading_universals$.getDynamicValue(thread), thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        {
                            SubLObject cnfs_0 = copy_tree(hl_cnfs);
                            SubLObject cnfs_1 = com.cyc.cycjava.cycl.uncanonicalizer.nsubst_hl_vars(cnfs_0, symbols);
                            SubLObject cnfs_2 = com.cyc.cycjava.cycl.uncanonicalizer.el_explicitify_implicit_meta_literals(cnfs_1);
                            SubLObject index_lits = list_utilities.fast_delete_duplicates(list_utilities.mapappend(INDEX_LITS_TO_REMOVE, cnfs_2), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cnfs = com.cyc.cycjava.cycl.uncanonicalizer.remove_index_lits_from_cnfs(index_lits, cnfs_2);
                            SubLObject el_cnfs = com.cyc.cycjava.cycl.uncanonicalizer.unwrap_el_formulas_of_assertions_destructive(czer_main.canonicalize_clauses_commutative_terms_destructive(czer_main.sort_clauses(com.cyc.cycjava.cycl.uncanonicalizer.el_cnfs(cnfs, index_lits, UNPROVIDED))));
                            SubLObject el_implication = com.cyc.cycjava.cycl.uncanonicalizer.el_cnfs_to_el_implication(el_cnfs, mt);
                            el_formula = com.cyc.cycjava.cycl.uncanonicalizer.undo_variables(el_implication);
                        }
                    } finally {
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_3, thread);
                        $vars_to_universalize$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return el_formula;
            }
        }
    }

    public static SubLObject cnfs_el_formula(final SubLObject hl_cnfs, SubLObject mt, SubLObject symbols) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_formula = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $vars_to_universalize$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$simplify_literalP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            $vars_to_universalize$.bind($retain_leading_universals$.getDynamicValue(thread), thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            final SubLObject cnfs_0 = copy_tree(hl_cnfs);
            final SubLObject cnfs_2 = nsubst_hl_vars(cnfs_0, symbols);
            final SubLObject cnfs_3 = el_explicitify_implicit_meta_literals(cnfs_2);
            final SubLObject index_lits = list_utilities.fast_delete_duplicates(list_utilities.mapappend(INDEX_LITS_TO_REMOVE, cnfs_3), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject cnfs = remove_index_lits_from_cnfs(index_lits, cnfs_3);
            final SubLObject el_cnfs = unwrap_el_formulas_of_assertions_destructive(czer_main.canonicalize_clauses_commutative_terms_destructive(czer_main.sort_clauses(el_cnfs(cnfs, index_lits, UNPROVIDED))));
            final SubLObject el_implication = el_cnfs_to_el_implication(el_cnfs, mt);
            el_formula = undo_variables(el_implication);
        } finally {
            czer_vars.$simplify_literalP$.rebind(_prev_bind_4, thread);
            $vars_to_universalize$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return el_formula;
    }

    /**
     * ((A B) (C D)) -> (or (and A B) (and C D))
     * -> (and (or A C) (or A D) (or B C) (or B D))
     * -> ((A C) (A D) (B C) (B D))
     *
     * ((A B C) (D E F) (G H I)) -> (or (and A B C) (and D E F) (and (G H I)))
     * -> ...
     * -> ((A D G) (A D H) (A D I) (A E G) (A E H) (A E I) (A F G) (A F H) (A F I)
     * (B D G) (B D H) (B D I) (B E G) (B E H) (B E I) (B F G) (B F H) (B F I)
     * (C D G) (C D H) (C D I) (C E G) (C E H) (C E I) (C F G) (C F H) (C F I))
     */
    @LispMethod(comment = "((A B) (C D)) -> (or (and A B) (and C D))\r\n-> (and (or A C) (or A D) (or B C) (or B D))\r\n-> ((A C) (A D) (B C) (B D))\r\n\r\n((A B C) (D E F) (G H I)) -> (or (and A B C) (and D E F) (and (G H I)))\r\n-> ...\r\n-> ((A D G) (A D H) (A D I) (A E G) (A E H) (A E I) (A F G) (A F H) (A F I)\r\n(B D G) (B D H) (B D I) (B E G) (B E H) (B E I) (B F G) (B F H) (B F I)\r\n(C D G) (C D H) (C D I) (C E G) (C E H) (C E I) (C F G) (C F H) (C F I))\n((A B) (C D)) -> (or (and A B) (and C D))\n-> (and (or A C) (or A D) (or B C) (or B D))\n-> ((A C) (A D) (B C) (B D))\n\n((A B C) (D E F) (G H I)) -> (or (and A B C) (and D E F) (and (G H I)))\n-> ...\n-> ((A D G) (A D H) (A D I) (A E G) (A E H) (A E I) (A F G) (A F H) (A F I)\n(B D G) (B D H) (B D I) (B E G) (B E H) (B E I) (B F G) (B F H) (B F I)\n(C D G) (C D H) (C D I) (C E G) (C E H) (C E I) (C F G) (C F H) (C F I))")
    public static final SubLObject hl_dnfs_to_hl_cnfs_alt(SubLObject hl_dnfs) {
        {
            SubLObject hl_dnfs_with_explicit_literals = Mapping.mapcar(DNF_LITERALS, hl_dnfs);
            SubLObject hl_cnfs_with_explicit_literals = list_utilities.cartesian_product(hl_dnfs_with_explicit_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject hl_cnfs = Mapping.mapcar(CLAUSE_FROM_EL_LITERALS, hl_cnfs_with_explicit_literals);
            return hl_cnfs;
        }
    }

    /**
     * ((A B) (C D)) -> (or (and A B) (and C D))
     * -> (and (or A C) (or A D) (or B C) (or B D))
     * -> ((A C) (A D) (B C) (B D))
     *
     * ((A B C) (D E F) (G H I)) -> (or (and A B C) (and D E F) (and (G H I)))
     * -> ...
     * -> ((A D G) (A D H) (A D I) (A E G) (A E H) (A E I) (A F G) (A F H) (A F I)
     * (B D G) (B D H) (B D I) (B E G) (B E H) (B E I) (B F G) (B F H) (B F I)
     * (C D G) (C D H) (C D I) (C E G) (C E H) (C E I) (C F G) (C F H) (C F I))
     */
    @LispMethod(comment = "((A B) (C D)) -> (or (and A B) (and C D))\r\n-> (and (or A C) (or A D) (or B C) (or B D))\r\n-> ((A C) (A D) (B C) (B D))\r\n\r\n((A B C) (D E F) (G H I)) -> (or (and A B C) (and D E F) (and (G H I)))\r\n-> ...\r\n-> ((A D G) (A D H) (A D I) (A E G) (A E H) (A E I) (A F G) (A F H) (A F I)\r\n(B D G) (B D H) (B D I) (B E G) (B E H) (B E I) (B F G) (B F H) (B F I)\r\n(C D G) (C D H) (C D I) (C E G) (C E H) (C E I) (C F G) (C F H) (C F I))\n((A B) (C D)) -> (or (and A B) (and C D))\n-> (and (or A C) (or A D) (or B C) (or B D))\n-> ((A C) (A D) (B C) (B D))\n\n((A B C) (D E F) (G H I)) -> (or (and A B C) (and D E F) (and (G H I)))\n-> ...\n-> ((A D G) (A D H) (A D I) (A E G) (A E H) (A E I) (A F G) (A F H) (A F I)\n(B D G) (B D H) (B D I) (B E G) (B E H) (B E I) (B F G) (B F H) (B F I)\n(C D G) (C D H) (C D I) (C E G) (C E H) (C E I) (C F G) (C F H) (C F I))")
    public static SubLObject hl_dnfs_to_hl_cnfs(final SubLObject hl_dnfs) {
        final SubLObject hl_dnfs_with_explicit_literals = Mapping.mapcar(DNF_LITERALS, hl_dnfs);
        final SubLObject hl_cnfs_with_explicit_literals = list_utilities.cartesian_product(hl_dnfs_with_explicit_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject hl_cnfs = Mapping.mapcar(CLAUSE_FROM_EL_LITERALS, hl_cnfs_with_explicit_literals);
        return hl_cnfs;
    }

    /**
     * ((A C) (A D) (B C) (B D)) -> (and (or A C) (or A D) (or B C) (or B D))
     * -> (or (and A A B B) (and A A B D) (and A A C B) (and A A C D)
     * (and A D B B) (and A D B D) (and A D C B) (and A D C D)
     * (and C A B B) (and C A B D) (and C A C B) (and C A C D)
     * (and C D B B) (and C D B D) (and C D C B) (and C D C D))
     *
     * @unknown -> (or (and A B) (and C D))
     */
    @LispMethod(comment = "((A C) (A D) (B C) (B D)) -> (and (or A C) (or A D) (or B C) (or B D))\r\n-> (or (and A A B B) (and A A B D) (and A A C B) (and A A C D)\r\n(and A D B B) (and A D B D) (and A D C B) (and A D C D)\r\n(and C A B B) (and C A B D) (and C A C B) (and C A C D)\r\n(and C D B B) (and C D B D) (and C D C B) (and C D C D))\r\n\r\n@unknown -> (or (and A B) (and C D))\n((A C) (A D) (B C) (B D)) -> (and (or A C) (or A D) (or B C) (or B D))\n-> (or (and A A B B) (and A A B D) (and A A C B) (and A A C D)\n(and A D B B) (and A D B D) (and A D C B) (and A D C D)\n(and C A B B) (and C A B D) (and C A C B) (and C A C D)\n(and C D B B) (and C D B D) (and C D C B) (and C D C D))")
    public static final SubLObject hl_cnfs_to_hl_dnfs_alt(SubLObject hl_cnfs) {
        {
            SubLObject hl_cnfs_with_explicit_literals = Mapping.mapcar(CNF_LITERALS, hl_cnfs);
            SubLObject hl_dnfs_with_explicit_literals = list_utilities.cartesian_product(hl_cnfs_with_explicit_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject hl_dnfs = Mapping.mapcar(CLAUSE_FROM_EL_LITERALS, hl_dnfs_with_explicit_literals);
            return hl_dnfs;
        }
    }

    /**
     * ((A C) (A D) (B C) (B D)) -> (and (or A C) (or A D) (or B C) (or B D))
     * -> (or (and A A B B) (and A A B D) (and A A C B) (and A A C D)
     * (and A D B B) (and A D B D) (and A D C B) (and A D C D)
     * (and C A B B) (and C A B D) (and C A C B) (and C A C D)
     * (and C D B B) (and C D B D) (and C D C B) (and C D C D))
     *
     * @unknown -> (or (and A B) (and C D))
     */
    @LispMethod(comment = "((A C) (A D) (B C) (B D)) -> (and (or A C) (or A D) (or B C) (or B D))\r\n-> (or (and A A B B) (and A A B D) (and A A C B) (and A A C D)\r\n(and A D B B) (and A D B D) (and A D C B) (and A D C D)\r\n(and C A B B) (and C A B D) (and C A C B) (and C A C D)\r\n(and C D B B) (and C D B D) (and C D C B) (and C D C D))\r\n\r\n@unknown -> (or (and A B) (and C D))\n((A C) (A D) (B C) (B D)) -> (and (or A C) (or A D) (or B C) (or B D))\n-> (or (and A A B B) (and A A B D) (and A A C B) (and A A C D)\n(and A D B B) (and A D B D) (and A D C B) (and A D C D)\n(and C A B B) (and C A B D) (and C A C B) (and C A C D)\n(and C D B B) (and C D B D) (and C D C B) (and C D C D))")
    public static SubLObject hl_cnfs_to_hl_dnfs(final SubLObject hl_cnfs) {
        final SubLObject hl_cnfs_with_explicit_literals = Mapping.mapcar(CNF_LITERALS, hl_cnfs);
        final SubLObject hl_dnfs_with_explicit_literals = list_utilities.cartesian_product(hl_cnfs_with_explicit_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject hl_dnfs = Mapping.mapcar(CLAUSE_FROM_EL_LITERALS, hl_dnfs_with_explicit_literals);
        return hl_dnfs;
    }

    public static final SubLObject dnfs_el_formula_alt(SubLObject hl_dnfs, SubLObject mt, SubLObject symbols) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        {
            SubLObject hl_cnfs = com.cyc.cycjava.cycl.uncanonicalizer.hl_dnfs_to_hl_cnfs(hl_dnfs);
            return com.cyc.cycjava.cycl.uncanonicalizer.cnfs_el_formula(hl_cnfs, mt, symbols);
        }
    }

    public static SubLObject dnfs_el_formula(final SubLObject hl_dnfs, SubLObject mt, SubLObject symbols) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        final SubLObject hl_cnfs = hl_dnfs_to_hl_cnfs(hl_dnfs);
        return cnfs_el_formula(hl_cnfs, mt, symbols);
    }

    public static final SubLObject el_cnfs_to_el_implication_alt(SubLObject el_cnfs, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject result_mt = NIL;
                SubLObject el_disjunction = com.cyc.cycjava.cycl.uncanonicalizer.unpackage_cnf_clauses(el_cnfs);
                {
                    SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
                    try {
                        czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                        {
                            SubLObject v_skolems = com.cyc.cycjava.cycl.uncanonicalizer.formula_unreified_skolems(el_disjunction);
                            {
                                SubLObject _prev_bind_0_8 = $universal_vars_to_skolem$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $vars_to_universalize$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $retain_leading_universals$.currentBinding(thread);
                                try {
                                    $universal_vars_to_skolem$.bind(com.cyc.cycjava.cycl.uncanonicalizer.universal_vars_to_skolem_table(el_disjunction, v_skolems), thread);
                                    $vars_to_universalize$.bind(com.cyc.cycjava.cycl.uncanonicalizer.sentence_free_vars_not_bound_to_skolems(el_disjunction, v_skolems), thread);
                                    $retain_leading_universals$.bind(append($retain_leading_universals$.getDynamicValue(thread), com.cyc.cycjava.cycl.uncanonicalizer.true_sentence_vars(el_disjunction)), thread);
                                    {
                                        SubLObject el_universal = com.cyc.cycjava.cycl.uncanonicalizer.unremove_universals(el_disjunction);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject el_existential = com.cyc.cycjava.cycl.uncanonicalizer.unremove_existentials_and_refd_universals(el_universal, mt);
                                            SubLObject intermediate_mt = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject el_implication = com.cyc.cycjava.cycl.uncanonicalizer.implications_in(el_existential);
                                                SubLObject el_ist_implication = com.cyc.cycjava.cycl.uncanonicalizer.ists_out(el_implication);
                                                result = el_ist_implication;
                                                result_mt = intermediate_mt;
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject result_9 = hlmt_czer.tense_recursive_contractor(result, result_mt);
                                                    SubLObject result_mt_10 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    result = result_9;
                                                    result_mt = result_mt_10;
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $retain_leading_universals$.rebind(_prev_bind_2, thread);
                                    $vars_to_universalize$.rebind(_prev_bind_1, thread);
                                    $universal_vars_to_skolem$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    } finally {
                        czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, result_mt);
            }
        }
    }

    public static SubLObject el_cnfs_to_el_implication(final SubLObject el_cnfs, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject result_mt = NIL;
        final SubLObject el_disjunction = unpackage_cnf_clauses(el_cnfs);
        final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
        try {
            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
            final SubLObject v_skolems = formula_unreified_skolems(el_disjunction);
            final SubLObject _prev_bind_0_$8 = $universal_vars_to_skolem$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $vars_to_universalize$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $retain_leading_universals$.currentBinding(thread);
            try {
                $universal_vars_to_skolem$.bind(universal_vars_to_skolem_table(el_disjunction, v_skolems), thread);
                $vars_to_universalize$.bind(sentence_free_vars_not_bound_to_skolems(el_disjunction, v_skolems), thread);
                $retain_leading_universals$.bind(append($retain_leading_universals$.getDynamicValue(thread), true_sentence_vars(el_disjunction)), thread);
                final SubLObject el_universal = unremove_universals(el_disjunction);
                thread.resetMultipleValues();
                final SubLObject el_existential = unremove_existentials_and_refd_universals(el_universal, mt);
                final SubLObject intermediate_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject el_implication = implications_in(el_existential);
                final SubLObject el_ist_implication = result = ists_out(el_implication);
                result_mt = intermediate_mt;
                thread.resetMultipleValues();
                final SubLObject result_$9 = hlmt_czer.tense_recursive_contractor(result, result_mt);
                final SubLObject result_mt_$10 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$9;
                result_mt = result_mt_$10;
            } finally {
                $retain_leading_universals$.rebind(_prev_bind_3, thread);
                $vars_to_universalize$.rebind(_prev_bind_2, thread);
                $universal_vars_to_skolem$.rebind(_prev_bind_0_$8, thread);
            }
        } finally {
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_0, thread);
        }
        return values(result, result_mt);
    }

    public static final SubLObject remove_index_lits_from_cnfs_alt(SubLObject index_lits, SubLObject cnfs) {
        if (NIL != index_lits) {
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = cnfs;
                SubLObject cnf = NIL;
                for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                    {
                        SubLObject neg_lits = set_difference(clauses.neg_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject pos_lits = set_difference(clauses.pos_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                        result = cons(clauses.make_cnf(neg_lits, pos_lits), result);
                    }
                }
                return nreverse(result);
            }
        } else {
            return cnfs;
        }
    }

    public static SubLObject remove_index_lits_from_cnfs(final SubLObject index_lits, final SubLObject cnfs) {
        if (NIL != index_lits) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            cnf = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject neg_lits = set_difference(clauses.neg_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                final SubLObject pos_lits = set_difference(clauses.pos_lits(cnf), index_lits, symbol_function(EQUAL), UNPROVIDED);
                result = cons(clauses.make_cnf(neg_lits, pos_lits), result);
                cdolist_list_var = cdolist_list_var.rest();
                cnf = cdolist_list_var.first();
            } 
            return nreverse(result);
        }
        return cnfs;
    }

    /**
     * Return an EL-ish formula suitable for manipulation at the EL but still containing HL constructs, notably skolem terms.
     */
    @LispMethod(comment = "Return an EL-ish formula suitable for manipulation at the EL but still containing HL constructs, notably skolem terms.")
    public static final SubLObject cnf_intermediate_el_formula_alt(SubLObject cnfs) {
        return com.cyc.cycjava.cycl.uncanonicalizer.ists_out(com.cyc.cycjava.cycl.uncanonicalizer.unpackage_cnf_clauses(cnfs));
    }

    /**
     * Return an EL-ish formula suitable for manipulation at the EL but still containing HL constructs, notably skolem terms.
     */
    @LispMethod(comment = "Return an EL-ish formula suitable for manipulation at the EL but still containing HL constructs, notably skolem terms.")
    public static SubLObject cnf_intermediate_el_formula(final SubLObject cnfs) {
        return ists_out(unpackage_cnf_clauses(cnfs));
    }

    public static SubLObject dnf_intermediate_el_formula(final SubLObject dnfs) {
        return ists_out(unpackage_dnf_clauses(dnfs));
    }

    public static final SubLObject el_version_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject canon_cnfs = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                    try {
                        czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                        canon_cnfs = czer_meta.canon_cnfs(formula, NIL, mt);
                    } finally {
                        czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (canon_cnfs.isCons()) {
                    {
                        SubLObject invalidP = NIL;
                        SubLObject mt_var = mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $retain_leading_universals$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                $retain_leading_universals$.bind(clausifier.leading_universal_variables(formula, mt), thread);
                                {
                                    SubLObject free = relation_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    result = com.cyc.cycjava.cycl.uncanonicalizer.cnfs_el_formula(canon_cnfs, UNPROVIDED, UNPROVIDED);
                                    invalidP = makeBoolean((NIL != set_difference(relation_free_variables(result, UNPROVIDED, UNPROVIDED, UNPROVIDED), free, UNPROVIDED, UNPROVIDED)) || (NIL == wff.el_wffP(result, mt, UNPROVIDED)));
                                }
                            } finally {
                                $retain_leading_universals$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != invalidP) {
                            return formula;
                        } else {
                            return result;
                        }
                    }
                } else {
                    return formula;
                }
            }
        }
    }

    public static SubLObject el_version(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject canon_cnfs = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
            canon_cnfs = czer_meta.canon_cnfs(formula, NIL, mt);
        } finally {
            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
        }
        if (!canon_cnfs.isCons()) {
            return formula;
        }
        SubLObject invalidP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $retain_leading_universals$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            $retain_leading_universals$.bind(clausifier.leading_universal_variables(formula, mt), thread);
            final SubLObject free = relation_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = cnfs_el_formula(canon_cnfs, UNPROVIDED, UNPROVIDED);
            invalidP = makeBoolean((NIL != set_difference(relation_free_variables(result, UNPROVIDED, UNPROVIDED, UNPROVIDED), free, UNPROVIDED, UNPROVIDED)) || (NIL == wff.el_wffP(result, mt, UNPROVIDED)));
        } finally {
            $retain_leading_universals$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
        }
        if (NIL != invalidP) {
            return formula;
        }
        return result;
    }

    public static final SubLObject el_explicitify_implicit_meta_literals_alt(SubLObject cnf) {
        cnf = com.cyc.cycjava.cycl.uncanonicalizer.el_exceptions(cnf);
        cnf = com.cyc.cycjava.cycl.uncanonicalizer.el_pragmatic_requirements(cnf);
        return cnf;
    }

    public static SubLObject el_explicitify_implicit_meta_literals(SubLObject cnf) {
        cnf = el_exceptions(cnf);
        cnf = el_pragmatic_requirements(cnf);
        return cnf;
    }

    public static final SubLObject el_pragmatic_requirements_alt(SubLObject cnf) {
        if (NIL != list_utilities.tree_find($$meetsPragmaticRequirement, cnf, UNPROVIDED, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.uncanonicalizer.el_pragmatic_requirement(cnf);
        } else {
            return cnf;
        }
    }

    public static SubLObject el_pragmatic_requirements(final SubLObject cnf) {
        if (NIL != list_utilities.tree_find($$meetsPragmaticRequirement, cnf, UNPROVIDED, UNPROVIDED)) {
            return el_pragmatic_requirement(cnf);
        }
        return cnf;
    }

    /**
     * Transforms CNF, which contains a reference to #$meetsPragmaticRequirement,
     * into the corresponding #$pragmaticRequirement assertion.
     */
    @LispMethod(comment = "Transforms CNF, which contains a reference to #$meetsPragmaticRequirement,\r\ninto the corresponding #$pragmaticRequirement assertion.\nTransforms CNF, which contains a reference to #$meetsPragmaticRequirement,\ninto the corresponding #$pragmaticRequirement assertion.")
    public static final SubLObject el_pragmatic_requirement_alt(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cnf;
                SubLObject current = datum;
                SubLObject neg_lits = NIL;
                SubLObject pos_lits = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt43);
                neg_lits = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                pos_lits = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject prag_lits = meets_pragmatic_requirement_asents(pos_lits);
                        SubLObject prag_lit = (NIL != list_utilities.singletonP(prag_lits)) ? ((SubLObject) (prag_lits.first())) : NIL;
                        SubLObject other_pos_lits = (NIL != prag_lit) ? ((SubLObject) (remove(prag_lit, pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                        if (NIL != prag_lit) {
                            {
                                SubLObject datum_11 = prag_lit;
                                SubLObject current_12 = datum_11;
                                SubLObject prag_pred = NIL;
                                SubLObject var_list = NIL;
                                SubLObject assertion = NIL;
                                destructuring_bind_must_consp(current_12, datum_11, $list_alt44);
                                prag_pred = current_12.first();
                                current_12 = current_12.rest();
                                destructuring_bind_must_consp(current_12, datum_11, $list_alt44);
                                var_list = current_12.first();
                                current_12 = current_12.rest();
                                destructuring_bind_must_consp(current_12, datum_11, $list_alt44);
                                assertion = current_12.first();
                                current_12 = current_12.rest();
                                if (NIL == current_12) {
                                    if (NIL != term.kb_assertionP(assertion)) {
                                        {
                                            SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                                            SubLObject assertion_formula = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula(assertion)));
                                            SubLObject lhs = Mapping.mapcar(NEGATE, other_pos_lits);
                                            SubLObject rhs = neg_lits;
                                            SubLObject pragmatic_antecedent = append(lhs, rhs);
                                            if (NIL != pragmatic_antecedent) {
                                                if (NIL != list_utilities.singletonP(pragmatic_antecedent)) {
                                                    pragmatic_antecedent = pragmatic_antecedent.first();
                                                } else {
                                                    pragmatic_antecedent = cons($$and, pragmatic_antecedent);
                                                }
                                            }
                                            if (!mt_relevance_macros.$mt$.getDynamicValue(thread).eql(assertion_mt)) {
                                                assertion_formula = list($$ist, assertion_mt, assertion_formula);
                                            }
                                            return clause_utilities.make_gaf_cnf(list($$pragmaticRequirement, pragmatic_antecedent, assertion_formula));
                                        }
                                    } else {
                                        return cnf;
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_11, $list_alt44);
                                }
                            }
                        } else {
                            return cnf;
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt43);
                }
            }
            return NIL;
        }
    }

    /**
     * Transforms CNF, which contains a reference to #$meetsPragmaticRequirement,
     * into the corresponding #$pragmaticRequirement assertion.
     */
    @LispMethod(comment = "Transforms CNF, which contains a reference to #$meetsPragmaticRequirement,\r\ninto the corresponding #$pragmaticRequirement assertion.\nTransforms CNF, which contains a reference to #$meetsPragmaticRequirement,\ninto the corresponding #$pragmaticRequirement assertion.")
    public static SubLObject el_pragmatic_requirement(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(cnf, cnf, $list43);
        neg_lits = cnf.first();
        SubLObject current = cnf.rest();
        destructuring_bind_must_consp(current, cnf, $list43);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject prag_lits = meets_pragmatic_requirement_asents(pos_lits);
            final SubLObject prag_lit = (NIL != list_utilities.singletonP(prag_lits)) ? prag_lits.first() : NIL;
            final SubLObject other_pos_lits = (NIL != prag_lit) ? remove(prag_lit, pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
            if (NIL == prag_lit) {
                return cnf;
            }
            SubLObject current_$12;
            final SubLObject datum_$11 = current_$12 = prag_lit;
            SubLObject prag_pred = NIL;
            SubLObject var_list = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current_$12, datum_$11, $list44);
            prag_pred = current_$12.first();
            current_$12 = current_$12.rest();
            destructuring_bind_must_consp(current_$12, datum_$11, $list44);
            var_list = current_$12.first();
            current_$12 = current_$12.rest();
            destructuring_bind_must_consp(current_$12, datum_$11, $list44);
            assertion = current_$12.first();
            current_$12 = current_$12.rest();
            if (NIL == current_$12) {
                if (NIL != term.kb_assertionP(assertion)) {
                    final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                    SubLObject assertion_formula = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, assertion_el_formula(assertion)));
                    final SubLObject lhs = Mapping.mapcar(NEGATE, other_pos_lits);
                    final SubLObject rhs = neg_lits;
                    SubLObject pragmatic_antecedent = append(lhs, rhs);
                    if (NIL != pragmatic_antecedent) {
                        if (NIL != list_utilities.singletonP(pragmatic_antecedent)) {
                            pragmatic_antecedent = pragmatic_antecedent.first();
                        } else {
                            pragmatic_antecedent = cons($$and, pragmatic_antecedent);
                        }
                    }
                    if (!mt_relevance_macros.$mt$.getDynamicValue(thread).eql(assertion_mt)) {
                        assertion_formula = list($$ist, assertion_mt, assertion_formula);
                    }
                    return clause_utilities.make_gaf_cnf(list($$pragmaticRequirement, pragmatic_antecedent, assertion_formula));
                }
                return cnf;
            } else {
                cdestructuring_bind_error(datum_$11, $list44);
            }
        } else {
            cdestructuring_bind_error(cnf, $list43);
        }
        return NIL;
    }

    public static final SubLObject el_exceptions_alt(SubLObject cnf) {
        if (NIL != list_utilities.tree_find($$abnormal, cnf, UNPROVIDED, UNPROVIDED)) {
            if (NIL != clauses.gaf_cnfP(cnf)) {
                return com.cyc.cycjava.cycl.uncanonicalizer.el_except_for(cnf);
            } else {
                return com.cyc.cycjava.cycl.uncanonicalizer.el_except_when(cnf);
            }
        } else {
            return cnf;
        }
    }

    public static SubLObject el_exceptions(final SubLObject cnf) {
        if (NIL == list_utilities.tree_find($$abnormal, cnf, UNPROVIDED, UNPROVIDED)) {
            return cnf;
        }
        if (NIL != clauses.gaf_cnfP(cnf)) {
            return el_except_for(cnf);
        }
        return el_except_when(cnf);
    }

    public static final SubLObject el_except_for_alt(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos_lit = clauses.pos_lits(cnf).first();
                if (NIL != ab_litP(pos_lit)) {
                    {
                        SubLObject datum = pos_lit;
                        SubLObject current = datum;
                        SubLObject ab_pred = NIL;
                        SubLObject exception_list = NIL;
                        SubLObject assertion = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt50);
                        ab_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt50);
                        exception_list = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt50);
                        assertion = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject exception_args = cycl_utilities.formula_args(exception_list, UNPROVIDED);
                                if (((NIL != list_utilities.singletonP(exception_args)) && (NIL != groundP(exception_args, symbol_function($sym51$CYC_VAR_)))) && (NIL != term.kb_assertionP(assertion))) {
                                    {
                                        SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                                        SubLObject assertion_formula = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula(assertion)));
                                        if (!mt_relevance_macros.$mt$.getDynamicValue(thread).eql(assertion_mt)) {
                                            assertion_formula = list($$ist, assertion_mt, assertion_formula);
                                        }
                                        return clauses.make_cnf(NIL, list(list($$exceptFor, exception_args.first(), assertion_formula)));
                                    }
                                } else {
                                    return cnf;
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt50);
                        }
                    }
                } else {
                    return cnf;
                }
            }
            return NIL;
        }
    }

    public static SubLObject el_except_for(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lit = clauses.pos_lits(cnf).first();
        if (NIL == ab_litP(pos_lit)) {
            return cnf;
        }
        SubLObject current;
        final SubLObject datum = current = pos_lit;
        SubLObject ab_pred = NIL;
        SubLObject exception_list = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        ab_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        exception_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        assertion = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list50);
            return NIL;
        }
        final SubLObject exception_args = cycl_utilities.formula_args(exception_list, UNPROVIDED);
        if (((NIL != list_utilities.singletonP(exception_args)) && (NIL != groundP(exception_args, symbol_function($sym51$CYC_VAR_)))) && (NIL != term.kb_assertionP(assertion))) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            SubLObject assertion_formula = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, assertion_el_formula(assertion)));
            if (!mt_relevance_macros.$mt$.getDynamicValue(thread).eql(assertion_mt)) {
                assertion_formula = list($$ist, assertion_mt, assertion_formula);
            }
            return clauses.make_cnf(NIL, list(list($$exceptFor, exception_args.first(), assertion_formula)));
        }
        return cnf;
    }

    public static final SubLObject el_except_when_alt(SubLObject cnf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = cnf;
                SubLObject current = datum;
                SubLObject neg_lits = NIL;
                SubLObject pos_lits = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt43);
                neg_lits = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt43);
                pos_lits = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject ab_lits = ab_lits(pos_lits);
                        SubLObject ab_lit = (NIL != list_utilities.singletonP(ab_lits)) ? ((SubLObject) (ab_lits.first())) : NIL;
                        SubLObject other_pos_lits = (NIL != ab_lit) ? ((SubLObject) (remove(ab_lit, pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                        if (NIL != ab_lit) {
                            {
                                SubLObject datum_13 = ab_lit;
                                SubLObject current_14 = datum_13;
                                SubLObject ab_pred = NIL;
                                SubLObject exception_list = NIL;
                                SubLObject assertion = NIL;
                                destructuring_bind_must_consp(current_14, datum_13, $list_alt50);
                                ab_pred = current_14.first();
                                current_14 = current_14.rest();
                                destructuring_bind_must_consp(current_14, datum_13, $list_alt50);
                                exception_list = current_14.first();
                                current_14 = current_14.rest();
                                destructuring_bind_must_consp(current_14, datum_13, $list_alt50);
                                assertion = current_14.first();
                                current_14 = current_14.rest();
                                if (NIL == current_14) {
                                    {
                                        SubLObject exception_args = cycl_utilities.formula_args(exception_list, UNPROVIDED);
                                        if ((NIL != el_var_listP(exception_args)) && (NIL != term.kb_assertionP(assertion))) {
                                            {
                                                SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                                                SubLObject assertion_formula = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula(assertion)));
                                                SubLObject lhs = neg_lits;
                                                SubLObject rhs = Mapping.mapcar(symbol_function(NEGATE), other_pos_lits);
                                                SubLObject exception_antecedent = append(lhs, rhs);
                                                if (NIL != exception_antecedent) {
                                                    if (NIL != list_utilities.singletonP(exception_antecedent)) {
                                                        exception_antecedent = exception_antecedent.first();
                                                    } else {
                                                        exception_antecedent = cons($$and, exception_antecedent);
                                                    }
                                                }
                                                if (!mt_relevance_macros.$mt$.getDynamicValue(thread).eql(assertion_mt)) {
                                                    assertion_formula = list($$ist, assertion_mt, assertion_formula);
                                                }
                                                return clauses.make_cnf(NIL, list(list($$exceptWhen, exception_antecedent, assertion_formula)));
                                            }
                                        } else {
                                            return cnf;
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_13, $list_alt50);
                                }
                            }
                        } else {
                            return cnf;
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt43);
                }
            }
            return NIL;
        }
    }

    public static SubLObject el_except_when(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(cnf, cnf, $list43);
        neg_lits = cnf.first();
        SubLObject current = cnf.rest();
        destructuring_bind_must_consp(current, cnf, $list43);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject ab_lits = ab_lits(pos_lits);
            final SubLObject ab_lit = (NIL != list_utilities.singletonP(ab_lits)) ? ab_lits.first() : NIL;
            final SubLObject other_pos_lits = (NIL != ab_lit) ? remove(ab_lit, pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
            if (NIL == ab_lit) {
                return cnf;
            }
            SubLObject current_$14;
            final SubLObject datum_$13 = current_$14 = ab_lit;
            SubLObject ab_pred = NIL;
            SubLObject exception_list = NIL;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current_$14, datum_$13, $list50);
            ab_pred = current_$14.first();
            current_$14 = current_$14.rest();
            destructuring_bind_must_consp(current_$14, datum_$13, $list50);
            exception_list = current_$14.first();
            current_$14 = current_$14.rest();
            destructuring_bind_must_consp(current_$14, datum_$13, $list50);
            assertion = current_$14.first();
            current_$14 = current_$14.rest();
            if (NIL == current_$14) {
                final SubLObject exception_args = cycl_utilities.formula_args(exception_list, UNPROVIDED);
                if ((NIL != el_var_listP(exception_args)) && (NIL != term.kb_assertionP(assertion))) {
                    final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                    SubLObject assertion_formula = list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, assertion_el_formula(assertion)));
                    final SubLObject lhs = neg_lits;
                    final SubLObject rhs = Mapping.mapcar(symbol_function(NEGATE), other_pos_lits);
                    SubLObject exception_antecedent = append(lhs, rhs);
                    if (NIL != exception_antecedent) {
                        if (NIL != list_utilities.singletonP(exception_antecedent)) {
                            exception_antecedent = exception_antecedent.first();
                        } else {
                            exception_antecedent = cons($$and, exception_antecedent);
                        }
                    }
                    if (!mt_relevance_macros.$mt$.getDynamicValue(thread).eql(assertion_mt)) {
                        assertion_formula = list($$ist, assertion_mt, assertion_formula);
                    }
                    return clauses.make_cnf(NIL, list(list($$exceptWhen, exception_antecedent, assertion_formula)));
                }
                return cnf;
            } else {
                cdestructuring_bind_error(datum_$13, $list50);
            }
        } else {
            cdestructuring_bind_error(cnf, $list43);
        }
        return NIL;
    }

    public static final SubLObject unpackage_cnf_clauses_alt(SubLObject cnfs) {
        {
            SubLObject neg_lits = list_utilities.intersect_all(Mapping.mapcar(symbol_function(NEG_LITS), cnfs), symbol_function(EQUAL), UNPROVIDED);
            SubLObject pos_lits = NIL;
            SubLObject pos_lits_orts = NIL;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf_i = NIL;
            for (cnf_i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf_i = cdolist_list_var.first()) {
                {
                    SubLObject neg_lits_i = clauses.neg_lits(cnf_i);
                    if (NIL != list_utilities.sets_equalP(neg_lits, neg_lits_i, symbol_function(EQUAL))) {
                        pos_lits = cons(simplifier.disjoin(clauses.pos_lits(cnf_i), UNPROVIDED), pos_lits);
                    } else {
                        if (NIL != subsetp(neg_lits, neg_lits_i, symbol_function(EQUAL), UNPROVIDED)) {
                            {
                                SubLObject neg_orts = set_difference(neg_lits_i, neg_lits, symbol_function(EQUAL), UNPROVIDED);
                                SubLObject pos_lits_i = clauses.pos_lits(cnf_i);
                                if ((NIL != neg_orts) && (NIL != pos_lits_i)) {
                                    pos_lits_orts = cons(make_binary_formula($$implies, simplifier.conjoin(neg_orts, T), simplifier.disjoin(pos_lits_i, T)), pos_lits_orts);
                                } else {
                                    if (NIL != neg_orts) {
                                        pos_lits = cons(simplifier.disjoin(Mapping.mapcar(symbol_function(NEGATE_ATOMIC), neg_orts), UNPROVIDED), pos_lits);
                                    } else {
                                        if (NIL != pos_lits_i) {
                                            pos_lits = cons(simplifier.disjoin(pos_lits_i, UNPROVIDED), pos_lits);
                                        }
                                    }
                                }
                            }
                        } else {
                            result = cons(czer_utilities.unpackage_cnf_clause(cnf_i), result);
                        }
                    }
                }
            }
            result = nreverse(result);
            pos_lits = nconc(nreverse(pos_lits), nreverse(pos_lits_orts));
            result = cons(simplifier.disjoin(list(cycl_utilities.negate(simplifier.conjoin(neg_lits, UNPROVIDED)), simplifier.conjoin(pos_lits, UNPROVIDED)), UNPROVIDED), result);
            return simplifier.simplify_el_syntax(simplifier.conjoin(result, UNPROVIDED), UNPROVIDED);
        }
    }

    public static SubLObject unpackage_cnf_clauses(final SubLObject cnfs) {
        final SubLObject neg_lits = list_utilities.intersect_all(Mapping.mapcar(symbol_function(NEG_LITS), cnfs), symbol_function(EQUAL), UNPROVIDED);
        SubLObject pos_lits = NIL;
        SubLObject pos_lits_orts = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf_i = NIL;
        cnf_i = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject neg_lits_i = clauses.neg_lits(cnf_i);
            if (NIL != list_utilities.sets_equalP(neg_lits, neg_lits_i, symbol_function(EQUAL))) {
                pos_lits = cons(simplifier.disjoin(clauses.pos_lits(cnf_i), UNPROVIDED), pos_lits);
            } else
                if (NIL != subsetp(neg_lits, neg_lits_i, symbol_function(EQUAL), UNPROVIDED)) {
                    final SubLObject neg_orts = set_difference(neg_lits_i, neg_lits, symbol_function(EQUAL), UNPROVIDED);
                    final SubLObject pos_lits_i = clauses.pos_lits(cnf_i);
                    if ((NIL != neg_orts) && (NIL != pos_lits_i)) {
                        pos_lits_orts = cons(make_binary_formula($$implies, simplifier.conjoin(neg_orts, T), simplifier.disjoin(pos_lits_i, T)), pos_lits_orts);
                    } else
                        if (NIL != neg_orts) {
                            pos_lits = cons(simplifier.disjoin(Mapping.mapcar(symbol_function(NEGATE_ATOMIC), neg_orts), UNPROVIDED), pos_lits);
                        } else
                            if (NIL != pos_lits_i) {
                                pos_lits = cons(simplifier.disjoin(pos_lits_i, UNPROVIDED), pos_lits);
                            }


                } else {
                    result = cons(czer_utilities.unpackage_cnf_clause(cnf_i), result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            cnf_i = cdolist_list_var.first();
        } 
        result = nreverse(result);
        pos_lits = nconc(nreverse(pos_lits), nreverse(pos_lits_orts));
        result = cons(simplifier.disjoin(list(cycl_utilities.negate(simplifier.conjoin(neg_lits, UNPROVIDED)), simplifier.conjoin(pos_lits, UNPROVIDED)), UNPROVIDED), result);
        return simplifier.simplify_el_syntax(simplifier.conjoin(result, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject unpackage_dnf_clauses(final SubLObject dnfs) {
        SubLObject el_clauses = NIL;
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject el_clause = czer_utilities.unpackage_dnf_clause(dnf);
            el_clauses = cons(el_clause, el_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            dnf = cdolist_list_var.first();
        } 
        el_clauses = nreverse(el_clauses);
        return simplifier.simplify_el_syntax(simplifier.disjoin(el_clauses, UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject remove_truesentence_refs_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (formula.isAtom()) {
                return formula;
            } else {
                if (NIL == list_utilities.tree_find($$trueSentence, formula, symbol_function(EQUAL), UNPROVIDED)) {
                    return formula;
                } else {
                    if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                        {
                            SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
                            return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(REMOVE_TRUESENTENCE_REFS), args));
                        }
                    } else {
                        if (NIL != czer_utilities.true_sentenceP(formula)) {
                            return com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                        } else {
                            if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
                                {
                                    SubLObject datum = formula;
                                    SubLObject current = datum;
                                    SubLObject quantifier = NIL;
                                    SubLObject var = NIL;
                                    SubLObject subsent = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt58);
                                    quantifier = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt58);
                                    var = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt58);
                                    subsent = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        return list(quantifier, var, com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(subsent));
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt58);
                                    }
                                }
                            } else {
                                if (NIL != el_bounded_existential_p(formula)) {
                                    {
                                        SubLObject datum = formula;
                                        SubLObject current = datum;
                                        SubLObject quantifier = NIL;
                                        SubLObject n = NIL;
                                        SubLObject var = NIL;
                                        SubLObject subsent = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        quantifier = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        n = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        var = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        subsent = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            return list(quantifier, n, var, com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(subsent));
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt59);
                                        }
                                    }
                                } else {
                                    if (NIL != el_negation_p(formula)) {
                                        {
                                            SubLObject datum = formula;
                                            SubLObject current = datum;
                                            SubLObject neg_form = NIL;
                                            SubLObject new_formula = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt60);
                                            neg_form = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt60);
                                            new_formula = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                return list(neg_form, com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(new_formula));
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt60);
                                            }
                                        }
                                    } else {
                                        if (NIL != el_implication_p(formula)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject implies = unmake_binary_formula(formula);
                                                SubLObject antecedent = thread.secondMultipleValue();
                                                SubLObject consequent = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                return make_implication(com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(antecedent), com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(consequent));
                                            }
                                        } else {
                                            if (NIL != el_pragmatic_requirement_p(formula)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject pragmatic_requirement = unmake_binary_formula(formula);
                                                    SubLObject requirement = thread.secondMultipleValue();
                                                    SubLObject rule = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    return make_binary_formula($$pragmaticRequirement, com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(requirement), com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(rule));
                                                }
                                            } else {
                                                if (NIL != literalP(formula)) {
                                                    return formula;
                                                } else {
                                                    if (NIL != el_exception_p(formula)) {
                                                        return formula;
                                                    } else {
                                                        el_error(THREE_INTEGER, $str_alt61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
                                                        return formula;
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
            return NIL;
        }
    }

    public static SubLObject remove_truesentence_refs(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula.isAtom()) {
            return formula;
        }
        if (NIL == list_utilities.tree_find($$trueSentence, formula, symbol_function(EQUAL), UNPROVIDED)) {
            return formula;
        }
        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
            final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
            return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(REMOVE_TRUESENTENCE_REFS), args));
        }
        if ((NIL != czer_utilities.true_sentenceP(formula)) && (NIL == el_disjunction_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) {
            return remove_truesentence_refs(cycl_utilities.formula_arg1(formula, UNPROVIDED));
        }
        if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
            SubLObject quantifier = NIL;
            SubLObject var = NIL;
            SubLObject subsent = NIL;
            destructuring_bind_must_consp(formula, formula, $list58);
            quantifier = formula.first();
            SubLObject current = formula.rest();
            destructuring_bind_must_consp(current, formula, $list58);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, formula, $list58);
            subsent = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(quantifier, var, remove_truesentence_refs(subsent));
            }
            cdestructuring_bind_error(formula, $list58);
        } else
            if (NIL != el_bounded_existential_p(formula)) {
                SubLObject quantifier = NIL;
                SubLObject n = NIL;
                SubLObject var2 = NIL;
                SubLObject subsent2 = NIL;
                destructuring_bind_must_consp(formula, formula, $list59);
                quantifier = formula.first();
                SubLObject current = formula.rest();
                destructuring_bind_must_consp(current, formula, $list59);
                n = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, formula, $list59);
                var2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, formula, $list59);
                subsent2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    return list(quantifier, n, var2, remove_truesentence_refs(subsent2));
                }
                cdestructuring_bind_error(formula, $list59);
            } else
                if (NIL != el_negation_p(formula)) {
                    SubLObject neg_form = NIL;
                    SubLObject new_formula = NIL;
                    destructuring_bind_must_consp(formula, formula, $list60);
                    neg_form = formula.first();
                    SubLObject current = formula.rest();
                    destructuring_bind_must_consp(current, formula, $list60);
                    new_formula = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return list(neg_form, remove_truesentence_refs(new_formula));
                    }
                    cdestructuring_bind_error(formula, $list60);
                } else {
                    if (NIL != el_implication_p(formula)) {
                        thread.resetMultipleValues();
                        final SubLObject implies = unmake_binary_formula(formula);
                        final SubLObject antecedent = thread.secondMultipleValue();
                        final SubLObject consequent = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return make_implication(remove_truesentence_refs(antecedent), remove_truesentence_refs(consequent));
                    }
                    if (NIL != el_pragmatic_requirement_p(formula)) {
                        thread.resetMultipleValues();
                        final SubLObject pragmatic_requirement = unmake_binary_formula(formula);
                        final SubLObject requirement = thread.secondMultipleValue();
                        final SubLObject rule = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return make_binary_formula($$pragmaticRequirement, remove_truesentence_refs(requirement), remove_truesentence_refs(rule));
                    }
                    if (NIL != literalP(formula)) {
                        return formula;
                    }
                    if (NIL != el_exception_p(formula)) {
                        return formula;
                    }
                    el_error(THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
                    return formula;
                }


        return NIL;
    }

    public static final SubLObject true_sentence_vars_alt(SubLObject formula) {
        if (formula.isAtom()) {
        } else {
            if (NIL == list_utilities.tree_find($$trueSentence, formula, symbol_function(EQUAL), UNPROVIDED)) {
            } else {
                if (NIL != czer_utilities.true_sentenceP(formula)) {
                    return formula_quantified_vars(formula);
                } else {
                    if (NIL != el_negation_p(formula)) {
                        return com.cyc.cycjava.cycl.uncanonicalizer.true_sentence_vars(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                    } else {
                        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                            return remove_duplicates(list_utilities.mapappend(symbol_function(TRUE_SENTENCE_VARS), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
                                return com.cyc.cycjava.cycl.uncanonicalizer.true_sentence_vars(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                            } else {
                                if (NIL != el_bounded_existential_p(formula)) {
                                    return com.cyc.cycjava.cycl.uncanonicalizer.true_sentence_vars(cycl_utilities.formula_arg3(formula, UNPROVIDED));
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject true_sentence_vars(final SubLObject formula) {
        if (!formula.isAtom()) {
            if (NIL != list_utilities.tree_find($$trueSentence, formula, symbol_function(EQUAL), UNPROVIDED)) {
                if (NIL != czer_utilities.true_sentenceP(formula)) {
                    return formula_quantified_vars(formula);
                }
                if (NIL != el_negation_p(formula)) {
                    return true_sentence_vars(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                }
                if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                    return remove_duplicates(list_utilities.mapappend(symbol_function(TRUE_SENTENCE_VARS), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
                    return true_sentence_vars(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                }
                if (NIL != el_bounded_existential_p(formula)) {
                    return true_sentence_vars(cycl_utilities.formula_arg3(formula, UNPROVIDED));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject undo_variables_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sequence_var = sequence_var(formula, UNPROVIDED);
                SubLObject result = NIL;
                if (NIL != sequence_var) {
                    formula = strip_sequence_var(formula);
                }
                if (formula.isAtom()) {
                    result = formula;
                } else {
                    if (NIL != el_negation_p(formula)) {
                        result = make_unary_formula(cycl_utilities.formula_operator(formula), com.cyc.cycjava.cycl.uncanonicalizer.undo_variables(cycl_utilities.formula_arg1(formula, UNPROVIDED)));
                    } else {
                        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                            result = make_el_formula(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_VARIABLES), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED);
                        } else {
                            if ((NIL != el_universal_p(formula)) || (NIL != el_existential_p(formula))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject quantifier = unmake_binary_formula(formula);
                                    SubLObject var = thread.secondMultipleValue();
                                    SubLObject sub_formula = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject ununique_var = com.cyc.cycjava.cycl.uncanonicalizer.ununiquify_el_var(var);
                                        SubLObject new_sub_formula = com.cyc.cycjava.cycl.uncanonicalizer.undo_variables(sub_formula);
                                        if (NIL == ununique_var) {
                                            result = make_binary_formula(quantifier, var, new_sub_formula);
                                        } else {
                                            if (ununique_var.eql(var)) {
                                                result = make_binary_formula(quantifier, var, new_sub_formula);
                                            } else {
                                                if (NIL != list_utilities.tree_find(ununique_var, new_sub_formula, UNPROVIDED, UNPROVIDED)) {
                                                    result = make_binary_formula(quantifier, var, new_sub_formula);
                                                } else {
                                                    result = subst(ununique_var, var, make_binary_formula(quantifier, var, new_sub_formula), UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (NIL != el_bounded_existential_p(formula)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject quantifier = unmake_ternary_formula(formula);
                                        SubLObject n = thread.secondMultipleValue();
                                        SubLObject var = thread.thirdMultipleValue();
                                        SubLObject sub_formula = thread.fourthMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject ununique_var = com.cyc.cycjava.cycl.uncanonicalizer.ununiquify_el_var(var);
                                            SubLObject new_sub_formula = com.cyc.cycjava.cycl.uncanonicalizer.undo_variables(sub_formula);
                                            if (NIL == ununique_var) {
                                                result = make_ternary_formula(quantifier, n, var, new_sub_formula);
                                            } else {
                                                if (ununique_var.eql(var)) {
                                                    result = make_ternary_formula(quantifier, n, var, new_sub_formula);
                                                } else {
                                                    if (NIL != list_utilities.tree_find(ununique_var, new_sub_formula, UNPROVIDED, UNPROVIDED)) {
                                                        result = make_ternary_formula(quantifier, n, var, new_sub_formula);
                                                    } else {
                                                        result = subst(ununique_var, var, make_ternary_formula(quantifier, n, var, new_sub_formula), UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != atomic_sentenceP(formula)) {
                                        result = make_el_formula(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_VARIABLES), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED);
                                    } else {
                                        if (NIL != scoping_relation_expressionP(formula)) {
                                            {
                                                SubLObject scoping_args = kb_accessors.scoping_args(cycl_utilities.formula_operator(formula), UNPROVIDED);
                                                SubLObject position = ZERO_INTEGER;
                                                SubLObject new_formula = NIL;
                                                {
                                                    SubLObject cdolist_list_var = formula;
                                                    SubLObject arg = NIL;
                                                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                        if (NIL != subl_promotions.memberP(position, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                            new_formula = cons(arg, new_formula);
                                                        } else {
                                                            new_formula = cons(com.cyc.cycjava.cycl.uncanonicalizer.undo_variables(arg), new_formula);
                                                        }
                                                        position = add(position, ONE_INTEGER);
                                                    }
                                                }
                                                new_formula = nreverse(new_formula);
                                                position = ZERO_INTEGER;
                                                {
                                                    SubLObject cdolist_list_var = formula;
                                                    SubLObject arg = NIL;
                                                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                                        if (NIL != subl_promotions.memberP(position, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                                            {
                                                                SubLObject ununique_var = com.cyc.cycjava.cycl.uncanonicalizer.ununiquify_el_var(arg);
                                                                if (NIL == ununique_var) {
                                                                } else {
                                                                    if (ununique_var.eql(arg)) {
                                                                    } else {
                                                                        if (NIL != list_utilities.tree_find(ununique_var, new_formula, UNPROVIDED, UNPROVIDED)) {
                                                                        } else {
                                                                            new_formula = subst(ununique_var, arg, new_formula, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        position = add(position, ONE_INTEGER);
                                                    }
                                                }
                                                result = new_formula;
                                            }
                                        } else {
                                            if (NIL != relation_expressionP(formula)) {
                                                result = make_el_formula(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_VARIABLES), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED);
                                            } else {
                                                el_error(FOUR_INTEGER, $str_alt64$_S_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED);
                                                result = formula;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != sequence_var) {
                    result = nadd_sequence_var_to_end(sequence_var, result);
                }
                return result;
            }
        }
    }

    public static SubLObject undo_variables(SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sequence_var = sequence_var(formula, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL != sequence_var) {
            formula = strip_sequence_var(formula);
        }
        if (formula.isAtom()) {
            result = formula;
        } else
            if (NIL != el_negation_p(formula)) {
                result = make_unary_formula(cycl_utilities.formula_operator(formula), undo_variables(cycl_utilities.formula_arg1(formula, UNPROVIDED)));
            } else
                if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                    result = make_el_formula(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_VARIABLES), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED);
                } else
                    if ((NIL != el_universal_p(formula)) || (NIL != el_existential_p(formula))) {
                        thread.resetMultipleValues();
                        final SubLObject quantifier = unmake_binary_formula(formula);
                        final SubLObject var = thread.secondMultipleValue();
                        final SubLObject sub_formula = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject ununique_var = ununiquify_el_var(var);
                        final SubLObject new_sub_formula = undo_variables(sub_formula);
                        if (NIL == ununique_var) {
                            result = make_binary_formula(quantifier, var, new_sub_formula);
                        } else
                            if (ununique_var.eql(var)) {
                                result = make_binary_formula(quantifier, var, new_sub_formula);
                            } else
                                if (NIL != list_utilities.tree_find(ununique_var, new_sub_formula, UNPROVIDED, UNPROVIDED)) {
                                    result = make_binary_formula(quantifier, var, new_sub_formula);
                                } else {
                                    result = subst(ununique_var, var, make_binary_formula(quantifier, var, new_sub_formula), UNPROVIDED, UNPROVIDED);
                                }


                    } else
                        if (NIL != el_bounded_existential_p(formula)) {
                            thread.resetMultipleValues();
                            final SubLObject quantifier = unmake_ternary_formula(formula);
                            final SubLObject n = thread.secondMultipleValue();
                            final SubLObject var2 = thread.thirdMultipleValue();
                            final SubLObject sub_formula2 = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject ununique_var2 = ununiquify_el_var(var2);
                            final SubLObject new_sub_formula2 = undo_variables(sub_formula2);
                            if (NIL == ununique_var2) {
                                result = make_ternary_formula(quantifier, n, var2, new_sub_formula2);
                            } else
                                if (ununique_var2.eql(var2)) {
                                    result = make_ternary_formula(quantifier, n, var2, new_sub_formula2);
                                } else
                                    if (NIL != list_utilities.tree_find(ununique_var2, new_sub_formula2, UNPROVIDED, UNPROVIDED)) {
                                        result = make_ternary_formula(quantifier, n, var2, new_sub_formula2);
                                    } else {
                                        result = subst(ununique_var2, var2, make_ternary_formula(quantifier, n, var2, new_sub_formula2), UNPROVIDED, UNPROVIDED);
                                    }


                        } else
                            if (NIL != atomic_sentenceP(formula)) {
                                result = make_el_formula(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_VARIABLES), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED);
                            } else
                                if (NIL != scoping_relation_expressionP(formula)) {
                                    final SubLObject scoping_args = kb_accessors.scoping_args(cycl_utilities.formula_operator(formula), UNPROVIDED);
                                    SubLObject position = ZERO_INTEGER;
                                    SubLObject new_formula = NIL;
                                    SubLObject cdolist_list_var = formula;
                                    SubLObject arg = NIL;
                                    arg = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != subl_promotions.memberP(position, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                            new_formula = cons(arg, new_formula);
                                        } else {
                                            new_formula = cons(undo_variables(arg), new_formula);
                                        }
                                        position = add(position, ONE_INTEGER);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arg = cdolist_list_var.first();
                                    } 
                                    new_formula = nreverse(new_formula);
                                    position = ZERO_INTEGER;
                                    cdolist_list_var = formula;
                                    arg = NIL;
                                    arg = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != subl_promotions.memberP(position, scoping_args, UNPROVIDED, UNPROVIDED)) {
                                            final SubLObject ununique_var3 = ununiquify_el_var(arg);
                                            if (NIL != ununique_var3) {
                                                if (!ununique_var3.eql(arg)) {
                                                    if (NIL == list_utilities.tree_find(ununique_var3, new_formula, UNPROVIDED, UNPROVIDED)) {
                                                        new_formula = subst(ununique_var3, arg, new_formula, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                        position = add(position, ONE_INTEGER);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        arg = cdolist_list_var.first();
                                    } 
                                    result = new_formula;
                                } else
                                    if (NIL != relation_expressionP(formula)) {
                                        result = make_el_formula(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_VARIABLES), cycl_utilities.formula_args(formula, UNPROVIDED)), UNPROVIDED);
                                    } else {
                                        el_error(FOUR_INTEGER, $str64$_S_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED);
                                        result = formula;
                                    }







        if (NIL != sequence_var) {
            result = nadd_sequence_var_to_end(sequence_var, result);
        }
        return result;
    }

    /**
     * Unremove all universals not referenced in skolem functions
     */
    @LispMethod(comment = "Unremove all universals not referenced in skolem functions")
    public static final SubLObject unremove_universals_alt(SubLObject formula) {
        {
            SubLObject new_formula = com.cyc.cycjava.cycl.uncanonicalizer.remove_truesentence_refs(formula);
            if (!formula.equal(new_formula)) {
                formula = clausifier.do_negations(new_formula);
            }
            formula = com.cyc.cycjava.cycl.uncanonicalizer.unremove_universals_int(formula);
        }
        return formula;
    }

    @LispMethod(comment = "Unremove all universals not referenced in skolem functions")
    public static SubLObject unremove_universals(SubLObject formula) {
        final SubLObject new_formula = remove_truesentence_refs(formula);
        if (!formula.equal(new_formula)) {
            formula = clausifier.do_negations(new_formula);
        }
        formula = unremove_universals_int(formula);
        return formula;
    }/**
     * Unremove all universals not referenced in skolem functions
     */


    /**
     * Unremove all totally free variables (those that are not referenced by skolem terms)
     */
    @LispMethod(comment = "Unremove all totally free variables (those that are not referenced by skolem terms)")
    public static final SubLObject unremove_universals_int_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (formula.isAtom()) {
                return formula;
            } else {
                if (NIL == $vars_to_universalize$.getDynamicValue(thread)) {
                    return formula;
                } else {
                    if (NIL == czer_vars.$unremove_universalsP$.getDynamicValue(thread)) {
                        return formula;
                    } else {
                        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                            {
                                SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
                                SubLObject inter_arg_universals = com.cyc.cycjava.cycl.uncanonicalizer.inter_formula_terms($vars_to_universalize$.getDynamicValue(thread), args, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var = inter_arg_universals;
                                SubLObject uni_var = NIL;
                                for (uni_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , uni_var = cdolist_list_var.first()) {
                                    formula = list($$forAll, uni_var, formula);
                                }
                                $vars_to_universalize$.setDynamicValue(set_difference($vars_to_universalize$.getDynamicValue(thread), inter_arg_universals, UNPROVIDED, UNPROVIDED), thread);
                                if (NIL != inter_arg_universals) {
                                    return com.cyc.cycjava.cycl.uncanonicalizer.unremove_universals_int(formula);
                                } else {
                                    if (NIL != $vars_to_universalize$.getDynamicValue(thread)) {
                                        return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNREMOVE_UNIVERSALS_INT), args));
                                    } else {
                                        return formula;
                                    }
                                }
                            }
                        } else {
                            if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
                                {
                                    SubLObject datum = formula;
                                    SubLObject current = datum;
                                    SubLObject quantifier = NIL;
                                    SubLObject var = NIL;
                                    SubLObject subsent = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt58);
                                    quantifier = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt58);
                                    var = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt58);
                                    subsent = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        return list(quantifier, var, com.cyc.cycjava.cycl.uncanonicalizer.unremove_universals_int(subsent));
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt58);
                                    }
                                }
                            } else {
                                if (NIL != el_bounded_existential_p(formula)) {
                                    {
                                        SubLObject datum = formula;
                                        SubLObject current = datum;
                                        SubLObject quantifier = NIL;
                                        SubLObject n = NIL;
                                        SubLObject var = NIL;
                                        SubLObject subsent = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        quantifier = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        n = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        var = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        subsent = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            return list(quantifier, n, var, com.cyc.cycjava.cycl.uncanonicalizer.unremove_universals_int(subsent));
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt59);
                                        }
                                    }
                                } else {
                                    if (NIL != literalP(formula)) {
                                        {
                                            SubLObject cdolist_list_var = $vars_to_universalize$.getDynamicValue(thread);
                                            SubLObject uni_var = NIL;
                                            for (uni_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , uni_var = cdolist_list_var.first()) {
                                                if (NIL != list_utilities.tree_find(uni_var, formula, UNPROVIDED, UNPROVIDED)) {
                                                    formula = list($$forAll, uni_var, formula);
                                                    $vars_to_universalize$.setDynamicValue(remove(uni_var, $vars_to_universalize$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                                }
                                            }
                                        }
                                        return formula;
                                    } else {
                                        if (NIL != el_exception_p(formula)) {
                                            return formula;
                                        } else {
                                            el_error(THREE_INTEGER, $str_alt61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
                                            return formula;
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
    }

    @LispMethod(comment = "Unremove all totally free variables (those that are not referenced by skolem terms)")
    public static SubLObject unremove_universals_int(SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula.isAtom()) {
            return formula;
        }
        if (NIL == $vars_to_universalize$.getDynamicValue(thread)) {
            return formula;
        }
        if (NIL == czer_vars.$unremove_universalsP$.getDynamicValue(thread)) {
            return formula;
        }
        if ((NIL == el_conjunction_p(formula)) && (NIL == el_disjunction_p(formula))) {
            if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
                SubLObject current;
                final SubLObject datum = current = formula;
                SubLObject quantifier = NIL;
                SubLObject var = NIL;
                SubLObject subsent = NIL;
                destructuring_bind_must_consp(current, datum, $list58);
                quantifier = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list58);
                var = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list58);
                subsent = current.first();
                current = current.rest();
                if (NIL == current) {
                    return list(quantifier, var, unremove_universals_int(subsent));
                }
                cdestructuring_bind_error(datum, $list58);
            } else
                if (NIL != el_bounded_existential_p(formula)) {
                    SubLObject current;
                    final SubLObject datum = current = formula;
                    SubLObject quantifier = NIL;
                    SubLObject n = NIL;
                    SubLObject var2 = NIL;
                    SubLObject subsent2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list59);
                    quantifier = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list59);
                    n = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list59);
                    var2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list59);
                    subsent2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return list(quantifier, n, var2, unremove_universals_int(subsent2));
                    }
                    cdestructuring_bind_error(datum, $list59);
                } else {
                    if (NIL != literalP(formula)) {
                        SubLObject cdolist_list_var = $vars_to_universalize$.getDynamicValue(thread);
                        SubLObject uni_var = NIL;
                        uni_var = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != list_utilities.tree_find(uni_var, formula, UNPROVIDED, UNPROVIDED)) {
                                formula = list($$forAll, uni_var, formula);
                                $vars_to_universalize$.setDynamicValue(remove(uni_var, $vars_to_universalize$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            uni_var = cdolist_list_var.first();
                        } 
                        return formula;
                    }
                    if (NIL != el_exception_p(formula)) {
                        return formula;
                    }
                    el_error(THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
                    return formula;
                }

            return NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject cdolist_list_var2;
        final SubLObject inter_arg_universals = cdolist_list_var2 = inter_formula_terms($vars_to_universalize$.getDynamicValue(thread), args, UNPROVIDED, UNPROVIDED);
        SubLObject uni_var2 = NIL;
        uni_var2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            formula = list($$forAll, uni_var2, formula);
            cdolist_list_var2 = cdolist_list_var2.rest();
            uni_var2 = cdolist_list_var2.first();
        } 
        $vars_to_universalize$.setDynamicValue(set_difference($vars_to_universalize$.getDynamicValue(thread), inter_arg_universals, UNPROVIDED, UNPROVIDED), thread);
        if (NIL != inter_arg_universals) {
            return unremove_universals_int(formula);
        }
        if (NIL != $vars_to_universalize$.getDynamicValue(thread)) {
            return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNREMOVE_UNIVERSALS_INT), args));
        }
        return formula;
    }/**
     * Unremove all totally free variables (those that are not referenced by skolem terms)
     */


    /**
     * return elements of TERMS referenced by more than one element of FORMULAS?
     */
    @LispMethod(comment = "return elements of TERMS referenced by more than one element of FORMULAS?")
    public static final SubLObject inter_formula_terms_alt(SubLObject terms, SubLObject formulas, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject inter_formula_terms = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject referenced_onceP = NIL;
                    SubLObject referenced_twiceP = NIL;
                    if (NIL == referenced_twiceP) {
                        {
                            SubLObject csome_list_var = formulas;
                            SubLObject formula = NIL;
                            for (formula = csome_list_var.first(); !((NIL != referenced_twiceP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , formula = csome_list_var.first()) {
                                if (NIL != list_utilities.tree_find(v_term, formula, test, key)) {
                                    if (NIL != referenced_onceP) {
                                        referenced_twiceP = T;
                                    } else {
                                        referenced_onceP = T;
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != referenced_twiceP) {
                        inter_formula_terms = cons(v_term, inter_formula_terms);
                    }
                }
            }
            return inter_formula_terms;
        }
    }

    @LispMethod(comment = "return elements of TERMS referenced by more than one element of FORMULAS?")
    public static SubLObject inter_formula_terms(final SubLObject terms, final SubLObject formulas, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject inter_formula_terms = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject referenced_onceP = NIL;
            SubLObject referenced_twiceP = NIL;
            if (NIL == referenced_twiceP) {
                SubLObject csome_list_var = formulas;
                SubLObject formula = NIL;
                formula = csome_list_var.first();
                while ((NIL == referenced_twiceP) && (NIL != csome_list_var)) {
                    if (NIL != list_utilities.tree_find(v_term, formula, test, key)) {
                        if (NIL != referenced_onceP) {
                            referenced_twiceP = T;
                        } else {
                            referenced_onceP = T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    formula = csome_list_var.first();
                } 
            }
            if (NIL != referenced_twiceP) {
                inter_formula_terms = cons(v_term, inter_formula_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return inter_formula_terms;
    }/**
     * return elements of TERMS referenced by more than one element of FORMULAS?
     */


    /**
     * return elements of SKOLEMS referenced (or whose argument vars are referenced) by more than one element of FORMULAS?
     */
    @LispMethod(comment = "return elements of SKOLEMS referenced (or whose argument vars are referenced) by more than one element of FORMULAS?")
    public static final SubLObject inter_formula_skolems_alt(SubLObject v_skolems, SubLObject formulas) {
        {
            SubLObject inter_formula_skolems = NIL;
            SubLObject cdolist_list_var = v_skolems;
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                {
                    SubLObject skolem_arg_vars = com.cyc.cycjava.cycl.uncanonicalizer.skolem_fn_arg_vars(skolem);
                    SubLObject referenced_onceP = NIL;
                    SubLObject referenced_twiceP = NIL;
                    if (NIL == referenced_twiceP) {
                        {
                            SubLObject csome_list_var = formulas;
                            SubLObject formula = NIL;
                            for (formula = csome_list_var.first(); !((NIL != referenced_twiceP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , formula = csome_list_var.first()) {
                                if ((NIL != list_utilities.tree_find(skolem, formula, symbol_function(EQUAL), UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.uncanonicalizer.some_tree_find(skolem_arg_vars, formula, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL != referenced_onceP) {
                                        referenced_twiceP = T;
                                    } else {
                                        referenced_onceP = T;
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != referenced_twiceP) {
                        inter_formula_skolems = cons(skolem, inter_formula_skolems);
                    }
                }
            }
            return inter_formula_skolems;
        }
    }

    @LispMethod(comment = "return elements of SKOLEMS referenced (or whose argument vars are referenced) by more than one element of FORMULAS?")
    public static SubLObject inter_formula_skolems(final SubLObject v_skolems, final SubLObject formulas) {
        SubLObject inter_formula_skolems = NIL;
        SubLObject cdolist_list_var = v_skolems;
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject skolem_arg_vars = skolem_fn_arg_vars(skolem);
            SubLObject referenced_onceP = NIL;
            SubLObject referenced_twiceP = NIL;
            if (NIL == referenced_twiceP) {
                SubLObject csome_list_var = formulas;
                SubLObject formula = NIL;
                formula = csome_list_var.first();
                while ((NIL == referenced_twiceP) && (NIL != csome_list_var)) {
                    if ((NIL != list_utilities.tree_find(skolem, formula, symbol_function(EQUAL), UNPROVIDED)) || (NIL != some_tree_find(skolem_arg_vars, formula, UNPROVIDED, UNPROVIDED))) {
                        if (NIL != referenced_onceP) {
                            referenced_twiceP = T;
                        } else {
                            referenced_onceP = T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    formula = csome_list_var.first();
                } 
            }
            if (NIL != referenced_twiceP) {
                inter_formula_skolems = cons(skolem, inter_formula_skolems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return inter_formula_skolems;
    }/**
     * return elements of SKOLEMS referenced (or whose argument vars are referenced) by more than one element of FORMULAS?
     */


    public static final SubLObject some_tree_find_alt(SubLObject items, SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject foundP = NIL;
            if (NIL == foundP) {
                {
                    SubLObject csome_list_var = items;
                    SubLObject item = NIL;
                    for (item = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                        foundP = list_utilities.tree_find(item, tree, test, key);
                    }
                }
            }
            return foundP;
        }
    }

    public static SubLObject some_tree_find(final SubLObject items, final SubLObject tree, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var;
            SubLObject item;
            for (csome_list_var = items, item = NIL, item = csome_list_var.first(); (NIL == foundP) && (NIL != csome_list_var); foundP = list_utilities.tree_find(item, tree, test, key) , csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
            }
        }
        return foundP;
    }

    public static final SubLObject unremove_existentials_and_refd_universals_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject formula_15 = com.cyc.cycjava.cycl.uncanonicalizer.undo_skolem_mt(formula, mt);
                SubLObject mt_16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                formula = formula_15;
                mt = mt_16;
            }
            formula = com.cyc.cycjava.cycl.uncanonicalizer.undo_existentials_and_refd_universals(com.cyc.cycjava.cycl.uncanonicalizer.segregate_skolems(formula), UNPROVIDED);
            return values(com.cyc.cycjava.cycl.uncanonicalizer.remove_leading_universals(simplifier.simplify_cycl_sentence(formula, UNPROVIDED)), mt);
        }
    }

    public static SubLObject unremove_existentials_and_refd_universals(SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject formula_$15 = undo_skolem_mt(formula, mt);
        final SubLObject mt_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        formula = formula_$15;
        mt = mt_$16;
        formula = undo_existentials_and_refd_universals(segregate_skolems(formula), UNPROVIDED);
        return values(remove_leading_universals(simplifier.simplify_cycl_sentence(formula, UNPROVIDED)), mt);
    }

    public static final SubLObject undo_skolem_mt_alt(SubLObject formula, SubLObject mt) {
        if (NIL != cycl_utilities.expression_find($$SkolemFunctionFn, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject new_formula = NIL;
                SubLObject cdolist_list_var = cycl_utilities.sentence_args(formula, UNPROVIDED);
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.uncanonicalizer.base_kb_ist_sentenceP(arg)) {
                        new_formula = cons(cycl_utilities.sentence_arg2(arg, UNPROVIDED), new_formula);
                    } else {
                        if (NIL != ist_sentence_p(arg)) {
                            new_formula = cons(arg, new_formula);
                        } else {
                            new_formula = cons(make_ist_sentence(mt, arg), new_formula);
                        }
                    }
                }
                return values(make_conjunction(nreverse(new_formula)), $$BaseKB);
            }
        } else {
            return values(formula, mt);
        }
    }

    public static SubLObject undo_skolem_mt(final SubLObject formula, final SubLObject mt) {
        if (NIL != cycl_utilities.expression_find($$SkolemFunctionFn, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject new_formula = NIL;
            SubLObject cdolist_list_var = cycl_utilities.sentence_args(formula, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != base_kb_ist_sentenceP(arg)) {
                    new_formula = cons(cycl_utilities.sentence_arg2(arg, UNPROVIDED), new_formula);
                } else
                    if (NIL != ist_sentence_p(arg, UNPROVIDED)) {
                        new_formula = cons(arg, new_formula);
                    } else {
                        new_formula = cons(make_ist_sentence(mt, arg), new_formula);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            return values(make_conjunction(nreverse(new_formula)), $$BaseKB);
        }
        return values(formula, mt);
    }

    public static final SubLObject base_kb_ist_sentenceP_alt(SubLObject v_object) {
        return makeBoolean((NIL != ist_sentence_p(v_object)) && (cycl_utilities.sentence_arg1(v_object, UNPROVIDED) == $$BaseKB));
    }

    public static SubLObject base_kb_ist_sentenceP(final SubLObject v_object) {
        return makeBoolean((NIL != ist_sentence_p(v_object, UNPROVIDED)) && cycl_utilities.sentence_arg1(v_object, UNPROVIDED).eql($$BaseKB));
    }

    /**
     * use demorgan's to lift disjuncts independent of skolems,
     * e.g., (and (or (p ?x) (q (skf ?y))) (or (p ?x) (p (skf ?y))))
     * yields (or (p ?x) (and (q (skf ?y)) (p (skf ?y))))
     */
    @LispMethod(comment = "use demorgan\'s to lift disjuncts independent of skolems,\r\ne.g., (and (or (p ?x) (q (skf ?y))) (or (p ?x) (p (skf ?y))))\r\nyields (or (p ?x) (and (q (skf ?y)) (p (skf ?y))))\nuse demorgan\'s to lift disjuncts independent of skolems,\ne.g., (and (or (p ?x) (q (skf ?y))) (or (p ?x) (p (skf ?y))))\nyields (or (p ?x) (and (q (skf ?y)) (p (skf ?y))))")
    public static final SubLObject segregate_skolems_alt(SubLObject formula) {
        {
            SubLObject v_skolems = list_utilities.tree_find_if(symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), formula, UNPROVIDED);
            SubLObject result = NIL;
            if (NIL == v_skolems) {
                return formula;
            } else {
                if (NIL != el_conjunction_p(formula)) {
                    {
                        SubLObject common = NIL;
                        SubLObject failP = NIL;
                        if (NIL == failP) {
                            {
                                SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                                SubLObject conjunct = NIL;
                                for (conjunct = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , conjunct = csome_list_var.first()) {
                                    if (NIL != el_disjunction_p(conjunct)) {
                                        if (NIL != common) {
                                            common = intersection(common, cycl_utilities.formula_args(conjunct, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                        } else {
                                            common = cycl_utilities.formula_args(conjunct, UNPROVIDED);
                                        }
                                    } else {
                                        failP = T;
                                    }
                                }
                            }
                        }
                        if (NIL == failP) {
                            {
                                SubLObject cdolist_list_var = common;
                                SubLObject literal = NIL;
                                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                    if (NIL != list_utilities.tree_find_if(symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), literal, UNPROVIDED)) {
                                        common = remove(literal, common, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                            if (NIL != common) {
                                {
                                    SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                                    SubLObject conjunct = NIL;
                                    for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                        result = cons(simplifier.disjoin(set_difference(cycl_utilities.formula_args(conjunct, UNPROVIDED), common, symbol_function(EQUAL), UNPROVIDED), UNPROVIDED), result);
                                    }
                                }
                                result = simplifier.simplify_cycl_sentence(simplifier.disjoin(append(common, list(simplifier.conjoin(reverse(result), UNPROVIDED))), UNPROVIDED), UNPROVIDED);
                            }
                        }
                    }
                    if (NIL != result) {
                        return result;
                    } else {
                        return formula;
                    }
                } else {
                    return formula;
                }
            }
        }
    }

    @LispMethod(comment = "use demorgan\'s to lift disjuncts independent of skolems,\r\ne.g., (and (or (p ?x) (q (skf ?y))) (or (p ?x) (p (skf ?y))))\r\nyields (or (p ?x) (and (q (skf ?y)) (p (skf ?y))))\nuse demorgan\'s to lift disjuncts independent of skolems,\ne.g., (and (or (p ?x) (q (skf ?y))) (or (p ?x) (p (skf ?y))))\nyields (or (p ?x) (and (q (skf ?y)) (p (skf ?y))))")
    public static SubLObject segregate_skolems(final SubLObject formula) {
        final SubLObject v_skolems = list_utilities.tree_find_if(symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), formula, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == v_skolems) {
            return formula;
        }
        if (NIL == el_conjunction_p(formula)) {
            return formula;
        }
        SubLObject common = NIL;
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject conjunct = NIL;
            conjunct = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL != el_disjunction_p(conjunct)) {
                    if (NIL != common) {
                        common = intersection(common, cycl_utilities.formula_args(conjunct, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                    } else {
                        common = cycl_utilities.formula_args(conjunct, UNPROVIDED);
                    }
                } else {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                conjunct = csome_list_var.first();
            } 
        }
        if (NIL == failP) {
            SubLObject cdolist_list_var = common;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.tree_find_if(symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), literal, UNPROVIDED)) {
                    common = remove(literal, common, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            if (NIL != common) {
                cdolist_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                SubLObject conjunct = NIL;
                conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(simplifier.disjoin(set_difference(cycl_utilities.formula_args(conjunct, UNPROVIDED), common, symbol_function(EQUAL), UNPROVIDED), UNPROVIDED), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                } 
                result = simplifier.simplify_cycl_sentence(simplifier.disjoin(append(common, list(simplifier.conjoin(reverse(result), UNPROVIDED))), UNPROVIDED), UNPROVIDED);
            }
        }
        if (NIL != result) {
            return result;
        }
        return formula;
    }/**
     * use demorgan's to lift disjuncts independent of skolems,
     * e.g., (and (or (p ?x) (q (skf ?y))) (or (p ?x) (p (skf ?y))))
     * yields (or (p ?x) (and (q (skf ?y)) (p (skf ?y))))
     */


    /**
     * Unremove existentials and universals that are referenced by skolem functions
     */
    @LispMethod(comment = "Unremove existentials and universals that are referenced by skolem functions")
    public static final SubLObject undo_existentials_and_refd_universals_alt(SubLObject formula, SubLObject vars) {
        if (vars == UNPROVIDED) {
            vars = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (formula.isAtom()) {
            return formula;
        } else {
            if (NIL == list_utilities.tree_find_if(symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), formula, UNPROVIDED)) {
                return formula;
            } else {
                if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                    {
                        SubLObject v_skolems = remove_duplicates(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
                        SubLObject inter_arg_skolems = com.cyc.cycjava.cycl.uncanonicalizer.inter_formula_skolems(v_skolems, args);
                        SubLObject placeholder_vars = NIL;
                        if (NIL != inter_arg_skolems) {
                            inter_arg_skolems = com.cyc.cycjava.cycl.uncanonicalizer.order_skolems_inner_to_outer(inter_arg_skolems);
                            {
                                SubLObject cdolist_list_var = inter_arg_skolems;
                                SubLObject skolem = NIL;
                                for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                                    {
                                        SubLObject test_arg_skolemP = NIL;
                                        SubLObject test_most_nested_inter_arg_skolemP = NIL;
                                        if (NIL == test_most_nested_inter_arg_skolemP) {
                                            {
                                                SubLObject csome_list_var = args;
                                                SubLObject arg = NIL;
                                                for (arg = csome_list_var.first(); !((NIL != test_most_nested_inter_arg_skolemP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                                    if (NIL != list_utilities.tree_find(skolem, arg, symbol_function(EQUAL), UNPROVIDED)) {
                                                        if (NIL != test_arg_skolemP) {
                                                            test_most_nested_inter_arg_skolemP = T;
                                                        } else {
                                                            test_arg_skolemP = T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL == test_most_nested_inter_arg_skolemP) {
                                            {
                                                SubLObject cdolist_list_var_17 = com.cyc.cycjava.cycl.uncanonicalizer.skolem_fn_arg_vars(skolem);
                                                SubLObject var = NIL;
                                                for (var = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , var = cdolist_list_var_17.first()) {
                                                    placeholder_vars = cons(var, placeholder_vars);
                                                    com.cyc.cycjava.cycl.uncanonicalizer.add_universal_var_placeholder(var);
                                                }
                                            }
                                            inter_arg_skolems = remove(skolem, inter_arg_skolems, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = inter_arg_skolems;
                            SubLObject skolem = NIL;
                            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                                formula = com.cyc.cycjava.cycl.uncanonicalizer.init_existentialize_formula(skolem, formula);
                            }
                        }
                        if (NIL != inter_arg_skolems) {
                            args = cycl_utilities.formula_args(formula, UNPROVIDED);
                        }
                        if (NIL != v_skolems) {
                            formula = cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_EXISTENTIALS_AND_REFD_UNIVERSALS), args));
                        }
                        {
                            SubLObject cdolist_list_var = placeholder_vars;
                            SubLObject var = NIL;
                            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.uncanonicalizer.check_for_universal_var_placeholder(var)) {
                                    formula = list($$forAll, var, formula);
                                }
                                com.cyc.cycjava.cycl.uncanonicalizer.remove_universal_var_placeholder(var);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.uncanonicalizer.order_skolems_inner_to_outer(inter_arg_skolems);
                            SubLObject skolem = NIL;
                            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                                formula = com.cyc.cycjava.cycl.uncanonicalizer.existentialize_formula(skolem, formula);
                                {
                                    SubLObject universal_vars = com.cyc.cycjava.cycl.uncanonicalizer.remove_skolem_from_universal_vars_to_skolem(skolem);
                                    SubLObject cdolist_list_var_18 = universal_vars;
                                    SubLObject uni_var = NIL;
                                    for (uni_var = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , uni_var = cdolist_list_var_18.first()) {
                                        formula = list($$forAll, uni_var, formula);
                                    }
                                }
                            }
                        }
                        return formula;
                    }
                } else {
                    if (NIL != el_existential_p(formula)) {
                        {
                            SubLObject datum = formula;
                            SubLObject current = datum;
                            SubLObject quantifier = NIL;
                            SubLObject var = NIL;
                            SubLObject subsent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt58);
                            quantifier = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt58);
                            var = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt58);
                            subsent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                return list(quantifier, var, com.cyc.cycjava.cycl.uncanonicalizer.undo_existentials_and_refd_universals(subsent, UNPROVIDED));
                            } else {
                                cdestructuring_bind_error(datum, $list_alt58);
                            }
                        }
                    } else {
                        if (NIL != el_universal_p(formula)) {
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.uncanonicalizer.order_skolems_inner_to_outer(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED));
                                SubLObject skolem = NIL;
                                for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                                    formula = com.cyc.cycjava.cycl.uncanonicalizer.existentialize_formula(skolem, formula);
                                    {
                                        SubLObject universal_vars = com.cyc.cycjava.cycl.uncanonicalizer.remove_skolem_from_universal_vars_to_skolem(skolem);
                                        SubLObject cdolist_list_var_19 = universal_vars;
                                        SubLObject uni_var = NIL;
                                        for (uni_var = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , uni_var = cdolist_list_var_19.first()) {
                                            formula = list($$forAll, uni_var, formula);
                                        }
                                    }
                                }
                            }
                            return formula;
                        } else {
                            if (NIL != el_exception_p(formula)) {
                                return formula;
                            } else {
                                if (NIL != el_bounded_existential_p(formula)) {
                                    {
                                        SubLObject datum = formula;
                                        SubLObject current = datum;
                                        SubLObject quantifier = NIL;
                                        SubLObject n = NIL;
                                        SubLObject var = NIL;
                                        SubLObject subsent = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        quantifier = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        n = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        var = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        subsent = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            return list(quantifier, n, var, com.cyc.cycjava.cycl.uncanonicalizer.undo_existentials_and_refd_universals(subsent, UNPROVIDED));
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt59);
                                        }
                                    }
                                } else {
                                    if (NIL != literalP(formula)) {
                                        {
                                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.uncanonicalizer.order_skolems_inner_to_outer(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED));
                                            SubLObject skolem = NIL;
                                            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                                                formula = com.cyc.cycjava.cycl.uncanonicalizer.existentialize_formula(skolem, formula);
                                                {
                                                    SubLObject universal_vars = com.cyc.cycjava.cycl.uncanonicalizer.remove_skolem_from_universal_vars_to_skolem(skolem);
                                                    SubLObject cdolist_list_var_20 = universal_vars;
                                                    SubLObject uni_var = NIL;
                                                    for (uni_var = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , uni_var = cdolist_list_var_20.first()) {
                                                        formula = list($$forAll, uni_var, formula);
                                                    }
                                                }
                                            }
                                        }
                                        return formula;
                                    } else {
                                        el_error(THREE_INTEGER, $str_alt61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
                                        return formula;
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

    @LispMethod(comment = "Unremove existentials and universals that are referenced by skolem functions")
    public static SubLObject undo_existentials_and_refd_universals(SubLObject formula, SubLObject vars) {
        if (vars == UNPROVIDED) {
            vars = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (formula.isAtom()) {
            return formula;
        }
        if (NIL == list_utilities.tree_find_if(symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), formula, UNPROVIDED)) {
            return formula;
        }
        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
            final SubLObject v_skolems = remove_duplicates(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject inter_arg_skolems = inter_formula_skolems(v_skolems, args);
            SubLObject placeholder_vars = NIL;
            if (NIL != inter_arg_skolems) {
                SubLObject cdolist_list_var;
                inter_arg_skolems = cdolist_list_var = order_skolems_inner_to_outer(inter_arg_skolems);
                SubLObject skolem = NIL;
                skolem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject test_arg_skolemP = NIL;
                    SubLObject test_most_nested_inter_arg_skolemP = NIL;
                    if (NIL == test_most_nested_inter_arg_skolemP) {
                        SubLObject csome_list_var = args;
                        SubLObject arg = NIL;
                        arg = csome_list_var.first();
                        while ((NIL == test_most_nested_inter_arg_skolemP) && (NIL != csome_list_var)) {
                            if (NIL != list_utilities.tree_find(skolem, arg, symbol_function(EQUAL), UNPROVIDED)) {
                                if (NIL != test_arg_skolemP) {
                                    test_most_nested_inter_arg_skolemP = T;
                                } else {
                                    test_arg_skolemP = T;
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            arg = csome_list_var.first();
                        } 
                    }
                    if (NIL == test_most_nested_inter_arg_skolemP) {
                        SubLObject cdolist_list_var_$17 = skolem_fn_arg_vars(skolem);
                        SubLObject var = NIL;
                        var = cdolist_list_var_$17.first();
                        while (NIL != cdolist_list_var_$17) {
                            placeholder_vars = cons(var, placeholder_vars);
                            add_universal_var_placeholder(var);
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            var = cdolist_list_var_$17.first();
                        } 
                        inter_arg_skolems = remove(skolem, inter_arg_skolems, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    skolem = cdolist_list_var.first();
                } 
            }
            SubLObject cdolist_list_var = inter_arg_skolems;
            SubLObject skolem = NIL;
            skolem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                formula = init_existentialize_formula(skolem, formula);
                cdolist_list_var = cdolist_list_var.rest();
                skolem = cdolist_list_var.first();
            } 
            if (NIL != inter_arg_skolems) {
                args = cycl_utilities.formula_args(formula, UNPROVIDED);
            }
            if (NIL != v_skolems) {
                formula = cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_EXISTENTIALS_AND_REFD_UNIVERSALS), args));
            }
            cdolist_list_var = placeholder_vars;
            SubLObject var2 = NIL;
            var2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != check_for_universal_var_placeholder(var2)) {
                    formula = list($$forAll, var2, formula);
                }
                remove_universal_var_placeholder(var2);
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
            } 
            cdolist_list_var = order_skolems_inner_to_outer(inter_arg_skolems);
            skolem = NIL;
            skolem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                formula = existentialize_formula(skolem, formula);
                SubLObject cdolist_list_var_$18;
                final SubLObject universal_vars = cdolist_list_var_$18 = remove_skolem_from_universal_vars_to_skolem(skolem);
                SubLObject uni_var = NIL;
                uni_var = cdolist_list_var_$18.first();
                while (NIL != cdolist_list_var_$18) {
                    formula = list($$forAll, uni_var, formula);
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    uni_var = cdolist_list_var_$18.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                skolem = cdolist_list_var.first();
            } 
            return formula;
        }
        if (NIL != el_existential_p(formula)) {
            SubLObject current;
            final SubLObject datum = current = formula;
            SubLObject quantifier = NIL;
            SubLObject var3 = NIL;
            SubLObject subsent = NIL;
            destructuring_bind_must_consp(current, datum, $list58);
            quantifier = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list58);
            var3 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list58);
            subsent = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(quantifier, var3, undo_existentials_and_refd_universals(subsent, UNPROVIDED));
            }
            cdestructuring_bind_error(datum, $list58);
        } else {
            if (NIL != el_universal_p(formula)) {
                SubLObject cdolist_list_var2 = order_skolems_inner_to_outer(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED));
                SubLObject skolem2 = NIL;
                skolem2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    formula = existentialize_formula(skolem2, formula);
                    SubLObject cdolist_list_var_$19;
                    final SubLObject universal_vars2 = cdolist_list_var_$19 = remove_skolem_from_universal_vars_to_skolem(skolem2);
                    SubLObject uni_var2 = NIL;
                    uni_var2 = cdolist_list_var_$19.first();
                    while (NIL != cdolist_list_var_$19) {
                        formula = list($$forAll, uni_var2, formula);
                        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                        uni_var2 = cdolist_list_var_$19.first();
                    } 
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    skolem2 = cdolist_list_var2.first();
                } 
                return formula;
            }
            if (NIL != el_exception_p(formula)) {
                return formula;
            }
            if (NIL != el_bounded_existential_p(formula)) {
                SubLObject current;
                final SubLObject datum = current = formula;
                SubLObject quantifier = NIL;
                SubLObject n = NIL;
                SubLObject var4 = NIL;
                SubLObject subsent2 = NIL;
                destructuring_bind_must_consp(current, datum, $list59);
                quantifier = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list59);
                n = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list59);
                var4 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list59);
                subsent2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    return list(quantifier, n, var4, undo_existentials_and_refd_universals(subsent2, UNPROVIDED));
                }
                cdestructuring_bind_error(datum, $list59);
            } else {
                if (NIL != literalP(formula)) {
                    SubLObject cdolist_list_var2 = order_skolems_inner_to_outer(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED));
                    SubLObject skolem2 = NIL;
                    skolem2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        formula = existentialize_formula(skolem2, formula);
                        SubLObject cdolist_list_var_$20;
                        final SubLObject universal_vars2 = cdolist_list_var_$20 = remove_skolem_from_universal_vars_to_skolem(skolem2);
                        SubLObject uni_var2 = NIL;
                        uni_var2 = cdolist_list_var_$20.first();
                        while (NIL != cdolist_list_var_$20) {
                            formula = list($$forAll, uni_var2, formula);
                            cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                            uni_var2 = cdolist_list_var_$20.first();
                        } 
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        skolem2 = cdolist_list_var2.first();
                    } 
                    return formula;
                }
                el_error(THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
                return formula;
            }
        }
        return NIL;
    }/**
     * Unremove existentials and universals that are referenced by skolem functions
     */


    /**
     * Just replace the unreified skolem term with the skolem-function-variable for now
     */
    @LispMethod(comment = "Just replace the unreified skolem term with the skolem-function-variable for now")
    public static final SubLObject init_existentialize_formula_alt(SubLObject existential_term, SubLObject formula) {
        {
            SubLObject sk_var = skolems.skolem_function_var(existential_term);
            return subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED);
        }
    }

    @LispMethod(comment = "Just replace the unreified skolem term with the skolem-function-variable for now")
    public static SubLObject init_existentialize_formula(final SubLObject existential_term, final SubLObject formula) {
        final SubLObject sk_var = skolems.skolem_function_var(existential_term);
        return subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED);
    }/**
     * Just replace the unreified skolem term with the skolem-function-variable for now
     */


    public static final SubLObject existentialize_formula_alt(SubLObject existential_term, SubLObject formula) {
        {
            SubLObject sk_var = skolems.skolem_function_var(existential_term);
            SubLObject sk_number = skolems.skolem_number(existential_term);
            if (NIL == sk_number) {
                return list($$thereExists, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
            } else {
                if (NIL != el_formula_with_operator_p(sk_number, $$IntervalMinFn)) {
                    {
                        SubLObject min = cycl_utilities.nat_arg1(sk_number, UNPROVIDED);
                        return list($$thereExistAtLeast, min, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                    }
                } else {
                    if (NIL != el_formula_with_operator_p(sk_number, $$IntervalMaxFn)) {
                        {
                            SubLObject max = cycl_utilities.nat_arg1(sk_number, UNPROVIDED);
                            return list($$thereExistAtMost, max, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                        }
                    } else {
                        if (NIL != at_defns.quiet_has_typeP(sk_number, $$Integer, UNPROVIDED)) {
                            return list($$thereExistExactly, sk_number, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                        } else {
                            if ((((NIL != kb_control_vars.quant_kb_loaded_p()) && ((NIL != collection_defns.ibqeP(sk_number, UNPROVIDED)) || (sk_number.isCons() && (sk_number.first() == $$Unity)))) && sk_number.isList()) && THREE_INTEGER.numE(length(sk_number))) {
                                {
                                    SubLObject datum = sk_number;
                                    SubLObject current = datum;
                                    SubLObject unit = NIL;
                                    SubLObject min = NIL;
                                    SubLObject max = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt78);
                                    unit = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt78);
                                    min = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt78);
                                    max = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (unit == $$Unity) {
                                            if ((max == $$PlusInfinity) && (NIL != at_defns.quiet_has_typeP(min, $$Integer, UNPROVIDED))) {
                                                return list($$thereExistAtLeast, min, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                                            } else {
                                                if ((min == ZERO_INTEGER) && (NIL != at_defns.quiet_has_typeP(max, $$Integer, UNPROVIDED))) {
                                                    return list($$thereExistAtMost, max, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                                                } else {
                                                    return list($$thereExistExactly, sk_number, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt78);
                                    }
                                }
                            } else {
                                return list($$thereExistExactly, sk_number, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject existentialize_formula(final SubLObject existential_term, final SubLObject formula) {
        final SubLObject sk_var = skolems.skolem_function_var(existential_term);
        final SubLObject sk_number = skolems.skolem_number(existential_term);
        if (NIL == sk_number) {
            return list($$thereExists, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
        }
        if (NIL != el_formula_with_operator_p(sk_number, $$IntervalMinFn)) {
            final SubLObject min = cycl_utilities.nat_arg1(sk_number, UNPROVIDED);
            return list($$thereExistAtLeast, min, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
        }
        if (NIL != el_formula_with_operator_p(sk_number, $$IntervalMaxFn)) {
            final SubLObject max = cycl_utilities.nat_arg1(sk_number, UNPROVIDED);
            return list($$thereExistAtMost, max, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
        }
        if (NIL != at_defns.quiet_has_typeP(sk_number, $$Integer, UNPROVIDED)) {
            return list($$thereExistExactly, sk_number, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
        }
        if ((((NIL != kb_control_vars.quant_kb_loaded_p()) && ((NIL != collection_defns.ibqeP(sk_number, UNPROVIDED)) || (sk_number.isCons() && sk_number.first().eql($$Unity)))) && sk_number.isList()) && THREE_INTEGER.numE(length(sk_number))) {
            SubLObject current;
            final SubLObject datum = current = sk_number;
            SubLObject unit = NIL;
            SubLObject min2 = NIL;
            SubLObject max2 = NIL;
            destructuring_bind_must_consp(current, datum, $list78);
            unit = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            min2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list78);
            max2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (unit.eql($$Unity)) {
                    if (max2.eql($$PlusInfinity) && (NIL != at_defns.quiet_has_typeP(min2, $$Integer, UNPROVIDED))) {
                        return list($$thereExistAtLeast, min2, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (min2.eql(ZERO_INTEGER) && (NIL != at_defns.quiet_has_typeP(max2, $$Integer, UNPROVIDED))) {
                        return list($$thereExistAtMost, max2, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                    }
                    return list($$thereExistExactly, sk_number, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
                }
            } else {
                cdestructuring_bind_error(datum, $list78);
            }
            return NIL;
        }
        return list($$thereExistExactly, sk_number, sk_var, subst(sk_var, existential_term, formula, symbol_function(EQUAL), UNPROVIDED));
    }

    public static final SubLObject implications_in_alt(SubLObject formula) {
        return simplifier.simplify_cycl_sentence(com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(com.cyc.cycjava.cycl.uncanonicalizer.uncanon_dnf_1(formula)), UNPROVIDED);
    }

    public static SubLObject implications_in(final SubLObject formula) {
        return simplifier.simplify_cycl_sentence(undo_implications(simplifier.simplify_cycl_sentence(uncanon_dnf_1(formula), UNPROVIDED)), UNPROVIDED);
    }

    public static final SubLObject undo_implications_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (formula.isAtom()) {
                return formula;
            } else {
                if (NIL != el_negation_p(formula)) {
                    {
                        SubLObject sub_formula = NIL;
                        {
                            SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
                            try {
                                czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                                sub_formula = com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                            } finally {
                                czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return make_unary_formula(cycl_utilities.formula_operator(formula), sub_formula);
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.uncanonicalizer.implicatable_conjunctionP(formula)) {
                        {
                            SubLObject args = cycl_utilities.formula_args(simplifier.simplify_cycl_sentence(clausifier.do_negations(clausifier.negate_conjunction(formula)), UNPROVIDED), UNPROVIDED);
                            SubLObject neg = Mapping.mapcar(symbol_function(NEGATE), el_negative_sentences(args));
                            SubLObject pos = el_positive_sentences(args);
                            SubLObject lhf = com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(NIL != list_utilities.singletonP(neg) ? ((SubLObject) (neg.first())) : cons($$and, neg));
                            SubLObject rhf = com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(NIL != list_utilities.singletonP(pos) ? ((SubLObject) (pos.first())) : cons($$or, pos));
                            return cycl_utilities.negate(make_binary_formula($$implies, lhf, rhf));
                        }
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.uncanonicalizer.implicatable_disjunctionP(formula)) {
                            {
                                SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
                                SubLObject neg = Mapping.mapcar(symbol_function(NEGATE), el_negative_sentences(args));
                                SubLObject pos = el_positive_sentences(args);
                                SubLObject lhf = com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(NIL != list_utilities.singletonP(neg) ? ((SubLObject) (neg.first())) : cons($$and, neg));
                                SubLObject rhf = com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(NIL != list_utilities.singletonP(pos) ? ((SubLObject) (pos.first())) : cons($$or, pos));
                                return make_binary_formula($$implies, lhf, rhf);
                            }
                        } else {
                            if (((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) || (NIL != el_exception_p(formula))) {
                                return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_IMPLICATIONS), cycl_utilities.formula_args(formula, UNPROVIDED)));
                            } else {
                                if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
                                    {
                                        SubLObject datum = formula;
                                        SubLObject current = datum;
                                        SubLObject quantifier = NIL;
                                        SubLObject var = NIL;
                                        SubLObject subsent = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt58);
                                        quantifier = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt58);
                                        var = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt58);
                                        subsent = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            return list(quantifier, var, com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(subsent));
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt58);
                                        }
                                    }
                                } else {
                                    if (NIL != el_bounded_existential_p(formula)) {
                                        {
                                            SubLObject datum = formula;
                                            SubLObject current = datum;
                                            SubLObject quantifier = NIL;
                                            SubLObject n = NIL;
                                            SubLObject var = NIL;
                                            SubLObject subsent = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt59);
                                            quantifier = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt59);
                                            n = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt59);
                                            var = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt59);
                                            subsent = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                return list(quantifier, n, var, com.cyc.cycjava.cycl.uncanonicalizer.undo_implications(subsent));
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt59);
                                            }
                                        }
                                    } else {
                                        if (NIL != atomic_sentenceP(formula)) {
                                            return formula;
                                        } else {
                                            return formula;
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
    }

    public static SubLObject undo_implications(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula.isAtom()) {
            return formula;
        }
        if (NIL != el_negation_p(formula)) {
            SubLObject sub_formula = NIL;
            final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
            try {
                czer_vars.$within_negationP$.bind(makeBoolean(NIL == czer_vars.$within_negationP$.getDynamicValue(thread)), thread);
                sub_formula = undo_implications(cycl_utilities.formula_arg1(formula, UNPROVIDED));
            } finally {
                czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
            }
            return make_unary_formula(cycl_utilities.formula_operator(formula), sub_formula);
        }
        if (NIL != implicatable_conjunctionP(formula)) {
            final SubLObject args = cycl_utilities.formula_args(simplifier.simplify_cycl_sentence(clausifier.do_negations(clausifier.negate_conjunction(formula)), UNPROVIDED), UNPROVIDED);
            final SubLObject neg = Mapping.mapcar(symbol_function(NEGATE), el_negative_sentences(args));
            final SubLObject pos = el_positive_sentences(args);
            final SubLObject lhf = undo_implications(NIL != list_utilities.singletonP(neg) ? neg.first() : cons($$and, neg));
            final SubLObject rhf = undo_implications(NIL != list_utilities.singletonP(pos) ? pos.first() : cons($$or, pos));
            return cycl_utilities.negate(make_binary_formula($$implies, lhf, rhf));
        }
        if (NIL != implicatable_disjunctionP(formula)) {
            final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
            final SubLObject neg = Mapping.mapcar(symbol_function(NEGATE), el_negative_sentences(args));
            final SubLObject pos = el_positive_sentences(args);
            final SubLObject lhf = undo_implications(NIL != list_utilities.singletonP(neg) ? neg.first() : cons($$and, neg));
            final SubLObject rhf = undo_implications(NIL != list_utilities.singletonP(pos) ? pos.first() : cons($$or, pos));
            return make_binary_formula($$implies, lhf, rhf);
        }
        if (((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) || (NIL != el_exception_p(formula))) {
            return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(UNDO_IMPLICATIONS), cycl_utilities.formula_args(formula, UNPROVIDED)));
        }
        if ((NIL != el_existential_p(formula)) || (NIL != el_universal_p(formula))) {
            SubLObject quantifier = NIL;
            SubLObject var = NIL;
            SubLObject subsent = NIL;
            destructuring_bind_must_consp(formula, formula, $list58);
            quantifier = formula.first();
            SubLObject current = formula.rest();
            destructuring_bind_must_consp(current, formula, $list58);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, formula, $list58);
            subsent = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(quantifier, var, undo_implications(subsent));
            }
            cdestructuring_bind_error(formula, $list58);
        } else
            if (NIL != el_bounded_existential_p(formula)) {
                SubLObject quantifier = NIL;
                SubLObject n = NIL;
                SubLObject var2 = NIL;
                SubLObject subsent2 = NIL;
                destructuring_bind_must_consp(formula, formula, $list59);
                quantifier = formula.first();
                SubLObject current = formula.rest();
                destructuring_bind_must_consp(current, formula, $list59);
                n = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, formula, $list59);
                var2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, formula, $list59);
                subsent2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    return list(quantifier, n, var2, undo_implications(subsent2));
                }
                cdestructuring_bind_error(formula, $list59);
            } else {
                if (NIL != atomic_sentenceP(formula)) {
                    return formula;
                }
                return formula;
            }

        return NIL;
    }

    public static final SubLObject implicatable_disjunctionP_alt(SubLObject formula) {
        if (NIL != el_disjunction_p(formula)) {
            {
                SubLObject negP = NIL;
                SubLObject posP = NIL;
                if (NIL == negP) {
                    {
                        SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                        SubLObject disjunct = NIL;
                        for (disjunct = csome_list_var.first(); !((NIL != negP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , disjunct = csome_list_var.first()) {
                            if (NIL != el_negation_p(disjunct)) {
                                negP = T;
                            } else {
                                posP = T;
                            }
                        }
                    }
                }
                if (NIL != negP) {
                    if (NIL == posP) {
                        {
                            SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                            SubLObject disjunct = NIL;
                            for (disjunct = csome_list_var.first(); !((NIL != posP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , disjunct = csome_list_var.first()) {
                                if (NIL == el_negation_p(disjunct)) {
                                    posP = T;
                                }
                            }
                        }
                    }
                }
                return makeBoolean((NIL != negP) && (NIL != posP));
            }
        }
        return NIL;
    }

    public static SubLObject implicatable_disjunctionP(final SubLObject formula) {
        if (NIL != el_disjunction_p(formula)) {
            SubLObject negP = NIL;
            SubLObject posP = NIL;
            if (NIL == negP) {
                SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                SubLObject disjunct = NIL;
                disjunct = csome_list_var.first();
                while ((NIL == negP) && (NIL != csome_list_var)) {
                    if (NIL != el_negation_p(disjunct)) {
                        negP = T;
                    } else {
                        posP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    disjunct = csome_list_var.first();
                } 
            }
            if ((NIL != negP) && (NIL == posP)) {
                SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                SubLObject disjunct = NIL;
                disjunct = csome_list_var.first();
                while ((NIL == posP) && (NIL != csome_list_var)) {
                    if (NIL == el_negation_p(disjunct)) {
                        posP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    disjunct = csome_list_var.first();
                } 
            }
            return makeBoolean((NIL != negP) && (NIL != posP));
        }
        return NIL;
    }

    public static final SubLObject implicatable_conjunctionP_alt(SubLObject formula) {
        if ((NIL != czer_utilities.within_negationP()) && (NIL != el_conjunction_p(formula))) {
            return com.cyc.cycjava.cycl.uncanonicalizer.implicatable_disjunctionP(simplifier.simplify_el_syntax(clausifier.do_negations(clausifier.negate_conjunction(formula)), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject implicatable_conjunctionP(final SubLObject formula) {
        if ((NIL != czer_utilities.within_negationP()) && (NIL != el_conjunction_p(formula))) {
            return implicatable_disjunctionP(simplifier.simplify_el_syntax(clausifier.do_negations(clausifier.negate_conjunction(formula)), UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject uncanon_dnf_1_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sequence_var = sequence_var(formula, UNPROVIDED);
                SubLObject result = NIL;
                if (NIL != sequence_var) {
                    formula = strip_sequence_var(formula);
                }
                if (NIL != czer_utilities.encapsulate_formulaP(formula)) {
                    result = czer_utilities.encapsulate_formula(formula, UNPROVIDED);
                } else {
                    if (formula.isAtom()) {
                        result = formula;
                    } else {
                        if (NIL != el_negation_p(formula)) {
                            result = formula;
                        } else {
                            if ((NIL != el_conjunction_p(formula)) && length(cycl_utilities.formula_args(formula, UNPROVIDED)).numL($uncanonicalizer_dnf_threshold$.getDynamicValue(thread))) {
                                {
                                    SubLObject disj = clausifier.first_disjunction(cycl_utilities.formula_args(formula, UNPROVIDED));
                                    SubLObject conj = (NIL != disj) ? ((SubLObject) (remove(disj, cycl_utilities.formula_args(formula, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                                    if (NIL != conj) {
                                        result = com.cyc.cycjava.cycl.uncanonicalizer.uncanon_dnf_1(cons($$or, Mapping.mapcar(symbol_function(UNCANON_DNF_1), clausifier.distribute_conjunction(conj, disj.rest(), UNPROVIDED))));
                                    } else {
                                        result = cons($$and, Mapping.mapcar(symbol_function(UNCANON_DNF_1), cycl_utilities.formula_args(formula, UNPROVIDED)));
                                    }
                                }
                            } else {
                                if (NIL != el_disjunction_p(formula)) {
                                    result = cons($$or, Mapping.mapcar(symbol_function(UNCANON_DNF_1), cycl_utilities.formula_args(formula, UNPROVIDED)));
                                } else {
                                    if (NIL != literalP(formula)) {
                                        result = formula;
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.uncanonicalizer.naut_formulaP(formula)) {
                                            result = formula;
                                        } else {
                                            if (NIL != el_non_atomic_sentenceP(formula)) {
                                                result = formula;
                                            } else {
                                                el_error(FOUR_INTEGER, $str_alt83$_s_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED);
                                                result = formula;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != sequence_var) {
                    result = nadd_sequence_var_to_end(sequence_var, result);
                }
                return result;
            }
        }
    }

    public static SubLObject uncanon_dnf_1(SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sequence_var = sequence_var(formula, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL != sequence_var) {
            formula = strip_sequence_var(formula);
        }
        if (NIL != czer_utilities.encapsulate_formulaP(formula)) {
            result = czer_utilities.encapsulate_formula(formula, UNPROVIDED);
        } else
            if (formula.isAtom()) {
                result = formula;
            } else
                if (NIL != el_negation_p(formula)) {
                    result = formula;
                } else
                    if ((NIL != el_conjunction_p(formula)) && length(cycl_utilities.formula_args(formula, UNPROVIDED)).numL($uncanonicalizer_dnf_threshold$.getDynamicValue(thread))) {
                        final SubLObject disj = clausifier.first_disjunction(cycl_utilities.formula_args(formula, UNPROVIDED));
                        final SubLObject conj = (NIL != disj) ? remove(disj, cycl_utilities.formula_args(formula, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                        if (NIL != conj) {
                            result = uncanon_dnf_1(cons($$or, Mapping.mapcar(symbol_function(UNCANON_DNF_1), clausifier.distribute_conjunction(conj, disj.rest(), UNPROVIDED))));
                        } else {
                            result = cons($$and, Mapping.mapcar(symbol_function(UNCANON_DNF_1), cycl_utilities.formula_args(formula, UNPROVIDED)));
                        }
                    } else
                        if (NIL != el_disjunction_p(formula)) {
                            result = cons($$or, Mapping.mapcar(symbol_function(UNCANON_DNF_1), cycl_utilities.formula_args(formula, UNPROVIDED)));
                        } else
                            if (NIL != literalP(formula)) {
                                result = formula;
                            } else
                                if (NIL != naut_formulaP(formula)) {
                                    result = formula;
                                } else
                                    if (NIL != el_non_atomic_sentenceP(formula)) {
                                        result = formula;
                                    } else {
                                        el_error(FOUR_INTEGER, $str83$_s_is_not_well_formed_, formula, UNPROVIDED, UNPROVIDED);
                                        result = formula;
                                    }







        if (NIL != sequence_var) {
            result = nadd_sequence_var_to_end(sequence_var, result);
        }
        return result;
    }

    public static final SubLObject naut_formulaP_alt(SubLObject formula) {
        if (NIL != term.nautP(formula, UNPROVIDED)) {
            return at_utilities.formula_denoting_functionP(formula, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject naut_formulaP(final SubLObject formula) {
        if (NIL != term.nautP(formula, UNPROVIDED)) {
            return at_utilities.formula_denoting_functionP(formula, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Moves #$ists as far toward the front of SENTENCE as possible.
     */
    @LispMethod(comment = "Moves #$ists as far toward the front of SENTENCE as possible.")
    public static final SubLObject ists_out_alt(SubLObject sentence) {
        if (NIL == cycl_utilities.expression_find_if(IST_SENTENCE_P, sentence, UNPROVIDED, UNPROVIDED)) {
            return sentence;
        }
        return cycl_utilities.expression_transform(sentence, $sym85$SIMPLIFIABLE_IST_EXPRESSION_, SIMPLIFY_IST_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Moves #$ists as far toward the front of SENTENCE as possible.")
    public static SubLObject ists_out(final SubLObject sentence) {
        if (NIL == cycl_utilities.expression_find_if(IST_SENTENCE_P, sentence, UNPROVIDED, UNPROVIDED)) {
            return sentence;
        }
        return cycl_utilities.expression_transform(sentence, $sym85$SIMPLIFIABLE_IST_EXPRESSION_, SIMPLIFY_IST_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }/**
     * Moves #$ists as far toward the front of SENTENCE as possible.
     */


    public static final SubLObject simplifiable_ist_expressionP_alt(SubLObject v_object) {
        if (NIL != ist_sentence_p(v_object)) {
            return ist_sentence_p(designated_sentence(v_object));
        } else {
            if (NIL != el_conjunction_p(v_object)) {
                if (NIL != list_utilities.every_in_list(IST_SENTENCE_P, cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)) {
                    {
                        SubLObject candidate_mt = NIL;
                        SubLObject args = cycl_utilities.formula_args(v_object, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject ist_conjunct = NIL;
                        for (ist_conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ist_conjunct = cdolist_list_var.first()) {
                            {
                                SubLObject mt = designated_mt(ist_conjunct);
                                if (NIL == candidate_mt) {
                                    candidate_mt = mt;
                                } else {
                                    if (NIL != hlmt.hlmt_equalP(mt, candidate_mt)) {
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                        return list_utilities.sublisp_boolean(candidate_mt);
                    }
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject simplifiable_ist_expressionP(final SubLObject v_object) {
        if (NIL != ist_sentence_p(v_object, UNPROVIDED)) {
            return ist_sentence_p(designated_sentence(v_object), UNPROVIDED);
        }
        if (NIL == el_conjunction_p(v_object)) {
            return NIL;
        }
        if (NIL != list_utilities.every_in_list(IST_SENTENCE_P, cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)) {
            SubLObject candidate_mt = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(v_object, $IGNORE);
            SubLObject ist_conjunct = NIL;
            ist_conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject mt = designated_mt(ist_conjunct);
                if (NIL == candidate_mt) {
                    candidate_mt = mt;
                } else
                    if (NIL == hlmt.hlmt_equalP(mt, candidate_mt)) {
                        return NIL;
                    }

                cdolist_list_var = cdolist_list_var.rest();
                ist_conjunct = cdolist_list_var.first();
            } 
            return list_utilities.sublisp_boolean(candidate_mt);
        }
        return NIL;
    }

    public static final SubLObject simplify_ist_expression_alt(SubLObject v_object) {
        if (NIL != ist_sentence_p(v_object)) {
            if (NIL != ist_sentence_p(designated_sentence(v_object))) {
                return designated_sentence(v_object);
            }
        } else {
            if (NIL != el_conjunction_p(v_object)) {
                if (NIL != list_utilities.every_in_list(IST_SENTENCE_P, cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)) {
                    {
                        SubLObject candidate_mt = designated_mt(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
                        SubLObject new_conjuncts = NIL;
                        SubLObject args = cycl_utilities.formula_args(v_object, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject ist_conjunct = NIL;
                        for (ist_conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ist_conjunct = cdolist_list_var.first()) {
                            {
                                SubLObject sentence = designated_sentence(ist_conjunct);
                                new_conjuncts = cons(sentence, new_conjuncts);
                            }
                        }
                        new_conjuncts = nreverse(new_conjuncts);
                        return list($$ist, candidate_mt, bq_cons($$and, append(new_conjuncts, NIL)));
                    }
                }
            } else {
                Errors.error($str_alt88$unable_to_simplify___ist_expressi, v_object);
            }
        }
        return NIL;
    }

    public static SubLObject simplify_ist_expression(final SubLObject v_object) {
        if (NIL != ist_sentence_p(v_object, UNPROVIDED)) {
            if (NIL != ist_sentence_p(designated_sentence(v_object), UNPROVIDED)) {
                return designated_sentence(v_object);
            }
        } else
            if (NIL != el_conjunction_p(v_object)) {
                if (NIL != list_utilities.every_in_list(IST_SENTENCE_P, cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)) {
                    final SubLObject candidate_mt = designated_mt(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
                    SubLObject new_conjuncts = NIL;
                    SubLObject cdolist_list_var;
                    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(v_object, $IGNORE);
                    SubLObject ist_conjunct = NIL;
                    ist_conjunct = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject sentence = designated_sentence(ist_conjunct);
                        new_conjuncts = cons(sentence, new_conjuncts);
                        cdolist_list_var = cdolist_list_var.rest();
                        ist_conjunct = cdolist_list_var.first();
                    } 
                    new_conjuncts = nreverse(new_conjuncts);
                    return list($$ist, candidate_mt, bq_cons($$and, append(new_conjuncts, NIL)));
                }
            } else {
                Errors.error($str88$unable_to_simplify___ist_expressi, v_object);
            }

        return NIL;
    }

    /**
     * Remove some leading forAlls from the formula; e.g., includes forAlls not within an existential or trueSentence.
     */
    @LispMethod(comment = "Remove some leading forAlls from the formula; e.g., includes forAlls not within an existential or trueSentence.")
    public static final SubLObject remove_leading_universals_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (formula.isAtom()) {
                return formula;
            } else {
                if (NIL == list_utilities.tree_find($$forAll, formula, symbol_function(EQUAL), UNPROVIDED)) {
                    return formula;
                } else {
                    if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
                        {
                            SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
                            return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(REMOVE_LEADING_UNIVERSALS), args));
                        }
                    } else {
                        if (NIL != el_universal_p(formula)) {
                            {
                                SubLObject datum = formula;
                                SubLObject current = datum;
                                SubLObject quantifier = NIL;
                                SubLObject var = NIL;
                                SubLObject subsent = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt58);
                                quantifier = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt58);
                                var = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt58);
                                subsent = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != subl_promotions.memberP(var, $retain_leading_universals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                        return make_binary_formula(quantifier, var, com.cyc.cycjava.cycl.uncanonicalizer.remove_leading_universals(subsent));
                                    } else {
                                        return com.cyc.cycjava.cycl.uncanonicalizer.remove_leading_universals(subsent);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt58);
                                }
                            }
                        } else {
                            if ((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula))) {
                                return formula;
                            } else {
                                if (NIL != literalP(formula)) {
                                    return formula;
                                } else {
                                    if (NIL != el_exception_p(formula)) {
                                        return formula;
                                    } else {
                                        el_error(THREE_INTEGER, $str_alt61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
                                        return formula;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Remove some leading forAlls from the formula; e.g., includes forAlls not within an existential or trueSentence.")
    public static SubLObject remove_leading_universals(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (formula.isAtom()) {
            return formula;
        }
        if (NIL == list_utilities.tree_find($$forAll, formula, symbol_function(EQUAL), UNPROVIDED)) {
            return formula;
        }
        if ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula))) {
            final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
            return cons(cycl_utilities.formula_operator(formula), Mapping.mapcar(symbol_function(REMOVE_LEADING_UNIVERSALS), args));
        }
        if (NIL != el_universal_p(formula)) {
            SubLObject quantifier = NIL;
            SubLObject var = NIL;
            SubLObject subsent = NIL;
            destructuring_bind_must_consp(formula, formula, $list58);
            quantifier = formula.first();
            SubLObject current = formula.rest();
            destructuring_bind_must_consp(current, formula, $list58);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, formula, $list58);
            subsent = current.first();
            current = current.rest();
            if (NIL != current) {
                cdestructuring_bind_error(formula, $list58);
                return NIL;
            }
            if (NIL != subl_promotions.memberP(var, $retain_leading_universals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                return make_binary_formula(quantifier, var, remove_leading_universals(subsent));
            }
            return remove_leading_universals(subsent);
        } else {
            if ((NIL != el_existential_p(formula)) || (NIL != el_bounded_existential_p(formula))) {
                return formula;
            }
            if (NIL != literalP(formula)) {
                return formula;
            }
            if (NIL != el_exception_p(formula)) {
                return formula;
            }
            el_error(THREE_INTEGER, $str61$unanticipated_formula___s, formula, UNPROVIDED, UNPROVIDED);
            return formula;
        }
    }/**
     * Remove some leading forAlls from the formula; e.g., includes forAlls not within an existential or trueSentence.
     */


    /**
     * Generate a list of all free variables not referenced by skolems
     */
    @LispMethod(comment = "Generate a list of all free variables not referenced by skolems")
    public static final SubLObject sentence_free_vars_not_bound_to_skolems_alt(SubLObject formula, SubLObject v_skolems) {
        if (v_skolems == UNPROVIDED) {
            v_skolems = com.cyc.cycjava.cycl.uncanonicalizer.formula_unreified_skolems(formula);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != v_skolems) || $universal_vars_to_skolem$.getDynamicValue(thread).isHashtable()) {
                {
                    SubLObject initial_free_vars = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject skolem_vars = Mapping.mapcar(SKOLEM_FUNCTION_VAR, v_skolems);
                    SubLObject skolem_num_vars = list_utilities.remove_if_not(symbol_function($sym91$EL_VAR_), Mapping.mapcar(SKOLEM_NUMBER, v_skolems), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject result_vars = NIL;
                    SubLObject cdolist_list_var = initial_free_vars;
                    SubLObject free_var = NIL;
                    for (free_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , free_var = cdolist_list_var.first()) {
                        if (!(((NIL != subl_promotions.memberP(free_var, skolem_vars, UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(free_var, skolem_num_vars, UNPROVIDED, UNPROVIDED))) || (NIL != gethash(free_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED)))) {
                            result_vars = cons(free_var, result_vars);
                        }
                    }
                    return result_vars;
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Generate a list of all free variables not referenced by skolems")
    public static SubLObject sentence_free_vars_not_bound_to_skolems(final SubLObject formula, SubLObject v_skolems) {
        if (v_skolems == UNPROVIDED) {
            v_skolems = formula_unreified_skolems(formula);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != v_skolems) || $universal_vars_to_skolem$.getDynamicValue(thread).isHashtable()) {
            final SubLObject initial_free_vars = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject skolem_vars = Mapping.mapcar(SKOLEM_FUNCTION_VAR, v_skolems);
            final SubLObject skolem_num_vars = list_utilities.remove_if_not(symbol_function($sym91$EL_VAR_), Mapping.mapcar(SKOLEM_NUMBER, v_skolems), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result_vars = NIL;
            SubLObject cdolist_list_var = initial_free_vars;
            SubLObject free_var = NIL;
            free_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL == subl_promotions.memberP(free_var, skolem_vars, UNPROVIDED, UNPROVIDED)) && (NIL == subl_promotions.memberP(free_var, skolem_num_vars, UNPROVIDED, UNPROVIDED))) && (NIL == gethash(free_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED))) {
                    result_vars = cons(free_var, result_vars);
                }
                cdolist_list_var = cdolist_list_var.rest();
                free_var = cdolist_list_var.first();
            } 
            return result_vars;
        }
        return NIL;
    }/**
     * Generate a list of all free variables not referenced by skolems
     */


    /**
     * Add a placeholder to the hash for uni-var, used to control when unremoval of universals takes place
     */
    @LispMethod(comment = "Add a placeholder to the hash for uni-var, used to control when unremoval of universals takes place")
    public static final SubLObject add_universal_var_placeholder_alt(SubLObject uni_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), cons(uni_var, gethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED)));
            return NIL;
        }
    }

    @LispMethod(comment = "Add a placeholder to the hash for uni-var, used to control when unremoval of universals takes place")
    public static SubLObject add_universal_var_placeholder(final SubLObject uni_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), cons(uni_var, gethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED)));
        return NIL;
    }/**
     * Add a placeholder to the hash for uni-var, used to control when unremoval of universals takes place
     */


    /**
     * See if a placeholder (and only a placeholder) is in the hash for uni-var
     */
    @LispMethod(comment = "See if a placeholder (and only a placeholder) is in the hash for uni-var")
    public static final SubLObject check_for_universal_var_placeholder_alt(SubLObject uni_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED).equal(list(uni_var))) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "See if a placeholder (and only a placeholder) is in the hash for uni-var")
    public static SubLObject check_for_universal_var_placeholder(final SubLObject uni_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED).equal(list(uni_var))) {
            return T;
        }
        return NIL;
    }/**
     * See if a placeholder (and only a placeholder) is in the hash for uni-var
     */


    /**
     * Removal a placeholder from the hash for uni-var
     */
    @LispMethod(comment = "Removal a placeholder from the hash for uni-var")
    public static final SubLObject remove_universal_var_placeholder_alt(SubLObject uni_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), set_difference(gethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED), list(uni_var), symbol_function(EQUAL), UNPROVIDED));
            return NIL;
        }
    }

    @LispMethod(comment = "Removal a placeholder from the hash for uni-var")
    public static SubLObject remove_universal_var_placeholder(final SubLObject uni_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), set_difference(gethash(uni_var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED), list(uni_var), symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }/**
     * Removal a placeholder from the hash for uni-var
     */


    /**
     * Return a list of the skolems arguments (free variables)
     */
    @LispMethod(comment = "Return a list of the skolems arguments (free variables)")
    public static final SubLObject skolem_fn_arg_vars_alt(SubLObject unreified_skolem_term) {
        return skolems.skolem_function_dependent_vars(unreified_skolem_term);
    }

    @LispMethod(comment = "Return a list of the skolems arguments (free variables)")
    public static SubLObject skolem_fn_arg_vars(final SubLObject unreified_skolem_term) {
        return skolems.skolem_function_dependent_vars(unreified_skolem_term);
    }/**
     * Return a list of the skolems arguments (free variables)
     */


    public static final SubLObject formula_unreified_skolems_alt(SubLObject formula) {
        return remove_duplicates(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject formula_unreified_skolems(final SubLObject formula) {
        return remove_duplicates(list_utilities.tree_gather(formula, symbol_function($sym68$UNREIFIED_SKOLEM_TERM_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Initialize a hash table to contain all free variables that are referenced by skolem functions
     * contained in FORMULA and for each variable, set its hash to be a list of those skolem functions.
     * This hash table is used to decide when quantifiers should be added for free variables.  During
     * uncanonicalization, each time an existential quantifier is unremoved from the formula, the corresponding
     * skolem function references in the hash table are deleted.  Once a free variable has a NIL hash, then
     * its universal quantifier can be added to the formula.
     */
    @LispMethod(comment = "Initialize a hash table to contain all free variables that are referenced by skolem functions\r\ncontained in FORMULA and for each variable, set its hash to be a list of those skolem functions.\r\nThis hash table is used to decide when quantifiers should be added for free variables.  During\r\nuncanonicalization, each time an existential quantifier is unremoved from the formula, the corresponding\r\nskolem function references in the hash table are deleted.  Once a free variable has a NIL hash, then\r\nits universal quantifier can be added to the formula.\nInitialize a hash table to contain all free variables that are referenced by skolem functions\ncontained in FORMULA and for each variable, set its hash to be a list of those skolem functions.\nThis hash table is used to decide when quantifiers should be added for free variables.  During\nuncanonicalization, each time an existential quantifier is unremoved from the formula, the corresponding\nskolem function references in the hash table are deleted.  Once a free variable has a NIL hash, then\nits universal quantifier can be added to the formula.")
    public static final SubLObject universal_vars_to_skolem_table_alt(SubLObject formula, SubLObject v_skolems) {
        if (v_skolems == UNPROVIDED) {
            v_skolems = com.cyc.cycjava.cycl.uncanonicalizer.formula_unreified_skolems(formula);
        }
        {
            SubLObject table = make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = v_skolems;
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                {
                    SubLObject var_list = com.cyc.cycjava.cycl.uncanonicalizer.skolem_fn_arg_vars(skolem);
                    SubLObject cdolist_list_var_21 = var_list;
                    SubLObject var = NIL;
                    for (var = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , var = cdolist_list_var_21.first()) {
                        sethash(var, table, cons(skolem, gethash(var, table, UNPROVIDED)));
                    }
                }
            }
            return table;
        }
    }

    @LispMethod(comment = "Initialize a hash table to contain all free variables that are referenced by skolem functions\r\ncontained in FORMULA and for each variable, set its hash to be a list of those skolem functions.\r\nThis hash table is used to decide when quantifiers should be added for free variables.  During\r\nuncanonicalization, each time an existential quantifier is unremoved from the formula, the corresponding\r\nskolem function references in the hash table are deleted.  Once a free variable has a NIL hash, then\r\nits universal quantifier can be added to the formula.\nInitialize a hash table to contain all free variables that are referenced by skolem functions\ncontained in FORMULA and for each variable, set its hash to be a list of those skolem functions.\nThis hash table is used to decide when quantifiers should be added for free variables.  During\nuncanonicalization, each time an existential quantifier is unremoved from the formula, the corresponding\nskolem function references in the hash table are deleted.  Once a free variable has a NIL hash, then\nits universal quantifier can be added to the formula.")
    public static SubLObject universal_vars_to_skolem_table(final SubLObject formula, SubLObject v_skolems) {
        if (v_skolems == UNPROVIDED) {
            v_skolems = formula_unreified_skolems(formula);
        }
        final SubLObject table = make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = v_skolems;
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$21;
            final SubLObject var_list = cdolist_list_var_$21 = skolem_fn_arg_vars(skolem);
            SubLObject var = NIL;
            var = cdolist_list_var_$21.first();
            while (NIL != cdolist_list_var_$21) {
                sethash(var, table, cons(skolem, gethash(var, table, UNPROVIDED)));
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                var = cdolist_list_var_$21.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return table;
    }/**
     * Initialize a hash table to contain all free variables that are referenced by skolem functions
     * contained in FORMULA and for each variable, set its hash to be a list of those skolem functions.
     * This hash table is used to decide when quantifiers should be added for free variables.  During
     * uncanonicalization, each time an existential quantifier is unremoved from the formula, the corresponding
     * skolem function references in the hash table are deleted.  Once a free variable has a NIL hash, then
     * its universal quantifier can be added to the formula.
     */


    /**
     * Remove a skolem function from any variable hash that lists it as referenced.
     * Return a list of all free-variables not referenced by anymore skolems.
     * This function is called once a skolem has been unremoved.
     */
    @LispMethod(comment = "Remove a skolem function from any variable hash that lists it as referenced.\r\nReturn a list of all free-variables not referenced by anymore skolems.\r\nThis function is called once a skolem has been unremoved.\nRemove a skolem function from any variable hash that lists it as referenced.\nReturn a list of all free-variables not referenced by anymore skolems.\nThis function is called once a skolem has been unremoved.")
    public static final SubLObject remove_skolem_from_universal_vars_to_skolem_alt(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var_list = com.cyc.cycjava.cycl.uncanonicalizer.skolem_fn_arg_vars(skolem);
                SubLObject result_list = NIL;
                SubLObject cdolist_list_var = var_list;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    {
                        SubLObject newhash = set_difference(gethash(var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED), list(skolem), symbol_function(EQUAL), UNPROVIDED);
                        sethash(var, $universal_vars_to_skolem$.getDynamicValue(thread), newhash);
                        if (NIL == newhash) {
                            result_list = cons(var, result_list);
                        }
                    }
                }
                return result_list;
            }
        }
    }

    @LispMethod(comment = "Remove a skolem function from any variable hash that lists it as referenced.\r\nReturn a list of all free-variables not referenced by anymore skolems.\r\nThis function is called once a skolem has been unremoved.\nRemove a skolem function from any variable hash that lists it as referenced.\nReturn a list of all free-variables not referenced by anymore skolems.\nThis function is called once a skolem has been unremoved.")
    public static SubLObject remove_skolem_from_universal_vars_to_skolem(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_list = skolem_fn_arg_vars(skolem);
        SubLObject result_list = NIL;
        SubLObject cdolist_list_var = var_list;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject newhash = set_difference(gethash(var, $universal_vars_to_skolem$.getDynamicValue(thread), UNPROVIDED), list(skolem), symbol_function(EQUAL), UNPROVIDED);
            sethash(var, $universal_vars_to_skolem$.getDynamicValue(thread), newhash);
            if (NIL == newhash) {
                result_list = cons(var, result_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return result_list;
    }/**
     * Remove a skolem function from any variable hash that lists it as referenced.
     * Return a list of all free-variables not referenced by anymore skolems.
     * This function is called once a skolem has been unremoved.
     */


    /**
     * Return the number of arguments (free variables) to the skolem function
     */
    @LispMethod(comment = "Return the number of arguments (free variables) to the skolem function")
    public static final SubLObject num_args_of_skolem_fn_alt(SubLObject skolem) {
        return length(com.cyc.cycjava.cycl.uncanonicalizer.skolem_fn_arg_vars(skolem));
    }

    @LispMethod(comment = "Return the number of arguments (free variables) to the skolem function")
    public static SubLObject num_args_of_skolem_fn(final SubLObject skolem) {
        return length(skolem_fn_arg_vars(skolem));
    }/**
     * Return the number of arguments (free variables) to the skolem function
     */


    /**
     * Sort the skolems by the number of arguments, decreasing.  Used to determine what
     * order skolems should be unremoved when 2 or more skolems are to be unremoved at the
     * same time.
     */
    @LispMethod(comment = "Sort the skolems by the number of arguments, decreasing.  Used to determine what\r\norder skolems should be unremoved when 2 or more skolems are to be unremoved at the\r\nsame time.\nSort the skolems by the number of arguments, decreasing.  Used to determine what\norder skolems should be unremoved when 2 or more skolems are to be unremoved at the\nsame time.")
    public static final SubLObject order_skolems_inner_to_outer_alt(SubLObject v_skolems) {
        return Sort.sort(v_skolems, symbol_function($sym93$_), symbol_function(NUM_ARGS_OF_SKOLEM_FN));
    }

    @LispMethod(comment = "Sort the skolems by the number of arguments, decreasing.  Used to determine what\r\norder skolems should be unremoved when 2 or more skolems are to be unremoved at the\r\nsame time.\nSort the skolems by the number of arguments, decreasing.  Used to determine what\norder skolems should be unremoved when 2 or more skolems are to be unremoved at the\nsame time.")
    public static SubLObject order_skolems_inner_to_outer(final SubLObject v_skolems) {
        return Sort.sort(v_skolems, symbol_function($sym93$_), symbol_function(NUM_ARGS_OF_SKOLEM_FN));
    }/**
     * Sort the skolems by the number of arguments, decreasing.  Used to determine what
     * order skolems should be unremoved when 2 or more skolems are to be unremoved at the
     * same time.
     */


    public static final SubLObject nsubst_hl_vars_alt(SubLObject v_object, SubLObject symbols) {
        v_object = czer_utilities.nescape_quote_hl_vars(v_object);
        {
            SubLObject list_var = NIL;
            SubLObject symbol = NIL;
            SubLObject index = NIL;
            for (list_var = symbols, symbol = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , symbol = list_var.first() , index = add(ONE_INTEGER, index)) {
                {
                    SubLObject variable = variables.find_variable_by_id(index);
                    v_object = nsubst(symbol, variable, v_object, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return v_object;
    }

    public static SubLObject nsubst_hl_vars(SubLObject v_object, final SubLObject symbols) {
        v_object = czer_utilities.nescape_quote_hl_vars(v_object);
        SubLObject list_var = NIL;
        SubLObject symbol = NIL;
        SubLObject index = NIL;
        list_var = symbols;
        symbol = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , symbol = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject variable = variables.find_variable_by_id(index);
            v_object = nsubst(symbol, variable, v_object, UNPROVIDED, UNPROVIDED);
        }
        return v_object;
    }

    public static final SubLObject unreify_cnfs_nats_alt(SubLObject cnfs, SubLObject index_lits, SubLObject mt) {
        if (index_lits == UNPROVIDED) {
            index_lits = tou_lits(list_utilities.mapappend(symbol_function(NEG_LITS), cnfs));
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject skolem_constants = com.cyc.cycjava.cycl.uncanonicalizer.gather_skolem_constants(cnfs, mt);
                SubLObject skolem_terms = Mapping.mapcar(symbol_function(TERM_OF_UNIT), skolem_constants);
                cnfs = transform_list_utilities.quiescent_transform(cnfs, symbol_function($sym96$SKOLEM_CONSTANT_), symbol_function(TERM_OF_UNIT), UNPROVIDED, UNPROVIDED);
                mt = transform_list_utilities.quiescent_transform(mt, symbol_function($sym96$SKOLEM_CONSTANT_), symbol_function(TERM_OF_UNIT), UNPROVIDED, UNPROVIDED);
                {
                    SubLObject indexs = NIL;
                    SubLObject index = NIL;
                    for (indexs = index_lits, index = indexs.first(); NIL != index; indexs = com.cyc.cycjava.cycl.uncanonicalizer.subst_index_in(index, indexs.rest()) , index = indexs.first()) {
                        cnfs = com.cyc.cycjava.cycl.uncanonicalizer.subst_index_in(index, cnfs);
                        if (NIL != term.reified_skolem_termP(third(index))) {
                            skolem_terms = cons(third(index), skolem_terms);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = skolem_terms;
                    SubLObject skolem_term = NIL;
                    for (skolem_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem_term = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject cnfs_22 = com.cyc.cycjava.cycl.uncanonicalizer.unreify_cnfs_skolem(cnfs, skolem_term, mt);
                            SubLObject mt_23 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            cnfs = cnfs_22;
                            mt = mt_23;
                        }
                    }
                }
                cnfs = transform_list_utilities.transform(cnfs, symbol_function(NART_P), symbol_function(TERM_OF_UNIT), UNPROVIDED);
                mt = transform_list_utilities.transform(mt, NART_P, TERM_OF_UNIT, UNPROVIDED);
                return values(cnfs, mt);
            }
        }
    }

    public static SubLObject unreify_cnfs_nats(SubLObject cnfs, SubLObject index_lits, SubLObject mt) {
        if (index_lits == UNPROVIDED) {
            index_lits = tou_lits(list_utilities.mapappend(symbol_function(NEG_LITS), cnfs));
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject skolem_constants = gather_skolem_constants(cnfs, mt);
        SubLObject skolem_terms = Mapping.mapcar(symbol_function(TERM_OF_UNIT), skolem_constants);
        cnfs = transform_list_utilities.quiescent_transform(cnfs, symbol_function($sym96$SKOLEM_CONSTANT_), symbol_function(TERM_OF_UNIT), UNPROVIDED, UNPROVIDED);
        mt = transform_list_utilities.quiescent_transform(mt, symbol_function($sym96$SKOLEM_CONSTANT_), symbol_function(TERM_OF_UNIT), UNPROVIDED, UNPROVIDED);
        SubLObject indexs;
        SubLObject index;
        for (indexs = NIL, index = NIL, indexs = index_lits, index = indexs.first(); NIL != index; index = indexs.first()) {
            cnfs = subst_index_in(index, cnfs);
            if (NIL != term.reified_skolem_termP(third(index))) {
                skolem_terms = cons(third(index), skolem_terms);
            }
            indexs = subst_index_in(index, indexs.rest());
        }
        SubLObject cdolist_list_var = skolem_terms;
        SubLObject skolem_term = NIL;
        skolem_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject cnfs_$22 = unreify_cnfs_skolem(cnfs, skolem_term, mt);
            final SubLObject mt_$23 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cnfs = cnfs_$22;
            mt = mt_$23;
            cdolist_list_var = cdolist_list_var.rest();
            skolem_term = cdolist_list_var.first();
        } 
        cnfs = transform_list_utilities.transform(cnfs, symbol_function(NART_P), symbol_function(TERM_OF_UNIT), UNPROVIDED);
        mt = transform_list_utilities.transform(mt, NART_P, TERM_OF_UNIT, UNPROVIDED);
        return values(cnfs, mt);
    }

    public static final SubLObject gather_skolem_constants_alt(SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            result = cycl_utilities.expression_gather(transform_list_utilities.quiescent_transform(cons(mt, cnfs), symbol_function($sym98$REIFIED_SKOLEM_CONSTANT_TERM_), symbol_function(FIND_NART), UNPROVIDED, UNPROVIDED), $sym96$SKOLEM_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject gather_skolem_constants(final SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        result = cycl_utilities.expression_gather(transform_list_utilities.quiescent_transform(cons(mt, cnfs), symbol_function($sym98$REIFIED_SKOLEM_CONSTANT_TERM_), symbol_function(FIND_NART), UNPROVIDED, UNPROVIDED), $sym96$SKOLEM_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static final SubLObject unreify_cnfs_terms_alt(SubLObject cnfs, SubLObject index_lits, SubLObject mt) {
        if (index_lits == UNPROVIDED) {
            index_lits = tou_lits(list_utilities.mapappend(symbol_function(NEG_LITS), cnfs));
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.uncanonicalizer.unreify_cnfs_nats(com.cyc.cycjava.cycl.uncanonicalizer.unreify_cnfs_assertions(cnfs, mt), index_lits, mt);
    }

    public static SubLObject unreify_cnfs_terms(final SubLObject cnfs, SubLObject index_lits, SubLObject mt) {
        if (index_lits == UNPROVIDED) {
            index_lits = tou_lits(list_utilities.mapappend(symbol_function(NEG_LITS), cnfs));
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return unreify_cnfs_nats(unreify_cnfs_assertions(cnfs, mt), index_lits, mt);
    }

    public static final SubLObject unreify_cnfs_assertions_alt(SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_cnfs = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        new_cnfs = transform_list_utilities.transform(cnfs, symbol_function($sym100$KB_ASSERTION_), symbol_function(WRAPPED_ASSERTION_EL_FORMULA_WRT_MT), UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_cnfs;
            }
        }
    }

    public static SubLObject unreify_cnfs_assertions(final SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_cnfs = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            new_cnfs = transform_list_utilities.transform(cnfs, symbol_function($sym100$KB_ASSERTION_), symbol_function(WRAPPED_ASSERTION_EL_FORMULA_WRT_MT), UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return new_cnfs;
    }

    public static final SubLObject wrapped_assertion_el_formula_wrt_mt_alt(SubLObject assertion) {
        {
            SubLObject assertion_formula = com.cyc.cycjava.cycl.uncanonicalizer.assertion_el_formula(assertion);
            SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            return list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, make_binary_formula($$ist, assertion_mt, assertion_formula)));
        }
    }

    public static SubLObject wrapped_assertion_el_formula_wrt_mt(final SubLObject assertion) {
        final SubLObject assertion_formula = assertion_el_formula(assertion);
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        return list($$UncanonicalizerAssertionFn, list($$SubLQuoteFn, make_binary_formula($$ist, assertion_mt, assertion_formula)));
    }

    public static final SubLObject subst_index_in_alt(SubLObject index, SubLObject expression) {
        return subst(third(index), second(index), expression, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject subst_index_in(final SubLObject index, final SubLObject expression) {
        return subst(third(index), second(index), expression, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject unreify_cnfs_skolem_alt(SubLObject cnfs, SubLObject skolem_term, SubLObject mt) {
        {
            SubLObject sk_constant = cycl_utilities.nat_functor(skolem_term);
            SubLObject unreified_sk_term = skolems.el_unreified_sk_term(sk_constant);
            if ((NIL != sk_constant) && (NIL != unreified_sk_term)) {
                {
                    SubLObject sk_var = skolems.skolem_function_var(unreified_sk_term);
                    SubLObject uniquified_var = com.cyc.cycjava.cycl.uncanonicalizer.sk_var_wrt(sk_var, skolem_term, cnfs, mt);
                    unreified_sk_term = com.cyc.cycjava.cycl.uncanonicalizer.expression_subst_skolem(uniquified_var, sk_var, copy_formula(unreified_sk_term), UNPROVIDED);
                    {
                        SubLObject sk_fn_vars = second(unreified_sk_term);
                        SubLObject cdolist_list_var = sk_fn_vars;
                        SubLObject sk_fn_var = NIL;
                        for (sk_fn_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sk_fn_var = cdolist_list_var.first()) {
                            {
                                SubLObject uniquified_sk_fn_var = com.cyc.cycjava.cycl.uncanonicalizer.sk_fn_arg_wrt(sk_fn_var, skolem_term, cnfs, mt);
                                unreified_sk_term = com.cyc.cycjava.cycl.uncanonicalizer.expression_subst_skolem(uniquified_sk_fn_var, sk_fn_var, copy_formula(unreified_sk_term), UNPROVIDED);
                            }
                        }
                        return values(com.cyc.cycjava.cycl.uncanonicalizer.expression_subst_skolem(unreified_sk_term, skolem_term, cnfs, symbol_function(EQUAL)), com.cyc.cycjava.cycl.uncanonicalizer.expression_subst_skolem(unreified_sk_term, skolem_term, mt, symbol_function(EQUAL)));
                    }
                }
            } else {
                return values(cnfs, mt);
            }
        }
    }

    public static SubLObject unreify_cnfs_skolem(final SubLObject cnfs, final SubLObject skolem_term, final SubLObject mt) {
        final SubLObject sk_constant = cycl_utilities.nat_functor(skolem_term);
        SubLObject unreified_sk_term = skolems.el_unreified_sk_term(sk_constant);
        if ((NIL != sk_constant) && (NIL != unreified_sk_term)) {
            final SubLObject sk_var = skolems.skolem_function_var(unreified_sk_term);
            final SubLObject uniquified_var = sk_var_wrt(sk_var, skolem_term, cnfs, mt);
            unreified_sk_term = expression_subst_skolem(uniquified_var, sk_var, copy_formula(unreified_sk_term), UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject sk_fn_vars = cdolist_list_var = second(unreified_sk_term);
            SubLObject sk_fn_var = NIL;
            sk_fn_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject uniquified_sk_fn_var = sk_fn_arg_wrt(sk_fn_var, skolem_term, cnfs, mt);
                unreified_sk_term = expression_subst_skolem(uniquified_sk_fn_var, sk_fn_var, copy_formula(unreified_sk_term), UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                sk_fn_var = cdolist_list_var.first();
            } 
            return values(expression_subst_skolem(unreified_sk_term, skolem_term, cnfs, symbol_function(EQUAL)), expression_subst_skolem(unreified_sk_term, skolem_term, mt, symbol_function(EQUAL)));
        }
        return values(cnfs, mt);
    }

    public static final SubLObject expression_subst_skolem_alt(SubLObject new_var, SubLObject old_var, SubLObject expression, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != funcall(test, new_var, old_var)) {
                return expression;
            } else {
                {
                    SubLObject result = NIL;
                    {
                        SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                        try {
                            cycl_utilities.$opaque_arg_function$.bind($sym102$OPAQUE_ARG_WRT_SKOLEM_, thread);
                            result = cycl_utilities.expression_subst(new_var, old_var, expression, test, UNPROVIDED);
                        } finally {
                            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
        }
    }

    public static SubLObject expression_subst_skolem(final SubLObject new_var, final SubLObject old_var, final SubLObject expression, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != funcall(test, new_var, old_var)) {
            return expression;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind($sym102$OPAQUE_ARG_WRT_SKOLEM_, thread);
            result = cycl_utilities.expression_subst(new_var, old_var, expression, test, UNPROVIDED);
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sk_fn_arg_wrt_alt(SubLObject sk_fn_var, SubLObject skolem_term, SubLObject cnfs, SubLObject mt) {
        if (cnfs == UNPROVIDED) {
            cnfs = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject ununiquified_var = NIL;
            ununiquified_var = com.cyc.cycjava.cycl.uncanonicalizer.ununiquify_el_var(sk_fn_var);
            if (!(sk_fn_var.eql(ununiquified_var) || (NIL == list_utilities.tree_find(ununiquified_var, cons(mt, cnfs), UNPROVIDED, UNPROVIDED)))) {
                result = ununiquified_var;
            }
            if (NIL == result) {
                result = sk_fn_var;
            }
            return result;
        }
    }

    public static SubLObject sk_fn_arg_wrt(final SubLObject sk_fn_var, final SubLObject skolem_term, SubLObject cnfs, SubLObject mt) {
        if (cnfs == UNPROVIDED) {
            cnfs = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject ununiquified_var = NIL;
        ununiquified_var = ununiquify_el_var(sk_fn_var);
        if ((!sk_fn_var.eql(ununiquified_var)) && (NIL != list_utilities.tree_find(ununiquified_var, cons(mt, cnfs), UNPROVIDED, UNPROVIDED))) {
            result = ununiquified_var;
        }
        if (NIL == result) {
            result = sk_fn_var;
        }
        return result;
    }

    public static final SubLObject sk_var_wrt_alt(SubLObject sk_var, SubLObject skolem_term, SubLObject cnfs, SubLObject mt) {
        if (cnfs == UNPROVIDED) {
            cnfs = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject ununiquified_var = NIL;
                if (NIL == list_utilities.tree_find(sk_var, cons(mt, cnfs), UNPROVIDED, UNPROVIDED)) {
                    ununiquified_var = com.cyc.cycjava.cycl.uncanonicalizer.ununiquify_el_var(sk_var);
                    if (!(sk_var.eql(ununiquified_var) || (NIL != list_utilities.tree_find(ununiquified_var, cons(mt, cnfs), UNPROVIDED, UNPROVIDED)))) {
                        result = ununiquified_var;
                    }
                }
                if (NIL == result) {
                    {
                        SubLObject current_var_bind = assoc(sk_var, czer_vars.$el_var_blist$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        if (NIL != current_var_bind) {
                            if (!skolem_term.eql(current_var_bind.rest())) {
                                {
                                    SubLObject current_sk_bind = rassoc(skolem_term, czer_vars.$el_var_blist$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
                                    if (NIL != current_sk_bind) {
                                        result = current_sk_bind.first();
                                    } else {
                                        result = com.cyc.cycjava.cycl.uncanonicalizer.skolem_uniquify(sk_var);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == result) {
                    result = sk_var;
                }
                {
                    SubLObject item_var = cons(result, skolem_term);
                    if (NIL == member(item_var, czer_vars.$el_var_blist$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        czer_vars.$el_var_blist$.setDynamicValue(cons(item_var, czer_vars.$el_var_blist$.getDynamicValue(thread)), thread);
                    }
                }
                if (NIL != skolems.recomputing_defn_of_skolemP(cycl_utilities.nat_functor(skolem_term))) {
                    skolems.note_skolem_binding(result, sk_var);
                }
                return result;
            }
        }
    }

    public static SubLObject sk_var_wrt(final SubLObject sk_var, final SubLObject skolem_term, SubLObject cnfs, SubLObject mt) {
        if (cnfs == UNPROVIDED) {
            cnfs = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ununiquified_var = NIL;
        if (NIL == list_utilities.tree_find(sk_var, cons(mt, cnfs), UNPROVIDED, UNPROVIDED)) {
            ununiquified_var = ununiquify_el_var(sk_var);
            if ((!sk_var.eql(ununiquified_var)) && (NIL == list_utilities.tree_find(ununiquified_var, cons(mt, cnfs), UNPROVIDED, UNPROVIDED))) {
                result = ununiquified_var;
            }
        }
        if (NIL == result) {
            final SubLObject current_var_bind = assoc(sk_var, czer_vars.$el_var_blist$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            if ((NIL != current_var_bind) && (!skolem_term.eql(current_var_bind.rest()))) {
                final SubLObject current_sk_bind = rassoc(skolem_term, czer_vars.$el_var_blist$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
                if (NIL != current_sk_bind) {
                    result = current_sk_bind.first();
                } else {
                    result = skolem_uniquify(sk_var);
                }
            }
        }
        if (NIL == result) {
            result = sk_var;
        }
        final SubLObject item_var = cons(result, skolem_term);
        if (NIL == member(item_var, czer_vars.$el_var_blist$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            czer_vars.$el_var_blist$.setDynamicValue(cons(item_var, czer_vars.$el_var_blist$.getDynamicValue(thread)), thread);
        }
        if (NIL != skolems.recomputing_defn_of_skolemP(cycl_utilities.nat_functor(skolem_term))) {
            skolems.note_skolem_binding(result, sk_var);
        }
        return result;
    }

    public static final SubLObject skolem_uniquify_alt(SubLObject var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $default_skolem_vars$.getGlobalValue();
                SubLObject candidate_var = NIL;
                for (candidate_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_var = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(candidate_var, czer_vars.$el_var_blist$.getDynamicValue(thread), symbol_function(EQL), symbol_function(VARIABLE_BINDING_VARIABLE))) {
                        return candidate_var;
                    }
                }
            }
            return czer_main.uniquify(var);
        }
    }

    public static SubLObject skolem_uniquify(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $default_skolem_vars$.getGlobalValue();
        SubLObject candidate_var = NIL;
        candidate_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(candidate_var, czer_vars.$el_var_blist$.getDynamicValue(thread), symbol_function(EQL), symbol_function(VARIABLE_BINDING_VARIABLE))) {
                return candidate_var;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_var = cdolist_list_var.first();
        } 
        return czer_main.uniquify(var);
    }

    public static final SubLObject ununiquify_el_var_alt(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == czer_vars.$ununiquify_el_varsP$.getDynamicValue(thread)) {
                return symbol;
            }
            if (NIL == cycl_variables.el_varP(symbol)) {
                return symbol;
            }
            {
                SubLObject name = cycl_variables.el_var_name(symbol);
                SubLObject start = string_utilities.char_type_position(symbol_function(DIGIT_CHAR_P), name, UNPROVIDED, UNPROVIDED);
                SubLObject end = (NIL != start) ? ((SubLObject) (string_utilities.char_type_position(symbol_function(NOT_DIGIT_CHAR_P), name, start, UNPROVIDED))) : NIL;
                SubLObject result = NIL;
                if (NIL != start) {
                    if (NIL == end) {
                        if (start.numG(ZERO_INTEGER)) {
                            if (NIL != alpha_char_p(aref(name, subtract(start, ONE_INTEGER)))) {
                                result = cycl_variables.make_el_var(string_utilities.substring(name, ZERO_INTEGER, start));
                            } else {
                                result = cycl_variables.make_el_var(string_utilities.substring(name, ZERO_INTEGER, subtract(start, ONE_INTEGER)));
                            }
                        }
                    }
                }
                if (NIL == result) {
                    return symbol;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.uncanonicalizer.ununiquification_conflictP(symbol, result)) {
                        return symbol;
                    } else {
                        com.cyc.cycjava.cycl.uncanonicalizer.remember_ununiquified_el_var(symbol, result);
                        return result;
                    }
                }
            }
        }
    }

    public static SubLObject ununiquify_el_var(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$ununiquify_el_varsP$.getDynamicValue(thread)) {
            return symbol;
        }
        if (NIL == cycl_variables.el_varP(symbol)) {
            return symbol;
        }
        final SubLObject name = cycl_variables.el_var_name(symbol);
        final SubLObject start = string_utilities.char_type_position(symbol_function(DIGIT_CHAR_P), name, UNPROVIDED, UNPROVIDED);
        final SubLObject end = (NIL != start) ? string_utilities.char_type_position(symbol_function(NOT_DIGIT_CHAR_P), name, start, UNPROVIDED) : NIL;
        SubLObject result = NIL;
        if (((NIL != start) && (NIL == end)) && start.numG(ZERO_INTEGER)) {
            if (NIL != alpha_char_p(aref(name, subtract(start, ONE_INTEGER)))) {
                result = cycl_variables.make_el_var(string_utilities.substring(name, ZERO_INTEGER, start));
            } else {
                result = cycl_variables.make_el_var(string_utilities.substring(name, ZERO_INTEGER, subtract(start, ONE_INTEGER)));
            }
        }
        if (NIL == result) {
            return symbol;
        }
        if (NIL != ununiquification_conflictP(symbol, result)) {
            return symbol;
        }
        remember_ununiquified_el_var(symbol, result);
        return result;
    }

    public static final SubLObject remember_ununiquified_el_var_alt(SubLObject old, SubLObject v_new) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = NIL;
                if (NIL != dictionary.dictionary_p($ununiquified_el_vars$.getDynamicValue(thread))) {
                    okP = dictionary.dictionary_enter($ununiquified_el_vars$.getDynamicValue(thread), old, v_new);
                    if (NIL != okP) {
                        if (!old.eql(v_new)) {
                            okP = dictionary.dictionary_enter($ununiquified_el_vars$.getDynamicValue(thread), v_new, $UNUNUNIQUIFIABLE);
                        }
                    }
                }
                return okP;
            }
        }
    }

    public static SubLObject remember_ununiquified_el_var(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        if (NIL != dictionary.dictionary_p($ununiquified_el_vars$.getDynamicValue(thread))) {
            okP = dictionary.dictionary_enter($ununiquified_el_vars$.getDynamicValue(thread), old, v_new);
            if ((NIL != okP) && (!old.eql(v_new))) {
                okP = dictionary.dictionary_enter($ununiquified_el_vars$.getDynamicValue(thread), v_new, $UNUNUNIQUIFIABLE);
            }
        }
        return okP;
    }

    /**
     *
     *
     * @return boolean; t iff NEW is already used in the formula but
    is not the remembered ununiquification of OLD.
     */
    @LispMethod(comment = "@return boolean; t iff NEW is already used in the formula but\r\nis not the remembered ununiquification of OLD.")
    public static final SubLObject ununiquification_conflictP_alt(SubLObject old, SubLObject v_new) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (old.eql(v_new)) {
                return NIL;
            }
            if (NIL != dictionary.dictionary_p($ununiquified_el_vars$.getDynamicValue(thread))) {
                {
                    SubLObject old_renamed = dictionary.dictionary_lookup($ununiquified_el_vars$.getDynamicValue(thread), old, UNPROVIDED);
                    SubLObject new_renamed = dictionary.dictionary_lookup($ununiquified_el_vars$.getDynamicValue(thread), v_new, UNPROVIDED);
                    return makeBoolean(old_renamed.eql($UNUNUNIQUIFIABLE) || ((NIL != new_renamed) && (!old_renamed.eql(v_new))));
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean; t iff NEW is already used in the formula but
    is not the remembered ununiquification of OLD.
     */
    @LispMethod(comment = "@return boolean; t iff NEW is already used in the formula but\r\nis not the remembered ununiquification of OLD.")
    public static SubLObject ununiquification_conflictP(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (old.eql(v_new)) {
            return NIL;
        }
        if (NIL != dictionary.dictionary_p($ununiquified_el_vars$.getDynamicValue(thread))) {
            final SubLObject old_renamed = dictionary.dictionary_lookup($ununiquified_el_vars$.getDynamicValue(thread), old, UNPROVIDED);
            final SubLObject new_renamed = dictionary.dictionary_lookup($ununiquified_el_vars$.getDynamicValue(thread), v_new, UNPROVIDED);
            return makeBoolean(old_renamed.eql($UNUNUNIQUIFIABLE) || ((NIL != new_renamed) && (!old_renamed.eql(v_new))));
        }
        return NIL;
    }

    public static final SubLObject skolem_el_cnfs_from_assertions_alt(SubLObject skolem, SubLObject mt, SubLObject min_mt) {
        {
            SubLObject assertions = skolems.skolem_defn_assertions(skolem, UNPROVIDED);
            SubLObject differing_mts_modeP = makeBoolean((NIL == min_mt) && (NIL == com.cyc.cycjava.cycl.uncanonicalizer.assertions_in_same_mtP(assertions)));
            SubLObject cnfs = NIL;
            if (NIL != min_mt) {
                mt = min_mt;
            }
            {
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    {
                        SubLObject assertion_mt = (NIL != min_mt) ? ((SubLObject) (min_mt)) : assertions_high.assertion_mt(assertion);
                        SubLObject cnf = fi.perform_fi_substitutions(copy_clause(assertions_high.assertion_cnf(assertion)), assertions_high.assertion_el_variables(assertion));
                        SubLObject nat_lits = com.cyc.cycjava.cycl.uncanonicalizer.index_lits_to_remove(cnf);
                        SubLObject pos_lits = set_difference(clauses.pos_lits(cnf), nat_lits, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject neg_lits = set_difference(clauses.neg_lits(cnf), nat_lits, symbol_function(EQUAL), UNPROVIDED);
                        if (NIL != differing_mts_modeP) {
                            {
                                SubLObject new_pos_lits = NIL;
                                SubLObject new_neg_lits = NIL;
                                {
                                    SubLObject cdolist_list_var_24 = pos_lits;
                                    SubLObject pos_lit = NIL;
                                    for (pos_lit = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , pos_lit = cdolist_list_var_24.first()) {
                                        new_pos_lits = cons(com.cyc.cycjava.cycl.uncanonicalizer.possibly_make_ist_sentence(assertion_mt, pos_lit, mt), new_pos_lits);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var_25 = neg_lits;
                                    SubLObject neg_lit = NIL;
                                    for (neg_lit = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , neg_lit = cdolist_list_var_25.first()) {
                                        new_neg_lits = cons(com.cyc.cycjava.cycl.uncanonicalizer.possibly_make_ist_sentence(assertion_mt, neg_lit, mt), new_neg_lits);
                                    }
                                }
                                pos_lits = new_pos_lits;
                                neg_lits = new_neg_lits;
                            }
                        }
                        {
                            SubLObject el_cnfs = com.cyc.cycjava.cycl.uncanonicalizer.unreify_cnfs_nats(list(clauses.make_cnf(neg_lits, pos_lits)), nat_lits, mt);
                            cnfs = nunion(cnfs, el_cnfs, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return cnfs;
        }
    }

    public static SubLObject skolem_el_cnfs_from_assertions(final SubLObject skolem, SubLObject mt, final SubLObject min_mt) {
        final SubLObject assertions = skolems.skolem_defn_assertions(skolem, UNPROVIDED);
        final SubLObject differing_mts_modeP = makeBoolean((NIL == min_mt) && (NIL == assertions_in_same_mtP(assertions)));
        SubLObject cnfs = NIL;
        if (NIL != min_mt) {
            mt = min_mt;
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion_mt = (NIL != min_mt) ? min_mt : assertions_high.assertion_mt(assertion);
            final SubLObject cnf = fi.perform_fi_substitutions(copy_clause(assertions_high.assertion_cnf(assertion)), assertions_high.assertion_el_variables(assertion));
            final SubLObject nat_lits = index_lits_to_remove(cnf);
            SubLObject pos_lits = set_difference(clauses.pos_lits(cnf), nat_lits, symbol_function(EQUAL), UNPROVIDED);
            SubLObject neg_lits = set_difference(clauses.neg_lits(cnf), nat_lits, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != differing_mts_modeP) {
                SubLObject new_pos_lits = NIL;
                SubLObject new_neg_lits = NIL;
                SubLObject cdolist_list_var_$24 = pos_lits;
                SubLObject pos_lit = NIL;
                pos_lit = cdolist_list_var_$24.first();
                while (NIL != cdolist_list_var_$24) {
                    new_pos_lits = cons(possibly_make_ist_sentence(assertion_mt, pos_lit, mt), new_pos_lits);
                    cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                    pos_lit = cdolist_list_var_$24.first();
                } 
                SubLObject cdolist_list_var_$25 = neg_lits;
                SubLObject neg_lit = NIL;
                neg_lit = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    new_neg_lits = cons(possibly_make_ist_sentence(assertion_mt, neg_lit, mt), new_neg_lits);
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    neg_lit = cdolist_list_var_$25.first();
                } 
                pos_lits = new_pos_lits;
                neg_lits = new_neg_lits;
            }
            final SubLObject el_cnfs = unreify_cnfs_nats(list(clauses.make_cnf(neg_lits, pos_lits)), nat_lits, mt);
            cnfs = nunion(cnfs, el_cnfs, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return cnfs;
    }

    public static final SubLObject possibly_make_ist_sentence_alt(SubLObject sentence_mt, SubLObject sentence, SubLObject outer_mt) {
        {
            SubLObject result_sentence = (NIL != hlmt.hlmt_equalP(sentence_mt, outer_mt)) ? ((SubLObject) (sentence)) : make_ist_sentence(sentence_mt, sentence);
            return result_sentence;
        }
    }

    public static SubLObject possibly_make_ist_sentence(final SubLObject sentence_mt, final SubLObject sentence, final SubLObject outer_mt) {
        final SubLObject result_sentence = (NIL != hlmt.hlmt_equalP(sentence_mt, outer_mt)) ? sentence : make_ist_sentence(sentence_mt, sentence);
        return result_sentence;
    }

    public static final SubLObject assertions_in_same_mtP_alt(SubLObject assertions) {
        {
            SubLObject assertions_in_different_mtsP = NIL;
            SubLObject mt_finder = NIL;
            if (NIL == assertions_in_different_mtsP) {
                {
                    SubLObject csome_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != assertions_in_different_mtsP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        {
                            SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                            if (NIL == mt_finder) {
                                mt_finder = assertion_mt;
                            } else {
                                if (NIL != hlmt.hlmt_equalP(assertion_mt, mt_finder)) {
                                } else {
                                    assertions_in_different_mtsP = T;
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == assertions_in_different_mtsP);
        }
    }

    public static SubLObject assertions_in_same_mtP(final SubLObject assertions) {
        SubLObject assertions_in_different_mtsP = NIL;
        SubLObject mt_finder = NIL;
        if (NIL == assertions_in_different_mtsP) {
            SubLObject csome_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == assertions_in_different_mtsP) && (NIL != csome_list_var)) {
                final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                if (NIL == mt_finder) {
                    mt_finder = assertion_mt;
                } else
                    if (NIL == hlmt.hlmt_equalP(assertion_mt, mt_finder)) {
                        assertions_in_different_mtsP = T;
                    }

                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == assertions_in_different_mtsP);
    }

    public static final SubLObject el_cnfs_alt(SubLObject cnfs, SubLObject index_lits, SubLObject mt) {
        if (index_lits == UNPROVIDED) {
            index_lits = tou_lits(list_utilities.mapappend(symbol_function(NEG_LITS), cnfs));
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_cnfs = NIL;
                SubLObject el_mt = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$el_var_blist$.currentBinding(thread);
                    try {
                        czer_vars.$el_var_blist$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject el_cnfs_26 = com.cyc.cycjava.cycl.uncanonicalizer.unreify_cnfs_terms(cnfs, index_lits, mt);
                            SubLObject el_mt_27 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            el_cnfs = el_cnfs_26;
                            el_mt = el_mt_27;
                        }
                        {
                            SubLObject sk_constants = NIL;
                            {
                                SubLObject _prev_bind_0_28 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                                try {
                                    cycl_utilities.$opaque_arg_function$.bind($sym102$OPAQUE_ARG_WRT_SKOLEM_, thread);
                                    sk_constants = Mapping.mapcar(NAT_FUNCTOR, cycl_utilities.expression_gather(cons(mt, cnfs), $sym96$SKOLEM_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                } finally {
                                    cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0_28, thread);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = index_lits;
                                SubLObject index_lit = NIL;
                                for (index_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index_lit = cdolist_list_var.first()) {
                                    if (NIL != term.reified_skolem_termP(third(index_lit))) {
                                        sk_constants = cons(cycl_utilities.nat_functor(third(index_lit)), sk_constants);
                                    }
                                }
                            }
                            if (NIL != sk_constants) {
                                {
                                    SubLObject min_mt = skolems.skolems_min_mt(sk_constants);
                                    if (NIL != min_mt) {
                                        el_mt = min_mt;
                                    }
                                    {
                                        SubLObject arbitrary_sk_constant = sk_constants.first();
                                        el_cnfs = nunion(el_cnfs, com.cyc.cycjava.cycl.uncanonicalizer.skolem_el_cnfs_from_assertions(arbitrary_sk_constant, mt, min_mt), symbol_function(EQUAL), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        czer_vars.$el_var_blist$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(el_cnfs, el_mt);
            }
        }
    }

    public static SubLObject el_cnfs(final SubLObject cnfs, SubLObject index_lits, SubLObject mt) {
        if (index_lits == UNPROVIDED) {
            index_lits = tou_lits(list_utilities.mapappend(symbol_function(NEG_LITS), cnfs));
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_cnfs = NIL;
        SubLObject el_mt = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_var_blist$.currentBinding(thread);
        try {
            czer_vars.$el_var_blist$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject el_cnfs_$26 = unreify_cnfs_terms(cnfs, index_lits, mt);
            final SubLObject el_mt_$27 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            el_cnfs = el_cnfs_$26;
            el_mt = el_mt_$27;
            SubLObject sk_constants = NIL;
            final SubLObject _prev_bind_0_$28 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                cycl_utilities.$opaque_arg_function$.bind($sym102$OPAQUE_ARG_WRT_SKOLEM_, thread);
                sk_constants = Mapping.mapcar(NAT_FUNCTOR, cycl_utilities.expression_gather(cons(mt, cnfs), $sym96$SKOLEM_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0_$28, thread);
            }
            SubLObject cdolist_list_var = index_lits;
            SubLObject index_lit = NIL;
            index_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != term.reified_skolem_termP(third(index_lit))) {
                    sk_constants = cons(cycl_utilities.nat_functor(third(index_lit)), sk_constants);
                }
                cdolist_list_var = cdolist_list_var.rest();
                index_lit = cdolist_list_var.first();
            } 
            if (NIL != sk_constants) {
                final SubLObject min_mt = skolems.skolems_min_mt(sk_constants);
                if (NIL != min_mt) {
                    el_mt = min_mt;
                }
                final SubLObject arbitrary_sk_constant = sk_constants.first();
                el_cnfs = nunion(el_cnfs, skolem_el_cnfs_from_assertions(arbitrary_sk_constant, mt, min_mt), symbol_function(EQUAL), UNPROVIDED);
            }
        } finally {
            czer_vars.$el_var_blist$.rebind(_prev_bind_0, thread);
        }
        return values(el_cnfs, el_mt);
    }

    public static final SubLObject repair_assertion_vars_alt(SubLObject assertion) {
        {
            SubLObject vars = assertions_high.assertion_el_variables(assertion);
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                cnf = nsubst(variables.find_variable_by_id(position(var, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), var, cnf, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject repair_assertion_vars(final SubLObject assertion) {
        final SubLObject vars = assertions_high.assertion_el_variables(assertion);
        SubLObject cnf = assertions_high.assertion_cnf(assertion);
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cnf = nsubst(variables.find_variable_by_id(position(var, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), var, cnf, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject index_lits_to_remove_alt(SubLObject clause) {
        return append(com.cyc.cycjava.cycl.uncanonicalizer.tou_lits_to_remove(clause), com.cyc.cycjava.cycl.uncanonicalizer.evaluate_lits_to_remove(clause), com.cyc.cycjava.cycl.uncanonicalizer.equals_lits_to_remove(clause));
    }

    public static SubLObject index_lits_to_remove(final SubLObject clause) {
        return append(tou_lits_to_remove(clause), evaluate_lits_to_remove(clause), equals_lits_to_remove(clause));
    }

    public static final SubLObject tou_lits_to_remove_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sk_args = NIL;
                SubLObject tou_lits = tou_lits(clauses.neg_lits(clause));
                {
                    SubLObject cdolist_list_var = tou_lits;
                    SubLObject tou_lit = NIL;
                    for (tou_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tou_lit = cdolist_list_var.first()) {
                        if (NIL != term.reified_skolem_termP(literal_arg2(tou_lit, UNPROVIDED))) {
                            sk_args = nunion(sk_args, copy_list(cycl_utilities.nat_args(literal_arg2(tou_lit, UNPROVIDED), UNPROVIDED)), UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                {
                    SubLObject _prev_bind_0 = czer_vars.$gathering_quantified_fn_termsP$.currentBinding(thread);
                    try {
                        czer_vars.$gathering_quantified_fn_termsP$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = tou_lits;
                            SubLObject tou_lit = NIL;
                            for (tou_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tou_lit = cdolist_list_var.first()) {
                                if (NIL != cycl_variables.cyc_varP(literal_arg1(tou_lit, UNPROVIDED))) {
                                    if (NIL == subl_promotions.memberP(literal_arg1(tou_lit, UNPROVIDED), sk_args, UNPROVIDED, UNPROVIDED)) {
                                        if (list_utilities.tree_count(literal_arg1(tou_lit, UNPROVIDED), clause, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER)) {
                                            result = cons(tou_lit, result);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        czer_vars.$gathering_quantified_fn_termsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject tou_lits_to_remove(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject sk_args = NIL;
        SubLObject cdolist_list_var;
        final SubLObject tou_lits = cdolist_list_var = list_utilities.remove_if_not($sym109$REMOVABLE_TOU_LIT_, tou_lits(clauses.neg_lits(clause)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject tou_lit = NIL;
        tou_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.reified_skolem_termP(literal_arg2(tou_lit, UNPROVIDED))) {
                sk_args = nunion(sk_args, copy_list(cycl_utilities.nat_args(literal_arg2(tou_lit, UNPROVIDED), UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tou_lit = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = czer_vars.$gathering_quantified_fn_termsP$.currentBinding(thread);
        try {
            czer_vars.$gathering_quantified_fn_termsP$.bind(T, thread);
            SubLObject cdolist_list_var2 = tou_lits;
            SubLObject tou_lit2 = NIL;
            tou_lit2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (((NIL != cycl_variables.cyc_varP(literal_arg1(tou_lit2, UNPROVIDED))) && (NIL == subl_promotions.memberP(literal_arg1(tou_lit2, UNPROVIDED), sk_args, UNPROVIDED, UNPROVIDED))) && list_utilities.tree_count(literal_arg1(tou_lit2, UNPROVIDED), clause, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER)) {
                    result = cons(tou_lit2, result);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                tou_lit2 = cdolist_list_var2.first();
            } 
        } finally {
            czer_vars.$gathering_quantified_fn_termsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject removable_tou_litP(final SubLObject asent) {
        final SubLObject naut = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject functor = (NIL != possibly_naut_p(naut)) ? cycl_utilities.nat_functor(naut) : NIL;
        if (NIL != fort_types_interface.reifiable_function_p(functor)) {
            return T;
        }
        if (NIL != forts.fort_p(functor)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject evaluate_lits_to_remove_alt(SubLObject clause) {
        {
            SubLObject evaluate_lits = evaluate_lits(clauses.neg_lits(clause));
            SubLObject ambiguous_eval_vars = list_utilities.duplicates(Mapping.mapcar(symbol_function(LITERAL_ARG1), evaluate_lits), UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject sk_args = NIL;
            {
                SubLObject cdolist_list_var = evaluate_lits;
                SubLObject evaluate_lit = NIL;
                for (evaluate_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evaluate_lit = cdolist_list_var.first()) {
                    if (NIL != term.reified_skolem_termP(third(evaluate_lit))) {
                        sk_args = nunion(sk_args, copy_list(cycl_utilities.nat_args(third(evaluate_lit), UNPROVIDED)), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = evaluate_lits;
                SubLObject evaluate_lit = NIL;
                for (evaluate_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , evaluate_lit = cdolist_list_var.first()) {
                    {
                        SubLObject evaluate_var = literal_arg1(evaluate_lit, UNPROVIDED);
                        if (NIL != cycl_variables.cyc_varP(evaluate_var)) {
                            if (NIL == subl_promotions.memberP(evaluate_var, sk_args, UNPROVIDED, UNPROVIDED)) {
                                if (NIL == subl_promotions.memberP(evaluate_var, ambiguous_eval_vars, UNPROVIDED, UNPROVIDED)) {
                                    if (NIL != relation_evaluation.evaluatable_expressionP(literal_arg2(evaluate_lit, UNPROVIDED))) {
                                        if (list_utilities.tree_count(evaluate_var, clause, UNPROVIDED, UNPROVIDED).numE(TWO_INTEGER)) {
                                            if (NIL == com.cyc.cycjava.cycl.uncanonicalizer.variable_should_not_be_substituted_during_unczeP(evaluate_var, clause)) {
                                                result = cons(evaluate_lit, result);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject evaluate_lits_to_remove(final SubLObject clause) {
        final SubLObject evaluate_lits = evaluate_lits(clauses.neg_lits(clause));
        final SubLObject ambiguous_eval_vars = list_utilities.duplicates(Mapping.mapcar(symbol_function(LITERAL_ARG1), evaluate_lits), UNPROVIDED, UNPROVIDED);
        final SubLObject variables_inside_functions = gather_variables_inside_functions(clause, UNPROVIDED);
        final SubLObject consequent_variable = sentence_free_variables(clauses.pos_lits(clause), NIL, $sym91$EL_VAR_, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject sk_args = NIL;
        SubLObject cdolist_list_var = evaluate_lits;
        SubLObject evaluate_lit = NIL;
        evaluate_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.reified_skolem_termP(third(evaluate_lit))) {
                sk_args = nunion(sk_args, copy_list(cycl_utilities.nat_args(third(evaluate_lit), UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            evaluate_lit = cdolist_list_var.first();
        } 
        cdolist_list_var = evaluate_lits;
        evaluate_lit = NIL;
        evaluate_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject evaluate_var = literal_arg1(evaluate_lit, UNPROVIDED);
            if ((((((((NIL != cycl_variables.cyc_varP(evaluate_var)) && (NIL == subl_promotions.memberP(evaluate_var, sk_args, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(evaluate_var, ambiguous_eval_vars, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(evaluate_var, variables_inside_functions, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(evaluate_var, consequent_variable, UNPROVIDED, UNPROVIDED))) && (NIL != relation_evaluation.evaluatable_expressionP(literal_arg2(evaluate_lit, UNPROVIDED)))) && list_utilities.tree_count(evaluate_var, clause, UNPROVIDED, UNPROVIDED).numE(TWO_INTEGER)) && (NIL == variable_should_not_be_substituted_during_unczeP(evaluate_var, clause))) {
                result = cons(evaluate_lit, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            evaluate_lit = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject variable_should_not_be_substituted_during_unczeP_alt(SubLObject variable, SubLObject clause) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = clauses.pos_lits(clause);
            SubLObject pos_lit = NIL;
            for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                {
                    SubLObject relation = literal_arg0(pos_lit, UNPROVIDED);
                    SubLObject positions = cycl_utilities.formula_arg_positions(pos_lit, variable, UNPROVIDED);
                    if (NIL == result) {
                        {
                            SubLObject csome_list_var = positions;
                            SubLObject position = NIL;
                            for (position = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , position = csome_list_var.first()) {
                                if (NIL != czer_utilities.leave_variables_at_el_for_argP(relation, position, UNPROVIDED)) {
                                    result = T;
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject variable_should_not_be_substituted_during_unczeP(final SubLObject variable, final SubLObject clause) {
        SubLObject result;
        SubLObject rest;
        SubLObject pos_lit;
        SubLObject relation;
        SubLObject positions;
        SubLObject csome_list_var;
        SubLObject position;
        for (result = NIL, rest = NIL, rest = clauses.pos_lits(clause); (NIL == result) && (NIL != rest); rest = rest.rest()) {
            pos_lit = rest.first();
            relation = literal_arg0(pos_lit, UNPROVIDED);
            positions = cycl_utilities.formula_arg_positions(pos_lit, variable, UNPROVIDED);
            if (NIL == result) {
                csome_list_var = positions;
                position = NIL;
                position = csome_list_var.first();
                while ((NIL == result) && (NIL != csome_list_var)) {
                    if (NIL != czer_utilities.leave_variables_at_el_for_argP(relation, position, UNPROVIDED)) {
                        result = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    position = csome_list_var.first();
                } 
            }
        }
        SubLObject neg_lit;
        for (rest = NIL, rest = clauses.neg_lits(clause); (NIL == result) && (NIL != rest); rest = rest.rest()) {
            neg_lit = rest.first();
            if ((NIL != kb_utilities.kbeq($$evaluate, literal_arg0(neg_lit, UNPROVIDED))) && variable.eql(literal_arg2(neg_lit, UNPROVIDED))) {
                result = T;
            }
        }
        return result;
    }

    public static SubLObject gather_variables_inside_functions(final SubLObject clause, SubLObject inside_functionP) {
        if (inside_functionP == UNPROVIDED) {
            inside_functionP = NIL;
        }
        SubLObject result = NIL;
        if ((NIL != inside_functionP) && clause.isList()) {
            return cycl_utilities.expression_gather(clause, EL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL != inside_functionP) && (NIL != cycl_grammar.el_variable_p(clause))) {
            if (NIL == member(clause, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                result = cons(clause, result);
            }
        } else
            if ((clause.isList() && (NIL != forts.fort_p(cycl_utilities.formula_arg0(clause)))) && (NIL != fort_types_interface.functor_p(cycl_utilities.formula_arg0(clause)))) {
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(clause, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$29 = gather_variables_inside_functions(arg, T);
                    SubLObject var = NIL;
                    var = cdolist_list_var_$29.first();
                    while (NIL != cdolist_list_var_$29) {
                        final SubLObject item_var = var;
                        if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                        cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                        var = cdolist_list_var_$29.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } else
                if (clause.isList()) {
                    SubLObject cdolist_list_var2 = cycl_utilities.formula_terms(clause, UNPROVIDED);
                    SubLObject item = NIL;
                    item = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject cdolist_list_var_$30 = gather_variables_inside_functions(item, UNPROVIDED);
                        SubLObject var2 = NIL;
                        var2 = cdolist_list_var_$30.first();
                        while (NIL != cdolist_list_var_$30) {
                            final SubLObject item_var2 = var2;
                            if (NIL == member(item_var2, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result = cons(item_var2, result);
                            }
                            cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                            var2 = cdolist_list_var_$30.first();
                        } 
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        item = cdolist_list_var2.first();
                    } 
                }


        return result;
    }

    public static final SubLObject equals_lits_to_remove_alt(SubLObject clause) {
        {
            SubLObject equals_lits = equals_lits(clauses.neg_lits(clause));
            SubLObject ambiguous_equal_vars = list_utilities.duplicates(Mapping.mapcar(symbol_function(LITERAL_ARG1), equals_lits), UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject sk_args = NIL;
            {
                SubLObject cdolist_list_var = equals_lits;
                SubLObject equals_lit = NIL;
                for (equals_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , equals_lit = cdolist_list_var.first()) {
                    if (NIL != term.reified_skolem_termP(third(equals_lit))) {
                        sk_args = nunion(sk_args, copy_list(cycl_utilities.nat_args(third(equals_lit), UNPROVIDED)), UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = equals_lits;
                SubLObject equals_lit = NIL;
                for (equals_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , equals_lit = cdolist_list_var.first()) {
                    if (NIL != cycl_variables.cyc_varP(literal_arg1(equals_lit, UNPROVIDED))) {
                        if (NIL == subl_promotions.memberP(literal_arg1(equals_lit, UNPROVIDED), sk_args, UNPROVIDED, UNPROVIDED)) {
                            if (NIL == subl_promotions.memberP(literal_arg1(equals_lit, UNPROVIDED), ambiguous_equal_vars, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != relation_evaluation.evaluatable_expressionP(literal_arg2(equals_lit, UNPROVIDED))) {
                                    if (list_utilities.tree_count(literal_arg1(equals_lit, UNPROVIDED), clause, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER)) {
                                        result = cons(equals_lit, result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject equals_lits_to_remove(final SubLObject clause) {
        final SubLObject equals_lits = equals_lits(clauses.neg_lits(clause));
        final SubLObject ambiguous_equal_vars = list_utilities.duplicates(Mapping.mapcar(symbol_function(LITERAL_ARG1), equals_lits), UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject sk_args = NIL;
        SubLObject cdolist_list_var = equals_lits;
        SubLObject equals_lit = NIL;
        equals_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.reified_skolem_termP(third(equals_lit))) {
                sk_args = nunion(sk_args, copy_list(cycl_utilities.nat_args(third(equals_lit), UNPROVIDED)), UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            equals_lit = cdolist_list_var.first();
        } 
        cdolist_list_var = equals_lits;
        equals_lit = NIL;
        equals_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((((NIL != cycl_variables.cyc_varP(literal_arg1(equals_lit, UNPROVIDED))) && (NIL == subl_promotions.memberP(literal_arg1(equals_lit, UNPROVIDED), sk_args, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(literal_arg1(equals_lit, UNPROVIDED), ambiguous_equal_vars, UNPROVIDED, UNPROVIDED))) && (NIL != relation_evaluation.evaluatable_expressionP(literal_arg2(equals_lit, UNPROVIDED)))) && list_utilities.tree_count(literal_arg1(equals_lit, UNPROVIDED), clause, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER)) {
                result = cons(equals_lit, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            equals_lit = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject uncanonicalize_recursive_query_alt(SubLObject sentence) {
        return com.cyc.cycjava.cycl.uncanonicalizer.uncanonicalize_recursive_query_vars(sentence);
    }

    public static SubLObject uncanonicalize_recursive_query(final SubLObject sentence) {
        return uncanonicalize_recursive_query_vars(sentence);
    }

    public static final SubLObject uncanonicalize_recursive_query_vars_alt(SubLObject v_object) {
        if (v_object.isCons()) {
            v_object = copy_tree(v_object);
        }
        return transform_list_utilities.ntransform(v_object, symbol_function(VARIABLE_P), symbol_function(DEFAULT_EL_VAR_FOR_HL_VAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject uncanonicalize_recursive_query_vars(SubLObject v_object) {
        if (v_object.isCons()) {
            v_object = copy_tree(v_object);
        }
        return transform_list_utilities.ntransform(v_object, symbol_function(VARIABLE_P), symbol_function(DEFAULT_EL_VAR_FOR_HL_VAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_uncanonicalizer_file() {
        declareMacro("remembering_ununiquified_el_vars", "REMEMBERING-UNUNIQUIFIED-EL-VARS");
        declareFunction("assertion_el_formula_memoized_internal", "ASSERTION-EL-FORMULA-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("assertion_el_formula_memoized", "ASSERTION-EL-FORMULA-MEMOIZED", 1, 0, false);
        declareFunction("assertion_el_formula", "ASSERTION-EL-FORMULA", 1, 0, false);
        declareFunction("assertion_elmt", "ASSERTION-ELMT", 1, 0, false);
        declareFunction("assertion_el_ist_formula", "ASSERTION-EL-IST-FORMULA", 1, 0, false);
        declareFunction("interesting_uncanonicalizationsP", "INTERESTING-UNCANONICALIZATIONS?", 1, 0, false);
        declareFunction("fast_fi_not_el_termP", "FAST-FI-NOT-EL-TERM?", 1, 0, false);
        new uncanonicalizer.$fast_fi_not_el_termP$UnaryFunction();
        declareFunction("potentially_interestingly_uncanonicalizable_tense_termP", "POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?", 1, 0, false);
        new uncanonicalizer.$potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction();
        declareFunction("clear_cached_assertion_el_formula_int", "CLEAR-CACHED-ASSERTION-EL-FORMULA-INT", 0, 0, false);
        declareFunction("remove_cached_assertion_el_formula_int", "REMOVE-CACHED-ASSERTION-EL-FORMULA-INT", 1, 0, false);
        declareFunction("cached_assertion_el_formula_int_internal", "CACHED-ASSERTION-EL-FORMULA-INT-INTERNAL", 1, 0, false);
        declareFunction("cached_assertion_el_formula_int", "CACHED-ASSERTION-EL-FORMULA-INT", 1, 0, false);
        declareFunction("assertion_el_formula_int", "ASSERTION-EL-FORMULA-INT", 1, 0, false);
        declareFunction("unwrap_el_formulas_of_assertions_destructive", "UNWRAP-EL-FORMULAS-OF-ASSERTIONS-DESTRUCTIVE", 1, 0, false);
        declareFunction("new_assertion_el_formula_int", "NEW-ASSERTION-EL-FORMULA-INT", 1, 0, false);
        declareFunction("cnf_el_formula", "CNF-EL-FORMULA", 1, 2, false);
        declareFunction("cnfs_el_formula", "CNFS-EL-FORMULA", 1, 2, false);
        declareFunction("hl_dnfs_to_hl_cnfs", "HL-DNFS-TO-HL-CNFS", 1, 0, false);
        declareFunction("hl_cnfs_to_hl_dnfs", "HL-CNFS-TO-HL-DNFS", 1, 0, false);
        declareFunction("dnfs_el_formula", "DNFS-EL-FORMULA", 1, 2, false);
        declareFunction("el_cnfs_to_el_implication", "EL-CNFS-TO-EL-IMPLICATION", 2, 0, false);
        declareFunction("remove_index_lits_from_cnfs", "REMOVE-INDEX-LITS-FROM-CNFS", 2, 0, false);
        declareFunction("cnf_intermediate_el_formula", "CNF-INTERMEDIATE-EL-FORMULA", 1, 0, false);
        declareFunction("dnf_intermediate_el_formula", "DNF-INTERMEDIATE-EL-FORMULA", 1, 0, false);
        declareFunction("el_version", "EL-VERSION", 1, 1, false);
        declareFunction("el_explicitify_implicit_meta_literals", "EL-EXPLICITIFY-IMPLICIT-META-LITERALS", 1, 0, false);
        declareFunction("el_pragmatic_requirements", "EL-PRAGMATIC-REQUIREMENTS", 1, 0, false);
        declareFunction("el_pragmatic_requirement", "EL-PRAGMATIC-REQUIREMENT", 1, 0, false);
        declareFunction("el_exceptions", "EL-EXCEPTIONS", 1, 0, false);
        declareFunction("el_except_for", "EL-EXCEPT-FOR", 1, 0, false);
        declareFunction("el_except_when", "EL-EXCEPT-WHEN", 1, 0, false);
        declareFunction("unpackage_cnf_clauses", "UNPACKAGE-CNF-CLAUSES", 1, 0, false);
        declareFunction("unpackage_dnf_clauses", "UNPACKAGE-DNF-CLAUSES", 1, 0, false);
        declareFunction("remove_truesentence_refs", "REMOVE-TRUESENTENCE-REFS", 1, 0, false);
        declareFunction("true_sentence_vars", "TRUE-SENTENCE-VARS", 1, 0, false);
        declareFunction("undo_variables", "UNDO-VARIABLES", 1, 0, false);
        declareFunction("unremove_universals", "UNREMOVE-UNIVERSALS", 1, 0, false);
        declareFunction("unremove_universals_int", "UNREMOVE-UNIVERSALS-INT", 1, 0, false);
        declareFunction("inter_formula_terms", "INTER-FORMULA-TERMS", 2, 2, false);
        declareFunction("inter_formula_skolems", "INTER-FORMULA-SKOLEMS", 2, 0, false);
        declareFunction("some_tree_find", "SOME-TREE-FIND", 2, 2, false);
        declareFunction("unremove_existentials_and_refd_universals", "UNREMOVE-EXISTENTIALS-AND-REFD-UNIVERSALS", 2, 0, false);
        declareFunction("undo_skolem_mt", "UNDO-SKOLEM-MT", 2, 0, false);
        declareFunction("base_kb_ist_sentenceP", "BASE-KB-IST-SENTENCE?", 1, 0, false);
        declareFunction("segregate_skolems", "SEGREGATE-SKOLEMS", 1, 0, false);
        declareFunction("undo_existentials_and_refd_universals", "UNDO-EXISTENTIALS-AND-REFD-UNIVERSALS", 1, 1, false);
        declareFunction("init_existentialize_formula", "INIT-EXISTENTIALIZE-FORMULA", 2, 0, false);
        declareFunction("existentialize_formula", "EXISTENTIALIZE-FORMULA", 2, 0, false);
        declareFunction("implications_in", "IMPLICATIONS-IN", 1, 0, false);
        declareFunction("undo_implications", "UNDO-IMPLICATIONS", 1, 0, false);
        declareFunction("implicatable_disjunctionP", "IMPLICATABLE-DISJUNCTION?", 1, 0, false);
        declareFunction("implicatable_conjunctionP", "IMPLICATABLE-CONJUNCTION?", 1, 0, false);
        declareFunction("uncanon_dnf_1", "UNCANON-DNF-1", 1, 0, false);
        declareFunction("naut_formulaP", "NAUT-FORMULA?", 1, 0, false);
        declareFunction("ists_out", "ISTS-OUT", 1, 0, false);
        declareFunction("simplifiable_ist_expressionP", "SIMPLIFIABLE-IST-EXPRESSION?", 1, 0, false);
        declareFunction("simplify_ist_expression", "SIMPLIFY-IST-EXPRESSION", 1, 0, false);
        declareFunction("remove_leading_universals", "REMOVE-LEADING-UNIVERSALS", 1, 0, false);
        declareFunction("sentence_free_vars_not_bound_to_skolems", "SENTENCE-FREE-VARS-NOT-BOUND-TO-SKOLEMS", 1, 1, false);
        declareFunction("add_universal_var_placeholder", "ADD-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false);
        declareFunction("check_for_universal_var_placeholder", "CHECK-FOR-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false);
        declareFunction("remove_universal_var_placeholder", "REMOVE-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false);
        declareFunction("skolem_fn_arg_vars", "SKOLEM-FN-ARG-VARS", 1, 0, false);
        declareFunction("formula_unreified_skolems", "FORMULA-UNREIFIED-SKOLEMS", 1, 0, false);
        declareFunction("universal_vars_to_skolem_table", "UNIVERSAL-VARS-TO-SKOLEM-TABLE", 1, 1, false);
        declareFunction("remove_skolem_from_universal_vars_to_skolem", "REMOVE-SKOLEM-FROM-UNIVERSAL-VARS-TO-SKOLEM", 1, 0, false);
        declareFunction("num_args_of_skolem_fn", "NUM-ARGS-OF-SKOLEM-FN", 1, 0, false);
        declareFunction("order_skolems_inner_to_outer", "ORDER-SKOLEMS-INNER-TO-OUTER", 1, 0, false);
        declareFunction("nsubst_hl_vars", "NSUBST-HL-VARS", 2, 0, false);
        declareFunction("unreify_cnfs_nats", "UNREIFY-CNFS-NATS", 1, 2, false);
        declareFunction("gather_skolem_constants", "GATHER-SKOLEM-CONSTANTS", 1, 1, false);
        declareFunction("unreify_cnfs_terms", "UNREIFY-CNFS-TERMS", 1, 2, false);
        declareFunction("unreify_cnfs_assertions", "UNREIFY-CNFS-ASSERTIONS", 1, 1, false);
        declareFunction("wrapped_assertion_el_formula_wrt_mt", "WRAPPED-ASSERTION-EL-FORMULA-WRT-MT", 1, 0, false);
        declareFunction("subst_index_in", "SUBST-INDEX-IN", 2, 0, false);
        declareFunction("unreify_cnfs_skolem", "UNREIFY-CNFS-SKOLEM", 3, 0, false);
        declareFunction("expression_subst_skolem", "EXPRESSION-SUBST-SKOLEM", 3, 1, false);
        declareFunction("sk_fn_arg_wrt", "SK-FN-ARG-WRT", 2, 2, false);
        declareFunction("sk_var_wrt", "SK-VAR-WRT", 2, 2, false);
        declareFunction("skolem_uniquify", "SKOLEM-UNIQUIFY", 1, 0, false);
        declareFunction("ununiquify_el_var", "UNUNIQUIFY-EL-VAR", 1, 0, false);
        declareFunction("remember_ununiquified_el_var", "REMEMBER-UNUNIQUIFIED-EL-VAR", 2, 0, false);
        declareFunction("ununiquification_conflictP", "UNUNIQUIFICATION-CONFLICT?", 2, 0, false);
        declareFunction("skolem_el_cnfs_from_assertions", "SKOLEM-EL-CNFS-FROM-ASSERTIONS", 3, 0, false);
        declareFunction("possibly_make_ist_sentence", "POSSIBLY-MAKE-IST-SENTENCE", 3, 0, false);
        declareFunction("assertions_in_same_mtP", "ASSERTIONS-IN-SAME-MT?", 1, 0, false);
        declareFunction("el_cnfs", "EL-CNFS", 1, 2, false);
        declareFunction("repair_assertion_vars", "REPAIR-ASSERTION-VARS", 1, 0, false);
        declareFunction("index_lits_to_remove", "INDEX-LITS-TO-REMOVE", 1, 0, false);
        declareFunction("tou_lits_to_remove", "TOU-LITS-TO-REMOVE", 1, 0, false);
        declareFunction("removable_tou_litP", "REMOVABLE-TOU-LIT?", 1, 0, false);
        declareFunction("evaluate_lits_to_remove", "EVALUATE-LITS-TO-REMOVE", 1, 0, false);
        declareFunction("variable_should_not_be_substituted_during_unczeP", "VARIABLE-SHOULD-NOT-BE-SUBSTITUTED-DURING-UNCZE?", 2, 0, false);
        declareFunction("gather_variables_inside_functions", "GATHER-VARIABLES-INSIDE-FUNCTIONS", 1, 1, false);
        declareFunction("equals_lits_to_remove", "EQUALS-LITS-TO-REMOVE", 1, 0, false);
        declareFunction("uncanonicalize_recursive_query", "UNCANONICALIZE-RECURSIVE-QUERY", 1, 0, false);
        declareFunction("uncanonicalize_recursive_query_vars", "UNCANONICALIZE-RECURSIVE-QUERY-VARS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uncanonicalizer_file_alt() {
        defparameter("*UNUNIQUIFIED-EL-VARS*", NIL);
        defparameter("*CACHE-EL-FORMULA?*", NIL);
        deflexical("*POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERMS*", $list_alt29);
        deflexical("*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*", NIL);
        defparameter("*RETAIN-LEADING-UNIVERSALS*", NIL);
        defparameter("*VARS-TO-UNIVERSALIZE*", NIL);
        defparameter("*UNIVERSAL-VARS-TO-SKOLEM*", NIL);
        defparameter("*UNCANONICALIZER-DNF-THRESHOLD*", FIVE_INTEGER);
        deflexical("*DEFAULT-SKOLEM-VARS*", $list_alt103);
        return NIL;
    }

    public static SubLObject init_uncanonicalizer_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*UNUNIQUIFIED-EL-VARS*", NIL);
            defparameter("*CACHE-EL-FORMULA?*", NIL);
            deflexical("*POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERMS*", $list28);
            deflexical("*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*", NIL);
            defparameter("*RETAIN-LEADING-UNIVERSALS*", NIL);
            defparameter("*VARS-TO-UNIVERSALIZE*", NIL);
            defparameter("*UNIVERSAL-VARS-TO-SKOLEM*", NIL);
            defparameter("*UNCANONICALIZER-DNF-THRESHOLD*", FIVE_INTEGER);
            deflexical("*DEFAULT-SKOLEM-VARS*", $list103);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERMS*", $list_alt29);
        }
        return NIL;
    }

    public static SubLObject init_uncanonicalizer_file_Previous() {
        defparameter("*UNUNIQUIFIED-EL-VARS*", NIL);
        defparameter("*CACHE-EL-FORMULA?*", NIL);
        deflexical("*POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERMS*", $list28);
        deflexical("*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*", NIL);
        defparameter("*RETAIN-LEADING-UNIVERSALS*", NIL);
        defparameter("*VARS-TO-UNIVERSALIZE*", NIL);
        defparameter("*UNIVERSAL-VARS-TO-SKOLEM*", NIL);
        defparameter("*UNCANONICALIZER-DNF-THRESHOLD*", FIVE_INTEGER);
        deflexical("*DEFAULT-SKOLEM-VARS*", $list103);
        return NIL;
    }

    public static final SubLObject setup_uncanonicalizer_file_alt() {
        memoization_state.note_memoized_function(ASSERTION_EL_FORMULA_MEMOIZED);
        register_cyc_api_function(ASSERTION_EL_FORMULA, $list_alt13, $str_alt14$Return_the_EL_formula_for_ASSERTI, $list_alt15, $list_alt16);
        register_cyc_api_function(ASSERTION_EL_IST_FORMULA, $list_alt13, $str_alt18$Return_the_el_formula_in___ist_fo, $list_alt15, $list_alt19);
        memoization_state.note_globally_cached_function(CACHED_ASSERTION_EL_FORMULA_INT);
        return NIL;
    }

    public static SubLObject setup_uncanonicalizer_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(ASSERTION_EL_FORMULA_MEMOIZED);
            register_cyc_api_function(ASSERTION_EL_FORMULA, $list12, $str13$Return_the_EL_formula_for_ASSERTI, $list14, $list15);
            register_cyc_api_function(ASSERTION_EL_IST_FORMULA, $list12, $str17$Return_the_el_formula_in___ist_fo, $list14, $list18);
            memoization_state.note_globally_cached_function(CACHED_ASSERTION_EL_FORMULA_INT);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(ASSERTION_EL_FORMULA, $list_alt13, $str_alt14$Return_the_EL_formula_for_ASSERTI, $list_alt15, $list_alt16);
            register_cyc_api_function(ASSERTION_EL_IST_FORMULA, $list_alt13, $str_alt18$Return_the_el_formula_in___ist_fo, $list_alt15, $list_alt19);
        }
        return NIL;
    }

    public static SubLObject setup_uncanonicalizer_file_Previous() {
        memoization_state.note_memoized_function(ASSERTION_EL_FORMULA_MEMOIZED);
        register_cyc_api_function(ASSERTION_EL_FORMULA, $list12, $str13$Return_the_EL_formula_for_ASSERTI, $list14, $list15);
        register_cyc_api_function(ASSERTION_EL_IST_FORMULA, $list12, $str17$Return_the_el_formula_in___ist_fo, $list14, $list18);
        memoization_state.note_globally_cached_function(CACHED_ASSERTION_EL_FORMULA_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_uncanonicalizer_file();
    }

    @Override
    public void initializeVariables() {
        init_uncanonicalizer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_uncanonicalizer_file();
    }

    static {
    }

    public static final class $fast_fi_not_el_termP$UnaryFunction extends UnaryFunction {
        public $fast_fi_not_el_termP$UnaryFunction() {
            super(extractFunctionNamed("FAST-FI-NOT-EL-TERM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fast_fi_not_el_termP(arg1);
        }
    }

    public static final class $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction extends UnaryFunction {
        public $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction() {
            super(extractFunctionNamed("POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return potentially_interestingly_uncanonicalizable_tense_termP(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("CNF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list(list(makeSymbol("*UNUNIQUIFIED-EL-VARS*"), list(makeSymbol("NEW-DICTIONARY"))));

    static private final SubLList $list_alt6 = list(list(makeSymbol("REMEMBER-UNUNIQUIFIED-EL-VAR"), makeSymbol("VAR"), makeSymbol("VAR")));

    public static final SubLSymbol $kw8$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt13 = list(makeSymbol("ASSERTION"));

    static private final SubLString $str_alt14$Return_the_EL_formula_for_ASSERTI = makeString("Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.");

    static private final SubLList $list_alt15 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));

    static private final SubLList $list_alt16 = list(makeSymbol("LISTP"));

    static private final SubLString $str_alt18$Return_the_el_formula_in___ist_fo = makeString("Return the el formula in #$ist format for ASSERTION.");

    static private final SubLList $list_alt19 = list(makeSymbol("CONSP"));

    static private final SubLSymbol $sym20$FAST_FI_NOT_EL_TERM_ = makeSymbol("FAST-FI-NOT-EL-TERM?");

    static private final SubLSymbol $sym21$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");

    static private final SubLSymbol $sym22$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_ = makeSymbol("POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?");

    static private final SubLSymbol $sym23$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol("QUOTED-TERM-WITH-HL-VAR?");

    static private final SubLList $list_alt29 = list(reader_make_constant_shell("IntervalEndedByFn"), reader_make_constant_shell("IntervalStartedByFn"));

    static private final SubLList $list_alt34 = list(makeKeyword("TREE-FIND"), list(reader_make_constant_shell("UncanonicalizerAssertionFn"), list(reader_make_constant_shell("SubLQuoteFn"), list($BIND, makeSymbol("EL-FORMULA")))));

    static private final SubLList $list_alt43 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLList $list_alt44 = list(makeSymbol("PRAG-PRED"), makeSymbol("VAR-LIST"), makeSymbol("ASSERTION"));

    static private final SubLList $list_alt50 = list(makeSymbol("AB-PRED"), makeSymbol("EXCEPTION-LIST"), makeSymbol("ASSERTION"));

    static private final SubLList $list_alt58 = list(makeSymbol("QUANTIFIER"), makeSymbol("VAR"), makeSymbol("SUBSENT"));

    static private final SubLList $list_alt59 = list(makeSymbol("QUANTIFIER"), makeSymbol("N"), makeSymbol("VAR"), makeSymbol("SUBSENT"));

    static private final SubLList $list_alt60 = list(makeSymbol("NEG-FORM"), makeSymbol("NEW-FORMULA"));

    static private final SubLString $str_alt61$unanticipated_formula___s = makeString("unanticipated formula: ~s");

    static private final SubLString $str_alt64$_S_is_not_well_formed_ = makeString("~S is not well formed.");

    static private final SubLList $list_alt78 = list(makeSymbol("UNIT"), makeSymbol("MIN"), makeSymbol("MAX"));

    static private final SubLString $str_alt83$_s_is_not_well_formed_ = makeString("~s is not well formed.");

    static private final SubLString $str_alt88$unable_to_simplify___ist_expressi = makeString("unable to simplify #$ist expression ~s");

    static private final SubLList $list_alt103 = list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"), makeSymbol("?A"), makeSymbol("?B"), makeSymbol("?C"), makeSymbol("?D"), makeSymbol("?E"));
}

/**
 * Total time: 828 ms
 */
