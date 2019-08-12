/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.pragma_induction;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CZER-MAIN
 * source file: /cyc/top/cycl/czer-main.lisp
 * created:     2019/07/03 17:37:30
 */
public final class czer_main extends SubLTranslatedFile implements V12 {
    public static final class $rename_clause_vars_int$UnaryFunction extends UnaryFunction {
        public $rename_clause_vars_int$UnaryFunction() {
            super(extractFunctionNamed("RENAME-CLAUSE-VARS-INT"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return rename_clause_vars_int(arg1, UNPROVIDED);
        }
    }

    public static final SubLFile me = new czer_main();

 public static final String myName = "com.cyc.cycjava.cycl.czer_main";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $canonicalize_clause_sentence_terms_sense_lambda$ = makeSymbol("*CANONICALIZE-CLAUSE-SENTENCE-TERMS-SENSE-LAMBDA*");

    // defparameter
    /**
     * A list of predicates that are guaranteed to never be commutative. Checked for
     * speed before calling on SBHL.
     */
    @LispMethod(comment = "A list of predicates that are guaranteed to never be commutative. Checked for\r\nspeed before calling on SBHL.\ndefparameter\nA list of predicates that are guaranteed to never be commutative. Checked for\nspeed before calling on SBHL.")
    private static final SubLSymbol $never_commutative_predicates$ = makeSymbol("*NEVER-COMMUTATIVE-PREDICATES*");

    // defparameter
    /**
     * A binding list to remember existential variables, to remember the original EL
     * variable as it was asserted.
     */
    @LispMethod(comment = "A binding list to remember existential variables, to remember the original EL\r\nvariable as it was asserted.\ndefparameter\nA binding list to remember existential variables, to remember the original EL\nvariable as it was asserted.")
    public static final SubLSymbol $tou_skolem_blist$ = makeSymbol("*TOU-SKOLEM-BLIST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $czer_create_nart_uses_nart_defining_rules_methodP$ = makeSymbol("*CZER-CREATE-NART-USES-NART-DEFINING-RULES-METHOD?*");

    // defparameter
    // lambda for var-is-scoped-in-formula?
    /**
     * lambda for var-is-scoped-in-formula?
     */
    @LispMethod(comment = "lambda for var-is-scoped-in-formula?\ndefparameter")
    private static final SubLSymbol $var_is_scoped_in_formula_var$ = makeSymbol("*VAR-IS-SCOPED-IN-FORMULA-VAR*");

    private static final SubLSymbol EL_TO_HL = makeSymbol("EL-TO-HL");

    static private final SubLList $list2 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str3$Translate_el_expression_FORMULA_i = makeString("Translate el expression FORMULA into its equivalent canonical hl expressions");

    static private final SubLList $list4 = list(list(makeSymbol("FORMULA"), makeSymbol("EL-FORMULA-P")));

    private static final SubLSymbol EL_TO_HL_QUERY = makeSymbol("EL-TO-HL-QUERY");

    static private final SubLString $str6$Translate_el_query_FORMULA_into_i = makeString("Translate el query FORMULA into its equivalent hl expressions");

    static private final SubLList $list8 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*MT*")));

    static private final SubLString $str9$Converts_the_EL_term_TERM_to_its_ = makeString("Converts the EL term TERM to its canonical HL representation.\n   @return HL term");

    private static final SubLSymbol CANONICALIZE_TERM_MEMOIZED_INT = makeSymbol("CANONICALIZE-TERM-MEMOIZED-INT");

    private static final SubLString $$$czer_memoization_state = makeString("czer memoization state");

    private static final SubLSymbol $sym13$CANON_WFF_ = makeSymbol("CANON-WFF?");

    private static final SubLSymbol $sym15$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");







    private static final SubLSymbol SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");

    private static final SubLSymbol CYCL_GENERALIZED_TENSED_LITERAL_P = makeSymbol("CYCL-GENERALIZED-TENSED-LITERAL-P");

    private static final SubLSymbol CANONICALIZE_WF_CYCL_INT_MEMOIZED = makeSymbol("CANONICALIZE-WF-CYCL-INT-MEMOIZED");

    private static final SubLSymbol CANONICALIZE_ASK_INT_MEMOIZED = makeSymbol("CANONICALIZE-ASK-INT-MEMOIZED");

    private static final SubLSymbol $sym23$EL_WFF_SYNTAX_ = makeSymbol("EL-WFF-SYNTAX?");

    private static final SubLString $str25$Unknown_clausal_form__s = makeString("Unknown clausal form ~s");

    private static final SubLSymbol CANONICALIZE_CLAUSE_QUOTED_TERMS = makeSymbol("CANONICALIZE-CLAUSE-QUOTED-TERMS");

    private static final SubLSymbol ESCAPE_QUOTE_SYNTAX_P = makeSymbol("ESCAPE-QUOTE-SYNTAX-P");

    private static final SubLSymbol $sym28$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLSymbol QUASI_QUOTE_SYNTAX_P = makeSymbol("QUASI-QUOTE-SYNTAX-P");





    private static final SubLSymbol FAST_ESCAPE_QUOTE_TERM_P = makeSymbol("FAST-ESCAPE-QUOTE-TERM-P");

    private static final SubLSymbol CANONICALIZE_CLAUSE_SENTENCE_TERMS = makeSymbol("CANONICALIZE-CLAUSE-SENTENCE-TERMS");

    private static final SubLSymbol CANONICALIZE_LITERAL_SENTENCE_TERMS = makeSymbol("CANONICALIZE-LITERAL-SENTENCE-TERMS");

    private static final SubLSymbol EL_NEGATION_P = makeSymbol("EL-NEGATION-P");

    private static final SubLString $str39$Tried_to_canonicalize_the_formula = makeString("Tried to canonicalize the formula terms of ~A, but it did not have the syntax of an EL relation.");

    private static final SubLSymbol CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol("CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE");

    private static final SubLList $list41 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    private static final SubLSymbol CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol("CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE");

    private static final SubLSymbol $sym43$COMMUTATIVE_TERMS_IN_ORDER_ = makeSymbol("COMMUTATIVE-TERMS-IN-ORDER?");

    private static final SubLSymbol $HELLO_YOU_SILLY_COMPILER = makeKeyword("HELLO-YOU-SILLY-COMPILER");



    private static final SubLSymbol $TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");

    private static final SubLSymbol $CYCLIC_COMMUTATIVE_IN_ARGS = makeKeyword("CYCLIC-COMMUTATIVE-IN-ARGS");

    private static final SubLSymbol $sym50$_ = makeSymbol("<");



    private static final SubLSymbol $sym53$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLString $str55$warning__trying_to_sort_the_varia = makeString("warning: trying to sort the variables ~A and ~A~%");

    private static final SubLString $str56$warning__trying_to_string_sort_th = makeString("warning: trying to string-sort the atoms ~A and ~A~%");

    private static final SubLSymbol ADD_TERM_OF_UNIT_LITS_1 = makeSymbol("ADD-TERM-OF-UNIT-LITS-1");

    private static final SubLSymbol EQUAL_WRT_SVM = makeSymbol("EQUAL-WRT-SVM");







    private static final SubLSymbol $sym64$_EXIT = makeSymbol("%EXIT");

    static private final SubLString $str66$Tried_to_reify_functions_within__ = makeString("Tried to reify functions within ~A, but it was not a relation expression.");

    private static final SubLSymbol CLAUSE_TERMS_TO_REIFY = makeSymbol("CLAUSE-TERMS-TO-REIFY");

    private static final SubLSymbol TERM_RELATIONAL_COMPLEXITY = makeSymbol("TERM-RELATIONAL-COMPLEXITY");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SCOPE-OF-SKOLEM");

    private static final SubLSymbol $sym72$_ = makeSymbol(">");

    private static final SubLSymbol TERM_FUNCTIONAL_COMPLEXITY = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY");

    private static final SubLSymbol NART_DEFINING_RULES_CACHED = makeSymbol("NART-DEFINING-RULES-CACHED");





    private static final SubLList $list79 = list(reader_make_constant_shell("natFunction"), reader_make_constant_shell("termOfUnit"));

    private static final SubLSymbol $nart_defining_rules_cached_caching_state$ = makeSymbol("*NART-DEFINING-RULES-CACHED-CACHING-STATE*");

    private static final SubLSymbol TL_FIND_OR_CREATE_NART = makeSymbol("TL-FIND-OR-CREATE-NART");



    private static final SubLList $list83 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));

    private static final SubLString $str86$SORT_BY_ID_called_on_list_contain = makeString("SORT-BY-ID called on list containing non-forts");

    private static final SubLSymbol $sym87$FORT_TYPE_AND_ID__ = makeSymbol("FORT-TYPE-AND-ID-<");

    private static final SubLSymbol LITERAL_QUANTIFIED_FN_TERMS = makeSymbol("LITERAL-QUANTIFIED-FN-TERMS");

    private static final SubLSymbol $sym89$NO_FREE_VARIABLES_ = makeSymbol("NO-FREE-VARIABLES?");

    private static final SubLSymbol LITERAL_TERMS_TO_REIFY = makeSymbol("LITERAL-TERMS-TO-REIFY");







    private static final SubLSymbol CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS = makeSymbol("CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS");

    private static final SubLList $list95 = list(makeSymbol("TERM"), makeSymbol("NAT"));

    private static final SubLList $list97 = list(reader_make_constant_shell("termOfUnit"), reader_make_constant_shell("evaluate"));

    private static final SubLList $list98 = cons(makeSymbol("OLD-VAR"), makeSymbol("NEW-VAR"));

    private static final SubLSymbol $sym99$VAR_IS_SCOPED_IN_FORMULA_ = makeSymbol("VAR-IS-SCOPED-IN-FORMULA?");

    private static final SubLSymbol $sym100$CLAUSES_IN_ORDER_ = makeSymbol("CLAUSES-IN-ORDER?");

    private static final SubLSymbol SORT_CLAUSE_LITERALS = makeSymbol("SORT-CLAUSE-LITERALS");

    private static final SubLSymbol NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");

    private static final SubLString $str103$most_constrained_literals_succeed = makeString("most-constrained-literals succeeded!");

    private static final SubLString $str104$fewest_arg_literals_succeeded_ = makeString("fewest-arg-literals succeeded!");

    private static final SubLString $str105$left_weighted_literals_succeeded_ = makeString("left-weighted-literals succeeded!");

    private static final SubLString $str106$left_connected_literals_succeeded = makeString("left-connected-literals succeeded!");

    private static final SubLString $str107$left_rooted_literals_succeeded_ = makeString("left-rooted-literals succeeded!");

    private static final SubLString $str108$least_complex_literals_succeeded_ = makeString("least-complex-literals succeeded!");

    private static final SubLString $str109$penultimate_resort_literals_1_suc = makeString("penultimate-resort-literals-1 succeeded!");

    private static final SubLString $str110$penultimate_resort_literals_2_suc = makeString("penultimate-resort-literals-2 succeeded!");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol $sym112$LIT__ = makeSymbol("LIT-<");

    private static final SubLString $str113$Got_a_fort_that_was_neither_a_nar = makeString("Got a fort that was neither a nart nor a constant.  It was one of these: ~a or ~a");

    private static final SubLString $str114$_s_is_not_an_element_of__s = makeString("~s is not an element of ~s");

    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLSymbol $sym120$CANON_VAR_ = makeSymbol("CANON-VAR?");

    private static final SubLString $str122$_s_treated_as_variable_in_rename_ = makeString("~s treated as variable in rename-clause-vars");

    private static final SubLSymbol NOT_DIGIT_CHAR_P = makeSymbol("NOT-DIGIT-CHAR-P");

    private static final SubLSymbol LIST_STRUCTURE = makeSymbol("LIST-STRUCTURE");

    private static final SubLSymbol $sym128$CONSTANT_EXTERNAL_ID__ = makeSymbol("CONSTANT-EXTERNAL-ID-<");

    // Definitions
    /**
     * Translate el expression FORMULA into its equivalent canonical hl expressions
     */
    @LispMethod(comment = "Translate el expression FORMULA into its equivalent canonical hl expressions")
    public static final SubLObject el_to_hl_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.czer_main.canonicalize_cycl(formula, mt);
    }

    // Definitions
    /**
     * Translate el expression FORMULA into its equivalent canonical hl expressions
     */
    @LispMethod(comment = "Translate el expression FORMULA into its equivalent canonical hl expressions")
    public static SubLObject el_to_hl(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(formula, EL_FORMULA_P);
        return canonicalize_cycl(formula, mt);
    }

    /**
     * Translate el query FORMULA into its equivalent hl expressions
     */
    @LispMethod(comment = "Translate el query FORMULA into its equivalent hl expressions")
    public static final SubLObject el_to_hl_query_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
        return com.cyc.cycjava.cycl.czer_main.canonicalize_query(formula, mt, NIL, T);
    }

    /**
     * Translate el query FORMULA into its equivalent hl expressions
     */
    @LispMethod(comment = "Translate el query FORMULA into its equivalent hl expressions")
    public static SubLObject el_to_hl_query(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLTrampolineFile.enforceType(formula, EL_FORMULA_P);
        return canonicalize_query(formula, mt, NIL, T);
    }

    /**
     * Translate el expression FORMULA into its equivalent canonical hl expressions
     * w/o applying semantic or arity wff tests
     *
     * @return HL expressions
     */
    @LispMethod(comment = "Translate el expression FORMULA into its equivalent canonical hl expressions\r\nw/o applying semantic or arity wff tests\r\n\r\n@return HL expressions\nTranslate el expression FORMULA into its equivalent canonical hl expressions\nw/o applying semantic or arity wff tests")
    public static final SubLObject el_to_hl_fast_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = NIL;
            result = com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(formula, mt, NIL, NIL, T, NIL);
            return result;
        }
    }

    /**
     * Translate el expression FORMULA into its equivalent canonical hl expressions
     * w/o applying semantic or arity wff tests
     *
     * @return HL expressions
     */
    @LispMethod(comment = "Translate el expression FORMULA into its equivalent canonical hl expressions\r\nw/o applying semantic or arity wff tests\r\n\r\n@return HL expressions\nTranslate el expression FORMULA into its equivalent canonical hl expressions\nw/o applying semantic or arity wff tests")
    public static SubLObject el_to_hl_fast(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject result = NIL;
        result = canonicalize_cycl_int(formula, mt, NIL, NIL, T, NIL);
        return result;
    }

    /**
     * Translate EL sentence SENTENCE into its equivalent canonical hl expression(s)
     * w/o applying any wff tests except the most basic syntactic ones.
     *
     * @return HL expressions
     */
    @LispMethod(comment = "Translate EL sentence SENTENCE into its equivalent canonical hl expression(s)\r\nw/o applying any wff tests except the most basic syntactic ones.\r\n\r\n@return HL expressions\nTranslate EL sentence SENTENCE into its equivalent canonical hl expression(s)\nw/o applying any wff tests except the most basic syntactic ones.")
    public static final SubLObject el_to_hl_really_fast_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl(sentence, mt);
    }

    /**
     * Translate EL sentence SENTENCE into its equivalent canonical hl expression(s)
     * w/o applying any wff tests except the most basic syntactic ones.
     *
     * @return HL expressions
     */
    @LispMethod(comment = "Translate EL sentence SENTENCE into its equivalent canonical hl expression(s)\r\nw/o applying any wff tests except the most basic syntactic ones.\r\n\r\n@return HL expressions\nTranslate EL sentence SENTENCE into its equivalent canonical hl expression(s)\nw/o applying any wff tests except the most basic syntactic ones.")
    public static SubLObject el_to_hl_really_fast(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_wf_cycl(sentence, mt);
    }

    /**
     * Converts the EL term TERM to its canonical HL representation.
     *
     * @return HL term
     */
    @LispMethod(comment = "Converts the EL term TERM to its canonical HL representation.\r\n\r\n@return HL term")
    public static final SubLObject canonicalize_term_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    if (NIL != el_formula_p(v_term)) {
                        v_term = copy_formula(v_term);
                    }
                    {
                        SubLObject _prev_bind_0_1 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                        SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                        try {
                            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                            v_term = simplifier.simplify_sequence_variables_1(v_term);
                            if (NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread)) {
                                v_term = com.cyc.cycjava.cycl.czer_main.canonicalize_relation_sentence_terms(v_term, mt);
                            }
                            v_term = com.cyc.cycjava.cycl.czer_main.canonicalize_term_commutative_terms(v_term);
                            v_term = com.cyc.cycjava.cycl.czer_main.reify_relation_functions(v_term, makeBoolean(NIL == czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue(thread)));
                        } finally {
                            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            return v_term;
        }
    }

    /**
     * Converts the EL term TERM to its canonical HL representation.
     *
     * @return HL term
     */
    @LispMethod(comment = "Converts the EL term TERM to its canonical HL representation.\r\n\r\n@return HL term")
    public static SubLObject canonicalize_term(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (NIL != precanonicalizer.precanonicalizationsP(v_term, mt, UNPROVIDED)) {
                v_term = precanonicalizer.safe_precanonicalizations(v_term, mt);
            }
            if (NIL != el_formula_p(v_term)) {
                v_term = copy_formula(v_term);
            }
            final SubLObject _prev_bind_0_$1 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
            try {
                czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                v_term = simplifier.simplify_sequence_variables_1(v_term);
                if (NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread)) {
                    v_term = canonicalize_relation_sentence_terms(v_term, mt);
                }
                v_term = canonicalize_term_commutative_terms(v_term);
                v_term = reify_relation_functions(v_term, makeBoolean(NIL == czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue(thread)));
            } finally {
                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
                czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_term;
    }

    public static final SubLObject canonicalize_term_memoized_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_term_memoized_int(v_term, mt);
    }

    public static SubLObject canonicalize_term_memoized(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_term_memoized_int(v_term, mt);
    }

    public static final SubLObject canonicalize_term_memoized_int_internal_alt(SubLObject v_term, SubLObject mt) {
        return copy_tree(com.cyc.cycjava.cycl.czer_main.canonicalize_term(v_term, mt));
    }

    public static SubLObject canonicalize_term_memoized_int_internal(final SubLObject v_term, final SubLObject mt) {
        return copy_tree(canonicalize_term(v_term, mt));
    }

    public static final SubLObject canonicalize_term_memoized_int_alt(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.czer_main.canonicalize_term_memoized_int_internal(v_term, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_TERM_MEMOIZED_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_TERM_MEMOIZED_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_TERM_MEMOIZED_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_main.canonicalize_term_memoized_int_internal(v_term, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject canonicalize_term_memoized_int(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return canonicalize_term_memoized_int_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_TERM_MEMOIZED_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_TERM_MEMOIZED_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_TERM_MEMOIZED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(canonicalize_term_memoized_int_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Converts the EL term TERM to its canonical HL representation,
     * under the assumptions that TERM is to be part of an assertion.
     * A consequence of this is that reifiable functions will be reified.
     *
     * @return HL term
     */
    @LispMethod(comment = "Converts the EL term TERM to its canonical HL representation,\r\nunder the assumptions that TERM is to be part of an assertion.\r\nA consequence of this is that reifiable functions will be reified.\r\n\r\n@return HL term\nConverts the EL term TERM to its canonical HL representation,\nunder the assumptions that TERM is to be part of an assertion.\nA consequence of this is that reifiable functions will be reified.")
    public static final SubLObject canonicalize_term_assert_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    try {
                        $within_assert$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.czer_main.canonicalize_term(v_term, mt);
                    } finally {
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Converts the EL term TERM to its canonical HL representation,
     * under the assumptions that TERM is to be part of an assertion.
     * A consequence of this is that reifiable functions will be reified.
     *
     * @return HL term
     */
    @LispMethod(comment = "Converts the EL term TERM to its canonical HL representation,\r\nunder the assumptions that TERM is to be part of an assertion.\r\nA consequence of this is that reifiable functions will be reified.\r\n\r\n@return HL term\nConverts the EL term TERM to its canonical HL representation,\nunder the assumptions that TERM is to be part of an assertion.\nA consequence of this is that reifiable functions will be reified.")
    public static SubLObject canonicalize_term_assert(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            result = canonicalize_term(v_term, mt);
        } finally {
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Convert the EL TERM into a FORT and return it, otherwise generate an error.
     */
    @LispMethod(comment = "Convert the EL TERM into a FORT and return it, otherwise generate an error.")
    public static final SubLObject coerce_to_fort_alt(SubLObject v_term) {
        {
            SubLObject fort = com.cyc.cycjava.cycl.czer_main.canonicalize_term(v_term, UNPROVIDED);
            SubLTrampolineFile.checkType(fort, FORT_P);
            return fort;
        }
    }

    /**
     * Convert the EL TERM into a FORT and return it, otherwise generate an error.
     */
    @LispMethod(comment = "Convert the EL TERM into a FORT and return it, otherwise generate an error.")
    public static SubLObject coerce_to_fort(final SubLObject v_term) {
        final SubLObject fort = canonicalize_term(v_term, UNPROVIDED);
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return fort;
    }

    /**
     * Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,
     * or NIL if it couldn't canonicalize.
     */
    @LispMethod(comment = "Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\r\nor NIL if it couldn\'t canonicalize.\nReturn GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\nor NIL if it couldn\'t canonicalize.")
    public static final SubLObject canonicalize_gaf_alt(SubLObject gaf_asent, SubLObject mt) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_assert_sentence(gaf_asent, mt);
    }

    /**
     * Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,
     * or NIL if it couldn't canonicalize.
     */
    @LispMethod(comment = "Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\r\nor NIL if it couldn\'t canonicalize.\nReturn GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\nor NIL if it couldn\'t canonicalize.")
    public static SubLObject canonicalize_gaf(final SubLObject gaf_asent, final SubLObject mt) {
        return canonicalize_assert_sentence(gaf_asent, mt);
    }

    /**
     * Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,
     * or NIL if it couldn't canonicalize.  GAF-ASENT is assumed to be WFF.
     */
    @LispMethod(comment = "Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\r\nor NIL if it couldn\'t canonicalize.  GAF-ASENT is assumed to be WFF.\nReturn GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\nor NIL if it couldn\'t canonicalize.  GAF-ASENT is assumed to be WFF.")
    public static final SubLObject canonicalize_wf_gaf_alt(SubLObject gaf_asent, SubLObject mt) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_wf_assert_sentence(gaf_asent, mt);
    }

    /**
     * Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,
     * or NIL if it couldn't canonicalize.  GAF-ASENT is assumed to be WFF.
     */
    @LispMethod(comment = "Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\r\nor NIL if it couldn\'t canonicalize.  GAF-ASENT is assumed to be WFF.\nReturn GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,\nor NIL if it couldn\'t canonicalize.  GAF-ASENT is assumed to be WFF.")
    public static SubLObject canonicalize_wf_gaf(final SubLObject gaf_asent, final SubLObject mt) {
        return canonicalize_wf_assert_sentence(gaf_asent, mt);
    }

    /**
     * A destructive version of @xref canonicalize-cycl.
     */
    @LispMethod(comment = "A destructive version of @xref canonicalize-cycl.")
    public static final SubLObject ncanonicalize_cycl_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(formula, mt, NIL, T, T, UNPROVIDED);
    }

    /**
     * A destructive version of @xref canonicalize-cycl.
     */
    @LispMethod(comment = "A destructive version of @xref canonicalize-cycl.")
    public static SubLObject ncanonicalize_cycl(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_cycl_int(formula, mt, NIL, T, T, UNPROVIDED);
    }

    /**
     * Converts the EL sentence SENTENCE to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if SENTENCE was ill-formed.
     * @return 1 boolean; whether extra FI operations were created as a result of canonicalization.
     * @return 2; if TESTING?, some additional information about the variables.
     * @return 3 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret SENTENCE.
     * @param testing?
     * 		whether we are doing regression testing and wish to slightly change the functionality.
     */
    @LispMethod(comment = "Converts the EL sentence SENTENCE to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if SENTENCE was ill-formed.\r\n@return 1 boolean; whether extra FI operations were created as a result of canonicalization.\r\n@return 2; if TESTING?, some additional information about the variables.\r\n@return 3 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret SENTENCE.\r\n@param testing?\r\n\t\twhether we are doing regression testing and wish to slightly change the functionality.")
    public static final SubLObject canonicalize_cycl_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(sentence, mt, NIL, NIL, T, UNPROVIDED);
    }

    /**
     * Converts the EL sentence SENTENCE to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if SENTENCE was ill-formed.
     * @return 1 boolean; whether extra FI operations were created as a result of canonicalization.
     * @return 2; if TESTING?, some additional information about the variables.
     * @return 3 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret SENTENCE.
     * @param testing?
     * 		whether we are doing regression testing and wish to slightly change the functionality.
     */
    @LispMethod(comment = "Converts the EL sentence SENTENCE to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if SENTENCE was ill-formed.\r\n@return 1 boolean; whether extra FI operations were created as a result of canonicalization.\r\n@return 2; if TESTING?, some additional information about the variables.\r\n@return 3 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret SENTENCE.\r\n@param testing?\r\n\t\twhether we are doing regression testing and wish to slightly change the functionality.")
    public static SubLObject canonicalize_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_cycl_int(sentence, mt, NIL, NIL, T, UNPROVIDED);
    }

    public static final SubLObject canonicalize_cycl_int_alt(SubLObject sentence, SubLObject mt, SubLObject testingP, SubLObject destructiveP, SubLObject unwrap_istP, SubLObject check_wffP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (testingP == UNPROVIDED) {
            testingP = NIL;
        }
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (unwrap_istP == UNPROVIDED) {
            unwrap_istP = NIL;
        }
        if (check_wffP == UNPROVIDED) {
            check_wffP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) || (NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.czer_main.clear_canon_caches();
            }
            {
                SubLObject result = NIL;
                SubLObject subordinate_fi_opsP = NIL;
                SubLObject variables_memory = NIL;
                SubLObject wffP = makeBoolean(NIL == check_wffP);
                SubLObject copied_formula = NIL;
                mt = hlmt_czer.canonicalize_hlmt(mt);
                if ((NIL != check_wffP) && (NIL == mt)) {
                    wffP = NIL;
                }
                {
                    SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$czer_memoization_state$.currentBinding(thread);
                    try {
                        czer_vars.$within_canonicalizerP$.bind(T, thread);
                        czer_vars.$czer_memoization_state$.bind(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_2 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt13$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject mt_var = mt;
                                                {
                                                    SubLObject _prev_bind_0_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = czer_vars.$subordinate_fi_opsP$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                                        czer_vars.$subordinate_fi_opsP$.bind(NIL, thread);
                                                        copied_formula = (NIL != destructiveP) ? ((SubLObject) (sentence)) : copy_formula(sentence);
                                                        {
                                                            SubLObject _prev_bind_0_5 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_6 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                                                            try {
                                                                czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                                                                czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                                                                if (NIL != check_wffP) {
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = wff_utilities.$check_arityP$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_8 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                                                        try {
                                                                            wff_utilities.$check_arityP$.bind(com.cyc.cycjava.cycl.czer_main.check_wff_arityP(), thread);
                                                                            wff_utilities.$check_wff_semanticsP$.bind(com.cyc.cycjava.cycl.czer_main.check_wff_semanticsP(UNPROVIDED), thread);
                                                                            wffP = com.cyc.cycjava.cycl.czer_main.canon_wffP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                                                            if (NIL == wffP) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject simpler_formula = simplifier.try_to_simplify_non_wff_into_wff(copied_formula, symbol_function($sym14$CANON_WFF_), mt_relevance_macros.$mt$.getDynamicValue(thread));
                                                                                    SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != is_it_wff_nowP) {
                                                                                        wffP = T;
                                                                                        copied_formula = simpler_formula;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_1_8, thread);
                                                                            wff_utilities.$check_arityP$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                }
                                                                if (NIL != wffP) {
                                                                    result = copied_formula;
                                                                    {
                                                                        SubLObject quiescedP = NIL;
                                                                        SubLObject count = ZERO_INTEGER;
                                                                        while (NIL == quiescedP) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject result_9 = com.cyc.cycjava.cycl.czer_main.clausify_eliminating_ists(result, mt, $CNF, unwrap_istP);
                                                                                SubLObject mt_10 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                result = result_9;
                                                                                mt = mt_10;
                                                                            }
                                                                            result = clausifier.cnf_operators_out(result);
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject result_11 = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses(result, mt);
                                                                                SubLObject mt_12 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                result = result_11;
                                                                                mt = mt_12;
                                                                            }
                                                                            if (count.numGE(czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue(thread))) {
                                                                                quiescedP = T;
                                                                            } else {
                                                                                quiescedP = com.cyc.cycjava.cycl.czer_main.czer_result_quiescedP(result, unwrap_istP);
                                                                            }
                                                                            if (NIL == quiescedP) {
                                                                                result = uncanonicalizer.cnf_intermediate_el_formula(czer_utilities.extract_el_clauses(result));
                                                                            }
                                                                            count = add(count, ONE_INTEGER);
                                                                        } 
                                                                    }
                                                                    subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue(thread);
                                                                    if (NIL != testingP) {
                                                                        variables_memory = czer_vars.$standardize_variables_memory$.getDynamicValue(thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1_6, thread);
                                                                czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        czer_vars.$subordinate_fi_opsP$.rebind(_prev_bind_2, thread);
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_4, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        czer_vars.$czer_memoization_state$.rebind(_prev_bind_1, thread);
                        czer_vars.$within_canonicalizerP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == unwrap_istP) {
                    mt = NIL;
                }
                if (NIL != czer_vars.$clothe_naked_skolemsP$.getDynamicValue(thread)) {
                    com.cyc.cycjava.cycl.czer_main.clothe_naked_skolems(result);
                }
                return values(result, subordinate_fi_opsP, variables_memory, mt);
            }
        }
    }

    public static SubLObject canonicalize_cycl_int(final SubLObject sentence, SubLObject mt, SubLObject testingP, SubLObject destructiveP, SubLObject unwrap_istP, SubLObject check_wffP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (testingP == UNPROVIDED) {
            testingP = NIL;
        }
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (unwrap_istP == UNPROVIDED) {
            unwrap_istP = NIL;
        }
        if (check_wffP == UNPROVIDED) {
            check_wffP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == wff_vars.$within_wffP$.getDynamicValue(thread)) && (NIL == czer_vars.$within_canonicalizerP$.getDynamicValue(thread))) {
            clear_canon_caches();
        }
        SubLObject result = NIL;
        SubLObject subordinate_fi_opsP = NIL;
        SubLObject variables_memory = NIL;
        SubLObject wffP = makeBoolean(NIL == check_wffP);
        SubLObject copied_formula = NIL;
        mt = hlmt_czer.canonicalize_hlmt(mt);
        if ((NIL != check_wffP) && (NIL == mt)) {
            wffP = NIL;
        }
        final SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$czer_memoization_state$.currentBinding(thread);
        try {
            czer_vars.$within_canonicalizerP$.bind(T, thread);
            czer_vars.$czer_memoization_state$.bind(memoization_state.new_memoization_state($$$czer_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$2 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = czer_vars.$subordinate_fi_opsP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        czer_vars.$subordinate_fi_opsP$.bind(NIL, thread);
                        copied_formula = (NIL != destructiveP) ? sentence : copy_formula(sentence);
                        thread.resetMultipleValues();
                        final SubLObject copied_formula_$5 = precanonicalizer.early_precanonicalizations(copied_formula, mt);
                        final SubLObject mt_$6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        copied_formula = copied_formula_$5;
                        mt = mt_$6;
                        final SubLObject _prev_bind_0_$4 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                        try {
                            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                            if (NIL != check_wffP) {
                                final SubLObject _prev_bind_0_$5 = wff_utilities.$check_arityP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                try {
                                    wff_utilities.$check_arityP$.bind(check_wff_arityP(), thread);
                                    wff_utilities.$check_wff_semanticsP$.bind(check_wff_semanticsP(UNPROVIDED), thread);
                                    wffP = canon_wffP(copied_formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                    if (NIL == wffP) {
                                        thread.resetMultipleValues();
                                        final SubLObject simpler_formula = simplifier.try_to_simplify_non_wff_into_wff(copied_formula, symbol_function($sym13$CANON_WFF_), mt_relevance_macros.$mt$.getDynamicValue(thread));
                                        final SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != is_it_wff_nowP) {
                                            wffP = T;
                                            copied_formula = simpler_formula;
                                        }
                                    }
                                } finally {
                                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_1_$6, thread);
                                    wff_utilities.$check_arityP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            if (NIL != wffP) {
                                result = copied_formula;
                                SubLObject quiescedP = NIL;
                                SubLObject count = ZERO_INTEGER;
                                while (NIL == quiescedP) {
                                    thread.resetMultipleValues();
                                    final SubLObject result_$11 = clausify_eliminating_ists(result, mt, $CNF, unwrap_istP);
                                    final SubLObject mt_$7 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    result = result_$11;
                                    mt = mt_$7;
                                    result = clausifier.cnf_operators_out(result);
                                    thread.resetMultipleValues();
                                    final SubLObject result_$12 = canonicalize_clauses(result, mt);
                                    final SubLObject mt_$8 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    result = result_$12;
                                    mt = mt_$8;
                                    if (count.numGE(czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue(thread))) {
                                        quiescedP = T;
                                    } else {
                                        quiescedP = czer_result_quiescedP(result, unwrap_istP);
                                    }
                                    if (NIL == quiescedP) {
                                        result = uncanonicalizer.cnf_intermediate_el_formula(czer_utilities.extract_el_clauses(result));
                                    }
                                    count = add(count, ONE_INTEGER);
                                } 
                                subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue(thread);
                                if (NIL != testingP) {
                                    variables_memory = czer_vars.$standardize_variables_memory$.getDynamicValue(thread);
                                }
                            }
                        } finally {
                            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1_$5, thread);
                            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_$4, thread);
                        }
                    } finally {
                        czer_vars.$subordinate_fi_opsP$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$4, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            czer_vars.$czer_memoization_state$.rebind(_prev_bind_2, thread);
            czer_vars.$within_canonicalizerP$.rebind(_prev_bind_0, thread);
        }
        if (NIL == unwrap_istP) {
            mt = NIL;
        }
        if (NIL != czer_vars.$clothe_naked_skolemsP$.getDynamicValue(thread)) {
            clothe_naked_skolems(result);
        }
        return values(result, subordinate_fi_opsP, variables_memory, mt);
    }

    /**
     * calling canonicalize-assert outside the context of cyc-assert may leave some half-created skolems
     * in the KB.  This function clothes them with #$termDependsOn assertions, to help the canonicalizer
     * tests clean up after themselves.
     */
    @LispMethod(comment = "calling canonicalize-assert outside the context of cyc-assert may leave some half-created skolems\r\nin the KB.  This function clothes them with #$termDependsOn assertions, to help the canonicalizer\r\ntests clean up after themselves.\ncalling canonicalize-assert outside the context of cyc-assert may leave some half-created skolems\nin the KB.  This function clothes them with #$termDependsOn assertions, to help the canonicalizer\ntests clean up after themselves.")
    public static final SubLObject clothe_naked_skolems_alt(SubLObject czer_result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cycl_utilities.expression_find_if($sym16$FAST_REIFIED_SKOLEM_, czer_result, T, UNPROVIDED)) {
                {
                    SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding(thread);
                    try {
                        czer_vars.$clothe_naked_skolemsP$.bind(NIL, thread);
                        {
                            SubLObject v_forts = cycl_utilities.expression_forts(czer_result, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = cycl_utilities.expression_gather(czer_result, SKOLEM_FUNCTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject skf = NIL;
                            for (skf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skf = cdolist_list_var.first()) {
                                if (NIL == czer_meta.find_assertion_cycl(list($$skolem, skf), UNPROVIDED)) {
                                    {
                                        SubLObject fake_defining_assertions = NIL;
                                        SubLObject cdolist_list_var_14 = v_forts;
                                        SubLObject fort = NIL;
                                        for (fort = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , fort = cdolist_list_var_14.first()) {
                                            if (fort != skf) {
                                                fake_defining_assertions = cons(list($$termDependsOn, skf, fort), fake_defining_assertions);
                                            }
                                        }
                                        fake_defining_assertions = simplifier.conjoin(fake_defining_assertions, UNPROVIDED);
                                        cyc_kernel.cyc_assert_wff(fake_defining_assertions, $$UniversalVocabularyMt, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        czer_vars.$clothe_naked_skolemsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return T;
            }
            return NIL;
        }
    }

    /**
     * calling canonicalize-assert outside the context of cyc-assert may leave some half-created skolems
     * in the KB.  This function clothes them with #$termDependsOn assertions, to help the canonicalizer
     * tests clean up after themselves.
     */
    @LispMethod(comment = "calling canonicalize-assert outside the context of cyc-assert may leave some half-created skolems\r\nin the KB.  This function clothes them with #$termDependsOn assertions, to help the canonicalizer\r\ntests clean up after themselves.\ncalling canonicalize-assert outside the context of cyc-assert may leave some half-created skolems\nin the KB.  This function clothes them with #$termDependsOn assertions, to help the canonicalizer\ntests clean up after themselves.")
    public static SubLObject clothe_naked_skolems(final SubLObject czer_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_utilities.expression_find_if($sym15$FAST_REIFIED_SKOLEM_, czer_result, T, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding(thread);
            try {
                czer_vars.$clothe_naked_skolemsP$.bind(NIL, thread);
                final SubLObject v_forts = cycl_utilities.expression_forts(czer_result, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(czer_result, SKOLEM_FUNCTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject skf = NIL;
                skf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == czer_meta.find_assertion_cycl(list($$skolem, skf), UNPROVIDED)) {
                        SubLObject fake_defining_assertions = NIL;
                        SubLObject cdolist_list_var_$16 = v_forts;
                        SubLObject fort = NIL;
                        fort = cdolist_list_var_$16.first();
                        while (NIL != cdolist_list_var_$16) {
                            if (!fort.eql(skf)) {
                                fake_defining_assertions = cons(list($$termDependsOn, skf, fort), fake_defining_assertions);
                            }
                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                            fort = cdolist_list_var_$16.first();
                        } 
                        fake_defining_assertions = simplifier.conjoin(fake_defining_assertions, UNPROVIDED);
                        cyc_kernel.cyc_assert_wff(fake_defining_assertions, $$UniversalVocabularyMt, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    skf = cdolist_list_var.first();
                } 
            } finally {
                czer_vars.$clothe_naked_skolemsP$.rebind(_prev_bind_0, thread);
            }
            return T;
        }
        return NIL;
    }

    /**
     * Currently the only case this handles is when the caller was supposed to unwrap #$ist but there's
     * still at least one #$ist literal in the czer result and no other literals.
     */
    @LispMethod(comment = "Currently the only case this handles is when the caller was supposed to unwrap #$ist but there\'s\r\nstill at least one #$ist literal in the czer result and no other literals.\nCurrently the only case this handles is when the caller was supposed to unwrap #$ist but there\'s\nstill at least one #$ist literal in the czer result and no other literals.")
    public static final SubLObject czer_result_quiescedP_alt(SubLObject czer_result, SubLObject caller_was_supposed_to_unwrap_istP) {
        if (NIL == caller_was_supposed_to_unwrap_istP) {
            return T;
        }
        if (NIL != cycl_grammar.cycl_truth_value_p(czer_result)) {
            return T;
        }
        if (NIL != cycl_utilities.expression_find_if(CYCL_GENERALIZED_TENSED_LITERAL_P, czer_result, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject ist_count = ZERO_INTEGER;
            SubLObject non_ist_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = czer_utilities.extract_hl_clauses(czer_result);
            SubLObject clause = NIL;
            for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_15 = clauses.neg_lits(clause);
                    SubLObject asent = NIL;
                    for (asent = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , asent = cdolist_list_var_15.first()) {
                        {
                            SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive(asent, UNPROVIDED);
                            if ((NIL != el_conjunction_p(unwrapped_asent)) || (NIL != el_existential_p(unwrapped_asent))) {
                                return NIL;
                            }
                        }
                        if ((NIL != ist_sentence_p(asent)) && (NIL != hlmt.chlmt_p(designated_mt(asent)))) {
                            ist_count = add(ist_count, ONE_INTEGER);
                        } else {
                            non_ist_count = add(non_ist_count, ONE_INTEGER);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var_16 = clauses.pos_lits(clause);
                    SubLObject asent = NIL;
                    for (asent = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , asent = cdolist_list_var_16.first()) {
                        {
                            SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive(asent, UNPROVIDED);
                            if ((NIL != el_conjunction_p(unwrapped_asent)) || (NIL != el_existential_p(unwrapped_asent))) {
                                return NIL;
                            }
                        }
                        if ((NIL != ist_sentence_p(asent)) && (NIL != hlmt.chlmt_p(designated_mt(asent)))) {
                            ist_count = add(ist_count, ONE_INTEGER);
                        } else {
                            non_ist_count = add(non_ist_count, ONE_INTEGER);
                        }
                    }
                }
            }
            if (ist_count.numGE(ONE_INTEGER) && non_ist_count.numE(ZERO_INTEGER)) {
                return NIL;
            }
        }
        return T;
    }

    /**
     * Currently the only case this handles is when the caller was supposed to unwrap #$ist but there's
     * still at least one #$ist literal in the czer result and no other literals.
     */
    @LispMethod(comment = "Currently the only case this handles is when the caller was supposed to unwrap #$ist but there\'s\r\nstill at least one #$ist literal in the czer result and no other literals.\nCurrently the only case this handles is when the caller was supposed to unwrap #$ist but there\'s\nstill at least one #$ist literal in the czer result and no other literals.")
    public static SubLObject czer_result_quiescedP(final SubLObject czer_result, final SubLObject caller_was_supposed_to_unwrap_istP) {
        if (NIL == caller_was_supposed_to_unwrap_istP) {
            return T;
        }
        if (NIL != cycl_grammar.cycl_truth_value_p(czer_result)) {
            return T;
        }
        if (NIL != cycl_utilities.expression_find_if(CYCL_GENERALIZED_TENSED_LITERAL_P, czer_result, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject ist_count = ZERO_INTEGER;
        SubLObject non_ist_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = czer_utilities.extract_hl_clauses(czer_result);
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$17 = clauses.neg_lits(clause);
            SubLObject asent = NIL;
            asent = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                final SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive(asent, UNPROVIDED);
                if ((NIL != el_conjunction_p(unwrapped_asent)) || (NIL != el_existential_p(unwrapped_asent))) {
                    return NIL;
                }
                if ((NIL != ist_sentence_p(asent, UNPROVIDED)) && (NIL != hlmt.chlmt_p(designated_mt(asent)))) {
                    ist_count = add(ist_count, ONE_INTEGER);
                } else {
                    non_ist_count = add(non_ist_count, ONE_INTEGER);
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                asent = cdolist_list_var_$17.first();
            } 
            SubLObject cdolist_list_var_$18 = clauses.pos_lits(clause);
            asent = NIL;
            asent = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                final SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive(asent, UNPROVIDED);
                if ((NIL != el_conjunction_p(unwrapped_asent)) || (NIL != el_existential_p(unwrapped_asent))) {
                    return NIL;
                }
                if ((NIL != ist_sentence_p(asent, UNPROVIDED)) && (NIL != hlmt.chlmt_p(designated_mt(asent)))) {
                    ist_count = add(ist_count, ONE_INTEGER);
                } else {
                    non_ist_count = add(non_ist_count, ONE_INTEGER);
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                asent = cdolist_list_var_$18.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        if (ist_count.numGE(ONE_INTEGER) && non_ist_count.numE(ZERO_INTEGER)) {
            return NIL;
        }
        return T;
    }

    /**
     * Converts the EL sentence SENTENCE to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if FORMULA was ill-formed.
     * @return 1 nil or hlmt-p;
    the microtheory in which to interpret the returned sentence.
    Note that this may differ from MT, for example when SENTENCE is an #$ist sentence.
     */
    @LispMethod(comment = "Converts the EL sentence SENTENCE to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if FORMULA was ill-formed.\r\n@return 1 nil or hlmt-p;\r\nthe microtheory in which to interpret the returned sentence.\r\nNote that this may differ from MT, for example when SENTENCE is an #$ist sentence.")
    public static final SubLObject canonicalize_cycl_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result = com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(sentence, mt, NIL, NIL, T, UNPROVIDED);
                SubLObject dummy1 = thread.secondMultipleValue();
                SubLObject dummy2 = thread.thirdMultipleValue();
                SubLObject mt_17 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return values(result, mt_17);
            }
        }
    }

    /**
     * Converts the EL sentence SENTENCE to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if FORMULA was ill-formed.
     * @return 1 nil or hlmt-p;
    the microtheory in which to interpret the returned sentence.
    Note that this may differ from MT, for example when SENTENCE is an #$ist sentence.
     */
    @LispMethod(comment = "Converts the EL sentence SENTENCE to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if FORMULA was ill-formed.\r\n@return 1 nil or hlmt-p;\r\nthe microtheory in which to interpret the returned sentence.\r\nNote that this may differ from MT, for example when SENTENCE is an #$ist sentence.")
    public static SubLObject canonicalize_cycl_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = canonicalize_cycl_int(sentence, mt, NIL, NIL, T, UNPROVIDED);
        final SubLObject dummy1 = thread.secondMultipleValue();
        final SubLObject dummy2 = thread.thirdMultipleValue();
        final SubLObject mt_$19 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return values(result, mt_$19);
    }

    /**
     * A special version of @xref canonicalize-cycl used for regression testing.
     */
    @LispMethod(comment = "A special version of @xref canonicalize-cycl used for regression testing.")
    public static final SubLObject canonicalize_cycl_test_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(formula, mt, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * A special version of @xref canonicalize-cycl used for regression testing.
     */
    @LispMethod(comment = "A special version of @xref canonicalize-cycl used for regression testing.")
    public static SubLObject canonicalize_cycl_test(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_cycl_int(formula, mt, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Canonicalizes a CycL sentence which is assumed to be well-formed,
     * and does not check it for well-formedness before or during canonicalization.
     * It still checks for the bare minimum of syntactic well-formedness, but
     * does not use any semantic checks.
     */
    @LispMethod(comment = "Canonicalizes a CycL sentence which is assumed to be well-formed,\r\nand does not check it for well-formedness before or during canonicalization.\r\nIt still checks for the bare minimum of syntactic well-formedness, but\r\ndoes not use any semantic checks.\nCanonicalizes a CycL sentence which is assumed to be well-formed,\nand does not check it for well-formedness before or during canonicalization.\nIt still checks for the bare minimum of syntactic well-formedness, but\ndoes not use any semantic checks.")
    public static final SubLObject canonicalize_wf_cycl_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = NIL;
            result = com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(sentence, mt, NIL, NIL, NIL, NIL);
            return result;
        }
    }

    /**
     * Canonicalizes a CycL sentence which is assumed to be well-formed,
     * and does not check it for well-formedness before or during canonicalization.
     * It still checks for the bare minimum of syntactic well-formedness, but
     * does not use any semantic checks.
     */
    @LispMethod(comment = "Canonicalizes a CycL sentence which is assumed to be well-formed,\r\nand does not check it for well-formedness before or during canonicalization.\r\nIt still checks for the bare minimum of syntactic well-formedness, but\r\ndoes not use any semantic checks.\nCanonicalizes a CycL sentence which is assumed to be well-formed,\nand does not check it for well-formedness before or during canonicalization.\nIt still checks for the bare minimum of syntactic well-formedness, but\ndoes not use any semantic checks.")
    public static SubLObject canonicalize_wf_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject result = NIL;
        result = canonicalize_cycl_int(sentence, mt, NIL, NIL, NIL, NIL);
        return result;
    }

    public static final SubLObject canonicalize_wf_cycl_memoized_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return copy_tree(com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl_int_memoized(sentence, mt));
    }

    public static SubLObject canonicalize_wf_cycl_memoized(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return copy_tree(canonicalize_wf_cycl_int_memoized(sentence, mt));
    }

    public static final SubLObject canonicalize_wf_cycl_int_memoized_internal_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl(sentence, mt);
    }

    public static SubLObject canonicalize_wf_cycl_int_memoized_internal(final SubLObject sentence, final SubLObject mt) {
        return canonicalize_wf_cycl(sentence, mt);
    }

    public static final SubLObject canonicalize_wf_cycl_int_memoized_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl_int_memoized_internal(sentence, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_WF_CYCL_INT_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_WF_CYCL_INT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_WF_CYCL_INT_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl_int_memoized_internal(sentence, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject canonicalize_wf_cycl_int_memoized(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return canonicalize_wf_cycl_int_memoized_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_WF_CYCL_INT_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_WF_CYCL_INT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_WF_CYCL_INT_MEMOIZED, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(canonicalize_wf_cycl_int_memoized_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject canonicalize_wf_cycl_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result = com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(sentence, mt, NIL, NIL, T, NIL);
                SubLObject dummy1 = thread.secondMultipleValue();
                SubLObject dummy2 = thread.thirdMultipleValue();
                SubLObject mt_18 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return values(result, mt_18);
            }
        }
    }

    public static SubLObject canonicalize_wf_cycl_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = canonicalize_cycl_int(sentence, mt, NIL, NIL, T, NIL);
        final SubLObject dummy1 = thread.secondMultipleValue();
        final SubLObject dummy2 = thread.thirdMultipleValue();
        final SubLObject mt_$20 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return values(result, mt_$20);
    }

    public static final SubLObject canonicalize_ask_memoized_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return copy_tree(com.cyc.cycjava.cycl.czer_main.canonicalize_ask_int_memoized(sentence, mt));
    }

    public static SubLObject canonicalize_ask_memoized(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return copy_tree(canonicalize_ask_int_memoized(sentence, mt));
    }

    public static final SubLObject canonicalize_ask_int_memoized_internal_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_ask(sentence, mt);
    }

    public static SubLObject canonicalize_ask_int_memoized_internal(final SubLObject sentence, final SubLObject mt) {
        return canonicalize_ask(sentence, mt);
    }

    public static final SubLObject canonicalize_ask_int_memoized_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.czer_main.canonicalize_ask_int_memoized_internal(sentence, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_ASK_INT_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_ASK_INT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_ASK_INT_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw11$_MEMOIZED_ITEM_NOT_FOUND_) {
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
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.czer_main.canonicalize_ask_int_memoized_internal(sentence, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject canonicalize_ask_int_memoized(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return canonicalize_ask_int_memoized_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CANONICALIZE_ASK_INT_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CANONICALIZE_ASK_INT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CANONICALIZE_ASK_INT_MEMOIZED, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(canonicalize_ask_int_memoized_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Unlike @xref canonicalize-query, returns a list of triples instead of pairs,
     * the third element being the free variables in that clause.
     */
    @LispMethod(comment = "Unlike @xref canonicalize-query, returns a list of triples instead of pairs,\r\nthe third element being the free variables in that clause.\nUnlike @xref canonicalize-query, returns a list of triples instead of pairs,\nthe third element being the free variables in that clause.")
    public static final SubLObject canonicalize_ask_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
                    try {
                        $within_ask$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.czer_main.remove_newly_introduced_variables_from_bindings(com.cyc.cycjava.cycl.czer_main.canonicalize_query(formula, mt, NIL, T), formula);
                    } finally {
                        $within_ask$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Unlike @xref canonicalize-query, returns a list of triples instead of pairs,
     * the third element being the free variables in that clause.
     */
    @LispMethod(comment = "Unlike @xref canonicalize-query, returns a list of triples instead of pairs,\r\nthe third element being the free variables in that clause.\nUnlike @xref canonicalize-query, returns a list of triples instead of pairs,\nthe third element being the free variables in that clause.")
    public static SubLObject canonicalize_ask(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
        try {
            $within_ask$.bind(T, thread);
            result = remove_newly_introduced_variables_from_bindings(canonicalize_query(formula, mt, NIL, T), formula);
        } finally {
            $within_ask$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject canonicalize_ask_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
                    try {
                        $within_ask$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.czer_main.canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
                        if (NIL != result) {
                            result = hlmt_czer.canonicalize_hlmt(result);
                        }
                    } finally {
                        $within_ask$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject canonicalize_ask_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
        try {
            $within_ask$.bind(T, thread);
            result = canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
            if (NIL != result) {
                result = hlmt_czer.canonicalize_hlmt(result);
            }
        } finally {
            $within_ask$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p; actually a list of triples
     * @return 1 nil or hlmt-p
     */
    @LispMethod(comment = "@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p; actually a list of triples\r\n@return 1 nil or hlmt-p")
    public static final SubLObject canonicalize_ask_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
                    try {
                        $within_ask$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result_19 = com.cyc.cycjava.cycl.czer_main.canonicalize_query_sentence(sentence, mt);
                            SubLObject mt_20 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_19;
                            mt = mt_20;
                        }
                        result = com.cyc.cycjava.cycl.czer_main.remove_newly_introduced_variables_from_bindings(result, sentence);
                    } finally {
                        $within_ask$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, mt);
            }
        }
    }

    /**
     *
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p; actually a list of triples
     * @return 1 nil or hlmt-p
     */
    @LispMethod(comment = "@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p; actually a list of triples\r\n@return 1 nil or hlmt-p")
    public static SubLObject canonicalize_ask_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_ask$.currentBinding(thread);
        try {
            $within_ask$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject result_$21 = canonicalize_query_sentence(sentence, mt);
            final SubLObject mt_$22 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$21;
            mt = mt_$22;
            result = remove_newly_introduced_variables_from_bindings(result, sentence);
        } finally {
            $within_ask$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt);
    }

    /**
     *
     *
     * @unknown this may create 'naked' skolem functions without #$skolem assertions.
     */
    @LispMethod(comment = "@unknown this may create \'naked\' skolem functions without #$skolem assertions.")
    public static final SubLObject canonicalize_assert_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $within_ask$.currentBinding(thread);
                    try {
                        $within_assert$.bind(T, thread);
                        $within_ask$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $within_ask$.rebind(_prev_bind_1, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown this may create 'naked' skolem functions without #$skolem assertions.
     */
    @LispMethod(comment = "@unknown this may create \'naked\' skolem functions without #$skolem assertions.")
    public static SubLObject canonicalize_assert(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $within_ask$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            $within_ask$.bind(NIL, thread);
            result = canonicalize_cycl_int(formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $within_ask$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * For use by canonicalizer tests
     */
    @LispMethod(comment = "For use by canonicalizer tests")
    public static final SubLObject test_canonicalize_assert_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding(thread);
                    try {
                        czer_vars.$clothe_naked_skolemsP$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.czer_main.canonicalize_assert(formula, mt);
                    } finally {
                        czer_vars.$clothe_naked_skolemsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * For use by canonicalizer tests
     */
    @LispMethod(comment = "For use by canonicalizer tests")
    public static SubLObject test_canonicalize_assert(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding(thread);
        try {
            czer_vars.$clothe_naked_skolemsP$.bind(T, thread);
            result = canonicalize_assert(formula, mt);
        } finally {
            czer_vars.$clothe_naked_skolemsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * For use by canonicalizer tests
     */


    public static final SubLObject canonicalize_assert_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $within_ask$.currentBinding(thread);
                    try {
                        $within_assert$.bind(T, thread);
                        $within_ask$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.czer_main.canonicalize_mt(mt);
                    } finally {
                        $within_ask$.rebind(_prev_bind_1, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject canonicalize_assert_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $within_ask$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            $within_ask$.bind(NIL, thread);
            result = canonicalize_mt(mt);
        } finally {
            $within_ask$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Like @xref canonicalize-hlmt except does more canonicalization,
     * possibly including reifying new narts if *within-assert*.
     * Returns NIL if MT is ill-formed.
     */
    @LispMethod(comment = "Like @xref canonicalize-hlmt except does more canonicalization,\r\npossibly including reifying new narts if *within-assert*.\r\nReturns NIL if MT is ill-formed.\nLike @xref canonicalize-hlmt except does more canonicalization,\npossibly including reifying new narts if *within-assert*.\nReturns NIL if MT is ill-formed.")
    public static final SubLObject canonicalize_mt_alt(SubLObject mt) {
        mt = com.cyc.cycjava.cycl.czer_main.canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
        if (NIL != mt) {
            mt = hlmt_czer.canonicalize_hlmt(mt);
        }
        return mt;
    }

    /**
     * Like @xref canonicalize-hlmt except does more canonicalization,
     * possibly including reifying new narts if *within-assert*.
     * Returns NIL if MT is ill-formed.
     */
    @LispMethod(comment = "Like @xref canonicalize-hlmt except does more canonicalization,\r\npossibly including reifying new narts if *within-assert*.\r\nReturns NIL if MT is ill-formed.\nLike @xref canonicalize-hlmt except does more canonicalization,\npossibly including reifying new narts if *within-assert*.\nReturns NIL if MT is ill-formed.")
    public static SubLObject canonicalize_mt(SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$assume_hlmt_is_canonicalP$.getDynamicValue(thread)) {
            mt = canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
            if (NIL != mt) {
                mt = hlmt_czer.canonicalize_hlmt(mt);
            }
        }
        return mt;
    }/**
     * Like @xref canonicalize-hlmt except does more canonicalization,
     * possibly including reifying new narts if *within-assert*.
     * Returns NIL if MT is ill-formed.
     */


    /**
     *
     *
     * @unknown this may create 'naked' skolem functions without #$skolem assertions.
     */
    @LispMethod(comment = "@unknown this may create \'naked\' skolem functions without #$skolem assertions.")
    public static final SubLObject canonicalize_assert_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $within_ask$.currentBinding(thread);
                    try {
                        $within_assert$.bind(T, thread);
                        $within_ask$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result_21 = com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_sentence(sentence, mt);
                            SubLObject mt_22 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_21;
                            mt = mt_22;
                        }
                    } finally {
                        $within_ask$.rebind(_prev_bind_1, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, mt);
            }
        }
    }

    /**
     *
     *
     * @unknown this may create 'naked' skolem functions without #$skolem assertions.
     */
    @LispMethod(comment = "@unknown this may create \'naked\' skolem functions without #$skolem assertions.")
    public static SubLObject canonicalize_assert_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $within_ask$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            $within_ask$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$23 = canonicalize_cycl_sentence(sentence, mt);
            final SubLObject mt_$24 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$23;
            mt = mt_$24;
        } finally {
            $within_ask$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt);
    }

    /**
     * For use by canonicalizer tests
     */
    @LispMethod(comment = "For use by canonicalizer tests")
    public static final SubLObject test_canonicalize_assert_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding(thread);
                    try {
                        czer_vars.$clothe_naked_skolemsP$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result_23 = com.cyc.cycjava.cycl.czer_main.canonicalize_assert_sentence(sentence, mt);
                            SubLObject mt_24 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_23;
                            mt = mt_24;
                        }
                    } finally {
                        czer_vars.$clothe_naked_skolemsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, mt);
            }
        }
    }

    /**
     * For use by canonicalizer tests
     */
    @LispMethod(comment = "For use by canonicalizer tests")
    public static SubLObject test_canonicalize_assert_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding(thread);
        try {
            czer_vars.$clothe_naked_skolemsP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject result_$25 = canonicalize_assert_sentence(sentence, mt);
            final SubLObject mt_$26 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$25;
            mt = mt_$26;
        } finally {
            czer_vars.$clothe_naked_skolemsP$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt);
    }/**
     * For use by canonicalizer tests
     */


    /**
     *
     *
     * @unknown this may create 'naked' skolem functions without #$skolem assertions.
     */
    @LispMethod(comment = "@unknown this may create \'naked\' skolem functions without #$skolem assertions.")
    public static final SubLObject canonicalize_wf_assert_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $within_ask$.currentBinding(thread);
                    try {
                        $within_assert$.bind(T, thread);
                        $within_ask$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result_25 = com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl_sentence(sentence, mt);
                            SubLObject mt_26 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_25;
                            mt = mt_26;
                        }
                    } finally {
                        $within_ask$.rebind(_prev_bind_1, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, mt);
            }
        }
    }

    /**
     *
     *
     * @unknown this may create 'naked' skolem functions without #$skolem assertions.
     */
    @LispMethod(comment = "@unknown this may create \'naked\' skolem functions without #$skolem assertions.")
    public static SubLObject canonicalize_wf_assert_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $within_ask$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            $within_ask$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject result_$27 = canonicalize_wf_cycl_sentence(sentence, mt);
            final SubLObject mt_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$27;
            mt = mt_$28;
        } finally {
            $within_ask$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt);
    }

    public static final SubLObject canonicalize_unassert_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_unassert$.currentBinding(thread);
                    try {
                        $within_unassert$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl(formula, mt);
                    } finally {
                        $within_unassert$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject canonicalize_unassert(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_unassert$.currentBinding(thread);
        try {
            $within_unassert$.bind(T, thread);
            result = canonicalize_wf_cycl(formula, mt);
        } finally {
            $within_unassert$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject canonicalize_unassert_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_unassert$.currentBinding(thread);
                    try {
                        $within_unassert$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result_27 = com.cyc.cycjava.cycl.czer_main.canonicalize_wf_cycl_sentence(sentence, mt);
                            SubLObject mt_28 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_27;
                            mt = mt_28;
                        }
                    } finally {
                        $within_unassert$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, mt);
            }
        }
    }

    public static SubLObject canonicalize_unassert_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_unassert$.currentBinding(thread);
        try {
            $within_unassert$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject result_$29 = canonicalize_wf_cycl_sentence(sentence, mt);
            final SubLObject mt_$30 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$29;
            mt = mt_$30;
        } finally {
            $within_unassert$.rebind(_prev_bind_0, thread);
        }
        return values(result, mt);
    }

    public static final SubLObject ncanonicalize_query_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_query(formula, mt, T, T);
    }

    public static SubLObject ncanonicalize_query(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_query(formula, mt, T, T);
    }

    /**
     * Converts the EL query FORMULA to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if FORMULA was ill-formed.
     * @return 1 boolean; whether extra FI operations were created as a result of canonicalization.
     * @return 2 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret FORMULA.
     */
    @LispMethod(comment = "Converts the EL query FORMULA to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if FORMULA was ill-formed.\r\n@return 1 boolean; whether extra FI operations were created as a result of canonicalization.\r\n@return 2 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret FORMULA.")
    public static final SubLObject canonicalize_query_alt(SubLObject formula, SubLObject mt, SubLObject destructiveP, SubLObject unwrap_istP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (unwrap_istP == UNPROVIDED) {
            unwrap_istP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) || (NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread)))) {
                com.cyc.cycjava.cycl.czer_main.clear_canon_caches();
            }
            {
                SubLObject result = NIL;
                SubLObject subordinate_fi_opsP = NIL;
                SubLObject copied_formula = NIL;
                mt = com.cyc.cycjava.cycl.czer_main.canonicalize_ask_mt(mt);
                {
                    SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$czer_memoization_state$.currentBinding(thread);
                    try {
                        czer_vars.$within_canonicalizerP$.bind(T, thread);
                        czer_vars.$czer_memoization_state$.bind(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_29 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt13$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject _prev_bind_0_30 = $within_query$.currentBinding(thread);
                                                try {
                                                    $within_query$.bind(T, thread);
                                                    {
                                                        SubLObject mt_var = mt;
                                                        {
                                                            SubLObject _prev_bind_0_31 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_32 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = $within_assert$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                                            SubLObject _prev_bind_5 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                                            SubLObject _prev_bind_6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                                            SubLObject _prev_bind_7 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                                            SubLObject _prev_bind_8 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                                            SubLObject _prev_bind_9 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                                            SubLObject _prev_bind_10 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                                            SubLObject _prev_bind_11 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                                            SubLObject _prev_bind_12 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                                            SubLObject _prev_bind_13 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                                            SubLObject _prev_bind_14 = czer_vars.$subordinate_fi_opsP$.currentBinding(thread);
                                                            SubLObject _prev_bind_15 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                                                            SubLObject _prev_bind_16 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
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
                                                                czer_vars.$subordinate_fi_opsP$.bind(NIL, thread);
                                                                czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                                                                czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                                                                {
                                                                    SubLObject wffP = wff.el_wff_syntaxP(formula, UNPROVIDED);
                                                                    copied_formula = (NIL != destructiveP) ? ((SubLObject) (formula)) : copy_formula(formula);
                                                                    if (NIL == wffP) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject simpler_formula = simplifier.try_to_simplify_non_wff_into_wff(copied_formula, symbol_function($sym24$EL_WFF_SYNTAX_), UNPROVIDED);
                                                                            SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != is_it_wff_nowP) {
                                                                                wffP = T;
                                                                                copied_formula = simpler_formula;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (NIL != wffP) {
                                                                        result = copied_formula;
                                                                        {
                                                                            SubLObject quiescedP = NIL;
                                                                            SubLObject count = ZERO_INTEGER;
                                                                            while (NIL == quiescedP) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject result_33 = com.cyc.cycjava.cycl.czer_main.clausify_eliminating_ists(result, mt, $DNF, unwrap_istP);
                                                                                    SubLObject mt_34 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    result = result_33;
                                                                                    mt = mt_34;
                                                                                }
                                                                                result = clausifier.dnf_operators_out(result);
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject result_35 = com.cyc.cycjava.cycl.czer_main.canonicalize_query_clauses(result, mt);
                                                                                    SubLObject mt_36 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    result = result_35;
                                                                                    mt = mt_36;
                                                                                }
                                                                                if (count.numGE(czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue(thread))) {
                                                                                    quiescedP = T;
                                                                                } else {
                                                                                    quiescedP = com.cyc.cycjava.cycl.czer_main.czer_result_quiescedP(result, unwrap_istP);
                                                                                }
                                                                                if (NIL == quiescedP) {
                                                                                    result = uncanonicalizer.dnfs_el_formula(czer_utilities.extract_el_clauses(result), UNPROVIDED, UNPROVIDED);
                                                                                }
                                                                                count = add(count, ONE_INTEGER);
                                                                            } 
                                                                        }
                                                                        subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue(thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_16, thread);
                                                                czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_15, thread);
                                                                czer_vars.$subordinate_fi_opsP$.rebind(_prev_bind_14, thread);
                                                                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_13, thread);
                                                                wff_vars.$validate_constantsP$.rebind(_prev_bind_12, thread);
                                                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_11, thread);
                                                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_10, thread);
                                                                czer_vars.$simplify_literalP$.rebind(_prev_bind_9, thread);
                                                                wff_utilities.$check_var_typesP$.rebind(_prev_bind_8, thread);
                                                                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_7, thread);
                                                                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_6, thread);
                                                                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_5, thread);
                                                                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_4, thread);
                                                                $within_assert$.rebind(_prev_bind_3, thread);
                                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_32, thread);
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_31, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $within_query$.rebind(_prev_bind_0_30, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_29, thread);
                                }
                            }
                        }
                    } finally {
                        czer_vars.$czer_memoization_state$.rebind(_prev_bind_1, thread);
                        czer_vars.$within_canonicalizerP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == unwrap_istP) {
                    mt = NIL;
                }
                return values(result, subordinate_fi_opsP, mt);
            }
        }
    }

    /**
     * Converts the EL query FORMULA to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if FORMULA was ill-formed.
     * @return 1 boolean; whether extra FI operations were created as a result of canonicalization.
     * @return 2 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret FORMULA.
     */
    @LispMethod(comment = "Converts the EL query FORMULA to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if FORMULA was ill-formed.\r\n@return 1 boolean; whether extra FI operations were created as a result of canonicalization.\r\n@return 2 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret FORMULA.")
    public static SubLObject canonicalize_query(final SubLObject formula, SubLObject mt, SubLObject destructiveP, SubLObject unwrap_istP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (unwrap_istP == UNPROVIDED) {
            unwrap_istP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == wff_vars.$within_wffP$.getDynamicValue(thread)) && (NIL == czer_vars.$within_canonicalizerP$.getDynamicValue(thread))) {
            clear_canon_caches();
        }
        SubLObject result = NIL;
        SubLObject subordinate_fi_opsP = NIL;
        SubLObject copied_formula = NIL;
        mt = canonicalize_ask_mt(mt);
        final SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$czer_memoization_state$.currentBinding(thread);
        try {
            czer_vars.$within_canonicalizerP$.bind(T, thread);
            czer_vars.$czer_memoization_state$.bind(memoization_state.new_memoization_state($$$czer_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$31 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$32 = $within_query$.currentBinding(thread);
                    try {
                        $within_query$.bind(T, thread);
                        final SubLObject mt_var = mt;
                        final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $within_assert$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = czer_vars.$simplify_literalP$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = wff_vars.$validate_constantsP$.currentBinding(thread);
                        final SubLObject _prev_bind_14 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        final SubLObject _prev_bind_15 = czer_vars.$subordinate_fi_opsP$.currentBinding(thread);
                        final SubLObject _prev_bind_16 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                        final SubLObject _prev_bind_17 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
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
                            czer_vars.$subordinate_fi_opsP$.bind(NIL, thread);
                            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                            copied_formula = (NIL != destructiveP) ? formula : copy_formula(formula);
                            thread.resetMultipleValues();
                            final SubLObject copied_formula_$35 = precanonicalizer.early_precanonicalizations(copied_formula, mt);
                            final SubLObject mt_$36 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            copied_formula = copied_formula_$35;
                            mt = mt_$36;
                            SubLObject wffP = wff.el_wff_syntaxP(copied_formula, UNPROVIDED);
                            if (NIL == wffP) {
                                thread.resetMultipleValues();
                                final SubLObject simpler_formula = simplifier.try_to_simplify_non_wff_into_wff(copied_formula, symbol_function($sym23$EL_WFF_SYNTAX_), UNPROVIDED);
                                final SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != is_it_wff_nowP) {
                                    wffP = T;
                                    copied_formula = simpler_formula;
                                }
                            }
                            if (NIL != wffP) {
                                result = copied_formula;
                                SubLObject quiescedP = NIL;
                                SubLObject count = ZERO_INTEGER;
                                while (NIL == quiescedP) {
                                    thread.resetMultipleValues();
                                    final SubLObject result_$37 = clausify_eliminating_ists(result, mt, $DNF, unwrap_istP);
                                    final SubLObject mt_$37 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    result = result_$37;
                                    mt = mt_$37;
                                    result = clausifier.dnf_operators_out(result);
                                    thread.resetMultipleValues();
                                    final SubLObject result_$38 = canonicalize_query_clauses(result, mt);
                                    final SubLObject mt_$38 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    result = result_$38;
                                    mt = mt_$38;
                                    if (count.numGE(czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue(thread))) {
                                        quiescedP = T;
                                    } else {
                                        quiescedP = czer_result_quiescedP(result, unwrap_istP);
                                    }
                                    if (NIL == quiescedP) {
                                        result = uncanonicalizer.dnf_intermediate_el_formula(czer_utilities.extract_el_clauses(result));
                                    }
                                    count = add(count, ONE_INTEGER);
                                } 
                                subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue(thread);
                            }
                        } finally {
                            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_17, thread);
                            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_16, thread);
                            czer_vars.$subordinate_fi_opsP$.rebind(_prev_bind_15, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_14, thread);
                            wff_vars.$validate_constantsP$.rebind(_prev_bind_13, thread);
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_12, thread);
                            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_11, thread);
                            czer_vars.$simplify_literalP$.rebind(_prev_bind_10, thread);
                            wff_utilities.$check_var_typesP$.rebind(_prev_bind_9, thread);
                            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_8, thread);
                            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_7, thread);
                            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_6, thread);
                            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_5, thread);
                            $within_assert$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$34, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$33, thread);
                        }
                    } finally {
                        $within_query$.rebind(_prev_bind_0_$32, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$31, thread);
            }
        } finally {
            czer_vars.$czer_memoization_state$.rebind(_prev_bind_2, thread);
            czer_vars.$within_canonicalizerP$.rebind(_prev_bind_0, thread);
        }
        if (NIL == unwrap_istP) {
            mt = NIL;
        }
        return values(result, subordinate_fi_opsP, mt);
    }

    /**
     * Converts the EL query SENTENCE to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if FORMULA was ill-formed.
     * @return 1 nil or hlmt-p;
    the microtheory in which to interpret the returned sentence.
    Note that this may differ from MT, for example when SENTENCE is an #$ist sentence.
     */
    @LispMethod(comment = "Converts the EL query SENTENCE to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if FORMULA was ill-formed.\r\n@return 1 nil or hlmt-p;\r\nthe microtheory in which to interpret the returned sentence.\r\nNote that this may differ from MT, for example when SENTENCE is an #$ist sentence.")
    public static final SubLObject canonicalize_query_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result = com.cyc.cycjava.cycl.czer_main.canonicalize_query(sentence, mt, NIL, T);
                SubLObject dummy1 = thread.secondMultipleValue();
                SubLObject mt_38 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(result, mt_38);
            }
        }
    }

    @LispMethod(comment = "Converts the EL query SENTENCE to its canonical HL representation.\r\n\r\n@return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;\r\nan unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),\r\nor #$True or #$False, or NIL if FORMULA was ill-formed.\r\n@return 1 nil or hlmt-p;\r\nthe microtheory in which to interpret the returned sentence.\r\nNote that this may differ from MT, for example when SENTENCE is an #$ist sentence.")
    public static SubLObject canonicalize_query_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = canonicalize_query(sentence, mt, NIL, T);
        final SubLObject dummy1 = thread.secondMultipleValue();
        final SubLObject mt_$42 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(result, mt_$42);
    }/**
     * Converts the EL query SENTENCE to its canonical HL representation.
     *
     * @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
    an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
    or #$True or #$False, or NIL if FORMULA was ill-formed.
     * @return 1 nil or hlmt-p;
    the microtheory in which to interpret the returned sentence.
    Note that this may differ from MT, for example when SENTENCE is an #$ist sentence.
     */


    /**
     * Canonicalizes any EL expression EXPRESSION into its HL representation.
     *
     * @return 0 canonical HL expression
     * @return 1 boolean; whether the result is a list of clauses and binding lists
     */
    @LispMethod(comment = "Canonicalizes any EL expression EXPRESSION into its HL representation.\r\n\r\n@return 0 canonical HL expression\r\n@return 1 boolean; whether the result is a list of clauses and binding lists")
    public static final SubLObject canonicalize_expression_alt(SubLObject expression, SubLObject mt, SubLObject destructiveP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (NIL != term.nautP(expression, UNPROVIDED)) {
            return values(com.cyc.cycjava.cycl.czer_main.canonicalize_term(expression, mt), NIL);
        } else {
            if ((NIL == cycl_variables.cyc_varP(expression)) && (NIL != cycl_grammar.cycl_sentence_p(expression))) {
                {
                    SubLObject result = com.cyc.cycjava.cycl.czer_main.canonicalize_cycl_int(expression, mt, destructiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return values(result, czer_utilities.list_of_clause_binding_list_pairs_p(result));
                }
            } else {
                return values(expression, NIL);
            }
        }
    }

    @LispMethod(comment = "Canonicalizes any EL expression EXPRESSION into its HL representation.\r\n\r\n@return 0 canonical HL expression\r\n@return 1 boolean; whether the result is a list of clauses and binding lists")
    public static SubLObject canonicalize_expression(final SubLObject expression, SubLObject mt, SubLObject destructiveP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (destructiveP == UNPROVIDED) {
            destructiveP = NIL;
        }
        if (NIL != term.nautP(expression, UNPROVIDED)) {
            return values(canonicalize_term(expression, mt), NIL);
        }
        if ((NIL == cycl_variables.cyc_varP(expression)) && (NIL != cycl_grammar.cycl_sentence_p(expression))) {
            final SubLObject result = canonicalize_cycl_int(expression, mt, destructiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return values(result, czer_utilities.list_of_clause_binding_list_pairs_p(result));
        }
        return values(expression, NIL);
    }/**
     * Canonicalizes any EL expression EXPRESSION into its HL representation.
     *
     * @return 0 canonical HL expression
     * @return 1 boolean; whether the result is a list of clauses and binding lists
     */


    /**
     * Canonicalizes sentence into an EL clausal form of CLAUSAL-FORM.
     * If UNWRAP-IST?, this will recursively canonicalize SENTENCE until there are no more #$ists.
     * Also finds the nart version of a non-atomic mt before returning it, if one exists.
     */
    @LispMethod(comment = "Canonicalizes sentence into an EL clausal form of CLAUSAL-FORM.\r\nIf UNWRAP-IST?, this will recursively canonicalize SENTENCE until there are no more #$ists.\r\nAlso finds the nart version of a non-atomic mt before returning it, if one exists.\nCanonicalizes sentence into an EL clausal form of CLAUSAL-FORM.\nIf UNWRAP-IST?, this will recursively canonicalize SENTENCE until there are no more #$ists.\nAlso finds the nart version of a non-atomic mt before returning it, if one exists.")
    public static final SubLObject clausify_eliminating_ists_alt(SubLObject sentence, SubLObject mt, SubLObject clausal_form, SubLObject unwrap_istP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != unwrap_istP) {
                thread.resetMultipleValues();
                {
                    SubLObject sentence_39 = czer_utilities.unwrap_if_ist_permissive_canonical(sentence, mt);
                    SubLObject mt_40 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sentence = sentence_39;
                    mt = mt_40;
                }
            }
            {
                SubLObject ist_quiescenceP = NIL;
                while (NIL == ist_quiescenceP) {
                    sentence = simplifier.simplify_sequence_variables_1(sentence);
                    {
                        SubLObject pcase_var = clausal_form;
                        if (pcase_var.eql($CNF)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject sentence_41 = clausifier.el_cnf_destructive(sentence, mt);
                                SubLObject mt_42 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                sentence = sentence_41;
                                mt = mt_42;
                            }
                        } else {
                            if (pcase_var.eql($DNF)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject sentence_43 = clausifier.el_dnf_destructive(sentence, mt);
                                    SubLObject mt_44 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    sentence = sentence_43;
                                    mt = mt_44;
                                }
                            } else {
                                Errors.error($str_alt26$Unknown_clausal_form__s, clausal_form);
                            }
                        }
                    }
                    if (NIL == unwrap_istP) {
                        ist_quiescenceP = T;
                    } else {
                        thread.resetMultipleValues();
                        {
                            SubLObject sub_sentence = czer_utilities.unwrap_if_ist_permissive_canonical(sentence, mt);
                            SubLObject sub_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((sentence == sub_sentence) && (mt == sub_mt)) {
                                ist_quiescenceP = T;
                            } else {
                                sentence = sub_sentence;
                                mt = hlmt_czer.canonicalize_hlmt(sub_mt);
                            }
                        }
                    }
                } 
            }
            mt = hlmt_czer.canonicalize_hlmt(mt);
            return values(sentence, mt);
        }
    }

    @LispMethod(comment = "Canonicalizes sentence into an EL clausal form of CLAUSAL-FORM.\r\nIf UNWRAP-IST?, this will recursively canonicalize SENTENCE until there are no more #$ists.\r\nAlso finds the nart version of a non-atomic mt before returning it, if one exists.\nCanonicalizes sentence into an EL clausal form of CLAUSAL-FORM.\nIf UNWRAP-IST?, this will recursively canonicalize SENTENCE until there are no more #$ists.\nAlso finds the nart version of a non-atomic mt before returning it, if one exists.")
    public static SubLObject clausify_eliminating_ists(SubLObject sentence, SubLObject mt, final SubLObject clausal_form, final SubLObject unwrap_istP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != unwrap_istP) {
            thread.resetMultipleValues();
            final SubLObject sentence_$43 = czer_utilities.unwrap_if_ist_permissive_canonical(sentence, mt);
            final SubLObject mt_$44 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$43;
            mt = mt_$44;
        }
        SubLObject ist_quiescenceP = NIL;
        while (NIL == ist_quiescenceP) {
            sentence = simplifier.simplify_sequence_variables_1(sentence);
            if (clausal_form.eql($CNF)) {
                thread.resetMultipleValues();
                final SubLObject sentence_$44 = clausifier.el_cnf_destructive(sentence, mt);
                final SubLObject mt_$45 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                sentence = sentence_$44;
                mt = mt_$45;
            } else
                if (clausal_form.eql($DNF)) {
                    thread.resetMultipleValues();
                    final SubLObject sentence_$45 = clausifier.el_dnf_destructive(sentence, mt);
                    final SubLObject mt_$46 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sentence = sentence_$45;
                    mt = mt_$46;
                } else {
                    Errors.error($str25$Unknown_clausal_form__s, clausal_form);
                }

            if (NIL == unwrap_istP) {
                ist_quiescenceP = T;
            } else {
                thread.resetMultipleValues();
                final SubLObject sub_sentence = czer_utilities.unwrap_if_ist_permissive_canonical(sentence, mt);
                final SubLObject sub_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sentence.eql(sub_sentence) && mt.eql(sub_mt)) {
                    ist_quiescenceP = T;
                } else {
                    sentence = sub_sentence;
                    mt = hlmt_czer.canonicalize_hlmt(sub_mt);
                }
            }
        } 
        mt = hlmt_czer.canonicalize_hlmt(mt);
        return values(sentence, mt);
    }/**
     * Canonicalizes sentence into an EL clausal form of CLAUSAL-FORM.
     * If UNWRAP-IST?, this will recursively canonicalize SENTENCE until there are no more #$ists.
     * Also finds the nart version of a non-atomic mt before returning it, if one exists.
     */


    public static final SubLObject remove_newly_introduced_variables_from_bindings_alt(SubLObject clauses_and_more, SubLObject original_formula) {
        if (clauses_and_more.isCons() && (NIL != el_formula_p(original_formula))) {
            {
                SubLObject cdolist_list_var = clauses_and_more;
                SubLObject clause_and_more = NIL;
                for (clause_and_more = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause_and_more = cdolist_list_var.first()) {
                    {
                        SubLObject canon_free_vars = third(clause_and_more);
                        SubLObject original_vars = referenced_variables(original_formula, UNPROVIDED);
                        SubLObject spurious_free_vars = list_utilities.fast_set_difference(canon_free_vars, original_vars, UNPROVIDED);
                        if (NIL != spurious_free_vars) {
                            {
                                SubLObject corrected_free_vars = list_utilities.fast_set_difference(canon_free_vars, spurious_free_vars, UNPROVIDED);
                                list_utilities.nreplace_nth(TWO_INTEGER, corrected_free_vars, clause_and_more);
                            }
                        }
                    }
                }
            }
        }
        return clauses_and_more;
    }

    public static SubLObject remove_newly_introduced_variables_from_bindings(final SubLObject clauses_and_more, final SubLObject original_formula) {
        if (clauses_and_more.isCons() && (NIL != el_formula_p(original_formula))) {
            SubLObject cdolist_list_var = clauses_and_more;
            SubLObject clause_and_more = NIL;
            clause_and_more = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject canon_free_vars = third(clause_and_more);
                final SubLObject original_vars = referenced_variables(original_formula, UNPROVIDED);
                final SubLObject spurious_free_vars = list_utilities.fast_set_difference(canon_free_vars, original_vars, UNPROVIDED);
                if (NIL != spurious_free_vars) {
                    final SubLObject corrected_free_vars = list_utilities.fast_set_difference(canon_free_vars, spurious_free_vars, UNPROVIDED);
                    list_utilities.nreplace_nth(TWO_INTEGER, corrected_free_vars, clause_and_more);
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause_and_more = cdolist_list_var.first();
            } 
        }
        return clauses_and_more;
    }

    public static final SubLObject clear_canon_caches_alt() {
        clausifier.clear_cached_cnf_clausal_form();
        czer_meta.clear_cached_find_assertions_cycl();
        return NIL;
    }

    public static SubLObject clear_canon_caches() {
        clausifier.clear_cached_cnf_clausal_form();
        czer_meta.clear_cached_find_assertions_cycl();
        return NIL;
    }

    public static final SubLObject canon_wffP_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wffP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                    try {
                        wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                        if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
                            wffP = wff.el_wff_syntaxP(formula, UNPROVIDED);
                        } else {
                            wffP = wff.el_wffP(formula, mt, UNPROVIDED);
                        }
                    } finally {
                        wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return wffP;
            }
        }
    }

    public static SubLObject canon_wffP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
                wffP = wff.el_wff_syntaxP(formula, UNPROVIDED);
            } else {
                wffP = makeBoolean((NIL != wff_vars.wff_assertiveP()) && (NIL != wff.strictly_wff_in_all_spec_mtsP(formula, mt, UNPROVIDED)));
                if (NIL == wffP) {
                    clear_canon_caches();
                    wffP = wff.el_wffP(formula, mt, UNPROVIDED);
                }
            }
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static final SubLObject check_wff_arityP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return wff_utilities.$check_arityP$.getDynamicValue(thread);
        }
    }

    public static SubLObject check_wff_arityP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_utilities.$check_arityP$.getDynamicValue(thread);
    }

    public static final SubLObject check_wff_semanticsP_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != com.cyc.cycjava.cycl.czer_main.psc_queryP(mt) ? ((SubLObject) (NIL)) : makeBoolean((NIL != czer_vars.$must_enforce_semanticsP$.getDynamicValue(thread)) || ((NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread)) && (NIL != $within_assert$.getDynamicValue(thread))));
        }
    }

    public static SubLObject check_wff_semanticsP(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != psc_queryP(mt) ? NIL : makeBoolean((NIL != czer_vars.$must_enforce_semanticsP$.getDynamicValue(thread)) || ((NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread)) && (NIL != $within_assert$.getDynamicValue(thread))));
    }

    public static final SubLObject canonicalize_clauses_terms_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$canonicalize_termsP$.getDynamicValue(thread)) {
                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_quoted_terms(v_clauses);
                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_sentence_terms(v_clauses);
                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_commutative_terms_destructive(v_clauses);
                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_functions(v_clauses);
                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_transformable_nats(v_clauses);
                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_commutative_terms_destructive(v_clauses);
            }
            return v_clauses;
        }
    }

    public static SubLObject canonicalize_clauses_terms(SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$canonicalize_termsP$.getDynamicValue(thread)) {
            v_clauses = canonicalize_clauses_quoted_terms(v_clauses);
            v_clauses = canonicalize_clauses_sentence_terms(v_clauses);
            v_clauses = canonicalize_clauses_commutative_terms_destructive(v_clauses);
            v_clauses = canonicalize_functions(v_clauses);
            v_clauses = canonicalize_clauses_transformable_nats(v_clauses);
            v_clauses = canonicalize_clauses_commutative_terms_destructive(v_clauses);
        }
        return v_clauses;
    }

    public static final SubLObject canonicalize_clauses_quoted_terms_alt(SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_QUOTED_TERMS), v_clauses);
    }

    public static SubLObject canonicalize_clauses_quoted_terms(final SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_QUOTED_TERMS), v_clauses);
    }

    public static final SubLObject canonicalize_clause_quoted_terms_alt(SubLObject clause) {
        return clauses.make_cnf(com.cyc.cycjava.cycl.czer_main.canonicalize_literals_quoted_terms(clauses.neg_lits(clause)), com.cyc.cycjava.cycl.czer_main.canonicalize_literals_quoted_terms(clauses.pos_lits(clause)));
    }

    public static SubLObject canonicalize_clause_quoted_terms(final SubLObject clause) {
        return clauses.make_cnf(canonicalize_literals_quoted_terms(clauses.neg_lits(clause)), canonicalize_literals_quoted_terms(clauses.pos_lits(clause)));
    }

    public static final SubLObject canonicalize_literals_quoted_terms_alt(SubLObject literals) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = reverse(literals);
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.czer_main.canonicalize_literal_quoted_terms_recursive(literal), result);
            }
            return result;
        }
    }

    public static SubLObject canonicalize_literals_quoted_terms(final SubLObject literals) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = reverse(literals);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(canonicalize_literal_quoted_terms_recursive(literal), result);
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * Replaces all the escape quoted terms (non variables) with just the term, since
     * (#$EscapeQuote <term>) = <term>.  Also converts quasi quoted terms to (#$Quote  Assumes that the literal is well-formed -
     * #$EscapeQuote should be nested within #$Quote
     */
    @LispMethod(comment = "Replaces all the escape quoted terms (non variables) with just the term, since\r\n(#$EscapeQuote <term>) = <term>.  Also converts quasi quoted terms to (#$Quote  Assumes that the literal is well-formed -\r\n#$EscapeQuote should be nested within #$Quote\nReplaces all the escape quoted terms (non variables) with just the term, since\n(#$EscapeQuote <term>) = <term>.  Also converts quasi quoted terms to (#$Quote  Assumes that the literal is well-formed -\n#$EscapeQuote should be nested within #$Quote")
    public static final SubLObject canonicalize_literal_quoted_terms_recursive_alt(SubLObject literal) {
        {
            SubLObject result = literal;
            SubLObject escapequote = list_utilities.tree_find_if(symbol_function(ESCAPE_QUOTE_SYNTAX_P), result, UNPROVIDED);
            SubLObject escaped_form = NIL;
            if ((NIL != escapequote) && (NIL == list_utilities.tree_find_if(symbol_function($sym29$CYC_VAR_), escapequote, UNPROVIDED))) {
                escaped_form = cycl_utilities.formula_arg1(escapequote, UNPROVIDED);
                result = com.cyc.cycjava.cycl.czer_main.canonicalize_literal_quoted_terms_recursive(subst(escaped_form, escapequote, result, UNPROVIDED, UNPROVIDED));
            }
            {
                SubLObject quasiquote = list_utilities.tree_find_if(symbol_function(QUASI_QUOTE_SYNTAX_P), result, UNPROVIDED);
                SubLObject quote_form = NIL;
                if (NIL != quasiquote) {
                    quote_form = list($$Quote, list($$EscapeQuote, cycl_utilities.formula_arg1(quasiquote, UNPROVIDED)));
                    result = com.cyc.cycjava.cycl.czer_main.canonicalize_literal_quoted_terms_recursive(subst(quote_form, quasiquote, result, UNPROVIDED, UNPROVIDED));
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Replaces all the escape quoted terms (non variables) with just the term, since\r\n(#$EscapeQuote <term>) = <term>.  Also converts quasi quoted terms to (#$Quote  Assumes that the literal is well-formed -\r\n#$EscapeQuote should be nested within #$Quote\nReplaces all the escape quoted terms (non variables) with just the term, since\n(#$EscapeQuote <term>) = <term>.  Also converts quasi quoted terms to (#$Quote  Assumes that the literal is well-formed -\n#$EscapeQuote should be nested within #$Quote")
    public static SubLObject canonicalize_literal_quoted_terms_recursive(final SubLObject literal) {
        SubLObject result = literal;
        final SubLObject escapequote = list_utilities.tree_find_if(symbol_function(ESCAPE_QUOTE_SYNTAX_P), result, UNPROVIDED);
        SubLObject escaped_form = NIL;
        if ((NIL != escapequote) && (NIL == list_utilities.tree_find_if(symbol_function($sym28$CYC_VAR_), escapequote, UNPROVIDED))) {
            escaped_form = cycl_utilities.formula_arg1(escapequote, UNPROVIDED);
            result = canonicalize_literal_quoted_terms_recursive(subst(escaped_form, escapequote, result, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject quasiquote = list_utilities.tree_find_if(symbol_function(QUASI_QUOTE_SYNTAX_P), result, UNPROVIDED);
        SubLObject quote_form = NIL;
        if (NIL != quasiquote) {
            quote_form = list($$Quote, list($$EscapeQuote, cycl_utilities.formula_arg1(quasiquote, UNPROVIDED)));
            result = canonicalize_literal_quoted_terms_recursive(subst(quote_form, quasiquote, result, UNPROVIDED, UNPROVIDED));
        }
        return result;
    }/**
     * Replaces all the escape quoted terms (non variables) with just the term, since
     * (#$EscapeQuote <term>) = <term>.  Also converts quasi quoted terms to (#$Quote  Assumes that the literal is well-formed -
     * #$EscapeQuote should be nested within #$Quote
     */


    public static final SubLObject canonicalize_quoted_term_alt(SubLObject v_term, SubLObject convert_el_vars_to_hlP) {
        if (convert_el_vars_to_hlP == UNPROVIDED) {
            convert_el_vars_to_hlP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                v_answer = com.cyc.cycjava.cycl.czer_main.canonicalize_literal_quoted_terms_recursive(v_term);
                if ((NIL != v_answer) && (NIL != convert_el_vars_to_hlP)) {
                    v_answer = com.cyc.cycjava.cycl.czer_main.rename_clause_vars(v_answer, UNPROVIDED).first();
                    if ((NIL != v_answer) && (cycl_utilities.formula_arg0(v_answer) == $$Quote)) {
                        {
                            SubLObject _prev_bind_0 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                            try {
                                cycl_grammar.$within_quote_form$.bind(T, thread);
                                v_answer = cycl_utilities.expression_transform(v_answer, symbol_function(FAST_ESCAPE_QUOTE_TERM_P), symbol_function(FORMULA_ARG1), NIL, UNPROVIDED);
                            } finally {
                                cycl_grammar.$within_quote_form$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    public static SubLObject canonicalize_quoted_term(final SubLObject v_term, SubLObject convert_el_vars_to_hlP) {
        if (convert_el_vars_to_hlP == UNPROVIDED) {
            convert_el_vars_to_hlP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        v_answer = canonicalize_literal_quoted_terms_recursive(v_term);
        if ((NIL != v_answer) && (NIL != convert_el_vars_to_hlP)) {
            v_answer = rename_clause_vars(v_answer, UNPROVIDED).first();
            if ((NIL != v_answer) && cycl_utilities.formula_arg0(v_answer).eql($$Quote)) {
                final SubLObject _prev_bind_0 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                    cycl_grammar.$within_quote_form$.bind(T, thread);
                    v_answer = cycl_utilities.expression_transform(v_answer, symbol_function(FAST_ESCAPE_QUOTE_TERM_P), symbol_function(FORMULA_ARG1), NIL, UNPROVIDED);
                } finally {
                    cycl_grammar.$within_quote_form$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return v_answer;
    }

    public static final SubLObject unquote_quoted_term_alt(SubLObject v_term, SubLObject convert_el_vars_to_hlP) {
        if (convert_el_vars_to_hlP == UNPROVIDED) {
            convert_el_vars_to_hlP = NIL;
        }
        if (NIL != cycl_grammar.cycl_quoted_term_p(v_term)) {
            {
                SubLObject canonical_quoted_term = com.cyc.cycjava.cycl.czer_main.canonicalize_quoted_term(v_term, convert_el_vars_to_hlP);
                if (NIL != canonical_quoted_term) {
                    return cycl_utilities.formula_arg1(canonical_quoted_term, UNPROVIDED);
                }
            }
        } else {
            return v_term;
        }
        return NIL;
    }

    public static SubLObject unquote_quoted_term(final SubLObject v_term, SubLObject convert_el_vars_to_hlP) {
        if (convert_el_vars_to_hlP == UNPROVIDED) {
            convert_el_vars_to_hlP = NIL;
        }
        if (NIL == cycl_grammar.cycl_quoted_term_p(v_term)) {
            return v_term;
        }
        final SubLObject canonical_quoted_term = canonicalize_quoted_term(v_term, convert_el_vars_to_hlP);
        if (NIL != canonical_quoted_term) {
            return cycl_utilities.formula_arg1(canonical_quoted_term, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSES) into their EL formulas.
     * A 'formula arg' is, roughly, an argument that is constrained to be a Cyc formula.
     * Replaces literals with NIL if they are not a @xref relation-expression?
     *
     * @see sentence-arg?
     */
    @LispMethod(comment = "Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSES) into their EL formulas.\r\nA \'formula arg\' is, roughly, an argument that is constrained to be a Cyc formula.\r\nReplaces literals with NIL if they are not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nDestructively canonicalizes formula args (of any literals or denotational functions in CLAUSES) into their EL formulas.\nA \'formula arg\' is, roughly, an argument that is constrained to be a Cyc formula.\nReplaces literals with NIL if they are not a @xref relation-expression?")
    public static final SubLObject canonicalize_clauses_sentence_terms_alt(SubLObject v_clauses) {
        if (NIL != com.cyc.cycjava.cycl.czer_main.canonicalize_no_sentence_argsP()) {
            return v_clauses;
        } else {
            return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_SENTENCE_TERMS), v_clauses);
        }
    }

    @LispMethod(comment = "Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSES) into their EL formulas.\r\nA \'formula arg\' is, roughly, an argument that is constrained to be a Cyc formula.\r\nReplaces literals with NIL if they are not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nDestructively canonicalizes formula args (of any literals or denotational functions in CLAUSES) into their EL formulas.\nA \'formula arg\' is, roughly, an argument that is constrained to be a Cyc formula.\nReplaces literals with NIL if they are not a @xref relation-expression?")
    public static SubLObject canonicalize_clauses_sentence_terms(final SubLObject v_clauses) {
        if (NIL != canonicalize_no_sentence_argsP()) {
            return v_clauses;
        }
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_SENTENCE_TERMS), v_clauses);
    }/**
     * Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSES) into their EL formulas.
     * A 'formula arg' is, roughly, an argument that is constrained to be a Cyc formula.
     * Replaces literals with NIL if they are not a @xref relation-expression?
     *
     * @see sentence-arg?
     */


    /**
     * fast-fail
     */
    @LispMethod(comment = "fast-fail")
    public static final SubLObject canonicalize_no_sentence_argsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(!((NIL != czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue(thread)) || (NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread))));
        }
    }

    @LispMethod(comment = "fast-fail")
    public static SubLObject canonicalize_no_sentence_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue(thread)) && (NIL == czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread)));
    }/**
     * fast-fail
     */


    /**
     * Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSE) into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Replaces literals with NIL if they are not a @xref relation-expression?
     *
     * @see sentence-arg?
     */
    @LispMethod(comment = "Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSE) into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReplaces literals with NIL if they are not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nDestructively canonicalizes formula args (of any literals or denotational functions in CLAUSE) into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReplaces literals with NIL if they are not a @xref relation-expression?")
    public static final SubLObject canonicalize_clause_sentence_terms_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject neg_lits = NIL;
                SubLObject pos_lits = NIL;
                {
                    SubLObject _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding(thread);
                    try {
                        $canonicalize_clause_sentence_terms_sense_lambda$.bind($NEG, thread);
                        neg_lits = list_utilities.nmapcar(symbol_function(CANONICALIZE_LITERAL_SENTENCE_TERMS), clauses.neg_lits(clause));
                    } finally {
                        $canonicalize_clause_sentence_terms_sense_lambda$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding(thread);
                    try {
                        $canonicalize_clause_sentence_terms_sense_lambda$.bind($POS, thread);
                        pos_lits = list_utilities.nmapcar(symbol_function(CANONICALIZE_LITERAL_SENTENCE_TERMS), clauses.pos_lits(clause));
                    } finally {
                        $canonicalize_clause_sentence_terms_sense_lambda$.rebind(_prev_bind_0, thread);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject neg_lits_45 = com.cyc.cycjava.cycl.czer_main.unnegate_and_flip_negated_lits(neg_lits, pos_lits);
                    SubLObject pos_lits_46 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    neg_lits = neg_lits_45;
                    pos_lits = pos_lits_46;
                }
                return clauses.make_clause(neg_lits, pos_lits);
            }
        }
    }

    @LispMethod(comment = "Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSE) into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReplaces literals with NIL if they are not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nDestructively canonicalizes formula args (of any literals or denotational functions in CLAUSE) into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReplaces literals with NIL if they are not a @xref relation-expression?")
    public static SubLObject canonicalize_clause_sentence_terms(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding(thread);
        try {
            $canonicalize_clause_sentence_terms_sense_lambda$.bind($NEG, thread);
            neg_lits = list_utilities.nmapcar(symbol_function(CANONICALIZE_LITERAL_SENTENCE_TERMS), clauses.neg_lits(clause));
        } finally {
            $canonicalize_clause_sentence_terms_sense_lambda$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding(thread);
        try {
            $canonicalize_clause_sentence_terms_sense_lambda$.bind($POS, thread);
            pos_lits = list_utilities.nmapcar(symbol_function(CANONICALIZE_LITERAL_SENTENCE_TERMS), clauses.pos_lits(clause));
        } finally {
            $canonicalize_clause_sentence_terms_sense_lambda$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject neg_lits_$49 = unnegate_and_flip_negated_lits(neg_lits, pos_lits);
        final SubLObject pos_lits_$50 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        neg_lits = neg_lits_$49;
        pos_lits = pos_lits_$50;
        return clauses.make_clause(neg_lits, pos_lits);
    }/**
     * Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSE) into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Replaces literals with NIL if they are not a @xref relation-expression?
     *
     * @see sentence-arg?
     */


    /**
     * Turn pos-lits to neg-lits or vice versa if lit is an el-negation-p
     */
    @LispMethod(comment = "Turn pos-lits to neg-lits or vice versa if lit is an el-negation-p")
    public static final SubLObject unnegate_and_flip_negated_lits_alt(SubLObject neg_lits, SubLObject pos_lits) {
        if ((NIL != list_utilities.any_in_list(EL_NEGATION_P, neg_lits, UNPROVIDED)) || (NIL != list_utilities.any_in_list(EL_NEGATION_P, pos_lits, UNPROVIDED))) {
            {
                SubLObject new_neg_lits = NIL;
                SubLObject new_pos_lits = NIL;
                {
                    SubLObject cdolist_list_var = pos_lits;
                    SubLObject pos_lit = NIL;
                    for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                        if (NIL != el_negation_p(pos_lit)) {
                            new_neg_lits = cons(cycl_utilities.negate(pos_lit), new_neg_lits);
                        } else {
                            new_pos_lits = cons(pos_lit, new_pos_lits);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject neg_lit = NIL;
                    for (neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit = cdolist_list_var.first()) {
                        if (NIL != el_negation_p(neg_lit)) {
                            new_pos_lits = cons(cycl_utilities.negate(neg_lit), new_pos_lits);
                        } else {
                            new_neg_lits = cons(neg_lit, new_neg_lits);
                        }
                    }
                }
                neg_lits = nreverse(new_neg_lits);
                pos_lits = nreverse(new_pos_lits);
            }
        }
        return values(neg_lits, pos_lits);
    }

    @LispMethod(comment = "Turn pos-lits to neg-lits or vice versa if lit is an el-negation-p")
    public static SubLObject unnegate_and_flip_negated_lits(SubLObject neg_lits, SubLObject pos_lits) {
        if ((NIL != list_utilities.any_in_list(EL_NEGATION_P, neg_lits, UNPROVIDED)) || (NIL != list_utilities.any_in_list(EL_NEGATION_P, pos_lits, UNPROVIDED))) {
            SubLObject new_neg_lits = NIL;
            SubLObject new_pos_lits = NIL;
            SubLObject cdolist_list_var = pos_lits;
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_negation_p(pos_lit)) {
                    new_neg_lits = cons(cycl_utilities.negate(pos_lit), new_neg_lits);
                } else {
                    new_pos_lits = cons(pos_lit, new_pos_lits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
            cdolist_list_var = neg_lits;
            SubLObject neg_lit = NIL;
            neg_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_negation_p(neg_lit)) {
                    new_pos_lits = cons(cycl_utilities.negate(neg_lit), new_pos_lits);
                } else {
                    new_neg_lits = cons(neg_lit, new_neg_lits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            } 
            neg_lits = nreverse(new_neg_lits);
            pos_lits = nreverse(new_pos_lits);
        }
        return values(neg_lits, pos_lits);
    }/**
     * Turn pos-lits to neg-lits or vice versa if lit is an el-negation-p
     */


    /**
     * Canonicalizes formula args of LITERAL into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Returns NIL if LITERAL is not a @xref relation-expression?
     *
     * @see sentence-arg?
     */
    @LispMethod(comment = "Canonicalizes formula args of LITERAL into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReturns NIL if LITERAL is not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nCanonicalizes formula args of LITERAL into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReturns NIL if LITERAL is not a @xref relation-expression?")
    public static final SubLObject canonicalize_literal_sentence_terms_alt(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                {
                    SubLObject unwrapped_literal = czer_utilities.unwrap_if_ist_permissive(literal, mt);
                    SubLObject ist_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != cycl_grammar.cycl_generalized_tensed_literal_p(unwrapped_literal)) {
                        {
                            SubLObject sense = $canonicalize_clause_sentence_terms_sense_lambda$.getDynamicValue(thread);
                            thread.resetMultipleValues();
                            {
                                SubLObject new_literal = hlmt_czer.tense_recursive_expander(unwrapped_literal, sense, ist_mt);
                                SubLObject new_mt = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != hlmt.hlmt_equalP(new_mt, mt)) {
                                    literal = new_literal;
                                } else {
                                    literal = make_ist_sentence(new_mt, new_literal);
                                }
                            }
                            if (sense == $NEG) {
                                literal = cycl_utilities.negate(literal);
                            }
                        }
                    }
                }
            }
            if (NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.czer_main.canonicalize_relation_sentence_terms(literal, mt);
            } else {
                return literal;
            }
        }
    }

    @LispMethod(comment = "Canonicalizes formula args of LITERAL into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReturns NIL if LITERAL is not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nCanonicalizes formula args of LITERAL into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReturns NIL if LITERAL is not a @xref relation-expression?")
    public static SubLObject canonicalize_literal_sentence_terms(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject unwrapped_literal = czer_utilities.unwrap_if_ist_permissive(literal, mt);
            final SubLObject ist_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != cycl_grammar.cycl_generalized_tensed_literal_p(unwrapped_literal)) {
                final SubLObject sense = $canonicalize_clause_sentence_terms_sense_lambda$.getDynamicValue(thread);
                thread.resetMultipleValues();
                final SubLObject new_literal = hlmt_czer.tense_recursive_expander(unwrapped_literal, sense, ist_mt);
                final SubLObject new_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != hlmt.hlmt_equalP(new_mt, mt)) {
                    literal = new_literal;
                } else {
                    literal = make_ist_sentence(new_mt, new_literal);
                }
                if (sense == $NEG) {
                    literal = cycl_utilities.negate(literal);
                }
            }
        }
        if (NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread)) {
            return canonicalize_relation_sentence_terms(literal, mt);
        }
        return literal;
    }/**
     * Canonicalizes formula args of LITERAL into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Returns NIL if LITERAL is not a @xref relation-expression?
     *
     * @see sentence-arg?
     */


    /**
     * Canonicalizes formula args of FUNCTION into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Returns NIL if FUNCTION is not a @xref relation-expression?
     *
     * @see sentence-arg?
     */
    @LispMethod(comment = "Canonicalizes formula args of FUNCTION into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReturns NIL if FUNCTION is not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nCanonicalizes formula args of FUNCTION into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReturns NIL if FUNCTION is not a @xref relation-expression?")
    public static final SubLObject canonicalize_function_sentence_terms_alt(SubLObject function, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_relation_sentence_terms(function, mt);
    }

    @LispMethod(comment = "Canonicalizes formula args of FUNCTION into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReturns NIL if FUNCTION is not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nCanonicalizes formula args of FUNCTION into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReturns NIL if FUNCTION is not a @xref relation-expression?")
    public static SubLObject canonicalize_function_sentence_terms(final SubLObject function, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_relation_sentence_terms(function, mt);
    }/**
     * Canonicalizes formula args of FUNCTION into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Returns NIL if FUNCTION is not a @xref relation-expression?
     *
     * @see sentence-arg?
     */


    /**
     * Canonicalizes formula args of RELATION into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Returns NIL if RELATION is not a @xref relation-expression?
     *
     * @see sentence-arg?
     */
    @LispMethod(comment = "Canonicalizes formula args of RELATION into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReturns NIL if RELATION is not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nCanonicalizes formula args of RELATION into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReturns NIL if RELATION is not a @xref relation-expression?")
    public static final SubLObject canonicalize_relation_sentence_terms_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != relation_expressionP(relation)) {
                if (NIL != subl_escape_p(relation)) {
                    return relation;
                } else {
                    {
                        SubLObject seqvar = sequence_var(relation, UNPROVIDED);
                        SubLObject tempformula = relation;
                        SubLObject relation_47 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
                        SubLObject result = NIL;
                        SubLObject reln = cycl_utilities.formula_arg0(relation_47);
                        SubLObject argnum = ZERO_INTEGER;
                        SubLObject cdolist_list_var = cycl_utilities.formula_terms(relation_47, UNPROVIDED);
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            {
                                SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                                try {
                                    wff_vars.$permit_keyword_variablesP$.bind(czer_utilities.arg_permits_keyword_variablesP(reln, argnum, UNPROVIDED), thread);
                                    if (NIL != czer_utilities.canon_varP(v_term)) {
                                        result = cons(v_term, result);
                                    } else {
                                        if (NIL != obsolete.natP(v_term, UNPROVIDED)) {
                                            result = cons(com.cyc.cycjava.cycl.czer_main.canonicalize_function_sentence_terms(v_term, mt), result);
                                        } else {
                                            if (NIL != term.sentenceP(v_term, UNPROVIDED)) {
                                                result = cons(uncanonicalizer.el_version(v_term, mt), result);
                                            } else {
                                                if (NIL != literalP(v_term)) {
                                                    result = cons(com.cyc.cycjava.cycl.czer_main.canonicalize_literal_sentence_terms(v_term, mt), result);
                                                } else {
                                                    result = cons(v_term, result);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
                                }
                            }
                            argnum = add(argnum, ONE_INTEGER);
                        }
                        result = nreverse(result);
                        if (NIL != seqvar) {
                            return nadd_sequence_var_to_end(seqvar, result);
                        } else {
                            return result;
                        }
                    }
                }
            } else {
                el_error(TWO_INTEGER, $str_alt40$Tried_to_canonicalize_the_formula, relation, UNPROVIDED, UNPROVIDED);
                return relation;
            }
        }
    }

    @LispMethod(comment = "Canonicalizes formula args of RELATION into their EL formulas.\r\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\r\nReturns NIL if RELATION is not a @xref relation-expression?\r\n\r\n@see sentence-arg?\nCanonicalizes formula args of RELATION into their EL formulas.\nA \'formula arg\' is an argument that is constrained to be a collection whose instances are Cyc formulas.\nReturns NIL if RELATION is not a @xref relation-expression?")
    public static SubLObject canonicalize_relation_sentence_terms(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == relation_expressionP(relation)) {
            el_error(TWO_INTEGER, $str39$Tried_to_canonicalize_the_formula, relation, UNPROVIDED, UNPROVIDED);
            return relation;
        }
        if (NIL != subl_escape_p(relation)) {
            return relation;
        }
        final SubLObject seqvar = sequence_var(relation, UNPROVIDED);
        final SubLObject relation_$51 = (NIL != seqvar) ? strip_sequence_var(relation) : relation;
        SubLObject result = NIL;
        final SubLObject reln = cycl_utilities.formula_arg0(relation_$51);
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var = cycl_utilities.formula_terms(relation_$51, UNPROVIDED);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
            try {
                wff_vars.$permit_keyword_variablesP$.bind(czer_utilities.arg_permits_keyword_variablesP(reln, argnum, UNPROVIDED), thread);
                if (NIL != czer_utilities.canon_varP(v_term)) {
                    result = cons(v_term, result);
                } else
                    if (NIL != obsolete.natP(v_term, UNPROVIDED)) {
                        result = cons(canonicalize_function_sentence_terms(v_term, mt), result);
                    } else
                        if (NIL != term.sentenceP(v_term, UNPROVIDED)) {
                            result = cons(uncanonicalizer.el_version(v_term, mt), result);
                        } else
                            if (NIL != literalP(v_term)) {
                                result = cons(canonicalize_literal_sentence_terms(v_term, mt), result);
                            } else {
                                result = cons(v_term, result);
                            }



            } finally {
                wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
            }
            argnum = add(argnum, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        result = nreverse(result);
        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }/**
     * Canonicalizes formula args of RELATION into their EL formulas.
     * A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
     * Returns NIL if RELATION is not a @xref relation-expression?
     *
     * @see sentence-arg?
     */


    /**
     * For each literal in CLAUSES, recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     * Assumes that every clause in CLAUSES is an EL formula.
     */
    @LispMethod(comment = "For each literal in CLAUSES, recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\r\nAssumes that every clause in CLAUSES is an EL formula.\nFor each literal in CLAUSES, recursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.\nAssumes that every clause in CLAUSES is an EL formula.")
    public static final SubLObject canonicalize_clauses_commutative_terms_destructive_alt(SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE), v_clauses);
    }

    @LispMethod(comment = "For each literal in CLAUSES, recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\r\nAssumes that every clause in CLAUSES is an EL formula.\nFor each literal in CLAUSES, recursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.\nAssumes that every clause in CLAUSES is an EL formula.")
    public static SubLObject canonicalize_clauses_commutative_terms_destructive(final SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE), v_clauses);
    }/**
     * For each literal in CLAUSES, recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     * Assumes that every clause in CLAUSES is an EL formula.
     */


    /**
     * For each literal in CLAUSE, recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     */
    @LispMethod(comment = "For each literal in CLAUSE, recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\nFor each literal in CLAUSE, recursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.")
    public static final SubLObject canonicalize_clause_commutative_terms_alt(SubLObject clause) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_clause_commutative_terms_destructive(copy_clause(clause));
    }

    @LispMethod(comment = "For each literal in CLAUSE, recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\nFor each literal in CLAUSE, recursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.")
    public static SubLObject canonicalize_clause_commutative_terms(final SubLObject clause) {
        return canonicalize_clause_commutative_terms_destructive(copy_clause(clause));
    }/**
     * For each literal in CLAUSE, recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     */


    /**
     * A destructive version of @xref canonicalize-clause-commutative-terms.
     */
    @LispMethod(comment = "A destructive version of @xref canonicalize-clause-commutative-terms.")
    public static final SubLObject canonicalize_clause_commutative_terms_destructive_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL == czer_vars.$canonicalize_gaf_commutative_termsP$.getDynamicValue(thread)) && (NIL != clause_utilities.gaf_clauseP(clause))) || (NIL != com.cyc.cycjava.cycl.czer_main.never_commutative_gaf_clauseP(clause))) {
                return clause;
            } else {
                return clauses.make_cnf(com.cyc.cycjava.cycl.czer_main.canonicalize_literals_commutative_terms(clauses.neg_lits(clause)), com.cyc.cycjava.cycl.czer_main.canonicalize_literals_commutative_terms(clauses.pos_lits(clause)));
            }
        }
    }

    @LispMethod(comment = "A destructive version of @xref canonicalize-clause-commutative-terms.")
    public static SubLObject canonicalize_clause_commutative_terms_destructive(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == czer_vars.$canonicalize_gaf_commutative_termsP$.getDynamicValue(thread)) && (NIL != clause_utilities.gaf_clauseP(clause))) || (NIL != never_commutative_gaf_clauseP(clause))) {
            return clause;
        }
        return clauses.make_cnf(canonicalize_literals_commutative_terms(clauses.neg_lits(clause)), canonicalize_literals_commutative_terms(clauses.pos_lits(clause)));
    }/**
     * A destructive version of @xref canonicalize-clause-commutative-terms.
     */


    public static final SubLObject never_commutative_gaf_clauseP_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != clause_utilities.pos_atomic_cnf_p(clause)) && (NIL != member(cycl_utilities.formula_operator(clause_utilities.gaf_cnf_literal(clause)), $never_commutative_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && (NIL == contains_subformula_p(clause_utilities.gaf_cnf_literal(clause))));
        }
    }

    public static SubLObject never_commutative_gaf_clauseP(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != clause_utilities.pos_atomic_cnf_p(clause)) && (NIL != member(cycl_utilities.formula_operator(clause_utilities.gaf_cnf_literal(clause)), $never_commutative_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && (NIL == contains_subformula_p(clause_utilities.gaf_cnf_literal(clause))));
    }

    /**
     * For each literal in LITERALS, recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     */
    @LispMethod(comment = "For each literal in LITERALS, recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\nFor each literal in LITERALS, recursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.")
    public static final SubLObject canonicalize_literals_commutative_terms_alt(SubLObject literals) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE), literals);
    }

    @LispMethod(comment = "For each literal in LITERALS, recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\nFor each literal in LITERALS, recursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.")
    public static SubLObject canonicalize_literals_commutative_terms(final SubLObject literals) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE), literals);
    }/**
     * For each literal in LITERALS, recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     */


    /**
     * Recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     */
    @LispMethod(comment = "Recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\nRecursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.")
    public static final SubLObject canonicalize_literal_commutative_terms_alt(SubLObject literal) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_literal_commutative_terms_destructive(copy_formula(literal));
    }

    @LispMethod(comment = "Recursively sorts the arguments of all relations with commutative predicates\r\nand the arguments of all nats with commutative functors.\nRecursively sorts the arguments of all relations with commutative predicates\nand the arguments of all nats with commutative functors.")
    public static SubLObject canonicalize_literal_commutative_terms(final SubLObject literal) {
        return canonicalize_literal_commutative_terms_destructive(copy_formula(literal));
    }/**
     * Recursively sorts the arguments of all relations with commutative predicates
     * and the arguments of all nats with commutative functors.
     */


    /**
     * A destructive version of @xref canonicalize-literal-commutative-terms.
     */
    @LispMethod(comment = "A destructive version of @xref canonicalize-literal-commutative-terms.")
    public static final SubLObject canonicalize_literal_commutative_terms_destructive_alt(SubLObject literal) {
        {
            SubLObject seqvar = sequence_var(literal, UNPROVIDED);
            SubLObject tempformula = literal;
            SubLObject literal_48 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
            SubLObject result = NIL;
            SubLObject pred = literal_predicate(literal_48, UNPROVIDED);
            SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(pred, UNPROVIDED);
            SubLObject args = com.cyc.cycjava.cycl.czer_main.canonicalize_terms_commutative_terms_without_reordering(literal_args(literal_48, UNPROVIDED), dont_reorder_argnums);
            if (NIL != fort_types_interface.commutative_relationP(pred)) {
                result = make_el_literal(pred, com.cyc.cycjava.cycl.czer_main.order_commutative_terms(args), UNPROVIDED);
            } else {
                if (NIL != fort_types_interface.partially_commutative_relation_p(pred)) {
                    result = make_el_literal(pred, com.cyc.cycjava.cycl.czer_main.sort_partially_commutative_terms(pred, args, symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_)), UNPROVIDED);
                } else {
                    result = make_el_literal(pred, args, UNPROVIDED);
                }
            }
            if (NIL != seqvar) {
                return nadd_sequence_var_to_end(seqvar, result);
            } else {
                return result;
            }
        }
    }

    @LispMethod(comment = "A destructive version of @xref canonicalize-literal-commutative-terms.")
    public static SubLObject canonicalize_literal_commutative_terms_destructive(final SubLObject literal) {
        final SubLObject seqvar = sequence_var(literal, UNPROVIDED);
        final SubLObject literal_$52 = (NIL != seqvar) ? strip_sequence_var(literal) : literal;
        SubLObject result = NIL;
        final SubLObject pred = literal_predicate(literal_$52, UNPROVIDED);
        final SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(pred, UNPROVIDED);
        final SubLObject args = canonicalize_terms_commutative_terms_without_reordering(literal_args(literal_$52, UNPROVIDED), dont_reorder_argnums);
        if (NIL != fort_types_interface.commutative_relationP(pred)) {
            result = make_el_literal(pred, order_commutative_terms(args), UNPROVIDED);
        } else
            if (NIL != fort_types_interface.partially_commutative_relation_p(pred)) {
                result = make_el_literal(pred, sort_partially_commutative_terms(pred, args, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_)), UNPROVIDED);
            } else {
                result = make_el_literal(pred, args, UNPROVIDED);
            }

        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }/**
     * A destructive version of @xref canonicalize-literal-commutative-terms.
     */


    /**
     *
     */
    public static final SubLObject canonicalize_literal_commutative_args_alt(SubLObject lit) {
        {
            SubLObject literal = copy_formula(lit);
            {
                SubLObject seqvar = sequence_var(literal, UNPROVIDED);
                SubLObject tempformula = literal;
                SubLObject literal_49 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
                SubLObject result = NIL;
                SubLObject pred = literal_predicate(literal_49, UNPROVIDED);
                SubLObject args = literal_args(literal_49, UNPROVIDED);
                if (NIL != fort_types_interface.commutative_relationP(pred)) {
                    result = make_el_literal(pred, com.cyc.cycjava.cycl.czer_main.order_commutative_terms(args), UNPROVIDED);
                } else {
                    if (NIL != fort_types_interface.partially_commutative_relation_p(pred)) {
                        result = make_el_literal(pred, com.cyc.cycjava.cycl.czer_main.sort_partially_commutative_terms(pred, args, symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_)), UNPROVIDED);
                    } else {
                        result = make_el_literal(pred, args, UNPROVIDED);
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

    public static SubLObject canonicalize_literal_commutative_args(final SubLObject lit) {
        final SubLObject literal = copy_formula(lit);
        final SubLObject seqvar = sequence_var(literal, UNPROVIDED);
        final SubLObject tempformula = literal;
        final SubLObject literal_$53 = (NIL != seqvar) ? strip_sequence_var(tempformula) : tempformula;
        SubLObject result = NIL;
        final SubLObject pred = literal_predicate(literal_$53, UNPROVIDED);
        final SubLObject args = literal_args(literal_$53, UNPROVIDED);
        if (NIL != fort_types_interface.commutative_relationP(pred)) {
            result = make_el_literal(pred, order_commutative_terms(args), UNPROVIDED);
        } else
            if (NIL != fort_types_interface.partially_commutative_relation_p(pred)) {
                result = make_el_literal(pred, sort_partially_commutative_terms(pred, args, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_)), UNPROVIDED);
            } else {
                result = make_el_literal(pred, args, UNPROVIDED);
            }

        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }

    public static final SubLObject order_commutative_terms_alt(SubLObject terms) {
        return Sort.sort(terms, symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED);
    }

    public static SubLObject order_commutative_terms(final SubLObject terms) {
        return Sort.sort(terms, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED);
    }

    /**
     * Puts each term in the list TERMS in canonical form wrt commutativity except the ones at argnum
     * in dont-reorder-argnums, but does not change the order of the list TERMS.
     */
    @LispMethod(comment = "Puts each term in the list TERMS in canonical form wrt commutativity except the ones at argnum\r\nin dont-reorder-argnums, but does not change the order of the list TERMS.\nPuts each term in the list TERMS in canonical form wrt commutativity except the ones at argnum\nin dont-reorder-argnums, but does not change the order of the list TERMS.")
    public static final SubLObject canonicalize_terms_commutative_terms_without_reordering_alt(SubLObject terms, SubLObject dont_reorder_argnums) {
        {
            SubLObject canonicalized_terms = NIL;
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = add(ONE_INTEGER, argnum)) {
                if (NIL != subl_promotions.memberP(add(argnum, ONE_INTEGER), dont_reorder_argnums, UNPROVIDED, UNPROVIDED)) {
                    canonicalized_terms = cons(v_term, canonicalized_terms);
                } else {
                    canonicalized_terms = cons(com.cyc.cycjava.cycl.czer_main.canonicalize_term_commutative_terms(v_term), canonicalized_terms);
                }
            }
            return nreverse(canonicalized_terms);
        }
    }

    @LispMethod(comment = "Puts each term in the list TERMS in canonical form wrt commutativity except the ones at argnum\r\nin dont-reorder-argnums, but does not change the order of the list TERMS.\nPuts each term in the list TERMS in canonical form wrt commutativity except the ones at argnum\nin dont-reorder-argnums, but does not change the order of the list TERMS.")
    public static SubLObject canonicalize_terms_commutative_terms_without_reordering(final SubLObject terms, final SubLObject dont_reorder_argnums) {
        SubLObject canonicalized_terms = NIL;
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = add(ONE_INTEGER, argnum)) {
            if (NIL != subl_promotions.memberP(add(argnum, ONE_INTEGER), dont_reorder_argnums, UNPROVIDED, UNPROVIDED)) {
                canonicalized_terms = cons(v_term, canonicalized_terms);
            } else {
                canonicalized_terms = cons(canonicalize_term_commutative_terms(v_term), canonicalized_terms);
            }
        }
        return nreverse(canonicalized_terms);
    }/**
     * Puts each term in the list TERMS in canonical form wrt commutativity except the ones at argnum
     * in dont-reorder-argnums, but does not change the order of the list TERMS.
     */


    /**
     * Basically just calls @xref canonicalize-relation-commutative-terms,
     * if TERM is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0.
     */
    @LispMethod(comment = "Basically just calls @xref canonicalize-relation-commutative-terms,\r\nif TERM is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0.\nBasically just calls @xref canonicalize-relation-commutative-terms,\nif TERM is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0.")
    public static final SubLObject canonicalize_term_commutative_terms_alt(SubLObject v_term) {
        if (NIL != subl_escape_p(v_term)) {
            return v_term;
        } else {
            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.czer_main.canonicalize_nat_commutative_terms(v_term);
            } else {
                if (NIL != el_relation_expressionP(v_term)) {
                    return com.cyc.cycjava.cycl.czer_main.canonicalize_relation_commutative_terms_destructive(v_term);
                } else {
                    return v_term;
                }
            }
        }
    }

    @LispMethod(comment = "Basically just calls @xref canonicalize-relation-commutative-terms,\r\nif TERM is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0.\nBasically just calls @xref canonicalize-relation-commutative-terms,\nif TERM is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0.")
    public static SubLObject canonicalize_term_commutative_terms(final SubLObject v_term) {
        if (NIL != subl_escape_p(v_term)) {
            return v_term;
        }
        if (NIL != term.nautP(v_term, UNPROVIDED)) {
            return canonicalize_nat_commutative_terms(v_term);
        }
        if (NIL != el_relation_expressionP(v_term)) {
            return canonicalize_relation_commutative_terms_destructive(v_term);
        }
        return v_term;
    }/**
     * Basically just calls @xref canonicalize-relation-commutative-terms,
     * if TERM is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0.
     */


    public static final SubLObject unary_function_commutes_with_its_argumentP_alt(SubLObject nat) {
        return makeBoolean((ONE_INTEGER.numE(cycl_utilities.nat_arity(nat, UNPROVIDED)) && ONE_INTEGER.numE(cycl_utilities.nat_arity(cycl_utilities.nat_arg1(nat, UNPROVIDED), UNPROVIDED))) && (NIL != czer_utilities.commuting_functionsP(cycl_utilities.nat_functor(nat), cycl_utilities.nat_functor(cycl_utilities.nat_arg1(nat, UNPROVIDED)), UNPROVIDED)));
    }

    public static SubLObject unary_function_commutes_with_its_argumentP(final SubLObject nat) {
        return makeBoolean((ONE_INTEGER.numE(cycl_utilities.nat_arity(nat, UNPROVIDED)) && ONE_INTEGER.numE(cycl_utilities.nat_arity(cycl_utilities.nat_arg1(nat, UNPROVIDED), UNPROVIDED))) && (NIL != czer_utilities.commuting_functionsP(cycl_utilities.nat_functor(nat), cycl_utilities.nat_functor(cycl_utilities.nat_arg1(nat, UNPROVIDED)), UNPROVIDED)));
    }

    public static final SubLObject canonicalize_commuting_function_alt(SubLObject nat) {
        {
            SubLObject outer_func = cycl_utilities.nat_functor(nat);
            SubLObject inner_func = cycl_utilities.nat_functor(cycl_utilities.nat_arg1(nat, UNPROVIDED));
            if (NIL != com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(outer_func, inner_func)) {
                return nat;
            } else {
                {
                    SubLObject arg = cycl_utilities.nat_arg1(cycl_utilities.nat_arg1(nat, UNPROVIDED), UNPROVIDED);
                    return make_unary_nat_formula(inner_func, make_unary_nat_formula(outer_func, arg));
                }
            }
        }
    }

    public static SubLObject canonicalize_commuting_function(final SubLObject nat) {
        final SubLObject outer_func = cycl_utilities.nat_functor(nat);
        final SubLObject inner_func = cycl_utilities.nat_functor(cycl_utilities.nat_arg1(nat, UNPROVIDED));
        if (NIL != commutative_terms_in_orderP(outer_func, inner_func)) {
            return nat;
        }
        final SubLObject arg = cycl_utilities.nat_arg1(cycl_utilities.nat_arg1(nat, UNPROVIDED), UNPROVIDED);
        return make_unary_nat_formula(inner_func, make_unary_nat_formula(outer_func, arg));
    }

    /**
     * Puts the args of NAT in canonical form wrt commutativity,
     * then sorts the args of NAT if it is commutative.
     * Also handles nested functions which commute with each other.
     */
    @LispMethod(comment = "Puts the args of NAT in canonical form wrt commutativity,\r\nthen sorts the args of NAT if it is commutative.\r\nAlso handles nested functions which commute with each other.\nPuts the args of NAT in canonical form wrt commutativity,\nthen sorts the args of NAT if it is commutative.\nAlso handles nested functions which commute with each other.")
    public static final SubLObject canonicalize_nat_commutative_terms_alt(SubLObject nat) {
        {
            SubLObject seqvar = sequence_var(nat, UNPROVIDED);
            SubLObject tempformula = nat;
            SubLObject nat_50 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
            SubLObject result = NIL;
            SubLObject function = cycl_utilities.nat_functor(nat_50);
            SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(function, UNPROVIDED);
            SubLObject v_arguments = com.cyc.cycjava.cycl.czer_main.canonicalize_terms_commutative_terms_without_reordering(cycl_utilities.nat_args(nat_50, UNPROVIDED), dont_reorder_argnums);
            if (NIL != com.cyc.cycjava.cycl.czer_main.unary_function_commutes_with_its_argumentP(nat_50)) {
                result = com.cyc.cycjava.cycl.czer_main.canonicalize_commuting_function(nat_50);
            } else {
                if (NIL != kb_accessors.commutative_functionP(function)) {
                    result = make_nat_formula(function, Sort.sort(v_arguments, symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED));
                } else {
                    if (NIL != fort_types_interface.partially_commutative_relation_p(function)) {
                        result = make_nat_formula(function, com.cyc.cycjava.cycl.czer_main.sort_partially_commutative_terms(function, v_arguments, symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_)));
                    } else {
                        if (v_arguments == cycl_utilities.nat_args(nat_50, UNPROVIDED)) {
                            result = nat_50;
                        } else {
                            result = make_nat_formula(function, v_arguments);
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

    @LispMethod(comment = "Puts the args of NAT in canonical form wrt commutativity,\r\nthen sorts the args of NAT if it is commutative.\r\nAlso handles nested functions which commute with each other.\nPuts the args of NAT in canonical form wrt commutativity,\nthen sorts the args of NAT if it is commutative.\nAlso handles nested functions which commute with each other.")
    public static SubLObject canonicalize_nat_commutative_terms(final SubLObject nat) {
        final SubLObject seqvar = sequence_var(nat, UNPROVIDED);
        final SubLObject nat_$54 = (NIL != seqvar) ? strip_sequence_var(nat) : nat;
        SubLObject result = NIL;
        final SubLObject function = cycl_utilities.nat_functor(nat_$54);
        final SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(function, UNPROVIDED);
        final SubLObject v_arguments = canonicalize_terms_commutative_terms_without_reordering(cycl_utilities.nat_args(nat_$54, UNPROVIDED), dont_reorder_argnums);
        if (NIL != unary_function_commutes_with_its_argumentP(nat_$54)) {
            result = canonicalize_commuting_function(nat_$54);
        } else
            if (NIL != kb_accessors.commutative_functionP(function)) {
                result = make_nat_formula(function, Sort.sort(v_arguments, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED));
            } else
                if (NIL != fort_types_interface.partially_commutative_relation_p(function)) {
                    result = make_nat_formula(function, sort_partially_commutative_terms(function, v_arguments, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_)));
                } else
                    if (v_arguments.eql(cycl_utilities.nat_args(nat_$54, UNPROVIDED))) {
                        result = nat_$54;
                    } else {
                        result = make_nat_formula(function, v_arguments);
                    }



        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }/**
     * Puts the args of NAT in canonical form wrt commutativity,
     * then sorts the args of NAT if it is commutative.
     * Also handles nested functions which commute with each other.
     */


    /**
     * Puts the args of RELATION-EXPRESSION in canonical form wrt commutativity,
     * then sorts the args of RELATION-EXPRESSION if its arg0 is commutative.
     */
    @LispMethod(comment = "Puts the args of RELATION-EXPRESSION in canonical form wrt commutativity,\r\nthen sorts the args of RELATION-EXPRESSION if its arg0 is commutative.\nPuts the args of RELATION-EXPRESSION in canonical form wrt commutativity,\nthen sorts the args of RELATION-EXPRESSION if its arg0 is commutative.")
    public static final SubLObject canonicalize_relation_commutative_terms_alt(SubLObject relation_expression) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_relation_commutative_terms_destructive(copy_formula(relation_expression));
    }

    @LispMethod(comment = "Puts the args of RELATION-EXPRESSION in canonical form wrt commutativity,\r\nthen sorts the args of RELATION-EXPRESSION if its arg0 is commutative.\nPuts the args of RELATION-EXPRESSION in canonical form wrt commutativity,\nthen sorts the args of RELATION-EXPRESSION if its arg0 is commutative.")
    public static SubLObject canonicalize_relation_commutative_terms(final SubLObject relation_expression) {
        return canonicalize_relation_commutative_terms_destructive(copy_formula(relation_expression));
    }/**
     * Puts the args of RELATION-EXPRESSION in canonical form wrt commutativity,
     * then sorts the args of RELATION-EXPRESSION if its arg0 is commutative.
     */


    /**
     * A destructive version of @xref canonicalize-relation-commutative-terms.
     */
    @LispMethod(comment = "A destructive version of @xref canonicalize-relation-commutative-terms.")
    public static final SubLObject canonicalize_relation_commutative_terms_destructive_alt(SubLObject relation_expression) {
        {
            SubLObject relation = cycl_utilities.formula_operator(relation_expression);
            SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(relation, UNPROVIDED);
            SubLObject seqvar = sequence_var(relation_expression, UNPROVIDED);
            SubLObject canonical_arguments = com.cyc.cycjava.cycl.czer_main.canonicalize_terms_commutative_terms_without_reordering(cycl_utilities.formula_args(relation_expression, $IGNORE), dont_reorder_argnums);
            SubLObject subcanonical_formula = make_el_formula(relation, canonical_arguments, seqvar);
            return com.cyc.cycjava.cycl.czer_main.sort_relation_commutative_terms(subcanonical_formula);
        }
    }

    @LispMethod(comment = "A destructive version of @xref canonicalize-relation-commutative-terms.")
    public static SubLObject canonicalize_relation_commutative_terms_destructive(final SubLObject relation_expression) {
        final SubLObject relation = cycl_utilities.formula_operator(relation_expression);
        final SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(relation, UNPROVIDED);
        final SubLObject seqvar = sequence_var(relation_expression, UNPROVIDED);
        final SubLObject canonical_arguments = canonicalize_terms_commutative_terms_without_reordering(cycl_utilities.formula_args(relation_expression, $IGNORE), dont_reorder_argnums);
        final SubLObject subcanonical_formula = make_el_formula(relation, canonical_arguments, seqvar);
        return sort_relation_commutative_terms(subcanonical_formula);
    }/**
     * A destructive version of @xref canonicalize-relation-commutative-terms.
     */


    /**
     * Sorts the args of RELATION-EXPRESSION if its arg0 is commutative.
     * This is destructive.
     */
    @LispMethod(comment = "Sorts the args of RELATION-EXPRESSION if its arg0 is commutative.\r\nThis is destructive.\nSorts the args of RELATION-EXPRESSION if its arg0 is commutative.\nThis is destructive.")
    public static final SubLObject sort_relation_commutative_terms_alt(SubLObject relation_expression) {
        {
            SubLObject seqvar = sequence_var(relation_expression, UNPROVIDED);
            SubLObject tempformula = relation_expression;
            SubLObject relation_expression_51 = (NIL != seqvar) ? ((SubLObject) (strip_sequence_var(tempformula))) : tempformula;
            SubLObject result = NIL;
            SubLObject relation = cycl_utilities.formula_operator(relation_expression_51);
            SubLObject v_arguments = cycl_utilities.formula_args(relation_expression_51, UNPROVIDED);
            if (NIL != fort_types_interface.commutative_relationP(relation)) {
                result = make_el_formula(relation, Sort.sort(v_arguments, symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED), UNPROVIDED);
            } else {
                if (NIL != fort_types_interface.partially_commutative_relation_p(relation)) {
                    result = make_el_formula(relation, com.cyc.cycjava.cycl.czer_main.sort_partially_commutative_terms(relation, v_arguments, symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_)), UNPROVIDED);
                } else {
                    result = relation_expression_51;
                }
            }
            if (NIL != seqvar) {
                return nadd_sequence_var_to_end(seqvar, result);
            } else {
                return result;
            }
        }
    }

    @LispMethod(comment = "Sorts the args of RELATION-EXPRESSION if its arg0 is commutative.\r\nThis is destructive.\nSorts the args of RELATION-EXPRESSION if its arg0 is commutative.\nThis is destructive.")
    public static SubLObject sort_relation_commutative_terms(final SubLObject relation_expression) {
        final SubLObject seqvar = sequence_var(relation_expression, UNPROVIDED);
        final SubLObject relation_expression_$55 = (NIL != seqvar) ? strip_sequence_var(relation_expression) : relation_expression;
        SubLObject result = NIL;
        final SubLObject relation = cycl_utilities.formula_operator(relation_expression_$55);
        final SubLObject v_arguments = cycl_utilities.formula_args(relation_expression_$55, UNPROVIDED);
        if (NIL != fort_types_interface.commutative_relationP(relation)) {
            result = make_el_formula(relation, Sort.sort(v_arguments, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED), UNPROVIDED);
        } else
            if (NIL != fort_types_interface.partially_commutative_relation_p(relation)) {
                result = make_el_formula(relation, sort_partially_commutative_terms(relation, v_arguments, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_)), UNPROVIDED);
            } else {
                result = relation_expression_$55;
            }

        if (NIL != seqvar) {
            return nadd_sequence_var_to_end(seqvar, result);
        }
        return result;
    }/**
     * Sorts the args of RELATION-EXPRESSION if its arg0 is commutative.
     * This is destructive.
     */


    /**
     * Sorts only the terms in TERMS that are asserted to be partially commutative arguments to RELATION.
     * Leaves the other terms in order.
     * This is destructive.
     */
    @LispMethod(comment = "Sorts only the terms in TERMS that are asserted to be partially commutative arguments to RELATION.\r\nLeaves the other terms in order.\r\nThis is destructive.\nSorts only the terms in TERMS that are asserted to be partially commutative arguments to RELATION.\nLeaves the other terms in order.\nThis is destructive.")
    public static final SubLObject sort_partially_commutative_terms_alt(SubLObject relation, SubLObject terms, SubLObject sort_fn) {
        {
            SubLObject commutative_argnums_set = com.cyc.cycjava.cycl.czer_main.partially_commutative_argnums(relation, terms);
            SubLObject cdolist_list_var = commutative_argnums_set;
            SubLObject commutative_argnums = NIL;
            for (commutative_argnums = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , commutative_argnums = cdolist_list_var.first()) {
                {
                    SubLObject commutative_args = NIL;
                    {
                        SubLObject cdotimes_end_var = length(terms);
                        SubLObject argnum = NIL;
                        for (argnum = ZERO_INTEGER; argnum.numL(cdotimes_end_var); argnum = add(argnum, ONE_INTEGER)) {
                            if (NIL != subl_promotions.memberP(add(ONE_INTEGER, argnum), commutative_argnums, UNPROVIDED, UNPROVIDED)) {
                                commutative_args = cons(nth(argnum, terms), commutative_args);
                            }
                        }
                    }
                    commutative_args = Sort.sort(commutative_args, sort_fn, UNPROVIDED);
                    {
                        SubLObject commutative_argnum = NIL;
                        SubLObject argnums = NIL;
                        SubLObject argnum = NIL;
                        for (commutative_argnum = ZERO_INTEGER, argnums = commutative_argnums, argnum = argnums.first(); NIL != argnum; commutative_argnum = add(ONE_INTEGER, commutative_argnum) , argnums = argnums.rest() , argnum = argnums.first()) {
                            terms = list_utilities.nreplace_nth(subtract(argnum, ONE_INTEGER), nth(commutative_argnum, commutative_args), terms);
                        }
                    }
                }
            }
        }
        return terms;
    }

    @LispMethod(comment = "Sorts only the terms in TERMS that are asserted to be partially commutative arguments to RELATION.\r\nLeaves the other terms in order.\r\nThis is destructive.\nSorts only the terms in TERMS that are asserted to be partially commutative arguments to RELATION.\nLeaves the other terms in order.\nThis is destructive.")
    public static SubLObject sort_partially_commutative_terms(final SubLObject relation, SubLObject terms, final SubLObject sort_fn) {
        SubLObject cdolist_list_var;
        final SubLObject commutative_argnums_set = cdolist_list_var = partially_commutative_argnums(relation, terms);
        SubLObject commutative_argnums = NIL;
        commutative_argnums = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject commutative_args = NIL;
            SubLObject cdotimes_end_var;
            SubLObject argnum;
            for (cdotimes_end_var = length(terms), argnum = NIL, argnum = ZERO_INTEGER; argnum.numL(cdotimes_end_var); argnum = add(argnum, ONE_INTEGER)) {
                if (NIL != subl_promotions.memberP(add(ONE_INTEGER, argnum), commutative_argnums, UNPROVIDED, UNPROVIDED)) {
                    commutative_args = cons(nth(argnum, terms), commutative_args);
                }
            }
            commutative_args = Sort.sort(commutative_args, sort_fn, UNPROVIDED);
            SubLObject commutative_argnum = NIL;
            SubLObject argnums = NIL;
            SubLObject argnum2 = NIL;
            commutative_argnum = ZERO_INTEGER;
            for (argnums = commutative_argnums, argnum2 = argnums.first(); NIL != argnum2; argnum2 = argnums.first()) {
                terms = list_utilities.nreplace_nth(subtract(argnum2, ONE_INTEGER), nth(commutative_argnum, commutative_args), terms);
                commutative_argnum = add(ONE_INTEGER, commutative_argnum);
                argnums = argnums.rest();
            }
            cdolist_list_var = cdolist_list_var.rest();
            commutative_argnums = cdolist_list_var.first();
        } 
        return terms;
    }/**
     * Sorts only the terms in TERMS that are asserted to be partially commutative arguments to RELATION.
     * Leaves the other terms in order.
     * This is destructive.
     */


    /**
     * Returns the argument positions in RELATION which commute with each other.
     */
    @LispMethod(comment = "Returns the argument positions in RELATION which commute with each other.")
    public static final SubLObject commutative_argnums_alt(SubLObject relation_expression) {
        {
            SubLObject relation = cycl_utilities.formula_operator(relation_expression);
            SubLObject args = cycl_utilities.formula_args(relation_expression, $IGNORE);
            if (NIL != fort_types_interface.commutative_relationP(relation)) {
                return list(list_utilities.numlist(length(args), ONE_INTEGER));
            } else {
                if (NIL != fort_types_interface.partially_commutative_relation_p(relation)) {
                    return com.cyc.cycjava.cycl.czer_main.partially_commutative_argnums(relation, args);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Returns the argument positions in RELATION which commute with each other.")
    public static SubLObject commutative_argnums(final SubLObject relation_expression) {
        final SubLObject relation = cycl_utilities.formula_operator(relation_expression);
        final SubLObject args = cycl_utilities.formula_args(relation_expression, $IGNORE);
        if (NIL != fort_types_interface.commutative_relationP(relation)) {
            return list(list_utilities.numlist(length(args), ONE_INTEGER));
        }
        if (NIL != fort_types_interface.partially_commutative_relation_p(relation)) {
            return partially_commutative_argnums(relation, args);
        }
        return NIL;
    }/**
     * Returns the argument positions in RELATION which commute with each other.
     */


    /**
     *
     *
     * @return boolean; t iff RELATION-EXPRESSION, if asserted as a gaf,
    would be well-formed, both internally and with respect to existing partial commutativity assertions in the KB.
     * @param RELATION-EXPRESSION
     * 		a literal beginning with either #$commutativeInArgs or #$commutativeInArgsAndRest.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION-EXPRESSION, if asserted as a gaf,\r\nwould be well-formed, both internally and with respect to existing partial commutativity assertions in the KB.\r\n@param RELATION-EXPRESSION\r\n\t\ta literal beginning with either #$commutativeInArgs or #$commutativeInArgsAndRest.")
    public static final SubLObject ok_wrt_partial_commutativityP_alt(SubLObject relation_expression, SubLObject mt, SubLObject inhibit_cyclesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = T;
                if ((NIL != inhibit_cyclesP) && (NIL == relation_free_variables(relation_expression, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    {
                        SubLObject relation = cycl_utilities.formula_arg1(relation_expression, UNPROVIDED);
                        SubLObject cia_args = cycl_utilities.formula_args(relation_expression, UNPROVIDED).rest();
                        SubLObject max = list_utilities.safe_max(cia_args, UNPROVIDED);
                        if (max.isInteger()) {
                            {
                                SubLObject cia_formulas = com.cyc.cycjava.cycl.czer_main.cia_formulas(relation, mt);
                                if (NIL == subl_promotions.memberP(relation_expression, cia_formulas, symbol_function(EQUAL), UNPROVIDED)) {
                                    cia_formulas = nconc(cia_formulas, list(relation_expression));
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject foo = com.cyc.cycjava.cycl.czer_main.partially_commutative_argnums_int(make_list(max, $DUMMY), cia_formulas, inhibit_cyclesP);
                                    SubLObject errors = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != errors) {
                                        okP = NIL;
                                        {
                                            SubLObject cdolist_list_var = errors;
                                            SubLObject error = NIL;
                                            for (error = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error = cdolist_list_var.first()) {
                                                wff.note_wff_violation(error);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return okP;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff RELATION-EXPRESSION, if asserted as a gaf,
    would be well-formed, both internally and with respect to existing partial commutativity assertions in the KB.
     * @param RELATION-EXPRESSION
     * 		a literal beginning with either #$commutativeInArgs or #$commutativeInArgsAndRest.
     */
    @LispMethod(comment = "@return boolean; t iff RELATION-EXPRESSION, if asserted as a gaf,\r\nwould be well-formed, both internally and with respect to existing partial commutativity assertions in the KB.\r\n@param RELATION-EXPRESSION\r\n\t\ta literal beginning with either #$commutativeInArgs or #$commutativeInArgsAndRest.")
    public static SubLObject ok_wrt_partial_commutativityP(final SubLObject relation_expression, final SubLObject mt, final SubLObject inhibit_cyclesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = T;
        if ((NIL != inhibit_cyclesP) && (NIL == relation_free_variables(relation_expression, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject relation = cycl_utilities.formula_arg1(relation_expression, UNPROVIDED);
            final SubLObject cia_args = cycl_utilities.formula_args(relation_expression, UNPROVIDED).rest();
            final SubLObject max = list_utilities.safe_max(cia_args, UNPROVIDED);
            if (max.isInteger()) {
                SubLObject cia_formulas = cia_formulas(relation, mt);
                if (NIL == subl_promotions.memberP(relation_expression, cia_formulas, symbol_function(EQUAL), UNPROVIDED)) {
                    cia_formulas = nconc(cia_formulas, list(relation_expression));
                }
                thread.resetMultipleValues();
                final SubLObject foo = partially_commutative_argnums_int(make_list(max, $DUMMY), cia_formulas, inhibit_cyclesP);
                final SubLObject errors = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != errors) {
                    okP = NIL;
                    SubLObject cdolist_list_var = errors;
                    SubLObject error = NIL;
                    error = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        wff.note_wff_violation(error);
                        cdolist_list_var = cdolist_list_var.rest();
                        error = cdolist_list_var.first();
                    } 
                }
            }
        }
        return okP;
    }

    /**
     *
     *
     * @return 0 a set of equivalence classes of the partially commutative argument positions of RELATION.
    {{{
    Each class is sorted, but the classes are not sorted wrt each other.
     * @return 1 nil if everything went okay, or an error condition if there was an error.
    If the assertion (#$commutativeInArgsAndRest RELATION 2 3 5) is in the KB,
     * @unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((2 3 5 6 7))
    If the assertions (#$commutativeInArgs RELATION 1 3) and (#$commutativeInArgs RELATION 2 4) are in the KB,
     * @unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((1 3) (2 4))
     * @unknown (partially-commutative-argnums RELATION (A B C)) ((1 3))
    }}}
     */
    @LispMethod(comment = "@return 0 a set of equivalence classes of the partially commutative argument positions of RELATION.\r\n{{{\r\nEach class is sorted, but the classes are not sorted wrt each other.\r\n@return 1 nil if everything went okay, or an error condition if there was an error.\r\nIf the assertion (#$commutativeInArgsAndRest RELATION 2 3 5) is in the KB,\r\n@unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((2 3 5 6 7))\r\nIf the assertions (#$commutativeInArgs RELATION 1 3) and (#$commutativeInArgs RELATION 2 4) are in the KB,\r\n@unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((1 3) (2 4))\r\n@unknown (partially-commutative-argnums RELATION (A B C)) ((1 3))\r\n}}}")
    public static final SubLObject partially_commutative_argnums_alt(SubLObject relation, SubLObject args) {
        return com.cyc.cycjava.cycl.czer_main.partially_commutative_argnums_int(args, com.cyc.cycjava.cycl.czer_main.cia_formulas(relation, UNPROVIDED), NIL);
    }

    /**
     *
     *
     * @return 0 a set of equivalence classes of the partially commutative argument positions of RELATION.
    {{{
    Each class is sorted, but the classes are not sorted wrt each other.
     * @return 1 nil if everything went okay, or an error condition if there was an error.
    If the assertion (#$commutativeInArgsAndRest RELATION 2 3 5) is in the KB,
     * @unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((2 3 5 6 7))
    If the assertions (#$commutativeInArgs RELATION 1 3) and (#$commutativeInArgs RELATION 2 4) are in the KB,
     * @unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((1 3) (2 4))
     * @unknown (partially-commutative-argnums RELATION (A B C)) ((1 3))
    }}}
     */
    @LispMethod(comment = "@return 0 a set of equivalence classes of the partially commutative argument positions of RELATION.\r\n{{{\r\nEach class is sorted, but the classes are not sorted wrt each other.\r\n@return 1 nil if everything went okay, or an error condition if there was an error.\r\nIf the assertion (#$commutativeInArgsAndRest RELATION 2 3 5) is in the KB,\r\n@unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((2 3 5 6 7))\r\nIf the assertions (#$commutativeInArgs RELATION 1 3) and (#$commutativeInArgs RELATION 2 4) are in the KB,\r\n@unknown (partially-commutative-argnums RELATION (A B C D E F G)) ((1 3) (2 4))\r\n@unknown (partially-commutative-argnums RELATION (A B C)) ((1 3))\r\n}}}")
    public static SubLObject partially_commutative_argnums(final SubLObject relation, final SubLObject args) {
        return partially_commutative_argnums_int(args, cia_formulas(relation, UNPROVIDED), NIL);
    }

    public static final SubLObject partially_commutative_argnums_int_alt(SubLObject args, SubLObject cia_formulas, SubLObject inhibit_cyclesP) {
        if (inhibit_cyclesP == UNPROVIDED) {
            inhibit_cyclesP = NIL;
        }
        {
            SubLObject error_condition = NIL;
            SubLObject cycleP = NIL;
            SubLObject accumulator = NIL;
            SubLObject cia_rest_formula = NIL;
            SubLObject assoc_list = NIL;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cia_formulas;
            SubLObject cia_formula = NIL;
            for (cia_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cia_formula = cdolist_list_var.first()) {
                {
                    SubLObject modified_cia_formula = cia_formula;
                    SubLObject commutative_argnums = NIL;
                    if ($$commutativeInArgsAndRest == cycl_utilities.formula_operator(cia_formula)) {
                        if (NIL != cia_rest_formula) {
                            cycleP = T;
                            if (NIL != inhibit_cyclesP) {
                                error_condition = cons(list($TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, cia_formula, cia_rest_formula), error_condition);
                            }
                        }
                        cia_rest_formula = cia_formula;
                        modified_cia_formula = copy_formula(modified_cia_formula);
                        {
                            SubLObject highest_argnum = list_utilities.safe_max(cycl_utilities.formula_args(cia_formula, UNPROVIDED).rest(), UNPROVIDED);
                            SubLObject cdotimes_end_var = length(args);
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                {
                                    SubLObject argnum = add(i, ONE_INTEGER);
                                    if (argnum.numG(highest_argnum)) {
                                        modified_cia_formula = nconc(modified_cia_formula, list(argnum));
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject args_52 = cycl_utilities.formula_args(modified_cia_formula, $IGNORE);
                        SubLObject cdolist_list_var_53 = args_52;
                        SubLObject cia_arg = NIL;
                        for (cia_arg = cdolist_list_var_53.first(); NIL != cdolist_list_var_53; cdolist_list_var_53 = cdolist_list_var_53.rest() , cia_arg = cdolist_list_var_53.first()) {
                            if (cia_arg.isInteger()) {
                                if (NIL != subl_promotions.memberP(cia_arg, accumulator, UNPROVIDED, UNPROVIDED)) {
                                    cycleP = T;
                                    if (NIL != inhibit_cyclesP) {
                                        error_condition = cons(list($CYCLIC_COMMUTATIVE_IN_ARGS, cia_formula, cia_arg, assoc(cia_arg, assoc_list, UNPROVIDED, UNPROVIDED).rest()), error_condition);
                                    }
                                }
                                if (NIL == subl_promotions.memberP(cia_arg, commutative_argnums, UNPROVIDED, UNPROVIDED)) {
                                    commutative_argnums = cons(cia_arg, commutative_argnums);
                                    accumulator = cons(cia_arg, accumulator);
                                    assoc_list = cons(cons(cia_arg, cia_formula), assoc_list);
                                }
                            }
                        }
                    }
                    if (NIL != commutative_argnums) {
                        result = cons(Sort.sort(commutative_argnums, symbol_function($sym51$_), UNPROVIDED), result);
                    }
                }
            }
            if (NIL != cycleP) {
                result = list_utilities.union_of_intersecting_sorted_lists(result, UNPROVIDED, UNPROVIDED);
            }
            return values(result, error_condition);
        }
    }

    public static SubLObject partially_commutative_argnums_int(final SubLObject args, final SubLObject cia_formulas, SubLObject inhibit_cyclesP) {
        if (inhibit_cyclesP == UNPROVIDED) {
            inhibit_cyclesP = NIL;
        }
        SubLObject error_condition = NIL;
        SubLObject cycleP = NIL;
        SubLObject accumulator = NIL;
        SubLObject cia_rest_formula = NIL;
        SubLObject assoc_list = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cia_formulas;
        SubLObject cia_formula = NIL;
        cia_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject modified_cia_formula = cia_formula;
            SubLObject commutative_argnums = NIL;
            if ($$commutativeInArgsAndRest.eql(cycl_utilities.formula_operator(cia_formula))) {
                if (NIL != cia_rest_formula) {
                    cycleP = T;
                    if (NIL != inhibit_cyclesP) {
                        error_condition = cons(list($TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, cia_formula, cia_rest_formula), error_condition);
                    }
                }
                cia_rest_formula = cia_formula;
                modified_cia_formula = copy_formula(modified_cia_formula);
                final SubLObject highest_argnum = list_utilities.safe_max(cycl_utilities.formula_args(cia_formula, UNPROVIDED).rest(), UNPROVIDED);
                SubLObject cdotimes_end_var;
                SubLObject i;
                SubLObject argnum;
                for (cdotimes_end_var = length(args), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    argnum = add(i, ONE_INTEGER);
                    if (argnum.numG(highest_argnum)) {
                        modified_cia_formula = nconc(modified_cia_formula, list(argnum));
                    }
                }
            }
            SubLObject cdolist_list_var_$57;
            final SubLObject args_$56 = cdolist_list_var_$57 = cycl_utilities.formula_args(modified_cia_formula, $IGNORE);
            SubLObject cia_arg = NIL;
            cia_arg = cdolist_list_var_$57.first();
            while (NIL != cdolist_list_var_$57) {
                if (cia_arg.isInteger()) {
                    if (NIL != subl_promotions.memberP(cia_arg, accumulator, UNPROVIDED, UNPROVIDED)) {
                        cycleP = T;
                        if (NIL != inhibit_cyclesP) {
                            error_condition = cons(list($CYCLIC_COMMUTATIVE_IN_ARGS, cia_formula, cia_arg, assoc(cia_arg, assoc_list, UNPROVIDED, UNPROVIDED).rest()), error_condition);
                        }
                    }
                    if (NIL == subl_promotions.memberP(cia_arg, commutative_argnums, UNPROVIDED, UNPROVIDED)) {
                        commutative_argnums = cons(cia_arg, commutative_argnums);
                        accumulator = cons(cia_arg, accumulator);
                        assoc_list = cons(cons(cia_arg, cia_formula), assoc_list);
                    }
                }
                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                cia_arg = cdolist_list_var_$57.first();
            } 
            if (NIL != commutative_argnums) {
                result = cons(Sort.sort(commutative_argnums, symbol_function($sym50$_), UNPROVIDED), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cia_formula = cdolist_list_var.first();
        } 
        if (NIL != cycleP) {
            result = list_utilities.union_of_intersecting_sorted_lists(result, UNPROVIDED, UNPROVIDED);
        }
        return values(result, error_condition);
    }

    /**
     *
     *
     * @return list; a list of gaf formulas from the KB making assertions about the partial commutativity of RELATION.
    Looks in MT and its genlMts.
     */
    @LispMethod(comment = "@return list; a list of gaf formulas from the KB making assertions about the partial commutativity of RELATION.\r\nLooks in MT and its genlMts.")
    public static final SubLObject cia_formulas_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject cia_assertions = kb_mapping.gather_gaf_arg_index(relation, ONE_INTEGER, $$commutativeInArgs, UNPROVIDED, UNPROVIDED);
                            SubLObject cia_rest_assertions = kb_mapping.gather_gaf_arg_index(relation, ONE_INTEGER, $$commutativeInArgsAndRest, UNPROVIDED, UNPROVIDED);
                            result = list_utilities.nmapcar(symbol_function(GAF_FORMULA), nconc(cia_assertions, cia_rest_assertions));
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return list; a list of gaf formulas from the KB making assertions about the partial commutativity of RELATION.
    Looks in MT and its genlMts.
     */
    @LispMethod(comment = "@return list; a list of gaf formulas from the KB making assertions about the partial commutativity of RELATION.\r\nLooks in MT and its genlMts.")
    public static SubLObject cia_formulas(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject cia_assertions = kb_mapping.gather_gaf_arg_index(relation, ONE_INTEGER, $$commutativeInArgs, UNPROVIDED, UNPROVIDED);
            final SubLObject cia_rest_assertions = kb_mapping.gather_gaf_arg_index(relation, ONE_INTEGER, $$commutativeInArgsAndRest, UNPROVIDED, UNPROVIDED);
            result = list_utilities.nmapcar(symbol_function(GAF_FORMULA), nconc(cia_assertions, cia_rest_assertions));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject commutative_terms_in_orderP_alt(SubLObject term1, SubLObject term2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$new_canonicalizerP$.getDynamicValue(thread)) {
                if (NIL != cycl_utilities.hl_term_with_el_counterpart_p(term1)) {
                    return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(cycl_utilities.hl_to_el(term1), term2);
                } else {
                    if (NIL != cycl_utilities.hl_term_with_el_counterpart_p(term2)) {
                        return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(term1, cycl_utilities.hl_to_el(term2));
                    } else {
                        if (term1.isAtom()) {
                            if (term2.isAtom()) {
                                return com.cyc.cycjava.cycl.czer_main.commutative_atoms_in_orderP(term1, term2);
                            } else {
                                return T;
                            }
                        } else {
                            if (term2.isAtom()) {
                                return NIL;
                            } else {
                                return com.cyc.cycjava.cycl.czer_main.commutative_formulas_in_orderP(term1, term2);
                            }
                        }
                    }
                }
            } else {
                return com.cyc.cycjava.cycl.czer_main.old_commutative_terms_in_orderP(term1, term2);
            }
        }
    }

    public static SubLObject commutative_terms_in_orderP(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$new_canonicalizerP$.getDynamicValue(thread)) {
            return old_commutative_terms_in_orderP(term1, term2);
        }
        if (NIL != cycl_utilities.hl_term_with_el_counterpart_p(term1)) {
            return commutative_terms_in_orderP(cycl_utilities.hl_to_el(term1), term2);
        }
        if (NIL != cycl_utilities.hl_term_with_el_counterpart_p(term2)) {
            return commutative_terms_in_orderP(term1, cycl_utilities.hl_to_el(term2));
        }
        if (term1.isAtom()) {
            if (term2.isAtom()) {
                return commutative_atoms_in_orderP(term1, term2);
            }
            return T;
        } else {
            if (term2.isAtom()) {
                return NIL;
            }
            return commutative_formulas_in_orderP(term1, term2);
        }
    }

    public static final SubLObject commutative_formulas_in_orderP_alt(SubLObject formula1, SubLObject formula2) {
        {
            SubLObject var_num1 = list_utilities.tree_count_if(symbol_function($sym54$EL_VAR_), formula1, UNPROVIDED);
            SubLObject var_num2 = list_utilities.tree_count_if(symbol_function($sym54$EL_VAR_), formula2, UNPROVIDED);
            if (var_num1.numL(var_num2)) {
                return T;
            } else {
                if (var_num1.numG(var_num2)) {
                    return NIL;
                } else {
                    {
                        SubLObject atom_num1 = list_utilities.tree_count_if(symbol_function(ATOM), formula1, UNPROVIDED);
                        SubLObject atom_num2 = list_utilities.tree_count_if(symbol_function(ATOM), formula2, UNPROVIDED);
                        if (atom_num1.numL(atom_num2)) {
                            return T;
                        } else {
                            if (atom_num1.numG(atom_num2)) {
                                return NIL;
                            } else {
                                if (cycl_utilities.formula_arg0(formula1).equal(cycl_utilities.formula_arg0(formula2))) {
                                    return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(cycl_utilities.formula_args(formula1, UNPROVIDED), cycl_utilities.formula_args(formula2, UNPROVIDED));
                                } else {
                                    return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject commutative_formulas_in_orderP(final SubLObject formula1, final SubLObject formula2) {
        final SubLObject var_num1 = list_utilities.tree_count_if(symbol_function($sym53$EL_VAR_), formula1, UNPROVIDED);
        final SubLObject var_num2 = list_utilities.tree_count_if(symbol_function($sym53$EL_VAR_), formula2, UNPROVIDED);
        if (var_num1.numL(var_num2)) {
            return T;
        }
        if (var_num1.numG(var_num2)) {
            return NIL;
        }
        final SubLObject atom_num1 = list_utilities.tree_count_if(symbol_function(ATOM), formula1, UNPROVIDED);
        final SubLObject atom_num2 = list_utilities.tree_count_if(symbol_function(ATOM), formula2, UNPROVIDED);
        if (atom_num1.numL(atom_num2)) {
            return T;
        }
        if (atom_num1.numG(atom_num2)) {
            return NIL;
        }
        if (cycl_utilities.formula_arg0(formula1).equal(cycl_utilities.formula_arg0(formula2))) {
            return commutative_terms_in_orderP(cycl_utilities.formula_args(formula1, UNPROVIDED), cycl_utilities.formula_args(formula2, UNPROVIDED));
        }
        return commutative_terms_in_orderP(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2));
    }

    public static final SubLObject canonicalizer_constant_L_alt(SubLObject constant1, SubLObject constant2) {
        return constants_high.constant_external_id_L(constant1, constant2);
    }

    public static SubLObject canonicalizer_constant_L(final SubLObject constant1, final SubLObject constant2) {
        return constants_high.constant_external_id_L(constant1, constant2);
    }

    public static final SubLObject commutative_atoms_in_orderP_alt(SubLObject atom1, SubLObject atom2) {
        if (NIL != nart_handles.nart_p(atom1)) {
            return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(narts_high.nart_el_formula(atom1), atom2);
        }
        if (NIL != nart_handles.nart_p(atom2)) {
            return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(atom1, narts_high.nart_el_formula(atom2));
        }
        if (NIL != cycl_variables.kb_varP(atom1)) {
            return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(variables.default_el_var_for_hl_var(atom1), atom2);
        }
        if (NIL != cycl_variables.kb_varP(atom2)) {
            return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(atom1, variables.default_el_var_for_hl_var(atom2));
        }
        if (NIL != constant_p(atom1)) {
            if (NIL != constant_p(atom2)) {
                return com.cyc.cycjava.cycl.czer_main.canonicalizer_constant_L(atom1, atom2);
            } else {
                return T;
            }
        } else {
            if (NIL != constant_p(atom2)) {
                return NIL;
            } else {
                if (NIL != cycl_variables.el_varP(atom1)) {
                    if (NIL != cycl_variables.el_varP(atom2)) {
                        el_error(FIVE_INTEGER, $str_alt56$warning__trying_to_sort_the_varia, atom1, atom2, UNPROVIDED);
                        return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        return T;
                    }
                } else {
                    if (NIL != cycl_variables.el_varP(atom2)) {
                        return NIL;
                    } else {
                        if (atom1.isSymbol()) {
                            if (atom2.isSymbol()) {
                                return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                return T;
                            }
                        } else {
                            if (atom2.isSymbol()) {
                                return NIL;
                            } else {
                                if (atom1.isNumber()) {
                                    if (atom2.isNumber()) {
                                        return numL(atom1, atom2);
                                    } else {
                                        return T;
                                    }
                                } else {
                                    if (atom2.isNumber()) {
                                        return NIL;
                                    } else {
                                        if (atom1.isChar()) {
                                            if (atom2.isChar()) {
                                                return char_lessp(atom1, atom2);
                                            } else {
                                                return T;
                                            }
                                        } else {
                                            if (atom2.isChar()) {
                                                return NIL;
                                            } else {
                                                if (atom1.isString()) {
                                                    if (atom2.isString()) {
                                                        return Strings.string_lessp(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        return T;
                                                    }
                                                } else {
                                                    if (atom2.isString()) {
                                                        return NIL;
                                                    } else {
                                                        el_error(FIVE_INTEGER, $str_alt57$warning__trying_to_string_sort_th, atom1, atom2, UNPROVIDED);
                                                        return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

    public static SubLObject commutative_atoms_in_orderP(final SubLObject atom1, final SubLObject atom2) {
        if (NIL != nart_handles.nart_p(atom1)) {
            return commutative_terms_in_orderP(narts_high.nart_el_formula(atom1), atom2);
        }
        if (NIL != nart_handles.nart_p(atom2)) {
            return commutative_terms_in_orderP(atom1, narts_high.nart_el_formula(atom2));
        }
        if (NIL != cycl_variables.kb_varP(atom1)) {
            return commutative_terms_in_orderP(variables.default_el_var_for_hl_var(atom1), atom2);
        }
        if (NIL != cycl_variables.kb_varP(atom2)) {
            return commutative_terms_in_orderP(atom1, variables.default_el_var_for_hl_var(atom2));
        }
        if (NIL != constant_p(atom1)) {
            if (NIL != constant_p(atom2)) {
                return canonicalizer_constant_L(atom1, atom2);
            }
            return T;
        } else {
            if (NIL != constant_p(atom2)) {
                return NIL;
            }
            if (NIL != cycl_variables.el_varP(atom1)) {
                if (NIL != cycl_variables.el_varP(atom2)) {
                    el_error(FIVE_INTEGER, $str55$warning__trying_to_sort_the_varia, atom1, atom2, UNPROVIDED);
                    return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return T;
            } else {
                if (NIL != cycl_variables.el_varP(atom2)) {
                    return NIL;
                }
                if (atom1.isSymbol()) {
                    if (atom2.isSymbol()) {
                        return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return T;
                } else {
                    if (atom2.isSymbol()) {
                        return NIL;
                    }
                    if (atom1.isNumber()) {
                        if (atom2.isNumber()) {
                            return numL(atom1, atom2);
                        }
                        return T;
                    } else {
                        if (atom2.isNumber()) {
                            return NIL;
                        }
                        if (atom1.isChar()) {
                            if (atom2.isChar()) {
                                return char_lessp(atom1, atom2);
                            }
                            return T;
                        } else {
                            if (atom2.isChar()) {
                                return NIL;
                            }
                            if (atom1.isString()) {
                                if (atom2.isString()) {
                                    return Strings.string_lessp(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                return T;
                            } else {
                                if (atom2.isString()) {
                                    return NIL;
                                }
                                el_error(FIVE_INTEGER, $str56$warning__trying_to_string_sort_th, atom1, atom2, UNPROVIDED);
                                return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject canon_term_L_alt(SubLObject term1, SubLObject term2) {
        return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(term1, term2);
    }

    public static SubLObject canon_term_L(final SubLObject term1, final SubLObject term2) {
        return commutative_terms_in_orderP(term1, term2);
    }

    /**
     * does not reify skolems
     */
    @LispMethod(comment = "does not reify skolems")
    public static final SubLObject canonicalize_functions_in_clause_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$clause_el_var_names$.currentBinding(thread);
                    try {
                        czer_vars.$clause_el_var_names$.bind(clause_utilities.clause_free_variables(clause, UNPROVIDED, UNPROVIDED), thread);
                        result = com.cyc.cycjava.cycl.czer_main.add_term_of_unit_lits_1(com.cyc.cycjava.cycl.czer_main.reify_functions(list(copy_clause(clause)), NIL).first());
                    } finally {
                        czer_vars.$clause_el_var_names$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "does not reify skolems")
    public static SubLObject canonicalize_functions_in_clause(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$clause_el_var_names$.currentBinding(thread);
        try {
            czer_vars.$clause_el_var_names$.bind(clause_utilities.clause_free_variables(clause, UNPROVIDED, UNPROVIDED), thread);
            result = add_term_of_unit_lits_1(reify_functions(list(copy_clause(clause)), NIL).first());
        } finally {
            czer_vars.$clause_el_var_names$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * does not reify skolems
     */


    /**
     * Puts all functions in CLAUSES in canonical form,
     * by destructively reifying all reifiable functions and adding termOfUnit literals.
     * Every function that has a reifiable functor should be reified.
     * Every reifiable function that is quantified into should have a termOfUnit assertion.
     */
    @LispMethod(comment = "Puts all functions in CLAUSES in canonical form,\r\nby destructively reifying all reifiable functions and adding termOfUnit literals.\r\nEvery function that has a reifiable functor should be reified.\r\nEvery reifiable function that is quantified into should have a termOfUnit assertion.\nPuts all functions in CLAUSES in canonical form,\nby destructively reifying all reifiable functions and adding termOfUnit literals.\nEvery function that has a reifiable functor should be reified.\nEvery reifiable function that is quantified into should have a termOfUnit assertion.")
    public static final SubLObject canonicalize_functions_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == czer_vars.$canonicalize_functionsP$.getDynamicValue(thread)) || (((NIL != list_utilities.singletonP(v_clauses)) && (NIL != clause_utilities.pos_atomic_cnf_p(v_clauses.first()))) && (NIL == contains_subformula_p(clause_utilities.gaf_cnf_literal(v_clauses.first()))))) {
                return v_clauses;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $tou_skolem_blist$.currentBinding(thread);
                    try {
                        $tou_skolem_blist$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.czer_main.add_term_of_unit_lits(com.cyc.cycjava.cycl.czer_main.reify_functions(v_clauses, T));
                    } finally {
                        $tou_skolem_blist$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Puts all functions in CLAUSES in canonical form,\r\nby destructively reifying all reifiable functions and adding termOfUnit literals.\r\nEvery function that has a reifiable functor should be reified.\r\nEvery reifiable function that is quantified into should have a termOfUnit assertion.\nPuts all functions in CLAUSES in canonical form,\nby destructively reifying all reifiable functions and adding termOfUnit literals.\nEvery function that has a reifiable functor should be reified.\nEvery reifiable function that is quantified into should have a termOfUnit assertion.")
    public static SubLObject canonicalize_functions(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == czer_vars.$canonicalize_functionsP$.getDynamicValue(thread)) || (((NIL != list_utilities.singletonP(v_clauses)) && (NIL != clause_utilities.pos_atomic_cnf_p(v_clauses.first()))) && (NIL == contains_subformula_p(clause_utilities.gaf_cnf_literal(v_clauses.first()))))) {
            return v_clauses;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $tou_skolem_blist$.currentBinding(thread);
        try {
            $tou_skolem_blist$.bind(NIL, thread);
            result = add_term_of_unit_lits(reify_functions(v_clauses, T));
        } finally {
            $tou_skolem_blist$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Puts all functions in CLAUSES in canonical form,
     * by destructively reifying all reifiable functions and adding termOfUnit literals.
     * Every function that has a reifiable functor should be reified.
     * Every reifiable function that is quantified into should have a termOfUnit assertion.
     */


    /**
     *
     *
     * @unknown this is destructive
     */
    @LispMethod(comment = "@unknown this is destructive")
    public static final SubLObject add_term_of_unit_lits_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$clause_el_var_names$.currentBinding(thread);
                    try {
                        czer_vars.$clause_el_var_names$.bind(com.cyc.cycjava.cycl.czer_main.clauses_free_variables(v_clauses), thread);
                        result = (NIL != czer_vars.$add_term_of_unit_litsP$.getDynamicValue(thread)) ? ((SubLObject) (list_utilities.nmapcar(symbol_function(ADD_TERM_OF_UNIT_LITS_1), v_clauses))) : v_clauses;
                    } finally {
                        czer_vars.$clause_el_var_names$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @unknown this is destructive
     */
    @LispMethod(comment = "@unknown this is destructive")
    public static SubLObject add_term_of_unit_lits(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$clause_el_var_names$.currentBinding(thread);
        try {
            czer_vars.$clause_el_var_names$.bind(clauses_free_variables(v_clauses), thread);
            result = (NIL != czer_vars.$add_term_of_unit_litsP$.getDynamicValue(thread)) ? list_utilities.nmapcar(symbol_function(ADD_TERM_OF_UNIT_LITS_1), v_clauses) : v_clauses;
        } finally {
            czer_vars.$clause_el_var_names$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return a list of the free variable in all the clauses.
     */
    @LispMethod(comment = "@return a list of the free variable in all the clauses.")
    public static final SubLObject clauses_free_variables_alt(SubLObject v_clauses) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_clauses;
            SubLObject clause = NIL;
            for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_54 = list_utilities.nmapcar(symbol_function(STR), clause_utilities.clause_free_variables(clause, symbol_function($sym54$EL_VAR_), UNPROVIDED));
                    SubLObject var_name = NIL;
                    for (var_name = cdolist_list_var_54.first(); NIL != cdolist_list_var_54; cdolist_list_var_54 = cdolist_list_var_54.rest() , var_name = cdolist_list_var_54.first()) {
                        {
                            SubLObject item_var = var_name;
                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result = cons(item_var, result);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return a list of the free variable in all the clauses.
     */
    @LispMethod(comment = "@return a list of the free variable in all the clauses.")
    public static SubLObject clauses_free_variables(final SubLObject v_clauses) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$58 = list_utilities.nmapcar(symbol_function(STR), clause_utilities.clause_free_variables(clause, symbol_function($sym53$EL_VAR_), UNPROVIDED));
            SubLObject var_name = NIL;
            var_name = cdolist_list_var_$58.first();
            while (NIL != cdolist_list_var_$58) {
                final SubLObject item_var = var_name;
                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                var_name = cdolist_list_var_$58.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * inference requires
     * . one termOfUnit neg-lit whenever an axiom quantifies into a reifiable function
     * . one evaluate neg-lit whenever an axiom quantifies into an evaluatable function
     *
     * @unknown this is destructive
     */
    @LispMethod(comment = "inference requires\r\n. one termOfUnit neg-lit whenever an axiom quantifies into a reifiable function\r\n. one evaluate neg-lit whenever an axiom quantifies into an evaluatable function\r\n\r\n@unknown this is destructive\ninference requires\n. one termOfUnit neg-lit whenever an axiom quantifies into a reifiable function\n. one evaluate neg-lit whenever an axiom quantifies into an evaluatable function")
    public static final SubLObject add_term_of_unit_lits_1_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != groundP(clause, symbol_function($sym54$EL_VAR_))) {
                return clause;
            }
            {
                SubLObject quantified_fn_terms = com.cyc.cycjava.cycl.czer_main.clause_quantified_fn_terms(clause);
                if (NIL != quantified_fn_terms) {
                    thread.resetMultipleValues();
                    {
                        SubLObject neg_lits = clause_utilities.unmake_clause(clause);
                        SubLObject pos_lits = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject target_lits = (NIL != within_queryP()) ? ((SubLObject) (pos_lits)) : neg_lits;
                            SubLObject cdolist_list_var = quantified_fn_terms;
                            SubLObject fn_term = NIL;
                            for (fn_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fn_term = cdolist_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.czer_main.reifiable_function_term_in_clauseP(fn_term, clause, UNPROVIDED)) {
                                    if (NIL == czer_utilities.fn_tou_lit(fn_term, target_lits)) {
                                        target_lits = list_utilities.nadd_to_end(czer_utilities.make_nart_var_tou_lit(fn_term), target_lits);
                                    }
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.czer_main.evaluatable_function_term_in_clauseP(fn_term, clause, UNPROVIDED)) {
                                        if (NIL == czer_utilities.fn_evaluate_lit(fn_term, target_lits, symbol_function(EQUAL_WRT_SVM))) {
                                            if (NIL != czer_utilities.fn_some_non_evaluatable_referenceP(fn_term, target_lits, symbol_function(EQUAL_WRT_SVM))) {
                                                target_lits = list_utilities.nadd_to_end(czer_utilities.make_nart_var_evaluate_lit(fn_term), target_lits);
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != within_queryP()) {
                                pos_lits = target_lits;
                            } else {
                                neg_lits = target_lits;
                            }
                        }
                        return list(neg_lits, pos_lits);
                    }
                } else {
                    return clause;
                }
            }
        }
    }

    @LispMethod(comment = "inference requires\r\n. one termOfUnit neg-lit whenever an axiom quantifies into a reifiable function\r\n. one evaluate neg-lit whenever an axiom quantifies into an evaluatable function\r\n\r\n@unknown this is destructive\ninference requires\n. one termOfUnit neg-lit whenever an axiom quantifies into a reifiable function\n. one evaluate neg-lit whenever an axiom quantifies into an evaluatable function")
    public static SubLObject add_term_of_unit_lits_1(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != groundP(clause, symbol_function($sym53$EL_VAR_))) {
            return clause;
        }
        final SubLObject quantified_fn_terms = clause_quantified_fn_terms(clause);
        if (NIL != quantified_fn_terms) {
            thread.resetMultipleValues();
            SubLObject neg_lits = clause_utilities.unmake_clause(clause);
            SubLObject pos_lits = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject target_lits = (NIL != within_queryP()) ? pos_lits : neg_lits;
            SubLObject cdolist_list_var = quantified_fn_terms;
            SubLObject fn_term = NIL;
            fn_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != reifiable_function_term_in_clauseP(fn_term, clause, UNPROVIDED)) {
                    if (NIL == czer_utilities.fn_tou_lit(fn_term, target_lits)) {
                        target_lits = list_utilities.nadd_to_end(czer_utilities.make_nart_var_tou_lit(fn_term), target_lits);
                    }
                } else
                    if (((NIL != evaluatable_function_term_in_clauseP(fn_term, clause, UNPROVIDED)) && (NIL == czer_utilities.fn_evaluate_lit(fn_term, target_lits, symbol_function(EQUAL_WRT_SVM)))) && (NIL != czer_utilities.fn_some_non_evaluatable_referenceP(fn_term, target_lits, symbol_function(EQUAL_WRT_SVM)))) {
                        target_lits = list_utilities.nadd_to_end(czer_utilities.make_nart_var_evaluate_lit(fn_term), target_lits);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                fn_term = cdolist_list_var.first();
            } 
            if (NIL != within_queryP()) {
                pos_lits = target_lits;
            } else {
                neg_lits = target_lits;
            }
            return list(neg_lits, pos_lits);
        }
        return clause;
    }/**
     * inference requires
     * . one termOfUnit neg-lit whenever an axiom quantifies into a reifiable function
     * . one evaluate neg-lit whenever an axiom quantifies into an evaluatable function
     *
     * @unknown this is destructive
     */


    public static final SubLObject equal_wrt_svm_alt(SubLObject object_1, SubLObject object_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(object_1.equal(object_2) || (NIL != (NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? ((SubLObject) (equal(com.cyc.cycjava.cycl.czer_main.el_ununiquify_vars_int(object_1, UNPROVIDED, UNPROVIDED), com.cyc.cycjava.cycl.czer_main.el_ununiquify_vars_int(object_2, UNPROVIDED, UNPROVIDED)))) : NIL)));
        }
    }

    public static SubLObject equal_wrt_svm(final SubLObject object_1, final SubLObject object_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(object_1.equal(object_2) || (NIL != (NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? equal(el_ununiquify_vars_int(object_1, UNPROVIDED, UNPROVIDED), el_ununiquify_vars_int(object_2, UNPROVIDED, UNPROVIDED)) : NIL)));
    }

    /**
     *
     *
     * @unknown depends on *mt*.
     */
    @LispMethod(comment = "@unknown depends on *mt*.")
    public static final SubLObject reifiable_function_term_in_clauseP_alt(SubLObject fn_term, SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym54$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_formula_p(fn_term)) {
                {
                    SubLObject fn = cycl_utilities.nat_functor(fn_term);
                    if (NIL != czer_utilities.reifiable_functorP(fn, UNPROVIDED)) {
                        return T;
                    } else {
                        if (NIL != funcall(varP, fn)) {
                            if (NIL != czer_vars.$control_2$.getDynamicValue(thread)) {
                                return genls.any_specP($$ReifiableFunction, at_var_types.cnf_variable_isa_constraints(fn, clause, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                            } else {
                                {
                                    SubLObject result = genls.any_specP($$ReifiableFunction, at_var_types.cnf_variable_isa_constraints(fn, clause, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                                    if (NIL == result) {
                                        {
                                            SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                                            try {
                                                wff_vars.$recognize_variablesP$.bind(NIL, thread);
                                                at_vars.$noting_at_violationsP$.bind(NIL, thread);
                                                result = genls.any_specP($$CycLReifiableDenotationalTerm, at_utilities.term_requires_isa_in_clause(fn_term, clause, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                at_vars.$noting_at_violationsP$.rebind(_prev_bind_1, thread);
                                                wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    return result;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown depends on *mt*.
     */
    @LispMethod(comment = "@unknown depends on *mt*.")
    public static SubLObject reifiable_function_term_in_clauseP(final SubLObject fn_term, final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym53$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_formula_p(fn_term)) {
            final SubLObject fn = cycl_utilities.nat_functor(fn_term);
            if (NIL != czer_utilities.reifiable_functorP(fn, UNPROVIDED)) {
                return T;
            }
            if (NIL != funcall(varP, fn)) {
                if (NIL != czer_vars.$control_2$.getDynamicValue(thread)) {
                    return genls.any_specP($$ReifiableFunction, at_var_types.cnf_variable_isa_constraints(fn, clause, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                }
                SubLObject result = genls.any_specP($$ReifiableFunction, at_var_types.cnf_variable_isa_constraints(fn, clause, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                if (NIL == result) {
                    final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                    try {
                        wff_vars.$recognize_variablesP$.bind(NIL, thread);
                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                        result = genls.any_specP($$CycLReifiableDenotationalTerm, at_utilities.term_requires_isa_in_clause(fn_term, clause, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } finally {
                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_2, thread);
                        wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown depends on *mt*.
     */
    @LispMethod(comment = "@unknown depends on *mt*.")
    public static final SubLObject evaluatable_function_term_in_clauseP_alt(SubLObject fn_term, SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym54$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_formula_p(fn_term)) {
                {
                    SubLObject fn = cycl_utilities.nat_functor(fn_term);
                    if (NIL != czer_utilities.evaluatable_function_symbolP(fn, UNPROVIDED)) {
                        return T;
                    } else {
                        if (NIL != funcall(varP, fn)) {
                            return genls.any_specP($$EvaluatableFunction, at_var_types.cnf_variable_isa_constraints(fn, clause, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown depends on *mt*.
     */
    @LispMethod(comment = "@unknown depends on *mt*.")
    public static SubLObject evaluatable_function_term_in_clauseP(final SubLObject fn_term, final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym53$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_formula_p(fn_term)) {
            final SubLObject fn = cycl_utilities.nat_functor(fn_term);
            if (NIL != czer_utilities.evaluatable_function_symbolP(fn, UNPROVIDED)) {
                return T;
            }
            if (NIL != funcall(varP, fn)) {
                return genls.any_specP($$EvaluatableFunction, at_var_types.cnf_variable_isa_constraints(fn, clause, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject czer_create_nartP(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_create_nartsP()) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_typesP$.bind(T, thread);
            return wff.el_wftP(nat, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject czer_create_nartsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $within_assert$.getDynamicValue(thread)) || (NIL != czer_vars.$create_narts_regardless_of_whether_within_assertP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject czer_create_nartsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $within_assert$.getDynamicValue(thread)) && (NIL == czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.getDynamicValue(thread))) || ((NIL != czer_vars.$create_narts_regardless_of_whether_within_assertP$.getDynamicValue(thread)) && (NIL == czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.getDynamicValue(thread))));
    }

    /**
     *
     *
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */
    @LispMethod(comment = "@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.")
    public static final SubLObject reify_relation_functions_in_mt_list_alt(SubLObject relation, SubLObject mt_list, SubLObject reify_relationP) {
        if (reify_relationP == UNPROVIDED) {
            reify_relationP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_list, thread);
                        result = com.cyc.cycjava.cycl.czer_main.reify_relation_functions(copy_formula(relation), reify_relationP);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */
    @LispMethod(comment = "@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.")
    public static SubLObject reify_relation_functions_in_mt_list(final SubLObject relation, final SubLObject mt_list, SubLObject reify_relationP) {
        if (reify_relationP == UNPROVIDED) {
            reify_relationP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_list, thread);
            result = reify_relation_functions(copy_formula(relation), reify_relationP);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Reifies functions contained within RELATION.
     * Like @xref reify-functions, except it takes a relation instead of clauses.  Also it doesn't reify skolems.
     *
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */
    @LispMethod(comment = "Reifies functions contained within RELATION.\r\nLike @xref reify-functions, except it takes a relation instead of clauses.  Also it doesn\'t reify skolems.\r\n\r\n@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.\nReifies functions contained within RELATION.\nLike @xref reify-functions, except it takes a relation instead of clauses.  Also it doesn\'t reify skolems.")
    public static final SubLObject reify_relation_functions_alt(SubLObject relation, SubLObject reify_relationP) {
        if (reify_relationP == UNPROVIDED) {
            reify_relationP = T;
        }
        if (NIL != relation_expressionP(relation)) {
            {
                SubLObject functions = NIL;
                SubLObject cdolist_list_var = cons(relation, com.cyc.cycjava.cycl.czer_main.relation_terms_to_reify(relation, UNPROVIDED));
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != subl_escape_p(relation)) {
                    } else {
                        if (v_term.isAtom()) {
                        } else {
                            if (NIL != czer_utilities.reifiable_function_termP(v_term, UNPROVIDED)) {
                                functions = cons(v_term, functions);
                            }
                        }
                    }
                }
                if (NIL != functions) {
                    functions = delete_duplicates(functions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    relation = com.cyc.cycjava.cycl.czer_main.reify_relation_functions_in(functions, relation, reify_relationP);
                }
                return relation;
            }
        } else {
            el_error(FOUR_INTEGER, $str_alt66$Tried_to_reify_functions_within__, relation, UNPROVIDED, UNPROVIDED);
        }
        return relation;
    }

    @LispMethod(comment = "Reifies functions contained within RELATION.\r\nLike @xref reify-functions, except it takes a relation instead of clauses.  Also it doesn\'t reify skolems.\r\n\r\n@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.\nReifies functions contained within RELATION.\nLike @xref reify-functions, except it takes a relation instead of clauses.  Also it doesn\'t reify skolems.")
    public static SubLObject reify_relation_functions(SubLObject relation, SubLObject reify_relationP) {
        if (reify_relationP == UNPROVIDED) {
            reify_relationP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        try {
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            if (NIL != relation_expressionP(relation)) {
                SubLObject functions = NIL;
                SubLObject cdolist_list_var = cons(relation, relation_terms_to_reify(relation, UNPROVIDED));
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == subl_escape_p(relation)) {
                        if (!v_term.isAtom()) {
                            if (NIL != czer_utilities.reifiable_function_termP(v_term, UNPROVIDED)) {
                                functions = cons(v_term, functions);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
                if (NIL != functions) {
                    functions = delete_duplicates(functions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    relation = reify_relation_functions_in(functions, relation, reify_relationP);
                }
                return relation;
            }
            el_error(FOUR_INTEGER, $str66$Tried_to_reify_functions_within__, relation, UNPROVIDED, UNPROVIDED);
        } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0, thread);
        }
        return relation;
    }/**
     * Reifies functions contained within RELATION.
     * Like @xref reify-functions, except it takes a relation instead of clauses.  Also it doesn't reify skolems.
     *
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */


    /**
     *
     *
     * @see reify-functions-in
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */
    @LispMethod(comment = "@see reify-functions-in\r\n@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.")
    public static final SubLObject reify_relation_functions_in_alt(SubLObject functions, SubLObject relation, SubLObject reify_relationP) {
        {
            SubLObject fns = NIL;
            SubLObject fn = NIL;
            for (fns = functions, fn = fns.first(); NIL != fn; fns = com.cyc.cycjava.cycl.czer_main.reify_function_in_fns(fn, fns.rest()) , fn = fns.first()) {
                relation = com.cyc.cycjava.cycl.czer_main.reify_relation_function_in(fn, relation, reify_relationP);
            }
        }
        return relation;
    }

    /**
     *
     *
     * @see reify-functions-in
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */
    @LispMethod(comment = "@see reify-functions-in\r\n@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.")
    public static SubLObject reify_relation_functions_in(final SubLObject functions, SubLObject relation, final SubLObject reify_relationP) {
        SubLObject fns;
        SubLObject fn;
        for (fns = NIL, fn = NIL, fns = functions, fn = fns.first(); NIL != fn; fn = fns.first()) {
            relation = reify_relation_function_in(fn, relation, reify_relationP);
            fns = reify_function_in_fns(fn, fns.rest());
        }
        return relation;
    }

    /**
     *
     *
     * @see reify-function-in-destructive
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */
    @LispMethod(comment = "@see reify-function-in-destructive\r\n@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.")
    public static final SubLObject reify_relation_function_in_alt(SubLObject fn_term, SubLObject relation, SubLObject reify_relationP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.czer_main.czer_create_nartsP()) {
                return com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_relation(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified_destructive(fn_term), fn_term, relation, reify_relationP);
            } else {
                if (NIL != term.closed_fn_termP(fn_term)) {
                    return com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_relation(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term(fn_term), fn_term, relation, reify_relationP);
                } else {
                    if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
                        return com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_relation(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified_destructive(fn_term), fn_term, relation, reify_relationP);
                    } else {
                        return relation;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @see reify-function-in-destructive
     * @param REIFY-RELATION?;
     * 		whether RELATION itself should be reified if possible.
     */
    @LispMethod(comment = "@see reify-function-in-destructive\r\n@param REIFY-RELATION?;\r\n\t\twhether RELATION itself should be reified if possible.")
    public static SubLObject reify_relation_function_in(final SubLObject fn_term, final SubLObject relation, final SubLObject reify_relationP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_create_nartP(fn_term)) {
            return subst_canon_fn_in_relation(canonicalize_fn_term_if_reified_destructive(fn_term), fn_term, relation, reify_relationP);
        }
        if (NIL != term.closed_fn_termP(fn_term)) {
            return subst_canon_fn_in_relation(canonicalize_fn_term(fn_term), fn_term, relation, reify_relationP);
        }
        if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
            return subst_canon_fn_in_relation(canonicalize_fn_term_if_reified_destructive(fn_term), fn_term, relation, reify_relationP);
        }
        return relation;
    }

    /**
     * does not reify skolems
     */
    @LispMethod(comment = "does not reify skolems")
    public static final SubLObject reify_functions_in_mt_alt(SubLObject v_clauses, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        result = com.cyc.cycjava.cycl.czer_main.reify_functions(copy_clauses(v_clauses), NIL);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "does not reify skolems")
    public static SubLObject reify_functions_in_mt(final SubLObject v_clauses, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = reify_functions(copy_clauses(v_clauses), NIL);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * does not reify skolems
     */


    /**
     * Destructively reifies all reifiable functions in CLAUSES.
     * Assumes that each clause in CLAUSES is an EL formula. (huh?)
     */
    @LispMethod(comment = "Destructively reifies all reifiable functions in CLAUSES.\r\nAssumes that each clause in CLAUSES is an EL formula. (huh?)\nDestructively reifies all reifiable functions in CLAUSES.\nAssumes that each clause in CLAUSES is an EL formula. (huh?)")
    public static final SubLObject reify_functions_alt(SubLObject v_clauses, SubLObject reify_skolemsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_skolems = NIL;
                SubLObject functions = NIL;
                SubLObject cdolist_list_var = list_utilities.mapnunion(symbol_function(CLAUSE_TERMS_TO_REIFY), v_clauses, symbol_function(EQUAL));
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != subl_escape_p(v_term)) {
                    } else {
                        if (v_term.isAtom()) {
                        } else {
                            if ((NIL != reify_skolemsP) && (NIL != term.skolem_fn_functionP(cycl_utilities.nat_functor(v_term)))) {
                                v_skolems = cons(v_term, v_skolems);
                            } else {
                                if (NIL != czer_utilities.reifiable_function_termP(v_term, UNPROVIDED)) {
                                    functions = cons(v_term, functions);
                                }
                            }
                        }
                    }
                }
                if (NIL != functions) {
                    v_clauses = com.cyc.cycjava.cycl.czer_main.reify_functions_in(functions, v_clauses);
                }
                if (NIL != v_skolems) {
                    {
                        SubLObject error = NIL;
                        try {
                            v_clauses = skolems.reify_skolems_in(v_skolems, v_clauses, mt_relevance_macros.$mt$.getDynamicValue(thread), $within_assert$.getDynamicValue(thread));
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
                        }
                        if (NIL != error) {
                            if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                                wff.note_wff_violation(list($TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM, error));
                            }
                            return NIL;
                        }
                    }
                }
                return v_clauses;
            }
        }
    }

    @LispMethod(comment = "Destructively reifies all reifiable functions in CLAUSES.\r\nAssumes that each clause in CLAUSES is an EL formula. (huh?)\nDestructively reifies all reifiable functions in CLAUSES.\nAssumes that each clause in CLAUSES is an EL formula. (huh?)")
    public static SubLObject reify_functions(SubLObject v_clauses, final SubLObject reify_skolemsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        try {
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            SubLObject v_skolems = NIL;
            SubLObject functions = NIL;
            SubLObject cdolist_list_var = list_utilities.mapnunion(symbol_function(CLAUSE_TERMS_TO_REIFY), v_clauses, symbol_function(EQUAL));
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_escape_p(v_term)) {
                    if (!v_term.isAtom()) {
                        if ((NIL != reify_skolemsP) && (NIL != term.skolem_fn_functionP(cycl_utilities.nat_functor(v_term)))) {
                            v_skolems = cons(v_term, v_skolems);
                        } else
                            if (NIL != czer_utilities.reifiable_function_termP(v_term, UNPROVIDED)) {
                                functions = cons(v_term, functions);
                            }

                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            if (NIL != functions) {
                functions = Sort.sort(functions, symbol_function($sym50$_), TERM_RELATIONAL_COMPLEXITY);
                v_clauses = reify_functions_in(functions, v_clauses);
            }
            if (NIL != v_skolems) {
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
                    v_clauses = skolems.reify_skolems_in(v_skolems, v_clauses, mt_relevance_macros.$mt$.getDynamicValue(thread), $within_assert$.getDynamicValue(thread));
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    if (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)) {
                        wff.note_wff_violation(list($TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM, error));
                    }
                    return NIL;
                }
            }
            return v_clauses;
        } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0, thread);
        }
    }/**
     * Destructively reifies all reifiable functions in CLAUSES.
     * Assumes that each clause in CLAUSES is an EL formula. (huh?)
     */


    public static final SubLObject reify_functions_in_alt(SubLObject functions, SubLObject v_clauses) {
        {
            SubLObject fns = NIL;
            SubLObject fn = NIL;
            for (fns = functions, fn = fns.first(); NIL != fn; fns = com.cyc.cycjava.cycl.czer_main.reify_function_in_fns(fn, fns.rest()) , fn = fns.first()) {
                v_clauses = com.cyc.cycjava.cycl.czer_main.reify_function_in_destructive(fn, v_clauses);
            }
        }
        return v_clauses;
    }

    public static SubLObject reify_functions_in(final SubLObject functions, SubLObject v_clauses) {
        SubLObject fns;
        SubLObject fn;
        for (fns = NIL, fn = NIL, fns = functions, fn = fns.first(); NIL != fn; fn = fns.first()) {
            v_clauses = reify_function_in_destructive(fn, v_clauses);
            fns = reify_function_in_fns(fn, fns.rest());
        }
        return v_clauses;
    }

    public static final SubLObject reify_function_in_fns_alt(SubLObject fn_term, SubLObject fns) {
        if (NIL == com.cyc.cycjava.cycl.czer_main.czer_create_nartsP()) {
            return subst(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified_destructive(fn_term), fn_term, fns, symbol_function(EQUAL), UNPROVIDED);
        } else {
            if (NIL == term.closed_fn_termP(fn_term)) {
                return fns;
            } else {
                return subst(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term(fn_term), fn_term, fns, symbol_function(EQUAL), UNPROVIDED);
            }
        }
    }

    public static SubLObject reify_function_in_fns(final SubLObject fn_term, final SubLObject fns) {
        if (NIL == czer_create_nartP(fn_term)) {
            return subst(canonicalize_fn_term_if_reified_destructive(fn_term), fn_term, fns, symbol_function(EQUAL), UNPROVIDED);
        }
        if (NIL == term.closed_fn_termP(fn_term)) {
            return fns;
        }
        return subst(canonicalize_fn_term(fn_term), fn_term, fns, symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject reify_function_in_alt(SubLObject fn_term, SubLObject v_clauses) {
        return com.cyc.cycjava.cycl.czer_main.reify_function_in_destructive(copy_formula(fn_term), copy_clauses(v_clauses));
    }

    public static SubLObject reify_function_in(final SubLObject fn_term, final SubLObject v_clauses) {
        return reify_function_in_destructive(copy_formula(fn_term), copy_clauses(v_clauses));
    }

    /**
     * A destructive version of @xref reify-function-in.
     */
    @LispMethod(comment = "A destructive version of @xref reify-function-in.")
    public static final SubLObject reify_function_in_destructive_alt(SubLObject fn_term, SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.czer_main.czer_create_nartsP()) {
                return com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_clauses(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified(fn_term), fn_term, v_clauses);
            } else {
                if (NIL != term.closed_fn_termP(fn_term)) {
                    return com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_clauses(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term(fn_term), fn_term, v_clauses);
                } else {
                    if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
                        return com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_clauses(com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified(fn_term), fn_term, v_clauses);
                    } else {
                        return v_clauses;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "A destructive version of @xref reify-function-in.")
    public static SubLObject reify_function_in_destructive(final SubLObject fn_term, final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_create_nartP(fn_term)) {
            return subst_canon_fn_in_clauses(canonicalize_fn_term_if_reified(fn_term), fn_term, v_clauses);
        }
        if (NIL != term.closed_fn_termP(fn_term)) {
            return subst_canon_fn_in_clauses(canonicalize_fn_term(fn_term), fn_term, v_clauses);
        }
        if (NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread)) {
            return subst_canon_fn_in_clauses(canonicalize_fn_term_if_reified(fn_term), fn_term, v_clauses);
        }
        return v_clauses;
    }/**
     * A destructive version of @xref reify-function-in.
     */


    /**
     * fn-term is a term denoted as a (possibly nested) function expression
     */
    @LispMethod(comment = "fn-term is a term denoted as a (possibly nested) function expression")
    public static final SubLObject canonicalize_fn_term_if_reified_alt(SubLObject fn_term) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified_destructive(copy_formula(fn_term));
    }

    @LispMethod(comment = "fn-term is a term denoted as a (possibly nested) function expression")
    public static SubLObject canonicalize_fn_term_if_reified(final SubLObject fn_term) {
        return canonicalize_fn_term_if_reified_destructive(copy_formula(fn_term));
    }/**
     * fn-term is a term denoted as a (possibly nested) function expression
     */


    /**
     * A destructive version of @xref canonicalize-fn-term-if-reified.
     */
    @LispMethod(comment = "A destructive version of @xref canonicalize-fn-term-if-reified.")
    public static final SubLObject canonicalize_fn_term_if_reified_destructive_alt(SubLObject fn_term) {
        {
            SubLObject result = fn_term;
            if (NIL != list_utilities.proper_list_p(fn_term)) {
                if (NIL != fort_types_interface.reifiable_function_p(cycl_utilities.nat_functor(fn_term))) {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.czer_main.nested_fn_terms(fn_term);
                        SubLObject nested_fn_term = NIL;
                        for (nested_fn_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nested_fn_term = cdolist_list_var.first()) {
                            if (NIL != czer_utilities.reifiable_function_termP(nested_fn_term, UNPROVIDED)) {
                                {
                                    SubLObject v_new = com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_if_reified_destructive(nested_fn_term);
                                    if (!v_new.equal(nested_fn_term)) {
                                        fn_term = nsubst(v_new, nested_fn_term, fn_term, symbol_function(EQUAL), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != term.closed_nautP(fn_term, UNPROVIDED)) {
                        {
                            SubLObject nart = czer_utilities.el_find_nart(fn_term);
                            if (NIL != nart) {
                                result = nart;
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "A destructive version of @xref canonicalize-fn-term-if-reified.")
    public static SubLObject canonicalize_fn_term_if_reified_destructive(SubLObject fn_term) {
        SubLObject result = fn_term;
        if ((NIL != list_utilities.proper_list_p(fn_term)) && (NIL != fort_types_interface.reifiable_function_p(cycl_utilities.nat_functor(fn_term)))) {
            SubLObject cdolist_list_var = nested_fn_terms(fn_term);
            SubLObject nested_fn_term = NIL;
            nested_fn_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != czer_utilities.reifiable_function_termP(nested_fn_term, UNPROVIDED)) {
                    final SubLObject v_new = canonicalize_fn_term_if_reified_destructive(nested_fn_term);
                    if (!v_new.equal(nested_fn_term)) {
                        fn_term = nsubst(v_new, nested_fn_term, fn_term, symbol_function(EQUAL), UNPROVIDED);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                nested_fn_term = cdolist_list_var.first();
            } 
            if (NIL != term.closed_nautP(fn_term, UNPROVIDED)) {
                final SubLObject nart = czer_utilities.el_find_nart(fn_term);
                if (NIL != nart) {
                    result = nart;
                }
            }
        }
        return result;
    }/**
     * A destructive version of @xref canonicalize-fn-term-if-reified.
     */


    public static final SubLObject canonicalize_fn_term_alt(SubLObject fn_term) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_int(fn_term, NIL, T, UNPROVIDED);
    }

    public static SubLObject canonicalize_fn_term(final SubLObject fn_term) {
        return canonicalize_fn_term_int(fn_term, NIL, T, UNPROVIDED);
    }

    /**
     * Return the nart implementing NAUT if it exists, otherwise create it.
     * Substitutions for subnarts are performed, creating new subnarts if necessary.
     *
     * @param ASSUME-ALL-REIFIABLE?
     * 		booleanp; if T, assumes all functions are reifiable.
     * 		Only allowed to be T during KB bootstrapping.
     */
    @LispMethod(comment = "Return the nart implementing NAUT if it exists, otherwise create it.\r\nSubstitutions for subnarts are performed, creating new subnarts if necessary.\r\n\r\n@param ASSUME-ALL-REIFIABLE?\r\n\t\tbooleanp; if T, assumes all functions are reifiable.\r\n\t\tOnly allowed to be T during KB bootstrapping.\nReturn the nart implementing NAUT if it exists, otherwise create it.\nSubstitutions for subnarts are performed, creating new subnarts if necessary.")
    public static final SubLObject cyc_find_or_create_nart_alt(SubLObject naut, SubLObject assume_all_reifiableP) {
        if (assume_all_reifiableP == UNPROVIDED) {
            assume_all_reifiableP = NIL;
        }
        return com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_int(naut, T, T, assume_all_reifiableP);
    }

    @LispMethod(comment = "Return the nart implementing NAUT if it exists, otherwise create it.\r\nSubstitutions for subnarts are performed, creating new subnarts if necessary.\r\n\r\n@param ASSUME-ALL-REIFIABLE?\r\n\t\tbooleanp; if T, assumes all functions are reifiable.\r\n\t\tOnly allowed to be T during KB bootstrapping.\nReturn the nart implementing NAUT if it exists, otherwise create it.\nSubstitutions for subnarts are performed, creating new subnarts if necessary.")
    public static SubLObject cyc_find_or_create_nart(final SubLObject naut, SubLObject assume_all_reifiableP) {
        if (assume_all_reifiableP == UNPROVIDED) {
            assume_all_reifiableP = NIL;
        }
        return canonicalize_fn_term_int(naut, T, T, assume_all_reifiableP);
    }/**
     * Return the nart implementing NAUT if it exists, otherwise create it.
     * Substitutions for subnarts are performed, creating new subnarts if necessary.
     *
     * @param ASSUME-ALL-REIFIABLE?
     * 		booleanp; if T, assumes all functions are reifiable.
     * 		Only allowed to be T during KB bootstrapping.
     */


    public static final SubLObject low_find_or_create_nart_alt(SubLObject naut) {
        core.ensure_bootstrapping_kb();
        return com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_int(naut, NIL, T, T);
    }

    public static SubLObject low_find_or_create_nart(final SubLObject naut) {
        core.ensure_bootstrapping_kb();
        return canonicalize_fn_term_int(naut, NIL, T, T);
    }

    /**
     * FN-TERM is a (possibly nested) naut.  This function canonicalizes it,
     * possibly reifying it and/or its subnats, from the inside out.
     *
     * @param CZE?;
     * 		if true, performs additional canonicalization on FN-TERM,
     * 		e.g. reordering of commutative terms.  When called during canonicalization of
     * 		an entire sentence, we can assume this has already been done, but when
     * 		canonicalizing a nat in isolation, we need to do the additional canonicalization.
     * @param CREATE?
     * 		booleanp; if NIL, will not create new narts.
     * @param ASSUME-ALL-REIFIABLE?
     * 		booleanp; if T, assumes all functions are reifiable.
     * 		Only allowed to be T during KB bootstrapping.
     */
    @LispMethod(comment = "FN-TERM is a (possibly nested) naut.  This function canonicalizes it,\r\npossibly reifying it and/or its subnats, from the inside out.\r\n\r\n@param CZE?;\r\n\t\tif true, performs additional canonicalization on FN-TERM,\r\n\t\te.g. reordering of commutative terms.  When called during canonicalization of\r\n\t\tan entire sentence, we can assume this has already been done, but when\r\n\t\tcanonicalizing a nat in isolation, we need to do the additional canonicalization.\r\n@param CREATE?\r\n\t\tbooleanp; if NIL, will not create new narts.\r\n@param ASSUME-ALL-REIFIABLE?\r\n\t\tbooleanp; if T, assumes all functions are reifiable.\r\n\t\tOnly allowed to be T during KB bootstrapping.\nFN-TERM is a (possibly nested) naut.  This function canonicalizes it,\npossibly reifying it and/or its subnats, from the inside out.")
    public static final SubLObject canonicalize_fn_term_int_alt(SubLObject fn_term, SubLObject czeP, SubLObject createP, SubLObject assume_all_reifiableP) {
        if (assume_all_reifiableP == UNPROVIDED) {
            assume_all_reifiableP = NIL;
        }
        if (NIL != assume_all_reifiableP) {
            core.ensure_bootstrapping_kb();
        }
        {
            SubLObject cdolist_list_var = Sort.sort(com.cyc.cycjava.cycl.czer_main.nested_fn_terms(fn_term), symbol_function($sym71$_), TERM_FUNCTIONAL_COMPLEXITY);
            SubLObject nested_fn_term = NIL;
            for (nested_fn_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nested_fn_term = cdolist_list_var.first()) {
                {
                    SubLObject v_new = com.cyc.cycjava.cycl.czer_main.canonicalize_fn_term_int(nested_fn_term, czeP, createP, assume_all_reifiableP);
                    if (!v_new.equal(nested_fn_term)) {
                        fn_term = subst(v_new, nested_fn_term, fn_term, symbol_function(EQUAL), UNPROVIDED);
                    }
                }
            }
        }
        if (NIL != czeP) {
            fn_term = com.cyc.cycjava.cycl.czer_main.canonicalize_naut(fn_term);
        }
        if ((NIL != assume_all_reifiableP) || (NIL != czer_utilities.reifiable_function_termP(fn_term, UNPROVIDED))) {
            {
                SubLObject fn_term_ununiquified = com.cyc.cycjava.cycl.czer_main.el_ununiquify_vars_int(fn_term, NIL, T);
                if (NIL != createP) {
                    return com.cyc.cycjava.cycl.czer_main.cyc_find_or_create_canonical_nart(fn_term_ununiquified);
                } else {
                    {
                        SubLObject nart = narts_high.nart_lookup(fn_term_ununiquified);
                        return NIL != nart ? ((SubLObject) (nart)) : fn_term;
                    }
                }
            }
        } else {
            return fn_term;
        }
    }

    @LispMethod(comment = "FN-TERM is a (possibly nested) naut.  This function canonicalizes it,\r\npossibly reifying it and/or its subnats, from the inside out.\r\n\r\n@param CZE?;\r\n\t\tif true, performs additional canonicalization on FN-TERM,\r\n\t\te.g. reordering of commutative terms.  When called during canonicalization of\r\n\t\tan entire sentence, we can assume this has already been done, but when\r\n\t\tcanonicalizing a nat in isolation, we need to do the additional canonicalization.\r\n@param CREATE?\r\n\t\tbooleanp; if NIL, will not create new narts.\r\n@param ASSUME-ALL-REIFIABLE?\r\n\t\tbooleanp; if T, assumes all functions are reifiable.\r\n\t\tOnly allowed to be T during KB bootstrapping.\nFN-TERM is a (possibly nested) naut.  This function canonicalizes it,\npossibly reifying it and/or its subnats, from the inside out.")
    public static SubLObject canonicalize_fn_term_int(SubLObject fn_term, final SubLObject czeP, final SubLObject createP, SubLObject assume_all_reifiableP) {
        if (assume_all_reifiableP == UNPROVIDED) {
            assume_all_reifiableP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(fn_term)) {
            return fn_term;
        }
        if (NIL != assume_all_reifiableP) {
            core.ensure_bootstrapping_kb();
        }
        SubLObject replaced_nested_fn_termP = NIL;
        SubLObject cdolist_list_var = Sort.sort(nested_fn_terms(fn_term), symbol_function($sym72$_), TERM_FUNCTIONAL_COMPLEXITY);
        SubLObject nested_fn_term = NIL;
        nested_fn_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_new = canonicalize_fn_term_int(nested_fn_term, czeP, createP, assume_all_reifiableP);
            if (!v_new.equal(nested_fn_term)) {
                replaced_nested_fn_termP = T;
                fn_term = subst(v_new, nested_fn_term, fn_term, symbol_function(EQUAL), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nested_fn_term = cdolist_list_var.first();
        } 
        if ((NIL != czeP) || (NIL != el_set_p(fn_term))) {
            fn_term = canonicalize_naut(fn_term);
        }
        if ((NIL != assume_all_reifiableP) || (NIL != czer_utilities.reifiable_function_termP(fn_term, UNPROVIDED))) {
            final SubLObject fn_term_ununiquified = el_ununiquify_vars_int(fn_term, NIL, T);
            if (NIL != createP) {
                final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding(thread);
                try {
                    czer_vars.$fi_last_assertions_asserted$.bind(NIL, thread);
                    return cyc_find_or_create_canonical_nart(fn_term_ununiquified);
                } finally {
                    czer_vars.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
                }
            }
            final SubLObject nart = narts_high.nart_lookup(fn_term_ununiquified);
            return NIL != nart ? nart : fn_term;
        }
        return fn_term;
    }/**
     * FN-TERM is a (possibly nested) naut.  This function canonicalizes it,
     * possibly reifying it and/or its subnats, from the inside out.
     *
     * @param CZE?;
     * 		if true, performs additional canonicalization on FN-TERM,
     * 		e.g. reordering of commutative terms.  When called during canonicalization of
     * 		an entire sentence, we can assume this has already been done, but when
     * 		canonicalizing a nat in isolation, we need to do the additional canonicalization.
     * @param CREATE?
     * 		booleanp; if NIL, will not create new narts.
     * @param ASSUME-ALL-REIFIABLE?
     * 		booleanp; if T, assumes all functions are reifiable.
     * 		Only allowed to be T during KB bootstrapping.
     */


    /**
     * Performs top-level canonicalization on NAUT, not including reification.
     * This includes e.g. commutativity.
     */
    @LispMethod(comment = "Performs top-level canonicalization on NAUT, not including reification.\r\nThis includes e.g. commutativity.\nPerforms top-level canonicalization on NAUT, not including reification.\nThis includes e.g. commutativity.")
    public static final SubLObject canonicalize_naut_alt(SubLObject naut) {
        return com.cyc.cycjava.cycl.czer_main.canonicalize_relation_commutative_terms(naut);
    }

    @LispMethod(comment = "Performs top-level canonicalization on NAUT, not including reification.\r\nThis includes e.g. commutativity.\nPerforms top-level canonicalization on NAUT, not including reification.\nThis includes e.g. commutativity.")
    public static SubLObject canonicalize_naut(final SubLObject naut) {
        return canonicalize_relation_commutative_terms(naut);
    }/**
     * Performs top-level canonicalization on NAUT, not including reification.
     * This includes e.g. commutativity.
     */


    public static final SubLObject cyc_find_or_create_canonical_nart_alt(SubLObject canonical_naut) {
        {
            SubLObject nart = narts_high.nart_lookup(canonical_naut);
            if (NIL == nart_handles.nart_p(nart)) {
                nart = com.cyc.cycjava.cycl.czer_main.cyc_create_nart(canonical_naut);
            }
            return nart;
        }
    }

    public static SubLObject cyc_find_or_create_canonical_nart(final SubLObject canonical_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nart = narts_high.nart_lookup(canonical_naut);
        if (NIL == nart_handles.valid_nartP(nart, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$within_canonicalizerP$.currentBinding(thread);
            try {
                wff_vars.$within_wffP$.bind(NIL, thread);
                czer_vars.$within_canonicalizerP$.bind(NIL, thread);
                if (NIL != nart_handles.nart_p(nart)) {
                    narts_high.cleanup_invalid_nart(canonical_naut);
                }
                nart = cyc_create_nart(canonical_naut);
            } finally {
                czer_vars.$within_canonicalizerP$.rebind(_prev_bind_2, thread);
                wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
            }
        }
        return nart;
    }

    public static SubLObject clear_nart_defining_rules_cached() {
        final SubLObject cs = $nart_defining_rules_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nart_defining_rules_cached(SubLObject bootstrapping_kbP) {
        if (bootstrapping_kbP == UNPROVIDED) {
            bootstrapping_kbP = $bootstrapping_kbP$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($nart_defining_rules_cached_caching_state$.getGlobalValue(), list(bootstrapping_kbP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nart_defining_rules_cached_internal(final SubLObject bootstrapping_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != bootstrapping_kbP) {
            return NIL;
        }
        SubLObject definitional_rules = NIL;
        SubLObject wff_rules = NIL;
        SubLObject fcp_rules = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind($$BaseKB, thread);
            SubLObject cdolist_list_var = $list79;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, $NEG, $FORWARD)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, $NEG, $FORWARD);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, $FORWARD);
                                SubLObject done_var_$59 = NIL;
                                final SubLObject token_var_$60 = NIL;
                                while (NIL == done_var_$59) {
                                    final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$60);
                                    final SubLObject valid_$61 = makeBoolean(!token_var_$60.eql(rule));
                                    if (NIL != valid_$61) {
                                        final SubLObject pos_lits = pragma_induction.rule_pos_lits(rule);
                                        SubLObject rule_addedP = NIL;
                                        if (NIL == rule_addedP) {
                                            SubLObject csome_list_var = reverse(sbhl_module_utilities.get_sbhl_predicates());
                                            SubLObject v_term = NIL;
                                            v_term = csome_list_var.first();
                                            while ((NIL == rule_addedP) && (NIL != csome_list_var)) {
                                                if (NIL != list_utilities.tree_find(v_term, pos_lits, UNPROVIDED, UNPROVIDED)) {
                                                    definitional_rules = cons(rule, definitional_rules);
                                                    rule_addedP = T;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                v_term = csome_list_var.first();
                                            } 
                                        }
                                        if (NIL == rule_addedP) {
                                            SubLObject csome_list_var = isa.all_instances_in_all_mts($$WFFConstraintPredicate);
                                            SubLObject v_term = NIL;
                                            v_term = csome_list_var.first();
                                            while ((NIL == rule_addedP) && (NIL != csome_list_var)) {
                                                if (NIL != list_utilities.tree_find(v_term, pos_lits, UNPROVIDED, UNPROVIDED)) {
                                                    wff_rules = cons(rule, wff_rules);
                                                    rule_addedP = T;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                v_term = csome_list_var.first();
                                            } 
                                        }
                                        if (NIL == list_utilities.tree_find_if(FORT_P, pos_lits, UNPROVIDED)) {
                                            fcp_rules = cons(rule, fcp_rules);
                                            rule_addedP = T;
                                        }
                                    }
                                    done_var_$59 = makeBoolean(NIL == valid_$61);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return append(definitional_rules, wff_rules, fcp_rules);
    }

    public static SubLObject nart_defining_rules_cached(SubLObject bootstrapping_kbP) {
        if (bootstrapping_kbP == UNPROVIDED) {
            bootstrapping_kbP = $bootstrapping_kbP$.getDynamicValue();
        }
        SubLObject caching_state = $nart_defining_rules_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NART_DEFINING_RULES_CACHED, $nart_defining_rules_cached_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, bootstrapping_kbP, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(nart_defining_rules_cached_internal(bootstrapping_kbP)));
            memoization_state.caching_state_put(caching_state, bootstrapping_kbP, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return nart-p; a nart with an HL formula of CANONICAL-NAUT.
    By side effect, asserts the nart's #$termOfUnit assertion and performs forward inference on it.
     */
    @LispMethod(comment = "@return nart-p; a nart with an HL formula of CANONICAL-NAUT.\r\nBy side effect, asserts the nart\'s #$termOfUnit assertion and performs forward inference on it.")
    public static final SubLObject cyc_create_nart_alt(SubLObject canonical_naut) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
                kb_control_vars.record_hl_transcript_operation(list(TL_FIND_OR_CREATE_NART, list_utilities.quotify(canonical_naut)));
            }
            {
                SubLObject nart = narts_interface.kb_create_nart(canonical_naut);
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $prefer_forward_skolemization$.currentBinding(thread);
                    try {
                        kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
                        $prefer_forward_skolemization$.bind(NIL, thread);
                        {
                            SubLObject environment = forward.get_forward_inference_environment();
                            SubLTrampolineFile.checkType(environment, QUEUE_P);
                            {
                                SubLObject _prev_bind_0_55 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                                SubLObject _prev_bind_1_56 = $current_forward_problem_store$.currentBinding(thread);
                                try {
                                    kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                                    $current_forward_problem_store$.bind(NIL, thread);
                                    try {
                                        cyc_kernel.cyc_assert_wff(make_binary_formula($$termOfUnit, nart, canonical_naut), mt_vars.$tou_mt$.getGlobalValue(), $list_alt76);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                forward.clear_current_forward_problem_store();
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_57, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $current_forward_problem_store$.rebind(_prev_bind_1_56, thread);
                                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_55, thread);
                                }
                            }
                        }
                    } finally {
                        $prefer_forward_skolemization$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return nart;
            }
        }
    }

    /**
     *
     *
     * @return nart-p; a nart with an HL formula of CANONICAL-NAUT.
    By side effect, asserts the nart's #$termOfUnit assertion and performs forward inference on it.
     */
    @LispMethod(comment = "@return nart-p; a nart with an HL formula of CANONICAL-NAUT.\r\nBy side effect, asserts the nart\'s #$termOfUnit assertion and performs forward inference on it.")
    public static SubLObject cyc_create_nart(final SubLObject canonical_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
            kb_control_vars.record_hl_transcript_operation(list(TL_FIND_OR_CREATE_NART, list_utilities.quotify(canonical_naut)));
        }
        final SubLObject nart = narts_interface.kb_create_nart(canonical_naut);
        final SubLObject tou_assertion = function_terms.term_of_unit_assertion(nart);
        final SubLObject nart_defining_rules = nart_defining_rules_cached(UNPROVIDED);
        if (((NIL == $czer_create_nart_uses_nart_defining_rules_methodP$.getDynamicValue(thread)) || (NIL == nart_defining_rules)) || (NIL == tou_assertion)) {
            cyc_kernel.cyc_assert_wff(make_binary_formula($$termOfUnit, nart, canonical_naut), mt_vars.$tou_mt$.getGlobalValue(), $list83);
        } else {
            assertions_interface.kb_create_asserted_argument(tou_assertion, $TRUE, $MONOTONIC);
            forward.forward_propagate_one_assertion_wrt_rules_and_queue_or_repropagate_assertibles(tou_assertion, nart_defining_rules, UNPROVIDED);
        }
        return nart;
    }

    /**
     * fn-term is a reifiable term denoted as a (possibly nested) function expression
     */
    @LispMethod(comment = "fn-term is a reifiable term denoted as a (possibly nested) function expression")
    public static final SubLObject new_canonicalize_fn_term_alt(SubLObject fn_term) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.czer_main.new_nested_fn_terms(fn_term);
            SubLObject nested_fn_term = NIL;
            for (nested_fn_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nested_fn_term = cdolist_list_var.first()) {
                if (NIL != term.function_termP(nested_fn_term)) {
                    {
                        SubLObject v_new = com.cyc.cycjava.cycl.czer_main.new_canonicalize_fn_term(nested_fn_term);
                        if (!v_new.equal(nested_fn_term)) {
                            fn_term = subst(v_new, nested_fn_term, fn_term, symbol_function(EQUAL), UNPROVIDED);
                        }
                    }
                }
            }
        }
        if (NIL != czer_utilities.reifiable_function_termP(fn_term, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.czer_main.cyc_find_or_create_nart(fn_term, UNPROVIDED);
        } else {
            return fn_term;
        }
    }

    @LispMethod(comment = "fn-term is a reifiable term denoted as a (possibly nested) function expression")
    public static SubLObject new_canonicalize_fn_term(SubLObject fn_term) {
        SubLObject cdolist_list_var = new_nested_fn_terms(fn_term);
        SubLObject nested_fn_term = NIL;
        nested_fn_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.function_termP(nested_fn_term)) {
                final SubLObject v_new = new_canonicalize_fn_term(nested_fn_term);
                if (!v_new.equal(nested_fn_term)) {
                    fn_term = subst(v_new, nested_fn_term, fn_term, symbol_function(EQUAL), UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            nested_fn_term = cdolist_list_var.first();
        } 
        if (NIL != czer_utilities.reifiable_function_termP(fn_term, UNPROVIDED)) {
            return cyc_find_or_create_nart(fn_term, UNPROVIDED);
        }
        return fn_term;
    }/**
     * fn-term is a reifiable term denoted as a (possibly nested) function expression
     */


    public static final SubLObject new_nested_fn_terms_alt(SubLObject fn_term) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = fn_term.rest();
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != term.function_termP(arg)) {
                    result = cons(arg, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject new_nested_fn_terms(final SubLObject fn_term) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = fn_term;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.function_termP(arg)) {
                result = cons(arg, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject nested_fn_terms_alt(SubLObject fn_term) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = fn_term.rest();
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != term.function_termP(arg)) {
                    result = cons(arg, result);
                }
            }
            return result;
        }
    }

    public static SubLObject nested_fn_terms(final SubLObject fn_term) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = fn_term;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.function_termP(arg)) {
                result = cons(arg, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject all_nested_fn_terms_alt(SubLObject fn_term) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = fn_term.rest();
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != term.function_termP(arg)) {
                    result = cons(arg, result);
                    {
                        SubLObject cdolist_list_var_58 = com.cyc.cycjava.cycl.czer_main.nested_fn_terms(arg);
                        SubLObject nested_fn_term = NIL;
                        for (nested_fn_term = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , nested_fn_term = cdolist_list_var_58.first()) {
                            result = cons(nested_fn_term, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject all_nested_fn_terms(final SubLObject fn_term) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = fn_term;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.function_termP(arg)) {
                result = cons(arg, result);
                SubLObject cdolist_list_var_$63 = nested_fn_terms(arg);
                SubLObject nested_fn_term = NIL;
                nested_fn_term = cdolist_list_var_$63.first();
                while (NIL != cdolist_list_var_$63) {
                    result = cons(nested_fn_term, result);
                    cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                    nested_fn_term = cdolist_list_var_$63.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject fort_sort_by_type_and_id_alt(SubLObject v_forts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.every_in_list(symbol_function(FORT_P), v_forts, UNPROVIDED)) {
                    Errors.error($str_alt77$SORT_BY_ID_called_on_list_contain);
                }
            }
            return Sort.sort(copy_list(v_forts), symbol_function($sym78$FORT_TYPE_AND_ID__), UNPROVIDED);
        }
    }

    public static SubLObject fort_sort_by_type_and_id(final SubLObject v_forts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(symbol_function(FORT_P), v_forts, UNPROVIDED))) {
            Errors.error($str86$SORT_BY_ID_called_on_list_contain);
        }
        return Sort.sort(copy_list(v_forts), symbol_function($sym87$FORT_TYPE_AND_ID__), UNPROVIDED);
    }

    public static final SubLObject fort_type_and_id_L_alt(SubLObject fort_1, SubLObject fort_2) {
        if ((NIL != constant_p(fort_1)) && (NIL != constant_p(fort_2))) {
            return com.cyc.cycjava.cycl.czer_main.canonicalizer_constant_L(fort_1, fort_2);
        } else {
            if ((NIL != nart_handles.nart_p(fort_1)) && (NIL != nart_handles.nart_p(fort_2))) {
                return numL(nart_handles.nart_id(fort_1), nart_handles.nart_id(fort_2));
            } else {
                return constant_p(fort_1);
            }
        }
    }

    public static SubLObject fort_type_and_id_L(final SubLObject fort_1, final SubLObject fort_2) {
        if ((NIL != constant_p(fort_1)) && (NIL != constant_p(fort_2))) {
            return canonicalizer_constant_L(fort_1, fort_2);
        }
        if ((NIL != nart_handles.nart_p(fort_1)) && (NIL != nart_handles.nart_p(fort_2))) {
            return numL(nart_handles.nart_id(fort_1), nart_handles.nart_id(fort_2));
        }
        return constant_p(fort_1);
    }

    /**
     *
     *
     * @return list; the terms to reify in CLAUSE that are quantified into;
    i.e. have free variables within them.
     */
    @LispMethod(comment = "@return list; the terms to reify in CLAUSE that are quantified into;\r\ni.e. have free variables within them.")
    public static final SubLObject clause_quantified_fn_terms_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$gathering_quantified_fn_termsP$.currentBinding(thread);
                    try {
                        czer_vars.$gathering_quantified_fn_termsP$.bind(T, thread);
                        result = union(com.cyc.cycjava.cycl.czer_main.literals_quantified_fn_terms(clauses.neg_lits(clause)), com.cyc.cycjava.cycl.czer_main.literals_quantified_fn_terms(clauses.pos_lits(clause)), symbol_function(EQUAL), UNPROVIDED);
                    } finally {
                        czer_vars.$gathering_quantified_fn_termsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return list; the terms to reify in CLAUSE that are quantified into;
    i.e. have free variables within them.
     */
    @LispMethod(comment = "@return list; the terms to reify in CLAUSE that are quantified into;\r\ni.e. have free variables within them.")
    public static SubLObject clause_quantified_fn_terms(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$gathering_quantified_fn_termsP$.currentBinding(thread);
        try {
            czer_vars.$gathering_quantified_fn_termsP$.bind(T, thread);
            result = union(literals_quantified_fn_terms(clauses.neg_lits(clause)), literals_quantified_fn_terms(clauses.pos_lits(clause)), symbol_function(EQUAL), UNPROVIDED);
        } finally {
            czer_vars.$gathering_quantified_fn_termsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return list; the terms to reify in LITERAL that are quantified into;
    i.e. have free variables within them.
     */
    @LispMethod(comment = "@return list; the terms to reify in LITERAL that are quantified into;\r\ni.e. have free variables within them.")
    public static final SubLObject literals_quantified_fn_terms_alt(SubLObject literals) {
        return list_utilities.mapappend(symbol_function(LITERAL_QUANTIFIED_FN_TERMS), literals);
    }

    /**
     *
     *
     * @return list; the terms to reify in LITERAL that are quantified into;
    i.e. have free variables within them.
     */
    @LispMethod(comment = "@return list; the terms to reify in LITERAL that are quantified into;\r\ni.e. have free variables within them.")
    public static SubLObject literals_quantified_fn_terms(final SubLObject literals) {
        return list_utilities.mapappend(symbol_function(LITERAL_QUANTIFIED_FN_TERMS), literals);
    }

    /**
     *
     *
     * @return list; the terms to reify in LITERAL that are quantified into;
    i.e. have free variables within them.
     */
    @LispMethod(comment = "@return list; the terms to reify in LITERAL that are quantified into;\r\ni.e. have free variables within them.")
    public static final SubLObject literal_quantified_fn_terms_alt(SubLObject literal) {
        return delete_if(symbol_function($sym80$NO_FREE_VARIABLES_), com.cyc.cycjava.cycl.czer_main.literal_terms_to_reify(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list; the terms to reify in LITERAL that are quantified into;
    i.e. have free variables within them.
     */
    @LispMethod(comment = "@return list; the terms to reify in LITERAL that are quantified into;\r\ni.e. have free variables within them.")
    public static SubLObject literal_quantified_fn_terms(final SubLObject literal) {
        return delete_if(symbol_function($sym89$NO_FREE_VARIABLES_), literal_terms_to_reify(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clause_terms_to_reify_alt(SubLObject clause) {
        return nunion(list_utilities.mapunion(symbol_function(LITERAL_TERMS_TO_REIFY), clauses.neg_lits(clause), symbol_function(EQUAL)), list_utilities.mapunion(symbol_function(LITERAL_TERMS_TO_REIFY), clauses.pos_lits(clause), symbol_function(EQUAL)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject clause_terms_to_reify(final SubLObject clause) {
        return nunion(list_utilities.mapunion(symbol_function(LITERAL_TERMS_TO_REIFY), clauses.neg_lits(clause), symbol_function(EQUAL)), list_utilities.mapunion(symbol_function(LITERAL_TERMS_TO_REIFY), clauses.pos_lits(clause), symbol_function(EQUAL)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject literal_terms_to_reify_alt(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject result = com.cyc.cycjava.cycl.czer_main.relation_terms_to_reify(literal, mt);
            if (NIL != com.cyc.cycjava.cycl.czer_main.reify_termP(literal, mt)) {
                {
                    SubLObject item_var = literal;
                    if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject literal_terms_to_reify(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject result = relation_terms_to_reify(literal, mt);
        if ((NIL != reify_termP(literal, mt)) && (NIL == member(literal, result, symbol_function(EQUAL), symbol_function(IDENTITY)))) {
            result = cons(literal, result);
        }
        return result;
    }

    public static final SubLObject function_terms_to_reify_alt(SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.relation_terms_to_reify(nat, mt);
    }

    public static SubLObject function_terms_to_reify(final SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return relation_terms_to_reify(nat, mt);
    }

    public static final SubLObject relation_terms_to_reify_alt(SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != el_formula_p(relation)) && (NIL == com.cyc.cycjava.cycl.czer_main.guaranteed_nothing_to_reifyP(relation))) && (NIL != el_relation_expressionP(relation))) {
                {
                    SubLObject result = NIL;
                    SubLObject pos = ZERO_INTEGER;
                    SubLObject reln = cycl_utilities.formula_arg0(relation);
                    if (!((NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) && reln.eql($$evaluate))) {
                        {
                            SubLObject cdolist_list_var = cycl_utilities.formula_terms(relation, UNPROVIDED);
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                {
                                    SubLObject arg_isa_pred = (NIL != fort_p(reln)) ? ((SubLObject) (kb_accessors.arg_isa_pred(pos, reln, mt))) : NIL;
                                    {
                                        SubLObject _prev_bind_0 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                                        try {
                                            wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) || (NIL != at_utilities.reln_permits_generic_arg_variablesP(reln, arg_isa_pred))), thread);
                                            wff_vars.$permit_keyword_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) || (NIL != at_utilities.reln_permits_keyword_variablesP(reln, arg_isa_pred))), thread);
                                            if (NIL != com.cyc.cycjava.cycl.czer_main.reify_argP(v_term, reln, pos, mt)) {
                                                result = cons(v_term, result);
                                            }
                                            if ((NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) && (NIL != scoping_relation_expressionP(v_term))) {
                                            } else {
                                                if ((NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) && (NIL != czer_utilities.evaluatable_function_termP(v_term, mt))) {
                                                } else {
                                                    if (NIL != com.cyc.cycjava.cycl.czer_main.dont_reify_arg_or_subtermsP(v_term, reln, pos, mt)) {
                                                    } else {
                                                        if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                                            result = list_utilities.ordered_union(result, com.cyc.cycjava.cycl.czer_main.relation_terms_to_reify(v_term, mt), symbol_function(EQUAL), UNPROVIDED);
                                                        } else {
                                                            if (NIL != term.sentenceP(v_term, UNPROVIDED)) {
                                                                result = list_utilities.ordered_union(result, com.cyc.cycjava.cycl.czer_main.relation_terms_to_reify(v_term, mt), symbol_function(EQUAL), UNPROVIDED);
                                                            } else {
                                                                if (NIL != literalP(v_term)) {
                                                                    result = list_utilities.ordered_union(result, com.cyc.cycjava.cycl.czer_main.literal_terms_to_reify(v_term, mt), symbol_function(EQUAL), UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_1, thread);
                                            wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                pos = add(pos, ONE_INTEGER);
                            }
                        }
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject relation_terms_to_reify(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != el_formula_p(relation)) && (NIL == guaranteed_nothing_to_reifyP(relation))) && (NIL != el_relation_expressionP(relation))) {
            SubLObject result = NIL;
            SubLObject pos = ZERO_INTEGER;
            final SubLObject reln = cycl_utilities.formula_arg0(relation);
            if ((NIL == czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) || (!reln.eql($$evaluate))) {
                SubLObject cdolist_list_var = cycl_utilities.formula_terms(relation, UNPROVIDED);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject arg_isa_pred = (NIL != forts.fort_p(reln)) ? kb_accessors.arg_isa_pred(pos, reln, mt) : NIL;
                    final SubLObject _prev_bind_0 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                    try {
                        wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) || (NIL != at_utilities.reln_permits_generic_arg_variablesP(reln, arg_isa_pred))), thread);
                        wff_vars.$permit_keyword_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) || (NIL != at_utilities.reln_permits_keyword_variablesP(reln, arg_isa_pred))), thread);
                        if (NIL != reify_argP(v_term, reln, pos, mt)) {
                            result = cons(v_term, result);
                        }
                        if ((NIL == czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) || (NIL == scoping_relation_expressionP(v_term))) {
                            if ((NIL == czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) || (NIL == czer_utilities.evaluatable_function_termP(v_term, mt))) {
                                if (NIL == dont_reify_arg_or_subtermsP(v_term, reln, pos, mt)) {
                                    if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                        result = list_utilities.ordered_union(result, relation_terms_to_reify(v_term, mt), symbol_function(EQUAL), UNPROVIDED);
                                    } else
                                        if (NIL != term.sentenceP(v_term, UNPROVIDED)) {
                                            result = list_utilities.ordered_union(result, relation_terms_to_reify(v_term, mt), symbol_function(EQUAL), UNPROVIDED);
                                        } else
                                            if (NIL != literalP(v_term)) {
                                                result = list_utilities.ordered_union(result, literal_terms_to_reify(v_term, mt), symbol_function(EQUAL), UNPROVIDED);
                                            }


                                }
                            }
                        }
                    } finally {
                        wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_2, thread);
                        wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_0, thread);
                    }
                    pos = add(pos, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            }
            return result;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA is guaranteed to contain nothing reifiable.
    A quick necessary test to avoid unnecessary work.
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA is guaranteed to contain nothing reifiable.\r\nA quick necessary test to avoid unnecessary work.")
    public static final SubLObject guaranteed_nothing_to_reifyP_alt(SubLObject formula) {
        return makeBoolean(NIL == contains_subformula_p(formula));
    }

    /**
     *
     *
     * @return boolean; t iff FORMULA is guaranteed to contain nothing reifiable.
    A quick necessary test to avoid unnecessary work.
     */
    @LispMethod(comment = "@return boolean; t iff FORMULA is guaranteed to contain nothing reifiable.\r\nA quick necessary test to avoid unnecessary work.")
    public static SubLObject guaranteed_nothing_to_reifyP(final SubLObject formula) {
        return makeBoolean((NIL != cycl_grammar.fast_cycl_quoted_term_p(formula)) || (NIL == contains_subformula_p(formula)));
    }

    /**
     *
     *
     * @param PRED
     * 		the arg0 of TERM.
     */
    @LispMethod(comment = "@param PRED\r\n\t\tthe arg0 of TERM.")
    public static final SubLObject reify_argP_alt(SubLObject v_term, SubLObject pred, SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_term.isAtom()) {
            return NIL;
        } else {
            if (NIL != arg_types_prescribe_unreifiedP(pred, pos)) {
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.czer_main.dont_reify_arg_or_subtermsP(v_term, pred, pos, mt)) {
                    return NIL;
                } else {
                    return com.cyc.cycjava.cycl.czer_main.reify_termP(v_term, mt);
                }
            }
        }
    }

    /**
     *
     *
     * @param PRED
     * 		the arg0 of TERM.
     */
    @LispMethod(comment = "@param PRED\r\n\t\tthe arg0 of TERM.")
    public static SubLObject reify_argP(final SubLObject v_term, final SubLObject pred, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (v_term.isAtom()) {
            return NIL;
        }
        if (NIL != arg_types_prescribe_unreifiedP(pred, pos)) {
            return NIL;
        }
        if (NIL != dont_reify_arg_or_subtermsP(v_term, pred, pos, mt)) {
            return NIL;
        }
        return reify_termP(v_term, mt);
    }

    /**
     *
     *
     * @return boolean; t iff TERM and all of its subterms should NOT be reified.
     */
    @LispMethod(comment = "@return boolean; t iff TERM and all of its subterms should NOT be reified.")
    public static final SubLObject dont_reify_arg_or_subtermsP_alt(SubLObject v_term, SubLObject pred, SubLObject pos, SubLObject mt) {
        if (pred == $$ExpandSubLFn) {
            return T;
        } else {
            if (pred == $$SubLQuoteFn) {
                return T;
            } else {
                if (NIL != czer_utilities.leave_some_terms_at_el_for_argP(pred, pos, mt)) {
                    return T;
                } else {
                    if (((NIL == groundP(v_term, UNPROVIDED)) && (NIL != czer_utilities.leave_variables_at_el_for_argP(pred, pos, mt))) && (NIL == closedP(v_term, UNPROVIDED))) {
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff TERM and all of its subterms should NOT be reified.
     */
    @LispMethod(comment = "@return boolean; t iff TERM and all of its subterms should NOT be reified.")
    public static SubLObject dont_reify_arg_or_subtermsP(final SubLObject v_term, final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        if (pred.eql($$ExpandSubLFn)) {
            return T;
        }
        if (pred.eql($$SubLQuoteFn)) {
            return T;
        }
        if (NIL != czer_utilities.leave_some_terms_at_el_for_argP(pred, pos, mt)) {
            return T;
        }
        if (((NIL == groundP(v_term, UNPROVIDED)) && (NIL != czer_utilities.leave_variables_at_el_for_argP(pred, pos, mt))) && (NIL == closedP(v_term, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject reify_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_term.isAtom()) {
                return NIL;
            } else {
                if (NIL != term.unreified_skolem_termP(v_term)) {
                    return czer_vars.$reify_skolemsP$.getDynamicValue(thread);
                } else {
                    if ((NIL != term.hl_ground_nautP(v_term)) && (NIL != narts_high.find_nart(v_term))) {
                        return T;
                    } else {
                        if (NIL != czer_utilities.reifiable_function_termP(v_term, mt)) {
                            if (NIL != kb_control_vars.within_forward_inferenceP()) {
                                return com.cyc.cycjava.cycl.czer_main.forward_inference_reifiable_function_termP(v_term, mt);
                            } else {
                                return T;
                            }
                        } else {
                            if (NIL != czer_utilities.evaluatable_function_termP(v_term, mt)) {
                                return T;
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject reify_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_term.isAtom()) {
            return NIL;
        }
        if (NIL != term.unreified_skolem_termP(v_term)) {
            return czer_vars.$reify_skolemsP$.getDynamicValue(thread);
        }
        if (NIL != czer_utilities.reifiable_function_termP(v_term, mt)) {
            if (NIL != kb_control_vars.within_forward_inferenceP()) {
                return forward_inference_reifiable_function_termP(v_term, mt);
            }
            return T;
        } else {
            if (NIL != czer_utilities.evaluatable_function_termP(v_term, mt)) {
                return T;
            }
            return NIL;
        }
    }

    public static final SubLObject forward_inference_reifiable_function_termP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.czer_main.forward_inference_reifiable_functionP(cycl_utilities.nat_functor(v_term), mt);
    }

    public static SubLObject forward_inference_reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return forward_inference_reifiable_functionP(cycl_utilities.nat_functor(v_term), mt);
    }

    public static final SubLObject forward_inference_reifiable_functionP_alt(SubLObject function, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule = forward.current_forward_inference_rule();
                return makeBoolean(((NIL != $prefer_forward_skolemization$.getDynamicValue(thread)) || (NIL != kb_accessors.skolemize_forwardP(function, mt))) || ((NIL != rule) && (NIL != kb_accessors.forward_reification_ruleP(function, rule, UNPROVIDED))));
            }
        }
    }

    public static SubLObject forward_inference_reifiable_functionP(final SubLObject function, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = forward.current_forward_inference_rule();
        return makeBoolean(((NIL != $prefer_forward_skolemization$.getDynamicValue(thread)) || (NIL != kb_accessors.skolemize_forwardP(function, mt))) || ((NIL != rule) && (NIL != kb_accessors.forward_reification_ruleP(function, rule, mt))));
    }

    public static final SubLObject subst_canon_fn_in_clauses_alt(SubLObject new_fn, SubLObject old_fn, SubLObject v_clauses) {
        if (new_fn.equal(old_fn)) {
            return v_clauses;
        } else {
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = v_clauses;
                SubLObject clause = NIL;
                for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                    result = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_clause(new_fn, old_fn, clause), result);
                }
                return nreverse(result);
            }
        }
    }

    public static SubLObject subst_canon_fn_in_clauses(final SubLObject new_fn, final SubLObject old_fn, final SubLObject v_clauses) {
        if (new_fn.equal(old_fn)) {
            return v_clauses;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(subst_canon_fn_in_clause(new_fn, old_fn, clause), result);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject subst_canon_fn_in_clause_alt(SubLObject new_fn, SubLObject old_fn, SubLObject clause) {
        {
            SubLObject result_pos = NIL;
            SubLObject result_neg = NIL;
            {
                SubLObject cdolist_list_var = clauses.pos_lits(clause);
                SubLObject lit = NIL;
                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                    result_pos = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_literal(new_fn, old_fn, lit), result_pos);
                }
            }
            {
                SubLObject cdolist_list_var = clauses.neg_lits(clause);
                SubLObject lit = NIL;
                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                    result_neg = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_literal(new_fn, old_fn, lit), result_neg);
                }
            }
            return list(nreverse(result_neg), nreverse(result_pos));
        }
    }

    public static SubLObject subst_canon_fn_in_clause(final SubLObject new_fn, final SubLObject old_fn, final SubLObject clause) {
        SubLObject result_pos = NIL;
        SubLObject result_neg = NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_pos = cons(subst_canon_fn_in_literal(new_fn, old_fn, lit), result_pos);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.neg_lits(clause);
        lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_neg = cons(subst_canon_fn_in_literal(new_fn, old_fn, lit), result_neg);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return list(nreverse(result_neg), nreverse(result_pos));
    }

    public static final SubLObject subst_canon_fn_in_relation_alt(SubLObject new_fn, SubLObject old_fn, SubLObject relation, SubLObject replace_entire_relationP) {
        if (replace_entire_relationP == UNPROVIDED) {
            replace_entire_relationP = NIL;
        }
        if ((NIL != replace_entire_relationP) && relation.equal(old_fn)) {
            return new_fn;
        } else {
            {
                SubLObject reln = cycl_utilities.formula_arg0(relation);
                SubLObject sequence_var = sequence_var(relation, UNPROVIDED);
                SubLObject pos = ZERO_INTEGER;
                SubLObject result = NIL;
                SubLObject cdolist_list_var = cycl_utilities.formula_terms(relation, UNPROVIDED);
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != subl_escape_p(relation)) {
                    } else {
                        if ((NIL != sequence_var) && v_term.equal(sequence_var)) {
                        } else {
                            if (v_term.equal(old_fn) && (NIL != com.cyc.cycjava.cycl.czer_main.reify_argP(v_term, reln, pos, UNPROVIDED))) {
                                result = cons(new_fn, result);
                            } else {
                                if (NIL != literalP(v_term)) {
                                    result = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_literal(new_fn, old_fn, v_term), result);
                                } else {
                                    if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                        result = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_nat(new_fn, old_fn, v_term), result);
                                    } else {
                                        if ((NIL != term.sentenceP(v_term, UNPROVIDED)) && (NIL != el_relation_expressionP(v_term))) {
                                            result = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_relation(new_fn, old_fn, v_term, UNPROVIDED), result);
                                        } else {
                                            result = cons(v_term, result);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    pos = add(pos, ONE_INTEGER);
                }
                result = nreverse(result);
                if (NIL != sequence_var) {
                    result = nadd_sequence_var_to_end(sequence_var, result);
                }
                return result;
            }
        }
    }

    public static SubLObject subst_canon_fn_in_relation(final SubLObject new_fn, final SubLObject old_fn, final SubLObject relation, SubLObject replace_entire_relationP) {
        if (replace_entire_relationP == UNPROVIDED) {
            replace_entire_relationP = NIL;
        }
        if ((NIL != replace_entire_relationP) && relation.equal(old_fn)) {
            return new_fn;
        }
        final SubLObject reln = cycl_utilities.formula_arg0(relation);
        final SubLObject sequence_var = sequence_var(relation, UNPROVIDED);
        SubLObject pos = ZERO_INTEGER;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_terms(relation, UNPROVIDED);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_escape_p(relation)) {
                if ((NIL == sequence_var) || (!v_term.equal(sequence_var))) {
                    if (v_term.equal(old_fn) && (NIL != reify_argP(v_term, reln, pos, UNPROVIDED))) {
                        result = cons(new_fn, result);
                    } else
                        if (NIL != literalP(v_term)) {
                            result = cons(subst_canon_fn_in_literal(new_fn, old_fn, v_term), result);
                        } else
                            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                result = cons(subst_canon_fn_in_nat(new_fn, old_fn, v_term), result);
                            } else
                                if ((NIL != term.sentenceP(v_term, UNPROVIDED)) && (NIL != el_relation_expressionP(v_term))) {
                                    result = cons(subst_canon_fn_in_relation(new_fn, old_fn, v_term, UNPROVIDED), result);
                                } else {
                                    result = cons(v_term, result);
                                }



                }
            }
            pos = add(pos, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        result = nreverse(result);
        if (NIL != sequence_var) {
            result = nadd_sequence_var_to_end(sequence_var, result);
        }
        return result;
    }

    public static final SubLObject subst_canon_fn_in_literal_alt(SubLObject new_fn, SubLObject old_fn, SubLObject literal) {
        return com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_relation(new_fn, old_fn, literal, UNPROVIDED);
    }

    public static SubLObject subst_canon_fn_in_literal(final SubLObject new_fn, final SubLObject old_fn, final SubLObject literal) {
        return subst_canon_fn_in_relation(new_fn, old_fn, literal, UNPROVIDED);
    }

    public static final SubLObject subst_canon_fn_in_nat_alt(SubLObject new_fn, SubLObject old_fn, SubLObject nat) {
        {
            SubLObject functor = cycl_utilities.nat_functor(nat);
            SubLObject sequence_var = sequence_var(nat, UNPROVIDED);
            SubLObject pos = ZERO_INTEGER;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_terms(nat, UNPROVIDED);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if ((NIL != sequence_var) && v_term.equal(sequence_var)) {
                } else {
                    if (v_term.equal(old_fn) && (NIL != com.cyc.cycjava.cycl.czer_main.reify_argP(v_term, functor, pos, UNPROVIDED))) {
                        result = cons(new_fn, result);
                    } else {
                        if (NIL != literalP(v_term)) {
                            result = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_literal(new_fn, old_fn, v_term), result);
                        } else {
                            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                                result = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_nat(new_fn, old_fn, v_term), result);
                            } else {
                                if ((NIL != term.sentenceP(v_term, UNPROVIDED)) && (NIL != el_relation_expressionP(v_term))) {
                                    result = cons(com.cyc.cycjava.cycl.czer_main.subst_canon_fn_in_relation(new_fn, old_fn, v_term, UNPROVIDED), result);
                                } else {
                                    result = cons(v_term, result);
                                }
                            }
                        }
                    }
                }
                pos = add(pos, ONE_INTEGER);
            }
            result = nreverse(result);
            if (NIL != sequence_var) {
                result = nadd_sequence_var_to_end(sequence_var, result);
            }
            return result;
        }
    }

    public static SubLObject subst_canon_fn_in_nat(final SubLObject new_fn, final SubLObject old_fn, final SubLObject nat) {
        final SubLObject functor = cycl_utilities.nat_functor(nat);
        final SubLObject sequence_var = sequence_var(nat, UNPROVIDED);
        SubLObject pos = ZERO_INTEGER;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_terms(nat, UNPROVIDED);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == sequence_var) || (!v_term.equal(sequence_var))) {
                if (v_term.equal(old_fn) && (NIL != reify_argP(v_term, functor, pos, UNPROVIDED))) {
                    result = cons(new_fn, result);
                } else
                    if (NIL != literalP(v_term)) {
                        result = cons(subst_canon_fn_in_literal(new_fn, old_fn, v_term), result);
                    } else
                        if (NIL != term.nautP(v_term, UNPROVIDED)) {
                            result = cons(subst_canon_fn_in_nat(new_fn, old_fn, v_term), result);
                        } else
                            if ((NIL != term.sentenceP(v_term, UNPROVIDED)) && (NIL != el_relation_expressionP(v_term))) {
                                result = cons(subst_canon_fn_in_relation(new_fn, old_fn, v_term, UNPROVIDED), result);
                            } else {
                                result = cons(v_term, result);
                            }



            }
            pos = add(pos, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        result = nreverse(result);
        if (NIL != sequence_var) {
            result = nadd_sequence_var_to_end(sequence_var, result);
        }
        return result;
    }

    /**
     *
     *
     * @unknown this is destructive
     */
    @LispMethod(comment = "@unknown this is destructive")
    public static final SubLObject canonicalize_clauses_transformable_nats_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$canonicalize_functionsP$.getDynamicValue(thread)) {
                return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS), v_clauses);
            } else {
                return v_clauses;
            }
        }
    }

    /**
     *
     *
     * @unknown this is destructive
     */
    @LispMethod(comment = "@unknown this is destructive")
    public static SubLObject canonicalize_clauses_transformable_nats(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$canonicalize_functionsP$.getDynamicValue(thread)) {
            return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS), v_clauses);
        }
        return v_clauses;
    }

    /**
     * replace references in <clause>
     * . to reifiable nats with their reifications
     * . to evaluatable nats with their evaluations
     */
    @LispMethod(comment = "replace references in <clause>\r\n. to reifiable nats with their reifications\r\n. to evaluatable nats with their evaluations\nreplace references in <clause>\n. to reifiable nats with their reifications\n. to evaluatable nats with their evaluations")
    public static final SubLObject canonicalize_clause_transformable_nats_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject termXnats = com.cyc.cycjava.cycl.czer_main.nat_atoms(clause);
                if (NIL != termXnats) {
                    {
                        SubLObject neg_lits = clauses.neg_lits(clause);
                        SubLObject pos_lits = clauses.pos_lits(clause);
                        SubLObject result = NIL;
                        {
                            SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                            try {
                                at_vars.$appraising_disjunctP$.bind(makeBoolean((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || ((NIL != neg_lits) && (NIL != pos_lits))), thread);
                                czer_vars.$standardize_variables_memory$.bind(com.cyc.cycjava.cycl.czer_main.dwim_svm_wrt_scoping(czer_vars.$standardize_variables_memory$.getDynamicValue(thread), neg_lits, pos_lits), thread);
                                result = clauses.make_cnf(com.cyc.cycjava.cycl.czer_main.canonicalize_literals_transformable_nats(termXnats, neg_lits), com.cyc.cycjava.cycl.czer_main.canonicalize_literals_transformable_nats(termXnats, pos_lits));
                            } finally {
                                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                                at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return result;
                    }
                } else {
                    return clause;
                }
            }
        }
    }

    @LispMethod(comment = "replace references in <clause>\r\n. to reifiable nats with their reifications\r\n. to evaluatable nats with their evaluations\nreplace references in <clause>\n. to reifiable nats with their reifications\n. to evaluatable nats with their evaluations")
    public static SubLObject canonicalize_clause_transformable_nats(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject termXnats = nat_atoms(clause);
        if (NIL != termXnats) {
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
            try {
                at_vars.$appraising_disjunctP$.bind(makeBoolean((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || ((NIL != neg_lits) && (NIL != pos_lits))), thread);
                czer_vars.$standardize_variables_memory$.bind(dwim_svm_wrt_scoping(czer_vars.$standardize_variables_memory$.getDynamicValue(thread), neg_lits, pos_lits), thread);
                result = clauses.make_cnf(canonicalize_literals_transformable_nats(termXnats, neg_lits), canonicalize_literals_transformable_nats(termXnats, pos_lits));
            } finally {
                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
                at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return clause;
    }/**
     * replace references in <clause>
     * . to reifiable nats with their reifications
     * . to evaluatable nats with their evaluations
     */


    public static final SubLObject nat_atoms_alt(SubLObject clause) {
        {
            SubLObject termXnats = NIL;
            SubLObject cdolist_list_var = (NIL != within_queryP()) ? ((SubLObject) (clauses.pos_lits(clause))) : clauses.neg_lits(clause);
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.czer_main.nat_transforming_litP(lit)) {
                    termXnats = cons(literal_args(lit, UNPROVIDED), termXnats);
                }
            }
            return nreverse(termXnats);
        }
    }

    public static SubLObject nat_atoms(final SubLObject clause) {
        SubLObject termXnats = NIL;
        SubLObject cdolist_list_var = (NIL != within_queryP()) ? clauses.pos_lits(clause) : clauses.neg_lits(clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nat_transforming_litP(lit)) {
                termXnats = cons(literal_args(lit, UNPROVIDED), termXnats);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nreverse(termXnats);
    }

    /**
     * replace references in <literals>
     * . to reifiable nats with their reifications
     * . to evaluatable nats with their evaluations
     */
    @LispMethod(comment = "replace references in <literals>\r\n. to reifiable nats with their reifications\r\n. to evaluatable nats with their evaluations\nreplace references in <literals>\n. to reifiable nats with their reifications\n. to evaluatable nats with their evaluations")
    public static final SubLObject canonicalize_literals_transformable_nats_alt(SubLObject termXnats, SubLObject literals) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
                    try {
                        at_vars.$appraising_disjunctP$.bind(makeBoolean((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL == list_utilities.singletonP(literals))), thread);
                        {
                            SubLObject cdolist_list_var = reverse(literals);
                            SubLObject literal = NIL;
                            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                {
                                    SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
                                    SubLObject termXnats_undone = NIL;
                                    SubLObject termXnat = NIL;
                                    for (termXnats_undone = termXnats, termXnat = termXnats_undone.first(); NIL != termXnat; termXnats_undone = termXnats_undone.rest() , termXnat = termXnats_undone.first()) {
                                        {
                                            SubLObject datum = termXnat;
                                            SubLObject current = datum;
                                            SubLObject v_term = NIL;
                                            SubLObject nat = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt86);
                                            v_term = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt86);
                                            nat = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (!((NIL != com.cyc.cycjava.cycl.czer_main.nat_transforming_litP(literal)) && (arg1.eql(v_term) || (NIL != subl_promotions.memberP(arg1, termXnats_undone, EQL, CAR))))) {
                                                    {
                                                        SubLObject new_literal = subst(v_term, nat, literal, symbol_function(EQUAL_WRT_SVM), UNPROVIDED);
                                                        if (NIL != czer_utilities.canon_varP(new_literal)) {
                                                            new_literal = czer_utilities.encapsulate_formula(new_literal, UNPROVIDED);
                                                        }
                                                        if (((NIL != wff.el_wff_syntaxP(new_literal, UNPROVIDED)) && (NIL != wff.semantically_wf_literalP(new_literal, UNPROVIDED))) && (NIL == com.cyc.cycjava.cycl.czer_main.nat_transforming_litP(new_literal))) {
                                                            termXnats_undone = subst(v_term, nat, termXnats_undone, symbol_function(EQUAL), UNPROVIDED);
                                                            literal = new_literal;
                                                            {
                                                                SubLObject cdolist_list_var_59 = result;
                                                                SubLObject result_lit = NIL;
                                                                for (result_lit = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , result_lit = cdolist_list_var_59.first()) {
                                                                    if (NIL != com.cyc.cycjava.cycl.czer_main.nat_transforming_litP(result_lit)) {
                                                                        nsubst(v_term, nat, literal_arg2(result_lit, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt86);
                                            }
                                        }
                                    }
                                }
                                result = cons(literal, result);
                            }
                        }
                    } finally {
                        at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "replace references in <literals>\r\n. to reifiable nats with their reifications\r\n. to evaluatable nats with their evaluations\nreplace references in <literals>\n. to reifiable nats with their reifications\n. to evaluatable nats with their evaluations")
    public static SubLObject canonicalize_literals_transformable_nats(final SubLObject termXnats, final SubLObject literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
        try {
            at_vars.$appraising_disjunctP$.bind(makeBoolean((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL == list_utilities.singletonP(literals))), thread);
            SubLObject cdolist_list_var = reverse(literals);
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
                SubLObject termXnats_undone;
                SubLObject termXnat;
                SubLObject current;
                SubLObject datum;
                SubLObject v_term;
                SubLObject nat;
                SubLObject new_literal;
                SubLObject cdolist_list_var_$64;
                SubLObject result_lit;
                for (termXnats_undone = NIL, termXnat = NIL, termXnats_undone = termXnats, termXnat = termXnats_undone.first(); NIL != termXnat; termXnat = termXnats_undone.first()) {
                    datum = current = termXnat;
                    v_term = NIL;
                    nat = NIL;
                    destructuring_bind_must_consp(current, datum, $list95);
                    v_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list95);
                    nat = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL == nat_transforming_litP(literal)) || ((!arg1.eql(v_term)) && (NIL == subl_promotions.memberP(arg1, termXnats_undone, EQL, CAR)))) {
                            new_literal = subst(v_term, nat, literal, symbol_function(EQUAL_WRT_SVM), UNPROVIDED);
                            if (NIL != czer_utilities.canon_varP(new_literal)) {
                                new_literal = czer_utilities.encapsulate_formula(new_literal, UNPROVIDED);
                            }
                            if ((((NIL != wff.el_wff_syntaxP(new_literal, UNPROVIDED)) && (NIL != wff.semantically_wf_literalP(new_literal, UNPROVIDED))) && (NIL == destructive_nat_transforming_litP(new_literal, literals))) && ((NIL != list_utilities.dotted_list_p(literal)) || (NIL == list_utilities.dotted_list_p(new_literal)))) {
                                termXnats_undone = subst(v_term, nat, termXnats_undone, symbol_function(EQUAL), UNPROVIDED);
                                literal = new_literal;
                                cdolist_list_var_$64 = result;
                                result_lit = NIL;
                                result_lit = cdolist_list_var_$64.first();
                                while (NIL != cdolist_list_var_$64) {
                                    if (NIL != nat_transforming_litP(result_lit)) {
                                        nsubst(v_term, nat, literal_arg2(result_lit, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                    }
                                    cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                                    result_lit = cdolist_list_var_$64.first();
                                } 
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list95);
                    }
                    termXnats_undone = termXnats_undone.rest();
                }
                result = cons(literal, result);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * replace references in <literals>
     * . to reifiable nats with their reifications
     * . to evaluatable nats with their evaluations
     */


    /**
     *
     *
     * @return booleanp; whether LITERAL is a literal used by the canonicalizer to transform a reifiable or evaluatable nat,
    such as a #$termOfUnit or #$evaluate literal.
     */
    @LispMethod(comment = "@return booleanp; whether LITERAL is a literal used by the canonicalizer to transform a reifiable or evaluatable nat,\r\nsuch as a #$termOfUnit or #$evaluate literal.")
    public static final SubLObject nat_transforming_litP_alt(SubLObject literal) {
        return makeBoolean((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp; whether LITERAL is a literal used by the canonicalizer to transform a reifiable or evaluatable nat,
    such as a #$termOfUnit or #$evaluate literal.
     */
    @LispMethod(comment = "@return booleanp; whether LITERAL is a literal used by the canonicalizer to transform a reifiable or evaluatable nat,\r\nsuch as a #$termOfUnit or #$evaluate literal.")
    public static SubLObject nat_transforming_litP(final SubLObject literal) {
        return makeBoolean((NIL != tou_litP(literal)) || (NIL != evaluate_litP(literal, UNPROVIDED)));
    }

    public static SubLObject possibly_nat_transforming_litP(final SubLObject literal) {
        return cycl_utilities.atomic_sentence_with_any_of_preds_p(literal, $list97);
    }

    public static SubLObject destructive_nat_transforming_litP(final SubLObject test_literal, final SubLObject literals) {
        if (NIL != cycl_utilities.atomic_sentence_with_any_of_preds_p(test_literal, $list97)) {
            SubLObject test_literal_copy = copy_list(test_literal);
            SubLObject cdolist_list_var = literals;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_utilities.atomic_sentence_with_any_of_preds_p(literal, $list97)) {
                    test_literal_copy = list_utilities.find_and_nreplace(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), test_literal_copy, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            } 
            if (literal_arg1(test_literal_copy, UNPROVIDED).equal(literal_arg2(test_literal_copy, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    /**
     * Pulls non-scoped variables out of the SVM.
     * Fixes bug 22788: scoped EL variables in #$expansion leads to HL variable capture.
     */
    @LispMethod(comment = "Pulls non-scoped variables out of the SVM.\r\nFixes bug 22788: scoped EL variables in #$expansion leads to HL variable capture.\nPulls non-scoped variables out of the SVM.\nFixes bug 22788: scoped EL variables in #$expansion leads to HL variable capture.")
    public static final SubLObject dwim_svm_wrt_scoping_alt(SubLObject svm, SubLObject neg_lits, SubLObject pos_lits) {
        {
            SubLObject dwimmed_svm = NIL;
            SubLObject cdolist_list_var = svm;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject old_var = NIL;
                    SubLObject new_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    old_var = current.first();
                    current = current.rest();
                    new_var = current;
                    {
                        SubLObject scopedP = NIL;
                        if (NIL == scopedP) {
                            {
                                SubLObject csome_list_var = neg_lits;
                                SubLObject literal = NIL;
                                for (literal = csome_list_var.first(); !((NIL != scopedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , literal = csome_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.czer_main.var_is_scoped_in_literalP(new_var, literal)) {
                                        scopedP = T;
                                    }
                                }
                            }
                        }
                        if (NIL == scopedP) {
                            {
                                SubLObject csome_list_var = pos_lits;
                                SubLObject literal = NIL;
                                for (literal = csome_list_var.first(); !((NIL != scopedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , literal = csome_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.czer_main.var_is_scoped_in_literalP(new_var, literal)) {
                                        scopedP = T;
                                    }
                                }
                            }
                        }
                        if (NIL != scopedP) {
                            dwimmed_svm = cons(pair, dwimmed_svm);
                        }
                    }
                }
            }
            return nreverse(dwimmed_svm);
        }
    }

    @LispMethod(comment = "Pulls non-scoped variables out of the SVM.\r\nFixes bug 22788: scoped EL variables in #$expansion leads to HL variable capture.\nPulls non-scoped variables out of the SVM.\nFixes bug 22788: scoped EL variables in #$expansion leads to HL variable capture.")
    public static SubLObject dwim_svm_wrt_scoping(final SubLObject svm, final SubLObject neg_lits, final SubLObject pos_lits) {
        SubLObject dwimmed_svm = NIL;
        SubLObject cdolist_list_var = svm;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject old_var = NIL;
            SubLObject new_var = NIL;
            destructuring_bind_must_consp(current, datum, $list98);
            old_var = current.first();
            current = new_var = current.rest();
            SubLObject scopedP = NIL;
            if (NIL == scopedP) {
                SubLObject csome_list_var = neg_lits;
                SubLObject literal = NIL;
                literal = csome_list_var.first();
                while ((NIL == scopedP) && (NIL != csome_list_var)) {
                    if (NIL != var_is_scoped_in_literalP(new_var, literal)) {
                        scopedP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    literal = csome_list_var.first();
                } 
            }
            if (NIL == scopedP) {
                SubLObject csome_list_var = pos_lits;
                SubLObject literal = NIL;
                literal = csome_list_var.first();
                while ((NIL == scopedP) && (NIL != csome_list_var)) {
                    if (NIL != var_is_scoped_in_literalP(new_var, literal)) {
                        scopedP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    literal = csome_list_var.first();
                } 
            }
            if (NIL != scopedP) {
                dwimmed_svm = cons(pair, dwimmed_svm);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return nreverse(dwimmed_svm);
    }/**
     * Pulls non-scoped variables out of the SVM.
     * Fixes bug 22788: scoped EL variables in #$expansion leads to HL variable capture.
     */


    /**
     *
     *
     * @return booleanp; t iff VAR appears as a scoped argument in LITERAL
     */
    @LispMethod(comment = "@return booleanp; t iff VAR appears as a scoped argument in LITERAL")
    public static final SubLObject var_is_scoped_in_literalP_alt(SubLObject var, SubLObject literal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resultP = NIL;
                {
                    SubLObject _prev_bind_0 = $var_is_scoped_in_formula_var$.currentBinding(thread);
                    try {
                        $var_is_scoped_in_formula_var$.bind(var, thread);
                        resultP = list_utilities.sublisp_boolean(cycl_utilities.expression_find_if($sym89$VAR_IS_SCOPED_IN_FORMULA_, literal, NIL, UNPROVIDED));
                    } finally {
                        $var_is_scoped_in_formula_var$.rebind(_prev_bind_0, thread);
                    }
                }
                return resultP;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; t iff VAR appears as a scoped argument in LITERAL
     */
    @LispMethod(comment = "@return booleanp; t iff VAR appears as a scoped argument in LITERAL")
    public static SubLObject var_is_scoped_in_literalP(final SubLObject var, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        final SubLObject _prev_bind_0 = $var_is_scoped_in_formula_var$.currentBinding(thread);
        try {
            $var_is_scoped_in_formula_var$.bind(var, thread);
            resultP = list_utilities.sublisp_boolean(cycl_utilities.expression_find_if($sym99$VAR_IS_SCOPED_IN_FORMULA_, literal, NIL, UNPROVIDED));
        } finally {
            $var_is_scoped_in_formula_var$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }

    public static final SubLObject var_is_scoped_in_formulaP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_formula_p(v_object)) {
                {
                    SubLObject formula = v_object;
                    if (NIL != cycl_grammar.el_var_list_operator_p(cycl_utilities.formula_operator(formula))) {
                        if (NIL != subl_promotions.memberP($var_is_scoped_in_formula_var$.getDynamicValue(thread), cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                            return T;
                        }
                    }
                    {
                        SubLObject argnum = formula_position($var_is_scoped_in_formula_var$.getDynamicValue(thread), formula, UNPROVIDED);
                        return kb_accessors.scoping_argP(cycl_utilities.formula_operator(formula), argnum, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject var_is_scoped_in_formulaP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_p(v_object)) {
            return NIL;
        }
        if ((NIL != cycl_grammar.el_var_list_operator_p(cycl_utilities.formula_operator(v_object))) && (NIL != subl_promotions.memberP($var_is_scoped_in_formula_var$.getDynamicValue(thread), cycl_utilities.formula_arg1(v_object, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        final SubLObject argnum = formula_position($var_is_scoped_in_formula_var$.getDynamicValue(thread), v_object, UNPROVIDED);
        return kb_accessors.scoping_argP(cycl_utilities.formula_operator(v_object), argnum, UNPROVIDED);
    }

    /**
     * For each clause in CLAUSES, sorts its literals into a canonical order.
     * Also canonicalizes disjunctions as enumerations.
     * (Does not change the order of the clauses, because that would be pointless.
     * It's not like the canonicalizer is going to impose a canonical order on the assertions in the KB.)
     */
    @LispMethod(comment = "For each clause in CLAUSES, sorts its literals into a canonical order.\r\nAlso canonicalizes disjunctions as enumerations.\r\n(Does not change the order of the clauses, because that would be pointless.\r\nIt\'s not like the canonicalizer is going to impose a canonical order on the assertions in the KB.)\nFor each clause in CLAUSES, sorts its literals into a canonical order.\nAlso canonicalizes disjunctions as enumerations.\n(Does not change the order of the clauses, because that would be pointless.\nIt\'s not like the canonicalizer is going to impose a canonical order on the assertions in the KB.)")
    public static final SubLObject canonicalize_clauses_literals_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$canonicalize_literalsP$.getDynamicValue(thread)) {
                {
                    SubLObject sorted_clauses = com.cyc.cycjava.cycl.czer_main.sort_clauses_literals(v_clauses);
                    if (NIL != czer_vars.$canonicalize_disjunction_as_enumerationP$.getDynamicValue(thread)) {
                        return com.cyc.cycjava.cycl.czer_main.canonicalize_disjunctions_as_enumerations(sorted_clauses);
                    } else {
                        return sorted_clauses;
                    }
                }
            } else {
                return v_clauses;
            }
        }
    }

    @LispMethod(comment = "For each clause in CLAUSES, sorts its literals into a canonical order.\r\nAlso canonicalizes disjunctions as enumerations.\r\n(Does not change the order of the clauses, because that would be pointless.\r\nIt\'s not like the canonicalizer is going to impose a canonical order on the assertions in the KB.)\nFor each clause in CLAUSES, sorts its literals into a canonical order.\nAlso canonicalizes disjunctions as enumerations.\n(Does not change the order of the clauses, because that would be pointless.\nIt\'s not like the canonicalizer is going to impose a canonical order on the assertions in the KB.)")
    public static SubLObject canonicalize_clauses_literals(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$canonicalize_literalsP$.getDynamicValue(thread)) {
            return v_clauses;
        }
        final SubLObject sorted_clauses = sort_clauses_literals(v_clauses);
        if (NIL != czer_vars.$canonicalize_disjunction_as_enumerationP$.getDynamicValue(thread)) {
            return canonicalize_disjunctions_as_enumerations(sorted_clauses);
        }
        return sorted_clauses;
    }/**
     * For each clause in CLAUSES, sorts its literals into a canonical order.
     * Also canonicalizes disjunctions as enumerations.
     * (Does not change the order of the clauses, because that would be pointless.
     * It's not like the canonicalizer is going to impose a canonical order on the assertions in the KB.)
     */


    /**
     * This will need to actually work someday. -eca
     */
    @LispMethod(comment = "This will need to actually work someday. -eca")
    public static final SubLObject sort_clauses_alt(SubLObject v_clauses) {
        return Sort.sort(com.cyc.cycjava.cycl.czer_main.sort_clauses_literals(copy_clauses(v_clauses)), symbol_function($sym90$CLAUSES_IN_ORDER_), UNPROVIDED);
    }

    @LispMethod(comment = "This will need to actually work someday. -eca")
    public static SubLObject sort_clauses(final SubLObject v_clauses) {
        return Sort.sort(sort_clauses_literals(copy_clauses(v_clauses)), symbol_function($sym100$CLAUSES_IN_ORDER_), UNPROVIDED);
    }/**
     * This will need to actually work someday. -eca
     */


    public static final SubLObject clauses_in_orderP_alt(SubLObject clause_1, SubLObject clause_2) {
        if (length(clause_1).numL(length(clause_2))) {
            return T;
        } else {
            return Strings.string_lessp(string_utilities.str(clause_1), string_utilities.str(clause_2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject clauses_in_orderP(final SubLObject clause_1, final SubLObject clause_2) {
        if (length(clause_1).numL(length(clause_2))) {
            return T;
        }
        return Strings.string_lessp(string_utilities.str(clause_1), string_utilities.str(clause_2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sort_clauses_literals_alt(SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(SORT_CLAUSE_LITERALS), v_clauses);
    }

    public static SubLObject sort_clauses_literals(final SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(SORT_CLAUSE_LITERALS), v_clauses);
    }

    /**
     * Sorts the literals in CLAUSE into a canonical order.
     */
    @LispMethod(comment = "Sorts the literals in CLAUSE into a canonical order.")
    public static final SubLObject sort_clause_literals_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.czer_main.sort_clause_literals_destructive(copy_clause(clause), varP);
    }

    @LispMethod(comment = "Sorts the literals in CLAUSE into a canonical order.")
    public static SubLObject sort_clause_literals(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        return sort_clause_literals_destructive(copy_clause(clause), varP);
    }/**
     * Sorts the literals in CLAUSE into a canonical order.
     */


    public static final SubLObject canonicalize_skolem_clause_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
                try {
                    czer_vars.$canonicalize_functionsP$.bind(NIL, thread);
                    clause = list_utilities.only_one(com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_terms(list(clause)));
                } finally {
                    czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_0, thread);
                }
            }
            return com.cyc.cycjava.cycl.czer_main.sort_clause_literals(clause, varP);
        }
    }

    public static SubLObject canonicalize_skolem_clause(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
        try {
            czer_vars.$canonicalize_functionsP$.bind(NIL, thread);
            clause = list_utilities.only_one(canonicalize_clauses_terms(list(clause)));
        } finally {
            czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_0, thread);
        }
        return sort_clause_literals(clause, varP);
    }

    /**
     * A destructive version of @xref sort-clause-literals.
     */
    @LispMethod(comment = "A destructive version of @xref sort-clause-literals.")
    public static final SubLObject sort_clause_literals_destructive_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$varP$.currentBinding(thread);
                    try {
                        czer_vars.$varP$.bind(varP, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject neg_lits = clause_utilities.unmake_clause(clause);
                            SubLObject pos_lits = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = cconcatenate(list_utilities.nmapcar(symbol_function(NEGATE_ATOMIC), neg_lits), pos_lits);
                            result = com.cyc.cycjava.cycl.czer_main.sort_literals(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            result = com.cyc.cycjava.cycl.czer_main.evaluate_lits_at_rear(result);
                            result = com.cyc.cycjava.cycl.czer_main.tou_lits_at_rear(result);
                            result = clausifier.npackage_cnf_clause(result);
                        }
                    } finally {
                        czer_vars.$varP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "A destructive version of @xref sort-clause-literals.")
    public static SubLObject sort_clause_literals_destructive(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$varP$.currentBinding(thread);
        try {
            czer_vars.$varP$.bind(varP, thread);
            thread.resetMultipleValues();
            final SubLObject neg_lits = clause_utilities.unmake_clause(clause);
            final SubLObject pos_lits = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = cconcatenate(list_utilities.nmapcar(symbol_function(NEGATE_ATOMIC), neg_lits), pos_lits);
            result = sort_literals(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = evaluate_lits_at_rear(result);
            result = tou_lits_at_rear(result);
            result = clausifier.npackage_cnf_clause(result);
        } finally {
            czer_vars.$varP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * A destructive version of @xref sort-clause-literals.
     */


    /**
     * puts termOfUnit literals at rear (for cosmetic sake; otherwise, order is unchanged)
     */
    @LispMethod(comment = "puts termOfUnit literals at rear (for cosmetic sake; otherwise, order is unchanged)")
    public static final SubLObject tou_lits_at_rear_alt(SubLObject literals) {
        {
            SubLObject front = NIL;
            SubLObject back = NIL;
            SubLObject cdolist_list_var = literals;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                if ((NIL != el_negation_p(lit)) && (NIL != tou_litP(second(lit)))) {
                    back = cons(lit, back);
                } else {
                    front = cons(lit, front);
                }
            }
            return nconc(nreverse(front), nreverse(back));
        }
    }

    @LispMethod(comment = "puts termOfUnit literals at rear (for cosmetic sake; otherwise, order is unchanged)")
    public static SubLObject tou_lits_at_rear(final SubLObject literals) {
        SubLObject front = NIL;
        SubLObject back = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != el_negation_p(lit)) && (NIL != tou_litP(second(lit)))) {
                back = cons(lit, back);
            } else {
                front = cons(lit, front);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nconc(nreverse(front), nreverse(back));
    }/**
     * puts termOfUnit literals at rear (for cosmetic sake; otherwise, order is unchanged)
     */


    /**
     * puts evaluate literals at rear (for cosmetic sake; otherwise, order is unchanged)
     */
    @LispMethod(comment = "puts evaluate literals at rear (for cosmetic sake; otherwise, order is unchanged)")
    public static final SubLObject evaluate_lits_at_rear_alt(SubLObject literals) {
        {
            SubLObject front = NIL;
            SubLObject back = NIL;
            SubLObject cdolist_list_var = literals;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                if ((NIL != el_negation_p(lit)) && (NIL != evaluate_litP(second(lit), UNPROVIDED))) {
                    back = cons(lit, back);
                } else {
                    front = cons(lit, front);
                }
            }
            return nconc(nreverse(front), nreverse(back));
        }
    }

    @LispMethod(comment = "puts evaluate literals at rear (for cosmetic sake; otherwise, order is unchanged)")
    public static SubLObject evaluate_lits_at_rear(final SubLObject literals) {
        SubLObject front = NIL;
        SubLObject back = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != el_negation_p(lit)) && (NIL != evaluate_litP(second(lit), UNPROVIDED))) {
                back = cons(lit, back);
            } else {
                front = cons(lit, front);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nconc(nreverse(front), nreverse(back));
    }/**
     * puts evaluate literals at rear (for cosmetic sake; otherwise, order is unchanged)
     */


    public static final SubLObject sort_literals_alt(SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        if (already_sorted_literals == UNPROVIDED) {
            already_sorted_literals = NIL;
        }
        if (originals == UNPROVIDED) {
            originals = literals;
        }
        if (NIL == literals) {
        } else {
            if (NIL != list_utilities.singletonP(literals)) {
                return literals;
            } else {
                {
                    SubLObject next_literal = com.cyc.cycjava.cycl.czer_main.pick_a_lit(literals, bound_vars, connected_vars, already_sorted_literals, originals);
                    return cons(next_literal, com.cyc.cycjava.cycl.czer_main.sort_literals(remove(next_literal, literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), com.cyc.cycjava.cycl.czer_main.new_bound_vars(next_literal, bound_vars), com.cyc.cycjava.cycl.czer_main.new_connected_vars(next_literal, bound_vars), cons(next_literal, already_sorted_literals), originals));
                }
            }
        }
        return NIL;
    }

    public static SubLObject sort_literals(final SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        if (already_sorted_literals == UNPROVIDED) {
            already_sorted_literals = NIL;
        }
        if (originals == UNPROVIDED) {
            originals = literals;
        }
        if (NIL == literals) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        }
        final SubLObject next_literal = pick_a_lit(literals, bound_vars, connected_vars, already_sorted_literals, originals);
        return cons(next_literal, sort_literals(remove(next_literal, literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new_bound_vars(next_literal, bound_vars), new_connected_vars(next_literal, bound_vars), cons(next_literal, already_sorted_literals), originals));
    }

    /**
     * Returns the first literal in LITERALS with respect to the canonical ordering.
     */
    @LispMethod(comment = "Returns the first literal in LITERALS with respect to the canonical ordering.")
    public static final SubLObject pick_a_lit_alt(SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        if (already_sorted_literals == UNPROVIDED) {
            already_sorted_literals = NIL;
        }
        if (originals == UNPROVIDED) {
            originals = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                SubLObject verboseP = NIL;
                results = com.cyc.cycjava.cycl.czer_main.most_constrained_literals(literals, bound_vars, UNPROVIDED);
                if (NIL != list_utilities.singletonP(results)) {
                    if (NIL != verboseP) {
                        Errors.warn($str_alt93$most_constrained_literals_succeed);
                    }
                    return results.first();
                }
                results = com.cyc.cycjava.cycl.czer_main.fewest_arg_literals(results);
                if (NIL != list_utilities.singletonP(results)) {
                    if (NIL != verboseP) {
                        Errors.warn($str_alt94$fewest_arg_literals_succeeded_);
                    }
                    return results.first();
                }
                results = com.cyc.cycjava.cycl.czer_main.left_weighted_literals(results);
                if (NIL != list_utilities.singletonP(results)) {
                    if (NIL != verboseP) {
                        Errors.warn($str_alt95$left_weighted_literals_succeeded_);
                    }
                    return results.first();
                }
                results = com.cyc.cycjava.cycl.czer_main.left_connected_literals(results, connected_vars);
                if (NIL != list_utilities.singletonP(results)) {
                    if (NIL != verboseP) {
                        Errors.warn($str_alt96$left_connected_literals_succeeded);
                    }
                    return results.first();
                }
                results = com.cyc.cycjava.cycl.czer_main.left_rooted_literals(results, originals);
                if (NIL != list_utilities.singletonP(results)) {
                    if (NIL != verboseP) {
                        Errors.warn($str_alt97$left_rooted_literals_succeeded_);
                    }
                    return results.first();
                }
                results = com.cyc.cycjava.cycl.czer_main.least_complex_literals(results, UNPROVIDED);
                if (NIL != list_utilities.singletonP(results)) {
                    if (NIL != verboseP) {
                        Errors.warn($str_alt98$least_complex_literals_succeeded_);
                    }
                    return results.first();
                }
                if (NIL != czer_vars.$new_canonicalizerP$.getDynamicValue(thread)) {
                    results = czer_graph.penultimate_resort_literals(results);
                    if (NIL != list_utilities.singletonP(results)) {
                        if (NIL != verboseP) {
                            Errors.warn($str_alt99$penultimate_resort_literals_1_suc);
                        }
                        return results.first();
                    }
                    results = czer_graph.penultimate_resort_literals(literals);
                    if (NIL != list_utilities.singletonP(results)) {
                        if (NIL != verboseP) {
                            Errors.warn($str_alt100$penultimate_resort_literals_2_suc);
                        }
                        return results.first();
                    }
                    return czer_graph.last_resort_literal(results, already_sorted_literals);
                } else {
                    return com.cyc.cycjava.cycl.czer_main.old_last_resort_literal(results, literals, UNPROVIDED);
                }
            }
        }
    }

    @LispMethod(comment = "Returns the first literal in LITERALS with respect to the canonical ordering.")
    public static SubLObject pick_a_lit(final SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        if (already_sorted_literals == UNPROVIDED) {
            already_sorted_literals = NIL;
        }
        if (originals == UNPROVIDED) {
            originals = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject verboseP = NIL;
        results = most_constrained_literals(literals, bound_vars, UNPROVIDED);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str103$most_constrained_literals_succeed);
            }
            return results.first();
        }
        results = fewest_arg_literals(results);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str104$fewest_arg_literals_succeeded_);
            }
            return results.first();
        }
        results = left_weighted_literals(results);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str105$left_weighted_literals_succeeded_);
            }
            return results.first();
        }
        results = left_connected_literals(results, connected_vars);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str106$left_connected_literals_succeeded);
            }
            return results.first();
        }
        results = left_rooted_literals(results, originals);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str107$left_rooted_literals_succeeded_);
            }
            return results.first();
        }
        results = least_complex_literals(results, UNPROVIDED);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str108$least_complex_literals_succeeded_);
            }
            return results.first();
        }
        if (NIL == czer_vars.$new_canonicalizerP$.getDynamicValue(thread)) {
            return old_last_resort_literal(results, literals, UNPROVIDED);
        }
        results = czer_graph.penultimate_resort_literals(results);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str109$penultimate_resort_literals_1_suc);
            }
            return results.first();
        }
        results = czer_graph.penultimate_resort_literals(literals);
        if (NIL != list_utilities.singletonP(results)) {
            if (NIL != verboseP) {
                Errors.warn($str110$penultimate_resort_literals_2_suc);
            }
            return results.first();
        }
        return czer_graph.last_resort_literal(results, already_sorted_literals);
    }/**
     * Returns the first literal in LITERALS with respect to the canonical ordering.
     */


    public static final SubLObject new_bound_vars_alt(SubLObject literal, SubLObject bound_vars) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        {
            SubLObject vars = list_utilities.ordered_set_difference(literal_variables(literal, UNPROVIDED, UNPROVIDED), bound_vars, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != list_utilities.singletonP(vars)) {
                return append(bound_vars, vars);
            } else {
                return bound_vars;
            }
        }
    }

    public static SubLObject new_bound_vars(final SubLObject literal, SubLObject bound_vars) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        final SubLObject vars = list_utilities.ordered_set_difference(literal_variables(literal, UNPROVIDED, UNPROVIDED), bound_vars, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != list_utilities.singletonP(vars)) {
            return append(bound_vars, vars);
        }
        return bound_vars;
    }

    public static final SubLObject new_connected_vars_alt(SubLObject literal, SubLObject connected_vars) {
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        return nconc(list_utilities.ordered_set_difference(literal_variables(literal, UNPROVIDED, UNPROVIDED), connected_vars, symbol_function(EQUAL), UNPROVIDED), connected_vars);
    }

    public static SubLObject new_connected_vars(final SubLObject literal, SubLObject connected_vars) {
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        return nconc(list_utilities.ordered_set_difference(literal_variables(literal, UNPROVIDED, UNPROVIDED), connected_vars, symbol_function(EQUAL), UNPROVIDED), connected_vars);
    }

    public static final SubLObject unbound_vars_alt(SubLObject vars, SubLObject bound_vars) {
        {
            SubLObject unbound = list_utilities.ordered_set_difference(vars, bound_vars, symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                if (NIL != term.unreified_skolem_termP(var)) {
                    {
                        SubLObject unboundP = NIL;
                        if (NIL == unboundP) {
                            {
                                SubLObject csome_list_var = second(var);
                                SubLObject free_var = NIL;
                                for (free_var = csome_list_var.first(); !((NIL != unboundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , free_var = csome_list_var.first()) {
                                    if (NIL == subl_promotions.memberP(free_var, bound_vars, UNPROVIDED, UNPROVIDED)) {
                                        unboundP = T;
                                    }
                                }
                            }
                        }
                        if (NIL == unboundP) {
                            unbound = remove(var, unbound, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return unbound;
        }
    }

    public static SubLObject unbound_vars(final SubLObject vars, final SubLObject bound_vars) {
        SubLObject unbound = list_utilities.ordered_set_difference(vars, bound_vars, symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.unreified_skolem_termP(var)) {
                SubLObject unboundP = NIL;
                if (NIL == unboundP) {
                    SubLObject csome_list_var = second(var);
                    SubLObject free_var = NIL;
                    free_var = csome_list_var.first();
                    while ((NIL == unboundP) && (NIL != csome_list_var)) {
                        if (NIL == subl_promotions.memberP(free_var, bound_vars, UNPROVIDED, UNPROVIDED)) {
                            unboundP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        free_var = csome_list_var.first();
                    } 
                }
                if (NIL == unboundP) {
                    unbound = remove(var, unbound, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return unbound;
    }

    public static final SubLObject most_constrained_literals_alt(SubLObject literals, SubLObject bound_vars, SubLObject varP) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        {
            SubLObject ans = list(literals.first());
            SubLObject min = com.cyc.cycjava.cycl.czer_main.unbound_vars_score(literal_variables(ans.first(), varP, UNPROVIDED), bound_vars);
            SubLObject score = NIL;
            SubLObject cdolist_list_var = literals.rest();
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                score = com.cyc.cycjava.cycl.czer_main.unbound_vars_score(literal_variables(literal, varP, UNPROVIDED), bound_vars);
                if (score.numE(min)) {
                    ans = cons(literal, ans);
                } else {
                    if (score.numL(min)) {
                        min = score;
                        ans = list(literal);
                    }
                }
            }
            return reverse(ans);
        }
    }

    public static SubLObject most_constrained_literals(final SubLObject literals, SubLObject bound_vars, SubLObject varP) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        SubLObject ans = list(literals.first());
        SubLObject min = unbound_vars_score(literal_variables(ans.first(), varP, UNPROVIDED), bound_vars);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = unbound_vars_score(literal_variables(literal, varP, UNPROVIDED), bound_vars);
            if (score.numE(min)) {
                ans = cons(literal, ans);
            } else
                if (score.numL(min)) {
                    min = score;
                    ans = list(literal);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static final SubLObject unbound_vars_score_alt(SubLObject vars, SubLObject bound_vars) {
        return length(com.cyc.cycjava.cycl.czer_main.unbound_vars(vars, bound_vars));
    }

    public static SubLObject unbound_vars_score(final SubLObject vars, final SubLObject bound_vars) {
        return length(unbound_vars(vars, bound_vars));
    }

    public static final SubLObject temp_unbound_vars_score_alt(SubLObject vars, SubLObject bound_vars) {
        return add(length(com.cyc.cycjava.cycl.czer_main.unbound_vars(vars, bound_vars)), multiply($float$0_1, length(intersection(vars, bound_vars, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject temp_unbound_vars_score(final SubLObject vars, final SubLObject bound_vars) {
        return add(length(unbound_vars(vars, bound_vars)), multiply($float$0_1, length(intersection(vars, bound_vars, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject fewest_arg_literals_alt(SubLObject literals) {
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        } else {
            {
                SubLObject ans = list(literals.first());
                SubLObject min = literal_arity(ans.first(), UNPROVIDED);
                SubLObject score = NIL;
                SubLObject cdolist_list_var = literals.rest();
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    score = literal_arity(literal, UNPROVIDED);
                    if (score.numE(min)) {
                        ans = cons(literal, ans);
                    } else {
                        if (score.numL(min)) {
                            min = score;
                            ans = list(literal);
                        }
                    }
                }
                return reverse(ans);
            }
        }
    }

    public static SubLObject fewest_arg_literals(final SubLObject literals) {
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        }
        SubLObject ans = list(literals.first());
        SubLObject min = literal_arity(ans.first(), UNPROVIDED);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = literal_arity(literal, UNPROVIDED);
            if (score.numE(min)) {
                ans = cons(literal, ans);
            } else
                if (score.numL(min)) {
                    min = score;
                    ans = list(literal);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static final SubLObject left_weighted_literals_alt(SubLObject literals) {
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        } else {
            {
                SubLObject ans = list(literals.first());
                SubLObject max = com.cyc.cycjava.cycl.czer_main.left_weighted_score(literal_args(literals.first(), UNPROVIDED), UNPROVIDED);
                SubLObject score = NIL;
                SubLObject cdolist_list_var = literals.rest();
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    score = com.cyc.cycjava.cycl.czer_main.left_weighted_score(literal_args(literal, UNPROVIDED), UNPROVIDED);
                    if (score.numE(max)) {
                        ans = cons(literal, ans);
                    } else {
                        if (score.numG(max)) {
                            max = score;
                            ans = list(literal);
                        }
                    }
                }
                return reverse(ans);
            }
        }
    }

    public static SubLObject left_weighted_literals(final SubLObject literals) {
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        }
        SubLObject ans = list(literals.first());
        SubLObject max = left_weighted_score(literal_args(literals.first(), UNPROVIDED), UNPROVIDED);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = left_weighted_score(literal_args(literal, UNPROVIDED), UNPROVIDED);
            if (score.numE(max)) {
                ans = cons(literal, ans);
            } else
                if (score.numG(max)) {
                    max = score;
                    ans = list(literal);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static final SubLObject left_weighted_score_alt(SubLObject symbols, SubLObject symbol) {
        if (symbol == UNPROVIDED) {
            symbol = symbols.first();
        }
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject length = length(symbols);
            SubLObject weights = list_utilities.first_n(length, com.cyc.cycjava.cycl.czer_main.n_left_weighted_score_weights(length, TEN_INTEGER));
            SubLObject n = NIL;
            for (n = ZERO_INTEGER; n.numL(length); n = add(n, ONE_INTEGER)) {
                if (symbol.equal(nth(n, symbols))) {
                    score = add(score, nth(subtract(length, n, ONE_INTEGER), weights));
                }
            }
            return score;
        }
    }

    public static SubLObject left_weighted_score(final SubLObject symbols, SubLObject symbol) {
        if (symbol == UNPROVIDED) {
            symbol = symbols.first();
        }
        SubLObject score = ZERO_INTEGER;
        final SubLObject length = length(symbols);
        final SubLObject weights = list_utilities.first_n(length, n_left_weighted_score_weights(length, TEN_INTEGER));
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(length); n = add(n, ONE_INTEGER)) {
            if (symbol.equal(nth(n, symbols))) {
                score = add(score, nth(subtract(length, n, ONE_INTEGER), weights));
            }
        }
        return score;
    }

    public static final SubLObject n_left_weighted_score_weights_alt(SubLObject n, SubLObject multiplier) {
        if (multiplier == UNPROVIDED) {
            multiplier = TEN_INTEGER;
        }
        {
            SubLObject weights = NIL;
            SubLObject weight = ONE_INTEGER;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                weights = cons(weight, weights);
                weight = multiply(weight, multiplier);
            }
            return nreverse(weights);
        }
    }

    public static SubLObject n_left_weighted_score_weights(final SubLObject n, SubLObject multiplier) {
        if (multiplier == UNPROVIDED) {
            multiplier = TEN_INTEGER;
        }
        SubLObject weights = NIL;
        SubLObject weight = ONE_INTEGER;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            weights = cons(weight, weights);
            weight = multiply(weight, multiplier);
        }
        return nreverse(weights);
    }

    public static final SubLObject left_connected_literals_alt(SubLObject literals, SubLObject connected_vars) {
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        } else {
            {
                SubLObject ans = list(literals.first());
                SubLObject max = com.cyc.cycjava.cycl.czer_main.left_connected_score(literal_args(literals.first(), UNPROVIDED), connected_vars);
                SubLObject score = NIL;
                SubLObject cdolist_list_var = literals.rest();
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    score = com.cyc.cycjava.cycl.czer_main.left_connected_score(literal_args(literal, UNPROVIDED), connected_vars);
                    if (score.numE(max)) {
                        ans = cons(literal, ans);
                    } else {
                        if (score.numG(max)) {
                            max = score;
                            ans = list(literal);
                        }
                    }
                }
                return reverse(ans);
            }
        }
    }

    public static SubLObject left_connected_literals(final SubLObject literals, SubLObject connected_vars) {
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        }
        SubLObject ans = list(literals.first());
        SubLObject max = left_connected_score(literal_args(literals.first(), UNPROVIDED), connected_vars);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = left_connected_score(literal_args(literal, UNPROVIDED), connected_vars);
            if (score.numE(max)) {
                ans = cons(literal, ans);
            } else
                if (score.numG(max)) {
                    max = score;
                    ans = list(literal);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static final SubLObject left_connected_score_alt(SubLObject vars, SubLObject connected_vars) {
        {
            SubLObject score = ZERO_INTEGER;
            SubLObject psn = ZERO_INTEGER;
            SubLObject cdolist_list_var = reverse(vars);
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                psn = add(psn, ONE_INTEGER);
                score = add(score, multiply(length(member(var, connected_vars, symbol_function(EQUAL), UNPROVIDED)), psn));
            }
            return score;
        }
    }

    public static SubLObject left_connected_score(final SubLObject vars, final SubLObject connected_vars) {
        SubLObject score = ZERO_INTEGER;
        SubLObject psn = ZERO_INTEGER;
        SubLObject cdolist_list_var = reverse(vars);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            psn = add(psn, ONE_INTEGER);
            score = add(score, multiply(length(member(var, connected_vars, symbol_function(EQUAL), UNPROVIDED)), psn));
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return score;
    }

    public static final SubLObject left_rooted_literals_alt(SubLObject literals, SubLObject original) {
        if (original == UNPROVIDED) {
            original = literals;
        }
        return com.cyc.cycjava.cycl.czer_main.left_rooted_literals_int(com.cyc.cycjava.cycl.czer_main.default_lit_sort(literals), com.cyc.cycjava.cycl.czer_main.default_lit_sort(original));
    }

    public static SubLObject left_rooted_literals(final SubLObject literals, SubLObject original) {
        if (original == UNPROVIDED) {
            original = literals;
        }
        return left_rooted_literals_int(default_lit_sort(literals), default_lit_sort(original));
    }

    public static final SubLObject default_lit_sort_alt(SubLObject literals) {
        return Sort.stable_sort(copy_list(literals), symbol_function($sym102$LIT__), UNPROVIDED);
    }

    public static SubLObject default_lit_sort(final SubLObject literals) {
        return Sort.stable_sort(copy_list(literals), symbol_function($sym112$LIT__), UNPROVIDED);
    }

    public static final SubLObject lit_L_alt(SubLObject lit_1, SubLObject lit_2) {
        if ((NIL != el_negation_p(lit_1)) && (NIL == el_negation_p(lit_2))) {
            return T;
        } else {
            if ((NIL == el_negation_p(lit_1)) && (NIL != el_negation_p(lit_2))) {
                return NIL;
            } else {
                if (!literal_arg0(lit_1, UNPROVIDED).equal(literal_arg0(lit_2, UNPROVIDED))) {
                    return com.cyc.cycjava.cycl.czer_main.pred_L(literal_arg0(lit_1, UNPROVIDED), literal_arg0(lit_2, UNPROVIDED));
                } else {
                    return com.cyc.cycjava.cycl.czer_main.canon_term_L(literal_args(lit_1, UNPROVIDED), literal_args(lit_2, UNPROVIDED));
                }
            }
        }
    }

    public static SubLObject lit_L(final SubLObject lit_1, final SubLObject lit_2) {
        if ((NIL != el_negation_p(lit_1)) && (NIL == el_negation_p(lit_2))) {
            return T;
        }
        if ((NIL == el_negation_p(lit_1)) && (NIL != el_negation_p(lit_2))) {
            return NIL;
        }
        if (!literal_arg0(lit_1, UNPROVIDED).equal(literal_arg0(lit_2, UNPROVIDED))) {
            return pred_L(literal_arg0(lit_1, UNPROVIDED), literal_arg0(lit_2, UNPROVIDED));
        }
        return canon_term_L(literal_args(lit_1, UNPROVIDED), literal_args(lit_2, UNPROVIDED));
    }

    public static final SubLObject pred_L_alt(SubLObject pred_1, SubLObject pred_2) {
        if ((NIL != fort_p(pred_1)) && (NIL != fort_p(pred_2))) {
            {
                SubLObject pred_1_psn = position(pred_1, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pred_2_psn = position(pred_2, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((NIL != pred_1_psn) && (NIL != pred_2_psn)) {
                    return numG(pred_2_psn, pred_1_psn);
                } else {
                    if (NIL != pred_1_psn) {
                        return T;
                    } else {
                        if (NIL != pred_2_psn) {
                            return NIL;
                        }
                    }
                }
                {
                    SubLObject arity_1 = arity.arity(pred_1);
                    SubLObject arity_2 = arity.arity(pred_2);
                    if (arity_1 != arity_2) {
                        if ((NIL != arity_1) && (NIL != arity_2)) {
                            return numG(arity_2, arity_1);
                        } else {
                            if (NIL != arity_1) {
                                return T;
                            } else {
                                if (NIL != arity_2) {
                                    return NIL;
                                }
                            }
                        }
                    }
                    if ((NIL != constant_p(pred_1)) && (NIL != nart_handles.nart_p(pred_2))) {
                        return T;
                    } else {
                        if ((NIL != nart_handles.nart_p(pred_1)) && (NIL != constant_p(pred_2))) {
                            return T;
                        } else {
                            if ((NIL != constant_p(pred_1)) && (NIL != constant_p(pred_2))) {
                                return com.cyc.cycjava.cycl.czer_main.canonicalizer_constant_L(pred_1, pred_2);
                            } else {
                                if ((NIL != nart_handles.nart_p(pred_1)) && (NIL != nart_handles.nart_p(pred_2))) {
                                    return com.cyc.cycjava.cycl.czer_main.canon_term_L(narts_high.nart_hl_formula(pred_1), narts_high.nart_hl_formula(pred_2));
                                } else {
                                    el_error(ONE_INTEGER, $str_alt103$Got_a_fort_that_was_neither_a_nar, pred_1, pred_2, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return com.cyc.cycjava.cycl.czer_main.canon_term_L(pred_1, pred_2);
        }
        return NIL;
    }

    public static SubLObject pred_L(final SubLObject pred_1, final SubLObject pred_2) {
        if ((NIL == forts.fort_p(pred_1)) || (NIL == forts.fort_p(pred_2))) {
            return canon_term_L(pred_1, pred_2);
        }
        final SubLObject pred_1_psn = position(pred_1, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pred_2_psn = position(pred_2, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != pred_1_psn) && (NIL != pred_2_psn)) {
            return numG(pred_2_psn, pred_1_psn);
        }
        if (NIL != pred_1_psn) {
            return T;
        }
        if (NIL != pred_2_psn) {
            return NIL;
        }
        final SubLObject arity_1 = arity.arity(pred_1);
        final SubLObject arity_2 = arity.arity(pred_2);
        if (!arity_1.eql(arity_2)) {
            if ((NIL != arity_1) && (NIL != arity_2)) {
                return numG(arity_2, arity_1);
            }
            if (NIL != arity_1) {
                return T;
            }
            if (NIL != arity_2) {
                return NIL;
            }
        }
        if ((NIL != constant_p(pred_1)) && (NIL != nart_handles.nart_p(pred_2))) {
            return T;
        }
        if ((NIL != nart_handles.nart_p(pred_1)) && (NIL != constant_p(pred_2))) {
            return T;
        }
        if ((NIL != constant_p(pred_1)) && (NIL != constant_p(pred_2))) {
            return canonicalizer_constant_L(pred_1, pred_2);
        }
        if ((NIL != nart_handles.nart_p(pred_1)) && (NIL != nart_handles.nart_p(pred_2))) {
            return canon_term_L(narts_high.nart_hl_formula(pred_1), narts_high.nart_hl_formula(pred_2));
        }
        el_error(ONE_INTEGER, $str113$Got_a_fort_that_was_neither_a_nar, pred_1, pred_2, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject left_rooted_literals_int_alt(SubLObject literals, SubLObject original) {
        if (original == UNPROVIDED) {
            original = literals;
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        } else {
            {
                SubLObject ans = list(literals.first());
                SubLObject max = com.cyc.cycjava.cycl.czer_main.left_rooted_score(literals.first(), original, UNPROVIDED);
                SubLObject score = NIL;
                SubLObject cdolist_list_var = literals.rest();
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    score = com.cyc.cycjava.cycl.czer_main.left_rooted_score(literal, original, UNPROVIDED);
                    if (score.numE(max)) {
                        ans = cons(literal, ans);
                    } else {
                        if (score.numG(max)) {
                            max = score;
                            ans = list(literal);
                        }
                    }
                }
                return reverse(ans);
            }
        }
    }

    public static SubLObject left_rooted_literals_int(final SubLObject literals, SubLObject original) {
        if (original == UNPROVIDED) {
            original = literals;
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        }
        SubLObject ans = list(literals.first());
        SubLObject max = left_rooted_score(literals.first(), original, UNPROVIDED);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = left_rooted_score(literal, original, UNPROVIDED);
            if (score.numE(max)) {
                ans = cons(literal, ans);
            } else
                if (score.numG(max)) {
                    max = score;
                    ans = list(literal);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static final SubLObject left_rooted_score_alt(SubLObject literal, SubLObject literals, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subl_promotions.memberP(literal, literals, symbol_function(EQUAL), UNPROVIDED)) {
                    Errors.error($str_alt104$_s_is_not_an_element_of__s, literal, literals);
                }
            }
            {
                SubLObject symbols = literal_args(literal, UNPROVIDED);
                SubLObject score = com.cyc.cycjava.cycl.czer_main.left_weighted_score(symbols, UNPROVIDED);
                SubLObject rest = remove(literal, literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject psn = ZERO_INTEGER;
                SubLObject out_scores = NIL;
                SubLObject out = NIL;
                SubLObject out_score = NIL;
                SubLObject lit_score = NIL;
                SubLObject connectedP = NIL;
                SubLObject unconnected = NIL;
                {
                    SubLObject cdolist_list_var = remove_duplicates(symbols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject symbol = NIL;
                    for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                        psn = add(psn, ONE_INTEGER);
                        {
                            SubLObject cdolist_list_var_60 = rest;
                            SubLObject lit = NIL;
                            for (lit = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , lit = cdolist_list_var_60.first()) {
                                connectedP = NIL;
                                out = NIL;
                                {
                                    SubLObject cdolist_list_var_61 = literal_args(lit, UNPROVIDED);
                                    SubLObject v_term = NIL;
                                    for (v_term = cdolist_list_var_61.first(); NIL != cdolist_list_var_61; cdolist_list_var_61 = cdolist_list_var_61.rest() , v_term = cdolist_list_var_61.first()) {
                                        if (NIL != subl_promotions.memberP(v_term, symbols, symbol_function(EQUAL), UNPROVIDED)) {
                                            connectedP = T;
                                        } else {
                                            {
                                                SubLObject item_var = v_term;
                                                if (NIL == member(item_var, out, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    out = cons(item_var, out);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL != connectedP) {
                                    lit_score = com.cyc.cycjava.cycl.czer_main.left_weighted_score(literal_args(lit, UNPROVIDED), symbol);
                                    score = add(score, divide(lit_score, psn));
                                    if (NIL != out) {
                                        unconnected = cons(lit, unconnected);
                                        {
                                            SubLObject cdolist_list_var_62 = out;
                                            SubLObject v_term = NIL;
                                            for (v_term = cdolist_list_var_62.first(); NIL != cdolist_list_var_62; cdolist_list_var_62 = cdolist_list_var_62.rest() , v_term = cdolist_list_var_62.first()) {
                                                out_score = assoc(v_term, out_scores, symbol_function(EQUAL), UNPROVIDED).rest();
                                                if (NIL != out_score) {
                                                    rplacd(assoc(v_term, out_scores, symbol_function(EQUAL), UNPROVIDED), add(out_score, lit_score));
                                                } else {
                                                    out_scores = cons(cons(v_term, lit_score), out_scores);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject root_term = com.cyc.cycjava.cycl.czer_main.max_scored_item(out_scores, symbol_function(CDR), symbol_function(CAR));
                    SubLObject root_lit = NIL;
                    SubLObject max = ZERO_INTEGER;
                    SubLObject cdolist_list_var = unconnected;
                    SubLObject lit = NIL;
                    for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                        lit_score = com.cyc.cycjava.cycl.czer_main.left_weighted_score(cycl_utilities.formula_terms(lit, UNPROVIDED), root_term);
                        if (lit_score.numG(max)) {
                            max = lit_score;
                            root_lit = lit;
                        }
                    }
                    if (NIL != root_lit) {
                        score = divide(add(score, com.cyc.cycjava.cycl.czer_main.left_rooted_score(root_lit, rest, multiply(depth, TEN_INTEGER))), depth);
                    }
                }
                return score;
            }
        }
    }

    public static SubLObject left_rooted_score(final SubLObject literal, final SubLObject literals, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(literal, literals, symbol_function(EQUAL), UNPROVIDED))) {
            Errors.error($str114$_s_is_not_an_element_of__s, literal, literals);
        }
        final SubLObject symbols = literal_args(literal, UNPROVIDED);
        SubLObject score = left_weighted_score(symbols, UNPROVIDED);
        final SubLObject rest = remove(literal, literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject psn = ZERO_INTEGER;
        SubLObject out_scores = NIL;
        SubLObject out = NIL;
        SubLObject out_score = NIL;
        SubLObject lit_score = NIL;
        SubLObject connectedP = NIL;
        SubLObject unconnected = NIL;
        SubLObject cdolist_list_var = remove_duplicates(symbols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            psn = add(psn, ONE_INTEGER);
            SubLObject cdolist_list_var_$65 = rest;
            SubLObject lit = NIL;
            lit = cdolist_list_var_$65.first();
            while (NIL != cdolist_list_var_$65) {
                connectedP = NIL;
                out = NIL;
                SubLObject cdolist_list_var_$66 = literal_args(lit, UNPROVIDED);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var_$66.first();
                while (NIL != cdolist_list_var_$66) {
                    if (NIL != subl_promotions.memberP(v_term, symbols, symbol_function(EQUAL), UNPROVIDED)) {
                        connectedP = T;
                    } else {
                        final SubLObject item_var = v_term;
                        if (NIL == member(item_var, out, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            out = cons(item_var, out);
                        }
                    }
                    cdolist_list_var_$66 = cdolist_list_var_$66.rest();
                    v_term = cdolist_list_var_$66.first();
                } 
                if (NIL != connectedP) {
                    lit_score = left_weighted_score(literal_args(lit, UNPROVIDED), symbol);
                    score = add(score, divide(lit_score, psn));
                    if (NIL != out) {
                        unconnected = cons(lit, unconnected);
                        SubLObject cdolist_list_var_$67 = out;
                        v_term = NIL;
                        v_term = cdolist_list_var_$67.first();
                        while (NIL != cdolist_list_var_$67) {
                            out_score = assoc(v_term, out_scores, symbol_function(EQUAL), UNPROVIDED).rest();
                            if (NIL != out_score) {
                                rplacd(assoc(v_term, out_scores, symbol_function(EQUAL), UNPROVIDED), add(out_score, lit_score));
                            } else {
                                out_scores = cons(cons(v_term, lit_score), out_scores);
                            }
                            cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                            v_term = cdolist_list_var_$67.first();
                        } 
                    }
                }
                cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                lit = cdolist_list_var_$65.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        final SubLObject root_term = max_scored_item(out_scores, symbol_function(CDR), symbol_function(CAR));
        SubLObject root_lit = NIL;
        SubLObject max = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = unconnected;
        SubLObject lit2 = NIL;
        lit2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            lit_score = left_weighted_score(cycl_utilities.formula_terms(lit2, UNPROVIDED), root_term);
            if (lit_score.numG(max)) {
                max = lit_score;
                root_lit = lit2;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            lit2 = cdolist_list_var2.first();
        } 
        if (NIL != root_lit) {
            score = divide(add(score, left_rooted_score(root_lit, rest, multiply(depth, TEN_INTEGER))), depth);
        }
        return score;
    }

    public static final SubLObject max_scored_item_alt(SubLObject items, SubLObject score_key, SubLObject result_key) {
        if (score_key == UNPROVIDED) {
            score_key = symbol_function(IDENTITY);
        }
        if (result_key == UNPROVIDED) {
            result_key = symbol_function(IDENTITY);
        }
        {
            SubLObject max = $most_negative_fixnum$.getGlobalValue();
            SubLObject score = NIL;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                score = funcall(score_key, item);
                if (score.numG(max)) {
                    max = score;
                    result = funcall(result_key, item);
                }
            }
            return result;
        }
    }

    public static SubLObject max_scored_item(final SubLObject items, SubLObject score_key, SubLObject result_key) {
        if (score_key == UNPROVIDED) {
            score_key = symbol_function(IDENTITY);
        }
        if (result_key == UNPROVIDED) {
            result_key = symbol_function(IDENTITY);
        }
        SubLObject max = $most_negative_fixnum$.getGlobalValue();
        SubLObject score = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = funcall(score_key, item);
            if (score.numG(max)) {
                max = score;
                result = funcall(result_key, item);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject least_complex_literals_alt(SubLObject literals, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        } else {
            {
                SubLObject first = literals.first();
                SubLObject ans = list(first);
                SubLObject min = com.cyc.cycjava.cycl.czer_main.el_complexity_score(first, varP, UNPROVIDED);
                SubLObject cdolist_list_var = literals.rest();
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject score = com.cyc.cycjava.cycl.czer_main.el_complexity_score(literal, varP, UNPROVIDED);
                        if (score.numE(min)) {
                            ans = cons(literal, ans);
                        } else {
                            if (score.numL(min)) {
                                min = score;
                                ans = list(literal);
                            }
                        }
                    }
                }
                return reverse(ans);
            }
        }
    }

    public static SubLObject least_complex_literals(final SubLObject literals, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        }
        final SubLObject first = literals.first();
        SubLObject ans = list(first);
        SubLObject min = el_complexity_score(first, varP, UNPROVIDED);
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = el_complexity_score(literal, varP, UNPROVIDED);
            if (score.numE(min)) {
                ans = cons(literal, ans);
            } else
                if (score.numL(min)) {
                    min = score;
                    ans = list(literal);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static final SubLObject el_complexity_score_alt(SubLObject v_object, SubLObject varP, SubLObject factor) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (factor == UNPROVIDED) {
            factor = ONE_INTEGER;
        }
        if (NIL == v_object) {
            return ZERO_INTEGER;
        } else {
            if (NIL != constant_p(v_object)) {
                return ONE_INTEGER;
            } else {
                if (NIL != funcall(varP, v_object)) {
                    return THREE_INTEGER;
                } else {
                    if (NIL != nart_handles.nart_p(v_object)) {
                        return add(FIVE_INTEGER, divide(com.cyc.cycjava.cycl.czer_main.el_complexity_score(narts_high.nart_hl_formula(v_object), varP, factor), TWO_INTEGER));
                    } else {
                        if (v_object.isString()) {
                            return add(FOUR_INTEGER, divide(length(v_object), TWO_INTEGER));
                        } else {
                            if (NIL != assertion_handles.assertion_p(v_object)) {
                                return add($int$1000, com.cyc.cycjava.cycl.czer_main.el_complexity_score(fi.assertion_fi_formula(v_object, UNPROVIDED), varP, factor));
                            } else {
                                if (v_object.isAtom()) {
                                    return TWO_INTEGER;
                                } else {
                                    if (v_object.isCons()) {
                                        return add($int$100, com.cyc.cycjava.cycl.czer_main.el_complexity_score(v_object.first(), varP, factor), multiply(factor, com.cyc.cycjava.cycl.czer_main.el_complexity_score(v_object.rest(), varP, multiply(factor, $float$0_9))));
                                    } else {
                                        return $int$10000;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject el_complexity_score(final SubLObject v_object, SubLObject varP, SubLObject factor) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (factor == UNPROVIDED) {
            factor = ONE_INTEGER;
        }
        if (NIL == v_object) {
            return ZERO_INTEGER;
        }
        if (NIL != constant_p(v_object)) {
            return ONE_INTEGER;
        }
        if (NIL != funcall(varP, v_object)) {
            return THREE_INTEGER;
        }
        if (NIL != nart_handles.nart_p(v_object)) {
            return add(FIVE_INTEGER, divide(el_complexity_score(narts_high.nart_hl_formula(v_object), varP, factor), TWO_INTEGER));
        }
        if (v_object.isString()) {
            return add(FOUR_INTEGER, divide(length(v_object), TWO_INTEGER));
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return add($int$1000, el_complexity_score(fi.assertion_fi_formula(v_object, UNPROVIDED), varP, factor));
        }
        if (v_object.isAtom()) {
            return TWO_INTEGER;
        }
        if (v_object.isCons()) {
            return add($int$100, el_complexity_score(v_object.first(), varP, factor), multiply(factor, el_complexity_score(v_object.rest(), varP, multiply(factor, $float$0_9))));
        }
        return $int$10000;
    }

    public static final SubLObject default_preference_lit_alt(SubLObject literals) {
        {
            SubLObject ans = NIL;
            SubLObject min = $most_positive_fixnum$.getGlobalValue();
            SubLObject cdolist_list_var = literals;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                {
                    SubLObject score = position(literal_arg0(lit, UNPROVIDED), czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != score) {
                        if (min.numG(score)) {
                            min = score;
                            ans = list(lit);
                        } else {
                            if (min.numE(score)) {
                                ans = cons(lit, ans);
                            }
                        }
                    }
                }
            }
            if (NIL != list_utilities.singletonP(ans)) {
                return ans.first();
            }
        }
        return NIL;
    }

    public static SubLObject default_preference_lit(final SubLObject literals) {
        SubLObject ans = NIL;
        SubLObject min = $most_positive_fixnum$.getGlobalValue();
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = position(literal_arg0(lit, UNPROVIDED), czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != score) {
                if (min.numG(score)) {
                    min = score;
                    ans = list(lit);
                } else
                    if (min.numE(score)) {
                        ans = cons(lit, ans);
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.singletonP(ans)) {
            return ans.first();
        }
        return NIL;
    }

    public static final SubLObject canonicalize_disjunctions_as_enumerations_alt(SubLObject v_clauses) {
        return v_clauses;
    }

    public static SubLObject canonicalize_disjunctions_as_enumerations(final SubLObject v_clauses) {
        return v_clauses;
    }

    public static final SubLObject canonicalize_clauses_variables_alt(SubLObject v_clauses) {
        return com.cyc.cycjava.cycl.czer_main.rename_clauses_vars(v_clauses);
    }

    public static SubLObject canonicalize_clauses_variables(final SubLObject v_clauses) {
        return rename_clauses_vars(v_clauses);
    }

    public static final SubLObject rename_clauses_vars_alt(SubLObject v_clauses) {
        return list_utilities.nmapcar(RENAME_CLAUSE_VARS_INT, v_clauses);
    }

    public static SubLObject rename_clauses_vars(final SubLObject v_clauses) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(rename_clause_vars_int(clause, v_clauses, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject standardize_variable_memory_binding_alt(SubLObject var, SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject referenced_as_list = NIL;
                SubLObject ambiguousP = NIL;
                if (NIL == ambiguousP) {
                    {
                        SubLObject csome_list_var = com.cyc.cycjava.cycl.czer_main.all_bindings(var, czer_vars.$standardize_variables_memory$.getDynamicValue(thread));
                        SubLObject binding = NIL;
                        for (binding = csome_list_var.first(); !((NIL != ambiguousP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                            if (NIL != list_utilities.simple_tree_findP(binding, expression)) {
                                if ((NIL != referenced_as_list) || (NIL != list_utilities.simple_tree_findP(var, expression))) {
                                    ambiguousP = T;
                                }
                                referenced_as_list = cons(binding, referenced_as_list);
                            }
                        }
                    }
                }
                return values(referenced_as_list, ambiguousP);
            }
        }
    }

    public static SubLObject standardize_variable_memory_binding(final SubLObject var, final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject referenced_as_list = NIL;
        SubLObject ambiguousP = NIL;
        if (NIL == ambiguousP) {
            SubLObject csome_list_var = all_bindings(var, czer_vars.$standardize_variables_memory$.getDynamicValue(thread));
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == ambiguousP) && (NIL != csome_list_var)) {
                if (NIL != list_utilities.simple_tree_findP(binding, expression)) {
                    if ((NIL != referenced_as_list) || (NIL != list_utilities.simple_tree_findP(var, expression))) {
                        ambiguousP = T;
                    }
                    referenced_as_list = cons(binding, referenced_as_list);
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return values(referenced_as_list, ambiguousP);
    }

    public static final SubLObject el_nununiquifying_blist_wrt_alt(SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject blist = NIL;
                SubLObject cdolist_list_var = list_utilities.fast_delete_duplicates(Mapping.mapcar(symbol_function(CAR), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject referenced_as_list = com.cyc.cycjava.cycl.czer_main.standardize_variable_memory_binding(var, expression);
                        SubLObject ambiguousP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != forceP) || (NIL == ambiguousP)) {
                            if (NIL != referenced_as_list) {
                                {
                                    SubLObject cdolist_list_var_63 = referenced_as_list;
                                    SubLObject referenced_as = NIL;
                                    for (referenced_as = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest() , referenced_as = cdolist_list_var_63.first()) {
                                        blist = cons(cons(referenced_as, var), blist);
                                        if (NIL != updateP) {
                                            czer_vars.$standardize_variables_memory$.setDynamicValue(nsubst(var, referenced_as, czer_vars.$standardize_variables_memory$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return blist;
            }
        }
    }

    public static SubLObject el_nununiquifying_blist_wrt(final SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject blist = NIL;
        SubLObject cdolist_list_var = list_utilities.fast_delete_duplicates(Mapping.mapcar(symbol_function(CAR), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject referenced_as_list = standardize_variable_memory_binding(var, expression);
            final SubLObject ambiguousP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (((NIL != forceP) || (NIL == ambiguousP)) && (NIL != referenced_as_list)) {
                SubLObject cdolist_list_var_$68 = referenced_as_list;
                SubLObject referenced_as = NIL;
                referenced_as = cdolist_list_var_$68.first();
                while (NIL != cdolist_list_var_$68) {
                    blist = cons(cons(referenced_as, var), blist);
                    if (NIL != updateP) {
                        czer_vars.$standardize_variables_memory$.setDynamicValue(nsubst(var, referenced_as, czer_vars.$standardize_variables_memory$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                    }
                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                    referenced_as = cdolist_list_var_$68.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return blist;
    }

    public static final SubLObject el_nununiquify_vars_wrt_int_alt(SubLObject expression_1, SubLObject expression_2, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject blist = com.cyc.cycjava.cycl.czer_main.el_nununiquifying_blist_wrt(expression_2, updateP, forceP);
                if (NIL != blist) {
                    {
                        SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                        try {
                            czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                            cycl_utilities.expression_nsublis_free_vars(blist, expression_1, UNPROVIDED);
                        } finally {
                            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return expression_1;
        }
    }

    public static SubLObject el_nununiquify_vars_wrt_int(final SubLObject expression_1, final SubLObject expression_2, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject blist = el_nununiquifying_blist_wrt(expression_2, updateP, forceP);
        if (NIL != blist) {
            final SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
            try {
                czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                cycl_utilities.expression_nsublis_free_vars(blist, expression_1, UNPROVIDED);
            } finally {
                czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
            }
        }
        return expression_1;
    }

    public static final SubLObject el_nununiquify_vars_wrt_alt(SubLObject expression_1, SubLObject expression_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                    try {
                        czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                        czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                        result = com.cyc.cycjava.cycl.czer_main.el_nununiquify_vars_wrt_int(expression_1, expression_2, NIL, UNPROVIDED);
                    } finally {
                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject el_nununiquify_vars_wrt(final SubLObject expression_1, final SubLObject expression_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            result = el_nununiquify_vars_wrt_int(expression_1, expression_2, NIL, UNPROVIDED);
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * replace uniquified vars with origs when not ambiguous
     */
    @LispMethod(comment = "replace uniquified vars with origs when not ambiguous")
    public static final SubLObject el_nununiquify_vars_int_alt(SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        return com.cyc.cycjava.cycl.czer_main.el_nununiquify_vars_wrt_int(expression, expression, updateP, forceP);
    }

    @LispMethod(comment = "replace uniquified vars with origs when not ambiguous")
    public static SubLObject el_nununiquify_vars_int(final SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        return el_nununiquify_vars_wrt_int(expression, expression, updateP, forceP);
    }/**
     * replace uniquified vars with origs when not ambiguous
     */


    /**
     * replace uniquified vars with origs when not ambiguous
     */
    @LispMethod(comment = "replace uniquified vars with origs when not ambiguous")
    public static final SubLObject el_ununiquify_vars_int_alt(SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        return com.cyc.cycjava.cycl.czer_main.el_nununiquify_vars_int(copy_expression(expression), updateP, forceP);
    }

    @LispMethod(comment = "replace uniquified vars with origs when not ambiguous")
    public static SubLObject el_ununiquify_vars_int(final SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        return el_nununiquify_vars_int(copy_expression(expression), updateP, forceP);
    }/**
     * replace uniquified vars with origs when not ambiguous
     */


    public static final SubLObject el_nununiquify_vars_alt(SubLObject expression) {
        return com.cyc.cycjava.cycl.czer_main.el_nununiquify_vars_int(expression, NIL, UNPROVIDED);
    }

    public static SubLObject el_nununiquify_vars(final SubLObject expression) {
        return el_nununiquify_vars_int(expression, NIL, UNPROVIDED);
    }

    public static final SubLObject uniquify_alt(SubLObject var) {
        return gentemp(string_utilities.str(var));
    }

    public static SubLObject uniquify(final SubLObject var) {
        return gentemp(string_utilities.str(var));
    }

    public static final SubLObject rename_clauses_vars_safe_alt(SubLObject v_clauses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                    try {
                        czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                        czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                        result = Mapping.mapcar(RENAME_CLAUSE_VARS_INT, copy_clauses(v_clauses));
                    } finally {
                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rename_clauses_vars_safe(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            return rename_clauses_vars(v_clauses);
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * replace free el vars with hl vars
     * If VAR? is explicitly passed, it will use it to determine what's a variable.  Otherwise it will use @xref canon-var?.
     */
    @LispMethod(comment = "replace free el vars with hl vars\r\nIf VAR? is explicitly passed, it will use it to determine what\'s a variable.  Otherwise it will use @xref canon-var?.\nreplace free el vars with hl vars\nIf VAR? is explicitly passed, it will use it to determine what\'s a variable.  Otherwise it will use @xref canon-var?.")
    public static final SubLObject rename_clause_vars_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                    try {
                        czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
                        czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                        result = rename_clause_vars_int(copy_clause(clause), varP);
                    } finally {
                        czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                        czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "replace free el vars with hl vars\r\nIf VAR? is explicitly passed, it will use it to determine what\'s a variable.  Otherwise it will use @xref canon-var?.\nreplace free el vars with hl vars\nIf VAR? is explicitly passed, it will use it to determine what\'s a variable.  Otherwise it will use @xref canon-var?.")
    public static SubLObject rename_clause_vars(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
            czer_vars.$el_symbol_suffix_table$.bind(make_hash_table(FOUR_INTEGER, symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            result = rename_single_clause_vars_int(copy_clause(clause), varP);
        } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_2, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * replace free el vars with hl vars
     * If VAR? is explicitly passed, it will use it to determine what's a variable.  Otherwise it will use @xref canon-var?.
     */


    public static SubLObject rename_single_clause_vars_int(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = NIL;
        }
        return rename_clause_vars_int(clause, clause, varP);
    }

    public static final SubLObject rename_clause_vars_int(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject blist = NIL;
                SubLObject free_vars = NIL;
                SubLObject closed_vars = NIL;
                clause = com.cyc.cycjava.cycl.czer_main.el_nununiquify_vars_int(clause, T, UNPROVIDED);
                if (NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
                    {
                        SubLObject meta_blist = NIL;
                        SubLObject old = NIL;
                        SubLObject v_new = NIL;
                        SubLObject count = ZERO_INTEGER;
                        SubLObject v_variables = (NIL != varP) ? ((SubLObject) (com.cyc.cycjava.cycl.czer_main.clause_el_variables(clause, varP))) : com.cyc.cycjava.cycl.czer_main.clause_el_variables(clause, symbol_function($sym111$CANON_VAR_));
                        if (NIL != v_variables) {
                            closed_vars = Mapping.mapcar(symbol_function(CDR), czer_vars.$standardize_variables_memory$.getDynamicValue(thread));
                            free_vars = list_utilities.fast_set_difference(v_variables, closed_vars, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = cycl_utilities.formula_gather(clause, symbol_function(ASSERTION_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject assertion = NIL;
                                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_64 = assertions_high.assertion_el_variables(assertion);
                                        SubLObject var = NIL;
                                        for (var = cdolist_list_var_64.first(); NIL != cdolist_list_var_64; cdolist_list_var_64 = cdolist_list_var_64.rest() , var = cdolist_list_var_64.first()) {
                                            if (NIL != subl_promotions.memberP(var, v_variables, UNPROVIDED, UNPROVIDED)) {
                                                blist = cons(cons(var, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                                                count = add(count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = v_variables;
                                SubLObject var = NIL;
                                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                                    if (NIL != assoc(var, blist, UNPROVIDED, UNPROVIDED)) {
                                    } else {
                                        if (NIL != term.unreified_skolem_termP(var)) {
                                            el_error(TWO_INTEGER, $str_alt113$_s_treated_as_variable_in_rename_, var, UNPROVIDED, UNPROVIDED);
                                            v_new = last(var, UNPROVIDED).first();
                                            old = rassoc(v_new, czer_vars.$standardize_variables_memory$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first();
                                            if (NIL != old) {
                                                blist = cons(cons(v_new, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                                                meta_blist = cons(cons(v_new, old), meta_blist);
                                                count = add(count, ONE_INTEGER);
                                            }
                                        } else {
                                            blist = cons(cons(var, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                                            count = add(count, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                            clause = cycl_utilities.expression_nsublis_free_vars(blist, clause, UNPROVIDED);
                            blist = nreverse(sublis(meta_blist, blist, UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
                if (NIL != $within_ask$.getDynamicValue(thread)) {
                    return list(clause, blist, com.cyc.cycjava.cycl.czer_main.blist_vars_among(blist, com.cyc.cycjava.cycl.czer_main.blist_vars_among(blist, free_vars)));
                } else {
                    return list(clause, blist);
                }
            }
        }
    }

    public static SubLObject rename_clause_vars_int(SubLObject clause, final SubLObject environment, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject blist = NIL;
        SubLObject free_vars = NIL;
        SubLObject closed_vars = NIL;
        clause = el_nununiquify_vars_wrt_int(clause, environment, T, UNPROVIDED);
        if (NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
            SubLObject meta_blist = NIL;
            SubLObject old = NIL;
            SubLObject v_new = NIL;
            SubLObject count = ZERO_INTEGER;
            final SubLObject v_variables = (NIL != varP) ? clause_el_variables(clause, varP) : clause_el_variables(clause, symbol_function($sym120$CANON_VAR_));
            if (NIL != v_variables) {
                closed_vars = lookup_closed_vars_from_standardize_variables_memory();
                free_vars = list_utilities.fast_set_difference(v_variables, closed_vars, UNPROVIDED);
                SubLObject cdolist_list_var = cycl_utilities.formula_gather(clause, symbol_function(ASSERTION_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$69 = assertions_high.assertion_el_variables(assertion);
                    SubLObject var = NIL;
                    var = cdolist_list_var_$69.first();
                    while (NIL != cdolist_list_var_$69) {
                        if (NIL != subl_promotions.memberP(var, v_variables, UNPROVIDED, UNPROVIDED)) {
                            blist = cons(cons(var, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                            count = add(count, ONE_INTEGER);
                        }
                        cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                        var = cdolist_list_var_$69.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
                cdolist_list_var = v_variables;
                SubLObject var2 = NIL;
                var2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == assoc(var2, blist, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != term.unreified_skolem_termP(var2)) {
                            el_error(TWO_INTEGER, $str122$_s_treated_as_variable_in_rename_, var2, UNPROVIDED, UNPROVIDED);
                            v_new = last(var2, UNPROVIDED).first();
                            old = rassoc(v_new, czer_vars.$standardize_variables_memory$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first();
                            if (NIL != old) {
                                blist = cons(cons(v_new, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                                meta_blist = cons(cons(v_new, old), meta_blist);
                                count = add(count, ONE_INTEGER);
                            }
                        } else {
                            blist = cons(cons(var2, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                            count = add(count, ONE_INTEGER);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    var2 = cdolist_list_var.first();
                } 
                clause = cycl_utilities.expression_nsublis_free_vars(blist, clause, UNPROVIDED);
                blist = nreverse(sublis(meta_blist, blist, UNPROVIDED, UNPROVIDED));
            }
        }
        if (NIL != $within_ask$.getDynamicValue(thread)) {
            return list(clause, blist, blist_vars_among(blist, blist_vars_among(blist, free_vars)));
        }
        return list(clause, blist);
    }

    public static SubLObject lookup_closed_vars_from_standardize_variables_memory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Mapping.mapcar(symbol_function(CDR), czer_vars.$standardize_variables_memory$.getDynamicValue(thread));
    }

    public static final SubLObject blist_vars_among_alt(SubLObject blist, SubLObject vars) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = blist;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                if (NIL != subl_promotions.memberP(binding.first(), vars, UNPROVIDED, UNPROVIDED)) {
                    result = cons(binding.first(), result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject blist_vars_among(final SubLObject blist, final SubLObject vars) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = blist;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(binding.first(), vars, UNPROVIDED, UNPROVIDED)) {
                result = cons(binding.first(), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject blist_vars_not_among_alt(SubLObject blist, SubLObject vars) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = blist;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                if (NIL == subl_promotions.memberP(binding.first(), vars, UNPROVIDED, UNPROVIDED)) {
                    result = cons(binding.first(), result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject blist_vars_not_among(final SubLObject blist, final SubLObject vars) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = blist;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(binding.first(), vars, UNPROVIDED, UNPROVIDED)) {
                result = cons(binding.first(), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject all_bindings_alt(SubLObject symbol, SubLObject v_bindings) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                if (symbol.eql(binding.first())) {
                    result = cons(binding.rest(), result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject all_bindings(final SubLObject symbol, final SubLObject v_bindings) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (symbol.eql(binding.first())) {
                result = cons(binding.rest(), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject clause_el_variables_alt(SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym54$EL_VAR_);
        }
        if (NIL == list_utilities.tree_find_if(varP, clause, UNPROVIDED)) {
            return NIL;
        }
        return clause_utilities.clause_free_variables(clause, varP, UNPROVIDED);
    }

    public static SubLObject clause_el_variables(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym53$EL_VAR_);
        }
        if (NIL == list_utilities.tree_find_if(varP, clause, UNPROVIDED)) {
            return NIL;
        }
        return clause_utilities.clause_free_variables(clause, varP, UNPROVIDED);
    }

    /**
     * Assumes the EL variable namespace is bound.
     */
    @LispMethod(comment = "Assumes the EL variable namespace is bound.")
    public static final SubLObject initialize_symbol_suffix_table_alt(SubLObject formula) {
        list_utilities.tree_funcall_if(symbol_function($sym54$EL_VAR_), symbol_function(INITIALIZE_SUFFIX_TABLE_FOR_VAR), formula, UNPROVIDED);
        return NIL;
    }

    @LispMethod(comment = "Assumes the EL variable namespace is bound.")
    public static SubLObject initialize_symbol_suffix_table(final SubLObject formula) {
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, symbol_function($sym53$EL_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            initialize_suffix_table_for_var(el_var);
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Assumes the EL variable namespace is bound.
     */


    public static final SubLObject initialize_suffix_table_for_var_alt(SubLObject el_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject integer = com.cyc.cycjava.cycl.czer_main.extract_name_uniquifying_post_hyphen_integer(el_var);
                SubLObject symbol = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (integer.isInteger() && symbol.isSymbol()) {
                    if (integer.numGE(ZERO_INTEGER)) {
                        {
                            SubLObject n = gethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), UNPROVIDED);
                            if ((!n.isInteger()) || integer.numG(n)) {
                                sethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), integer);
                                return integer;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_suffix_table_for_var(final SubLObject el_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject integer = extract_name_uniquifying_post_hyphen_integer(el_var);
        final SubLObject symbol = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((integer.isInteger() && symbol.isSymbol()) && integer.numGE(ZERO_INTEGER)) {
            final SubLObject n = gethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), UNPROVIDED);
            if ((!n.isInteger()) || integer.numG(n)) {
                sethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), integer);
                return integer;
            }
        }
        return NIL;
    }

    public static final SubLObject extract_name_uniquifying_post_hyphen_integer_alt(SubLObject symbol) {
        if (symbol.isSymbol()) {
            {
                SubLObject string = symbol_name(symbol);
                SubLObject hyphen = NIL;
                SubLObject next = NIL;
                SubLObject end = NIL;
                for (hyphen = string_utilities.char_position(CHAR_hyphen, string, UNPROVIDED), next = (hyphen.isInteger()) ? ((SubLObject) (add(ONE_INTEGER, hyphen))) : NIL, end = (next.isInteger()) ? ((SubLObject) (string_utilities.char_type_position(symbol_function(NOT_DIGIT_CHAR_P), string, next, UNPROVIDED))) : NIL; !((NIL == next) || (((NIL != list_utilities.lengthG(string, next, UNPROVIDED)) && (NIL != digit_char_p(aref(string, next), UNPROVIDED))) && (NIL == end))); hyphen = string_utilities.char_position(CHAR_hyphen, string, next) , next = (hyphen.isInteger()) ? ((SubLObject) (add(ONE_INTEGER, hyphen))) : NIL , end = (next.isInteger()) ? ((SubLObject) (string_utilities.char_type_position(symbol_function(NOT_DIGIT_CHAR_P), string, next, UNPROVIDED))) : NIL) {
                }
                if (next.isInteger()) {
                    {
                        SubLObject integer = read_from_string(string_utilities.substring(string, next, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (integer.isInteger()) {
                            return values(integer, intern(string_utilities.substring(string, ZERO_INTEGER, hyphen), UNPROVIDED));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject extract_name_uniquifying_post_hyphen_integer(final SubLObject symbol) {
        if (symbol.isSymbol()) {
            SubLObject string;
            SubLObject hyphen;
            SubLObject next;
            SubLObject end;
            for (string = symbol_name(symbol), hyphen = NIL, next = NIL, end = NIL, hyphen = string_utilities.char_position(CHAR_hyphen, string, UNPROVIDED), next = (hyphen.isInteger()) ? add(ONE_INTEGER, hyphen) : NIL, end = (next.isInteger()) ? string_utilities.char_type_position(symbol_function(NOT_DIGIT_CHAR_P), string, next, UNPROVIDED) : NIL; (NIL != next) && (((NIL == list_utilities.lengthG(string, next, UNPROVIDED)) || (NIL == digit_char_p(aref(string, next), UNPROVIDED))) || (NIL != end)); next = (hyphen.isInteger()) ? add(ONE_INTEGER, hyphen) : NIL , end = (next.isInteger()) ? string_utilities.char_type_position(symbol_function(NOT_DIGIT_CHAR_P), string, next, UNPROVIDED) : NIL) {
                hyphen = string_utilities.char_position(CHAR_hyphen, string, next);
            }
            if (next.isInteger()) {
                final SubLObject integer = read_from_string(string_utilities.substring(string, next, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (integer.isInteger()) {
                    return values(integer, intern(string_utilities.substring(string, ZERO_INTEGER, hyphen), UNPROVIDED));
                }
            }
        }
        return values(NIL, NIL);
    }

    public static final SubLObject canonicalize_clauses_alt(SubLObject v_clauses, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (NIL == cycl_grammar.cycl_truth_value_p(v_clauses)) {
                            if (NIL != com.cyc.cycjava.cycl.czer_main.canon_fast_clausesP(v_clauses)) {
                                v_clauses = list(v_clauses);
                            } else {
                                v_clauses = rule_macros.canonicalize_clauses_wrt_rule_macros(v_clauses);
                                v_clauses = czer_meta.canonicalize_meta_clauses(v_clauses);
                                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_terms(v_clauses);
                                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_literals(v_clauses);
                                v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_variables(v_clauses);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject v_clauses_65 = com.cyc.cycjava.cycl.czer_main.unwrap_clauses_if_ist_permissive(v_clauses, mt);
                SubLObject mt_66 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_clauses = v_clauses_65;
                mt = mt_66;
            }
            thread.resetMultipleValues();
            {
                SubLObject v_clauses_67 = com.cyc.cycjava.cycl.czer_main.lift_clauses_if_decontextualized(v_clauses, mt);
                SubLObject mt_68 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_clauses = v_clauses_67;
                mt = mt_68;
            }
            return values(v_clauses, mt);
        }
    }

    public static SubLObject canonicalize_clauses(final SubLObject v_clauses, final SubLObject mt) {
        return canonicalize_clauses_int(v_clauses, mt, T, T);
    }

    public static final SubLObject canonicalize_query_clauses_alt(SubLObject v_clauses, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == cycl_grammar.cycl_truth_value_p(v_clauses)) {
                            v_clauses = czer_meta.canonicalize_meta_clauses(v_clauses);
                            v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_terms(v_clauses);
                            v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_literals(v_clauses);
                            v_clauses = com.cyc.cycjava.cycl.czer_main.canonicalize_clauses_variables(v_clauses);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject v_clauses_69 = com.cyc.cycjava.cycl.czer_main.unwrap_clauses_if_ist_permissive(v_clauses, mt);
                SubLObject mt_70 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_clauses = v_clauses_69;
                mt = mt_70;
            }
            thread.resetMultipleValues();
            {
                SubLObject v_clauses_71 = com.cyc.cycjava.cycl.czer_main.lift_clauses_if_decontextualized(v_clauses, mt);
                SubLObject mt_72 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_clauses = v_clauses_71;
                mt = mt_72;
            }
            return values(v_clauses, mt);
        }
    }

    public static SubLObject canonicalize_query_clauses(SubLObject v_clauses, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_clauses_$70 = canonicalize_clauses_int(v_clauses, mt, NIL, NIL);
        final SubLObject mt_$71 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_$70;
        mt = mt_$71;
        thread.resetMultipleValues();
        final SubLObject v_clauses_$71 = equals.possibly_subst_preferred_rewrite_terms(v_clauses, mt);
        final SubLObject mt_$72 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_$71;
        mt = mt_$72;
        return values(v_clauses, mt);
    }

    public static SubLObject canonicalize_clauses_int(SubLObject v_clauses, SubLObject mt, final SubLObject check_fast_clausesP, final SubLObject canonicalize_wrt_rule_macrosP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == cycl_grammar.cycl_truth_value_p(v_clauses)) {
                if ((NIL != check_fast_clausesP) && (NIL != canon_fast_clausesP(v_clauses))) {
                    v_clauses = list(v_clauses);
                } else {
                    if (NIL != canonicalize_wrt_rule_macrosP) {
                        v_clauses = rule_macros.canonicalize_clauses_wrt_rule_macros(v_clauses);
                    }
                    v_clauses = czer_meta.canonicalize_meta_clauses(v_clauses);
                    v_clauses = canonicalize_clauses_terms(v_clauses);
                    v_clauses = canonicalize_clauses_literals(v_clauses);
                    v_clauses = canonicalize_clauses_variables(v_clauses);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject v_clauses_$74 = unwrap_clauses_if_ist_permissive(v_clauses, mt);
        final SubLObject mt_$75 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_$74;
        mt = mt_$75;
        thread.resetMultipleValues();
        final SubLObject v_clauses_$75 = lift_clauses_if_decontextualized(v_clauses, mt);
        final SubLObject mt_$76 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_$75;
        mt = mt_$76;
        thread.resetMultipleValues();
        final SubLObject v_clauses_$76 = clauses_syntactic_wff_check(v_clauses, mt);
        final SubLObject mt_$77 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_$76;
        mt = mt_$77;
        return values(v_clauses, mt);
    }

    public static final SubLObject canon_fast_clausesP_alt(SubLObject v_clauses) {
        if (NIL != list_utilities.singletonP(v_clauses)) {
            {
                SubLObject clause = v_clauses.first();
                if (NIL != clause_utilities.pos_atomic_cnf_p(clause)) {
                    {
                        SubLObject lit = clauses.pos_lits(clause).first();
                        return makeBoolean(((NIL != subl_promotions.memberP(cycl_utilities.formula_operator(lit), $list_alt42, UNPROVIDED, UNPROVIDED)) && (NIL != groundP(lit, symbol_function($sym54$EL_VAR_)))) && (NIL == contains_subformula_p(lit)));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject canon_fast_clausesP(final SubLObject v_clauses) {
        if (NIL != list_utilities.singletonP(v_clauses)) {
            final SubLObject clause = v_clauses.first();
            if (NIL != clause_utilities.pos_atomic_cnf_p(clause)) {
                final SubLObject lit = clauses.pos_lits(clause).first();
                return makeBoolean(((NIL != subl_promotions.memberP(cycl_utilities.formula_operator(lit), $list41, UNPROVIDED, UNPROVIDED)) && (NIL != groundP(lit, symbol_function($sym53$EL_VAR_)))) && (NIL == contains_subformula_p(lit)));
            }
        }
        return NIL;
    }

    /**
     * Where possible, unwraps #$ist literals in CLAUSES
     */
    @LispMethod(comment = "Where possible, unwraps #$ist literals in CLAUSES")
    public static final SubLObject unwrap_clauses_if_ist_permissive_alt(SubLObject v_clauses, SubLObject input_mt) {
        return values(v_clauses, input_mt);
    }

    @LispMethod(comment = "Where possible, unwraps #$ist literals in CLAUSES")
    public static SubLObject unwrap_clauses_if_ist_permissive(final SubLObject v_clauses, final SubLObject input_mt) {
        return values(v_clauses, input_mt);
    }/**
     * Where possible, unwraps #$ist literals in CLAUSES
     */


    public static final SubLObject lift_clauses_if_decontextualized_alt(SubLObject czer_clauses, SubLObject mt) {
        {
            SubLObject v_clauses = czer_utilities.extract_hl_clauses(czer_clauses);
            if (NIL == clause_utilities.atomic_clauses_p(v_clauses)) {
                if (NIL != czer_utilities.generalized_ist_clauses_p(v_clauses)) {
                    mt = $$UniversalVocabularyMt;
                }
            }
        }
        return values(czer_clauses, mt);
    }

    public static SubLObject lift_clauses_if_decontextualized(final SubLObject czer_clauses, SubLObject mt) {
        final SubLObject v_clauses = czer_utilities.extract_hl_clauses(czer_clauses);
        if ((NIL == clause_utilities.atomic_clauses_p(v_clauses)) && (NIL != czer_utilities.generalized_ist_clauses_p(v_clauses))) {
            mt = $$UniversalVocabularyMt;
        }
        return values(czer_clauses, mt);
    }

    public static SubLObject clauses_syntactic_wff_check(final SubLObject v_clauses, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == v_clauses) || (NIL != cycl_grammar.cycl_truth_value_p(v_clauses))) {
            return values(v_clauses, mt);
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
            SubLObject cdolist_list_var = v_clauses;
            SubLObject clause_binding_list_pair = NIL;
            clause_binding_list_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject clause = clause_binding_list_pair.first();
                SubLObject syntactically_ill_formedP;
                SubLObject rest;
                SubLObject asent;
                for (syntactically_ill_formedP = NIL, rest = NIL, rest = clauses.neg_lits(clause); (NIL == syntactically_ill_formedP) && (NIL != rest); rest = rest.rest()) {
                    asent = rest.first();
                    if (NIL == cycl_grammar.cycl_sentence_p(asent)) {
                        syntactically_ill_formedP = T;
                    }
                }
                for (rest = NIL, rest = clauses.pos_lits(clause); (NIL == syntactically_ill_formedP) && (NIL != rest); rest = rest.rest()) {
                    asent = rest.first();
                    if (NIL == cycl_grammar.cycl_sentence_p(asent)) {
                        syntactically_ill_formedP = T;
                    }
                }
                if (NIL == syntactically_ill_formedP) {
                    result = cons(clause_binding_list_pair, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause_binding_list_pair = cdolist_list_var.first();
            } 
        } finally {
            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(result), mt);
    }

    public static final SubLObject psc_queryP_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != within_queryP()) && (NIL != psc.pscP(mt)));
    }

    public static SubLObject psc_queryP(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != within_queryP()) && (NIL != psc.pscP(mt)));
    }

    /**
     * Returns T iff ASSERTION won't recanonicalize to itself
     */
    @LispMethod(comment = "Returns T iff ASSERTION won\'t recanonicalize to itself")
    public static final SubLObject canonicalizer_problemP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            thread.resetMultipleValues();
            {
                SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
                SubLObject el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean(NIL == list_utilities.member_eqP(assertion, fi.sentence_assertions(el_formula, el_mt)));
            }
        }
    }

    @LispMethod(comment = "Returns T iff ASSERTION won\'t recanonicalize to itself")
    public static SubLObject canonicalizer_problemP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        thread.resetMultipleValues();
        final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(NIL == list_utilities.member_eqP(assertion, fi.sentence_assertions(el_formula, el_mt)));
    }/**
     * Returns T iff ASSERTION won't recanonicalize to itself
     */


    /**
     * Returns T iff ASSERTION won't recanonicalize to itself via the TL
     */
    @LispMethod(comment = "Returns T iff ASSERTION won\'t recanonicalize to itself via the TL")
    public static final SubLObject tl_canonicalizer_problemP_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return makeBoolean(NIL == subl_promotions.memberP(assertion, ke.find_assertions_via_tl(canon_tl.assertion_tl_formula(assertion), assertions_high.assertion_mt(assertion)), UNPROVIDED, UNPROVIDED));
    }

    @LispMethod(comment = "Returns T iff ASSERTION won\'t recanonicalize to itself via the TL")
    public static SubLObject tl_canonicalizer_problemP(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return makeBoolean(NIL == subl_promotions.memberP(assertion, ke.find_assertions_via_tl(canon_tl.assertion_tl_formula(assertion), assertions_high.assertion_mt(assertion)), UNPROVIDED, UNPROVIDED));
    }/**
     * Returns T iff ASSERTION won't recanonicalize to itself via the TL
     */


    /**
     *
     *
     * @return boolean; t iff TERM1 and TERM2 are equal modulo canonical reordering.
     */
    @LispMethod(comment = "@return boolean; t iff TERM1 and TERM2 are equal modulo canonical reordering.")
    public static final SubLObject terms_reorder_equalP_alt(SubLObject term1, SubLObject term2) {
        if (NIL != el_formula_p(term1)) {
            term1 = copy_formula(term1);
        }
        if (NIL != el_formula_p(term2)) {
            term2 = copy_formula(term2);
        }
        return equal(com.cyc.cycjava.cycl.czer_main.canonicalize_term_commutative_terms(term1), com.cyc.cycjava.cycl.czer_main.canonicalize_term_commutative_terms(term2));
    }

    /**
     *
     *
     * @return boolean; t iff TERM1 and TERM2 are equal modulo canonical reordering.
     */
    @LispMethod(comment = "@return boolean; t iff TERM1 and TERM2 are equal modulo canonical reordering.")
    public static SubLObject terms_reorder_equalP(SubLObject term1, SubLObject term2) {
        if (NIL != el_formula_p(term1)) {
            term1 = copy_formula(term1);
        }
        if (NIL != el_formula_p(term2)) {
            term2 = copy_formula(term2);
        }
        return equal(canonicalize_term_commutative_terms(term1), canonicalize_term_commutative_terms(term2));
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering and termOfUnit transformations.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering and termOfUnit transformations.")
    public static final SubLObject cnfs_reorder_tou_equalP_alt(SubLObject cnf1, SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(com.cyc.cycjava.cycl.czer_main.rename_clause_vars(com.cyc.cycjava.cycl.czer_main.sort_clause_literals(com.cyc.cycjava.cycl.czer_main.canonicalize_clause_commutative_terms(com.cyc.cycjava.cycl.czer_main.canonicalize_clause_transformable_nats(com.cyc.cycjava.cycl.czer_main.canonicalize_clause_commutative_terms(copy_clause(cnf1)))), varP), UNPROVIDED).first(), com.cyc.cycjava.cycl.czer_main.rename_clause_vars(com.cyc.cycjava.cycl.czer_main.sort_clause_literals(com.cyc.cycjava.cycl.czer_main.canonicalize_clause_commutative_terms(com.cyc.cycjava.cycl.czer_main.canonicalize_clause_transformable_nats(com.cyc.cycjava.cycl.czer_main.canonicalize_clause_commutative_terms(copy_clause(cnf2)))), varP), UNPROVIDED).first());
    }

    /**
     *
     *
     * @return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering and termOfUnit transformations.
     */
    @LispMethod(comment = "@return boolean; t iff CNF1 and CNF2 are equal modulo canonical literal and term reordering and termOfUnit transformations.")
    public static SubLObject cnfs_reorder_tou_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(rename_clause_vars(sort_clause_literals(canonicalize_clause_commutative_terms(canonicalize_clause_transformable_nats(canonicalize_clause_commutative_terms(copy_clause(cnf1)))), varP), UNPROVIDED).first(), rename_clause_vars(sort_clause_literals(canonicalize_clause_commutative_terms(canonicalize_clause_transformable_nats(canonicalize_clause_commutative_terms(copy_clause(cnf2)))), varP), UNPROVIDED).first());
    }

    /**
     * If there is a literal in LITERALS with a unique arity, it will return the literal with the minimum unique arity.
     * Otherwise returns NIL.
     */
    @LispMethod(comment = "If there is a literal in LITERALS with a unique arity, it will return the literal with the minimum unique arity.\r\nOtherwise returns NIL.\nIf there is a literal in LITERALS with a unique arity, it will return the literal with the minimum unique arity.\nOtherwise returns NIL.")
    public static final SubLObject unique_arity_literal_alt(SubLObject literals) {
        {
            SubLObject singleton_literals = NIL;
            SubLObject singleton_arities = NIL;
            SubLObject doubleton_arities = NIL;
            SubLObject cdolist_list_var = literals;
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                {
                    SubLObject v_arity = literal_arity(literal, UNPROVIDED);
                    if (NIL == subl_promotions.memberP(v_arity, doubleton_arities, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != subl_promotions.memberP(v_arity, singleton_arities, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject pos = position(v_arity, singleton_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                singleton_arities = list_utilities.delete_nth(pos, singleton_arities);
                                singleton_literals = list_utilities.delete_nth(pos, singleton_literals);
                                doubleton_arities = cons(v_arity, doubleton_arities);
                            }
                        } else {
                            singleton_arities = cons(v_arity, singleton_arities);
                            singleton_literals = cons(literal, singleton_literals);
                        }
                    }
                }
            }
            if (NIL != singleton_arities) {
                return nth(position(apply(symbol_function(MIN), singleton_arities), singleton_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), singleton_literals);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "If there is a literal in LITERALS with a unique arity, it will return the literal with the minimum unique arity.\r\nOtherwise returns NIL.\nIf there is a literal in LITERALS with a unique arity, it will return the literal with the minimum unique arity.\nOtherwise returns NIL.")
    public static SubLObject unique_arity_literal(final SubLObject literals) {
        SubLObject singleton_literals = NIL;
        SubLObject singleton_arities = NIL;
        SubLObject doubleton_arities = NIL;
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_arity = literal_arity(literal, UNPROVIDED);
            if (NIL == subl_promotions.memberP(v_arity, doubleton_arities, UNPROVIDED, UNPROVIDED)) {
                if (NIL != subl_promotions.memberP(v_arity, singleton_arities, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject pos = position(v_arity, singleton_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    singleton_arities = list_utilities.delete_nth(pos, singleton_arities);
                    singleton_literals = list_utilities.delete_nth(pos, singleton_literals);
                    doubleton_arities = cons(v_arity, doubleton_arities);
                } else {
                    singleton_arities = cons(v_arity, singleton_arities);
                    singleton_literals = cons(literal, singleton_literals);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        if (NIL != singleton_arities) {
            return nth(position(apply(symbol_function(MIN), singleton_arities), singleton_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), singleton_literals);
        }
        return NIL;
    }/**
     * If there is a literal in LITERALS with a unique arity, it will return the literal with the minimum unique arity.
     * Otherwise returns NIL.
     */


    /**
     * If there is a literal in LITERALS with a unique list structure, it will return the minimum literal with a unique list structure.
     * Otherwise returns NIL.
     */
    @LispMethod(comment = "If there is a literal in LITERALS with a unique list structure, it will return the minimum literal with a unique list structure.\r\nOtherwise returns NIL.\nIf there is a literal in LITERALS with a unique list structure, it will return the minimum literal with a unique list structure.\nOtherwise returns NIL.")
    public static final SubLObject unique_list_structure_literal_alt(SubLObject literals) {
        {
            SubLObject list_structures = Mapping.mapcar(symbol_function(LIST_STRUCTURE), literals);
            SubLObject singleton_list_structures = NIL;
            SubLObject doubleton_list_structures = NIL;
            SubLObject cdolist_list_var = list_structures;
            SubLObject list_structure = NIL;
            for (list_structure = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , list_structure = cdolist_list_var.first()) {
                if (NIL == subl_promotions.memberP(list_structure, doubleton_list_structures, symbol_function(EQUAL), UNPROVIDED)) {
                    if (NIL != subl_promotions.memberP(list_structure, singleton_list_structures, symbol_function(EQUAL), UNPROVIDED)) {
                        singleton_list_structures = delete(list_structure, singleton_list_structures, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        doubleton_list_structures = cons(list_structure, doubleton_list_structures);
                    } else {
                        singleton_list_structures = cons(list_structure, singleton_list_structures);
                    }
                }
            }
            if (NIL != singleton_list_structures) {
                return nth(position(list_utilities.list_structure_min(singleton_list_structures), list_structures, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), literals);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "If there is a literal in LITERALS with a unique list structure, it will return the minimum literal with a unique list structure.\r\nOtherwise returns NIL.\nIf there is a literal in LITERALS with a unique list structure, it will return the minimum literal with a unique list structure.\nOtherwise returns NIL.")
    public static SubLObject unique_list_structure_literal(final SubLObject literals) {
        final SubLObject list_structures = Mapping.mapcar(symbol_function(LIST_STRUCTURE), literals);
        SubLObject singleton_list_structures = NIL;
        SubLObject doubleton_list_structures = NIL;
        SubLObject cdolist_list_var = list_structures;
        SubLObject list_structure = NIL;
        list_structure = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(list_structure, doubleton_list_structures, symbol_function(EQUAL), UNPROVIDED)) {
                if (NIL != subl_promotions.memberP(list_structure, singleton_list_structures, symbol_function(EQUAL), UNPROVIDED)) {
                    singleton_list_structures = delete(list_structure, singleton_list_structures, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    doubleton_list_structures = cons(list_structure, doubleton_list_structures);
                } else {
                    singleton_list_structures = cons(list_structure, singleton_list_structures);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            list_structure = cdolist_list_var.first();
        } 
        if (NIL != singleton_list_structures) {
            return nth(position(list_utilities.list_structure_min(singleton_list_structures), list_structures, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), literals);
        }
        return NIL;
    }/**
     * If there is a literal in LITERALS with a unique list structure, it will return the minimum literal with a unique list structure.
     * Otherwise returns NIL.
     */


    public static final SubLObject old_last_resort_literal_alt(SubLObject literals, SubLObject candidates, SubLObject varP) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        {
            SubLObject literal = com.cyc.cycjava.cycl.czer_main.default_preference_lit(literals);
            if (NIL != literal) {
                return literal;
            } else {
                return com.cyc.cycjava.cycl.czer_main.alphabetically_minimal_literal(literals, candidates, varP);
            }
        }
    }

    public static SubLObject old_last_resort_literal(final SubLObject literals, SubLObject candidates, SubLObject varP) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        final SubLObject literal = default_preference_lit(literals);
        if (NIL != literal) {
            return literal;
        }
        return alphabetically_minimal_literal(literals, candidates, varP);
    }

    public static final SubLObject alphabetically_minimal_literal_alt(SubLObject literals, SubLObject candidates, SubLObject varP) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals.first();
        } else {
            return com.cyc.cycjava.cycl.czer_main.new_alphabetically_minimal_literal_int(literals, candidates, varP);
        }
    }

    public static SubLObject alphabetically_minimal_literal(final SubLObject literals, SubLObject candidates, SubLObject varP) {
        if (candidates == UNPROVIDED) {
            candidates = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals.first();
        }
        return new_alphabetically_minimal_literal_int(literals, candidates, varP);
    }

    public static final SubLObject new_alphabetically_minimal_literal_int_alt(SubLObject literals, SubLObject candidates, SubLObject varP) {
        if (candidates == UNPROVIDED) {
            candidates = literals;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        {
            SubLObject ans = list(literals.first());
            SubLObject ans_string = string_utilities.str(formula_non_var_symbols(ans.first(), varP));
            SubLObject cdolist_list_var = literals.rest();
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                {
                    SubLObject lit_string = string_utilities.str(formula_non_var_symbols(literal, varP));
                    if (NIL != Strings.stringL(lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        ans_string = lit_string;
                        ans = list(literal);
                    } else {
                        if (NIL != Strings.stringE(lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            ans = cons(literal, ans);
                        }
                    }
                }
            }
            if (NIL != list_utilities.singletonP(ans)) {
                return ans.first();
            }
            {
                SubLObject candidates_1 = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals(list_utilities.ordered_set_difference(literals, ans, symbol_function(EQUAL), UNPROVIDED));
                if (NIL != list_utilities.singletonP(candidates_1)) {
                    return candidates_1.first();
                }
                {
                    SubLObject candidates_2 = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals(list_utilities.ordered_set_difference(candidates, literals, symbol_function(EQUAL), UNPROVIDED));
                    if (NIL != list_utilities.singletonP(candidates_2)) {
                        return candidates_2.first();
                    }
                    {
                        SubLObject candidates_3 = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals(candidates);
                        if (NIL != list_utilities.singletonP(candidates_3)) {
                            return candidates_3.first();
                        }
                        {
                            SubLObject length_0 = (NIL != ans) ? ((SubLObject) (length(ans))) : $most_positive_fixnum$.getGlobalValue();
                            SubLObject length_1 = (NIL != candidates_1) ? ((SubLObject) (length(candidates_1))) : $most_positive_fixnum$.getGlobalValue();
                            SubLObject length_2 = (NIL != candidates_2) ? ((SubLObject) (length(candidates_2))) : $most_positive_fixnum$.getGlobalValue();
                            SubLObject length_3 = (NIL != candidates_3) ? ((SubLObject) (length(candidates_3))) : $most_positive_fixnum$.getGlobalValue();
                            SubLObject min = min(length_0, new SubLObject[]{ length_1, length_2, length_3 });
                            if (min.numE(length_0)) {
                                return com.cyc.cycjava.cycl.czer_main.new_alphabetically_minimal_literal_int_2(com.cyc.cycjava.cycl.czer_main.default_lit_sort(ans), varP);
                            } else {
                                if (min.numE(length_1)) {
                                    return com.cyc.cycjava.cycl.czer_main.new_alphabetically_minimal_literal_int_2(com.cyc.cycjava.cycl.czer_main.default_lit_sort(candidates_1), varP);
                                } else {
                                    if (min.numE(length_2)) {
                                        return com.cyc.cycjava.cycl.czer_main.new_alphabetically_minimal_literal_int_2(com.cyc.cycjava.cycl.czer_main.default_lit_sort(candidates_2), varP);
                                    } else {
                                        if (min.numE(length_3)) {
                                            return com.cyc.cycjava.cycl.czer_main.new_alphabetically_minimal_literal_int_2(com.cyc.cycjava.cycl.czer_main.default_lit_sort(candidates_3), varP);
                                        } else {
                                            return com.cyc.cycjava.cycl.czer_main.new_alphabetically_minimal_literal_int_2(com.cyc.cycjava.cycl.czer_main.default_lit_sort(literals), varP);
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

    public static SubLObject new_alphabetically_minimal_literal_int(final SubLObject literals, SubLObject candidates, SubLObject varP) {
        if (candidates == UNPROVIDED) {
            candidates = literals;
        }
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        SubLObject ans = list(literals.first());
        SubLObject ans_string = string_utilities.str(formula_non_var_symbols(ans.first(), varP));
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lit_string = string_utilities.str(formula_non_var_symbols(literal, varP));
            if (NIL != Strings.stringL(lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ans_string = lit_string;
                ans = list(literal);
            } else
                if (NIL != Strings.stringE(lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ans = cons(literal, ans);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.singletonP(ans)) {
            return ans.first();
        }
        final SubLObject candidates_1 = last_resort_min_literals(list_utilities.ordered_set_difference(literals, ans, symbol_function(EQUAL), UNPROVIDED));
        if (NIL != list_utilities.singletonP(candidates_1)) {
            return candidates_1.first();
        }
        final SubLObject candidates_2 = last_resort_min_literals(list_utilities.ordered_set_difference(candidates, literals, symbol_function(EQUAL), UNPROVIDED));
        if (NIL != list_utilities.singletonP(candidates_2)) {
            return candidates_2.first();
        }
        final SubLObject candidates_3 = last_resort_min_literals(candidates);
        if (NIL != list_utilities.singletonP(candidates_3)) {
            return candidates_3.first();
        }
        final SubLObject length_0 = (NIL != ans) ? length(ans) : $most_positive_fixnum$.getGlobalValue();
        final SubLObject length_2 = (NIL != candidates_1) ? length(candidates_1) : $most_positive_fixnum$.getGlobalValue();
        final SubLObject length_3 = (NIL != candidates_2) ? length(candidates_2) : $most_positive_fixnum$.getGlobalValue();
        final SubLObject length_4 = (NIL != candidates_3) ? length(candidates_3) : $most_positive_fixnum$.getGlobalValue();
        final SubLObject min = min(length_0, new SubLObject[]{ length_2, length_3, length_4 });
        if (min.numE(length_0)) {
            return new_alphabetically_minimal_literal_int_2(default_lit_sort(ans), varP);
        }
        if (min.numE(length_2)) {
            return new_alphabetically_minimal_literal_int_2(default_lit_sort(candidates_1), varP);
        }
        if (min.numE(length_3)) {
            return new_alphabetically_minimal_literal_int_2(default_lit_sort(candidates_2), varP);
        }
        if (min.numE(length_4)) {
            return new_alphabetically_minimal_literal_int_2(default_lit_sort(candidates_3), varP);
        }
        return new_alphabetically_minimal_literal_int_2(default_lit_sort(literals), varP);
    }

    public static final SubLObject new_alphabetically_minimal_literal_int_2_alt(SubLObject literals, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (NIL != list_utilities.tree_find_if(varP, literals, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.czer_main.new_alphabetically_minimal_literal_int(literals, literals, symbol_function(FALSE));
        } else {
            return literals.first();
        }
    }

    public static SubLObject new_alphabetically_minimal_literal_int_2(final SubLObject literals, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (NIL != list_utilities.tree_find_if(varP, literals, UNPROVIDED)) {
            return new_alphabetically_minimal_literal_int(literals, literals, symbol_function(FALSE));
        }
        return literals.first();
    }

    public static final SubLObject old_commutative_terms_in_orderP_alt(SubLObject term1, SubLObject term2) {
        if (term1.isAtom()) {
            if (term2.isAtom()) {
                return com.cyc.cycjava.cycl.czer_main.old_commutative_atoms_in_orderP(term1, term2);
            } else {
                return T;
            }
        } else {
            if (term2.isAtom()) {
                return NIL;
            } else {
                return com.cyc.cycjava.cycl.czer_main.old_commutative_conses_in_orderP(term1, term2);
            }
        }
    }

    public static SubLObject old_commutative_terms_in_orderP(final SubLObject term1, final SubLObject term2) {
        if (term1.isAtom()) {
            if (term2.isAtom()) {
                return old_commutative_atoms_in_orderP(term1, term2);
            }
            return T;
        } else {
            if (term2.isAtom()) {
                return NIL;
            }
            return old_commutative_conses_in_orderP(term1, term2);
        }
    }

    public static final SubLObject old_commutative_atoms_in_orderP_alt(SubLObject atom1, SubLObject atom2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == czer_vars.$control_3$.getDynamicValue(thread)) && atom1.equal(atom2)) {
                return T;
            }
            if (NIL != constant_p(atom1)) {
                if (NIL != constant_p(atom2)) {
                    return com.cyc.cycjava.cycl.czer_main.canonicalizer_constant_L(atom1, atom2);
                } else {
                    return T;
                }
            } else {
                if (NIL != constant_p(atom2)) {
                    return NIL;
                } else {
                    if (NIL != nart_handles.nart_p(atom1)) {
                        if (NIL != nart_handles.nart_p(atom2)) {
                            return numL(nart_handles.nart_id(atom1), nart_handles.nart_id(atom2));
                        } else {
                            return T;
                        }
                    } else {
                        if (NIL != nart_handles.nart_p(atom2)) {
                            return NIL;
                        } else {
                            if (NIL != cycl_variables.el_varP(atom1)) {
                                if (NIL != cycl_variables.el_varP(atom2)) {
                                    return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else {
                                    return T;
                                }
                            } else {
                                if (NIL != cycl_variables.el_varP(atom2)) {
                                    return NIL;
                                } else {
                                    if (NIL != cycl_variables.kb_varP(atom1)) {
                                        if (NIL != cycl_variables.kb_varP(atom2)) {
                                            return numL(variables.variable_id(atom1), variables.variable_id(atom2));
                                        } else {
                                            return T;
                                        }
                                    } else {
                                        if (NIL != cycl_variables.kb_varP(atom1)) {
                                            return NIL;
                                        } else {
                                            if (atom1.isSymbol()) {
                                                if (atom2.isSymbol()) {
                                                    return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    return T;
                                                }
                                            } else {
                                                if (atom2.isSymbol()) {
                                                    return NIL;
                                                } else {
                                                    if (atom1.isNumber()) {
                                                        if (atom2.isNumber()) {
                                                            return numL(atom1, atom2);
                                                        } else {
                                                            return T;
                                                        }
                                                    } else {
                                                        if (atom2.isNumber()) {
                                                            return NIL;
                                                        } else {
                                                            if (atom1.isChar()) {
                                                                if (atom2.isChar()) {
                                                                    return char_lessp(atom1, atom2);
                                                                } else {
                                                                    return T;
                                                                }
                                                            } else {
                                                                if (atom2.isChar()) {
                                                                    return NIL;
                                                                } else {
                                                                    if (atom1.isString()) {
                                                                        if (atom2.isString()) {
                                                                            return Strings.string_lessp(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            return T;
                                                                        }
                                                                    } else {
                                                                        if (atom2.isString()) {
                                                                            return NIL;
                                                                        } else {
                                                                            return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        }
    }

    public static SubLObject old_commutative_atoms_in_orderP(final SubLObject atom1, final SubLObject atom2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == czer_vars.$control_3$.getDynamicValue(thread)) && atom1.equal(atom2)) {
            return T;
        }
        if (NIL != constant_p(atom1)) {
            if (NIL != constant_p(atom2)) {
                return canonicalizer_constant_L(atom1, atom2);
            }
            return T;
        } else {
            if (NIL != constant_p(atom2)) {
                return NIL;
            }
            if (NIL != nart_handles.nart_p(atom1)) {
                if (NIL != nart_handles.nart_p(atom2)) {
                    return numL(nart_handles.nart_id(atom1), nart_handles.nart_id(atom2));
                }
                return T;
            } else {
                if (NIL != nart_handles.nart_p(atom2)) {
                    return NIL;
                }
                if (NIL != cycl_variables.el_varP(atom1)) {
                    if (NIL != cycl_variables.el_varP(atom2)) {
                        return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return T;
                } else {
                    if (NIL != cycl_variables.el_varP(atom2)) {
                        return NIL;
                    }
                    if (NIL != cycl_variables.kb_varP(atom1)) {
                        if (NIL != cycl_variables.kb_varP(atom2)) {
                            return numL(variables.variable_id(atom1), variables.variable_id(atom2));
                        }
                        return T;
                    } else {
                        if (NIL != cycl_variables.kb_varP(atom1)) {
                            return NIL;
                        }
                        if (atom1.isSymbol()) {
                            if (atom2.isSymbol()) {
                                return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            return T;
                        } else {
                            if (atom2.isSymbol()) {
                                return NIL;
                            }
                            if (atom1.isNumber()) {
                                if (atom2.isNumber()) {
                                    return numL(atom1, atom2);
                                }
                                return T;
                            } else {
                                if (atom2.isNumber()) {
                                    return NIL;
                                }
                                if (atom1.isChar()) {
                                    if (atom2.isChar()) {
                                        return char_lessp(atom1, atom2);
                                    }
                                    return T;
                                } else {
                                    if (atom2.isChar()) {
                                        return NIL;
                                    }
                                    if (atom1.isString()) {
                                        if (atom2.isString()) {
                                            return Strings.string_lessp(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        return T;
                                    } else {
                                        if (atom2.isString()) {
                                            return NIL;
                                        }
                                        return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject old_commutative_conses_in_orderP_alt(SubLObject cons1, SubLObject cons2) {
        {
            SubLObject var_num1 = list_utilities.tree_count_if(symbol_function($sym54$EL_VAR_), cons1, UNPROVIDED);
            SubLObject var_num2 = list_utilities.tree_count_if(symbol_function($sym54$EL_VAR_), cons2, UNPROVIDED);
            if (var_num1.numL(var_num2)) {
                return T;
            } else {
                if (var_num1.numG(var_num2)) {
                    return NIL;
                } else {
                    {
                        SubLObject atom_num1 = list_utilities.tree_count_if(symbol_function(ATOM), cons1, UNPROVIDED);
                        SubLObject atom_num2 = list_utilities.tree_count_if(symbol_function(ATOM), cons2, UNPROVIDED);
                        if (atom_num1.numL(atom_num2)) {
                            return T;
                        } else {
                            if (atom_num1.numG(atom_num2)) {
                                return NIL;
                            } else {
                                if ((!cons1.first().equal(cons2.first())) && (NIL != com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(cons1.first(), cons2.first()))) {
                                    return T;
                                } else {
                                    if ((!cons1.first().equal(cons2.first())) && (NIL != com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(cons2.first(), cons1.first()))) {
                                        return NIL;
                                    } else {
                                        return com.cyc.cycjava.cycl.czer_main.commutative_terms_in_orderP(cons1.rest(), cons2.rest());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject old_commutative_conses_in_orderP(final SubLObject cons1, final SubLObject cons2) {
        final SubLObject var_num1 = list_utilities.tree_count_if(symbol_function($sym53$EL_VAR_), cons1, UNPROVIDED);
        final SubLObject var_num2 = list_utilities.tree_count_if(symbol_function($sym53$EL_VAR_), cons2, UNPROVIDED);
        if (var_num1.numL(var_num2)) {
            return T;
        }
        if (var_num1.numG(var_num2)) {
            return NIL;
        }
        final SubLObject atom_num1 = list_utilities.tree_count_if(symbol_function(ATOM), cons1, UNPROVIDED);
        final SubLObject atom_num2 = list_utilities.tree_count_if(symbol_function(ATOM), cons2, UNPROVIDED);
        if (atom_num1.numL(atom_num2)) {
            return T;
        }
        if (atom_num1.numG(atom_num2)) {
            return NIL;
        }
        if ((!cons1.first().equal(cons2.first())) && (NIL != commutative_terms_in_orderP(cons1.first(), cons2.first()))) {
            return T;
        }
        if ((!cons1.first().equal(cons2.first())) && (NIL != commutative_terms_in_orderP(cons2.first(), cons1.first()))) {
            return NIL;
        }
        return commutative_terms_in_orderP(cons1.rest(), cons2.rest());
    }

    public static final SubLObject last_resort_min_literals_alt(SubLObject literals) {
        {
            SubLObject selected = NIL;
            SubLObject remaining = NIL;
            for (selected = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_int(literals), remaining = list_utilities.ordered_set_difference(literals, selected, symbol_function(EQUAL), UNPROVIDED); !((NIL != list_utilities.singletonP(selected)) || (NIL == remaining)); selected = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_int(remaining) , remaining = list_utilities.ordered_set_difference(remaining, selected, symbol_function(EQUAL), UNPROVIDED)) {
            }
            if (NIL != selected) {
                return selected;
            } else {
                if (NIL != remaining) {
                    return remaining;
                } else {
                    if (NIL != literals) {
                        return literals;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject last_resort_min_literals(final SubLObject literals) {
        SubLObject selected;
        SubLObject remaining;
        for (selected = NIL, remaining = NIL, selected = last_resort_min_literals_int(literals), remaining = list_utilities.ordered_set_difference(literals, selected, symbol_function(EQUAL), UNPROVIDED); (NIL == list_utilities.singletonP(selected)) && (NIL != remaining); selected = last_resort_min_literals_int(remaining) , remaining = list_utilities.ordered_set_difference(remaining, selected, symbol_function(EQUAL), UNPROVIDED)) {
        }
        if (NIL != selected) {
            return selected;
        }
        if (NIL != remaining) {
            return remaining;
        }
        if (NIL != literals) {
            return literals;
        }
        return NIL;
    }

    public static final SubLObject last_resort_min_literals_int_alt(SubLObject literals) {
        if (NIL != literals) {
            if (NIL != list_utilities.singletonP(literals)) {
                return literals;
            }
            {
                SubLObject min_candidates = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_min(literals);
                if (NIL != list_utilities.singletonP(min_candidates)) {
                    return min_candidates;
                }
                {
                    SubLObject max_candidates = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_max(literals);
                    if (NIL != list_utilities.singletonP(max_candidates)) {
                        return max_candidates;
                    }
                    if (length(min_candidates).numLE(length(max_candidates))) {
                        return min_candidates;
                    } else {
                        return max_candidates;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject last_resort_min_literals_int(final SubLObject literals) {
        if (NIL == literals) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(literals)) {
            return literals;
        }
        final SubLObject min_candidates = last_resort_min_literals_min(literals);
        if (NIL != list_utilities.singletonP(min_candidates)) {
            return min_candidates;
        }
        final SubLObject max_candidates = last_resort_min_literals_max(literals);
        if (NIL != list_utilities.singletonP(max_candidates)) {
            return max_candidates;
        }
        if (length(min_candidates).numLE(length(max_candidates))) {
            return min_candidates;
        }
        return max_candidates;
    }

    public static final SubLObject last_resort_min_literals_min_alt(SubLObject literals) {
        {
            SubLObject result = list(literals.first());
            SubLObject value = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_fn(result.first());
            SubLObject cdolist_list_var = literals.rest();
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                {
                    SubLObject lit_value = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_fn(literal);
                    if (lit_value.numL(value)) {
                        value = lit_value;
                        result = list(literal);
                    } else {
                        if (lit_value.numE(value)) {
                            result = cons(literal, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject last_resort_min_literals_min(final SubLObject literals) {
        SubLObject result = list(literals.first());
        SubLObject value = last_resort_min_literals_fn(result.first());
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lit_value = last_resort_min_literals_fn(literal);
            if (lit_value.numL(value)) {
                value = lit_value;
                result = list(literal);
            } else
                if (lit_value.numE(value)) {
                    result = cons(literal, result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @unknown this function must die as soon as the recanonicalizer works -eca
     */
    @LispMethod(comment = "@unknown this function must die as soon as the recanonicalizer works -eca")
    public static final SubLObject constant_median_alt(SubLObject constants) {
        return list_utilities.parametrized_median(constants, symbol_function($sym120$CONSTANT_EXTERNAL_ID__));
    }

    /**
     *
     *
     * @unknown this function must die as soon as the recanonicalizer works -eca
     */
    @LispMethod(comment = "@unknown this function must die as soon as the recanonicalizer works -eca")
    public static SubLObject constant_median(final SubLObject constants) {
        return list_utilities.parametrized_median(constants, symbol_function($sym128$CONSTANT_EXTERNAL_ID__));
    }

    /**
     *
     *
     * @unknown this function must die as soon as the recanonicalizer works -eca
     */
    @LispMethod(comment = "@unknown this function must die as soon as the recanonicalizer works -eca")
    public static final SubLObject ugly_thing_L_alt(SubLObject ugly1, SubLObject ugly2) {
        if (ugly1.eql($most_positive_fixnum$.getGlobalValue())) {
            return NIL;
        } else {
            if (ugly2.eql($most_positive_fixnum$.getGlobalValue())) {
                return T;
            } else {
                return constants_high.constant_external_id_L(ugly1, ugly2);
            }
        }
    }

    /**
     *
     *
     * @unknown this function must die as soon as the recanonicalizer works -eca
     */
    @LispMethod(comment = "@unknown this function must die as soon as the recanonicalizer works -eca")
    public static SubLObject ugly_thing_L(final SubLObject ugly1, final SubLObject ugly2) {
        if (ugly1.eql($most_positive_fixnum$.getGlobalValue())) {
            return NIL;
        }
        if (ugly2.eql($most_positive_fixnum$.getGlobalValue())) {
            return T;
        }
        return constants_high.constant_external_id_L(ugly1, ugly2);
    }

    /**
     *
     *
     * @unknown this function must die as soon as the recanonicalizer works -eca
     */
    @LispMethod(comment = "@unknown this function must die as soon as the recanonicalizer works -eca")
    public static final SubLObject ugly_thing_G_alt(SubLObject ugly1, SubLObject ugly2) {
        return makeBoolean((NIL == com.cyc.cycjava.cycl.czer_main.ugly_thing_L(ugly1, ugly2)) && (!ugly1.equal(ugly2)));
    }

    /**
     *
     *
     * @unknown this function must die as soon as the recanonicalizer works -eca
     */
    @LispMethod(comment = "@unknown this function must die as soon as the recanonicalizer works -eca")
    public static SubLObject ugly_thing_G(final SubLObject ugly1, final SubLObject ugly2) {
        return makeBoolean((NIL == ugly_thing_L(ugly1, ugly2)) && (!ugly1.equal(ugly2)));
    }

    public static final SubLObject last_resort_min_literals_max_alt(SubLObject literals) {
        {
            SubLObject result = list(literals.first());
            SubLObject value = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_fn(result.first());
            SubLObject cdolist_list_var = literals.rest();
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                {
                    SubLObject lit_value = com.cyc.cycjava.cycl.czer_main.last_resort_min_literals_fn(literal);
                    if (NIL != com.cyc.cycjava.cycl.czer_main.ugly_thing_G(lit_value, value)) {
                        value = lit_value;
                        result = list(literal);
                    } else {
                        if (lit_value.equal(value)) {
                            result = cons(literal, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject last_resort_min_literals_max(final SubLObject literals) {
        SubLObject result = list(literals.first());
        SubLObject value = last_resort_min_literals_fn(result.first());
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lit_value = last_resort_min_literals_fn(literal);
            if (NIL != ugly_thing_G(lit_value, value)) {
                value = lit_value;
                result = list(literal);
            } else
                if (lit_value.equal(value)) {
                    result = cons(literal, result);
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject last_resort_min_literals_fn_alt(SubLObject lit) {
        {
            SubLObject constants = cycl_utilities.expression_gather(lit, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject value = com.cyc.cycjava.cycl.czer_main.constant_median(constants);
            if (NIL != constants_high.constant_external_id_p(value)) {
                return value;
            } else {
                return $most_positive_fixnum$.getGlobalValue();
            }
        }
    }

    public static SubLObject last_resort_min_literals_fn(final SubLObject lit) {
        final SubLObject constants = cycl_utilities.expression_gather(lit, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject value = constant_median(constants);
        if (NIL != constants_high.constant_external_id_p(value)) {
            return value;
        }
        return $most_positive_fixnum$.getGlobalValue();
    }

    public static final SubLObject declare_czer_main_file_alt() {
        declareFunction("el_to_hl", "EL-TO-HL", 1, 1, false);
        declareFunction("el_to_hl_query", "EL-TO-HL-QUERY", 1, 1, false);
        declareFunction("el_to_hl_fast", "EL-TO-HL-FAST", 1, 1, false);
        declareFunction("el_to_hl_really_fast", "EL-TO-HL-REALLY-FAST", 1, 1, false);
        declareFunction("canonicalize_term", "CANONICALIZE-TERM", 1, 1, false);
        declareFunction("canonicalize_term_memoized", "CANONICALIZE-TERM-MEMOIZED", 1, 1, false);
        declareFunction("canonicalize_term_memoized_int_internal", "CANONICALIZE-TERM-MEMOIZED-INT-INTERNAL", 2, 0, false);
        declareFunction("canonicalize_term_memoized_int", "CANONICALIZE-TERM-MEMOIZED-INT", 2, 0, false);
        declareFunction("canonicalize_term_assert", "CANONICALIZE-TERM-ASSERT", 1, 1, false);
        declareFunction("coerce_to_fort", "COERCE-TO-FORT", 1, 0, false);
        declareFunction("canonicalize_gaf", "CANONICALIZE-GAF", 2, 0, false);
        declareFunction("canonicalize_wf_gaf", "CANONICALIZE-WF-GAF", 2, 0, false);
        declareFunction("ncanonicalize_cycl", "NCANONICALIZE-CYCL", 1, 1, false);
        declareFunction("canonicalize_cycl", "CANONICALIZE-CYCL", 1, 1, false);
        declareFunction("canonicalize_cycl_int", "CANONICALIZE-CYCL-INT", 1, 5, false);
        declareFunction("clothe_naked_skolems", "CLOTHE-NAKED-SKOLEMS", 1, 0, false);
        declareFunction("czer_result_quiescedP", "CZER-RESULT-QUIESCED?", 2, 0, false);
        declareFunction("canonicalize_cycl_sentence", "CANONICALIZE-CYCL-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_cycl_test", "CANONICALIZE-CYCL-TEST", 1, 1, false);
        declareFunction("canonicalize_wf_cycl", "CANONICALIZE-WF-CYCL", 1, 1, false);
        declareFunction("canonicalize_wf_cycl_memoized", "CANONICALIZE-WF-CYCL-MEMOIZED", 1, 1, false);
        declareFunction("canonicalize_wf_cycl_int_memoized_internal", "CANONICALIZE-WF-CYCL-INT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("canonicalize_wf_cycl_int_memoized", "CANONICALIZE-WF-CYCL-INT-MEMOIZED", 2, 0, false);
        declareFunction("canonicalize_wf_cycl_sentence", "CANONICALIZE-WF-CYCL-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_ask_memoized", "CANONICALIZE-ASK-MEMOIZED", 1, 1, false);
        declareFunction("canonicalize_ask_int_memoized_internal", "CANONICALIZE-ASK-INT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("canonicalize_ask_int_memoized", "CANONICALIZE-ASK-INT-MEMOIZED", 2, 0, false);
        declareFunction("canonicalize_ask", "CANONICALIZE-ASK", 1, 1, false);
        declareFunction("canonicalize_ask_mt", "CANONICALIZE-ASK-MT", 1, 0, false);
        declareFunction("canonicalize_ask_sentence", "CANONICALIZE-ASK-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_assert", "CANONICALIZE-ASSERT", 1, 1, false);
        declareFunction("test_canonicalize_assert", "TEST-CANONICALIZE-ASSERT", 1, 1, false);
        declareFunction("canonicalize_assert_mt", "CANONICALIZE-ASSERT-MT", 1, 0, false);
        declareFunction("canonicalize_mt", "CANONICALIZE-MT", 1, 0, false);
        declareFunction("canonicalize_assert_sentence", "CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
        declareFunction("test_canonicalize_assert_sentence", "TEST-CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_wf_assert_sentence", "CANONICALIZE-WF-ASSERT-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_unassert", "CANONICALIZE-UNASSERT", 1, 1, false);
        declareFunction("canonicalize_unassert_sentence", "CANONICALIZE-UNASSERT-SENTENCE", 1, 1, false);
        declareFunction("ncanonicalize_query", "NCANONICALIZE-QUERY", 1, 1, false);
        declareFunction("canonicalize_query", "CANONICALIZE-QUERY", 1, 3, false);
        declareFunction("canonicalize_query_sentence", "CANONICALIZE-QUERY-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_expression", "CANONICALIZE-EXPRESSION", 1, 2, false);
        declareFunction("clausify_eliminating_ists", "CLAUSIFY-ELIMINATING-ISTS", 4, 0, false);
        declareFunction("remove_newly_introduced_variables_from_bindings", "REMOVE-NEWLY-INTRODUCED-VARIABLES-FROM-BINDINGS", 2, 0, false);
        declareFunction("clear_canon_caches", "CLEAR-CANON-CACHES", 0, 0, false);
        declareFunction("canon_wffP", "CANON-WFF?", 1, 1, false);
        declareFunction("check_wff_arityP", "CHECK-WFF-ARITY?", 0, 0, false);
        declareFunction("check_wff_semanticsP", "CHECK-WFF-SEMANTICS?", 0, 1, false);
        declareFunction("canonicalize_clauses_terms", "CANONICALIZE-CLAUSES-TERMS", 1, 0, false);
        declareFunction("canonicalize_clauses_quoted_terms", "CANONICALIZE-CLAUSES-QUOTED-TERMS", 1, 0, false);
        declareFunction("canonicalize_clause_quoted_terms", "CANONICALIZE-CLAUSE-QUOTED-TERMS", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$canonicalize_clause_quoted_terms$UnaryFunction();
        declareFunction("canonicalize_literals_quoted_terms", "CANONICALIZE-LITERALS-QUOTED-TERMS", 1, 0, false);
        declareFunction("canonicalize_literal_quoted_terms_recursive", "CANONICALIZE-LITERAL-QUOTED-TERMS-RECURSIVE", 1, 0, false);
        declareFunction("canonicalize_quoted_term", "CANONICALIZE-QUOTED-TERM", 1, 1, false);
        declareFunction("unquote_quoted_term", "UNQUOTE-QUOTED-TERM", 1, 1, false);
        declareFunction("canonicalize_clauses_sentence_terms", "CANONICALIZE-CLAUSES-SENTENCE-TERMS", 1, 0, false);
        declareFunction("canonicalize_no_sentence_argsP", "CANONICALIZE-NO-SENTENCE-ARGS?", 0, 0, false);
        declareFunction("canonicalize_clause_sentence_terms", "CANONICALIZE-CLAUSE-SENTENCE-TERMS", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$canonicalize_clause_sentence_terms$UnaryFunction();
        declareFunction("unnegate_and_flip_negated_lits", "UNNEGATE-AND-FLIP-NEGATED-LITS", 2, 0, false);
        declareFunction("canonicalize_literal_sentence_terms", "CANONICALIZE-LITERAL-SENTENCE-TERMS", 1, 1, false);
        new com.cyc.cycjava.cycl.czer_main.$canonicalize_literal_sentence_terms$UnaryFunction();
        new com.cyc.cycjava.cycl.czer_main.$canonicalize_literal_sentence_terms$BinaryFunction();
        declareFunction("canonicalize_function_sentence_terms", "CANONICALIZE-FUNCTION-SENTENCE-TERMS", 1, 1, false);
        declareFunction("canonicalize_relation_sentence_terms", "CANONICALIZE-RELATION-SENTENCE-TERMS", 1, 1, false);
        declareFunction("canonicalize_clauses_commutative_terms_destructive", "CANONICALIZE-CLAUSES-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        declareFunction("canonicalize_clause_commutative_terms", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_clause_commutative_terms_destructive", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$canonicalize_clause_commutative_terms_destructive$UnaryFunction();
        declareFunction("never_commutative_gaf_clauseP", "NEVER-COMMUTATIVE-GAF-CLAUSE?", 1, 0, false);
        declareFunction("canonicalize_literals_commutative_terms", "CANONICALIZE-LITERALS-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_literal_commutative_terms", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_literal_commutative_terms_destructive", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$canonicalize_literal_commutative_terms_destructive$UnaryFunction();
        declareFunction("canonicalize_literal_commutative_args", "CANONICALIZE-LITERAL-COMMUTATIVE-ARGS", 1, 0, false);
        declareFunction("order_commutative_terms", "ORDER-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_terms_commutative_terms_without_reordering", "CANONICALIZE-TERMS-COMMUTATIVE-TERMS-WITHOUT-REORDERING", 2, 0, false);
        declareFunction("canonicalize_term_commutative_terms", "CANONICALIZE-TERM-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("unary_function_commutes_with_its_argumentP", "UNARY-FUNCTION-COMMUTES-WITH-ITS-ARGUMENT?", 1, 0, false);
        declareFunction("canonicalize_commuting_function", "CANONICALIZE-COMMUTING-FUNCTION", 1, 0, false);
        declareFunction("canonicalize_nat_commutative_terms", "CANONICALIZE-NAT-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_relation_commutative_terms", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_relation_commutative_terms_destructive", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        declareFunction("sort_relation_commutative_terms", "SORT-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("sort_partially_commutative_terms", "SORT-PARTIALLY-COMMUTATIVE-TERMS", 3, 0, false);
        declareFunction("commutative_argnums", "COMMUTATIVE-ARGNUMS", 1, 0, false);
        declareFunction("ok_wrt_partial_commutativityP", "OK-WRT-PARTIAL-COMMUTATIVITY?", 3, 0, false);
        declareFunction("partially_commutative_argnums", "PARTIALLY-COMMUTATIVE-ARGNUMS", 2, 0, false);
        declareFunction("partially_commutative_argnums_int", "PARTIALLY-COMMUTATIVE-ARGNUMS-INT", 2, 1, false);
        declareFunction("cia_formulas", "CIA-FORMULAS", 1, 1, false);
        declareFunction("commutative_terms_in_orderP", "COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$commutative_terms_in_orderP$BinaryFunction();
        declareFunction("commutative_formulas_in_orderP", "COMMUTATIVE-FORMULAS-IN-ORDER?", 2, 0, false);
        declareFunction("canonicalizer_constant_L", "CANONICALIZER-CONSTANT-<", 2, 0, false);
        declareFunction("commutative_atoms_in_orderP", "COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
        declareFunction("canon_term_L", "CANON-TERM-<", 2, 0, false);
        declareFunction("canonicalize_functions_in_clause", "CANONICALIZE-FUNCTIONS-IN-CLAUSE", 1, 0, false);
        declareFunction("canonicalize_functions", "CANONICALIZE-FUNCTIONS", 1, 0, false);
        declareFunction("add_term_of_unit_lits", "ADD-TERM-OF-UNIT-LITS", 1, 0, false);
        declareFunction("clauses_free_variables", "CLAUSES-FREE-VARIABLES", 1, 0, false);
        declareFunction("add_term_of_unit_lits_1", "ADD-TERM-OF-UNIT-LITS-1", 1, 0, false);
        declareFunction("equal_wrt_svm", "EQUAL-WRT-SVM", 2, 0, false);
        declareFunction("reifiable_function_term_in_clauseP", "REIFIABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
        declareFunction("evaluatable_function_term_in_clauseP", "EVALUATABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
        declareFunction("czer_create_nartsP", "CZER-CREATE-NARTS?", 0, 0, false);
        declareFunction("reify_relation_functions_in_mt_list", "REIFY-RELATION-FUNCTIONS-IN-MT-LIST", 2, 1, false);
        declareFunction("reify_relation_functions", "REIFY-RELATION-FUNCTIONS", 1, 1, false);
        declareFunction("reify_relation_functions_in", "REIFY-RELATION-FUNCTIONS-IN", 3, 0, false);
        declareFunction("reify_relation_function_in", "REIFY-RELATION-FUNCTION-IN", 3, 0, false);
        declareFunction("reify_functions_in_mt", "REIFY-FUNCTIONS-IN-MT", 2, 0, false);
        declareFunction("reify_functions", "REIFY-FUNCTIONS", 2, 0, false);
        declareFunction("reify_functions_in", "REIFY-FUNCTIONS-IN", 2, 0, false);
        declareFunction("reify_function_in_fns", "REIFY-FUNCTION-IN-FNS", 2, 0, false);
        declareFunction("reify_function_in", "REIFY-FUNCTION-IN", 2, 0, false);
        declareFunction("reify_function_in_destructive", "REIFY-FUNCTION-IN-DESTRUCTIVE", 2, 0, false);
        declareFunction("canonicalize_fn_term_if_reified", "CANONICALIZE-FN-TERM-IF-REIFIED", 1, 0, false);
        declareFunction("canonicalize_fn_term_if_reified_destructive", "CANONICALIZE-FN-TERM-IF-REIFIED-DESTRUCTIVE", 1, 0, false);
        declareFunction("canonicalize_fn_term", "CANONICALIZE-FN-TERM", 1, 0, false);
        declareFunction("cyc_find_or_create_nart", "CYC-FIND-OR-CREATE-NART", 1, 1, false);
        declareFunction("low_find_or_create_nart", "LOW-FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction("canonicalize_fn_term_int", "CANONICALIZE-FN-TERM-INT", 3, 1, false);
        declareFunction("canonicalize_naut", "CANONICALIZE-NAUT", 1, 0, false);
        declareFunction("cyc_find_or_create_canonical_nart", "CYC-FIND-OR-CREATE-CANONICAL-NART", 1, 0, false);
        declareFunction("cyc_create_nart", "CYC-CREATE-NART", 1, 0, false);
        declareFunction("new_canonicalize_fn_term", "NEW-CANONICALIZE-FN-TERM", 1, 0, false);
        declareFunction("new_nested_fn_terms", "NEW-NESTED-FN-TERMS", 1, 0, false);
        declareFunction("nested_fn_terms", "NESTED-FN-TERMS", 1, 0, false);
        declareFunction("all_nested_fn_terms", "ALL-NESTED-FN-TERMS", 1, 0, false);
        declareFunction("fort_sort_by_type_and_id", "FORT-SORT-BY-TYPE-AND-ID", 1, 0, false);
        declareFunction("fort_type_and_id_L", "FORT-TYPE-AND-ID-<", 2, 0, false);
        declareFunction("clause_quantified_fn_terms", "CLAUSE-QUANTIFIED-FN-TERMS", 1, 0, false);
        declareFunction("literals_quantified_fn_terms", "LITERALS-QUANTIFIED-FN-TERMS", 1, 0, false);
        declareFunction("literal_quantified_fn_terms", "LITERAL-QUANTIFIED-FN-TERMS", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$literal_quantified_fn_terms$UnaryFunction();
        declareFunction("clause_terms_to_reify", "CLAUSE-TERMS-TO-REIFY", 1, 0, false);
        declareFunction("literal_terms_to_reify", "LITERAL-TERMS-TO-REIFY", 1, 1, false);
        new com.cyc.cycjava.cycl.czer_main.$literal_terms_to_reify$UnaryFunction();
        new com.cyc.cycjava.cycl.czer_main.$literal_terms_to_reify$BinaryFunction();
        declareFunction("function_terms_to_reify", "FUNCTION-TERMS-TO-REIFY", 1, 1, false);
        declareFunction("relation_terms_to_reify", "RELATION-TERMS-TO-REIFY", 1, 1, false);
        declareFunction("guaranteed_nothing_to_reifyP", "GUARANTEED-NOTHING-TO-REIFY?", 1, 0, false);
        declareFunction("reify_argP", "REIFY-ARG?", 3, 1, false);
        declareFunction("dont_reify_arg_or_subtermsP", "DONT-REIFY-ARG-OR-SUBTERMS?", 4, 0, false);
        declareFunction("reify_termP", "REIFY-TERM?", 1, 1, false);
        declareFunction("forward_inference_reifiable_function_termP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("forward_inference_reifiable_functionP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION?", 1, 1, false);
        declareFunction("subst_canon_fn_in_clauses", "SUBST-CANON-FN-IN-CLAUSES", 3, 0, false);
        declareFunction("subst_canon_fn_in_clause", "SUBST-CANON-FN-IN-CLAUSE", 3, 0, false);
        declareFunction("subst_canon_fn_in_relation", "SUBST-CANON-FN-IN-RELATION", 3, 1, false);
        declareFunction("subst_canon_fn_in_literal", "SUBST-CANON-FN-IN-LITERAL", 3, 0, false);
        declareFunction("subst_canon_fn_in_nat", "SUBST-CANON-FN-IN-NAT", 3, 0, false);
        declareFunction("canonicalize_clauses_transformable_nats", "CANONICALIZE-CLAUSES-TRANSFORMABLE-NATS", 1, 0, false);
        declareFunction("canonicalize_clause_transformable_nats", "CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS", 1, 0, false);
        declareFunction("nat_atoms", "NAT-ATOMS", 1, 0, false);
        declareFunction("canonicalize_literals_transformable_nats", "CANONICALIZE-LITERALS-TRANSFORMABLE-NATS", 2, 0, false);
        declareFunction("nat_transforming_litP", "NAT-TRANSFORMING-LIT?", 1, 0, false);
        declareFunction("dwim_svm_wrt_scoping", "DWIM-SVM-WRT-SCOPING", 3, 0, false);
        declareFunction("var_is_scoped_in_literalP", "VAR-IS-SCOPED-IN-LITERAL?", 2, 0, false);
        declareFunction("var_is_scoped_in_formulaP", "VAR-IS-SCOPED-IN-FORMULA?", 1, 0, false);
        declareFunction("canonicalize_clauses_literals", "CANONICALIZE-CLAUSES-LITERALS", 1, 0, false);
        declareFunction("sort_clauses", "SORT-CLAUSES", 1, 0, false);
        declareFunction("clauses_in_orderP", "CLAUSES-IN-ORDER?", 2, 0, false);
        declareFunction("sort_clauses_literals", "SORT-CLAUSES-LITERALS", 1, 0, false);
        declareFunction("sort_clause_literals", "SORT-CLAUSE-LITERALS", 1, 1, false);
        new com.cyc.cycjava.cycl.czer_main.$sort_clause_literals$UnaryFunction();
        new com.cyc.cycjava.cycl.czer_main.$sort_clause_literals$BinaryFunction();
        declareFunction("canonicalize_skolem_clause", "CANONICALIZE-SKOLEM-CLAUSE", 1, 1, false);
        declareFunction("sort_clause_literals_destructive", "SORT-CLAUSE-LITERALS-DESTRUCTIVE", 1, 1, false);
        declareFunction("tou_lits_at_rear", "TOU-LITS-AT-REAR", 1, 0, false);
        declareFunction("evaluate_lits_at_rear", "EVALUATE-LITS-AT-REAR", 1, 0, false);
        declareFunction("sort_literals", "SORT-LITERALS", 1, 4, false);
        declareFunction("pick_a_lit", "PICK-A-LIT", 1, 4, false);
        declareFunction("new_bound_vars", "NEW-BOUND-VARS", 1, 1, false);
        declareFunction("new_connected_vars", "NEW-CONNECTED-VARS", 1, 1, false);
        declareFunction("unbound_vars", "UNBOUND-VARS", 2, 0, false);
        declareFunction("most_constrained_literals", "MOST-CONSTRAINED-LITERALS", 1, 2, false);
        declareFunction("unbound_vars_score", "UNBOUND-VARS-SCORE", 2, 0, false);
        declareFunction("temp_unbound_vars_score", "TEMP-UNBOUND-VARS-SCORE", 2, 0, false);
        declareFunction("fewest_arg_literals", "FEWEST-ARG-LITERALS", 1, 0, false);
        declareFunction("left_weighted_literals", "LEFT-WEIGHTED-LITERALS", 1, 0, false);
        declareFunction("left_weighted_score", "LEFT-WEIGHTED-SCORE", 1, 1, false);
        declareFunction("n_left_weighted_score_weights", "N-LEFT-WEIGHTED-SCORE-WEIGHTS", 1, 1, false);
        declareFunction("left_connected_literals", "LEFT-CONNECTED-LITERALS", 1, 1, false);
        declareFunction("left_connected_score", "LEFT-CONNECTED-SCORE", 2, 0, false);
        declareFunction("left_rooted_literals", "LEFT-ROOTED-LITERALS", 1, 1, false);
        declareFunction("default_lit_sort", "DEFAULT-LIT-SORT", 1, 0, false);
        declareFunction("lit_L", "LIT-<", 2, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$lit_L$BinaryFunction();
        declareFunction("pred_L", "PRED-<", 2, 0, false);
        declareFunction("left_rooted_literals_int", "LEFT-ROOTED-LITERALS-INT", 1, 1, false);
        declareFunction("left_rooted_score", "LEFT-ROOTED-SCORE", 2, 1, false);
        declareFunction("max_scored_item", "MAX-SCORED-ITEM", 1, 2, false);
        declareFunction("least_complex_literals", "LEAST-COMPLEX-LITERALS", 1, 1, false);
        declareFunction("el_complexity_score", "EL-COMPLEXITY-SCORE", 1, 2, false);
        declareFunction("default_preference_lit", "DEFAULT-PREFERENCE-LIT", 1, 0, false);
        declareFunction("canonicalize_disjunctions_as_enumerations", "CANONICALIZE-DISJUNCTIONS-AS-ENUMERATIONS", 1, 0, false);
        declareFunction("canonicalize_clauses_variables", "CANONICALIZE-CLAUSES-VARIABLES", 1, 0, false);
        declareFunction("rename_clauses_vars", "RENAME-CLAUSES-VARS", 1, 0, false);
        declareFunction("standardize_variable_memory_binding", "STANDARDIZE-VARIABLE-MEMORY-BINDING", 2, 0, false);
        declareFunction("el_nununiquifying_blist_wrt", "EL-NUNUNIQUIFYING-BLIST-WRT", 1, 2, false);
        declareFunction("el_nununiquify_vars_wrt_int", "EL-NUNUNIQUIFY-VARS-WRT-INT", 2, 2, false);
        declareFunction("el_nununiquify_vars_wrt", "EL-NUNUNIQUIFY-VARS-WRT", 2, 0, false);
        declareFunction("el_nununiquify_vars_int", "EL-NUNUNIQUIFY-VARS-INT", 1, 2, false);
        declareFunction("el_ununiquify_vars_int", "EL-UNUNIQUIFY-VARS-INT", 1, 2, false);
        declareFunction("el_nununiquify_vars", "EL-NUNUNIQUIFY-VARS", 1, 0, false);
        declareFunction("uniquify", "UNIQUIFY", 1, 0, false);
        declareFunction("rename_clauses_vars_safe", "RENAME-CLAUSES-VARS-SAFE", 1, 0, false);
        declareFunction("rename_clause_vars", "RENAME-CLAUSE-VARS", 1, 1, false);
        declareFunction("rename_clause_vars_int", "RENAME-CLAUSE-VARS-INT", 1, 1, false);
        new com.cyc.cycjava.cycl.czer_main.$rename_clause_vars_int$UnaryFunction();
        new com.cyc.cycjava.cycl.czer_main.$rename_clause_vars_int$BinaryFunction();
        declareFunction("blist_vars_among", "BLIST-VARS-AMONG", 2, 0, false);
        declareFunction("blist_vars_not_among", "BLIST-VARS-NOT-AMONG", 2, 0, false);
        declareFunction("all_bindings", "ALL-BINDINGS", 2, 0, false);
        declareFunction("clause_el_variables", "CLAUSE-EL-VARIABLES", 1, 1, false);
        declareFunction("initialize_symbol_suffix_table", "INITIALIZE-SYMBOL-SUFFIX-TABLE", 1, 0, false);
        declareFunction("initialize_suffix_table_for_var", "INITIALIZE-SUFFIX-TABLE-FOR-VAR", 1, 0, false);
        new com.cyc.cycjava.cycl.czer_main.$initialize_suffix_table_for_var$UnaryFunction();
        declareFunction("extract_name_uniquifying_post_hyphen_integer", "EXTRACT-NAME-UNIQUIFYING-POST-HYPHEN-INTEGER", 1, 0, false);
        declareFunction("canonicalize_clauses", "CANONICALIZE-CLAUSES", 2, 0, false);
        declareFunction("unwrap_clauses_if_ist_permissive", "UNWRAP-CLAUSES-IF-IST-PERMISSIVE", 2, 0, false);
        declareFunction("canonicalize_query_clauses", "CANONICALIZE-QUERY-CLAUSES", 2, 0, false);
        declareFunction("canon_fast_clausesP", "CANON-FAST-CLAUSES?", 1, 0, false);
        declareFunction("lift_clauses_if_decontextualized", "LIFT-CLAUSES-IF-DECONTEXTUALIZED", 2, 0, false);
        declareFunction("psc_queryP", "PSC-QUERY?", 0, 1, false);
        declareFunction("canonicalizer_problemP", "CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction("tl_canonicalizer_problemP", "TL-CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction("terms_reorder_equalP", "TERMS-REORDER-EQUAL?", 2, 0, false);
        declareFunction("cnfs_reorder_tou_equalP", "CNFS-REORDER-TOU-EQUAL?", 2, 1, false);
        declareFunction("unique_arity_literal", "UNIQUE-ARITY-LITERAL", 1, 0, false);
        declareFunction("unique_list_structure_literal", "UNIQUE-LIST-STRUCTURE-LITERAL", 1, 0, false);
        declareFunction("old_last_resort_literal", "OLD-LAST-RESORT-LITERAL", 1, 2, false);
        declareFunction("alphabetically_minimal_literal", "ALPHABETICALLY-MINIMAL-LITERAL", 1, 2, false);
        declareFunction("new_alphabetically_minimal_literal_int", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT", 1, 2, false);
        declareFunction("new_alphabetically_minimal_literal_int_2", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT-2", 1, 1, false);
        declareFunction("old_commutative_terms_in_orderP", "OLD-COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
        declareFunction("old_commutative_atoms_in_orderP", "OLD-COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
        declareFunction("old_commutative_conses_in_orderP", "OLD-COMMUTATIVE-CONSES-IN-ORDER?", 2, 0, false);
        declareFunction("last_resort_min_literals", "LAST-RESORT-MIN-LITERALS", 1, 0, false);
        declareFunction("last_resort_min_literals_int", "LAST-RESORT-MIN-LITERALS-INT", 1, 0, false);
        declareFunction("last_resort_min_literals_min", "LAST-RESORT-MIN-LITERALS-MIN", 1, 0, false);
        declareFunction("constant_median", "CONSTANT-MEDIAN", 1, 0, false);
        declareFunction("ugly_thing_L", "UGLY-THING-<", 2, 0, false);
        declareFunction("ugly_thing_G", "UGLY-THING->", 2, 0, false);
        declareFunction("last_resort_min_literals_max", "LAST-RESORT-MIN-LITERALS-MAX", 1, 0, false);
        declareFunction("last_resort_min_literals_fn", "LAST-RESORT-MIN-LITERALS-FN", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_czer_main_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("el_to_hl", "EL-TO-HL", 1, 1, false);
            declareFunction("el_to_hl_query", "EL-TO-HL-QUERY", 1, 1, false);
            declareFunction("el_to_hl_fast", "EL-TO-HL-FAST", 1, 1, false);
            declareFunction("el_to_hl_really_fast", "EL-TO-HL-REALLY-FAST", 1, 1, false);
            declareFunction("canonicalize_term", "CANONICALIZE-TERM", 1, 1, false);
            declareFunction("canonicalize_term_memoized", "CANONICALIZE-TERM-MEMOIZED", 1, 1, false);
            declareFunction("canonicalize_term_memoized_int_internal", "CANONICALIZE-TERM-MEMOIZED-INT-INTERNAL", 2, 0, false);
            declareFunction("canonicalize_term_memoized_int", "CANONICALIZE-TERM-MEMOIZED-INT", 2, 0, false);
            declareFunction("canonicalize_term_assert", "CANONICALIZE-TERM-ASSERT", 1, 1, false);
            declareFunction("coerce_to_fort", "COERCE-TO-FORT", 1, 0, false);
            declareFunction("canonicalize_gaf", "CANONICALIZE-GAF", 2, 0, false);
            declareFunction("canonicalize_wf_gaf", "CANONICALIZE-WF-GAF", 2, 0, false);
            declareFunction("ncanonicalize_cycl", "NCANONICALIZE-CYCL", 1, 1, false);
            declareFunction("canonicalize_cycl", "CANONICALIZE-CYCL", 1, 1, false);
            declareFunction("canonicalize_cycl_int", "CANONICALIZE-CYCL-INT", 1, 5, false);
            declareFunction("clothe_naked_skolems", "CLOTHE-NAKED-SKOLEMS", 1, 0, false);
            declareFunction("czer_result_quiescedP", "CZER-RESULT-QUIESCED?", 2, 0, false);
            declareFunction("canonicalize_cycl_sentence", "CANONICALIZE-CYCL-SENTENCE", 1, 1, false);
            declareFunction("canonicalize_cycl_test", "CANONICALIZE-CYCL-TEST", 1, 1, false);
            declareFunction("canonicalize_wf_cycl", "CANONICALIZE-WF-CYCL", 1, 1, false);
            declareFunction("canonicalize_wf_cycl_memoized", "CANONICALIZE-WF-CYCL-MEMOIZED", 1, 1, false);
            declareFunction("canonicalize_wf_cycl_int_memoized_internal", "CANONICALIZE-WF-CYCL-INT-MEMOIZED-INTERNAL", 2, 0, false);
            declareFunction("canonicalize_wf_cycl_int_memoized", "CANONICALIZE-WF-CYCL-INT-MEMOIZED", 2, 0, false);
            declareFunction("canonicalize_wf_cycl_sentence", "CANONICALIZE-WF-CYCL-SENTENCE", 1, 1, false);
            declareFunction("canonicalize_ask_memoized", "CANONICALIZE-ASK-MEMOIZED", 1, 1, false);
            declareFunction("canonicalize_ask_int_memoized_internal", "CANONICALIZE-ASK-INT-MEMOIZED-INTERNAL", 2, 0, false);
            declareFunction("canonicalize_ask_int_memoized", "CANONICALIZE-ASK-INT-MEMOIZED", 2, 0, false);
            declareFunction("canonicalize_ask", "CANONICALIZE-ASK", 1, 1, false);
            declareFunction("canonicalize_ask_mt", "CANONICALIZE-ASK-MT", 1, 0, false);
            declareFunction("canonicalize_ask_sentence", "CANONICALIZE-ASK-SENTENCE", 1, 1, false);
            declareFunction("canonicalize_assert", "CANONICALIZE-ASSERT", 1, 1, false);
            declareFunction("test_canonicalize_assert", "TEST-CANONICALIZE-ASSERT", 1, 1, false);
            declareFunction("canonicalize_assert_mt", "CANONICALIZE-ASSERT-MT", 1, 0, false);
            declareFunction("canonicalize_mt", "CANONICALIZE-MT", 1, 0, false);
            declareFunction("canonicalize_assert_sentence", "CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
            declareFunction("test_canonicalize_assert_sentence", "TEST-CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
            declareFunction("canonicalize_wf_assert_sentence", "CANONICALIZE-WF-ASSERT-SENTENCE", 1, 1, false);
            declareFunction("canonicalize_unassert", "CANONICALIZE-UNASSERT", 1, 1, false);
            declareFunction("canonicalize_unassert_sentence", "CANONICALIZE-UNASSERT-SENTENCE", 1, 1, false);
            declareFunction("ncanonicalize_query", "NCANONICALIZE-QUERY", 1, 1, false);
            declareFunction("canonicalize_query", "CANONICALIZE-QUERY", 1, 3, false);
            declareFunction("canonicalize_query_sentence", "CANONICALIZE-QUERY-SENTENCE", 1, 1, false);
            declareFunction("canonicalize_expression", "CANONICALIZE-EXPRESSION", 1, 2, false);
            declareFunction("clausify_eliminating_ists", "CLAUSIFY-ELIMINATING-ISTS", 4, 0, false);
            declareFunction("remove_newly_introduced_variables_from_bindings", "REMOVE-NEWLY-INTRODUCED-VARIABLES-FROM-BINDINGS", 2, 0, false);
            declareFunction("clear_canon_caches", "CLEAR-CANON-CACHES", 0, 0, false);
            declareFunction("canon_wffP", "CANON-WFF?", 1, 1, false);
            declareFunction("check_wff_arityP", "CHECK-WFF-ARITY?", 0, 0, false);
            declareFunction("check_wff_semanticsP", "CHECK-WFF-SEMANTICS?", 0, 1, false);
            declareFunction("canonicalize_clauses_terms", "CANONICALIZE-CLAUSES-TERMS", 1, 0, false);
            declareFunction("canonicalize_clauses_quoted_terms", "CANONICALIZE-CLAUSES-QUOTED-TERMS", 1, 0, false);
            declareFunction("canonicalize_clause_quoted_terms", "CANONICALIZE-CLAUSE-QUOTED-TERMS", 1, 0, false);
            new czer_main.$canonicalize_clause_quoted_terms$UnaryFunction();
            declareFunction("canonicalize_literals_quoted_terms", "CANONICALIZE-LITERALS-QUOTED-TERMS", 1, 0, false);
            declareFunction("canonicalize_literal_quoted_terms_recursive", "CANONICALIZE-LITERAL-QUOTED-TERMS-RECURSIVE", 1, 0, false);
            declareFunction("canonicalize_quoted_term", "CANONICALIZE-QUOTED-TERM", 1, 1, false);
            declareFunction("unquote_quoted_term", "UNQUOTE-QUOTED-TERM", 1, 1, false);
            declareFunction("canonicalize_clauses_sentence_terms", "CANONICALIZE-CLAUSES-SENTENCE-TERMS", 1, 0, false);
            declareFunction("canonicalize_no_sentence_argsP", "CANONICALIZE-NO-SENTENCE-ARGS?", 0, 0, false);
            declareFunction("canonicalize_clause_sentence_terms", "CANONICALIZE-CLAUSE-SENTENCE-TERMS", 1, 0, false);
            new czer_main.$canonicalize_clause_sentence_terms$UnaryFunction();
            declareFunction("unnegate_and_flip_negated_lits", "UNNEGATE-AND-FLIP-NEGATED-LITS", 2, 0, false);
            declareFunction("canonicalize_literal_sentence_terms", "CANONICALIZE-LITERAL-SENTENCE-TERMS", 1, 1, false);
            new czer_main.$canonicalize_literal_sentence_terms$UnaryFunction();
            new czer_main.$canonicalize_literal_sentence_terms$BinaryFunction();
            declareFunction("canonicalize_function_sentence_terms", "CANONICALIZE-FUNCTION-SENTENCE-TERMS", 1, 1, false);
            declareFunction("canonicalize_relation_sentence_terms", "CANONICALIZE-RELATION-SENTENCE-TERMS", 1, 1, false);
            declareFunction("canonicalize_clauses_commutative_terms_destructive", "CANONICALIZE-CLAUSES-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
            declareFunction("canonicalize_clause_commutative_terms", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("canonicalize_clause_commutative_terms_destructive", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
            new czer_main.$canonicalize_clause_commutative_terms_destructive$UnaryFunction();
            declareFunction("never_commutative_gaf_clauseP", "NEVER-COMMUTATIVE-GAF-CLAUSE?", 1, 0, false);
            declareFunction("canonicalize_literals_commutative_terms", "CANONICALIZE-LITERALS-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("canonicalize_literal_commutative_terms", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("canonicalize_literal_commutative_terms_destructive", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
            new czer_main.$canonicalize_literal_commutative_terms_destructive$UnaryFunction();
            declareFunction("canonicalize_literal_commutative_args", "CANONICALIZE-LITERAL-COMMUTATIVE-ARGS", 1, 0, false);
            declareFunction("order_commutative_terms", "ORDER-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("canonicalize_terms_commutative_terms_without_reordering", "CANONICALIZE-TERMS-COMMUTATIVE-TERMS-WITHOUT-REORDERING", 2, 0, false);
            declareFunction("canonicalize_term_commutative_terms", "CANONICALIZE-TERM-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("unary_function_commutes_with_its_argumentP", "UNARY-FUNCTION-COMMUTES-WITH-ITS-ARGUMENT?", 1, 0, false);
            declareFunction("canonicalize_commuting_function", "CANONICALIZE-COMMUTING-FUNCTION", 1, 0, false);
            declareFunction("canonicalize_nat_commutative_terms", "CANONICALIZE-NAT-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("canonicalize_relation_commutative_terms", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("canonicalize_relation_commutative_terms_destructive", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
            declareFunction("sort_relation_commutative_terms", "SORT-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
            declareFunction("sort_partially_commutative_terms", "SORT-PARTIALLY-COMMUTATIVE-TERMS", 3, 0, false);
            declareFunction("commutative_argnums", "COMMUTATIVE-ARGNUMS", 1, 0, false);
            declareFunction("ok_wrt_partial_commutativityP", "OK-WRT-PARTIAL-COMMUTATIVITY?", 3, 0, false);
            declareFunction("partially_commutative_argnums", "PARTIALLY-COMMUTATIVE-ARGNUMS", 2, 0, false);
            declareFunction("partially_commutative_argnums_int", "PARTIALLY-COMMUTATIVE-ARGNUMS-INT", 2, 1, false);
            declareFunction("cia_formulas", "CIA-FORMULAS", 1, 1, false);
            declareFunction("commutative_terms_in_orderP", "COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
            new czer_main.$commutative_terms_in_orderP$BinaryFunction();
            declareFunction("commutative_formulas_in_orderP", "COMMUTATIVE-FORMULAS-IN-ORDER?", 2, 0, false);
            declareFunction("canonicalizer_constant_L", "CANONICALIZER-CONSTANT-<", 2, 0, false);
            declareFunction("commutative_atoms_in_orderP", "COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
            declareFunction("canon_term_L", "CANON-TERM-<", 2, 0, false);
            declareFunction("canonicalize_functions_in_clause", "CANONICALIZE-FUNCTIONS-IN-CLAUSE", 1, 0, false);
            declareFunction("canonicalize_functions", "CANONICALIZE-FUNCTIONS", 1, 0, false);
            declareFunction("add_term_of_unit_lits", "ADD-TERM-OF-UNIT-LITS", 1, 0, false);
            declareFunction("clauses_free_variables", "CLAUSES-FREE-VARIABLES", 1, 0, false);
            declareFunction("add_term_of_unit_lits_1", "ADD-TERM-OF-UNIT-LITS-1", 1, 0, false);
            declareFunction("equal_wrt_svm", "EQUAL-WRT-SVM", 2, 0, false);
            declareFunction("reifiable_function_term_in_clauseP", "REIFIABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
            declareFunction("evaluatable_function_term_in_clauseP", "EVALUATABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
            declareFunction("czer_create_nartP", "CZER-CREATE-NART?", 1, 0, false);
            declareFunction("czer_create_nartsP", "CZER-CREATE-NARTS?", 0, 0, false);
            declareFunction("reify_relation_functions_in_mt_list", "REIFY-RELATION-FUNCTIONS-IN-MT-LIST", 2, 1, false);
            declareFunction("reify_relation_functions", "REIFY-RELATION-FUNCTIONS", 1, 1, false);
            declareFunction("reify_relation_functions_in", "REIFY-RELATION-FUNCTIONS-IN", 3, 0, false);
            declareFunction("reify_relation_function_in", "REIFY-RELATION-FUNCTION-IN", 3, 0, false);
            declareFunction("reify_functions_in_mt", "REIFY-FUNCTIONS-IN-MT", 2, 0, false);
            declareFunction("reify_functions", "REIFY-FUNCTIONS", 2, 0, false);
            declareFunction("reify_functions_in", "REIFY-FUNCTIONS-IN", 2, 0, false);
            declareFunction("reify_function_in_fns", "REIFY-FUNCTION-IN-FNS", 2, 0, false);
            declareFunction("reify_function_in", "REIFY-FUNCTION-IN", 2, 0, false);
            declareFunction("reify_function_in_destructive", "REIFY-FUNCTION-IN-DESTRUCTIVE", 2, 0, false);
            declareFunction("canonicalize_fn_term_if_reified", "CANONICALIZE-FN-TERM-IF-REIFIED", 1, 0, false);
            declareFunction("canonicalize_fn_term_if_reified_destructive", "CANONICALIZE-FN-TERM-IF-REIFIED-DESTRUCTIVE", 1, 0, false);
            declareFunction("canonicalize_fn_term", "CANONICALIZE-FN-TERM", 1, 0, false);
            declareFunction("cyc_find_or_create_nart", "CYC-FIND-OR-CREATE-NART", 1, 1, false);
            declareFunction("low_find_or_create_nart", "LOW-FIND-OR-CREATE-NART", 1, 0, false);
            declareFunction("canonicalize_fn_term_int", "CANONICALIZE-FN-TERM-INT", 3, 1, false);
            declareFunction("canonicalize_naut", "CANONICALIZE-NAUT", 1, 0, false);
            declareFunction("cyc_find_or_create_canonical_nart", "CYC-FIND-OR-CREATE-CANONICAL-NART", 1, 0, false);
            declareFunction("clear_nart_defining_rules_cached", "CLEAR-NART-DEFINING-RULES-CACHED", 0, 0, false);
            declareFunction("remove_nart_defining_rules_cached", "REMOVE-NART-DEFINING-RULES-CACHED", 0, 1, false);
            declareFunction("nart_defining_rules_cached_internal", "NART-DEFINING-RULES-CACHED-INTERNAL", 1, 0, false);
            declareFunction("nart_defining_rules_cached", "NART-DEFINING-RULES-CACHED", 0, 1, false);
            declareFunction("cyc_create_nart", "CYC-CREATE-NART", 1, 0, false);
            declareFunction("new_canonicalize_fn_term", "NEW-CANONICALIZE-FN-TERM", 1, 0, false);
            declareFunction("new_nested_fn_terms", "NEW-NESTED-FN-TERMS", 1, 0, false);
            declareFunction("nested_fn_terms", "NESTED-FN-TERMS", 1, 0, false);
            declareFunction("all_nested_fn_terms", "ALL-NESTED-FN-TERMS", 1, 0, false);
            declareFunction("fort_sort_by_type_and_id", "FORT-SORT-BY-TYPE-AND-ID", 1, 0, false);
            declareFunction("fort_type_and_id_L", "FORT-TYPE-AND-ID-<", 2, 0, false);
            declareFunction("clause_quantified_fn_terms", "CLAUSE-QUANTIFIED-FN-TERMS", 1, 0, false);
            declareFunction("literals_quantified_fn_terms", "LITERALS-QUANTIFIED-FN-TERMS", 1, 0, false);
            declareFunction("literal_quantified_fn_terms", "LITERAL-QUANTIFIED-FN-TERMS", 1, 0, false);
            new czer_main.$literal_quantified_fn_terms$UnaryFunction();
            declareFunction("clause_terms_to_reify", "CLAUSE-TERMS-TO-REIFY", 1, 0, false);
            declareFunction("literal_terms_to_reify", "LITERAL-TERMS-TO-REIFY", 1, 1, false);
            new czer_main.$literal_terms_to_reify$UnaryFunction();
            new czer_main.$literal_terms_to_reify$BinaryFunction();
            declareFunction("function_terms_to_reify", "FUNCTION-TERMS-TO-REIFY", 1, 1, false);
            declareFunction("relation_terms_to_reify", "RELATION-TERMS-TO-REIFY", 1, 1, false);
            declareFunction("guaranteed_nothing_to_reifyP", "GUARANTEED-NOTHING-TO-REIFY?", 1, 0, false);
            declareFunction("reify_argP", "REIFY-ARG?", 3, 1, false);
            declareFunction("dont_reify_arg_or_subtermsP", "DONT-REIFY-ARG-OR-SUBTERMS?", 4, 0, false);
            declareFunction("reify_termP", "REIFY-TERM?", 1, 1, false);
            declareFunction("forward_inference_reifiable_function_termP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
            declareFunction("forward_inference_reifiable_functionP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION?", 1, 1, false);
            declareFunction("subst_canon_fn_in_clauses", "SUBST-CANON-FN-IN-CLAUSES", 3, 0, false);
            declareFunction("subst_canon_fn_in_clause", "SUBST-CANON-FN-IN-CLAUSE", 3, 0, false);
            declareFunction("subst_canon_fn_in_relation", "SUBST-CANON-FN-IN-RELATION", 3, 1, false);
            declareFunction("subst_canon_fn_in_literal", "SUBST-CANON-FN-IN-LITERAL", 3, 0, false);
            declareFunction("subst_canon_fn_in_nat", "SUBST-CANON-FN-IN-NAT", 3, 0, false);
            declareFunction("canonicalize_clauses_transformable_nats", "CANONICALIZE-CLAUSES-TRANSFORMABLE-NATS", 1, 0, false);
            declareFunction("canonicalize_clause_transformable_nats", "CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS", 1, 0, false);
            declareFunction("nat_atoms", "NAT-ATOMS", 1, 0, false);
            declareFunction("canonicalize_literals_transformable_nats", "CANONICALIZE-LITERALS-TRANSFORMABLE-NATS", 2, 0, false);
            declareFunction("nat_transforming_litP", "NAT-TRANSFORMING-LIT?", 1, 0, false);
            declareFunction("possibly_nat_transforming_litP", "POSSIBLY-NAT-TRANSFORMING-LIT?", 1, 0, false);
            declareFunction("destructive_nat_transforming_litP", "DESTRUCTIVE-NAT-TRANSFORMING-LIT?", 2, 0, false);
            declareFunction("dwim_svm_wrt_scoping", "DWIM-SVM-WRT-SCOPING", 3, 0, false);
            declareFunction("var_is_scoped_in_literalP", "VAR-IS-SCOPED-IN-LITERAL?", 2, 0, false);
            declareFunction("var_is_scoped_in_formulaP", "VAR-IS-SCOPED-IN-FORMULA?", 1, 0, false);
            declareFunction("canonicalize_clauses_literals", "CANONICALIZE-CLAUSES-LITERALS", 1, 0, false);
            declareFunction("sort_clauses", "SORT-CLAUSES", 1, 0, false);
            declareFunction("clauses_in_orderP", "CLAUSES-IN-ORDER?", 2, 0, false);
            declareFunction("sort_clauses_literals", "SORT-CLAUSES-LITERALS", 1, 0, false);
            declareFunction("sort_clause_literals", "SORT-CLAUSE-LITERALS", 1, 1, false);
            new czer_main.$sort_clause_literals$UnaryFunction();
            new czer_main.$sort_clause_literals$BinaryFunction();
            declareFunction("canonicalize_skolem_clause", "CANONICALIZE-SKOLEM-CLAUSE", 1, 1, false);
            declareFunction("sort_clause_literals_destructive", "SORT-CLAUSE-LITERALS-DESTRUCTIVE", 1, 1, false);
            declareFunction("tou_lits_at_rear", "TOU-LITS-AT-REAR", 1, 0, false);
            declareFunction("evaluate_lits_at_rear", "EVALUATE-LITS-AT-REAR", 1, 0, false);
            declareFunction("sort_literals", "SORT-LITERALS", 1, 4, false);
            declareFunction("pick_a_lit", "PICK-A-LIT", 1, 4, false);
            declareFunction("new_bound_vars", "NEW-BOUND-VARS", 1, 1, false);
            declareFunction("new_connected_vars", "NEW-CONNECTED-VARS", 1, 1, false);
            declareFunction("unbound_vars", "UNBOUND-VARS", 2, 0, false);
            declareFunction("most_constrained_literals", "MOST-CONSTRAINED-LITERALS", 1, 2, false);
            declareFunction("unbound_vars_score", "UNBOUND-VARS-SCORE", 2, 0, false);
            declareFunction("temp_unbound_vars_score", "TEMP-UNBOUND-VARS-SCORE", 2, 0, false);
            declareFunction("fewest_arg_literals", "FEWEST-ARG-LITERALS", 1, 0, false);
            declareFunction("left_weighted_literals", "LEFT-WEIGHTED-LITERALS", 1, 0, false);
            declareFunction("left_weighted_score", "LEFT-WEIGHTED-SCORE", 1, 1, false);
            declareFunction("n_left_weighted_score_weights", "N-LEFT-WEIGHTED-SCORE-WEIGHTS", 1, 1, false);
            declareFunction("left_connected_literals", "LEFT-CONNECTED-LITERALS", 1, 1, false);
            declareFunction("left_connected_score", "LEFT-CONNECTED-SCORE", 2, 0, false);
            declareFunction("left_rooted_literals", "LEFT-ROOTED-LITERALS", 1, 1, false);
            declareFunction("default_lit_sort", "DEFAULT-LIT-SORT", 1, 0, false);
            declareFunction("lit_L", "LIT-<", 2, 0, false);
            new czer_main.$lit_L$BinaryFunction();
            declareFunction("pred_L", "PRED-<", 2, 0, false);
            declareFunction("left_rooted_literals_int", "LEFT-ROOTED-LITERALS-INT", 1, 1, false);
            declareFunction("left_rooted_score", "LEFT-ROOTED-SCORE", 2, 1, false);
            declareFunction("max_scored_item", "MAX-SCORED-ITEM", 1, 2, false);
            declareFunction("least_complex_literals", "LEAST-COMPLEX-LITERALS", 1, 1, false);
            declareFunction("el_complexity_score", "EL-COMPLEXITY-SCORE", 1, 2, false);
            declareFunction("default_preference_lit", "DEFAULT-PREFERENCE-LIT", 1, 0, false);
            declareFunction("canonicalize_disjunctions_as_enumerations", "CANONICALIZE-DISJUNCTIONS-AS-ENUMERATIONS", 1, 0, false);
            declareFunction("canonicalize_clauses_variables", "CANONICALIZE-CLAUSES-VARIABLES", 1, 0, false);
            declareFunction("rename_clauses_vars", "RENAME-CLAUSES-VARS", 1, 0, false);
            declareFunction("standardize_variable_memory_binding", "STANDARDIZE-VARIABLE-MEMORY-BINDING", 2, 0, false);
            declareFunction("el_nununiquifying_blist_wrt", "EL-NUNUNIQUIFYING-BLIST-WRT", 1, 2, false);
            declareFunction("el_nununiquify_vars_wrt_int", "EL-NUNUNIQUIFY-VARS-WRT-INT", 2, 2, false);
            declareFunction("el_nununiquify_vars_wrt", "EL-NUNUNIQUIFY-VARS-WRT", 2, 0, false);
            declareFunction("el_nununiquify_vars_int", "EL-NUNUNIQUIFY-VARS-INT", 1, 2, false);
            declareFunction("el_ununiquify_vars_int", "EL-UNUNIQUIFY-VARS-INT", 1, 2, false);
            declareFunction("el_nununiquify_vars", "EL-NUNUNIQUIFY-VARS", 1, 0, false);
            declareFunction("uniquify", "UNIQUIFY", 1, 0, false);
            declareFunction("rename_clauses_vars_safe", "RENAME-CLAUSES-VARS-SAFE", 1, 0, false);
            declareFunction("rename_clause_vars", "RENAME-CLAUSE-VARS", 1, 1, false);
            declareFunction("rename_single_clause_vars_int", "RENAME-SINGLE-CLAUSE-VARS-INT", 1, 1, false);
            declareFunction("rename_clause_vars_int", "RENAME-CLAUSE-VARS-INT", 2, 1, false);
            new czer_main.$rename_clause_vars_int$BinaryFunction();
            declareFunction("lookup_closed_vars_from_standardize_variables_memory", "LOOKUP-CLOSED-VARS-FROM-STANDARDIZE-VARIABLES-MEMORY", 0, 0, false);
            declareFunction("blist_vars_among", "BLIST-VARS-AMONG", 2, 0, false);
            declareFunction("blist_vars_not_among", "BLIST-VARS-NOT-AMONG", 2, 0, false);
            declareFunction("all_bindings", "ALL-BINDINGS", 2, 0, false);
            declareFunction("clause_el_variables", "CLAUSE-EL-VARIABLES", 1, 1, false);
            declareFunction("initialize_symbol_suffix_table", "INITIALIZE-SYMBOL-SUFFIX-TABLE", 1, 0, false);
            declareFunction("initialize_suffix_table_for_var", "INITIALIZE-SUFFIX-TABLE-FOR-VAR", 1, 0, false);
            new czer_main.$initialize_suffix_table_for_var$UnaryFunction();
            declareFunction("extract_name_uniquifying_post_hyphen_integer", "EXTRACT-NAME-UNIQUIFYING-POST-HYPHEN-INTEGER", 1, 0, false);
            declareFunction("canonicalize_clauses", "CANONICALIZE-CLAUSES", 2, 0, false);
            declareFunction("canonicalize_query_clauses", "CANONICALIZE-QUERY-CLAUSES", 2, 0, false);
            declareFunction("canonicalize_clauses_int", "CANONICALIZE-CLAUSES-INT", 4, 0, false);
            declareFunction("canon_fast_clausesP", "CANON-FAST-CLAUSES?", 1, 0, false);
            declareFunction("unwrap_clauses_if_ist_permissive", "UNWRAP-CLAUSES-IF-IST-PERMISSIVE", 2, 0, false);
            declareFunction("lift_clauses_if_decontextualized", "LIFT-CLAUSES-IF-DECONTEXTUALIZED", 2, 0, false);
            declareFunction("clauses_syntactic_wff_check", "CLAUSES-SYNTACTIC-WFF-CHECK", 2, 0, false);
            declareFunction("psc_queryP", "PSC-QUERY?", 0, 1, false);
            declareFunction("canonicalizer_problemP", "CANONICALIZER-PROBLEM?", 1, 0, false);
            declareFunction("tl_canonicalizer_problemP", "TL-CANONICALIZER-PROBLEM?", 1, 0, false);
            declareFunction("terms_reorder_equalP", "TERMS-REORDER-EQUAL?", 2, 0, false);
            declareFunction("cnfs_reorder_tou_equalP", "CNFS-REORDER-TOU-EQUAL?", 2, 1, false);
            declareFunction("unique_arity_literal", "UNIQUE-ARITY-LITERAL", 1, 0, false);
            declareFunction("unique_list_structure_literal", "UNIQUE-LIST-STRUCTURE-LITERAL", 1, 0, false);
            declareFunction("old_last_resort_literal", "OLD-LAST-RESORT-LITERAL", 1, 2, false);
            declareFunction("alphabetically_minimal_literal", "ALPHABETICALLY-MINIMAL-LITERAL", 1, 2, false);
            declareFunction("new_alphabetically_minimal_literal_int", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT", 1, 2, false);
            declareFunction("new_alphabetically_minimal_literal_int_2", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT-2", 1, 1, false);
            declareFunction("old_commutative_terms_in_orderP", "OLD-COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
            declareFunction("old_commutative_atoms_in_orderP", "OLD-COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
            declareFunction("old_commutative_conses_in_orderP", "OLD-COMMUTATIVE-CONSES-IN-ORDER?", 2, 0, false);
            declareFunction("last_resort_min_literals", "LAST-RESORT-MIN-LITERALS", 1, 0, false);
            declareFunction("last_resort_min_literals_int", "LAST-RESORT-MIN-LITERALS-INT", 1, 0, false);
            declareFunction("last_resort_min_literals_min", "LAST-RESORT-MIN-LITERALS-MIN", 1, 0, false);
            declareFunction("constant_median", "CONSTANT-MEDIAN", 1, 0, false);
            declareFunction("ugly_thing_L", "UGLY-THING-<", 2, 0, false);
            declareFunction("ugly_thing_G", "UGLY-THING->", 2, 0, false);
            declareFunction("last_resort_min_literals_max", "LAST-RESORT-MIN-LITERALS-MAX", 1, 0, false);
            declareFunction("last_resort_min_literals_fn", "LAST-RESORT-MIN-LITERALS-FN", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("rename_clause_vars_int", "RENAME-CLAUSE-VARS-INT", 1, 1, false);
            new com.cyc.cycjava.cycl.czer_main.$rename_clause_vars_int$UnaryFunction();
        }
        return NIL;
    }

    public static SubLObject declare_czer_main_file_Previous() {
        declareFunction("el_to_hl", "EL-TO-HL", 1, 1, false);
        declareFunction("el_to_hl_query", "EL-TO-HL-QUERY", 1, 1, false);
        declareFunction("el_to_hl_fast", "EL-TO-HL-FAST", 1, 1, false);
        declareFunction("el_to_hl_really_fast", "EL-TO-HL-REALLY-FAST", 1, 1, false);
        declareFunction("canonicalize_term", "CANONICALIZE-TERM", 1, 1, false);
        declareFunction("canonicalize_term_memoized", "CANONICALIZE-TERM-MEMOIZED", 1, 1, false);
        declareFunction("canonicalize_term_memoized_int_internal", "CANONICALIZE-TERM-MEMOIZED-INT-INTERNAL", 2, 0, false);
        declareFunction("canonicalize_term_memoized_int", "CANONICALIZE-TERM-MEMOIZED-INT", 2, 0, false);
        declareFunction("canonicalize_term_assert", "CANONICALIZE-TERM-ASSERT", 1, 1, false);
        declareFunction("coerce_to_fort", "COERCE-TO-FORT", 1, 0, false);
        declareFunction("canonicalize_gaf", "CANONICALIZE-GAF", 2, 0, false);
        declareFunction("canonicalize_wf_gaf", "CANONICALIZE-WF-GAF", 2, 0, false);
        declareFunction("ncanonicalize_cycl", "NCANONICALIZE-CYCL", 1, 1, false);
        declareFunction("canonicalize_cycl", "CANONICALIZE-CYCL", 1, 1, false);
        declareFunction("canonicalize_cycl_int", "CANONICALIZE-CYCL-INT", 1, 5, false);
        declareFunction("clothe_naked_skolems", "CLOTHE-NAKED-SKOLEMS", 1, 0, false);
        declareFunction("czer_result_quiescedP", "CZER-RESULT-QUIESCED?", 2, 0, false);
        declareFunction("canonicalize_cycl_sentence", "CANONICALIZE-CYCL-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_cycl_test", "CANONICALIZE-CYCL-TEST", 1, 1, false);
        declareFunction("canonicalize_wf_cycl", "CANONICALIZE-WF-CYCL", 1, 1, false);
        declareFunction("canonicalize_wf_cycl_memoized", "CANONICALIZE-WF-CYCL-MEMOIZED", 1, 1, false);
        declareFunction("canonicalize_wf_cycl_int_memoized_internal", "CANONICALIZE-WF-CYCL-INT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("canonicalize_wf_cycl_int_memoized", "CANONICALIZE-WF-CYCL-INT-MEMOIZED", 2, 0, false);
        declareFunction("canonicalize_wf_cycl_sentence", "CANONICALIZE-WF-CYCL-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_ask_memoized", "CANONICALIZE-ASK-MEMOIZED", 1, 1, false);
        declareFunction("canonicalize_ask_int_memoized_internal", "CANONICALIZE-ASK-INT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("canonicalize_ask_int_memoized", "CANONICALIZE-ASK-INT-MEMOIZED", 2, 0, false);
        declareFunction("canonicalize_ask", "CANONICALIZE-ASK", 1, 1, false);
        declareFunction("canonicalize_ask_mt", "CANONICALIZE-ASK-MT", 1, 0, false);
        declareFunction("canonicalize_ask_sentence", "CANONICALIZE-ASK-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_assert", "CANONICALIZE-ASSERT", 1, 1, false);
        declareFunction("test_canonicalize_assert", "TEST-CANONICALIZE-ASSERT", 1, 1, false);
        declareFunction("canonicalize_assert_mt", "CANONICALIZE-ASSERT-MT", 1, 0, false);
        declareFunction("canonicalize_mt", "CANONICALIZE-MT", 1, 0, false);
        declareFunction("canonicalize_assert_sentence", "CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
        declareFunction("test_canonicalize_assert_sentence", "TEST-CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_wf_assert_sentence", "CANONICALIZE-WF-ASSERT-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_unassert", "CANONICALIZE-UNASSERT", 1, 1, false);
        declareFunction("canonicalize_unassert_sentence", "CANONICALIZE-UNASSERT-SENTENCE", 1, 1, false);
        declareFunction("ncanonicalize_query", "NCANONICALIZE-QUERY", 1, 1, false);
        declareFunction("canonicalize_query", "CANONICALIZE-QUERY", 1, 3, false);
        declareFunction("canonicalize_query_sentence", "CANONICALIZE-QUERY-SENTENCE", 1, 1, false);
        declareFunction("canonicalize_expression", "CANONICALIZE-EXPRESSION", 1, 2, false);
        declareFunction("clausify_eliminating_ists", "CLAUSIFY-ELIMINATING-ISTS", 4, 0, false);
        declareFunction("remove_newly_introduced_variables_from_bindings", "REMOVE-NEWLY-INTRODUCED-VARIABLES-FROM-BINDINGS", 2, 0, false);
        declareFunction("clear_canon_caches", "CLEAR-CANON-CACHES", 0, 0, false);
        declareFunction("canon_wffP", "CANON-WFF?", 1, 1, false);
        declareFunction("check_wff_arityP", "CHECK-WFF-ARITY?", 0, 0, false);
        declareFunction("check_wff_semanticsP", "CHECK-WFF-SEMANTICS?", 0, 1, false);
        declareFunction("canonicalize_clauses_terms", "CANONICALIZE-CLAUSES-TERMS", 1, 0, false);
        declareFunction("canonicalize_clauses_quoted_terms", "CANONICALIZE-CLAUSES-QUOTED-TERMS", 1, 0, false);
        declareFunction("canonicalize_clause_quoted_terms", "CANONICALIZE-CLAUSE-QUOTED-TERMS", 1, 0, false);
        new czer_main.$canonicalize_clause_quoted_terms$UnaryFunction();
        declareFunction("canonicalize_literals_quoted_terms", "CANONICALIZE-LITERALS-QUOTED-TERMS", 1, 0, false);
        declareFunction("canonicalize_literal_quoted_terms_recursive", "CANONICALIZE-LITERAL-QUOTED-TERMS-RECURSIVE", 1, 0, false);
        declareFunction("canonicalize_quoted_term", "CANONICALIZE-QUOTED-TERM", 1, 1, false);
        declareFunction("unquote_quoted_term", "UNQUOTE-QUOTED-TERM", 1, 1, false);
        declareFunction("canonicalize_clauses_sentence_terms", "CANONICALIZE-CLAUSES-SENTENCE-TERMS", 1, 0, false);
        declareFunction("canonicalize_no_sentence_argsP", "CANONICALIZE-NO-SENTENCE-ARGS?", 0, 0, false);
        declareFunction("canonicalize_clause_sentence_terms", "CANONICALIZE-CLAUSE-SENTENCE-TERMS", 1, 0, false);
        new czer_main.$canonicalize_clause_sentence_terms$UnaryFunction();
        declareFunction("unnegate_and_flip_negated_lits", "UNNEGATE-AND-FLIP-NEGATED-LITS", 2, 0, false);
        declareFunction("canonicalize_literal_sentence_terms", "CANONICALIZE-LITERAL-SENTENCE-TERMS", 1, 1, false);
        new czer_main.$canonicalize_literal_sentence_terms$UnaryFunction();
        new czer_main.$canonicalize_literal_sentence_terms$BinaryFunction();
        declareFunction("canonicalize_function_sentence_terms", "CANONICALIZE-FUNCTION-SENTENCE-TERMS", 1, 1, false);
        declareFunction("canonicalize_relation_sentence_terms", "CANONICALIZE-RELATION-SENTENCE-TERMS", 1, 1, false);
        declareFunction("canonicalize_clauses_commutative_terms_destructive", "CANONICALIZE-CLAUSES-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        declareFunction("canonicalize_clause_commutative_terms", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_clause_commutative_terms_destructive", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        new czer_main.$canonicalize_clause_commutative_terms_destructive$UnaryFunction();
        declareFunction("never_commutative_gaf_clauseP", "NEVER-COMMUTATIVE-GAF-CLAUSE?", 1, 0, false);
        declareFunction("canonicalize_literals_commutative_terms", "CANONICALIZE-LITERALS-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_literal_commutative_terms", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_literal_commutative_terms_destructive", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        new czer_main.$canonicalize_literal_commutative_terms_destructive$UnaryFunction();
        declareFunction("canonicalize_literal_commutative_args", "CANONICALIZE-LITERAL-COMMUTATIVE-ARGS", 1, 0, false);
        declareFunction("order_commutative_terms", "ORDER-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_terms_commutative_terms_without_reordering", "CANONICALIZE-TERMS-COMMUTATIVE-TERMS-WITHOUT-REORDERING", 2, 0, false);
        declareFunction("canonicalize_term_commutative_terms", "CANONICALIZE-TERM-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("unary_function_commutes_with_its_argumentP", "UNARY-FUNCTION-COMMUTES-WITH-ITS-ARGUMENT?", 1, 0, false);
        declareFunction("canonicalize_commuting_function", "CANONICALIZE-COMMUTING-FUNCTION", 1, 0, false);
        declareFunction("canonicalize_nat_commutative_terms", "CANONICALIZE-NAT-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_relation_commutative_terms", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("canonicalize_relation_commutative_terms_destructive", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        declareFunction("sort_relation_commutative_terms", "SORT-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction("sort_partially_commutative_terms", "SORT-PARTIALLY-COMMUTATIVE-TERMS", 3, 0, false);
        declareFunction("commutative_argnums", "COMMUTATIVE-ARGNUMS", 1, 0, false);
        declareFunction("ok_wrt_partial_commutativityP", "OK-WRT-PARTIAL-COMMUTATIVITY?", 3, 0, false);
        declareFunction("partially_commutative_argnums", "PARTIALLY-COMMUTATIVE-ARGNUMS", 2, 0, false);
        declareFunction("partially_commutative_argnums_int", "PARTIALLY-COMMUTATIVE-ARGNUMS-INT", 2, 1, false);
        declareFunction("cia_formulas", "CIA-FORMULAS", 1, 1, false);
        declareFunction("commutative_terms_in_orderP", "COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
        new czer_main.$commutative_terms_in_orderP$BinaryFunction();
        declareFunction("commutative_formulas_in_orderP", "COMMUTATIVE-FORMULAS-IN-ORDER?", 2, 0, false);
        declareFunction("canonicalizer_constant_L", "CANONICALIZER-CONSTANT-<", 2, 0, false);
        declareFunction("commutative_atoms_in_orderP", "COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
        declareFunction("canon_term_L", "CANON-TERM-<", 2, 0, false);
        declareFunction("canonicalize_functions_in_clause", "CANONICALIZE-FUNCTIONS-IN-CLAUSE", 1, 0, false);
        declareFunction("canonicalize_functions", "CANONICALIZE-FUNCTIONS", 1, 0, false);
        declareFunction("add_term_of_unit_lits", "ADD-TERM-OF-UNIT-LITS", 1, 0, false);
        declareFunction("clauses_free_variables", "CLAUSES-FREE-VARIABLES", 1, 0, false);
        declareFunction("add_term_of_unit_lits_1", "ADD-TERM-OF-UNIT-LITS-1", 1, 0, false);
        declareFunction("equal_wrt_svm", "EQUAL-WRT-SVM", 2, 0, false);
        declareFunction("reifiable_function_term_in_clauseP", "REIFIABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
        declareFunction("evaluatable_function_term_in_clauseP", "EVALUATABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
        declareFunction("czer_create_nartP", "CZER-CREATE-NART?", 1, 0, false);
        declareFunction("czer_create_nartsP", "CZER-CREATE-NARTS?", 0, 0, false);
        declareFunction("reify_relation_functions_in_mt_list", "REIFY-RELATION-FUNCTIONS-IN-MT-LIST", 2, 1, false);
        declareFunction("reify_relation_functions", "REIFY-RELATION-FUNCTIONS", 1, 1, false);
        declareFunction("reify_relation_functions_in", "REIFY-RELATION-FUNCTIONS-IN", 3, 0, false);
        declareFunction("reify_relation_function_in", "REIFY-RELATION-FUNCTION-IN", 3, 0, false);
        declareFunction("reify_functions_in_mt", "REIFY-FUNCTIONS-IN-MT", 2, 0, false);
        declareFunction("reify_functions", "REIFY-FUNCTIONS", 2, 0, false);
        declareFunction("reify_functions_in", "REIFY-FUNCTIONS-IN", 2, 0, false);
        declareFunction("reify_function_in_fns", "REIFY-FUNCTION-IN-FNS", 2, 0, false);
        declareFunction("reify_function_in", "REIFY-FUNCTION-IN", 2, 0, false);
        declareFunction("reify_function_in_destructive", "REIFY-FUNCTION-IN-DESTRUCTIVE", 2, 0, false);
        declareFunction("canonicalize_fn_term_if_reified", "CANONICALIZE-FN-TERM-IF-REIFIED", 1, 0, false);
        declareFunction("canonicalize_fn_term_if_reified_destructive", "CANONICALIZE-FN-TERM-IF-REIFIED-DESTRUCTIVE", 1, 0, false);
        declareFunction("canonicalize_fn_term", "CANONICALIZE-FN-TERM", 1, 0, false);
        declareFunction("cyc_find_or_create_nart", "CYC-FIND-OR-CREATE-NART", 1, 1, false);
        declareFunction("low_find_or_create_nart", "LOW-FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction("canonicalize_fn_term_int", "CANONICALIZE-FN-TERM-INT", 3, 1, false);
        declareFunction("canonicalize_naut", "CANONICALIZE-NAUT", 1, 0, false);
        declareFunction("cyc_find_or_create_canonical_nart", "CYC-FIND-OR-CREATE-CANONICAL-NART", 1, 0, false);
        declareFunction("clear_nart_defining_rules_cached", "CLEAR-NART-DEFINING-RULES-CACHED", 0, 0, false);
        declareFunction("remove_nart_defining_rules_cached", "REMOVE-NART-DEFINING-RULES-CACHED", 0, 1, false);
        declareFunction("nart_defining_rules_cached_internal", "NART-DEFINING-RULES-CACHED-INTERNAL", 1, 0, false);
        declareFunction("nart_defining_rules_cached", "NART-DEFINING-RULES-CACHED", 0, 1, false);
        declareFunction("cyc_create_nart", "CYC-CREATE-NART", 1, 0, false);
        declareFunction("new_canonicalize_fn_term", "NEW-CANONICALIZE-FN-TERM", 1, 0, false);
        declareFunction("new_nested_fn_terms", "NEW-NESTED-FN-TERMS", 1, 0, false);
        declareFunction("nested_fn_terms", "NESTED-FN-TERMS", 1, 0, false);
        declareFunction("all_nested_fn_terms", "ALL-NESTED-FN-TERMS", 1, 0, false);
        declareFunction("fort_sort_by_type_and_id", "FORT-SORT-BY-TYPE-AND-ID", 1, 0, false);
        declareFunction("fort_type_and_id_L", "FORT-TYPE-AND-ID-<", 2, 0, false);
        declareFunction("clause_quantified_fn_terms", "CLAUSE-QUANTIFIED-FN-TERMS", 1, 0, false);
        declareFunction("literals_quantified_fn_terms", "LITERALS-QUANTIFIED-FN-TERMS", 1, 0, false);
        declareFunction("literal_quantified_fn_terms", "LITERAL-QUANTIFIED-FN-TERMS", 1, 0, false);
        new czer_main.$literal_quantified_fn_terms$UnaryFunction();
        declareFunction("clause_terms_to_reify", "CLAUSE-TERMS-TO-REIFY", 1, 0, false);
        declareFunction("literal_terms_to_reify", "LITERAL-TERMS-TO-REIFY", 1, 1, false);
        new czer_main.$literal_terms_to_reify$UnaryFunction();
        new czer_main.$literal_terms_to_reify$BinaryFunction();
        declareFunction("function_terms_to_reify", "FUNCTION-TERMS-TO-REIFY", 1, 1, false);
        declareFunction("relation_terms_to_reify", "RELATION-TERMS-TO-REIFY", 1, 1, false);
        declareFunction("guaranteed_nothing_to_reifyP", "GUARANTEED-NOTHING-TO-REIFY?", 1, 0, false);
        declareFunction("reify_argP", "REIFY-ARG?", 3, 1, false);
        declareFunction("dont_reify_arg_or_subtermsP", "DONT-REIFY-ARG-OR-SUBTERMS?", 4, 0, false);
        declareFunction("reify_termP", "REIFY-TERM?", 1, 1, false);
        declareFunction("forward_inference_reifiable_function_termP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction("forward_inference_reifiable_functionP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION?", 1, 1, false);
        declareFunction("subst_canon_fn_in_clauses", "SUBST-CANON-FN-IN-CLAUSES", 3, 0, false);
        declareFunction("subst_canon_fn_in_clause", "SUBST-CANON-FN-IN-CLAUSE", 3, 0, false);
        declareFunction("subst_canon_fn_in_relation", "SUBST-CANON-FN-IN-RELATION", 3, 1, false);
        declareFunction("subst_canon_fn_in_literal", "SUBST-CANON-FN-IN-LITERAL", 3, 0, false);
        declareFunction("subst_canon_fn_in_nat", "SUBST-CANON-FN-IN-NAT", 3, 0, false);
        declareFunction("canonicalize_clauses_transformable_nats", "CANONICALIZE-CLAUSES-TRANSFORMABLE-NATS", 1, 0, false);
        declareFunction("canonicalize_clause_transformable_nats", "CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS", 1, 0, false);
        declareFunction("nat_atoms", "NAT-ATOMS", 1, 0, false);
        declareFunction("canonicalize_literals_transformable_nats", "CANONICALIZE-LITERALS-TRANSFORMABLE-NATS", 2, 0, false);
        declareFunction("nat_transforming_litP", "NAT-TRANSFORMING-LIT?", 1, 0, false);
        declareFunction("possibly_nat_transforming_litP", "POSSIBLY-NAT-TRANSFORMING-LIT?", 1, 0, false);
        declareFunction("destructive_nat_transforming_litP", "DESTRUCTIVE-NAT-TRANSFORMING-LIT?", 2, 0, false);
        declareFunction("dwim_svm_wrt_scoping", "DWIM-SVM-WRT-SCOPING", 3, 0, false);
        declareFunction("var_is_scoped_in_literalP", "VAR-IS-SCOPED-IN-LITERAL?", 2, 0, false);
        declareFunction("var_is_scoped_in_formulaP", "VAR-IS-SCOPED-IN-FORMULA?", 1, 0, false);
        declareFunction("canonicalize_clauses_literals", "CANONICALIZE-CLAUSES-LITERALS", 1, 0, false);
        declareFunction("sort_clauses", "SORT-CLAUSES", 1, 0, false);
        declareFunction("clauses_in_orderP", "CLAUSES-IN-ORDER?", 2, 0, false);
        declareFunction("sort_clauses_literals", "SORT-CLAUSES-LITERALS", 1, 0, false);
        declareFunction("sort_clause_literals", "SORT-CLAUSE-LITERALS", 1, 1, false);
        new czer_main.$sort_clause_literals$UnaryFunction();
        new czer_main.$sort_clause_literals$BinaryFunction();
        declareFunction("canonicalize_skolem_clause", "CANONICALIZE-SKOLEM-CLAUSE", 1, 1, false);
        declareFunction("sort_clause_literals_destructive", "SORT-CLAUSE-LITERALS-DESTRUCTIVE", 1, 1, false);
        declareFunction("tou_lits_at_rear", "TOU-LITS-AT-REAR", 1, 0, false);
        declareFunction("evaluate_lits_at_rear", "EVALUATE-LITS-AT-REAR", 1, 0, false);
        declareFunction("sort_literals", "SORT-LITERALS", 1, 4, false);
        declareFunction("pick_a_lit", "PICK-A-LIT", 1, 4, false);
        declareFunction("new_bound_vars", "NEW-BOUND-VARS", 1, 1, false);
        declareFunction("new_connected_vars", "NEW-CONNECTED-VARS", 1, 1, false);
        declareFunction("unbound_vars", "UNBOUND-VARS", 2, 0, false);
        declareFunction("most_constrained_literals", "MOST-CONSTRAINED-LITERALS", 1, 2, false);
        declareFunction("unbound_vars_score", "UNBOUND-VARS-SCORE", 2, 0, false);
        declareFunction("temp_unbound_vars_score", "TEMP-UNBOUND-VARS-SCORE", 2, 0, false);
        declareFunction("fewest_arg_literals", "FEWEST-ARG-LITERALS", 1, 0, false);
        declareFunction("left_weighted_literals", "LEFT-WEIGHTED-LITERALS", 1, 0, false);
        declareFunction("left_weighted_score", "LEFT-WEIGHTED-SCORE", 1, 1, false);
        declareFunction("n_left_weighted_score_weights", "N-LEFT-WEIGHTED-SCORE-WEIGHTS", 1, 1, false);
        declareFunction("left_connected_literals", "LEFT-CONNECTED-LITERALS", 1, 1, false);
        declareFunction("left_connected_score", "LEFT-CONNECTED-SCORE", 2, 0, false);
        declareFunction("left_rooted_literals", "LEFT-ROOTED-LITERALS", 1, 1, false);
        declareFunction("default_lit_sort", "DEFAULT-LIT-SORT", 1, 0, false);
        declareFunction("lit_L", "LIT-<", 2, 0, false);
        new czer_main.$lit_L$BinaryFunction();
        declareFunction("pred_L", "PRED-<", 2, 0, false);
        declareFunction("left_rooted_literals_int", "LEFT-ROOTED-LITERALS-INT", 1, 1, false);
        declareFunction("left_rooted_score", "LEFT-ROOTED-SCORE", 2, 1, false);
        declareFunction("max_scored_item", "MAX-SCORED-ITEM", 1, 2, false);
        declareFunction("least_complex_literals", "LEAST-COMPLEX-LITERALS", 1, 1, false);
        declareFunction("el_complexity_score", "EL-COMPLEXITY-SCORE", 1, 2, false);
        declareFunction("default_preference_lit", "DEFAULT-PREFERENCE-LIT", 1, 0, false);
        declareFunction("canonicalize_disjunctions_as_enumerations", "CANONICALIZE-DISJUNCTIONS-AS-ENUMERATIONS", 1, 0, false);
        declareFunction("canonicalize_clauses_variables", "CANONICALIZE-CLAUSES-VARIABLES", 1, 0, false);
        declareFunction("rename_clauses_vars", "RENAME-CLAUSES-VARS", 1, 0, false);
        declareFunction("standardize_variable_memory_binding", "STANDARDIZE-VARIABLE-MEMORY-BINDING", 2, 0, false);
        declareFunction("el_nununiquifying_blist_wrt", "EL-NUNUNIQUIFYING-BLIST-WRT", 1, 2, false);
        declareFunction("el_nununiquify_vars_wrt_int", "EL-NUNUNIQUIFY-VARS-WRT-INT", 2, 2, false);
        declareFunction("el_nununiquify_vars_wrt", "EL-NUNUNIQUIFY-VARS-WRT", 2, 0, false);
        declareFunction("el_nununiquify_vars_int", "EL-NUNUNIQUIFY-VARS-INT", 1, 2, false);
        declareFunction("el_ununiquify_vars_int", "EL-UNUNIQUIFY-VARS-INT", 1, 2, false);
        declareFunction("el_nununiquify_vars", "EL-NUNUNIQUIFY-VARS", 1, 0, false);
        declareFunction("uniquify", "UNIQUIFY", 1, 0, false);
        declareFunction("rename_clauses_vars_safe", "RENAME-CLAUSES-VARS-SAFE", 1, 0, false);
        declareFunction("rename_clause_vars", "RENAME-CLAUSE-VARS", 1, 1, false);
        declareFunction("rename_single_clause_vars_int", "RENAME-SINGLE-CLAUSE-VARS-INT", 1, 1, false);
        declareFunction("rename_clause_vars_int", "RENAME-CLAUSE-VARS-INT", 2, 1, false);
        new czer_main.$rename_clause_vars_int$BinaryFunction();
        declareFunction("lookup_closed_vars_from_standardize_variables_memory", "LOOKUP-CLOSED-VARS-FROM-STANDARDIZE-VARIABLES-MEMORY", 0, 0, false);
        declareFunction("blist_vars_among", "BLIST-VARS-AMONG", 2, 0, false);
        declareFunction("blist_vars_not_among", "BLIST-VARS-NOT-AMONG", 2, 0, false);
        declareFunction("all_bindings", "ALL-BINDINGS", 2, 0, false);
        declareFunction("clause_el_variables", "CLAUSE-EL-VARIABLES", 1, 1, false);
        declareFunction("initialize_symbol_suffix_table", "INITIALIZE-SYMBOL-SUFFIX-TABLE", 1, 0, false);
        declareFunction("initialize_suffix_table_for_var", "INITIALIZE-SUFFIX-TABLE-FOR-VAR", 1, 0, false);
        new czer_main.$initialize_suffix_table_for_var$UnaryFunction();
        declareFunction("extract_name_uniquifying_post_hyphen_integer", "EXTRACT-NAME-UNIQUIFYING-POST-HYPHEN-INTEGER", 1, 0, false);
        declareFunction("canonicalize_clauses", "CANONICALIZE-CLAUSES", 2, 0, false);
        declareFunction("canonicalize_query_clauses", "CANONICALIZE-QUERY-CLAUSES", 2, 0, false);
        declareFunction("canonicalize_clauses_int", "CANONICALIZE-CLAUSES-INT", 4, 0, false);
        declareFunction("canon_fast_clausesP", "CANON-FAST-CLAUSES?", 1, 0, false);
        declareFunction("unwrap_clauses_if_ist_permissive", "UNWRAP-CLAUSES-IF-IST-PERMISSIVE", 2, 0, false);
        declareFunction("lift_clauses_if_decontextualized", "LIFT-CLAUSES-IF-DECONTEXTUALIZED", 2, 0, false);
        declareFunction("clauses_syntactic_wff_check", "CLAUSES-SYNTACTIC-WFF-CHECK", 2, 0, false);
        declareFunction("psc_queryP", "PSC-QUERY?", 0, 1, false);
        declareFunction("canonicalizer_problemP", "CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction("tl_canonicalizer_problemP", "TL-CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction("terms_reorder_equalP", "TERMS-REORDER-EQUAL?", 2, 0, false);
        declareFunction("cnfs_reorder_tou_equalP", "CNFS-REORDER-TOU-EQUAL?", 2, 1, false);
        declareFunction("unique_arity_literal", "UNIQUE-ARITY-LITERAL", 1, 0, false);
        declareFunction("unique_list_structure_literal", "UNIQUE-LIST-STRUCTURE-LITERAL", 1, 0, false);
        declareFunction("old_last_resort_literal", "OLD-LAST-RESORT-LITERAL", 1, 2, false);
        declareFunction("alphabetically_minimal_literal", "ALPHABETICALLY-MINIMAL-LITERAL", 1, 2, false);
        declareFunction("new_alphabetically_minimal_literal_int", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT", 1, 2, false);
        declareFunction("new_alphabetically_minimal_literal_int_2", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT-2", 1, 1, false);
        declareFunction("old_commutative_terms_in_orderP", "OLD-COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
        declareFunction("old_commutative_atoms_in_orderP", "OLD-COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
        declareFunction("old_commutative_conses_in_orderP", "OLD-COMMUTATIVE-CONSES-IN-ORDER?", 2, 0, false);
        declareFunction("last_resort_min_literals", "LAST-RESORT-MIN-LITERALS", 1, 0, false);
        declareFunction("last_resort_min_literals_int", "LAST-RESORT-MIN-LITERALS-INT", 1, 0, false);
        declareFunction("last_resort_min_literals_min", "LAST-RESORT-MIN-LITERALS-MIN", 1, 0, false);
        declareFunction("constant_median", "CONSTANT-MEDIAN", 1, 0, false);
        declareFunction("ugly_thing_L", "UGLY-THING-<", 2, 0, false);
        declareFunction("ugly_thing_G", "UGLY-THING->", 2, 0, false);
        declareFunction("last_resort_min_literals_max", "LAST-RESORT-MIN-LITERALS-MAX", 1, 0, false);
        declareFunction("last_resort_min_literals_fn", "LAST-RESORT-MIN-LITERALS-FN", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_czer_main_file_alt() {
        defparameter("*CANONICALIZE-CLAUSE-SENTENCE-TERMS-SENSE-LAMBDA*", NIL);
        defparameter("*NEVER-COMMUTATIVE-PREDICATES*", $list_alt42);
        defparameter("*TOU-SKOLEM-BLIST*", $UNINITIALIZED);
        defparameter("*VAR-IS-SCOPED-IN-FORMULA-VAR*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject init_czer_main_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CANONICALIZE-CLAUSE-SENTENCE-TERMS-SENSE-LAMBDA*", NIL);
            defparameter("*NEVER-COMMUTATIVE-PREDICATES*", $list41);
            defparameter("*TOU-SKOLEM-BLIST*", $UNINITIALIZED);
            deflexical("*NART-DEFINING-RULES-CACHED-CACHING-STATE*", NIL);
            defparameter("*CZER-CREATE-NART-USES-NART-DEFINING-RULES-METHOD?*", T);
            defparameter("*VAR-IS-SCOPED-IN-FORMULA-VAR*", $UNINITIALIZED);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*NEVER-COMMUTATIVE-PREDICATES*", $list_alt42);
        }
        return NIL;
    }

    public static SubLObject init_czer_main_file_Previous() {
        defparameter("*CANONICALIZE-CLAUSE-SENTENCE-TERMS-SENSE-LAMBDA*", NIL);
        defparameter("*NEVER-COMMUTATIVE-PREDICATES*", $list41);
        defparameter("*TOU-SKOLEM-BLIST*", $UNINITIALIZED);
        deflexical("*NART-DEFINING-RULES-CACHED-CACHING-STATE*", NIL);
        defparameter("*CZER-CREATE-NART-USES-NART-DEFINING-RULES-METHOD?*", T);
        defparameter("*VAR-IS-SCOPED-IN-FORMULA-VAR*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_czer_main_file() {
        register_cyc_api_function(EL_TO_HL, $list2, $str3$Translate_el_expression_FORMULA_i, $list4, NIL);
        register_cyc_api_function(EL_TO_HL_QUERY, $list2, $str6$Translate_el_query_FORMULA_into_i, $list4, NIL);
        register_cyc_api_function(CANONICALIZE_TERM, $list8, $str9$Converts_the_EL_term_TERM_to_its_, NIL, NIL);
        memoization_state.note_memoized_function(CANONICALIZE_TERM_MEMOIZED_INT);
        memoization_state.note_memoized_function(CANONICALIZE_WF_CYCL_INT_MEMOIZED);
        memoization_state.note_memoized_function(CANONICALIZE_ASK_INT_MEMOIZED);
        memoization_state.note_globally_cached_function(NART_DEFINING_RULES_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_czer_main_file();
    }

    @Override
    public void initializeVariables() {
        init_czer_main_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_czer_main_file();
    }

    static {
    }

    public static final class $canonicalize_clause_quoted_terms$UnaryFunction extends UnaryFunction {
        public $canonicalize_clause_quoted_terms$UnaryFunction() {
            super(extractFunctionNamed("CANONICALIZE-CLAUSE-QUOTED-TERMS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return canonicalize_clause_quoted_terms(arg1);
        }
    }

    public static final class $canonicalize_clause_sentence_terms$UnaryFunction extends UnaryFunction {
        public $canonicalize_clause_sentence_terms$UnaryFunction() {
            super(extractFunctionNamed("CANONICALIZE-CLAUSE-SENTENCE-TERMS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return canonicalize_clause_sentence_terms(arg1);
        }
    }

    public static final class $canonicalize_literal_sentence_terms$UnaryFunction extends UnaryFunction {
        public $canonicalize_literal_sentence_terms$UnaryFunction() {
            super(extractFunctionNamed("CANONICALIZE-LITERAL-SENTENCE-TERMS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return canonicalize_literal_sentence_terms(arg1, czer_main.$canonicalize_literal_sentence_terms$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $canonicalize_literal_sentence_terms$BinaryFunction extends BinaryFunction {
        public $canonicalize_literal_sentence_terms$BinaryFunction() {
            super(extractFunctionNamed("CANONICALIZE-LITERAL-SENTENCE-TERMS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return canonicalize_literal_sentence_terms(arg1, arg2);
        }
    }

    public static final class $canonicalize_clause_commutative_terms_destructive$UnaryFunction extends UnaryFunction {
        public $canonicalize_clause_commutative_terms_destructive$UnaryFunction() {
            super(extractFunctionNamed("CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return canonicalize_clause_commutative_terms_destructive(arg1);
        }
    }

    public static final class $canonicalize_literal_commutative_terms_destructive$UnaryFunction extends UnaryFunction {
        public $canonicalize_literal_commutative_terms_destructive$UnaryFunction() {
            super(extractFunctionNamed("CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return canonicalize_literal_commutative_terms_destructive(arg1);
        }
    }

    public static final class $commutative_terms_in_orderP$BinaryFunction extends BinaryFunction {
        public $commutative_terms_in_orderP$BinaryFunction() {
            super(extractFunctionNamed("COMMUTATIVE-TERMS-IN-ORDER?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return commutative_terms_in_orderP(arg1, arg2);
        }
    }

    public static final class $literal_quantified_fn_terms$UnaryFunction extends UnaryFunction {
        public $literal_quantified_fn_terms$UnaryFunction() {
            super(extractFunctionNamed("LITERAL-QUANTIFIED-FN-TERMS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return literal_quantified_fn_terms(arg1);
        }
    }

    public static final class $literal_terms_to_reify$UnaryFunction extends UnaryFunction {
        public $literal_terms_to_reify$UnaryFunction() {
            super(extractFunctionNamed("LITERAL-TERMS-TO-REIFY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return literal_terms_to_reify(arg1, czer_main.$literal_terms_to_reify$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $literal_terms_to_reify$BinaryFunction extends BinaryFunction {
        public $literal_terms_to_reify$BinaryFunction() {
            super(extractFunctionNamed("LITERAL-TERMS-TO-REIFY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return literal_terms_to_reify(arg1, arg2);
        }
    }

    public static final class $sort_clause_literals$UnaryFunction extends UnaryFunction {
        public $sort_clause_literals$UnaryFunction() {
            super(extractFunctionNamed("SORT-CLAUSE-LITERALS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sort_clause_literals(arg1, czer_main.$sort_clause_literals$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $sort_clause_literals$BinaryFunction extends BinaryFunction {
        public $sort_clause_literals$BinaryFunction() {
            super(extractFunctionNamed("SORT-CLAUSE-LITERALS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return sort_clause_literals(arg1, arg2);
        }
    }

    public static final class $lit_L$BinaryFunction extends BinaryFunction {
        public $lit_L$BinaryFunction() {
            super(extractFunctionNamed("LIT-<"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return lit_L(arg1, arg2);
        }
    }

    public static final class $rename_clause_vars_int$BinaryFunction extends BinaryFunction {
        public $rename_clause_vars_int$BinaryFunction() {
            super(extractFunctionNamed("RENAME-CLAUSE-VARS-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return rename_clause_vars_int(arg1, arg2, czer_main.$rename_clause_vars_int$BinaryFunction.UNPROVIDED);
        }
    }

    public static final class $initialize_suffix_table_for_var$UnaryFunction extends UnaryFunction {
        public $initialize_suffix_table_for_var$UnaryFunction() {
            super(extractFunctionNamed("INITIALIZE-SUFFIX-TABLE-FOR-VAR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return initialize_suffix_table_for_var(arg1);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    static private final SubLString $str_alt3$Translate_el_expression_FORMULA_i = makeString("Translate el expression FORMULA into its equivalent canonical hl expressions");

    static private final SubLList $list_alt4 = list(list(makeSymbol("FORMULA"), makeSymbol("EL-FORMULA-P")));

    static private final SubLString $str_alt6$Translate_el_query_FORMULA_into_i = makeString("Translate el query FORMULA into its equivalent hl expressions");

    static private final SubLList $list_alt8 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*MT*")));

    static private final SubLString $str_alt9$Converts_the_EL_term_TERM_to_its_ = makeString("Converts the EL term TERM to its canonical HL representation.\n   @return HL term");

    public static final SubLSymbol $kw11$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt13$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym14$CANON_WFF_ = makeSymbol("CANON-WFF?");

    static private final SubLSymbol $sym16$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");

    static private final SubLSymbol $sym24$EL_WFF_SYNTAX_ = makeSymbol("EL-WFF-SYNTAX?");

    static private final SubLString $str_alt26$Unknown_clausal_form__s = makeString("Unknown clausal form ~s");

    static private final SubLSymbol $sym29$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLString $str_alt40$Tried_to_canonicalize_the_formula = makeString("Tried to canonicalize the formula terms of ~A, but it did not have the syntax of an EL relation.");

    static private final SubLList $list_alt42 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLSymbol $sym44$COMMUTATIVE_TERMS_IN_ORDER_ = makeSymbol("COMMUTATIVE-TERMS-IN-ORDER?");

    static private final SubLSymbol $sym51$_ = makeSymbol("<");

    static private final SubLSymbol $sym54$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str_alt56$warning__trying_to_sort_the_varia = makeString("warning: trying to sort the variables ~A and ~A~%");

    static private final SubLString $str_alt57$warning__trying_to_string_sort_th = makeString("warning: trying to string-sort the atoms ~A and ~A~%");

    static private final SubLString $str_alt66$Tried_to_reify_functions_within__ = makeString("Tried to reify functions within ~A, but it was not a relation expression.");

    static private final SubLSymbol $sym71$_ = makeSymbol(">");

    static private final SubLList $list_alt76 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));

    static private final SubLString $str_alt77$SORT_BY_ID_called_on_list_contain = makeString("SORT-BY-ID called on list containing non-forts");

    static private final SubLSymbol $sym78$FORT_TYPE_AND_ID__ = makeSymbol("FORT-TYPE-AND-ID-<");

    static private final SubLSymbol $sym80$NO_FREE_VARIABLES_ = makeSymbol("NO-FREE-VARIABLES?");

    static private final SubLList $list_alt86 = list(makeSymbol("TERM"), makeSymbol("NAT"));

    static private final SubLList $list_alt88 = cons(makeSymbol("OLD-VAR"), makeSymbol("NEW-VAR"));

    static private final SubLSymbol $sym89$VAR_IS_SCOPED_IN_FORMULA_ = makeSymbol("VAR-IS-SCOPED-IN-FORMULA?");

    static private final SubLSymbol $sym90$CLAUSES_IN_ORDER_ = makeSymbol("CLAUSES-IN-ORDER?");

    static private final SubLString $str_alt93$most_constrained_literals_succeed = makeString("most-constrained-literals succeeded!");

    static private final SubLString $str_alt94$fewest_arg_literals_succeeded_ = makeString("fewest-arg-literals succeeded!");

    static private final SubLString $str_alt95$left_weighted_literals_succeeded_ = makeString("left-weighted-literals succeeded!");

    static private final SubLString $str_alt96$left_connected_literals_succeeded = makeString("left-connected-literals succeeded!");

    static private final SubLString $str_alt97$left_rooted_literals_succeeded_ = makeString("left-rooted-literals succeeded!");

    static private final SubLString $str_alt98$least_complex_literals_succeeded_ = makeString("least-complex-literals succeeded!");

    static private final SubLString $str_alt99$penultimate_resort_literals_1_suc = makeString("penultimate-resort-literals-1 succeeded!");

    static private final SubLString $str_alt100$penultimate_resort_literals_2_suc = makeString("penultimate-resort-literals-2 succeeded!");

    static private final SubLSymbol $sym102$LIT__ = makeSymbol("LIT-<");

    static private final SubLString $str_alt103$Got_a_fort_that_was_neither_a_nar = makeString("Got a fort that was neither a nart nor a constant.  It was one of these: ~a or ~a");

    static private final SubLString $str_alt104$_s_is_not_an_element_of__s = makeString("~s is not an element of ~s");

    private static final SubLSymbol RENAME_CLAUSE_VARS_INT = makeSymbol("RENAME-CLAUSE-VARS-INT");

    static private final SubLSymbol $sym111$CANON_VAR_ = makeSymbol("CANON-VAR?");

    static private final SubLString $str_alt113$_s_treated_as_variable_in_rename_ = makeString("~s treated as variable in rename-clause-vars");

    private static final SubLSymbol INITIALIZE_SUFFIX_TABLE_FOR_VAR = makeSymbol("INITIALIZE-SUFFIX-TABLE-FOR-VAR");

    static private final SubLSymbol $sym120$CONSTANT_EXTERNAL_ID__ = makeSymbol("CONSTANT-EXTERNAL-ID-<");
}

/**
 * Total time: 1590 ms
 */
