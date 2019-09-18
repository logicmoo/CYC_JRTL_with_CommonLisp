package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.control_vars.$prefer_forward_skolemization$;
import static com.cyc.cycjava.cycl.control_vars.$within_ask$;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.control_vars.$within_query$;
import static com.cyc.cycjava.cycl.control_vars.$within_unassert$;
import static com.cyc.cycjava.cycl.control_vars.within_queryP;
import static com.cyc.cycjava.cycl.el_utilities.arg_types_prescribe_unreifiedP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.contains_subformula_p;
import static com.cyc.cycjava.cycl.el_utilities.copy_clause;
import static com.cyc.cycjava.cycl.el_utilities.copy_clauses;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.evaluate_litP;
import static com.cyc.cycjava.cycl.el_utilities.formula_non_var_symbols;
import static com.cyc.cycjava.cycl.el_utilities.formula_position;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.literalP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_arity;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.literal_variables;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_literal;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_nat_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_nat_formula;
import static com.cyc.cycjava.cycl.el_utilities.nadd_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.referenced_variables;
import static com.cyc.cycjava.cycl.el_utilities.relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.relation_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.scoping_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.strip_sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.subl_escape_p;
import static com.cyc.cycjava.cycl.el_utilities.tou_litP;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_lessp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gentemp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class czer_main extends SubLTranslatedFile {
    public static final SubLFile me = new czer_main();

    public static final String myName = "com.cyc.cycjava.cycl.czer_main";

    public static final String myFingerPrint = "f52eac3476d880a9951ae714906645a39c499adf83b8ea7c9dc5ad112b7cefdf";

    // defparameter
    private static final SubLSymbol $canonicalize_clause_sentence_terms_sense_lambda$ = makeSymbol("*CANONICALIZE-CLAUSE-SENTENCE-TERMS-SENSE-LAMBDA*");

    // defparameter
    /**
     * A list of predicates that are guaranteed to never be commutative. Checked for
     * speed before calling on SBHL.
     */
    private static final SubLSymbol $never_commutative_predicates$ = makeSymbol("*NEVER-COMMUTATIVE-PREDICATES*");

    // defparameter
    /**
     * A binding list to remember existential variables, to remember the original EL
     * variable as it was asserted.
     */
    public static final SubLSymbol $tou_skolem_blist$ = makeSymbol("*TOU-SKOLEM-BLIST*");



    // defparameter
    public static final SubLSymbol $czer_create_nart_uses_nart_defining_rules_methodP$ = makeSymbol("*CZER-CREATE-NART-USES-NART-DEFINING-RULES-METHOD?*");

    // defparameter
    // lambda for var-is-scoped-in-formula?
    private static final SubLSymbol $var_is_scoped_in_formula_var$ = makeSymbol("*VAR-IS-SCOPED-IN-FORMULA-VAR*");



    public static final SubLSymbol EL_TO_HL = makeSymbol("EL-TO-HL");

    public static final SubLList $list2 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    public static final SubLString $str3$Translate_el_expression_FORMULA_i = makeString("Translate el expression FORMULA into its equivalent canonical hl expressions");

    public static final SubLList $list4 = list(list(makeSymbol("FORMULA"), makeSymbol("EL-FORMULA-P")));

    public static final SubLSymbol EL_TO_HL_QUERY = makeSymbol("EL-TO-HL-QUERY");

    public static final SubLString $str6$Translate_el_query_FORMULA_into_i = makeString("Translate el query FORMULA into its equivalent hl expressions");



    public static final SubLList $list8 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*MT*")));

    public static final SubLString $str9$Converts_the_EL_term_TERM_to_its_ = makeString("Converts the EL term TERM to its canonical HL representation.\n   @return HL term");

    public static final SubLSymbol CANONICALIZE_TERM_MEMOIZED_INT = makeSymbol("CANONICALIZE-TERM-MEMOIZED-INT");



    private static final SubLString $$$czer_memoization_state = makeString("czer memoization state");

    private static final SubLSymbol $sym13$CANON_WFF_ = makeSymbol("CANON-WFF?");



    private static final SubLSymbol $sym15$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");

    private static final SubLObject $$skolem = reader_make_constant_shell(makeString("skolem"));

    private static final SubLObject $$termDependsOn = reader_make_constant_shell(makeString("termDependsOn"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

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

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLObject $$EscapeQuote = reader_make_constant_shell(makeString("EscapeQuote"));

    private static final SubLSymbol FAST_ESCAPE_QUOTE_TERM_P = makeSymbol("FAST-ESCAPE-QUOTE-TERM-P");



    private static final SubLSymbol CANONICALIZE_CLAUSE_SENTENCE_TERMS = makeSymbol("CANONICALIZE-CLAUSE-SENTENCE-TERMS");



    private static final SubLSymbol CANONICALIZE_LITERAL_SENTENCE_TERMS = makeSymbol("CANONICALIZE-LITERAL-SENTENCE-TERMS");



    private static final SubLSymbol EL_NEGATION_P = makeSymbol("EL-NEGATION-P");

    private static final SubLString $str39$Tried_to_canonicalize_the_formula = makeString("Tried to canonicalize the formula terms of ~A, but it did not have the syntax of an EL relation.");

    private static final SubLSymbol CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol("CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE");

    private static final SubLList $list41 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    private static final SubLSymbol CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol("CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE");

    private static final SubLSymbol $sym43$COMMUTATIVE_TERMS_IN_ORDER_ = makeSymbol("COMMUTATIVE-TERMS-IN-ORDER?");

    private static final SubLSymbol $HELLO_YOU_SILLY_COMPILER = makeKeyword("HELLO-YOU-SILLY-COMPILER");





    private static final SubLObject $$commutativeInArgsAndRest = reader_make_constant_shell(makeString("commutativeInArgsAndRest"));

    private static final SubLSymbol $TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");

    private static final SubLSymbol $CYCLIC_COMMUTATIVE_IN_ARGS = makeKeyword("CYCLIC-COMMUTATIVE-IN-ARGS");

    private static final SubLSymbol $sym50$_ = makeSymbol("<");

    private static final SubLObject $$commutativeInArgs = reader_make_constant_shell(makeString("commutativeInArgs"));



    private static final SubLSymbol $sym53$EL_VAR_ = makeSymbol("EL-VAR?");



    private static final SubLString $str55$warning__trying_to_sort_the_varia = makeString("warning: trying to sort the variables ~A and ~A~%");

    private static final SubLString $str56$warning__trying_to_string_sort_th = makeString("warning: trying to string-sort the atoms ~A and ~A~%");



    private static final SubLSymbol ADD_TERM_OF_UNIT_LITS_1 = makeSymbol("ADD-TERM-OF-UNIT-LITS-1");



    private static final SubLSymbol EQUAL_WRT_SVM = makeSymbol("EQUAL-WRT-SVM");

    private static final SubLObject $$ReifiableFunction = reader_make_constant_shell(makeString("ReifiableFunction"));

    private static final SubLObject $$CycLReifiableDenotationalTerm = reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm"));

    private static final SubLObject $$EvaluatableFunction = reader_make_constant_shell(makeString("EvaluatableFunction"));

    private static final SubLSymbol $sym64$_EXIT = makeSymbol("%EXIT");



    public static final SubLString $str66$Tried_to_reify_functions_within__ = makeString("Tried to reify functions within ~A, but it was not a relation expression.");



    public static final SubLSymbol CLAUSE_TERMS_TO_REIFY = makeSymbol("CLAUSE-TERMS-TO-REIFY");

    private static final SubLSymbol TERM_RELATIONAL_COMPLEXITY = makeSymbol("TERM-RELATIONAL-COMPLEXITY");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SCOPE-OF-SKOLEM");

    private static final SubLSymbol $sym72$_ = makeSymbol(">");

    private static final SubLSymbol TERM_FUNCTIONAL_COMPLEXITY = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY");

    private static final SubLSymbol NART_DEFINING_RULES_CACHED = makeSymbol("NART-DEFINING-RULES-CACHED");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));





    private static final SubLObject $$WFFConstraintPredicate = reader_make_constant_shell(makeString("WFFConstraintPredicate"));

    private static final SubLList $list79 = list(reader_make_constant_shell(makeString("natFunction")), reader_make_constant_shell(makeString("termOfUnit")));

    private static final SubLSymbol $nart_defining_rules_cached_caching_state$ = makeSymbol("*NART-DEFINING-RULES-CACHED-CACHING-STATE*");

    private static final SubLSymbol TL_FIND_OR_CREATE_NART = makeSymbol("TL-FIND-OR-CREATE-NART");

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLList $list83 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));





    private static final SubLString $str86$SORT_BY_ID_called_on_list_contain = makeString("SORT-BY-ID called on list containing non-forts");

    private static final SubLSymbol $sym87$FORT_TYPE_AND_ID__ = makeSymbol("FORT-TYPE-AND-ID-<");

    private static final SubLSymbol LITERAL_QUANTIFIED_FN_TERMS = makeSymbol("LITERAL-QUANTIFIED-FN-TERMS");

    private static final SubLSymbol $sym89$NO_FREE_VARIABLES_ = makeSymbol("NO-FREE-VARIABLES?");

    private static final SubLSymbol LITERAL_TERMS_TO_REIFY = makeSymbol("LITERAL-TERMS-TO-REIFY");

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLObject $$ExpandSubLFn = reader_make_constant_shell(makeString("ExpandSubLFn"));

    private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));

    private static final SubLSymbol CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS = makeSymbol("CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS");

    private static final SubLList $list95 = list(makeSymbol("TERM"), makeSymbol("NAT"));



    private static final SubLList $list97 = list(reader_make_constant_shell(makeString("termOfUnit")), reader_make_constant_shell(makeString("evaluate")));

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



    public static SubLObject el_to_hl(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLSystemTrampolineFile.enforceType(formula, EL_FORMULA_P);
        return canonicalize_cycl(formula, mt);
    }

    public static SubLObject el_to_hl_query(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLSystemTrampolineFile.enforceType(formula, EL_FORMULA_P);
        return canonicalize_query(formula, mt, NIL, T);
    }

    public static SubLObject el_to_hl_fast(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject result = NIL;
        result = canonicalize_cycl_int(formula, mt, NIL, NIL, T, NIL);
        return result;
    }

    public static SubLObject el_to_hl_really_fast(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_wf_cycl(sentence, mt);
    }

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

    public static SubLObject canonicalize_term_memoized(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_term_memoized_int(v_term, mt);
    }

    public static SubLObject canonicalize_term_memoized_int_internal(final SubLObject v_term, final SubLObject mt) {
        return copy_tree(canonicalize_term(v_term, mt));
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

    public static SubLObject coerce_to_fort(final SubLObject v_term) {
        final SubLObject fort = canonicalize_term(v_term, UNPROVIDED);
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return fort;
    }

    public static SubLObject canonicalize_gaf(final SubLObject gaf_asent, final SubLObject mt) {
        return canonicalize_assert_sentence(gaf_asent, mt);
    }

    public static SubLObject canonicalize_wf_gaf(final SubLObject gaf_asent, final SubLObject mt) {
        return canonicalize_wf_assert_sentence(gaf_asent, mt);
    }

    public static SubLObject ncanonicalize_cycl(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_cycl_int(formula, mt, NIL, T, T, UNPROVIDED);
    }

    public static SubLObject canonicalize_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_cycl_int(sentence, mt, NIL, NIL, T, UNPROVIDED);
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

    public static SubLObject canonicalize_cycl_test(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_cycl_int(formula, mt, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject canonicalize_wf_cycl(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject result = NIL;
        result = canonicalize_cycl_int(sentence, mt, NIL, NIL, NIL, NIL);
        return result;
    }

    public static SubLObject canonicalize_wf_cycl_memoized(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return copy_tree(canonicalize_wf_cycl_int_memoized(sentence, mt));
    }

    public static SubLObject canonicalize_wf_cycl_int_memoized_internal(final SubLObject sentence, final SubLObject mt) {
        return canonicalize_wf_cycl(sentence, mt);
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

    public static SubLObject canonicalize_ask_memoized(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return copy_tree(canonicalize_ask_int_memoized(sentence, mt));
    }

    public static SubLObject canonicalize_ask_int_memoized_internal(final SubLObject sentence, final SubLObject mt) {
        return canonicalize_ask(sentence, mt);
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

    public static SubLObject canonicalize_mt(SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == czer_vars.$assume_hlmt_is_canonicalP$.getDynamicValue(thread)) {
            mt = canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
            if (NIL != mt) {
                mt = hlmt_czer.canonicalize_hlmt(mt);
            }
        }
        return mt;
    }

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
    }

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

    public static SubLObject ncanonicalize_query(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_query(formula, mt, T, T);
    }

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
    }

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
    }

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

    public static SubLObject clear_canon_caches() {
        clausifier.clear_cached_cnf_clausal_form();
        czer_meta.clear_cached_find_assertions_cycl();
        return NIL;
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

    public static SubLObject check_wff_arityP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_utilities.$check_arityP$.getDynamicValue(thread);
    }

    public static SubLObject check_wff_semanticsP(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != psc_queryP(mt) ? NIL : makeBoolean((NIL != czer_vars.$must_enforce_semanticsP$.getDynamicValue(thread)) || ((NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread)) && (NIL != $within_assert$.getDynamicValue(thread))));
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

    public static SubLObject canonicalize_clauses_quoted_terms(final SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_QUOTED_TERMS), v_clauses);
    }

    public static SubLObject canonicalize_clause_quoted_terms(final SubLObject clause) {
        return clauses.make_cnf(canonicalize_literals_quoted_terms(clauses.neg_lits(clause)), canonicalize_literals_quoted_terms(clauses.pos_lits(clause)));
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

    public static SubLObject canonicalize_clauses_sentence_terms(final SubLObject v_clauses) {
        if (NIL != canonicalize_no_sentence_argsP()) {
            return v_clauses;
        }
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_SENTENCE_TERMS), v_clauses);
    }

    public static SubLObject canonicalize_no_sentence_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue(thread)) && (NIL == czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread)));
    }

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
    }

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
    }

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
    }

    public static SubLObject canonicalize_function_sentence_terms(final SubLObject function, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return canonicalize_relation_sentence_terms(function, mt);
    }

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
    }

    public static SubLObject canonicalize_clauses_commutative_terms_destructive(final SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE), v_clauses);
    }

    public static SubLObject canonicalize_clause_commutative_terms(final SubLObject clause) {
        return canonicalize_clause_commutative_terms_destructive(copy_clause(clause));
    }

    public static SubLObject canonicalize_clause_commutative_terms_destructive(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == czer_vars.$canonicalize_gaf_commutative_termsP$.getDynamicValue(thread)) && (NIL != clause_utilities.gaf_clauseP(clause))) || (NIL != never_commutative_gaf_clauseP(clause))) {
            return clause;
        }
        return clauses.make_cnf(canonicalize_literals_commutative_terms(clauses.neg_lits(clause)), canonicalize_literals_commutative_terms(clauses.pos_lits(clause)));
    }

    public static SubLObject never_commutative_gaf_clauseP(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != clause_utilities.pos_atomic_cnf_p(clause)) && (NIL != member(cycl_utilities.formula_operator(clause_utilities.gaf_cnf_literal(clause)), $never_commutative_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && (NIL == contains_subformula_p(clause_utilities.gaf_cnf_literal(clause))));
    }

    public static SubLObject canonicalize_literals_commutative_terms(final SubLObject literals) {
        return list_utilities.nmapcar(symbol_function(CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE), literals);
    }

    public static SubLObject canonicalize_literal_commutative_terms(final SubLObject literal) {
        return canonicalize_literal_commutative_terms_destructive(copy_formula(literal));
    }

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

    public static SubLObject order_commutative_terms(final SubLObject terms) {
        return Sort.sort(terms, symbol_function($sym43$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED);
    }

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
    }

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
    }

    public static SubLObject unary_function_commutes_with_its_argumentP(final SubLObject nat) {
        return makeBoolean((ONE_INTEGER.numE(cycl_utilities.nat_arity(nat, UNPROVIDED)) && ONE_INTEGER.numE(cycl_utilities.nat_arity(cycl_utilities.nat_arg1(nat, UNPROVIDED), UNPROVIDED))) && (NIL != czer_utilities.commuting_functionsP(cycl_utilities.nat_functor(nat), cycl_utilities.nat_functor(cycl_utilities.nat_arg1(nat, UNPROVIDED)), UNPROVIDED)));
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
    }

    public static SubLObject canonicalize_relation_commutative_terms(final SubLObject relation_expression) {
        return canonicalize_relation_commutative_terms_destructive(copy_formula(relation_expression));
    }

    public static SubLObject canonicalize_relation_commutative_terms_destructive(final SubLObject relation_expression) {
        final SubLObject relation = cycl_utilities.formula_operator(relation_expression);
        final SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(relation, UNPROVIDED);
        final SubLObject seqvar = sequence_var(relation_expression, UNPROVIDED);
        final SubLObject canonical_arguments = canonicalize_terms_commutative_terms_without_reordering(cycl_utilities.formula_args(relation_expression, $IGNORE), dont_reorder_argnums);
        final SubLObject subcanonical_formula = make_el_formula(relation, canonical_arguments, seqvar);
        return sort_relation_commutative_terms(subcanonical_formula);
    }

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
    }

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
    }

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
    }

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

    public static SubLObject partially_commutative_argnums(final SubLObject relation, final SubLObject args) {
        return partially_commutative_argnums_int(args, cia_formulas(relation, UNPROVIDED), NIL);
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

    public static SubLObject canonicalizer_constant_L(final SubLObject constant1, final SubLObject constant2) {
        return constants_high.constant_external_id_L(constant1, constant2);
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

    public static SubLObject canon_term_L(final SubLObject term1, final SubLObject term2) {
        return commutative_terms_in_orderP(term1, term2);
    }

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
    }

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
    }

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
    }

    public static SubLObject equal_wrt_svm(final SubLObject object_1, final SubLObject object_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(object_1.equal(object_2) || (NIL != (NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread) ? equal(el_ununiquify_vars_int(object_1, UNPROVIDED, UNPROVIDED), el_ununiquify_vars_int(object_2, UNPROVIDED, UNPROVIDED)) : NIL)));
    }

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

    public static SubLObject czer_create_nartsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $within_assert$.getDynamicValue(thread)) && (NIL == czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.getDynamicValue(thread))) || ((NIL != czer_vars.$create_narts_regardless_of_whether_within_assertP$.getDynamicValue(thread)) && (NIL == czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.getDynamicValue(thread))));
    }

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
    }

    public static SubLObject reify_relation_functions_in(final SubLObject functions, SubLObject relation, final SubLObject reify_relationP) {
        SubLObject fns;
        SubLObject fn;
        for (fns = NIL, fn = NIL, fns = functions, fn = fns.first(); NIL != fn; fn = fns.first()) {
            relation = reify_relation_function_in(fn, relation, reify_relationP);
            fns = reify_function_in_fns(fn, fns.rest());
        }
        return relation;
    }

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
    }

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

    public static SubLObject reify_function_in_fns(final SubLObject fn_term, final SubLObject fns) {
        if (NIL == czer_create_nartP(fn_term)) {
            return subst(canonicalize_fn_term_if_reified_destructive(fn_term), fn_term, fns, symbol_function(EQUAL), UNPROVIDED);
        }
        if (NIL == term.closed_fn_termP(fn_term)) {
            return fns;
        }
        return subst(canonicalize_fn_term(fn_term), fn_term, fns, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject reify_function_in(final SubLObject fn_term, final SubLObject v_clauses) {
        return reify_function_in_destructive(copy_formula(fn_term), copy_clauses(v_clauses));
    }

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
    }

    public static SubLObject canonicalize_fn_term_if_reified(final SubLObject fn_term) {
        return canonicalize_fn_term_if_reified_destructive(copy_formula(fn_term));
    }

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
    }

    public static SubLObject canonicalize_fn_term(final SubLObject fn_term) {
        return canonicalize_fn_term_int(fn_term, NIL, T, UNPROVIDED);
    }

    public static SubLObject cyc_find_or_create_nart(final SubLObject naut, SubLObject assume_all_reifiableP) {
        if (assume_all_reifiableP == UNPROVIDED) {
            assume_all_reifiableP = NIL;
        }
        return canonicalize_fn_term_int(naut, T, T, assume_all_reifiableP);
    }

    public static SubLObject low_find_or_create_nart(final SubLObject naut) {
        core.ensure_bootstrapping_kb();
        return canonicalize_fn_term_int(naut, NIL, T, T);
    }

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
    }

    public static SubLObject canonicalize_naut(final SubLObject naut) {
        return canonicalize_relation_commutative_terms(naut);
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

    public static SubLObject fort_sort_by_type_and_id(final SubLObject v_forts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(symbol_function(FORT_P), v_forts, UNPROVIDED))) {
            Errors.error($str86$SORT_BY_ID_called_on_list_contain);
        }
        return Sort.sort(copy_list(v_forts), symbol_function($sym87$FORT_TYPE_AND_ID__), UNPROVIDED);
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

    public static SubLObject literals_quantified_fn_terms(final SubLObject literals) {
        return list_utilities.mapappend(symbol_function(LITERAL_QUANTIFIED_FN_TERMS), literals);
    }

    public static SubLObject literal_quantified_fn_terms(final SubLObject literal) {
        return delete_if(symbol_function($sym89$NO_FREE_VARIABLES_), literal_terms_to_reify(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clause_terms_to_reify(final SubLObject clause) {
        return nunion(list_utilities.mapunion(symbol_function(LITERAL_TERMS_TO_REIFY), clauses.neg_lits(clause), symbol_function(EQUAL)), list_utilities.mapunion(symbol_function(LITERAL_TERMS_TO_REIFY), clauses.pos_lits(clause), symbol_function(EQUAL)), symbol_function(EQUAL), UNPROVIDED);
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

    public static SubLObject function_terms_to_reify(final SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return relation_terms_to_reify(nat, mt);
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

    public static SubLObject guaranteed_nothing_to_reifyP(final SubLObject formula) {
        return makeBoolean((NIL != cycl_grammar.fast_cycl_quoted_term_p(formula)) || (NIL == contains_subformula_p(formula)));
    }

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

    public static SubLObject forward_inference_reifiable_function_termP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return forward_inference_reifiable_functionP(cycl_utilities.nat_functor(v_term), mt);
    }

    public static SubLObject forward_inference_reifiable_functionP(final SubLObject function, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = forward.current_forward_inference_rule();
        return makeBoolean(((NIL != $prefer_forward_skolemization$.getDynamicValue(thread)) || (NIL != kb_accessors.skolemize_forwardP(function, mt))) || ((NIL != rule) && (NIL != kb_accessors.forward_reification_ruleP(function, rule, mt))));
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

    public static SubLObject subst_canon_fn_in_literal(final SubLObject new_fn, final SubLObject old_fn, final SubLObject literal) {
        return subst_canon_fn_in_relation(new_fn, old_fn, literal, UNPROVIDED);
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

    public static SubLObject canonicalize_clauses_transformable_nats(final SubLObject v_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$canonicalize_functionsP$.getDynamicValue(thread)) {
            return list_utilities.nmapcar(symbol_function(CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS), v_clauses);
        }
        return v_clauses;
    }

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
    }

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
    }

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
    }

    public static SubLObject sort_clauses(final SubLObject v_clauses) {
        return Sort.sort(sort_clauses_literals(copy_clauses(v_clauses)), symbol_function($sym100$CLAUSES_IN_ORDER_), UNPROVIDED);
    }

    public static SubLObject clauses_in_orderP(final SubLObject clause_1, final SubLObject clause_2) {
        if (length(clause_1).numL(length(clause_2))) {
            return T;
        }
        return Strings.string_lessp(string_utilities.str(clause_1), string_utilities.str(clause_2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sort_clauses_literals(final SubLObject v_clauses) {
        return list_utilities.nmapcar(symbol_function(SORT_CLAUSE_LITERALS), v_clauses);
    }

    public static SubLObject sort_clause_literals(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        return sort_clause_literals_destructive(copy_clause(clause), varP);
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
    }

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
    }

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

    public static SubLObject new_connected_vars(final SubLObject literal, SubLObject connected_vars) {
        if (connected_vars == UNPROVIDED) {
            connected_vars = NIL;
        }
        return nconc(list_utilities.ordered_set_difference(literal_variables(literal, UNPROVIDED, UNPROVIDED), connected_vars, symbol_function(EQUAL), UNPROVIDED), connected_vars);
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

    public static SubLObject unbound_vars_score(final SubLObject vars, final SubLObject bound_vars) {
        return length(unbound_vars(vars, bound_vars));
    }

    public static SubLObject temp_unbound_vars_score(final SubLObject vars, final SubLObject bound_vars) {
        return add(length(unbound_vars(vars, bound_vars)), multiply($float$0_1, length(intersection(vars, bound_vars, UNPROVIDED, UNPROVIDED))));
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

    public static SubLObject left_rooted_literals(final SubLObject literals, SubLObject original) {
        if (original == UNPROVIDED) {
            original = literals;
        }
        return left_rooted_literals_int(default_lit_sort(literals), default_lit_sort(original));
    }

    public static SubLObject default_lit_sort(final SubLObject literals) {
        return Sort.stable_sort(copy_list(literals), symbol_function($sym112$LIT__), UNPROVIDED);
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

    public static SubLObject canonicalize_disjunctions_as_enumerations(final SubLObject v_clauses) {
        return v_clauses;
    }

    public static SubLObject canonicalize_clauses_variables(final SubLObject v_clauses) {
        return rename_clauses_vars(v_clauses);
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

    public static SubLObject el_nununiquify_vars_int(final SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        return el_nununiquify_vars_wrt_int(expression, expression, updateP, forceP);
    }

    public static SubLObject el_ununiquify_vars_int(final SubLObject expression, SubLObject updateP, SubLObject forceP) {
        if (updateP == UNPROVIDED) {
            updateP = NIL;
        }
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        return el_nununiquify_vars_int(copy_expression(expression), updateP, forceP);
    }

    public static SubLObject el_nununiquify_vars(final SubLObject expression) {
        return el_nununiquify_vars_int(expression, NIL, UNPROVIDED);
    }

    public static SubLObject uniquify(final SubLObject var) {
        return gentemp(string_utilities.str(var));
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
    }

    public static SubLObject rename_single_clause_vars_int(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = NIL;
        }
        return rename_clause_vars_int(clause, clause, varP);
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

    public static SubLObject clause_el_variables(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym53$EL_VAR_);
        }
        if (NIL == list_utilities.tree_find_if(varP, clause, UNPROVIDED)) {
            return NIL;
        }
        return clause_utilities.clause_free_variables(clause, varP, UNPROVIDED);
    }

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

    public static SubLObject canonicalize_clauses(final SubLObject v_clauses, final SubLObject mt) {
        return canonicalize_clauses_int(v_clauses, mt, T, T);
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

    public static SubLObject unwrap_clauses_if_ist_permissive(final SubLObject v_clauses, final SubLObject input_mt) {
        return values(v_clauses, input_mt);
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

    public static SubLObject psc_queryP(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return makeBoolean((NIL != within_queryP()) && (NIL != psc.pscP(mt)));
    }

    public static SubLObject canonicalizer_problemP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        thread.resetMultipleValues();
        final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(NIL == list_utilities.member_eqP(assertion, fi.sentence_assertions(el_formula, el_mt)));
    }

    public static SubLObject tl_canonicalizer_problemP(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return makeBoolean(NIL == subl_promotions.memberP(assertion, ke.find_assertions_via_tl(canon_tl.assertion_tl_formula(assertion), assertions_high.assertion_mt(assertion)), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject terms_reorder_equalP(SubLObject term1, SubLObject term2) {
        if (NIL != el_formula_p(term1)) {
            term1 = copy_formula(term1);
        }
        if (NIL != el_formula_p(term2)) {
            term2 = copy_formula(term2);
        }
        return equal(canonicalize_term_commutative_terms(term1), canonicalize_term_commutative_terms(term2));
    }

    public static SubLObject cnfs_reorder_tou_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function(VARIABLE_P);
        }
        return equal(rename_clause_vars(sort_clause_literals(canonicalize_clause_commutative_terms(canonicalize_clause_transformable_nats(canonicalize_clause_commutative_terms(copy_clause(cnf1)))), varP), UNPROVIDED).first(), rename_clause_vars(sort_clause_literals(canonicalize_clause_commutative_terms(canonicalize_clause_transformable_nats(canonicalize_clause_commutative_terms(copy_clause(cnf2)))), varP), UNPROVIDED).first());
    }

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
    }

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

    public static SubLObject new_alphabetically_minimal_literal_int_2(final SubLObject literals, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = czer_vars.$varP$.getDynamicValue();
        }
        if (NIL != list_utilities.tree_find_if(varP, literals, UNPROVIDED)) {
            return new_alphabetically_minimal_literal_int(literals, literals, symbol_function(FALSE));
        }
        return literals.first();
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

    public static SubLObject constant_median(final SubLObject constants) {
        return list_utilities.parametrized_median(constants, symbol_function($sym128$CONSTANT_EXTERNAL_ID__));
    }

    public static SubLObject ugly_thing_L(final SubLObject ugly1, final SubLObject ugly2) {
        if (ugly1.eql($most_positive_fixnum$.getGlobalValue())) {
            return NIL;
        }
        if (ugly2.eql($most_positive_fixnum$.getGlobalValue())) {
            return T;
        }
        return constants_high.constant_external_id_L(ugly1, ugly2);
    }

    public static SubLObject ugly_thing_G(final SubLObject ugly1, final SubLObject ugly2) {
        return makeBoolean((NIL == ugly_thing_L(ugly1, ugly2)) && (!ugly1.equal(ugly2)));
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

    public static SubLObject last_resort_min_literals_fn(final SubLObject lit) {
        final SubLObject constants = cycl_utilities.expression_gather(lit, symbol_function(CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject value = constant_median(constants);
        if (NIL != constants_high.constant_external_id_p(value)) {
            return value;
        }
        return $most_positive_fixnum$.getGlobalValue();
    }

    public static SubLObject declare_czer_main_file() {
        declareFunction(me, "el_to_hl", "EL-TO-HL", 1, 1, false);
        declareFunction(me, "el_to_hl_query", "EL-TO-HL-QUERY", 1, 1, false);
        declareFunction(me, "el_to_hl_fast", "EL-TO-HL-FAST", 1, 1, false);
        declareFunction(me, "el_to_hl_really_fast", "EL-TO-HL-REALLY-FAST", 1, 1, false);
        declareFunction(me, "canonicalize_term", "CANONICALIZE-TERM", 1, 1, false);
        declareFunction(me, "canonicalize_term_memoized", "CANONICALIZE-TERM-MEMOIZED", 1, 1, false);
        declareFunction(me, "canonicalize_term_memoized_int_internal", "CANONICALIZE-TERM-MEMOIZED-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "canonicalize_term_memoized_int", "CANONICALIZE-TERM-MEMOIZED-INT", 2, 0, false);
        declareFunction(me, "canonicalize_term_assert", "CANONICALIZE-TERM-ASSERT", 1, 1, false);
        declareFunction(me, "coerce_to_fort", "COERCE-TO-FORT", 1, 0, false);
        declareFunction(me, "canonicalize_gaf", "CANONICALIZE-GAF", 2, 0, false);
        declareFunction(me, "canonicalize_wf_gaf", "CANONICALIZE-WF-GAF", 2, 0, false);
        declareFunction(me, "ncanonicalize_cycl", "NCANONICALIZE-CYCL", 1, 1, false);
        declareFunction(me, "canonicalize_cycl", "CANONICALIZE-CYCL", 1, 1, false);
        declareFunction(me, "canonicalize_cycl_int", "CANONICALIZE-CYCL-INT", 1, 5, false);
        declareFunction(me, "clothe_naked_skolems", "CLOTHE-NAKED-SKOLEMS", 1, 0, false);
        declareFunction(me, "czer_result_quiescedP", "CZER-RESULT-QUIESCED?", 2, 0, false);
        declareFunction(me, "canonicalize_cycl_sentence", "CANONICALIZE-CYCL-SENTENCE", 1, 1, false);
        declareFunction(me, "canonicalize_cycl_test", "CANONICALIZE-CYCL-TEST", 1, 1, false);
        declareFunction(me, "canonicalize_wf_cycl", "CANONICALIZE-WF-CYCL", 1, 1, false);
        declareFunction(me, "canonicalize_wf_cycl_memoized", "CANONICALIZE-WF-CYCL-MEMOIZED", 1, 1, false);
        declareFunction(me, "canonicalize_wf_cycl_int_memoized_internal", "CANONICALIZE-WF-CYCL-INT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "canonicalize_wf_cycl_int_memoized", "CANONICALIZE-WF-CYCL-INT-MEMOIZED", 2, 0, false);
        declareFunction(me, "canonicalize_wf_cycl_sentence", "CANONICALIZE-WF-CYCL-SENTENCE", 1, 1, false);
        declareFunction(me, "canonicalize_ask_memoized", "CANONICALIZE-ASK-MEMOIZED", 1, 1, false);
        declareFunction(me, "canonicalize_ask_int_memoized_internal", "CANONICALIZE-ASK-INT-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "canonicalize_ask_int_memoized", "CANONICALIZE-ASK-INT-MEMOIZED", 2, 0, false);
        declareFunction(me, "canonicalize_ask", "CANONICALIZE-ASK", 1, 1, false);
        declareFunction(me, "canonicalize_ask_mt", "CANONICALIZE-ASK-MT", 1, 0, false);
        declareFunction(me, "canonicalize_ask_sentence", "CANONICALIZE-ASK-SENTENCE", 1, 1, false);
        declareFunction(me, "canonicalize_assert", "CANONICALIZE-ASSERT", 1, 1, false);
        declareFunction(me, "test_canonicalize_assert", "TEST-CANONICALIZE-ASSERT", 1, 1, false);
        declareFunction(me, "canonicalize_assert_mt", "CANONICALIZE-ASSERT-MT", 1, 0, false);
        declareFunction(me, "canonicalize_mt", "CANONICALIZE-MT", 1, 0, false);
        declareFunction(me, "canonicalize_assert_sentence", "CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
        declareFunction(me, "test_canonicalize_assert_sentence", "TEST-CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
        declareFunction(me, "canonicalize_wf_assert_sentence", "CANONICALIZE-WF-ASSERT-SENTENCE", 1, 1, false);
        declareFunction(me, "canonicalize_unassert", "CANONICALIZE-UNASSERT", 1, 1, false);
        declareFunction(me, "canonicalize_unassert_sentence", "CANONICALIZE-UNASSERT-SENTENCE", 1, 1, false);
        declareFunction(me, "ncanonicalize_query", "NCANONICALIZE-QUERY", 1, 1, false);
        declareFunction(me, "canonicalize_query", "CANONICALIZE-QUERY", 1, 3, false);
        declareFunction(me, "canonicalize_query_sentence", "CANONICALIZE-QUERY-SENTENCE", 1, 1, false);
        declareFunction(me, "canonicalize_expression", "CANONICALIZE-EXPRESSION", 1, 2, false);
        declareFunction(me, "clausify_eliminating_ists", "CLAUSIFY-ELIMINATING-ISTS", 4, 0, false);
        declareFunction(me, "remove_newly_introduced_variables_from_bindings", "REMOVE-NEWLY-INTRODUCED-VARIABLES-FROM-BINDINGS", 2, 0, false);
        declareFunction(me, "clear_canon_caches", "CLEAR-CANON-CACHES", 0, 0, false);
        declareFunction(me, "canon_wffP", "CANON-WFF?", 1, 1, false);
        declareFunction(me, "check_wff_arityP", "CHECK-WFF-ARITY?", 0, 0, false);
        declareFunction(me, "check_wff_semanticsP", "CHECK-WFF-SEMANTICS?", 0, 1, false);
        declareFunction(me, "canonicalize_clauses_terms", "CANONICALIZE-CLAUSES-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_clauses_quoted_terms", "CANONICALIZE-CLAUSES-QUOTED-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_clause_quoted_terms", "CANONICALIZE-CLAUSE-QUOTED-TERMS", 1, 0, false);
        new czer_main.$canonicalize_clause_quoted_terms$UnaryFunction();
        declareFunction(me, "canonicalize_literals_quoted_terms", "CANONICALIZE-LITERALS-QUOTED-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_literal_quoted_terms_recursive", "CANONICALIZE-LITERAL-QUOTED-TERMS-RECURSIVE", 1, 0, false);
        declareFunction(me, "canonicalize_quoted_term", "CANONICALIZE-QUOTED-TERM", 1, 1, false);
        declareFunction(me, "unquote_quoted_term", "UNQUOTE-QUOTED-TERM", 1, 1, false);
        declareFunction(me, "canonicalize_clauses_sentence_terms", "CANONICALIZE-CLAUSES-SENTENCE-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_no_sentence_argsP", "CANONICALIZE-NO-SENTENCE-ARGS?", 0, 0, false);
        declareFunction(me, "canonicalize_clause_sentence_terms", "CANONICALIZE-CLAUSE-SENTENCE-TERMS", 1, 0, false);
        new czer_main.$canonicalize_clause_sentence_terms$UnaryFunction();
        declareFunction(me, "unnegate_and_flip_negated_lits", "UNNEGATE-AND-FLIP-NEGATED-LITS", 2, 0, false);
        declareFunction(me, "canonicalize_literal_sentence_terms", "CANONICALIZE-LITERAL-SENTENCE-TERMS", 1, 1, false);
        new czer_main.$canonicalize_literal_sentence_terms$UnaryFunction();
        new czer_main.$canonicalize_literal_sentence_terms$BinaryFunction();
        declareFunction(me, "canonicalize_function_sentence_terms", "CANONICALIZE-FUNCTION-SENTENCE-TERMS", 1, 1, false);
        declareFunction(me, "canonicalize_relation_sentence_terms", "CANONICALIZE-RELATION-SENTENCE-TERMS", 1, 1, false);
        declareFunction(me, "canonicalize_clauses_commutative_terms_destructive", "CANONICALIZE-CLAUSES-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        declareFunction(me, "canonicalize_clause_commutative_terms", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_clause_commutative_terms_destructive", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        new czer_main.$canonicalize_clause_commutative_terms_destructive$UnaryFunction();
        declareFunction(me, "never_commutative_gaf_clauseP", "NEVER-COMMUTATIVE-GAF-CLAUSE?", 1, 0, false);
        declareFunction(me, "canonicalize_literals_commutative_terms", "CANONICALIZE-LITERALS-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_literal_commutative_terms", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_literal_commutative_terms_destructive", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        new czer_main.$canonicalize_literal_commutative_terms_destructive$UnaryFunction();
        declareFunction(me, "canonicalize_literal_commutative_args", "CANONICALIZE-LITERAL-COMMUTATIVE-ARGS", 1, 0, false);
        declareFunction(me, "order_commutative_terms", "ORDER-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_terms_commutative_terms_without_reordering", "CANONICALIZE-TERMS-COMMUTATIVE-TERMS-WITHOUT-REORDERING", 2, 0, false);
        declareFunction(me, "canonicalize_term_commutative_terms", "CANONICALIZE-TERM-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "unary_function_commutes_with_its_argumentP", "UNARY-FUNCTION-COMMUTES-WITH-ITS-ARGUMENT?", 1, 0, false);
        declareFunction(me, "canonicalize_commuting_function", "CANONICALIZE-COMMUTING-FUNCTION", 1, 0, false);
        declareFunction(me, "canonicalize_nat_commutative_terms", "CANONICALIZE-NAT-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_relation_commutative_terms", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "canonicalize_relation_commutative_terms_destructive", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
        declareFunction(me, "sort_relation_commutative_terms", "SORT-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
        declareFunction(me, "sort_partially_commutative_terms", "SORT-PARTIALLY-COMMUTATIVE-TERMS", 3, 0, false);
        declareFunction(me, "commutative_argnums", "COMMUTATIVE-ARGNUMS", 1, 0, false);
        declareFunction(me, "ok_wrt_partial_commutativityP", "OK-WRT-PARTIAL-COMMUTATIVITY?", 3, 0, false);
        declareFunction(me, "partially_commutative_argnums", "PARTIALLY-COMMUTATIVE-ARGNUMS", 2, 0, false);
        declareFunction(me, "partially_commutative_argnums_int", "PARTIALLY-COMMUTATIVE-ARGNUMS-INT", 2, 1, false);
        declareFunction(me, "cia_formulas", "CIA-FORMULAS", 1, 1, false);
        declareFunction(me, "commutative_terms_in_orderP", "COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
        new czer_main.$commutative_terms_in_orderP$BinaryFunction();
        declareFunction(me, "commutative_formulas_in_orderP", "COMMUTATIVE-FORMULAS-IN-ORDER?", 2, 0, false);
        declareFunction(me, "canonicalizer_constant_L", "CANONICALIZER-CONSTANT-<", 2, 0, false);
        declareFunction(me, "commutative_atoms_in_orderP", "COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
        declareFunction(me, "canon_term_L", "CANON-TERM-<", 2, 0, false);
        declareFunction(me, "canonicalize_functions_in_clause", "CANONICALIZE-FUNCTIONS-IN-CLAUSE", 1, 0, false);
        declareFunction(me, "canonicalize_functions", "CANONICALIZE-FUNCTIONS", 1, 0, false);
        declareFunction(me, "add_term_of_unit_lits", "ADD-TERM-OF-UNIT-LITS", 1, 0, false);
        declareFunction(me, "clauses_free_variables", "CLAUSES-FREE-VARIABLES", 1, 0, false);
        declareFunction(me, "add_term_of_unit_lits_1", "ADD-TERM-OF-UNIT-LITS-1", 1, 0, false);
        declareFunction(me, "equal_wrt_svm", "EQUAL-WRT-SVM", 2, 0, false);
        declareFunction(me, "reifiable_function_term_in_clauseP", "REIFIABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
        declareFunction(me, "evaluatable_function_term_in_clauseP", "EVALUATABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
        declareFunction(me, "czer_create_nartP", "CZER-CREATE-NART?", 1, 0, false);
        declareFunction(me, "czer_create_nartsP", "CZER-CREATE-NARTS?", 0, 0, false);
        declareFunction(me, "reify_relation_functions_in_mt_list", "REIFY-RELATION-FUNCTIONS-IN-MT-LIST", 2, 1, false);
        declareFunction(me, "reify_relation_functions", "REIFY-RELATION-FUNCTIONS", 1, 1, false);
        declareFunction(me, "reify_relation_functions_in", "REIFY-RELATION-FUNCTIONS-IN", 3, 0, false);
        declareFunction(me, "reify_relation_function_in", "REIFY-RELATION-FUNCTION-IN", 3, 0, false);
        declareFunction(me, "reify_functions_in_mt", "REIFY-FUNCTIONS-IN-MT", 2, 0, false);
        declareFunction(me, "reify_functions", "REIFY-FUNCTIONS", 2, 0, false);
        declareFunction(me, "reify_functions_in", "REIFY-FUNCTIONS-IN", 2, 0, false);
        declareFunction(me, "reify_function_in_fns", "REIFY-FUNCTION-IN-FNS", 2, 0, false);
        declareFunction(me, "reify_function_in", "REIFY-FUNCTION-IN", 2, 0, false);
        declareFunction(me, "reify_function_in_destructive", "REIFY-FUNCTION-IN-DESTRUCTIVE", 2, 0, false);
        declareFunction(me, "canonicalize_fn_term_if_reified", "CANONICALIZE-FN-TERM-IF-REIFIED", 1, 0, false);
        declareFunction(me, "canonicalize_fn_term_if_reified_destructive", "CANONICALIZE-FN-TERM-IF-REIFIED-DESTRUCTIVE", 1, 0, false);
        declareFunction(me, "canonicalize_fn_term", "CANONICALIZE-FN-TERM", 1, 0, false);
        declareFunction(me, "cyc_find_or_create_nart", "CYC-FIND-OR-CREATE-NART", 1, 1, false);
        declareFunction(me, "low_find_or_create_nart", "LOW-FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction(me, "canonicalize_fn_term_int", "CANONICALIZE-FN-TERM-INT", 3, 1, false);
        declareFunction(me, "canonicalize_naut", "CANONICALIZE-NAUT", 1, 0, false);
        declareFunction(me, "cyc_find_or_create_canonical_nart", "CYC-FIND-OR-CREATE-CANONICAL-NART", 1, 0, false);
        declareFunction(me, "clear_nart_defining_rules_cached", "CLEAR-NART-DEFINING-RULES-CACHED", 0, 0, false);
        declareFunction(me, "remove_nart_defining_rules_cached", "REMOVE-NART-DEFINING-RULES-CACHED", 0, 1, false);
        declareFunction(me, "nart_defining_rules_cached_internal", "NART-DEFINING-RULES-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "nart_defining_rules_cached", "NART-DEFINING-RULES-CACHED", 0, 1, false);
        declareFunction(me, "cyc_create_nart", "CYC-CREATE-NART", 1, 0, false);
        declareFunction(me, "new_canonicalize_fn_term", "NEW-CANONICALIZE-FN-TERM", 1, 0, false);
        declareFunction(me, "new_nested_fn_terms", "NEW-NESTED-FN-TERMS", 1, 0, false);
        declareFunction(me, "nested_fn_terms", "NESTED-FN-TERMS", 1, 0, false);
        declareFunction(me, "all_nested_fn_terms", "ALL-NESTED-FN-TERMS", 1, 0, false);
        declareFunction(me, "fort_sort_by_type_and_id", "FORT-SORT-BY-TYPE-AND-ID", 1, 0, false);
        declareFunction(me, "fort_type_and_id_L", "FORT-TYPE-AND-ID-<", 2, 0, false);
        declareFunction(me, "clause_quantified_fn_terms", "CLAUSE-QUANTIFIED-FN-TERMS", 1, 0, false);
        declareFunction(me, "literals_quantified_fn_terms", "LITERALS-QUANTIFIED-FN-TERMS", 1, 0, false);
        declareFunction(me, "literal_quantified_fn_terms", "LITERAL-QUANTIFIED-FN-TERMS", 1, 0, false);
        new czer_main.$literal_quantified_fn_terms$UnaryFunction();
        declareFunction(me, "clause_terms_to_reify", "CLAUSE-TERMS-TO-REIFY", 1, 0, false);
        declareFunction(me, "literal_terms_to_reify", "LITERAL-TERMS-TO-REIFY", 1, 1, false);
        new czer_main.$literal_terms_to_reify$UnaryFunction();
        new czer_main.$literal_terms_to_reify$BinaryFunction();
        declareFunction(me, "function_terms_to_reify", "FUNCTION-TERMS-TO-REIFY", 1, 1, false);
        declareFunction(me, "relation_terms_to_reify", "RELATION-TERMS-TO-REIFY", 1, 1, false);
        declareFunction(me, "guaranteed_nothing_to_reifyP", "GUARANTEED-NOTHING-TO-REIFY?", 1, 0, false);
        declareFunction(me, "reify_argP", "REIFY-ARG?", 3, 1, false);
        declareFunction(me, "dont_reify_arg_or_subtermsP", "DONT-REIFY-ARG-OR-SUBTERMS?", 4, 0, false);
        declareFunction(me, "reify_termP", "REIFY-TERM?", 1, 1, false);
        declareFunction(me, "forward_inference_reifiable_function_termP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        declareFunction(me, "forward_inference_reifiable_functionP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION?", 1, 1, false);
        declareFunction(me, "subst_canon_fn_in_clauses", "SUBST-CANON-FN-IN-CLAUSES", 3, 0, false);
        declareFunction(me, "subst_canon_fn_in_clause", "SUBST-CANON-FN-IN-CLAUSE", 3, 0, false);
        declareFunction(me, "subst_canon_fn_in_relation", "SUBST-CANON-FN-IN-RELATION", 3, 1, false);
        declareFunction(me, "subst_canon_fn_in_literal", "SUBST-CANON-FN-IN-LITERAL", 3, 0, false);
        declareFunction(me, "subst_canon_fn_in_nat", "SUBST-CANON-FN-IN-NAT", 3, 0, false);
        declareFunction(me, "canonicalize_clauses_transformable_nats", "CANONICALIZE-CLAUSES-TRANSFORMABLE-NATS", 1, 0, false);
        declareFunction(me, "canonicalize_clause_transformable_nats", "CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS", 1, 0, false);
        declareFunction(me, "nat_atoms", "NAT-ATOMS", 1, 0, false);
        declareFunction(me, "canonicalize_literals_transformable_nats", "CANONICALIZE-LITERALS-TRANSFORMABLE-NATS", 2, 0, false);
        declareFunction(me, "nat_transforming_litP", "NAT-TRANSFORMING-LIT?", 1, 0, false);
        declareFunction(me, "possibly_nat_transforming_litP", "POSSIBLY-NAT-TRANSFORMING-LIT?", 1, 0, false);
        declareFunction(me, "destructive_nat_transforming_litP", "DESTRUCTIVE-NAT-TRANSFORMING-LIT?", 2, 0, false);
        declareFunction(me, "dwim_svm_wrt_scoping", "DWIM-SVM-WRT-SCOPING", 3, 0, false);
        declareFunction(me, "var_is_scoped_in_literalP", "VAR-IS-SCOPED-IN-LITERAL?", 2, 0, false);
        declareFunction(me, "var_is_scoped_in_formulaP", "VAR-IS-SCOPED-IN-FORMULA?", 1, 0, false);
        declareFunction(me, "canonicalize_clauses_literals", "CANONICALIZE-CLAUSES-LITERALS", 1, 0, false);
        declareFunction(me, "sort_clauses", "SORT-CLAUSES", 1, 0, false);
        declareFunction(me, "clauses_in_orderP", "CLAUSES-IN-ORDER?", 2, 0, false);
        declareFunction(me, "sort_clauses_literals", "SORT-CLAUSES-LITERALS", 1, 0, false);
        declareFunction(me, "sort_clause_literals", "SORT-CLAUSE-LITERALS", 1, 1, false);
        new czer_main.$sort_clause_literals$UnaryFunction();
        new czer_main.$sort_clause_literals$BinaryFunction();
        declareFunction(me, "canonicalize_skolem_clause", "CANONICALIZE-SKOLEM-CLAUSE", 1, 1, false);
        declareFunction(me, "sort_clause_literals_destructive", "SORT-CLAUSE-LITERALS-DESTRUCTIVE", 1, 1, false);
        declareFunction(me, "tou_lits_at_rear", "TOU-LITS-AT-REAR", 1, 0, false);
        declareFunction(me, "evaluate_lits_at_rear", "EVALUATE-LITS-AT-REAR", 1, 0, false);
        declareFunction(me, "sort_literals", "SORT-LITERALS", 1, 4, false);
        declareFunction(me, "pick_a_lit", "PICK-A-LIT", 1, 4, false);
        declareFunction(me, "new_bound_vars", "NEW-BOUND-VARS", 1, 1, false);
        declareFunction(me, "new_connected_vars", "NEW-CONNECTED-VARS", 1, 1, false);
        declareFunction(me, "unbound_vars", "UNBOUND-VARS", 2, 0, false);
        declareFunction(me, "most_constrained_literals", "MOST-CONSTRAINED-LITERALS", 1, 2, false);
        declareFunction(me, "unbound_vars_score", "UNBOUND-VARS-SCORE", 2, 0, false);
        declareFunction(me, "temp_unbound_vars_score", "TEMP-UNBOUND-VARS-SCORE", 2, 0, false);
        declareFunction(me, "fewest_arg_literals", "FEWEST-ARG-LITERALS", 1, 0, false);
        declareFunction(me, "left_weighted_literals", "LEFT-WEIGHTED-LITERALS", 1, 0, false);
        declareFunction(me, "left_weighted_score", "LEFT-WEIGHTED-SCORE", 1, 1, false);
        declareFunction(me, "n_left_weighted_score_weights", "N-LEFT-WEIGHTED-SCORE-WEIGHTS", 1, 1, false);
        declareFunction(me, "left_connected_literals", "LEFT-CONNECTED-LITERALS", 1, 1, false);
        declareFunction(me, "left_connected_score", "LEFT-CONNECTED-SCORE", 2, 0, false);
        declareFunction(me, "left_rooted_literals", "LEFT-ROOTED-LITERALS", 1, 1, false);
        declareFunction(me, "default_lit_sort", "DEFAULT-LIT-SORT", 1, 0, false);
        declareFunction(me, "lit_L", "LIT-<", 2, 0, false);
        new czer_main.$lit_L$BinaryFunction();
        declareFunction(me, "pred_L", "PRED-<", 2, 0, false);
        declareFunction(me, "left_rooted_literals_int", "LEFT-ROOTED-LITERALS-INT", 1, 1, false);
        declareFunction(me, "left_rooted_score", "LEFT-ROOTED-SCORE", 2, 1, false);
        declareFunction(me, "max_scored_item", "MAX-SCORED-ITEM", 1, 2, false);
        declareFunction(me, "least_complex_literals", "LEAST-COMPLEX-LITERALS", 1, 1, false);
        declareFunction(me, "el_complexity_score", "EL-COMPLEXITY-SCORE", 1, 2, false);
        declareFunction(me, "default_preference_lit", "DEFAULT-PREFERENCE-LIT", 1, 0, false);
        declareFunction(me, "canonicalize_disjunctions_as_enumerations", "CANONICALIZE-DISJUNCTIONS-AS-ENUMERATIONS", 1, 0, false);
        declareFunction(me, "canonicalize_clauses_variables", "CANONICALIZE-CLAUSES-VARIABLES", 1, 0, false);
        declareFunction(me, "rename_clauses_vars", "RENAME-CLAUSES-VARS", 1, 0, false);
        declareFunction(me, "standardize_variable_memory_binding", "STANDARDIZE-VARIABLE-MEMORY-BINDING", 2, 0, false);
        declareFunction(me, "el_nununiquifying_blist_wrt", "EL-NUNUNIQUIFYING-BLIST-WRT", 1, 2, false);
        declareFunction(me, "el_nununiquify_vars_wrt_int", "EL-NUNUNIQUIFY-VARS-WRT-INT", 2, 2, false);
        declareFunction(me, "el_nununiquify_vars_wrt", "EL-NUNUNIQUIFY-VARS-WRT", 2, 0, false);
        declareFunction(me, "el_nununiquify_vars_int", "EL-NUNUNIQUIFY-VARS-INT", 1, 2, false);
        declareFunction(me, "el_ununiquify_vars_int", "EL-UNUNIQUIFY-VARS-INT", 1, 2, false);
        declareFunction(me, "el_nununiquify_vars", "EL-NUNUNIQUIFY-VARS", 1, 0, false);
        declareFunction(me, "uniquify", "UNIQUIFY", 1, 0, false);
        declareFunction(me, "rename_clauses_vars_safe", "RENAME-CLAUSES-VARS-SAFE", 1, 0, false);
        declareFunction(me, "rename_clause_vars", "RENAME-CLAUSE-VARS", 1, 1, false);
        declareFunction(me, "rename_single_clause_vars_int", "RENAME-SINGLE-CLAUSE-VARS-INT", 1, 1, false);
        declareFunction(me, "rename_clause_vars_int", "RENAME-CLAUSE-VARS-INT", 2, 1, false);
        new czer_main.$rename_clause_vars_int$BinaryFunction();
        declareFunction(me, "lookup_closed_vars_from_standardize_variables_memory", "LOOKUP-CLOSED-VARS-FROM-STANDARDIZE-VARIABLES-MEMORY", 0, 0, false);
        declareFunction(me, "blist_vars_among", "BLIST-VARS-AMONG", 2, 0, false);
        declareFunction(me, "blist_vars_not_among", "BLIST-VARS-NOT-AMONG", 2, 0, false);
        declareFunction(me, "all_bindings", "ALL-BINDINGS", 2, 0, false);
        declareFunction(me, "clause_el_variables", "CLAUSE-EL-VARIABLES", 1, 1, false);
        declareFunction(me, "initialize_symbol_suffix_table", "INITIALIZE-SYMBOL-SUFFIX-TABLE", 1, 0, false);
        declareFunction(me, "initialize_suffix_table_for_var", "INITIALIZE-SUFFIX-TABLE-FOR-VAR", 1, 0, false);
        new czer_main.$initialize_suffix_table_for_var$UnaryFunction();
        declareFunction(me, "extract_name_uniquifying_post_hyphen_integer", "EXTRACT-NAME-UNIQUIFYING-POST-HYPHEN-INTEGER", 1, 0, false);
        declareFunction(me, "canonicalize_clauses", "CANONICALIZE-CLAUSES", 2, 0, false);
        declareFunction(me, "canonicalize_query_clauses", "CANONICALIZE-QUERY-CLAUSES", 2, 0, false);
        declareFunction(me, "canonicalize_clauses_int", "CANONICALIZE-CLAUSES-INT", 4, 0, false);
        declareFunction(me, "canon_fast_clausesP", "CANON-FAST-CLAUSES?", 1, 0, false);
        declareFunction(me, "unwrap_clauses_if_ist_permissive", "UNWRAP-CLAUSES-IF-IST-PERMISSIVE", 2, 0, false);
        declareFunction(me, "lift_clauses_if_decontextualized", "LIFT-CLAUSES-IF-DECONTEXTUALIZED", 2, 0, false);
        declareFunction(me, "clauses_syntactic_wff_check", "CLAUSES-SYNTACTIC-WFF-CHECK", 2, 0, false);
        declareFunction(me, "psc_queryP", "PSC-QUERY?", 0, 1, false);
        declareFunction(me, "canonicalizer_problemP", "CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction(me, "tl_canonicalizer_problemP", "TL-CANONICALIZER-PROBLEM?", 1, 0, false);
        declareFunction(me, "terms_reorder_equalP", "TERMS-REORDER-EQUAL?", 2, 0, false);
        declareFunction(me, "cnfs_reorder_tou_equalP", "CNFS-REORDER-TOU-EQUAL?", 2, 1, false);
        declareFunction(me, "unique_arity_literal", "UNIQUE-ARITY-LITERAL", 1, 0, false);
        declareFunction(me, "unique_list_structure_literal", "UNIQUE-LIST-STRUCTURE-LITERAL", 1, 0, false);
        declareFunction(me, "old_last_resort_literal", "OLD-LAST-RESORT-LITERAL", 1, 2, false);
        declareFunction(me, "alphabetically_minimal_literal", "ALPHABETICALLY-MINIMAL-LITERAL", 1, 2, false);
        declareFunction(me, "new_alphabetically_minimal_literal_int", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT", 1, 2, false);
        declareFunction(me, "new_alphabetically_minimal_literal_int_2", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT-2", 1, 1, false);
        declareFunction(me, "old_commutative_terms_in_orderP", "OLD-COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
        declareFunction(me, "old_commutative_atoms_in_orderP", "OLD-COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
        declareFunction(me, "old_commutative_conses_in_orderP", "OLD-COMMUTATIVE-CONSES-IN-ORDER?", 2, 0, false);
        declareFunction(me, "last_resort_min_literals", "LAST-RESORT-MIN-LITERALS", 1, 0, false);
        declareFunction(me, "last_resort_min_literals_int", "LAST-RESORT-MIN-LITERALS-INT", 1, 0, false);
        declareFunction(me, "last_resort_min_literals_min", "LAST-RESORT-MIN-LITERALS-MIN", 1, 0, false);
        declareFunction(me, "constant_median", "CONSTANT-MEDIAN", 1, 0, false);
        declareFunction(me, "ugly_thing_L", "UGLY-THING-<", 2, 0, false);
        declareFunction(me, "ugly_thing_G", "UGLY-THING->", 2, 0, false);
        declareFunction(me, "last_resort_min_literals_max", "LAST-RESORT-MIN-LITERALS-MAX", 1, 0, false);
        declareFunction(me, "last_resort_min_literals_fn", "LAST-RESORT-MIN-LITERALS-FN", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_czer_main_file() {
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
}

/**
 * Total time: 1590 ms
 */
