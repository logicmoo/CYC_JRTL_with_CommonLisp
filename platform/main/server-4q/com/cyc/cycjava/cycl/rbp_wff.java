package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.rbp_wff;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.rbp_wff.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rbp_wff extends SubLTranslatedFile {
    public static final SubLFile me = new rbp_wff();

    public static final String myName = "com.cyc.cycjava.cycl.rbp_wff";

    public static final String myFingerPrint = "f0e7453630eaa5b791755b8e7633e4ef7c1f31b721fff38243d0fce330c0c6de";

    // defparameter
    // Definitions
    // How much time did we spend wff-checking?
    public static final SubLSymbol $rbp_wff_check_time$ = makeSymbol("*RBP-WFF-CHECK-TIME*");

    // defparameter
    // How many wff-checks were performed?
    private static final SubLSymbol $rbp_wff_checks_total$ = makeSymbol("*RBP-WFF-CHECKS-TOTAL*");

    // defparameter
    // How many wff-checks declared their input not well-formed?
    private static final SubLSymbol $rbp_wff_checks_failed$ = makeSymbol("*RBP-WFF-CHECKS-FAILED*");

    // defparameter
    // Boolean; Should we show information about failed wff-checks?
    public static final SubLSymbol $rbp_show_non_wffP$ = makeSymbol("*RBP-SHOW-NON-WFF?*");













    // deflexical
    private static final SubLSymbol $rbp_wf_nat_externalP_caching_state$ = makeSymbol("*RBP-WF-NAT-EXTERNAL?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $rbp_wf_template_argsP_caching_state$ = makeSymbol("*RBP-WF-TEMPLATE-ARGS?-CACHING-STATE*");

    // defparameter
    /**
     * BOOLEANP; Should we screen candidate terms to see if they are meaningfully
     * defined in the domain mt?
     */
    public static final SubLSymbol $rbp_wff_check_visibilityP$ = makeSymbol("*RBP-WFF-CHECK-VISIBILITY?*");

    // deflexical
    private static final SubLSymbol $rbp_wf_natP_caching_state$ = makeSymbol("*RBP-WF-NAT?-CACHING-STATE*");





    // deflexical
    private static final SubLSymbol $rbp_wff_test_fails_intP_caching_state$ = makeSymbol("*RBP-WFF-TEST-FAILS-INT?-CACHING-STATE*");



    // defparameter
    // BOOLEANP; Do we count known falseness as non-wffness?
    public static final SubLSymbol $rbp_known_false_equals_non_wffP$ = makeSymbol("*RBP-KNOWN-FALSE-EQUALS-NON-WFF?*");









    // defparameter
    /**
     * BOOLEANP; Should we weed out the impossible pairs? This makes this function
     * smarter but slower.
     */
    private static final SubLSymbol $rbp_validate_iani_pairsP$ = makeSymbol("*RBP-VALIDATE-IANI-PAIRS?*");



    // deflexical
    private static final SubLSymbol $rbp_wff_subcol_fns$ = makeSymbol("*RBP-WFF-SUBCOL-FNS*");

    // Internal Constants
    public static final SubLSymbol $rbp_wff_validation_count$ = makeSymbol("*RBP-WFF-VALIDATION-COUNT*");

    public static final SubLSymbol $rbp_wff_validation_false_pos$ = makeSymbol("*RBP-WFF-VALIDATION-FALSE-POS*");

    public static final SubLSymbol $rbp_wff_validation_false_neg$ = makeSymbol("*RBP-WFF-VALIDATION-FALSE-NEG*");

    public static final SubLSymbol $rbp_wff_validate_setting$ = makeSymbol("*RBP-WFF-VALIDATE-SETTING*");

    public static final SubLSymbol $rbp_vocabulary_mts$ = makeSymbol("*RBP-VOCABULARY-MTS*");



    public static final SubLSymbol $rbp_wff_quaternary_rmps$ = makeSymbol("*RBP-WFF-QUATERNARY-RMPS*");

    public static final SubLString $str7$__Performed__D_wff_check_validati = makeString("~&Performed ~D wff-check validations.~%");

    public static final SubLList $list8 = list(makeKeyword("POS"), makeKeyword("ALL"));

    public static final SubLString $str9$__Found__D_false_positives___ = makeString("~&Found ~D false positives.~%");

    public static final SubLString $str10$____S__ = makeString("~& ~S~%");

    public static final SubLList $list11 = list(makeKeyword("NEG"), makeKeyword("ALL"));

    public static final SubLString $str12$__Found__D_false_negatives___ = makeString("~&Found ~D false negatives.~%");

    public static final SubLList $list13 = list(makeSymbol("KEY"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list15 = list(makeSymbol("RBP-WFF-CLEAR-CACHES"));

    public static final SubLList $list16 = list(makeSymbol("RBP-WFF-VALIDATION-RESET"));



    public static final SubLSymbol RBP_WFF_VALIDATION_REPORT = makeSymbol("RBP-WFF-VALIDATION-REPORT");

    public static final SubLSymbol $sym19$RBP_WF_NAT_EXTERNAL_ = makeSymbol("RBP-WF-NAT-EXTERNAL?");

    public static final SubLSymbol $sym20$_RBP_WF_NAT_EXTERNAL__CACHING_STATE_ = makeSymbol("*RBP-WF-NAT-EXTERNAL?-CACHING-STATE*");





    private static final SubLSymbol $sym23$RBP_WF_TEMPLATE_ARGS_ = makeSymbol("RBP-WF-TEMPLATE-ARGS?");

    private static final SubLList $list24 = list(makeSymbol("TYPE"), makeSymbol("DENOT-TEMP"), makeSymbol("TARGET"), makeSymbol("TEST-MT"));





    private static final SubLSymbol $sym27$RBP_WFF_MAYBE_ISA_ = makeSymbol("RBP-WFF-MAYBE-ISA?");



    private static final SubLSymbol $sym29$RBP_WFF_NOT_ISA_ = makeSymbol("RBP-WFF-NOT-ISA?");



    private static final SubLSymbol $sym31$RBP_WFF_MAYBE_GENL_ = makeSymbol("RBP-WFF-MAYBE-GENL?");



    private static final SubLSymbol $sym33$NPP_NOT_GENL_ = makeSymbol("NPP-NOT-GENL?");



    private static final SubLSymbol $sym35$NPP_NOT_DISJOINT_ = makeSymbol("NPP-NOT-DISJOINT?");



    private static final SubLSymbol $sym37$NPP_NOT_TYPE_DISJOINT_ = makeSymbol("NPP-NOT-TYPE-DISJOINT?");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sym40$_RBP_WF_TEMPLATE_ARGS__CACHING_STATE_ = makeSymbol("*RBP-WF-TEMPLATE-ARGS?-CACHING-STATE*");

    private static final SubLList $list41 = cons(makeSymbol("KEYWORD"), makeSymbol("VALUE"));

    private static final SubLString $str42$___S_not_sufficiently_defined_in_ = makeString("~&~S not sufficiently defined in ~S~%~%");

    private static final SubLList $list43 = list(reader_make_constant_shell(makeString("EverythingPSC")), reader_make_constant_shell(makeString("InferencePSC")));

    public static final SubLList $list44 = list(reader_make_constant_shell(makeString("Thing")));

    public static final SubLList $list45 = list(makeSymbol("TYPE"), makeSymbol("TERM"), makeSymbol("COLL"), makeSymbol("MT"));

    private static final SubLString $str46$__Spent__4_2F_seconds_wff_checkin = makeString("~&Spent ~4,2F seconds wff-checking.");

    private static final SubLString $str47$___D_of__D_items_wff_checked_were = makeString("  ~D of ~D items wff-checked were non-wf.~%");

    private static final SubLSymbol $sym48$RBP_WF_NAT_ = makeSymbol("RBP-WF-NAT?");

    private static final SubLSymbol $sym49$_RBP_WF_NAT__CACHING_STATE_ = makeSymbol("*RBP-WF-NAT?-CACHING-STATE*");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));









    private static final SubLObject $$typedGenlPreds = reader_make_constant_shell(makeString("typedGenlPreds"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$typeGenls = reader_make_constant_shell(makeString("typeGenls"));



    private static final SubLSymbol NORMAL_INFERENCE = makeSymbol("NORMAL-INFERENCE");



    private static final SubLObject $$resultGenl = reader_make_constant_shell(makeString("resultGenl"));

    private static final SubLObject $$resultGenlArg = reader_make_constant_shell(makeString("resultGenlArg"));

    private static final SubLObject $$preservesGenlsInArg = reader_make_constant_shell(makeString("preservesGenlsInArg"));





    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$CollectionType = reader_make_constant_shell(makeString("CollectionType"));

    private static final SubLSymbol $sym68$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol RBP_WFF_FIND_FLOOR_MTS_INT = makeSymbol("RBP-WFF-FIND-FLOOR-MTS-INT");

    private static final SubLSymbol $rbp_wff_find_floor_mts_int_caching_state$ = makeSymbol("*RBP-WFF-FIND-FLOOR-MTS-INT-CACHING-STATE*");



    private static final SubLSymbol $sym72$MT_RELEVANT_TO_MT_ = makeSymbol("MT-RELEVANT-TO-MT?");

    private static final SubLObject $$SpecsFn = reader_make_constant_shell(makeString("SpecsFn"));

    private static final SubLObject $$CycLSentence_Assertible = reader_make_constant_shell(makeString("CycLSentence-Assertible"));

    private static final SubLObject $$TruthFunction = reader_make_constant_shell(makeString("TruthFunction"));

    private static final SubLObject $$CollectionDenotingFunction = reader_make_constant_shell(makeString("CollectionDenotingFunction"));

    private static final SubLObject $$relationAllExists = reader_make_constant_shell(makeString("relationAllExists"));

    private static final SubLSymbol $sym78$NPP_GENL_OR_ANY_ = makeSymbol("NPP-GENL-OR-ANY?");

    private static final SubLObject $$relationExistsAll = reader_make_constant_shell(makeString("relationExistsAll"));

    private static final SubLObject $$relationExistsUniqueAll = reader_make_constant_shell(makeString("relationExistsUniqueAll"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLSymbol $sym82$NPP_ISA_OR_ANY_ = makeSymbol("NPP-ISA-OR-ANY?");

    private static final SubLObject $$relationInstanceAll = reader_make_constant_shell(makeString("relationInstanceAll"));

    private static final SubLSymbol RBP_DEFINING_MTS = makeSymbol("RBP-DEFINING-MTS");

    private static final SubLSymbol RBP_DEFINING_MT = makeSymbol("RBP-DEFINING-MT");

    private static final SubLSymbol $sym86$MT_VISIBLE_FROM_MT_ = makeSymbol("MT-VISIBLE-FROM-MT?");

    private static final SubLSymbol $rbp_defining_mts_caching_state$ = makeSymbol("*RBP-DEFINING-MTS-CACHING-STATE*");



    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    public static final SubLList $list90 = list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    private static final SubLObject $$genlMt_Vocabulary = reader_make_constant_shell(makeString("genlMt-Vocabulary"));

    private static final SubLObject $$VocabularyMicrotheory = reader_make_constant_shell(makeString("VocabularyMicrotheory"));

    public static final SubLSymbol $sym93$RBP_WFF_TEST_FAILS_INT_ = makeSymbol("RBP-WFF-TEST-FAILS-INT?");

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    public static final SubLString $str95$__RBP_Wff_check_failed___the_foll = makeString("~&RBP Wff-check failed - the following returned NIL:~% ~S.~%");

    public static final SubLSymbol $sym96$_RBP_WFF_TEST_FAILS_INT__CACHING_STATE_ = makeSymbol("*RBP-WFF-TEST-FAILS-INT?-CACHING-STATE*");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    public static final SubLSymbol RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED = makeSymbol("RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED");

    public static final SubLList $list99 = list(makeSymbol("COL"), makeSymbol("MT"));

    public static final SubLSymbol $rbp_wff_constraints_prim_int_cached_caching_state$ = makeSymbol("*RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED-CACHING-STATE*");

    public static final SubLList $list101 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NPP-COLLECTION?")));

    public static final SubLList $list102 = list(reader_make_constant_shell(makeString("genls")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("NPP-COLLECTION?")));

    public static final SubLList $list103 = list(makeSymbol("THE-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));







    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list108 = list(reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("EL-FORMULA-P")));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLList $list110 = list(makeSymbol("IND-COL"), makeSymbol("DEP-COL"));

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    public static final SubLList $list112 = list(reader_make_constant_shell(makeString("genls")), ONE_INTEGER);

    private static final SubLObject $$arg2Format = reader_make_constant_shell(makeString("arg2Format"));

    public static final SubLList $list114 = list(reader_make_constant_shell(makeString("GenlsFormat")));

    public static final SubLList $list115 = list(makeSymbol("?ARG1-TYPE"), makeSymbol("?ARG2-TYPE"));

    public static final SubLList $list116 = list(TWO_INTEGER, THREE_INTEGER);

    public static final SubLSymbol $inter_arg_isa_predicate_mt$ = makeSymbol("*INTER-ARG-ISA-PREDICATE-MT*");

    private static final SubLObject $$InterArgIsaPredicate = reader_make_constant_shell(makeString("InterArgIsaPredicate"));

    public static final SubLSymbol $arg_not_isa_predicate_mt$ = makeSymbol("*ARG-NOT-ISA-PREDICATE-MT*");

    private static final SubLObject $$ArgNotIsaPredicate = reader_make_constant_shell(makeString("ArgNotIsaPredicate"));

    public static final SubLSymbol RBP_GET_IAI_PRED = makeSymbol("RBP-GET-IAI-PRED");

    public static final SubLSymbol $sym122$_PRED = makeSymbol("?PRED");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLList $list124 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?PRED"), reader_make_constant_shell(makeString("InterArgIsaPredicate")));

    private static final SubLObject $$constrainsArgs = reader_make_constant_shell(makeString("constrainsArgs"));

    public static final SubLSymbol $rbp_get_iai_pred_caching_state$ = makeSymbol("*RBP-GET-IAI-PRED-CACHING-STATE*");

    public static final SubLSymbol RBP_GET_ANI_PRED = makeSymbol("RBP-GET-ANI-PRED");

    public static final SubLList $list128 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?PRED"), reader_make_constant_shell(makeString("ArgNotIsaPredicate")));

    public static final SubLList $list129 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?PRED"), reader_make_constant_shell(makeString("BinaryPredicate")));

    private static final SubLObject $$constrainsArg = reader_make_constant_shell(makeString("constrainsArg"));

    public static final SubLSymbol $rbp_get_ani_pred_caching_state$ = makeSymbol("*RBP-GET-ANI-PRED-CACHING-STATE*");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));













    public static final SubLString $str139$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str144$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str145$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str146$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str147$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$interArgNotIsa1_2 = reader_make_constant_shell(makeString("interArgNotIsa1-2"));

    private static final SubLList $list149 = list(makeSymbol("ARG1-TYPE"), makeSymbol("ARG2-TYPE"));

    private static final SubLSymbol RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN = makeSymbol("RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN");

    private static final SubLSymbol $sym151$SPEC_ = makeSymbol("SPEC?");

    private static final SubLSymbol $rbp_wff_type_level_arg_nums_for_fn_caching_state$ = makeSymbol("*RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLObject $$SubcollectionOfByFn = reader_make_constant_shell(makeString("SubcollectionOfByFn"));

    private static final SubLObject $$createdBy = reader_make_constant_shell(makeString("createdBy"));

    private static final SubLList $list156 = list(reader_make_constant_shell(makeString("TypeTypeTernaryRuleMacroPredicate")), reader_make_constant_shell(makeString("TypeInstanceTernaryRuleMacroPredicate")), reader_make_constant_shell(makeString("InstanceTypeTernaryRuleMacroPredicate")));

    private static final SubLObject $$relationAllExistsCount = reader_make_constant_shell(makeString("relationAllExistsCount"));

    private static final SubLList $list158 = list(reader_make_constant_shell(makeString("InstanceWithRelationFromFn")), reader_make_constant_shell(makeString("InstanceWithRelationToFn")));

    private static final SubLObject $$SubcollectionRelationFunction = reader_make_constant_shell(makeString("SubcollectionRelationFunction"));





    private static final SubLObject $const162$SubcollectionRelationFunction_Can = reader_make_constant_shell(makeString("SubcollectionRelationFunction-Canonical"));

    private static final SubLObject $const163$SubcollectionRelationFunction_Inv = reader_make_constant_shell(makeString("SubcollectionRelationFunction-Inverse"));

    private static final SubLObject $$InstanceWithRelationFromFn = reader_make_constant_shell(makeString("InstanceWithRelationFromFn"));

    private static final SubLObject $$InstanceWithRelationToFn = reader_make_constant_shell(makeString("InstanceWithRelationToFn"));

    private static final SubLObject $$TheNCArgIsas = reader_make_constant_shell(makeString("TheNCArgIsas"));

    private static final SubLSymbol MIN_ARGN_ISA = makeSymbol("MIN-ARGN-ISA");

    private static final SubLObject $$TheNCArgGenls = reader_make_constant_shell(makeString("TheNCArgGenls"));

    private static final SubLSymbol MIN_ARGN_GENL = makeSymbol("MIN-ARGN-GENL");

    public static SubLObject rbp_wff_validation_reset() {
        $rbp_wff_validation_count$.setGlobalValue(ZERO_INTEGER);
        $rbp_wff_validation_false_pos$.setGlobalValue(NIL);
        $rbp_wff_validation_false_neg$.setGlobalValue(NIL);
        return T;
    }

    public static SubLObject rbp_wff_validation_report(final SubLObject key) {
        final SubLObject s = T;
        format(s, $str7$__Performed__D_wff_check_validati, $rbp_wff_validation_count$.getGlobalValue());
        if (NIL != subl_promotions.memberP(key, $list8, UNPROVIDED, UNPROVIDED)) {
            format(s, $str9$__Found__D_false_positives___, length($rbp_wff_validation_false_pos$.getGlobalValue()));
            SubLObject cdolist_list_var = $rbp_wff_validation_false_pos$.getGlobalValue();
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(s, $str10$____S__, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        if (NIL != subl_promotions.memberP(key, $list11, UNPROVIDED, UNPROVIDED)) {
            format(s, $str12$__Found__D_false_negatives___, length($rbp_wff_validation_false_neg$.getGlobalValue()));
            SubLObject cdolist_list_var = $rbp_wff_validation_false_neg$.getGlobalValue();
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(s, $str10$____S__, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        return T;
    }

    public static SubLObject rbp_wff_validating(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        key = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, $list15, $list16, listS(CLET, list(list($rbp_wff_validate_setting$, key)), append(body, NIL)), list(RBP_WFF_VALIDATION_REPORT, key));
    }

    public static SubLObject clear_rbp_wf_nat_externalP() {
        final SubLObject cs = $rbp_wf_nat_externalP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_wf_nat_externalP(final SubLObject nat, final SubLObject level) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_wf_nat_externalP_caching_state$.getGlobalValue(), list(nat, level), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wf_nat_externalP_internal(final SubLObject nat, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject validateP = numG(level, ONE_INTEGER);
        final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            ans = at_utilities.nat_wf_in_some_mtP(nat, NIL, validateP);
        } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rbp_wf_nat_externalP(final SubLObject nat, final SubLObject level) {
        SubLObject caching_state = $rbp_wf_nat_externalP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym19$RBP_WF_NAT_EXTERNAL_, $sym20$_RBP_WF_NAT_EXTERNAL__CACHING_STATE_, NIL, EQUALP, TWO_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(nat, level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (nat.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && level.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_wf_nat_externalP_internal(nat, level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(nat, level));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rbp_wff_check_formula_arg_position_replacements(final SubLObject formula, final SubLObject arg_position, final SubLObject replacements) {
        final SubLObject keyword = $REPLACE_ME;
        final SubLObject template = replace_formula_arg_position(arg_position, keyword, formula);
        SubLObject results = NIL;
        SubLObject cdolist_list_var = replacements;
        SubLObject replacement = NIL;
        replacement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject keyword_bindings = list(bindings.make_variable_binding(keyword, replacement));
            final SubLObject wfP = makeBoolean((NIL != rbp_wf_template_argsP(template, keyword_bindings, ONE_INTEGER)) && (NIL != rbp_wf_template_argsP(template, keyword_bindings, TWO_INTEGER)));
            results = cons(wfP, results);
            cdolist_list_var = cdolist_list_var.rest();
            replacement = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject clear_rbp_wf_template_argsP() {
        final SubLObject cs = $rbp_wf_template_argsP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_wf_template_argsP(final SubLObject template, final SubLObject keyword_bindings, final SubLObject level) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_wf_template_argsP_caching_state$.getGlobalValue(), list(template, keyword_bindings, level), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wf_template_argsP_internal(final SubLObject template, final SubLObject keyword_bindings, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $rbp_wff_checks_total$.setDynamicValue(add($rbp_wff_checks_total$.getDynamicValue(thread), ONE_INTEGER), thread);
        SubLObject constraints = NIL;
        SubLObject malP = NIL;
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        malP = makeBoolean(NIL == rbp_wff_bindings_visibleP(keyword_bindings));
        if (NIL == malP) {
            if (level.eql(ONE_INTEGER)) {
                constraints = rbp_wff_constraints_primary(template, keyword_bindings, UNPROVIDED);
            } else
                if (level.eql(TWO_INTEGER)) {
                    constraints = rbp_wff_constraints_secondary(template, keyword_bindings);
                }

            if (NIL == malP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while ((NIL == malP) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = constraint;
                    SubLObject type = NIL;
                    SubLObject denot_temp = NIL;
                    SubLObject target = NIL;
                    SubLObject test_mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list24);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list24);
                    denot_temp = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list24);
                    target = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list24);
                    test_mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject denot = rbp_subst_bindings(keyword_bindings, denot_temp);
                        if (NIL == list_utilities.tree_find_if(symbol_function(KEYWORDP), denot, UNPROVIDED)) {
                            final SubLObject pcase_var = type;
                            if (pcase_var.eql($ISA)) {
                                malP = rbp_wff_test_failsP($sym27$RBP_WFF_MAYBE_ISA_, denot, target, test_mt);
                            } else
                                if (pcase_var.eql($NOT_ISA)) {
                                    malP = rbp_wff_test_failsP($sym29$RBP_WFF_NOT_ISA_, denot, target, test_mt);
                                } else
                                    if (pcase_var.eql($GENL)) {
                                        malP = rbp_wff_test_failsP($sym31$RBP_WFF_MAYBE_GENL_, denot, target, test_mt);
                                    } else
                                        if (pcase_var.eql($NOT_GENL)) {
                                            malP = rbp_wff_test_failsP($sym33$NPP_NOT_GENL_, denot, target, test_mt);
                                        } else
                                            if (pcase_var.eql($NOT_DISJOINT)) {
                                                malP = rbp_wff_test_failsP($sym35$NPP_NOT_DISJOINT_, denot, target, test_mt);
                                            } else
                                                if (pcase_var.eql($TYPE_GENL)) {
                                                    malP = rbp_wff_test_failsP($sym37$NPP_NOT_TYPE_DISJOINT_, denot, target, test_mt);
                                                }





                        }
                    } else {
                        cdestructuring_bind_error(datum, $list24);
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                } 
            }
        }
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        $rbp_wff_check_time$.setDynamicValue(add($rbp_wff_check_time$.getDynamicValue(thread), time), thread);
        if (NIL != malP) {
            $rbp_wff_checks_failed$.setDynamicValue(add($rbp_wff_checks_failed$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        if (NIL != subl_promotions.memberP($rbp_wff_validate_setting$.getGlobalValue(), NIL != malP ? $list11 : $list8, UNPROVIDED, UNPROVIDED)) {
            final SubLObject nat = rbp_subst_bindings(keyword_bindings, template);
            $rbp_wff_validation_count$.setGlobalValue(add($rbp_wff_validation_count$.getGlobalValue(), ONE_INTEGER));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (malP.eql(rbp_wf_nat_externalP(nat, level))) {
                    if (NIL != malP) {
                        $rbp_wff_validation_false_neg$.setGlobalValue(cons(nat, $rbp_wff_validation_false_neg$.getGlobalValue()));
                    } else {
                        $rbp_wff_validation_false_pos$.setGlobalValue(cons(nat, $rbp_wff_validation_false_pos$.getGlobalValue()));
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(NIL == malP);
    }

    public static SubLObject rbp_wf_template_argsP(final SubLObject template, final SubLObject keyword_bindings, final SubLObject level) {
        SubLObject caching_state = $rbp_wf_template_argsP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym23$RBP_WF_TEMPLATE_ARGS_, $sym40$_RBP_WF_TEMPLATE_ARGS__CACHING_STATE_, NIL, EQUALP, THREE_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, keyword_bindings, level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (keyword_bindings.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && level.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_wf_template_argsP_internal(template, keyword_bindings, level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, keyword_bindings, level));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rbp_wff_bindings_visibleP(final SubLObject keyword_bindings) {
        SubLObject malP = NIL;
        if (NIL == malP) {
            SubLObject csome_list_var = keyword_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == malP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject keyword = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list41);
                keyword = current.first();
                current = value = current.rest();
                if (NIL == rbp_wff_term_visibleP(value)) {
                    malP = T;
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == malP);
    }

    public static SubLObject rbp_wff_term_visibleP(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visibleP = makeBoolean((NIL != rbp_wff_term_visible_by_fiatP(value)) || (NIL != rbp_wff_term_actually_visibleP(value)));
        if ((NIL == visibleP) && (NIL != $rbp_show_non_wffP$.getDynamicValue(thread))) {
            format(T, $str42$___S_not_sufficiently_defined_in_, value, rbp_wff_domain_mt());
        }
        return visibleP;
    }

    public static SubLObject rbp_wff_term_visible_by_fiatP(final SubLObject value) {
        return makeBoolean(NIL == rbp_wff_term_visible_check_requiredP(value));
    }

    public static SubLObject rbp_wff_term_visible_check_requiredP(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((((NIL != $rbp_wff_check_visibilityP$.getDynamicValue(thread)) && (NIL != rbp_wff_domain_mt_setP())) && (NIL != indexed_term_p(value))) && (NIL == parsing_utilities.nl_tagP(value, UNPROVIDED))) && (NIL == subl_promotions.memberP(rbp_wff_domain_mt(), $list43, UNPROVIDED, UNPROVIDED))) && (NIL != hlmt.hlmt_p(rbp_defining_mt(value))));
    }

    public static SubLObject rbp_wff_term_actually_visibleP(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject visibleP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rbp_wff_domain_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            visibleP = mt_relevance_macros.relevant_mtP(rbp_defining_mt(value));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return visibleP;
    }

    public static SubLObject rbp_formula_variable_isa_constraints(final SubLObject formula, final SubLObject variable) {
        final SubLObject keyword_bindings = list(bq_cons(variable, $list44));
        final SubLObject primary = rbp_wff_constraints_primary(formula, keyword_bindings, UNPROVIDED);
        final SubLObject secondary = rbp_wff_constraints_secondary(formula, keyword_bindings);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = append(primary, secondary);
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject type = NIL;
            SubLObject v_term = NIL;
            SubLObject coll = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list45);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            coll = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                if (v_term.eql(variable)) {
                    ans = cons(list(type, coll, mt), ans);
                }
            } else {
                cdestructuring_bind_error(datum, $list45);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject rbp_wff_reset_metrics() {
        $rbp_wff_check_time$.setDynamicValue(ZERO_INTEGER);
        $rbp_wff_checks_total$.setDynamicValue(ZERO_INTEGER);
        $rbp_wff_checks_failed$.setDynamicValue(ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static SubLObject rbp_wff_report_metrics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str46$__Spent__4_2F_seconds_wff_checkin, $rbp_wff_check_time$.getDynamicValue(thread));
        format(stream, $str47$___D_of__D_items_wff_checked_were, $rbp_wff_checks_failed$.getDynamicValue(thread), $rbp_wff_checks_total$.getDynamicValue(thread));
        return T;
    }

    public static SubLObject rbp_wff_clear_caches() {
        clear_rbp_defining_mts();
        clear_rbp_wff_find_floor_mts_int();
        clear_rbp_wf_natP();
        clear_rbp_get_iai_pred();
        clear_rbp_wff_test_fails_intP();
        clear_rbp_wff_constraints_prim_int_cached();
        clear_rbp_wf_template_argsP();
        clear_rbp_wff_type_level_arg_nums_for_fn();
        $rbp_vocabulary_mts$.setGlobalValue($UNINITIALIZED);
        $rbp_wff_quaternary_rmps$.setGlobalValue($UNINITIALIZED);
        return T;
    }

    public static SubLObject clear_rbp_wf_natP() {
        final SubLObject cs = $rbp_wf_natP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_wf_natP(final SubLObject nat, final SubLObject level) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_wf_natP_caching_state$.getGlobalValue(), list(nat, level), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wf_natP_internal(final SubLObject nat, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == term.nautP(nat, UNPROVIDED)) {
            return T;
        }
        thread.resetMultipleValues();
        final SubLObject template = rbp_wff_convert_nat(nat, UNPROVIDED);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(((!level.numG(ZERO_INTEGER)) || (NIL != rbp_wf_template_argsP(template, v_bindings, ONE_INTEGER))) && ((!level.numG(ONE_INTEGER)) || (NIL != rbp_wf_template_argsP(template, v_bindings, TWO_INTEGER))));
    }

    public static SubLObject rbp_wf_natP(final SubLObject nat, final SubLObject level) {
        SubLObject caching_state = $rbp_wf_natP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym48$RBP_WF_NAT_, $sym49$_RBP_WF_NAT__CACHING_STATE_, NIL, EQUALP, TWO_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(nat, level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (nat.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && level.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_wf_natP_internal(nat, level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(nat, level));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject npp_genl_predP(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = makeBoolean(((NIL != forts.fort_p(obj1)) && (NIL != forts.fort_p(obj2))) && (NIL != genl_predicates.genl_predP(obj1, obj2, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject npp_search_gafs_gp(final SubLObject predicate, final SubLObject v_object, final SubLObject opos, final SubLObject key, final SubLObject kpos, SubLObject test, SubLObject mt) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matches = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject _prev_bind_0_$1 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(predicate, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_object, opos, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_object, opos, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$3 = NIL;
                                final SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(ass));
                                    if ((NIL != valid_$5) && (NIL != funcall(test, cycl_utilities.formula_arg(ass, kpos, UNPROVIDED), key))) {
                                        matches = cons(ass, matches);
                                    }
                                    done_var_$3 = makeBoolean(NIL == valid_$5);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_1_$2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$1, thread);
            }
            if (NIL != kb_gp_mapping.dgaigp_binaryP(predicate)) {
                final SubLObject _prev_bind_0_$3 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(predicate, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_object, arity.binary_arg_swap(opos), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_object, arity.binary_arg_swap(opos), pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                                        if (NIL != valid_$6) {
                                            final SubLObject _prev_bind_0_$4 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean(NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                if (NIL != funcall(test, cycl_utilities.formula_arg(ass, kpos, UNPROVIDED), key)) {
                                                    matches = cons(ass, matches);
                                                }
                                            } finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$4, thread);
                                            }
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$3, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return reverse(matches);
    }

    public static SubLObject npp_typed_genl_predP(final SubLObject obj1, final SubLObject obj2) {
        if ((NIL != forts.fort_p(obj1)) && (NIL != forts.fort_p(obj2))) {
            return list_utilities.sublisp_boolean(npp_search_gafs_gp($$typedGenlPreds, obj1, ONE_INTEGER, obj2, TWO_INTEGER, EQL, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject rbp_wff_maybe_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return makeBoolean(((NIL != rbp_wff_maybe_isaP(obj1, $$Collection, mt)) && (NIL != rbp_wff_maybe_isaP(obj2, $$Collection, mt))) && (NIL != npp_not_disjointP(obj1, obj2, mt)));
    }

    public static SubLObject npp_type_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$typeGenls, obj1, obj2), mt, UNPROVIDED));
    }

    public static SubLObject npp_not_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(NIL == npp_genlP(obj1, obj2, mt));
    }

    public static SubLObject npp_genlP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (((NIL == term.el_fort_p(obj1)) || (NIL == term.el_fort_p(obj2))) || (NIL == npp_collectionP(obj2))) {
            return NIL;
        }
        if (NIL != npp_genl_via_sbhlP(obj1, obj2, mt)) {
            return T;
        }
        if (obj1.equalp(obj2)) {
            return T;
        }
        if (NIL != npp_naut_genl_via_result_genlP(obj1, obj2, mt)) {
            return T;
        }
        if (NIL != npp_naut_genl_via_rgaP(obj1, obj2, mt)) {
            return T;
        }
        if (NIL != npp_naut_genl_via_pgiaP(obj1, obj2, mt)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject npp_genl_or_anyP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (obj1.eql($ANY) || obj2.eql($ANY)) {
            return T;
        }
        return npp_genlP(obj1, obj2, mt);
    }

    public static SubLObject npp_genl_via_sbhlP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != hlmt.hlmt_p(mt)) && (NORMAL_INFERENCE == psc.mt_inference_function(mt))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                ans = genls.genlP(obj1, obj2, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                ans = genls.genlP(obj1, obj2, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject npp_naut_genl_via_result_genlP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        if (NIL == term.nautP(obj1, UNPROVIDED)) {
            return NIL;
        }
        SubLObject successP = NIL;
        final SubLObject functor = cycl_utilities.nat_functor(obj1);
        if ((NIL != indexed_term_p(functor)) && (NIL == successP)) {
            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(functor, $$resultGenl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject coll = NIL;
            coll = csome_list_var.first();
            while ((NIL == successP) && (NIL != csome_list_var)) {
                if (NIL != npp_genlP(coll, obj2, mt)) {
                    successP = T;
                }
                csome_list_var = csome_list_var.rest();
                coll = csome_list_var.first();
            } 
        }
        return successP;
    }

    public static SubLObject npp_naut_genl_via_rgaP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        if (NIL == term.nautP(obj1, UNPROVIDED)) {
            return NIL;
        }
        SubLObject successP = NIL;
        final SubLObject functor = cycl_utilities.nat_functor(obj1);
        if ((NIL != indexed_term_p(functor)) && (NIL == successP)) {
            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(functor, $$resultGenlArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == successP) && (NIL != csome_list_var)) {
                if (NIL != npp_genlP(cycl_utilities.nat_arg(obj1, arg, UNPROVIDED), obj2, mt)) {
                    successP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return successP;
    }

    public static SubLObject npp_naut_genl_via_pgiaP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
        if ((NIL == term.nautP(obj1, UNPROVIDED)) || (!cycl_utilities.nat_functor(obj1).eql(cycl_utilities.nat_functor(obj2)))) {
            return NIL;
        }
        SubLObject successP = NIL;
        final SubLObject functor = cycl_utilities.nat_functor(obj1);
        if ((NIL != indexed_term_p(functor)) && (NIL == successP)) {
            SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(functor, $$preservesGenlsInArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject arg = NIL;
            arg = csome_list_var.first();
            while ((NIL == successP) && (NIL != csome_list_var)) {
                if (NIL != npp_genlP(cycl_utilities.nat_arg(obj1, arg, UNPROVIDED), cycl_utilities.nat_arg(obj2, arg, UNPROVIDED), mt)) {
                    successP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            } 
        }
        return successP;
    }

    public static SubLObject rbp_wff_not_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return makeBoolean(NIL == rbp_wff_maybe_isaP(v_term, col, mt));
    }

    public static SubLObject rbp_wff_maybe_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return makeBoolean((NIL != rbp_wff_isaP_int(v_term, col, mt, $PERMISSIVE)) || ((NIL != forts.fort_p(v_term)) && (NIL == isa.not_isaP(v_term, col, mt, UNPROVIDED))));
    }

    public static SubLObject rbp_wff_isaP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return rbp_wff_isaP_int(v_term, col, mt, $STRICT);
    }

    public static SubLObject rbp_wff_isaP_int(final SubLObject v_term, final SubLObject col, final SubLObject mt, final SubLObject naut_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != npp_isaP(v_term, col, mt)) {
            return T;
        }
        if (NIL == term.nautP(v_term, UNPROVIDED)) {
            return NIL;
        }
        SubLObject ans = NIL;
        SubLObject doneP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == doneP) {
                SubLObject csome_list_var = isa.min_isa(v_term, mt, UNPROVIDED);
                SubLObject isa_col = NIL;
                isa_col = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL != npp_genlP(isa_col, col, mt)) {
                        ans = T;
                        doneP = T;
                    } else
                        if (NIL != disjoint_with.collections_disjointP(isa_col, col, mt)) {
                            doneP = T;
                        }

                    csome_list_var = csome_list_var.rest();
                    isa_col = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != doneP) {
            return ans;
        }
        if ($PERMISSIVE == naut_handling) {
            return T;
        }
        return NIL;
    }

    public static SubLObject npp_not_type_disjointP(final SubLObject denot, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (target.eql($$Thing)) {
            return T;
        }
        SubLObject malP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            malP = npp_do_ntdP(denot, target);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == malP);
    }

    public static SubLObject npp_do_ntdP(final SubLObject denot, final SubLObject target) {
        if (NIL == isa.isaP(denot, $$CollectionType, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL == indexed_term_p(denot)) {
            return NIL;
        }
        SubLObject malP = NIL;
        if (NIL == malP) {
            SubLObject csome_list_var;
            SubLObject col;
            for (csome_list_var = kb_mapping_utilities.pred_values(denot, $$typeGenls, UNPROVIDED, UNPROVIDED, UNPROVIDED), col = NIL, col = csome_list_var.first(); (NIL == malP) && (NIL != csome_list_var); malP = disjoint_with.collections_disjointP(col, target, UNPROVIDED) , csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
            }
        }
        return malP;
    }

    public static SubLObject npp_not_disjointP(SubLObject denot, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        denot = function_terms.naut_to_nart(denot);
        if ((NIL == term.el_fort_p(denot)) || (NIL == term.el_fort_p(target))) {
            return T;
        }
        if (denot.eql($$Thing) || target.eql($$Thing)) {
            return T;
        }
        SubLObject mts = (NIL != hlmt.hlmt_p(mt)) ? list(mt) : rbp_defining_mts(list(denot, target));
        SubLObject disjointP = NIL;
        if (NIL != mt) {
            final SubLObject item_var = mt;
            if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                mts = cons(item_var, mts);
            }
        }
        if (NIL == disjointP) {
            SubLObject csome_list_var;
            SubLObject mt_$14;
            for (csome_list_var = mts, mt_$14 = NIL, mt_$14 = csome_list_var.first(); (NIL == disjointP) && (NIL != csome_list_var); disjointP = disjoint_with.collections_disjointP(denot, target, mt_$14) , csome_list_var = csome_list_var.rest() , mt_$14 = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == disjointP);
    }

    public static SubLObject rbp_wff_find_floor_mts(final SubLObject mts) {
        final SubLObject non_base_mts = remove(mt_vars.$mt_root$.getGlobalValue(), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sorted_mts = Sort.sort(non_base_mts, $sym68$GENERALITY_ESTIMATE_, UNPROVIDED);
        if (NIL == mts) {
            return NIL;
        }
        if (NIL == sorted_mts) {
            return list(mt_vars.$mt_root$.getGlobalValue());
        }
        if (NIL != list_utilities.singletonP(sorted_mts)) {
            return sorted_mts;
        }
        return rbp_wff_find_floor_mts_int(sorted_mts);
    }

    public static SubLObject clear_rbp_wff_find_floor_mts_int() {
        final SubLObject cs = $rbp_wff_find_floor_mts_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_wff_find_floor_mts_int(final SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_wff_find_floor_mts_int_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_find_floor_mts_int_internal(final SubLObject mts) {
        return genl_mts.max_floor_mts(remove_visible_mts(mts, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_find_floor_mts_int(final SubLObject mts) {
        SubLObject caching_state = $rbp_wff_find_floor_mts_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RBP_WFF_FIND_FLOOR_MTS_INT, $rbp_wff_find_floor_mts_int_caching_state$, $int$32, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rbp_wff_find_floor_mts_int_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject remove_visible_mts(final SubLObject mts, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return list_utilities.remove_subsumed_items(mts, $sym72$MT_RELEVANT_TO_MT_, key);
    }

    public static SubLObject mt_visible_from_mtP(final SubLObject possibly_visible_mt, final SubLObject mt) {
        return mt_relevance_macros.mt_relevant_to_mtP(mt, possibly_visible_mt);
    }

    public static SubLObject npp_isaP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject ans = NIL;
        if ((NIL != possibly_naut_p(obj2)) && cycl_utilities.nat_functor(obj2).eql($$SpecsFn)) {
            return npp_genlP(obj1, cycl_utilities.nat_arg1(obj2, UNPROVIDED), mt);
        }
        if (((NIL != term.el_fort_p(obj2)) && (NIL != genls.genlP($$CycLSentence_Assertible, obj2, UNPROVIDED, UNPROVIDED))) && (NIL != rbp_wff_el_sentence_assertibleP(obj1))) {
            return T;
        }
        ans = at_defns.quick_quiet_has_typeP(obj1, obj2, mt);
        return ans;
    }

    public static SubLObject npp_isa_or_anyP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (obj1.eql($ANY) || obj2.eql($ANY)) {
            return T;
        }
        return pph_utilities.pph_isaP(obj1, obj2, mt);
    }

    public static SubLObject rbp_wff_el_sentence_assertibleP(final SubLObject obj) {
        return makeBoolean(((NIL != el_formula_p(obj)) && (NIL != forts.fort_p(cycl_utilities.formula_arg0(obj)))) && (NIL != isa.isaP(cycl_utilities.formula_arg0(obj), $$TruthFunction, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject npp_individualP(final SubLObject obj) {
        return makeBoolean(NIL == npp_collectionP(obj));
    }

    public static SubLObject npp_collectionP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != forts.fort_p(obj)) {
                collP = fort_types_interface.collectionP(obj);
            } else
                if ((NIL != possibly_naut_p(obj)) && (NIL != narts_high.find_nart(obj))) {
                    collP = npp_collectionP(narts_high.find_nart(obj));
                } else
                    if (NIL != possibly_naut_p(obj)) {
                        final SubLObject op = cycl_utilities.nat_functor(obj);
                        if ((NIL != indexed_term_p(op)) && (((NIL != kb_mapping_utilities.some_pred_value(op, $$resultGenlArg, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.some_pred_value(op, $$resultGenl, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(op, $$CollectionDenotingFunction, UNPROVIDED, UNPROVIDED)))) {
                            collP = T;
                        }
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return collP;
    }

    public static SubLObject rbp_relation_all_violationP(final SubLObject gaf, final SubLObject pred, final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject v_forward = NIL;
        SubLObject v_backward = NIL;
        final SubLObject pcase_var = cycl_utilities.formula_arg0(gaf);
        if (pcase_var.eql($$relationAllExists)) {
            v_forward = $sym78$NPP_GENL_OR_ANY_;
        } else
            if (pcase_var.eql($$relationExistsAll)) {
                v_backward = $sym78$NPP_GENL_OR_ANY_;
            } else
                if (pcase_var.eql($$relationExistsUniqueAll)) {
                    v_backward = $sym78$NPP_GENL_OR_ANY_;
                } else
                    if (pcase_var.eql($$relationAllInstance)) {
                        v_forward = $sym82$NPP_ISA_OR_ANY_;
                    } else {
                        if (!pcase_var.eql($$relationInstanceAll)) {
                            return NIL;
                        }
                        v_backward = $sym82$NPP_ISA_OR_ANY_;
                    }



        if ((NIL == npp_genl_predP(pred, cycl_utilities.formula_arg1(gaf, UNPROVIDED))) && (NIL == npp_typed_genl_predP(cycl_utilities.formula_arg1(gaf, UNPROVIDED), pred))) {
            return NIL;
        }
        if (NIL != v_backward) {
            return makeBoolean((NIL == npp_genl_or_anyP(col2, cycl_utilities.formula_arg3(gaf, UNPROVIDED), mt)) || (NIL == funcall(v_backward, col1, cycl_utilities.formula_arg2(gaf, UNPROVIDED), mt)));
        }
        return makeBoolean((NIL == npp_genl_or_anyP(col1, cycl_utilities.formula_arg2(gaf, UNPROVIDED), mt)) || (NIL == funcall(v_forward, col2, cycl_utilities.formula_arg3(gaf, UNPROVIDED), mt)));
    }

    public static SubLObject rbp_relation_all_matchP(final SubLObject gaf, final SubLObject pred, final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject v_forward = NIL;
        SubLObject v_backward = NIL;
        final SubLObject pcase_var = cycl_utilities.formula_arg0(gaf);
        if (pcase_var.eql($$relationAllExists)) {
            v_forward = $sym78$NPP_GENL_OR_ANY_;
        } else
            if (pcase_var.eql($$relationExistsAll)) {
                v_backward = $sym78$NPP_GENL_OR_ANY_;
            } else
                if (pcase_var.eql($$relationExistsUniqueAll)) {
                    v_backward = $sym78$NPP_GENL_OR_ANY_;
                } else
                    if (pcase_var.eql($$relationAllInstance)) {
                        v_forward = $sym82$NPP_ISA_OR_ANY_;
                    } else {
                        if (!pcase_var.eql($$relationInstanceAll)) {
                            return NIL;
                        }
                        v_backward = $sym82$NPP_ISA_OR_ANY_;
                    }



        if ((NIL == npp_genl_predP(cycl_utilities.formula_arg1(gaf, UNPROVIDED), pred)) && (NIL == npp_typed_genl_predP(cycl_utilities.formula_arg1(gaf, UNPROVIDED), pred))) {
            return NIL;
        }
        if (NIL != v_backward) {
            return makeBoolean((NIL != npp_genl_or_anyP(col2, cycl_utilities.formula_arg2(gaf, UNPROVIDED), mt)) && (NIL != funcall(v_backward, col1, cycl_utilities.formula_arg3(gaf, UNPROVIDED), mt)));
        }
        return makeBoolean((NIL != npp_genl_or_anyP(col1, cycl_utilities.formula_arg2(gaf, UNPROVIDED), mt)) && (NIL != funcall(v_forward, col2, cycl_utilities.formula_arg3(gaf, UNPROVIDED), mt)));
    }

    public static SubLObject rbp_defining_mt(final SubLObject term_or_terms) {
        return rbp_defining_mts(term_or_terms).first();
    }

    public static SubLObject clear_rbp_defining_mts() {
        final SubLObject cs = $rbp_defining_mts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_defining_mts(final SubLObject term_or_terms) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_defining_mts_caching_state$.getGlobalValue(), list(term_or_terms), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_defining_mts_internal(SubLObject term_or_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        term_or_terms = parsing_utilities.strip_nl_tags(term_or_terms, UNPROVIDED);
        if (term_or_terms.isList()) {
            final SubLObject defining_mts = remove_duplicates(Mapping.mapcar(RBP_DEFINING_MT, term_or_terms), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != member(NIL, defining_mts, UNPROVIDED, UNPROVIDED) ? NIL : rbp_wff_find_floor_mts(defining_mts);
        }
        if (NIL != indexed_term_p(term_or_terms)) {
            final SubLObject defining_mt = kb_accessors.defining_mt(term_or_terms);
            SubLObject mts = (NIL != hlmt.hlmt_p(defining_mt)) ? list(defining_mt) : NIL;
            if (NIL == mts) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject cdolist_list_var;
                    final SubLObject assertions = cdolist_list_var = rbp_defining_assertions(term_or_terms);
                    SubLObject as = NIL;
                    as = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt = assertions_high.assertion_mt(as);
                        if (NIL != rbp_vocabulary_mtP(mt)) {
                            SubLObject cdolist_list_var_$15 = rbp_theory_mts(mt);
                            SubLObject theory_mt = NIL;
                            theory_mt = cdolist_list_var_$15.first();
                            while (NIL != cdolist_list_var_$15) {
                                final SubLObject item_var = theory_mt;
                                if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    mts = cons(item_var, mts);
                                }
                                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                theory_mt = cdolist_list_var_$15.first();
                            } 
                        } else {
                            final SubLObject item_var2 = mt;
                            if (NIL == member(item_var2, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                mts = cons(item_var2, mts);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        as = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            mts = list_utilities.remove_subsumed_items(mts, $sym86$MT_VISIBLE_FROM_MT_, UNPROVIDED);
            return NIL != mts ? mts : list(mt_vars.$assertible_theory_mt_root$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject rbp_defining_mts(final SubLObject term_or_terms) {
        SubLObject caching_state = $rbp_defining_mts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RBP_DEFINING_MTS, $rbp_defining_mts_caching_state$, $int$512, EQL, ONE_INTEGER, $int$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, term_or_terms, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rbp_defining_mts_internal(term_or_terms)));
            memoization_state.caching_state_put(caching_state, term_or_terms, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rbp_defining_assertions(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = $list90;
            SubLObject defining_pred = NIL;
            defining_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$16 = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, defining_pred, UNPROVIDED, UNPROVIDED);
                SubLObject defining_assertion = NIL;
                defining_assertion = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    final SubLObject col = assertions_high.gaf_arg2(defining_assertion);
                    final SubLObject mt = assertions_high.assertion_mt(defining_assertion);
                    if ((!mt.eql($$BookkeepingMt)) && (NIL == kb_accessors.anectP(col))) {
                        ans = cons(defining_assertion, ans);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    defining_assertion = cdolist_list_var_$16.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                defining_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rbp_theory_mts(final SubLObject vocab_mt) {
        return kb_mapping_utilities.pred_values(vocab_mt, $$genlMt_Vocabulary, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject rbp_vocabulary_mts() {
        if ($rbp_vocabulary_mts$.getGlobalValue().eql($UNINITIALIZED)) {
            $rbp_vocabulary_mts$.setGlobalValue(isa.all_fort_instances($$VocabularyMicrotheory, UNPROVIDED, UNPROVIDED));
        }
        return $rbp_vocabulary_mts$.getGlobalValue();
    }

    public static SubLObject rbp_vocabulary_mtP(final SubLObject mt) {
        return subl_promotions.memberP(mt, rbp_vocabulary_mts(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_test_failsP(final SubLObject test, final SubLObject denot, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rbp_wff_test_fails_intP(test, denot, target, mt);
    }

    public static SubLObject clear_rbp_wff_test_fails_intP() {
        final SubLObject cs = $rbp_wff_test_fails_intP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_wff_test_fails_intP(final SubLObject test, final SubLObject denot, final SubLObject target, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_wff_test_fails_intP_caching_state$.getGlobalValue(), list(test, denot, target, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_test_fails_intP_internal(final SubLObject test, final SubLObject denot, final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passP = NIL;
        if (denot.isKeyword()) {
            passP = T;
        } else
            if (NIL != rbp_wff_contains_strippable_nl_tagP(denot)) {
                final SubLObject stripped_denot = parsing_utilities.strip_nl_tags(denot, UNPROVIDED);
                final SubLObject _prev_bind_0 = $rbp_show_non_wffP$.currentBinding(thread);
                try {
                    $rbp_show_non_wffP$.bind(NIL, thread);
                    if (!denot.equal(stripped_denot)) {
                        passP = makeBoolean((NIL == rbp_wff_test_failsP(test, stripped_denot, target, mt)) || ((NIL != npp_collectionP(stripped_denot)) && (NIL == rbp_wff_test_failsP(test, list($$SomeFn, stripped_denot), target, mt))));
                    }
                } finally {
                    $rbp_show_non_wffP$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != funcall(test, denot, target, mt)) {
                    passP = T;
                }


        if ((NIL == passP) && (NIL != $rbp_show_non_wffP$.getDynamicValue(thread))) {
            format(T, $str95$__RBP_Wff_check_failed___the_foll, list(test, denot, target, mt));
        }
        return makeBoolean(NIL == passP);
    }

    public static SubLObject rbp_wff_test_fails_intP(final SubLObject test, final SubLObject denot, final SubLObject target, final SubLObject mt) {
        SubLObject caching_state = $rbp_wff_test_fails_intP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym93$RBP_WFF_TEST_FAILS_INT_, $sym96$_RBP_WFF_TEST_FAILS_INT__CACHING_STATE_, NIL, EQUALP, FOUR_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(test, denot, target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (test.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (denot.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (target.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_wff_test_fails_intP_internal(test, denot, target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(test, denot, target, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rbp_wff_contains_strippable_nl_tagP(final SubLObject denot) {
        final SubLObject stripped_denot = parsing_utilities.strip_nl_tags(denot, UNPROVIDED);
        return makeBoolean(!denot.equal(stripped_denot));
    }

    public static SubLObject rbp_wff_convert_nat(final SubLObject nat, SubLObject kw_arg_num) {
        if (kw_arg_num == UNPROVIDED) {
            kw_arg_num = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_stack = NIL;
        SubLObject v_bindings = NIL;
        SubLObject stripped_nat = NIL;
        stripped_nat = parsing_utilities.strip_nl_tags(nat, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject i = NIL;
        list_var = stripped_nat;
        arg = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (i.isZero()) {
                template_stack = cons(arg, template_stack);
            } else
                if (NIL != term.nautP(arg, UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject arg_template = rbp_wff_convert_nat(arg, kw_arg_num);
                    final SubLObject arg_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    template_stack = cons(arg_template, template_stack);
                    v_bindings = append(v_bindings, arg_bindings);
                    kw_arg_num = add(kw_arg_num, length(arg_bindings));
                } else
                    if (NIL != rbp_wff_isaP(arg, $$Relation, UNPROVIDED)) {
                        template_stack = cons(arg, template_stack);
                    } else {
                        final SubLObject keyword = at_utilities.get_generic_arg(kw_arg_num);
                        kw_arg_num = add(kw_arg_num, ONE_INTEGER);
                        template_stack = cons(keyword, template_stack);
                        v_bindings = cons(cons(keyword, arg), v_bindings);
                    }


        }
        return values(reverse(template_stack), v_bindings);
    }

    public static SubLObject rbp_wff_constraints_primary(final SubLObject template, final SubLObject keyword_bindings, SubLObject type_level_args) {
        if (type_level_args == UNPROVIDED) {
            type_level_args = NIL;
        }
        return NIL != el_formula_p(template) ? rbp_wff_constraints_prim_int_cached(template, keyword_bindings, type_level_args) : NIL;
    }

    public static SubLObject clear_rbp_wff_constraints_prim_int_cached() {
        final SubLObject cs = $rbp_wff_constraints_prim_int_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_wff_constraints_prim_int_cached(final SubLObject template, final SubLObject keyword_bindings, final SubLObject type_level_args) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_wff_constraints_prim_int_cached_caching_state$.getGlobalValue(), list(template, keyword_bindings, type_level_args), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_constraints_prim_int_cached_internal(SubLObject template, final SubLObject keyword_bindings, final SubLObject type_level_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        template = rbp_wff_instantiate_types(template, keyword_bindings);
        final SubLObject reln = cycl_utilities.formula_operator(template);
        SubLObject constraints = NIL;
        if (NIL == indexed_term_p(reln)) {
            return rbp_constraints_for_parsed_preds(keyword_bindings, template);
        }
        final SubLObject check_top_level_constraintsP = makeBoolean((NIL == fort_types_interface.logical_connective_p(reln)) && (NIL == fort_types_interface.quantifier_p(reln)));
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject argnum;
        SubLObject arg;
        SubLObject found_keywordP;
        SubLObject arg_cycl;
        SubLObject term_lookup_mt;
        SubLObject base_mt;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject csome_list_var;
        SubLObject binding;
        SubLObject constraint_cols;
        SubLObject iai_constraint_mt;
        SubLObject cdolist_list_var;
        SubLObject constraint_col;
        SubLObject not_isa_constraint_mt;
        SubLObject cdolist_list_var2;
        SubLObject isa_constraint;
        SubLObject genl_constraint;
        SubLObject nd_constraint;
        SubLObject current;
        SubLObject datum;
        SubLObject col;
        SubLObject mt;
        for (cdotimes_end_var = formula_arity(template, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            arg = cycl_utilities.formula_arg(template, argnum, UNPROVIDED);
            if (NIL != check_top_level_constraintsP) {
                found_keywordP = NIL;
                arg_cycl = NIL;
                term_lookup_mt = NIL;
                base_mt = rbp_wff_info_lookup_mt(reln);
                _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(base_mt, thread);
                    if (NIL == found_keywordP) {
                        csome_list_var = keyword_bindings;
                        binding = NIL;
                        binding = csome_list_var.first();
                        while ((NIL == found_keywordP) && (NIL != csome_list_var)) {
                            if (NIL != list_utilities.tree_find(binding.first(), arg, UNPROVIDED, UNPROVIDED)) {
                                found_keywordP = T;
                                arg_cycl = binding.rest();
                                term_lookup_mt = rbp_wff_info_lookup_mt(arg_cycl);
                            }
                            csome_list_var = csome_list_var.rest();
                            binding = csome_list_var.first();
                        } 
                    }
                    if (NIL != found_keywordP) {
                        thread.resetMultipleValues();
                        constraint_cols = rbp_iai_constraints(template, keyword_bindings, argnum, type_level_args);
                        iai_constraint_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cdolist_list_var = constraint_cols;
                        constraint_col = NIL;
                        constraint_col = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            constraints = cons(list($ISA, arg, constraint_col, iai_constraint_mt), constraints);
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint_col = cdolist_list_var.first();
                        } 
                        thread.resetMultipleValues();
                        constraint_cols = rbp_not_isa_constraints(template, keyword_bindings, argnum, type_level_args);
                        not_isa_constraint_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cdolist_list_var = constraint_cols;
                        constraint_col = NIL;
                        constraint_col = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            constraints = cons(list($NOT_ISA, arg, constraint_col, not_isa_constraint_mt), constraints);
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint_col = cdolist_list_var.first();
                        } 
                        cdolist_list_var2 = rbp_isa_constraint_cols(template, argnum);
                        isa_constraint = NIL;
                        isa_constraint = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            constraints = cons(list($ISA, arg, isa_constraint, term_lookup_mt), constraints);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            isa_constraint = cdolist_list_var2.first();
                        } 
                        cdolist_list_var2 = rbp_genl_constraint_cols(template, argnum);
                        genl_constraint = NIL;
                        genl_constraint = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            constraints = cons(list($GENL, arg, genl_constraint, term_lookup_mt), constraints);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            genl_constraint = cdolist_list_var2.first();
                        } 
                        cdolist_list_var2 = rbp_iand_constraints(template, keyword_bindings, argnum, type_level_args);
                        nd_constraint = NIL;
                        nd_constraint = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            datum = current = nd_constraint;
                            col = NIL;
                            mt = NIL;
                            destructuring_bind_must_consp(current, datum, $list99);
                            col = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list99);
                            mt = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                constraints = cons(list($NOT_DISJOINT, arg, col, mt), constraints);
                            } else {
                                cdestructuring_bind_error(datum, $list99);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nd_constraint = cdolist_list_var2.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL != el_formula_p(arg)) {
                constraints = append(constraints, rbp_wff_constraints_primary(arg, keyword_bindings, UNPROVIDED));
            }
        }
        return constraints;
    }

    public static SubLObject rbp_wff_constraints_prim_int_cached(final SubLObject template, final SubLObject keyword_bindings, final SubLObject type_level_args) {
        SubLObject caching_state = $rbp_wff_constraints_prim_int_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED, $rbp_wff_constraints_prim_int_cached_caching_state$, $int$512, EQUALP, THREE_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, keyword_bindings, type_level_args);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (keyword_bindings.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && type_level_args.equalp(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_wff_constraints_prim_int_cached_internal(template, keyword_bindings, type_level_args)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, keyword_bindings, type_level_args));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rbp_isa_constraint_cols(final SubLObject template, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reln = cycl_utilities.formula_operator(template);
        SubLObject constraint_cols = kb_accessors.argn_isa(reln, argnum, UNPROVIDED);
        if (((NIL != $rbp_known_false_equals_non_wffP$.getDynamicValue(thread)) && argnum.eql(ONE_INTEGER)) && (NIL != formula_pattern_match.formula_matches_pattern(template, $list101))) {
            final SubLObject item_var = cycl_utilities.formula_arg2(template, UNPROVIDED);
            if (NIL == member(item_var, constraint_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                constraint_cols = cons(item_var, constraint_cols);
            }
        }
        return constraint_cols;
    }

    public static SubLObject rbp_genl_constraint_cols(final SubLObject template, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reln = cycl_utilities.formula_operator(template);
        SubLObject constraint_cols = kb_accessors.argn_genl(reln, argnum, UNPROVIDED);
        if (((NIL != $rbp_known_false_equals_non_wffP$.getDynamicValue(thread)) && argnum.eql(ONE_INTEGER)) && (NIL != formula_pattern_match.formula_matches_pattern(template, $list102))) {
            final SubLObject item_var = cycl_utilities.formula_arg2(template, UNPROVIDED);
            if (NIL == member(item_var, constraint_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                constraint_cols = cons(item_var, constraint_cols);
            }
        }
        return constraint_cols;
    }

    public static SubLObject rbp_constraints_for_parsed_preds(final SubLObject v_bindings, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_binary_formula_p(template)) {
            return NIL;
        }
        SubLObject the_pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(template, template, $list103);
        the_pred = template.first();
        SubLObject current = template.rest();
        destructuring_bind_must_consp(current, template, $list103);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, template, $list103);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if (!the_pred.isKeyword()) {
                return NIL;
            }
            the_pred = rbp_template_predicate(template, v_bindings);
            if (NIL != fort_types_interface.predicate_p(the_pred)) {
                SubLObject constraints = NIL;
                if (arg1.eql($MODIFIER) || arg1.eql($HEAD)) {
                    SubLObject cdolist_list_var = kb_accessors.argn_isa(the_pred, ONE_INTEGER, UNPROVIDED);
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = list($ISA, arg1, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (NIL == member(item_var, constraints, EQUAL, symbol_function(IDENTITY))) {
                            constraints = cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                    cdolist_list_var = kb_accessors.argn_genl(the_pred, ONE_INTEGER, UNPROVIDED);
                    col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = list($GENL, arg1, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (NIL == member(item_var, constraints, EQUAL, symbol_function(IDENTITY))) {
                            constraints = cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                }
                if (arg2.eql($MODIFIER) || arg2.eql($HEAD)) {
                    SubLObject cdolist_list_var = kb_accessors.argn_isa(the_pred, TWO_INTEGER, UNPROVIDED);
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = list($ISA, arg2, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (NIL == member(item_var, constraints, EQUAL, symbol_function(IDENTITY))) {
                            constraints = cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                    cdolist_list_var = kb_accessors.argn_genl(the_pred, TWO_INTEGER, UNPROVIDED);
                    col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = list($GENL, arg2, col, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                        if (NIL == member(item_var, constraints, EQUAL, symbol_function(IDENTITY))) {
                            constraints = cons(item_var, constraints);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                }
                return constraints;
            }
        } else {
            cdestructuring_bind_error(template, $list103);
        }
        return NIL;
    }

    public static SubLObject rbp_wff_instantiate_types(SubLObject template, final SubLObject keyword_bindings) {
        if (NIL == el_conjunction_p(template)) {
            return template;
        }
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(template, symbol_function(KEYWORDP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(key, keyword_bindings, symbol_function(EQ), symbol_function(CAR))) {
                SubLObject foundP = NIL;
                if (NIL == foundP) {
                    SubLObject csome_list_var = cycl_utilities.formula_args(template, UNPROVIDED);
                    SubLObject conjunct = NIL;
                    conjunct = csome_list_var.first();
                    while ((NIL == foundP) && (NIL != csome_list_var)) {
                        if ((((NIL != el_formula_p(conjunct)) && cycl_utilities.formula_operator(conjunct).eql($$isa)) && cycl_utilities.formula_arg1(conjunct, UNPROVIDED).eql(key)) && (NIL != indexed_term_p(cycl_utilities.formula_arg2(conjunct, UNPROVIDED)))) {
                            template = remove(conjunct, template, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            template = subst(list($$SomeFn, cycl_utilities.formula_arg2(conjunct, UNPROVIDED)), key, template, UNPROVIDED, UNPROVIDED);
                            foundP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        conjunct = csome_list_var.first();
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return template;
    }

    public static SubLObject rbp_wff_constraints_secondary(final SubLObject template, final SubLObject keyword_bindings) {
        if ((!template.isCons()) || (NIL == list_utilities.lengthG(template, TWO_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        SubLObject raw_constraints = NIL;
        final SubLObject type_level_args = rbp_wff_type_level_args(template);
        SubLObject constraints = NIL;
        if (NIL != formula_pattern_match.formula_matches_pattern(template, $list108)) {
            raw_constraints = rbp_wff_constraints_from_csf(template, keyword_bindings);
        } else
            if (NIL != el_formula_p(template)) {
                final SubLObject embedded_pred = rbp_wff_embedded_pred(template);
                if (NIL != embedded_pred) {
                    final SubLObject embedded_args = rbp_wff_embedded_args(template);
                    final SubLObject embedded_template = make_el_formula(embedded_pred, embedded_args, UNPROVIDED);
                    raw_constraints = rbp_wff_constraints_primary(embedded_template, keyword_bindings, type_level_args);
                }
            }

        SubLObject cdolist_list_var = raw_constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(second(constraint), type_level_args, UNPROVIDED, UNPROVIDED)) {
                final SubLObject pcase_var = constraint.first();
                if (pcase_var.eql($ISA) || pcase_var.eql($NOT_DISJOINT)) {
                    if (list_utilities.last_one(constraint).eql($$InferencePSC)) {
                        constraint = list_utilities.replace_last(constraint, $$BaseKB);
                    }
                    constraints = cons(cons($NOT_DISJOINT, constraint.rest()), constraints);
                } else
                    if (pcase_var.eql($GENL)) {
                        constraints = cons(cons($TYPE_GENL, constraint.rest()), constraints);
                    } else
                        if (pcase_var.eql($NOT_ISA)) {
                            constraints = cons(cons($NOT_GENL, constraint.rest()), constraints);
                        }


            } else {
                constraints = cons(constraint, constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        if (NIL != el_formula_p(template)) {
            cdolist_list_var = cycl_utilities.formula_args(template, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                constraints = append(constraints, rbp_wff_constraints_secondary(arg, keyword_bindings));
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return constraints;
    }

    public static SubLObject rbp_wff_constraints_from_csf(final SubLObject template, final SubLObject keyword_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraints = NIL;
        thread.resetMultipleValues();
        final SubLObject coll = parsing_utilities.parse_collection_expression(template);
        final SubLObject var = thread.secondMultipleValue();
        SubLObject restrictions = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != forts.fort_p(coll)) || coll.isKeyword()) {
            restrictions = subst(coll, var, restrictions, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = $rbp_known_false_equals_non_wffP$.currentBinding(thread);
        try {
            $rbp_known_false_equals_non_wffP$.bind(T, thread);
            SubLObject cdolist_list_var = restrictions;
            SubLObject sub_template = NIL;
            sub_template = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                constraints = append(constraints, rbp_wff_constraints_primary(sub_template, keyword_bindings, NIL), rbp_wff_constraints_secondary(sub_template, keyword_bindings));
                cdolist_list_var = cdolist_list_var.rest();
                sub_template = cdolist_list_var.first();
            } 
        } finally {
            $rbp_known_false_equals_non_wffP$.rebind(_prev_bind_0, thread);
        }
        return constraints;
    }

    public static SubLObject rbp_iand_constraints(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        return rbp_iand_constraints_from_genls_format(template, keyword_bindings, argnum, type_level_args);
    }

    public static SubLObject rbp_iand_constraints_from_genls_format(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        final SubLObject formula = rbp_subst_bindings(keyword_bindings, template);
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        SubLObject constraints = NIL;
        if ((argnum.eql(TWO_INTEGER) && (NIL == subl_promotions.memberP(cycl_utilities.formula_arg(template, argnum, UNPROVIDED), type_level_args, UNPROVIDED, UNPROVIDED))) && (NIL != rbp_reln_ok_for_genls_formatP(reln))) {
            final SubLObject ind_argnum = subtract(THREE_INTEGER, argnum);
            final SubLObject ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, UNPROVIDED);
            final SubLObject mt_to_check = rbp_wff_info_lookup_mt(list(ind_arg, reln));
            final SubLObject type_levelP = subl_promotions.memberP(cycl_utilities.formula_arg(template, ind_argnum, UNPROVIDED), type_level_args, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject col_pairs = cdolist_list_var = rbp_iand_cols_for_reln_from_genls_format(reln, mt_to_check);
            SubLObject col_pair = NIL;
            col_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = col_pair;
                SubLObject ind_col = NIL;
                SubLObject dep_col = NIL;
                destructuring_bind_must_consp(current, datum, $list110);
                ind_col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list110);
                dep_col = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject ind_col_fort = function_terms.naut_to_nart(ind_col);
                    final SubLObject appliesP = (NIL != type_levelP) ? npp_genlP(ind_arg, ind_col_fort, mt_to_check) : rbp_wff_isaP(ind_arg, ind_col_fort, mt_to_check);
                    if (NIL != appliesP) {
                        final SubLObject item_var = list(dep_col, mt_to_check);
                        if (NIL == member(item_var, constraints, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            constraints = cons(item_var, constraints);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list110);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col_pair = cdolist_list_var.first();
            } 
        }
        return constraints;
    }

    public static SubLObject rbp_wff_info_lookup_mt(final SubLObject v_object) {
        return NIL != rbp_wff_domain_mt_setP() ? rbp_wff_domain_mt() : rbp_defining_mt(v_object);
    }

    public static SubLObject rbp_wff_domain_mt_setP() {
        final SubLObject setP = hlmt.hlmt_p(rbp_wff_domain_mt());
        return setP;
    }

    public static SubLObject rbp_wff_domain_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
    }

    public static SubLObject rbp_reln_ok_for_genls_formatP(final SubLObject reln) {
        final SubLObject mt_to_check = rbp_wff_info_lookup_mt(reln);
        return makeBoolean((((NIL != fort_types_interface.predicate_p(reln)) && (NIL != rbp_binary_relationP(reln))) && (NIL != backward.removal_ask(listS($$transitiveViaArgInverse, reln, $list112), mt_to_check, UNPROVIDED, UNPROVIDED))) && (NIL != backward.removal_ask(listS($$arg2Format, reln, $list114), mt_to_check, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject rbp_iand_cols_for_reln_from_genls_format(final SubLObject reln, final SubLObject mt) {
        return ask_utilities.ask_template($list115, listS($$relationAllInstance, reln, $list115), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_iai_constraints(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = rbp_subst_bindings(keyword_bindings, template);
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        final SubLObject predicateP = fort_types_interface.predicate_in_any_mtP(reln);
        final SubLObject v_arity = arity.arity(reln);
        SubLObject constraint_cols = NIL;
        if (NIL != v_arity) {
            SubLObject end_var;
            SubLObject ind_argnum;
            SubLObject ind_arg;
            SubLObject mt_to_check;
            SubLObject type_levelP;
            SubLObject constraints;
            SubLObject mt_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_3;
            SubLObject cdolist_list_var;
            SubLObject pred;
            SubLObject cdolist_list_var_$17;
            SubLObject constraint;
            SubLObject item_var;
            SubLObject supers;
            SubLObject cdolist_list_var2;
            SubLObject con;
            SubLObject current;
            SubLObject datum;
            SubLObject ind_col;
            SubLObject dep_col;
            SubLObject appliesP;
            SubLObject item_var2;
            for (end_var = number_utilities.f_1X(v_arity), ind_argnum = NIL, ind_argnum = ONE_INTEGER; !ind_argnum.numGE(end_var); ind_argnum = number_utilities.f_1X(ind_argnum)) {
                if (!argnum.eql(ind_argnum)) {
                    ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, UNPROVIDED);
                    mt_to_check = rbp_wff_info_lookup_mt(list(ind_arg, reln));
                    type_levelP = subl_promotions.memberP(nth(ind_argnum, template), type_level_args, UNPROVIDED, UNPROVIDED);
                    constraints = NIL;
                    mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_to_check);
                    _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != predicateP) {
                            cdolist_list_var = genl_predicates.all_genl_preds(reln, UNPROVIDED, UNPROVIDED);
                            pred = NIL;
                            pred = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                cdolist_list_var_$17 = rbp_get_iai_constraints(pred, ind_argnum, argnum);
                                constraint = NIL;
                                constraint = cdolist_list_var_$17.first();
                                while (NIL != cdolist_list_var_$17) {
                                    item_var = constraint;
                                    if (NIL == member(item_var, constraints, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                        constraints = cons(item_var, constraints);
                                    }
                                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                    constraint = cdolist_list_var_$17.first();
                                } 
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            } 
                        } else {
                            constraints = rbp_get_iai_constraints(reln, ind_argnum, argnum);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    if (NIL != constraints) {
                        supers = (NIL != forts.fort_p(ind_arg)) ? NIL != type_levelP ? genls.all_genls(ind_arg, mt_to_check, UNPROVIDED) : isa.all_isa(ind_arg, mt_to_check, UNPROVIDED) : NIL;
                        cdolist_list_var2 = constraints;
                        con = NIL;
                        con = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            datum = current = con;
                            ind_col = NIL;
                            dep_col = NIL;
                            destructuring_bind_must_consp(current, datum, $list110);
                            ind_col = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list110);
                            dep_col = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                appliesP = (NIL != type_levelP) ? (NIL != forts.fort_p(ind_arg)) && (NIL != forts.fort_p(ind_col)) ? member(ind_col, supers, UNPROVIDED, UNPROVIDED) : npp_genlP(ind_arg, ind_col, mt_to_check) : (NIL != forts.fort_p(ind_arg)) && (NIL != forts.fort_p(ind_col)) ? member(ind_col, supers, UNPROVIDED, UNPROVIDED) : rbp_wff_isaP(ind_arg, ind_col, mt_to_check);
                                if (NIL != appliesP) {
                                    item_var2 = dep_col;
                                    if (NIL == member(item_var2, constraint_cols, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        constraint_cols = cons(item_var2, constraint_cols);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list110);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            con = cdolist_list_var2.first();
                        } 
                    }
                }
            }
        }
        if (NIL == constraint_cols) {
            return values(NIL, NIL);
        }
        final SubLObject constraint_check_mt = rbp_wff_info_lookup_mt(formula);
        return values(constraint_cols, constraint_check_mt);
    }

    public static SubLObject rbp_get_iai_constraints(final SubLObject reln, final SubLObject ind_argnum, final SubLObject dep_argnum) {
        final SubLObject iai_pred = rbp_get_iai_pred(ind_argnum, dep_argnum);
        return (NIL != iai_pred) && (NIL != indexed_term_p(reln)) ? kb_mapping_utilities.pred_value_tuples(reln, iai_pred, ONE_INTEGER, $list116, UNPROVIDED) : NIL;
    }

    public static SubLObject clear_rbp_get_iai_pred() {
        final SubLObject cs = $rbp_get_iai_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_get_iai_pred(final SubLObject ind_argnum, final SubLObject dep_argnum) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_get_iai_pred_caching_state$.getGlobalValue(), list(ind_argnum, dep_argnum), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_get_iai_pred_internal(final SubLObject ind_argnum, final SubLObject dep_argnum) {
        return ask_utilities.ask_template($sym122$_PRED, list($$and, $list124, list($$constrainsArgs, $sym122$_PRED, ind_argnum, dep_argnum)), $inter_arg_isa_predicate_mt$.getGlobalValue(), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject rbp_get_iai_pred(final SubLObject ind_argnum, final SubLObject dep_argnum) {
        SubLObject caching_state = $rbp_get_iai_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RBP_GET_IAI_PRED, $rbp_get_iai_pred_caching_state$, NIL, EQ, TWO_INTEGER, $int$32);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(ind_argnum, dep_argnum);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (ind_argnum.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && dep_argnum.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rbp_get_iai_pred_internal(ind_argnum, dep_argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(ind_argnum, dep_argnum));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_rbp_get_ani_pred() {
        final SubLObject cs = $rbp_get_ani_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_get_ani_pred(final SubLObject argnum) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_get_ani_pred_caching_state$.getGlobalValue(), list(argnum), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_get_ani_pred_internal(final SubLObject argnum) {
        return ask_utilities.ask_template($sym122$_PRED, list($$and, $list128, $list129, list($$constrainsArg, $sym122$_PRED, argnum)), $arg_not_isa_predicate_mt$.getGlobalValue(), NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject rbp_get_ani_pred(final SubLObject argnum) {
        SubLObject caching_state = $rbp_get_ani_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RBP_GET_ANI_PRED, $rbp_get_ani_pred_caching_state$, NIL, EQ, ONE_INTEGER, $int$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, argnum, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rbp_get_ani_pred_internal(argnum)));
            memoization_state.caching_state_put(caching_state, argnum, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rbp_not_isa_constraints(final SubLObject template, final SubLObject keyword_bindings, final SubLObject argnum, final SubLObject type_level_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = rbp_subst_bindings(keyword_bindings, template);
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        final SubLObject reln_mt = rbp_wff_info_lookup_mt(reln);
        SubLObject constraint_cols = NIL;
        final SubLObject ani_pred = rbp_get_ani_pred(argnum);
        if (NIL != indexed_term_p(ani_pred)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(reln_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != fort_types_interface.predicate_p(reln)) {
                    final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                    final SubLObject node_var = reln;
                    final SubLObject deck_type = ($BREADTH == $DEPTH) ? $STACK : $QUEUE;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str144$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$22 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            for (node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$27 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                final SubLObject genl_pred = node_var_$27;
                                                final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    if (NIL == inverseP) {
                                                        final SubLObject pred_var = ani_pred;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl_pred, NIL, pred_var)) {
                                                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl_pred, NIL, pred_var);
                                                            SubLObject done_var = NIL;
                                                            final SubLObject token_var = NIL;
                                                            while (NIL == done_var) {
                                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                if (NIL != valid) {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        SubLObject done_var_$29 = NIL;
                                                                        final SubLObject token_var_$30 = NIL;
                                                                        while (NIL == done_var_$29) {
                                                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$30);
                                                                            final SubLObject valid_$31 = makeBoolean(!token_var_$30.eql(as));
                                                                            if (NIL != valid_$31) {
                                                                                final SubLObject item_var = assertions_high.gaf_arg2(as);
                                                                                if (NIL == member(item_var, constraint_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                    constraint_cols = cons(item_var, constraint_cols);
                                                                                }
                                                                            }
                                                                            done_var_$29 = makeBoolean(NIL == valid_$31);
                                                                        } 
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values = getValuesAsVector();
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                            restoreValuesFromVector(_values);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            } 
                                                        }
                                                    }
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(node_var_$27);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$36;
                                                                                    for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str145$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str146$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$38;
                                                                    final SubLObject new_list = cdolist_list_var_$38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$38.first();
                                                                    while (NIL != cdolist_list_var_$38) {
                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var2 = sol2;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while (NIL != csome_list_var2) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str145$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$27, thread);
                                                                        }
                                                                        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                        generating_fn = cdolist_list_var_$38.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$23, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$22, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$24, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$22, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str147$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$23, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$21, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$20, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$20, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$19, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$18, thread);
                    }
                } else {
                    final SubLObject pred_var2 = ani_pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, NIL, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, NIL, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                    SubLObject done_var_$30 = NIL;
                                    final SubLObject token_var_$31 = NIL;
                                    while (NIL == done_var_$30) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$31);
                                        final SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(as2));
                                        if (NIL != valid_$32) {
                                            final SubLObject item_var2 = assertions_high.gaf_arg2(as2);
                                            if (NIL == member(item_var2, constraint_cols, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                constraint_cols = cons(item_var2, constraint_cols);
                                            }
                                        }
                                        done_var_$30 = makeBoolean(NIL == valid_$32);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != rbp_binary_relationP(reln)) {
            final SubLObject ind_argnum = subtract(THREE_INTEGER, argnum);
            final SubLObject ind_arg = cycl_utilities.formula_arg(formula, ind_argnum, UNPROVIDED);
            final SubLObject mt_to_check = rbp_wff_info_lookup_mt(list(ind_arg, reln));
            final SubLObject pairs = rbp_iani_pairs(reln, ind_argnum, mt_to_check);
            SubLObject appliesP = NIL;
            SubLObject cdolist_list_var2 = pairs;
            SubLObject pair = NIL;
            pair = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject ind_col = NIL;
                SubLObject dep_col = NIL;
                destructuring_bind_must_consp(current, datum, $list110);
                ind_col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list110);
                dep_col = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt_to_check);
                    final SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                        if (NIL != subl_promotions.memberP(cycl_utilities.formula_arg(template, ind_argnum, UNPROVIDED), type_level_args, UNPROVIDED, UNPROVIDED)) {
                            appliesP = npp_genlP(ind_arg, ind_col, UNPROVIDED);
                        } else {
                            appliesP = rbp_wff_isaP(ind_arg, ind_col, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_8, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_7, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_6, thread);
                    }
                    if (NIL != appliesP) {
                        final SubLObject item_var3 = dep_col;
                        if (NIL == member(item_var3, constraint_cols, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            constraint_cols = cons(item_var3, constraint_cols);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list110);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                pair = cdolist_list_var2.first();
            } 
        }
        if (NIL == constraint_cols) {
            return values(NIL, NIL);
        }
        SubLObject constraint_check_mt = rbp_wff_info_lookup_mt(formula);
        if (constraint_check_mt.eql($$InferencePSC)) {
            constraint_check_mt = $$BaseKB;
        }
        return values(constraint_cols, constraint_check_mt);
    }

    public static SubLObject rbp_binary_relationP(final SubLObject obj) {
        return makeBoolean((NIL != fort_types_interface.relation_p(obj)) && arity.arity(obj).eql(TWO_INTEGER));
    }

    public static SubLObject rbp_iani_pairs(final SubLObject binary_reln, final SubLObject constrained_argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iani_pred = $$interArgNotIsa1_2;
        SubLObject constraint_pairs = NIL;
        if (NIL != indexed_term_p(iani_pred)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL != fort_types_interface.predicate_p(binary_reln)) {
                    final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                    final SubLObject deck_type = ($BREADTH == $DEPTH) ? $STACK : $QUEUE;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0_$45 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str144$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str139$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$50 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(binary_reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(binary_reln, UNPROVIDED);
                                            for (node_and_predicate_mode = list(binary_reln, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$54 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                final SubLObject genl_pred = node_var_$54;
                                                final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    final SubLObject pred_var = iani_pred;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl_pred, ONE_INTEGER, pred_var)) {
                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl_pred, ONE_INTEGER, pred_var);
                                                        SubLObject done_var = NIL;
                                                        final SubLObject token_var = NIL;
                                                        while (NIL == done_var) {
                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                            if (NIL != valid) {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                    SubLObject done_var_$56 = NIL;
                                                                    final SubLObject token_var_$57 = NIL;
                                                                    while (NIL == done_var_$56) {
                                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$57);
                                                                        final SubLObject valid_$58 = makeBoolean(!token_var_$57.eql(as));
                                                                        if (NIL != valid_$58) {
                                                                            final SubLObject pair = rbp_iani_pair(as, constrained_argnum, inverseP);
                                                                            if (NIL != rbp_iani_pair_ok_for_bin_predP(pair, binary_reln)) {
                                                                                final SubLObject item_var = pair;
                                                                                if (NIL == member(item_var, constraint_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                    constraint_pairs = cons(item_var, constraint_pairs);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_$56 = makeBoolean(NIL == valid_$58);
                                                                    } 
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values = getValuesAsVector();
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                        restoreValuesFromVector(_values);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        } 
                                                    }
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$51 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(node_var_$54);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$62 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$62)) {
                                                                                final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$62, thread);
                                                                                    SubLObject iteration_state_$64;
                                                                                    for (iteration_state_$64 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$64); iteration_state_$64 = dictionary_contents.do_dictionary_contents_next(iteration_state_$64)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$64);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str145$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$53, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$64);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$52, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str146$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$66;
                                                                    final SubLObject new_list = cdolist_list_var_$66 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$66.first();
                                                                    while (NIL != cdolist_list_var_$66) {
                                                                        final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var2 = sol2;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while (NIL != csome_list_var2) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str145$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$54, thread);
                                                                        }
                                                                        cdolist_list_var_$66 = cdolist_list_var_$66.rest();
                                                                        generating_fn = cdolist_list_var_$66.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$50, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$51, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$49, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$51, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$49, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str147$Node__a_does_not_pass_sbhl_type_t, binary_reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$50, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$48, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$47, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$47, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$46, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$45, thread);
                    }
                } else {
                    final SubLObject pred_var2 = iani_pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(binary_reln, ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(binary_reln, ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$57 = NIL;
                                    final SubLObject token_var_$58 = NIL;
                                    while (NIL == done_var_$57) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$58);
                                        final SubLObject valid_$59 = makeBoolean(!token_var_$58.eql(as2));
                                        if (NIL != valid_$59) {
                                            final SubLObject pair2 = rbp_iani_pair(as2, constrained_argnum, NIL);
                                            if (NIL != rbp_iani_pair_ok_for_bin_predP(pair2, binary_reln)) {
                                                final SubLObject item_var2 = pair2;
                                                if (NIL == member(item_var2, constraint_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    constraint_pairs = cons(item_var2, constraint_pairs);
                                                }
                                            }
                                        }
                                        done_var_$57 = makeBoolean(NIL == valid_$59);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return constraint_pairs;
    }

    public static SubLObject rbp_iani_pair(final SubLObject as, final SubLObject constrained_argnum, final SubLObject inverseP) {
        SubLObject pair = list(assertions_high.gaf_arg2(as), assertions_high.gaf_arg3(as));
        if (constrained_argnum.eql(TWO_INTEGER)) {
            pair = nreverse(pair);
        }
        if (NIL != inverseP) {
            pair = nreverse(pair);
        }
        return pair;
    }

    public static SubLObject rbp_iani_pair_ok_for_bin_predP(final SubLObject pair, final SubLObject binary_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1_type = NIL;
        SubLObject arg2_type = NIL;
        destructuring_bind_must_consp(pair, pair, $list149);
        arg1_type = pair.first();
        SubLObject current = pair.rest();
        destructuring_bind_must_consp(current, pair, $list149);
        arg2_type = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL == $rbp_validate_iani_pairsP$.getDynamicValue(thread)) || ((NIL != rbp_instances_admitted_for_arg_of_predP(arg1_type, ONE_INTEGER, binary_pred)) && (NIL != rbp_instances_admitted_for_arg_of_predP(arg2_type, TWO_INTEGER, binary_pred))));
        }
        cdestructuring_bind_error(pair, $list149);
        return NIL;
    }

    public static SubLObject rbp_instances_admitted_for_arg_of_predP(final SubLObject v_arg_type, final SubLObject arg_num, final SubLObject binary_pred) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = kb_accessors.argn_isa(binary_pred, arg_num, UNPROVIDED);
            SubLObject arg_isa = NIL;
            arg_isa = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                if (NIL == npp_not_disjointP(v_arg_type, arg_isa, UNPROVIDED)) {
                    badP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg_isa = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject rbp_wff_type_level_args(final SubLObject nat) {
        final SubLObject fn = cycl_utilities.nat_functor(nat);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = rbp_wff_type_level_arg_nums_for_fn(fn);
        SubLObject arg_num = NIL;
        arg_num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(cycl_utilities.nat_arg(nat, arg_num, UNPROVIDED), ans);
            cdolist_list_var = cdolist_list_var.rest();
            arg_num = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject clear_rbp_wff_type_level_arg_nums_for_fn() {
        final SubLObject cs = $rbp_wff_type_level_arg_nums_for_fn_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rbp_wff_type_level_arg_nums_for_fn(final SubLObject fn) {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_wff_type_level_arg_nums_for_fn_caching_state$.getGlobalValue(), list(fn), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_type_level_arg_nums_for_fn_internal(final SubLObject fn) {
        SubLObject ans = NIL;
        final SubLObject v_arity = arity.arity(fn);
        if (v_arity.isInteger()) {
            SubLObject i;
            SubLObject arg_num;
            for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                arg_num = number_utilities.f_1X(i);
                if (NIL != find($$Collection, kb_accessors.argn_isa(fn, arg_num, UNPROVIDED), $sym151$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ans = cons(arg_num, ans);
                }
            }
        }
        return ans;
    }

    public static SubLObject rbp_wff_type_level_arg_nums_for_fn(final SubLObject fn) {
        SubLObject caching_state = $rbp_wff_type_level_arg_nums_for_fn_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN, $rbp_wff_type_level_arg_nums_for_fn_caching_state$, $int$256, EQL, ONE_INTEGER, $int$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fn, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rbp_wff_type_level_arg_nums_for_fn_internal(fn)));
            memoization_state.caching_state_put(caching_state, fn, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rbp_wff_embedded_pred(final SubLObject formula) {
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        if (NIL == forts.fort_p(operator)) {
            return NIL;
        }
        if (operator.eql($$SubcollectionOfByFn)) {
            return $$createdBy;
        }
        if (NIL != rbp_wff_subcol_fnP(operator)) {
            return cycl_utilities.nat_arg2(formula, UNPROVIDED);
        }
        if (NIL != rbp_wff_ternary_rmpP(operator)) {
            return cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
        if (NIL != rbp_wff_quaternary_rmpP(operator)) {
            return cycl_utilities.formula_arg1(formula, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject rbp_wff_ternary_rmpP(final SubLObject fort) {
        return makeBoolean((((NIL != forts.fort_p(fort)) && (NIL != fort_types_interface.predicate_p(fort))) && arity.arity(fort).eql(THREE_INTEGER)) && (NIL != isa.isa_anyP(fort, $list156, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject rbp_wff_quaternary_rmpP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($rbp_wff_quaternary_rmps$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                $rbp_wff_quaternary_rmps$.setGlobalValue(genl_predicates.all_genl_preds($$relationAllExistsCount, UNPROVIDED, UNPROVIDED));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(fort, $rbp_wff_quaternary_rmps$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_subcol_fnP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($rbp_wff_subcol_fns$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                $rbp_wff_subcol_fns$.setGlobalValue(append($list158, isa.all_fort_instances($$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED)));
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(fort, $rbp_wff_subcol_fns$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_wff_embedded_args(final SubLObject formula) {
        if (NIL != term.nautP(formula, UNPROVIDED)) {
            final SubLObject fn = cycl_utilities.nat_functor(formula);
            final SubLObject pcase_var = cycl_utilities.nat_arity(formula, UNPROVIDED);
            if (pcase_var.eql(THREE_INTEGER)) {
                final SubLObject pcase_var_$73 = rbp_wff_fn_direction(fn);
                if (pcase_var_$73.eql($FROM)) {
                    return list(cycl_utilities.nat_arg3(formula, UNPROVIDED), cycl_utilities.nat_arg1(formula, UNPROVIDED));
                }
                if (pcase_var_$73.eql($TO)) {
                    return list(cycl_utilities.nat_arg1(formula, UNPROVIDED), cycl_utilities.nat_arg3(formula, UNPROVIDED));
                }
                if (pcase_var_$73.eql($ERROR)) {
                    return NIL;
                }
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    return list(cycl_utilities.nat_arg1(formula, UNPROVIDED), cycl_utilities.nat_arg2(formula, UNPROVIDED));
                }

        } else
            if ((NIL != el_formula_p(formula)) && (NIL != rbp_wff_ternary_rmpP(cycl_utilities.formula_arg0(formula)))) {
                return list(cycl_utilities.formula_arg2(formula, UNPROVIDED), cycl_utilities.formula_arg3(formula, UNPROVIDED));
            }

        return NIL;
    }

    public static SubLObject rbp_wff_fn_direction(final SubLObject fn) {
        if (NIL != rbp_wff_isaP(fn, $const162$SubcollectionRelationFunction_Can, UNPROVIDED)) {
            return $TO;
        }
        if (NIL != rbp_wff_isaP(fn, $const163$SubcollectionRelationFunction_Inv, UNPROVIDED)) {
            return $FROM;
        }
        if (fn.eql($$InstanceWithRelationFromFn)) {
            return $FROM;
        }
        if (fn.eql($$InstanceWithRelationToFn)) {
            return $TO;
        }
        return $ERROR;
    }

    public static SubLObject rbp_subst_bindings(final SubLObject v_bindings, final SubLObject template) {
        SubLObject ans = rbp_template_with_arg_manipulation(v_bindings, template);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = subst(binding.rest(), binding.first(), ans, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject rbp_template_predicate(final SubLObject template, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        SubLObject prelim_pred = NIL;
        SubLObject true_pred = NIL;
        if (NIL != el_binary_formula_p(template)) {
            prelim_pred = cycl_utilities.formula_arg0(template);
        } else
            if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(template)) {
                prelim_pred = parsing_utilities.subcollection_function_naut_pred(template);
            }

        if (prelim_pred.isKeyword() && (NIL == true_pred)) {
            SubLObject csome_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == true_pred) && (NIL != csome_list_var)) {
                if (binding.first().eql(prelim_pred)) {
                    true_pred = binding.rest();
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return NIL != true_pred ? true_pred : prelim_pred;
    }

    public static SubLObject rbp_template_with_arg_manipulation(final SubLObject v_bindings, final SubLObject template) {
        return rbp_template_with_strengthened_args(v_bindings, rbp_template_with_arg_substitution(v_bindings, template));
    }

    public static SubLObject rbp_template_with_arg_substitution(final SubLObject v_bindings, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(template)) {
            final SubLObject the_pred = rbp_template_predicate(template, v_bindings);
            SubLObject ans = template;
            if (NIL != fort_types_interface.predicateP(the_pred)) {
                final SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg(ans);
                final SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg(ans);
                SubLObject func = NIL;
                if (from_arg.eql($$TheNCArgIsas)) {
                    func = symbol_function(MIN_ARGN_ISA);
                } else
                    if (from_arg.eql($$TheNCArgGenls)) {
                        func = symbol_function(MIN_ARGN_GENL);
                    }

                if (NIL != func) {
                    SubLObject new_col = NIL;
                    SubLObject cdolist_list_var = funcall(func, the_pred, ONE_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == new_col) || (NIL != npp_genlP(col, new_col, UNPROVIDED))) {
                            new_col = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                    ans = parsing_utilities.subcollection_function_naut_with_new_from_arg(ans, new_col);
                }
                if (to_arg.eql($$TheNCArgIsas)) {
                    func = symbol_function(MIN_ARGN_ISA);
                } else
                    if (to_arg.eql($$TheNCArgGenls)) {
                        func = symbol_function(MIN_ARGN_GENL);
                    } else {
                        func = NIL;
                    }

                if (NIL != func) {
                    SubLObject new_col = NIL;
                    SubLObject cdolist_list_var = funcall(func, the_pred, TWO_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == new_col) || (NIL != npp_genlP(col, new_col, UNPROVIDED))) {
                            new_col = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                    ans = parsing_utilities.subcollection_function_naut_with_new_to_arg(ans, new_col);
                }
            }
            return ans;
        }
        return template;
    }

    public static SubLObject rbp_template_with_strengthened_args(final SubLObject v_bindings, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(template)) {
            final SubLObject the_pred = rbp_template_predicate(template, v_bindings);
            SubLObject ans = template;
            if (NIL != fort_types_interface.predicate_p(the_pred)) {
                SubLObject from_arg = parsing_utilities.subcollection_function_naut_from_arg(ans);
                SubLObject to_arg = parsing_utilities.subcollection_function_naut_to_arg(ans);
                if (NIL != forts.fort_p(from_arg)) {
                    SubLObject cdolist_list_var = kb_accessors.min_argn_isa(the_pred, ONE_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != npp_genlP(col, from_arg, UNPROVIDED)) {
                            from_arg = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                    ans = parsing_utilities.subcollection_function_naut_with_new_from_arg(ans, from_arg);
                }
                if (NIL != forts.fort_p(to_arg)) {
                    SubLObject cdolist_list_var = kb_accessors.min_argn_isa(the_pred, TWO_INTEGER, parsing_vars.$parsing_domain_mt$.getDynamicValue(thread));
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != npp_genlP(col, to_arg, UNPROVIDED)) {
                            to_arg = col;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                    ans = parsing_utilities.subcollection_function_naut_with_new_to_arg(ans, to_arg);
                }
            }
            return ans;
        }
        return template;
    }

    public static SubLObject declare_rbp_wff_file() {
        declareFunction(me, "rbp_wff_validation_reset", "RBP-WFF-VALIDATION-RESET", 0, 0, false);
        declareFunction(me, "rbp_wff_validation_report", "RBP-WFF-VALIDATION-REPORT", 1, 0, false);
        declareMacro(me, "rbp_wff_validating", "RBP-WFF-VALIDATING");
        declareFunction(me, "clear_rbp_wf_nat_externalP", "CLEAR-RBP-WF-NAT-EXTERNAL?", 0, 0, false);
        declareFunction(me, "remove_rbp_wf_nat_externalP", "REMOVE-RBP-WF-NAT-EXTERNAL?", 2, 0, false);
        declareFunction(me, "rbp_wf_nat_externalP_internal", "RBP-WF-NAT-EXTERNAL?-INTERNAL", 2, 0, false);
        declareFunction(me, "rbp_wf_nat_externalP", "RBP-WF-NAT-EXTERNAL?", 2, 0, false);
        declareFunction(me, "rbp_wff_check_formula_arg_position_replacements", "RBP-WFF-CHECK-FORMULA-ARG-POSITION-REPLACEMENTS", 3, 0, false);
        declareFunction(me, "clear_rbp_wf_template_argsP", "CLEAR-RBP-WF-TEMPLATE-ARGS?", 0, 0, false);
        declareFunction(me, "remove_rbp_wf_template_argsP", "REMOVE-RBP-WF-TEMPLATE-ARGS?", 3, 0, false);
        declareFunction(me, "rbp_wf_template_argsP_internal", "RBP-WF-TEMPLATE-ARGS?-INTERNAL", 3, 0, false);
        declareFunction(me, "rbp_wf_template_argsP", "RBP-WF-TEMPLATE-ARGS?", 3, 0, false);
        declareFunction(me, "rbp_wff_bindings_visibleP", "RBP-WFF-BINDINGS-VISIBLE?", 1, 0, false);
        declareFunction(me, "rbp_wff_term_visibleP", "RBP-WFF-TERM-VISIBLE?", 1, 0, false);
        declareFunction(me, "rbp_wff_term_visible_by_fiatP", "RBP-WFF-TERM-VISIBLE-BY-FIAT?", 1, 0, false);
        declareFunction(me, "rbp_wff_term_visible_check_requiredP", "RBP-WFF-TERM-VISIBLE-CHECK-REQUIRED?", 1, 0, false);
        declareFunction(me, "rbp_wff_term_actually_visibleP", "RBP-WFF-TERM-ACTUALLY-VISIBLE?", 1, 0, false);
        declareFunction(me, "rbp_formula_variable_isa_constraints", "RBP-FORMULA-VARIABLE-ISA-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "rbp_wff_reset_metrics", "RBP-WFF-RESET-METRICS", 0, 0, false);
        declareFunction(me, "rbp_wff_report_metrics", "RBP-WFF-REPORT-METRICS", 0, 1, false);
        declareFunction(me, "rbp_wff_clear_caches", "RBP-WFF-CLEAR-CACHES", 0, 0, false);
        declareFunction(me, "clear_rbp_wf_natP", "CLEAR-RBP-WF-NAT?", 0, 0, false);
        declareFunction(me, "remove_rbp_wf_natP", "REMOVE-RBP-WF-NAT?", 2, 0, false);
        declareFunction(me, "rbp_wf_natP_internal", "RBP-WF-NAT?-INTERNAL", 2, 0, false);
        declareFunction(me, "rbp_wf_natP", "RBP-WF-NAT?", 2, 0, false);
        declareFunction(me, "npp_genl_predP", "NPP-GENL-PRED?", 2, 0, false);
        declareFunction(me, "npp_search_gafs_gp", "NPP-SEARCH-GAFS-GP", 5, 2, false);
        declareFunction(me, "npp_typed_genl_predP", "NPP-TYPED-GENL-PRED?", 2, 0, false);
        declareFunction(me, "rbp_wff_maybe_genlP", "RBP-WFF-MAYBE-GENL?", 2, 1, false);
        declareFunction(me, "npp_type_genlP", "NPP-TYPE-GENL?", 2, 1, false);
        declareFunction(me, "npp_not_genlP", "NPP-NOT-GENL?", 2, 1, false);
        declareFunction(me, "npp_genlP", "NPP-GENL?", 2, 1, false);
        declareFunction(me, "npp_genl_or_anyP", "NPP-GENL-OR-ANY?", 2, 1, false);
        declareFunction(me, "npp_genl_via_sbhlP", "NPP-GENL-VIA-SBHL?", 3, 0, false);
        declareFunction(me, "npp_naut_genl_via_result_genlP", "NPP-NAUT-GENL-VIA-RESULT-GENL?", 3, 0, false);
        declareFunction(me, "npp_naut_genl_via_rgaP", "NPP-NAUT-GENL-VIA-RGA?", 3, 0, false);
        declareFunction(me, "npp_naut_genl_via_pgiaP", "NPP-NAUT-GENL-VIA-PGIA?", 3, 0, false);
        declareFunction(me, "rbp_wff_not_isaP", "RBP-WFF-NOT-ISA?", 2, 1, false);
        declareFunction(me, "rbp_wff_maybe_isaP", "RBP-WFF-MAYBE-ISA?", 2, 1, false);
        declareFunction(me, "rbp_wff_isaP", "RBP-WFF-ISA?", 2, 1, false);
        declareFunction(me, "rbp_wff_isaP_int", "RBP-WFF-ISA?-INT", 4, 0, false);
        declareFunction(me, "npp_not_type_disjointP", "NPP-NOT-TYPE-DISJOINT?", 2, 1, false);
        declareFunction(me, "npp_do_ntdP", "NPP-DO-NTD?", 2, 0, false);
        declareFunction(me, "npp_not_disjointP", "NPP-NOT-DISJOINT?", 2, 1, false);
        declareFunction(me, "rbp_wff_find_floor_mts", "RBP-WFF-FIND-FLOOR-MTS", 1, 0, false);
        declareFunction(me, "clear_rbp_wff_find_floor_mts_int", "CLEAR-RBP-WFF-FIND-FLOOR-MTS-INT", 0, 0, false);
        declareFunction(me, "remove_rbp_wff_find_floor_mts_int", "REMOVE-RBP-WFF-FIND-FLOOR-MTS-INT", 1, 0, false);
        declareFunction(me, "rbp_wff_find_floor_mts_int_internal", "RBP-WFF-FIND-FLOOR-MTS-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "rbp_wff_find_floor_mts_int", "RBP-WFF-FIND-FLOOR-MTS-INT", 1, 0, false);
        declareFunction(me, "remove_visible_mts", "REMOVE-VISIBLE-MTS", 1, 1, false);
        declareFunction(me, "mt_visible_from_mtP", "MT-VISIBLE-FROM-MT?", 2, 0, false);
        declareFunction(me, "npp_isaP", "NPP-ISA?", 2, 1, false);
        declareFunction(me, "npp_isa_or_anyP", "NPP-ISA-OR-ANY?", 2, 1, false);
        declareFunction(me, "rbp_wff_el_sentence_assertibleP", "RBP-WFF-EL-SENTENCE-ASSERTIBLE?", 1, 0, false);
        declareFunction(me, "npp_individualP", "NPP-INDIVIDUAL?", 1, 0, false);
        declareFunction(me, "npp_collectionP", "NPP-COLLECTION?", 1, 0, false);
        declareFunction(me, "rbp_relation_all_violationP", "RBP-RELATION-ALL-VIOLATION?", 4, 1, false);
        declareFunction(me, "rbp_relation_all_matchP", "RBP-RELATION-ALL-MATCH?", 4, 1, false);
        declareFunction(me, "rbp_defining_mt", "RBP-DEFINING-MT", 1, 0, false);
        declareFunction(me, "clear_rbp_defining_mts", "CLEAR-RBP-DEFINING-MTS", 0, 0, false);
        declareFunction(me, "remove_rbp_defining_mts", "REMOVE-RBP-DEFINING-MTS", 1, 0, false);
        declareFunction(me, "rbp_defining_mts_internal", "RBP-DEFINING-MTS-INTERNAL", 1, 0, false);
        declareFunction(me, "rbp_defining_mts", "RBP-DEFINING-MTS", 1, 0, false);
        declareFunction(me, "rbp_defining_assertions", "RBP-DEFINING-ASSERTIONS", 1, 0, false);
        declareFunction(me, "rbp_theory_mts", "RBP-THEORY-MTS", 1, 0, false);
        declareFunction(me, "rbp_vocabulary_mts", "RBP-VOCABULARY-MTS", 0, 0, false);
        declareFunction(me, "rbp_vocabulary_mtP", "RBP-VOCABULARY-MT?", 1, 0, false);
        declareFunction(me, "rbp_wff_test_failsP", "RBP-WFF-TEST-FAILS?", 3, 1, false);
        declareFunction(me, "clear_rbp_wff_test_fails_intP", "CLEAR-RBP-WFF-TEST-FAILS-INT?", 0, 0, false);
        declareFunction(me, "remove_rbp_wff_test_fails_intP", "REMOVE-RBP-WFF-TEST-FAILS-INT?", 4, 0, false);
        declareFunction(me, "rbp_wff_test_fails_intP_internal", "RBP-WFF-TEST-FAILS-INT?-INTERNAL", 4, 0, false);
        declareFunction(me, "rbp_wff_test_fails_intP", "RBP-WFF-TEST-FAILS-INT?", 4, 0, false);
        declareFunction(me, "rbp_wff_contains_strippable_nl_tagP", "RBP-WFF-CONTAINS-STRIPPABLE-NL-TAG?", 1, 0, false);
        declareFunction(me, "rbp_wff_convert_nat", "RBP-WFF-CONVERT-NAT", 1, 1, false);
        declareFunction(me, "rbp_wff_constraints_primary", "RBP-WFF-CONSTRAINTS-PRIMARY", 2, 1, false);
        declareFunction(me, "clear_rbp_wff_constraints_prim_int_cached", "CLEAR-RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED", 0, 0, false);
        declareFunction(me, "remove_rbp_wff_constraints_prim_int_cached", "REMOVE-RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED", 3, 0, false);
        declareFunction(me, "rbp_wff_constraints_prim_int_cached_internal", "RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED-INTERNAL", 3, 0, false);
        declareFunction(me, "rbp_wff_constraints_prim_int_cached", "RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED", 3, 0, false);
        declareFunction(me, "rbp_isa_constraint_cols", "RBP-ISA-CONSTRAINT-COLS", 2, 0, false);
        declareFunction(me, "rbp_genl_constraint_cols", "RBP-GENL-CONSTRAINT-COLS", 2, 0, false);
        declareFunction(me, "rbp_constraints_for_parsed_preds", "RBP-CONSTRAINTS-FOR-PARSED-PREDS", 2, 0, false);
        declareFunction(me, "rbp_wff_instantiate_types", "RBP-WFF-INSTANTIATE-TYPES", 2, 0, false);
        declareFunction(me, "rbp_wff_constraints_secondary", "RBP-WFF-CONSTRAINTS-SECONDARY", 2, 0, false);
        declareFunction(me, "rbp_wff_constraints_from_csf", "RBP-WFF-CONSTRAINTS-FROM-CSF", 2, 0, false);
        declareFunction(me, "rbp_iand_constraints", "RBP-IAND-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "rbp_iand_constraints_from_genls_format", "RBP-IAND-CONSTRAINTS-FROM-GENLS-FORMAT", 4, 0, false);
        declareFunction(me, "rbp_wff_info_lookup_mt", "RBP-WFF-INFO-LOOKUP-MT", 1, 0, false);
        declareFunction(me, "rbp_wff_domain_mt_setP", "RBP-WFF-DOMAIN-MT-SET?", 0, 0, false);
        declareFunction(me, "rbp_wff_domain_mt", "RBP-WFF-DOMAIN-MT", 0, 0, false);
        declareFunction(me, "rbp_reln_ok_for_genls_formatP", "RBP-RELN-OK-FOR-GENLS-FORMAT?", 1, 0, false);
        declareFunction(me, "rbp_iand_cols_for_reln_from_genls_format", "RBP-IAND-COLS-FOR-RELN-FROM-GENLS-FORMAT", 2, 0, false);
        declareFunction(me, "rbp_iai_constraints", "RBP-IAI-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "rbp_get_iai_constraints", "RBP-GET-IAI-CONSTRAINTS", 3, 0, false);
        declareFunction(me, "clear_rbp_get_iai_pred", "CLEAR-RBP-GET-IAI-PRED", 0, 0, false);
        declareFunction(me, "remove_rbp_get_iai_pred", "REMOVE-RBP-GET-IAI-PRED", 2, 0, false);
        declareFunction(me, "rbp_get_iai_pred_internal", "RBP-GET-IAI-PRED-INTERNAL", 2, 0, false);
        declareFunction(me, "rbp_get_iai_pred", "RBP-GET-IAI-PRED", 2, 0, false);
        declareFunction(me, "clear_rbp_get_ani_pred", "CLEAR-RBP-GET-ANI-PRED", 0, 0, false);
        declareFunction(me, "remove_rbp_get_ani_pred", "REMOVE-RBP-GET-ANI-PRED", 1, 0, false);
        declareFunction(me, "rbp_get_ani_pred_internal", "RBP-GET-ANI-PRED-INTERNAL", 1, 0, false);
        declareFunction(me, "rbp_get_ani_pred", "RBP-GET-ANI-PRED", 1, 0, false);
        declareFunction(me, "rbp_not_isa_constraints", "RBP-NOT-ISA-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "rbp_binary_relationP", "RBP-BINARY-RELATION?", 1, 0, false);
        declareFunction(me, "rbp_iani_pairs", "RBP-IANI-PAIRS", 3, 0, false);
        declareFunction(me, "rbp_iani_pair", "RBP-IANI-PAIR", 3, 0, false);
        declareFunction(me, "rbp_iani_pair_ok_for_bin_predP", "RBP-IANI-PAIR-OK-FOR-BIN-PRED?", 2, 0, false);
        declareFunction(me, "rbp_instances_admitted_for_arg_of_predP", "RBP-INSTANCES-ADMITTED-FOR-ARG-OF-PRED?", 3, 0, false);
        declareFunction(me, "rbp_wff_type_level_args", "RBP-WFF-TYPE-LEVEL-ARGS", 1, 0, false);
        declareFunction(me, "clear_rbp_wff_type_level_arg_nums_for_fn", "CLEAR-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN", 0, 0, false);
        declareFunction(me, "remove_rbp_wff_type_level_arg_nums_for_fn", "REMOVE-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN", 1, 0, false);
        declareFunction(me, "rbp_wff_type_level_arg_nums_for_fn_internal", "RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN-INTERNAL", 1, 0, false);
        declareFunction(me, "rbp_wff_type_level_arg_nums_for_fn", "RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN", 1, 0, false);
        declareFunction(me, "rbp_wff_embedded_pred", "RBP-WFF-EMBEDDED-PRED", 1, 0, false);
        declareFunction(me, "rbp_wff_ternary_rmpP", "RBP-WFF-TERNARY-RMP?", 1, 0, false);
        declareFunction(me, "rbp_wff_quaternary_rmpP", "RBP-WFF-QUATERNARY-RMP?", 1, 0, false);
        declareFunction(me, "rbp_wff_subcol_fnP", "RBP-WFF-SUBCOL-FN?", 1, 0, false);
        declareFunction(me, "rbp_wff_embedded_args", "RBP-WFF-EMBEDDED-ARGS", 1, 0, false);
        declareFunction(me, "rbp_wff_fn_direction", "RBP-WFF-FN-DIRECTION", 1, 0, false);
        declareFunction(me, "rbp_subst_bindings", "RBP-SUBST-BINDINGS", 2, 0, false);
        declareFunction(me, "rbp_template_predicate", "RBP-TEMPLATE-PREDICATE", 1, 1, false);
        declareFunction(me, "rbp_template_with_arg_manipulation", "RBP-TEMPLATE-WITH-ARG-MANIPULATION", 2, 0, false);
        declareFunction(me, "rbp_template_with_arg_substitution", "RBP-TEMPLATE-WITH-ARG-SUBSTITUTION", 2, 0, false);
        declareFunction(me, "rbp_template_with_strengthened_args", "RBP-TEMPLATE-WITH-STRENGTHENED-ARGS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rbp_wff_file() {
        defparameter("*RBP-WFF-CHECK-TIME*", ZERO_INTEGER);
        defparameter("*RBP-WFF-CHECKS-TOTAL*", ZERO_INTEGER);
        defparameter("*RBP-WFF-CHECKS-FAILED*", ZERO_INTEGER);
        defparameter("*RBP-SHOW-NON-WFF?*", NIL);
        deflexical("*RBP-WFF-VALIDATION-COUNT*", SubLTrampolineFile.maybeDefault($rbp_wff_validation_count$, $rbp_wff_validation_count$, ZERO_INTEGER));
        deflexical("*RBP-WFF-VALIDATION-FALSE-POS*", SubLTrampolineFile.maybeDefault($rbp_wff_validation_false_pos$, $rbp_wff_validation_false_pos$, NIL));
        deflexical("*RBP-WFF-VALIDATION-FALSE-NEG*", SubLTrampolineFile.maybeDefault($rbp_wff_validation_false_neg$, $rbp_wff_validation_false_neg$, NIL));
        deflexical("*RBP-WFF-VALIDATE-SETTING*", SubLTrampolineFile.maybeDefault($rbp_wff_validate_setting$, $rbp_wff_validate_setting$, NIL));
        deflexical("*RBP-VOCABULARY-MTS*", SubLTrampolineFile.maybeDefault($rbp_vocabulary_mts$, $rbp_vocabulary_mts$, $UNINITIALIZED));
        deflexical("*RBP-WFF-QUATERNARY-RMPS*", SubLTrampolineFile.maybeDefault($rbp_wff_quaternary_rmps$, $rbp_wff_quaternary_rmps$, $UNINITIALIZED));
        deflexical("*RBP-WF-NAT-EXTERNAL?-CACHING-STATE*", NIL);
        deflexical("*RBP-WF-TEMPLATE-ARGS?-CACHING-STATE*", NIL);
        defparameter("*RBP-WFF-CHECK-VISIBILITY?*", NIL);
        deflexical("*RBP-WF-NAT?-CACHING-STATE*", NIL);
        deflexical("*RBP-WFF-FIND-FLOOR-MTS-INT-CACHING-STATE*", NIL);
        deflexical("*RBP-DEFINING-MTS-CACHING-STATE*", NIL);
        deflexical("*RBP-WFF-TEST-FAILS-INT?-CACHING-STATE*", NIL);
        deflexical("*RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED-CACHING-STATE*", NIL);
        defparameter("*RBP-KNOWN-FALSE-EQUALS-NON-WFF?*", NIL);
        deflexical("*INTER-ARG-ISA-PREDICATE-MT*", SubLTrampolineFile.maybeDefault($inter_arg_isa_predicate_mt$, $inter_arg_isa_predicate_mt$, $$BaseKB));
        deflexical("*ARG-NOT-ISA-PREDICATE-MT*", SubLTrampolineFile.maybeDefault($arg_not_isa_predicate_mt$, $arg_not_isa_predicate_mt$, $$BaseKB));
        deflexical("*RBP-GET-IAI-PRED-CACHING-STATE*", NIL);
        deflexical("*RBP-GET-ANI-PRED-CACHING-STATE*", NIL);
        defparameter("*RBP-VALIDATE-IANI-PAIRS?*", NIL);
        deflexical("*RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN-CACHING-STATE*", NIL);
        deflexical("*RBP-WFF-SUBCOL-FNS*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_rbp_wff_file() {
        declare_defglobal($rbp_wff_validation_count$);
        declare_defglobal($rbp_wff_validation_false_pos$);
        declare_defglobal($rbp_wff_validation_false_neg$);
        declare_defglobal($rbp_wff_validate_setting$);
        declare_defglobal($rbp_vocabulary_mts$);
        declare_defglobal($rbp_wff_quaternary_rmps$);
        memoization_state.note_globally_cached_function($sym19$RBP_WF_NAT_EXTERNAL_);
        memoization_state.note_globally_cached_function($sym23$RBP_WF_TEMPLATE_ARGS_);
        memoization_state.note_globally_cached_function($sym48$RBP_WF_NAT_);
        memoization_state.note_globally_cached_function(RBP_WFF_FIND_FLOOR_MTS_INT);
        memoization_state.note_globally_cached_function(RBP_DEFINING_MTS);
        memoization_state.note_globally_cached_function($sym93$RBP_WFF_TEST_FAILS_INT_);
        memoization_state.note_globally_cached_function(RBP_WFF_CONSTRAINTS_PRIM_INT_CACHED);
        declare_defglobal($inter_arg_isa_predicate_mt$);
        mt_vars.note_mt_var($inter_arg_isa_predicate_mt$, $$InterArgIsaPredicate);
        declare_defglobal($arg_not_isa_predicate_mt$);
        mt_vars.note_mt_var($arg_not_isa_predicate_mt$, $$ArgNotIsaPredicate);
        memoization_state.note_globally_cached_function(RBP_GET_IAI_PRED);
        memoization_state.note_globally_cached_function(RBP_GET_ANI_PRED);
        memoization_state.note_globally_cached_function(RBP_WFF_TYPE_LEVEL_ARG_NUMS_FOR_FN);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rbp_wff_file();
    }

    @Override
    public void initializeVariables() {
        init_rbp_wff_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rbp_wff_file();
    }

    static {





































































































































































































    }
}

/**
 * Total time: 1875 ms
 */
