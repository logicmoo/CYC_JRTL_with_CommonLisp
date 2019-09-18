package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_junction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_to_subl_list_recursively;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.expression_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.formula_with_sequence_termP;
import static com.cyc.cycjava.cycl.el_utilities.gafP;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_universal;
import static com.cyc.cycjava.cycl.el_utilities.map_formula_args;
import static com.cyc.cycjava.cycl.el_utilities.map_formula_terms;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tilde;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_methods_formulas extends SubLTranslatedFile {
    public static final SubLFile me = new pph_methods_formulas();

    public static final String myName = "com.cyc.cycjava.cycl.pph_methods_formulas";

    public static final String myFingerPrint = "7282af077def2b1d138af51f7ced36aeae6db7912fefdbd3045928d42049a13d";

    // deflexical
    /**
     * Parameter which gates whether the SubLLists are handled in the PPH assertions
     */
    public static final SubLSymbol $pph_allow_subl_listsP$ = makeSymbol("*PPH-ALLOW-SUBL-LISTS?*");

    // defconstant
    private static final SubLSymbol $pph_connectives$ = makeSymbol("*PPH-CONNECTIVES*");

    // deflexical
    private static final SubLSymbol $pph_english_month_names$ = makeSymbol("*PPH-ENGLISH-MONTH-NAMES*");

    // deflexical
    private static final SubLSymbol $pph_dates$ = makeSymbol("*PPH-DATES*");

    // deflexical
    /**
     * A plist mapping date-types (:year/:month/:day) to disambiguation strings for
     * English paraphrases of such dates
     */
    private static final SubLSymbol $pph_english_date_disambiguation_strings$ = makeSymbol("*PPH-ENGLISH-DATE-DISAMBIGUATION-STRINGS*");

    // defparameter
    private static final SubLSymbol $pph_new_exception_vars$ = makeSymbol("*PPH-NEW-EXCEPTION-VARS*");

    // defparameter
    /**
     * This is intended to be a temporary variable to allow easy disabling of the
     * function below until it is deemed ready for prime time, at which point this
     * variable can be removed. Discussion in bug #20943.
     */
    private static final SubLSymbol $pph_generate_collection_subset_with_rel_clauseP$ = makeSymbol("*PPH-GENERATE-COLLECTION-SUBSET-WITH-REL-CLAUSE?*");

    // defparameter
    /**
     * BOOLEANP; Should we front prepositions in relative clauses, or leave them
     * dangling at the end?
     */
    private static final SubLSymbol $pph_front_prepositionsP$ = makeSymbol("*PPH-FRONT-PREPOSITIONS?*");

    // defparameter
    /**
     * BOOLEAN; Should we try to create small-clause subject relatives like
     * 'problems unlikely to arise in real-world situations'? Turned off for now
     * because we were getting things like 'things mainly red'.
     */
    private static final SubLSymbol $pph_allow_copula_removalP$ = makeSymbol("*PPH-ALLOW-COPULA-REMOVAL?*");



    // deflexical
    private static final SubLSymbol $pph_existential_operators$ = makeSymbol("*PPH-EXISTENTIAL-OPERATORS*");

    // Internal Constants
    public static final SubLString $str0$_ = makeString(",");

    public static final SubLString $$$and = makeString("and");

    public static final SubLString $$$or = makeString("or");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLSymbol GENERATE_STRING_WITH_COMMA = makeSymbol("GENERATE-STRING-WITH-COMMA");







    private static final SubLString $str8$__Trying_default_precision___S___ = makeString("~&Trying default precision: ~S.~%");



    private static final SubLString $str10$__Working_on_dupe_list___S__ = makeString("~&Working on dupe list: ~S~%");

    private static final SubLString $str11$__Trying_to_reparaphrase__S___ = makeString("~&Trying to reparaphrase ~S.~%");

    private static final SubLString $str12$__Trying_targeted_precision__S_fo = makeString("~&Trying targeted precision ~S for ~S");



    private static final SubLString $str14$__New_paraphrase_with_precision__ = makeString("~&New paraphrase with precision ~S for ~S:~% ~S");

    private static final SubLString $str15$__Trying_full_precision_for__S = makeString("~&Trying full precision for ~S");

    private static final SubLString $str16$__New_paraphrase_with_full_precis = makeString("~&New paraphrase with full precision for ~S:~% ~S");

    private static final SubLString $str17$__Changing_output_list_for__S_fro = makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");





    private static final SubLString $str20$__Suspending_bullet_use_for____S_ = makeString("~&Suspending bullet use for~% ~S~%");

    private static final SubLString $str21$__Turning_bullet_use_back_on___ = makeString("~&Turning bullet use back on.~%");

    private static final SubLString $str22$__Not_using_bullets____PPH_USE_BU = makeString("~&Not using bullets - *PPH-USE-BULLETED-LISTS?* is NIL.~%");

    private static final SubLString $str23$__Not_using_bullets___list_is_too = makeString("~&Not using bullets - list is too short~%");

    private static final SubLSymbol GREATER_LENGTH_P = makeSymbol("GREATER-LENGTH-P");

    private static final SubLObject $$verbStrings = reader_make_constant_shell(makeString("verbStrings"));

    private static final SubLString $str26$__Found_verb__S__Using_bullets_fo = makeString("~&Found verb ~S. Using bullets for ~%");

    private static final SubLString $str27$____S__ = makeString("~& ~S~%");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_STRING = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING");

    private static final SubLString $str29$__Not_using_bullets___Failed_to_f = makeString("~&Not using bullets - Failed to find a verb.~%");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLList $list31 = list(list(makeSymbol("ANS"), makeSymbol("AS-LIST-ITEM?")), makeSymbol("&BODY"), makeSymbol("BODY"));







    private static final SubLList $list35 = list(makeSymbol("PPH-START-LIST-ITEM-ITEM"));

    private static final SubLList $list36 = list(makeSymbol("PPH-END-LIST-ITEM-ITEM"));

    public static final SubLList $list37 = list(makeSymbol("FIRST-LIST"), makeSymbol("SECOND-LIST"));





    private static final SubLString $str40$_ = makeString(">");







    private static final SubLString $str44$_ = makeString(".");





    private static final SubLString $str47$and_or = makeString("and/or");



    private static final SubLString $$$but = makeString("but");

    private static final SubLObject $$OrdinalAdjective = reader_make_constant_shell(makeString("OrdinalAdjective"));

    private static final SubLList $list51 = list(reader_make_constant_shell(makeString("determinerStrings")));

    private static final SubLString $str52$Can_t_generate_ordinal_form_of__S = makeString("Can't generate ordinal form of ~S in ~S.");

    private static final SubLSymbol ORDINAL_FORM = makeSymbol("ORDINAL-FORM");







    private static final SubLList $list57 = list(makeSymbol("PPH-TEST-CASE-TABLES"));







    private static final SubLList $list61 = list(list(list(FOUR_INTEGER), makeString("fourth")), list(list(makeInteger(444)), makeString("444th")));

    private static final SubLSymbol $sym62$_WU = makeSymbol("?WU");

    private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));

    private static final SubLSymbol $sym64$_SENSE = makeSymbol("?SENSE");



    private static final SubLString $$$st = makeString("st");

    private static final SubLString $$$nd = makeString("nd");

    private static final SubLString $$$rd = makeString("rd");

    private static final SubLString $$$th = makeString("th");

    private static final SubLSymbol GENERATE_NTH_EXPR = makeSymbol("GENERATE-NTH-EXPR");





    private static final SubLObject $$nthLargestElement = reader_make_constant_shell(makeString("nthLargestElement"));

    private static final SubLString $$$largest = makeString("largest");

    private static final SubLString $$$smallest = makeString("smallest");

    private static final SubLString $$$all = makeString("all");

    private static final SubLList $list77 = list(reader_make_constant_shell(makeString("plural-Generic")));

    private static final SubLList $list78 = list(reader_make_constant_shell(makeString("nonPlural-Generic")));

    private static final SubLString $$$has_the = makeString("has the");

    private static final SubLString $$$of = makeString("of");

    private static final SubLSymbol GENERATE_ATOMIC_FORMULA = makeSymbol("GENERATE-ATOMIC-FORMULA");







    private static final SubLString $str85$GENERATE_ATOMIC_FORMULA_called_on = makeString("GENERATE-ATOMIC-FORMULA called on PPH phrase with dtrs:~% ~S~%");

    private static final SubLString $str86$__Entering_PPH_POSSIBLY_BINDING_V = makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");

    private static final SubLSymbol $GENERATE_ATOMIC_FORMULA_WITH_AGR = makeKeyword("GENERATE-ATOMIC-FORMULA-WITH-AGR");

    private static final SubLString $str88$__Leaving_PPH_POSSIBLY_BINDING_VA = makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");

    private static final SubLString $str89$______and__pph_var_types__are_now = makeString("~&... and *pph-var-types* are now ~S~%");

    private static final SubLString $str90$__Using_template_assertion___S___ = makeString("~&Using template assertion: ~S.~%");

    private static final SubLSymbol GENERATE_ALL_PHRASES_FOR_FORMULA = makeSymbol("GENERATE-ALL-PHRASES-FOR-FORMULA");

    public static final SubLList $list92 = list(makeSymbol("ALL-PHRASES-FOR-FORMULA"));









    private static final SubLString $str97$Can_t_use__S_with__S = makeString("Can't use ~S with ~S");

    private static final SubLList $list98 = cons(makeSymbol("RELN"), makeSymbol("ARGS"));

    private static final SubLSymbol PPH_PHRASE_GENERATE_STRING_FROM_CYCL = makeSymbol("PPH-PHRASE-GENERATE-STRING-FROM-CYCL");

    private static final SubLList $list100 = list(ZERO_INTEGER);

    private static final SubLList $list101 = list(makeString("~"));

    private static final SubLString $str102$_ = makeString("~");



    private static final SubLObject $$genFormat = reader_make_constant_shell(makeString("genFormat"));

    private static final SubLObject $$genFormat_Precise = reader_make_constant_shell(makeString("genFormat-Precise"));

    private static final SubLObject $$genFormat_NP = reader_make_constant_shell(makeString("genFormat-NP"));

    private static final SubLObject $$genQuestion = reader_make_constant_shell(makeString("genQuestion"));

    private static final SubLObject $$genFormat_ArgFixed = reader_make_constant_shell(makeString("genFormat-ArgFixed"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));









    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    private static final SubLString $str117$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str122$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str123$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str124$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str125$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str126$___S_not_referenced_in__S____Curr = makeString("~&~S not referenced in ~S.~% Current precision: ~S~%");

    private static final SubLSymbol $sym127$PPH_UNREGISTERED_VARIABLE_ = makeSymbol("PPH-UNREGISTERED-VARIABLE?");

    private static final SubLSymbol RELEVANT_PRED_IS_EVERYTHING = makeSymbol("RELEVANT-PRED-IS-EVERYTHING");



    private static final SubLSymbol $sym130$PPH_FORBIDDEN_LEXICAL_ASSERTION_ = makeSymbol("PPH-FORBIDDEN-LEXICAL-ASSERTION?");

    private static final SubLSymbol $sym131$GENFORMAT_PRECISION_OK_ = makeSymbol("GENFORMAT-PRECISION-OK?");

    private static final SubLString $str132$__Looking_for_paraphrase_template = makeString("~&Looking for paraphrase templates for ~S from ~S.~%");

    private static final SubLString $str133$__No__S_assertions_found_for__S_f = makeString("~&No ~S assertions found for ~S from ~S.~%");

    private static final SubLString $str134$__Couldn_t_find_paraphrase_templa = makeString("~&Couldn't find paraphrase template for ~S. Using one for ~S instead.~%");

    private static final SubLString $str135$__Paraphrasing__S_with_sublist__S = makeString("~&Paraphrasing ~S with sublist ~S and precision ~S.~%");





    private static final SubLSymbol PPH_CONNECTIVE_P = makeSymbol("PPH-CONNECTIVE-P");

    private static final SubLString $str139$__GENERATE_GENFORMAT_ARG_Result__ = makeString("~&GENERATE-GENFORMAT-ARG Result: ~S.~%");

    private static final SubLList $list140 = list(makeKeyword("AND"), makeKeyword("OR"), makeKeyword("AND-OR"), makeKeyword("SPACE"), makeKeyword("PERIOD"));

    private static final SubLObject $$CycUniversalDate = reader_make_constant_shell(makeString("CycUniversalDate"));

    private static final SubLObject $$CycUniversalSecond = reader_make_constant_shell(makeString("CycUniversalSecond"));

    private static final SubLString $str143$__a_ = makeString("`~a'");

    private static final SubLString $str144$__Using_preferred_senses__S__ = makeString("~&Using preferred senses ~S~%");

    public static final SubLList $list145 = list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER);

    private static final SubLObject $$DurationFn = reader_make_constant_shell(makeString("DurationFn"));

    public static final SubLString $$$in = makeString("in");

    public static final SubLString $$$at = makeString("at");

    public static final SubLString $$$on = makeString("on");

    public static final SubLSymbol $sym150$PPH_DETERMINER_ = makeSymbol("PPH-DETERMINER?");

    public static final SubLSymbol $sym151$PPH_CASE_KW_ = makeSymbol("PPH-CASE-KW?");

    public static final SubLSymbol WORD_SENSE_INDICATOR = makeSymbol("WORD-SENSE-INDICATOR");

    public static final SubLList $list153 = list(reader_make_constant_shell(makeString("plural")), reader_make_constant_shell(makeString("pnPlural")), reader_make_constant_shell(makeString("agentive-Pl")));



    public static final SubLString $str155$__Couldn_t_paraphrase_args__S_wit = makeString("~&Couldn't paraphrase args ~S with arg-order-list ~S~%");



    private static final SubLSymbol PPH_STRING_P = makeSymbol("PPH-STRING-P");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_STRING = makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");

    private static final SubLString $str159$__Couldn_t_paraphrase__S___ = makeString("~&Couldn't paraphrase ~S.~%");

    private static final SubLString $str160$__PROCESS_GEN_FORMAT_ARGLIST____W = makeString("~&PROCESS-GEN-FORMAT-ARGLIST:~% Working on ~S.~%Done: ~S.~%");

    private static final SubLString $str161$Making_copy_of_reused_output_item = makeString("Making copy of reused output items:~% ~S");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_COPY = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-COPY");

    private static final SubLString $str163$Generating_with___genFormat_for_m = makeString("Generating with #$genFormat for motherless phrase:~% ~S~%");

    private static final SubLObject $$TheInstance = reader_make_constant_shell(makeString("TheInstance"));

    private static final SubLObject $$SubcollectionOfWithRelationFromFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn"));

    private static final SubLObject $$possessiveRelation = reader_make_constant_shell(makeString("possessiveRelation"));

    private static final SubLSymbol $NON_PLURAL_GENERIC = makeKeyword("NON-PLURAL-GENERIC");

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    public static final SubLList $list169 = list(makeKeyword("NON-PLURAL-GENERIC"), makeKeyword("A"));

    private static final SubLList $list170 = list(makeKeyword("SINGULAR-GENERIC"), reader_make_constant_shell(makeString("Another-TheWord")));

    private static final SubLObject $$ThirdPerson_NLAttr = reader_make_constant_shell(makeString("ThirdPerson-NLAttr"));

    private static final SubLObject $$ReflexivePronoun = reader_make_constant_shell(makeString("ReflexivePronoun"));

    private static final SubLSymbol GENERATE_DATE_NAUT = makeSymbol("GENERATE-DATE-NAUT");



    private static final SubLSymbol GENERATE_ENGLISH_YEAR_NAUT = makeSymbol("GENERATE-ENGLISH-YEAR-NAUT");





    private static final SubLSymbol GENERATE_ENGLISH_MONTH_NAUT = makeSymbol("GENERATE-ENGLISH-MONTH-NAUT");



    public static final SubLList $list180 = list(ONE_INTEGER);

    public static final SubLList $list181 = list(TWO_INTEGER);

    private static final SubLList $list182 = list(new SubLObject[]{ cons(reader_make_constant_shell(makeString("January")), makeString("January")), cons(reader_make_constant_shell(makeString("February")), makeString("February")), cons(reader_make_constant_shell(makeString("March")), makeString("March")), cons(reader_make_constant_shell(makeString("April")), makeString("April")), cons(reader_make_constant_shell(makeString("May")), makeString("May")), cons(reader_make_constant_shell(makeString("June")), makeString("June")), cons(reader_make_constant_shell(makeString("July")), makeString("July")), cons(reader_make_constant_shell(makeString("August")), makeString("August")), cons(reader_make_constant_shell(makeString("September")), makeString("September")), cons(reader_make_constant_shell(makeString("October")), makeString("October")), cons(reader_make_constant_shell(makeString("November")), makeString("November")), cons(reader_make_constant_shell(makeString("December")), makeString("December")) });



    private static final SubLSymbol GENERATE_ENGLISH_DAY_NAUT = makeSymbol("GENERATE-ENGLISH-DAY-NAUT");



    public static final SubLList $list186 = list(TWO_INTEGER, ONE_INTEGER);

    private static final SubLList $list187 = list(TWO_INTEGER, TWO_INTEGER);



    private static final SubLList $list189 = list(reader_make_constant_shell(makeString("HourFn")), reader_make_constant_shell(makeString("DecadeFn")), reader_make_constant_shell(makeString("CenturyFn")), reader_make_constant_shell(makeString("SeasonFn")), reader_make_constant_shell(makeString("QuarterFn")));

    private static final SubLString $str190$_2__0D = makeString("~2,'0D");

    private static final SubLObject $$CalendarMilliSecond = reader_make_constant_shell(makeString("CalendarMilliSecond"));

    private static final SubLObject $$MillisecondsDuration = reader_make_constant_shell(makeString("MillisecondsDuration"));



    private static final SubLObject $$CalendarSecond = reader_make_constant_shell(makeString("CalendarSecond"));

    private static final SubLString $str195$_3__0D = makeString("~3,'0D");



    private static final SubLObject $$CalendarMinute = reader_make_constant_shell(makeString("CalendarMinute"));

    private static final SubLString $str198$_ = makeString(":");

    private static final SubLSymbol $sym199$_PRECISION = makeSymbol("?PRECISION");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$resultIsa = reader_make_constant_shell(makeString("resultIsa"));

    public static final SubLList $list202 = list(makeSymbol("?PRECISION"));

    private static final SubLList $list203 = list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?PRECISION"), reader_make_constant_shell(makeString("CalendarCoveringType"))));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLList $list205 = list(makeKeyword("YEAR"), makeString("the year "));

    private static final SubLSymbol GENERATE_PHRASE_FROM_TEMPLATE = makeSymbol("GENERATE-PHRASE-FROM-TEMPLATE");

    private static final SubLSymbol GENERATE_NL_TAGGED_TERM = makeSymbol("GENERATE-NL-TAGGED-TERM");

    private static final SubLSymbol $NL_TAGGED_TERM = makeKeyword("NL-TAGGED-TERM");

    private static final SubLObject $$nounStrings = reader_make_constant_shell(makeString("nounStrings"));

    private static final SubLSymbol $PPH_METHOD_FAILURE = makeKeyword("PPH-METHOD-FAILURE");

    private static final SubLString $str211$GENERATE_PHRASE_FROM_TEMPLATE_cal = makeString("GENERATE-PHRASE-FROM-TEMPLATE called on PPH phrase with dtrs:~% ~S~%");



    private static final SubLString $str213$__GENERATE_PHRASE_FROM_TEMPLATE_t = makeString("~&GENERATE-PHRASE-FROM-TEMPLATE trying phrase: ~S~%");

    private static final SubLString $str214$__GENERATE_PHRASE_FROM_TEMPLATE__ = makeString("~&GENERATE-PHRASE-FROM-TEMPLATE: too many demerits~%");

    private static final SubLString $str215$Added__D_template_alternatives_to = makeString("Added ~D template alternatives to~% ~S");

    private static final SubLSymbol $NO_GEN_TEMPLATES = makeKeyword("NO-GEN-TEMPLATES");



    private static final SubLSymbol $EXISTING_GEN_TEMPLATES_FAILED = makeKeyword("EXISTING-GEN-TEMPLATES-FAILED");

    private static final SubLList $list219 = list(reader_make_constant_shell(makeString("gerund")));

    private static final SubLList $list220 = list(reader_make_constant_shell(makeString("presentParticiple")));

    private static final SubLObject $$gerund = reader_make_constant_shell(makeString("gerund"));

    private static final SubLSymbol COERCED_GERUND_FROM_PRESENT_PARTICIPLE = makeSymbol("COERCED-GERUND-FROM-PRESENT-PARTICIPLE");

    private static final SubLString $str223$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str224$__ = makeString(") ");

    private static final SubLString $str225$Adding_too_many_justifications__O = makeString("Adding too many justifications. Old-just: ~S.~%");

    private static final SubLString $str226$__Initial_paraphrase_agr_is__S__ = makeString("~&Initial paraphrase agr is ~S~%");

    private static final SubLString $str227$__Initial_paraphrase_category_is_ = makeString("~&Initial paraphrase category is ~S~%");

    private static final SubLString $str228$__Initial_paraphrase_case_is__S__ = makeString("~&Initial paraphrase case is ~S~%");



    private static final SubLObject $$genTemplate_QuerySentence = reader_make_constant_shell(makeString("genTemplate-QuerySentence"));

    private static final SubLString $str231$_S___does_not_appear_to_match_tem = makeString("~S~% does not appear to match template~%~S");

    private static final SubLString $str232$Couldn_t_generate_a_PPH_phrase_fr = makeString("Couldn't generate a PPH phrase from this genTemplate and formula.");

    private static final SubLList $list233 = list(makeKeyword("INTERROGATIVE"), makeKeyword("QUESTION"));

    private static final SubLString $str234$Couldn_t_generate_a_question_from = makeString("Couldn't generate a question from this genTemplate and formula.");

    private static final SubLString $str235$__DO_GENERATE_PHRASE_FROM_TEMPLAT = makeString("~&DO-GENERATE-PHRASE-FROM-TEMPLATE: Too many demerits.~%");

    private static final SubLString $str236$__GENERATE_PHRASE_FROM_TEMPLATE_f = makeString("~&GENERATE-PHRASE-FROM-TEMPLATE found string: ~S");

    private static final SubLString $str237$__Updated_AGR_is__S___ = makeString("~&Updated AGR is ~S.~%");

    private static final SubLSymbol GENERATE_SIMPLE_NEGATION = makeSymbol("GENERATE-SIMPLE-NEGATION");





    public static final SubLString $str241$Inside_operator_scope__S = makeString("Inside operator scope ~S");



    private static final SubLString $str243$__Shadowing_discourse_context____ = makeString("~&Shadowing discourse context...~%");

    private static final SubLString $str244$Leaving_operator_scope__S = makeString("Leaving operator scope ~S");

    private static final SubLObject $$Some_NLAttr = reader_make_constant_shell(makeString("Some-NLAttr"));

    private static final SubLObject $$No_NLAttr = reader_make_constant_shell(makeString("No-NLAttr"));

    private static final SubLObject $$Any_NLAttr = reader_make_constant_shell(makeString("Any-NLAttr"));

    private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell(makeString("nonPlural-Generic"));

    private static final SubLSymbol PPH_TRY_TO_EXPRESS_NEGATION = makeSymbol("PPH-TRY-TO-EXPRESS-NEGATION");

    private static final SubLString $str250$Converted__S_to__S = makeString("Converted ~S to ~S");

    private static final SubLObject $$WordWithSuffixFn = reader_make_constant_shell(makeString("WordWithSuffixFn"));

    private static final SubLObject $$Nt_TheSuffix = reader_make_constant_shell(makeString("Nt-TheSuffix"));

    private static final SubLObject $$Aux_Negated = reader_make_constant_shell(makeString("Aux-Negated"));

    private static final SubLString $$$not = makeString("not");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol GENERATE_FN_TO_ARG_0 = makeSymbol("GENERATE-FN-TO-ARG-0");

    private static final SubLSymbol $FN_TO_ARG_0 = makeKeyword("FN-TO-ARG-0");

    private static final SubLString $$$the = makeString("the");

    private static final SubLList $list259 = list(makeSymbol("LEADING-STRINGS"), makeSymbol("WU"), makeSymbol("FOLLOWING-STRINGS"), makeSymbol("POS"));

    private static final SubLList $list260 = list(reader_make_constant_shell(makeString("nonSingular-Generic")));

    private static final SubLObject $$importFromAmountDuring = reader_make_constant_shell(makeString("importFromAmountDuring"));

    private static final SubLString $str262$_a_export_to__a_during__a = makeString("~a export to ~a during ~a");

    private static final SubLList $list263 = list(list(TWO_INTEGER, makeKeyword("NON-PLURAL-GENERIC")), ONE_INTEGER, FOUR_INTEGER);



    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS = makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING-NO-TAGS");

    private static final SubLSymbol GENERATE_KAPPA = makeSymbol("GENERATE-KAPPA");



    private static final SubLSymbol $sym268$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLString $$$for = makeString("for");

    private static final SubLSymbol GENERATE_EXISTENTIAL = makeSymbol("GENERATE-EXISTENTIAL");



    private static final SubLList $list272 = list(reader_make_constant_shell(makeString("tensed")));



    private static final SubLString $str274$Failed_to_paraphrase__S_with_type = makeString("Failed to paraphrase ~S with type.");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLString $$$there_is_some = makeString("there is some");

    private static final SubLString $$$such_that = makeString("such that");

    private static final SubLString $str278$Failed_to_generate_explicit_exist = makeString("Failed to generate explicit existential for~% ~S~%");

    private static final SubLSymbol EL_EXISTENTIAL_P = makeSymbol("EL-EXISTENTIAL-P");

    private static final SubLSymbol EL_UNIVERSAL_P = makeSymbol("EL-UNIVERSAL-P");

    private static final SubLSymbol PPH_UNIVERSAL_P = makeSymbol("PPH-UNIVERSAL-P");

    private static final SubLSymbol PPH_EXISTENTIAL_P = makeSymbol("PPH-EXISTENTIAL-P");

    private static final SubLList $list283 = list(makeSymbol("VAR"), makeSymbol("BODY"));

    private static final SubLString $str284$Registering__S_as__S___with_map__ = makeString("Registering ~S as ~S~% with map ~S");

    private static final SubLList $list285 = list(makeSymbol("VAR"), makeSymbol("RESTR"));





    private static final SubLString $str288$__Checking_formula_for_relational = makeString("~&Checking formula for relational noun paraphrase:~% ~S~%");

    private static final SubLString $str289$___S_not_suitable_for_relational_ = makeString("~&~S not suitable for relational noun paraphrase.~%");

    private static final SubLString $str290$__Suitable_for_relational_noun_pa = makeString("~&Suitable for relational noun paraphrase.~%");

    private static final SubLSymbol RELATIONAL_NOUN_ARGS_FOR_PRED = makeSymbol("RELATIONAL-NOUN-ARGS-FOR-PRED");

    private static final SubLString $str292$__Paraphrasing__S_with_relational = makeString("~&Paraphrasing ~S with relational nouns.~%");

    private static final SubLString $str293$Bad_arg___S_in__S___ = makeString("Bad arg: ~S in ~S.~%");

    private static final SubLString $str294$Don_t_know_how_to_form_a_relation = makeString("Don't know how to form a relational noun expression for ~S.");

    private static final SubLObject $$NLSentence = reader_make_constant_shell(makeString("NLSentence"));

    private static final SubLList $list296 = list(reader_make_constant_shell(makeString("Have-TheWord")));

    private static final SubLSymbol GENERATE_IMPLICATION_SMART = makeSymbol("GENERATE-IMPLICATION-SMART");



    private static final SubLString $str299$__Removed_var_typing_clauses_in__ = makeString("~&Removed var typing clauses in ~S~%...to form ~S~%");



    private static final SubLList $list301 = list(makeSymbol("OP"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLString $str303$__Registering__S_and__S_as_differ = makeString("~&Registering ~S and ~S as different.~%");

    private static final SubLSymbol PPH_REGISTER_DIFFERENT_VARS = makeSymbol("PPH-REGISTER-DIFFERENT-VARS");

    private static final SubLList $list305 = list(makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));





    public static final SubLList $list308 = list(makeSymbol("VAR"), makeSymbol("LOCAL-ARG-POSITION"));

    private static final SubLSymbol EL_GENERAL_EXISTENTIAL_P = makeSymbol("EL-GENERAL-EXISTENTIAL-P");

    private static final SubLSymbol EL_DISJUNCTION_P = makeSymbol("EL-DISJUNCTION-P");

    private static final SubLSymbol $sym311$PPH_EXISTENTIAL_RMP_SENTENCE_ = makeSymbol("PPH-EXISTENTIAL-RMP-SENTENCE?");

    private static final SubLList $list312 = cons(makeSymbol("QUANT"), makeSymbol("ARG-POSITION"));

    private static final SubLObject $$Every_NLAttr = reader_make_constant_shell(makeString("Every-NLAttr"));



    private static final SubLSymbol $sym315$PPH_VALID_RELEVANT_VAR_TYPE_ = makeSymbol("PPH-VALID-RELEVANT-VAR-TYPE?");

    private static final SubLString $str316$Bad_FORMULA_argument_to_REGISTER_ = makeString("Bad FORMULA argument to REGISTER-VAR-BY-ARG-CONSTRAINTS: ~S.");

    private static final SubLSymbol REMOVE_VAR_TYPING_CLAUSES = makeSymbol("REMOVE-VAR-TYPING-CLAUSES");

    private static final SubLString $str318$__Found_a_var_typing_clause__with = makeString("~&Found a var-typing clause, with var ~s type ~s~% arg-position: ~S~%");

    private static final SubLString $str319$___S_does_not_type__S__Keeping_it = makeString("~&~S does not type ~S. Keeping it.~%");

    private static final SubLString $str320$___S_is_only_remaining_var_typing = makeString("~&~S is only remaining var-typing clause for ~S. Keeping it.~%");

    private static final SubLString $str321$___S_is_already_registered_as__S_ = makeString("~&~S is already registered as ~S. Skipping ~S~%");

    private static final SubLString $str322$___S_is_already_registered_as__S_ = makeString("~&~S is already registered as ~S. Keeping ~S~%");

    private static final SubLSymbol POSSIBLY_NEW_EXCEPTIONAL_VAR_P = makeSymbol("POSSIBLY-NEW-EXCEPTIONAL-VAR-P");

    private static final SubLSymbol $sym324$PPH_OPAQUE_PRED_ = makeSymbol("PPH-OPAQUE-PRED?");

    private static final SubLObject $$sentenceImplies = reader_make_constant_shell(makeString("sentenceImplies"));

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLList $list327 = list(reader_make_constant_shell(makeString("sentenceImplies")));

    private static final SubLInteger $int$98 = makeInteger(98);

    private static final SubLSymbol $sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_ = makeSymbol("PPH-RELN-TYPE-LEVEL-IN-ARG?");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol $sym331$SPEC_ = makeSymbol("SPEC?");

    private static final SubLInteger $int$200 = makeInteger(200);



    private static final SubLSymbol GENERATE_CF_IMPLICATION = makeSymbol("GENERATE-CF-IMPLICATION");



    private static final SubLString $str336$if_it_had_a_been_the_case_that__a = makeString("if it had~a been the case that ~a, it would~a be the case that ~a");

    private static final SubLObject $$cfImplies = reader_make_constant_shell(makeString("cfImplies"));

    private static final SubLSymbol GENERATE_SUBCOLLECTION_WITH_RELATIONAL_NOUN = makeSymbol("GENERATE-SUBCOLLECTION-WITH-RELATIONAL-NOUN");

    private static final SubLSymbol $RELATIONAL_NOUN_SUBCOLLECTION_NAUT = makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT");

    private static final SubLObject $const340$SubcollectionRelationFunction_Inv = reader_make_constant_shell(makeString("SubcollectionRelationFunction-Inverse"));

    private static final SubLString $str341$Generating_relational_noun_phrase = makeString("Generating relational noun phrase for ~S (of a ~S)");

    private static final SubLObject $const342$SubcollectionRelationFunction_Ins = reader_make_constant_shell(makeString("SubcollectionRelationFunction-InstanceLevel"));

    private static final SubLList $list343 = list(makeKeyword("ARG3"));

    private static final SubLObject $$Of_TheWord = reader_make_constant_shell(makeString("Of-TheWord"));

    private static final SubLList $list345 = list(reader_make_constant_shell(makeString("nonPlural-Generic")), makeKeyword("ARG3"));

    private static final SubLString $str346$Couldn_t_find_an_arg_in_reln_asse = makeString("Couldn't find an arg-in-reln assertion for~% ~S");

    private static final SubLObject $const347$SubcollectionRelationFunction_Can = reader_make_constant_shell(makeString("SubcollectionRelationFunction-Canonical"));

    private static final SubLSymbol GENERATE_THE_COLLECTION_WITH_REL_CLAUSE = makeSymbol("GENERATE-THE-COLLECTION-WITH-REL-CLAUSE");

    private static final SubLSymbol $THE_COLLECTION_OF_NAT = makeKeyword("THE-COLLECTION-OF-NAT");

    private static final SubLList $list350 = list(reader_make_constant_shell(makeString("nounStrings")));

    private static final SubLList $list351 = list(makeSymbol("VAR"), makeSymbol("RESTRICTION-SENTENCE"));

    private static final SubLObject $$CollectionSubsetFn = reader_make_constant_shell(makeString("CollectionSubsetFn"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLSymbol GENERATE_SUBCOLLECTION_WITH_REL_CLAUSE = makeSymbol("GENERATE-SUBCOLLECTION-WITH-REL-CLAUSE");

    private static final SubLSymbol $SUBCOLLECTION_RELATION_NAUT = makeKeyword("SUBCOLLECTION-RELATION-NAUT");

    private static final SubLObject $$FormulaArgFn = reader_make_constant_shell(makeString("FormulaArgFn"));

    public static final SubLList $list357 = list(makeSymbol("COLL"), makeSymbol("CYCL-SET"));

    private static final SubLList $list358 = list(makeSymbol("VAR"), makeSymbol("SET-CONSTRAINT"));

    private static final SubLSymbol PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE = makeSymbol("PPH-SUBCOL-EMBEDDED-SENTENCE-TEMPLATE");

    private static final SubLObject $const360$SubcollectionRelationFunction_Typ = reader_make_constant_shell(makeString("SubcollectionRelationFunction-TypeLevel"));





    private static final SubLInteger $int$48 = makeInteger(48);

    private static final SubLString $str364$_S_is_neither_an_atom_nor_a_list_ = makeString("~S is neither an atom nor a list!");

    private static final SubLObject $$SymmetricBinaryPredicate = reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));

    private static final SubLString $str366$PPH_REL_CLAUSE_FOR_COLL_SUBSET_ca = makeString("PPH-REL-CLAUSE-FOR-COLL-SUBSET called with assertion-style template ~S");

    private static final SubLObject $$Person = reader_make_constant_shell(makeString("Person"));

    private static final SubLString $str368$__Trying_to_make_relative_clause_ = makeString("~&Trying to make relative clause from template phrase.~%");

    private static final SubLString $$$whose = makeString("whose");

    private static final SubLObject $$PossessivePhrase = reader_make_constant_shell(makeString("PossessivePhrase"));

    private static final SubLString $$$whom = makeString("whom");

    private static final SubLString $$$which = makeString("which");

    private static final SubLString $str373$Moving_rel_clause_copula_to_immed = makeString("Moving rel-clause copula to immediately follow relative pronoun.");

    private static final SubLString $str374$__Removing_copula_from_template__ = makeString("~&Removing copula from template.~%");

    private static final SubLObject $$Have_TheWord = reader_make_constant_shell(makeString("Have-TheWord"));

    private static final SubLString $$$with = makeString("with");

    private static final SubLString $str377$__Adding_relative_pronoun_to_temp = makeString("~&Adding relative pronoun to template.~%");

    private static final SubLString $$$that = makeString("that");

    private static final SubLString $str379$__Template_now_has__D_dtrs___ = makeString("~&Template now has ~D dtrs.~%");

    private static final SubLString $str380$Can_t_determine_relative_clause_h = makeString("Can't determine relative clause head dtr from~% ~S");

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLString $str382$Updating__S_of__S___to__S = makeString("Updating ~S of ~S~% to ~S");

    private static final SubLObject $$Be_TheWord = reader_make_constant_shell(makeString("Be-TheWord"));

    private static final SubLString $str384$_a_ = makeString("~a ");

    private static final SubLString $$$is_ = makeString("is ");

    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));



    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLString $str390$_a_that_ = makeString("~a that ");

    private static final SubLObject $$thirdPersonSg_Present = reader_make_constant_shell(makeString("thirdPersonSg-Present"));

    private static final SubLList $list392 = list(makeSymbol("PHRASE-IF"), makeSymbol("PHRASE-IF-NOT"));

    private static final SubLString $str393$Found_extractible_dtr______S = makeString("Found extractible dtr: ~% ~S");

    private static final SubLSymbol GENERATE_PHRASE_NAUT = makeSymbol("GENERATE-PHRASE-NAUT");

    private static final SubLSymbol $PHRASE_DENOTING_NAUT = makeKeyword("PHRASE-DENOTING-NAUT");

    private static final SubLString $str396$__In_GENERATE_PHRASE_NAUT___ = makeString("~&In GENERATE-PHRASE-NAUT.~%");

    private static final SubLString $str397$__Precision_is__S___ = makeString("~&Precision is ~S.~%");

    private static final SubLSymbol GENERATE_SPECIFIED_SCOPE_SENTENCE = makeSymbol("GENERATE-SPECIFIED-SCOPE-SENTENCE");

    private static final SubLSymbol $SPECIFIED_SCOPE_SENTENCE = makeKeyword("SPECIFIED-SCOPE-SENTENCE");

    private static final SubLString $str400$__Replacing_rule_macro_formula___ = makeString("~&Replacing rule-macro formula~% ~S~% with~% ~S");

    private static final SubLString $str401$__GENERATE_SPECIFIED_SCOPE_SENTEN = makeString("~&GENERATE-SPECIFIED-SCOPE-SENTENCE is returning: ~S");

    private static final SubLSymbol GENERATE_RMP_SENTENCE_VIA_EXPANSION = makeSymbol("GENERATE-RMP-SENTENCE-VIA-EXPANSION");



    private static final SubLSymbol $sym404$COMMON_NON_SKOLEM_INDETERMINATE_TERM_DENOTING_FUNCTION_ = makeSymbol("COMMON-NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTION?");

    private static final SubLString $str405$Replacing_rule_macro_formula____S = makeString("Replacing rule-macro formula~% ~S~% with expanded formula ~S");

    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

    private static final SubLString $str407$__Looking_for_a_template_for__S__ = makeString("~&Looking for a template for ~S~%");

    private static final SubLString $str408$Abandoning_search_because__S_is_u = makeString("Abandoning search because ~S is unambiguous with respect to scope.~%");

    private static final SubLString $str409$__No_template_found_for__S___ = makeString("~&No template found for ~S.~%");

    private static final SubLString $str410$__Search_limit_exceeded___ = makeString("~&Search limit exceeded.~%");

    private static final SubLString $str411$__Search_level_is__S_of__S__ = makeString("~&Search level is ~S of ~S~%");

    private static final SubLSymbol $sym412$SCOPALLY_UNAMBIGUOUS_ = makeSymbol("SCOPALLY-UNAMBIGUOUS?");

    private static final SubLString $str413$___S_is_not_ambiguous_with_respec = makeString("~&~S is not ambiguous with respect to scope.~%");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $str415$__Entering_PPH_SETTING_VAR_TYPES_ = makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");

    private static final SubLString $str416$__Paraphrasing_formula__S__ = makeString("~&Paraphrasing formula ~S~%");



    private static final SubLString $str418$__Found_assertion__S_for_formula_ = makeString("~&Found assertion ~S for formula ~S~%");

    private static final SubLString $str419$__Leaving_PPH_SETTING_VAR_TYPES_I = makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");

    private static final SubLString $str420$___Output_list___S__ = makeString("~& Output list: ~S~%");

    private static final SubLString $str421$___Setting__S_to____S = makeString("~& Setting ~S to~% ~S");

    private static final SubLString $str422$___Leaving__PPH_VAR_TYPES___S = makeString("~% Leaving *PPH-VAR-TYPES* ~S");

    private static final SubLObject $$generateArgWithOutsideScope = reader_make_constant_shell(makeString("generateArgWithOutsideScope"));

    private static final SubLString $$$relatedArgPositions = makeString("relatedArgPositions");

    private static final SubLObject $$relatedArgPositions = reader_make_constant_shell(makeString("relatedArgPositions"));

    private static final SubLList $list426 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLString $str427$Couldn_t_find___relatedArgPositio = makeString("Couldn't find #$relatedArgPositions assertions for ~S");

    private static final SubLString $str428$Wrong_number_of___relatedArgPosit = makeString("Wrong number of #$relatedArgPositions assertions for ~S: ~D.~%");



    private static final SubLList $list430 = list(makeSymbol("QUANT-NL-ATTR"), makeSymbol("ARGNUM"));

    private static final SubLObject $$BareForm_NLAttr = reader_make_constant_shell(makeString("BareForm-NLAttr"));

    private static final SubLObject $$nonSingular_Generic = reader_make_constant_shell(makeString("nonSingular-Generic"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLString $$$everything = makeString("everything");

    private static final SubLSymbol AGREEMENT_LOOKUP = makeSymbol("AGREEMENT-LOOKUP");

    private static final SubLSymbol QUANT_OVER_ARG_TUPLES = makeSymbol("QUANT-OVER-ARG-TUPLES");

    private static final SubLObject $$generateQuantOverArg = reader_make_constant_shell(makeString("generateQuantOverArg"));

    private static final SubLSymbol $quant_over_arg_tuples_caching_state$ = makeSymbol("*QUANT-OVER-ARG-TUPLES-CACHING-STATE*");

    private static final SubLSymbol $sym439$_ = makeSymbol("<");





    private static final SubLList $list442 = list(makeSymbol("IN"), makeSymbol("OUT"));

    private static final SubLString $str443$__Found_a_genTemplate_for__S___ = makeString("~&Found a genTemplate for ~S.~%");

    private static final SubLString $str444$__Passing_up_genTemplates_for__S_ = makeString("~&Passing up genTemplates for ~S in favor of genFormats.~%");

    private static final SubLString $str445$__Couldn_t_find_any_generation_te = makeString("~&Couldn't find any generation templates for~% ~S with wide-scope arg ~S.~%");



    private static final SubLString $str447$_a = makeString("~a");

    private static final SubLString $str448$_a_and = makeString("~a and");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sym451$PPH_ALLOW_VAR_TYPING_ = makeSymbol("PPH-ALLOW-VAR-TYPING?");

    private static final SubLSymbol $sym452$PPH_GENL_ = makeSymbol("PPH-GENL?");

    private static final SubLList $list453 = cons(makeSymbol("TYPE"), makeSymbol("VARS"));

    private static final SubLSymbol GENERATE_UNIVERSAL = makeSymbol("GENERATE-UNIVERSAL");

    private static final SubLString $str455$__Changed_phrase_cycl_from__S___t = makeString("~&Changed phrase cycl from ~S~% to ~S~% to ~S~%");



    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));

    private static final SubLString $$$for_every = makeString("for every");

    private static final SubLString $str459$Failed_to_generate_explicit_unive = makeString("Failed to generate explicit universal for~% ~S~%");

    private static final SubLSymbol PPH_EXISTENTIAL_FORMULA_P = makeSymbol("PPH-EXISTENTIAL-FORMULA-P");



    private static final SubLObject $$ExistentialQuantifier = reader_make_constant_shell(makeString("ExistentialQuantifier"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLList $list464 = list(makeSymbol("VAR-TYPED"), makeSymbol("ARG-POSITION"));

    private static final SubLList $list465 = list(TWO_INTEGER, ZERO_INTEGER);

    private static final SubLString $str466$Couldn_t_remove_var_typing_clause = makeString("Couldn't remove var-typing clauses from universal:~% ~S");



    private static final SubLSymbol GENERATE_UNICODE_NAUT = makeSymbol("GENERATE-UNICODE-NAUT");



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list471 = list(makeSymbol("FROM-ARG"), makeSymbol("TO-ARG"));

    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    private static final SubLSymbol GENERATE_SET_NAUT = makeSymbol("GENERATE-SET-NAUT");



    private static final SubLString $$$the_set_of = makeString("the set of");

    private static final SubLObject $$singular = reader_make_constant_shell(makeString("singular"));

    private static final SubLSymbol GENERATE_WITH_HOLDS_OF = makeSymbol("GENERATE-WITH-HOLDS-OF");





    private static final SubLObject $$CyclishParaphraseMt = reader_make_constant_shell(makeString("CyclishParaphraseMt"));

    private static final SubLString $str481$Generating_with_holds_of_for_moth = makeString("Generating with holds-of for motherless phrase:~% ~S~%");

    private static final SubLList $list482 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));

    private static final SubLString $str483$doesn_t_hold = makeString("doesn't hold");

    private static final SubLString $$$does_not_hold = makeString("does not hold");

    private static final SubLString $$$holds = makeString("holds");

    private static final SubLSymbol DO_GENERATE_WITH_HOLDS_OF = makeSymbol("DO-GENERATE-WITH-HOLDS-OF");

    private static final SubLObject $$TheCoordinationSet = reader_make_constant_shell(makeString("TheCoordinationSet"));

    private static final SubLSymbol GENERATE_CONJUNCTION_HEAD_DRIVEN = makeSymbol("GENERATE-CONJUNCTION-HEAD-DRIVEN");



    private static final SubLList $list490 = list(reader_make_constant_shell(makeString("thirdPersonSg-Present")));



    private static final SubLSymbol SUBJ = makeSymbol("SUBJ");

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    public static final SubLList $list494 = list(makeKeyword("OR"), reader_make_constant_shell(makeString("doneBy")), reader_make_constant_shell(makeString("performedBy")));

    private static final SubLList $list495 = list(list(makeKeyword("BIND"), makeSymbol("SUBJ")));

    private static final SubLSymbol GENERATE_POSSIBLY_REDUCED_COORDINATION = makeSymbol("GENERATE-POSSIBLY-REDUCED-COORDINATION");



    private static final SubLString $str498$__Created_coordination_template_f = makeString("~&Created coordination template for ~S~%");

    private static final SubLObject $$TheDisjunctiveCoordinationSet = reader_make_constant_shell(makeString("TheDisjunctiveCoordinationSet"));

    private static final SubLSymbol CYCL_ATOMIC_SENTENCE_P = makeSymbol("CYCL-ATOMIC-SENTENCE-P");

    private static final SubLSymbol GENERATE_EXISTENTIAL_WITH_THECOLLECTIONOF = makeSymbol("GENERATE-EXISTENTIAL-WITH-THECOLLECTIONOF");

    private static final SubLString $str502$such_that__X = makeString("such that ?X");

    private static final SubLList $list503 = list(makeSymbol("INCLUDES"), makeSymbol("EXCLUDES"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list505 = list(makeSymbol("SINGLE-MENTIONS"), makeSymbol("MULTIPLE-MENTIONS"), makeSymbol("VAR-TYPING-CLAUSES"), makeSymbol("NONMENTIONS"));

    private static final SubLString $$$X = makeString("X");

    private static final SubLObject $$TheCollectionOf = reader_make_constant_shell(makeString("TheCollectionOf"));

    public static SubLObject generate_string_with_comma(final SubLObject obj) {
        return cconcatenate(format_nil.format_nil_a_no_copy(pph_main.pph_phrase_generate_string_from_cycl(obj, UNPROVIDED, UNPROVIDED)), $str0$_);
    }

    public static SubLObject generate_conjunctive_sequence(final SubLObject list) {
        return generate_sequence(list, $$$and);
    }

    public static SubLObject generate_disjunctive_sequence(final SubLObject list) {
        return generate_sequence(list, $$$or);
    }

    public static SubLObject generate_sequence(final SubLObject list, SubLObject conj_string) {
        if (conj_string == UNPROVIDED) {
            conj_string = $$$and;
        }
        if (NIL == list_utilities.proper_list_p(list)) {
            return princ_to_string(list);
        }
        final SubLObject head = list.first();
        final SubLObject head_string = pph_main.pph_phrase_generate_string_from_cycl(head, UNPROVIDED, UNPROVIDED);
        final SubLObject pcase_var = length(list);
        if (pcase_var.eql(ONE_INTEGER)) {
            return head_string;
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return cconcatenate(head_string, new SubLObject[]{ $$$_, conj_string, $$$_, pph_main.pph_phrase_generate_string_from_cycl(second(list), UNPROVIDED, UNPROVIDED) });
        }
        final SubLObject front = butlast(list, UNPROVIDED);
        final SubLObject strings = Mapping.mapcar(GENERATE_STRING_WITH_COMMA, front);
        final SubLObject last_string = pph_main.pph_phrase_generate_string_from_cycl(list_utilities.last_one(list), UNPROVIDED, UNPROVIDED);
        return string_utilities.bunge(append(strings, list(conj_string, last_string)), UNPROVIDED);
    }

    public static SubLObject generate_juncts(final SubLObject args, SubLObject arg_order_sublist, SubLObject opr_key, SubLObject list_type) {
        if (arg_order_sublist == UNPROVIDED) {
            arg_order_sublist = NIL;
        }
        if (opr_key == UNPROVIDED) {
            opr_key = $AND;
        }
        if (list_type == UNPROVIDED) {
            list_type = $UNORDERED;
        }
        final SubLObject olist = generate_juncts_output_list(args, arg_order_sublist, opr_key, list_type);
        return NIL != pph_phrase.pph_phrase_output_list_p(olist) ? pph_phrase.pph_phrase_output_list_string(olist, UNPROVIDED) : $FAILURE;
    }

    public static SubLObject generate_juncts_output_list(final SubLObject args, SubLObject arg_order_sublist, SubLObject opr_key, SubLObject list_type) {
        if (arg_order_sublist == UNPROVIDED) {
            arg_order_sublist = NIL;
        }
        if (opr_key == UNPROVIDED) {
            opr_key = $AND;
        }
        if (list_type == UNPROVIDED) {
            list_type = $UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_lists = NIL;
        SubLObject big_output_list = NIL;
        if (args.isCons()) {
            final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        SubLObject output_lists_$5 = NIL;
                                        SubLObject abortP = NIL;
                                        final SubLObject _prev_bind_0_$5 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                            pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str8$__Trying_default_precision___S___, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED);
                                            SubLObject list_var = NIL;
                                            SubLObject arg = NIL;
                                            SubLObject ignoreme = NIL;
                                            list_var = args;
                                            arg = list_var.first();
                                            for (ignoreme = ZERO_INTEGER; (NIL == abortP) && (NIL != list_var); list_var = list_var.rest() , arg = list_var.first() , ignoreme = add(ONE_INTEGER, ignoreme)) {
                                                final SubLObject olist = generate_genformat_arg(arg, remove_if(INTEGERP, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                pph_disambiguation.note_pph_output_list_for_disambiguation(ignoreme, olist);
                                                if (NIL != pph_phrase.pph_phrase_output_list_p(olist)) {
                                                    output_lists_$5 = cons(olist, output_lists_$5);
                                                } else {
                                                    abortP = T;
                                                }
                                            }
                                            if (NIL != abortP) {
                                                output_lists = $FAILURE;
                                            } else {
                                                output_lists_$5 = nreverse(output_lists_$5);
                                                SubLObject cdolist_list_var;
                                                final SubLObject dupe_index_lists = cdolist_list_var = pph_disambiguation.pph_find_duplicates(output_lists_$5);
                                                SubLObject dupe_index_list = NIL;
                                                dupe_index_list = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str10$__Working_on_dupe_list___S__, dupe_index_list, UNPROVIDED, UNPROVIDED);
                                                    final SubLObject dupe_objects = pph_disambiguation.pph_dereference_indexes(dupe_index_list, args);
                                                    SubLObject cdolist_list_var_$7 = dupe_index_list;
                                                    SubLObject ignoreme2 = NIL;
                                                    ignoreme2 = cdolist_list_var_$7.first();
                                                    while (NIL != cdolist_list_var_$7) {
                                                        final SubLObject arg2 = nth(ignoreme2, args);
                                                        pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str11$__Trying_to_reparaphrase__S___, arg2, UNPROVIDED, UNPROVIDED);
                                                        final SubLObject new_precision = pph_utilities.pph_precision_for_object(arg2, dupe_objects);
                                                        final SubLObject new_demerit_cutoff = pph_disambiguation.pph_demerit_cutoff_from_olist(ignoreme2, output_lists_$5);
                                                        SubLObject new_output_list = NIL;
                                                        if (!new_precision.equal(pph_utilities.pph_current_precision())) {
                                                            pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str12$__Trying_targeted_precision__S_fo, new_precision, arg2, UNPROVIDED);
                                                            assert NIL != pph_utilities.pph_precision_p(new_precision) : "pph_utilities.pph_precision_p(new_precision) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(new_precision) " + new_precision;
                                                            final SubLObject _prev_bind_0_$6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$paraphrase_precision$.bind(new_precision, thread);
                                                                pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                                new_output_list = generate_genformat_arg(arg2, remove_if(INTEGERP, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                                                                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$6, thread);
                                                            }
                                                            pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str14$__New_paraphrase_with_precision__, new_precision, arg2, new_output_list);
                                                        }
                                                        if (new_precision.isList() && ((NIL == new_output_list) || (NIL != pph_disambiguation.pph_output_list_E(new_output_list, nth(ignoreme2, output_lists_$5))))) {
                                                            pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str15$__Trying_full_precision_for__S, arg2, UNPROVIDED, UNPROVIDED);
                                                            assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
                                                            final SubLObject _prev_bind_0_$7 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$paraphrase_precision$.bind(T, thread);
                                                                pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                                                pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                                new_output_list = generate_genformat_arg(arg2, remove_if(INTEGERP, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } finally {
                                                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_3, thread);
                                                                pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
                                                                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$7, thread);
                                                            }
                                                            pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str16$__New_paraphrase_with_full_precis, arg2, new_output_list, UNPROVIDED);
                                                        }
                                                        if (NIL != pph_disambiguation.pph_new_olist_better_than_oldP(new_output_list, nth(ignoreme2, output_lists_$5), arg2)) {
                                                            pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str17$__Changing_output_list_for__S_fro, arg2, nth(ignoreme2, output_lists_$5), new_output_list);
                                                            set_nth(ignoreme2, output_lists_$5, new_output_list);
                                                            pph_disambiguation.note_pph_output_list_for_disambiguation(ignoreme2, new_output_list);
                                                        }
                                                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                                        ignoreme2 = cdolist_list_var_$7.first();
                                                    } 
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    dupe_index_list = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2 = args;
                                                arg = NIL;
                                                arg = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    pph_drs.pph_possibly_add_reference_marker(arg);
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    arg = cdolist_list_var2.first();
                                                } 
                                                output_lists = append(output_lists, output_lists_$5);
                                            }
                                        } finally {
                                            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                                }
                            } finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$3, thread);
                            }
                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        } finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
            }
            if (!output_lists.isList()) {
                return $FAILURE;
            }
            pph_add_cycl_to_junct_olists(args, output_lists);
            final SubLObject arg_num = find_if(INTEGERP, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != arg_num) {
                pph_contextualize_junct_arg_positions(arg_num, output_lists);
            }
            final SubLObject args_ok_for_bulletsP = find_if(EL_FORMULA_P, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject suspendP = makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) && (NIL == args_ok_for_bulletsP));
            final SubLObject _prev_bind_4 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_bulleted_listsP$.bind(makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) && (NIL != args_ok_for_bulletsP)), thread);
                if ((NIL != suspendP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                    format_nil.force_format(T, $str20$__Suspending_bullet_use_for____S_, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                big_output_list = pph_junct_olist_from_olists(output_lists, opr_key, NIL, list_type);
                if ((NIL != suspendP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                    format_nil.force_format(T, $str21$__Turning_bullet_use_back_on___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_4, thread);
            }
        }
        return big_output_list;
    }

    public static SubLObject pph_use_bullets_for_junct_listsP(final SubLObject junct_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject use_bulletsP = NIL;
        if (NIL == pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str22$__Not_using_bullets____PPH_USE_BU, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL != pph_junct_lists_too_short_for_bulletsP(junct_lists)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str23$__Not_using_bullets___list_is_too, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != list_utilities.lengthL(list_utilities.extremal(junct_lists, GREATER_LENGTH_P, UNPROVIDED), TWO_INTEGER, UNPROVIDED)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str23$__Not_using_bullets___list_is_too, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    if (NIL == use_bulletsP) {
                        SubLObject csome_list_var = junct_lists;
                        SubLObject junct_list = NIL;
                        junct_list = csome_list_var.first();
                        while ((NIL == use_bulletsP) && (NIL != csome_list_var)) {
                            if (NIL == use_bulletsP) {
                                SubLObject csome_list_var_$12 = junct_list;
                                SubLObject item = NIL;
                                item = csome_list_var_$12.first();
                                while ((NIL == use_bulletsP) && (NIL != csome_list_var_$12)) {
                                    if (NIL != pph_utilities.pph_genl_pos_predP(pph_data_structures.pph_phrase_output_item_agr_pred(item), $$verbStrings, UNPROVIDED)) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format_nil.force_format(T, $str26$__Found_verb__S__Using_bullets_fo, item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        SubLObject cdolist_list_var = junct_lists;
                                        SubLObject olist = NIL;
                                        olist = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str27$____S__, Mapping.mapcar(PPH_PHRASE_OUTPUT_ITEM_STRING, olist), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            olist = cdolist_list_var.first();
                                        } 
                                        use_bulletsP = T;
                                    }
                                    csome_list_var_$12 = csome_list_var_$12.rest();
                                    item = csome_list_var_$12.first();
                                } 
                            }
                            csome_list_var = csome_list_var.rest();
                            junct_list = csome_list_var.first();
                        } 
                    }
                    if ((NIL == use_bulletsP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                        format_nil.force_format(T, $str29$__Not_using_bullets___Failed_to_f, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }


        return use_bulletsP;
    }

    public static SubLObject pph_junct_lists_too_short_for_bulletsP(final SubLObject junct_lists) {
        final SubLObject too_shortP = list_utilities.lengthL(junct_lists, TWO_INTEGER, UNPROVIDED);
        SubLObject long_enoughP = list_utilities.lengthG(junct_lists, FOUR_INTEGER, UNPROVIDED);
        SubLObject string_length = ZERO_INTEGER;
        if ((NIL == too_shortP) && (NIL == long_enoughP)) {
            SubLObject csome_list_var = junct_lists;
            SubLObject junct_list = NIL;
            junct_list = csome_list_var.first();
            while ((NIL == long_enoughP) && (NIL != csome_list_var)) {
                if (NIL == long_enoughP) {
                    SubLObject csome_list_var_$13 = junct_list;
                    SubLObject item = NIL;
                    item = csome_list_var_$13.first();
                    while ((NIL == long_enoughP) && (NIL != csome_list_var_$13)) {
                        string_length = add(string_length, length(pph_data_structures.pph_phrase_output_item_string(item)));
                        long_enoughP = numG(string_length, $int$40);
                        csome_list_var_$13 = csome_list_var_$13.rest();
                        item = csome_list_var_$13.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                junct_list = csome_list_var.first();
            } 
        }
        return makeBoolean((NIL != too_shortP) || (NIL == long_enoughP));
    }

    public static SubLObject pph_junct_olist_from_olists(final SubLObject junct_lists, final SubLObject opr_key, SubLObject opr_item, SubLObject list_type) {
        if (opr_item == UNPROVIDED) {
            opr_item = NIL;
        }
        if (list_type == UNPROVIDED) {
            list_type = $UNORDERED;
        }
        final SubLObject arg_count = length(junct_lists);
        final SubLObject opr_string = pph_operator_string_from_key(opr_key);
        final SubLObject use_bulletsP = pph_use_bullets_for_junct_listsP(junct_lists);
        if (NIL == opr_item) {
            opr_item = pph_question.new_pph_phrase_filler_item(opr_string);
        } else {
            pph_data_structures.pph_phrase_output_item_set_string(opr_item, opr_string);
        }
        final SubLObject pcase_var = arg_count;
        if (pcase_var.eql(ONE_INTEGER)) {
            return junct_lists.first();
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return pph_junct_olist_from_2_olists(junct_lists, opr_item, list_type, use_bulletsP);
        }
        return pph_junct_olist_from_3_or_more_olists(junct_lists, opr_string, opr_item, list_type, use_bulletsP);
    }

    public static SubLObject add_to_junct_olist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ans = NIL;
        SubLObject as_list_itemP = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        ans = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        as_list_itemP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(PWHEN, as_list_itemP, list(CPUSH, $list35, ans)), append(body, list(list(PWHEN, as_list_itemP, list(CPUSH, $list36, ans)))));
        }
        cdestructuring_bind_error(datum, $list31);
        return NIL;
    }

    public static SubLObject pph_junct_olist_from_2_olists(final SubLObject junct_lists, final SubLObject opr_item, final SubLObject list_type, final SubLObject use_bulletsP) {
        SubLObject ans = NIL;
        SubLObject first_list = NIL;
        SubLObject second_list = NIL;
        destructuring_bind_must_consp(junct_lists, junct_lists, $list37);
        first_list = junct_lists.first();
        SubLObject current = junct_lists.rest();
        destructuring_bind_must_consp(current, junct_lists, $list37);
        second_list = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != use_bulletsP) {
                ans = cons(pph_start_list_item_item(), ans);
            }
            SubLObject cdolist_list_var = first_list;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(item, ans);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            if (NIL != use_bulletsP) {
                ans = cons(pph_end_list_item_item(), ans);
            }
            if (NIL == use_bulletsP) {
                ans = cons(opr_item, ans);
                cdolist_list_var = second_list;
                item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ans = cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
            } else
                if (list_type == $UNORDERED) {
                    ans = cons(pph_start_list_item_item(), ans);
                    ans = cons(opr_item, ans);
                    cdolist_list_var = second_list;
                    item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ans = cons(item, ans);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                    ans = cons(pph_end_list_item_item(), ans);
                } else {
                    ans = cons(pph_comma_item(), ans);
                    ans = cons(opr_item, ans);
                    ans = cons(pph_start_list_item_item(), ans);
                    cdolist_list_var = second_list;
                    item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ans = cons(item, ans);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                    ans = cons(pph_end_list_item_item(), ans);
                }

        } else {
            cdestructuring_bind_error(junct_lists, $list37);
        }
        ans = nreverse(ans);
        if (NIL != use_bulletsP) {
            ans = pph_add_bullet_list_tags(ans, list_type);
        }
        return ans;
    }

    public static SubLObject pph_junct_olist_from_3_or_more_olists(final SubLObject junct_lists, final SubLObject opr_string, final SubLObject opr_item, final SubLObject list_type, final SubLObject use_bulletsP) {
        final SubLObject arg_count = length(junct_lists);
        final SubLObject use_commaP = makeBoolean(opr_string.isString() && (NIL != find_if(ALPHA_CHAR_P, opr_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        final SubLObject repeat_opr_item_each_junctP = NIL;
        SubLObject ans = NIL;
        SubLObject list_var = NIL;
        SubLObject junct_list = NIL;
        SubLObject i = NIL;
        list_var = junct_lists;
        junct_list = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , junct_list = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject first_oneP = zerop(i);
            final SubLObject last_oneP = numE(i, number_utilities.f_1_(arg_count));
            if (NIL == last_oneP) {
                if (NIL != use_bulletsP) {
                    ans = cons(pph_start_list_item_item(), ans);
                }
                if ((NIL != repeat_opr_item_each_junctP) && (NIL == first_oneP)) {
                    ans = cons(opr_item, ans);
                }
                SubLObject cdolist_list_var = junct_list;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ans = cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
                if (NIL != use_commaP) {
                    ans = cons(pph_comma_item(), ans);
                }
                if (NIL != use_bulletsP) {
                    ans = cons(pph_end_list_item_item(), ans);
                }
            } else
                if (NIL == use_bulletsP) {
                    if (NIL != opr_string) {
                        ans = cons(opr_item, ans);
                    }
                    SubLObject cdolist_list_var = junct_list;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ans = cons(item, ans);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                } else
                    if (NIL == opr_string) {
                        ans = cons(pph_start_list_item_item(), ans);
                        SubLObject cdolist_list_var = junct_list;
                        SubLObject item = NIL;
                        item = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            ans = cons(item, ans);
                            cdolist_list_var = cdolist_list_var.rest();
                            item = cdolist_list_var.first();
                        } 
                        ans = cons(pph_end_list_item_item(), ans);
                    } else
                        if (list_type == $UNORDERED) {
                            ans = cons(pph_start_list_item_item(), ans);
                            ans = cons(opr_item, ans);
                            SubLObject cdolist_list_var = junct_list;
                            SubLObject item = NIL;
                            item = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                ans = cons(item, ans);
                                cdolist_list_var = cdolist_list_var.rest();
                                item = cdolist_list_var.first();
                            } 
                            ans = cons(pph_end_list_item_item(), ans);
                        } else {
                            ans = cons(opr_item, ans);
                            ans = cons(pph_start_list_item_item(), ans);
                            SubLObject cdolist_list_var = junct_list;
                            SubLObject item = NIL;
                            item = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                ans = cons(item, ans);
                                cdolist_list_var = cdolist_list_var.rest();
                                item = cdolist_list_var.first();
                            } 
                            ans = cons(pph_end_list_item_item(), ans);
                        }



        }
        ans = nreverse(ans);
        if (NIL != use_bulletsP) {
            ans = pph_add_bullet_list_tags(ans, list_type);
        }
        return ans;
    }

    public static SubLObject pph_comma_item() {
        return pph_question.new_pph_phrase_filler_item($str0$_);
    }

    public static SubLObject pph_add_bullet_list_tags(final SubLObject output_items, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == member(type, html_macros.$html_valid_list_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)) {
            type = $UNORDERED;
        }
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            return cons(pph_start_list_item(type), append(output_items, list(pph_end_list_item(type))));
        }
        return output_items;
    }

    public static SubLObject pph_start_list_item(SubLObject type) {
        if (type == UNPROVIDED) {
            type = $UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, pph_start_list_tag(type), NIL);
        }
        return item;
    }

    public static SubLObject pph_end_list_item(SubLObject type) {
        if (type == UNPROVIDED) {
            type = $UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, NIL, pph_end_list_tag(type));
        }
        return item;
    }

    public static SubLObject pph_start_list_tag(SubLObject type) {
        if (type == UNPROVIDED) {
            type = $UNORDERED;
        }
        SubLObject attributes_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject type_string = NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql($UNORDERED)) {
            type_string = html_macros.$html_unordered_list_head$.getGlobalValue();
        } else {
            type_string = html_macros.$html_ordered_list_head$.getGlobalValue();
            attributes_string = cconcatenate(format_nil.format_nil_a_no_copy(html_macros.$html_list_type$.getGlobalValue()), format_nil.format_nil_s_no_copy(type));
        }
        return cconcatenate(type_string, new SubLObject[]{ attributes_string, $str40$_ });
    }

    public static SubLObject pph_end_list_tag(SubLObject type) {
        if (type == UNPROVIDED) {
            type = $UNORDERED;
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql($UNORDERED)) {
            return html_macros.$html_unordered_list_tail$.getGlobalValue();
        }
        return html_macros.$html_ordered_list_tail$.getGlobalValue();
    }

    public static SubLObject pph_start_list_item_item() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, cconcatenate(html_macros.$html_list_item_head$.getGlobalValue(), $str40$_), NIL);
        }
        return item;
    }

    public static SubLObject pph_end_list_item_item() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, NIL, html_macros.$html_list_item_tail$.getGlobalValue());
        }
        return item;
    }

    public static SubLObject pph_operator_string_from_key(final SubLObject opr_key) {
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        if (opr_key.eql($NONE) || opr_key.eql($SPACE)) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        if (opr_key.eql($PERIOD)) {
            return $str44$_;
        }
        if (opr_key.eql($OR)) {
            return $$$or;
        }
        if (opr_key.eql($AND_OR)) {
            return $str47$and_or;
        }
        if (opr_key.eql($AND)) {
            return $$$and;
        }
        if (opr_key.eql($BUT)) {
            return $$$but;
        }
        return $str0$_;
    }

    public static SubLObject pph_contextualize_junct_arg_positions(final SubLObject starting_argnum, final SubLObject junct_lists) {
        SubLObject current_argnum = starting_argnum;
        SubLObject cdolist_list_var = junct_lists;
        SubLObject junct_list = NIL;
        junct_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject junct_arg_position = list(current_argnum);
            SubLObject cdolist_list_var_$14 = junct_list;
            SubLObject output_item = NIL;
            output_item = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                pph_utilities.pph_contextualize_output_item_arg_position(junct_arg_position, output_item);
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                output_item = cdolist_list_var_$14.first();
            } 
            current_argnum = add(current_argnum, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            junct_list = cdolist_list_var.first();
        } 
        return junct_lists;
    }

    public static SubLObject pph_add_cycl_to_junct_olists(final SubLObject args, final SubLObject junct_lists) {
        SubLObject junct_list = NIL;
        SubLObject junct_list_$15 = NIL;
        SubLObject this_arg_top_level_cycl = NIL;
        SubLObject this_arg_top_level_cycl_$16 = NIL;
        junct_list = junct_lists;
        junct_list_$15 = junct_list.first();
        this_arg_top_level_cycl = args;
        this_arg_top_level_cycl_$16 = this_arg_top_level_cycl.first();
        while ((NIL != this_arg_top_level_cycl) || (NIL != junct_list)) {
            if ((NIL != list_utilities.singletonP(junct_list_$15)) && (NIL == el_formula_p(this_arg_top_level_cycl_$16))) {
                final SubLObject output_item = junct_list_$15.first();
                final SubLObject local_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_item);
                if (NIL == local_arg_position) {
                    pph_data_structures.pph_phrase_output_item_set_cycl(output_item, this_arg_top_level_cycl_$16);
                }
            }
            junct_list = junct_list.rest();
            junct_list_$15 = junct_list.first();
            this_arg_top_level_cycl = this_arg_top_level_cycl.rest();
            this_arg_top_level_cycl_$16 = this_arg_top_level_cycl.first();
        } 
        return junct_lists;
    }

    public static SubLObject ordinal_form(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ordinal_word = ordinal_word(num, UNPROVIDED);
        final SubLObject lexified_ordinal = (NIL != pph_types.pph_lexical_wordP(ordinal_word)) ? pph_methods_lexicon.pph_first_string_of_wordXspeech_part(ordinal_word, $$OrdinalAdjective, UNPROVIDED, UNPROVIDED) : NIL;
        if (lexified_ordinal.isString()) {
            return lexified_ordinal;
        }
        SubLObject num_string = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                num_string = pph_main.pph_phrase_generate_string_from_cycl(num, $list51, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return cconcatenate(num_string, english_ordinal_suffix(num));
        }
        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str52$Can_t_generate_ordinal_form_of__S, num, pph_vars.$pph_language_mt$.getDynamicValue(thread));
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return num_string;
    }

    public static SubLObject ordinal_word(final SubLObject num, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject wu = NIL;
        if (num.isNumber() && (NIL == wu)) {
            SubLObject csome_list_var;
            SubLObject v_bindings;
            for (csome_list_var = pph_utilities.pph_ask_bindings(list($$denotation, $sym62$_WU, $$OrdinalAdjective, $sym64$_SENSE, num), mt, UNPROVIDED, UNPROVIDED), v_bindings = NIL, v_bindings = csome_list_var.first(); (NIL == wu) && (NIL != csome_list_var); wu = bindings.variable_lookup($sym62$_WU, v_bindings) , csome_list_var = csome_list_var.rest() , v_bindings = csome_list_var.first()) {
            }
        }
        return wu;
    }

    public static SubLObject english_ordinal_suffix(SubLObject num) {
        if (num.isNumber()) {
            num = mod(num, $int$100);
        }
        if (num.equal(ONE_INTEGER)) {
            return $$$st;
        }
        if (num.equal(TWO_INTEGER)) {
            return $$$nd;
        }
        if (num.equal(THREE_INTEGER)) {
            return $$$rd;
        }
        if ((!num.isNumber()) || num.numLE(TWENTY_INTEGER)) {
            return $$$th;
        }
        if (num.isNumber()) {
            return english_ordinal_suffix(mod(num, TEN_INTEGER));
        }
        return $$$th;
    }

    public static SubLObject generate_nth_expr(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_operator(v_object);
        final SubLObject arg1_string = pph_main.pph_phrase_generate_string_from_cycl(cycl_utilities.formula_arg1(v_object, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(v_object, UNPROVIDED);
        final SubLObject arg2_string = (arg2.eql(ONE_INTEGER)) ? string_utilities.$empty_string$.getGlobalValue() : arg2.isInteger() ? ordinal_form(arg2) : pph_main.pph_phrase_generate_string_from_cycl(arg2, UNPROVIDED, UNPROVIDED);
        SubLObject est_string = (pred.eql($$nthLargestElement)) ? $$$largest : $$$smallest;
        final SubLObject qualified_est_string = (NIL != Strings.stringE(arg2_string, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? est_string : pph_string.pph_bunge(list(arg2_string, est_string));
        final SubLObject arg3 = cycl_utilities.formula_arg3(v_object, UNPROVIDED);
        final SubLObject arg3_string = (NIL != fort_types_interface.collection_in_any_mtP(arg3)) ? pph_string.pph_bunge(list($$$all, pph_main.pph_phrase_generate_string_from_cycl(arg3, $list77, UNPROVIDED))) : pph_main.pph_phrase_generate_string_from_cycl(arg3, UNPROVIDED, UNPROVIDED);
        final SubLObject arg4_string = pph_main.pph_phrase_generate_string_from_cycl(cycl_utilities.formula_arg4(v_object, UNPROVIDED), $list78, UNPROVIDED);
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            est_string = pph_html.string_term_anchor(est_string, pred);
        }
        pph_phrase.pph_phrase_set_string(phrase, pph_string.pph_bunge(list(arg1_string, $$$has_the, qualified_est_string, arg4_string, $$$of, arg3_string)));
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_atomic_formula(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase))) {
            Errors.error($str85$GENERATE_ATOMIC_FORMULA_called_on, phrase);
        }
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if (NIL == formula_with_sequence_termP(formula)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$18 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    try {
                        thread.resetMultipleValues();
                        final SubLObject output_list = do_generate_atomic_formula(phrase);
                        final SubLObject assertion_used = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (pph_phrase.pph_phrase_dtr_count(phrase).isPositive()) {
                            pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                        }
                        if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                            pph_phrase.pph_phrase_set_output_list_with_map(phrase, output_list);
                            if (NIL == pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase.pph_phrase_agr(phrase))) {
                                pph_phrase.pph_phrase_increment_top_level_demerits(phrase, TWO_INTEGER, $GENERATE_ATOMIC_FORMULA_WITH_AGR);
                            }
                            pph_phrase.pph_phrase_note_done(phrase);
                            if (NIL != assertion_used) {
                                pph_phrase.pph_phrase_add_justification(phrase, assertion_used);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                } finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$18, thread);
                }
            } finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject do_generate_atomic_formula(final SubLObject phrase) {
        SubLObject ans = NIL;
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject gen_template_as = NIL;
        if (NIL == pph_types.pph_formulaP(formula)) {
            return NIL;
        }
        final SubLObject reln = function_terms.naut_to_nart(cycl_utilities.formula_operator(formula));
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject nl_preds_for_formula = pph_utilities.pph_default_nl_preds_for_term(formula);
        final SubLObject nl_preds = pph_utilities.pph_filter_preds(nl_preds_for_formula, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED);
        if (NIL != nl_preds) {
            gen_template_as = get_best_generation_template_as(reln, args);
            if (NIL != gen_template_as) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str90$__Using_template_assertion___S___, gen_template_as, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                ans = generate_atomic_formula_from_genformat(formula, gen_template_as, nl_preds, NIL, pph_utilities.pph_new_identity_map(), phrase);
            }
        }
        return values(ans, $FAILURE == ans ? NIL : gen_template_as);
    }

    public static SubLObject generate_all_phrases_for_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_types.pph_formulaP(formula)) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind($TEXT, thread);
            final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
            final SubLObject gen_template_as_list = get_generation_template_as_list(reln, args, UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                try {
                    SubLObject cdolist_list_var = gen_template_as_list;
                    SubLObject as = NIL;
                    as = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject olist = generate_atomic_formula_from_genformat(formula, as, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != olist) {
                            ans = cons(list(pph_phrase.pph_phrase_output_list_string(olist, NIL), as), ans);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        as = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            } finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$20, thread);
            }
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        return reverse(ans);
    }

    public static SubLObject genformat_assertion_fits_formulaP(final SubLObject gen_template_as, final SubLObject formula, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = T;
        thread.resetMultipleValues();
        final SubLObject format_string = get_genformat_string_and_list(gen_template_as);
        SubLObject arg_order_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (format_string.isString()) {
            arg_order_list = regularize_genformat_arglist(arg_order_list, formula_arity(formula, $REGULARIZE));
            SubLObject badP = NIL;
            SubLObject argnum = ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            SubLObject agr_preds;
            SubLObject arg_preds;
            SubLObject unified_agr_preds;
            for (rest = NIL, rest = args; (NIL == badP) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                argnum = add(argnum, ONE_INTEGER);
                agr_preds = $ANY;
                arg_preds = pph_agr_preds_for_cycl(arg);
                unified_agr_preds = pph_utilities.pph_filter_preds(agr_preds, arg_preds, UNPROVIDED);
                if (NIL == unified_agr_preds) {
                    badP = T;
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str97$Can_t_use__S_with__S, gen_template_as, formula);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                }
            }
            if (NIL != badP) {
                ans = NIL;
            }
        }
        return ans;
    }

    public static SubLObject pph_agr_preds_for_cycl(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = $ANY;
        if (NIL != pph_types.pph_phrase_nautP(cycl)) {
            final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                try {
                    final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(cycl, pph_utilities.pph_new_empty_map(), UNPROVIDED);
                    preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            } finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
            }
        }
        return preds;
    }

    public static SubLObject generate_atomic_formula_from_genformat(final SubLObject formula, final SubLObject gen_template_as, SubLObject nl_preds, SubLObject determiner, SubLObject arg_position_map, SubLObject phrase) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (determiner == UNPROVIDED) {
            determiner = NIL;
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        thread.resetMultipleValues();
        final SubLObject format_string = get_genformat_string_and_list(gen_template_as);
        final SubLObject arg_order_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ans = generate_atomic_formula_from_format_string_and_arg_order_list(formula, format_string, arg_order_list, arg_position_map, phrase);
        return pph_utilities.pph_add_determiner(determiner, ans, UNPROVIDED);
    }

    public static SubLObject generate_atomic_formula_from_format_string_and_arg_order_list(final SubLObject formula, final SubLObject format_string, final SubLObject arg_order_list, final SubLObject arg_position_map, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (NIL == format_string) {
            final SubLObject string = princ_to_string(map_formula_args(PPH_PHRASE_GENERATE_STRING_FROM_CYCL, formula, UNPROVIDED));
            return pph_phrase.new_pph_phrase_output_list(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject reln = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(formula, formula, $list98);
        reln = formula.first();
        final SubLObject current = args = formula.rest();
        final SubLObject output_lists = process_genformat_arglist(formula, reln, args, arg_order_list, arg_position_map, phrase);
        if (NIL != list_utilities.tree_find($FAILURE, output_lists, UNPROVIDED, UNPROVIDED)) {
            return $FAILURE;
        }
        return pph_output_list_from_format_string_and_args(format_string, reln, output_lists, arg_position_map);
    }

    public static SubLObject pph_output_list_from_format_string_and_args(final SubLObject format_string, final SubLObject reln, SubLObject output_lists, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        SubLObject items = NIL;
        final SubLObject arg0_position = pph_utilities.pph_arg_position_lookup($list100, arg_position_map);
        SubLObject arg0_strings = NIL;
        SubLObject cdolist_list_var = string_utilities.string_tokenize(format_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject squiggle_count = count(CHAR_tilde, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != subl_promotions.positive_integer_p(squiggle_count)) {
                if (NIL != arg0_strings) {
                    items = cons(pph_phrase_resolution.pph_phrase_arg0_item(reln, arg0_strings, arg0_position), items);
                    arg0_strings = NIL;
                }
                SubLObject strings = string_utilities.string_tokenize(string, $list101, NIL, T, T, UNPROVIDED, UNPROVIDED);
                SubLObject pre_squiggle_string = NIL;
                SubLObject post_squiggleP = NIL;
                SubLObject substring = NIL;
                substring = strings.first();
                while (NIL != strings) {
                    strings = strings.rest();
                    if ((NIL != Strings.stringE(substring, $str102$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != strings)) {
                        SubLObject cdolist_list_var_$23 = output_lists.first();
                        SubLObject output_item = NIL;
                        output_item = cdolist_list_var_$23.first();
                        while (NIL != cdolist_list_var_$23) {
                            if (NIL != pre_squiggle_string) {
                                pph_data_structures.pph_phrase_output_item_prefix_string(output_item, pre_squiggle_string);
                                pre_squiggle_string = NIL;
                            }
                            items = cons(output_item, items);
                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                            output_item = cdolist_list_var_$23.first();
                        } 
                        output_lists = output_lists.rest();
                        post_squiggleP = T;
                    } else
                        if (NIL != post_squiggleP) {
                            if (NIL != list_utilities.lengthG(substring, ONE_INTEGER, UNPROVIDED)) {
                                final SubLObject decapitated_string = subseq(substring, ONE_INTEGER, UNPROVIDED);
                                final SubLObject top_item = items.first();
                                pph_data_structures.pph_phrase_output_item_suffix_string(top_item, decapitated_string);
                            }
                            post_squiggleP = NIL;
                        } else {
                            pre_squiggle_string = substring;
                        }

                    substring = strings.first();
                } 
            } else {
                arg0_strings = cons(string, arg0_strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        if (NIL != arg0_strings) {
            items = cons(pph_phrase_resolution.pph_phrase_arg0_item(reln, arg0_strings, arg0_position), items);
        }
        return nreverse(items);
    }

    public static SubLObject get_list_from_formula(final SubLObject formula, final SubLObject arg_pos) {
        SubLObject list = cycl_utilities.formula_arg(formula, arg_pos, UNPROVIDED);
        if (((NIL == $pph_allow_subl_listsP$.getGlobalValue()) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == el_list_p(list))) {
            throw new AssertionError(list);
        }
        if (NIL != el_list_p(list)) {
            list = el_list_to_subl_list_recursively(list);
        }
        return list;
    }

    public static SubLObject get_genformat_string_and_list(final SubLObject as) {
        if (NIL == assertions_high.gaf_assertionP(as)) {
            return NIL;
        }
        return get_genformat_string_and_list_from_formula(assertions_high.gaf_formula(as));
    }

    public static SubLObject get_genformat_string_and_list_from_formula(final SubLObject gaf_formula) {
        if (NIL == el_formula_p(gaf_formula)) {
            return NIL;
        }
        final SubLObject pred = cycl_utilities.formula_operator(gaf_formula);
        if (NIL != member(pred, list($$genFormat, $$genFormat_Precise, $$genFormat_NP), UNPROVIDED, UNPROVIDED)) {
            return values(cycl_utilities.formula_arg2(gaf_formula, UNPROVIDED), get_list_from_formula(gaf_formula, THREE_INTEGER));
        }
        if (pred.eql($$genQuestion)) {
            return values(cycl_utilities.formula_arg3(gaf_formula, UNPROVIDED), get_list_from_formula(gaf_formula, FOUR_INTEGER));
        }
        if (pred.eql($$genFormat_ArgFixed)) {
            return values(cycl_utilities.formula_arg4(gaf_formula, UNPROVIDED), get_list_from_formula(gaf_formula, FIVE_INTEGER));
        }
        return NIL;
    }

    public static SubLObject get_best_generation_template_as(final SubLObject relation, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return get_generation_template_as_list(relation, args, T).first();
    }

    public static SubLObject get_generation_template_as_list(final SubLObject relation, SubLObject args, SubLObject best_onlyP) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_limit = pph_utilities.pph_search_limit();
        SubLObject ans = get_generation_template_as_list_for_relation_only(relation, args, best_onlyP);
        SubLObject doneP = makeBoolean((NIL != best_onlyP) && (NIL != ans));
        final SubLObject tgps = (NIL != doneP) ? NIL : pph_utilities.pph_typed_genl_preds(relation, UNPROVIDED);
        if (NIL == doneP) {
            SubLObject csome_list_var = tgps;
            SubLObject tgp = NIL;
            tgp = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                final SubLObject new_assertions = get_generation_template_as_list_for_relation_only(tgp, args, best_onlyP);
                if (NIL == doneP) {
                    SubLObject csome_list_var_$24 = new_assertions;
                    SubLObject as = NIL;
                    as = csome_list_var_$24.first();
                    while ((NIL == doneP) && (NIL != csome_list_var_$24)) {
                        ans = cons(as, ans);
                        doneP = best_onlyP;
                        csome_list_var_$24 = csome_list_var_$24.rest();
                        as = csome_list_var_$24.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                tgp = csome_list_var.first();
            } 
        }
        if (((NIL == doneP) && search_limit.isPositive()) && (NIL != fort_types_interface.predicate_in_any_mtP(relation))) {
            SubLObject search_level = ZERO_INTEGER;
            if (NIL == doneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                final SubLObject deck_type = ($BREADTH == $DEPTH) ? $STACK : $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = pph_vars.$pph_language_mt$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$25 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = $$True_JustificationTruth;
                            final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str122$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$30 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(relation, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$28 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$29 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(relation, UNPROVIDED);
                                            for (node_and_predicate_mode = list(relation, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == doneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$34 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                final SubLObject genl_pred = node_var_$34;
                                                final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    if (((NIL == inverseP) && (!genl_pred.eql(relation))) && (NIL == member(genl_pred, tgps, UNPROVIDED, UNPROVIDED))) {
                                                        final SubLObject new_assertions2 = get_generation_template_as_list_for_relation_only(genl_pred, args, best_onlyP);
                                                        if (NIL == doneP) {
                                                            SubLObject csome_list_var2 = new_assertions2;
                                                            SubLObject as2 = NIL;
                                                            as2 = csome_list_var2.first();
                                                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                                ans = cons(as2, ans);
                                                                search_level = add(search_level, ONE_INTEGER);
                                                                doneP = best_onlyP;
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                as2 = csome_list_var2.first();
                                                            } 
                                                        }
                                                    }
                                                    doneP = makeBoolean(((NIL != doneP) || (NIL != ans)) || search_level.numGE(search_limit));
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$30;
                                                    SubLObject _prev_bind_1_$30;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$31;
                                                    SubLObject iteration_state_$39;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$32;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var3;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$41;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$33;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$30 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var_$34);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$39 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$39)); iteration_state_$39 = dictionary_contents.do_dictionary_contents_next(iteration_state_$39)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$39);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == doneP) {
                                                                                                            csome_list_var3 = sol;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var3.first();
                                                                                                            while ((NIL == doneP) && (NIL != csome_list_var3)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                                                node_vars_link_node2 = csome_list_var3.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str123$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$32, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$39);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$31, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str124$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$41 = NIL, rest_$41 = new_list; (NIL == doneP) && (NIL != rest_$41); rest_$41 = rest_$41.rest()) {
                                                                        generating_fn = rest_$41.first();
                                                                        _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == doneP) {
                                                                                        csome_list_var4 = sol2;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var4.first();
                                                                                        while ((NIL == doneP) && (NIL != csome_list_var4)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                            node_vars_link_node4 = csome_list_var4.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str123$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$33, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$30, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$30, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$29, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$31, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$29, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$28, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str125$Node__a_does_not_pass_sbhl_type_t, relation, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$30, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$28, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$27, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$26, thread);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$25, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
            ans = nreverse(ans);
        }
        return ans;
    }

    public static SubLObject genformat_args_okP(final SubLObject as, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = NIL;
        thread.resetMultipleValues();
        final SubLObject string = get_genformat_string_and_list(as);
        final SubLObject list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == badP) {
            SubLObject csome_list_var = list;
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                final SubLObject arg_num = (item.isInteger()) ? item : item.isList() ? item.first() : NIL;
                badP = makeBoolean((NIL != subl_promotions.positive_integer_p(arg_num)) && (NIL == nth(number_utilities.f_1_(arg_num), args)));
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject genformat_precision_okP(final SubLObject as, SubLObject other_as) {
        if (other_as == UNPROVIDED) {
            other_as = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = NIL;
        SubLObject string_arg_count = NIL;
        thread.resetMultipleValues();
        final SubLObject string = get_genformat_string_and_list(as);
        final SubLObject list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == list) {
            string_arg_count = count(CHAR_tilde, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pph_utilities.pph_current_precision().isList() && (NIL == badP)) {
            SubLObject csome_list_var = pph_utilities.pph_current_precision();
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                final SubLObject arg_num = (item.isInteger()) ? item : item.isList() ? item.first() : NIL;
                SubLObject foundP = NIL;
                if (NIL != list) {
                    if (NIL == foundP) {
                        SubLObject csome_list_var_$44;
                        SubLObject as_item;
                        for (csome_list_var_$44 = list, as_item = NIL, as_item = csome_list_var_$44.first(); (NIL == foundP) && (NIL != csome_list_var_$44); foundP = makeBoolean(arg_num.eql(as_item) || (as_item.isList() && arg_num.eql(as_item.first()))) , csome_list_var_$44 = csome_list_var_$44.rest() , as_item = csome_list_var_$44.first()) {
                        }
                    }
                } else {
                    foundP = numLE(arg_num, string_arg_count);
                }
                badP = makeBoolean(NIL == foundP);
                if (((NIL != badP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str126$___S_not_referenced_in__S____Curr, arg_num, as, pph_utilities.pph_current_precision());
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject pph_reln_has_precise_templateP(final SubLObject reln) {
        return list_utilities.sublisp_boolean(get_genformat_as_list(reln, T, $$genFormat_Precise));
    }

    public static SubLObject get_generation_template_as_list_for_relation_only(final SubLObject relation, final SubLObject args, final SubLObject best_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject ans = NIL;
        final SubLObject precise = get_genformat_as_list(relation, NIL, $$genFormat_Precise);
        if (((NIL != pph_utilities.pph_precise_in_argP(ZERO_INTEGER)) || (NIL != find_if($sym127$PPH_UNREGISTERED_VARIABLE_, args, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == doneP)) {
            SubLObject csome_list_var = precise;
            SubLObject as = NIL;
            as = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != genformat_args_okP(as, args)) {
                    ans = cons(as, ans);
                    doneP = best_onlyP;
                }
                csome_list_var = csome_list_var.rest();
                as = csome_list_var.first();
            } 
        }
        if (NIL == doneP) {
            if ((((NIL != args) && (NIL != indexed_term_p(relation))) && (NIL == doneP)) && (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(relation, $$genFormat_ArgFixed, UNPROVIDED, UNPROVIDED))) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EVERYTHING, thread);
                    final SubLObject pred_var = $$genFormat_ArgFixed;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, NIL, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$45 = doneP;
                                    final SubLObject token_var_$46 = NIL;
                                    while (NIL == done_var_$45) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                        final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(as2));
                                        if (((NIL != valid_$47) && (NIL != genformat_args_okP(as2, args))) && (NIL != pph_utilities.genformat_arg_fixed_matches_argsP(as2, args))) {
                                            ans = cons(as2, ans);
                                            doneP = best_onlyP;
                                        }
                                        done_var_$45 = makeBoolean((NIL == valid_$47) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    }
                } finally {
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL == doneP) {
                final SubLObject gf_as = get_genformat_as_list(relation, NIL, UNPROVIDED);
                if (NIL == doneP) {
                    SubLObject csome_list_var2 = gf_as;
                    SubLObject as3 = NIL;
                    as3 = csome_list_var2.first();
                    while ((NIL == doneP) && (NIL != csome_list_var2)) {
                        if (NIL != genformat_args_okP(as3, args)) {
                            ans = cons(as3, ans);
                            doneP = best_onlyP;
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        as3 = csome_list_var2.first();
                    } 
                }
            }
            if ((NIL == ans) && (NIL == doneP)) {
                SubLObject csome_list_var = precise;
                SubLObject as = NIL;
                as = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL != genformat_args_okP(as, args)) {
                        ans = cons(as, ans);
                        doneP = best_onlyP;
                    }
                    csome_list_var = csome_list_var.rest();
                    as = csome_list_var.first();
                } 
            }
        }
        ans = remove_if($sym130$PPH_FORBIDDEN_LEXICAL_ASSERTION_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_utilities.pph_current_precision()) {
            ans = Sort.sort(ans, $sym131$GENFORMAT_PRECISION_OK_, UNPROVIDED);
        }
        return nreverse(ans);
    }

    public static SubLObject get_genformat_as_list(final SubLObject relation, SubLObject best_onlyP, SubLObject template_pred) {
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = NIL;
        }
        if (template_pred == UNPROVIDED) {
            template_pred = $$genFormat;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject doneP = NIL;
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
            format_nil.force_format(T, $str132$__Looking_for_paraphrase_template, relation, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject assertions = kb_mapping.gather_gaf_arg_index_with_predicate(relation, ONE_INTEGER, template_pred, UNPROVIDED, UNPROVIDED);
            if (NIL == assertions) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str133$__No__S_assertions_found_for__S_f, template_pred, relation, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL == doneP) {
                    SubLObject csome_list_var = assertions;
                    SubLObject as = NIL;
                    as = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        ans = cons(as, ans);
                        doneP = best_onlyP;
                        csome_list_var = csome_list_var.rest();
                        as = csome_list_var.first();
                    } 
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(ans, doneP);
    }

    public static SubLObject get_genformat_formula(final SubLObject input_formula) {
        final SubLObject relation = function_terms.naut_to_nart(cycl_utilities.formula_operator(input_formula));
        final SubLObject args = cycl_utilities.formula_args(input_formula, UNPROVIDED);
        final SubLObject as_list = get_generation_template_as_list(relation, args, T);
        final SubLObject formula = (NIL != as_list.first()) ? fi.assertion_fi_formula(as_list.first(), UNPROVIDED) : NIL;
        if (((NIL != formula) && (!cycl_utilities.formula_arg1(formula, UNPROVIDED).eql(relation))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str134$__Couldn_t_find_paraphrase_templa, relation, cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return formula;
    }

    public static SubLObject generate_genformat_arg(final SubLObject arg, SubLObject arg_order_sublist, SubLObject formula, SubLObject arg_position_map, SubLObject mother) {
        if (arg_order_sublist == UNPROVIDED) {
            arg_order_sublist = NIL;
        }
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        if (mother == UNPROVIDED) {
            mother = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str135$__Paraphrasing__S_with_sublist__S, arg, arg_order_sublist, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (!arg_order_sublist.isList()) {
            arg_order_sublist = list(arg_order_sublist);
        }
        final SubLObject number = (NIL != formula) ? cycl_utilities.formula_find_if(symbol_function(NUMBERP), formula, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject argnum = find_if(INTEGERP, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject plural_strings = list_utilities.remove_if_not(symbol_function(STRINGP), arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject connective = pph_get_connective(arg_order_sublist);
        final SubLObject arg_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(function_terms.naut_to_nart(arg), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        if (NIL != pph_phrase.pph_phrase_p(mother, UNPROVIDED)) {
            pph_phrase.pph_phrase_set_mother(arg_phrase, mother);
            pph_phrase.pph_phrase_append(arg_phrase, mother);
        }
        pph_utilities.pph_phrase_rephrase_cycl(arg_phrase, UNPROVIDED, UNPROVIDED);
        if (NIL != connective) {
            final SubLObject args = (NIL != argnum) ? nthcdr(argnum, cycl_utilities.formula_terms(formula, UNPROVIDED)) : list(arg);
            final SubLObject new_arg_order_sublist = remove_if(PPH_CONNECTIVE_P, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ans = generate_juncts_output_list(args, new_arg_order_sublist, connective, UNPROVIDED);
        } else
            if (NIL != plural_strings) {
                final SubLObject ans_string = (number.eql(ONE_INTEGER)) ? plural_strings.first() : second(plural_strings);
                ans = list(pph_data_structures.new_pph_phrase_output_item(ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                ans = generate_genformat_arg_int(arg_phrase, arg, formula, number, arg_order_sublist, pph_vars.$paraphrase_mode$.getDynamicValue(thread), pph_utilities.pph_current_precision());
                if (NIL != pph_phrase.pph_phrase_output_list_p(ans)) {
                    ans = generate_genformat_arg_finish(ans, arg_order_sublist, arg, arg_position_map);
                }
            }

        if (NIL != pph_phrase.pph_phrase_output_list_p(ans)) {
            pph_phrase.pph_phrase_set_output_list(arg_phrase, ans, UNPROVIDED);
            pph_phrase.pph_phrase_note_done(arg_phrase);
            pph_drs.pph_possibly_update_np_index(arg_phrase);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str139$__GENERATE_GENFORMAT_ARG_Result__, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return ans;
    }

    public static SubLObject pph_connective_p(final SubLObject v_object) {
        return fort_types_interface.logical_connective_p(v_object);
    }

    public static SubLObject pph_get_connective(final SubLObject arg_order_sublist) {
        return find_if(PPH_CONNECTIVE_P, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_genformat_arg_int(final SubLObject arg_phrase, final SubLObject arg, final SubLObject formula, final SubLObject number, final SubLObject x, final SubLObject mode, final SubLObject precision) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_phrase_copy = pph_phrase.pph_phrase_copy(arg_phrase, UNPROVIDED, UNPROVIDED);
        final SubLObject use_term_as_isP = pph_utilities.always_use_nameP(arg);
        assert NIL != pph_utilities.pph_precision_p(precision) : "pph_utilities.pph_precision_p(precision) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(precision) " + precision;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(precision, thread);
            if (((arg.isInteger() && (NIL != formula)) && x.first().isInteger()) && (NIL != pph_utilities.pph_arg_isaP(cycl_utilities.formula_operator(formula), x.first(), $$CycUniversalDate))) {
                pph_methods.generate_universal_date(arg_phrase_copy);
            } else
                if (((arg.isInteger() && (NIL != formula)) && x.first().isInteger()) && (NIL != pph_utilities.pph_arg_isaP(cycl_utilities.formula_operator(formula), x.first(), $$CycUniversalSecond))) {
                    pph_methods.generate_universal_second(arg_phrase_copy, UNPROVIDED);
                } else
                    if ((NIL != use_term_as_isP) && (NIL == pph_types.pph_db_fieldP(arg))) {
                        if (NIL != pph_types.pph_phrase_nautP(arg)) {
                            final SubLObject generation_result = generate_genformat_arg_int(arg_phrase, arg, formula, number, x, mode, precision);
                            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(generation_result)) {
                                pph_phrase.pph_phrase_set_output_list(arg_phrase_copy, generation_result, UNPROVIDED);
                                pph_phrase.pph_phrase_note_done(arg_phrase_copy);
                            }
                        } else {
                            final SubLObject fs_1 = $str143$__a_;
                            final SubLObject arg_string = format(NIL, fs_1, cycl_utilities.hl_to_el(arg));
                            pph_phrase.pph_phrase_set_string(arg_phrase_copy, arg_string);
                        }
                        pph_phrase.pph_phrase_maybe_add_anchor_tags(arg_phrase_copy);
                    } else {
                        final SubLObject preferred_senses = NIL;
                        final SubLObject _prev_bind_0_$49 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                        try {
                            pph_vars.$paraphrase_mode$.bind(mode, thread);
                            if ((NIL != cycl_grammar.el_variable_p(arg)) && (NIL != el_formula_p(formula))) {
                                maybe_register_var_by_arg_constraints(arg, formula);
                            }
                            if (NIL != preferred_senses) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str144$__Using_preferred_senses__S__, preferred_senses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_phrase.pph_phrase_set_agr_preds(arg_phrase_copy, preferred_senses, UNPROVIDED);
                            }
                            pph_main.pph_phrase_generate(arg_phrase_copy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$49, thread);
                        }
                    }


        } finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return NIL != pph_phrase.pph_phrase_doneP(arg_phrase_copy) ? pph_phrase.pph_phrase_output_list(arg_phrase_copy) : $FAILURE;
    }

    public static SubLObject pph_phrase_maybe_add_determiner(final SubLObject phrase, final SubLObject keys) {
        final SubLObject phrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
        final SubLObject determiner = get_determiner(keys, phrase_pred, UNPROVIDED);
        final SubLObject string = pph_phrase.pph_phrase_string(phrase, NIL);
        final SubLObject det_string = pph_utilities.select_determiner_string(determiner, string, phrase_pred);
        if (NIL != string_utilities.non_empty_stringP(det_string)) {
            final SubLObject det_item = pph_question.new_pph_phrase_filler_item(det_string);
            final SubLObject old_output_list = pph_phrase.pph_phrase_output_list(phrase);
            pph_phrase.pph_phrase_set_output_list(phrase, cons(det_item, old_output_list), UNPROVIDED);
        }
        return pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
    }

    public static SubLObject generate_genformat_arg_finish(final SubLObject output_list, final SubLObject arg_order_sublist, final SubLObject arg, final SubLObject arg_position_map) {
        final SubLObject argnum = find_if(INTEGERP, arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject arg_position_context = (NIL != argnum) ? list(argnum) : NIL;
        SubLObject new_items = NIL;
        SubLObject list_var = NIL;
        SubLObject output_item = NIL;
        SubLObject i = NIL;
        list_var = output_list;
        output_item = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , output_item = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject local_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_item);
            if ((NIL == pph_utilities.pph_unknown_arg_position_p(local_arg_position)) && (NIL == arg_finish_leave_arg_position_aloneP(output_item, arg))) {
                final SubLObject contextualized_local_arg_position = pph_utilities.pph_contextualize_arg_position(arg_position_context, local_arg_position);
                final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(contextualized_local_arg_position, arg_position_map);
                pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, global_arg_position);
            }
            if (((NIL != list_utilities.singletonP(output_list)) && (NIL != arg_position_context)) && (NIL != pph_utilities.pph_unknown_arg_position_p(local_arg_position))) {
                pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(output_item, arg);
            }
            new_items = cons(output_item, new_items);
        }
        return nreverse(new_items);
    }

    public static SubLObject pph_possessivize_output_item(final SubLObject output_item) {
        final SubLObject item_string = pph_data_structures.pph_phrase_output_item_string(output_item);
        final SubLObject proper_output_itemP = pph_data_structures.pph_phrase_output_item_p(output_item);
        final SubLObject lexical_possessive = (NIL != proper_output_itemP) ? morphology.english_lexical_possessive_version_of_string(item_string) : NIL;
        if (lexical_possessive.isString()) {
            final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(output_item);
            pph_data_structures.pph_phrase_output_item_set_string(new_item, lexical_possessive);
            return new_item;
        }
        final SubLObject agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
        final SubLObject suffix = morphology.english_possessive_suffix_for_string(item_string, agr_pred);
        return pph_data_structures.pph_phrase_output_item_suffix_string(output_item, suffix);
    }

    public static SubLObject pph_locativize_output_item(final SubLObject output_item, final SubLObject denot) {
        final SubLObject preposition = morphology.english_locative_preposition_for_denot(denot);
        return pph_data_structures.pph_phrase_output_item_prefix_string(output_item, cconcatenate(preposition, $$$_));
    }

    public static SubLObject pph_locativize_temporal_output_item(final SubLObject output_item, final SubLObject denot) {
        final SubLObject preposition = pph_english_locative_preposition_for_temporal_denot(denot);
        return pph_data_structures.pph_phrase_output_item_prefix_string(output_item, cconcatenate(preposition, $$$_));
    }

    public static SubLObject pph_english_locative_preposition_for_temporal_denot(final SubLObject date) {
        if (NIL == cycl_grammar.el_variable_p(date)) {
            final SubLObject less_than_one_dayP = pph_utilities.pph_longer_durationP($list145, list($$DurationFn, date));
            final SubLObject more_than_one_dayP = (NIL != less_than_one_dayP) ? NIL : pph_utilities.pph_longer_durationP(list($$DurationFn, date), $list145);
            if (NIL != more_than_one_dayP) {
                return $$$in;
            }
            if (NIL != less_than_one_dayP) {
                return $$$at;
            }
        }
        return $$$on;
    }

    public static SubLObject arg_finish_leave_arg_position_aloneP(final SubLObject output_item, final SubLObject arg) {
        final SubLObject item_cycl = pph_data_structures.pph_phrase_output_item_cycl(output_item);
        final SubLObject item_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_item);
        SubLObject ans = NIL;
        if (item_arg_position.equal(pph_phrase.pph_current_arg0_position()) && ((NIL == el_formula_p(arg)) || (!item_cycl.equal(cycl_utilities.formula_arg_position(arg, item_arg_position, UNPROVIDED))))) {
            ans = T;
        }
        return ans;
    }

    public static SubLObject get_determiner(final SubLObject list, SubLObject pred, SubLObject use_defaultP) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (use_defaultP == UNPROVIDED) {
            use_defaultP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject det = NIL;
        SubLObject v_case = NIL;
        SubLObject doneP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == doneP) {
                SubLObject csome_list_var = list;
                SubLObject item = NIL;
                item = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((NIL == pred) || ((NIL != forts.fort_p(item)) && (NIL != pph_utilities.pph_genl_predicateP(pred, item, UNPROVIDED)))) {
                        doneP = T;
                        det = find_if($sym150$PPH_DETERMINER_, list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        v_case = find_if($sym151$PPH_CASE_KW_, list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (item.isList()) {
                            thread.resetMultipleValues();
                            final SubLObject det_pair = get_determiner(item, pred, NIL);
                            final SubLObject successP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != successP) {
                                final SubLObject datum_evaluated_var = det_pair;
                                det = datum_evaluated_var.first();
                                v_case = cadr(datum_evaluated_var);
                                doneP = T;
                            }
                        }

                    csome_list_var = csome_list_var.rest();
                    item = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == doneP) && (NIL != use_defaultP)) {
            det = find_if($sym150$PPH_DETERMINER_, list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            v_case = find_if($sym151$PPH_CASE_KW_, list, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return values(NIL != det ? list(det, v_case) : NIL, doneP);
    }

    public static SubLObject word_sense_indicator(final SubLObject obj) {
        SubLObject ans = NIL;
        if (NIL == pph_utilities.pph_determinerP(obj)) {
            if (obj.isKeyword() || (obj.isCons() && obj.first().isKeyword())) {
                ans = obj;
            } else
                if (NIL != valid_constantP(obj, UNPROVIDED)) {
                    ans = obj;
                } else
                    if (obj.isCons() && (NIL != valid_constantP(obj.first(), UNPROVIDED))) {
                        ans = obj;
                    }


        }
        return ans;
    }

    public static SubLObject word_sense_indicators(final SubLObject list) {
        return remove(NIL, list_utilities.flatten(Mapping.mapcar(WORD_SENSE_INDICATOR, list)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_preferred_senses(final SubLObject list, SubLObject pluralizeP) {
        if (pluralizeP == UNPROVIDED) {
            pluralizeP = NIL;
        }
        SubLObject ans = word_sense_indicators(list);
        if (NIL != pluralizeP) {
            ans = append($list153, ans);
        }
        return ans;
    }

    public static SubLObject regularize_genformat_arglist(SubLObject arg_order_list, final SubLObject v_arity) {
        if (NIL == arg_order_list) {
            arg_order_list = list_utilities.num_list(v_arity, ONE_INTEGER);
        }
        if (NIL != find_if(ATOM, arg_order_list, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject new_list = copy_list(arg_order_list);
            SubLObject list_var = NIL;
            SubLObject x = NIL;
            SubLObject i = NIL;
            list_var = arg_order_list;
            x = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , x = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (x.isAtom()) {
                    set_nth(i, new_list, list(x));
                }
            }
            arg_order_list = new_list;
        }
        return arg_order_list;
    }

    public static SubLObject process_genformat_arglist(final SubLObject formula, final SubLObject pred, final SubLObject args, SubLObject arg_order_list, SubLObject arg_position_map, SubLObject phrase) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms_done = NIL;
        SubLObject indexes_done = NIL;
        SubLObject ans = NIL;
        arg_order_list = regularize_genformat_arglist(arg_order_list, formula_arity(formula, $REGULARIZE));
        SubLObject output_lists = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$50 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$51 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$52 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$53 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    SubLObject output_lists_$54 = NIL;
                                    SubLObject abortP = NIL;
                                    final SubLObject _prev_bind_0_$54 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                        pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str8$__Trying_default_precision___S___, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED);
                                        SubLObject list_var = NIL;
                                        SubLObject arg = NIL;
                                        SubLObject i = NIL;
                                        list_var = args;
                                        arg = list_var.first();
                                        for (i = ZERO_INTEGER; (NIL == abortP) && (NIL != list_var); list_var = list_var.rest() , arg = list_var.first() , i = add(ONE_INTEGER, i)) {
                                            final SubLObject olist = generate_genformat_arg_with_arg_order_list(arg, number_utilities.f_1X(i), arg_order_list, formula, arg_position_map, phrase);
                                            pph_disambiguation.note_pph_output_list_for_disambiguation(i, olist);
                                            if (NIL != pph_phrase.pph_phrase_output_list_p(olist)) {
                                                output_lists_$54 = cons(olist, output_lists_$54);
                                            } else {
                                                abortP = T;
                                            }
                                        }
                                        if (NIL != abortP) {
                                            output_lists = $FAILURE;
                                        } else {
                                            output_lists_$54 = nreverse(output_lists_$54);
                                            SubLObject cdolist_list_var;
                                            final SubLObject dupe_index_lists = cdolist_list_var = pph_disambiguation.pph_find_duplicates(output_lists_$54);
                                            SubLObject dupe_index_list = NIL;
                                            dupe_index_list = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str10$__Working_on_dupe_list___S__, dupe_index_list, UNPROVIDED, UNPROVIDED);
                                                final SubLObject dupe_objects = pph_disambiguation.pph_dereference_indexes(dupe_index_list, args);
                                                SubLObject cdolist_list_var_$56 = dupe_index_list;
                                                SubLObject j = NIL;
                                                j = cdolist_list_var_$56.first();
                                                while (NIL != cdolist_list_var_$56) {
                                                    final SubLObject arg2 = nth(j, args);
                                                    pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str11$__Trying_to_reparaphrase__S___, arg2, UNPROVIDED, UNPROVIDED);
                                                    final SubLObject new_precision = pph_utilities.pph_precision_for_object(arg2, dupe_objects);
                                                    final SubLObject new_demerit_cutoff = pph_disambiguation.pph_demerit_cutoff_from_olist(j, output_lists_$54);
                                                    SubLObject new_output_list = NIL;
                                                    if (!new_precision.equal(pph_utilities.pph_current_precision())) {
                                                        pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str12$__Trying_targeted_precision__S_fo, new_precision, arg2, UNPROVIDED);
                                                        assert NIL != pph_utilities.pph_precision_p(new_precision) : "pph_utilities.pph_precision_p(new_precision) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(new_precision) " + new_precision;
                                                        final SubLObject _prev_bind_0_$55 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$paraphrase_precision$.bind(new_precision, thread);
                                                            pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                            new_output_list = generate_genformat_arg_with_arg_order_list(arg2, number_utilities.f_1X(j), arg_order_list, formula, arg_position_map, phrase);
                                                        } finally {
                                                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                                                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$55, thread);
                                                        }
                                                        pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str14$__New_paraphrase_with_precision__, new_precision, arg2, new_output_list);
                                                    }
                                                    if (new_precision.isList() && ((NIL == new_output_list) || (NIL != pph_disambiguation.pph_output_list_E(new_output_list, nth(j, output_lists_$54))))) {
                                                        pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str15$__Trying_full_precision_for__S, arg2, UNPROVIDED, UNPROVIDED);
                                                        assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
                                                        final SubLObject _prev_bind_0_$56 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                        final SubLObject _prev_bind_3 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$paraphrase_precision$.bind(T, thread);
                                                            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                                            pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                            new_output_list = generate_genformat_arg_with_arg_order_list(arg2, number_utilities.f_1X(j), arg_order_list, formula, arg_position_map, phrase);
                                                        } finally {
                                                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_3, thread);
                                                            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
                                                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$56, thread);
                                                        }
                                                        pph_disambiguation.pph_disambiguation_note(TWO_INTEGER, $str16$__New_paraphrase_with_full_precis, arg2, new_output_list, UNPROVIDED);
                                                    }
                                                    if (NIL != pph_disambiguation.pph_new_olist_better_than_oldP(new_output_list, nth(j, output_lists_$54), arg2)) {
                                                        pph_disambiguation.pph_disambiguation_note(ONE_INTEGER, $str17$__Changing_output_list_for__S_fro, arg2, nth(j, output_lists_$54), new_output_list);
                                                        set_nth(j, output_lists_$54, new_output_list);
                                                        pph_disambiguation.note_pph_output_list_for_disambiguation(j, new_output_list);
                                                    }
                                                    cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                                                    j = cdolist_list_var_$56.first();
                                                } 
                                                cdolist_list_var = cdolist_list_var.rest();
                                                dupe_index_list = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2 = args;
                                            arg = NIL;
                                            arg = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                pph_drs.pph_possibly_add_reference_marker(arg);
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                arg = cdolist_list_var2.first();
                                            } 
                                            output_lists = append(output_lists, output_lists_$54);
                                        }
                                    } finally {
                                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_0_$54, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$53, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$52, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$51, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$50, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        if (!output_lists.isList()) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str155$__Couldn_t_paraphrase_args__S_wit, args, arg_order_list);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return $FAILURE;
        }
        output_lists = list_utilities.remove_if_not(PPH_PHRASE_OUTPUT_LIST_P, output_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject unparaphrased = list_utilities.find_if_not(symbol_function(PPH_STRING_P), output_lists, PPH_PHRASE_OUTPUT_LIST_STRING, UNPROVIDED, UNPROVIDED);
        if (NIL != unparaphrased) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str159$__Couldn_t_paraphrase__S___, unparaphrased);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return $FAILURE;
        }
        SubLObject cdolist_list_var3 = arg_order_list;
        SubLObject arg_order_sublist = NIL;
        arg_order_sublist = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            final SubLObject index = find_if(symbol_function(INTEGERP), arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_4 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
            try {
                pph_vars.$pph_introduce_anaphorsP$.bind(makeBoolean((NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread)) && (NIL == find(index, indexes_done, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), thread);
                final SubLObject arg3 = (NIL != index) ? cycl_utilities.formula_arg(formula, index, $REGULARIZE) : NIL;
                SubLObject simpler_arg = NIL;
                SubLObject keys = NIL;
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                    format_nil.force_format(T, $str160$__PROCESS_GEN_FORMAT_ARGLIST____W, arg3, terms_done, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread)) {
                    thread.resetMultipleValues();
                    final SubLObject simpler_arg_$61 = pph_introduce_anaphor(arg3, terms_done);
                    final SubLObject keys_$62 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    simpler_arg = simpler_arg_$61;
                    keys = keys_$62;
                }
                if ((NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread)) && ((!arg3.equal(simpler_arg)) || (NIL != keys))) {
                    assert NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(index, formula)) : "pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(index, formula)) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(index, formula)) " + pph_utilities.paraphrase_precision_for_arg(index, formula);
                    final SubLObject _prev_bind_0_$59 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(index, formula), thread);
                        ans = cons(generate_genformat_arg(arg3, append(keys, arg_order_sublist), formula, arg_position_map, phrase), ans);
                    } finally {
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$59, thread);
                    }
                } else
                    if (NIL != subl_promotions.positive_integer_p(index)) {
                        SubLObject output_list = pph_find_output_list_matching_arg_num(output_lists, index);
                        if (NIL != subl_promotions.memberP(output_list, ans, symbol_function(EQUAL), UNPROVIDED)) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str161$Making_copy_of_reused_output_item, output_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            output_list = Mapping.mapcar(PPH_PHRASE_OUTPUT_ITEM_COPY, output_list);
                        }
                        ans = cons(output_list, ans);
                    } else {
                        ans = cons(generate_genformat_arg(arg3, arg_order_sublist, formula, arg_position_map, phrase), ans);
                    }

                terms_done = cons(arg3, terms_done);
                if (NIL != index) {
                    indexes_done = cons(index, indexes_done);
                }
            } finally {
                pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_4, thread);
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            arg_order_sublist = cdolist_list_var3.first();
        } 
        ans = nreverse(ans);
        return ans;
    }

    public static SubLObject pph_find_output_list_matching_arg_num(final SubLObject output_lists, final SubLObject arg_num) {
        return nth(number_utilities.f_1_(arg_num), output_lists);
    }

    public static SubLObject generate_genformat_arg_with_arg_order_list(final SubLObject arg, final SubLObject i, final SubLObject arg_order_list, final SubLObject formula, SubLObject arg_position_map, SubLObject phrase) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((((NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) && pph_vars.current_generation_level().isPositive()) && (!pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).equal(pph_vars.pph_top_level_cycl()))) && (NIL == pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(phrase), UNPROVIDED))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str163$Generating_with___genFormat_for_m, phrase);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        final SubLObject sublist = assoc(i, arg_order_list, UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        assert NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(i, formula)) : "pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(i, formula)) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(i, formula)) " + pph_utilities.paraphrase_precision_for_arg(i, formula);
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(i, formula), thread);
            ans = (NIL != sublist) ? generate_genformat_arg(arg, sublist, formula, arg_position_map, phrase) : NIL;
        } finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return NIL != pph_phrase.pph_phrase_output_list_p(ans) ? ans : NIL;
    }

    public static SubLObject pph_introduce_anaphor(final SubLObject arg, final SubLObject terms_done) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simpler = NIL;
        SubLObject keys = NIL;
        if (NIL != el_formula_with_operator_p(arg, $$TheInstance)) {
            final SubLObject col = cycl_utilities.formula_arg1(arg, UNPROVIDED);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (((NIL != el_formula_with_operator_p(col, $$SubcollectionOfWithRelationFromFn)) && (NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg2(col, UNPROVIDED), $$possessiveRelation, UNPROVIDED))) && (NIL == simpler)) {
                    SubLObject csome_list_var = terms_done;
                    SubLObject done_term = NIL;
                    done_term = csome_list_var.first();
                    while ((NIL == simpler) && (NIL != csome_list_var)) {
                        if (done_term.equalp(cycl_utilities.formula_arg3(col, UNPROVIDED))) {
                            final SubLObject gender = pph_methods.pph_gender(done_term);
                            final SubLObject number = pph_methods.pph_number(done_term);
                            final SubLObject pronoun = pph_poss_pronoun(gender, number);
                            simpler = cycl_utilities.formula_arg1(col, UNPROVIDED);
                            keys = list($NON_PLURAL_GENERIC, pronoun);
                        }
                        csome_list_var = csome_list_var.rest();
                        done_term = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != el_formula_with_operator_p(arg, $$SomeFn)) {
                final SubLObject col = cycl_utilities.formula_arg1(arg, UNPROVIDED);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if ((NIL != el_formula_with_operator_p(col, $$SubcollectionOfWithRelationFromFn)) && (NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg2(col, UNPROVIDED), $$possessiveRelation, UNPROVIDED))) {
                        final SubLObject possessor = cycl_utilities.formula_arg3(col, UNPROVIDED);
                        if (NIL == simpler) {
                            SubLObject csome_list_var2 = terms_done;
                            SubLObject done_term2 = NIL;
                            done_term2 = csome_list_var2.first();
                            while ((NIL == simpler) && (NIL != csome_list_var2)) {
                                if ((NIL != el_formula_with_operator_p(done_term2, $$SomeFn)) && (NIL != pph_utilities.pph_isaP(possessor, cycl_utilities.formula_arg1(done_term2, UNPROVIDED), UNPROVIDED))) {
                                    simpler = cycl_utilities.formula_arg1(col, UNPROVIDED);
                                    keys = $list169;
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                done_term2 = csome_list_var2.first();
                            } 
                        }
                    } else
                        if (NIL == simpler) {
                            SubLObject csome_list_var = terms_done;
                            SubLObject done_term = NIL;
                            done_term = csome_list_var.first();
                            while ((NIL == simpler) && (NIL != csome_list_var)) {
                                if ((NIL != el_formula_with_operator_p(done_term, $$TheInstance)) && (NIL != pph_utilities.pph_isaP(done_term, col, UNPROVIDED))) {
                                    simpler = col;
                                    keys = $list170;
                                }
                                csome_list_var = csome_list_var.rest();
                                done_term = csome_list_var.first();
                            } 
                        }

                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else
                if ((NIL == pph_utilities.pph_collectionP(arg)) && terms_done.equalp(list(arg))) {
                    final SubLObject gender2 = pph_methods.pph_gender(arg);
                    final SubLObject number2 = pph_methods.pph_number(arg);
                    simpler = pph_reflexive_string(gender2, number2);
                }


        return NIL != simpler ? values(simpler, keys) : values(arg, NIL);
    }

    public static SubLObject pph_reflexive_string(final SubLObject gender, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pronoun_agr = pph_methods_lexicon.new_pph_pronoun_agr($$ThirdPerson_NLAttr, number, gender);
        final SubLObject pronoun_nart = pph_methods_lexicon.pph_pronoun_nart(pronoun_agr, $$ReflexivePronoun);
        SubLObject ans = NIL;
        SubLObject wu = NIL;
        if (NIL != indexed_term_p(pronoun_nart)) {
            wu = pph_methods_lexicon.pph_pronoun_wu(pronoun_nart);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = (NIL != wu) ? pph_methods_lexicon.pph_get_strings_of_type(wu, $$ReflexivePronoun).first() : NIL;
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject pph_poss_pronoun(final SubLObject gender, final SubLObject number) {
        SubLObject ans = NIL;
        final SubLObject pronoun_agr = pph_methods_lexicon.new_pph_pronoun_agr($$ThirdPerson_NLAttr, number, gender);
        final SubLObject pronoun_nart = pph_methods_lexicon.pph_pronoun_nart(pronoun_agr, $$ReflexivePronoun);
        ans = pph_methods_lexicon.pph_pronoun_wu(pronoun_nart);
        return ans;
    }

    public static SubLObject generate_date_naut(final SubLObject phrase) {
        final SubLObject date_naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if (NIL != pph_date_naut_ok_for_generate_date_naut_p(date_naut)) {
            SubLObject olist = NIL;
            if (NIL != pph_types.pph_time_p(date_naut)) {
                olist = pph_time_naut_olist(date_naut, pph_phrase.pph_phrase_arg_position_map(phrase));
                if (NIL != date_utilities.date_p(date_naut)) {
                    if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
                        olist = list_utilities.add_to_end(pph_data_structures.new_pph_phrase_output_item($$$on, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), olist);
                    } else {
                        olist = pph_phrase_output_list_add_comma(olist);
                    }
                }
            }
            final SubLObject day_naut_template = pph_date_naut_strip_time(date_naut);
            pph_phrase.pph_phrase_reset_cycl(phrase, day_naut_template);
            olist = append(olist, pph_date_phrase_olist(phrase));
            pph_phrase.pph_phrase_set_cycl(phrase, date_naut);
            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_english_year_naut(final SubLObject phrase) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject arg_position = pph_utilities.pph_top_level_arg_position(pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject olist = generate_english_year_olist(cycl, arg_position);
            pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_english_year_olist(final SubLObject year_naut, final SubLObject arg_position) {
        final SubLObject year = cycl_utilities.nat_arg1(year_naut, UNPROVIDED);
        SubLObject string = princ_to_string(year);
        if (NIL != pph_utilities.pph_top_level_preciseP()) {
            string = pph_date_add_english_disambiguation_string(string, $YEAR);
        }
        final SubLObject olist = list(pph_data_structures.new_pph_phrase_output_item(string, arg_position, year_naut, NIL, NIL, NIL));
        return olist;
    }

    public static SubLObject generate_english_month_naut(final SubLObject phrase) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject month_arg_position = pph_utilities.pph_arg_position_lookup($list180, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject month = cycl_utilities.nat_arg1(cycl, UNPROVIDED);
            final SubLObject year_naut = cycl_utilities.nat_arg2(cycl, UNPROVIDED);
            final SubLObject year_arg_position = pph_utilities.pph_arg_position_lookup($list181, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject olist = generate_english_month_olist(month, month_arg_position, year_naut, year_arg_position);
            pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_english_month_name(final SubLObject month) {
        return list_utilities.alist_lookup_without_values($pph_english_month_names$.getGlobalValue(), month, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_english_month_olist(final SubLObject month, final SubLObject month_arg_position, final SubLObject year_naut, final SubLObject year_arg_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = pph_english_month_name(month);
        SubLObject year_olist = NIL;
        if (NIL != pph_utilities.pph_top_level_preciseP()) {
            string = pph_date_add_english_disambiguation_string(string, $MONTH);
        }
        assert NIL != pph_utilities.pph_precision_p(NIL) : "pph_utilities.pph_precision_p(CommonSymbols.NIL) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.NIL) " + NIL;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(NIL, thread);
            year_olist = generate_english_year_olist(year_naut, year_arg_position);
        } finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        final SubLObject olist = cons(pph_data_structures.new_pph_phrase_output_item(string, month_arg_position, month, NIL, NIL, NIL), year_olist);
        return olist;
    }

    public static SubLObject generate_english_day_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if ((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && ((NIL == pph_vars.$pph_use_indexical_datesP$.getDynamicValue(thread)) || (!cycl.equal(date_utilities.indexical_today())))) {
            final SubLObject day_arg_position = pph_utilities.pph_arg_position_lookup($list180, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject day = cycl_utilities.nat_arg1(cycl, UNPROVIDED);
            final SubLObject month = cycl_utilities.nat_arg1(cycl_utilities.nat_arg2(cycl, UNPROVIDED), UNPROVIDED);
            final SubLObject month_arg_position = pph_utilities.pph_arg_position_lookup($list186, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject year_naut = cycl_utilities.nat_arg2(cycl_utilities.nat_arg2(cycl, UNPROVIDED), UNPROVIDED);
            final SubLObject year_arg_position = pph_utilities.pph_arg_position_lookup($list187, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject olist = generate_english_day_olist(day, day_arg_position, month, month_arg_position, year_naut, year_arg_position);
            pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_english_day_olist(final SubLObject day, final SubLObject day_arg_position, final SubLObject month, final SubLObject month_arg_position, final SubLObject year_naut, final SubLObject year_arg_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject day_string = princ_to_string(day);
        final SubLObject month_string = pph_english_month_name(month);
        SubLObject year_olist = NIL;
        assert NIL != pph_utilities.pph_precision_p(NIL) : "pph_utilities.pph_precision_p(CommonSymbols.NIL) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.NIL) " + NIL;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(NIL, thread);
            year_olist = generate_english_year_olist(year_naut, year_arg_position);
        } finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        SubLObject olist = append(list(pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(pph_data_structures.new_pph_phrase_output_item(month_string, month_arg_position, month, NIL, NIL, NIL), month), pph_data_structures.new_pph_phrase_output_item(day_string, day_arg_position, day, NIL, NIL, NIL), pph_comma_item()), year_olist);
        if (NIL != pph_utilities.pph_top_level_preciseP()) {
            final SubLObject disambiguation_string = pph_english_date_disambiguation_string($DAY);
            if (NIL != string_utilities.non_empty_string_p(disambiguation_string)) {
                olist = cons(pph_question.new_pph_phrase_filler_item(disambiguation_string), olist);
            }
        }
        return olist;
    }

    public static SubLObject pph_date_phrase_olist(final SubLObject phrase) {
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject olist = NIL;
        final SubLObject info = pph_types.pph_method_info(GENERATE_DATE_NAUT, NIL);
        pph_types.pph_deregister_method_info(GENERATE_DATE_NAUT, info);
        try {
            pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                pph_types.pph_register_method_info(GENERATE_DATE_NAUT, info);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        $pph_dates$.setGlobalValue(cons(cycl, $pph_dates$.getGlobalValue()));
        olist = pph_phrase.pph_phrase_output_list(phrase);
        return olist;
    }

    public static SubLObject pph_date_naut_ok_for_generate_date_naut_p(final SubLObject date_naut) {
        if (NIL != member(cycl_utilities.nat_functor(date_naut), $list189, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == groundP(date_naut, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_time_naut_olist(final SubLObject date_naut, final SubLObject map) {
        final SubLObject time_phrase = pph_phrase.new_pph_phrase_for_cycl(date_naut, map, UNPROVIDED);
        final SubLObject precision = pph_date_precision(date_naut);
        return generate_time_naut_millisecond(time_phrase, precision);
    }

    public static SubLObject pph_time_output_item(final SubLObject num, final SubLObject argpos) {
        return pph_data_structures.new_pph_phrase_output_item(format(NIL, $str190$_2__0D, num), argpos, num, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_defining_time_unit(final SubLObject interval_type) {
        SubLObject unit = date_utilities.defining_time_unit(interval_type);
        if ((NIL == unit) && interval_type.eql($$CalendarMilliSecond)) {
            unit = $$MillisecondsDuration;
        }
        return unit;
    }

    public static SubLObject pph_smaller_interval_type_than(final SubLObject type1, final SubLObject type2) {
        final SubLObject unit1 = pph_defining_time_unit(type1);
        final SubLObject unit2 = pph_defining_time_unit(type2);
        return makeBoolean(((NIL != unit1) && (NIL != unit2)) && (NIL != quantities.smaller_unit_than(unit1, unit2)));
    }

    public static SubLObject generate_time_naut_millisecond_internal(final SubLObject time, SubLObject precision, SubLObject map) {
        if (precision == UNPROVIDED) {
            precision = $$CalendarMilliSecond;
        }
        if (map == UNPROVIDED) {
            map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject olist = NIL;
        SubLObject granularity = ZERO_INTEGER;
        SubLObject argpos = pph_utilities.pph_arg_position_lookup(pph_utilities.pph_arg_position_from_template($ARG1), map);
        thread.resetMultipleValues();
        final SubLObject time_type = date_utilities.explode_calendar_time(time);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        SubLObject min = thread.sixthMultipleValue();
        SubLObject sec = thread.seventhMultipleValue();
        SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != millisec) {
            granularity = THREE_INTEGER;
        } else
            if (NIL != sec) {
                granularity = TWO_INTEGER;
                millisec = ZERO_INTEGER;
            } else
                if (NIL != min) {
                    granularity = ONE_INTEGER;
                    sec = ZERO_INTEGER;
                    millisec = ZERO_INTEGER;
                } else {
                    granularity = ZERO_INTEGER;
                    min = ZERO_INTEGER;
                    sec = ZERO_INTEGER;
                    millisec = ZERO_INTEGER;
                }


        if (NIL != pph_smaller_interval_type_than(precision, $$CalendarSecond)) {
            olist = cons(pph_time_output_item(format(NIL, $str195$_3__0D, millisec), granularity.numGE(THREE_INTEGER) ? argpos : pph_utilities.pph_unknown_arg_position()), olist);
            olist = cons(pph_question.new_pph_phrase_filler_item($str44$_), olist);
        }
        if (granularity.numGE(THREE_INTEGER)) {
            argpos = pph_utilities.pph_contextualize_arg_position(pph_utilities.pph_arg_position_from_template($ARG2), argpos);
        }
        if (NIL != pph_smaller_interval_type_than(precision, $$CalendarMinute)) {
            olist = cons(pph_time_output_item(sec, granularity.numGE(TWO_INTEGER) ? argpos : pph_utilities.pph_unknown_arg_position()), olist);
            olist = cons(pph_question.new_pph_phrase_filler_item($str198$_), olist);
        }
        if (granularity.numGE(TWO_INTEGER)) {
            argpos = pph_utilities.pph_contextualize_arg_position(pph_utilities.pph_arg_position_from_template($ARG2), argpos);
        }
        olist = cons(pph_time_output_item(min, granularity.numGE(ONE_INTEGER) ? argpos : pph_utilities.pph_unknown_arg_position()), olist);
        olist = cons(pph_question.new_pph_phrase_filler_item($str198$_), olist);
        if (granularity.numGE(ONE_INTEGER)) {
            argpos = pph_utilities.pph_contextualize_arg_position(pph_utilities.pph_arg_position_from_template($ARG2), argpos);
        }
        olist = cons(pph_time_output_item(hour, argpos), olist);
        return list(pph_data_structures.new_pph_phrase_output_item_nospace_group(olist));
    }

    public static SubLObject generate_time_naut_millisecond(final SubLObject phrase, SubLObject precision) {
        if (precision == UNPROVIDED) {
            precision = $$CalendarMilliSecond;
        }
        return generate_time_naut_millisecond_internal(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), precision, pph_phrase.pph_phrase_arg_position_map(phrase));
    }

    public static SubLObject pph_date_precision(final SubLObject date_naut) {
        if (NIL != date_utilities.date_p(date_naut)) {
            return date_utilities.date_precision(date_naut);
        }
        return pph_date_precision_for_fn(cycl_utilities.nat_functor(date_naut));
    }

    public static SubLObject pph_date_precision_for_fn(final SubLObject fn) {
        return pph_utilities.pph_ask_variable($sym199$_PRECISION, listS($$and, listS($$resultIsa, fn, $list202), $list203), $$BaseKB, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject pph_date_naut_strip_time(SubLObject date_naut) {
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            if (NIL == narts_high.naut_p(date_naut)) {
                doneP = T;
            } else
                if (NIL != pph_types.pph_time_p(date_naut)) {
                    template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, template);
                    date_naut = cycl_utilities.formula_arg2(date_naut, UNPROVIDED);
                } else {
                    doneP = T;
                }

        } 
        return template;
    }

    public static SubLObject pph_english_date_disambiguation_string(final SubLObject type) {
        return getf($pph_english_date_disambiguation_strings$.getGlobalValue(), type, string_utilities.$empty_string$.getGlobalValue());
    }

    public static SubLObject pph_date_add_english_disambiguation_string(final SubLObject date_string, final SubLObject type) {
        final SubLObject disambiguation_string = pph_english_date_disambiguation_string(type);
        return cconcatenate(disambiguation_string, date_string);
    }

    public static SubLObject generate_nl_tagged_term(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_phrase.pph_phrase_set_agr_pred(phrase, $$nounStrings, UNPROVIDED);
        pph_macros.clear_pph_suspended_methods_for_cycl(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        final SubLObject info = pph_types.pph_method_info(GENERATE_NL_TAGGED_TERM, NIL);
        pph_types.pph_deregister_method_info(GENERATE_NL_TAGGED_TERM, info);
        try {
            final SubLObject top_levelP = pph_macros.handling_pph_method_failures_top_level_p();
            final SubLObject _prev_bind_0 = pph_macros.$suspended_paraphrase_methods$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$handling_pph_method_failuresP$.currentBinding(thread);
            try {
                pph_macros.$suspended_paraphrase_methods$.bind(NIL != top_levelP ? set.new_set(symbol_function(EQUAL), pph_macros.max_suspended_method_depth()) : pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                pph_macros.$handling_pph_method_failuresP$.bind(T, thread);
                for (SubLObject failed_method = NIL, tried_oneP = NIL; (NIL != failed_method) || (NIL == tried_oneP); tried_oneP = T) {
                    if (NIL != failed_method) {
                        pph_macros.note_suspended_paraphrase_method_plist(failed_method);
                        failed_method = NIL;
                    }
                    try {
                        thread.throwStack.push($PPH_METHOD_FAILURE);
                        pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } catch (final Throwable ccatch_env_var) {
                        failed_method = Errors.handleThrowable(ccatch_env_var, $PPH_METHOD_FAILURE);
                    } finally {
                        thread.throwStack.pop();
                    }
                }
            } finally {
                pph_macros.$handling_pph_method_failuresP$.rebind(_prev_bind_2, thread);
                pph_macros.$suspended_paraphrase_methods$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                pph_types.pph_register_method_info(GENERATE_NL_TAGGED_TERM, info);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_maybe_add_gaf_to_top_20(final SubLObject gaf_sentence, final SubLObject nl_preds, final SubLObject time) {
        return NIL;
    }

    public static SubLObject generate_phrase_from_template(final SubLObject original_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != pph_phrase.pph_phrase_has_dtrsP(original_phrase))) {
            Errors.error($str211$GENERATE_PHRASE_FROM_TEMPLATE_cal, original_phrase);
        }
        final SubLObject formula = pph_phrase.pph_phrase_cycl(original_phrase, UNPROVIDED);
        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(original_phrase);
        if ((NIL == formula_with_sequence_termP(formula)) && (NIL == el_universal_p(formula))) {
            SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(original_phrase, UNPROVIDED);
            final SubLObject focus_arg = pph_phrase.pph_phrase_focus_arg(original_phrase);
            final SubLObject keep_existing_arg0P = pph_phrase.pph_current_arg0_specified_p();
            final SubLObject new_arg0 = (NIL != keep_existing_arg0P) ? pph_vars.$pph_current_arg0$.getDynamicValue(thread) : cycl_utilities.formula_arg0(formula);
            SubLObject tried_anyP = NIL;
            SubLObject doneP = NIL;
            SubLObject alternative_count = ZERO_INTEGER;
            SubLObject time = ZERO_INTEGER;
            agr_preds = pph_methods.pph_revised_nl_preds_for_phrase(original_phrase, agr_preds);
            final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0$.bind(NIL != pph_macros.pph_ok_arg0_for_linkingP(new_arg0) ? new_arg0 : $UNSPECIFIED, thread);
                final SubLObject time_var = get_internal_real_time();
                final SubLObject _prev_bind_0_$64 = pph_vars.$pph_search_limit$.currentBinding(thread);
                try {
                    pph_vars.$pph_search_limit$.bind(NIL != pph_vars.pph_inside_downward_entailing_environmentP() ? ZERO_INTEGER : pph_vars.$pph_search_limit$.getDynamicValue(thread), thread);
                    final SubLObject generator = pph_data_structures.get_pph_phrase_template_generator(formula, focus_arg, NIL, agr_preds, arg_position_map, UNPROVIDED);
                    while ((NIL == doneP) && (NIL == pph_data_structures.pph_phrase_template_generator_done_p(generator))) {
                        thread.resetMultipleValues();
                        final SubLObject phrase_template = pph_templates.pph_phrase_template_generator_next(generator);
                        final SubLObject ignore_me = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != pph_phrase.pph_phrase_p(phrase_template, UNPROVIDED)) {
                            final SubLObject best_phrase = pph_templates.pph_customize_template_macro_helper(phrase_template, formula, arg_position_map, agr_preds);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str213$__GENERATE_PHRASE_FROM_TEMPLATE_t, best_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            final SubLObject phrase = (NIL != pph_vars.pph_generate_alternative_phrasesP()) ? pph_phrase.pph_phrase_copy(original_phrase, UNPROVIDED, UNPROVIDED) : original_phrase;
                            pph_phrase.pph_phrase_sanity_check_cycl(best_phrase);
                            final SubLObject _prev_bind_0_$65 = pph_vars.$pph_var_types$.currentBinding(thread);
                            try {
                                pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                                final SubLObject _prev_bind_0_$66 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                                try {
                                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                        format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    try {
                                        pph_phrase_transfer_old_onto_new(phrase, best_phrase);
                                        do_generate_phrase_from_template(best_phrase);
                                    } finally {
                                        final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            pph_macros.pph_handle_local_vars(local_vars);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                        }
                                    }
                                } finally {
                                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$66, thread);
                                }
                            } finally {
                                pph_vars.$pph_var_types$.rebind(_prev_bind_0_$65, thread);
                            }
                            if ((NIL != pph_phrase.pph_phrase_doneP(best_phrase)) && (NIL == pph_phrase.pph_phrase_doneP(original_phrase))) {
                                pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                                if (NIL != pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), UNPROVIDED)) {
                                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                        Errors.warn($str214$__GENERATE_PHRASE_FROM_TEMPLATE__);
                                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                    }
                                    pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                                    pph_phrase.pph_phrase_note_not_done(phrase);
                                } else {
                                    if (NIL != pph_vars.pph_generate_alternative_phrasesP()) {
                                        pph_phrase.pph_phrase_copy(best_phrase, original_phrase, NIL);
                                        pph_phrase.pph_phrase_set_dtrs(original_phrase, pph_phrase.pph_phrase_dtrs(best_phrase));
                                    }
                                    SubLObject cdolist_list_var = copy_list(pph_phrase.pph_phrase_justification(best_phrase));
                                    SubLObject just = NIL;
                                    just = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        pph_phrase.pph_phrase_add_justification(original_phrase, just);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        just = cdolist_list_var.first();
                                    } 
                                    pph_phrase.pph_phrase_note_done(original_phrase);
                                    if (NIL != el_negation_p(formula)) {
                                        final SubLObject position = pph_phrase.pph_phrase_arg_position(original_phrase);
                                        final SubLObject neg_position = (NIL != pph_utilities.pph_known_arg_position_p(position)) ? append(position, list(ZERO_INTEGER)) : pph_utilities.pph_unknown_arg_position();
                                        pph_vars.note_unexpressed_negation_expressed(neg_position, GENERATE_PHRASE_FROM_TEMPLATE);
                                    }
                                    if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                        doneP = T;
                                    }
                                }
                            } else
                                if (NIL != pph_phrase.pph_phrase_doneP(best_phrase)) {
                                    pph_phrase.pph_phrase_add_alternative(original_phrase, best_phrase);
                                    alternative_count = add(alternative_count, ONE_INTEGER);
                                } else {
                                    pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                                }

                            tried_anyP = T;
                        }
                    } 
                    pph_data_structures.free_pph_phrase_template_generator(generator);
                } finally {
                    pph_vars.$pph_search_limit$.rebind(_prev_bind_0_$64, thread);
                }
                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            } finally {
                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
            }
            if (alternative_count.isPositive() && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                format_nil.force_format(T, $str215$Added__D_template_alternatives_to, alternative_count, original_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == tried_anyP) {
                pph_phrase.pph_phrase_maybe_note_problem(original_phrase, GENERATE_PHRASE_FROM_TEMPLATE, $NO_GEN_TEMPLATES, list($CYCL, formula));
            } else
                if (NIL == pph_phrase.pph_phrase_doneP(original_phrase)) {
                    pph_phrase.pph_phrase_maybe_note_problem(original_phrase, GENERATE_PHRASE_FROM_TEMPLATE, $EXISTING_GEN_TEMPLATES_FAILED, list($CYCL, formula));
                } else
                    if (NIL != gafP(formula)) {
                        pph_maybe_add_gaf_to_top_20(formula, agr_preds, time);
                    }


        }
        final SubLObject original_preds = pph_phrase.pph_phrase_agr_preds(original_phrase, UNPROVIDED);
        if ((((NIL == pph_phrase.pph_phrase_doneP(original_phrase)) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) && (NIL != pph_utilities.pph_filter_preds($list219, original_preds, UNPROVIDED))) && (NIL == pph_utilities.pph_filter_preds($list220, original_preds, UNPROVIDED))) {
            final SubLObject backup = pph_phrase.pph_phrase_create_backup(original_phrase);
            pph_phrase.pph_phrase_set_agr_preds(original_phrase, $list220, UNPROVIDED);
            pph_phrase.pph_phrase_update_category(original_phrase, pph_utilities.pph_vbar_category(), T, T);
            generate_phrase_from_template(original_phrase);
            if (NIL != pph_phrase.pph_phrase_doneP(original_phrase)) {
                pph_phrase.pph_phrase_set_agr_pred(original_phrase, $$gerund, UNPROVIDED);
                pph_phrase.pph_phrase_update_category(original_phrase, pph_utilities.pph_nbar_category(), T, T);
                pph_phrase.pph_phrase_add_justification(original_phrase, COERCED_GERUND_FROM_PRESENT_PARTICIPLE);
            } else {
                pph_phrase.pph_phrase_revert_to_backup(original_phrase, backup);
            }
        }
        return pph_phrase.pph_phrase_output_list(original_phrase);
    }

    public static SubLObject pph_phrase_transfer_old_onto_new(final SubLObject old_phrase, final SubLObject new_phrase) {
        final SubLObject old_category = pph_phrase.pph_phrase_category(old_phrase, UNPROVIDED);
        final SubLObject old_agr = pph_phrase.pph_phrase_agr(old_phrase);
        final SubLObject old_case = pph_phrase.pph_phrase_case(old_phrase);
        final SubLObject old_just = copy_list(pph_phrase.pph_phrase_justification(old_phrase));
        final SubLObject old_just_count = length(old_just);
        SubLObject stopP = NIL;
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(old_phrase)) {
            pph_phrase.pph_phrase_remove_all_dtrs(old_phrase);
        }
        pph_phrase.pph_phrase_add_dtr_to_terminal(old_phrase, new_phrase);
        SubLObject list_var = NIL;
        SubLObject just = NIL;
        SubLObject i = NIL;
        list_var = old_just;
        just = list_var.first();
        for (i = ZERO_INTEGER; (NIL == stopP) && (NIL != list_var); list_var = list_var.rest() , just = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (i.numGE(old_just_count)) {
                final SubLObject new_format_string = cconcatenate($str223$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str224$__, format_nil.format_nil_a_no_copy($str225$Adding_too_many_justifications__O) });
                pph_error.pph_handle_error(new_format_string, list(old_just));
                stopP = T;
            } else {
                pph_phrase.pph_phrase_add_justification(new_phrase, just);
            }
        }
        if (NIL == pph_phrase.pph_phrase_agr(new_phrase)) {
            pph_phrase.pph_phrase_set_agr(new_phrase, old_agr, NIL);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str226$__Initial_paraphrase_agr_is__S__, pph_phrase.pph_phrase_agr(new_phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == pph_phrase.pph_phrase_category(new_phrase, UNPROVIDED)) {
            pph_phrase.pph_phrase_set_category(new_phrase, old_category, UNPROVIDED);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str227$__Initial_paraphrase_category_is_, pph_phrase.pph_phrase_category(new_phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == pph_phrase.pph_phrase_case(new_phrase)) && (NIL != old_case)) {
            pph_phrase.pph_phrase_set_case(new_phrase, old_case, UNPROVIDED);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str228$__Initial_paraphrase_case_is__S__, pph_phrase.pph_phrase_case(new_phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return new_phrase;
    }

    public static SubLObject new_pph_phrase_for_formula_and_gen_template_assertion(final SubLObject formula, final SubLObject gen_template_as, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $DEFAULT;
        }
        final SubLObject map = pph_utilities.pph_identity_map();
        final SubLObject nl_preds = $ANY;
        final SubLObject phrase = ($$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(gen_template_as))) ? pph_question.pph_phrase_for_query_sentence_from_gtqs_as(gen_template_as, formula, map) : pph_templates.pph_phrase_from_assertion(gen_template_as, UNPROVIDED);
        if (NIL == phrase) {
            if ($$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(gen_template_as)) && (NIL == pph_question.gtqs_assertion_bindings_for_query_sentence(gen_template_as, formula, UNPROVIDED))) {
                Errors.error($str231$_S___does_not_appear_to_match_tem, formula, assertions_high.gaf_arg1(gen_template_as));
            } else {
                Errors.error($str232$Couldn_t_generate_a_PPH_phrase_fr);
            }
        }
        pph_templates.pph_template_customize_template_for_formula(phrase, formula, map, nl_preds);
        if ((!$$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(gen_template_as))) && (NIL != member(force, $list233, UNPROVIDED, UNPROVIDED))) {
            final SubLObject question_template = pph_question.make_question_template(phrase, expression_free_variables(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            if (NIL == question_template) {
                Errors.error($str234$Couldn_t_generate_a_question_from);
            }
            pph_main.pph_phrase_generate(question_template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            do_generate_phrase_from_template(phrase);
        }
        pph_phrase_resolution.pph_phrase_add_sentential_force(phrase, force);
        return phrase;
    }

    public static SubLObject do_generate_phrase_from_template(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject consolidateP = makeBoolean(((NIL != pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue(thread)) && (NIL != cycl_grammar.cycl_nat_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) && (NIL != pph_utilities.pph_known_arg_position_p(pph_phrase.pph_phrase_arg_position(phrase))));
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind(NIL != consolidateP ? $TEXT : pph_vars.$paraphrase_mode$.getDynamicValue(thread), thread);
            assert NIL != pph_utilities.pph_precision_p(NIL) : "pph_utilities.pph_precision_p(CommonSymbols.NIL) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.NIL) " + NIL;
            final SubLObject _prev_bind_0_$68 = pph_vars.$paraphrase_precision$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_precision$.bind(NIL, thread);
                pph_phrase_resolution.pph_phrase_get_string(phrase, UNPROVIDED, UNPROVIDED);
                if (NIL != consolidateP) {
                    pph_phrase.pph_phrase_consolidate_output_list(phrase, pph_phrase.pph_phrase_arg_position(phrase), NIL, NIL, pph_phrase.pph_phrase_agr_pred(phrase));
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                }
            } finally {
                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$68, thread);
            }
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), UNPROVIDED)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str235$__DO_GENERATE_PHRASE_FROM_TEMPLAT);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.pph_phrase_note_not_done(phrase);
        }
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str236$__GENERATE_PHRASE_FROM_TEMPLATE_f, pph_string.pph_string_to_output_format(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str237$__Updated_AGR_is__S___, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_simple_negation(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject inner_formula = cycl_utilities.formula_arg1(original_formula, UNPROVIDED);
        SubLObject map = pph_utilities.pph_figure_new_arg_position_map(pph_phrase.pph_phrase_arg_position_map(phrase), $ARG1);
        thread.resetMultipleValues();
        final SubLObject new_formula_template = remove_var_typing_clauses(inner_formula, NIL, map, T);
        final SubLObject just = thread.secondMultipleValue();
        final SubLObject vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != new_formula_template) {
            inner_formula = pph_utilities.pph_apply_template(new_formula_template, inner_formula);
            map = pph_utilities.pph_figure_new_arg_position_map(map, new_formula_template);
        }
        if (NIL != just) {
            pph_phrase.pph_phrase_add_justification(phrase, just);
        }
        if (NIL == atomic_sentenceP(inner_formula)) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
        try {
            pph_vars.$pph_operator_scope_context$.bind(cons($NO, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread)), thread);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str241$Inside_operator_scope__S, $NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject position = pph_phrase.pph_phrase_arg_position(phrase);
            final SubLObject neg_position = (NIL != pph_utilities.pph_known_arg_position_p(position)) ? pph_utilities.pph_contextualize_arg_position(position, pph_utilities.pph_arg_position_from_template($ARG0)) : pph_utilities.pph_unknown_arg_position();
            final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
            pph_vars.note_unexpressed_negation(neg_position, GENERATE_SIMPLE_NEGATION);
            pph_phrase.pph_phrase_reset_cycl(phrase_copy, $ARG1);
            pph_phrase.pph_phrase_reset_cycl(phrase_copy, new_formula_template);
            final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms(UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str243$__Shadowing_discourse_context____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_main.pph_phrase_generate(phrase_copy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$69, thread);
            }
            if ((NIL != pph_phrase.pph_phrase_doneP(phrase_copy)) && ((NIL == pph_vars.unexpressed_negationP(neg_position)) || (NIL != pph_try_to_express_negation(phrase_copy, neg_position)))) {
                pph_phrase.pph_phrase_copy(phrase_copy, phrase, UNPROVIDED);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str244$Leaving_operator_scope__S, $NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject pph_try_to_express_negation(final SubLObject phrase, final SubLObject neg_position) {
        final SubLObject subj = pph_phrase.pph_phrase_subject_dtr(phrase);
        if (NIL != pph_phrase.pph_det_nbarP(subj)) {
            final SubLObject new_subj = pph_det_nbar_switch_quantifer(subj, phrase, $$Some_NLAttr, $$No_NLAttr, UNPROVIDED);
            if (NIL != new_subj) {
                pph_switch_non_subj_determiners(phrase, new_subj, $$Some_NLAttr, $$Any_NLAttr, $$nonPlural_Generic, UNPROVIDED);
                pph_vars.note_unexpressed_negation_expressed(neg_position, PPH_TRY_TO_EXPRESS_NEGATION);
                return T;
            }
        }
        final SubLObject backup = pph_phrase.pph_phrase_create_backup(phrase);
        maybe_add_do_support(phrase);
        add_not_to_phrase(phrase);
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            pph_vars.note_unexpressed_negation_expressed(neg_position, PPH_TRY_TO_EXPRESS_NEGATION);
            return T;
        }
        pph_phrase.pph_phrase_revert_to_backup(phrase, backup);
        return NIL;
    }

    public static SubLObject pph_switch_non_subj_determiners(final SubLObject phrase, final SubLObject subj, final SubLObject old_quant, final SubLObject new_quant, SubLObject new_nbar_agr_pred, SubLObject matrix_phrase) {
        if (new_nbar_agr_pred == UNPROVIDED) {
            new_nbar_agr_pred = NIL;
        }
        if (matrix_phrase == UNPROVIDED) {
            matrix_phrase = phrase;
        }
        if ((!phrase.eql(subj)) && (NIL != pph_phrase.pph_det_nbarP(phrase))) {
            pph_det_nbar_switch_quantifer(phrase, matrix_phrase, old_quant, new_quant, new_nbar_agr_pred);
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                pph_switch_non_subj_determiners(dtr, subj, old_quant, new_quant, new_nbar_agr_pred, matrix_phrase);
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrase;
    }

    public static SubLObject pph_det_nbar_switch_quantifer(final SubLObject np, final SubLObject matrix_phrase, final SubLObject old_quant, final SubLObject new_quant, SubLObject new_nbar_agr_pred) {
        if (new_nbar_agr_pred == UNPROVIDED) {
            new_nbar_agr_pred = NIL;
        }
        final SubLObject det_dtr = pph_phrase.pph_phrase_nth_dtr(np, ZERO_INTEGER);
        final SubLObject det_cycl = pph_phrase.pph_phrase_cycl(det_dtr, UNPROVIDED);
        final SubLObject old_np_string = pph_phrase.pph_phrase_string(np, NIL);
        if (det_cycl.eql(old_quant)) {
            final SubLObject new_det_dtr = pph_data_structures.new_pph_phrase(NIL, new_quant, UNPROVIDED);
            final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(np, ONE_INTEGER);
            final SubLObject new_np = pph_templates.pph_new_np_from_det_and_nbar(new_det_dtr, nbar_dtr, UNPROVIDED);
            final SubLObject np_mother = pph_phrase.pph_phrase_mother(np);
            SubLObject np_position = NIL;
            if (NIL != new_nbar_agr_pred) {
                pph_phrase.pph_phrase_set_agr_pred(nbar_dtr, new_nbar_agr_pred, UNPROVIDED);
            }
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(np_mother).isVector()) {
                final SubLObject vector_var = document.sign_constituents(np_mother);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (dtr.eql(np)) {
                        np_position = dtr_num;
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            if (NIL != np_position) {
                pph_phrase.pph_phrase_remove_dtr(np_mother, np);
                pph_phrase.pph_phrase_insert_dtr(np_mother, new_np, np_position);
            }
            pph_phrase.pph_phrase_note_not_done(np_mother);
            pph_main.pph_phrase_generate(matrix_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != pph_phrase.pph_phrase_doneP(matrix_phrase)) {
                Errors.warn($str250$Converted__S_to__S, old_np_string, pph_phrase.pph_phrase_string(new_np, NIL));
                return new_np;
            }
        }
        return NIL;
    }

    public static SubLObject maybe_add_do_support(final SubLObject template) {
        final SubLObject head_dtr = pph_sentence.pph_sentence_head_verb(template);
        if (NIL != head_dtr) {
            pph_phrase.pph_phrase_find_or_set_category(head_dtr);
            if ((NIL != pph_phrase.pph_phrase_verbP(head_dtr)) && (NIL != pph_utilities.needs_do_supportP(template))) {
                pph_utilities.pph_phrase_add_do_support(template);
            }
        }
        return template;
    }

    public static SubLObject add_not_to_phrase(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_phrase.pph_phrase_note_not_done(template);
        if (NIL != pph_vars.$pph_allow_contractionsP$.getDynamicValue(thread)) {
            final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms(UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str243$__Shadowing_discourse_context____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                generate_negation_with_contracted_negative_auxiliary(template);
            } finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == pph_phrase.pph_phrase_doneP(template)) {
            final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms(UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str243$__Shadowing_discourse_context____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                generate_negation_with_not(template);
            } finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
            }
        }
        return template;
    }

    public static SubLObject generate_negation_with_contracted_negative_auxiliary(final SubLObject template) {
        final SubLObject new_template = pph_phrase.pph_phrase_copy(template, pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED), T);
        final SubLObject head_verb = pph_sentence.pph_sentence_head_verb(new_template);
        if (NIL != head_verb) {
            final SubLObject word_unit = pph_phrase.pph_phrase_wu(head_verb, UNPROVIDED);
            final SubLObject neg_word_unit = make_formula($$WordWithSuffixFn, list(word_unit, $$Nt_TheSuffix), UNPROVIDED);
            pph_phrase.pph_phrase_set_wu(head_verb, neg_word_unit);
            pph_phrase.pph_phrase_update_category(head_verb, $$Aux_Negated, T, T);
            pph_phrase.pph_phrase_note_not_done(head_verb);
            pph_main.pph_phrase_generate(new_template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != pph_phrase.pph_phrase_doneP(head_verb)) {
                pph_phrase.pph_phrase_copy(new_template, template, UNPROVIDED);
            }
        }
        return template;
    }

    public static SubLObject generate_negation_with_not(final SubLObject template) {
        final SubLObject neg_phrase = pph_data_structures.new_pph_phrase($$$not, $$not, UNPROVIDED);
        final SubLObject head_verb = pph_sentence.pph_sentence_head_verb(template);
        if (NIL != head_verb) {
            final SubLObject head_verb_mother = pph_phrase.pph_phrase_mother(head_verb);
            final SubLObject location = add(ONE_INTEGER, pph_phrase.pph_phrase_head_dtr_num(head_verb_mother));
            pph_phrase.pph_phrase_set_arg_position(neg_phrase, $list100);
            pph_phrase.pph_phrase_insert_dtr(head_verb_mother, neg_phrase, location);
            pph_phrase.pph_phrase_note_not_done(head_verb_mother);
            pph_main.pph_phrase_generate(template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return template;
    }

    public static SubLObject generate_fn_to_arg_0(final SubLObject phrase) {
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject fn2arg = cycl_utilities.nat_function(v_object);
        final SubLObject argnum = cycl_utilities.nat_arg1(fn2arg, UNPROVIDED);
        final SubLObject pred = cycl_utilities.nat_arg2(fn2arg, UNPROVIDED);
        final SubLObject args = cycl_utilities.nat_args(v_object, UNPROVIDED);
        SubLObject pred_string = NIL;
        SubLObject arg_string = NIL;
        SubLObject ans = list($$$the);
        if (NIL == pred_string) {
            SubLObject csome_list_var = list_utilities.alist_lookup(relational_noun_args_for_pred(pred, UNPROVIDED), argnum, UNPROVIDED, UNPROVIDED);
            SubLObject data = NIL;
            data = csome_list_var.first();
            while ((NIL == pred_string) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = data;
                SubLObject leading_strings = NIL;
                SubLObject wu = NIL;
                SubLObject following_strings = NIL;
                SubLObject pos = NIL;
                destructuring_bind_must_consp(current, datum, $list259);
                leading_strings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list259);
                wu = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list259);
                following_strings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list259);
                pos = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((((NIL != wu) && (NIL != pos)) && (NIL != list_utilities.empty_list_p(leading_strings))) && (NIL != list_utilities.empty_list_p(following_strings))) {
                        pred_string = pph_methods_lexicon.pph_first_string_of_wordXspeech_part(wu, pos, $list78, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list259);
                }
                csome_list_var = csome_list_var.rest();
                data = csome_list_var.first();
            } 
        }
        if (pred_string.isString()) {
            ans = cons(pred_string, ans);
            if (NIL != args) {
                ans = cons($$$of, ans);
                arg_string = generate_juncts(args, $list260, UNPROVIDED, UNPROVIDED);
                ans = cons(arg_string, ans);
            }
            pph_phrase.pph_phrase_set_string(phrase, string_utilities.bunge(nreverse(ans), UNPROVIDED));
        }
        return phrase;
    }

    public static SubLObject get_np_gen_formula(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$genFormat_NP;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                SubLObject done_var = assertion;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$70 = assertion;
                            final SubLObject token_var_$71 = NIL;
                            while (NIL == done_var_$70) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$71);
                                final SubLObject valid_$72 = makeBoolean(!token_var_$71.eql(as));
                                if (NIL != valid_$72) {
                                    assertion = as;
                                }
                                done_var_$70 = makeBoolean((NIL == valid_$72) || (NIL != assertion));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != assertion));
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL != assertion ? uncanonicalizer.assertion_el_formula(assertion) : NIL;
    }

    public static SubLObject generate_np_from_formula(final SubLObject formula, final SubLObject scoping_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(formula);
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject format_formula = get_np_gen_formula(pred);
        SubLObject format_string = NIL;
        SubLObject arg_order_list = NIL;
        SubLObject processed_args = NIL;
        SubLObject ans = NIL;
        if (NIL == format_formula) {
            return NIL;
        }
        if (pred.eql($$importFromAmountDuring) && (NIL != member(third(args), scoping_vars, UNPROVIDED, UNPROVIDED))) {
            format_string = $str262$_a_export_to__a_during__a;
            arg_order_list = $list263;
        } else {
            thread.resetMultipleValues();
            final SubLObject format_string_$74 = get_genformat_string_and_list_from_formula(format_formula);
            final SubLObject arg_order_list_$75 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format_string = format_string_$74;
            arg_order_list = arg_order_list_$75;
        }
        if (NIL != format_string) {
            if ((NIL != forts.valid_fortP(pred)) && (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML)) {
                format_string = pph_html.string_term_anchor(format_string, pred);
            }
            processed_args = process_genformat_arglist(formula, pred, args, arg_order_list, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.proper_list_p(processed_args)) {
                ans = apply(symbol_function(FORMAT), NIL, cons(format_string, Mapping.mapcar(PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS, processed_args)));
            }
        }
        return ans;
    }

    public static SubLObject generate_kappa(final SubLObject phrase) {
        final SubLObject kappa_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject formula = cycl_utilities.formula_arg2(kappa_formula, UNPROVIDED);
        final SubLObject scoping_vars = cycl_utilities.formula_arg1(kappa_formula, UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_operator(formula);
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject constant_args = remove_if($sym268$EL_VAR_, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pred_string = NIL;
        SubLObject arg_string = NIL;
        SubLObject ans = generate_np_from_formula(formula, scoping_vars);
        if (NIL != ans) {
            pph_phrase.pph_phrase_set_string(phrase, ans);
            return phrase;
        }
        if (NIL != collection_defns.cycl_atomic_sentenceP(formula)) {
            pred_string = pph_main.pph_phrase_generate_string_from_cycl(pred, $list78, UNPROVIDED);
            ans = cons(pred_string, ans);
            if (NIL != constant_args) {
                ans = cons($$$for, ans);
                final SubLObject juncts_string = generate_juncts(constant_args, $list260, UNPROVIDED, UNPROVIDED);
                if (juncts_string.isString()) {
                    arg_string = juncts_string;
                    ans = cons(arg_string, ans);
                } else {
                    ans = NIL;
                }
            }
            ans = string_utilities.bunge(nreverse(ans), UNPROVIDED);
            pph_phrase.pph_phrase_set_string(phrase, ans);
        }
        if (NIL == ans) {
            generate_atomic_formula(phrase);
        }
        return phrase;
    }

    public static SubLObject generate_existential(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase.pph_phrase_compatible_with_predsP(phrase, $list272)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$76 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    try {
                        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                        SubLObject cdolist_list_var = pph_utilities.pph_vars_to_quantify(formula);
                        SubLObject free_var = NIL;
                        free_var = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            pph_variable_handling.pph_register_var_quantifier(free_var, $UNIVERSAL);
                            cdolist_list_var = cdolist_list_var.rest();
                            free_var = cdolist_list_var.first();
                        } 
                        thread.resetMultipleValues();
                        final SubLObject new_formula_template = remove_var_typing_clauses_from_existential(formula, arg_position_map);
                        final SubLObject just = thread.secondMultipleValue();
                        final SubLObject vars = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (($ERROR != new_formula_template) && (NIL == pph_phrase.pph_phrase_doneP(phrase))) {
                            final SubLObject original_phrase = pph_phrase.pph_phrase_create_backup(phrase);
                            pph_phrase.pph_phrase_reset_cycl(phrase, new_formula_template);
                            if (NIL != just) {
                                pph_phrase.pph_phrase_add_justification(phrase, just);
                            }
                            if (!pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).equal(formula)) {
                                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            SubLObject missed_oneP = NIL;
                            if (NIL == missed_oneP) {
                                SubLObject csome_list_var = vars;
                                SubLObject var = NIL;
                                var = csome_list_var.first();
                                while ((NIL == missed_oneP) && (NIL != csome_list_var)) {
                                    if (NIL != pph_variable_handling.pph_var_paraphrased_explicitlyP(var)) {
                                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                            Errors.warn($str274$Failed_to_paraphrase__S_with_type, var);
                                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        missed_oneP = T;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    var = csome_list_var.first();
                                } 
                            }
                            if ((NIL != missed_oneP) || (NIL == pph_phrase.pph_phrase_doneP(phrase))) {
                                pph_phrase.pph_phrase_revert_to_backup(phrase, original_phrase);
                                pph_phrase.pph_phrase_note_not_done(phrase);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                        }
                    }
                } finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$76, thread);
                }
            } finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_english_explicit_existential(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject original_map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject original_dtrs = pph_phrase.pph_phrase_dtr_list(phrase);
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_phrase_strip_explicit_cycl_quants(phrase, $EXISTENTIAL);
        final SubLObject core_formula = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (!core_formula.equal(original_formula)) {
            final SubLObject filtered_vars = pph_filter_quantified_vars(list_utilities.alist_keys(var_pairs), $EXISTENTIAL, keep_explicitP);
            final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            SubLObject dtrs = NIL;
            if (NIL != filtered_vars) {
                final SubLObject quant_position = pph_utilities.pph_arg_position_lookup($list100, original_map);
                final SubLObject quant = $$thereExists;
                final SubLObject quant_phrase = pph_data_structures.new_pph_phrase($$$there_is_some, quant, UNPROVIDED);
                pph_phrase.pph_phrase_set_arg_position(quant_phrase, quant_position);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(quant_phrase);
                dtrs = cons(quant_phrase, dtrs);
                dtrs = cons(quant_vars_phrase(filtered_vars, var_pairs), dtrs);
                if (NIL != list_utilities.lengthG(filtered_vars, ONE_INTEGER, UNPROVIDED)) {
                    dtrs = cons(pph_data_structures.new_pph_phrase($str0$_, UNPROVIDED, UNPROVIDED), dtrs);
                }
                dtrs = cons(pph_data_structures.new_pph_phrase($$$such_that, UNPROVIDED, UNPROVIDED), dtrs);
            }
            dtrs = cons(quant_body_phrase(core_formula, map), dtrs);
            dtrs = nreverse(dtrs);
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, dtrs, UNPROVIDED);
            pph_phrase_resolution.pph_phrase_get_string(phrase, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str278$Failed_to_generate_explicit_exist, original_formula);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, original_dtrs, UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_output_list_add_comma(final SubLObject output_list) {
        final SubLObject new_item = pph_question.new_pph_phrase_filler_item($str0$_);
        if (NIL != pph_utilities.pph_bulleted_list_end_itemP(list_utilities.last_one(output_list))) {
            final SubLObject insert_position = subtract(length(output_list), NIL != pph_utilities.pph_bulleted_list_item_end_itemP(list_utilities.penultimate_one(output_list)) ? TWO_INTEGER : ONE_INTEGER);
            return list_utilities.ninsert_by_position(new_item, output_list, insert_position);
        }
        return list_utilities.snoc(new_item, output_list);
    }

    public static SubLObject quant_vars_phrase(final SubLObject vars, final SubLObject var_pairs) {
        SubLObject var_phrases = NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            var_phrases = cons(quant_var_phrase(var, var_pairs), var_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        var_phrases = nreverse(var_phrases);
        return pph_phrase.new_pph_coordination_phrase_low(var_phrases, $AND, $UNORDERED);
    }

    public static SubLObject quant_var_phrase(final SubLObject var, final SubLObject var_pairs) {
        final SubLObject var_phrase = pph_phrase.new_pph_phrase_for_cycl(var, UNPROVIDED, UNPROVIDED);
        final SubLObject arg_position = list_utilities.alist_lookup(var_pairs, var, UNPROVIDED, UNPROVIDED);
        pph_phrase.pph_phrase_set_arg_position(var_phrase, arg_position);
        return var_phrase;
    }

    public static SubLObject quant_body_phrase(final SubLObject formula, final SubLObject map) {
        return pph_phrase.new_pph_phrase_for_cycl(formula, map, UNPROVIDED);
    }

    public static SubLObject pph_phrase_strip_explicit_cycl_quants(final SubLObject phrase, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_strip_explicit_cycl_quants(formula, type);
        final SubLObject core_template = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        pph_phrase.pph_phrase_reset_cycl(phrase, core_template);
        return values(var_pairs, formula, keep_explicitP);
    }

    public static SubLObject pph_strip_explicit_cycl_quants(SubLObject formula, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_test_fn = (type == $EXISTENTIAL) ? EL_EXISTENTIAL_P : EL_UNIVERSAL_P;
        final SubLObject other_test_fn = (type == $EXISTENTIAL) ? PPH_UNIVERSAL_P : PPH_EXISTENTIAL_P;
        SubLObject core_template = pph_utilities.pph_identity_template();
        SubLObject var_position = $list180;
        SubLObject var_pairs = NIL;
        final SubLObject keep_explicitP = makeBoolean(((NIL == pph_vars.$pph_hide_explicit_universalsP$.getDynamicValue(thread)) || (NIL != pph_vars.pph_maximize_linksP())) || (NIL != cycl_utilities.expression_find_if(other_test_fn, formula, UNPROVIDED, UNPROVIDED)));
        SubLObject minimizedP = NIL;
        while ((NIL == minimizedP) && (NIL != funcall(formula_test_fn, formula))) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject var = NIL;
            SubLObject body = NIL;
            destructuring_bind_must_consp(current, datum, $list283);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list283);
            body = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != pph_variable_handling.pph_var_registered_as_defaultP(var)) {
                    final SubLObject type_$78 = pph_variable_handling.pph_min_variable_isa_constraint(var, body, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject type_arg_position = pph_utilities.pph_arg_position(type_$78, body, symbol_function(EQUAL));
                    final SubLObject type_template = pph_utilities.pph_cycl_template_from_arg_position(type_arg_position);
                    final SubLObject type_map = pph_utilities.pph_figure_new_arg_position_map(pph_utilities.pph_new_identity_map(), type_template);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str284$Registering__S_as__S___with_map__, var, type_$78, type_map, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_variable_handling.pph_register_var(var, type_$78, type_map);
                }
                if (NIL != keep_explicitP) {
                    pph_register_var_as_exception(var);
                }
                if (NIL != el_disjunction_p(body)) {
                    minimizedP = T;
                } else
                    if (NIL != pph_negative_polarity_sentenceP(body)) {
                        minimizedP = T;
                    } else {
                        var_pairs = list_utilities.alist_enter(var_pairs, var, var_position, UNPROVIDED);
                        var_position = pph_utilities.pph_contextualize_arg_position($list181, var_position);
                        formula = body;
                        core_template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, core_template);
                    }

            } else {
                cdestructuring_bind_error(datum, $list283);
            }
        } 
        return values(var_pairs, core_template, keep_explicitP);
    }

    public static SubLObject pph_filter_quantified_vars(final SubLObject quantified_vars, final SubLObject qtype, SubLObject keep_explicitP) {
        if (keep_explicitP == UNPROVIDED) {
            keep_explicitP = NIL;
        }
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = quantified_vars;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != keep_explicitP) {
                ans = cons(var, ans);
            } else
                if (NIL == pph_exceptional_var_p(var)) {
                    pph_variable_handling.pph_register_var_quantifier(var, qtype);
                } else
                    if (NIL == subl_promotions.memberP(pph_variable_handling.pph_var_type(var), quantified_vars, UNPROVIDED, UNPROVIDED)) {
                        ans = cons(var, ans);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject fix_vars_output_list(final SubLObject vars_list, final SubLObject local_map) {
        SubLObject cdolist_list_var = vars_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = pph_data_structures.pph_phrase_output_item_cycl(item);
            final SubLObject local_arg_position = list_utilities.alist_lookup(local_map, var, symbol_function(EQL), pph_utilities.pph_unknown_arg_position());
            pph_data_structures.pph_phrase_output_item_set_arg_position(item, local_arg_position);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return vars_list;
    }

    public static SubLObject remove_var_typing_clauses_from_existential(final SubLObject formula, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vars = NIL;
        SubLObject core_restr = formula;
        SubLObject core_restr_template = pph_utilities.pph_identity_template();
        SubLObject just = NIL;
        final SubLObject abortP = NIL;
        SubLObject minimizedP = pph_formula_contains_universalP(core_restr);
        pph_register_exception_vars(formula);
        while (((NIL == minimizedP) && (NIL == abortP)) && (NIL != el_existential_p(core_restr))) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(core_restr, UNPROVIDED);
            SubLObject var = NIL;
            SubLObject restr = NIL;
            destructuring_bind_must_consp(current, datum, $list285);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list285);
            restr = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != pph_exceptional_var_p(var)) {
                    minimizedP = T;
                } else
                    if (NIL != pph_variable_handling.pph_use_explicit_varP(var)) {
                        minimizedP = T;
                    } else
                        if (NIL != pph_negative_polarity_sentenceP(restr)) {
                            minimizedP = T;
                        } else {
                            core_restr = restr;
                            core_restr_template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, core_restr_template);
                            pph_variable_handling.pph_register_var_quantifier(var, $EXISTENTIAL);
                            vars = cons(var, vars);
                        }


            } else {
                cdestructuring_bind_error(datum, $list285);
            }
        } 
        SubLObject registered_vars = NIL;
        final SubLObject core_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, core_restr_template);
        thread.resetMultipleValues();
        final SubLObject curr_template = remove_var_typing_clauses(core_restr, list(cycl_utilities.formula_arg1(formula, UNPROVIDED)), core_map, UNPROVIDED);
        final SubLObject curr_just = thread.secondMultipleValue();
        final SubLObject extracted_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != pph_utilities.pph_cycl_template_p(curr_template)) && (NIL == pph_utilities.pph_identity_template_p(curr_template))) {
            core_restr_template = pph_utilities.pph_apply_template(curr_template, core_restr_template);
            core_restr = pph_utilities.pph_apply_template(curr_template, core_restr);
            if (NIL == just) {
                just = curr_just;
            }
            registered_vars = append(extracted_vars, registered_vars);
        }
        if ((NIL != abortP) || (NIL == core_restr)) {
            pph_variable_handling.pph_deregister_vars(Mapping.mapcar(symbol_function(CAR), registered_vars));
        } else {
            SubLObject cdolist_list_var = list(cycl_utilities.formula_arg1(formula, UNPROVIDED));
            SubLObject var2 = NIL;
            var2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_variable_handling.pph_var_registered_as_defaultP(var2)) {
                    maybe_register_var_by_arg_constraints(var2, UNPROVIDED);
                }
                pph_variable_handling.pph_note_if_var_is_used_only_once_in_formula(var2, formula);
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
            } 
        }
        final SubLObject big_existential_formula = put_back_wide_scope_existentials(core_restr_template, length(vars));
        if ((NIL != el_implication_p(core_restr)) || (NIL != el_universal_p(core_restr))) {
            core_restr_template = big_existential_formula;
        } else
            if ((NIL != core_restr_template) && core_restr_template.isList()) {
                core_restr_template = cycl_utilities.formula_arg2(big_existential_formula, UNPROVIDED);
            }

        return values(core_restr_template, just, vars);
    }

    public static SubLObject put_back_wide_scope_existentials(final SubLObject core_restr_template, final SubLObject how_many) {
        return put_back_wide_scope_quants(core_restr_template, how_many, $$thereExists);
    }

    public static SubLObject put_back_wide_scope_quants(SubLObject core_restr_template, final SubLObject how_many, final SubLObject quant) {
        SubLObject how_many_left;
        SubLObject var_template;
        SubLObject i;
        for (how_many_left = NIL, how_many_left = number_utilities.f_1_(how_many); !how_many_left.numL(ZERO_INTEGER); how_many_left = number_utilities.f_1_(how_many_left)) {
            var_template = $SELF;
            for (i = NIL, i = ZERO_INTEGER; i.numL(how_many_left); i = add(i, ONE_INTEGER)) {
                var_template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, var_template);
            }
            var_template = pph_utilities.make_formula_arg_naut(ONE_INTEGER, var_template);
            core_restr_template = make_binary_formula(quant, var_template, core_restr_template);
        }
        return core_restr_template;
    }

    public static SubLObject pph_formula_ok_for_relational_nounP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str288$__Checking_formula_for_relational, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject badP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL == el_atomic_sentenceP(formula)) && (NIL == el_binary_formula_p(formula))) {
                badP = T;
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == badP) {
            SubLObject i = ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = NIL, rest = args; (NIL == badP) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                i = add(i, ONE_INTEGER);
                if ((NIL != el_formula_p(arg)) || ((NIL != cycl_variables.el_varP(arg)) && (((NIL == pph_variable_handling.pph_var_registeredP(arg)) || (!pph_variable_handling.pph_var_type(arg).eql(pph_variable_handling.pph_min_variable_isa_constraint(arg, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || (NIL == pph_argnum_and_pred_ok_for_relational_nounP(number_utilities.f_1X(i), pred))))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str289$___S_not_suitable_for_relational_, arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    badP = T;
                }
            }
        }
        if (NIL != badP) {
            return NIL;
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str290$__Suitable_for_relational_noun_pa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return T;
    }

    public static SubLObject pph_argnum_and_pred_ok_for_relational_nounP(final SubLObject argnum, final SubLObject pred) {
        final SubLObject relational_noun_args = relational_noun_args_for_pred(pred, UNPROVIDED);
        return list_utilities.sublisp_boolean(assoc(argnum, relational_noun_args, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject relational_noun_args_for_pred_internal(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject gafs = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(mt, thread);
            gafs = pph_utilities.pph_sort_assertions(arg_in_reln_assertions_for_pred(pred), UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject leading_strings = lexicon_utilities.parse_denot_formula(assertions_high.assertion_formula(gaf));
            final SubLObject wu = thread.secondMultipleValue();
            final SubLObject following_strings = thread.thirdMultipleValue();
            final SubLObject pos = thread.fourthMultipleValue();
            final SubLObject denot = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject argnum = list_utilities.last_one(assertions_high.gaf_args(gaf));
            final SubLObject data = list(leading_strings, wu, following_strings, pos);
            ans = list_utilities.alist_pushnew(ans, argnum, data, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject relational_noun_args_for_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return relational_noun_args_for_pred_internal(pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELATIONAL_NOUN_ARGS_FOR_PRED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELATIONAL_NOUN_ARGS_FOR_PRED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RELATIONAL_NOUN_ARGS_FOR_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(relational_noun_args_for_pred_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject generate_existential_with_relational_noun(final SubLObject phrase, final SubLObject new_formula) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str292$__Paraphrasing__S_with_relational, new_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject phrase_naut = pph_phrase_naut_for_relational_noun_formula(new_formula);
        if (NIL != phrase_naut) {
            pph_phrase.pph_phrase_set_cycl(phrase, phrase_naut);
            pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject pph_phrase_naut_for_relational_noun_formula(final SubLObject formula) {
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject bound_arg = NIL;
        SubLObject pos = NIL;
        SubLObject wu = NIL;
        SubLObject leading_strings = NIL;
        SubLObject following_strings = NIL;
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject i = NIL;
        list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
        arg = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject argnum = number_utilities.f_1X(i);
            if (NIL != cycl_variables.el_varP(arg)) {
                final SubLObject datum_evaluated_var = list_utilities.alist_lookup(relational_noun_args_for_pred(pred, UNPROVIDED), argnum, UNPROVIDED, UNPROVIDED);
                leading_strings = datum_evaluated_var.first();
                wu = cadr(datum_evaluated_var);
                following_strings = cddr(datum_evaluated_var).first();
                pos = cadr(cddr(datum_evaluated_var));
            } else {
                if (NIL != bound_arg) {
                    final SubLObject new_format_string = cconcatenate($str223$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str224$__, format_nil.format_nil_a_no_copy($str293$Bad_arg___S_in__S___) });
                    pph_error.pph_handle_error(new_format_string, list(arg, formula));
                    return NIL;
                }
                bound_arg = arg;
            }
        }
        if (((NIL == bound_arg) || (NIL == pos)) || (NIL == wu)) {
            final SubLObject new_format_string2 = cconcatenate($str223$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str224$__, format_nil.format_nil_a_no_copy($str294$Don_t_know_how_to_form_a_relation) });
            pph_error.pph_handle_error(new_format_string2, list(formula));
            return NIL;
        }
        SubLObject nbar_phrases = NIL;
        SubLObject cdolist_list_var = leading_strings;
        SubLObject leading_string = NIL;
        leading_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            nbar_phrases = cons(list(pph_functions.bestnlphraseofstringfn(), leading_string), nbar_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            leading_string = cdolist_list_var.first();
        } 
        nbar_phrases = cons(list(pph_functions.headwordofphrasefn(), list(pph_functions.bestnlwordformoflexemefn_constrained(), pos, wu)), nbar_phrases);
        cdolist_list_var = following_strings;
        SubLObject following_string = NIL;
        following_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            nbar_phrases = cons(list(pph_functions.bestnlphraseofstringfn(), following_string), nbar_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            following_string = cdolist_list_var.first();
        } 
        nbar_phrases = nreverse(nbar_phrases);
        return list(pph_functions.phraseformfn(), $$NLSentence, list(pph_functions.concatenatephrasesfn(), list(pph_functions.termparaphrasefn_np(), bound_arg), bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), $list296), list(pph_functions.bestdetnbarfn_indefinite(), bq_cons(pph_functions.concatenatephrasesfn(), nbar_phrases))));
    }

    public static SubLObject generate_implication_smart(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_formula;
        final SubLObject old_formula = new_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject _prev_bind_0 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        try {
            pph_vars.$pph_use_smart_variable_replacementP$.bind(makeBoolean(T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)) && (NIL != pph_allow_var_typingP(old_formula, UNPROVIDED))), thread);
            if (NIL == pph_utilities.pph_formula_with_dotsP(old_formula)) {
                pph_register_exception_vars(old_formula);
                final SubLObject formula_free_vars = pph_utilities.pph_vars_to_quantify(old_formula);
                final SubLObject _prev_bind_0_$79 = pph_vars.$pph_var_types$.currentBinding(thread);
                try {
                    pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                    final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                    final SubLObject _prev_bind_0_$80 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                    try {
                        pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                        pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                        pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        try {
                            SubLObject cdolist_list_var = formula_free_vars;
                            SubLObject free_var = NIL;
                            free_var = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                pph_variable_handling.pph_register_var_quantifier(free_var, $UNIVERSAL);
                                cdolist_list_var = cdolist_list_var.rest();
                                free_var = cdolist_list_var.first();
                            } 
                            thread.resetMultipleValues();
                            final SubLObject new_formula_template = remove_var_typing_clauses_from_implication(old_formula, arg_position_map);
                            final SubLObject just = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject rephraseP = makeBoolean(NIL == pph_utilities.pph_identity_template_p(new_formula_template));
                            final SubLObject new_precision = (NIL != rephraseP) ? NIL : pph_utilities.pph_current_precision();
                            if (NIL != rephraseP) {
                                pph_phrase.pph_phrase_reset_cycl(phrase, new_formula_template);
                                if (NIL != just) {
                                    pph_phrase.pph_phrase_add_justification(phrase, just);
                                }
                                new_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                    format_nil.force_format(T, $str299$__Removed_var_typing_clauses_in__, old_formula, new_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            final SubLObject info = pph_types.pph_method_info(GENERATE_IMPLICATION_SMART, $IMPLICATION);
                            pph_types.pph_deregister_method_info(GENERATE_IMPLICATION_SMART, info);
                            try {
                                final SubLObject _prev_bind_0_$81 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_operator_scope_context$.bind(cons($IMPLIES, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread)), thread);
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str241$Inside_operator_scope__S, $IMPLIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    assert NIL != pph_utilities.pph_precision_p(new_precision) : "pph_utilities.pph_precision_p(new_precision) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(new_precision) " + new_precision;
                                    final SubLObject _prev_bind_0_$82 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                    try {
                                        pph_vars.$paraphrase_precision$.bind(new_precision, thread);
                                        pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str244$Leaving_operator_scope__S, $IMPLIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0_$81, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    pph_types.pph_register_method_info(GENERATE_IMPLICATION_SMART, info);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                    format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_macros.pph_handle_local_vars(local_vars);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                    format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                            }
                        }
                    } finally {
                        pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                        pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                        pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$80, thread);
                    }
                } finally {
                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$79, thread);
                }
            }
        } finally {
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_register_different_vars(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_p(formula)) {
            return formula;
        }
        if (((NIL == el_binary_formula_p(formula)) || (NIL == cycl_variables.el_varP(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) || (NIL == cycl_variables.el_varP(cycl_utilities.formula_arg2(formula, UNPROVIDED)))) {
            SubLObject ans = map_formula_terms(PPH_REGISTER_DIFFERENT_VARS, formula, UNPROVIDED);
            if (NIL != list_utilities.proper_list_p(ans)) {
                ans = remove(NIL, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return ans;
        }
        SubLObject op = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(formula, formula, $list301);
        op = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list301);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list301);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != forts.fort_p(op)) && (NIL != pph_utilities.pph_genl_predicateP(op, $$different, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str303$__Registering__S_and__S_as_differ, arg1, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_variable_handling.pph_register_vars_as_different(arg1, arg2);
            }
            return op.eql($$different) ? NIL : formula;
        }
        cdestructuring_bind_error(formula, $list301);
        return NIL;
    }

    public static SubLObject remove_var_typing_clauses_from_implication(final SubLObject formula, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject just = NIL;
        if (NIL != el_implication_p(formula)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            destructuring_bind_must_consp(current, datum, $list305);
            antecedent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list305);
            consequent = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != el_formula_p(antecedent)) && (NIL != pph_ok_consequentP(consequent))) {
                    thread.resetMultipleValues();
                    SubLObject antecedent_template = remove_var_typing_clauses(antecedent, NIL, pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG1), NIL);
                    final SubLObject antecedent_just = thread.secondMultipleValue();
                    final SubLObject vars = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (antecedent_template != $ERROR) {
                        SubLObject cdolist_list_var = cycl_utilities.expression_gather(antecedent_template, GENERIC_ARG_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject generic_arg = NIL;
                        generic_arg = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            antecedent_template = subst(pph_utilities.make_formula_arg_naut(at_utilities.generic_arg_num(generic_arg), $ANTECEDENT), generic_arg, antecedent_template, UNPROVIDED, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            generic_arg = cdolist_list_var.first();
                        } 
                        if (NIL == antecedent_template) {
                            template = $ARG2;
                        } else
                            if (NIL != pph_utilities.pph_identity_template_p(antecedent_template)) {
                                template = pph_utilities.pph_identity_template();
                            } else {
                                antecedent_template = subst($ARG1, $ANTECEDENT, antecedent_template, UNPROVIDED, UNPROVIDED);
                                template = make_implication(antecedent_template, $ARG2);
                            }

                        just = antecedent_just;
                        final SubLObject new_antecedent = (NIL != antecedent_template) ? pph_utilities.pph_apply_template(antecedent_template, formula) : NIL;
                        SubLObject cdolist_list_var2 = vars;
                        SubLObject pair = NIL;
                        pair = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject current_$86;
                            final SubLObject datum_$85 = current_$86 = pair;
                            SubLObject var = NIL;
                            SubLObject local_arg_position = NIL;
                            destructuring_bind_must_consp(current_$86, datum_$85, $list308);
                            var = current_$86.first();
                            current_$86 = current_$86.rest();
                            destructuring_bind_must_consp(current_$86, datum_$85, $list308);
                            local_arg_position = current_$86.first();
                            current_$86 = current_$86.rest();
                            if (NIL == current_$86) {
                                if (NIL == cycl_utilities.expression_find(var, new_antecedent, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    pph_variable_handling.pph_register_var_quantifier(var, $UNIVERSAL);
                                }
                            } else {
                                cdestructuring_bind_error(datum_$85, $list308);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            pair = cdolist_list_var2.first();
                        } 
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list305);
            }
        }
        return values(template, just);
    }

    public static SubLObject pph_ok_consequentP(final SubLObject consequent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_p(consequent)) {
            return NIL;
        }
        if ((NIL != cycl_utilities.expression_find_if(EL_GENERAL_EXISTENTIAL_P, consequent, UNPROVIDED, UNPROVIDED)) && (NIL != pph_vars.$paraphrase_precision$.getDynamicValue(thread))) {
            return NIL;
        }
        if (NIL != cycl_utilities.expression_find_if(EL_DISJUNCTION_P, consequent, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != cycl_utilities.expression_find_if($sym311$PPH_EXISTENTIAL_RMP_SENTENCE_, consequent, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_existential_rmp_sentenceP(final SubLObject v_object) {
        SubLObject badP = NIL;
        if (NIL != el_formula_p(v_object)) {
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject quant;
            SubLObject arg_position;
            for (rest = NIL, rest = quant_over_arg_tuples(cycl_utilities.formula_arg0(v_object)); (NIL == badP) && (NIL != rest); badP = makeBoolean(quant.eql($$Some_NLAttr) && (NIL != cycl_variables.el_varP(list_utilities.get_nested_nth(v_object, arg_position, UNPROVIDED)))) , rest = rest.rest()) {
                cons = rest.first();
                datum = current = cons;
                quant = NIL;
                arg_position = NIL;
                destructuring_bind_must_consp(current, datum, $list312);
                quant = current.first();
                current = arg_position = current.rest();
            }
        }
        return badP;
    }

    public static SubLObject pph_universal_rmp_sentenceP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != el_formula_p(v_object)) {
            final SubLObject pred_tuples = quant_over_arg_tuples(cycl_utilities.formula_arg0(v_object));
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject quant;
            SubLObject arg_position;
            for (rest = NIL, rest = pred_tuples; (NIL == ans) && (NIL != rest); ans = eq(quant, $$Every_NLAttr) , rest = rest.rest()) {
                cons = rest.first();
                datum = current = cons;
                quant = NIL;
                arg_position = NIL;
                destructuring_bind_must_consp(current, datum, $list312);
                quant = current.first();
                current = arg_position = current.rest();
            }
            if (NIL == ans) {
                final SubLObject expansion = verbosifier.el_expansion_one_step(v_object, mt_relevance_macros.$mt$.getDynamicValue(thread));
                if (!v_object.equal(expansion)) {
                    ans = pph_universal_rmp_sentenceP(expansion);
                }
            }
        }
        return ans;
    }

    public static SubLObject pph_formula_contains_universalP(final SubLObject sentence) {
        return cycl_utilities.expression_find_if(PPH_UNIVERSAL_P, sentence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_universal_p(final SubLObject obj) {
        return makeBoolean((NIL != el_formula_p(obj)) && ((NIL != pph_types.pph_syntactic_universal_p(obj)) || (NIL != pph_universal_rmp_sentenceP(obj))));
    }

    public static SubLObject maybe_register_var_by_arg_constraints(final SubLObject var, SubLObject formula) {
        if (formula == UNPROVIDED) {
            formula = $USE_CONTEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != pph_vars.$register_vars_by_arg_constraintsP$.getDynamicValue(thread)) && T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread))) && (NIL != pph_variable_handling.pph_var_registered_as_defaultP(var))) {
            register_var_by_arg_constraints(var, formula);
        }
        return pph_variable_handling.pph_var_type(var);
    }

    public static SubLObject register_var_by_arg_constraints(final SubLObject var, SubLObject formula) {
        if (formula == UNPROVIDED) {
            formula = $USE_CONTEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraint = NIL;
        final SubLObject use_var_typing_clausesP = NIL;
        final SubLObject directlyP = T;
        final SubLObject validity_test = $sym315$PPH_VALID_RELEVANT_VAR_TYPE_;
        if (NIL != el_formula_p(formula)) {
            constraint = pph_variable_handling.pph_min_variable_isa_constraint(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), use_var_typing_clausesP, directlyP, validity_test);
        } else
            if ($USE_CONTEXT == formula) {
                SubLObject cdolist_list_var = pph_vars.$pph_cycls$.getDynamicValue(thread);
                SubLObject formula_$87 = NIL;
                formula_$87 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != el_formula_p(formula_$87)) {
                        final SubLObject this_constraint = pph_variable_handling.pph_min_variable_isa_constraint(var, formula_$87, pph_vars.$pph_domain_mt$.getDynamicValue(thread), use_var_typing_clausesP, directlyP, validity_test);
                        if (NIL == constraint) {
                            constraint = this_constraint;
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    formula_$87 = cdolist_list_var.first();
                } 
            } else {
                final SubLObject new_format_string = cconcatenate($str223$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str224$__, format_nil.format_nil_a_no_copy($str316$Bad_FORMULA_argument_to_REGISTER_) });
                pph_error.pph_handle_error(new_format_string, list(formula));
            }

        if (NIL != constraint) {
            final SubLObject collection = (NIL != pph_vars.$pph_use_basic_var_typesP$.getDynamicValue(thread)) ? pph_basic_var_type_for_collection(constraint) : constraint;
            pph_variable_handling.pph_register_var(var, collection, UNPROVIDED);
        }
        return pph_variable_handling.pph_var_type(var);
    }

    public static SubLObject pph_basic_var_type_for_collection(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return genls.min_genls_among(col, pph_vars.$pph_basic_var_types$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED).first();
    }

    public static SubLObject remove_var_typing_clauses(final SubLObject formula, SubLObject specified_vars, SubLObject arg_position_map, SubLObject leave_sole_var_clausesP) {
        if (specified_vars == UNPROVIDED) {
            specified_vars = NIL;
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (leave_sole_var_clausesP == UNPROVIDED) {
            leave_sole_var_clausesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject badP = NIL;
        SubLObject paraphrase_formula_clauses = NIL;
        SubLObject vars = NIL;
        if (!T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread))) {
            return values(template, NIL, vars);
        }
        if (NIL != pph_utilities.pph_var_typing_clauseP(formula, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject new_paraphrase_formula_clause = handle_var_typing_clause(formula, arg_position_map, pph_utilities.pph_identity_template(), leave_sole_var_clausesP, specified_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject new_var = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != new_paraphrase_formula_clause) {
                paraphrase_formula_clauses = cons(new_paraphrase_formula_clause, paraphrase_formula_clauses);
            }
            if (NIL != new_var) {
                vars = cons(new_var, vars);
            }
        } else
            if (NIL != el_conjunction_p(formula)) {
                if (!specified_vars.isList()) {
                    specified_vars = list(specified_vars);
                }
                pph_register_exception_vars(formula);
                final SubLObject v_clauses = cycl_utilities.formula_args(formula, UNPROVIDED);
                SubLObject list_var = NIL;
                SubLObject clause = NIL;
                SubLObject clause_num = NIL;
                list_var = v_clauses;
                clause = list_var.first();
                for (clause_num = ZERO_INTEGER; (NIL == badP) && (NIL != list_var); list_var = list_var.rest() , clause = list_var.first() , clause_num = add(ONE_INTEGER, clause_num)) {
                    final SubLObject generic_arg = at_utilities.get_generic_arg(number_utilities.f_1X(clause_num));
                    final SubLObject clause_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, generic_arg);
                    if ((NIL != el_negation_p(clause)) || (NIL != el_disjunction_p(clause))) {
                        badP = T;
                    } else
                        if (NIL != pph_utilities.pph_var_typing_clauseP(clause, UNPROVIDED, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            final SubLObject new_paraphrase_formula_clause2 = handle_var_typing_clause(clause, clause_map, generic_arg, leave_sole_var_clausesP, specified_vars, clause_num, v_clauses, paraphrase_formula_clauses);
                            final SubLObject new_var2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != new_paraphrase_formula_clause2) {
                                paraphrase_formula_clauses = cons(new_paraphrase_formula_clause2, paraphrase_formula_clauses);
                            }
                            if (NIL != new_var2) {
                                vars = cons(new_var2, vars);
                            }
                        } else
                            if (NIL != generic_arg) {
                                paraphrase_formula_clauses = cons(generic_arg, paraphrase_formula_clauses);
                            } else {
                                paraphrase_formula_clauses = cons(pph_utilities.pph_identity_template(), paraphrase_formula_clauses);
                            }


                }
            } else {
                paraphrase_formula_clauses = cons(pph_utilities.pph_identity_template(), paraphrase_formula_clauses);
            }

        paraphrase_formula_clauses = nreverse(paraphrase_formula_clauses);
        if (NIL != badP) {
            template = $ERROR;
            SubLObject cdolist_list_var = vars;
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_variable_handling.pph_deregister_var(var);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
            vars = NIL;
        } else
            if (NIL == paraphrase_formula_clauses) {
                template = NIL;
            } else
                if (NIL != list_utilities.singletonP(paraphrase_formula_clauses)) {
                    template = paraphrase_formula_clauses.first();
                } else
                    if (NIL == vars) {
                        template = pph_utilities.pph_identity_template();
                    } else {
                        final SubLObject arg0_template = pph_utilities.pph_cycl_template_from_arg_position($list100);
                        template = make_el_formula(arg0_template, paraphrase_formula_clauses, UNPROVIDED);
                    }



        if (NIL != pph_utilities.pph_cycl_template_p(template)) {
            pph_register_different_vars(pph_utilities.pph_apply_template(template, formula));
        }
        return values(template, NIL != pph_utilities.pph_identity_template_p(template) ? NIL : pph_phrase.pph_code_justification(REMOVE_VAR_TYPING_CLAUSES, UNPROVIDED), vars);
    }

    public static SubLObject handle_var_typing_clause(final SubLObject clause, final SubLObject clause_map, final SubLObject template, final SubLObject leave_sole_var_clausesP, final SubLObject specified_vars, SubLObject clause_num, SubLObject v_clauses, SubLObject paraphrase_formula_clauses) {
        if (clause_num == UNPROVIDED) {
            clause_num = NIL;
        }
        if (v_clauses == UNPROVIDED) {
            v_clauses = NIL;
        }
        if (paraphrase_formula_clauses == UNPROVIDED) {
            paraphrase_formula_clauses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paraphrase_formula_clause = NIL;
        SubLObject new_var = NIL;
        thread.resetMultipleValues();
        final SubLObject var = pph_utilities.pph_parse_var_typing_clause(clause, clause_map);
        final SubLObject type = thread.secondMultipleValue();
        final SubLObject type_map = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str318$__Found_a_var_typing_clause__with, var, type, type_map, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL != specified_vars) && (NIL == subl_promotions.memberP(var, specified_vars, UNPROVIDED, UNPROVIDED))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str319$___S_does_not_type__S__Keeping_it, clause, specified_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            paraphrase_formula_clause = template;
        } else
            if ((NIL != leave_sole_var_clausesP) && (NIL != pph_sole_var_clause_p(var, clause_num, v_clauses, paraphrase_formula_clauses))) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str320$___S_is_only_remaining_var_typing, clause, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_variable_handling.pph_note_var_type(var, type);
                paraphrase_formula_clause = template;
            } else
                if ((NIL != pph_variable_handling.pph_var_registeredP(var)) && ((NIL != pph_variable_handling.pph_var_registered_as_defaultP(var)) || (NIL != pph_utilities.pph_genlP(type, pph_variable_handling.pph_var_type(var), pph_vars.$pph_domain_mt$.getDynamicValue(thread))))) {
                    pph_variable_handling.pph_register_var(var, type, type_map);
                    final SubLObject arg_position_template = (NIL != template) ? pph_utilities.make_formula_arg_naut(TWO_INTEGER, template) : $ARG2;
                    final SubLObject arg_position = pph_utilities.pph_arg_position_from_template(arg_position_template);
                    new_var = list(var, arg_position);
                } else
                    if ((NIL != pph_variable_handling.pph_var_registeredP(var)) && (NIL != pph_utilities.pph_genlP(pph_variable_handling.pph_var_type(var), type, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str321$___S_is_already_registered_as__S_, var, pph_variable_handling.pph_var_type(var), clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else
                        if (NIL != pph_variable_handling.pph_var_registeredP(var)) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str322$___S_is_already_registered_as__S_, var, pph_variable_handling.pph_var_type(var), clause, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            paraphrase_formula_clause = template;
                        } else {
                            pph_variable_handling.pph_register_var(var, type, type_map);
                            final SubLObject arg_position_template = (NIL != pph_utilities.pph_identity_template_p(template)) ? $ARG2 : pph_utilities.make_formula_arg_naut(TWO_INTEGER, template);
                            final SubLObject arg_position = pph_utilities.pph_arg_position_from_template(arg_position_template);
                            new_var = list(var, arg_position);
                        }




        return values(paraphrase_formula_clause, new_var);
    }

    public static SubLObject pph_var_has_better_typing_clause_p(final SubLObject var, final SubLObject clause_num, final SubLObject v_clauses) {
        final SubLObject current = nth(clause_num, v_clauses);
        SubLObject foundP = NIL;
        SubLObject list_var = NIL;
        SubLObject clause = NIL;
        SubLObject current_num = NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (current_num = ZERO_INTEGER; (NIL == foundP) && (NIL != list_var); list_var = list_var.rest() , clause = list_var.first() , current_num = add(ONE_INTEGER, current_num)) {
            if (current_num.numG(clause_num)) {
                foundP = pph_better_typing_clause_p(clause, current, var);
            }
        }
        return foundP;
    }

    public static SubLObject pph_better_typing_clause_p(final SubLObject clause, final SubLObject current, final SubLObject var) {
        SubLObject betterP = NIL;
        if (NIL != pph_utilities.pph_var_typing_clauseP(clause, var, UNPROVIDED)) {
            final SubLObject type = pph_utilities.pph_var_type_from_asent(clause);
            final SubLObject current_type = pph_utilities.pph_var_type_from_asent(current);
            betterP = pph_better_var_type_p(type, current_type);
        }
        return betterP;
    }

    public static SubLObject pph_better_var_type_p(final SubLObject type, final SubLObject current_type) {
        if ((NIL != cycl_variables.el_varP(current_type)) && (NIL == cycl_variables.el_varP(type))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_sole_var_clause_p(final SubLObject var, final SubLObject clause_num, final SubLObject v_clauses, final SubLObject paraphrase_formula_clauses) {
        SubLObject foundP = NIL;
        SubLObject list_var = NIL;
        SubLObject clause = NIL;
        SubLObject current_num = NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (current_num = ZERO_INTEGER; (NIL == foundP) && (NIL != list_var); list_var = list_var.rest() , clause = list_var.first() , current_num = add(ONE_INTEGER, current_num)) {
            if (current_num.numL(clause_num)) {
                foundP = makeBoolean((NIL != subl_promotions.memberP(at_utilities.get_generic_arg(number_utilities.f_1X(current_num)), paraphrase_formula_clauses, UNPROVIDED, UNPROVIDED)) && (NIL != cycl_utilities.expression_find(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            } else
                if (current_num.numG(clause_num)) {
                    foundP = cycl_utilities.expression_find(var, clause, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }

        }
        return makeBoolean(NIL == foundP);
    }

    public static SubLObject pph_register_exception_vars(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_exception_vars = NIL;
        if (NIL != cycl_utilities.expression_find_if(POSSIBLY_NEW_EXCEPTIONAL_VAR_P, formula, UNPROVIDED, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = $pph_new_exception_vars$.currentBinding(thread);
            try {
                $pph_new_exception_vars$.bind(NIL, thread);
                pph_register_exception_vars_recursive(formula);
                new_exception_vars = $pph_new_exception_vars$.getDynamicValue(thread);
            } finally {
                $pph_new_exception_vars$.rebind(_prev_bind_0, thread);
            }
        }
        return new_exception_vars;
    }

    public static SubLObject pph_register_exception_vars_recursive(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        final SubLObject allow_type_level_varsP = T;
        final SubLObject opaqueP = makeBoolean((NIL != fort_types_interface.function_in_any_mtP(operator)) || (NIL != pph_opaque_predP(operator, UNPROVIDED)));
        if (NIL != opaqueP) {
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, POSSIBLY_NEW_EXCEPTIONAL_VAR_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject var = NIL;
            var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_register_var_as_exception(var);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            } 
        } else {
            SubLObject list_var = NIL;
            SubLObject arg = NIL;
            SubLObject i = NIL;
            list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
            arg = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , i = add(ONE_INTEGER, i)) {
                if ((NIL == allow_type_level_varsP) && (NIL != possibly_new_exceptional_var_p(arg))) {
                    final SubLObject argnum = number_utilities.f_1X(i);
                    if (NIL != pph_reln_type_level_in_argP(operator, argnum, UNPROVIDED)) {
                        pph_register_var_as_exception(arg);
                    }
                } else
                    if ((NIL != pph_vars.$pph_register_exception_vars_recursivelyP$.getDynamicValue(thread)) && (NIL != el_formula_p(arg))) {
                        pph_register_exception_vars_recursive(arg);
                    }

            }
        }
        return NIL;
    }

    public static SubLObject possibly_new_exceptional_var_p(final SubLObject obj) {
        return makeBoolean((NIL != cycl_variables.el_varP(obj)) && (NIL == pph_exceptional_var_p(obj)));
    }

    public static SubLObject pph_opaque_predP_internal(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return makeBoolean((NIL != fort_types_interface.predicateP(obj)) && ((NIL != pph_utilities.pph_genl_predicateP(obj, $$sentenceImplies, mt)) || (NIL != pph_utilities.pph_removal_ask_boolean(listS($$genlInverse, obj, $list327), mt))));
    }

    public static SubLObject pph_opaque_predP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_opaque_predP_internal(obj, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym324$PPH_OPAQUE_PRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym324$PPH_OPAQUE_PRED_, TWO_INTEGER, $int$98, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym324$PPH_OPAQUE_PRED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (obj.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_opaque_predP_internal(obj, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_reln_type_level_in_argP_internal(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return makeBoolean((NIL != kb_accessors.argn_genl(reln, argnum, mt)) || (NIL != find($$Collection, kb_accessors.argn_isa(reln, argnum, mt), $sym331$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_reln_type_level_in_argP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_reln_type_level_in_argP_internal(reln, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_, THREE_INTEGER, $int$200, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(reln, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (reln.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_reln_type_level_in_argP_internal(reln, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(reln, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_register_var_as_exception(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $pph_new_exception_vars$.setDynamicValue(cons(var, $pph_new_exception_vars$.getDynamicValue(thread)), thread);
        return pph_variable_handling.pph_register_var(var, $EXCEPTION, UNPROVIDED);
    }

    public static SubLObject pph_exceptional_var_p(final SubLObject var) {
        return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p()) && $EXCEPTION.eql(pph_variable_handling.pph_var_type(var)));
    }

    public static SubLObject generate_cf_implication(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject if_arg = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
        SubLObject then_arg = cycl_utilities.formula_arg2(v_object, UNPROVIDED);
        final SubLObject if_negatedP = el_negation_p(if_arg);
        final SubLObject then_negatedP = el_negation_p(then_arg);
        SubLObject not_string = NIL;
        SubLObject if_not = NIL;
        SubLObject then_not = NIL;
        SubLObject format_string = NIL;
        format_string = $str336$if_it_had_a_been_the_case_that__a;
        not_string = cconcatenate($$$_, pph_main.pph_phrase_generate_string_from_cycl($$not, UNPROVIDED, UNPROVIDED));
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            format_string = pph_html.string_term_anchor(format_string, $$cfImplies);
        }
        if (NIL != if_negatedP) {
            if_arg = second(if_arg);
            if_not = not_string;
        } else {
            if_not = string_utilities.$empty_string$.getGlobalValue();
        }
        if (NIL != then_negatedP) {
            then_arg = second(then_arg);
            then_not = not_string;
        } else {
            then_not = string_utilities.$empty_string$.getGlobalValue();
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
        try {
            pph_vars.$pph_operator_scope_context$.bind(cons($IMPLIES, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread)), thread);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str241$Inside_operator_scope__S, $IMPLIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_string(phrase, format(NIL, format_string, new SubLObject[]{ if_not, pph_main.pph_phrase_generate_string_from_cycl(if_arg, UNPROVIDED, UNPROVIDED), then_not, pph_main.pph_phrase_generate_string_from_cycl(then_arg, UNPROVIDED, UNPROVIDED) }));
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str244$Leaving_operator_scope__S, $IMPLIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject generate_subcollection_with_relational_noun(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subcol_naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject subcol_fn = cycl_utilities.nat_functor(subcol_naut);
        final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        final SubLObject bin_pred = cycl_utilities.formula_arg2(subcol_naut, UNPROVIDED);
        final SubLObject bin_pred_supercollection_argnum = (NIL != isa.isaP(subcol_fn, $const340$SubcollectionRelationFunction_Inv, UNPROVIDED, UNPROVIDED)) ? TWO_INTEGER : ONE_INTEGER;
        final SubLObject bin_pred_modifier_argnum = subtract(THREE_INTEGER, bin_pred_supercollection_argnum);
        final SubLObject supercollection_arg = cycl_utilities.nat_arg1(subcol_naut, UNPROVIDED);
        final SubLObject modifier_arg = cycl_utilities.nat_arg3(subcol_naut, UNPROVIDED);
        if (NIL != subl_promotions.memberP(supercollection_arg, kb_accessors.argn_isa(bin_pred, bin_pred_supercollection_argnum, pph_vars.$pph_domain_mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str341$Generating_relational_noun_phrase, bin_pred, modifier_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            SubLObject doneP = NIL;
            final SubLObject assertions = pph_utilities.pph_sort_assertions(arg_in_reln_assertions_for_pred(bin_pred), UNPROVIDED, UNPROVIDED);
            if (NIL == doneP) {
                SubLObject csome_list_var = assertions;
                SubLObject arg_in_reln_as = NIL;
                arg_in_reln_as = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL != arg_in_reln_assertion_matches_head_of_subcollection_nautP(arg_in_reln_as, subcol_naut)) {
                        final SubLObject head_phrase = pph_methods_lexicon.pph_phrase_from_lexical_as(arg_in_reln_as, agr_preds, UNPROVIDED, UNPROVIDED);
                        final SubLObject head_arg_position = pph_utilities.pph_arg_position_lookup($list181, pph_phrase.pph_phrase_arg_position_map(phrase));
                        SubLObject dtrs = NIL;
                        pph_phrase.pph_phrase_set_cycl(head_phrase, bin_pred);
                        pph_phrase.pph_phrase_set_arg_position(head_phrase, head_arg_position);
                        if ((NIL == pph_utilities.pph_precise_in_argP(THREE_INTEGER)) && (NIL != subl_promotions.memberP(modifier_arg, kb_accessors.argn_isa(bin_pred, bin_pred_modifier_argnum, pph_vars.$pph_domain_mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED))) {
                            dtrs = list(head_phrase);
                        } else {
                            final SubLObject instance_levelP = pph_utilities.pph_isaP(subcol_fn, $const342$SubcollectionRelationFunction_Ins, UNPROVIDED);
                            final SubLObject arg3_phrase = (NIL != instance_levelP) ? bq_cons(pph_functions.termparaphrasefn_np(), $list343) : list(pph_functions.bestppfn(), $$Of_TheWord, list(pph_functions.bestdetnbarfn_indefinite(), bq_cons(pph_functions.termparaphrasefn_constrained(), $list345)));
                            final SubLObject modifier_phrase = pph_templates.pph_phrasify_phrase_naut(arg3_phrase, UNPROVIDED);
                            pph_templates.pph_template_phrase_set_cycl(modifier_phrase, subcol_naut, pph_phrase.pph_phrase_arg_position_map(phrase), NIL);
                            dtrs = list(head_phrase, modifier_phrase);
                        }
                        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, dtrs, UNPROVIDED);
                        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        try {
                            pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                            pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                        }
                        doneP = pph_phrase.pph_phrase_doneP(phrase);
                    }
                    csome_list_var = csome_list_var.rest();
                    arg_in_reln_as = csome_list_var.first();
                } 
            }
        }
        if ((NIL == pph_phrase.pph_phrase_doneP(phrase)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str346$Couldn_t_find_an_arg_in_reln_asse, subcol_naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject arg_in_reln_assertions_for_pred(final SubLObject bin_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = pph_methods_lexicon.pph_arg_in_reln_preds(UNPROVIDED);
        SubLObject arg_in_reln_pred = NIL;
        arg_in_reln_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject denotatum_arg = lexicon_utilities.denotatum_arg_of_pred_cached(arg_in_reln_pred);
            if (denotatum_arg.isInteger()) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    assertions = append(assertions, kb_mapping.gather_gaf_arg_index_with_predicate(bin_pred, denotatum_arg, arg_in_reln_pred, UNPROVIDED, UNPROVIDED));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_in_reln_pred = cdolist_list_var.first();
        } 
        return assertions;
    }

    public static SubLObject arg_in_reln_assertion_matches_head_of_subcollection_nautP(final SubLObject arg_in_reln_as, final SubLObject subcol_naut) {
        final SubLObject arg_in_reln_pred = assertions_high.gaf_arg0(arg_in_reln_as);
        final SubLObject v_arity = pph_utilities.pph_arity(arg_in_reln_pred);
        final SubLObject argnum = (NIL != v_arity) ? assertions_high.gaf_arg(arg_in_reln_as, v_arity) : NIL;
        if (!argnum.isInteger()) {
            return NIL;
        }
        if (ONE_INTEGER.eql(argnum) && (NIL != pph_utilities.pph_isaP(cycl_utilities.nat_functor(subcol_naut), $const347$SubcollectionRelationFunction_Can, UNPROVIDED))) {
            return T;
        }
        if (TWO_INTEGER.eql(argnum) && (NIL != pph_utilities.pph_isaP(cycl_utilities.nat_functor(subcol_naut), $const340$SubcollectionRelationFunction_Inv, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject generate_the_collection_with_rel_clause(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_col_naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
        SubLObject nat_rephrase_template = pph_utilities.pph_identity_template();
        SubLObject new_just = NIL;
        if (NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), $list350, UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(the_col_naut, UNPROVIDED);
            SubLObject var = NIL;
            SubLObject restriction_sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list351);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list351);
            restriction_sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject rephrase_template = remove_var_typing_clauses(restriction_sentence, list(var), arg_position_map, NIL);
                final SubLObject just = thread.secondMultipleValue();
                final SubLObject pairs = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != rephrase_template) {
                    if (NIL != pph_utilities.pph_identity_template_p(rephrase_template)) {
                        final SubLObject min_isa = pph_variable_handling.pph_min_variable_isa_constraint(var, restriction_sentence, pph_vars.$pph_domain_mt$.getDynamicValue(thread), NIL, NIL, $sym315$PPH_VALID_RELEVANT_VAR_TYPE_);
                        if (NIL != cycl_grammar.cycl_denotational_term_p(min_isa)) {
                            nat_rephrase_template = make_binary_formula($$CollectionSubsetFn, min_isa, make_binary_formula($$TheSetOf, $ARG1, $ARG2));
                        }
                    } else {
                        final SubLObject type = pph_variable_handling.pph_var_type(var);
                        nat_rephrase_template = make_binary_formula($$CollectionSubsetFn, type, make_binary_formula($$TheSetOf, $ARG1, pph_utilities.pph_apply_template(rephrase_template, $ARG2)));
                        new_just = just;
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list351);
            }
            if (NIL == pph_utilities.pph_identity_template_p(nat_rephrase_template)) {
                pph_phrase.pph_phrase_reset_cycl(phrase, nat_rephrase_template);
                final SubLObject info = pph_types.pph_method_info(GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, NIL);
                pph_types.pph_deregister_method_info(GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, info);
                try {
                    generate_collection_subset_with_rel_clause(phrase);
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        pph_types.pph_register_method_info(GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, info);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                if ((NIL != pph_phrase.pph_phrase_doneP(phrase)) && (NIL != new_just)) {
                    pph_phrase.pph_phrase_add_justification(phrase, new_just);
                }
            }
        }
        return phrase;
    }

    public static SubLObject generate_subcollection_with_rel_clause(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subcol_naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject agr_preds = pph_methods.pph_revised_nl_preds_for_phrase(phrase, UNPROVIDED);
        if (cycl_utilities.formula_operator(subcol_naut).eql($$CollectionSubsetFn)) {
            return generate_collection_subset_with_rel_clause(phrase);
        }
        if (NIL != pph_utilities.pph_special_handling_availableP(subcol_naut)) {
            return phrase;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
        try {
            pph_vars.$pph_current_arg0$.bind(cycl_utilities.formula_arg0(subcol_naut), thread);
            final SubLObject subcol_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject _prev_bind_0_$88 = pph_vars.$pph_current_arg0_position$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0_position$.bind(pph_utilities.pph_arg_position_lookup($list100, subcol_map), thread);
                final SubLObject templates = pph_rel_clause_templates(subcol_naut);
                if (NIL != templates) {
                    SubLObject doneP = NIL;
                    SubLObject justifications = NIL;
                    final SubLObject fn = cycl_utilities.nat_function(subcol_naut);
                    final SubLObject head_arg = cycl_utilities.nat_arg1(subcol_naut, UNPROVIDED);
                    final SubLObject embedded_sentence_template = pph_subcol_embedded_sentence_template(fn);
                    final SubLObject embedded_sentence = pph_subcol_embedded_sentence(subcol_naut);
                    final SubLObject embedded_sent_map = pph_utilities.pph_figure_new_arg_position_map(subcol_map, embedded_sentence_template);
                    final SubLObject head_arg_num = position(head_arg, embedded_sentence, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                    try {
                        pph_vars.$pph_link_arg0P$.bind(T, thread);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = templates;
                            SubLObject template = NIL;
                            template = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL != pph_template_ok_for_rel_clauseP(head_arg_num, template)) {
                                    final SubLObject category = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
                                    final SubLObject old_precision = pph_utilities.pph_current_precision();
                                    pph_utilities.pph_reset_precision(embedded_sentence_template);
                                    thread.resetMultipleValues();
                                    final SubLObject output_list = pph_subj_rel_clause_for_subcol(head_arg_num, embedded_sentence, agr_preds, fn, template, category, subcol_naut, embedded_sent_map);
                                    final SubLObject head_pred = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_doneP(template))) {
                                        if ((NIL != pph_phrase.pph_phrase_doneP(phrase)) && (NIL != pph_vars.pph_generate_alternative_phrasesP())) {
                                            final SubLObject alternative = pph_phrase.pph_phrase_copy(template, UNPROVIDED, UNPROVIDED);
                                            pph_phrase_resolution.pph_phrase_set_arg0_items(alternative, UNPROVIDED);
                                            pph_phrase.pph_phrase_add_alternative(phrase, alternative);
                                        } else {
                                            doneP = makeBoolean(NIL == pph_vars.pph_generate_alternative_phrasesP());
                                            pph_phrase.pph_phrase_copy(template, phrase, UNPROVIDED);
                                            pph_phrase_resolution.pph_phrase_set_arg0_items(phrase, UNPROVIDED);
                                        }
                                    } else
                                        if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                                            if (NIL != pph_utilities.pph_speech_part_predP(head_pred)) {
                                                pph_phrase.pph_phrase_set_agr_pred(phrase, head_pred, UNPROVIDED);
                                            }
                                            doneP = T;
                                            pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
                                            pph_phrase.pph_phrase_note_done(phrase);
                                            justifications = subcol_justifications_from_template(template);
                                        } else {
                                            pph_utilities.pph_set_precision(old_precision);
                                        }

                                }
                                csome_list_var = csome_list_var.rest();
                                template = csome_list_var.first();
                            } 
                        }
                        if ((NIL != doneP) && (NIL != justifications)) {
                            SubLObject cdolist_list_var = justifications;
                            SubLObject justification = NIL;
                            justification = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                pph_phrase.pph_phrase_add_justification(phrase, justification);
                                cdolist_list_var = cdolist_list_var.rest();
                                justification = cdolist_list_var.first();
                            } 
                        }
                    } finally {
                        pph_vars.$pph_link_arg0P$.rebind(_prev_bind_0_$89, thread);
                    }
                }
            } finally {
                pph_vars.$pph_current_arg0_position$.rebind(_prev_bind_0_$88, thread);
            }
        } finally {
            pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_collection_subset_with_rel_clause(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $pph_generate_collection_subset_with_rel_clauseP$.getDynamicValue(thread)) {
            return phrase;
        }
        final SubLObject coll_subset_naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        if (NIL != pph_utilities.pph_special_handling_availableP(coll_subset_naut)) {
            return phrase;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
        try {
            pph_vars.$pph_current_arg0$.bind(cycl_utilities.formula_arg0(coll_subset_naut), thread);
            final SubLObject subcol_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject _prev_bind_0_$90 = pph_vars.$pph_current_arg0_position$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0_position$.bind(pph_utilities.pph_arg_position_lookup($list100, subcol_map), thread);
                SubLObject subsentence_template_lists = NIL;
                SubLObject phrase_dtrs = NIL;
                SubLObject coordination_phrase_dtrs = NIL;
                SubLObject failP = NIL;
                thread.resetMultipleValues();
                final SubLObject embedded_sentence = pph_destructure_coll_subset(coll_subset_naut);
                final SubLObject head_var = thread.secondMultipleValue();
                final SubLObject head_arg = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject subsentences = pph_rel_clause_embedded_sentence_subsentences_and_connective(embedded_sentence);
                final SubLObject connective = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject rest;
                SubLObject subsentence;
                SubLObject templates;
                for (rest = NIL, rest = subsentences; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
                    subsentence = rest.first();
                    templates = pph_rel_clause_subsentence_templates(subsentence);
                    if (NIL != list_utilities.empty_list_p(templates)) {
                        failP = T;
                    } else {
                        subsentence_template_lists = cons(templates, subsentence_template_lists);
                    }
                }
                if (NIL == failP) {
                    subsentence_template_lists = nreverse(subsentence_template_lists);
                    final SubLObject embedded_sentence_template = make_binary_formula($$FormulaArgFn, TWO_INTEGER, $ARG2);
                    final SubLObject embedded_sentence_argpos_map = pph_utilities.pph_figure_new_arg_position_map(subcol_map, embedded_sentence_template);
                    SubLObject justifications = NIL;
                    SubLObject subsentence_index = ZERO_INTEGER;
                    final SubLObject single_subsentenceP = list_utilities.singletonP(subsentences);
                    SubLObject subsentence2 = NIL;
                    SubLObject subsentence_$91 = NIL;
                    SubLObject templates2 = NIL;
                    SubLObject templates_$92 = NIL;
                    subsentence2 = subsentences;
                    subsentence_$91 = subsentence2.first();
                    templates2 = subsentence_template_lists;
                    templates_$92 = templates2.first();
                    while ((NIL != templates2) || (NIL != subsentence2)) {
                        if (NIL == failP) {
                            SubLObject doneP = NIL;
                            final SubLObject first_subsentenceP = zerop(subsentence_index);
                            SubLObject subsentence_justifications = NIL;
                            final SubLObject subsentence_template = pph_coll_subset_embedded_sentence_subsentence_argpos_template(subsentence_$91, head_var, subsentence_index, connective);
                            final SubLObject subsentence_map = pph_utilities.pph_figure_new_arg_position_map(subcol_map, subsentence_template);
                            final SubLObject head_arg_num = position(head_var, subsentence_$91, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject _prev_bind_0_$91 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                            try {
                                pph_vars.$pph_link_arg0P$.bind(T, thread);
                                if (NIL == doneP) {
                                    SubLObject csome_list_var = templates_$92;
                                    SubLObject template = NIL;
                                    template = csome_list_var.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                        if ((NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) && (NIL != pph_template_ok_for_rel_clauseP(head_arg_num, template))) {
                                            pph_phrase.pph_phrase_set_mother(template, pph_phrase.pph_phrase_mother(phrase));
                                            final SubLObject category = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
                                            final SubLObject old_precision = pph_utilities.pph_current_precision();
                                            pph_utilities.pph_reset_precision(subsentence_template);
                                            thread.resetMultipleValues();
                                            final SubLObject output_list = pph_rel_clause_for_coll_subset(head_arg, head_var, subsentence_$91, agr_preds, template, category, coll_subset_naut, subsentence_map, first_subsentenceP, single_subsentenceP);
                                            final SubLObject head_pred = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_doneP(template))) {
                                                doneP = T;
                                                final SubLObject template_head_dtr = pph_phrase.pph_phrase_nth_dtr(template, ZERO_INTEGER);
                                                if (NIL != first_subsentenceP) {
                                                    final SubLObject template_that_dtr = pph_phrase.pph_phrase_nth_dtr(template, ONE_INTEGER);
                                                    phrase_dtrs = cons(pph_phrase.pph_phrase_copy(template_head_dtr, UNPROVIDED, UNPROVIDED), phrase_dtrs);
                                                    phrase_dtrs = cons(pph_phrase.pph_phrase_copy(template_that_dtr, UNPROVIDED, UNPROVIDED), phrase_dtrs);
                                                    pph_phrase.pph_phrase_set_string(template_that_dtr, string_utilities.$empty_string$.getGlobalValue());
                                                }
                                                pph_phrase.pph_phrase_set_string(template_head_dtr, string_utilities.$empty_string$.getGlobalValue());
                                                pph_phrase.pph_phrase_set_output_list(template_head_dtr, NIL, UNPROVIDED);
                                                pph_phrase.pph_phrase_note_not_done(template);
                                                pph_phrase_resolution.pph_phrase_get_string(template, UNPROVIDED, UNPROVIDED);
                                                coordination_phrase_dtrs = cons(template, coordination_phrase_dtrs);
                                            } else
                                                if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                                                    doneP = T;
                                                    if (NIL != first_subsentenceP) {
                                                        if (NIL != pph_utilities.pph_speech_part_predP(head_pred)) {
                                                            pph_phrase.pph_phrase_set_agr_pred(phrase, head_pred, UNPROVIDED);
                                                        }
                                                        pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
                                                    } else {
                                                        pph_phrase.pph_phrase_set_output_list(phrase, append(pph_phrase.pph_phrase_output_list(phrase), output_list.rest()), UNPROVIDED);
                                                    }
                                                    subsentence_justifications = subcol_justifications_from_template(template);
                                                } else {
                                                    pph_utilities.pph_set_precision(old_precision);
                                                }

                                        }
                                        csome_list_var = csome_list_var.rest();
                                        template = csome_list_var.first();
                                    } 
                                }
                                if (NIL != doneP) {
                                    justifications = append(subsentence_justifications, justifications);
                                    subsentence_index = number_utilities.f_1X(subsentence_index);
                                } else {
                                    failP = T;
                                }
                            } finally {
                                pph_vars.$pph_link_arg0P$.rebind(_prev_bind_0_$91, thread);
                            }
                        }
                        subsentence2 = subsentence2.rest();
                        subsentence_$91 = subsentence2.first();
                        templates2 = templates2.rest();
                        templates_$92 = templates2.first();
                    } 
                    if (NIL == failP) {
                        if (NIL != list_utilities.singletonP(coordination_phrase_dtrs)) {
                            final SubLObject coordination_phrase = list_utilities.only_one(coordination_phrase_dtrs);
                            phrase_dtrs = cons(coordination_phrase, phrase_dtrs);
                        } else {
                            final SubLObject coordination_phrase = pph_phrase.new_pph_coordination_phrase_low(nreverse(coordination_phrase_dtrs), pph_phrase.pph_opr_key_for_connective(connective), $UNORDERED);
                            pph_phrase.pph_phrase_set_cycl(coordination_phrase, embedded_sentence);
                            pph_phrase.pph_phrase_set_arg_position_map(coordination_phrase, embedded_sentence_argpos_map);
                            phrase_dtrs = cons(coordination_phrase, phrase_dtrs);
                        }
                        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, reverse(phrase_dtrs), ZERO_INTEGER);
                        final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
                        pph_phrase_resolution.pph_phrase_get_string(phrase_copy, UNPROVIDED, UNPROVIDED);
                        pph_phrase.pph_phrase_copy(phrase_copy, phrase, UNPROVIDED);
                        SubLObject cdolist_list_var = justifications;
                        SubLObject justification = NIL;
                        justification = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            pph_phrase.pph_phrase_add_justification(phrase, justification);
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        } 
                    }
                }
            } finally {
                pph_vars.$pph_current_arg0_position$.rebind(_prev_bind_0_$90, thread);
            }
        } finally {
            pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_subcol_embedded_sentence(final SubLObject subcol_naut) {
        final SubLObject fn = cycl_utilities.nat_function(subcol_naut);
        final SubLObject template = pph_subcol_embedded_sentence_template(fn);
        return pph_utilities.pph_apply_template(template, subcol_naut);
    }

    public static SubLObject pph_destructure_coll_subset(final SubLObject coll_subset_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(coll_subset_naut, UNPROVIDED);
        SubLObject coll = NIL;
        SubLObject cycl_set = NIL;
        destructuring_bind_must_consp(current, datum, $list357);
        coll = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list357);
        cycl_set = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != cycl_grammar.cycl_nat_p(cycl_set)) && cycl_utilities.nat_functor(cycl_set).eql($$TheSetOf)) {
                SubLObject current_$95;
                final SubLObject datum_$94 = current_$95 = cycl_utilities.nat_args(cycl_set, UNPROVIDED);
                SubLObject var = NIL;
                SubLObject set_constraint = NIL;
                destructuring_bind_must_consp(current_$95, datum_$94, $list358);
                var = current_$95.first();
                current_$95 = current_$95.rest();
                destructuring_bind_must_consp(current_$95, datum_$94, $list358);
                set_constraint = current_$95.first();
                current_$95 = current_$95.rest();
                if (NIL == current_$95) {
                    return values(set_constraint, var, coll);
                }
                cdestructuring_bind_error(datum_$94, $list358);
            }
        } else {
            cdestructuring_bind_error(datum, $list357);
        }
        return NIL;
    }

    public static SubLObject pph_rel_clause_embedded_sentence_subsentences_and_connective(final SubLObject embedded_sentence) {
        if (NIL != el_junction_p(embedded_sentence)) {
            return values(cycl_utilities.formula_args(embedded_sentence, UNPROVIDED), cycl_utilities.formula_operator(embedded_sentence));
        }
        return values(list(embedded_sentence), NIL);
    }

    public static SubLObject pph_subcol_embedded_sentence_template_internal(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical_arg_orderP = pph_utilities.pph_isaP(fn, $const347$SubcollectionRelationFunction_Can, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject type_level_arg3P = pph_utilities.pph_isaP(fn, $const360$SubcollectionRelationFunction_Typ, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        SubLObject args = list($ARG1, NIL != type_level_arg3P ? pph_utilities.pph_np_cycl_for_term_type($ARG3, $INDEFINITE, UNPROVIDED) : $ARG3);
        if (NIL == canonical_arg_orderP) {
            args = nreverse(args);
        }
        return make_el_formula($ARG2, args, UNPROVIDED);
    }

    public static SubLObject pph_subcol_embedded_sentence_template(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_subcol_embedded_sentence_template_internal(fn);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE, ONE_INTEGER, $int$48, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fn, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_subcol_embedded_sentence_template_internal(fn)));
            memoization_state.caching_state_put(caching_state, fn, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pph_coll_subset_embedded_sentence_subsentence_argpos_template(final SubLObject subsentence, final SubLObject head_var, final SubLObject subsentence_index, final SubLObject connective) {
        final SubLObject set_constraint_template = make_binary_formula($$FormulaArgFn, TWO_INTEGER, $ARG2);
        final SubLObject subsentence_template = (NIL == connective) ? set_constraint_template : make_binary_formula($$FormulaArgFn, number_utilities.f_1X(subsentence_index), set_constraint_template);
        return pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive(subsentence_template, subsentence, head_var);
    }

    public static SubLObject pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive(final SubLObject subsentence_template, final SubLObject subsentence, final SubLObject head_var) {
        SubLObject result = NIL;
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        list_var = subsentence;
        arg = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , argnum = add(ONE_INTEGER, argnum)) {
            SubLObject arg_template = NIL;
            if (arg.eql(head_var)) {
                arg_template = $ARG1;
            } else
                if (arg.isAtom()) {
                    arg_template = make_binary_formula($$FormulaArgFn, argnum, subsentence_template);
                } else
                    if (arg.isList()) {
                        arg_template = pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive(make_binary_formula($$FormulaArgFn, argnum, subsentence_template), arg, head_var);
                    } else {
                        final SubLObject new_format_string = cconcatenate($str223$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str224$__, format_nil.format_nil_a_no_copy($str364$_S_is_neither_an_atom_nor_a_list_) });
                        pph_error.pph_handle_error(new_format_string, list(arg));
                    }


            result = cons(arg_template, result);
        }
        return nreverse(result);
    }

    public static SubLObject pph_rel_clause_templates(final SubLObject subcol_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject embedded_sentence = pph_subcol_embedded_sentence(subcol_naut);
        final SubLObject pred = cycl_utilities.formula_operator(embedded_sentence);
        final SubLObject args = cycl_utilities.formula_args(embedded_sentence, UNPROVIDED);
        final SubLObject gen_format_style_templates = get_generation_template_as_list(pred, args, NIL);
        SubLObject gen_template_style_templates = NIL;
        SubLObject ans = NIL;
        assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(T, thread);
            gen_template_style_templates = pph_templates.pph_phrase_templates_for_formula(embedded_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        if (gen_template_style_templates.isList()) {
            SubLObject cdolist_list_var = gen_template_style_templates;
            SubLObject phrase = NIL;
            phrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
                    pph_phrase.pph_phrase_set_cycl(phrase, subcol_naut);
                    ans = cons(phrase, ans);
                    if (NIL != isa.isa_in_any_mtP(pred, $$SymmetricBinaryPredicate)) {
                        ans = cons(pph_phrase_resolution.pph_phrase_switch_arg1_and_arg2_in_dtrs(pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED)), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            } 
            ans = nreverse(ans);
        }
        return append(ans, gen_format_style_templates);
    }

    public static SubLObject pph_rel_clause_subsentence_templates(final SubLObject subsentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(subsentence);
        final SubLObject args = cycl_utilities.formula_args(subsentence, UNPROVIDED);
        SubLObject ans = NIL;
        SubLObject gen_format_style_templates = NIL;
        SubLObject gen_template_style_templates = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_search_limit$.currentBinding(thread);
        try {
            pph_vars.$pph_search_limit$.bind(ZERO_INTEGER, thread);
            gen_format_style_templates = get_generation_template_as_list(pred, args, NIL);
            gen_template_style_templates = pph_templates.pph_phrase_templates_for_formula(subsentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_search_limit$.rebind(_prev_bind_0, thread);
        }
        if (gen_template_style_templates.isList()) {
            SubLObject cdolist_list_var = gen_template_style_templates;
            SubLObject phrase = NIL;
            phrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
                    pph_phrase.pph_phrase_set_cycl(phrase, subsentence);
                    ans = cons(phrase, ans);
                    if (NIL != isa.isa_in_any_mtP(pred, $$SymmetricBinaryPredicate)) {
                        ans = cons(pph_phrase_resolution.pph_phrase_switch_arg1_and_arg2_in_dtrs(pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED)), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            } 
            ans = nreverse(ans);
        }
        return append(ans, gen_format_style_templates);
    }

    public static SubLObject pph_subj_rel_clause_for_subcol(final SubLObject head_arg_num, final SubLObject embedded_sentence, final SubLObject agr_preds, final SubLObject fn, final SubLObject template, final SubLObject category, final SubLObject subcol_naut, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) {
            pph_templates.pph_template_phrase_set_cycl(template, embedded_sentence, arg_position_map, UNPROVIDED);
            final SubLObject head_arg = cycl_utilities.formula_arg(embedded_sentence, head_arg_num, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject output_list = pph_subj_rel_clause_from_gentemplate(template, head_arg, agr_preds);
            final SubLObject pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) {
                pph_phrase_resolution.maybe_throw_pph_hl_supports(subcol_naut, pph_phrase.pph_phrase_string(template, NIL), agr_preds, pph_phrase.pph_phrase_gather_supports(template));
            }
            return values(output_list, pred);
        }
        if (NIL != assertion_handles.assertion_p(template)) {
            thread.resetMultipleValues();
            final SubLObject output_list2 = pph_subj_rel_clause_from_genformat(head_arg_num, embedded_sentence, fn, template, subcol_naut, arg_position_map);
            final SubLObject pred2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(output_list2, pred2);
        }
        return NIL;
    }

    public static SubLObject pph_rel_clause_for_coll_subset(final SubLObject head_arg, final SubLObject head_var, final SubLObject subsentence, final SubLObject agr_preds, final SubLObject template, final SubLObject category, final SubLObject subcol_naut, final SubLObject arg_position_map, final SubLObject first_subsentenceP, final SubLObject only_subsentenceP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject substituted_subsentence = cycl_utilities.expression_subst(head_arg, head_var, subsentence, symbol_function(EQ), UNPROVIDED);
        if (NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) {
            pph_templates.pph_template_phrase_set_cycl(template, substituted_subsentence, arg_position_map, UNPROVIDED);
            if (NIL != pph_phrase.pph_conditional_phrase_p(template)) {
                pph_phrase_resolution.pph_phrase_resolve_condition(template, substituted_subsentence, pph_phrase.pph_phrase_mother(template));
                if (NIL != pph_phrase.pph_conditional_phrase_p(template)) {
                    return values(NIL, $ANY);
                }
            }
            thread.resetMultipleValues();
            final SubLObject output_list = pph_rel_clause_from_gentemplate(template, head_arg, agr_preds, first_subsentenceP, only_subsentenceP);
            final SubLObject pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(output_list, pred);
        }
        if (NIL != assertion_handles.assertion_p(template)) {
            Errors.error($str366$PPH_REL_CLAUSE_FOR_COLL_SUBSET_ca, template);
        }
        return NIL;
    }

    public static SubLObject subcol_justifications_from_template(final SubLObject template) {
        if (NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) {
            return pph_phrase.pph_phrase_justification(template);
        }
        if (NIL != assertion_handles.assertion_p(template)) {
            return list(template);
        }
        return NIL;
    }

    public static SubLObject pph_subj_rel_clause_from_gentemplate(final SubLObject template, final SubLObject head_arg, final SubLObject agr_preds) {
        return pph_rel_clause_from_gentemplate(template, head_arg, agr_preds, T, T);
    }

    public static SubLObject pph_rel_clause_front_prepositionP(final SubLObject template, final SubLObject dtr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pph_front_prepositionsP$.getDynamicValue(thread);
    }

    public static SubLObject pph_rel_clause_from_gentemplate(final SubLObject template, final SubLObject head_arg, final SubLObject agr_preds, final SubLObject first_subsentenceP, final SubLObject only_subsentenceP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject extraction_target_dtr = pph_phrase_find_extractible_dtr_with_cycl(template, head_arg);
        final SubLObject extraction_target_dtr_num = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != extraction_target_dtr) {
            final SubLObject new_head_dtr = new_rel_clause_head_dtr(extraction_target_dtr, agr_preds);
            final SubLObject head_verb_dtr = pph_phrase.pph_phrase_head_dtr(template);
            final SubLObject possessiveP = makeBoolean((NIL != pph_phrase.pph_phrase_has_dtrsP(extraction_target_dtr)) && (NIL != pph_phrase.pph_phrase_possessiveP(pph_phrase.pph_phrase_nth_dtr(extraction_target_dtr, ZERO_INTEGER))));
            SubLObject rel_clause_startedP = NIL;
            SubLObject that_dtr = NIL;
            final SubLObject use_who_or_whomP = pph_utilities.pph_genlP(head_arg, $$Person, UNPROVIDED);
            SubLObject dtr_list = NIL;
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str368$__Trying_to_make_relative_clause_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_phrase.pph_phrase_p(head_verb_dtr, UNPROVIDED)) {
                pph_phrase_resolution.pph_phrase_unify_pos_preds(template, head_verb_dtr);
            }
            pph_phrase.pph_phrase_set_agr_preds(template, pph_phrase.pph_phrase_agr_preds(new_head_dtr, UNPROVIDED), UNPROVIDED);
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(template).isVector()) {
                final SubLObject vector_var = document.sign_constituents(template);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject whose_phrase;
                SubLObject copula;
                SubLObject that_position;
                SubLObject pronoun_case;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL == possessiveP) {
                        update_relative_agrs_in_relative_clause_dtr(dtr, new_head_dtr, extraction_target_dtr);
                    }
                    if ((NIL != possessiveP) && dtr_num.eql(extraction_target_dtr_num)) {
                        whose_phrase = pph_data_structures.new_pph_phrase($$$whose, pph_phrase.pph_empty_cycl(), UNPROVIDED);
                        pph_phrase.pph_phrase_set_category(whose_phrase, $$PossessivePhrase, UNPROVIDED);
                        pph_phrase.pph_phrase_set_nth_dtr(dtr, ZERO_INTEGER, whose_phrase);
                        dtr_list = cons(new_head_dtr, dtr_list);
                        dtr_list = cons(dtr, dtr_list);
                        rel_clause_startedP = T;
                    } else
                        if (dtr_num.eql(extraction_target_dtr_num)) {
                            if (NIL != pph_phrase.pph_phrase_ppP(dtr)) {
                                if (NIL != pph_rel_clause_front_prepositionP(template, dtr)) {
                                    pph_phrase.pph_phrase_append(pph_data_structures.new_pph_phrase(NIL != use_who_or_whomP ? $$$whom : $$$which, UNPROVIDED, UNPROVIDED), dtr);
                                    dtr_list = list_utilities.add_to_end(dtr, dtr_list);
                                    dtr_list = delete(that_dtr, dtr_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    rel_clause_startedP = T;
                                } else {
                                    dtr_list = cons(dtr, dtr_list);
                                }
                            }
                            if (((NIL != pph_phrase_resolution.pph_copular_complementP(dtr)) && (NIL != pph_phrase.pph_copula_phraseP(dtr_list.first()))) && (NIL != find(that_dtr, dtr_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str373$Moving_rel_clause_copula_to_immed, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                copula = dtr_list.first();
                                that_position = position(that_dtr, dtr_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                dtr_list = list_utilities.move_nth_to_position(ZERO_INTEGER, that_position, dtr_list);
                            }
                            dtr_list = list_utilities.add_to_end(new_head_dtr, dtr_list);
                        } else
                            if (NIL != rel_clause_startedP) {
                                dtr_list = cons(dtr, dtr_list);
                            } else {
                                if ((NIL != only_subsentenceP) && (NIL != pph_subj_rel_clause_template_ok_for_copula_removalP(template))) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str374$__Removing_copula_from_template__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if ((dtr.eql(head_verb_dtr) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) && pph_phrase.pph_phrase_wu(dtr, UNPROVIDED).eql($$Have_TheWord)) {
                                        dtr_list = cons(pph_data_structures.new_pph_phrase($$$with, UNPROVIDED, UNPROVIDED), dtr_list);
                                    } else {
                                        if (NIL != first_subsentenceP) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str377$__Adding_relative_pronoun_to_temp, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            pronoun_case = pph_phrase.pph_phrase_case(extraction_target_dtr);
                                            that_dtr = pph_data_structures.new_pph_phrase($$$that, pph_phrase.pph_empty_cycl(), UNPROVIDED);
                                            pph_phrase.pph_phrase_set_case(that_dtr, pronoun_case, UNPROVIDED);
                                            if (NIL != use_who_or_whomP) {
                                                pph_question.pph_phrase_set_who_or_whom(that_dtr, UNPROVIDED);
                                            }
                                            dtr_list = cons(that_dtr, dtr_list);
                                        }
                                        dtr_list = cons(dtr, dtr_list);
                                    }

                                rel_clause_startedP = T;
                            }


                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            final SubLObject head_dtr_num = ZERO_INTEGER;
            pph_phrase.set_pph_phrase_dtrs_from_list(template, nreverse(dtr_list), head_dtr_num);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str379$__Template_now_has__D_dtrs___, pph_phrase.pph_phrase_dtr_count(template), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_category(template, pph_utilities.pph_nbar_category(), UNPROVIDED);
            pph_phrase_resolution.pph_phrase_get_string(template, UNPROVIDED, UNPROVIDED);
        }
        return values(pph_phrase.pph_phrase_output_list(template), pph_phrase.pph_phrase_agr_preds(template, UNPROVIDED));
    }

    public static SubLObject new_rel_clause_head_dtr(final SubLObject extraction_target_dtr, final SubLObject agr_preds) {
        SubLObject new_head_dtr = NIL;
        if ((NIL != pph_phrase.pph_phrase_has_dtrsP(extraction_target_dtr)) && (NIL != pph_phrase.pph_phrase_possessiveP(pph_phrase.pph_phrase_nth_dtr(extraction_target_dtr, ZERO_INTEGER)))) {
            new_head_dtr = pph_phrase.pph_phrase_copy(pph_phrase.pph_phrase_nth_dtr(extraction_target_dtr, ZERO_INTEGER), UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_set_category(new_head_dtr, pph_utilities.pph_np_category(), UNPROVIDED);
        } else
            if (NIL != pph_phrase.pph_phrase_npP(extraction_target_dtr)) {
                new_head_dtr = pph_phrase.pph_phrase_copy(extraction_target_dtr, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != pph_phrase.pph_phrase_ppP(extraction_target_dtr)) {
                    final SubLObject obj_of_prep = pph_phrase.pph_phrase_extract_dtr_num(ONE_INTEGER, extraction_target_dtr);
                    new_head_dtr = pph_phrase.pph_phrase_copy(obj_of_prep, UNPROVIDED, UNPROVIDED);
                } else {
                    final SubLObject new_format_string = cconcatenate($str223$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str224$__, format_nil.format_nil_a_no_copy($str380$Can_t_determine_relative_clause_h) });
                    pph_error.pph_handle_error(new_format_string, list(extraction_target_dtr));
                }


        if (NIL != new_head_dtr) {
            pph_phrase.pph_phrase_set_category(new_head_dtr, $$Noun, UNPROVIDED);
            final SubLObject head_agr_preds = pph_utilities.pph_filter_preds(agr_preds, $list350, UNPROVIDED);
            final SubLObject agr_constraint = pph_phrase.pph_phrase_agr_constraint_for_preds(head_agr_preds);
            pph_phrase.pph_phrase_set_agr(new_head_dtr, pph_data_structures.new_pph_phrase_agr(agr_constraint, UNPROVIDED), UNPROVIDED);
        }
        return new_head_dtr;
    }

    public static SubLObject update_relative_agrs_in_relative_clause_dtr(final SubLObject dtr, final SubLObject new_head_dtr, final SubLObject extraction_target_dtr) {
        if (NIL != pph_phrase.pph_phrase_p(new_head_dtr, UNPROVIDED)) {
            SubLObject cdolist_list_var = pph_utilities.pph_relative_agr_constraint_types();
            SubLObject constraint_type = NIL;
            constraint_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (extraction_target_dtr.eql(pph_phrase.pph_phrase_agr_target_of_type(dtr, constraint_type))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str382$Updating__S_of__S___to__S, constraint_type, dtr, new_head_dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_set_agr_constraint(dtr, pph_utilities.new_pph_agr_constraint(constraint_type, new_head_dtr), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint_type = cdolist_list_var.first();
            } 
        }
        return new_head_dtr;
    }

    public static SubLObject pph_subj_rel_clause_template_ok_for_copula_removalP(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $pph_allow_copula_removalP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (!pph_phrase.pph_phrase_wu(pph_phrase.pph_phrase_nth_dtr(template, ONE_INTEGER), UNPROVIDED).eql($$Be_TheWord)) {
            return NIL;
        }
        if ((NIL != list_utilities.lengthG(pph_phrase.pph_phrase_dtrs(template), THREE_INTEGER, UNPROVIDED)) && (NIL == pph_utilities.pph_npP(pph_phrase.pph_phrase_find_or_set_category(pph_phrase.pph_phrase_nth_dtr(template, TWO_INTEGER))))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_subj_rel_clause_from_genformat(final SubLObject head_arg_num, final SubLObject embedded_sentence, final SubLObject fn, final SubLObject template, final SubLObject subcol_naut, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject format_string = get_genformat_string_and_list(template);
        final SubLObject arg_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject output_list = NIL;
        final SubLObject arg_list_processing_result = process_genformat_arglist(embedded_sentence, fn, cycl_utilities.formula_args(embedded_sentence, UNPROVIDED), arg_list, arg_position_map, UNPROVIDED);
        SubLObject head_arg_string = NIL;
        SubLObject head_pred = NIL;
        SubLObject head_arg_justification = NIL;
        SubLObject head_arg_olist = NIL;
        if (NIL != list_utilities.proper_list_p(arg_list_processing_result)) {
            assert NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(ONE_INTEGER, subcol_naut)) : "pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(CommonSymbols.ONE_INTEGER, subcol_naut)) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(CommonSymbols.ONE_INTEGER, subcol_naut)) " + pph_utilities.paraphrase_precision_for_arg(ONE_INTEGER, subcol_naut);
            final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(ONE_INTEGER, subcol_naut), thread);
                final SubLObject head_arg_position = list(head_arg_num);
                final SubLObject head_arg_position_template = pph_utilities.pph_cycl_template_from_arg_position(head_arg_position);
                final SubLObject head_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, head_arg_position_template);
                thread.resetMultipleValues();
                final SubLObject head_arg_string_$96 = pph_main.pph_phrase_generate_string_from_cycl(cycl_utilities.formula_arg(embedded_sentence, head_arg_num, UNPROVIDED), $list78, head_map);
                final SubLObject head_pred_$97 = thread.secondMultipleValue();
                final SubLObject head_arg_justification_$98 = thread.thirdMultipleValue();
                final SubLObject head_arg_olist_$99 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                head_arg_string = head_arg_string_$96;
                head_pred = head_pred_$97;
                head_arg_justification = head_arg_justification_$98;
                head_arg_olist = head_arg_olist_$99;
            } finally {
                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
            }
            final SubLObject all_arg_olists = arg_list_processing_result;
            final SubLObject non_head_arg_olists = all_arg_olists.rest();
            final SubLObject embedded_arg0 = cycl_utilities.formula_arg0(embedded_sentence);
            final SubLObject _prev_bind_2 = pph_vars.$pph_current_arg0$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0$.bind(embedded_arg0, thread);
                format_string = pph_subj_rel_clause_adjust_format_string(format_string);
                output_list = pph_output_list_from_format_string_and_args(format_string, embedded_arg0, cons(head_arg_olist, non_head_arg_olists), arg_position_map);
            } finally {
                pph_vars.$pph_current_arg0$.rebind(_prev_bind_2, thread);
            }
        }
        return values(output_list, head_pred);
    }

    public static SubLObject pph_subj_rel_clause_adjust_format_string(SubLObject format_string) {
        final SubLObject format_string_rest = string_utilities.pre_remove(format_string, $str384$_a_, UNPROVIDED);
        final SubLObject format_strings_rest = string_utilities.string_tokenize(format_string_rest, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (((((NIL != list_utilities.lengthG(format_strings_rest, TWO_INTEGER, UNPROVIDED)) && (NIL != string_utilities.starts_with(format_string_rest, $$$is_))) && (NIL == pph_variable_handling.pph_string_is_posP(second(format_strings_rest), $$Determiner, $NEVER, UNPROVIDED))) && (NIL == pph_variable_handling.pph_string_is_posP(second(format_strings_rest), $$Adverb, $NEVER, UNPROVIDED))) && (NIL == pph_variable_handling.pph_string_is_posP(second(format_strings_rest), $$Adjective, $NEVER, UNPROVIDED))) {
            format_string = cconcatenate($str384$_a_, string_utilities.pre_remove(format_string_rest, $$$is_, UNPROVIDED));
        } else {
            format_string = cconcatenate($str390$_a_that_, format_string_rest);
        }
        return format_string;
    }

    public static SubLObject pph_template_ok_for_rel_clauseP(final SubLObject head_arg_num, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles.assertion_p(template)) {
            thread.resetMultipleValues();
            final SubLObject template_string = get_genformat_string_and_list(template);
            final SubLObject arg_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((((head_arg_num.eql(ONE_INTEGER) && (NIL == arg_list)) || arg_list.first().eql(head_arg_num)) && (NIL != genformat_string_arg_initialP(template_string))) && (NIL != member($$thirdPersonSg_Present, pph_preds_of_string(second(string_utilities.split_string(template_string, UNPROVIDED))), UNPROVIDED, UNPROVIDED)));
        }
        if (NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) {
            final SubLObject cycl_template = pph_utilities.pph_cycl_template_from_arg_position(list(head_arg_num));
            return pph_phrase_has_extractible_dtr_with_cyclP(template, cycl_template);
        }
        return NIL;
    }

    public static SubLObject pph_preds_of_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$100 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                    preds = lexicon_utilities.preds_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$100, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject pph_phrase_has_extractible_dtr_with_cyclP(final SubLObject phrase, final SubLObject cycl) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        if (NIL == pph_phrase.pph_conditional_phrase_p(phrase)) {
            return list_utilities.sublisp_boolean(pph_phrase_find_extractible_dtr_with_cycl(phrase, cycl));
        }
        SubLObject current;
        final SubLObject datum = current = pph_phrase.pph_conditional_phrase_values(phrase);
        SubLObject phrase_if = NIL;
        SubLObject phrase_if_not = NIL;
        destructuring_bind_must_consp(current, datum, $list392);
        phrase_if = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list392);
        phrase_if_not = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != pph_phrase_has_extractible_dtr_with_cyclP(phrase_if, cycl)) && (NIL != pph_phrase_has_extractible_dtr_with_cyclP(phrase_if_not, cycl)));
        }
        cdestructuring_bind_error(datum, $list392);
        return NIL;
    }

    public static SubLObject pph_phrase_find_extractible_dtr_with_cycl(final SubLObject phrase, final SubLObject cycl) {
        SubLObject extractible_dtr = NIL;
        SubLObject extractible_dtr_num = NIL;
        if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            pph_phrase_resolution.pph_phrase_resolve_condition(phrase, cycl, NIL);
        }
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            if (NIL == pph_phrase.pph_conditional_phrase_p(phrase)) {
                SubLObject dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject first_dtr;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        dtr = aref(vector_var, element_num);
                        if (NIL == extractible_dtr) {
                            if ((NIL != pph_phrase.pph_phrase_npP(dtr)) && cycl.equal(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED))) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str393$Found_extractible_dtr______S, dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                extractible_dtr = dtr;
                                extractible_dtr_num = dtr_num;
                            } else
                                if ((dtr_num.eql(ZERO_INTEGER) && (NIL != pph_phrase.pph_phrase_npP(dtr))) && (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr))) {
                                    first_dtr = pph_phrase.pph_phrase_nth_dtr(dtr, ZERO_INTEGER);
                                    if ((NIL != pph_phrase.pph_phrase_possessiveP(first_dtr)) && cycl.equal(pph_phrase.pph_phrase_cycl(first_dtr, UNPROVIDED))) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format_nil.force_format(T, $str393$Found_extractible_dtr______S, dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        extractible_dtr = dtr;
                                        extractible_dtr_num = dtr_num;
                                    }
                                } else
                                    if ((NIL != pph_phrase.pph_phrase_ppP(dtr)) && (NIL != pph_phrase_has_extractible_dtr_with_cyclP(dtr, cycl))) {
                                        extractible_dtr = dtr;
                                        extractible_dtr_num = dtr_num;
                                    }


                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
        }
        return values(extractible_dtr, extractible_dtr_num);
    }

    public static SubLObject pph_phrase_cycl_containsP(final SubLObject phrase, final SubLObject item, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != cycl_utilities.expression_find(item, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), penetrate_hl_structuresP, test, key)) {
            return T;
        }
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var;
            SubLObject dtr;
            for (csome_list_var = pph_phrase.pph_phrase_dtr_list(phrase), dtr = NIL, dtr = csome_list_var.first(); (NIL == foundP) && (NIL != csome_list_var); foundP = pph_phrase_cycl_containsP(dtr, item, penetrate_hl_structuresP, test, key) , csome_list_var = csome_list_var.rest() , dtr = csome_list_var.first()) {
            }
        }
        return foundP;
    }

    public static SubLObject generate_phrase_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str396$__In_GENERATE_PHRASE_NAUT___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str397$__Precision_is__S___, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject phrase_naut = pph_templates.pph_expand_phrase_nauts(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
            final SubLObject old_agr = pph_phrase.pph_phrase_agr(phrase);
            final SubLObject v_pph_phrase = pph_phrase.new_pph_phrase_for_cycl(phrase_naut, UNPROVIDED, UNPROVIDED);
            abortP = makeBoolean(NIL == pph_phrase.pph_phrase_p(v_pph_phrase, UNPROVIDED));
            if (NIL == abortP) {
                pph_phrase.pph_phrase_copy(v_pph_phrase, phrase, UNPROVIDED);
                if (NIL == pph_phrase.pph_phrase_agr(phrase)) {
                    pph_phrase.pph_phrase_set_agr(phrase, old_agr, UNPROVIDED);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == abortP) {
            do_generate_phrase_from_template(phrase);
        }
        return phrase;
    }

    public static SubLObject generate_specified_scope_sentence(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), $list272, UNPROVIDED)) {
            final SubLObject rmp_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject rmp = cycl_utilities.formula_arg0(rmp_formula);
            final SubLObject unambiguousP = scopally_unambiguousP(rmp);
            if (NIL != indexed_term_p(rmp)) {
                final SubLObject wide_scope_argnum = wide_scope_arg_in_pred(rmp);
                final SubLObject new_sent_template = intermediate_cycl_template_for_rmp_formula(rmp_formula);
                final SubLObject plural_subjectP = NIL;
                if (NIL == pph_utilities.pph_identity_template_p(new_sent_template)) {
                    final SubLObject spec_scope_phrase = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
                    pph_phrase.pph_phrase_reset_cycl(spec_scope_phrase, new_sent_template);
                    final SubLObject new_sent = pph_phrase.pph_phrase_cycl(spec_scope_phrase, UNPROVIDED);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str400$__Replacing_rule_macro_formula___, rmp_formula, new_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    assert NIL != pph_utilities.pph_precision_p(pph_utilities.pph_current_precision()) : "pph_utilities.pph_precision_p(pph_utilities.pph_current_precision()) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(pph_utilities.pph_current_precision()) " + pph_utilities.pph_current_precision();
                    final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(pph_utilities.pph_current_precision(), thread);
                        pph_utilities.pph_reset_precision(new_sent_template);
                        pph_phrase_generate_with_proper_scope(spec_scope_phrase, new_sent, wide_scope_argnum, plural_subjectP, unambiguousP);
                    } finally {
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(spec_scope_phrase)) {
                        final SubLObject original_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                        pph_add_arg0_links_for_specified_scope_phrase(spec_scope_phrase, rmp, original_map);
                        pph_phrase.pph_phrase_copy(spec_scope_phrase, phrase, UNPROVIDED);
                    }
                }
                if ((NIL == pph_phrase.pph_phrase_doneP(phrase)) && (NIL == unambiguousP)) {
                    final SubLObject info = pph_types.pph_method_info(GENERATE_IMPLICATION_SMART, $IMPLICATION);
                    pph_types.pph_deregister_method_info(GENERATE_IMPLICATION_SMART, info);
                    try {
                        generate_rmp_sentence_via_expansion(phrase);
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            pph_types.pph_register_method_info(GENERATE_IMPLICATION_SMART, info);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str401$__GENERATE_SPECIFIED_SCOPE_SENTEN, pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_add_arg0_links_for_specified_scope_phrase(final SubLObject spec_scope_phrase, final SubLObject rmp, final SubLObject map) {
        final SubLObject arg0_pos = pph_utilities.pph_arg_position_lookup($list100, map);
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(spec_scope_phrase);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == pph_data_structures.pph_phrase_output_item_arg_position(item)) && (NIL == pph_data_structures.pph_phrase_output_item_cycl(item))) {
                pph_data_structures.pph_phrase_output_item_set_arg_position(item, arg0_pos);
                pph_data_structures.pph_phrase_output_item_set_cycl(item, rmp);
                pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(item, rmp);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return pph_phrase.pph_phrase_output_list(spec_scope_phrase);
    }

    public static SubLObject generate_rmp_sentence_via_expansion(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(T, thread);
            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            pph_utilities.pph_phrase_rephrase_cycl(phrase, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        final SubLObject expanded_sent = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if ((!expanded_sent.equal(original_cycl)) && (NIL == cycl_utilities.expression_find_if($sym404$COMMON_NON_SKOLEM_INDETERMINATE_TERM_DENOTING_FUNCTION_, expanded_sent, UNPROVIDED, UNPROVIDED))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str405$Replacing_rule_macro_formula____S, original_cycl, expanded_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject _prev_bind_3 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$102 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_5 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    try {
                        if (NIL != el_implication_p(expanded_sent)) {
                            SubLObject cdolist_list_var = pph_utilities.pph_vars_to_quantify(expanded_sent);
                            SubLObject free_var = NIL;
                            free_var = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                pph_variable_handling.pph_register_var_quantifier(free_var, $EXISTENTIAL);
                                cdolist_list_var = cdolist_list_var.rest();
                                free_var = cdolist_list_var.first();
                            } 
                        }
                        pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                        }
                    }
                } finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_5, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_4, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$102, thread);
                }
            } finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_3, thread);
            }
        }
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            final SubLObject current_arg0 = cycl_utilities.formula_arg0(original_cycl);
            final SubLObject current_arg0_position = pph_utilities.pph_arg_position_lookup($list100, map);
            final SubLObject justs = pph_phrase.pph_phrase_justification(phrase);
            SubLObject expansion_justs = NIL;
            SubLObject cdolist_list_var2 = justs;
            SubLObject just = NIL;
            just = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if ((((NIL != assertion_handles.assertion_p(just)) && (NIL != assertions_high.gaf_assertionP(just))) && assertions_high.gaf_arg0(just).eql($$expansion)) && assertions_high.gaf_arg1(just).eql(current_arg0)) {
                    expansion_justs = cons(just, expansion_justs);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                just = cdolist_list_var2.first();
            } 
            cdolist_list_var2 = pph_phrase.pph_phrase_output_list(phrase);
            SubLObject item = NIL;
            item = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (pph_data_structures.pph_phrase_output_item_arg_position(item).equal(current_arg0_position) && (!pph_data_structures.pph_phrase_output_item_cycl(item).equal(current_arg0))) {
                    pph_data_structures.pph_phrase_output_item_set_cycl(item, current_arg0);
                    pph_data_structures.pph_phrase_output_item_set_arg_position(item, current_arg0_position);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                item = cdolist_list_var2.first();
            } 
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_generate_with_proper_scope(final SubLObject phrase, final SubLObject intermediate_cycl_formula, final SubLObject wide_scope_argnum, final SubLObject plural_subjectP, final SubLObject unambiguousP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str407$__Looking_for_a_template_for__S__, intermediate_cycl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        pph_phrase_generate_with_proper_scopeXpred(phrase, intermediate_cycl_formula, NIL, wide_scope_argnum, plural_subjectP, unambiguousP);
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if (NIL != unambiguousP) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str408$Abandoning_search_because__S_is_u, intermediate_cycl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                final SubLObject original_pred = cycl_utilities.formula_arg0(intermediate_cycl_formula);
                SubLObject doneP = NIL;
                final SubLObject tgps = pph_utilities.pph_typed_genl_preds(original_pred, UNPROVIDED);
                SubLObject search_level = ZERO_INTEGER;
                final SubLObject search_limit = pph_utilities.pph_search_limit();
                if (NIL == doneP) {
                    SubLObject csome_list_var = tgps;
                    SubLObject tgp = NIL;
                    tgp = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        final SubLObject formula = replace_formula_arg(ZERO_INTEGER, tgp, intermediate_cycl_formula);
                        pph_phrase_generate_with_proper_scopeXpred(phrase, formula, NIL, wide_scope_argnum, plural_subjectP, unambiguousP);
                        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                            pph_phrase_adjust_arg0_links(phrase, tgp, original_pred);
                            doneP = T;
                        } else
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str409$__No_template_found_for__S___, tgp, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }

                        csome_list_var = csome_list_var.rest();
                        tgp = csome_list_var.first();
                    } 
                }
                if (NIL == doneP) {
                    final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                    final SubLObject node_var = original_pred;
                    final SubLObject deck_type = ($DEPTH == $DEPTH) ? $STACK : $QUEUE;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$104 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = $$True_JustificationTruth;
                                final SubLObject _prev_bind_0_$105 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$106 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str122$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str117$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$106 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$107 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$109 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(original_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$107 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$108 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$110 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                for (node_and_predicate_mode = list(original_pred, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == doneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$113 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                    final SubLObject genl_pred = node_var_$113;
                                                    final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        final SubLObject inverseP = predicate_mode;
                                                        if (!original_pred.eql(genl_pred)) {
                                                            if (NIL == member(genl_pred, tgps, UNPROVIDED, UNPROVIDED)) {
                                                                if (search_level.numGE(search_limit)) {
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                        format_nil.force_format(T, $str410$__Search_limit_exceeded___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                    doneP = T;
                                                                } else {
                                                                    final SubLObject formula2 = replace_formula_arg(ZERO_INTEGER, genl_pred, intermediate_cycl_formula);
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                                        format_nil.force_format(T, $str411$__Search_level_is__S_of__S__, search_level, search_limit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                    pph_phrase_generate_with_proper_scopeXpred(phrase, formula2, inverseP, wide_scope_argnum, plural_subjectP, unambiguousP);
                                                                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                                                        pph_phrase_adjust_arg0_links(phrase, genl_pred, original_pred);
                                                                        doneP = T;
                                                                    } else {
                                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                            format_nil.force_format(T, $str409$__No_template_found_for__S___, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                        search_level = add(search_level, ONE_INTEGER);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$109;
                                                        SubLObject _prev_bind_1_$109;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$110;
                                                        SubLObject iteration_state_$118;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$111;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$120;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$112;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var3;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = NIL, rest = accessible_modules; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$109 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$109 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                node = function_terms.naut_to_nart(node_var_$113);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        for (iteration_state_$118 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$118)); iteration_state_$118 = dictionary_contents.do_dictionary_contents_next(iteration_state_$118)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$118);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            if (NIL == doneP) {
                                                                                                                csome_list_var2 = sol;
                                                                                                                node_vars_link_node2 = NIL;
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        } else {
                                                                                                            Errors.error($str123$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$111, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$118);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$110, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str124$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        for (rest_$120 = NIL, rest_$120 = new_list; (NIL == doneP) && (NIL != rest_$120); rest_$120 = rest_$120.rest()) {
                                                                            generating_fn = rest_$120.first();
                                                                            _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        if (NIL == doneP) {
                                                                                            csome_list_var3 = sol2;
                                                                                            node_vars_link_node4 = NIL;
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                            while ((NIL == doneP) && (NIL != csome_list_var3)) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                            } 
                                                                                        }
                                                                                    } else {
                                                                                        Errors.error($str123$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$112, thread);
                                                                            }
                                                                        }
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$109, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$109, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$108, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$110, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$108, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$107, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str125$Node__a_does_not_pass_sbhl_type_t, original_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$109, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$107, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$106, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$106, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$105, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$104, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_adjust_arg0_links(final SubLObject phrase, final SubLObject bad_arg0, final SubLObject good_arg0) {
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject arg0_pos = pph_utilities.pph_arg_position_lookup($list100, map);
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(phrase);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (pph_data_structures.pph_phrase_output_item_arg_position(item).equal(arg0_pos) && pph_data_structures.pph_phrase_output_item_cycl(item).equal(bad_arg0)) {
                pph_data_structures.pph_phrase_output_item_set_cycl(item, good_arg0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject scopally_unambiguousP_internal(final SubLObject rmp) {
        final SubLObject unambiguousP = list_utilities.singletonP(quant_over_arg_tuples(rmp));
        if ((NIL != unambiguousP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER))) {
            format_nil.force_format(T, $str413$___S_is_not_ambiguous_with_respec, rmp, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return unambiguousP;
    }

    public static SubLObject scopally_unambiguousP(final SubLObject rmp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return scopally_unambiguousP_internal(rmp);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym412$SCOPALLY_UNAMBIGUOUS_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym412$SCOPALLY_UNAMBIGUOUS_, ONE_INTEGER, $int$212, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym412$SCOPALLY_UNAMBIGUOUS_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rmp, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(scopally_unambiguousP_internal(rmp)));
            memoization_state.caching_state_put(caching_state, rmp, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pph_phrase_generate_with_proper_scopeXpred(final SubLObject phrase, final SubLObject formula, final SubLObject inverseP, final SubLObject wide_scope_argnum, final SubLObject plural_subjectP, final SubLObject unambiguousP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_types_shadow = dictionary_utilities.copy_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$pph_var_types_counter$.currentBinding(thread);
        try {
            pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
            pph_macros.$pph_var_types_counter$.bind(number_utilities.f_1X(pph_macros.$pph_var_types_counter$.getDynamicValue(thread)), thread);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str415$__Entering_PPH_SETTING_VAR_TYPES_, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            try {
                final SubLObject _prev_bind_0_$123 = pph_vars.$pph_var_types$.currentBinding(thread);
                try {
                    pph_vars.$pph_var_types$.bind(var_types_shadow, thread);
                    final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                    final SubLObject solution = find_proper_scope_gentemplate_phrase(formula, inverseP, wide_scope_argnum, unambiguousP, arg_position_map);
                    if (NIL != pph_phrase.pph_phrase_p(solution, UNPROVIDED)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str416$__Paraphrasing_formula__S__, pph_phrase.pph_phrase_cycl(solution, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_phrase.pph_phrase_add_agr_preds(solution, pph_phrase.pph_phrase_absolute_agr_preds(phrase), UNPROVIDED);
                        do_generate_phrase_from_template(solution);
                        if (NIL != pph_phrase.pph_phrase_doneP(solution)) {
                            pph_phrase.pph_phrase_copy(solution, phrase, UNPROVIDED);
                        }
                    } else
                        if ((solution == $GEN_FORMAT) && (NIL == plural_subjectP)) {
                            final SubLObject genformat = some_proper_scope_genformat(formula, inverseP, wide_scope_argnum, unambiguousP);
                            if (NIL != genformat) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str418$__Found_assertion__S_for_formula_, genformat, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_phrase.pph_phrase_set_cycl(phrase, formula);
                                pph_phrase.pph_phrase_add_justification(phrase, genformat);
                                final SubLObject genformat_result = generate_atomic_formula_from_genformat(formula, genformat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(genformat_result)) {
                                    pph_phrase.pph_phrase_set_output_list(phrase, genformat_result, UNPROVIDED);
                                    pph_phrase.pph_phrase_note_done(phrase);
                                }
                            }
                        }

                } finally {
                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$123, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$124 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str419$__Leaving_PPH_SETTING_VAR_TYPES_I, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str420$___Output_list___S__, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str421$___Setting__S_to____S, pph_vars.$pph_var_types$.getDynamicValue(thread), dictionary.dictionary_values(var_types_shadow), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_macros.pph_reset_var_types(var_types_shadow);
                    } else
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str422$___Leaving__PPH_VAR_TYPES___S, dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }

                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                }
            }
        } finally {
            pph_macros.$pph_var_types_counter$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_noted_var_types$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject wide_scope_arg_in_pred(final SubLObject rmp) {
        final SubLObject wide_scope_argnum = specified_wide_scope_argnum(rmp);
        return NIL != wide_scope_argnum ? associated_arg_in_pred(rmp, wide_scope_argnum) : NIL;
    }

    public static SubLObject specified_wide_scope_argnum(final SubLObject pred) {
        return kb_mapping_utilities.fpred_value_in_any_mt(pred, $$generateArgWithOutsideScope, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject associated_arg_in_pred(final SubLObject rmp, final SubLObject arg) {
        return second(assoc(arg, arg_mapping_tuples(rmp), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject arg_mapping_tuples(final SubLObject rmp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_constantP(constants_high.find_constant($$$relatedArgPositions), UNPROVIDED)) {
            SubLObject ans = NIL;
            ans = kb_mapping_utilities.pred_value_tuples_in_any_mt(rmp, $$relatedArgPositions, ONE_INTEGER, $list426, UNPROVIDED);
            if (NIL == ans) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str427$Couldn_t_find___relatedArgPositio, rmp);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            } else
                if (NIL == list_utilities.lengthE(ans, TWO_INTEGER, UNPROVIDED)) {
                    final SubLObject new_format_string = cconcatenate($str223$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str224$__, format_nil.format_nil_a_no_copy($str428$Wrong_number_of___relatedArgPosit) });
                    pph_error.pph_handle_error(new_format_string, list(rmp, length(ans)));
                }

            return ans;
        }
        return NIL;
    }

    public static SubLObject intermediate_cycl_template_for_rmp_formula(final SubLObject formula) {
        final SubLObject rmp = cycl_utilities.formula_operator(formula);
        final SubLObject quant_tuples = ordered_quant_tuples(rmp);
        SubLObject args = NIL;
        final SubLObject pcase_var = length(quant_tuples);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return pph_utilities.pph_identity_template();
        }
        SubLObject cdolist_list_var = quant_tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (tuple.first() == $ITSELF) {
                args = cons(at_utilities.get_generic_arg(second(tuple)), args);
            } else {
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject quant_nl_attr = NIL;
                SubLObject argnum = NIL;
                destructuring_bind_must_consp(current, datum, $list430);
                quant_nl_attr = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list430);
                argnum = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((quant_nl_attr.eql($$Every_NLAttr) && (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg(formula, argnum, UNPROVIDED)))) && ($NO == pph_variable_handling.pph_var_quantifier(cycl_utilities.formula_arg(formula, argnum, UNPROVIDED)))) {
                        quant_nl_attr = $$No_NLAttr;
                    }
                    args = cons(make_det_nbar(quant_nl_attr, at_utilities.get_generic_arg(argnum)), args);
                } else {
                    cdestructuring_bind_error(datum, $list430);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return pph_templates.pph_expand_phrase_nauts(make_el_formula($ARG1, nreverse(args), UNPROVIDED));
    }

    public static SubLObject make_det_nbar(final SubLObject det, SubLObject nbar) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_types.pph_set_nautP(nbar)) {
            final SubLObject subcol_naut = pph_set_to_subcollection(nbar);
            if (NIL != subcol_naut) {
                nbar = subcol_naut;
            }
        }
        if (det.eql($$BareForm_NLAttr)) {
            return list(pph_functions.termparaphrasefn_constrained(), $$nonSingular_Generic, nbar);
        }
        if (nbar.eql($$Thing) && det.eql($$Every_NLAttr)) {
            return pph_types.pph_phrase_naut_for_string($$$everything);
        }
        final SubLObject constraints = det_agr_constraints(det);
        SubLObject agr = (NIL != constraints) ? constraints.first() : $$nounStrings;
        if (NIL != pph_utilities.pph_genl_pos_predP($$nonPlural_Generic, agr, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
            agr = $$nonPlural_Generic;
        }
        return list(pph_functions.bestdetnbarfn(), list(pph_functions.termparaphrasefn(), det), list(pph_functions.termparaphrasefn_constrained(), agr, nbar));
    }

    public static SubLObject det_agr_constraints(final SubLObject det) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            final SubLObject words = (NIL != indexed_term_p(det)) ? kb_mapping_utilities.pred_values_in_any_mt(det, $$denotation, FOUR_INTEGER, ONE_INTEGER, UNPROVIDED) : NIL;
            final SubLObject agrs = remove_duplicates(list_utilities.mapappend(AGREEMENT_LOOKUP, words), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ans = genl_predicates.min_ceiling_predicates(agrs, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject clear_quant_over_arg_tuples() {
        final SubLObject cs = $quant_over_arg_tuples_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_quant_over_arg_tuples(final SubLObject rmp) {
        return memoization_state.caching_state_remove_function_results_with_args($quant_over_arg_tuples_caching_state$.getGlobalValue(), list(rmp), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject quant_over_arg_tuples_internal(final SubLObject rmp) {
        return NIL != indexed_term_p(rmp) ? kb_mapping_utilities.pred_value_tuples_in_any_mt(rmp, $$generateQuantOverArg, ONE_INTEGER, $list426, UNPROVIDED) : NIL;
    }

    public static SubLObject quant_over_arg_tuples(final SubLObject rmp) {
        SubLObject caching_state = $quant_over_arg_tuples_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUANT_OVER_ARG_TUPLES, $quant_over_arg_tuples_caching_state$, NIL, EQ, ONE_INTEGER, $int$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rmp, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(quant_over_arg_tuples_internal(rmp)));
            memoization_state.caching_state_put(caching_state, rmp, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject ordered_quant_tuples(final SubLObject rmp) {
        final SubLObject arg_map = Sort.sort(arg_mapping_tuples(rmp), $sym439$_, SECOND);
        final SubLObject unordered_quant_tuples = Mapping.mapcar(REVERSE, quant_over_arg_tuples(rmp));
        SubLObject ordered_quant_tuples = NIL;
        SubLObject cdolist_list_var = arg_map;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject in = NIL;
            SubLObject out = NIL;
            destructuring_bind_must_consp(current, datum, $list442);
            in = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list442);
            out = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject associated_tuple = assoc(in, unordered_quant_tuples, UNPROVIDED, UNPROVIDED);
                ordered_quant_tuples = cons(NIL != associated_tuple ? associated_tuple : list(in, $ITSELF), ordered_quant_tuples);
            } else {
                cdestructuring_bind_error(datum, $list442);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return reverse(Mapping.mapcar(REVERSE, ordered_quant_tuples));
    }

    public static SubLObject some_proper_scope_genformat(final SubLObject formula, final SubLObject inverseP, final SubLObject wide_scope_argnum, final SubLObject unambiguousP) {
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject assertions = get_generation_template_as_list_for_relation_only(pred, args, NIL);
        SubLObject genformat = NIL;
        if (NIL == genformat) {
            SubLObject csome_list_var = assertions;
            SubLObject as = NIL;
            as = csome_list_var.first();
            while ((NIL == genformat) && (NIL != csome_list_var)) {
                if (NIL != genformat_has_correct_scopeP(as, pred, inverseP, wide_scope_argnum)) {
                    genformat = as;
                }
                csome_list_var = csome_list_var.rest();
                as = csome_list_var.first();
            } 
        }
        if ((NIL == genformat) && (NIL != unambiguousP)) {
            genformat = get_best_generation_template_as(pred, cycl_utilities.formula_args(formula, UNPROVIDED));
        }
        return genformat;
    }

    public static SubLObject genformat_has_correct_scopeP(final SubLObject as, final SubLObject pred, final SubLObject inverseP, final SubLObject wide_scope_argnum) {
        return argnum_is_initial_in_genformatP(pred, as, inverseP, wide_scope_argnum);
    }

    public static SubLObject find_proper_scope_gentemplate_phrase(final SubLObject formula, final SubLObject inverseP, final SubLObject wide_scope_argnum, final SubLObject unambiguousP, final SubLObject arg_position_map) {
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject v_answer = pph_templates.pph_best_phrase_template_for_formula_wXreln(formula, pred, arg_position_map, inverseP, wide_scope_argnum);
        if ((NIL == pph_phrase.pph_phrase_p(v_answer, UNPROVIDED)) && (NIL != unambiguousP)) {
            v_answer = pph_templates.pph_best_phrase_template_for_formula_wXreln(formula, pred, inverseP, NIL, UNPROVIDED);
        }
        if (NIL != pph_phrase.pph_phrase_p(v_answer, UNPROVIDED)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str443$__Found_a_genTemplate_for__S___, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_templates.pph_template_phrase_set_cycl(v_answer, formula, arg_position_map, UNPROVIDED);
        } else
            if (v_answer == $GEN_FORMAT) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str444$__Passing_up_genTemplates_for__S_, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if ((NIL == v_answer) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER))) {
                    format_nil.force_format(T, $str445$__Couldn_t_find_any_generation_te, formula, wide_scope_argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }


        return v_answer;
    }

    public static SubLObject pph_phrase_has_focal_argnumP(final SubLObject phrase, final SubLObject focus_argnum) {
        return makeBoolean((NIL == focus_argnum) || ((NIL != phrase) && (NIL != pph_phrase_argnum_has_focusP(phrase, focus_argnum))));
    }

    public static SubLObject pph_phrase_argnum_has_focusP(final SubLObject phrase, final SubLObject argnum) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        if (((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && document.sign_length(phrase).numG(ONE_INTEGER)) && pph_phrase.pph_phrase_string(pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER), UNPROVIDED).equal($$$and)) {
            return NIL;
        }
        if (NIL != pph_phrase.pph_coordination_phrase_p(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER))) {
            return NIL;
        }
        if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            return makeBoolean((NIL != pph_phrase_argnum_has_focusP(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER), argnum)) && (NIL != pph_phrase_argnum_has_focusP(pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER), argnum)));
        }
        final SubLObject argnum_key = at_utilities.get_generic_arg(argnum);
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_keys;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                dtr_keys = list_utilities.remove_if_not(GENERIC_ARG_P, pph_phrase.pph_phrase_cycl_gather(dtr, symbol_function(KEYWORDP), symbol_function(EQ)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (dtr_keys.equal(list(argnum_key))) {
                    return T;
                }
                if (argnum_key.equal(list_utilities.last_one(dtr_keys))) {
                    return T;
                }
                if (dtr_keys.isCons()) {
                    return NIL;
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return NIL;
    }

    public static SubLObject argnum_is_initial_in_genformatP(final SubLObject pred, final SubLObject genformat_as, final SubLObject inverseP, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject str = get_genformat_string_and_list(genformat_as);
        SubLObject arg_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == arg_list) {
            arg_list = default_genformat_arglist(pred);
            if (NIL != inverseP) {
                arg_list = reverse(arg_list);
            }
        }
        return makeBoolean((NIL != genformat_string_arg_initialP(str)) && argnum.eql(arg_list.first()));
    }

    public static SubLObject genformat_string_arg_initialP(final SubLObject genformat_string) {
        return makeBoolean((NIL != string_utilities.starts_with_by_test(genformat_string, $str447$_a, UNPROVIDED)) && (NIL == string_utilities.starts_with_by_test(genformat_string, $str448$_a_and, UNPROVIDED)));
    }

    public static SubLObject default_genformat_arglist(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arity = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_arity = arity.max_arity(pred);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL != v_arity ? copy_list(list_utilities.num_list(v_arity, ONE_INTEGER)) : NIL;
    }

    public static SubLObject pph_allow_var_typingP_internal(final SubLObject old_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        SubLObject types = NIL;
        SubLObject cdolist_list_var = obsolete.formula_variables(old_formula, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject types_$125 = pph_variable_handling.pph_variable_isa_constraints(var, old_formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != pph_variable_handling.pph_var_registeredP(var)) {
                types_$125 = list_utilities.delete_subsumed_items(cons(pph_variable_handling.pph_var_type(var), types_$125), $sym452$PPH_GENL_, UNPROVIDED);
            }
            SubLObject cdolist_list_var_$126 = types;
            SubLObject type = NIL;
            type = cdolist_list_var_$126.first();
            while (NIL != cdolist_list_var_$126) {
                types = list_utilities.alist_pushnew(types, type, var, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$126 = cdolist_list_var_$126.rest();
                type = cdolist_list_var_$126.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        cdolist_list_var = types;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject type2 = NIL;
            SubLObject vars = NIL;
            destructuring_bind_must_consp(current, datum, $list453);
            type2 = current.first();
            current = vars = current.rest();
            if (NIL != list_utilities.lengthG(vars, TWO_INTEGER, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject pph_allow_var_typingP(final SubLObject old_formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_allow_var_typingP_internal(old_formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym451$PPH_ALLOW_VAR_TYPING_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym451$PPH_ALLOW_VAR_TYPING_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym451$PPH_ALLOW_VAR_TYPING_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(old_formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (old_formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_allow_var_typingP_internal(old_formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(old_formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject generate_universal(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), $list272, UNPROVIDED)) {
            final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject scopally_unambiguousP = makeBoolean(NIL == pph_formula_contains_existentialP(cycl));
            final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject backup_phrase = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_smart_variable_replacementP$.bind(makeBoolean(T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)) && (NIL != pph_allow_var_typingP(cycl, UNPROVIDED))), thread);
                pph_register_exception_vars(cycl);
                final SubLObject _prev_bind_0_$127 = pph_vars.$pph_var_types$.currentBinding(thread);
                try {
                    pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                    final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                    final SubLObject _prev_bind_0_$128 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                    try {
                        pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                        pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                        pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        try {
                            thread.resetMultipleValues();
                            final SubLObject new_formula_template = remove_var_typing_clauses_from_universal(cycl, arg_position_map);
                            final SubLObject just = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == pph_utilities.pph_identity_template_p(new_formula_template)) {
                                pph_phrase.pph_phrase_reset_cycl(phrase, new_formula_template);
                                if (NIL != just) {
                                    pph_phrase.pph_phrase_add_justification(phrase, just);
                                }
                                final SubLObject new_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                                if (NIL != pph_types.pph_universal_with_atomic_scopeP(new_formula)) {
                                    generate_universal_with_atomic_scope(phrase, scopally_unambiguousP);
                                }
                            }
                            if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                final SubLObject new_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                                thread.resetMultipleValues();
                                final SubLObject new_cycl_template = maybe_simplify_explicit_universal(new_formula, scopally_unambiguousP, arg_position_map);
                                final SubLObject _prev_bind_0_$129 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_operator_scope_context$.bind(thread.secondMultipleValue(), thread);
                                    thread.resetMultipleValues();
                                    if (NIL == pph_utilities.pph_identity_template_p(new_cycl_template)) {
                                        pph_phrase.pph_phrase_reset_cycl(phrase, new_cycl_template);
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format_nil.force_format(T, $str455$__Changed_phrase_cycl_from__S___t, cycl, new_formula, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                    if (new_formula.equal(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
                                        pph_variable_handling.pph_register_var_quantifier(cycl_utilities.formula_arg1(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED), $UNIVERSAL);
                                    }
                                    if (NIL != pph_phrase_ok_for_generate_english_explicit_universalP(phrase)) {
                                        generate_english_explicit_universal(phrase);
                                    }
                                    if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                        final SubLObject info = pph_types.pph_method_info(GENERATE_UNIVERSAL, $UNIVERSAL);
                                        pph_types.pph_deregister_method_info(GENERATE_UNIVERSAL, info);
                                        try {
                                            pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            final SubLObject _prev_bind_0_$130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                pph_types.pph_register_method_info(GENERATE_UNIVERSAL, info);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0_$129, thread);
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                    format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_macros.pph_handle_local_vars(local_vars);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                    format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                            }
                        }
                    } finally {
                        pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                        pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                        pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$128, thread);
                    }
                } finally {
                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$127, thread);
                }
                if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                    pph_phrase.pph_phrase_revert_to_backup(phrase, backup_phrase);
                }
            } finally {
                pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_phrase_ok_for_generate_english_explicit_universalP(final SubLObject phrase) {
        return makeBoolean(((NIL != el_universal_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) && ((NIL == cycl_utilities.expression_find_if(EL_IMPLICATION_P, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED)) || (NIL == pph_utilities.pph_top_level_preciseP())));
    }

    public static SubLObject generate_english_explicit_universal(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject original_dtrs = pph_phrase.pph_phrase_dtr_list(phrase);
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_phrase_strip_explicit_cycl_quants(phrase, $UNIVERSAL);
        final SubLObject core_formula = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (!core_formula.equal(original_formula)) {
            final SubLObject filtered_vars = pph_filter_quantified_vars(list_utilities.alist_keys(var_pairs), $EXISTENTIAL, keep_explicitP);
            final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            SubLObject dtrs = NIL;
            if (NIL != filtered_vars) {
                final SubLObject quant_position = pph_utilities.pph_arg_position_lookup($list100, pph_phrase.pph_phrase_arg_position_map(phrase));
                final SubLObject quant = $$forAll;
                final SubLObject quant_phrase = pph_data_structures.new_pph_phrase($$$for_every, quant, UNPROVIDED);
                pph_phrase.pph_phrase_set_arg_position(quant_phrase, quant_position);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(quant_phrase);
                dtrs = cons(quant_phrase, dtrs);
                dtrs = cons(quant_vars_phrase(filtered_vars, var_pairs), dtrs);
                dtrs = cons(pph_data_structures.new_pph_phrase($str0$_, UNPROVIDED, UNPROVIDED), dtrs);
            }
            dtrs = cons(quant_body_phrase(core_formula, map), dtrs);
            dtrs = nreverse(dtrs);
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, dtrs, UNPROVIDED);
            pph_phrase_resolution.pph_phrase_get_string(phrase, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str459$Failed_to_generate_explicit_unive, original_formula);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, original_dtrs, UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_formula_contains_existentialP(final SubLObject formula) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find_if(PPH_EXISTENTIAL_FORMULA_P, formula, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_existential_formula_p(final SubLObject obj) {
        return makeBoolean((NIL != el_formula_p(obj)) && ((NIL != pph_existential_p(obj)) || (NIL != pph_existential_p(pph_utilities.find_el_macro_expansion(obj, UNPROVIDED)))));
    }

    public static SubLObject pph_existential_p(final SubLObject formula) {
        return makeBoolean((NIL != el_formula_p(formula)) && (NIL != pph_existential_operator_p(cycl_utilities.formula_arg0(formula))));
    }

    public static SubLObject pph_existential_operator_p(final SubLObject op) {
        if ($pph_existential_operators$.getGlobalValue() == $UNINITIALIZED) {
            $pph_existential_operators$.setGlobalValue(isa.all_fort_instances($$ExistentialQuantifier, UNPROVIDED, UNPROVIDED));
        }
        return subl_promotions.memberP(op, $pph_existential_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_ok_bare_universalP(final SubLObject formula) {
        return pph_ok_consequentP(formula);
    }

    public static SubLObject maybe_simplify_explicit_universal(final SubLObject universal, final SubLObject unambiguousP, final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = universal;
        SubLObject template = pph_utilities.pph_identity_template();
        final SubLObject new_operator_scope_context = pph_vars.$pph_operator_scope_context$.getDynamicValue(thread);
        SubLObject universal_count = ZERO_INTEGER;
        SubLObject minimizedP = NIL;
        if ((NIL == pph_vars.$paraphrase_precision$.getDynamicValue(thread)) || (NIL != unambiguousP)) {
            while (NIL == minimizedP) {
                if (NIL == el_universal_p(formula)) {
                    minimizedP = T;
                } else {
                    SubLObject current;
                    final SubLObject datum = current = cycl_utilities.formula_args(formula, UNPROVIDED);
                    SubLObject var = NIL;
                    SubLObject body = NIL;
                    destructuring_bind_must_consp(current, datum, $list283);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list283);
                    body = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (((NIL != pph_exceptional_var_p(var)) || (NIL != pph_variable_handling.pph_use_explicit_varP(var))) || (NIL == pph_ok_bare_universalP(body))) {
                            minimizedP = T;
                        } else {
                            final SubLObject var_quant = $UNIVERSAL;
                            template = pph_utilities.make_formula_arg_naut(TWO_INTEGER, template);
                            formula = body;
                            universal_count = add(universal_count, ONE_INTEGER);
                            pph_variable_handling.pph_register_var_quantifier(var, var_quant);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list283);
                    }
                }
            } 
        }
        if (NIL != pph_existential_p(formula)) {
            template = put_back_wide_scope_universals(template, universal_count);
        }
        return values(template, new_operator_scope_context);
    }

    public static SubLObject pph_negative_polarity_sentenceP(final SubLObject sentence) {
        return makeBoolean((NIL != formula_arityE(sentence, ONE_INTEGER, UNPROVIDED)) && ((NIL != el_negation_p(sentence)) || (NIL != el_formula_with_operator_p(sentence, $$unknownSentence))));
    }

    public static SubLObject put_back_wide_scope_universals(final SubLObject core_restr_template, final SubLObject how_many) {
        return put_back_wide_scope_quants(core_restr_template, how_many, $$forAll);
    }

    public static SubLObject generate_universal_with_atomic_scope(final SubLObject phrase, SubLObject scopally_unambiguousP) {
        if (scopally_unambiguousP == UNPROVIDED) {
            scopally_unambiguousP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject core_formula = cycl_utilities.formula_arg2(formula, UNPROVIDED);
        SubLObject core_formula_template = $ARG2;
        final SubLObject var = cycl_utilities.formula_arg1(formula, UNPROVIDED);
        SubLObject wide_scope_arg = position(var, core_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != wide_scope_arg) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$132 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    try {
                        if (NIL == pph_variable_handling.pph_var_registeredP(var)) {
                            pph_variable_handling.pph_register_var(var, UNPROVIDED, UNPROVIDED);
                        }
                        pph_variable_handling.pph_register_var_quantifier(var, $UNIVERSAL);
                        final SubLObject new_template = intermediate_cycl_template_for_rmp_formula(core_formula);
                        if (NIL != new_template) {
                            core_formula_template = pph_utilities.pph_apply_template(new_template, core_formula_template);
                            wide_scope_arg = position(var, pph_utilities.pph_apply_template(new_template, formula), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            core_formula = pph_utilities.pph_apply_template(new_template, core_formula);
                        }
                        final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
                        pph_phrase.pph_phrase_reset_cycl(phrase_copy, core_formula_template);
                        pph_phrase_generate_with_proper_scope(phrase, core_formula, wide_scope_arg, NIL, scopally_unambiguousP);
                        if (NIL != pph_phrase.pph_phrase_doneP(phrase_copy)) {
                            pph_phrase.pph_phrase_copy(phrase_copy, phrase, UNPROVIDED);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$133 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$133, thread);
                        }
                    }
                } finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$132, thread);
                }
            } finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject remove_var_typing_clauses_from_universal(final SubLObject universal, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject template = remove_var_typing_clauses_from_universal_recursive(universal, arg_position_map, UNPROVIDED);
        final SubLObject just = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(template, just);
    }

    public static SubLObject remove_var_typing_clauses_from_universal_recursive(final SubLObject universal, SubLObject arg_position_map, SubLObject macro_vars) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        if (macro_vars == UNPROVIDED) {
            macro_vars = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        final SubLObject just = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(universal, UNPROVIDED);
        SubLObject var = NIL;
        SubLObject body = NIL;
        destructuring_bind_must_consp(current, datum, $list283);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list283);
        body = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject vars_to_type = cons(var, macro_vars);
            SubLObject body_template = $ARG2;
            final SubLObject body_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, body_template);
            if (NIL != el_implication_p(body)) {
                SubLObject current_$135;
                final SubLObject datum_$134 = current_$135 = cycl_utilities.formula_args(body, UNPROVIDED);
                SubLObject antecedent = NIL;
                SubLObject consequent = NIL;
                destructuring_bind_must_consp(current_$135, datum_$134, $list305);
                antecedent = current_$135.first();
                current_$135 = current_$135.rest();
                destructuring_bind_must_consp(current_$135, datum_$134, $list305);
                consequent = current_$135.first();
                current_$135 = current_$135.rest();
                if (NIL == current_$135) {
                    if (NIL != pph_ok_consequentP(consequent)) {
                        final SubLObject antecedent_map = pph_utilities.pph_figure_new_arg_position_map(body_map, $ARG1);
                        thread.resetMultipleValues();
                        SubLObject new_antecedent_template = remove_var_typing_clauses(antecedent, vars_to_type, antecedent_map, NIL);
                        final SubLObject just_$136 = thread.secondMultipleValue();
                        final SubLObject vars_typed = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject cdolist_list_var = vars_typed;
                        SubLObject pair = NIL;
                        pair = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current_$136;
                            final SubLObject datum_$135 = current_$136 = pair;
                            SubLObject var_typed = NIL;
                            SubLObject arg_position = NIL;
                            destructuring_bind_must_consp(current_$136, datum_$135, $list464);
                            var_typed = current_$136.first();
                            current_$136 = current_$136.rest();
                            destructuring_bind_must_consp(current_$136, datum_$135, $list464);
                            arg_position = current_$136.first();
                            current_$136 = current_$136.rest();
                            if (NIL == current_$136) {
                                pph_variable_handling.pph_register_var_quantifier(var_typed, $UNIVERSAL);
                            } else {
                                cdestructuring_bind_error(datum_$135, $list464);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        } 
                        if (NIL != pph_utilities.pph_identity_template_p(new_antecedent_template)) {
                            body_template = pph_utilities.pph_cycl_template_from_arg_position($list181);
                        } else
                            if (NIL != pph_utilities.pph_cycl_template_p(new_antecedent_template)) {
                                new_antecedent_template = pph_utilities.pph_apply_template(new_antecedent_template, pph_utilities.pph_cycl_template_from_arg_position($list186));
                                final SubLObject arg0_template = pph_utilities.pph_cycl_template_from_arg_position($list465);
                                final SubLObject consequent_template = pph_utilities.pph_cycl_template_from_arg_position($list187);
                                body_template = make_binary_formula(arg0_template, new_antecedent_template, consequent_template);
                            } else
                                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                    Errors.warn($str466$Couldn_t_remove_var_typing_clause, universal);
                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }


                    }
                } else {
                    cdestructuring_bind_error(datum_$134, $list305);
                }
            } else
                if (NIL != el_existential_p(body)) {
                    final SubLObject exis_template = remove_var_typing_clauses_from_existential(body, body_map);
                    body_template = pph_utilities.pph_apply_template(exis_template, body_template);
                } else
                    if (NIL != el_universal_p(body)) {
                        final SubLObject univ_template = remove_var_typing_clauses_from_universal_recursive(body, body_map, vars_to_type);
                        body_template = pph_utilities.pph_apply_template(univ_template, body_template);
                    }


            if (!body_template.eql(pph_utilities.pph_cycl_template_from_arg_position($list181))) {
                final SubLObject new_body = pph_utilities.pph_apply_template(body_template, universal);
                if (NIL != pph_variable_handling.pph_var_registeredP(var)) {
                    pph_variable_handling.pph_note_if_var_is_used_only_once_in_formula(var, new_body);
                }
                maybe_register_var_by_arg_constraints(var, body);
                template = make_universal($ARG1, body_template);
            }
        } else {
            cdestructuring_bind_error(datum, $list283);
        }
        return values(template, just);
    }

    public static SubLObject pph_gather_antecedents(final SubLObject formula) {
        final SubLObject cnf = clausifier.clausal_form(formula, $CNF, UNPROVIDED);
        if (NIL == list_utilities.singletonP(cnf)) {
            return NIL;
        }
        final SubLObject clause = cnf.first();
        final SubLObject neglits = clause.first();
        return neglits;
    }

    public static SubLObject generate_unicode_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject subl_string = cycl_utilities.nat_arg1(naut, UNPROVIDED);
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
            final SubLObject html_string = unicode_strings.unicode_display_to_html(subl_string);
            pph_phrase.pph_phrase_set_string(phrase, html_string);
            pph_phrase.pph_phrase_note_done(phrase);
        } else
            if ((pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $TEXT) && (NIL != pph_vars.$allow_utf8_in_pph_text_mode$.getDynamicValue(thread))) {
                final SubLObject utf8_string = unicode_strings.unicode_display_to_utf8(subl_string);
                pph_phrase.pph_phrase_set_string(phrase, utf8_string);
                pph_phrase.pph_phrase_note_done(phrase);
            }

        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_set_to_subcollection(final SubLObject formula) {
        return pph_utilities.pph_apply_template(pph_set_to_subcol_template(formula), formula);
    }

    public static SubLObject pph_set_to_subcol_template(final SubLObject formula) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject var = NIL;
        SubLObject restr = NIL;
        destructuring_bind_must_consp(current, datum, $list285);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list285);
        restr = current.first();
        current = current.rest();
        if (NIL == current) {
            if (butlast(restr, UNPROVIDED).equal(list($$genls, var))) {
                final SubLObject supercol_template = pph_utilities.pph_cycl_template_from_arg_position($list187);
                return pph_utilities.pph_make_type_level(supercol_template);
            }
            if ((NIL == el_binary_formula_p(restr)) || (NIL == member(var, cycl_utilities.atomic_sentence_args(restr, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
            SubLObject current_$140;
            final SubLObject datum_$139 = current_$140 = cycl_utilities.formula_args(restr, UNPROVIDED);
            SubLObject from_arg = NIL;
            SubLObject to_arg = NIL;
            destructuring_bind_must_consp(current_$140, datum_$139, $list471);
            from_arg = current_$140.first();
            current_$140 = current_$140.rest();
            destructuring_bind_must_consp(current_$140, datum_$139, $list471);
            to_arg = current_$140.first();
            current_$140 = current_$140.rest();
            if (NIL == current_$140) {
                final SubLObject subcol_fn = (var.eql(from_arg)) ? $$SubcollectionOfWithRelationToFn : $$SubcollectionOfWithRelationFromFn;
                final SubLObject binary_pred_template = pph_utilities.pph_cycl_template_from_arg_position($list465);
                final SubLObject other_arg_template = (var.eql(to_arg)) ? pph_utilities.pph_cycl_template_from_arg_position($list186) : pph_utilities.pph_cycl_template_from_arg_position($list187);
                final SubLObject super_col = pph_variable_handling.pph_min_variable_isa_constraint(var, restr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return make_ternary_formula(subcol_fn, super_col, binary_pred_template, other_arg_template);
            }
            cdestructuring_bind_error(datum_$139, $list471);
        } else {
            cdestructuring_bind_error(datum, $list285);
        }
        return NIL;
    }

    public static SubLObject generate_set_naut(final SubLObject phrase) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            final SubLObject naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject subcol_template = pph_set_to_subcol_template(naut);
            if (NIL != subcol_template) {
                final SubLObject new_phrase = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
                pph_phrase.pph_phrase_reset_cycl(new_phrase, subcol_template);
                pph_phrase.pph_phrase_set_agr_pred(new_phrase, $$nonSingular_Generic, UNPROVIDED);
                generate_subcollection_with_rel_clause(new_phrase);
                if (NIL != pph_phrase.pph_phrase_doneP(new_phrase)) {
                    pph_phrase.pph_phrase_set_output_list(new_phrase, cons(pph_data_structures.new_pph_phrase_output_item($$$the_set_of, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_phrase.pph_phrase_output_list(new_phrase)), UNPROVIDED);
                    pph_phrase.pph_phrase_set_agr_pred(new_phrase, $$singular, UNPROVIDED);
                    pph_phrase.pph_phrase_copy(new_phrase, phrase, UNPROVIDED);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject generate_with_holds_of(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if ((NIL != generate_with_holds_of_paraphrase_operatorP(cycl_utilities.formula_operator(formula))) || (NIL != pph_utilities.pph_genl_mtP(pph_vars.$pph_language_mt$.getDynamicValue(thread), $$CyclishParaphraseMt))) {
            if ((((pph_vars.current_generation_level().isPositive() && (!formula.equal(pph_vars.pph_top_level_cycl()))) && (NIL == pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(phrase), UNPROVIDED))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str481$Generating_with_holds_of_for_moth, phrase);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            final SubLObject nl_preds_for_formula = pph_utilities.pph_default_nl_preds_for_term(formula);
            final SubLObject nl_preds = pph_utilities.pph_filter_preds(nl_preds_for_formula, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED);
            if (NIL != nl_preds) {
                missing_knowledge_discovery_events.post_unlexified_term_discovery_event(formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), nl_preds);
                if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
                    final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                    thread.resetMultipleValues();
                    final SubLObject output_list = do_generate_with_holds_of(formula, nl_preds, arg_position_map, phrase);
                    final SubLObject agr_pred = thread.secondMultipleValue();
                    final SubLObject support = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                        pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
                        pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
                        pph_phrase.pph_phrase_note_done(phrase);
                    }
                    if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                        pph_phrase.pph_phrase_destroy_dtrs_metered(phrase);
                        pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                        return NIL;
                    }
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject do_generate_with_holds_of(final SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map, SubLObject phrase) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = NIL;
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(formula, $REGULARIZE);
        SubLObject operator = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list482);
        operator = current.first();
        current = args = current.rest();
        final SubLObject operator_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(operator, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject arg0_arg_position = pph_utilities.pph_arg_position_lookup($list100, arg_position_map);
        pph_phrase.pph_phrase_set_mother(operator_phrase, phrase);
        pph_phrase.pph_phrase_set_only_dtr(phrase, operator_phrase);
        if (NIL != generate_with_holds_of_paraphrase_operatorP(operator)) {
            pph_main.pph_phrase_generate(operator_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            pph_methods.generate_princ(operator_phrase);
        }
        pph_phrase.pph_phrase_set_arg_position(operator_phrase, arg0_arg_position);
        final SubLObject negation_to_express = set_utilities.set_arbitrary_element_without_values(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject head_verb_string = (NIL != negation_to_express) ? NIL != pph_vars.pph_allow_contractionsP() ? $str483$doesn_t_hold : $$$does_not_hold : $$$holds;
        if (NIL != negation_to_express) {
            pph_vars.note_unexpressed_negation_expressed(negation_to_express, DO_GENERATE_WITH_HOLDS_OF);
        }
        pph_phrase.pph_phrase_append(pph_data_structures.new_pph_phrase(head_verb_string, UNPROVIDED, UNPROVIDED), phrase);
        if (NIL != list_utilities.lengthG(args, ZERO_INTEGER, UNPROVIDED)) {
            pph_phrase.pph_phrase_append(pph_data_structures.new_pph_phrase($$$of, UNPROVIDED, UNPROVIDED), phrase);
            final SubLObject args_formula = make_el_formula($$TheCoordinationSet, args, UNPROVIDED);
            final SubLObject args_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(args_formula, arg_position_map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_set_mother(args_phrase, phrase);
            pph_phrase.pph_phrase_append(args_phrase, phrase);
            pph_main.pph_phrase_generate(args_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == pph_phrase.pph_phrase_doneP(args_phrase)) {
                return NIL;
            }
        }
        pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
        return values(pph_phrase.pph_phrase_output_list(phrase), $$thirdPersonSg_Present);
    }

    public static SubLObject generate_with_holds_of_paraphrase_operatorP(final SubLObject operator) {
        if (NIL != rkf_domain_examples.rkf_generic_example_p(operator)) {
            return T;
        }
        return cycl_variables.el_varP(operator);
    }

    public static SubLObject generate_conjunction_head_driven(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase.pph_phrase_compatible_with_predsP(phrase, $list490)) {
            final SubLObject sentence = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject nl_preds = pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), $list490, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject new_dtrs = generate_conjunction_head_driven_internal(sentence, nl_preds);
            final SubLObject head_dtr_num = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != new_dtrs) {
                SubLObject failedP = NIL;
                if (NIL == failedP) {
                    SubLObject csome_list_var = new_dtrs;
                    SubLObject new_dtr = NIL;
                    new_dtr = csome_list_var.first();
                    while ((NIL == failedP) && (NIL != csome_list_var)) {
                        pph_main.pph_phrase_generate(new_dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == pph_phrase.pph_phrase_doneP(new_dtr)) {
                            failedP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        new_dtr = csome_list_var.first();
                    } 
                }
                if (NIL == failedP) {
                    pph_phrase.set_pph_phrase_dtrs_from_list(phrase, new_dtrs, head_dtr_num);
                    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                }
            }
        }
        return phrase;
    }

    public static SubLObject generate_conjunction_head_driven_internal(final SubLObject sentence, final SubLObject nl_preds) {
        SubLObject new_dtrs = NIL;
        SubLObject head_dtr_num = NIL;
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject rest;
        SubLObject head_clause;
        for (rest = NIL, rest = args; (NIL == head_dtr_num) && (NIL != rest); rest = rest.rest()) {
            head_clause = rest.first();
            argnum = add(argnum, ONE_INTEGER);
            if (NIL != pph_utilities.pph_var_typing_clauseP(head_clause, UNPROVIDED, UNPROVIDED)) {
                new_dtrs = generate_conjunction_head_driven_with_head_clause(sentence, nl_preds, head_clause);
                if (NIL != new_dtrs) {
                    head_dtr_num = argnum;
                }
            }
        }
        return values(new_dtrs, head_dtr_num);
    }

    public static SubLObject generate_conjunction_head_driven_with_head_clause(final SubLObject sentence, final SubLObject nl_preds, final SubLObject head_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject remaining_clauses = remove(head_clause, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_dtrs = NIL;
        SubLObject head_dtr = NIL;
        thread.resetMultipleValues();
        final SubLObject head_var = pph_utilities.pph_parse_var_typing_clause(head_clause, UNPROVIDED);
        final SubLObject head_type = thread.secondMultipleValue();
        final SubLObject head_type_arg_position = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == head_dtr) {
            SubLObject csome_list_var = pph_methods_lexicon.pph_lexifications_for_term(head_type, UNPROVIDED, UNPROVIDED);
            SubLObject head_lex = NIL;
            head_lex = csome_list_var.first();
            while ((NIL == head_dtr) && (NIL != csome_list_var)) {
                final SubLObject head_item = pph_methods_lexicon.generate_phrase_from_as(head_lex, head_type, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != head_item) {
                    final SubLObject head_string = pph_data_structures.pph_phrase_output_item_string(head_item);
                    if (NIL != pph_head_string_okP(head_string)) {
                        final SubLObject head_agr = pph_data_structures.new_pph_phrase_agr(pph_utilities.new_pph_agr_constraint($POS_PRED, pph_data_structures.pph_phrase_output_item_agr_pred(head_item)), UNPROVIDED);
                        head_dtr = pph_data_structures.new_pph_phrase(head_string, head_type, head_agr);
                        pph_phrase.pph_phrase_set_arg_position(head_dtr, head_type_arg_position);
                        new_dtrs = cons(head_dtr, new_dtrs);
                        thread.resetMultipleValues();
                        final SubLObject new_dtrs_$141 = pph_maybe_add_subject_for_head(head_dtr, head_var, remaining_clauses);
                        final SubLObject remaining_clauses_$142 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_dtrs = new_dtrs_$141;
                        remaining_clauses = remaining_clauses_$142;
                    }
                }
                csome_list_var = csome_list_var.rest();
                head_lex = csome_list_var.first();
            } 
        }
        if (NIL == list_utilities.empty_list_p(remaining_clauses)) {
            return values(NIL, NIL);
        }
        return values(new_dtrs, head_dtr);
    }

    public static SubLObject pph_head_string_okP(final SubLObject head_string) {
        return makeBoolean((NIL != pph_string.pph_string_p(head_string)) && (NIL == pph_string.pph_substringP($$$_, head_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_maybe_add_subject_for_head(final SubLObject head_dtr, final SubLObject head_var, SubLObject remaining_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_dtrs = list(head_dtr);
        SubLObject subj_dtr = NIL;
        if (NIL == subj_dtr) {
            SubLObject csome_list_var = remaining_clauses;
            SubLObject subj_clause = NIL;
            subj_clause = csome_list_var.first();
            while ((NIL == subj_dtr) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(subj_clause, pph_subj_clause_pattern(head_var));
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject subj = list_utilities.alist_lookup_without_values(v_bindings, SUBJ, UNPROVIDED, UNPROVIDED);
                    if (NIL != cycl_variables.el_varP(subj)) {
                        if (NIL == subj_dtr) {
                            SubLObject csome_list_var_$143 = remaining_clauses;
                            SubLObject subj_type_clause = NIL;
                            subj_type_clause = csome_list_var_$143.first();
                            while ((NIL == subj_dtr) && (NIL != csome_list_var_$143)) {
                                if (NIL != pph_utilities.pph_var_typing_clauseP(subj_type_clause, subj, UNPROVIDED)) {
                                    thread.resetMultipleValues();
                                    final SubLObject subj_var = pph_utilities.pph_parse_var_typing_clause(subj_type_clause, UNPROVIDED);
                                    final SubLObject subj_type = thread.secondMultipleValue();
                                    final SubLObject subj_type_arg_position = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    subj_dtr = pph_templates.pph_phrasify_phrase_naut(list(pph_functions.bestdetnbarfn_indefinite(), list(pph_functions.termparaphrasefn_constrained(), $$nonPlural_Generic, subj_type)), UNPROVIDED);
                                    pph_phrase.pph_phrase_set_arg_position(subj_dtr, subj_type_arg_position);
                                    remaining_clauses = delete(subj_type_clause, remaining_clauses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                csome_list_var_$143 = csome_list_var_$143.rest();
                                subj_type_clause = csome_list_var_$143.first();
                            } 
                        }
                    } else
                        if (NIL != isa.isaP(subj, $$Individual, UNPROVIDED, UNPROVIDED)) {
                            subj_dtr = pph_templates.pph_phrasify_phrase_naut(list(pph_functions.bestdetnbarfn_indefinite(), list(pph_functions.termparaphrasefn_np(), subj)), UNPROVIDED);
                        }

                }
                if (NIL != pph_phrase.pph_phrase_p(subj_dtr, UNPROVIDED)) {
                    remaining_clauses = delete(subj_clause, remaining_clauses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    new_dtrs = pph_add_subj_dtr(new_dtrs, subj_dtr);
                }
                csome_list_var = csome_list_var.rest();
                subj_clause = csome_list_var.first();
            } 
        }
        return values(new_dtrs, remaining_clauses);
    }

    public static SubLObject pph_subj_clause_pattern(final SubLObject head_var) {
        return listS($list494, head_var, $list495);
    }

    public static SubLObject pph_add_subj_dtr(SubLObject new_dtrs, final SubLObject subj_dtr) {
        new_dtrs = cons(subj_dtr, new_dtrs);
        return new_dtrs;
    }

    public static SubLObject generate_possibly_reduced_coordination(final SubLObject phrase) {
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject pos = pph_reducible_coordination(cycl);
        if (NIL != pos) {
            final SubLObject template = pph_create_coordination_template(cycl, pos);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str498$__Created_coordination_template_f, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_reset_cycl(phrase, template);
            return pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject pph_create_coordination_template(final SubLObject formula, SubLObject position) {
        SubLObject map = NIL;
        final SubLObject first = cycl_utilities.formula_args(formula, UNPROVIDED).first();
        SubLObject operator = NIL;
        if (NIL != el_disjunction_p(formula)) {
            operator = $$TheDisjunctiveCoordinationSet;
        } else
            if (NIL != el_conjunction_p(formula)) {
                operator = $$TheCoordinationSet;
            }

        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject coord_map;
        SubLObject cdotimes_end_var_$144;
        SubLObject index_$145;
        SubLObject keyword;
        for (cdotimes_end_var = length(first), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            if (index.eql(position)) {
                coord_map = NIL;
                for (cdotimes_end_var_$144 = length(formula), index_$145 = NIL, index_$145 = ZERO_INTEGER; index_$145.numL(cdotimes_end_var_$144); index_$145 = add(index_$145, ONE_INTEGER)) {
                    if (!index_$145.eql(ZERO_INTEGER)) {
                        keyword = pph_utilities.make_formula_arg_naut(index_$145, $SELF);
                        coord_map = cons(list($$FormulaArgFn, position, keyword), coord_map);
                    }
                }
                map = cons(cons(operator, reverse(coord_map)), map);
            } else {
                map = cons(list($$FormulaArgFn, index, $ARG1), map);
            }
        }
        return reverse(map);
    }

    public static SubLObject pph_reducible_coordination(final SubLObject formula) {
        if ((NIL == el_disjunction_p(formula)) && (NIL == el_conjunction_p(formula))) {
            return NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject bad = list_utilities.find_if_not(CYCL_ATOMIC_SENTENCE_P, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject position = (NIL != bad) ? NIL : list_utilities.unique_difference_among_lists(args);
        return NIL != subl_promotions.positive_integer_p(position) ? position : NIL;
    }

    public static SubLObject generate_existential_with_thecollectionof(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
        try {
            pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
            final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
            final SubLObject _prev_bind_0_$146 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
            try {
                pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                try {
                    final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                    final SubLObject template = pph_reformulate_existential_with_thecollectionof(cycl, pph_utilities.pph_identity_template());
                    if ((NIL == pph_utilities.pph_impossible_template_p(template)) && (NIL == pph_utilities.pph_identity_template_p(template))) {
                        final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
                        pph_phrase.pph_phrase_reset_cycl(phrase_copy, template);
                        pph_main.pph_phrase_generate(phrase_copy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != pph_phrase.pph_phrase_doneP(phrase_copy)) {
                            final SubLObject phrase_copy_string = pph_phrase.pph_phrase_string(phrase_copy, UNPROVIDED);
                            if (NIL == string_utilities.substringP($str502$such_that__X, phrase_copy_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                pph_phrase.pph_phrase_copy(phrase_copy, phrase, UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$147 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_macros.pph_handle_local_vars(local_vars);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                    }
                }
            } finally {
                pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$146, thread);
            }
        } finally {
            pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject pph_reformulate_existential_with_thecollectionof(final SubLObject formula, SubLObject path) {
        if (path == UNPROVIDED) {
            path = pph_utilities.pph_identity_template();
        }
        if (NIL == el_existential_p(formula)) {
            return pph_utilities.pph_impossible_template();
        }
        final SubLObject var = cycl_utilities.formula_arg(formula, ONE_INTEGER, UNPROVIDED);
        final SubLObject scope_path = pph_utilities.make_formula_arg_naut(TWO_INTEGER, path);
        final SubLObject scope_reformulation = pph_reformulate_conjunction_with_thecollectionof(cycl_utilities.formula_arg(formula, TWO_INTEGER, UNPROVIDED), var, scope_path, formula, UNPROVIDED, UNPROVIDED);
        if ((((NIL != scope_reformulation) && (!scope_reformulation.equal($ERROR))) && (NIL == cycl_utilities.expression_find($ERROR, scope_reformulation, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == cycl_utilities.expression_find($$FormulaArgFn, pph_utilities.pph_apply_template(scope_reformulation, formula), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return list(pph_utilities.make_formula_arg_naut(ZERO_INTEGER, path), pph_utilities.make_formula_arg_naut(ONE_INTEGER, path), scope_reformulation);
        }
        return pph_utilities.pph_impossible_template();
    }

    public static SubLObject pph_reformulate_conjunction_with_thecollectionof(final SubLObject formula, final SubLObject var, final SubLObject path, SubLObject orig_formula, SubLObject var_path, SubLObject descend_into_existentialsP) {
        if (var_path == UNPROVIDED) {
            var_path = NIL;
        }
        if (descend_into_existentialsP == UNPROVIDED) {
            descend_into_existentialsP = T;
        }
        if (NIL == orig_formula) {
            orig_formula = formula;
        }
        if (NIL == var_path) {
            var_path = pph_utilities.make_formula_arg_naut(ONE_INTEGER, pph_utilities.pph_identity_template());
        }
        if ((NIL != descend_into_existentialsP) && (NIL != el_existential_p(formula))) {
            return list(pph_utilities.make_formula_arg_naut(ZERO_INTEGER, path), pph_utilities.make_formula_arg_naut(ONE_INTEGER, path), pph_reformulate_conjunction_with_thecollectionof(cycl_utilities.formula_arg2(formula, UNPROVIDED), var, pph_utilities.make_formula_arg_naut(TWO_INTEGER, path), orig_formula, descend_into_existentialsP, UNPROVIDED));
        }
        if (NIL == el_conjunction_p(formula)) {
            return $ERROR;
        }
        if (NIL == var) {
            return $ERROR;
        }
        final SubLObject v_clauses = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = pph_partition_clauses_for_thecollectionof(v_clauses, path, var);
        SubLObject includes = NIL;
        SubLObject excludes = NIL;
        destructuring_bind_must_consp(current, datum, $list503);
        includes = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list503);
        excludes = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list503);
            return NIL;
        }
        if ((NIL != includes) && (NIL != list_utilities.same_length_p(append(includes, excludes), v_clauses))) {
            final SubLObject thecollection_naut = make_the_collection_naut_map(includes, orig_formula, var);
            final SubLObject thecollection_isa_clause = make_binary_formula($$isa, var_path, thecollection_naut);
            return make_conjunction(cons(thecollection_isa_clause, excludes));
        }
        return $ERROR;
    }

    public static SubLObject pph_partition_clauses_for_thecollectionof(final SubLObject v_clauses, final SubLObject path, final SubLObject var) {
        SubLObject includes = NIL;
        SubLObject excludes = NIL;
        SubLObject current;
        final SubLObject datum = current = pph_parse_variable_uses(var, v_clauses, path);
        SubLObject single_mentions = NIL;
        SubLObject multiple_mentions = NIL;
        SubLObject var_typing_clauses = NIL;
        SubLObject nonmentions = NIL;
        destructuring_bind_must_consp(current, datum, $list505);
        single_mentions = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list505);
        multiple_mentions = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list505);
        var_typing_clauses = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list505);
        nonmentions = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject all_mentions = append(single_mentions, multiple_mentions);
            if (((NIL == single_mentions) || (!length(all_mentions).equal(TWO_INTEGER))) || (NIL == var_typing_clauses)) {
                return list(NIL, NIL);
            }
            includes = cons(all_mentions.first(), includes);
            excludes = cons(second(all_mentions), excludes);
            if (NIL != var_typing_clauses) {
                includes = cons(var_typing_clauses.first(), includes);
                if (NIL != var_typing_clauses.rest()) {
                    SubLObject cdolist_list_var = var_typing_clauses.rest();
                    SubLObject clause = NIL;
                    clause = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        excludes = cons(clause, excludes);
                        cdolist_list_var = cdolist_list_var.rest();
                        clause = cdolist_list_var.first();
                    } 
                }
            }
            SubLObject cdolist_list_var = nonmentions;
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                excludes = cons(clause, excludes);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list505);
        }
        return list(includes, excludes);
    }

    public static SubLObject make_the_collection_naut_map(final SubLObject positions, final SubLObject formula, final SubLObject old_var) {
        final SubLObject new_var = cycl_variables.make_el_var($$$X);
        SubLObject conjuncts = NIL;
        SubLObject cdolist_list_var = positions;
        SubLObject position = NIL;
        position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject subformula = pph_utilities.pph_apply_template(position, formula);
            conjuncts = cons(pph_template_for_var_substitution(subformula, old_var, new_var, position), conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        } 
        return make_binary_formula($$TheCollectionOf, new_var, simplifier.conjoin(conjuncts, UNPROVIDED));
    }

    public static SubLObject pph_parse_variable_uses(final SubLObject var, final SubLObject formulas, SubLObject path) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        SubLObject arg1_mentions = NIL;
        SubLObject other_mentions = NIL;
        SubLObject var_typing_clauses = NIL;
        SubLObject multiple_mentions = NIL;
        SubLObject nonmentions = NIL;
        SubLObject list_var = NIL;
        SubLObject formula = NIL;
        SubLObject index = NIL;
        list_var = formulas;
        formula = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , formula = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject argnum = add(index, ONE_INTEGER);
            final SubLObject new_path = pph_utilities.make_formula_arg_naut(argnum, path);
            final SubLObject free_vars = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (free_vars.equal(list(var))) {
                if ((NIL != pph_utilities.pph_var_typing_clauseP(formula, UNPROVIDED, UNPROVIDED)) && cycl_utilities.formula_arg(formula, ONE_INTEGER, UNPROVIDED).equal(var)) {
                    var_typing_clauses = cons(new_path, var_typing_clauses);
                } else
                    if (cycl_utilities.formula_arg(formula, ONE_INTEGER, UNPROVIDED).equal(var)) {
                        arg1_mentions = cons(new_path, arg1_mentions);
                    } else {
                        other_mentions = cons(new_path, other_mentions);
                    }

            } else
                if (NIL != find(var, free_vars, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    multiple_mentions = cons(new_path, multiple_mentions);
                } else {
                    nonmentions = cons(pph_utilities.make_formula_arg_naut(argnum, path), nonmentions);
                }

        }
        return list(append(arg1_mentions, other_mentions), multiple_mentions, var_typing_clauses, nonmentions);
    }

    public static SubLObject pph_template_for_var_substitution(final SubLObject formula, final SubLObject old_var, final SubLObject new_var, SubLObject path) {
        if (path == UNPROVIDED) {
            path = NIL;
        }
        if (formula.equal(old_var)) {
            return new_var;
        }
        if (formula.isAtom()) {
            return path;
        }
        if (NIL != cycl_utilities.formula_find(old_var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject submaps = NIL;
            final SubLObject terms = cycl_utilities.formula_terms(formula, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject arg = NIL;
            SubLObject n = NIL;
            list_var = terms;
            arg = list_var.first();
            for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , n = number_utilities.f_1X(n)) {
                submaps = cons(pph_template_for_var_substitution(arg, old_var, new_var, pph_utilities.make_formula_arg_naut(n, path)), submaps);
            }
            return reverse(submaps);
        }
        return path;
    }

    public static SubLObject declare_pph_methods_formulas_file() {
        declareFunction(me, "generate_string_with_comma", "GENERATE-STRING-WITH-COMMA", 1, 0, false);
        declareFunction(me, "generate_conjunctive_sequence", "GENERATE-CONJUNCTIVE-SEQUENCE", 1, 0, false);
        declareFunction(me, "generate_disjunctive_sequence", "GENERATE-DISJUNCTIVE-SEQUENCE", 1, 0, false);
        declareFunction(me, "generate_sequence", "GENERATE-SEQUENCE", 1, 1, false);
        declareFunction(me, "generate_juncts", "GENERATE-JUNCTS", 1, 3, false);
        declareFunction(me, "generate_juncts_output_list", "GENERATE-JUNCTS-OUTPUT-LIST", 1, 3, false);
        declareFunction(me, "pph_use_bullets_for_junct_listsP", "PPH-USE-BULLETS-FOR-JUNCT-LISTS?", 1, 0, false);
        declareFunction(me, "pph_junct_lists_too_short_for_bulletsP", "PPH-JUNCT-LISTS-TOO-SHORT-FOR-BULLETS?", 1, 0, false);
        declareFunction(me, "pph_junct_olist_from_olists", "PPH-JUNCT-OLIST-FROM-OLISTS", 2, 2, false);
        declareMacro(me, "add_to_junct_olist", "ADD-TO-JUNCT-OLIST");
        declareFunction(me, "pph_junct_olist_from_2_olists", "PPH-JUNCT-OLIST-FROM-2-OLISTS", 4, 0, false);
        declareFunction(me, "pph_junct_olist_from_3_or_more_olists", "PPH-JUNCT-OLIST-FROM-3-OR-MORE-OLISTS", 5, 0, false);
        declareFunction(me, "pph_comma_item", "PPH-COMMA-ITEM", 0, 0, false);
        declareFunction(me, "pph_add_bullet_list_tags", "PPH-ADD-BULLET-LIST-TAGS", 1, 1, false);
        declareFunction(me, "pph_start_list_item", "PPH-START-LIST-ITEM", 0, 1, false);
        declareFunction(me, "pph_end_list_item", "PPH-END-LIST-ITEM", 0, 1, false);
        declareFunction(me, "pph_start_list_tag", "PPH-START-LIST-TAG", 0, 1, false);
        declareFunction(me, "pph_end_list_tag", "PPH-END-LIST-TAG", 0, 1, false);
        declareFunction(me, "pph_start_list_item_item", "PPH-START-LIST-ITEM-ITEM", 0, 0, false);
        declareFunction(me, "pph_end_list_item_item", "PPH-END-LIST-ITEM-ITEM", 0, 0, false);
        declareFunction(me, "pph_operator_string_from_key", "PPH-OPERATOR-STRING-FROM-KEY", 1, 0, false);
        declareFunction(me, "pph_contextualize_junct_arg_positions", "PPH-CONTEXTUALIZE-JUNCT-ARG-POSITIONS", 2, 0, false);
        declareFunction(me, "pph_add_cycl_to_junct_olists", "PPH-ADD-CYCL-TO-JUNCT-OLISTS", 2, 0, false);
        declareFunction(me, "ordinal_form", "ORDINAL-FORM", 1, 0, false);
        declareFunction(me, "ordinal_word", "ORDINAL-WORD", 1, 1, false);
        declareFunction(me, "english_ordinal_suffix", "ENGLISH-ORDINAL-SUFFIX", 1, 0, false);
        declareFunction(me, "generate_nth_expr", "GENERATE-NTH-EXPR", 1, 0, false);
        declareFunction(me, "generate_atomic_formula", "GENERATE-ATOMIC-FORMULA", 1, 0, false);
        declareFunction(me, "do_generate_atomic_formula", "DO-GENERATE-ATOMIC-FORMULA", 1, 0, false);
        declareFunction(me, "generate_all_phrases_for_formula", "GENERATE-ALL-PHRASES-FOR-FORMULA", 1, 0, false);
        declareFunction(me, "genformat_assertion_fits_formulaP", "GENFORMAT-ASSERTION-FITS-FORMULA?", 2, 1, false);
        declareFunction(me, "pph_agr_preds_for_cycl", "PPH-AGR-PREDS-FOR-CYCL", 1, 0, false);
        declareFunction(me, "generate_atomic_formula_from_genformat", "GENERATE-ATOMIC-FORMULA-FROM-GENFORMAT", 2, 4, false);
        declareFunction(me, "generate_atomic_formula_from_format_string_and_arg_order_list", "GENERATE-ATOMIC-FORMULA-FROM-FORMAT-STRING-AND-ARG-ORDER-LIST", 4, 1, false);
        declareFunction(me, "pph_output_list_from_format_string_and_args", "PPH-OUTPUT-LIST-FROM-FORMAT-STRING-AND-ARGS", 3, 1, false);
        declareFunction(me, "get_list_from_formula", "GET-LIST-FROM-FORMULA", 2, 0, false);
        declareFunction(me, "get_genformat_string_and_list", "GET-GENFORMAT-STRING-AND-LIST", 1, 0, false);
        declareFunction(me, "get_genformat_string_and_list_from_formula", "GET-GENFORMAT-STRING-AND-LIST-FROM-FORMULA", 1, 0, false);
        declareFunction(me, "get_best_generation_template_as", "GET-BEST-GENERATION-TEMPLATE-AS", 1, 1, false);
        declareFunction(me, "get_generation_template_as_list", "GET-GENERATION-TEMPLATE-AS-LIST", 1, 2, false);
        declareFunction(me, "genformat_args_okP", "GENFORMAT-ARGS-OK?", 2, 0, false);
        declareFunction(me, "genformat_precision_okP", "GENFORMAT-PRECISION-OK?", 1, 1, false);
        declareFunction(me, "pph_reln_has_precise_templateP", "PPH-RELN-HAS-PRECISE-TEMPLATE?", 1, 0, false);
        declareFunction(me, "get_generation_template_as_list_for_relation_only", "GET-GENERATION-TEMPLATE-AS-LIST-FOR-RELATION-ONLY", 3, 0, false);
        declareFunction(me, "get_genformat_as_list", "GET-GENFORMAT-AS-LIST", 1, 2, false);
        declareFunction(me, "get_genformat_formula", "GET-GENFORMAT-FORMULA", 1, 0, false);
        declareFunction(me, "generate_genformat_arg", "GENERATE-GENFORMAT-ARG", 1, 4, false);
        declareFunction(me, "pph_connective_p", "PPH-CONNECTIVE-P", 1, 0, false);
        declareFunction(me, "pph_get_connective", "PPH-GET-CONNECTIVE", 1, 0, false);
        declareFunction(me, "generate_genformat_arg_int", "GENERATE-GENFORMAT-ARG-INT", 7, 0, false);
        declareFunction(me, "pph_phrase_maybe_add_determiner", "PPH-PHRASE-MAYBE-ADD-DETERMINER", 2, 0, false);
        declareFunction(me, "generate_genformat_arg_finish", "GENERATE-GENFORMAT-ARG-FINISH", 4, 0, false);
        declareFunction(me, "pph_possessivize_output_item", "PPH-POSSESSIVIZE-OUTPUT-ITEM", 1, 0, false);
        declareFunction(me, "pph_locativize_output_item", "PPH-LOCATIVIZE-OUTPUT-ITEM", 2, 0, false);
        declareFunction(me, "pph_locativize_temporal_output_item", "PPH-LOCATIVIZE-TEMPORAL-OUTPUT-ITEM", 2, 0, false);
        declareFunction(me, "pph_english_locative_preposition_for_temporal_denot", "PPH-ENGLISH-LOCATIVE-PREPOSITION-FOR-TEMPORAL-DENOT", 1, 0, false);
        declareFunction(me, "arg_finish_leave_arg_position_aloneP", "ARG-FINISH-LEAVE-ARG-POSITION-ALONE?", 2, 0, false);
        declareFunction(me, "get_determiner", "GET-DETERMINER", 1, 2, false);
        declareFunction(me, "word_sense_indicator", "WORD-SENSE-INDICATOR", 1, 0, false);
        declareFunction(me, "word_sense_indicators", "WORD-SENSE-INDICATORS", 1, 0, false);
        declareFunction(me, "get_preferred_senses", "GET-PREFERRED-SENSES", 1, 1, false);
        declareFunction(me, "regularize_genformat_arglist", "REGULARIZE-GENFORMAT-ARGLIST", 2, 0, false);
        declareFunction(me, "process_genformat_arglist", "PROCESS-GENFORMAT-ARGLIST", 4, 2, false);
        declareFunction(me, "pph_find_output_list_matching_arg_num", "PPH-FIND-OUTPUT-LIST-MATCHING-ARG-NUM", 2, 0, false);
        declareFunction(me, "generate_genformat_arg_with_arg_order_list", "GENERATE-GENFORMAT-ARG-WITH-ARG-ORDER-LIST", 4, 2, false);
        declareFunction(me, "pph_introduce_anaphor", "PPH-INTRODUCE-ANAPHOR", 2, 0, false);
        declareFunction(me, "pph_reflexive_string", "PPH-REFLEXIVE-STRING", 2, 0, false);
        declareFunction(me, "pph_poss_pronoun", "PPH-POSS-PRONOUN", 2, 0, false);
        declareFunction(me, "generate_date_naut", "GENERATE-DATE-NAUT", 1, 0, false);
        declareFunction(me, "generate_english_year_naut", "GENERATE-ENGLISH-YEAR-NAUT", 1, 0, false);
        declareFunction(me, "generate_english_year_olist", "GENERATE-ENGLISH-YEAR-OLIST", 2, 0, false);
        declareFunction(me, "generate_english_month_naut", "GENERATE-ENGLISH-MONTH-NAUT", 1, 0, false);
        declareFunction(me, "pph_english_month_name", "PPH-ENGLISH-MONTH-NAME", 1, 0, false);
        declareFunction(me, "generate_english_month_olist", "GENERATE-ENGLISH-MONTH-OLIST", 4, 0, false);
        declareFunction(me, "generate_english_day_naut", "GENERATE-ENGLISH-DAY-NAUT", 1, 0, false);
        declareFunction(me, "generate_english_day_olist", "GENERATE-ENGLISH-DAY-OLIST", 6, 0, false);
        declareFunction(me, "pph_date_phrase_olist", "PPH-DATE-PHRASE-OLIST", 1, 0, false);
        declareFunction(me, "pph_date_naut_ok_for_generate_date_naut_p", "PPH-DATE-NAUT-OK-FOR-GENERATE-DATE-NAUT-P", 1, 0, false);
        declareFunction(me, "pph_time_naut_olist", "PPH-TIME-NAUT-OLIST", 2, 0, false);
        declareFunction(me, "pph_time_output_item", "PPH-TIME-OUTPUT-ITEM", 2, 0, false);
        declareFunction(me, "pph_defining_time_unit", "PPH-DEFINING-TIME-UNIT", 1, 0, false);
        declareFunction(me, "pph_smaller_interval_type_than", "PPH-SMALLER-INTERVAL-TYPE-THAN", 2, 0, false);
        declareFunction(me, "generate_time_naut_millisecond_internal", "GENERATE-TIME-NAUT-MILLISECOND-INTERNAL", 1, 2, false);
        declareFunction(me, "generate_time_naut_millisecond", "GENERATE-TIME-NAUT-MILLISECOND", 1, 1, false);
        declareFunction(me, "pph_date_precision", "PPH-DATE-PRECISION", 1, 0, false);
        declareFunction(me, "pph_date_precision_for_fn", "PPH-DATE-PRECISION-FOR-FN", 1, 0, false);
        declareFunction(me, "pph_date_naut_strip_time", "PPH-DATE-NAUT-STRIP-TIME", 1, 0, false);
        declareFunction(me, "pph_english_date_disambiguation_string", "PPH-ENGLISH-DATE-DISAMBIGUATION-STRING", 1, 0, false);
        declareFunction(me, "pph_date_add_english_disambiguation_string", "PPH-DATE-ADD-ENGLISH-DISAMBIGUATION-STRING", 2, 0, false);
        declareFunction(me, "generate_nl_tagged_term", "GENERATE-NL-TAGGED-TERM", 1, 0, false);
        declareFunction(me, "pph_maybe_add_gaf_to_top_20", "PPH-MAYBE-ADD-GAF-TO-TOP-20", 3, 0, false);
        declareFunction(me, "generate_phrase_from_template", "GENERATE-PHRASE-FROM-TEMPLATE", 1, 0, false);
        declareFunction(me, "pph_phrase_transfer_old_onto_new", "PPH-PHRASE-TRANSFER-OLD-ONTO-NEW", 2, 0, false);
        declareFunction(me, "new_pph_phrase_for_formula_and_gen_template_assertion", "NEW-PPH-PHRASE-FOR-FORMULA-AND-GEN-TEMPLATE-ASSERTION", 2, 1, false);
        declareFunction(me, "do_generate_phrase_from_template", "DO-GENERATE-PHRASE-FROM-TEMPLATE", 1, 0, false);
        declareFunction(me, "generate_simple_negation", "GENERATE-SIMPLE-NEGATION", 1, 0, false);
        declareFunction(me, "pph_try_to_express_negation", "PPH-TRY-TO-EXPRESS-NEGATION", 2, 0, false);
        declareFunction(me, "pph_switch_non_subj_determiners", "PPH-SWITCH-NON-SUBJ-DETERMINERS", 4, 2, false);
        declareFunction(me, "pph_det_nbar_switch_quantifer", "PPH-DET-NBAR-SWITCH-QUANTIFER", 4, 1, false);
        declareFunction(me, "maybe_add_do_support", "MAYBE-ADD-DO-SUPPORT", 1, 0, false);
        declareFunction(me, "add_not_to_phrase", "ADD-NOT-TO-PHRASE", 1, 0, false);
        declareFunction(me, "generate_negation_with_contracted_negative_auxiliary", "GENERATE-NEGATION-WITH-CONTRACTED-NEGATIVE-AUXILIARY", 1, 0, false);
        declareFunction(me, "generate_negation_with_not", "GENERATE-NEGATION-WITH-NOT", 1, 0, false);
        declareFunction(me, "generate_fn_to_arg_0", "GENERATE-FN-TO-ARG-0", 1, 0, false);
        declareFunction(me, "get_np_gen_formula", "GET-NP-GEN-FORMULA", 1, 0, false);
        declareFunction(me, "generate_np_from_formula", "GENERATE-NP-FROM-FORMULA", 2, 0, false);
        declareFunction(me, "generate_kappa", "GENERATE-KAPPA", 1, 0, false);
        declareFunction(me, "generate_existential", "GENERATE-EXISTENTIAL", 1, 0, false);
        declareFunction(me, "generate_english_explicit_existential", "GENERATE-ENGLISH-EXPLICIT-EXISTENTIAL", 1, 0, false);
        declareFunction(me, "pph_phrase_output_list_add_comma", "PPH-PHRASE-OUTPUT-LIST-ADD-COMMA", 1, 0, false);
        declareFunction(me, "quant_vars_phrase", "QUANT-VARS-PHRASE", 2, 0, false);
        declareFunction(me, "quant_var_phrase", "QUANT-VAR-PHRASE", 2, 0, false);
        declareFunction(me, "quant_body_phrase", "QUANT-BODY-PHRASE", 2, 0, false);
        declareFunction(me, "pph_phrase_strip_explicit_cycl_quants", "PPH-PHRASE-STRIP-EXPLICIT-CYCL-QUANTS", 2, 0, false);
        declareFunction(me, "pph_strip_explicit_cycl_quants", "PPH-STRIP-EXPLICIT-CYCL-QUANTS", 2, 0, false);
        declareFunction(me, "pph_filter_quantified_vars", "PPH-FILTER-QUANTIFIED-VARS", 2, 1, false);
        declareFunction(me, "fix_vars_output_list", "FIX-VARS-OUTPUT-LIST", 2, 0, false);
        declareFunction(me, "remove_var_typing_clauses_from_existential", "REMOVE-VAR-TYPING-CLAUSES-FROM-EXISTENTIAL", 2, 0, false);
        declareFunction(me, "put_back_wide_scope_existentials", "PUT-BACK-WIDE-SCOPE-EXISTENTIALS", 2, 0, false);
        declareFunction(me, "put_back_wide_scope_quants", "PUT-BACK-WIDE-SCOPE-QUANTS", 3, 0, false);
        declareFunction(me, "pph_formula_ok_for_relational_nounP", "PPH-FORMULA-OK-FOR-RELATIONAL-NOUN?", 1, 0, false);
        declareFunction(me, "pph_argnum_and_pred_ok_for_relational_nounP", "PPH-ARGNUM-AND-PRED-OK-FOR-RELATIONAL-NOUN?", 2, 0, false);
        declareFunction(me, "relational_noun_args_for_pred_internal", "RELATIONAL-NOUN-ARGS-FOR-PRED-INTERNAL", 1, 1, false);
        declareFunction(me, "relational_noun_args_for_pred", "RELATIONAL-NOUN-ARGS-FOR-PRED", 1, 1, false);
        declareFunction(me, "generate_existential_with_relational_noun", "GENERATE-EXISTENTIAL-WITH-RELATIONAL-NOUN", 2, 0, false);
        declareFunction(me, "pph_phrase_naut_for_relational_noun_formula", "PPH-PHRASE-NAUT-FOR-RELATIONAL-NOUN-FORMULA", 1, 0, false);
        declareFunction(me, "generate_implication_smart", "GENERATE-IMPLICATION-SMART", 1, 0, false);
        declareFunction(me, "pph_register_different_vars", "PPH-REGISTER-DIFFERENT-VARS", 1, 0, false);
        declareFunction(me, "remove_var_typing_clauses_from_implication", "REMOVE-VAR-TYPING-CLAUSES-FROM-IMPLICATION", 2, 0, false);
        declareFunction(me, "pph_ok_consequentP", "PPH-OK-CONSEQUENT?", 1, 0, false);
        declareFunction(me, "pph_existential_rmp_sentenceP", "PPH-EXISTENTIAL-RMP-SENTENCE?", 1, 0, false);
        new pph_methods_formulas.$pph_existential_rmp_sentenceP$UnaryFunction();
        declareFunction(me, "pph_universal_rmp_sentenceP", "PPH-UNIVERSAL-RMP-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_formula_contains_universalP", "PPH-FORMULA-CONTAINS-UNIVERSAL?", 1, 0, false);
        declareFunction(me, "pph_universal_p", "PPH-UNIVERSAL-P", 1, 0, false);
        declareFunction(me, "maybe_register_var_by_arg_constraints", "MAYBE-REGISTER-VAR-BY-ARG-CONSTRAINTS", 1, 1, false);
        declareFunction(me, "register_var_by_arg_constraints", "REGISTER-VAR-BY-ARG-CONSTRAINTS", 1, 1, false);
        declareFunction(me, "pph_basic_var_type_for_collection", "PPH-BASIC-VAR-TYPE-FOR-COLLECTION", 1, 0, false);
        declareFunction(me, "remove_var_typing_clauses", "REMOVE-VAR-TYPING-CLAUSES", 1, 3, false);
        declareFunction(me, "handle_var_typing_clause", "HANDLE-VAR-TYPING-CLAUSE", 5, 3, false);
        declareFunction(me, "pph_var_has_better_typing_clause_p", "PPH-VAR-HAS-BETTER-TYPING-CLAUSE-P", 3, 0, false);
        declareFunction(me, "pph_better_typing_clause_p", "PPH-BETTER-TYPING-CLAUSE-P", 3, 0, false);
        declareFunction(me, "pph_better_var_type_p", "PPH-BETTER-VAR-TYPE-P", 2, 0, false);
        declareFunction(me, "pph_sole_var_clause_p", "PPH-SOLE-VAR-CLAUSE-P", 4, 0, false);
        declareFunction(me, "pph_register_exception_vars", "PPH-REGISTER-EXCEPTION-VARS", 1, 0, false);
        declareFunction(me, "pph_register_exception_vars_recursive", "PPH-REGISTER-EXCEPTION-VARS-RECURSIVE", 1, 0, false);
        declareFunction(me, "possibly_new_exceptional_var_p", "POSSIBLY-NEW-EXCEPTIONAL-VAR-P", 1, 0, false);
        new pph_methods_formulas.$possibly_new_exceptional_var_p$UnaryFunction();
        declareFunction(me, "pph_opaque_predP_internal", "PPH-OPAQUE-PRED?-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_opaque_predP", "PPH-OPAQUE-PRED?", 1, 1, false);
        declareFunction(me, "pph_reln_type_level_in_argP_internal", "PPH-RELN-TYPE-LEVEL-IN-ARG?-INTERNAL", 2, 1, false);
        declareFunction(me, "pph_reln_type_level_in_argP", "PPH-RELN-TYPE-LEVEL-IN-ARG?", 2, 1, false);
        declareFunction(me, "pph_register_var_as_exception", "PPH-REGISTER-VAR-AS-EXCEPTION", 1, 0, false);
        declareFunction(me, "pph_exceptional_var_p", "PPH-EXCEPTIONAL-VAR-P", 1, 0, false);
        declareFunction(me, "generate_cf_implication", "GENERATE-CF-IMPLICATION", 1, 0, false);
        declareFunction(me, "generate_subcollection_with_relational_noun", "GENERATE-SUBCOLLECTION-WITH-RELATIONAL-NOUN", 1, 0, false);
        declareFunction(me, "arg_in_reln_assertions_for_pred", "ARG-IN-RELN-ASSERTIONS-FOR-PRED", 1, 0, false);
        declareFunction(me, "arg_in_reln_assertion_matches_head_of_subcollection_nautP", "ARG-IN-RELN-ASSERTION-MATCHES-HEAD-OF-SUBCOLLECTION-NAUT?", 2, 0, false);
        declareFunction(me, "generate_the_collection_with_rel_clause", "GENERATE-THE-COLLECTION-WITH-REL-CLAUSE", 1, 0, false);
        declareFunction(me, "generate_subcollection_with_rel_clause", "GENERATE-SUBCOLLECTION-WITH-REL-CLAUSE", 1, 0, false);
        declareFunction(me, "generate_collection_subset_with_rel_clause", "GENERATE-COLLECTION-SUBSET-WITH-REL-CLAUSE", 1, 0, false);
        declareFunction(me, "pph_subcol_embedded_sentence", "PPH-SUBCOL-EMBEDDED-SENTENCE", 1, 0, false);
        declareFunction(me, "pph_destructure_coll_subset", "PPH-DESTRUCTURE-COLL-SUBSET", 1, 0, false);
        declareFunction(me, "pph_rel_clause_embedded_sentence_subsentences_and_connective", "PPH-REL-CLAUSE-EMBEDDED-SENTENCE-SUBSENTENCES-AND-CONNECTIVE", 1, 0, false);
        declareFunction(me, "pph_subcol_embedded_sentence_template_internal", "PPH-SUBCOL-EMBEDDED-SENTENCE-TEMPLATE-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_subcol_embedded_sentence_template", "PPH-SUBCOL-EMBEDDED-SENTENCE-TEMPLATE", 1, 0, false);
        declareFunction(me, "pph_coll_subset_embedded_sentence_subsentence_argpos_template", "PPH-COLL-SUBSET-EMBEDDED-SENTENCE-SUBSENTENCE-ARGPOS-TEMPLATE", 4, 0, false);
        declareFunction(me, "pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive", "PPH-COLL-SUBSET-EMBEDDED-SENTENCE-SUBSENTENCE-ARGPOS-TEMPLATE-RECURSIVE", 3, 0, false);
        declareFunction(me, "pph_rel_clause_templates", "PPH-REL-CLAUSE-TEMPLATES", 1, 0, false);
        declareFunction(me, "pph_rel_clause_subsentence_templates", "PPH-REL-CLAUSE-SUBSENTENCE-TEMPLATES", 1, 0, false);
        declareFunction(me, "pph_subj_rel_clause_for_subcol", "PPH-SUBJ-REL-CLAUSE-FOR-SUBCOL", 8, 0, false);
        declareFunction(me, "pph_rel_clause_for_coll_subset", "PPH-REL-CLAUSE-FOR-COLL-SUBSET", 10, 0, false);
        declareFunction(me, "subcol_justifications_from_template", "SUBCOL-JUSTIFICATIONS-FROM-TEMPLATE", 1, 0, false);
        declareFunction(me, "pph_subj_rel_clause_from_gentemplate", "PPH-SUBJ-REL-CLAUSE-FROM-GENTEMPLATE", 3, 0, false);
        declareFunction(me, "pph_rel_clause_front_prepositionP", "PPH-REL-CLAUSE-FRONT-PREPOSITION?", 2, 0, false);
        declareFunction(me, "pph_rel_clause_from_gentemplate", "PPH-REL-CLAUSE-FROM-GENTEMPLATE", 5, 0, false);
        declareFunction(me, "new_rel_clause_head_dtr", "NEW-REL-CLAUSE-HEAD-DTR", 2, 0, false);
        declareFunction(me, "update_relative_agrs_in_relative_clause_dtr", "UPDATE-RELATIVE-AGRS-IN-RELATIVE-CLAUSE-DTR", 3, 0, false);
        declareFunction(me, "pph_subj_rel_clause_template_ok_for_copula_removalP", "PPH-SUBJ-REL-CLAUSE-TEMPLATE-OK-FOR-COPULA-REMOVAL?", 1, 0, false);
        declareFunction(me, "pph_subj_rel_clause_from_genformat", "PPH-SUBJ-REL-CLAUSE-FROM-GENFORMAT", 5, 1, false);
        declareFunction(me, "pph_subj_rel_clause_adjust_format_string", "PPH-SUBJ-REL-CLAUSE-ADJUST-FORMAT-STRING", 1, 0, false);
        declareFunction(me, "pph_template_ok_for_rel_clauseP", "PPH-TEMPLATE-OK-FOR-REL-CLAUSE?", 2, 0, false);
        declareFunction(me, "pph_preds_of_string", "PPH-PREDS-OF-STRING", 1, 0, false);
        declareFunction(me, "pph_phrase_has_extractible_dtr_with_cyclP", "PPH-PHRASE-HAS-EXTRACTIBLE-DTR-WITH-CYCL?", 2, 0, false);
        declareFunction(me, "pph_phrase_find_extractible_dtr_with_cycl", "PPH-PHRASE-FIND-EXTRACTIBLE-DTR-WITH-CYCL", 2, 0, false);
        declareFunction(me, "pph_phrase_cycl_containsP", "PPH-PHRASE-CYCL-CONTAINS?", 2, 3, false);
        declareFunction(me, "generate_phrase_naut", "GENERATE-PHRASE-NAUT", 1, 0, false);
        declareFunction(me, "generate_specified_scope_sentence", "GENERATE-SPECIFIED-SCOPE-SENTENCE", 1, 0, false);
        declareFunction(me, "pph_add_arg0_links_for_specified_scope_phrase", "PPH-ADD-ARG0-LINKS-FOR-SPECIFIED-SCOPE-PHRASE", 3, 0, false);
        declareFunction(me, "generate_rmp_sentence_via_expansion", "GENERATE-RMP-SENTENCE-VIA-EXPANSION", 1, 0, false);
        declareFunction(me, "pph_phrase_generate_with_proper_scope", "PPH-PHRASE-GENERATE-WITH-PROPER-SCOPE", 5, 0, false);
        declareFunction(me, "pph_phrase_adjust_arg0_links", "PPH-PHRASE-ADJUST-ARG0-LINKS", 3, 0, false);
        declareFunction(me, "scopally_unambiguousP_internal", "SCOPALLY-UNAMBIGUOUS?-INTERNAL", 1, 0, false);
        declareFunction(me, "scopally_unambiguousP", "SCOPALLY-UNAMBIGUOUS?", 1, 0, false);
        declareFunction(me, "pph_phrase_generate_with_proper_scopeXpred", "PPH-PHRASE-GENERATE-WITH-PROPER-SCOPE&PRED", 6, 0, false);
        declareFunction(me, "wide_scope_arg_in_pred", "WIDE-SCOPE-ARG-IN-PRED", 1, 0, false);
        declareFunction(me, "specified_wide_scope_argnum", "SPECIFIED-WIDE-SCOPE-ARGNUM", 1, 0, false);
        declareFunction(me, "associated_arg_in_pred", "ASSOCIATED-ARG-IN-PRED", 2, 0, false);
        declareFunction(me, "arg_mapping_tuples", "ARG-MAPPING-TUPLES", 1, 0, false);
        declareFunction(me, "intermediate_cycl_template_for_rmp_formula", "INTERMEDIATE-CYCL-TEMPLATE-FOR-RMP-FORMULA", 1, 0, false);
        declareFunction(me, "make_det_nbar", "MAKE-DET-NBAR", 2, 0, false);
        declareFunction(me, "det_agr_constraints", "DET-AGR-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "clear_quant_over_arg_tuples", "CLEAR-QUANT-OVER-ARG-TUPLES", 0, 0, false);
        declareFunction(me, "remove_quant_over_arg_tuples", "REMOVE-QUANT-OVER-ARG-TUPLES", 1, 0, false);
        declareFunction(me, "quant_over_arg_tuples_internal", "QUANT-OVER-ARG-TUPLES-INTERNAL", 1, 0, false);
        declareFunction(me, "quant_over_arg_tuples", "QUANT-OVER-ARG-TUPLES", 1, 0, false);
        declareFunction(me, "ordered_quant_tuples", "ORDERED-QUANT-TUPLES", 1, 0, false);
        declareFunction(me, "some_proper_scope_genformat", "SOME-PROPER-SCOPE-GENFORMAT", 4, 0, false);
        declareFunction(me, "genformat_has_correct_scopeP", "GENFORMAT-HAS-CORRECT-SCOPE?", 4, 0, false);
        declareFunction(me, "find_proper_scope_gentemplate_phrase", "FIND-PROPER-SCOPE-GENTEMPLATE-PHRASE", 5, 0, false);
        declareFunction(me, "pph_phrase_has_focal_argnumP", "PPH-PHRASE-HAS-FOCAL-ARGNUM?", 2, 0, false);
        declareFunction(me, "pph_phrase_argnum_has_focusP", "PPH-PHRASE-ARGNUM-HAS-FOCUS?", 2, 0, false);
        declareFunction(me, "argnum_is_initial_in_genformatP", "ARGNUM-IS-INITIAL-IN-GENFORMAT?", 4, 0, false);
        declareFunction(me, "genformat_string_arg_initialP", "GENFORMAT-STRING-ARG-INITIAL?", 1, 0, false);
        declareFunction(me, "default_genformat_arglist", "DEFAULT-GENFORMAT-ARGLIST", 1, 0, false);
        declareFunction(me, "pph_allow_var_typingP_internal", "PPH-ALLOW-VAR-TYPING?-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_allow_var_typingP", "PPH-ALLOW-VAR-TYPING?", 1, 1, false);
        declareFunction(me, "generate_universal", "GENERATE-UNIVERSAL", 1, 0, false);
        declareFunction(me, "pph_phrase_ok_for_generate_english_explicit_universalP", "PPH-PHRASE-OK-FOR-GENERATE-ENGLISH-EXPLICIT-UNIVERSAL?", 1, 0, false);
        declareFunction(me, "generate_english_explicit_universal", "GENERATE-ENGLISH-EXPLICIT-UNIVERSAL", 1, 0, false);
        declareFunction(me, "pph_formula_contains_existentialP", "PPH-FORMULA-CONTAINS-EXISTENTIAL?", 1, 0, false);
        declareFunction(me, "pph_existential_formula_p", "PPH-EXISTENTIAL-FORMULA-P", 1, 0, false);
        new pph_methods_formulas.$pph_existential_formula_p$UnaryFunction();
        declareFunction(me, "pph_existential_p", "PPH-EXISTENTIAL-P", 1, 0, false);
        declareFunction(me, "pph_existential_operator_p", "PPH-EXISTENTIAL-OPERATOR-P", 1, 0, false);
        declareFunction(me, "pph_ok_bare_universalP", "PPH-OK-BARE-UNIVERSAL?", 1, 0, false);
        declareFunction(me, "maybe_simplify_explicit_universal", "MAYBE-SIMPLIFY-EXPLICIT-UNIVERSAL", 3, 0, false);
        declareFunction(me, "pph_negative_polarity_sentenceP", "PPH-NEGATIVE-POLARITY-SENTENCE?", 1, 0, false);
        declareFunction(me, "put_back_wide_scope_universals", "PUT-BACK-WIDE-SCOPE-UNIVERSALS", 2, 0, false);
        declareFunction(me, "generate_universal_with_atomic_scope", "GENERATE-UNIVERSAL-WITH-ATOMIC-SCOPE", 1, 1, false);
        declareFunction(me, "remove_var_typing_clauses_from_universal", "REMOVE-VAR-TYPING-CLAUSES-FROM-UNIVERSAL", 1, 1, false);
        declareFunction(me, "remove_var_typing_clauses_from_universal_recursive", "REMOVE-VAR-TYPING-CLAUSES-FROM-UNIVERSAL-RECURSIVE", 1, 2, false);
        declareFunction(me, "pph_gather_antecedents", "PPH-GATHER-ANTECEDENTS", 1, 0, false);
        declareFunction(me, "generate_unicode_naut", "GENERATE-UNICODE-NAUT", 1, 0, false);
        declareFunction(me, "pph_set_to_subcollection", "PPH-SET-TO-SUBCOLLECTION", 1, 0, false);
        declareFunction(me, "pph_set_to_subcol_template", "PPH-SET-TO-SUBCOL-TEMPLATE", 1, 0, false);
        declareFunction(me, "generate_set_naut", "GENERATE-SET-NAUT", 1, 0, false);
        declareFunction(me, "generate_with_holds_of", "GENERATE-WITH-HOLDS-OF", 1, 0, false);
        declareFunction(me, "do_generate_with_holds_of", "DO-GENERATE-WITH-HOLDS-OF", 1, 3, false);
        declareFunction(me, "generate_with_holds_of_paraphrase_operatorP", "GENERATE-WITH-HOLDS-OF-PARAPHRASE-OPERATOR?", 1, 0, false);
        declareFunction(me, "generate_conjunction_head_driven", "GENERATE-CONJUNCTION-HEAD-DRIVEN", 1, 0, false);
        declareFunction(me, "generate_conjunction_head_driven_internal", "GENERATE-CONJUNCTION-HEAD-DRIVEN-INTERNAL", 2, 0, false);
        declareFunction(me, "generate_conjunction_head_driven_with_head_clause", "GENERATE-CONJUNCTION-HEAD-DRIVEN-WITH-HEAD-CLAUSE", 3, 0, false);
        declareFunction(me, "pph_head_string_okP", "PPH-HEAD-STRING-OK?", 1, 0, false);
        declareFunction(me, "pph_maybe_add_subject_for_head", "PPH-MAYBE-ADD-SUBJECT-FOR-HEAD", 3, 0, false);
        declareFunction(me, "pph_subj_clause_pattern", "PPH-SUBJ-CLAUSE-PATTERN", 1, 0, false);
        declareFunction(me, "pph_add_subj_dtr", "PPH-ADD-SUBJ-DTR", 2, 0, false);
        declareFunction(me, "generate_possibly_reduced_coordination", "GENERATE-POSSIBLY-REDUCED-COORDINATION", 1, 0, false);
        declareFunction(me, "pph_create_coordination_template", "PPH-CREATE-COORDINATION-TEMPLATE", 2, 0, false);
        declareFunction(me, "pph_reducible_coordination", "PPH-REDUCIBLE-COORDINATION", 1, 0, false);
        declareFunction(me, "generate_existential_with_thecollectionof", "GENERATE-EXISTENTIAL-WITH-THECOLLECTIONOF", 1, 0, false);
        declareFunction(me, "pph_reformulate_existential_with_thecollectionof", "PPH-REFORMULATE-EXISTENTIAL-WITH-THECOLLECTIONOF", 1, 1, false);
        declareFunction(me, "pph_reformulate_conjunction_with_thecollectionof", "PPH-REFORMULATE-CONJUNCTION-WITH-THECOLLECTIONOF", 4, 2, false);
        declareFunction(me, "pph_partition_clauses_for_thecollectionof", "PPH-PARTITION-CLAUSES-FOR-THECOLLECTIONOF", 3, 0, false);
        declareFunction(me, "make_the_collection_naut_map", "MAKE-THE-COLLECTION-NAUT-MAP", 3, 0, false);
        declareFunction(me, "pph_parse_variable_uses", "PPH-PARSE-VARIABLE-USES", 2, 1, false);
        declareFunction(me, "pph_template_for_var_substitution", "PPH-TEMPLATE-FOR-VAR-SUBSTITUTION", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_methods_formulas_file() {
        deflexical("*PPH-ALLOW-SUBL-LISTS?*", T);
        defconstant("*PPH-CONNECTIVES*", $list140);
        deflexical("*PPH-ENGLISH-MONTH-NAMES*", $list182);
        deflexical("*PPH-DATES*", NIL);
        deflexical("*PPH-ENGLISH-DATE-DISAMBIGUATION-STRINGS*", $list205);
        defparameter("*PPH-NEW-EXCEPTION-VARS*", NIL);
        defparameter("*PPH-GENERATE-COLLECTION-SUBSET-WITH-REL-CLAUSE?*", T);
        defparameter("*PPH-FRONT-PREPOSITIONS?*", T);
        defparameter("*PPH-ALLOW-COPULA-REMOVAL?*", NIL);
        deflexical("*QUANT-OVER-ARG-TUPLES-CACHING-STATE*", NIL);
        deflexical("*PPH-EXISTENTIAL-OPERATORS*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_pph_methods_formulas_file() {
        define_test_case_table_int(ORDINAL_FORM, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list57, $KB, $FULL, $WORKING_, T }), $list61);
        pph_types.pph_register_method(GENERATE_NTH_EXPR, $NTH_EXPR, $BEST);
        pph_types.pph_register_method(GENERATE_ATOMIC_FORMULA, $CYCL_SENTENCE, $DECENT);
        pph_types.pph_register_method(GENERATE_ATOMIC_FORMULA, $NAUT, $DECENT);
        define_obsolete_register(GENERATE_ALL_PHRASES_FOR_FORMULA, $list92);
        pph_types.pph_register_method(GENERATE_DATE_NAUT, $DATE_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_ENGLISH_YEAR_NAUT, $YEAR_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_ENGLISH_MONTH_NAUT, $MONTH_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_ENGLISH_DAY_NAUT, $DAY_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_PHRASE_FROM_TEMPLATE, $CYCL_SENTENCE, $BEST);
        pph_types.pph_register_method(GENERATE_PHRASE_FROM_TEMPLATE, $NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_NL_TAGGED_TERM, $NL_TAGGED_TERM, $DECENT);
        note_funcall_helper_function(GENERATE_NL_TAGGED_TERM);
        pph_types.pph_register_method(GENERATE_SIMPLE_NEGATION, $NEGATION, $BEST);
        note_funcall_helper_function(GENERATE_SIMPLE_NEGATION);
        pph_types.pph_register_method(GENERATE_FN_TO_ARG_0, $FN_TO_ARG_0, $BEST);
        pph_types.pph_register_method(GENERATE_KAPPA, $KAPPA_EXPR, $BEST);
        pph_types.pph_register_method(GENERATE_EXISTENTIAL, $EXISTENTIAL, $DECENT);
        memoization_state.note_memoized_function(RELATIONAL_NOUN_ARGS_FOR_PRED);
        pph_types.pph_register_method(GENERATE_IMPLICATION_SMART, $IMPLICATION, $BEST);
        memoization_state.note_memoized_function($sym324$PPH_OPAQUE_PRED_);
        memoization_state.note_memoized_function($sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_);
        pph_types.pph_register_method(GENERATE_CF_IMPLICATION, $CF_IMPLICATION, $BEST);
        pph_types.pph_register_method(GENERATE_SUBCOLLECTION_WITH_RELATIONAL_NOUN, $RELATIONAL_NOUN_SUBCOLLECTION_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, $THE_COLLECTION_OF_NAT, $BEST);
        pph_types.pph_register_method(GENERATE_SUBCOLLECTION_WITH_REL_CLAUSE, $SUBCOLLECTION_RELATION_NAUT, $BEST);
        memoization_state.note_memoized_function(PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE);
        pph_types.pph_register_method(GENERATE_PHRASE_NAUT, $PHRASE_DENOTING_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_SPECIFIED_SCOPE_SENTENCE, $SPECIFIED_SCOPE_SENTENCE, $DECENT);
        pph_types.pph_register_method(GENERATE_RMP_SENTENCE_VIA_EXPANSION, $RMP_SENTENCE, $DECENT);
        memoization_state.note_memoized_function($sym412$SCOPALLY_UNAMBIGUOUS_);
        memoization_state.note_globally_cached_function(QUANT_OVER_ARG_TUPLES);
        memoization_state.note_memoized_function($sym451$PPH_ALLOW_VAR_TYPING_);
        pph_types.pph_register_method(GENERATE_UNIVERSAL, $UNIVERSAL, $BEST);
        pph_types.pph_register_method(GENERATE_UNICODE_NAUT, $UNICODE_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_SET_NAUT, $SET_NAUT, $BEST);
        pph_types.pph_register_method(GENERATE_WITH_HOLDS_OF, $ATOMIC_SENTENCE, $FALLBACK);
        pph_types.pph_register_method(GENERATE_CONJUNCTION_HEAD_DRIVEN, $CONJUNCTION, $BEST);
        note_funcall_helper_function(GENERATE_CONJUNCTION_HEAD_DRIVEN);
        pph_types.pph_register_method(GENERATE_POSSIBLY_REDUCED_COORDINATION, $COORDINATION, $BEST);
        pph_types.pph_register_method(GENERATE_EXISTENTIAL_WITH_THECOLLECTIONOF, $EXISTENTIAL, $BEST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_methods_formulas_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_methods_formulas_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_methods_formulas_file();
    }

    

    public static final class $pph_existential_rmp_sentenceP$UnaryFunction extends UnaryFunction {
        public $pph_existential_rmp_sentenceP$UnaryFunction() {
            super(extractFunctionNamed("PPH-EXISTENTIAL-RMP-SENTENCE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_existential_rmp_sentenceP(arg1);
        }
    }

    public static final class $possibly_new_exceptional_var_p$UnaryFunction extends UnaryFunction {
        public $possibly_new_exceptional_var_p$UnaryFunction() {
            super(extractFunctionNamed("POSSIBLY-NEW-EXCEPTIONAL-VAR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return possibly_new_exceptional_var_p(arg1);
        }
    }

    public static final class $pph_existential_formula_p$UnaryFunction extends UnaryFunction {
        public $pph_existential_formula_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-EXISTENTIAL-FORMULA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_existential_formula_p(arg1);
        }
    }
}

/**
 * Total time: 5109 ms synthetic
 */
