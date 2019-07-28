package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.rkf_salient_descriptor;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.utilities_macros;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.rkf_salient_descriptor.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_salient_descriptor extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_salient_descriptor();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor";

    public static final String myFingerPrint = "6c46decf777ef4ef4540a497d8fed6dd252583cf40af31a6f3627464ce1ddd38";

    // deflexical
    // Definitions
    private static final SubLSymbol $rkf_salient_formula_types$ = makeSymbol("*RKF-SALIENT-FORMULA-TYPES*");

    // defparameter
    /**
     * What's the maximum number of salient descriptors of each type we want to
     * produce? NIL or POSITIVE-INTEGER-P
     */
    public static final SubLSymbol $rkf_salient_descriptor_number_cutoff$ = makeSymbol("*RKF-SALIENT-DESCRIPTOR-NUMBER-CUTOFF*");

    // defparameter
    /**
     * What's the maximum number of seconds we want to spend looking for salient
     * descriptors of each type? NIL or POSITIVE-INTEGER-P
     */
    public static final SubLSymbol $rkf_salient_descriptor_time_cutoff$ = makeSymbol("*RKF-SALIENT-DESCRIPTOR-TIME-CUTOFF*");

    // defparameter
    // What's the maximum number of backchains we will allow?
    public static final SubLSymbol $rkf_salient_descriptor_transformation_cutoff$ = makeSymbol("*RKF-SALIENT-DESCRIPTOR-TRANSFORMATION-CUTOFF*");

    // defparameter
    public static final SubLSymbol $rkf_sd_exclude_known_promptsP$ = makeSymbol("*RKF-SD-EXCLUDE-KNOWN-PROMPTS?*");

    // defparameter
    public static final SubLSymbol $rkf_sd_problem_store$ = makeSymbol("*RKF-SD-PROBLEM-STORE*");

    // deflexical
    public static final SubLSymbol $rkf_sd_problem_store_checkpoints$ = makeSymbol("*RKF-SD-PROBLEM-STORE-CHECKPOINTS*");

    // defparameter
    public static final SubLSymbol $rkf_sd_reuse_problem_storeP$ = makeSymbol("*RKF-SD-REUSE-PROBLEM-STORE?*");

    // defparameter
    public static final SubLSymbol $rkf_sd_induced_superiors_cutoff$ = makeSymbol("*RKF-SD-INDUCED-SUPERIORS-CUTOFF*");

    // defparameter
    private static final SubLSymbol $rkf_sd_known_time_cutoff$ = makeSymbol("*RKF-SD-KNOWN-TIME-CUTOFF*");

    // defparameter
    private static final SubLSymbol $rkf_sd_known_max_depth_max$ = makeSymbol("*RKF-SD-KNOWN-MAX-DEPTH-MAX*");

    // defparameter
    private static final SubLSymbol $rkf_sd_known_destroy_inferencesP$ = makeSymbol("*RKF-SD-KNOWN-DESTROY-INFERENCES?*");

    // defparameter
    public static final SubLSymbol $rkf_sd_formulas_max_depth_max$ = makeSymbol("*RKF-SD-FORMULAS-MAX-DEPTH-MAX*");

    // defparameter
    private static final SubLSymbol $cache_salient_descriptor_ask_resultsP$ = makeSymbol("*CACHE-SALIENT-DESCRIPTOR-ASK-RESULTS?*");

    // deflexical
    private static final SubLSymbol $rkf_deprecated_rules$ = makeSymbol("*RKF-DEPRECATED-RULES*");

    // defparameter
    private static final SubLSymbol $rkf_sd_rule_neg_lit_max$ = makeSymbol("*RKF-SD-RULE-NEG-LIT-MAX*");

    // defparameter
    private static final SubLSymbol $rkf_sd_rule_pos_lit_max$ = makeSymbol("*RKF-SD-RULE-POS-LIT-MAX*");

    // defparameter
    private static final SubLSymbol $rkf_sd_rule_neg_lit_min$ = makeSymbol("*RKF-SD-RULE-NEG-LIT-MIN*");

    // defparameter
    private static final SubLSymbol $rkf_sd_rule_pos_lit_min$ = makeSymbol("*RKF-SD-RULE-POS-LIT-MIN*");



    // deflexical
    // Lock gating updates to *rkf-salient-descriptor-cache*
    private static final SubLSymbol $rkf_salient_descriptor_cache_lock$ = makeSymbol("*RKF-SALIENT-DESCRIPTOR-CACHE-LOCK*");



    // deflexical
    // Lock gating updates to *rkf-salient-descriptor-ignore-cache*
    private static final SubLSymbol $rkf_salient_descriptor_ignore_cache_lock$ = makeSymbol("*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE-LOCK*");

    // defparameter
    /**
     * A number of choices above which we require the user to specify rather than
     * choose.
     */
    private static final SubLSymbol $rkf_choice_count_cutoff$ = makeSymbol("*RKF-CHOICE-COUNT-CUTOFF*");

    // defparameter
    // How many examples we should generate per batch?
    public static final SubLSymbol $rkf_examples_to_show$ = makeSymbol("*RKF-EXAMPLES-TO-SHOW*");

    // defparameter
    public static final SubLSymbol $rkf_example_instances_backchain_level$ = makeSymbol("*RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL*");

    // defparameter
    /**
     * What's the maximum number of seconds we want to spend looking for examples
     * for a given salient descriptor prompt?
     */
    public static final SubLSymbol $rkf_example_instances_time_cutoff$ = makeSymbol("*RKF-EXAMPLE-INSTANCES-TIME-CUTOFF*");

    // defvar
    // BOOLEAN; Should we wff-check example instances?
    public static final SubLSymbol $rkf_example_instances_wff_checkP$ = makeSymbol("*RKF-EXAMPLE-INSTANCES-WFF-CHECK?*");

    // defparameter
    /**
     * The time cutoff used in RKF-EXAMPLE-NOT-KNOWN-FALSE?. If it's NIL or greater
     * than *RKF-SD-KNOWN-TIME-CUTOFF*, the value of *RKF-SD-KNOWN-TIME-CUTOFF* is
     * used.
     */
    public static final SubLSymbol $rkf_example_not_known_false_time_cutoff$ = makeSymbol("*RKF-EXAMPLE-NOT-KNOWN-FALSE-TIME-CUTOFF*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("REQUIREMENT"), makeKeyword("STRONG"), makeKeyword("WEAK"), makeKeyword("NEIGHBOR"));

    public static final SubLSymbol RKF_SALIENT_DESCRIPTOR_FORMULA_TYPE_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-FORMULA-TYPE-P");









    public static final SubLString $str6$_S_is_not_a_valid_salience_type = makeString("~S is not a valid salience-type");







    private static final SubLObject $$keRequirement = reader_make_constant_shell(makeString("keRequirement"));

    private static final SubLObject $$keStrongSuggestion = reader_make_constant_shell(makeString("keStrongSuggestion"));

    private static final SubLObject $$keWeakSuggestion = reader_make_constant_shell(makeString("keWeakSuggestion"));

    private static final SubLObject $$keInteractionRequirement = reader_make_constant_shell(makeString("keInteractionRequirement"));

    private static final SubLObject $$keInteractionStrongSuggestion = reader_make_constant_shell(makeString("keInteractionStrongSuggestion"));

    private static final SubLInteger $int$90 = makeInteger(90);

    public static final SubLSymbol WITH_POSSIBLY_NEW_MEMOIZATION_STATE = makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE");

    public static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");

    private static final SubLString $str18$RKF_Salient_Descriptor__Couldn_t_ = makeString("RKF Salient Descriptor: Couldn't justify~% ~S in ~S~%");

    private static final SubLInteger $int$50000 = makeInteger(50000);





    private static final SubLList $list22 = cons(makeSymbol("META-ISA"), makeSymbol("COUNT"));

    private static final SubLSymbol $sym23$_X = makeSymbol("?X");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_ = makeSymbol("RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_TYPE_SPECS = makeSymbol("RKF-SALIENT-DESCRIPTOR-TYPE-SPECS");











    private static final SubLString $str33$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str38$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$typeGenls = reader_make_constant_shell(makeString("typeGenls"));



    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str42$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str43$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str44$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLSymbol $sym46$REUSE_EXISTING_ = makeUninternedSymbol("REUSE-EXISTING?");

    private static final SubLSymbol $sym47$STORE = makeUninternedSymbol("STORE");



    private static final SubLList $list49 = list(list(makeSymbol("RKF-SD-PROBLEM-STORE-OK?"), makeSymbol("*RKF-SD-PROBLEM-STORE*")));

    public static final SubLList $list50 = list(makeSymbol("*RKF-SD-PROBLEM-STORE*"), list(makeSymbol("RKF-SD-FIND-OR-MAKE-PROBLEM-STORE")));

    public static final SubLList $list51 = list(makeSymbol("*RKF-SD-PROBLEM-STORE*"));







    private static final SubLSymbol RKF_SD_FREE_PROBLEM_STORE = makeSymbol("RKF-SD-FREE-PROBLEM-STORE");











    private static final SubLString $str61$Can_t_identify__S_common_properti = makeString("Can't identify ~S common properties yet.");

    private static final SubLInteger $int$25000 = makeInteger(25000);

    private static final SubLList $list63 = list(makeSymbol("SLOT"), makeSymbol("SUPERIOR"), makeSymbol("ISA-OR-GENLS"));



    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLList $list66 = cons(makeSymbol("SLOT"), makeSymbol("COUNT"));

    public static final SubLList $list67 = list(makeSymbol("COLLECTION-TYPE"), makeSymbol("SUPERIOR"), makeSymbol("ISA-OR-GENLS"));

    public static final SubLList $list68 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("TERM"), makeKeyword("FORT"));







    private static final SubLSymbol $kw72$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLSymbol $sym73$_COLLECTION_TYPE = makeSymbol("?COLLECTION-TYPE");

    private static final SubLSymbol $sym74$_INSTANCE = makeSymbol("?INSTANCE");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym77$_TYPE = makeSymbol("?TYPE");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list79 = list(makeSymbol("?TYPE"));





    private static final SubLList $list82 = list(makeSymbol("BIN-PRED"), makeSymbol("SUPERIOR"), makeSymbol("ISA-OR-GENLS"));

    public static final SubLList $list83 = list(makeSymbol("META-ISA"), makeSymbol("SUPERIOR"), makeSymbol("ISA-OR-GENLS"));

    public static final SubLList $list84 = list(makeKeyword("SUPERIOR"));





    private static final SubLSymbol ALL_ISA = makeSymbol("ALL-ISA");



    private static final SubLSymbol RKF_INDUCED_SALIENT_DESCRIPTOR_BINARY_PREDS = makeSymbol("RKF-INDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS");

    private static final SubLSymbol RKF_INDUCED_SALIENT_DESCRIPTOR_META_ISAS = makeSymbol("RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISAS");



    private static final SubLSymbol $sym92$RKF_SALIENT_DESCRIPTOR_GENL_ = makeSymbol("RKF-SALIENT-DESCRIPTOR-GENL?");

    private static final SubLList $list93 = list(makeSymbol("RULE-TYPE"), makeSymbol("ISA-OR-GENLS"), makeSymbol("SUPERIOR"), makeSymbol("SLOT"));

    private static final SubLSymbol $sym94$_SPEC = makeSymbol("?SPEC");

    private static final SubLSymbol RKF_MAKE_BIN_PRED_FORMULA = makeSymbol("RKF-MAKE-BIN-PRED-FORMULA");

    private static final SubLSymbol RKF_MAKE_META_ISA_FORMULA = makeSymbol("RKF-MAKE-META-ISA-FORMULA");

    private static final SubLList $list97 = list(makeSymbol("ISA-OR-GENLS"), makeSymbol("SUPER"), makeSymbol("SLOT"));



    private static final SubLList $list99 = list(makeKeyword("TRUE-DEF"));

    public static final SubLList $list100 = list(makeKeyword("BIN-PRED"), makeKeyword("META-ISA"));

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");



    private static final SubLSymbol $kw103$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");











    private static final SubLInteger $int$100000 = makeInteger(100000);





    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    private static final SubLObject $$keInducedStrongSuggestionPreds = reader_make_constant_shell(makeString("keInducedStrongSuggestionPreds"));

    private static final SubLObject $$keInducedWeakSuggestionPreds = reader_make_constant_shell(makeString("keInducedWeakSuggestionPreds"));

    private static final SubLObject $$keInducedSuggestionPreds = reader_make_constant_shell(makeString("keInducedSuggestionPreds"));

    private static final SubLObject $const118$keGenlsInducedStrongSuggestionPre = reader_make_constant_shell(makeString("keGenlsInducedStrongSuggestionPreds"));

    private static final SubLObject $$keGenlsInducedWeakSuggestionPreds = reader_make_constant_shell(makeString("keGenlsInducedWeakSuggestionPreds"));

    private static final SubLObject $$keGenlsInducedSuggestionPreds = reader_make_constant_shell(makeString("keGenlsInducedSuggestionPreds"));

    private static final SubLObject $$SpecsFn = reader_make_constant_shell(makeString("SpecsFn"));



    private static final SubLSymbol $sym123$_PRED = makeSymbol("?PRED");

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLSymbol $sym126$_GENL = makeSymbol("?GENL");

    private static final SubLList $list127 = list(makeSymbol("?GENL"));

    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLList $list129 = list(makeKeyword("EXHAUST-TOTAL"), makeKeyword("MAX-NUMBER"));

    private static final SubLString $str130$_S___halted_with_reason__S__ = makeString("~S~% halted with reason ~S~%");

    private static final SubLSymbol $sym131$_COUNT = makeSymbol("?COUNT");

    private static final SubLObject $$assertedArg1BinaryPreds_Count = reader_make_constant_shell(makeString("assertedArg1BinaryPreds-Count"));

    private static final SubLList $list133 = list(makeSymbol("?COUNT"));

    public static final SubLList $list134 = cons(makeSymbol("BINARY-PRED"), makeSymbol("COUNT"));

    private static final SubLString $str135$Type_violation___S__S__S = makeString("Type violation: ~S ~S ~S");

    private static final SubLObject $$keRelevantPreds = reader_make_constant_shell(makeString("keRelevantPreds"));

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_GET_INFERIORS = makeSymbol("RKF-SALIENT-DESCRIPTOR-GET-INFERIORS");

    private static final SubLInteger $int$200 = makeInteger(200);





    private static final SubLSymbol $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_ = makeSymbol("RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?");

    private static final SubLString $str142$violation___S_not_a_known_spec_of = makeString("violation: ~S not a known spec of ~S in ~S~%");

    private static final SubLSymbol RKF_TERM_BINARY_PREDS = makeSymbol("RKF-TERM-BINARY-PREDS");

    private static final SubLInteger $int$10000 = makeInteger(10000);



    private static final SubLSymbol RKF_TERM_ALL_META_ISAS = makeSymbol("RKF-TERM-ALL-META-ISAS");

    private static final SubLList $list147 = cons(makeSymbol("VAR"), makeSymbol("TERM"));

    private static final SubLSymbol $sym148$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $sym149$RKF_SD_EL_WFF_ = makeSymbol("RKF-SD-EL-WFF?");

    private static final SubLSymbol $sym150$ALIST__ = makeSymbol("ALIST-=");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLList $list152 = list(reader_make_constant_shell(makeString("CycLNonAtomicTerm")));

    public static final SubLList $list153 = cons(makeSymbol("EL-VAR"), makeSymbol("TERM"));

    public static final SubLList $list154 = list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), makeKeyword("FORT"));

    public static final SubLList $list155 = list(reader_make_constant_shell(makeString("genls")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), makeKeyword("FORT"));

    public static final SubLList $list156 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("FORT"), makeKeyword("FORT"));

    private static final SubLSymbol $kw157$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol $kw158$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $kw159$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");





    private static final SubLSymbol RKF_SD_KNOWN = makeSymbol("RKF-SD-KNOWN");

    private static final SubLString $str163$_S_is_not_continuable____Exit_con = makeString("~S is not continuable.~% Exit condition: ~S~%");



    private static final SubLString $str165$RKF_SD_KNOWN_timed_out_on__S = makeString("RKF-SD-KNOWN timed out on ~S");

    private static final SubLList $list166 = list(makeSymbol("VAR"), makeSymbol("BODY"));

    private static final SubLSymbol RKF_SD_GET_CONJUNCT_BINDINGS = makeSymbol("RKF-SD-GET-CONJUNCT-BINDINGS");

    private static final SubLList $list168 = cons(makeSymbol("HL-VAR"), makeSymbol("EL-VAR"));

    private static final SubLSymbol $sym169$HL_VAR_ = makeSymbol("HL-VAR?");













    private static final SubLSymbol RKF_SD_CHECK_LIT = makeSymbol("RKF-SD-CHECK-LIT");







    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $sym181$_FORMULA = makeSymbol("?FORMULA");

    private static final SubLString $str182$Timed_out_after__S_seconds_gettin = makeString("Timed out after ~S seconds getting ~S for ~S.~%");

    private static final SubLString $str183$P_A_D__getting__S_for__S___ = makeString("P.A.D. getting ~S for ~S.~%");

    private static final SubLList $list184 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));







    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$deprecatedSalientDescriptorRule = reader_make_constant_shell(makeString("deprecatedSalientDescriptorRule"));

    private static final SubLObject $const190$deprecatedSalientDescriptorRuleAs = reader_make_constant_shell(makeString("deprecatedSalientDescriptorRuleAssertion"));

    private static final SubLSymbol DEPRECATE_SALIENT_DESCRIPTOR_RULE = makeSymbol("DEPRECATE-SALIENT-DESCRIPTOR-RULE");

    private static final SubLSymbol UNDEPRECATE_SALIENT_DESCRIPTOR_RULE = makeSymbol("UNDEPRECATE-SALIENT-DESCRIPTOR-RULE");

    private static final SubLObject $$ArgConstraintPredicate = reader_make_constant_shell(makeString("ArgConstraintPredicate"));

    private static final SubLList $list194 = list(makeKeyword("TEST"), makeSymbol("HL-VAR?"));



    private static final SubLObject $$TransitiveBinaryPredicate = reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));

    private static final SubLObject $$transitiveViaArg = reader_make_constant_shell(makeString("transitiveViaArg"));

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    private static final SubLList $list200 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLList $list201 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    private static final SubLSymbol $rkf_salient_descriptor_cache$ = makeSymbol("*RKF-SALIENT-DESCRIPTOR-CACHE*");

    private static final SubLString $$$RKF_Salient_Descriptor_Cache_Lock = makeString("RKF Salient Descriptor Cache Lock");

    private static final SubLSymbol $rkf_salient_descriptor_ignore_cache$ = makeSymbol("*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE*");

    private static final SubLObject $$singleEntryFormatInArgs = reader_make_constant_shell(makeString("singleEntryFormatInArgs"));

    public static final SubLList $list206 = list(makeSymbol("ARGNUM"), makeSymbol("FORMAT"));

    private static final SubLList $list207 = list(reader_make_constant_shell(makeString("SingleEntry")), reader_make_constant_shell(makeString("singleEntryFormatInArgs")));

    private static final SubLObject $$argFormat = reader_make_constant_shell(makeString("argFormat"));

    private static final SubLList $list209 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLSymbol EXPRESSION_FIND = makeSymbol("EXPRESSION-FIND");

    private static final SubLSymbol RKF_SALIENT_DESCRIPTOR_SUBPROMPT_P = makeSymbol("RKF-SALIENT-DESCRIPTOR-SUBPROMPT-P");

    public static final SubLList $list212 = list(makeKeyword("CONFIRM"), makeKeyword("CHOICE"), makeKeyword("SPECIFY"), makeKeyword("STRENGTHEN"));



    public static final SubLList $list214 = list(makeKeyword("ANYTHING"));





    public static final SubLList $list217 = list(reader_make_constant_shell(makeString("SkolemTerm")));

    private static final SubLList $list218 = list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("FORT"), makeKeyword("FORT")));

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));



    private static final SubLSymbol RKF_SD_EXAMPLES = makeSymbol("RKF-SD-EXAMPLES");







    private static final SubLList $list226 = list(list(makeKeyword("TEST"), makeSymbol("EL-VAR?")));

    private static final SubLList $list227 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), makeKeyword("FORT"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLObject $$knownSentence = reader_make_constant_shell(makeString("knownSentence"));

    private static final SubLSymbol RKF_SD_ADD_KNOWN_SENTENCE = makeSymbol("RKF-SD-ADD-KNOWN-SENTENCE");



    private static final SubLSymbol $sym232$RKF_SD_COMPLETE_COLL_BINDINGS_OK_ = makeSymbol("RKF-SD-COMPLETE-COLL-BINDINGS-OK?");

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLSymbol $sym235$RKF_SD_SMALL_SET_BINDINGS_OK_ = makeSymbol("RKF-SD-SMALL-SET-BINDINGS-OK?");

    private static final SubLObject $$notAssertible = reader_make_constant_shell(makeString("notAssertible"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$termDependsOn = reader_make_constant_shell(makeString("termDependsOn"));

    private static final SubLObject $$uiaDisplayTerm = reader_make_constant_shell(makeString("uiaDisplayTerm"));





    private static final SubLSymbol RKF_SD_EXAMPLE_TERM = makeSymbol("RKF-SD-EXAMPLE-TERM");

    private static final SubLSymbol $sym243$RKF_EXAMPLE_WFF__INT = makeSymbol("RKF-EXAMPLE-WFF?-INT");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str246$__RKF_EXAMPLE_INSTANCES_ASK_timed = makeString("~&RKF-EXAMPLE-INSTANCES-ASK timed out after ~S seconds on ~S in ~S");

    private static final SubLSymbol $sym247$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    private static final SubLSymbol $sym248$RKF_BETTER_EXAMPLE_ = makeSymbol("RKF-BETTER-EXAMPLE?");



    public static SubLObject rkf_salient_descriptor_formula_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rkf_salient_formula_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_salient_formulas(final SubLObject type, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != rkf_salient_descriptor_formula_type_p(type) : "rkf_salient_descriptor.rkf_salient_descriptor_formula_type_p(type) " + "CommonSymbols.NIL != rkf_salient_descriptor.rkf_salient_descriptor_formula_type_p(type) " + type;
        if (type.eql($REQUIREMENT)) {
            return rkf_salient_requirements(fort, mt);
        }
        if (type.eql($STRONG)) {
            return rkf_salient_strong_suggestions(fort, mt);
        }
        if (type.eql($WEAK)) {
            return rkf_salient_weak_suggestions(fort, mt);
        }
        if (type.eql($NEIGHBOR)) {
            return rkf_salient_neighbor_suggestions(fort, mt);
        }
        Errors.error($str6$_S_is_not_a_valid_salience_type, type);
        return values(NIL, NIL);
    }

    public static SubLObject rkf_salient_requirements(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return rkf_requirements(fort, mt);
    }

    public static SubLObject rkf_salient_strong_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return rkf_strong_suggestions(fort, mt);
    }

    public static SubLObject rkf_salient_weak_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return rkf_weak_suggestions(fort, mt);
    }

    public static SubLObject rkf_salient_neighbor_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return rkf_induced_salient_descriptor_query_sentences(fort, mt);
    }

    public static SubLObject rkf_salient_descriptor(final SubLObject fort, SubLObject mt, SubLObject ignored) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (ignored == UNPROVIDED) {
            ignored = NIL;
        }
        assert NIL != listp(ignored) : "Types.listp(ignored) " + "CommonSymbols.NIL != Types.listp(ignored) " + ignored;
        if (NIL == forts.fort_p(fort)) {
            return NIL;
        }
        final SubLObject cache_key = list(fort, mt);
        if (NIL == rkf_sd_present(cache_key)) {
            rkf_sd_update(cache_key, NIL);
        }
        SubLObject pending_formulas = rkf_sd_lookup(cache_key);
        if (NIL != pending_formulas) {
            final SubLObject next_formula = pending_formulas.first();
            pending_formulas = pending_formulas.rest();
            rkf_sd_update(cache_key, pending_formulas);
            return next_formula;
        }
        SubLObject new_formulas = rkf_strong_suggestions(fort, mt);
        new_formulas = set_difference(new_formulas, ignored, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != new_formulas) {
            new_formulas = rkf_sort_salient_formulas(new_formulas);
            rkf_sd_update(cache_key, new_formulas);
            return rkf_salient_descriptor(fort, mt, ignored);
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_parallel(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (NIL == forts.fort_p(fort)) {
            return NIL;
        }
        final SubLObject cache_key = list(fort, mt);
        if (NIL == rkf_sd_present(cache_key)) {
            rkf_sd_update(cache_key, NIL);
        }
        if (NIL == rkf_sd_ignore_present(cache_key)) {
            rkf_sd_ignore_update(cache_key, NIL);
        }
        SubLObject pending_formulas = rkf_sd_lookup(cache_key);
        final SubLObject ignore_formulas = rkf_sd_ignore_lookup(cache_key);
        pending_formulas = set_difference(pending_formulas, ignore_formulas, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != pending_formulas) {
            rkf_sd_update(cache_key, NIL);
            rkf_sd_ignore_update(cache_key, union(pending_formulas, ignore_formulas, symbol_function(EQUAL), UNPROVIDED));
            return copy_tree(pending_formulas);
        }
        SubLObject new_formulas = rkf_strong_suggestions(fort, mt);
        new_formulas = set_difference(new_formulas, ignore_formulas, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != new_formulas) {
            rkf_sd_ignore_update(cache_key, union(new_formulas, pending_formulas, symbol_function(EQUAL), UNPROVIDED));
            return new_formulas;
        }
        return NIL;
    }

    public static SubLObject rkf_requirements(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, $$keRequirement, mt);
    }

    public static SubLObject rkf_strong_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, $$keStrongSuggestion, mt);
    }

    public static SubLObject rkf_neighbor_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_salient_neighbor_suggestions(fort, mt);
    }

    public static SubLObject rkf_weak_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, $$keWeakSuggestion, mt);
    }

    public static SubLObject rkf_interaction_requirements(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, $$keInteractionRequirement, mt);
    }

    public static SubLObject rkf_interaction_strong_suggestions(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_formulas(fort, $$keInteractionStrongSuggestion, mt);
    }

    public static SubLObject with_rkf_sd_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_POSSIBLY_NEW_MEMOIZATION_STATE, listS(WITH_SBHL_RESOURCED_MARKING_SPACES, SIX_INTEGER, append(body, NIL)));
    }

    public static SubLObject rkf_induced_salient_descriptor_query_sentences(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentences = NIL;
        SubLObject justifications = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject induction_basis_properties = rkf_sd_induction_basis_properties(v_term, mt);
                    final SubLObject maximally_generalP = NIL;
                    final SubLObject _prev_bind_0_$2 = $rkf_salient_descriptor_number_cutoff$.currentBinding(thread);
                    try {
                        $rkf_salient_descriptor_number_cutoff$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject common_properties = rkf_induced_salient_descriptor_common_properties(induction_basis_properties, mt, maximally_generalP, UNPROVIDED);
                        final SubLObject basis_properties = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        justifications = rkf_sd_justifications_from_basis_properties(v_term, basis_properties, mt);
                        SubLObject cdolist_list_var = common_properties;
                        SubLObject common_property = NIL;
                        common_property = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject query_sentence = properties.property_to_sentence(common_property, v_term);
                            if ((NIL == $rkf_sd_exclude_known_promptsP$.getDynamicValue(thread)) || (NIL == rkf_sd_known(query_sentence, mt, UNPROVIDED))) {
                                query_sentences = cons(query_sentence, query_sentences);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            common_property = cdolist_list_var.first();
                        } 
                        query_sentences = nreverse(query_sentences);
                    } finally {
                        $rkf_salient_descriptor_number_cutoff$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(query_sentences, justifications);
    }

    public static SubLObject rkf_sd_justifications_from_basis_properties(final SubLObject v_term, final SubLObject basis_properties, final SubLObject mt) {
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = basis_properties;
        SubLObject basis_property = NIL;
        basis_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject fact = properties.property_to_sentence(basis_property, v_term);
            final SubLObject justification = rkf_query_utilities.rkf_justify(fact, mt).first();
            if (NIL == arguments.supports_p(justification)) {
                Errors.warn($str18$RKF_Salient_Descriptor__Couldn_t_, fact, mt);
            }
            justifications = cons(justification, justifications);
            cdolist_list_var = cdolist_list_var.rest();
            basis_property = cdolist_list_var.first();
        } 
        return nreverse(justifications);
    }

    public static SubLObject rkf_close_isas(final SubLObject v_term, final SubLObject mt) {
        final SubLObject generality_cutoff = $int$50000;
        final SubLObject all_isas = isa.isa(v_term, mt, UNPROVIDED);
        SubLObject close_isas = NIL;
        SubLObject cdolist_list_var = all_isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!cardinality_estimates.generality_estimate(v_isa).numG(generality_cutoff)) {
                close_isas = cons(v_isa, close_isas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return close_isas;
    }

    public static SubLObject rkf_close_genls(final SubLObject v_term, final SubLObject mt) {
        final SubLObject generality_cutoff = $int$50000;
        final SubLObject all_genls = genls.genls(v_term, mt, UNPROVIDED);
        SubLObject close_genls = NIL;
        SubLObject cdolist_list_var = all_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!cardinality_estimates.generality_estimate(genl).numG(generality_cutoff)) {
                close_genls = cons(genl, close_genls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return close_genls;
    }

    public static SubLObject rkf_induced_salient_descriptor_meta_isas(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject known_meta_isas, SubLObject lax_factor) {
        if (known_meta_isas == UNPROVIDED) {
            known_meta_isas = NIL;
        }
        if (lax_factor == UNPROVIDED) {
            lax_factor = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(lax_factor) : "subl_promotions.positive_integer_p(lax_factor) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(lax_factor) " + lax_factor;
        final SubLObject siblings = rkf_salient_descriptor_get_inferiors(mt, superior, type, UNPROVIDED);
        final SubLObject sibling_count = length(siblings);
        final SubLObject min_occurence = number_utilities.maximum(list(integerDivide(sibling_count, lax_factor), FIVE_INTEGER), UNPROVIDED);
        SubLObject alist = NIL;
        if ($ISA == type) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                known_meta_isas = append(known_meta_isas, isa.all_isa(superior, UNPROVIDED, UNPROVIDED));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (sibling_count.numGE(min_occurence)) {
            SubLObject cdolist_list_var = siblings;
            SubLObject sibling = NIL;
            sibling = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$4 = rkf_term_meta_isas(sibling, mt);
                SubLObject meta_isa = NIL;
                meta_isa = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if ((NIL == subl_promotions.memberP(meta_isa, known_meta_isas, UNPROVIDED, UNPROVIDED)) && (NIL == rkf_relevance_utilities.rkf_irrelevant_term(meta_isa, mt))) {
                        final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                            final SubLObject current_count = list_utilities.alist_lookup(alist, meta_isa, symbol_function(EQUAL), ZERO_INTEGER);
                            alist = list_utilities.alist_enter(alist, meta_isa, number_utilities.f_1X(current_count), symbol_function(EQUAL));
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                        }
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    meta_isa = cdolist_list_var_$4.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                sibling = cdolist_list_var.first();
            } 
        }
        SubLObject filtered = NIL;
        SubLObject cdolist_list_var2 = alist;
        SubLObject item = NIL;
        item = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject meta_isa2 = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list22);
            meta_isa2 = current.first();
            current = count = current.rest();
            if ((!count.numL(min_occurence)) && (NIL == rkf_salient_descriptor_meta_isa_type_violationP(superior, meta_isa2, mt))) {
                filtered = cons(item, filtered);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            item = cdolist_list_var2.first();
        } 
        return filtered;
    }

    public static SubLObject rkf_make_meta_isa_formula(final SubLObject v_term, final SubLObject meta_isa) {
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(v_term, $sym23$_X);
        return make_existential(new_var, make_conjunction(list(make_binary_formula($$isa, new_var, meta_isa), make_binary_formula($$isa, v_term, new_var))));
    }

    public static SubLObject rkf_make_bin_pred_formula(final SubLObject v_term, final SubLObject bin_pred) {
        return make_existential($sym23$_X, make_binary_formula(bin_pred, v_term, $sym23$_X));
    }

    public static SubLObject rkf_make_salient_descriptor_rule(final SubLObject term_var, final SubLObject superior, final SubLObject consequent, final SubLObject type) {
        final SubLObject superior_pred = (type == $ISA) ? $$isa : $$genls;
        return make_implication(make_binary_formula(superior_pred, term_var, superior), make_binary_formula($$keStrongSuggestion, term_var, consequent));
    }

    public static SubLObject rkf_salient_descriptor_meta_isa_type_violationP_internal(final SubLObject v_term, final SubLObject meta_isa, final SubLObject mt) {
        final SubLObject type_specs = rkf_salient_descriptor_type_specs(meta_isa, mt);
        SubLObject malP = NIL;
        if (NIL == malP) {
            SubLObject csome_list_var = type_specs;
            SubLObject type_spec = NIL;
            type_spec = csome_list_var.first();
            while ((NIL == malP) && (NIL != csome_list_var)) {
                if (NIL == rkf_salient_descriptor_genlP(v_term, type_spec, mt)) {
                    malP = T;
                }
                csome_list_var = csome_list_var.rest();
                type_spec = csome_list_var.first();
            } 
        }
        return malP;
    }

    public static SubLObject rkf_salient_descriptor_meta_isa_type_violationP(final SubLObject v_term, final SubLObject meta_isa, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_salient_descriptor_meta_isa_type_violationP_internal(v_term, meta_isa, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, meta_isa, mt);
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
                    if (meta_isa.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_salient_descriptor_meta_isa_type_violationP_internal(v_term, meta_isa, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, meta_isa, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_salient_descriptor_type_specs_internal(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type_specs = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    while (NIL != node_var) {
                                        final SubLObject super_coll = node_var;
                                        final SubLObject node_var_$14 = $$typeGenls;
                                        final SubLObject deck_type_$15 = $QUEUE;
                                        final SubLObject recur_deck_$16 = deck.create_deck(deck_type_$15);
                                        SubLObject node_and_predicate_mode = NIL;
                                        final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject tv_var_$18 = NIL;
                                                final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var_$18 ? tv_var_$18 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var_$18 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (((NIL != tv_var_$18) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var_$18))) {
                                                        final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var2.eql($ERROR)) {
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str33$_A_is_not_a__A, tv_var_$18, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var2.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str33$_A_is_not_a__A, tv_var_$18, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (pcase_var2.eql($WARN)) {
                                                                    Errors.warn($str33$_A_is_not_a__A, tv_var_$18, SBHL_TRUE_TV_P);
                                                                } else {
                                                                    Errors.warn($str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str33$_A_is_not_a__A, tv_var_$18, SBHL_TRUE_TV_P);
                                                                }


                                                    }
                                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$25 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$typeGenls, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$14, UNPROVIDED);
                                                                for (node_and_predicate_mode = list($$typeGenls, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck_$16)) {
                                                                    final SubLObject node_var_$15 = node_and_predicate_mode.first();
                                                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                    final SubLObject spec_pred = node_var_$15;
                                                                    final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$15)) {
                                                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(super_coll, spec_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            SubLObject type_spec = NIL;
                                                                            type_spec = cdolist_list_var.first();
                                                                            while (NIL != cdolist_list_var) {
                                                                                final SubLObject item_var = type_spec;
                                                                                if (NIL == member(item_var, type_specs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                    type_specs = cons(item_var, type_specs);
                                                                                }
                                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                                type_spec = cdolist_list_var.first();
                                                                            } 
                                                                        }
                                                                        SubLObject cdolist_list_var2;
                                                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                        SubLObject module_var = NIL;
                                                                        module_var = cdolist_list_var2.first();
                                                                        while (NIL != cdolist_list_var2) {
                                                                            final SubLObject _prev_bind_0_$14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$15);
                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                    if (NIL != d_link) {
                                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        if (NIL != mt_links) {
                                                                                            SubLObject iteration_state;
                                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt_$33 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$33)) {
                                                                                                    final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$33, thread);
                                                                                                        SubLObject iteration_state_$35;
                                                                                                        for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
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
                                                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
                                                                                                                                }
                                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                                            } 
                                                                                                                        } else {
                                                                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                        }

                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$16, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$15, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                        }
                                                                                    } else {
                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    }
                                                                                } else
                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                        SubLObject cdolist_list_var_$37;
                                                                                        final SubLObject new_list = cdolist_list_var_$37 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        SubLObject generating_fn = NIL;
                                                                                        generating_fn = cdolist_list_var_$37.first();
                                                                                        while (NIL != cdolist_list_var_$37) {
                                                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
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
                                                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$16);
                                                                                                            }
                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$17, thread);
                                                                                            }
                                                                                            cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                                                                            generating_fn = cdolist_list_var_$37.first();
                                                                                        } 
                                                                                    }

                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            module_var = cdolist_list_var2.first();
                                                                        } 
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$13, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$12, thread);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, $$typeGenls, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$25, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$24, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$12, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$10, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$9, thread);
                                        }
                                        final SubLObject node_var_$16 = $$typeGenls;
                                        final SubLObject deck_type_$16 = $QUEUE;
                                        final SubLObject recur_deck_$17 = deck.create_deck(deck_type_$16);
                                        node_and_predicate_mode = NIL;
                                        final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject tv_var_$19 = NIL;
                                                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var_$19 ? tv_var_$19 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var_$19 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (((NIL != tv_var_$19) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var_$19))) {
                                                        final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                        if (pcase_var2.eql($ERROR)) {
                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str33$_A_is_not_a__A, tv_var_$19, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var2.eql($CERROR)) {
                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str33$_A_is_not_a__A, tv_var_$19, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (pcase_var2.eql($WARN)) {
                                                                    Errors.warn($str33$_A_is_not_a__A, tv_var_$19, SBHL_TRUE_TV_P);
                                                                } else {
                                                                    Errors.warn($str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                    Errors.cerror($$$continue_anyway, $str33$_A_is_not_a__A, tv_var_$19, SBHL_TRUE_TV_P);
                                                                }


                                                    }
                                                    final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlInverse), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$typeGenls, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$16 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlInverse)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$16, UNPROVIDED);
                                                                for (node_and_predicate_mode = list($$typeGenls, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck_$17)) {
                                                                    final SubLObject node_var_$17 = node_and_predicate_mode.first();
                                                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                    final SubLObject spec_pred = node_var_$17;
                                                                    final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$17)) {
                                                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(super_coll, spec_pred, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                                                            SubLObject type_spec = NIL;
                                                                            type_spec = cdolist_list_var.first();
                                                                            while (NIL != cdolist_list_var) {
                                                                                final SubLObject item_var = type_spec;
                                                                                if (NIL == member(item_var, type_specs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                                    type_specs = cons(item_var, type_specs);
                                                                                }
                                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                                type_spec = cdolist_list_var.first();
                                                                            } 
                                                                        }
                                                                        SubLObject cdolist_list_var2;
                                                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                        SubLObject module_var = NIL;
                                                                        module_var = cdolist_list_var2.first();
                                                                        while (NIL != cdolist_list_var2) {
                                                                            final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                            final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$17);
                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                    if (NIL != d_link) {
                                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                        if (NIL != mt_links) {
                                                                                            SubLObject iteration_state;
                                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject mt_$34 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$34)) {
                                                                                                    final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$34, thread);
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
                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
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
                                                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
                                                                                                                                }
                                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                                            } 
                                                                                                                        } else {
                                                                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
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
                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
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
                                                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck_$17);
                                                                                                            }
                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$27, thread);
                                                                                            }
                                                                                            cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                                            generating_fn = cdolist_list_var_$38.first();
                                                                                        } 
                                                                                    }

                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$17, thread);
                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                                            }
                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                            module_var = cdolist_list_var2.first();
                                                                        } 
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$23, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$15, thread);
                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$16, thread);
                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$22, thread);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, $$typeGenls, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$26, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$25, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$14, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$15, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$14, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$20, thread);
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
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        SubLObject cdolist_list_var3;
                                        final SubLObject accessible_modules2 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                        SubLObject module_var2 = NIL;
                                        module_var2 = cdolist_list_var3.first();
                                        while (NIL != cdolist_list_var3) {
                                            final SubLObject _prev_bind_0_$29 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node2 = function_terms.naut_to_nart(node_var);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link2) {
                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links2) {
                                                            SubLObject iteration_state2;
                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$35 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                    final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                        SubLObject iteration_state_$37;
                                                                        for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                            final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol3 = link_nodes3;
                                                                                    if (NIL != set.set_p(sol3)) {
                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                        SubLObject basis_object3;
                                                                                        SubLObject state3;
                                                                                        SubLObject node_vars_link_node5;
                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                            node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol3.isList()) {
                                                                                            SubLObject csome_list_var3 = sol3;
                                                                                            SubLObject node_vars_link_node6 = NIL;
                                                                                            node_vars_link_node6 = csome_list_var3.first();
                                                                                            while (NIL != csome_list_var3) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                                }
                                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$31, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$30, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$39;
                                                        final SubLObject new_list2 = cdolist_list_var_$39 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn2 = NIL;
                                                        generating_fn2 = cdolist_list_var_$39.first();
                                                        while (NIL != cdolist_list_var_$39) {
                                                            final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                if (NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node7;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node7, recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol4.isList()) {
                                                                        SubLObject csome_list_var4 = sol4;
                                                                        SubLObject node_vars_link_node8 = NIL;
                                                                        node_vars_link_node8 = csome_list_var4.first();
                                                                        while (NIL != csome_list_var4) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node8, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node8, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node8, recur_deck);
                                                                            }
                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                            node_vars_link_node8 = csome_list_var4.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$32, thread);
                                                            }
                                                            cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                                            generating_fn2 = cdolist_list_var_$39.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$18, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$29, thread);
                                            }
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            module_var2 = cdolist_list_var3.first();
                                        } 
                                        node_var = deck.deck_pop(recur_deck);
                                    } 
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$8, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$7, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$6, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return type_specs;
    }

    public static SubLObject rkf_salient_descriptor_type_specs(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_salient_descriptor_type_specs_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SALIENT_DESCRIPTOR_TYPE_SPECS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_salient_descriptor_type_specs_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject reusing_rkf_sd_problem_store(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reuse_existingP = $sym46$REUSE_EXISTING_;
        final SubLObject store = $sym47$STORE;
        return list(CLET, list(bq_cons(reuse_existingP, $list49), $list50, bq_cons(store, $list51)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(PUNLESS, reuse_existingP, list(RKF_SD_FREE_PROBLEM_STORE, store))));
    }

    public static SubLObject rkf_sd_problem_store_okP(final SubLObject problem_store) {
        return makeBoolean((NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) && (NIL != rkf_sd_problem_store_checkpoint_currentP(problem_store)));
    }

    public static SubLObject rkf_sd_problem_store_checkpoint_currentP(final SubLObject problem_store) {
        final SubLObject checkpoint = rkf_sd_problem_store_checkpoint(problem_store);
        final SubLObject currentP = makeBoolean((NIL != kb_utilities.theory_checkpoint_p(checkpoint)) && (NIL != kb_utilities.theory_checkpoint_currentP(checkpoint)));
        return currentP;
    }

    public static SubLObject rkf_sd_problem_store_checkpoint(final SubLObject store) {
        return dictionary.dictionary_lookup($rkf_sd_problem_store_checkpoints$.getGlobalValue(), store, $NOT_FOUND);
    }

    public static SubLObject rkf_sd_find_or_make_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $rkf_sd_reuse_problem_storeP$.getDynamicValue(thread) ? NIL != rkf_sd_problem_store_okP($rkf_sd_problem_store$.getDynamicValue(thread)) ? $rkf_sd_problem_store$.getDynamicValue(thread) : rkf_sd_make_problem_store() : NIL;
    }

    public static SubLObject rkf_sd_make_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_problem_store.problem_store_p($rkf_sd_problem_store$.getDynamicValue(thread))) {
            inference_datastructures_problem_store.destroy_problem_store($rkf_sd_problem_store$.getDynamicValue(thread));
        }
        final SubLObject problem_store = inference_datastructures_problem_store.new_problem_store(rkf_sd_known_problem_store_properties());
        dictionary.dictionary_enter($rkf_sd_problem_store_checkpoints$.getGlobalValue(), problem_store, kb_utilities.new_theory_checkpoint());
        return problem_store;
    }

    public static SubLObject rkf_sd_free_problem_store(final SubLObject store) {
        dictionary.dictionary_remove($rkf_sd_problem_store_checkpoints$.getGlobalValue(), store);
        inference_datastructures_problem_store.destroy_problem_store(store);
        return store;
    }

    public static SubLObject rkf_induced_salient_descriptor_common_properties(final SubLObject induction_basis_properties, final SubLObject mt, SubLObject maximally_generalP, SubLObject rule_type) {
        if (maximally_generalP == UNPROVIDED) {
            maximally_generalP = NIL;
        }
        if (rule_type == UNPROVIDED) {
            rule_type = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject common_properties = NIL;
        SubLObject basis_properties = NIL;
        SubLObject rule_specs = NIL;
        final SubLObject pcase_var = rule_type;
        if (pcase_var.eql($BIN_PRED)) {
            thread.resetMultipleValues();
            final SubLObject common_properties_$75 = rkf_induced_salient_descriptor_bin_pred_properties(induction_basis_properties, mt, maximally_generalP, $ALL);
            final SubLObject basis_properties_$76 = thread.secondMultipleValue();
            final SubLObject rule_specs_$77 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            common_properties = common_properties_$75;
            basis_properties = basis_properties_$76;
            rule_specs = rule_specs_$77;
        } else
            if (pcase_var.eql($META_ISA)) {
                thread.resetMultipleValues();
                final SubLObject common_properties_$76 = rkf_induced_salient_descriptor_meta_isa_properties(induction_basis_properties, mt, maximally_generalP);
                final SubLObject basis_properties_$77 = thread.secondMultipleValue();
                final SubLObject rule_specs_$78 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                common_properties = common_properties_$76;
                basis_properties = basis_properties_$77;
                rule_specs = rule_specs_$78;
            } else
                if (pcase_var.eql($ANY)) {
                    thread.resetMultipleValues();
                    final SubLObject common_properties_$77 = rkf_induced_salient_descriptor_common_properties_int(induction_basis_properties, mt, maximally_generalP);
                    final SubLObject basis_properties_$78 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    common_properties = common_properties_$77;
                    basis_properties = basis_properties_$78;
                } else {
                    Errors.warn($str61$Can_t_identify__S_common_properti);
                }


        return values(common_properties, basis_properties, rule_specs);
    }

    public static SubLObject rkf_induced_salient_descriptor_common_properties_int(final SubLObject known_properties, final SubLObject mt, final SubLObject maximally_generalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_properties = NIL;
        SubLObject basis_properties = NIL;
        thread.resetMultipleValues();
        final SubLObject bin_pred_properties = rkf_induced_salient_descriptor_bin_pred_properties(known_properties, mt, maximally_generalP, $ALL);
        final SubLObject bin_pred_basis_properties = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_properties = append(v_properties, bin_pred_properties);
        basis_properties = append(basis_properties, bin_pred_basis_properties);
        thread.resetMultipleValues();
        final SubLObject meta_isa_properties = rkf_induced_salient_descriptor_meta_isa_properties(known_properties, mt, maximally_generalP);
        final SubLObject meta_isa_basis_properties = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_properties = append(v_properties, meta_isa_properties);
        basis_properties = append(basis_properties, meta_isa_basis_properties);
        return values(v_properties, basis_properties);
    }

    public static SubLObject rkf_induced_salient_descriptor_bin_pred_properties(final SubLObject basis_properties, final SubLObject mt, final SubLObject maximally_generalP, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enoughP = NIL;
        SubLObject bin_pred_info = NIL;
        final SubLObject generality_cutoff = $int$25000;
        final SubLObject reuse_existingP = rkf_sd_problem_store_okP($rkf_sd_problem_store$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding(thread);
        try {
            $rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
            final SubLObject store = $rkf_sd_problem_store$.getDynamicValue(thread);
            try {
                if (NIL == enoughP) {
                    SubLObject csome_list_var = basis_properties;
                    SubLObject basis_property = NIL;
                    basis_property = csome_list_var.first();
                    while ((NIL == enoughP) && (NIL != csome_list_var)) {
                        SubLObject cdolist_list_var = rkf_induced_salient_descriptor_bin_pred_info(basis_property, mt, generality_cutoff, strength);
                        SubLObject new_info = NIL;
                        new_info = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = new_info;
                            SubLObject slot = NIL;
                            SubLObject superior = NIL;
                            SubLObject isa_or_genls = NIL;
                            destructuring_bind_must_consp(current, datum, $list63);
                            slot = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list63);
                            superior = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list63);
                            isa_or_genls = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == subl_promotions.memberP(slot, bin_pred_info, symbol_function(EQUAL), symbol_function(FIRST))) {
                                    bin_pred_info = cons(list(slot, superior, isa_or_genls), bin_pred_info);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list63);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            new_info = cdolist_list_var.first();
                        } 
                        enoughP = makeBoolean($rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() && (NIL != list_utilities.lengthGE(bin_pred_info, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), UNPROVIDED)));
                        csome_list_var = csome_list_var.rest();
                        basis_property = csome_list_var.first();
                    } 
                }
            } finally {
                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL == reuse_existingP) {
                        rkf_sd_free_problem_store(store);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                }
            }
        } finally {
            $rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject v_properties = rkf_sd_properties_from_bin_pred_info($rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() ? list_utilities.first_n($rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), bin_pred_info) : bin_pred_info);
        final SubLObject justifications = thread.secondMultipleValue();
        final SubLObject rule_specs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(v_properties, justifications, rule_specs);
    }

    public static SubLObject rkf_induced_salient_descriptor_bin_pred_info(final SubLObject basis_property, final SubLObject mt, final SubLObject generality_cutoff, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bin_pred_info = NIL;
        thread.resetMultipleValues();
        final SubLObject superior = rkf_sd_deconstruct_basis_property(basis_property);
        final SubLObject isa_or_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != forts.fort_p(superior)) && cardinality_estimates.generality_estimate(superior).numL(generality_cutoff)) {
            SubLObject cdolist_list_var;
            final SubLObject slot_counts = cdolist_list_var = rkf_induced_salient_descriptor_binary_preds(mt, superior, isa_or_genls, $int$25, strength, UNPROVIDED);
            SubLObject slot_count = NIL;
            slot_count = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = slot_count;
                SubLObject slot = NIL;
                SubLObject count = NIL;
                destructuring_bind_must_consp(current, datum, $list66);
                slot = current.first();
                current = count = current.rest();
                if (NIL == subl_promotions.memberP(slot, bin_pred_info, symbol_function(EQUAL), symbol_function(FIRST))) {
                    bin_pred_info = cons(list(slot, superior, isa_or_genls), bin_pred_info);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot_count = cdolist_list_var.first();
            } 
        }
        return bin_pred_info;
    }

    public static SubLObject rkf_induced_salient_descriptor_meta_isa_properties(final SubLObject basis_properties, final SubLObject mt, final SubLObject maximally_generalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enoughP = NIL;
        SubLObject meta_isa_info = NIL;
        final SubLObject generality_cutoff = $int$25000;
        final SubLObject reuse_existingP = rkf_sd_problem_store_okP($rkf_sd_problem_store$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding(thread);
        try {
            $rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
            final SubLObject store = $rkf_sd_problem_store$.getDynamicValue(thread);
            try {
                final SubLObject known_meta_isas = rkf_known_meta_isas_from_basis_properties(basis_properties, mt);
                if (NIL == enoughP) {
                    SubLObject csome_list_var = basis_properties;
                    SubLObject basis_property = NIL;
                    basis_property = csome_list_var.first();
                    while ((NIL == enoughP) && (NIL != csome_list_var)) {
                        SubLObject cdolist_list_var = rkf_induced_salient_descriptor_meta_isa_info(basis_property, mt, generality_cutoff);
                        SubLObject new_info = NIL;
                        new_info = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = new_info;
                            SubLObject collection_type = NIL;
                            SubLObject superior = NIL;
                            SubLObject isa_or_genls = NIL;
                            destructuring_bind_must_consp(current, datum, $list67);
                            collection_type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list67);
                            superior = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list67);
                            isa_or_genls = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ((NIL == subl_promotions.memberP(collection_type, meta_isa_info, symbol_function(EQUAL), symbol_function(FIRST))) && (NIL == member(collection_type, known_meta_isas, symbol_function(EQUAL), UNPROVIDED))) {
                                    meta_isa_info = cons(list(collection_type, superior, isa_or_genls), meta_isa_info);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list67);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            new_info = cdolist_list_var.first();
                        } 
                        enoughP = makeBoolean($rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() && (NIL != list_utilities.lengthGE(meta_isa_info, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), UNPROVIDED)));
                        csome_list_var = csome_list_var.rest();
                        basis_property = csome_list_var.first();
                    } 
                }
            } finally {
                final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL == reuse_existingP) {
                        rkf_sd_free_problem_store(store);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                }
            }
        } finally {
            $rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject v_properties = rkf_sd_properties_from_meta_isa_info($rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() ? list_utilities.first_n($rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), meta_isa_info) : meta_isa_info);
        final SubLObject justifications = thread.secondMultipleValue();
        final SubLObject rule_specs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(v_properties, justifications, rule_specs);
    }

    public static SubLObject rkf_known_meta_isas_from_basis_properties(final SubLObject basis_properties, final SubLObject mt) {
        SubLObject known_meta_isas = NIL;
        SubLObject cdolist_list_var = basis_properties;
        SubLObject basis_property = NIL;
        basis_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$85 = rkf_known_meta_isas_from_basis_property(basis_property, mt);
            SubLObject known_meta_isa = NIL;
            known_meta_isa = cdolist_list_var_$85.first();
            while (NIL != cdolist_list_var_$85) {
                final SubLObject item_var = known_meta_isa;
                if (NIL == member(item_var, known_meta_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                    known_meta_isas = cons(item_var, known_meta_isas);
                }
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                known_meta_isa = cdolist_list_var_$85.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            basis_property = cdolist_list_var.first();
        } 
        return known_meta_isas;
    }

    public static SubLObject rkf_known_meta_isas_from_basis_property(final SubLObject basis_property, final SubLObject mt) {
        if (NIL != formula_pattern_match.formula_matches_pattern(basis_property, $list68)) {
            final SubLObject lowest_known_isa = cycl_utilities.formula_arg2(basis_property, UNPROVIDED);
            final SubLObject all_known_isas = genls.all_genls(lowest_known_isa, mt, UNPROVIDED);
            SubLObject known_meta_isas = NIL;
            SubLObject cdolist_list_var = all_known_isas;
            SubLObject known_isa = NIL;
            known_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$86 = isa.all_isa(known_isa, mt, UNPROVIDED);
                SubLObject known_meta_isa = NIL;
                known_meta_isa = cdolist_list_var_$86.first();
                while (NIL != cdolist_list_var_$86) {
                    final SubLObject item_var = known_meta_isa;
                    if (NIL == member(item_var, known_meta_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                        known_meta_isas = cons(item_var, known_meta_isas);
                    }
                    cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                    known_meta_isa = cdolist_list_var_$86.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                known_isa = cdolist_list_var.first();
            } 
            return known_meta_isas;
        }
        final SubLObject v_properties = list($PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $ANSWER_LANGUAGE, $HL, $kw72$CONDITIONAL_SENTENCE_, T);
        final SubLObject meta_isa_var = $sym73$_COLLECTION_TYPE;
        final SubLObject instance_var = $sym74$_INSTANCE;
        final SubLObject basis_sentence = properties.property_to_sentence(basis_property, instance_var);
        final SubLObject query_sentence = list($$implies, basis_sentence, list($$thereExists, $sym77$_TYPE, list($$and, list($$isa, $sym77$_TYPE, meta_isa_var), listS($$isa, instance_var, $list79))));
        final SubLObject meta_isas = ask_utilities.query_variable(meta_isa_var, query_sentence, mt, v_properties);
        return meta_isas;
    }

    public static SubLObject rkf_induced_salient_descriptor_meta_isa_info(final SubLObject basis_property, final SubLObject mt, final SubLObject generality_cutoff) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_isa_info = NIL;
        thread.resetMultipleValues();
        final SubLObject superior = rkf_sd_deconstruct_basis_property(basis_property);
        final SubLObject isa_or_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != forts.fort_p(superior)) && cardinality_estimates.generality_estimate(superior).numL(generality_cutoff)) {
            SubLObject cdolist_list_var;
            final SubLObject slot_counts = cdolist_list_var = rkf_induced_salient_descriptor_meta_isas(mt, superior, isa_or_genls, UNPROVIDED, UNPROVIDED);
            SubLObject slot_count = NIL;
            slot_count = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = slot_count;
                SubLObject slot = NIL;
                SubLObject count = NIL;
                destructuring_bind_must_consp(current, datum, $list66);
                slot = current.first();
                current = count = current.rest();
                if (NIL == subl_promotions.memberP(slot, meta_isa_info, symbol_function(EQUAL), symbol_function(FIRST))) {
                    meta_isa_info = cons(list(slot, superior, isa_or_genls), meta_isa_info);
                }
                cdolist_list_var = cdolist_list_var.rest();
                slot_count = cdolist_list_var.first();
            } 
        }
        return meta_isa_info;
    }

    public static SubLObject rkf_sd_deconstruct_basis_property(final SubLObject basis_property) {
        final SubLObject v_term = $TERM;
        final SubLObject sentence = properties.property_to_sentence(basis_property, v_term);
        final SubLObject pcase_var = cycl_utilities.formula_arg0(sentence);
        if (pcase_var.eql($$isa)) {
            return values(cycl_utilities.formula_arg2(sentence, UNPROVIDED), $ISA);
        }
        if (pcase_var.eql($$genls)) {
            return values(cycl_utilities.formula_arg2(sentence, UNPROVIDED), $GENLS);
        }
        return NIL;
    }

    public static SubLObject rkf_sd_construct_basis_property(final SubLObject superior, final SubLObject isa_or_genls) {
        final SubLObject v_term = $TERM;
        if (isa_or_genls.eql($ISA)) {
            return properties.sentence_to_property(make_binary_formula($$isa, v_term, superior), v_term);
        }
        if (isa_or_genls.eql($GENLS)) {
            return properties.sentence_to_property(make_binary_formula($$genls, v_term, superior), v_term);
        }
        return NIL;
    }

    public static SubLObject rkf_sd_properties_from_bin_pred_info(final SubLObject info) {
        SubLObject v_properties = NIL;
        SubLObject basis_properties = NIL;
        SubLObject rule_specs = NIL;
        final SubLObject var = $sym23$_X;
        final SubLObject v_term = $TERM;
        SubLObject cdolist_list_var = info;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject bin_pred = NIL;
            SubLObject superior = NIL;
            SubLObject isa_or_genls = NIL;
            destructuring_bind_must_consp(current, datum, $list82);
            bin_pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list82);
            superior = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list82);
            isa_or_genls = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sentence = make_binary_formula(bin_pred, v_term, var);
                final SubLObject property = properties.sentence_to_property(sentence, v_term);
                final SubLObject basis_property = rkf_sd_make_superior_basis_property(superior, isa_or_genls);
                final SubLObject rule_spec = new_rkf_salient_descriptor_rule_spec($BIN_PRED, isa_or_genls, superior, bin_pred);
                v_properties = cons(property, v_properties);
                basis_properties = cons(basis_property, basis_properties);
                rule_specs = cons(rule_spec, rule_specs);
            } else {
                cdestructuring_bind_error(datum, $list82);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return values(nreverse(v_properties), nreverse(basis_properties), nreverse(rule_specs));
    }

    public static SubLObject rkf_sd_properties_from_meta_isa_info(final SubLObject info) {
        SubLObject v_properties = NIL;
        SubLObject basis_properties = NIL;
        SubLObject rule_specs = NIL;
        final SubLObject var = $sym77$_TYPE;
        final SubLObject v_term = $TERM;
        SubLObject cdolist_list_var = info;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject meta_isa = NIL;
            SubLObject superior = NIL;
            SubLObject isa_or_genls = NIL;
            destructuring_bind_must_consp(current, datum, $list83);
            meta_isa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list83);
            superior = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list83);
            isa_or_genls = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sentence = make_conjunction(list(make_binary_formula($$isa, v_term, var), make_binary_formula($$isa, var, meta_isa)));
                final SubLObject property = properties.sentence_to_property(sentence, v_term);
                final SubLObject basis_property = rkf_sd_make_superior_basis_property(superior, isa_or_genls);
                final SubLObject rule_spec = new_rkf_salient_descriptor_rule_spec($META_ISA, isa_or_genls, superior, meta_isa);
                v_properties = cons(property, v_properties);
                basis_properties = cons(basis_property, basis_properties);
                rule_specs = cons(rule_spec, rule_specs);
            } else {
                cdestructuring_bind_error(datum, $list83);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return values(nreverse(v_properties), nreverse(basis_properties), nreverse(rule_specs));
    }

    public static SubLObject rkf_sd_make_superior_basis_property(final SubLObject superior, final SubLObject isa_or_genls) {
        return rkf_sd_construct_basis_property(superior, isa_or_genls);
    }

    public static SubLObject rkf_sd_induction_basis_properties(final SubLObject v_term, final SubLObject mt) {
        final SubLObject isa_properties = rkf_induced_salient_descriptor_superior_properties(v_term, mt, $ISA, UNPROVIDED);
        return NIL != fort_types_interface.collectionP(v_term) ? append(isa_properties, rkf_induced_salient_descriptor_superior_properties(v_term, mt, $GENLS, UNPROVIDED)) : isa_properties;
    }

    public static SubLObject rkf_induced_salient_descriptor_superior_properties(final SubLObject v_term, final SubLObject mt, final SubLObject isa_or_genls, SubLObject maximally_generalP) {
        if (maximally_generalP == UNPROVIDED) {
            maximally_generalP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject superior_property = (isa_or_genls == $ISA) ? properties.sentence_to_property(listS($$isa, v_term, $list84), $SUPERIOR) : properties.sentence_to_property(listS($$genls, v_term, $list84), $SUPERIOR);
        final SubLObject query_properties = list($ANSWER_LANGUAGE, $HL, $PROBLEM_STORE, rkf_sd_find_or_make_problem_store());
        final SubLObject all_superiors = properties.property_extent(superior_property, mt, query_properties);
        final SubLObject superiors_cutoff = $rkf_sd_induced_superiors_cutoff$.getDynamicValue(thread);
        final SubLObject sorted_superiors = cardinality_estimates.sort_by_generality_estimate(all_superiors, $ASCENDING);
        SubLObject superiors = (superiors_cutoff.isNumber()) ? list_utilities.first_n(superiors_cutoff, sorted_superiors) : sorted_superiors;
        if (NIL != maximally_generalP) {
            superiors = nreverse(superiors);
        }
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = superiors;
        SubLObject superior = NIL;
        superior = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(rkf_sd_construct_basis_property(superior, isa_or_genls), ans);
            cdolist_list_var = cdolist_list_var.rest();
            superior = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject rkf_induced_salient_descriptor_superiors(final SubLObject v_term, final SubLObject mt, final SubLObject isa_or_genls, final SubLObject maximally_generalP) {
        final SubLObject superior_fn = (isa_or_genls == $ISA) ? ALL_ISA : ALL_GENLS;
        final SubLObject superior_property = (isa_or_genls == $ISA) ? properties.sentence_to_property(listS($$isa, v_term, $list84), $SUPERIOR) : properties.sentence_to_property(listS($$genls, v_term, $list84), $SUPERIOR);
        final SubLObject superiors_cutoff = FOUR_INTEGER;
        final SubLObject sorted_superiors = cardinality_estimates.sort_by_generality_estimate(funcall(superior_fn, v_term, mt), $ASCENDING);
        SubLObject superiors = list_utilities.first_n(superiors_cutoff, sorted_superiors);
        if (NIL != maximally_generalP) {
            superiors = nreverse(superiors);
        }
        return superiors;
    }

    public static SubLObject rkf_induced_salient_descriptor_slots(final SubLObject superiors, final SubLObject isa_or_genls, final SubLObject rule_type, final SubLObject mt, SubLObject known_meta_isas) {
        if (known_meta_isas == UNPROVIDED) {
            known_meta_isas = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enoughP = NIL;
        final SubLObject generality_cutoff = $int$25000;
        SubLObject v_slots = NIL;
        final SubLObject reuse_existingP = rkf_sd_problem_store_okP($rkf_sd_problem_store$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding(thread);
        try {
            $rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
            final SubLObject store = $rkf_sd_problem_store$.getDynamicValue(thread);
            try {
                if (NIL == enoughP) {
                    SubLObject csome_list_var = superiors;
                    SubLObject superior = NIL;
                    superior = csome_list_var.first();
                    while ((NIL == enoughP) && (NIL != csome_list_var)) {
                        if (cardinality_estimates.generality_estimate(superior).numL(generality_cutoff)) {
                            final SubLObject slot_fn = (rule_type == $BIN_PRED) ? RKF_INDUCED_SALIENT_DESCRIPTOR_BINARY_PREDS : RKF_INDUCED_SALIENT_DESCRIPTOR_META_ISAS;
                            final SubLObject slot_args = (rule_type == $BIN_PRED) ? list(mt, superior, isa_or_genls) : list(mt, superior, isa_or_genls, known_meta_isas);
                            SubLObject cdolist_list_var;
                            final SubLObject slot_counts = cdolist_list_var = apply(slot_fn, slot_args);
                            SubLObject slot_count = NIL;
                            slot_count = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = slot_count;
                                SubLObject slot = NIL;
                                SubLObject count = NIL;
                                destructuring_bind_must_consp(current, datum, $list66);
                                slot = current.first();
                                current = count = current.rest();
                                if (NIL == subl_promotions.memberP(slot, v_slots, symbol_function(EQUAL), symbol_function(CAR))) {
                                    v_slots = cons(cons(slot, superior), v_slots);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                slot_count = cdolist_list_var.first();
                            } 
                            enoughP = makeBoolean($rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber() && (NIL != list_utilities.lengthGE(v_slots, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), UNPROVIDED)));
                        }
                        csome_list_var = csome_list_var.rest();
                        superior = csome_list_var.first();
                    } 
                }
            } finally {
                final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL == reuse_existingP) {
                        rkf_sd_free_problem_store(store);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                }
            }
        } finally {
            $rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
        }
        return v_slots;
    }

    public static SubLObject rkf_salient_descriptor_specP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return rkf_salient_descriptor_genlP(col2, col1, mt);
    }

    public static SubLObject rkf_salient_descriptor_genlP_internal(final SubLObject col1, final SubLObject col2, final SubLObject mt) {
        return genls.genlP(col1, col2, mt, UNPROVIDED);
    }

    public static SubLObject rkf_salient_descriptor_genlP(final SubLObject col1, final SubLObject col2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_salient_descriptor_genlP_internal(col1, col2, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym92$RKF_SALIENT_DESCRIPTOR_GENL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym92$RKF_SALIENT_DESCRIPTOR_GENL_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym92$RKF_SALIENT_DESCRIPTOR_GENL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(col1, col2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (col2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_salient_descriptor_genlP_internal(col1, col2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col1, col2, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_salient_descriptor_rule_from_spec(final SubLObject rule_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        SubLObject rule_type = NIL;
        SubLObject isa_or_genls = NIL;
        SubLObject superior = NIL;
        SubLObject slot = NIL;
        destructuring_bind_must_consp(rule_spec, rule_spec, $list93);
        rule_type = rule_spec.first();
        SubLObject current = rule_spec.rest();
        destructuring_bind_must_consp(current, rule_spec, $list93);
        isa_or_genls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, rule_spec, $list93);
        superior = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, rule_spec, $list93);
        slot = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject default_var = (isa_or_genls == $ISA) ? $sym74$_INSTANCE : $sym94$_SPEC;
            final SubLObject term_var = czer_utilities.unique_el_var_wrt_expression(slot, default_var);
            final SubLObject formula_fn = (rule_type == $BIN_PRED) ? RKF_MAKE_BIN_PRED_FORMULA : RKF_MAKE_META_ISA_FORMULA;
            final SubLObject consequent = funcall(formula_fn, term_var, slot);
            final SubLObject rule = rkf_make_salient_descriptor_rule(term_var, superior, consequent, isa_or_genls);
            return rkf_formula_optimizer.rkf_tersify(rule, mt);
        }
        cdestructuring_bind_error(rule_spec, $list93);
        return NIL;
    }

    public static SubLObject rkf_rule_spec_supports(final SubLObject v_term, final SubLObject rule_spec, final SubLObject mt) {
        final SubLObject super_sentence = rkf_justification_sentence_from_rule_spec(v_term, rule_spec);
        final SubLObject ask_results = ask_utilities.ask_justified(super_sentence, mt, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject first_result = ask_results.first();
        SubLObject supports = second(first_result);
        final SubLObject induced_rule_support = rkf_induced_rule_support(rule_spec, mt);
        if (NIL != induced_rule_support) {
            supports = cons(induced_rule_support, supports);
        }
        return nreverse(supports);
    }

    public static SubLObject rkf_justification_sentence_from_rule_spec(final SubLObject v_term, final SubLObject rule_spec) {
        SubLObject current;
        final SubLObject datum = current = rule_spec.rest();
        SubLObject isa_or_genls = NIL;
        SubLObject v_super = NIL;
        SubLObject slot = NIL;
        destructuring_bind_must_consp(current, datum, $list97);
        isa_or_genls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        v_super = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        slot = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject super_pred = (isa_or_genls == $ISA) ? $$isa : $$genls;
            final SubLObject super_sentence = make_binary_formula(super_pred, v_term, v_super);
            return super_sentence;
        }
        cdestructuring_bind_error(datum, $list97);
        return NIL;
    }

    public static SubLObject rkf_induced_rule_support(final SubLObject rule_spec, final SubLObject mt) {
        SubLObject rule_type = NIL;
        SubLObject isa_or_genls = NIL;
        SubLObject superior = NIL;
        SubLObject slot = NIL;
        destructuring_bind_must_consp(rule_spec, rule_spec, $list93);
        rule_type = rule_spec.first();
        SubLObject current = rule_spec.rest();
        destructuring_bind_must_consp(current, rule_spec, $list93);
        isa_or_genls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, rule_spec, $list93);
        superior = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, rule_spec, $list93);
        slot = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(rule_spec, $list93);
            return NIL;
        }
        final SubLObject pcase_var = rule_type;
        if (pcase_var.eql($META_ISA)) {
            final SubLObject super_pred = (isa_or_genls == $ISA) ? $$isa : $$genls;
            final SubLObject term_var = $sym23$_X;
            final SubLObject rule_sentence = list($$implies, list(super_pred, term_var, superior), list($$keStrongSuggestion, term_var, rkf_make_meta_isa_formula(term_var, slot)));
            final SubLObject fake_hl_support = listS($CODE, rule_sentence, mt, $list99);
            return fake_hl_support;
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_rule_spec_p(final SubLObject obj) {
        return makeBoolean((obj.isList() && (NIL != list_utilities.lengthE(obj, FOUR_INTEGER, UNPROVIDED))) && (NIL != member(obj.first(), $list100, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject new_rkf_salient_descriptor_rule_spec(final SubLObject rule_type, final SubLObject isa_or_genls, final SubLObject superior, final SubLObject slot) {
        return list(rule_type, isa_or_genls, superior, slot);
    }

    public static SubLObject rkf_salient_descriptor_rule_spec_slot(final SubLObject rule_spec) {
        return fourth(rule_spec);
    }

    public static SubLObject rkf_sd_binary_preds_inference_properties(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(new SubLObject[]{ $PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $ANSWER_LANGUAGE, $HL, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $ARG_TYPE, $kw103$CACHE_INFERENCE_RESULTS_, NIL, $RESULT_UNIQUENESS, $BINDINGS, $RETURN, list($TEMPLATE, var), $PRODUCTIVITY_LIMIT, $int$100000, $MAX_NUMBER, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), $MAX_TIME, $rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), $PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, $rkf_salient_descriptor_transformation_cutoff$.getDynamicValue(thread) });
    }

    public static SubLObject rkf_collection_promising_for_binary_pred_inductionP(final SubLObject mt, final SubLObject collection, SubLObject type, SubLObject minimum_to_count_as_promising) {
        if (type == UNPROVIDED) {
            type = $ISA;
        }
        if (minimum_to_count_as_promising == UNPROVIDED) {
            minimum_to_count_as_promising = THREE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = makeBoolean(NIL == forts.fort_p(collection));
        if (NIL == badP) {
            final SubLObject min_inferiors = $int$25;
            final SubLObject max_specs = $int$100;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject inferior_estimate = ($ISA == type) ? cardinality_estimates.instance_cardinality(collection) : cardinality_estimates.spec_cardinality(collection);
                badP = makeBoolean((inferior_estimate.numL(min_inferiors) || cardinality_estimates.spec_cardinality(collection).numG(max_specs)) || (NIL != list_utilities.lengthL(rkf_salient_descriptor_get_inferiors(mt, collection, type, min_inferiors), min_inferiors, UNPROVIDED)));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL == badP) {
                final SubLObject _prev_bind_4 = $rkf_salient_descriptor_number_cutoff$.currentBinding(thread);
                try {
                    $rkf_salient_descriptor_number_cutoff$.bind(multiply(TWO_INTEGER, minimum_to_count_as_promising), thread);
                    badP = list_utilities.lengthL(rkf_induced_salient_descriptor_binary_preds(mt, collection, type, $int$25, $ALL, UNPROVIDED), minimum_to_count_as_promising, UNPROVIDED);
                } finally {
                    $rkf_salient_descriptor_number_cutoff$.rebind(_prev_bind_4, thread);
                }
            }
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject rkf_induced_suggestion_pred_of_strength(final SubLObject strength, final SubLObject type) {
        if (type.eql($ISA)) {
            if (strength.eql($STRONG)) {
                return $$keInducedStrongSuggestionPreds;
            }
            if (strength.eql($WEAK)) {
                return $$keInducedWeakSuggestionPreds;
            }
            return $$keInducedSuggestionPreds;
        } else {
            if (strength.eql($STRONG)) {
                return $const118$keGenlsInducedStrongSuggestionPre;
            }
            if (strength.eql($WEAK)) {
                return $$keGenlsInducedWeakSuggestionPreds;
            }
            return $$keGenlsInducedSuggestionPreds;
        }
    }

    public static SubLObject rkf_induced_salient_descriptor_binary_preds(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject lax_factor, SubLObject strength, SubLObject omit_preds_for_genlsP) {
        if (lax_factor == UNPROVIDED) {
            lax_factor = TEN_INTEGER;
        }
        if (strength == UNPROVIDED) {
            strength = $STRONG;
        }
        if (omit_preds_for_genlsP == UNPROVIDED) {
            omit_preds_for_genlsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(lax_factor) : "subl_promotions.positive_integer_p(lax_factor) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(lax_factor) " + lax_factor;
        if (type != $ISA) {
            final SubLObject siblings = rkf_salient_descriptor_get_inferiors(mt, superior, type, UNPROVIDED);
            final SubLObject sibling_count = length(siblings);
            final SubLObject strong_min_min = FIVE_INTEGER;
            final SubLObject factored_min = integerDivide(sibling_count, lax_factor);
            final SubLObject strong_min = number_utilities.maximum(list(factored_min, strong_min_min), UNPROVIDED);
            final SubLObject max_occurence = (strength == $STRONG) ? NIL : number_utilities.f_1_(strong_min);
            final SubLObject min_min = (strength == $STRONG) ? strong_min_min : TWO_INTEGER;
            final SubLObject min_occurence = number_utilities.maximum(list(factored_min, min_min), UNPROVIDED);
            SubLObject alist = NIL;
            if (sibling_count.numG(min_occurence)) {
                SubLObject cdolist_list_var = siblings;
                SubLObject sibling = NIL;
                sibling = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$90 = rkf_term_binary_preds(sibling, mt);
                    SubLObject binary_pred = NIL;
                    binary_pred = cdolist_list_var_$90.first();
                    while (NIL != cdolist_list_var_$90) {
                        final SubLObject current_count = list_utilities.alist_lookup(alist, binary_pred, symbol_function(EQUAL), ZERO_INTEGER);
                        alist = list_utilities.alist_enter(alist, binary_pred, number_utilities.f_1X(current_count), symbol_function(EQUAL));
                        cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                        binary_pred = cdolist_list_var_$90.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling = cdolist_list_var.first();
                } 
            }
            SubLObject filtered = NIL;
            SubLObject cdolist_list_var2 = alist;
            SubLObject item = NIL;
            item = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = item;
                SubLObject binary_pred2 = NIL;
                SubLObject count = NIL;
                destructuring_bind_must_consp(current, datum, $list134);
                binary_pred2 = current.first();
                current = count = current.rest();
                if (!count.numL(min_occurence)) {
                    if ((NIL == max_occurence) || (!count.numG(max_occurence))) {
                        if (NIL != rkf_salient_descriptor_binary_pred_type_violationP(superior, binary_pred2, mt)) {
                            Errors.warn($str135$Type_violation___S__S__S, superior, binary_pred2, mt);
                        } else {
                            filtered = cons(cons(binary_pred2, count), filtered);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                item = cdolist_list_var2.first();
            } 
            return filtered;
        }
        if ((NIL != possibly_naut_p(superior)) && cycl_utilities.nat_functor(superior).eql($$SpecsFn)) {
            return rkf_induced_salient_descriptor_binary_preds(mt, cycl_utilities.nat_arg1(superior, UNPROVIDED), $GENL, lax_factor, strength, omit_preds_for_genlsP);
        }
        SubLObject ans = NIL;
        final SubLObject var = $sym123$_PRED;
        final SubLObject _prev_bind_0 = $rkf_salient_descriptor_transformation_cutoff$.currentBinding(thread);
        try {
            $rkf_salient_descriptor_transformation_cutoff$.bind(ZERO_INTEGER, thread);
            final SubLObject v_properties = rkf_sd_binary_preds_inference_properties(var);
            final SubLObject sugg_pred = rkf_induced_suggestion_pred_of_strength(strength, type);
            final SubLObject anytime_mt = hlmt_czer.canonicalize_hlmt(hlmt.new_hlmt(list(mt, $$AnytimePSC)));
            SubLObject query_sentence = list(sugg_pred, superior, var);
            if (NIL != omit_preds_for_genlsP) {
                query_sentence = list($$and, query_sentence, list($$unknownSentence, list($$thereExists, $sym126$_GENL, list($$and, listS($$genls, superior, $list127), listS($$different, superior, $list127), list(sugg_pred, $sym126$_GENL, var)))));
            }
            thread.resetMultipleValues();
            final SubLObject preds = inference_kernel.new_cyc_query(query_sentence, anytime_mt, v_properties);
            final SubLObject reason = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == subl_promotions.memberP(reason, $list129, UNPROVIDED, UNPROVIDED)) {
                Errors.warn($str130$_S___halted_with_reason__S__, query_sentence, reason);
            }
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == rkf_sd_never_use_binary_pred_p(pred)) {
                    final SubLObject count2 = ask_utilities.query_variable($sym131$_COUNT, listS($$assertedArg1BinaryPreds_Count, superior, pred, $list133), mt, v_properties).first();
                    if (count2.isInteger()) {
                        ans = cons(cons(pred, count2), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            $rkf_salient_descriptor_transformation_cutoff$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_noninduced_salient_descriptor_binary_preds(final SubLObject mt, final SubLObject superior, final SubLObject isa_or_genls) {
        if (isa_or_genls.eql($ISA)) {
            SubLObject ans = NIL;
            final SubLObject var = $sym123$_PRED;
            final SubLObject v_properties = rkf_sd_binary_preds_inference_properties(var);
            SubLObject cdolist_list_var;
            final SubLObject preds = cdolist_list_var = inference_kernel.new_cyc_query(list($$keRelevantPreds, superior, var), mt, v_properties);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == rkf_sd_never_use_binary_pred_p(pred)) {
                    ans = cons(pred, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            return ans;
        }
        return NIL;
    }

    public static SubLObject rkf_sd_never_use_binary_pred_p(final SubLObject pred) {
        return eq(pred, $$isa);
    }

    public static SubLObject rkf_salient_descriptor_get_inferiors_internal(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject inferior_max) {
        if (inferior_max == UNPROVIDED) {
            inferior_max = $int$200;
        }
        final SubLObject inferior_fn = (type == $ISA) ? INSTANCES : SPECS;
        SubLObject inferiors = NIL;
        SubLObject target_num = NIL;
        SubLObject specs = NIL;
        target_num = inferior_max;
        SubLObject new_inferiors;
        for (specs = cons(superior, genls.specs(superior, mt, UNPROVIDED)); (NIL != specs) && (NIL == list_utilities.lengthGE(inferiors, inferior_max, UNPROVIDED)); inferiors = nconc(inferiors, new_inferiors) , target_num = subtract(inferior_max, length(inferiors)) , specs = specs.rest()) {
            final SubLObject current_term = specs.first();
            new_inferiors = list_utilities.random_n(target_num, funcall(inferior_fn, current_term, mt));
        }
        return inferiors;
    }

    public static SubLObject rkf_salient_descriptor_get_inferiors(final SubLObject mt, final SubLObject superior, final SubLObject type, SubLObject inferior_max) {
        if (inferior_max == UNPROVIDED) {
            inferior_max = $int$200;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_salient_descriptor_get_inferiors_internal(mt, superior, type, inferior_max);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SALIENT_DESCRIPTOR_GET_INFERIORS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(mt, superior, type, inferior_max);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (superior.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (type.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && inferior_max.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_salient_descriptor_get_inferiors_internal(mt, superior, type, inferior_max)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(mt, superior, type, inferior_max));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_salient_descriptor_binary_pred_type_violationP_internal(final SubLObject v_term, final SubLObject binary_pred, final SubLObject mt) {
        final SubLObject arg1_genls = kb_accessors.arg1_genl(binary_pred, mt);
        SubLObject malP = NIL;
        if (NIL == malP) {
            SubLObject csome_list_var = arg1_genls;
            SubLObject arg1_genl = NIL;
            arg1_genl = csome_list_var.first();
            while ((NIL == malP) && (NIL != csome_list_var)) {
                if (NIL != disjoint_with.collections_disjointP(v_term, arg1_genl, mt)) {
                    Errors.warn($str142$violation___S_not_a_known_spec_of, v_term, arg1_genl, mt);
                    malP = T;
                }
                csome_list_var = csome_list_var.rest();
                arg1_genl = csome_list_var.first();
            } 
        }
        return malP;
    }

    public static SubLObject rkf_salient_descriptor_binary_pred_type_violationP(final SubLObject v_term, final SubLObject binary_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_salient_descriptor_binary_pred_type_violationP_internal(v_term, binary_pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, binary_pred, mt);
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
                    if (binary_pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_salient_descriptor_binary_pred_type_violationP_internal(v_term, binary_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, binary_pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_term_binary_preds_internal(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject generality_cutoff = $int$10000;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$91 = NIL;
                            final SubLObject token_var_$92 = NIL;
                            while (NIL == done_var_$91) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$92);
                                final SubLObject valid_$93 = makeBoolean(!token_var_$92.eql(as));
                                if (NIL != valid_$93) {
                                    final SubLObject pred = assertions_high.gaf_arg0(as);
                                    if ((((((NIL != assertions_high.asserted_assertionP(as)) && (NIL != list_utilities.lengthE(assertions_high.gaf_formula(as), THREE_INTEGER, UNPROVIDED))) && cardinality_estimates.generality_estimate(pred).numL(generality_cutoff)) && (NIL == lexicon_vars.name_string_predP(pred))) && (NIL == lexicon_vars.term_strings_predP(pred))) && (NIL == rkf_relevance_utilities.rkf_irrelevant_term(pred, mt))) {
                                        final SubLObject item_var = pred;
                                        if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            preds = cons(item_var, preds);
                                        }
                                    }
                                }
                                done_var_$91 = makeBoolean(NIL == valid_$93);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject rkf_term_binary_preds(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_term_binary_preds_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_TERM_BINARY_PREDS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_TERM_BINARY_PREDS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_TERM_BINARY_PREDS, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_term_binary_preds_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_term_meta_isas(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_isas = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = rkf_close_isas(v_term, mt);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$95 = rkf_close_isas(v_isa, mt);
                SubLObject meta_isa = NIL;
                meta_isa = cdolist_list_var_$95.first();
                while (NIL != cdolist_list_var_$95) {
                    if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(meta_isa, mt)) {
                        final SubLObject item_var = meta_isa;
                        if (NIL == member(item_var, meta_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                            meta_isas = cons(item_var, meta_isas);
                        }
                    }
                    cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                    meta_isa = cdolist_list_var_$95.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return meta_isas;
    }

    public static SubLObject rkf_term_all_meta_isas_internal(final SubLObject v_term, final SubLObject mt) {
        SubLObject meta_isas = NIL;
        SubLObject irrelevant = NIL;
        SubLObject cdolist_list_var = isa.all_isa(v_term, mt, UNPROVIDED);
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$96 = isa.all_isa(v_isa, mt, UNPROVIDED);
            SubLObject meta_isa = NIL;
            meta_isa = cdolist_list_var_$96.first();
            while (NIL != cdolist_list_var_$96) {
                if (NIL == member(meta_isa, meta_isas, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != rkf_relevance_utilities.rkf_irrelevant_term(meta_isa, mt)) {
                        final SubLObject item_var = meta_isa;
                        if (NIL == member(item_var, irrelevant, symbol_function(EQL), symbol_function(IDENTITY))) {
                            irrelevant = cons(item_var, irrelevant);
                        }
                    } else
                        if (NIL == subl_promotions.memberP(meta_isa, irrelevant, UNPROVIDED, UNPROVIDED)) {
                            meta_isas = cons(meta_isa, meta_isas);
                        }

                }
                cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                meta_isa = cdolist_list_var_$96.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        return meta_isas;
    }

    public static SubLObject rkf_term_all_meta_isas(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_term_all_meta_isas_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_TERM_ALL_META_ISAS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_TERM_ALL_META_ISAS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_TERM_ALL_META_ISAS, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_term_all_meta_isas_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_rule_cnfs_for_term(final SubLObject rule, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf_pairs = NIL;
        final SubLObject el_cnf = rkf_sd_el_cnf_of_rule(rule);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$97 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$98 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$99 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$100 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        SubLObject cdolist_list_var = rkf_partial_bindings_for_term(rule, v_term, mt);
                        SubLObject v_bindings = NIL;
                        v_bindings = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject bound_el_cnf = copy_tree(el_cnf);
                            SubLObject deduced_neg_lits = NIL;
                            SubLObject justification_conjuncts = NIL;
                            SubLObject cdolist_list_var_$101 = v_bindings;
                            SubLObject cons = NIL;
                            cons = cdolist_list_var_$101.first();
                            while (NIL != cdolist_list_var_$101) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject var = NIL;
                                SubLObject v_term_$102 = NIL;
                                destructuring_bind_must_consp(current, datum, $list147);
                                var = current.first();
                                current = v_term_$102 = current.rest();
                                bound_el_cnf = nsubst(v_term_$102, var, bound_el_cnf, UNPROVIDED, UNPROVIDED);
                                cdolist_list_var_$101 = cdolist_list_var_$101.rest();
                                cons = cdolist_list_var_$101.first();
                            } 
                            SubLObject cdolist_list_var_$102 = clauses.neg_lits(bound_el_cnf);
                            SubLObject neg_lit = NIL;
                            neg_lit = cdolist_list_var_$102.first();
                            while (NIL != cdolist_list_var_$102) {
                                if ((NIL != cycl_utilities.expression_find_if($sym148$EL_VAR_, neg_lit, UNPROVIDED, UNPROVIDED)) || (NIL == rkf_sd_known(neg_lit, mt, UNPROVIDED))) {
                                    deduced_neg_lits = cons(neg_lit, deduced_neg_lits);
                                } else {
                                    justification_conjuncts = cons(neg_lit, justification_conjuncts);
                                }
                                cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                                neg_lit = cdolist_list_var_$102.first();
                            } 
                            final SubLObject deduced_cnf = clauses.make_clause(deduced_neg_lits, clauses.pos_lits(bound_el_cnf));
                            final SubLObject justification_formula = rkf_sd_conjoin(justification_conjuncts, NIL, NIL);
                            final SubLObject item_var = list(deduced_cnf, justification_formula);
                            if (NIL == member(item_var, cnf_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                cnf_pairs = cons(item_var, cnf_pairs);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            v_bindings = cdolist_list_var.first();
                        } 
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$100, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$99, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$98, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$97, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return cnf_pairs;
    }

    public static SubLObject rkf_sd_el_cnf_of_rule(final SubLObject rule) {
        final SubLObject hl_cnf = assertions_high.assertion_cnf(rule);
        final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
        return rkf_sd_el_cnf_of_hl_cnf(hl_cnf, el_vars);
    }

    public static SubLObject rkf_sd_el_cnf_of_hl_cnf(final SubLObject hl_cnf, final SubLObject el_vars) {
        SubLObject el_cnf = copy_tree(hl_cnf);
        SubLObject list_var = NIL;
        SubLObject el_var = NIL;
        SubLObject i = NIL;
        list_var = el_vars;
        el_var = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.get_variable(i);
            el_cnf = nsubst(el_var, hl_var, el_cnf, UNPROVIDED, UNPROVIDED);
        }
        return el_cnf;
    }

    public static SubLObject rkf_sd_el_wffP_internal(final SubLObject el_formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $suppress_conflict_noticesP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nartsP$.bind(NIL, thread);
            at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            $within_assert$.bind(T, thread);
            $suppress_conflict_noticesP$.bind(T, thread);
            wffP = wff.el_wffP(el_formula, mt, UNPROVIDED);
        } finally {
            $suppress_conflict_noticesP$.rebind(_prev_bind_5, thread);
            $within_assert$.rebind(_prev_bind_4, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static SubLObject rkf_sd_el_wffP(final SubLObject el_formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_el_wffP_internal(el_formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym149$RKF_SD_EL_WFF_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym149$RKF_SD_EL_WFF_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym149$RKF_SD_EL_WFF_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(el_formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (el_formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_el_wffP_internal(el_formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(el_formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_partial_bindings_for_term(final SubLObject rule, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        SubLObject ans = NIL;
        if (NIL != genl_mts.genl_mtP(mt, assertions_high.assertion_mt(rule), UNPROVIDED, UNPROVIDED)) {
            final SubLObject rule_formula = uncanonicalizer.assertion_el_formula(rule);
            final SubLObject constraint_table = rkf_sd_constraint_table(rule_formula, mt);
            final SubLObject antecedent = cycl_utilities.formula_arg1(rule_formula, UNPROVIDED);
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(antecedent, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject el_var = NIL;
            el_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject el_var_constraint_clauses = dictionary.dictionary_lookup(constraint_table, el_var, UNPROVIDED);
                final SubLObject el_var_constraint_formula = rkf_sd_conjoin(el_var_constraint_clauses, NIL, NIL);
                final SubLObject substituted = cycl_utilities.expression_subst(v_term, el_var, el_var_constraint_formula, UNPROVIDED, UNPROVIDED);
                final SubLObject rejectedP = makeBoolean((NIL != el_formula_p(substituted)) && (NIL != rkf_sd_rejected(substituted, mt)));
                if (NIL == rejectedP) {
                    SubLObject cdolist_list_var_$105 = rkf_partial_bindings_for_term_var(el_var, v_term, antecedent, mt);
                    SubLObject new_bindings = NIL;
                    new_bindings = cdolist_list_var_$105.first();
                    while (NIL != cdolist_list_var_$105) {
                        final SubLObject item_var = new_bindings;
                        if (NIL == member(item_var, ans, symbol_function($sym150$ALIST__), symbol_function(IDENTITY))) {
                            ans = cons(item_var, ans);
                        }
                        cdolist_list_var_$105 = cdolist_list_var_$105.rest();
                        new_bindings = cdolist_list_var_$105.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                el_var = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject rkf_partial_bindings_for_term_var(final SubLObject el_var, final SubLObject v_term, final SubLObject antecedent, final SubLObject mt) {
        final SubLObject query_formula = subst(v_term, el_var, antecedent, UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = rkf_partial_bindings_for_formula(query_formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject more_bindings = NIL;
        more_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject full_bindings = item_var = list_utilities.alist_enter(more_bindings, el_var, v_term, UNPROVIDED);
            if (NIL == member(item_var, ans, symbol_function($sym150$ALIST__), symbol_function(IDENTITY))) {
                ans = cons(item_var, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            more_bindings = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject rkf_partial_bindings_for_formula(final SubLObject formula, final SubLObject mt, SubLObject unbound_var_max, SubLObject unknown_clause_max, SubLObject bindings_max) {
        if (unbound_var_max == UNPROVIDED) {
            unbound_var_max = TWO_INTEGER;
        }
        if (unknown_clause_max == UNPROVIDED) {
            unknown_clause_max = TWO_INTEGER;
        }
        if (bindings_max == UNPROVIDED) {
            bindings_max = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject doneP = NIL;
        if (((NIL != el_conjunction_p(formula)) && (NIL != rkf_sd_el_wffP(formula, mt))) && (NIL == rkf_sd_known(formula, mt, UNPROVIDED))) {
            final SubLObject constraint_table = rkf_sd_constraint_table(formula, mt);
            final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
            try {
                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                if (NIL == doneP) {
                    SubLObject csome_list_var = cycl_utilities.formula_args(formula, UNPROVIDED);
                    SubLObject conjunct = NIL;
                    conjunct = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        if (NIL == rkf_sd_el_fully_bound_p(conjunct)) {
                            SubLObject constraint_clauses = NIL;
                            SubLObject cdolist_list_var = cycl_utilities.expression_gather(conjunct, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject conjunct_var = NIL;
                            conjunct_var = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                constraint_clauses = cons(list($$unknownSentence, listS($$quotedIsa, conjunct_var, $list152)), constraint_clauses);
                                SubLObject cdolist_list_var_$106 = dictionary.dictionary_lookup(constraint_table, conjunct_var, UNPROVIDED);
                                SubLObject clause = NIL;
                                clause = cdolist_list_var_$106.first();
                                while (NIL != cdolist_list_var_$106) {
                                    constraint_clauses = cons(clause, constraint_clauses);
                                    cdolist_list_var_$106 = cdolist_list_var_$106.rest();
                                    clause = cdolist_list_var_$106.first();
                                } 
                                cdolist_list_var = cdolist_list_var.rest();
                                conjunct_var = cdolist_list_var.first();
                            } 
                            final SubLObject query_formula = rkf_sd_conjoin(cons(conjunct, constraint_clauses), NIL, NIL);
                            SubLObject cdolist_list_var2;
                            SubLObject unknown_conjuncts = cdolist_list_var2 = remove(conjunct, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject unknown_conjunct = NIL;
                            unknown_conjunct = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                rkf_sd_known(unknown_conjunct, mt, UNPROVIDED);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                unknown_conjunct = cdolist_list_var2.first();
                            } 
                            if (NIL == doneP) {
                                SubLObject csome_list_var_$107 = rkf_sd_get_conjunct_bindings(query_formula, mt);
                                SubLObject v_bindings = NIL;
                                v_bindings = csome_list_var_$107.first();
                                while ((NIL == doneP) && (NIL != csome_list_var_$107)) {
                                    if (NIL != v_bindings) {
                                        SubLObject cdolist_list_var3 = v_bindings;
                                        SubLObject cons = NIL;
                                        cons = cdolist_list_var3.first();
                                        while (NIL != cdolist_list_var3) {
                                            SubLObject current;
                                            final SubLObject datum = current = cons;
                                            SubLObject el_var = NIL;
                                            SubLObject v_term = NIL;
                                            destructuring_bind_must_consp(current, datum, $list153);
                                            el_var = current.first();
                                            current = v_term = current.rest();
                                            unknown_conjuncts = subst(v_term, el_var, unknown_conjuncts, UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            cons = cdolist_list_var3.first();
                                        } 
                                        if (NIL != list_utilities.lengthLE(list_utilities.tree_gather(unknown_conjuncts, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED), unbound_var_max, UNPROVIDED)) {
                                            SubLObject filtered_unknowns = NIL;
                                            SubLObject malP = NIL;
                                            if (NIL == malP) {
                                                SubLObject csome_list_var_$108 = unknown_conjuncts;
                                                SubLObject unknown = NIL;
                                                unknown = csome_list_var_$108.first();
                                                while ((NIL == malP) && (NIL != csome_list_var_$108)) {
                                                    if (NIL == rkf_sd_el_fully_bound_p(unknown)) {
                                                        filtered_unknowns = cons(unknown, filtered_unknowns);
                                                    } else
                                                        if (NIL == rkf_sd_el_wffP(unknown, mt)) {
                                                            malP = T;
                                                        } else
                                                            if (NIL != rkf_sd_rejected(unknown, mt)) {
                                                                malP = T;
                                                            } else
                                                                if (NIL == rkf_sd_known(unknown, mt, UNPROVIDED)) {
                                                                    filtered_unknowns = cons(unknown, filtered_unknowns);
                                                                }



                                                    csome_list_var_$108 = csome_list_var_$108.rest();
                                                    unknown = csome_list_var_$108.first();
                                                } 
                                            }
                                            malP = list_utilities.lengthG(filtered_unknowns, unknown_clause_max, UNPROVIDED);
                                            if (NIL == malP) {
                                                final SubLObject mega_formula = rkf_sd_conjoin(filtered_unknowns, UNPROVIDED, UNPROVIDED);
                                                if (NIL != rkf_sd_el_wffP(mega_formula, mt)) {
                                                    final SubLObject item_var = v_bindings;
                                                    if (NIL == member(item_var, ans, symbol_function($sym150$ALIST__), symbol_function(IDENTITY))) {
                                                        ans = cons(item_var, ans);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    csome_list_var_$107 = csome_list_var_$107.rest();
                                    v_bindings = csome_list_var_$107.first();
                                } 
                            }
                            doneP = list_utilities.lengthGE(ans, bindings_max, UNPROVIDED);
                        }
                        csome_list_var = csome_list_var.rest();
                        conjunct = csome_list_var.first();
                    } 
                }
            } finally {
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject rkf_sd_constraint_table(final SubLObject formula, final SubLObject mt) {
        final SubLObject constraint_formula = at_var_types.inter_formula_variables_arg_constraints(formula, mt, UNPROVIDED);
        final SubLObject conjuncts = (NIL != el_conjunction_p(constraint_formula)) ? cycl_utilities.formula_args(constraint_formula, UNPROVIDED) : list(constraint_formula);
        final SubLObject constraint_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != formula_pattern_match.formula_matches_pattern(conjunct, $list154)) || (NIL != formula_pattern_match.formula_matches_pattern(conjunct, $list155))) {
                dictionary_utilities.dictionary_push(constraint_table, cycl_utilities.formula_arg1(conjunct, UNPROVIDED), conjunct);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return constraint_table;
    }

    public static SubLObject rkf_sd_rejected(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject negation_by_failureP = rkf_sd_use_negation_by_failureP(sentence);
        SubLObject rejectP = T;
        if (NIL != el_formula_p(sentence)) {
            final SubLObject _prev_bind_0 = $negation_by_failure$.currentBinding(thread);
            try {
                $negation_by_failure$.bind(negation_by_failureP, thread);
                thread.resetMultipleValues();
                final SubLObject negation_knownP = rkf_sd_known(make_negation(sentence), mt, UNPROVIDED);
                final SubLObject timed_outP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rejectP = makeBoolean((NIL != negation_knownP) || (NIL != timed_outP));
            } finally {
                $negation_by_failure$.rebind(_prev_bind_0, thread);
            }
        }
        return rejectP;
    }

    public static SubLObject rkf_sd_use_negation_by_failureP(final SubLObject sentence) {
        return formula_pattern_match.formula_matches_pattern(sentence, $list156);
    }

    public static SubLObject rkf_sd_known_problem_store_properties() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list($INTERMEDIATE_STEP_VALIDATION_LEVEL, $ARG_TYPE, $kw157$NEGATION_BY_FAILURE_, $negation_by_failure$.getDynamicValue(thread));
    }

    public static SubLObject rkf_sd_known_static_inference_properties(final SubLObject problem_store, SubLObject exclude_indeterminatesP) {
        if (exclude_indeterminatesP == UNPROVIDED) {
            exclude_indeterminatesP = T;
        }
        final SubLObject v_properties = list($PROBLEM_STORE, problem_store, $RESULT_UNIQUENESS, $BINDINGS, $kw158$ALLOW_INDETERMINATE_RESULTS_, makeBoolean(NIL == exclude_indeterminatesP));
        return v_properties;
    }

    public static SubLObject rkf_sd_known_dynamic_inference_properties(final SubLObject max_transformation_depth, final SubLObject max_transformation_depth_max) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(new SubLObject[]{ $ANSWER_LANGUAGE, $HL, $kw103$CACHE_INFERENCE_RESULTS_, NIL, $kw159$FORGET_EXTRA_RESULTS_, T, $MAX_NUMBER, ONE_INTEGER, $BROWSABLE_, T, $CONTINUABLE_, max_transformation_depth.eql(max_transformation_depth_max) ? NIL : T, $MAX_TIME, $rkf_sd_known_time_cutoff$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, max_transformation_depth, $PRODUCTIVITY_LIMIT, $int$100000 });
    }

    public static SubLObject rkf_sd_known_internal(final SubLObject sentence, final SubLObject mt, SubLObject exclude_indeterminatesP) {
        if (exclude_indeterminatesP == UNPROVIDED) {
            exclude_indeterminatesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject timed_outP = NIL;
        if (NIL != el_formula_p(sentence)) {
            final SubLObject problem_store = rkf_sd_find_or_make_problem_store();
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                final SubLObject v_properties = rkf_sd_known_static_inference_properties(problem_store, exclude_indeterminatesP);
                final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, v_properties);
                SubLObject max_depth = ZERO_INTEGER;
                final SubLObject max_depth_max = $rkf_sd_known_max_depth_max$.getDynamicValue(thread);
                for (SubLObject no_more_bindingsP = NIL; (NIL == ans) && (NIL == no_more_bindingsP); ans = T) {
                    thread.resetMultipleValues();
                    final SubLObject binding_lists = inference_kernel.continue_inference(inference, rkf_sd_known_dynamic_inference_properties(max_depth, max_depth_max));
                    final SubLObject exit_condition = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ($MAX_TIME == exit_condition) {
                        timed_outP = T;
                        no_more_bindingsP = T;
                    } else
                        if (NIL == inference_datastructures_inference.continuable_inference_p(inference)) {
                            if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(exit_condition)) {
                                Errors.warn($str163$_S_is_not_continuable____Exit_con, inference, exit_condition);
                            }
                            no_more_bindingsP = T;
                        } else
                            if ((NIL == binding_lists) && max_depth.numGE(max_depth_max)) {
                                no_more_bindingsP = T;
                            } else
                                if (($EXHAUST == exit_condition) && max_depth.numL(max_depth_max)) {
                                    max_depth = add(max_depth, ONE_INTEGER);
                                }



                    if (NIL != rkf_sd_known_some_good_binding_list_for_query_amongP(binding_lists, sentence, mt, exclude_indeterminatesP)) {
                    }
                }
                if (NIL != $rkf_sd_known_destroy_inferencesP$.getDynamicValue(thread)) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
            }
        }
        if ((NIL != timed_outP) && $rkf_sd_known_time_cutoff$.getDynamicValue(thread).isPositive()) {
            Errors.warn($str165$RKF_SD_KNOWN_timed_out_on__S, sentence);
        }
        return values(ans, timed_outP);
    }

    public static SubLObject rkf_sd_known(final SubLObject sentence, final SubLObject mt, SubLObject exclude_indeterminatesP) {
        if (exclude_indeterminatesP == UNPROVIDED) {
            exclude_indeterminatesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_known_internal(sentence, mt, exclude_indeterminatesP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SD_KNOWN, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SD_KNOWN, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SD_KNOWN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, exclude_indeterminatesP);
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
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && exclude_indeterminatesP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_known_internal(sentence, mt, exclude_indeterminatesP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, exclude_indeterminatesP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_sd_existentially_unbind(final SubLObject sentence) {
        SubLObject new_sentence = copy_expression(sentence);
        SubLObject vars = NIL;
        while (NIL != el_existential_p(new_sentence)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(new_sentence, UNPROVIDED);
            SubLObject var = NIL;
            SubLObject body = NIL;
            destructuring_bind_must_consp(current, datum, $list166);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list166);
            body = current.first();
            current = current.rest();
            if (NIL == current) {
                new_sentence = body;
                vars = cons(var, vars);
            } else {
                cdestructuring_bind_error(datum, $list166);
            }
        } 
        return values(new_sentence, vars);
    }

    public static SubLObject rkf_sd_possibly_existentially_unbind(final SubLObject sentence) {
        return NIL != el_existential_p(sentence) ? rkf_sd_existentially_unbind(sentence) : values(sentence, sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_sd_known_some_good_binding_list_for_query_amongP(final SubLObject binding_lists, final SubLObject query_sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP) {
        SubLObject good_foundP;
        SubLObject rest;
        SubLObject binding_list;
        for (good_foundP = NIL, rest = NIL, rest = binding_lists; (NIL == good_foundP) && (NIL != rest); rest = rest.rest()) {
            binding_list = rest.first();
            if (NIL != rkf_sd_known_good_binding_list_for_queryP(binding_list, query_sentence, mt, exclude_indeterminatesP)) {
                good_foundP = T;
            }
        }
        return good_foundP;
    }

    public static SubLObject rkf_sd_known_good_binding_list_for_queryP(final SubLObject binding_list, final SubLObject query_sentence, final SubLObject mt, final SubLObject exclude_indeterminatesP) {
        if ((NIL == exclude_indeterminatesP) || (NIL != cyc_kernel.closed_query_bindings_p(binding_list))) {
            return T;
        }
        final SubLObject bound_sentence = bindings.apply_bindings(binding_list, query_sentence);
        return makeBoolean(NIL == pph_proof.sentence_trivial_for_justification_paraphraseP(bound_sentence, UNPROVIDED));
    }

    public static SubLObject rkf_sd_get_conjunct_bindings_internal(final SubLObject conjunct, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_properties = list(new SubLObject[]{ $PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $ANSWER_LANGUAGE, $HL, $kw103$CACHE_INFERENCE_RESULTS_, NIL, $RESULT_UNIQUENESS, $BINDINGS, $RETURN, $BINDINGS, $MAX_NUMBER, TWENTY_INTEGER, $MAX_TIME, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER });
        final SubLObject scoped_vars = NIL;
        thread.resetMultipleValues();
        final SubLObject hl_conjunct = rkf_sd_hl_for_el_vars_in_formula(conjunct);
        final SubLObject var_table = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject dnfs = clausifier.dnf_clausal_form(hl_conjunct, mt);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.singletonP(dnfs)) {
            final SubLObject dnf = dnfs.first();
            final SubLObject hl_bindings = inference_kernel.new_cyc_query_from_dnf(dnf, new_mt, scoped_vars, inference_properties);
            SubLObject el_bindings = copy_list(hl_bindings);
            SubLObject cdolist_list_var = var_table;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject hl_var = NIL;
                SubLObject el_var = NIL;
                destructuring_bind_must_consp(current, datum, $list168);
                hl_var = current.first();
                current = el_var = current.rest();
                el_bindings = subst(el_var, hl_var, el_bindings, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            return el_bindings;
        }
        return NIL;
    }

    public static SubLObject rkf_sd_get_conjunct_bindings(final SubLObject conjunct, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_get_conjunct_bindings_internal(conjunct, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SD_GET_CONJUNCT_BINDINGS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SD_GET_CONJUNCT_BINDINGS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SD_GET_CONJUNCT_BINDINGS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(conjunct, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (conjunct.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_get_conjunct_bindings_internal(conjunct, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(conjunct, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_sd_hl_for_el_vars_in_formula(final SubLObject formula) {
        SubLObject new_formula = copy_expression(formula);
        SubLObject table = NIL;
        SubLObject next_hl_var_num = ZERO_INTEGER;
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject hl_var = variables.get_variable(next_hl_var_num);
            new_formula = cycl_utilities.expression_nsubst(hl_var, el_var, new_formula, UNPROVIDED, UNPROVIDED);
            table = list_utilities.alist_enter(table, hl_var, el_var, UNPROVIDED);
            next_hl_var_num = add(next_hl_var_num, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        } 
        return values(new_formula, table);
    }

    public static SubLObject rkf_potential_rule_for_termP(final SubLObject rule, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        if (NIL != genl_mts.genl_mtP(mt, assertions_high.assertion_mt(rule), UNPROVIDED, UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = list_utilities.tree_gather(cnf, $sym169$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject bad_subP = NIL;
                    final SubLObject subbed = subst(v_term, var, copy_tree(cnf), UNPROVIDED, UNPROVIDED);
                    if (NIL == bad_subP) {
                        SubLObject csome_list_var = nconc(clauses.neg_lits(subbed), clauses.pos_lits(subbed));
                        SubLObject neg_lit = NIL;
                        neg_lit = csome_list_var.first();
                        while ((NIL == bad_subP) && (NIL != csome_list_var)) {
                            if (NIL == wff.semantically_wf_literalP(neg_lit, UNPROVIDED)) {
                                bad_subP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            neg_lit = csome_list_var.first();
                        } 
                    }
                    if (NIL == bad_subP) {
                        ans = cons(var, ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject rkf_sd_asent_unify(final SubLObject gaf_lit, final SubLObject rule_lit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return unification_utilities.asent_unify(gaf_lit, rule_lit, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_unsatisfied_cnf_subbed_rule_formula(final SubLObject rule, final SubLObject gaf_lit, final SubLObject rule_sense, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf_copy = copy_tree(assertions_high.assertion_cnf(rule));
        final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject rejectedP = NIL;
        SubLObject v_bindings = NIL;
        SubLObject ans = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$109 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject reuse_existingP = rkf_sd_problem_store_okP($rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$110 = $rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        $rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = $rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            if ($NEG == rule_sense) {
                                if (NIL == v_bindings) {
                                    SubLObject csome_list_var;
                                    SubLObject neg_lit;
                                    for (csome_list_var = clauses.neg_lits(cnf_copy), neg_lit = NIL, neg_lit = csome_list_var.first(); (NIL == v_bindings) && (NIL != csome_list_var); v_bindings = rkf_sd_asent_unify(gaf_lit, neg_lit, mt) , csome_list_var = csome_list_var.rest() , neg_lit = csome_list_var.first()) {
                                    }
                                }
                                if (NIL != v_bindings) {
                                    cnf_copy = bindings.subst_bindings(v_bindings, cnf_copy);
                                    final SubLObject new_neg_lits = remove(gaf_lit, clauses.neg_lits(cnf_copy), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    cnf_copy = clauses.make_clause(new_neg_lits, clauses.pos_lits(cnf_copy));
                                    rejectedP = rkf_unsatisfied_cnf_rejectP(cnf_copy, mt, el_vars);
                                }
                                if (NIL == rejectedP) {
                                    ans = uncanonicalizer.cnf_el_formula(cnf_copy, mt, el_vars);
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL == reuse_existingP) {
                                    rkf_sd_free_problem_store(store);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    } finally {
                        $rkf_sd_problem_store$.rebind(_prev_bind_0_$110, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$109, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_unsatisfied_cnf_rejectP(final SubLObject cnf_copy, final SubLObject mt, final SubLObject el_vars) {
        final SubLObject pos_lits = clauses.pos_lits(cnf_copy);
        final SubLObject consequent = (NIL != pos_lits) ? uncanonicalizer.cnf_el_formula(clauses.make_clause(NIL, pos_lits), mt, el_vars) : NIL;
        SubLObject rejectedP = makeBoolean((NIL == pos_lits) || ((NIL != rkf_sd_el_fully_bound_p(consequent)) && (NIL != rkf_sd_known(consequent, mt, UNPROVIDED))));
        if (NIL == rejectedP) {
            final SubLObject fully_bound_neg_lits = list_utilities.remove_if_not(FULLY_BOUND_P, clauses.neg_lits(cnf_copy), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            rejectedP = makeBoolean((NIL != fully_bound_neg_lits) && (NIL != rkf_sd_rejected(rkf_sd_conjoin(fully_bound_neg_lits, NIL, NIL), mt)));
        }
        if (NIL == rejectedP) {
            final SubLObject fully_bound_pos_lits = list_utilities.remove_if_not(FULLY_BOUND_P, clauses.pos_lits(cnf_copy), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            rejectedP = makeBoolean((NIL != fully_bound_pos_lits) && (NIL != rkf_sd_rejected(rkf_sd_conjoin(fully_bound_pos_lits, NIL, NIL), mt)));
        }
        return rejectedP;
    }

    public static SubLObject rkf_sd_neg_lits_knownP(final SubLObject neg_lits, final SubLObject mt) {
        if (NIL != neg_lits) {
            final SubLObject antecedent_formula = rkf_sd_conjoin(neg_lits, UNPROVIDED, UNPROVIDED);
            return rkf_sd_known(rkf_sd_existentially_bind_vars(antecedent_formula), mt, NIL);
        }
        return NIL;
    }

    public static SubLObject rkf_sd_el_fully_bound_p(final SubLObject el_formula) {
        return makeBoolean(NIL == cycl_utilities.expression_find_if($sym148$EL_VAR_, el_formula, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_make_el_cnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject rule) {
        final SubLObject rule_el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject cnf = copy_tree(clauses.make_clause(neg_lits, pos_lits));
        SubLObject list_var = NIL;
        SubLObject rule_el_var = NIL;
        SubLObject i = NIL;
        list_var = rule_el_vars;
        rule_el_var = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , rule_el_var = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.find_variable_by_id(i);
            cnf = nsubst(rule_el_var, hl_var, cnf, UNPROVIDED, UNPROVIDED);
        }
        return cnf;
    }

    public static SubLObject rkf_make_el_conjunction(final SubLObject lits, final SubLObject rule) {
        final SubLObject rule_el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject ans = rkf_sd_conjoin(lits, NIL, NIL);
        SubLObject list_var = NIL;
        SubLObject rule_el_var = NIL;
        SubLObject i = NIL;
        list_var = rule_el_vars;
        rule_el_var = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , rule_el_var = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.find_variable_by_id(i);
            ans = nsubst(rule_el_var, hl_var, ans, UNPROVIDED, UNPROVIDED);
        }
        return ans;
    }

    public static SubLObject rkf_rule_partially_satisfied_by_gaf_litP(final SubLObject rule, final SubLObject gaf_lit, final SubLObject rule_sense) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject complementary_truth_lits = ($NEG == rule_sense) ? clauses.neg_lits(cnf) : clauses.pos_lits(cnf);
        SubLObject matching_lit = NIL;
        SubLObject v_bindings = NIL;
        SubLObject unresolved_neg_lits = NIL;
        SubLObject unresolved_pos_lits = NIL;
        if (NIL == matching_lit) {
            SubLObject csome_list_var = complementary_truth_lits;
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == matching_lit) && (NIL != csome_list_var)) {
                v_bindings = unification_utilities.asent_unify(gaf_lit, lit, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    matching_lit = lit;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        if ((NIL == gaf_lit) || (NIL != matching_lit)) {
            unresolved_neg_lits = rkf_find_unresolved_lits(rule, $NEG, v_bindings, matching_lit);
            unresolved_pos_lits = (unresolved_neg_lits.isList()) ? rkf_find_unresolved_lits(rule, $POS, v_bindings, matching_lit) : NIL;
        }
        return values(unresolved_neg_lits, unresolved_pos_lits);
    }

    public static SubLObject rkf_find_unresolved_lits(final SubLObject rule, final SubLObject sense, final SubLObject v_bindings, final SubLObject matching_lit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mismatchP = NIL;
        final SubLObject cnf = copy_tree(assertions_high.assertion_cnf(rule));
        final SubLObject lits = (sense == $NEG) ? clauses.neg_lits(cnf) : clauses.pos_lits(cnf);
        final SubLObject el_vars = assertions_high.assertion_el_variables(rule);
        SubLObject unresolved = NIL;
        SubLObject resolved = NIL;
        if (NIL == mismatchP) {
            SubLObject csome_list_var = lits;
            SubLObject lit = NIL;
            lit = csome_list_var.first();
            while ((NIL == mismatchP) && (NIL != csome_list_var)) {
                if (!lit.equal(matching_lit)) {
                    thread.resetMultipleValues();
                    final SubLObject result = rkf_sd_check_lit(lit, v_bindings, el_vars);
                    final SubLObject el_lit = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject pcase_var = result;
                    if (pcase_var.eql($KNOWN)) {
                        resolved = cons(el_lit, resolved);
                    } else
                        if (pcase_var.eql($UNKNOWN)) {
                            unresolved = cons(el_lit, unresolved);
                        } else {
                            mismatchP = T;
                        }

                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
            } 
        }
        return values(NIL != mismatchP ? $MISMATCH : unresolved, resolved);
    }

    public static SubLObject rkf_subst_el_bindings(final SubLObject v_bindings, final SubLObject lit) {
        SubLObject ans = copy_expression(lit);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject var = NIL;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list147);
            var = current.first();
            current = v_term = current.rest();
            ans = nsubst(v_term, var, ans, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject rkf_sd_existentially_bind_vars(SubLObject formula) {
        SubLObject cdolist_list_var = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            formula = make_existential(var, formula);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return formula;
    }

    public static SubLObject rkf_sd_check_lit_internal(final SubLObject lit, final SubLObject el_bindings, final SubLObject el_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el = copy_expression(lit);
        SubLObject bound = NIL;
        SubLObject result = $UNKNOWN;
        SubLObject list_var = NIL;
        SubLObject el_var = NIL;
        SubLObject i = NIL;
        list_var = el_vars;
        el_var = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject hl_var = variables.find_variable_by_id(i);
            el = nsubst(el_var, hl_var, el, UNPROVIDED, UNPROVIDED);
        }
        el = rkf_subst_el_bindings(el_bindings, el);
        bound = rkf_sd_existentially_bind_vars(copy_expression(el));
        if (NIL == rkf_sd_el_wffP(el, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            result = $MALFORMED;
        } else
            if (NIL != rkf_relevance_utilities.rkf_irrelevant_formula(lit, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                result = $IRRELEVANT;
            } else
                if (NIL != rkf_sd_known(make_negation(bound), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED)) {
                    result = $FALSE;
                } else
                    if (NIL != rkf_sd_known(bound, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED)) {
                        result = $KNOWN;
                    }



        return values(result, el);
    }

    public static SubLObject rkf_sd_check_lit(final SubLObject lit, final SubLObject el_bindings, final SubLObject el_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_check_lit_internal(lit, el_bindings, el_vars);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SD_CHECK_LIT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SD_CHECK_LIT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SD_CHECK_LIT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lit, el_bindings, el_vars);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lit.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (el_bindings.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && el_vars.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_check_lit_internal(lit, el_bindings, el_vars)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lit, el_bindings, el_vars));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_sd_formulas_static_inference_properties(final SubLObject problem_store) {
        return list($PROBLEM_STORE, problem_store, $RESULT_UNIQUENESS, $BINDINGS);
    }

    public static SubLObject rkf_sd_formulas_dynamic_inference_properties(final SubLObject max_transformation_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list(new SubLObject[]{ $ANSWER_LANGUAGE, $HL, $kw103$CACHE_INFERENCE_RESULTS_, $cache_salient_descriptor_ask_resultsP$.getDynamicValue(thread), $kw159$FORGET_EXTRA_RESULTS_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS, $MAX_NUMBER, ONE_INTEGER, $CONTINUABLE_, T, $MAX_TIME, $rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), $MAX_TRANSFORMATION_DEPTH, max_transformation_depth, $PRODUCTIVITY_LIMIT, $int$100000 });
    }

    public static SubLObject rkf_salient_descriptor_formulas(final SubLObject fort, final SubLObject salience_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = NIL;
        SubLObject justifications = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
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
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$113 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$114 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$115 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$116 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        final SubLObject formula_var = $sym181$_FORMULA;
                        final SubLObject inference = rkf_salient_descriptor_formulas_inference(fort, formula_var, salience_pred, mt);
                        final SubLObject max_depth_max = $rkf_sd_formulas_max_depth_max$.getDynamicValue(thread);
                        SubLObject max_depth = ZERO_INTEGER;
                        SubLObject results_queue = NIL;
                        SubLObject no_more_bindingsP = NIL;
                        while ((NIL == no_more_bindingsP) && ((!$rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread).isNumber()) || (NIL == list_utilities.lengthG(formulas, $rkf_salient_descriptor_number_cutoff$.getDynamicValue(thread), UNPROVIDED)))) {
                            thread.resetMultipleValues();
                            final SubLObject new_formulas = rkf_salient_descriptor_formulas_one_batch(inference, max_depth, mt, formula_var, results_queue);
                            final SubLObject new_justs = thread.secondMultipleValue();
                            final SubLObject exit_condition = thread.thirdMultipleValue();
                            final SubLObject more_results = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            results_queue = more_results;
                            SubLObject new_formula = NIL;
                            SubLObject new_formula_$117 = NIL;
                            SubLObject new_just = NIL;
                            SubLObject new_just_$118 = NIL;
                            new_formula = new_formulas;
                            new_formula_$117 = new_formula.first();
                            new_just = new_justs;
                            new_just_$118 = new_just.first();
                            while ((NIL != new_just) || (NIL != new_formula)) {
                                formulas = cons(new_formula_$117, formulas);
                                justifications = cons(new_just_$118, justifications);
                                new_formula = new_formula.rest();
                                new_formula_$117 = new_formula.first();
                                new_just = new_just.rest();
                                new_just_$118 = new_just.first();
                            } 
                            if ($MAX_TIME == exit_condition) {
                                Errors.warn($str182$Timed_out_after__S_seconds_gettin, $rkf_salient_descriptor_time_cutoff$.getDynamicValue(thread), salience_pred, fort);
                                no_more_bindingsP = T;
                            } else
                                if ($PROBABLY_APPROXIMATELY_DONE == exit_condition) {
                                    Errors.warn($str183$P_A_D__getting__S_for__S___, salience_pred, fort);
                                    no_more_bindingsP = T;
                                } else
                                    if (NIL == inference_datastructures_inference.continuable_inference_p(inference)) {
                                        no_more_bindingsP = T;
                                    } else
                                        if ((NIL != inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p(exit_condition)) && max_depth.numGE(max_depth_max)) {
                                            no_more_bindingsP = T;
                                        } else {
                                            if (NIL == inference_datastructures_enumerated_types.exhausted_inference_suspend_status_p(exit_condition)) {
                                                continue;
                                            }
                                            max_depth = add(max_depth, ONE_INTEGER);
                                        }



                        } 
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$116, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$115, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$114, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$113, thread);
            }
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return values(formulas, justifications);
    }

    public static SubLObject rkf_salient_descriptor_formulas_inference(final SubLObject fort, final SubLObject formula_var, final SubLObject salience_pred, final SubLObject mt) {
        final SubLObject problem_store = rkf_sd_find_or_make_problem_store();
        final SubLObject test_sentence = list(salience_pred, fort, formula_var);
        final SubLObject inference = inference_kernel.new_continuable_inference(test_sentence, mt, rkf_sd_formulas_static_inference_properties(problem_store));
        return inference;
    }

    public static SubLObject rkf_salient_descriptor_formulas_one_batch_continue_inference(final SubLObject inference, final SubLObject inference_properties) {
        return inference_kernel.continue_inference(inference, inference_properties);
    }

    public static SubLObject rkf_salient_descriptor_formulas_one_batch(final SubLObject inference, final SubLObject max_depth, final SubLObject mt, final SubLObject formula_var, SubLObject ask_results) {
        if (ask_results == UNPROVIDED) {
            ask_results = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = NIL;
        SubLObject justifications = NIL;
        final SubLObject inference_properties = rkf_sd_formulas_dynamic_inference_properties(max_depth);
        final SubLObject max_time = getf(inference_properties, $MAX_TIME, NIL);
        final SubLObject max_internal_real_time = (NIL != max_time) ? numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(max_time) : NIL;
        SubLObject total_internal_real_time = ZERO_INTEGER;
        for (SubLObject doneP = NIL; NIL == doneP; doneP = T) {
            final SubLObject start_internal_real_time = get_internal_real_time();
            if (NIL == ask_results) {
                ask_results = rkf_salient_descriptor_formulas_one_batch_continue_inference(inference, inference_properties);
            }
            total_internal_real_time = add(total_internal_real_time, numeric_date_utilities.elapsed_internal_real_time(start_internal_real_time, UNPROVIDED));
            while ((NIL != ask_results) && (NIL == formulas)) {
                final SubLObject result = ask_results.first();
                ask_results = ask_results.rest();
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list184);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list184);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject badP = NIL;
                    if (NIL == badP) {
                        SubLObject csome_list_var = supports;
                        SubLObject support = NIL;
                        support = csome_list_var.first();
                        while ((NIL == badP) && (NIL != csome_list_var)) {
                            if (NIL != rkf_deprecated_sd_ruleP(support, mt)) {
                                badP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            support = csome_list_var.first();
                        } 
                    }
                    if (NIL != badP) {
                        continue;
                    }
                    final SubLObject formula = bindings.variable_lookup(formula_var, v_bindings);
                    if (NIL == el_existential_p(formula)) {
                        continue;
                    }
                    final SubLObject de_existentialized = rkf_sd_existentially_unbind(formula);
                    if ((NIL != rkf_irrelevant_sd_formulaP(de_existentialized, mt)) || ((NIL != $rkf_sd_exclude_known_promptsP$.getDynamicValue(thread)) && (NIL != rkf_sd_known(de_existentialized, mt, T)))) {
                        continue;
                    }
                    formulas = cons(de_existentialized, formulas);
                    justifications = cons(supports, justifications);
                } else {
                    cdestructuring_bind_error(datum, $list184);
                }
            } 
            if (((NIL != formulas) || ($MAX_NUMBER != inference_datastructures_inference.inference_suspend_status(inference))) || (max_internal_real_time.isInteger() && (!total_internal_real_time.numL(max_internal_real_time)))) {
            }
        }
        return values(formulas, justifications, inference_datastructures_inference.inference_suspend_status(inference), ask_results);
    }

    public static SubLObject rkf_irrelevant_sd_formulaP(final SubLObject de_existentialized_formula, final SubLObject mt) {
        final SubLObject prompt_formula = rkf_sd_remove_nonassertible_conjuncts(de_existentialized_formula);
        return makeBoolean((NIL == prompt_formula) || (NIL != list_utilities.sublisp_boolean(rkf_relevance_utilities.rkf_irrelevant_formula(prompt_formula, mt))));
    }

    public static SubLObject rkf_sd_remove_nonassertible_conjuncts(final SubLObject el_formula) {
        if (NIL == el_conjunction_p(el_formula)) {
            return el_formula;
        }
        SubLObject assertible_conjuncts = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(el_formula, $IGNORE);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == kb_accessors.not_assertible_predicateP(cycl_utilities.formula_arg0(conjunct), UNPROVIDED)) {
                assertible_conjuncts = cons(conjunct, assertible_conjuncts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return rkf_sd_conjoin(nreverse(assertible_conjuncts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject initialize_rkf_deprecated_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $rkf_deprecated_rules$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$deprecatedSalientDescriptorRule;
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$121 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str33$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$123 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$deprecatedSalientDescriptorRule, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$124 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$127 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list($$deprecatedSalientDescriptorRule, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$128 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject dep_pred = node_var_$128;
                                        final SubLObject _prev_bind_0_$124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$128)) {
                                                final SubLObject pred_var = dep_pred;
                                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                    final SubLObject str = NIL;
                                                    final SubLObject _prev_bind_0_$125 = $progress_start_time$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$125 = $progress_last_pacification_time$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$128 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                                    final SubLObject _prev_bind_3_$133 = $progress_notification_count$.currentBinding(thread);
                                                    final SubLObject _prev_bind_4_$134 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                                                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                                                    try {
                                                        $progress_start_time$.bind(get_universal_time(), thread);
                                                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                                        $progress_count$.bind(ZERO_INTEGER, thread);
                                                        $is_noting_progressP$.bind(T, thread);
                                                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                                        noting_progress_preamble(str);
                                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                        SubLObject done_var = NIL;
                                                        final SubLObject token_var = NIL;
                                                        while (NIL == done_var) {
                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                            if (NIL != valid) {
                                                                note_progress();
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                    SubLObject done_var_$135 = NIL;
                                                                    final SubLObject token_var_$136 = NIL;
                                                                    while (NIL == done_var_$135) {
                                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$136);
                                                                        final SubLObject valid_$137 = makeBoolean(!token_var_$136.eql(as));
                                                                        if (NIL != valid_$137) {
                                                                            rkf_deprecate_rule_internal(assertions_high.gaf_arg1(as), assertions_high.assertion_mt(as));
                                                                        }
                                                                        done_var_$135 = makeBoolean(NIL == valid_$137);
                                                                    } 
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$126 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values = getValuesAsVector();
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                        restoreValuesFromVector(_values);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$126, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        } 
                                                        noting_progress_postamble();
                                                    } finally {
                                                        $silent_progressP$.rebind(_prev_bind_8, thread);
                                                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                                        $progress_count$.rebind(_prev_bind_6, thread);
                                                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$134, thread);
                                                        $progress_notification_count$.rebind(_prev_bind_3_$133, thread);
                                                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$128, thread);
                                                        $progress_last_pacification_time$.rebind(_prev_bind_1_$125, thread);
                                                        $progress_start_time$.rebind(_prev_bind_0_$125, thread);
                                                    }
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$127 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$126 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$128);
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
                                                                        final SubLObject _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$142;
                                                                            for (iteration_state_$142 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$142); iteration_state_$142 = dictionary_contents.do_dictionary_contents_next(iteration_state_$142)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$142);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$129, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$142);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$128, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str43$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$144;
                                                            final SubLObject new_list = cdolist_list_var_$144 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$144.first();
                                                            while (NIL != cdolist_list_var_$144) {
                                                                final SubLObject _prev_bind_0_$130 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                            Errors.error($str42$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$130, thread);
                                                                }
                                                                cdolist_list_var_$144 = cdolist_list_var_$144.rest();
                                                                generating_fn = cdolist_list_var_$144.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$126, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$127, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$124, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$127, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$124, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$123, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str44$Node__a_does_not_pass_sbhl_type_t, $$deprecatedSalientDescriptorRule, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$123, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$122, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$122, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$121, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$120, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $rkf_deprecated_rules$.getGlobalValue();
    }

    public static SubLObject rkf_deprecate_rule_internal(final SubLObject rule, final SubLObject mt) {
        if (NIL == dictionary.dictionary_p($rkf_deprecated_rules$.getGlobalValue())) {
            initialize_rkf_deprecated_rules();
        }
        dictionary.dictionary_enter($rkf_deprecated_rules$.getGlobalValue(), rule, mt);
        return rule;
    }

    public static SubLObject rkf_salient_descriptor_deprecate_rule(final SubLObject rule, final SubLObject mt) {
        if (NIL != assertion_handles.assertion_p(rule)) {
            rkf_assertion_utilities.rkf_assert(list($const190$deprecatedSalientDescriptorRuleAs, rule), mt, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != el_formula_p(rule)) {
                rkf_assertion_utilities.rkf_assert(list($$deprecatedSalientDescriptorRule, rule), mt, UNPROVIDED, UNPROVIDED);
            }

        rkf_deprecate_rule_internal(rule, mt);
        return rule;
    }

    public static SubLObject deprecate_salient_descriptor_rule(final SubLObject argument, final SubLObject assertion) {
        final SubLObject rule = assertions_high.gaf_arg1(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return rkf_deprecate_rule_internal(rule, mt);
    }

    public static SubLObject undeprecate_salient_descriptor_rule(final SubLObject argument, final SubLObject assertion) {
        $rkf_deprecated_rules$.setGlobalValue($UNINITIALIZED);
        return assertion;
    }

    public static SubLObject rkf_deprecated_sd_ruleP(final SubLObject rule, final SubLObject mt) {
        if (NIL == dictionary.dictionary_p($rkf_deprecated_rules$.getGlobalValue())) {
            initialize_rkf_deprecated_rules();
        }
        SubLObject ans = NIL;
        if ((NIL != assertion_handles.assertion_p(rule)) || (NIL != el_formula_p(rule))) {
            final SubLObject dep_mt = dictionary.dictionary_lookup($rkf_deprecated_rules$.getGlobalValue(), rule, $NOT_FOUND);
            ans = makeBoolean((NIL != hlmt.hlmt_p(dep_mt)) && (NIL != genl_mts.genl_mtP(mt, dep_mt, UNPROVIDED, UNPROVIDED)));
        }
        return ans;
    }

    public static SubLObject rkf_bad_sd_ruleP(final SubLObject rule, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != assertion_handles.assertion_p(rule)) && (NIL != list_utilities.lengthG(clauses.neg_lits(assertions_high.assertion_cnf(rule)), $rkf_sd_rule_neg_lit_max$.getDynamicValue(thread), UNPROVIDED))) {
            return T;
        }
        if ((NIL != assertion_handles.assertion_p(rule)) && (NIL != list_utilities.lengthL(clauses.neg_lits(assertions_high.assertion_cnf(rule)), $rkf_sd_rule_neg_lit_min$.getDynamicValue(thread), UNPROVIDED))) {
            return T;
        }
        if ((NIL != assertion_handles.assertion_p(rule)) && (NIL != list_utilities.lengthG(clauses.pos_lits(assertions_high.assertion_cnf(rule)), $rkf_sd_rule_pos_lit_max$.getDynamicValue(thread), UNPROVIDED))) {
            return T;
        }
        if ((NIL != assertion_handles.assertion_p(rule)) && (NIL != list_utilities.lengthL(clauses.pos_lits(assertions_high.assertion_cnf(rule)), $rkf_sd_rule_pos_lit_min$.getDynamicValue(thread), UNPROVIDED))) {
            return T;
        }
        if (NIL != rkf_deprecated_sd_ruleP(rule, mt)) {
            return T;
        }
        if ((NIL != assertion_handles.assertion_p(rule)) && (NIL != rkf_sd_tva_equivalent_ruleP(rule, NIL))) {
            return T;
        }
        if ((NIL != assertion_handles.assertion_p(rule)) && (NIL != rkf_sd_type_based_strengthening_ruleP(rule))) {
            return T;
        }
        if ((NIL != assertion_handles.assertion_p(rule)) && (NIL != rkf_relevance_utilities.rkf_irrelevant_formula(uncanonicalizer.assertion_el_formula(rule), mt))) {
            return T;
        }
        if (NIL != rkf_sd_arg_constraint_ruleP(rule)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject rkf_sd_arg_constraint_ruleP(final SubLObject rule) {
        SubLObject ans = NIL;
        if (NIL != assertion_handles.assertion_p(rule)) {
            final SubLObject cnf = assertions_high.assertion_cnf(rule);
            if (NIL == ans) {
                SubLObject csome_list_var = clauses.pos_lits(cnf);
                SubLObject pos_lit = NIL;
                pos_lit = csome_list_var.first();
                while ((NIL == ans) && (NIL != csome_list_var)) {
                    if (NIL != isa.isaP(cycl_utilities.atomic_sentence_predicate(pos_lit), $$ArgConstraintPredicate, UNPROVIDED, UNPROVIDED)) {
                        ans = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    pos_lit = csome_list_var.first();
                } 
            }
        }
        return ans;
    }

    public static SubLObject rkf_sd_tva_equivalent_ruleP(final SubLObject as, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = T;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(as);
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject tva = NIL;
        if ((((NIL != list_utilities.lengthGE(neg_lits, TWO_INTEGER, UNPROVIDED)) && ((NIL == strictP) || (NIL != list_utilities.lengthE(neg_lits, TWO_INTEGER, UNPROVIDED)))) && (NIL != list_utilities.lengthE(pos_lits, ONE_INTEGER, UNPROVIDED))) && ((NIL == strictP) || (NIL == list_utilities.find_if_not($sym169$HL_VAR_, cycl_utilities.formula_args(pos_lits.first(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            final SubLObject pos_lit = pos_lits.first();
            SubLObject arg0 = NIL;
            final SubLObject arg2 = cycl_utilities.atomic_sentence_predicate(pos_lit);
            final SubLObject neg_lit_pattern = make_binary_formula(arg2, $list194, NIL != strictP ? $list194 : $ANYTHING);
            SubLObject arg3 = NIL;
            SubLObject arg4 = NIL;
            if ((NIL != forts.fort_p(arg2)) && (NIL == arg3)) {
                SubLObject csome_list_var = neg_lits;
                SubLObject neg_lit = NIL;
                neg_lit = csome_list_var.first();
                while ((NIL == arg3) && (NIL != csome_list_var)) {
                    if ((NIL != formula_pattern_match.formula_matches_pattern(neg_lit, neg_lit_pattern)) && (NIL == arg3)) {
                        SubLObject csome_list_var_$147 = remove(neg_lit, neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject other_lit = NIL;
                        other_lit = csome_list_var_$147.first();
                        while ((NIL == arg3) && (NIL != csome_list_var_$147)) {
                            final SubLObject other_pred = cycl_utilities.atomic_sentence_predicate(other_lit);
                            if (NIL != (NIL != strictP ? isa.isaP(other_pred, $$TransitiveBinaryPredicate, UNPROVIDED, UNPROVIDED) : isa.isaP(other_pred, $$BinaryPredicate, UNPROVIDED, UNPROVIDED))) {
                                SubLObject list_var = NIL;
                                SubLObject pos_lit_arg = NIL;
                                SubLObject arg_num = NIL;
                                list_var = pos_lit;
                                pos_lit_arg = list_var.first();
                                for (arg_num = ZERO_INTEGER; (NIL == arg4) && (NIL != list_var); list_var = list_var.rest() , pos_lit_arg = list_var.first() , arg_num = add(ONE_INTEGER, arg_num)) {
                                    final SubLObject neg_lit_arg = cycl_utilities.atomic_sentence_arg(neg_lit, arg_num, UNPROVIDED);
                                    if (((!arg_num.isZero()) && (!pos_lit_arg.eql(neg_lit_arg))) && pos_lit.equal(cycl_utilities.expression_subst(pos_lit_arg, neg_lit_arg, neg_lit, UNPROVIDED, UNPROVIDED))) {
                                        if (cycl_utilities.formula_args(other_lit, UNPROVIDED).equal(list(neg_lit_arg, pos_lit_arg))) {
                                            arg0 = $$transitiveViaArg;
                                        } else
                                            if (cycl_utilities.formula_args(other_lit, UNPROVIDED).equal(list(pos_lit_arg, neg_lit_arg))) {
                                                arg0 = $$transitiveViaArgInverse;
                                            }

                                        if (NIL != arg0) {
                                            arg4 = arg_num;
                                        }
                                    }
                                }
                                if (NIL != arg4) {
                                    arg3 = other_pred;
                                    if (arg3.eql(arg2)) {
                                        tva = make_binary_formula($$isa, arg2, $$TransitiveBinaryPredicate);
                                    } else {
                                        tva = make_ternary_formula(arg0, arg2, arg3, arg4);
                                    }
                                }
                            }
                            csome_list_var_$147 = csome_list_var_$147.rest();
                            other_lit = csome_list_var_$147.first();
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    neg_lit = csome_list_var.first();
                } 
            }
        }
        return tva;
    }

    public static SubLObject rkf_sd_type_based_strengthening_ruleP(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject hl_cnf = assertions_high.assertion_cnf(rule);
        SubLObject current;
        final SubLObject datum = current = hl_cnf;
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(current, datum, $list200);
        neg_lits = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list200);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != list_utilities.lengthE(neg_lits, TWO_INTEGER, UNPROVIDED)) && (NIL != list_utilities.lengthE(pos_lits, ONE_INTEGER, UNPROVIDED))) {
                SubLObject constraint_lit = NIL;
                SubLObject constrained_var = NIL;
                if (NIL == constraint_lit) {
                    SubLObject csome_list_var = neg_lits;
                    SubLObject neg_lit = NIL;
                    neg_lit = csome_list_var.first();
                    while ((NIL == constraint_lit) && (NIL != csome_list_var)) {
                        if ((NIL != subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(neg_lit), $list201, UNPROVIDED, UNPROVIDED)) && (NIL != variables.variable_p(cycl_utilities.atomic_sentence_arg(neg_lit, ONE_INTEGER, UNPROVIDED)))) {
                            constraint_lit = neg_lit;
                            constrained_var = cycl_utilities.atomic_sentence_arg(neg_lit, ONE_INTEGER, UNPROVIDED);
                        }
                        csome_list_var = csome_list_var.rest();
                        neg_lit = csome_list_var.first();
                    } 
                }
                if (NIL != constraint_lit) {
                    final SubLObject other_neg_lit = remove(constraint_lit, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                    final SubLObject other_neg_lit_pred = cycl_utilities.atomic_sentence_predicate(other_neg_lit);
                    final SubLObject pos_lit = pos_lits.first();
                    final SubLObject pos_lit_pred = cycl_utilities.atomic_sentence_predicate(pos_lit);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = makeBoolean((((((NIL != subl_promotions.memberP(constrained_var, cycl_utilities.formula_args(other_neg_lit, UNPROVIDED), UNPROVIDED, UNPROVIDED)) && (NIL != member(constrained_var, cycl_utilities.formula_args(pos_lit, UNPROVIDED), UNPROVIDED, UNPROVIDED))) && (NIL != same_formula_arity_p(other_neg_lit, pos_lit, UNPROVIDED))) && (NIL != forts.fort_p(other_neg_lit_pred))) && (NIL != forts.fort_p(pos_lit_pred))) && (NIL != sbhl_search_methods.sbhl_min_ceilings($$genlPreds, list(other_neg_lit_pred, pos_lit_pred), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list200);
        }
        return ans;
    }

    public static SubLObject rkf_sort_salient_formulas(final SubLObject suggestions) {
        return suggestions;
    }

    public static SubLObject rkf_sd_clear() {
        return clrhash($rkf_salient_descriptor_cache$.getGlobalValue());
    }

    public static SubLObject rkf_sd_present(final SubLObject cache_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = rkf_sd_lookup(cache_key);
        final SubLObject present = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return present;
    }

    public static SubLObject rkf_sd_lookup(final SubLObject cache_key) {
        return gethash(cache_key, $rkf_salient_descriptor_cache$.getGlobalValue(), NIL);
    }

    public static SubLObject rkf_sd_update(final SubLObject cache_key, final SubLObject formulas) {
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_salient_descriptor_cache_lock$.getGlobalValue());
            sethash(cache_key, $rkf_salient_descriptor_cache$.getGlobalValue(), formulas);
        } finally {
            if (NIL != release) {
                release_lock($rkf_salient_descriptor_cache_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sd_ignore_clear() {
        return clrhash($rkf_salient_descriptor_ignore_cache$.getGlobalValue());
    }

    public static SubLObject rkf_sd_ignore_present(final SubLObject cache_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = rkf_sd_lookup(cache_key);
        final SubLObject present = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return present;
    }

    public static SubLObject rkf_sd_ignore_lookup(final SubLObject cache_key) {
        return gethash(cache_key, $rkf_salient_descriptor_ignore_cache$.getGlobalValue(), NIL);
    }

    public static SubLObject rkf_sd_ignore_update(final SubLObject cache_key, final SubLObject formulas) {
        SubLObject release = NIL;
        try {
            release = seize_lock($rkf_salient_descriptor_ignore_cache_lock$.getGlobalValue());
            sethash(cache_key, $rkf_salient_descriptor_ignore_cache$.getGlobalValue(), formulas);
        } finally {
            if (NIL != release) {
                release_lock($rkf_salient_descriptor_ignore_cache_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_get_subprompts(final SubLObject formula, final SubLObject v_term, final SubLObject domain_mt, final SubLObject confirmedP, SubLObject salient_property_sentence) {
        if (salient_property_sentence == UNPROVIDED) {
            salient_property_sentence = NIL;
        }
        return NIL != confirmedP ? rkf_salient_descriptor_followups(formula, v_term, domain_mt, salient_property_sentence) : list(rkf_salient_descriptor_subprompt_from_formula(formula, v_term, domain_mt, salient_property_sentence));
    }

    public static SubLObject rkf_salient_descriptor_single_entry_varP(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        SubLObject single_entryP = rkf_sd_single_entry_var_top_levelP(var, formula, mt);
        final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject rest;
        SubLObject subformula;
        for (rest = NIL, rest = args; (NIL == single_entryP) && (NIL != rest); single_entryP = makeBoolean((NIL != el_formula_p(subformula)) && (NIL != rkf_salient_descriptor_single_entry_varP(var, subformula, mt))) , rest = rest.rest()) {
            subformula = rest.first();
        }
        return single_entryP;
    }

    public static SubLObject rkf_sd_single_entry_var_top_levelP(final SubLObject var, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_position = position(var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject single_entryP = NIL;
        if (var_position.isInteger()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                single_entryP = subl_promotions.memberP(var_position, kb_mapping_utilities.pred_values(pred, $$singleEntryFormatInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                if (NIL == single_entryP) {
                    SubLObject csome_list_var = kb_mapping_utilities.pred_value_tuples(pred, $$argFormat, ONE_INTEGER, $list209, UNPROVIDED);
                    SubLObject pair = NIL;
                    pair = csome_list_var.first();
                    while ((NIL == single_entryP) && (NIL != csome_list_var)) {
                        SubLObject current;
                        final SubLObject datum = current = pair;
                        SubLObject argnum = NIL;
                        SubLObject format = NIL;
                        destructuring_bind_must_consp(current, datum, $list206);
                        argnum = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list206);
                        format = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            single_entryP = makeBoolean(argnum.eql(var_position) && (NIL != member(format, $list207, UNPROVIDED, UNPROVIDED)));
                        } else {
                            cdestructuring_bind_error(datum, $list206);
                        }
                        csome_list_var = csome_list_var.rest();
                        pair = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return single_entryP;
    }

    public static SubLObject rkf_salient_property_sentence_from_justification(final SubLObject v_term, final SubLObject justification) {
        if (NIL != rkf_salient_descriptor_rule_spec_p(justification)) {
            return rkf_justification_sentence_from_rule_spec(v_term, justification);
        }
        if (NIL != arguments.supports_p(justification)) {
            SubLObject conjuncts = NIL;
            SubLObject cdolist_list_var = justification;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject support_sentence = arguments.support_sentence(support);
                if (NIL != cycl_utilities.expression_find(v_term, support_sentence, NIL, symbol_function(EQUAL), UNPROVIDED)) {
                    conjuncts = cons(support_sentence, conjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            return rkf_sd_conjoin(conjuncts, T, NIL);
        }
        return NIL;
    }

    public static SubLObject rkf_sd_conjoin(final SubLObject conjuncts, SubLObject simplifyP, SubLObject uniquifyP) {
        if (simplifyP == UNPROVIDED) {
            simplifyP = NIL;
        }
        if (uniquifyP == UNPROVIDED) {
            uniquifyP = NIL;
        }
        final SubLObject pcase_var = length(conjuncts);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return conjuncts.first();
        }
        final SubLObject uniquified_conjuncts = (NIL != uniquifyP) ? rkf_sd_uniquify_conjuncts(conjuncts) : conjuncts;
        return simplifier.conjoin(uniquified_conjuncts, simplifyP);
    }

    public static SubLObject rkf_sd_uniquify_conjuncts(final SubLObject conjuncts) {
        SubLObject new_conjuncts = NIL;
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != new_conjuncts) {
                SubLObject cdolist_list_var_$148 = cycl_utilities.expression_gather(conjunct, $sym148$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject el_var = NIL;
                el_var = cdolist_list_var_$148.first();
                while (NIL != cdolist_list_var_$148) {
                    if (NIL != subl_promotions.memberP(el_var, new_conjuncts, EXPRESSION_FIND, UNPROVIDED)) {
                        final SubLObject replacement_var = czer_utilities.unique_el_var_wrt_expression(new_conjuncts, el_var);
                        conjunct = cycl_utilities.formula_subst(replacement_var, el_var, conjunct, UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                    el_var = cdolist_list_var_$148.first();
                } 
            }
            new_conjuncts = cons(conjunct, new_conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return nreverse(new_conjuncts);
    }

    public static SubLObject rkf_salient_descriptor_subprompts_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.every_in_list(RKF_SALIENT_DESCRIPTOR_SUBPROMPT_P, v_object, UNPROVIDED)));
    }

    public static SubLObject rkf_salient_descriptor_subprompt_p(final SubLObject v_object) {
        return makeBoolean((v_object.isList() && v_object.first().isKeyword()) && (NIL != member(v_object.first(), $list212, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject rkf_salient_descriptor_subprompt_assert_sentence(final SubLObject subprompt, SubLObject v_term, SubLObject var_to_specify) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (var_to_specify == UNPROVIDED) {
            var_to_specify = NIL;
        }
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql($CONFIRM)) {
            SubLObject template = second(subprompt);
            final SubLObject constraints = rkf_salient_descriptor_subprompt_constraint_sentence(subprompt);
            if (NIL != var_to_specify) {
                if (NIL != formula_pattern_match.formula_matches_pattern(template, listS($$thereExists, var_to_specify, $list214))) {
                    template = cycl_utilities.formula_arg2(template, UNPROVIDED);
                }
                template = rkf_sd_remove_constraints(template, constraints);
                return cycl_utilities.expression_subst(v_term, var_to_specify, template, UNPROVIDED, UNPROVIDED);
            }
            return template;
        } else {
            if ((!pcase_var.eql($CHOICE)) && (!pcase_var.eql($SPECIFY))) {
                return NIL;
            }
            final SubLObject template = fourth(subprompt);
            if (NIL != var_to_specify) {
                return cycl_utilities.expression_subst(v_term, var_to_specify, template, UNPROVIDED, UNPROVIDED);
            }
            return template;
        }
    }

    public static SubLObject rkf_salient_descriptor_subprompt_var(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql($CONFIRM)) {
            return third(subprompt);
        }
        if (pcase_var.eql($SPECIFY)) {
            return second(subprompt);
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_subprompt_known_check_sentence(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql($CONFIRM) || pcase_var.eql($CHOICE)) {
            return rkf_salient_descriptor_subprompt_assert_sentence(subprompt, UNPROVIDED, UNPROVIDED);
        }
        if (pcase_var.eql($SPECIFY)) {
            final SubLObject var = second(subprompt);
            final SubLObject var_constraint = list($$unknownSentence, listS($$isa, var, $list217));
            return rkf_sd_conjoin(list(fourth(subprompt), var_constraint), NIL, NIL);
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_subprompt_constraint_sentence(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql($CONFIRM)) {
            return fifth(subprompt);
        }
        if (pcase_var.eql($CHOICE) || pcase_var.eql($SPECIFY)) {
            return third(subprompt);
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_subprompt_examples(final SubLObject subprompt) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql($CONFIRM)) {
            return fourth(subprompt);
        }
        if (pcase_var.eql($SPECIFY)) {
            return fifth(subprompt);
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_subprompt_set_examples(final SubLObject subprompt, final SubLObject examples) {
        final SubLObject pcase_var = rkf_salient_descriptor_subprompt_type(subprompt);
        if (pcase_var.eql($CONFIRM)) {
            return set_nth(THREE_INTEGER, subprompt, examples);
        }
        if (pcase_var.eql($SPECIFY)) {
            return set_nth(FOUR_INTEGER, subprompt, examples);
        }
        return NIL;
    }

    public static SubLObject rkf_salient_descriptor_subprompt_type(final SubLObject subprompt) {
        return subprompt.first();
    }

    public static SubLObject rkf_salient_descriptor_subprompt_from_formula(final SubLObject formula, final SubLObject v_term, SubLObject mt, SubLObject salient_property_sentence) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (salient_property_sentence == UNPROVIDED) {
            salient_property_sentence = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject examples = rkf_sd_examples(formula, v_term, mt, salient_property_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject var = thread.secondMultipleValue();
        final SubLObject constraint_sentence = thread.thirdMultipleValue();
        final SubLObject assert_sentence = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return list($CONFIRM, formula, var, examples, constraint_sentence);
    }

    public static SubLObject rkf_salient_descriptor_followups(final SubLObject formula, final SubLObject v_term, SubLObject mt, SubLObject salient_property_sentence) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (salient_property_sentence == UNPROVIDED) {
            salient_property_sentence = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject body = rkf_sd_possibly_existentially_unbind(formula);
        final SubLObject v_variables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != formula_pattern_match.formula_matches_pattern(body, $list218)) {
            final SubLObject isa_sentence = cycl_utilities.formula_arg1(body, UNPROVIDED);
            final SubLObject non_instance = cycl_utilities.atomic_sentence_arg1(isa_sentence, UNPROVIDED);
            final SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_sentence, UNPROVIDED);
            final SubLObject isas = isa.isa(non_instance, mt, $$True_JustificationTruth);
            SubLObject disjoint_sentences = NIL;
            SubLObject cdolist_list_var = isas;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = make_binary_formula($$disjointWith, v_isa, collection);
                if (NIL == member(item_var, disjoint_sentences, symbol_function(EQL), symbol_function(IDENTITY))) {
                    disjoint_sentences = cons(item_var, disjoint_sentences);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
            return list(list($STRENGTHEN, disjoint_sentences));
        }
        SubLObject followups_for_variables = NIL;
        SubLObject cdolist_list_var2 = v_variables;
        SubLObject variable = NIL;
        variable = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            followups_for_variables = cons(rkf_salient_descriptor_followup_for_variable(body, v_term, variable, mt, salient_property_sentence), followups_for_variables);
            cdolist_list_var2 = cdolist_list_var2.rest();
            variable = cdolist_list_var2.first();
        } 
        return nreverse(followups_for_variables);
    }

    public static SubLObject rkf_salient_descriptor_followup_for_variable(final SubLObject formula, final SubLObject v_term, final SubLObject variable, final SubLObject mt, final SubLObject salient_property_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subform = rkf_salient_descriptor_assert_formula(formula);
        final SubLObject complete_coll_bindings = rkf_salient_descriptor_complete_coll_bindings(variable, subform, mt);
        final SubLObject small_set_bindings = (NIL != complete_coll_bindings) ? NIL : rkf_salient_descriptor_small_set_bindings(variable, subform);
        if (NIL != complete_coll_bindings) {
            final SubLObject col = bindings.subst_bindings(complete_coll_bindings, variables.find_variable_by_id(ZERO_INTEGER));
            final SubLObject assert_formula = bindings.subst_bindings(complete_coll_bindings, variables.find_variable_by_id(ONE_INTEGER));
            final SubLObject all_fort_instances = rkf_ontology_utilities.rkf_all_fort_instances(col, mt);
            return list($CHOICE, variable, all_fort_instances, assert_formula);
        }
        if (NIL != small_set_bindings) {
            final SubLObject elements = bindings.subst_bindings(small_set_bindings, variables.find_variable_by_id(ONE_INTEGER));
            final SubLObject assert_formula = bindings.subst_bindings(small_set_bindings, variables.find_variable_by_id(ZERO_INTEGER));
            return list($CHOICE, variable, elements, assert_formula);
        }
        thread.resetMultipleValues();
        final SubLObject examples = rkf_sd_examples(formula, v_term, mt, salient_property_sentence, NIL, $ALL, variable, UNPROVIDED);
        final SubLObject examples_var = thread.secondMultipleValue();
        final SubLObject variable_constraints = thread.thirdMultipleValue();
        final SubLObject assert_sentence = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return list($SPECIFY, variable, variable_constraints, assert_sentence, examples);
    }

    public static SubLObject rkf_sd_examples_internal(final SubLObject formula, final SubLObject v_term, final SubLObject mt, final SubLObject salient_property_sentence, SubLObject used_examples, SubLObject include_types, SubLObject variable, SubLObject num_of_examples) {
        if (used_examples == UNPROVIDED) {
            used_examples = NIL;
        }
        if (include_types == UNPROVIDED) {
            include_types = $ALL;
        }
        if (variable == UNPROVIDED) {
            variable = NIL;
        }
        if (num_of_examples == UNPROVIDED) {
            num_of_examples = (NIL != rkf_macros.rkf_generate_examplesP()) ? $rkf_examples_to_show$.getDynamicValue() : ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        thread.resetMultipleValues();
        final SubLObject body = rkf_sd_possibly_existentially_unbind(formula);
        final SubLObject v_variables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != variable) {
            if (NIL == subl_promotions.memberP(variable, v_variables, symbol_function(EQ), UNPROVIDED)) {
                return values($NOT_TRIED, variable, NIL, body);
            }
        } else {
            if (NIL == list_utilities.singletonP(v_variables)) {
                return values($NOT_TRIED, v_variables, NIL, body);
            }
            variable = v_variables.first();
        }
        final SubLObject subform = rkf_salient_descriptor_assert_formula(body);
        final SubLObject variable_constraints = rkf_tools.rkf_type_constraints(variable, subform, mt);
        final SubLObject assert_sentence = subform;
        final SubLObject salient_property = properties.sentence_to_property(salient_property_sentence, v_term);
        final SubLObject examples = (num_of_examples.numG(ONE_INTEGER)) ? rkf_example_instances(variable, assert_sentence, v_term, variable_constraints, salient_property, mt, num_of_examples, used_examples, include_types) : $NOT_TRIED;
        return values(examples, variable, variable_constraints, assert_sentence);
    }

    public static SubLObject rkf_sd_examples(final SubLObject formula, final SubLObject v_term, final SubLObject mt, final SubLObject salient_property_sentence, SubLObject used_examples, SubLObject include_types, SubLObject variable, SubLObject num_of_examples) {
        if (used_examples == UNPROVIDED) {
            used_examples = NIL;
        }
        if (include_types == UNPROVIDED) {
            include_types = $ALL;
        }
        if (variable == UNPROVIDED) {
            variable = NIL;
        }
        if (num_of_examples == UNPROVIDED) {
            num_of_examples = (NIL != rkf_macros.rkf_generate_examplesP()) ? $rkf_examples_to_show$.getDynamicValue() : ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_sd_examples_internal(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SD_EXAMPLES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SD_EXAMPLES, EIGHT_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SD_EXAMPLES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_8(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples);
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
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (salient_property_sentence.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (used_examples.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (include_types.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (variable.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && num_of_examples.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_sd_examples_internal(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, v_term, mt, salient_property_sentence, used_examples, include_types, variable, num_of_examples));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_sd_precedent_query_sentence(final SubLObject new_var, final SubLObject v_term, final SubLObject knowledge_gap_sentence, SubLObject salient_property) {
        if (salient_property == UNPROVIDED) {
            salient_property = NIL;
        }
        SubLObject combined = (NIL != salient_property) ? rkf_sd_add_salient_property(knowledge_gap_sentence, salient_property, v_term) : knowledge_gap_sentence;
        if ((NIL != formula_pattern_match.formula_matches_pattern(knowledge_gap_sentence, listS($FORT, v_term, $list226))) && (NIL != formula_pattern_match.formula_matches_pattern(salient_property, $list227))) {
            final SubLObject rai_knowledge_gap_sentence = make_el_formula($$relationAllInstance, cycl_utilities.formula_terms(knowledge_gap_sentence, UNPROVIDED), UNPROVIDED);
            final SubLObject genls_property = properties.sentence_to_property(make_el_formula($$genls, cycl_utilities.formula_args(properties.property_to_sentence(salient_property, v_term), UNPROVIDED), UNPROVIDED), v_term);
            final SubLObject rai_combined = rkf_sd_add_salient_property(rai_knowledge_gap_sentence, genls_property, v_term);
            combined = simplifier.disjoin(list(combined, rai_combined), UNPROVIDED);
        }
        return cycl_utilities.expression_subst(new_var, v_term, combined, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_sd_add_salient_property(final SubLObject knowledge_gap_sentence, final SubLObject salient_property, final SubLObject v_term) {
        SubLObject salient_property_sentence = properties.property_to_sentence(salient_property, v_term);
        if (ZERO_INTEGER.eql(rkf_example_instances_backchain_level())) {
            salient_property_sentence = rkf_sd_add_known_sentence(salient_property_sentence);
        }
        return rkf_sd_conjoin(list(knowledge_gap_sentence, salient_property_sentence), T, NIL);
    }

    public static SubLObject rkf_sd_add_known_sentence(final SubLObject sentence) {
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(sentence)) {
            return make_unary_formula($$knownSentence, sentence);
        }
        if (NIL != el_conjunction_p(sentence)) {
            return simplifier.conjoin(Mapping.mapcar(RKF_SD_ADD_KNOWN_SENTENCE, cycl_utilities.formula_args(sentence, UNPROVIDED)), UNPROVIDED);
        }
        return sentence;
    }

    public static SubLObject rkf_sd_remove_constraints(final SubLObject subform, final SubLObject variable_constraints) {
        if (NIL != el_conjunction_p(subform)) {
            SubLObject assert_conjuncts = NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_args(subform, UNPROVIDED);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == cycl_utilities.expression_find(conjunct, variable_constraints, NIL, symbol_function(EQUAL), UNPROVIDED)) {
                    assert_conjuncts = cons(conjunct, assert_conjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            return rkf_sd_conjoin(assert_conjuncts, NIL, NIL);
        }
        return subform;
    }

    public static SubLObject rkf_salient_descriptor_complete_coll_bindings(final SubLObject variable, final SubLObject subform, final SubLObject mt) {
        final SubLObject conjuncts = list(list($$isa, $VAR, variables.find_variable_by_id(ZERO_INTEGER)), variables.find_variable_by_id(ONE_INTEGER));
        final SubLObject v_bindings = rkf_salient_descriptor_bindings(variable, subform, conjuncts, $sym232$RKF_SD_COMPLETE_COLL_BINDINGS_OK_, mt);
        return v_bindings;
    }

    public static SubLObject rkf_sd_complete_coll_bindings_okP(final SubLObject v_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == v_bindings) {
            return NIL;
        }
        final SubLObject col = bindings.subst_bindings(v_bindings, variables.find_variable_by_id(ZERO_INTEGER));
        return makeBoolean(((NIL != forts.fort_p(col)) && (NIL != kb_accessors.completely_enumerable_collectionP(col, mt))) && (NIL != list_utilities.lengthLE(rkf_ontology_utilities.rkf_all_fort_instances(col, mt), $rkf_choice_count_cutoff$.getDynamicValue(thread), UNPROVIDED)));
    }

    public static SubLObject rkf_salient_descriptor_small_set_bindings(final SubLObject variable, final SubLObject subform) {
        final SubLObject conjuncts = list(variables.find_variable_by_id(ZERO_INTEGER), list($$elementOf, $VAR, bq_cons($$TheSet, variables.find_variable_by_id(ONE_INTEGER))));
        final SubLObject v_bindings = rkf_salient_descriptor_bindings(variable, subform, conjuncts, $sym235$RKF_SD_SMALL_SET_BINDINGS_OK_, UNPROVIDED);
        return v_bindings;
    }

    public static SubLObject rkf_sd_small_set_bindings_okP(final SubLObject v_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == v_bindings) {
            return NIL;
        }
        final SubLObject elements = bindings.subst_bindings(v_bindings, variables.find_variable_by_id(ONE_INTEGER));
        return list_utilities.lengthLE(elements, $rkf_choice_count_cutoff$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject rkf_salient_descriptor_bindings(final SubLObject variable, final SubLObject subform, final SubLObject conjuncts, final SubLObject test, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject v_bindings = unification_utilities.term_unify(cycl_utilities.expression_subst(variable, $VAR, make_conjunction(conjuncts), UNPROVIDED, UNPROVIDED), subform, UNPROVIDED, UNPROVIDED);
        if (NIL != funcall(test, v_bindings, mt)) {
            return v_bindings;
        }
        final SubLObject backward_bindings = unification_utilities.term_unify(cycl_utilities.expression_subst(variable, $VAR, make_conjunction(nreverse(conjuncts)), UNPROVIDED, UNPROVIDED), subform, UNPROVIDED, UNPROVIDED);
        return NIL != funcall(test, backward_bindings, mt) ? backward_bindings : NIL;
    }

    public static SubLObject rkf_salient_descriptor_assert_formula(final SubLObject formula) {
        if (NIL == el_conjunction_p(formula)) {
            return formula;
        }
        SubLObject conjuncts = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject subform = NIL;
        subform = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == rkf_salient_descriptor_not_assertible_sentenceP(subform)) {
                conjuncts = cons(subform, conjuncts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subform = cdolist_list_var.first();
        } 
        return rkf_sd_conjoin(nreverse(conjuncts), T, NIL);
    }

    public static SubLObject rkf_salient_descriptor_not_assertible_sentenceP(final SubLObject conjunct) {
        if (NIL != cycl_grammar.cycl_atomic_sentence_p(conjunct)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(conjunct);
            final SubLObject not_assertibleP = list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(predicate, $$notAssertible, ONE_INTEGER, ONE_INTEGER, UNPROVIDED));
            return not_assertibleP;
        }
        return NIL;
    }

    public static SubLObject rkf_generate_interaction_example_instances_formula(final SubLObject variable, final SubLObject mt) {
        return list_to_elf(list($$or, list($$termDependsOn, variable, mt), list($$uiaDisplayTerm, variable, mt)));
    }

    public static SubLObject rkf_example_instances_backchain_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_example_instances_backchain_level$.getDynamicValue(thread);
    }

    public static SubLObject rkf_example_instances(final SubLObject variable, final SubLObject knowledge_gap_sentence, final SubLObject v_term, final SubLObject constraints, final SubLObject salient_property, final SubLObject mt, SubLObject how_many, SubLObject used_examples, SubLObject include_types) {
        if (how_many == UNPROVIDED) {
            how_many = THREE_INTEGER;
        }
        if (used_examples == UNPROVIDED) {
            used_examples = NIL;
        }
        if (include_types == UNPROVIDED) {
            include_types = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject examples = NIL;
        final SubLObject focal_term_analog_var = czer_utilities.unique_el_var_wrt_expression(knowledge_gap_sentence, UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$149 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject reuse_existingP = rkf_sd_problem_store_okP($rkf_sd_problem_store$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0_$150 = $rkf_sd_problem_store$.currentBinding(thread);
                    try {
                        $rkf_sd_problem_store$.bind(rkf_sd_find_or_make_problem_store(), thread);
                        final SubLObject store = $rkf_sd_problem_store$.getDynamicValue(thread);
                        try {
                            SubLObject adjusted_how_many = rkf_sd_examples_adjusted_number_constraint(how_many);
                            final SubLObject local_terms = (NIL != rkf_example_types_include_type_p(include_types, $CONSTRAINT_MATCHER)) ? rkf_local_example_instances(variable, v_term, constraints, mt, adjusted_how_many, used_examples, focal_term_analog_var) : NIL;
                            SubLObject precedents = NIL;
                            if (NIL != rkf_example_types_include_type_p(include_types, $PRECEDENT)) {
                                final SubLObject precedent_query_sentence = rkf_sd_precedent_query_sentence(focal_term_analog_var, v_term, knowledge_gap_sentence, salient_property);
                                precedents = rkf_asserted_example_instances(variable, precedent_query_sentence, mt, how_many, used_examples, focal_term_analog_var);
                            }
                            examples = rkf_add_examples(intersection(local_terms, precedents, symbol_function(EQUAL), RKF_SD_EXAMPLE_TERM), variable, knowledge_gap_sentence, mt, examples, how_many, UNPROVIDED);
                            examples = rkf_add_examples(local_terms, variable, knowledge_gap_sentence, mt, examples, how_many, UNPROVIDED);
                            examples = rkf_add_examples(precedents, variable, knowledge_gap_sentence, mt, examples, how_many, UNPROVIDED);
                            adjusted_how_many = rkf_sd_examples_adjusted_number_constraint(subtract(how_many, length(examples)));
                            if (adjusted_how_many.isPositive() && (NIL != rkf_example_types_include_type_p(include_types, $CONSTRAINT_MATCHER))) {
                                final SubLObject constraint_matchers = rkf_example_instances_ask(variable, constraints, mt, adjusted_how_many, $CONSTRAINT_MATCHER, used_examples, focal_term_analog_var);
                                examples = rkf_add_examples(constraint_matchers, variable, knowledge_gap_sentence, mt, examples, how_many, UNPROVIDED);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$151 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL == reuse_existingP) {
                                    rkf_sd_free_problem_store(store);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$151, thread);
                            }
                        }
                    } finally {
                        $rkf_sd_problem_store$.rebind(_prev_bind_0_$150, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$149, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$152 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$152, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.first_n(how_many, examples);
    }

    public static SubLObject rkf_sd_examples_adjusted_number_constraint(final SubLObject how_many) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fudge_factor = (NIL != $rkf_example_instances_wff_checkP$.getDynamicValue(thread)) ? FOUR_INTEGER : ONE_INTEGER;
        return multiply(how_many, fudge_factor);
    }

    public static SubLObject rkf_asserted_example_instances(final SubLObject variable, final SubLObject precedent_query_sentence, final SubLObject mt, final SubLObject how_many, final SubLObject used_examples, final SubLObject focal_term_analog_var) {
        return rkf_example_instances_ask(variable, precedent_query_sentence, mt, how_many, $PRECEDENT, used_examples, focal_term_analog_var);
    }

    public static SubLObject rkf_local_example_instances(final SubLObject variable, final SubLObject v_term, final SubLObject constraints, final SubLObject mt, final SubLObject how_many, final SubLObject used_examples, final SubLObject focal_term_analog_var) {
        final SubLObject local_terms_query_sentence = rkf_generate_interaction_example_instances_formula(variable, mt);
        final SubLObject constrained_local_query_sentence = (NIL != el_formula_p(constraints)) ? rkf_sd_conjoin(list(constraints, local_terms_query_sentence), NIL, NIL) : local_terms_query_sentence;
        final SubLObject local_terms = remove(v_term, rkf_example_instances_ask(variable, constrained_local_query_sentence, mt, how_many, $CONSTRAINT_MATCHER, used_examples, focal_term_analog_var), symbol_function(EQUAL), RKF_SD_EXAMPLE_TERM, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return local_terms;
    }

    public static SubLObject rkf_example_types_include_type_p(final SubLObject include_types, final SubLObject type) {
        return makeBoolean((include_types == $ALL) || (NIL != member(type, include_types, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject rkf_add_examples(final SubLObject candidates, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt, final SubLObject examples, final SubLObject how_many, SubLObject further_constraint_sentence) {
        if (further_constraint_sentence == UNPROVIDED) {
            further_constraint_sentence = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject how_many_more = subtract(how_many, length(examples));
        SubLObject enoughP = makeBoolean(!how_many_more.isPositive());
        SubLObject new_examples = NIL;
        if (NIL == enoughP) {
            SubLObject csome_list_var = candidates;
            SubLObject candidate = NIL;
            candidate = csome_list_var.first();
            while ((NIL == enoughP) && (NIL != csome_list_var)) {
                if (((((NIL == rkf_example_in_examplesP(candidate, examples)) && (NIL == rkf_example_in_examplesP(candidate, new_examples))) && ((NIL == el_formula_p(further_constraint_sentence)) || (NIL != rkf_sd_known(cycl_utilities.expression_subst(rkf_salient_descriptor_datastructures.rkf_sd_example_term(candidate), var, further_constraint_sentence, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED)))) && (($CONSTRAINT_MATCHER != rkf_salient_descriptor_datastructures.rkf_sd_example_type(candidate)) || (NIL != rkf_example_not_known_falseP(candidate, var, knowledge_gap_sentence, mt)))) && ((NIL == $rkf_example_instances_wff_checkP$.getDynamicValue(thread)) || (NIL != rkf_example_wffP(candidate, var, knowledge_gap_sentence, mt)))) {
                    new_examples = cons(candidate, new_examples);
                    enoughP = list_utilities.lengthGE(new_examples, how_many_more, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            } 
        }
        return nconc(examples, nreverse(new_examples));
    }

    public static SubLObject rkf_example_in_examplesP(final SubLObject candidate, final SubLObject examples) {
        return subl_promotions.memberP(rkf_salient_descriptor_datastructures.rkf_sd_example_term(candidate), examples, symbol_function(EQUAL), symbol_function(RKF_SD_EXAMPLE_TERM));
    }

    public static SubLObject rkf_example_not_known_falseP(final SubLObject example, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject example_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(example);
        final SubLObject ask_sentence = make_negation(cycl_utilities.expression_subst(example_term, var, knowledge_gap_sentence, UNPROVIDED, UNPROVIDED));
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $rkf_sd_known_time_cutoff$.currentBinding(thread);
        try {
            $rkf_sd_known_time_cutoff$.bind($rkf_example_not_known_false_time_cutoff$.getDynamicValue(thread).isNumber() ? min($rkf_sd_known_time_cutoff$.getDynamicValue(thread), $rkf_example_not_known_false_time_cutoff$.getDynamicValue(thread)) : $rkf_sd_known_time_cutoff$.getDynamicValue(thread), thread);
            result = makeBoolean(NIL == rkf_sd_known(ask_sentence, mt, UNPROVIDED));
        } finally {
            $rkf_sd_known_time_cutoff$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rkf_example_wffP(final SubLObject example, final SubLObject var, final SubLObject knowledge_gap_sentence, final SubLObject mt) {
        final SubLObject example_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(example);
        final SubLObject ask_sentence = cycl_utilities.expression_subst(example_term, var, knowledge_gap_sentence, UNPROVIDED, UNPROVIDED);
        return rkf_example_wffP_int(ask_sentence, mt);
    }

    public static SubLObject rkf_example_wffP_int_internal(final SubLObject ask_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$153 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $suppress_conflict_noticesP$.currentBinding(thread);
                    try {
                        wff_vars.$validate_expansionsP$.bind(T, thread);
                        $suppress_conflict_noticesP$.bind(T, thread);
                        result = wff.el_wff_assertibleP(ask_sentence, mt, UNPROVIDED);
                    } finally {
                        $suppress_conflict_noticesP$.rebind(_prev_bind_2, thread);
                        wff_vars.$validate_expansionsP$.rebind(_prev_bind_0_$153, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    public static SubLObject rkf_example_wffP_int(final SubLObject ask_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_example_wffP_int_internal(ask_sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym243$RKF_EXAMPLE_WFF__INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym243$RKF_EXAMPLE_WFF__INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym243$RKF_EXAMPLE_WFF__INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(ask_sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (ask_sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_example_wffP_int_internal(ask_sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(ask_sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rkf_example_instances_ask_properties(final SubLObject how_many, final SubLObject how_many_known) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fudge_factor = TWO_INTEGER;
        if (NIL == $rkf_example_instances_wff_checkP$.getDynamicValue(thread)) {
            fudge_factor = ONE_INTEGER;
        }
        return list(new SubLObject[]{ $PROBLEM_STORE, rkf_sd_find_or_make_problem_store(), $ANSWER_LANGUAGE, $HL, $kw103$CACHE_INFERENCE_RESULTS_, NIL, $RESULT_UNIQUENESS, $BINDINGS, $RETURN, $BINDINGS_AND_SUPPORTS, $MAX_NUMBER, add(how_many_known, multiply(fudge_factor, how_many)), $kw159$FORGET_EXTRA_RESULTS_, T, $MAX_TIME, $rkf_example_instances_time_cutoff$.getDynamicValue(thread), $PRODUCTIVITY_LIMIT, $int$100000, $MAX_TRANSFORMATION_DEPTH, rkf_example_instances_backchain_level() });
    }

    public static SubLObject rkf_example_instances_ask(final SubLObject variable, SubLObject formula, final SubLObject mt, final SubLObject how_many, final SubLObject example_type, SubLObject used_examples, final SubLObject focal_term_analog_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cycl_utilities.expression_find(variable, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var = sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!var.eql(variable)) && (!var.eql(focal_term_analog_var))) {
                formula = make_existential(var, formula);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        SubLObject ans = NIL;
        SubLObject enoughP = list_utilities.lengthGE(ans, how_many, UNPROVIDED);
        final SubLObject v_properties = rkf_example_instances_ask_properties(how_many, length(used_examples));
        SubLObject candidates = NIL;
        if (NIL == enoughP) {
            thread.resetMultipleValues();
            final SubLObject ask_results = inference_kernel.new_cyc_query(formula, mt, v_properties);
            final SubLObject exit_condition = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (($MAX_TIME == exit_condition) && $rkf_example_instances_time_cutoff$.getDynamicValue(thread).isPositive()) {
                Errors.warn($str246$__RKF_EXAMPLE_INSTANCES_ASK_timed, $rkf_example_instances_time_cutoff$.getDynamicValue(thread), formula, mt);
            }
            SubLObject cdolist_list_var2 = ask_results;
            SubLObject ask_result = NIL;
            ask_result = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = ask_result;
                SubLObject v_bindings = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list184);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list184);
                supports = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject v_term = bindings.variable_lookup(variable, v_bindings);
                    final SubLObject focal_term_analog = bindings.variable_lookup(focal_term_analog_var, v_bindings);
                    if ((NIL == subl_promotions.memberP(v_term, candidates, symbol_function(EQUAL), RKF_SD_EXAMPLE_TERM)) && (NIL == member(v_term, used_examples, symbol_function(EQUAL), RKF_SD_EXAMPLE_TERM))) {
                        final SubLObject example = rkf_salient_descriptor_datastructures.new_rkf_sd_example(example_type, v_term, supports, focal_term_analog);
                        candidates = cons(example, candidates);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list184);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                ask_result = cdolist_list_var2.first();
            } 
        }
        candidates = Sort.sort(candidates, $sym247$GENERALITY_ESTIMATE_, RKF_SD_EXAMPLE_TERM);
        if (NIL == enoughP) {
            SubLObject csome_list_var = candidates;
            SubLObject candidate = NIL;
            candidate = csome_list_var.first();
            while ((NIL == enoughP) && (NIL != csome_list_var)) {
                if (NIL == rkf_bad_exampleP(candidate, mt)) {
                    ans = cons(candidate, ans);
                    enoughP = list_utilities.lengthGE(ans, how_many, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            } 
        }
        ans = Sort.sort(ans, $sym248$RKF_BETTER_EXAMPLE_, UNPROVIDED);
        if ((NIL == ans) && (NIL != el_disjunction_p(formula))) {
            SubLObject cdolist_list_var3 = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                final SubLObject _prev_bind_0 = $rkf_sd_problem_store$.currentBinding(thread);
                try {
                    $rkf_sd_problem_store$.bind($BUG_WORKAROUND, thread);
                    final SubLObject new_examples = rkf_example_instances_ask(variable, disjunct, mt, how_many, example_type, used_examples, focal_term_analog_var);
                    ans = used_examples = append(ans, new_examples);
                } finally {
                    $rkf_sd_problem_store$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                disjunct = cdolist_list_var3.first();
            } 
        }
        return list_utilities.first_n(how_many, ans);
    }

    public static SubLObject rkf_bad_exampleP(final SubLObject candidate, final SubLObject mt) {
        final SubLObject v_term = rkf_salient_descriptor_datastructures.rkf_sd_example_term(candidate);
        return makeBoolean((NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, mt)) || (NIL != kb_accessors.indeterminate_termP(v_term)));
    }

    public static SubLObject rkf_better_exampleP(final SubLObject ex1, final SubLObject ex2) {
        final SubLObject term1 = rkf_salient_descriptor_datastructures.rkf_sd_example_term(ex1);
        final SubLObject term2 = rkf_salient_descriptor_datastructures.rkf_sd_example_term(ex2);
        if ((NIL != constant_p(term1)) && (NIL == constant_p(term2))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_rkf_salient_descriptor_file() {
        declareFunction(me, "rkf_salient_descriptor_formula_type_p", "RKF-SALIENT-DESCRIPTOR-FORMULA-TYPE-P", 1, 0, false);
        declareFunction(me, "rkf_salient_formulas", "RKF-SALIENT-FORMULAS", 2, 1, false);
        declareFunction(me, "rkf_salient_requirements", "RKF-SALIENT-REQUIREMENTS", 1, 1, false);
        declareFunction(me, "rkf_salient_strong_suggestions", "RKF-SALIENT-STRONG-SUGGESTIONS", 1, 1, false);
        declareFunction(me, "rkf_salient_weak_suggestions", "RKF-SALIENT-WEAK-SUGGESTIONS", 1, 1, false);
        declareFunction(me, "rkf_salient_neighbor_suggestions", "RKF-SALIENT-NEIGHBOR-SUGGESTIONS", 1, 1, false);
        declareFunction(me, "rkf_salient_descriptor", "RKF-SALIENT-DESCRIPTOR", 1, 2, false);
        declareFunction(me, "rkf_salient_descriptor_parallel", "RKF-SALIENT-DESCRIPTOR-PARALLEL", 1, 1, false);
        declareFunction(me, "rkf_requirements", "RKF-REQUIREMENTS", 1, 1, false);
        declareFunction(me, "rkf_strong_suggestions", "RKF-STRONG-SUGGESTIONS", 1, 1, false);
        declareFunction(me, "rkf_neighbor_suggestions", "RKF-NEIGHBOR-SUGGESTIONS", 1, 1, false);
        declareFunction(me, "rkf_weak_suggestions", "RKF-WEAK-SUGGESTIONS", 1, 1, false);
        declareFunction(me, "rkf_interaction_requirements", "RKF-INTERACTION-REQUIREMENTS", 1, 1, false);
        declareFunction(me, "rkf_interaction_strong_suggestions", "RKF-INTERACTION-STRONG-SUGGESTIONS", 1, 1, false);
        declareMacro(me, "with_rkf_sd_memoization", "WITH-RKF-SD-MEMOIZATION");
        declareFunction(me, "rkf_induced_salient_descriptor_query_sentences", "RKF-INDUCED-SALIENT-DESCRIPTOR-QUERY-SENTENCES", 1, 1, false);
        declareFunction(me, "rkf_sd_justifications_from_basis_properties", "RKF-SD-JUSTIFICATIONS-FROM-BASIS-PROPERTIES", 3, 0, false);
        declareFunction(me, "rkf_close_isas", "RKF-CLOSE-ISAS", 2, 0, false);
        declareFunction(me, "rkf_close_genls", "RKF-CLOSE-GENLS", 2, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_meta_isas", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISAS", 3, 2, false);
        declareFunction(me, "rkf_make_meta_isa_formula", "RKF-MAKE-META-ISA-FORMULA", 2, 0, false);
        declareFunction(me, "rkf_make_bin_pred_formula", "RKF-MAKE-BIN-PRED-FORMULA", 2, 0, false);
        declareFunction(me, "rkf_make_salient_descriptor_rule", "RKF-MAKE-SALIENT-DESCRIPTOR-RULE", 4, 0, false);
        declareFunction(me, "rkf_salient_descriptor_meta_isa_type_violationP_internal", "RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?-INTERNAL", 3, 0, false);
        declareFunction(me, "rkf_salient_descriptor_meta_isa_type_violationP", "RKF-SALIENT-DESCRIPTOR-META-ISA-TYPE-VIOLATION?", 3, 0, false);
        declareFunction(me, "rkf_salient_descriptor_type_specs_internal", "RKF-SALIENT-DESCRIPTOR-TYPE-SPECS-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_type_specs", "RKF-SALIENT-DESCRIPTOR-TYPE-SPECS", 2, 0, false);
        declareMacro(me, "reusing_rkf_sd_problem_store", "REUSING-RKF-SD-PROBLEM-STORE");
        declareFunction(me, "rkf_sd_problem_store_okP", "RKF-SD-PROBLEM-STORE-OK?", 1, 0, false);
        declareFunction(me, "rkf_sd_problem_store_checkpoint_currentP", "RKF-SD-PROBLEM-STORE-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction(me, "rkf_sd_problem_store_checkpoint", "RKF-SD-PROBLEM-STORE-CHECKPOINT", 1, 0, false);
        declareFunction(me, "rkf_sd_find_or_make_problem_store", "RKF-SD-FIND-OR-MAKE-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "rkf_sd_make_problem_store", "RKF-SD-MAKE-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "rkf_sd_free_problem_store", "RKF-SD-FREE-PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_common_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-COMMON-PROPERTIES", 2, 2, false);
        declareFunction(me, "rkf_induced_salient_descriptor_common_properties_int", "RKF-INDUCED-SALIENT-DESCRIPTOR-COMMON-PROPERTIES-INT", 3, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_bin_pred_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-BIN-PRED-PROPERTIES", 4, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_bin_pred_info", "RKF-INDUCED-SALIENT-DESCRIPTOR-BIN-PRED-INFO", 4, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_meta_isa_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISA-PROPERTIES", 3, 0, false);
        declareFunction(me, "rkf_known_meta_isas_from_basis_properties", "RKF-KNOWN-META-ISAS-FROM-BASIS-PROPERTIES", 2, 0, false);
        declareFunction(me, "rkf_known_meta_isas_from_basis_property", "RKF-KNOWN-META-ISAS-FROM-BASIS-PROPERTY", 2, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_meta_isa_info", "RKF-INDUCED-SALIENT-DESCRIPTOR-META-ISA-INFO", 3, 0, false);
        declareFunction(me, "rkf_sd_deconstruct_basis_property", "RKF-SD-DECONSTRUCT-BASIS-PROPERTY", 1, 0, false);
        declareFunction(me, "rkf_sd_construct_basis_property", "RKF-SD-CONSTRUCT-BASIS-PROPERTY", 2, 0, false);
        declareFunction(me, "rkf_sd_properties_from_bin_pred_info", "RKF-SD-PROPERTIES-FROM-BIN-PRED-INFO", 1, 0, false);
        declareFunction(me, "rkf_sd_properties_from_meta_isa_info", "RKF-SD-PROPERTIES-FROM-META-ISA-INFO", 1, 0, false);
        declareFunction(me, "rkf_sd_make_superior_basis_property", "RKF-SD-MAKE-SUPERIOR-BASIS-PROPERTY", 2, 0, false);
        declareFunction(me, "rkf_sd_induction_basis_properties", "RKF-SD-INDUCTION-BASIS-PROPERTIES", 2, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_superior_properties", "RKF-INDUCED-SALIENT-DESCRIPTOR-SUPERIOR-PROPERTIES", 3, 1, false);
        declareFunction(me, "rkf_induced_salient_descriptor_superiors", "RKF-INDUCED-SALIENT-DESCRIPTOR-SUPERIORS", 4, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_slots", "RKF-INDUCED-SALIENT-DESCRIPTOR-SLOTS", 4, 1, false);
        declareFunction(me, "rkf_salient_descriptor_specP", "RKF-SALIENT-DESCRIPTOR-SPEC?", 2, 1, false);
        declareFunction(me, "rkf_salient_descriptor_genlP_internal", "RKF-SALIENT-DESCRIPTOR-GENL?-INTERNAL", 3, 0, false);
        declareFunction(me, "rkf_salient_descriptor_genlP", "RKF-SALIENT-DESCRIPTOR-GENL?", 3, 0, false);
        declareFunction(me, "rkf_salient_descriptor_rule_from_spec", "RKF-SALIENT-DESCRIPTOR-RULE-FROM-SPEC", 1, 1, false);
        declareFunction(me, "rkf_rule_spec_supports", "RKF-RULE-SPEC-SUPPORTS", 3, 0, false);
        declareFunction(me, "rkf_justification_sentence_from_rule_spec", "RKF-JUSTIFICATION-SENTENCE-FROM-RULE-SPEC", 2, 0, false);
        declareFunction(me, "rkf_induced_rule_support", "RKF-INDUCED-RULE-SUPPORT", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_rule_spec_p", "RKF-SALIENT-DESCRIPTOR-RULE-SPEC-P", 1, 0, false);
        declareFunction(me, "new_rkf_salient_descriptor_rule_spec", "NEW-RKF-SALIENT-DESCRIPTOR-RULE-SPEC", 4, 0, false);
        declareFunction(me, "rkf_salient_descriptor_rule_spec_slot", "RKF-SALIENT-DESCRIPTOR-RULE-SPEC-SLOT", 1, 0, false);
        declareFunction(me, "rkf_sd_binary_preds_inference_properties", "RKF-SD-BINARY-PREDS-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(me, "rkf_collection_promising_for_binary_pred_inductionP", "RKF-COLLECTION-PROMISING-FOR-BINARY-PRED-INDUCTION?", 2, 2, false);
        declareFunction(me, "rkf_induced_suggestion_pred_of_strength", "RKF-INDUCED-SUGGESTION-PRED-OF-STRENGTH", 2, 0, false);
        declareFunction(me, "rkf_induced_salient_descriptor_binary_preds", "RKF-INDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS", 3, 3, false);
        declareFunction(me, "rkf_noninduced_salient_descriptor_binary_preds", "RKF-NONINDUCED-SALIENT-DESCRIPTOR-BINARY-PREDS", 3, 0, false);
        declareFunction(me, "rkf_sd_never_use_binary_pred_p", "RKF-SD-NEVER-USE-BINARY-PRED-P", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_get_inferiors_internal", "RKF-SALIENT-DESCRIPTOR-GET-INFERIORS-INTERNAL", 3, 1, false);
        declareFunction(me, "rkf_salient_descriptor_get_inferiors", "RKF-SALIENT-DESCRIPTOR-GET-INFERIORS", 3, 1, false);
        declareFunction(me, "rkf_salient_descriptor_binary_pred_type_violationP_internal", "RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?-INTERNAL", 3, 0, false);
        declareFunction(me, "rkf_salient_descriptor_binary_pred_type_violationP", "RKF-SALIENT-DESCRIPTOR-BINARY-PRED-TYPE-VIOLATION?", 3, 0, false);
        declareFunction(me, "rkf_term_binary_preds_internal", "RKF-TERM-BINARY-PREDS-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_term_binary_preds", "RKF-TERM-BINARY-PREDS", 2, 0, false);
        declareFunction(me, "rkf_term_meta_isas", "RKF-TERM-META-ISAS", 2, 0, false);
        declareFunction(me, "rkf_term_all_meta_isas_internal", "RKF-TERM-ALL-META-ISAS-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_term_all_meta_isas", "RKF-TERM-ALL-META-ISAS", 2, 0, false);
        declareFunction(me, "rkf_rule_cnfs_for_term", "RKF-RULE-CNFS-FOR-TERM", 2, 1, false);
        declareFunction(me, "rkf_sd_el_cnf_of_rule", "RKF-SD-EL-CNF-OF-RULE", 1, 0, false);
        declareFunction(me, "rkf_sd_el_cnf_of_hl_cnf", "RKF-SD-EL-CNF-OF-HL-CNF", 2, 0, false);
        declareFunction(me, "rkf_sd_el_wffP_internal", "RKF-SD-EL-WFF?-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_sd_el_wffP", "RKF-SD-EL-WFF?", 2, 0, false);
        declareFunction(me, "rkf_partial_bindings_for_term", "RKF-PARTIAL-BINDINGS-FOR-TERM", 2, 1, false);
        declareFunction(me, "rkf_partial_bindings_for_term_var", "RKF-PARTIAL-BINDINGS-FOR-TERM-VAR", 4, 0, false);
        declareFunction(me, "rkf_partial_bindings_for_formula", "RKF-PARTIAL-BINDINGS-FOR-FORMULA", 2, 3, false);
        declareFunction(me, "rkf_sd_constraint_table", "RKF-SD-CONSTRAINT-TABLE", 2, 0, false);
        declareFunction(me, "rkf_sd_rejected", "RKF-SD-REJECTED", 2, 0, false);
        declareFunction(me, "rkf_sd_use_negation_by_failureP", "RKF-SD-USE-NEGATION-BY-FAILURE?", 1, 0, false);
        declareFunction(me, "rkf_sd_known_problem_store_properties", "RKF-SD-KNOWN-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        declareFunction(me, "rkf_sd_known_static_inference_properties", "RKF-SD-KNOWN-STATIC-INFERENCE-PROPERTIES", 1, 1, false);
        declareFunction(me, "rkf_sd_known_dynamic_inference_properties", "RKF-SD-KNOWN-DYNAMIC-INFERENCE-PROPERTIES", 2, 0, false);
        declareFunction(me, "rkf_sd_known_internal", "RKF-SD-KNOWN-INTERNAL", 2, 1, false);
        declareFunction(me, "rkf_sd_known", "RKF-SD-KNOWN", 2, 1, false);
        declareFunction(me, "rkf_sd_existentially_unbind", "RKF-SD-EXISTENTIALLY-UNBIND", 1, 0, false);
        declareFunction(me, "rkf_sd_possibly_existentially_unbind", "RKF-SD-POSSIBLY-EXISTENTIALLY-UNBIND", 1, 0, false);
        declareFunction(me, "rkf_sd_known_some_good_binding_list_for_query_amongP", "RKF-SD-KNOWN-SOME-GOOD-BINDING-LIST-FOR-QUERY-AMONG?", 4, 0, false);
        declareFunction(me, "rkf_sd_known_good_binding_list_for_queryP", "RKF-SD-KNOWN-GOOD-BINDING-LIST-FOR-QUERY?", 4, 0, false);
        declareFunction(me, "rkf_sd_get_conjunct_bindings_internal", "RKF-SD-GET-CONJUNCT-BINDINGS-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_sd_get_conjunct_bindings", "RKF-SD-GET-CONJUNCT-BINDINGS", 2, 0, false);
        declareFunction(me, "rkf_sd_hl_for_el_vars_in_formula", "RKF-SD-HL-FOR-EL-VARS-IN-FORMULA", 1, 0, false);
        declareFunction(me, "rkf_potential_rule_for_termP", "RKF-POTENTIAL-RULE-FOR-TERM?", 2, 1, false);
        declareFunction(me, "rkf_sd_asent_unify", "RKF-SD-ASENT-UNIFY", 2, 1, false);
        declareFunction(me, "rkf_unsatisfied_cnf_subbed_rule_formula", "RKF-UNSATISFIED-CNF-SUBBED-RULE-FORMULA", 4, 0, false);
        declareFunction(me, "rkf_unsatisfied_cnf_rejectP", "RKF-UNSATISFIED-CNF-REJECT?", 3, 0, false);
        declareFunction(me, "rkf_sd_neg_lits_knownP", "RKF-SD-NEG-LITS-KNOWN?", 2, 0, false);
        declareFunction(me, "rkf_sd_el_fully_bound_p", "RKF-SD-EL-FULLY-BOUND-P", 1, 0, false);
        declareFunction(me, "rkf_make_el_cnf", "RKF-MAKE-EL-CNF", 3, 0, false);
        declareFunction(me, "rkf_make_el_conjunction", "RKF-MAKE-EL-CONJUNCTION", 2, 0, false);
        declareFunction(me, "rkf_rule_partially_satisfied_by_gaf_litP", "RKF-RULE-PARTIALLY-SATISFIED-BY-GAF-LIT?", 3, 0, false);
        declareFunction(me, "rkf_find_unresolved_lits", "RKF-FIND-UNRESOLVED-LITS", 4, 0, false);
        declareFunction(me, "rkf_subst_el_bindings", "RKF-SUBST-EL-BINDINGS", 2, 0, false);
        declareFunction(me, "rkf_sd_existentially_bind_vars", "RKF-SD-EXISTENTIALLY-BIND-VARS", 1, 0, false);
        declareFunction(me, "rkf_sd_check_lit_internal", "RKF-SD-CHECK-LIT-INTERNAL", 3, 0, false);
        declareFunction(me, "rkf_sd_check_lit", "RKF-SD-CHECK-LIT", 3, 0, false);
        declareFunction(me, "rkf_sd_formulas_static_inference_properties", "RKF-SD-FORMULAS-STATIC-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(me, "rkf_sd_formulas_dynamic_inference_properties", "RKF-SD-FORMULAS-DYNAMIC-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_formulas", "RKF-SALIENT-DESCRIPTOR-FORMULAS", 2, 1, false);
        declareFunction(me, "rkf_salient_descriptor_formulas_inference", "RKF-SALIENT-DESCRIPTOR-FORMULAS-INFERENCE", 4, 0, false);
        declareFunction(me, "rkf_salient_descriptor_formulas_one_batch_continue_inference", "RKF-SALIENT-DESCRIPTOR-FORMULAS-ONE-BATCH-CONTINUE-INFERENCE", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_formulas_one_batch", "RKF-SALIENT-DESCRIPTOR-FORMULAS-ONE-BATCH", 4, 1, false);
        declareFunction(me, "rkf_irrelevant_sd_formulaP", "RKF-IRRELEVANT-SD-FORMULA?", 2, 0, false);
        declareFunction(me, "rkf_sd_remove_nonassertible_conjuncts", "RKF-SD-REMOVE-NONASSERTIBLE-CONJUNCTS", 1, 0, false);
        declareFunction(me, "initialize_rkf_deprecated_rules", "INITIALIZE-RKF-DEPRECATED-RULES", 0, 0, false);
        declareFunction(me, "rkf_deprecate_rule_internal", "RKF-DEPRECATE-RULE-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_deprecate_rule", "RKF-SALIENT-DESCRIPTOR-DEPRECATE-RULE", 2, 0, false);
        declareFunction(me, "deprecate_salient_descriptor_rule", "DEPRECATE-SALIENT-DESCRIPTOR-RULE", 2, 0, false);
        declareFunction(me, "undeprecate_salient_descriptor_rule", "UNDEPRECATE-SALIENT-DESCRIPTOR-RULE", 2, 0, false);
        declareFunction(me, "rkf_deprecated_sd_ruleP", "RKF-DEPRECATED-SD-RULE?", 2, 0, false);
        declareFunction(me, "rkf_bad_sd_ruleP", "RKF-BAD-SD-RULE?", 2, 0, false);
        declareFunction(me, "rkf_sd_arg_constraint_ruleP", "RKF-SD-ARG-CONSTRAINT-RULE?", 1, 0, false);
        declareFunction(me, "rkf_sd_tva_equivalent_ruleP", "RKF-SD-TVA-EQUIVALENT-RULE?", 1, 1, false);
        declareFunction(me, "rkf_sd_type_based_strengthening_ruleP", "RKF-SD-TYPE-BASED-STRENGTHENING-RULE?", 1, 0, false);
        declareFunction(me, "rkf_sort_salient_formulas", "RKF-SORT-SALIENT-FORMULAS", 1, 0, false);
        declareFunction(me, "rkf_sd_clear", "RKF-SD-CLEAR", 0, 0, false);
        declareFunction(me, "rkf_sd_present", "RKF-SD-PRESENT", 1, 0, false);
        declareFunction(me, "rkf_sd_lookup", "RKF-SD-LOOKUP", 1, 0, false);
        declareFunction(me, "rkf_sd_update", "RKF-SD-UPDATE", 2, 0, false);
        declareFunction(me, "rkf_sd_ignore_clear", "RKF-SD-IGNORE-CLEAR", 0, 0, false);
        declareFunction(me, "rkf_sd_ignore_present", "RKF-SD-IGNORE-PRESENT", 1, 0, false);
        declareFunction(me, "rkf_sd_ignore_lookup", "RKF-SD-IGNORE-LOOKUP", 1, 0, false);
        declareFunction(me, "rkf_sd_ignore_update", "RKF-SD-IGNORE-UPDATE", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_get_subprompts", "RKF-SALIENT-DESCRIPTOR-GET-SUBPROMPTS", 4, 1, false);
        declareFunction(me, "rkf_salient_descriptor_single_entry_varP", "RKF-SALIENT-DESCRIPTOR-SINGLE-ENTRY-VAR?", 3, 0, false);
        declareFunction(me, "rkf_sd_single_entry_var_top_levelP", "RKF-SD-SINGLE-ENTRY-VAR-TOP-LEVEL?", 3, 0, false);
        declareFunction(me, "rkf_salient_property_sentence_from_justification", "RKF-SALIENT-PROPERTY-SENTENCE-FROM-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "rkf_sd_conjoin", "RKF-SD-CONJOIN", 1, 2, false);
        declareFunction(me, "rkf_sd_uniquify_conjuncts", "RKF-SD-UNIQUIFY-CONJUNCTS", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompts_p", "RKF-SALIENT-DESCRIPTOR-SUBPROMPTS-P", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_p", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-P", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_assert_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-ASSERT-SENTENCE", 1, 2, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_var", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-VAR", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_known_check_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-KNOWN-CHECK-SENTENCE", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_constraint_sentence", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-CONSTRAINT-SENTENCE", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_examples", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-EXAMPLES", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_set_examples", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-SET-EXAMPLES", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_type", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-TYPE", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_subprompt_from_formula", "RKF-SALIENT-DESCRIPTOR-SUBPROMPT-FROM-FORMULA", 2, 2, false);
        declareFunction(me, "rkf_salient_descriptor_followups", "RKF-SALIENT-DESCRIPTOR-FOLLOWUPS", 2, 2, false);
        declareFunction(me, "rkf_salient_descriptor_followup_for_variable", "RKF-SALIENT-DESCRIPTOR-FOLLOWUP-FOR-VARIABLE", 5, 0, false);
        declareFunction(me, "rkf_sd_examples_internal", "RKF-SD-EXAMPLES-INTERNAL", 4, 4, false);
        declareFunction(me, "rkf_sd_examples", "RKF-SD-EXAMPLES", 4, 4, false);
        declareFunction(me, "rkf_sd_precedent_query_sentence", "RKF-SD-PRECEDENT-QUERY-SENTENCE", 3, 1, false);
        declareFunction(me, "rkf_sd_add_salient_property", "RKF-SD-ADD-SALIENT-PROPERTY", 3, 0, false);
        declareFunction(me, "rkf_sd_add_known_sentence", "RKF-SD-ADD-KNOWN-SENTENCE", 1, 0, false);
        declareFunction(me, "rkf_sd_remove_constraints", "RKF-SD-REMOVE-CONSTRAINTS", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_complete_coll_bindings", "RKF-SALIENT-DESCRIPTOR-COMPLETE-COLL-BINDINGS", 3, 0, false);
        declareFunction(me, "rkf_sd_complete_coll_bindings_okP", "RKF-SD-COMPLETE-COLL-BINDINGS-OK?", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_small_set_bindings", "RKF-SALIENT-DESCRIPTOR-SMALL-SET-BINDINGS", 2, 0, false);
        declareFunction(me, "rkf_sd_small_set_bindings_okP", "RKF-SD-SMALL-SET-BINDINGS-OK?", 2, 0, false);
        declareFunction(me, "rkf_salient_descriptor_bindings", "RKF-SALIENT-DESCRIPTOR-BINDINGS", 4, 1, false);
        declareFunction(me, "rkf_salient_descriptor_assert_formula", "RKF-SALIENT-DESCRIPTOR-ASSERT-FORMULA", 1, 0, false);
        declareFunction(me, "rkf_salient_descriptor_not_assertible_sentenceP", "RKF-SALIENT-DESCRIPTOR-NOT-ASSERTIBLE-SENTENCE?", 1, 0, false);
        declareFunction(me, "rkf_generate_interaction_example_instances_formula", "RKF-GENERATE-INTERACTION-EXAMPLE-INSTANCES-FORMULA", 2, 0, false);
        declareFunction(me, "rkf_example_instances_backchain_level", "RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL", 0, 0, false);
        declareFunction(me, "rkf_example_instances", "RKF-EXAMPLE-INSTANCES", 6, 3, false);
        declareFunction(me, "rkf_sd_examples_adjusted_number_constraint", "RKF-SD-EXAMPLES-ADJUSTED-NUMBER-CONSTRAINT", 1, 0, false);
        declareFunction(me, "rkf_asserted_example_instances", "RKF-ASSERTED-EXAMPLE-INSTANCES", 6, 0, false);
        declareFunction(me, "rkf_local_example_instances", "RKF-LOCAL-EXAMPLE-INSTANCES", 7, 0, false);
        declareFunction(me, "rkf_example_types_include_type_p", "RKF-EXAMPLE-TYPES-INCLUDE-TYPE-P", 2, 0, false);
        declareFunction(me, "rkf_add_examples", "RKF-ADD-EXAMPLES", 6, 1, false);
        declareFunction(me, "rkf_example_in_examplesP", "RKF-EXAMPLE-IN-EXAMPLES?", 2, 0, false);
        declareFunction(me, "rkf_example_not_known_falseP", "RKF-EXAMPLE-NOT-KNOWN-FALSE?", 4, 0, false);
        declareFunction(me, "rkf_example_wffP", "RKF-EXAMPLE-WFF?", 4, 0, false);
        declareFunction(me, "rkf_example_wffP_int_internal", "RKF-EXAMPLE-WFF?-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "rkf_example_wffP_int", "RKF-EXAMPLE-WFF?-INT", 2, 0, false);
        declareFunction(me, "rkf_example_instances_ask_properties", "RKF-EXAMPLE-INSTANCES-ASK-PROPERTIES", 2, 0, false);
        declareFunction(me, "rkf_example_instances_ask", "RKF-EXAMPLE-INSTANCES-ASK", 7, 0, false);
        declareFunction(me, "rkf_bad_exampleP", "RKF-BAD-EXAMPLE?", 2, 0, false);
        declareFunction(me, "rkf_better_exampleP", "RKF-BETTER-EXAMPLE?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_salient_descriptor_file() {
        deflexical("*RKF-SALIENT-FORMULA-TYPES*", $list0);
        defparameter("*RKF-SALIENT-DESCRIPTOR-NUMBER-CUTOFF*", ONE_INTEGER);
        defparameter("*RKF-SALIENT-DESCRIPTOR-TIME-CUTOFF*", $int$90);
        defparameter("*RKF-SALIENT-DESCRIPTOR-TRANSFORMATION-CUTOFF*", ONE_INTEGER);
        defparameter("*RKF-SD-EXCLUDE-KNOWN-PROMPTS?*", T);
        defparameter("*RKF-SD-PROBLEM-STORE*", NIL);
        deflexical("*RKF-SD-PROBLEM-STORE-CHECKPOINTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*RKF-SD-REUSE-PROBLEM-STORE?*", T);
        defparameter("*RKF-SD-INDUCED-SUPERIORS-CUTOFF*", NIL);
        defparameter("*RKF-SD-KNOWN-TIME-CUTOFF*", TEN_INTEGER);
        defparameter("*RKF-SD-KNOWN-MAX-DEPTH-MAX*", ONE_INTEGER);
        defparameter("*RKF-SD-KNOWN-DESTROY-INFERENCES?*", T);
        defparameter("*RKF-SD-FORMULAS-MAX-DEPTH-MAX*", ONE_INTEGER);
        defparameter("*CACHE-SALIENT-DESCRIPTOR-ASK-RESULTS?*", NIL);
        deflexical("*RKF-DEPRECATED-RULES*", $UNINITIALIZED);
        defparameter("*RKF-SD-RULE-NEG-LIT-MAX*", SIX_INTEGER);
        defparameter("*RKF-SD-RULE-POS-LIT-MAX*", ONE_INTEGER);
        defparameter("*RKF-SD-RULE-NEG-LIT-MIN*", TWO_INTEGER);
        defparameter("*RKF-SD-RULE-POS-LIT-MIN*", ONE_INTEGER);
        deflexical("*RKF-SALIENT-DESCRIPTOR-CACHE*", SubLTrampolineFile.maybeDefault($rkf_salient_descriptor_cache$, $rkf_salient_descriptor_cache$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*RKF-SALIENT-DESCRIPTOR-CACHE-LOCK*", make_lock($$$RKF_Salient_Descriptor_Cache_Lock));
        deflexical("*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE*", SubLTrampolineFile.maybeDefault($rkf_salient_descriptor_ignore_cache$, $rkf_salient_descriptor_ignore_cache$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*RKF-SALIENT-DESCRIPTOR-IGNORE-CACHE-LOCK*", make_lock($$$RKF_Salient_Descriptor_Cache_Lock));
        defparameter("*RKF-CHOICE-COUNT-CUTOFF*", TEN_INTEGER);
        defparameter("*RKF-EXAMPLES-TO-SHOW*", FIVE_INTEGER);
        defparameter("*RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL*", ZERO_INTEGER);
        defparameter("*RKF-EXAMPLE-INSTANCES-TIME-CUTOFF*", FIVE_INTEGER);
        defvar("*RKF-EXAMPLE-INSTANCES-WFF-CHECK?*", T);
        defparameter("*RKF-EXAMPLE-NOT-KNOWN-FALSE-TIME-CUTOFF*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_salient_descriptor_file() {
        memoization_state.note_memoized_function($sym26$RKF_SALIENT_DESCRIPTOR_META_ISA_TYPE_VIOLATION_);
        memoization_state.note_memoized_function(RKF_SALIENT_DESCRIPTOR_TYPE_SPECS);
        memoization_state.note_memoized_function($sym92$RKF_SALIENT_DESCRIPTOR_GENL_);
        memoization_state.note_memoized_function(RKF_SALIENT_DESCRIPTOR_GET_INFERIORS);
        memoization_state.note_memoized_function($sym141$RKF_SALIENT_DESCRIPTOR_BINARY_PRED_TYPE_VIOLATION_);
        memoization_state.note_memoized_function(RKF_TERM_BINARY_PREDS);
        memoization_state.note_memoized_function(RKF_TERM_ALL_META_ISAS);
        memoization_state.note_memoized_function($sym149$RKF_SD_EL_WFF_);
        memoization_state.note_memoized_function(RKF_SD_KNOWN);
        memoization_state.note_memoized_function(RKF_SD_GET_CONJUNCT_BINDINGS);
        memoization_state.note_memoized_function(RKF_SD_CHECK_LIT);
        register_kb_function(DEPRECATE_SALIENT_DESCRIPTOR_RULE);
        register_kb_function(UNDEPRECATE_SALIENT_DESCRIPTOR_RULE);
        declare_defglobal($rkf_salient_descriptor_cache$);
        declare_defglobal($rkf_salient_descriptor_ignore_cache$);
        memoization_state.note_memoized_function(RKF_SD_EXAMPLES);
        memoization_state.note_memoized_function($sym243$RKF_EXAMPLE_WFF__INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_salient_descriptor_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_salient_descriptor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_salient_descriptor_file();
    }

    static {
























































































































































































































































































    }
}

/**
 * Total time: 4626 ms
 */
