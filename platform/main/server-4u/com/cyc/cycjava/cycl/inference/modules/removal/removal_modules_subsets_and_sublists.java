package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_length;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.expression_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.el_utilities.make_quaternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_subsets_and_sublists extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_subsets_and_sublists();



    // defparameter
    private static final SubLSymbol $default_list_has_max_sublist_meeting_condition_cost$ = makeSymbol("*DEFAULT-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-COST*");

    private static final SubLObject $$listHasMaxSublistMeetingCondition = reader_make_constant_shell(makeString("listHasMaxSublistMeetingCondition"));



    private static final SubLSymbol $REMOVAL_LIST_HAS_MAX_SUBLIST_MEETING_CONDITION = makeKeyword("REMOVAL-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("listHasMaxSublistMeetingCondition")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("listHasMaxSublistMeetingCondition")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$listHasMaxSublistMeetingCondition MAX-SUB-LIST LIST MIN MAX QUERY) means that MAX-SUB-LIST is the maximum-length sublist of LIST that meets the following conditons:\n\n(1) LIST is at least MIN elements long and no more than MAX elements long, \n\n(2) QUERY is a quoted sentence with exactly one open variable, and if MAX-SUB-LIST is substituted for that open variable and QUERY is asked, QUERY returns true."), makeKeyword("EXAMPLE"), makeString("(listHasMaxSublistMeetingCondition\n ?MAX-SUBLIST\n 3\n 20\n (TheList\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 210136175693834520)\n   (DayFn 24\n\t  (MonthFn March\n\t\t   (YearFn 2012))) 90)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 618868380208131720)\n   (DayFn 2\n\t  (MonthFn May\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 645495858520049520)\n   (DayFn 22\n\t  (MonthFn February\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 388339025870429520)\n   (DayFn 21\n\t  (MonthFn February\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 210136175693834520)\n   (DayFn 24\n\t  (MonthFn January\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 210136175693834520)\n   (DayFn 24\n\t  (MonthFn January\n\t\t   (YearFn 2009))) 90))\n\n (thereExists ?SUPPLY-SUM\n  (thereExists ?SUPPLY-LIST\n   (thereExists ?DATE-LIST\n    (thereExists ?EARLIEST-DATE\n     (thereExists ?LATEST-DATE\n      (thereExists ?LATEST-SUPPLY\n       (thereExists ?END-OF-SUPPLY-DATE\n        (thereExists ?ELAPSED-TIME\n\t (and\n\t  (greaterThanOrEqualTo ?SUPPLY-SUM 181) \n\t  (evaluate ?SUPPLY-LIST (MapFunctionOverList ThirdInListFn  ?LIST))\n\t  (evaluate ?SUPPLY-SUM (ApplyFunctionRecursivelyFn\n\t\t\t\t (RestOfListFn ?SUPPLY-LIST)\n\t\t\t\t (NthInListFn ?SUPPLY-LIST 1) PlusFn))\n\t  (evaluate ?DATE-LIST (MapFunctionOverList SecondInListFn ?LIST))\n\t  (evaluate ?EARLIEST-DATE (LastInListFn ?DATE-LIST))\n\t  (evaluate ?LATEST-DATE   (FirstInListFn ?DATE-LIST))\n\t  (evaluate ?LATEST-SUPPLY (FirstInListFn ?SUPPLY-LIST))\n\t  (evaluate ?END-OF-SUPPLY-DATE (DateAfterFn ?LATEST-DATE (DaysDuration ?LATEST-SUPPLY)))\n\t  (evaluate ?ELAPSED-TIME (TimeElapsedFn ?EARLIEST-DATE ?END-OF-SUPPLY-DATE))\n\t  (greaterThanOrEqualTo ?ELAPSED-TIME (DaysDuration 181))\n\t  (greaterThanOrEqualTo (DaysDuration ?SUPPLY-SUM) ?ELAPSED-TIME)))))))))))") });

    private static final SubLSymbol $EL_LIST_ARG_IS_NOT_AN_EL_LIST = makeKeyword("EL-LIST-ARG-IS-NOT-AN-EL-LIST");

    private static final SubLSymbol $MIN_ARG_IS_NOT_A_POSITIVE_INTEGER = makeKeyword("MIN-ARG-IS-NOT-A-POSITIVE-INTEGER");

    private static final SubLSymbol $MAX_ARG_IS_NOT_A_POSITIVE_INTEGER = makeKeyword("MAX-ARG-IS-NOT-A-POSITIVE-INTEGER");

    private static final SubLSymbol $MAX_ARG_IS_NOT_GREATER_THAN_OR_EQUAL_TO_MIN_ARG = makeKeyword("MAX-ARG-IS-NOT-GREATER-THAN-OR-EQUAL-TO-MIN-ARG");

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLSymbol $QUOTED_QUERY_ARG_IS_NOT_QUOTED = makeKeyword("QUOTED-QUERY-ARG-IS-NOT-QUOTED");

    private static final SubLSymbol $QUERY_ARG_IS_NOT_AN_EL_FORMULA = makeKeyword("QUERY-ARG-IS-NOT-AN-EL-FORMULA");

    private static final SubLSymbol $NO_OPEN_QUERY_VAR = makeKeyword("NO-OPEN-QUERY-VAR");

    private static final SubLSymbol $TOO_MANY_OPEN_QUERY_VARS = makeKeyword("TOO-MANY-OPEN-QUERY-VARS");



    private static final SubLObject $const14$resultOfSubstitutingTermsListForT = reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula"));

    private static final SubLSymbol $REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA = makeKeyword("REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA");

    private static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$resultOfSubstitutingTermsListForTermsListInFormula <anything> <fully-bound-p> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingTermsListForTermsListInFormula <fully-bound-p> <anything> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingTermsListForTermsListInFormula <fully-bound-p> <fully-bound-p> <anything> <fully-bound-p>)\n(#$resultOfSubstitutingTermsListForTermsListInFormula <fully-bound-p> <fully-bound-p> <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$resultOfSubstitutingTermsListForTermsListInFormula\n       (#$TheList 1 2 3)\n       (#$TheList \"A\" \"B\" \"C\")\n       (#$TheList \"A\" \"B\" \"C\" \"D\")\n       ?WHAT)") });

    private static final SubLSymbol $sym17$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol $sym18$TEST_REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA_E = makeSymbol("TEST-REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND");













    private static final SubLObject $list25 = _constant_25_initializer();

    private static final SubLObject $const26$resultOfSubstitutingListOfTermsLi = reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula"));

    private static final SubLSymbol $kw27$REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFO = makeKeyword("REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <anything> <fully-bound-p> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <fully-bound-p> <anything> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <fully-bound-p> <fully-bound-p> <anything> <fully-bound-p>)\n(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <fully-bound-p> <fully-bound-p> <fully-bound-p> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula\n       (#$TheList (#$TheList 1 2 3))\n       (#$TheList (#$TheList \"A\" \"B\" \"C\"))\n       (#$TheList \"A\" \"B\" \"C\" \"D\") ?WHAT)\n       ?WHAT)") });



    private static final SubLSymbol $sym30$TEST_REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLIS = makeSymbol("TEST-REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND");

    private static final SubLObject $list31 = _constant_31_initializer();

    private static final SubLObject $$maximalCompatibleListsFromList = reader_make_constant_shell(makeString("maximalCompatibleListsFromList"));

    private static final SubLSymbol EL_SET_ITEMS = makeSymbol("EL-SET-ITEMS");



    private static final SubLSymbol $sym35$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    private static final SubLSymbol $REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_CHECK_POS = makeKeyword("REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-CHECK-POS");

    private static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("maximalCompatibleListsFromList")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("maximalCompatibleListsFromList")), cons(reader_make_constant_shell(makeString("TheList")), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell(makeString("TheSet")), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell(makeString("TheList")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("maximalCompatibleListsFromList")), list($BIND, makeSymbol("INPUT-LIST")), list($BIND, makeSymbol("INCOMPATIBLE-PAIRS")), list($BIND, makeSymbol("MAXIMAL-LIST"))), list(list(makeKeyword("VALUE"), makeSymbol("INPUT-LIST")), list(makeKeyword("VALUE"), makeSymbol("INCOMPATIBLE-PAIRS")), list(makeKeyword("VALUE"), makeSymbol("MAXIMAL-LIST")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-POS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("INPUT-LIST")), list(makeKeyword("VALUE"), makeSymbol("INCOMPATIBLE-PAIRS")), list(makeKeyword("VALUE"), makeSymbol("MAXIMAL-LIST"))), makeKeyword("DOCUMENTATION"), makeString("(#$maximalCompatibleListsFromList <fully-bound> <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$maximalCompatibleListsFromList\n  (#$TheList 0 1 2 3)\n  (#$TheSet\n    (#$TheSet 0 1)(#$TheSet 1 2)(#$TheSet 2 0)\n    (#$TheSet 0 3)(#$TheSet 1 3)(#$TheSet 2 3))\n  (#$TheList 2))") });



    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));



    private static final SubLSymbol $REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_UNIFY_POS = makeKeyword("REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-UNIFY-POS");

    private static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("maximalCompatibleListsFromList")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("maximalCompatibleListsFromList")), cons(reader_make_constant_shell(makeString("TheList")), makeKeyword("FULLY-BOUND")), cons(reader_make_constant_shell(makeString("TheSet")), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-UNIFY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalCompatibleListsFromList <fully-bound> <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$maximalCompatibleListsFromList\n      (#$TheList 1 2 \"II\" 3 \"three\" 4)\n      (#$TheSet (#$TheSet 2 \"II\") (#$TheSet 3 \"III\") (#$TheSet \"three\" \"III\"))\n      ?MAXIMAL-COMBINATIONS)\n    will bind ?MAXIMAL-COMBINATIONS to\n    (#$TheSet\n      (#$TheList 1 2 3 \"three\" 4)\n      (#$TheList 1 2 \"III\" 4)\n      (#$TheList 1 \"II\" 3 \"three\" 4)\n      (#$TheList 1 \"II\" \"III\" 4))") });

    private static final SubLObject $$nthInList = reader_make_constant_shell(makeString("nthInList"));

    private static final SubLSymbol $REMOVAL_NTHINLIST_UNIFY_POS = makeKeyword("REMOVAL-NTHINLIST-UNIFY-POS");

    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nthInList")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("nthInList")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), listS(reader_make_constant_shell(makeString("nthInList")), list($TEST, makeSymbol("EL-LIST-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-NTHINLIST-UNIFY-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTHINLIST-UNIFY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nthInList <fully-bound> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$nthInList (#$TheList 5 4 3 2 1) ?N ?ITEM)") });

    private static final SubLObject $$numberOfOccurencesOfItemInList = reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList"));

    private static final SubLSymbol $REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_UNIFY_POS = makeKeyword("REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS");

    private static final SubLList $list48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), listS(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), list($TEST, makeSymbol("EL-LIST-P")), makeKeyword("ANYTHING"))), $COST, makeSymbol("REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$numberOfOccurencesOfItemInList <fully-bound> <anything> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$numberOfOccurencesOfItemInList (#$TheList 5 4 3 2 1) ?ITEM ?N)") });

    private static final SubLSymbol TEST_REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_EXPAND = makeSymbol("TEST-REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-EXPAND");

    private static final SubLList $list50 = list(list(list(list(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), list(new SubLObject[]{ reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), ONE_INTEGER, makeSymbol("?N"))), FOUR_INTEGER), list(list(list(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), list(new SubLObject[]{ reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), THREE_INTEGER, makeSymbol("?N"))), TWO_INTEGER), list(list(list(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), list(new SubLObject[]{ reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), NINE_INTEGER, makeSymbol("?N"))), ZERO_INTEGER), list(list(list(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), list(new SubLObject[]{ reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), SIX_INTEGER, makeSymbol("?N"))), ONE_INTEGER), list(list(list(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("Cat")), reader_make_constant_shell(makeString("List")), list(reader_make_constant_shell(makeString("JuvenileFn")), reader_make_constant_shell(makeString("Dog")))), reader_make_constant_shell(makeString("Dog")), makeSymbol("?N"))), ONE_INTEGER), list(list(list(reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), SEVEN_INTEGER, NINE_INTEGER), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, FOUR_INTEGER, SEVEN_INTEGER), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER)), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER), makeSymbol("?N"))), TWO_INTEGER));

    public static SubLObject removal_list_has_max_sublist_meeting_condition_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject max_sub_list_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject min_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject max_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject el_list_arg = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        final SubLObject quoted_query_arg = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
        SubLObject query_arg = NIL;
        SubLObject open_query_var = NIL;
        if (NIL == el_list_p(el_list_arg)) {
            return values(NIL, $EL_LIST_ARG_IS_NOT_AN_EL_LIST);
        }
        if (NIL == subl_promotions.positive_integer_p(min_arg)) {
            return values($MIN_ARG_IS_NOT_A_POSITIVE_INTEGER);
        }
        if (NIL == subl_promotions.positive_integer_p(max_arg)) {
            return values($MAX_ARG_IS_NOT_A_POSITIVE_INTEGER);
        }
        if (!max_arg.numGE(min_arg)) {
            return values(NIL, $MAX_ARG_IS_NOT_GREATER_THAN_OR_EQUAL_TO_MIN_ARG);
        }
        if (NIL == el_formula_with_operator_p(quoted_query_arg, $$Quote)) {
            return values(NIL, $QUOTED_QUERY_ARG_IS_NOT_QUOTED);
        }
        query_arg = cycl_utilities.el_formula_arg1(quoted_query_arg, UNPROVIDED);
        if (NIL == el_formula_p(query_arg)) {
            return values(NIL, $QUERY_ARG_IS_NOT_AN_EL_FORMULA);
        }
        final SubLObject open_query_vars = expression_free_variables(query_arg, UNPROVIDED);
        if (NIL == open_query_vars) {
            return values(NIL, $NO_OPEN_QUERY_VAR);
        }
        if (NIL == list_utilities.singletonP(open_query_vars)) {
            return values(NIL, $TOO_MANY_OPEN_QUERY_VARS);
        }
        open_query_var = open_query_vars.first();
        final SubLObject list_items = el_list_items(el_list_arg);
        final SubLObject list_items_count = length(list_items);
        SubLObject max_el_sublists;
        SubLObject sublist_length;
        SubLObject num_sublists_of_sublist_length;
        SubLObject n;
        SubLObject n_plus_sublist_length;
        SubLObject sublist;
        SubLObject el_sublist;
        SubLObject item_var;
        for (max_el_sublists = NIL, sublist_length = NIL, sublist_length = min(max_arg, list_items_count); (!sublist_length.numL(min_arg)) && (NIL == max_el_sublists); sublist_length = subtract(sublist_length, ONE_INTEGER)) {
            for (num_sublists_of_sublist_length = add(ONE_INTEGER, subtract(list_items_count, sublist_length)), n = NIL, n = ZERO_INTEGER; n.numL(num_sublists_of_sublist_length); n = add(n, ONE_INTEGER)) {
                n_plus_sublist_length = add(n, sublist_length);
                sublist = subseq(list_items, n, n_plus_sublist_length);
                el_sublist = make_el_list(sublist, UNPROVIDED);
                if (NIL != el_list_for_query_var_satisfies_queryP(el_sublist, open_query_var, query_arg)) {
                    item_var = el_sublist;
                    if (NIL == member(item_var, max_el_sublists, symbol_function(EQL), symbol_function(IDENTITY))) {
                        max_el_sublists = cons(item_var, max_el_sublists);
                    }
                }
            }
        }
        if (NIL != max_el_sublists) {
            SubLObject cdolist_list_var = max_el_sublists;
            SubLObject max_el_sublist = NIL;
            max_el_sublist = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_bindings = unification_utilities.term_unify(max_sub_list_arg, max_el_sublist, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                max_el_sublist = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject el_list_for_query_var_satisfies_queryP(final SubLObject el_sublist, final SubLObject open_query_var, final SubLObject query_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence = cycl_utilities.expression_subst(el_sublist, open_query_var, query_arg, UNPROVIDED, UNPROVIDED);
        final SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
        return ask_utilities.inference_recursive_query(query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), query_properties);
    }

    public static SubLObject removal_resultofsubstitutingtermslistfortermslistinformula_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject new_list_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject old_list_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject old_formula_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject result_formula_arg = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        SubLObject result_asent = NIL;
        if (NIL != variables.not_fully_bound_p(result_formula_arg)) {
            final SubLObject new_list = el_list_items(new_list_arg);
            final SubLObject old_list = el_list_items(old_list_arg);
            thread.resetMultipleValues();
            final SubLObject result_formula = list_utilities.list_subst_all_in_tree(new_list, old_list, old_formula_arg, $sym17$EQUALS_EL_);
            final SubLObject replacedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != replacedP) && (NIL != wff.el_wfeP(result_formula, UNPROVIDED, UNPROVIDED))) {
                result_asent = make_quaternary_formula(pred, new_list_arg, old_list_arg, old_formula_arg, result_formula);
            }
        }
        if (NIL != result_asent) {
            final SubLObject v_bindings = unification_utilities.term_unify(asent, result_asent, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_resultofsubstitutingtermslistfortermslistinformula_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static SubLObject removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
        final SubLObject new_lists_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject old_lists_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject result_formula;
        final SubLObject old_formula_arg = result_formula = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject result_asent = NIL;
        SubLObject failureP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == failureP) {
                        SubLObject new_list_arg = NIL;
                        SubLObject new_list_arg_$1 = NIL;
                        SubLObject old_list_arg = NIL;
                        SubLObject old_list_arg_$2 = NIL;
                        new_list_arg = el_list_items(new_lists_arg);
                        new_list_arg_$1 = new_list_arg.first();
                        old_list_arg = el_list_items(old_lists_arg);
                        old_list_arg_$2 = old_list_arg.first();
                        while ((NIL == failureP) && ((NIL != old_list_arg) || (NIL != new_list_arg))) {
                            final SubLObject new_list = el_list_items(new_list_arg_$1);
                            final SubLObject old_list = el_list_items(old_list_arg_$2);
                            thread.resetMultipleValues();
                            final SubLObject possible_result_formula = list_utilities.list_subst_all_in_tree(new_list, old_list, result_formula, $sym17$EQUALS_EL_);
                            final SubLObject replacedP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != replacedP) && (NIL != wff.el_wfeP(possible_result_formula, UNPROVIDED, UNPROVIDED))) {
                                result_formula = possible_result_formula;
                            } else {
                                failureP = T;
                            }
                            new_list_arg = new_list_arg.rest();
                            new_list_arg_$1 = new_list_arg.first();
                            old_list_arg = old_list_arg.rest();
                            old_list_arg_$2 = old_list_arg.first();
                        } 
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
        if ((NIL == failureP) && (NIL == error_message)) {
            result_asent = make_quaternary_formula(pred, new_lists_arg, old_lists_arg, old_formula_arg, result_formula);
            if (NIL != result_asent) {
                final SubLObject v_bindings = unification_utilities.term_unify(asent, result_asent, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject test_removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static SubLObject extract_lists_from_el_set_of_sets(final SubLObject el_set) {
        final SubLObject el_sets = el_set_items(el_set);
        return Mapping.mapcar(symbol_function(EL_SET_ITEMS), el_sets);
    }

    public static SubLObject extract_lists_from_el_set_of_lists(final SubLObject el_set) {
        final SubLObject el_lists = el_set_items(el_set);
        return Mapping.mapcar(symbol_function(EL_LIST_ITEMS), el_lists);
    }

    public static SubLObject removal_maximal_compatible_lists_from_list_pos_check(final SubLObject input_el_list, final SubLObject incompatible_el_pairs, final SubLObject maximal_el_list) {
        final SubLObject input_list = el_list_items(input_el_list);
        final SubLObject incompatible_pairs = extract_lists_from_el_set_of_sets(incompatible_el_pairs);
        final SubLObject maximal_list = el_list_items(maximal_el_list);
        return find(maximal_list, list_utilities.compute_all_compatible_sublists(input_list, incompatible_pairs, UNPROVIDED, UNPROVIDED), symbol_function($sym35$SETS_EQUAL_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_maximal_compatible_lists_from_list_unify_pos_expand(final SubLObject asent, final SubLObject sense) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject input_list = el_list_items(arg1);
        final SubLObject incompatible_pairs = extract_lists_from_el_set_of_sets(arg2);
        SubLObject cdolist_list_var;
        final SubLObject all_maximal_lists = cdolist_list_var = list_utilities.compute_all_compatible_sublists(input_list, incompatible_pairs, UNPROVIDED, UNPROVIDED);
        SubLObject maximal_list = NIL;
        maximal_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = unification_utilities.term_unify(arg3, make_el_list(maximal_list, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                final SubLObject unify_arg3 = make_el_list(bindings.subst_bindings(v_bindings, arg3), UNPROVIDED);
                final SubLObject formula = list($$maximalCompatibleListsFromList, arg1, arg2, unify_arg3);
                backward.removal_add_node(arguments.make_hl_support($CODE, formula, $$UniversalVocabularyMt, $TRUE_MON), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            maximal_list = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_nthinlist_unify_pos_cost(final SubLObject asent) {
        if ((NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) && (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED)))) {
            return el_list_length(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        }
        return $cheap_hl_module_check_cost$.getGlobalValue();
    }

    public static SubLObject removal_nthinlist_unify_pos_expand(final SubLObject asent, final SubLObject sense) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject input_list = el_list_items(arg1);
        SubLObject list_var = NIL;
        SubLObject elem = NIL;
        SubLObject num = NIL;
        list_var = input_list;
        elem = list_var.first();
        for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , elem = list_var.first() , num = add(ONE_INTEGER, num)) {
            final SubLObject fully_bound_asent = make_ternary_formula($$nthInList, arg1, add(num, ONE_INTEGER), elem);
            final SubLObject v_bindings = unification_utilities.term_unify(asent, fully_bound_asent, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, fully_bound_asent, UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_numberofoccurencesofiteminlist_unify_pos_cost(final SubLObject asent) {
        if ((NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) && (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED)))) {
            return length(remove_duplicates(el_list_items(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return $cheap_hl_module_check_cost$.getGlobalValue();
    }

    public static SubLObject removal_numberofoccurencesofiteminlist_unify_pos_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject input_list = el_list_items(arg1);
        final SubLObject count_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        if (NIL != variables.fully_bound_p(arg2)) {
            final SubLObject count = count(arg2, input_list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            dictionary.dictionary_enter(count_dictionary, arg2, count);
        } else {
            SubLObject cdolist_list_var = input_list;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_increment(count_dictionary, elem, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(count_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject elem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject fully_bound_asent = make_ternary_formula($$numberOfOccurencesOfItemInList, arg1, elem, count2);
            final SubLObject v_bindings = unification_utilities.term_unify(asent, fully_bound_asent, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, fully_bound_asent, UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject test_removal_numberofoccurencesofiteminlist_expand(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject v_answer = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        if (NIL != cyc_kernel.closed_query_success_token_p(v_answer)) {
            return T;
        }
        if (NIL != bindings.bindings_p(v_answer)) {
            return bindings.bindings_values(v_answer.first()).first();
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_subsets_and_sublists_file() {
        declareFunction("removal_list_has_max_sublist_meeting_condition_expand", "REMOVAL-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-EXPAND", 1, 1, false);
        declareFunction("el_list_for_query_var_satisfies_queryP", "EL-LIST-FOR-QUERY-VAR-SATISFIES-QUERY?", 3, 0, false);
        declareFunction("removal_resultofsubstitutingtermslistfortermslistinformula_expand", "REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND", 1, 1, false);
        declareFunction("test_removal_resultofsubstitutingtermslistfortermslistinformula_expand", "TEST-REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND", 1, 2, false);
        declareFunction("removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand", "REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND", 1, 1, false);
        declareFunction("test_removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand", "TEST-REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND", 1, 2, false);
        declareFunction("extract_lists_from_el_set_of_sets", "EXTRACT-LISTS-FROM-EL-SET-OF-SETS", 1, 0, false);
        declareFunction("extract_lists_from_el_set_of_lists", "EXTRACT-LISTS-FROM-EL-SET-OF-LISTS", 1, 0, false);
        declareFunction("removal_maximal_compatible_lists_from_list_pos_check", "REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-POS-CHECK", 3, 0, false);
        declareFunction("removal_maximal_compatible_lists_from_list_unify_pos_expand", "REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-UNIFY-POS-EXPAND", 2, 0, false);
        declareFunction("removal_nthinlist_unify_pos_cost", "REMOVAL-NTHINLIST-UNIFY-POS-COST", 1, 0, false);
        declareFunction("removal_nthinlist_unify_pos_expand", "REMOVAL-NTHINLIST-UNIFY-POS-EXPAND", 2, 0, false);
        declareFunction("removal_numberofoccurencesofiteminlist_unify_pos_cost", "REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-COST", 1, 0, false);
        declareFunction("removal_numberofoccurencesofiteminlist_unify_pos_expand", "REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-EXPAND", 2, 0, false);
        declareFunction("test_removal_numberofoccurencesofiteminlist_expand", "TEST-REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-EXPAND", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_subsets_and_sublists_file() {
        defparameter("*DEFAULT-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-COST*", multiply(THREE_INTEGER, $expensive_hl_module_check_cost$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject setup_removal_modules_subsets_and_sublists_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$listHasMaxSublistMeetingCondition);
        preference_modules.doomed_unless_arg_bindable($POS, $$listHasMaxSublistMeetingCondition, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$listHasMaxSublistMeetingCondition, THREE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$listHasMaxSublistMeetingCondition, FOUR_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$listHasMaxSublistMeetingCondition, FIVE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LIST_HAS_MAX_SUBLIST_MEETING_CONDITION, $list3);
        preference_modules.doomed_unless_arg_bindable($POS, $const14$resultOfSubstitutingTermsListForT, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const14$resultOfSubstitutingTermsListForT, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const14$resultOfSubstitutingTermsListForT, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA, $list16);
        define_test_case_table_int($sym18$TEST_REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA_E, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list25);
        preference_modules.doomed_unless_arg_bindable($POS, $const26$resultOfSubstitutingListOfTermsLi, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const26$resultOfSubstitutingListOfTermsLi, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const26$resultOfSubstitutingListOfTermsLi, THREE_INTEGER);
        inference_modules.inference_removal_module($kw27$REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFO, $list28);
        define_test_case_table_int($sym30$TEST_REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLIS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list31);
        inference_modules.register_solely_specific_removal_module_predicate($$maximalCompatibleListsFromList);
        preference_modules.doomed_unless_arg_bindable($POS, $$maximalCompatibleListsFromList, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$maximalCompatibleListsFromList, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_CHECK_POS, $list37);
        inference_modules.register_solely_specific_removal_module_predicate($$maximalCompatibleListsFromList);
        preference_modules.doomed_unless_arg_bindable($POS, $$maximalCompatibleListsFromList, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$maximalCompatibleListsFromList, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_UNIFY_POS, $list42);
        inference_modules.register_solely_specific_removal_module_predicate($$nthInList);
        preference_modules.doomed_unless_arg_bindable($POS, $$nthInList, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NTHINLIST_UNIFY_POS, $list45);
        inference_modules.register_solely_specific_removal_module_predicate($$numberOfOccurencesOfItemInList);
        preference_modules.doomed_unless_arg_bindable($POS, $$numberOfOccurencesOfItemInList, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_UNIFY_POS, $list48);
        define_test_case_table_int(TEST_REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_EXPAND, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list50);
        return NIL;
    }

    private static SubLObject _constant_25_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER), list(reader_make_constant_shell(makeString("TheList")), makeString("B"), makeString("C")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), makeString("A"), SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), reader_make_constant_shell(makeString("TheEmptyList")), list(reader_make_constant_shell(makeString("TheList")), makeString("B"), makeString("C")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), makeString("b"), makeString("c")), list(reader_make_constant_shell(makeString("TheList")), makeString("B"), makeString("C")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("b"), makeString("c"), makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER), list(reader_make_constant_shell(makeString("TheList")), makeString("b"), makeString("c")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), NIL), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOURTEEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOURTEEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), ZERO_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220)))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), ZERO_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), reader_make_constant_shell(makeString("TheEmptyList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn"))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("Volt")), makeInteger(220))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(102), SEVENTEEN_INTEGER))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(102), SEVENTEEN_INTEGER)))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER)))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(102), SEVENTEEN_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER)), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SIX_INTEGER))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), SEVEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), makeInteger(102), SEVENTEEN_INTEGER))))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), EIGHT_INTEGER, SIX_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SIX_INTEGER))))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER))))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), FOUR_INTEGER, THREE_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER))))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), EIGHT_INTEGER, SIX_INTEGER)), reader_make_constant_shell(makeString("InfixMinusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SIX_INTEGER)))))))) });
    }

    private static SubLObject _constant_31_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), list(reader_make_constant_shell(makeString("TheList")), makeString("SOME")), list(reader_make_constant_shell(makeString("TheList")), makeString("COOL"), makeString("BEANS"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, makeString("D"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), makeString("SOME"), makeString("COOL"), makeString("BEANS"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), list(reader_make_constant_shell(makeString("TheList")), NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C")), list(reader_make_constant_shell(makeString("TheList")), makeString("D"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER)))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), list(reader_make_constant_shell(makeString("TheList")), NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B")), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, makeString("C"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), THREE_INTEGER, makeString("C")), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), NIL), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("B"), makeString("C"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), makeString("A"), SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("TheEmptyList"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("B"), makeString("C"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("b"), makeString("c"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("B"), makeString("C"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("b"), makeString("c"), makeString("D"))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER)), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), makeString("b"), makeString("c"))), list(reader_make_constant_shell(makeString("TheList")), makeString("A"), makeString("B"), makeString("C"), makeString("D")), makeSymbol("?WHAT"))), NIL), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOURTEEN_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOURTEEN_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER)))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), FIVE_INTEGER, THREE_INTEGER, SEVEN_INTEGER))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, TWO_INTEGER, SEVEN_INTEGER)))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), FIVE_INTEGER, THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("MixedFractionFn")), THREE_INTEGER, TWO_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER))), makeSymbol("?WHAT"))), list(list(list(new SubLObject[]{ makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), list(reader_make_constant_shell(makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER)) })))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))), makeSymbol("?WHAT"))), list(list(list(makeSymbol("?WHAT"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FIVE_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TEN_INTEGER), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("x"))))))), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")), reader_make_constant_shell(makeString("TheEmptyList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y")))), list(reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), THREE_INTEGER), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), FOUR_INTEGER), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("y"))))), makeSymbol("?X"))), NIL), list(list(list(reader_make_constant_shell(makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(35))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(310))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(510)))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("a")), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("b"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("a")), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("c"))), list(reader_make_constant_shell(makeString("TheList")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("b")), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("c")))), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(new SubLObject[]{ reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("a")), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("b")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("b")), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("c")), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("a")), reader_make_constant_shell(makeString("ImplicitTimesFn")), list(reader_make_constant_shell(makeString("MathVarFn")), makeString("c")) }))), makeSymbol("?NEW-EXP"))), list(list(list(makeSymbol("?NEW-EXP"), reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), TWO_INTEGER), reader_make_constant_shell(makeString("InfixTimesFn")), list(reader_make_constant_shell(makeString("ParenthesizedMathFn")), list(reader_make_constant_shell(makeString("MathExpressionFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(35)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(510)), reader_make_constant_shell(makeString("InfixPlusFn")), list(reader_make_constant_shell(makeString("MathQuantFn")), makeInteger(310)))))))) });
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_subsets_and_sublists_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_subsets_and_sublists_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_subsets_and_sublists_file();
    }

    static {





















































    }
}

/**
 * Total time: 412 ms
 */
