package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.gke_main.$replacement_tree_native;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class gke_main extends SubLTranslatedFile {
    public static final SubLFile me = new gke_main();

    public static final String myName = "com.cyc.cycjava.cycl.gke_main";

    public static final String myFingerPrint = "2ec39b83b811911189c1481d304fe675d62a14ea245c7ef56fb9b8310d88b583";



    // deflexical
    private static final SubLSymbol $gke_overly_general_non_predicate_types$ = makeSymbol("*GKE-OVERLY-GENERAL-NON-PREDICATE-TYPES*");

    // deflexical
    private static final SubLSymbol $gke_filtered_termP_caching_state$ = makeSymbol("*GKE-FILTERED-TERM?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $gke_overly_general_predicate_types$ = makeSymbol("*GKE-OVERLY-GENERAL-PREDICATE-TYPES*");

    // deflexical
    private static final SubLSymbol $gke_predicate_filteredP_caching_state$ = makeSymbol("*GKE-PREDICATE-FILTERED?-CACHING-STATE*");

    // defparameter
    /**
     * BOOLEANP; Should we use the RBP-WFF functionality - when available - to
     * wff-check candidate replacements?
     */
    public static final SubLSymbol $use_rbp_wff_in_gkeP$ = makeSymbol("*USE-RBP-WFF-IN-GKE?*");









    // deflexical
    // Do we leave out suggestions trees with no branches? (bug 22558)
    private static final SubLSymbol $omit_suggestion_stumpsP$ = makeSymbol("*OMIT-SUGGESTION-STUMPS?*");

    // defconstant
    public static final SubLSymbol $dtp_replacement_tree$ = makeSymbol("*DTP-REPLACEMENT-TREE*");

    // deflexical
    /**
     * Should we use transitivity-via-arg reasoning when generating suggestion
     * trees? (see bug 22562).
     */
    private static final SubLSymbol $use_tva_for_suggestionsP$ = makeSymbol("*USE-TVA-FOR-SUGGESTIONS?*");

    // defparameter
    /**
     * amount of seconds to wait when trying to stop an inference before using
     * extreme measures...
     */
    public static final SubLSymbol $default_patience_wait_time$ = makeSymbol("*DEFAULT-PATIENCE-WAIT-TIME*");

    // defparameter
    // data member for accessing query threads related to the gke
    public static final SubLSymbol $gke_query_threads$ = makeSymbol("*GKE-QUERY-THREADS*");

    // deflexical
    private static final SubLSymbol $daemon_should_run_inference_statuses$ = makeSymbol("*DAEMON-SHOULD-RUN-INFERENCE-STATUSES*");

    // deflexical
    // Set to T if you need to get the old behavior back.
    private static final SubLSymbol $gke_run_inference_with_adjusted_dynamic_propertiesP$ = makeSymbol("*GKE-RUN-INFERENCE-WITH-ADJUSTED-DYNAMIC-PROPERTIES?*");

    // deflexical
    private static final SubLSymbol $inference_done_statuses$ = makeSymbol("*INFERENCE-DONE-STATUSES*");

    // Internal Constants
    public static final SubLSymbol GET_GKE_ARG_OPTIONS = makeSymbol("GET-GKE-ARG-OPTIONS");

    public static final SubLString $str1$Got_unknown_arg_type_for___A__ = makeString("Got unknown arg type for: ~A~%");



    public static final SubLString $str3$Natural_language_processing_has_d = makeString("Natural language processing has deleted an entry.~%Wrong sizes ~A and ~A");





    public static final SubLSymbol GET_GKE_EXPANDED_ITEMS = makeSymbol("GET-GKE-EXPANDED-ITEMS");



    public static final SubLList $list8 = list(reader_make_constant_shell(makeString("forAll")), reader_make_constant_shell(makeString("thereExists")), reader_make_constant_shell(makeString("thereExistExactly")), reader_make_constant_shell(makeString("thereExistAtLeast")), reader_make_constant_shell(makeString("thereExistAtMost")), reader_make_constant_shell(makeString("thereExistRange")));

    public static final SubLList $list9 = list(new SubLObject[]{ reader_make_constant_shell(makeString("AFew-Quant")), reader_make_constant_shell(makeString("Few-Quant")), reader_make_constant_shell(makeString("Many-Quant")), reader_make_constant_shell(makeString("Most-Quant")), reader_make_constant_shell(makeString("Tens-Quant")), reader_make_constant_shell(makeString("Dozens-Quant")), reader_make_constant_shell(makeString("Hundreds-Quant")), reader_make_constant_shell(makeString("Thousands-Quant")), reader_make_constant_shell(makeString("Millions-Quant")), reader_make_constant_shell(makeString("Billions-Quant")) });

    public static final SubLSymbol GET_GKE_QUANTIFIER_RANGES = makeSymbol("GET-GKE-QUANTIFIER-RANGES");

    public static final SubLString $$$Get_the_quantifier_ranges = makeString("Get the quantifier ranges");





    private static final SubLSymbol NART_SUBSTITUTE = makeSymbol("NART-SUBSTITUTE");

    private static final SubLInteger $int$200 = makeInteger(200);



    private static final SubLSymbol GKE_LIST_ITEM_COMPARATOR = makeSymbol("GKE-LIST-ITEM-COMPARATOR");

    private static final SubLInteger $int$175 = makeInteger(175);

    private static final SubLSymbol $sym19$GKE_FILTERED_TERM_ = makeSymbol("GKE-FILTERED-TERM?");

    private static final SubLSymbol RKF_MAX_SPECS = makeSymbol("RKF-MAX-SPECS");

    private static final SubLSymbol RKF_INSTANTIATIONS = makeSymbol("RKF-INSTANTIATIONS");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLSymbol GKE_ISAS_FILTERED_TERM = makeSymbol("GKE-ISAS-FILTERED-TERM");



    private static final SubLSymbol RKF_ALL_GENLS = makeSymbol("RKF-ALL-GENLS");

    private static final SubLSymbol $gke_isas_filtered_term_caching_state$ = makeSymbol("*GKE-ISAS-FILTERED-TERM-CACHING-STATE*");

    private static final SubLList $list27 = list(new SubLObject[]{ reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("ConventionalClassificationType")), reader_make_constant_shell(makeString("SiblingDisjointSetOrCollectionType")), reader_make_constant_shell(makeString("SetOrCollectionType")), reader_make_constant_shell(makeString("DisjointSetOrCollectionType")), reader_make_constant_shell(makeString("SecondOrderCollection")), list(reader_make_constant_shell(makeString("GroupFn")), reader_make_constant_shell(makeString("PartiallyTangible"))), reader_make_constant_shell(makeString("ObjectType")), reader_make_constant_shell(makeString("Group")), reader_make_constant_shell(makeString("Entity")), reader_make_constant_shell(makeString("PublicConstant-DefinitionalGAFsOK")), reader_make_constant_shell(makeString("ExistingStuffType")), reader_make_constant_shell(makeString("StuffType")), reader_make_constant_shell(makeString("PublicConstant-CommentOK")), reader_make_constant_shell(makeString("ReformulatorIrrelevantFORT")), reader_make_constant_shell(makeString("ExistingObjectType")), reader_make_constant_shell(makeString("Individual")) });

    private static final SubLSymbol $sym28$_GKE_FILTERED_TERM__CACHING_STATE_ = makeSymbol("*GKE-FILTERED-TERM?-CACHING-STATE*");

    public static final SubLList $list29 = list(new SubLObject[]{ reader_make_constant_shell(makeString("SetOrCollectionPredicate")), reader_make_constant_shell(makeString("EvaluatablePredicate")), reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")), reader_make_constant_shell(makeString("ReflexiveBinaryPredicate")), reader_make_constant_shell(makeString("TransitiveBinaryPredicate")), reader_make_constant_shell(makeString("RuleMacroPredicate")), reader_make_constant_shell(makeString("OpenCycDefinitionalPredicate")), reader_make_constant_shell(makeString("VocabularyDefiningPredicate")), reader_make_constant_shell(makeString("DefaultMonotonicPredicate")) });

    private static final SubLSymbol $sym30$GKE_PREDICATE_FILTERED_ = makeSymbol("GKE-PREDICATE-FILTERED?");



    private static final SubLList $list32 = list(reader_make_constant_shell(makeString("arg1Isa")), reader_make_constant_shell(makeString("arg1Genl")), reader_make_constant_shell(makeString("arg1NotIsa")), reader_make_constant_shell(makeString("arg1NotGenl")), reader_make_constant_shell(makeString("arg1Format")));

    private static final SubLSymbol $sym33$_GKE_PREDICATE_FILTERED__CACHING_STATE_ = makeSymbol("*GKE-PREDICATE-FILTERED?-CACHING-STATE*");



    private static final SubLSymbol TREE_POSITION_P = makeSymbol("TREE-POSITION-P");

    private static final SubLSymbol $sym36$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");



    private static final SubLString $str38$OPERATOR_TERMS_PASS_CONSTRAINTS_r = makeString("OPERATOR-TERMS-PASS-CONSTRAINTS requires an operator arg position. Got ~S");

    private static final SubLString $str39$OPERATOR_TERMS_PASS_CONSTRAINTS_r = makeString("OPERATOR-TERMS-PASS-CONSTRAINTS requires an argument arg position. Got ~S");

    private static final SubLSymbol GET_GKE_NAUT_ARG_POSITION = makeSymbol("GET-GKE-NAUT-ARG-POSITION");

    private static final SubLSymbol GET_GKE_IS_KNOWN = makeSymbol("GET-GKE-IS-KNOWN");



    private static final SubLObject $const43$GenericIntelligenceAnalysis_CAE_A = reader_make_constant_shell(makeString("GenericIntelligenceAnalysis-CAE-Allotment"));



    private static final SubLObject $const45$GenericMedicalResearchTask_Allotm = reader_make_constant_shell(makeString("GenericMedicalResearchTask-Allotment"));









    private static final SubLString $$$Show_all_values_of_ = makeString("Show all values of ");

    private static final SubLString $str51$_such_that__ = makeString(" such that~%");

    private static final SubLString $str52$Is_it_true_that__ = makeString("Is it true that~%");

    private static final SubLObject $$TheCoordinationSet = reader_make_constant_shell(makeString("TheCoordinationSet"));

    private static final SubLSymbol PPH_ANCHOR_TAGS_FOR_TERM = makeSymbol("PPH-ANCHOR-TAGS-FOR-TERM");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLList $list56 = list(makeKeyword("NOR"), makeKeyword("NOT"));





    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));



    private static final SubLList $list61 = list(reader_make_constant_shell(makeString("unknownSentence")), reader_make_constant_shell(makeString("not")));

    private static final SubLList $list62 = list(ONE_INTEGER, ZERO_INTEGER);

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));





    private static final SubLString $$$All_of_the_following_are_true = makeString("All of the following are true");

    private static final SubLString $str67$At_least_one_of_the_following_is_ = makeString("At least one of the following is true");

    private static final SubLString $$$None_of_the_following_is_true = makeString("None of the following is true");

    private static final SubLSymbol GKE_ADD_CLONED_LITERAL = makeSymbol("GKE-ADD-CLONED-LITERAL");

    private static final SubLList $list70 = list(makeKeyword("AND"), makeKeyword("OR"));

    private static final SubLString $str71$_S_must_be_one_of__S = makeString("~S must be one of ~S");



    private static final SubLSymbol GKE_REMOVE_LITERAL = makeSymbol("GKE-REMOVE-LITERAL");

    private static final SubLString $$$GKEReformulationRuleHoldingMt = makeString("GKEReformulationRuleHoldingMt");







    private static final SubLString $str78$useReformulationRuleForGuidedKnow = makeString("useReformulationRuleForGuidedKnowledgeEntry");



    private static final SubLList $list80 = list(makeKeyword("ANYTHING"));

    private static final SubLList $list81 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("EL-VARIABLE"), makeKeyword("ANYTHING"));

    private static final SubLSymbol POSSIBLE_SENTENCE_SUBSTITUTIONS = makeSymbol("POSSIBLE-SENTENCE-SUBSTITUTIONS");

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell(makeString("nonPlural-Generic"));

    private static final SubLList $list85 = list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"));



    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol $sym88$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol SUBSTITUTE_TERM_INTO_SENTENCE = makeSymbol("SUBSTITUTE-TERM-INTO-SENTENCE");



    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");

    private static final SubLString $str92$_S_does_not_have_arg_position__S = makeString("~S does not have arg-position ~S");



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list95 = list(reader_make_constant_shell(makeString("and")));

    private static final SubLSymbol $sym96$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol EL_VAR_NAME = makeSymbol("EL-VAR-NAME");

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));



    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLSymbol GKE_MEMOIZATION_STATE = makeSymbol("GKE-MEMOIZATION-STATE");

    private static final SubLString $$$GKE_Memoization_State = makeString("GKE Memoization State");

    private static final SubLSymbol $gke_memoization_state_caching_state$ = makeSymbol("*GKE-MEMOIZATION-STATE-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GKE_MEMOIZATION_STATE = makeSymbol("CLEAR-GKE-MEMOIZATION-STATE");

    private static final SubLSymbol GKE_GLOSS_FOR_LITERAL = makeSymbol("GKE-GLOSS-FOR-LITERAL");

    private static final SubLSymbol $sym107$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");



    private static final SubLObject $$gkeGlossWrtDomainMt = reader_make_constant_shell(makeString("gkeGlossWrtDomainMt"));



    private static final SubLSymbol GENERATE_GKE_GLOSS_WRT_MT_CACHED = makeSymbol("GENERATE-GKE-GLOSS-WRT-MT-CACHED");

    private static final SubLSymbol $generate_gke_gloss_wrt_mt_cached_caching_state$ = makeSymbol("*GENERATE-GKE-GLOSS-WRT-MT-CACHED-CACHING-STATE*");



    private static final SubLSymbol CANDIDATE_REPLACEMENT_RENDERERS_FOR_SENTENCE = makeSymbol("CANDIDATE-REPLACEMENT-RENDERERS-FOR-SENTENCE");

    private static final SubLList $list115 = cons(makeSymbol("KEY"), makeSymbol("TERMS"));



    private static final SubLSymbol CANDIDATE_REPLACEMENTS_FOR_VARIABLES = makeSymbol("CANDIDATE-REPLACEMENTS-FOR-VARIABLES");

    private static final SubLSymbol CANDIDATE_REPLACEMENTS_FOR_ARG = makeSymbol("CANDIDATE-REPLACEMENTS-FOR-ARG");

    private static final SubLSymbol CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED = makeSymbol("CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED");

    private static final SubLList $list120 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLList $list121 = cons(makeSymbol("KEY"), makeSymbol("REPLACEMENTS"));

    private static final SubLList $list122 = list(makeSymbol("?REP-COLL"), makeSymbol("?REP-POS"), makeSymbol("?CON-COLL"), makeSymbol("?CON-POS"));

    private static final SubLObject $const123$suggestionsForPredRelativeToIsaIn = reader_make_constant_shell(makeString("suggestionsForPredRelativeToIsaInArg"));

    private static final SubLList $list124 = list(makeSymbol("REPLACEMENT-COLL"), makeSymbol("REPLACEMENT-POS"), makeSymbol("CONSTRAINT-COLL"), makeSymbol("CONSTRAINT-POS"));

    private static final SubLObject $const125$suggestionsForPredRelativeToGenls = reader_make_constant_shell(makeString("suggestionsForPredRelativeToGenlsInArg"));

    private static final SubLSymbol $candidate_replacements_for_sentence_cached_caching_state$ = makeSymbol("*CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLSymbol CLEAR_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED = makeSymbol("CLEAR-CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED");





    private static final SubLSymbol GKE_GET_ELEMENTS = makeSymbol("GKE-GET-ELEMENTS");

    private static final SubLSymbol $sym132$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol("HL-PROTOTYPICAL-INSTANCE?");

    private static final SubLSymbol $sym133$_X = makeSymbol("?X");

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLSymbol $gke_get_elements_caching_state$ = makeSymbol("*GKE-GET-ELEMENTS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GKE_GET_ELEMENTS = makeSymbol("CLEAR-GKE-GET-ELEMENTS");

    private static final SubLSymbol NEW_REPLACEMENT_TREE = makeSymbol("NEW-REPLACEMENT-TREE");

    private static final SubLList $list138 = cons(makeSymbol("BIN-PRED"), makeSymbol("ARGNUM"));

    private static final SubLString $str139$__Conflating__S_to__S_____ = makeString("~&Conflating ~S to ~S...~%");

    private static final SubLSymbol $sym140$_OMIT_SUGGESTION_STUMPS__ = makeSymbol("*OMIT-SUGGESTION-STUMPS?*");

    private static final SubLSymbol REPLACEMENT_TREE = makeSymbol("REPLACEMENT-TREE");

    private static final SubLSymbol REPLACEMENT_TREE_P = makeSymbol("REPLACEMENT-TREE-P");

    private static final SubLList $list143 = list(makeSymbol("ROOT"), makeSymbol("CHILDREN"));

    private static final SubLList $list144 = list(makeKeyword("ROOT"), makeKeyword("CHILDREN"));

    private static final SubLList $list145 = list(makeSymbol("R-TREE-ROOT"), makeSymbol("R-TREE-CHILDREN"));

    private static final SubLList $list146 = list(makeSymbol("_CSETF-R-TREE-ROOT"), makeSymbol("_CSETF-R-TREE-CHILDREN"));

    private static final SubLSymbol PRINT_REPLACEMENT_TREE = makeSymbol("PRINT-REPLACEMENT-TREE");

    private static final SubLSymbol REPLACEMENT_TREE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REPLACEMENT-TREE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list149 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REPLACEMENT-TREE-P"));

    private static final SubLSymbol R_TREE_ROOT = makeSymbol("R-TREE-ROOT");

    private static final SubLSymbol _CSETF_R_TREE_ROOT = makeSymbol("_CSETF-R-TREE-ROOT");

    private static final SubLSymbol R_TREE_CHILDREN = makeSymbol("R-TREE-CHILDREN");

    private static final SubLSymbol _CSETF_R_TREE_CHILDREN = makeSymbol("_CSETF-R-TREE-CHILDREN");



    private static final SubLString $str155$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_REPLACEMENT_TREE = makeSymbol("MAKE-REPLACEMENT-TREE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REPLACEMENT_TREE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPLACEMENT-TREE-METHOD");

    private static final SubLString $str161$_REPLACEMENT_TREE__S_ = makeString("<REPLACEMENT-TREE ~S>");



    private static final SubLString $str163$Unable_to_place__D_renderers = makeString("Unable to place ~D renderers");

    private static final SubLString $str164$Hit_max_depth_of__D__Pruning__D_r = makeString("Hit max depth of ~D. Pruning ~D remaining renderers.");

    private static final SubLString $str165$__Placing__S_under_superiors___S_ = makeString("~&Placing ~S under superiors: ~S~%");



    private static final SubLString $str167$__Found__S_on_level__D___ = makeString("~&Found ~S on level ~D.~%");

    private static final SubLString $str168$__Not_in_subtree__so_adding__S_un = makeString("~&Not in subtree, so adding ~S under ~S on level ~D.~%");

    private static final SubLString $str169$___Tree_level__D_is_now__S___ = makeString("~& Tree level ~D is now ~S.~%");

    private static final SubLString $str170$Found_it_ = makeString("Found it.");

    private static final SubLString $str171$__Postponing__S_because__S_is_not = makeString("~&Postponing ~S because ~S is not yet in the tree.~%");

    private static final SubLSymbol $sym172$_COL = makeSymbol("?COL");

    private static final SubLObject $$suggestionGenlClassOrderedBy = reader_make_constant_shell(makeString("suggestionGenlClassOrderedBy"));

    private static final SubLList $list174 = list(makeSymbol("?PRED"), makeSymbol("?N"));

    private static final SubLList $list175 = list(reader_make_constant_shell(makeString("suggestionIsaClassOrderedBy")), makeSymbol("?COL"), makeSymbol("?PRED"), makeSymbol("?N"));

    private static final SubLList $list176 = list(makeSymbol("?COL"));

    private static final SubLList $list177 = cons(makeSymbol("?PRED"), makeSymbol("?N"));











    private static final SubLList $list183 = list(reader_make_constant_shell(makeString("conflateMembersOfSetWhenGeneratingHierarchicalOrderingsForSpecs")), makeSymbol("?COL"), makeSymbol("?SET"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list185 = list(reader_make_constant_shell(makeString("conflateMembersOfSetWhenGeneratingHierarchicalOrderingsForInstances")), makeSymbol("?COL"), makeSymbol("?SET"));

    private static final SubLSymbol $sym186$_SET = makeSymbol("?SET");

    private static final SubLString $str187$__Filtered_renderers___S__ = makeString("~&Filtered renderers: ~S~%");

    private static final SubLSymbol $sym188$_USE_TVA_FOR_SUGGESTIONS__ = makeSymbol("*USE-TVA-FOR-SUGGESTIONS?*");





    private static final SubLList $list191 = list(makeKeyword("NOT"), makeKeyword("REMOVAL-TVA-UNIFY"));

    private static final SubLList $list192 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLList $list193 = list(cons(makeSymbol("?TRUTH"), makeString("Yes")));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str195$_ = makeString("-");





    private static final SubLSymbol $kw198$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLList $list199 = list(makeSymbol("*THE-CYCLIST*"));

    private static final SubLSymbol GKE_START_CONTINUABLE_QUERY = makeSymbol("GKE-START-CONTINUABLE-QUERY");

    private static final SubLList $list201 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"));

    private static final SubLString $str202$Setup_a_query__and_immediately_re = makeString("Setup a query, and immediately return the query identifiers.  A separate java\n   thread will start up the query and check up on it for new results.");

    public static final SubLList $list203 = list(list(makeSymbol("SENTENCE"), makeSymbol("EL-FORMULA-P")), list(makeSymbol("MT"), makeSymbol("POSSIBLY-MT-P")), list(makeSymbol("PROPERTIES"), makeSymbol("QUERY-PROPERTIES-P")));







    private static final SubLString $str207$Error_with_query___A__ = makeString("Error with query: ~A~%");

    private static final SubLSymbol GKE_CONTINUE_QUERY = makeSymbol("GKE-CONTINUE-QUERY");

    private static final SubLList $list209 = list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INFERENCE-ID"), makeSymbol("PROPERTIES"), makeSymbol("&OPTIONAL"), makeSymbol("SPECIAL-STATE"));

    private static final SubLString $str210$Continue_an_existing_query__ident = makeString("Continue an existing query (identified by PROBLEM-STORE-ID and INFERENCE-ID), \n   using PROPERTIES and immediately return the query identifiers.  A separate thread\n   will be started to keep track of the results and provide them to any other tools \n   (e.g. the Query Library) that need them.");

    private static final SubLList $list211 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("PROPERTIES"), makeSymbol("LISTP")));

    private static final SubLString $str212$gke_query_thread__A__A = makeString("gke query thread ~A ~A");

    private static final SubLSymbol GKE_RUN_INFERENCE = makeSymbol("GKE-RUN-INFERENCE");

    private static final SubLString $str214$results_daemon__A__A = makeString("results daemon ~A ~A");

    private static final SubLSymbol RESULTS_DAEMON = makeSymbol("RESULTS-DAEMON");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    private static final SubLList $list220 = list(makeKeyword("RUNNING"), makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"));



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");

    private static final SubLSymbol GKE_GET_ONE_INFERENCE_RESULT = makeSymbol("GKE-GET-ONE-INFERENCE-RESULT");

    private static final SubLList $list225 = list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INFERENCE-ID"));

    private static final SubLString $$$Get_one_inference_result = makeString("Get one inference result");

    private static final SubLList $list227 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")));

    private static final SubLSymbol ID_OF_VALID_PROBLEM_STORE_P = makeSymbol("ID-OF-VALID-PROBLEM-STORE-P");



    private static final SubLSymbol GKE_GET_INFERENCE_RESULTS = makeSymbol("GKE-GET-INFERENCE-RESULTS");

    private static final SubLString $str231$get_all_the_inference_results_so_ = makeString("get all the inference results so far.\n@return LISTP of LISTP of triples of the form\n  - string-paraphrase of EL variable\n  - javalist-paraphrase of the variable\'s value\n  - CycL term to which the variable is bound\none list of triples for each set of bindings for the specified inference.");

    private static final SubLList $list232 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("ID-OF-VALID-PROBLEM-STORE-P")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")));

    private static final SubLList $list233 = list(makeKeyword("SUSPENDED"), makeKeyword("DEAD"), makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"));

    private static final SubLSymbol $sym234$GKE_INFERENCE_COMPLETE_ = makeSymbol("GKE-INFERENCE-COMPLETE?");

    private static final SubLString $str235$ret_t_iff_inference_is_suspended_ = makeString("ret t iff inference is suspended || dead || tautology || contradiction\n&& queue is empty && daemon is :completed");

    private static final SubLSymbol GKE_GET_INFERENCE_STATUS = makeSymbol("GKE-GET-INFERENCE-STATUS");

    private static final SubLString $$$get_the_status_of_the_inference = makeString("get the status of the inference");

    private static final SubLSymbol GKE_GET_INFERENCE_SUSPEND_STATUS = makeSymbol("GKE-GET-INFERENCE-SUSPEND-STATUS");

    private static final SubLString $str239$get_the_suspend_status_of_the_inf = makeString("get the suspend-status of the inference");

    private static final SubLSymbol NULL_OR_INTEGERP = makeSymbol("NULL-OR-INTEGERP");

    private static final SubLSymbol GKE_STOP_CONTINUABLE_QUERY = makeSymbol("GKE-STOP-CONTINUABLE-QUERY");

    private static final SubLList $list242 = list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INFERENCE-ID"), makeSymbol("&OPTIONAL"), makeSymbol("PATIENCE"));

    private static final SubLString $str243$Find_and_stop_the_inference_ = makeString("Find and stop the inference.");

    private static final SubLList $list244 = list(list(makeSymbol("PROBLEM-STORE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("INFERENCE-ID"), makeSymbol("INTEGERP")), list(makeSymbol("PATIENCE"), makeSymbol("NULL-OR-INTEGERP")));

    private static final SubLSymbol GKE_RELEASE_INFERENCE_RESOURCES = makeSymbol("GKE-RELEASE-INFERENCE-RESOURCES");

    private static final SubLString $str246$Destroy_problem_store_and_inferen = makeString("Destroy problem store and inference");

    private static final SubLSymbol GKE_TEST_QUERIES = makeSymbol("GKE-TEST-QUERIES");

    private static final SubLSymbol $sym248$_SENT = makeSymbol("?SENT");

    private static final SubLSymbol $sym249$_QUERY = makeSymbol("?QUERY");

    private static final SubLList $list250 = list(list(reader_make_constant_shell(makeString("sentenceParameterValueInSpecification")), makeSymbol("?SENT"), list(reader_make_constant_shell(makeString("TestQueryFn")), makeSymbol("?QUERY"))));

    private static final SubLObject $$TestVocabularyMt = reader_make_constant_shell(makeString("TestVocabularyMt"));

    private static final SubLString $str252$GKE_Query_Sentence_Literal_Manipu = makeString("GKE Query Sentence Literal Manipulation");

    private static final SubLString $$$GKE_Main_Test_Suite = makeString("GKE Main Test Suite");

    public static final SubLList $list254 = list(makeString("GKE Query Sentence Literal Manipulation"));

    private static final SubLSymbol TEST_CANDIDATE_REPLACEMENTS = makeSymbol("TEST-CANDIDATE-REPLACEMENTS");



    private static final SubLSymbol $sym257$CANDIDATE_REPLACEMENTS_EQUAL_ = makeSymbol("CANDIDATE-REPLACEMENTS-EQUAL?");





    private static final SubLList $list260 = list(makeSymbol("GKE-TEST-CASE-TABLES"));







    private static final SubLList $list264 = list(list(list(list(reader_make_constant_shell(makeString("dataForValveOfEventRecordsStenosisSeverity")), makeSymbol("?CARDIAC-VALVE-DATA"), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), reader_make_constant_shell(makeString("CCF-CAE-QueryMt"))), list(list(new SubLObject[]{ list(THREE_INTEGER), reader_make_constant_shell(makeString("CardiacValveStenosis_unknown")), reader_make_constant_shell(makeString("CardiacValveStenosis_critical")), reader_make_constant_shell(makeString("CardiacValveStenosis_trivial")), reader_make_constant_shell(makeString("CardiacValveStenosis_present")), reader_make_constant_shell(makeString("None-CardiacValveStenosis")), list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))), list(reader_make_constant_shell(makeString("SeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))), reader_make_constant_shell(makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), list(reader_make_constant_shell(makeString("MildPhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))), list(reader_make_constant_shell(makeString("MildToModeratePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))), list(reader_make_constant_shell(makeString("ModeratePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))), reader_make_constant_shell(makeString("Moderate-SevereToSevereCardiacValveStenosis")) }))));



    private static final SubLSymbol $sym266$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol SORT_RESULT = makeSymbol("SORT-RESULT");

    private static final SubLSymbol REMOVE_JAVALIST_DETAIL = makeSymbol("REMOVE-JAVALIST-DETAIL");

    private static final SubLList $list269 = cons(makeSymbol("ARG-POSITION"), makeSymbol("GROVES"));

    private static final SubLSymbol SORT_GROVE = makeSymbol("SORT-GROVE");

    private static final SubLSymbol $sym271$TERM___WITH_CONSTANT_BY_NAME = makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");



    private static final SubLSymbol SORT_TREE = makeSymbol("SORT-TREE");

    private static final SubLList $list274 = cons(makeSymbol("ROOT"), makeSymbol("SUBTREES"));

    private static final SubLList $list275 = listS(makeSymbol("ARG-POSITION"), makeSymbol("FLAT-LIST"), makeSymbol("GROVES"));

    public static final SubLList $list276 = list(makeSymbol("JAVALIST"), makeSymbol("TERM"));

    private static final SubLSymbol TEST_CANDIDATE_REPLACEMENT_RENDERERS_FOR_VARS = makeSymbol("TEST-CANDIDATE-REPLACEMENT-RENDERERS-FOR-VARS");

    private static final SubLList $list278 = list(list(list(list(reader_make_constant_shell(makeString("medicalTestRelevantToPhysiologicalConditionType")), reader_make_constant_shell(makeString("DiastolicBloodPressureTest")), reader_make_constant_shell(makeString("RenalDisease"))), list(reader_make_constant_shell(makeString("medicalTestRelevantToPhysiologicalConditionType")), makeSymbol("?X"), reader_make_constant_shell(makeString("RenalDisease"))), list(reader_make_constant_shell(makeString("DocumentReaderFollowupsForTaskMtFn")), reader_make_constant_shell(makeString("GenericMedicalResearchTask-Allotment")))), T));

    private static final SubLSymbol TEST_CANDIDATE_REPLACEMENT_RENDERERS_STUMPS = makeSymbol("TEST-CANDIDATE-REPLACEMENT-RENDERERS-STUMPS");

    private static final SubLList $list280 = list(list(list(list(reader_make_constant_shell(makeString("dataForValveOfEventRecordsStenosisSeverity")), makeSymbol("?CARDIAC-VALVE-DATA"), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt"))), list(list(list(list(THREE_INTEGER), list(new SubLObject[]{ list(reader_make_constant_shell(makeString("CardiacValveStenosis_critical"))), list(reader_make_constant_shell(makeString("CardiacValveStenosis_present"))), list(reader_make_constant_shell(makeString("CardiacValveStenosis_trivial"))), list(reader_make_constant_shell(makeString("CardiacValveStenosis_unknown"))), list(reader_make_constant_shell(makeString("Moderate-SevereToSevereCardiacValveStenosis")), list(list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("SeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))))), list(reader_make_constant_shell(makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), list(list(reader_make_constant_shell(makeString("ModeratePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("SeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))))), list(reader_make_constant_shell(makeString("None-CardiacValveStenosis"))), list(list(reader_make_constant_shell(makeString("MildPhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("MildToModeratePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))) }))), list(list(list(THREE_INTEGER), list(list(reader_make_constant_shell(makeString("Moderate-SevereToSevereCardiacValveStenosis")), list(list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("SeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))))), list(reader_make_constant_shell(makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), list(list(reader_make_constant_shell(makeString("ModeratePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("SeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))))))))));

    private static final SubLSymbol TEST_CANDIDATE_REPLACEMENT_RENDERERS = makeSymbol("TEST-CANDIDATE-REPLACEMENT-RENDERERS");

    private static final SubLObject $list282 = _constant_282_initializer();

    private static final SubLSymbol NARTIFY_AND_SUBSTITUTE_TERM_INTO_SENTENCE = makeSymbol("NARTIFY-AND-SUBSTITUTE-TERM-INTO-SENTENCE");

    private static final SubLList $list284 = list(list(list(reader_make_constant_shell(makeString("Italy")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?ACT"), list(reader_make_constant_shell(makeString("GovernmentFn")), reader_make_constant_shell(makeString("France")))), list(TWO_INTEGER, ONE_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), NIL, NIL, NIL), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?ACT"), list(reader_make_constant_shell(makeString("GovernmentFn")), reader_make_constant_shell(makeString("Italy"))))));

    private static final SubLObject $list285 = _constant_285_initializer();

    public static SubLObject get_gke_arg_options(final SubLObject aterm, final SubLObject arg_num, final SubLObject options_type, final SubLObject cycl_formula, SubLObject generation_mt, SubLObject domain_mt, final SubLObject depth, SubLObject orig_term) {
        if (orig_term == UNPROVIDED) {
            orig_term = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        generation_mt = hlmt_czer.canonicalize_hlmt(generation_mt);
        domain_mt = hlmt_czer.canonicalize_hlmt(domain_mt);
        final SubLObject arg = narts_high.nart_substitute(aterm);
        SubLObject options = NIL;
        SubLObject nl_values = NIL;
        SubLObject validity_list = NIL;
        SubLObject substitutions = NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            if (NIL != fort_types_interface.isa_relationP(arg, UNPROVIDED)) {
                options = get_arg_option_isa_relation(arg, arg_num, cycl_formula, domain_mt, depth, options_type);
            } else
                if (NIL != fort_types_interface.isa_collectionP(arg, UNPROVIDED)) {
                    options = get_arg_option_collection(arg, arg_num, cycl_formula, domain_mt, depth, orig_term, options_type);
                } else
                    if (NIL != kb_accessors.individualP(arg)) {
                        options = get_arg_option_individual(arg, arg_num, cycl_formula, domain_mt, depth, options_type);
                    } else {
                        format(T, $str1$Got_unknown_arg_type_for___A__, arg);
                    }


            final SubLObject datum_evaluated_var = get_gke_combine_with_is_valid_substitution(options, arg_num, cycl_formula, domain_mt);
            substitutions = datum_evaluated_var.first();
            validity_list = cadr(datum_evaluated_var);
            final SubLObject validity_dictionary = dictionary_utilities.add_values_from_lists_to_dictionary(substitutions, validity_list, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = pph_vars.$pph_language_mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                pph_vars.$pph_domain_mt$.bind(NIL != domain_mt ? pph_utilities.pph_canonicalize_hlmt(domain_mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
                if (options_type == $PARENTS) {
                    nl_values = gke_process_results(NIL, substitutions, UNPROVIDED, UNPROVIDED);
                } else {
                    nl_values = gke_process_results(T, substitutions, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_1_$2, thread);
                pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$1, thread);
            }
            if (NIL == list_utilities.same_length_p(nl_values, validity_list)) {
                Errors.warn($str3$Natural_language_processing_has_d, length(nl_values), length(validity_list));
            }
            validity_list = NIL;
            SubLObject cdolist_list_var = nl_values;
            SubLObject nl_value = NIL;
            nl_value = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                validity_list = cons(dictionary.dictionary_lookup(validity_dictionary, second(nl_value), UNPROVIDED), validity_list);
                cdolist_list_var = cdolist_list_var.rest();
                nl_value = cdolist_list_var.first();
            } 
            validity_list = nreverse(validity_list);
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return list(nl_values, validity_list);
    }

    public static SubLObject get_arg_option_isa_relation(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, final SubLObject options_type) {
        if (options_type == $CHILDREN) {
            return get_gke_spec_preds(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == $SIBLINGS) {
            return get_gke_instance_siblings(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == $PARENTS) {
            return get_gke_genl_preds(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        return NIL;
    }

    public static SubLObject get_arg_option_collection(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, final SubLObject orig_term, final SubLObject options_type) {
        if (options_type == $CHILDREN) {
            return get_gke_specs(arg, arg_num, cycl_formula, domain_mt, depth, orig_term);
        }
        if (options_type == $SIBLINGS) {
            return get_gke_collection_siblings(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == $PARENTS) {
            return get_gke_genls(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        return NIL;
    }

    public static SubLObject get_arg_option_individual(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, final SubLObject options_type) {
        if (options_type == $CHILDREN) {
            return NIL;
        }
        if (options_type == $SIBLINGS) {
            return get_gke_instance_siblings(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == $PARENTS) {
            return get_gke_isas(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        return NIL;
    }

    public static SubLObject get_gke_expanded_items(final SubLObject string, final SubLObject domain_mt, final SubLObject max_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = list_utilities.first_n(max_count, cb_frames.terms_for_browsing(string, UNPROVIDED, UNPROVIDED));
            result = pph_main.generate_disambiguation_phrases(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_gke_combine_with_is_valid_substitution(final SubLObject list_of_substitutes, final SubLObject term_position, final SubLObject original_expression, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLObject valid_substitutions = terms_pass_constraints(list_of_substitutes, term_position, original_expression, hlmt_czer.canonicalize_hlmt(domain_mt));
        return list(list_of_substitutes, valid_substitutions);
    }

    public static SubLObject get_gke_cycl_formulas_for_nl_phrase(final SubLObject nl_phrase, final SubLObject parsing_mt, final SubLObject domain_mt, final SubLObject timeout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parsing_timed_outP = NIL;
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
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
        final SubLObject _prev_bind_15 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
        final SubLObject _prev_bind_16 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
        final SubLObject _prev_bind_17 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
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
            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$3 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
                final SubLObject _prev_bind_2_$5 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
                try {
                    parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                    abnormal.$abnormality_checking_enabled$.bind(NIL, thread);
                    lexicon_vars.$exclude_vulgaritiesP$.bind(T, thread);
                    final SubLObject v_related_concepts = result = pph_main.generate_disambiguation_phrases(psp_main.ps_get_cycls_for_phrase(nl_phrase, $ANY, $ANY, NIL, psp_lexicon.get_default_psp_lexicon(hlmt_czer.canonicalize_hlmt(parsing_mt), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_2_$5, thread);
                    abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_1_$4, thread);
                    parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0_$3, thread);
                }
            }
            parsing_timed_outP = parsing_macros.parsing_timeout_time_reachedP();
        } finally {
            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_17, thread);
            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_16, thread);
            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_15, thread);
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
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_gke_quantifiers() {
        return gke_process_results(NIL, $list8, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_gke_quantifier_ranges() {
        return gke_process_results(NIL, $list9, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_list_item_comparator(final SubLObject item_a, final SubLObject item_b) {
        return funcall(symbol_function(STRING_LESSP), item_a.first().first(), item_b.first().first());
    }

    public static SubLObject gke_process_results(final SubLObject should_sort, final SubLObject args, SubLObject generation_mt, SubLObject domain_mt) {
        if (generation_mt == UNPROVIDED) {
            generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            pph_vars.$pph_domain_mt$.bind(NIL != domain_mt ? pph_utilities.pph_canonicalize_hlmt(domain_mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
            final SubLObject _prev_bind_0_$6 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$7 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$8 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$9 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$10 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        result = delete_if(symbol_function(NULL), list_utilities.nmapcar(NART_SUBSTITUTE, cardinality_estimates.sort_by_generality_estimate(remove_duplicates(list_utilities.first_n($int$200, args), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$10, thread);
                                }
                            } finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$9, thread);
                            }
                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        } finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$8, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$6, thread);
            }
            result = api_widgets.convert_term_list_to_renderings_for_java(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != should_sort) {
            return Sort.sort(result, symbol_function(GKE_LIST_ITEM_COMPARATOR), UNPROVIDED);
        }
        return result;
    }

    public static SubLObject get_gke_specs(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, SubLObject orig_term) {
        if (orig_term == UNPROVIDED) {
            orig_term = NIL;
        }
        SubLObject result = NIL;
        if ((NIL != orig_term) && (NIL != kb_accessors.individualP(orig_term))) {
            result = rkf_ontology_utilities.rkf_instantiations(arg, domain_mt);
            if (NIL != list_utilities.lengthG(result, $int$175, UNPROVIDED)) {
                result = list_utilities.first_n($int$175, isa.asserted_instance(arg, domain_mt));
            }
        }
        result = append(result, rkf_ontology_utilities.rkf_max_specs(arg, domain_mt));
        return result;
    }

    public static SubLObject get_gke_genls(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        return rkf_ontology_utilities.rkf_all_genls(arg, domain_mt);
    }

    public static SubLObject get_gke_spec_preds(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = genl_predicates.max_spec_predicates(arg, domain_mt, UNPROVIDED);
        SubLObject spec_pred = NIL;
        spec_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == gke_predicate_filteredP(spec_pred, domain_mt)) {
                result = cons(spec_pred, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_gke_genl_preds(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = genl_predicates.genl_predicate_roots(arg, domain_mt, UNPROVIDED);
        SubLObject genl_pred = NIL;
        genl_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == gke_predicate_filteredP(genl_pred, domain_mt)) {
                result = cons(genl_pred, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_gke_collection_siblings(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = remove_if($sym19$GKE_FILTERED_TERM_, list_utilities.flatten(Mapping.mapcar(symbol_function(RKF_MAX_SPECS), remove_if($sym19$GKE_FILTERED_TERM_, cardinality_estimates.sort_by_generality_estimate(rkf_ontology_utilities.rkf_min_genls(arg, domain_mt), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = union(result, remove_if($sym19$GKE_FILTERED_TERM_, list_utilities.flatten(Mapping.mapcar(symbol_function(RKF_MAX_SPECS), remove_if($sym19$GKE_FILTERED_TERM_, cardinality_estimates.sort_by_generality_estimate(rkf_ontology_utilities.rkf_min_isa(arg, domain_mt), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            result = union(result, get_gke_instance_siblings(arg, arg_num, cycl_formula, domain_mt, depth), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(result, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_gke_instance_siblings(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = remove_if($sym19$GKE_FILTERED_TERM_, list_utilities.flatten(Mapping.mapcar(symbol_function(RKF_INSTANTIATIONS), remove_if($sym19$GKE_FILTERED_TERM_, cardinality_estimates.sort_by_generality_estimate(rkf_ontology_utilities.rkf_min_isa(arg, domain_mt), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_gke_siblings(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = reverse(list_utilities.flatten(Mapping.mapcar(symbol_function(RKF_MAX_SPECS), rkf_ontology_utilities.rkf_min_genls(arg, UNPROVIDED))));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gke_process_results(T, result, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_self_to_quantify_over_isas(final SubLObject arg, final SubLObject domain_mt, final SubLObject alist) {
        if (NIL != isa.isaP(arg, $$Collection, domain_mt, UNPROVIDED)) {
            return cons(arg, alist);
        }
        return alist;
    }

    public static SubLObject get_gke_quantify_over_isas(final SubLObject arg, final SubLObject generation_mt, SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        domain_mt = hlmt_czer.canonicalize_hlmt(domain_mt);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            pph_vars.$pph_domain_mt$.bind(NIL != domain_mt ? pph_utilities.pph_canonicalize_hlmt(domain_mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
            result = gke_process_results(NIL, add_self_to_quantify_over_isas(arg, domain_mt, remove_if(GKE_ISAS_FILTERED_TERM, list_utilities.flatten(Mapping.mapcar(ALL_GENLS, remove_if(GKE_ISAS_FILTERED_TERM, isa.all_isa(arg, domain_mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_gke_isas(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        return remove_if(GKE_ISAS_FILTERED_TERM, list_utilities.flatten(Mapping.mapcar(RKF_ALL_GENLS, remove_if(GKE_ISAS_FILTERED_TERM, rkf_ontology_utilities.rkf_all_isa(arg, domain_mt), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_gke_isas_filtered_term() {
        final SubLObject cs = $gke_isas_filtered_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_gke_isas_filtered_term(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($gke_isas_filtered_term_caching_state$.getGlobalValue(), list(v_term, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_isas_filtered_term_internal(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject overly_general_collections = NIL;
        return makeBoolean(((NIL == v_term) || (NIL != subl_promotions.memberP(v_term, overly_general_collections, UNPROVIDED, UNPROVIDED))) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, domain_mt)));
    }

    public static SubLObject gke_isas_filtered_term(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $gke_isas_filtered_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GKE_ISAS_FILTERED_TERM, $gke_isas_filtered_term_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(gke_isas_filtered_term_internal(v_term, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_gke_filtered_termP() {
        final SubLObject cs = $gke_filtered_termP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_gke_filtered_termP(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($gke_filtered_termP_caching_state$.getGlobalValue(), list(v_term, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_filtered_termP_internal(final SubLObject v_term, final SubLObject domain_mt) {
        return makeBoolean(((((v_term == NIL) || (NIL != subl_promotions.memberP(cycl_utilities.hl_to_el(v_term), $gke_overly_general_non_predicate_types$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) || ((NIL != fort_types_interface.predicate_p(v_term)) && (NIL != gke_predicate_filteredP(v_term, domain_mt)))) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, domain_mt))) || (NIL != rkf_relevance_utilities.rkf_irrelevant_precision_suggestion(v_term, domain_mt)));
    }

    public static SubLObject gke_filtered_termP(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $gke_filtered_termP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym19$GKE_FILTERED_TERM_, $sym28$_GKE_FILTERED_TERM__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(gke_filtered_termP_internal(v_term, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_gke_predicate_filteredP() {
        final SubLObject cs = $gke_predicate_filteredP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_gke_predicate_filteredP(final SubLObject predicate, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($gke_predicate_filteredP_caching_state$.getGlobalValue(), list(predicate, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_predicate_filteredP_internal(final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject goodP = NIL;
        if (NIL == subl_promotions.memberP(predicate, $gke_overly_general_predicate_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == goodP) {
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (csome_list_var = $list32, pred = NIL, pred = csome_list_var.first(); (NIL == goodP) && (NIL != csome_list_var); goodP = kb_mapping_utilities.some_pred_value(predicate, pred, ONE_INTEGER, $TRUE) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(NIL == goodP);
    }

    public static SubLObject gke_predicate_filteredP(final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject caching_state = $gke_predicate_filteredP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym30$GKE_PREDICATE_FILTERED_, $sym33$_GKE_PREDICATE_FILTERED__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(gke_predicate_filteredP_internal(predicate, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject terms_pass_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        assert NIL != listp(replacement_terms) : "Types.listp(replacement_terms) " + "CommonSymbols.NIL != Types.listp(replacement_terms) " + replacement_terms;
        assert NIL != list_utilities.tree_position_p(term_position) : "list_utilities.tree_position_p(term_position) " + "CommonSymbols.NIL != list_utilities.tree_position_p(term_position) " + term_position;
        assert NIL != collection_defns.cycl_formulaP(formula) : "collection_defns.cycl_formulaP(formula) " + "CommonSymbols.NIL != collection_defns.cycl_formulaP(formula) " + formula;
        final SubLObject mt = hlmt_czer.canonicalize_hlmt(domain_mt);
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        if (list_utilities.last_one(term_position).isZero()) {
            return operator_terms_pass_constraints(replacement_terms, term_position, formula, mt);
        }
        return argument_terms_pass_constraints(replacement_terms, term_position, formula, mt);
    }

    public static SubLObject operator_terms_pass_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!list_utilities.last_one(term_position).isZero())) {
            Errors.error($str38$OPERATOR_TERMS_PASS_CONSTRAINTS_r, term_position);
        }
        SubLObject new_formula = copy_expression(formula);
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = wff_utilities.$check_arityP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            $within_assert$.bind(NIL, thread);
            wff_vars.$validate_constantsP$.bind(NIL, thread);
            wff_vars.$permit_keyword_variablesP$.bind(NIL, thread);
            wff_utilities.$check_var_typesP$.bind(NIL, thread);
            wff_utilities.$check_arityP$.bind(NIL, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$13 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$15 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$16 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        SubLObject cdolist_list_var = replacement_terms;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            new_formula = cycl_utilities.formula_arg_position_nsubst(v_term, term_position, new_formula);
                            result = cons(T, result);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        } 
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$16, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$15, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$14, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$13, thread);
            }
        } finally {
            wff_utilities.$check_arityP$.rebind(_prev_bind_11, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_10, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_9, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_8, thread);
            $within_assert$.rebind(_prev_bind_7, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_6, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_5, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject argument_terms_pass_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && list_utilities.last_one(term_position).isZero()) {
            Errors.error($str39$OPERATOR_TERMS_PASS_CONSTRAINTS_r, term_position);
        }
        if (NIL != $use_rbp_wff_in_gkeP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
            try {
                parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
                result = rbp_wff.rbp_wff_check_formula_arg_position_replacements(formula, term_position, replacement_terms);
            } finally {
                parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return argument_terms_pass_isa_genls_constraints(replacement_terms, term_position, formula, domain_mt);
    }

    public static SubLObject argument_terms_pass_isa_genls_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result_vector = make_vector(length(replacement_terms), UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$19 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_2_$20 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                thread.resetMultipleValues();
                final SubLObject isa_constraints = at_utilities.term_position_requires_types_in_relation(term_position, formula, UNPROVIDED);
                final SubLObject genl_constraints = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject list_var = NIL;
                SubLObject v_term = NIL;
                SubLObject n = NIL;
                list_var = replacement_terms;
                v_term = list_var.first();
                for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , n = add(ONE_INTEGER, n)) {
                    SubLObject problemP = makeBoolean(NIL == cycl_grammar.cycl_denotational_term_p(v_term));
                    if (NIL == problemP) {
                        SubLObject csome_list_var = genl_constraints;
                        SubLObject required_genl = NIL;
                        required_genl = csome_list_var.first();
                        while ((NIL == problemP) && (NIL != csome_list_var)) {
                            if (NIL == genls.genlsP(v_term, required_genl, UNPROVIDED, UNPROVIDED)) {
                                problemP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            required_genl = csome_list_var.first();
                        } 
                    }
                    if (NIL == problemP) {
                        SubLObject csome_list_var = isa_constraints;
                        SubLObject required_isa = NIL;
                        required_isa = csome_list_var.first();
                        while ((NIL == problemP) && (NIL != csome_list_var)) {
                            if (NIL == isa.isaP(v_term, required_isa, UNPROVIDED, UNPROVIDED)) {
                                problemP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            required_isa = csome_list_var.first();
                        } 
                    }
                    set_aref(result_vector, n, makeBoolean(NIL == problemP));
                }
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$20, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$19, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$18, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return vector_utilities.vector_elements(result_vector, UNPROVIDED);
    }

    public static SubLObject get_gke_naut_arg_position(SubLObject arg_pos, final SubLObject cycl_formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ret_arg_pos = arg_pos;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != possibly_naut_p(cycl_utilities.formula_arg_position(cycl_formula, arg_pos, UNPROVIDED))) {
                ret_arg_pos = arg_pos;
            } else {
                SubLObject possible_naut = NIL;
                SubLObject end;
                SubLObject i;
                for (end = subtract(length(arg_pos), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; !i.numGE(end); i = add(i, ONE_INTEGER)) {
                    arg_pos = list_utilities.remove_last(arg_pos);
                    possible_naut = cycl_utilities.formula_arg_position(cycl_formula, arg_pos, UNPROVIDED);
                    if (NIL != cycl_grammar.cycl_nat_p(possible_naut)) {
                        ret_arg_pos = arg_pos;
                        i = end;
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ret_arg_pos;
    }

    public static SubLObject get_gke_is_known(final SubLObject cycl_formula, final SubLObject domain_mt) {
        return rkf_query_utilities.rkf_known(cycl_formula, domain_mt, UNPROVIDED);
    }

    public static SubLObject simulate_gke_query_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terseP, SubLObject task) {
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        if (terseP == UNPROVIDED) {
            terseP = T;
        }
        if (task == UNPROVIDED) {
            task = $const43$GenericIntelligenceAnalysis_CAE_A;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject paraphrase_mt = query_library_utils.cae_default_paraphrase_mt(task);
        final SubLObject nl_domain_mt = query_library_utils.cae_default_nl_domain_mt(task);
        thread.resetMultipleValues();
        final SubLObject javalist = (NIL != terseP) ? simulate_gke_query_paraphrase_terse(query_sentence, paraphrase_mt, nl_domain_mt) : simulate_gke_query_paraphrase_verbose(query_sentence, paraphrase_mt, nl_domain_mt);
        final SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($HTML)) {
            return values(pph_utilities.pph_javalist_html_string(javalist, UNPROVIDED), supports);
        }
        if (pcase_var.eql($TEXT)) {
            return values(pph_utilities.pph_javalist_string(javalist), supports);
        }
        return NIL;
    }

    public static SubLObject simulate_ccf_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terse) {
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        if (terse == UNPROVIDED) {
            terse = T;
        }
        return html_markup(simulate_gke_query_paraphrase(query_sentence, mode, terse, $const45$GenericMedicalResearchTask_Allotm));
    }

    public static SubLObject simulate_ccf3_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terse) {
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        if (terse == UNPROVIDED) {
            terse = T;
        }
        return html_markup(simulate_gke3_query_paraphrase(query_sentence, mode, terse, $const45$GenericMedicalResearchTask_Allotm));
    }

    public static SubLObject simulate_gke_query_paraphrase_terse(final SubLObject query_sentence, final SubLObject paraphrase_mt, final SubLObject nl_domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = NIL;
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind(T, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(T, thread);
            pph_vars.$paraphrase_precision$.bind(NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_maximize_linksP$.bind(NIL, thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject the_javalist = pph_main.generate_phrase_for_java(query_sentence, $DEFAULT, $DECLARATIVE, paraphrase_mt, nl_domain_mt, UNPROVIDED);
            final SubLObject ignore_me = thread.secondMultipleValue();
            final SubLObject the_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            javalist = the_javalist;
            supports = the_justification;
        } finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        return values(javalist, supports);
    }

    public static SubLObject simulate_gke_query_paraphrase_verbose(final SubLObject query_sentence, final SubLObject paraphrase_mt, final SubLObject nl_domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = NIL;
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind(NIL, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(T, thread);
            pph_vars.$paraphrase_precision$.bind(NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_maximize_linksP$.bind(T, thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject the_javalist = pph_main.generate_phrase_for_java(query_sentence, $DEFAULT, $DECLARATIVE, paraphrase_mt, nl_domain_mt, UNPROVIDED);
            final SubLObject ignore_me = thread.secondMultipleValue();
            final SubLObject the_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            javalist = the_javalist;
            supports = the_justification;
        } finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        return values(javalist, supports);
    }

    public static SubLObject simulate_gke3_query_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terseP, SubLObject task) {
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        if (terseP == UNPROVIDED) {
            terseP = T;
        }
        if (task == UNPROVIDED) {
            task = $const43$GenericIntelligenceAnalysis_CAE_A;
        }
        final SubLObject params_$21;
        final SubLObject params = params_$21 = nl_generation_api.new_pph_parameters(UNPROVIDED);
        pph_parameter_declarations.set_pph_lexical_context_internal(params_$21, query_library_utils.cae_default_paraphrase_mt(task));
        final SubLObject params_$22 = params;
        pph_parameter_declarations.set_pph_semantic_mt_internal(params_$22, query_library_utils.cae_default_nl_domain_mt(task));
        final SubLObject params_$23 = params;
        pph_parameter_declarations.set_prefer_terse_paraphraseP_internal(params_$23, terseP);
        return simulate_gke3_paraphrase_guts(query_sentence, params);
    }

    public static SubLObject simulate_gke3_paraphrase_guts(final SubLObject query_sentence, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = NIL;
        pph_parameter_declarations.set_maximize_linksP_internal(params, NIL);
        pph_parameter_declarations.set_use_smart_variable_replacementP_internal(params, T);
        pph_parameter_declarations.set_demerit_cutoff_internal(params, number_utilities.positive_infinity());
        pph_parameter_declarations.set_use_title_capitalizationP_internal(params, NIL);
        pph_parameter_declarations.set_use_indexical_datesP_internal(params, NIL);
        pph_parameter_declarations.set_quantify_variablesP_internal(params, NIL);
        pph_parameter_declarations.set_pph_sentential_force_internal(params, $NONE);
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_speaker$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(NIL, thread);
            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                if (NIL != collection_defns.cycl_open_formulaP(query_sentence)) {
                    format(stream, $$$Show_all_values_of_);
                    gke3_paraphrase_open_vars(stream, query_sentence, params);
                    format(stream, $str51$_such_that__);
                } else {
                    format(stream, $str52$Is_it_true_that__);
                }
                gke3_paraphrase_guts_int(stream, query_sentence, params, TWO_INTEGER);
                output_string = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            pph_vars.$pph_speaker$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return output_string;
    }

    public static SubLObject gke3_paraphrase_open_vars(final SubLObject stream, final SubLObject query_sentence, final SubLObject params) {
        final SubLObject open_vars = sentence_free_variables(query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject var_term = cons($$TheCoordinationSet, open_vars);
        final SubLObject pph_map = nl_generation_api.cycl_term_to_nl_internal(var_term, params).first();
        final SubLObject string = nl_generation_api.pph_output_map_to_html_internal(pph_map, PPH_ANCHOR_TAGS_FOR_TERM, T, ZERO_INTEGER, T, NIL);
        return princ(string, stream);
    }

    public static SubLObject gke3_paraphrase_guts_int(final SubLObject stream, SubLObject sentence, final SubLObject params, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$thereExists)) {
            gke3_paraphrase_guts_int(stream, cycl_utilities.formula_arg2(sentence, UNPROVIDED), params, depth);
        } else {
            if (NIL != starts_with_gke3_connectiveP(sentence)) {
                final SubLObject connective = starts_with_gke3_connectiveP(sentence);
                if ((NIL == list_utilities.lengthE(sentence, TWO_INTEGER, UNPROVIDED)) || (NIL != member(connective, $list56, UNPROVIDED, UNPROVIDED))) {
                    string_utilities.indent(stream, depth);
                    princ(gke3_string_for_conjunction(connective), stream);
                    terpri(stream);
                    depth = add(depth, TWO_INTEGER);
                    if (connective == $NOR) {
                        sentence = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
                    }
                }
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject conjunct = NIL;
                conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    gke3_paraphrase_guts_int(stream, conjunct, params, depth);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                } 
                return NIL;
            }
            if (NIL != collection_defns.cycl_atomic_sentenceP(sentence)) {
                final SubLObject pph_map = nl_generation_api.cycl_term_to_nl_internal(sentence, params).first();
                final SubLObject string = nl_generation_api.pph_output_map_to_html_internal(pph_map, PPH_ANCHOR_TAGS_FOR_TERM, T, ZERO_INTEGER, T, NIL);
                string_utilities.indent(stream, depth);
                princ(string, stream);
                terpri(stream);
            }
        }
        return NIL;
    }

    public static SubLObject starts_with_gke3_connectiveP(final SubLObject sentence) {
        if (cycl_utilities.formula_arg0(sentence).eql($$and)) {
            return $AND;
        }
        if ((NIL != member(cycl_utilities.formula_arg0(sentence), $list61, UNPROVIDED, UNPROVIDED)) && cycl_utilities.formula_arg_position(sentence, $list62, UNPROVIDED).eql($$or)) {
            return $NOR;
        }
        if (NIL != member(cycl_utilities.formula_arg0(sentence), $list61, UNPROVIDED, UNPROVIDED)) {
            return $NOT;
        }
        if (cycl_utilities.formula_arg0(sentence).eql($$or)) {
            return $OR;
        }
        return NIL;
    }

    public static SubLObject gke3_string_for_conjunction(final SubLObject conj) {
        if (conj.eql($AND)) {
            return $$$All_of_the_following_are_true;
        }
        if (conj.eql($OR)) {
            return $str67$At_least_one_of_the_following_is_;
        }
        if (conj.eql($NOR)) {
            return $$$None_of_the_following_is_true;
        }
        if (conj.eql($NOT)) {
            return $$$None_of_the_following_is_true;
        }
        return NIL;
    }

    public static SubLObject simulate_gke_term_paraphrase(final SubLObject v_term, SubLObject mode, SubLObject terseP) {
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        if (terseP == UNPROVIDED) {
            terseP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = NIL;
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind(terseP, thread);
            pph_vars.$paraphrase_precision$.bind(makeBoolean(NIL == terseP), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_maximize_linksP$.bind(makeBoolean(NIL == terseP), thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$32 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$33 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$34 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$35 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    thread.resetMultipleValues();
                                    final SubLObject the_javalist = pph_main.generate_phrase_for_java(v_term, $DEFAULT, $NONE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject ignore_me = thread.secondMultipleValue();
                                    final SubLObject the_justification = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    javalist = the_javalist;
                                    supports = the_justification;
                                } finally {
                                    final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$35, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$34, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$33, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$32, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($HTML)) {
            return values(pph_utilities.pph_javalist_html_string(javalist, UNPROVIDED), supports);
        }
        if (pcase_var.eql($TEXT)) {
            return values(pph_utilities.pph_javalist_string(javalist), supports);
        }
        return NIL;
    }

    public static SubLObject gke_add_cloned_literal(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject domain_mt, SubLObject connective) {
        if (connective == UNPROVIDED) {
            connective = $AND;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject valid_connectives = $list70;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(connective, valid_connectives, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str71$_S_must_be_one_of__S, connective, valid_connectives);
        }
        SubLObject ans = copy_expression(query_sentence);
        thread.resetMultipleValues();
        final SubLObject target_literal = gke_find_literal_to_clone(query_sentence, arg_position);
        final SubLObject target_literal_arg_position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ($ERROR != target_literal) {
            final SubLObject new_literal = loosen_gke_literal(target_literal, UNPROVIDED);
            ans = gke_add_literal(query_sentence, target_literal_arg_position, new_literal, connective);
        }
        return ans;
    }

    public static SubLObject gke_strengthen_query_sentence(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = copy_expression(query_sentence);
        thread.resetMultipleValues();
        final SubLObject target_literal = gke_find_literal_to_strengthen(query_sentence, arg_position);
        final SubLObject target_literal_arg_position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ($ERROR != target_literal) {
            final SubLObject new_literal = strengthen_gke_literal(target_literal, UNPROVIDED);
            ans = gke_formula_arg_position_subst(new_literal, target_literal_arg_position, query_sentence);
        }
        return ans;
    }

    public static SubLObject gke_remove_literal(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = copy_expression(query_sentence);
        thread.resetMultipleValues();
        final SubLObject target_literal = gke_find_literal_to_remove(query_sentence, arg_position);
        final SubLObject target_literal_arg_position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (($ERROR != target_literal) && (NIL != target_literal_arg_position)) {
            final SubLObject enclosing_arg_position = butlast(target_literal_arg_position, UNPROVIDED);
            final SubLObject enclosing_formula = gke_formula_arg_position(query_sentence, enclosing_arg_position, UNPROVIDED);
            if (((NIL != el_disjunction_p(enclosing_formula)) || (NIL != el_conjunction_p(enclosing_formula))) && (NIL != formula_arityG(enclosing_formula, ONE_INTEGER, UNPROVIDED))) {
                SubLObject juncts = NIL;
                final SubLObject target_arg_num = list_utilities.last_one(target_literal_arg_position);
                SubLObject current_arg_num = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(enclosing_formula, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    current_arg_num = add(current_arg_num, ONE_INTEGER);
                    if (!current_arg_num.eql(target_arg_num)) {
                        juncts = cons(arg, juncts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
                ans = (NIL != list_utilities.lengthG(juncts, ONE_INTEGER, UNPROVIDED)) ? make_el_formula(cycl_utilities.formula_arg0(enclosing_formula), nreverse(juncts), UNPROVIDED) : juncts.first();
                if (NIL != enclosing_arg_position) {
                    ans = replace_formula_arg_position(enclosing_arg_position, ans, query_sentence);
                }
            }
        }
        return ans;
    }

    public static SubLObject gke_find_literal_to_clone(final SubLObject query_sentence, final SubLObject arg_position) {
        return gke_find_literal_for_arg_position(query_sentence, arg_position);
    }

    public static SubLObject gke_find_literal_to_remove(final SubLObject query_sentence, final SubLObject arg_position) {
        return gke_find_literal_for_arg_position(query_sentence, arg_position);
    }

    public static SubLObject gke_find_literal_to_strengthen(final SubLObject query_sentence, final SubLObject arg_position) {
        return gke_find_literal_for_arg_position(query_sentence, arg_position);
    }

    public static SubLObject gke_find_literal_for_arg_position(final SubLObject query_sentence, final SubLObject arg_position) {
        SubLObject target_literal_arg_position;
        SubLObject target_literal;
        for (target_literal_arg_position = butlast(arg_position, UNPROVIDED), target_literal = cycl_utilities.formula_arg_position(query_sentence, target_literal_arg_position, UNPROVIDED); (NIL == atomic_sentenceP(target_literal)) && (NIL == list_utilities.lengthL(target_literal_arg_position, TWO_INTEGER, UNPROVIDED)); target_literal_arg_position = butlast(target_literal_arg_position, UNPROVIDED) , target_literal = cycl_utilities.formula_arg_position(query_sentence, target_literal_arg_position, UNPROVIDED)) {
        }
        if (NIL == atomic_sentenceP(target_literal)) {
            target_literal = $ERROR;
            target_literal_arg_position = $ERROR;
        }
        return values(target_literal, target_literal_arg_position);
    }

    public static SubLObject gke_add_literal(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject new_literal, final SubLObject connective) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject siblings = gke_get_siblings(query_sentence, arg_position, connective);
        final SubLObject replace_enclosing_formulaP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_sub_formula = (connective == $AND) ? simplifier.conjoin(cons(new_literal, siblings), UNPROVIDED) : simplifier.disjoin(cons(new_literal, siblings), UNPROVIDED);
        final SubLObject target_arg_position = (NIL != replace_enclosing_formulaP) ? butlast(arg_position, UNPROVIDED) : arg_position;
        final SubLObject new_query_sentence = gke_formula_arg_position_subst(new_sub_formula, target_arg_position, query_sentence);
        return new_query_sentence;
    }

    public static SubLObject gke_get_siblings(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject connective) {
        if (NIL == arg_position) {
            return values(list(query_sentence), NIL);
        }
        final SubLObject enclosing_formula = gke_formula_arg_position(query_sentence, butlast(arg_position, UNPROVIDED), UNPROVIDED);
        if ((connective == $AND) && (NIL != el_conjunction_p(enclosing_formula))) {
            return values(cycl_utilities.formula_args(enclosing_formula, UNPROVIDED), T);
        }
        if ((connective == $OR) && (NIL != el_disjunction_p(enclosing_formula))) {
            return values(cycl_utilities.formula_args(enclosing_formula, UNPROVIDED), T);
        }
        return values(list(gke_formula_arg_position(query_sentence, arg_position, UNPROVIDED)), NIL);
    }

    public static SubLObject gke_formula_arg_position(final SubLObject formula, final SubLObject arg_position, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (NIL != cycl_utilities.arg_position_p(arg_position)) {
            return cycl_utilities.formula_arg_position(formula, arg_position, v_default);
        }
        if (NIL == arg_position) {
            return values(formula, T);
        }
        return values(v_default, NIL);
    }

    public static SubLObject gke_formula_arg_position_subst(final SubLObject new_term, final SubLObject arg_position, final SubLObject formula) {
        if (NIL != cycl_utilities.arg_position_p(arg_position)) {
            return cycl_utilities.formula_arg_position_subst(new_term, arg_position, formula);
        }
        if (NIL == arg_position) {
            return new_term;
        }
        return formula;
    }

    public static SubLObject loosen_gke_literal(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = constants_high.find_constant($$$GKEReformulationRuleHoldingMt);
        }
        assert NIL != el_grammar.el_sentence_p(literal) : "el_grammar.el_sentence_p(literal) " + "CommonSymbols.NIL != el_grammar.el_sentence_p(literal) " + literal;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        final SubLObject settings = reformulator_settings_for_gke($LOOSEN);
        SubLObject v_answer = literal;
        if (NIL != settings) {
            v_answer = reformulator_hub.reformulate_cycl(literal, mt, settings);
        }
        return v_answer;
    }

    public static SubLObject strengthen_gke_literal(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = constants_high.find_constant($$$GKEReformulationRuleHoldingMt);
        }
        assert NIL != el_grammar.el_sentence_p(literal) : "el_grammar.el_sentence_p(literal) " + "CommonSymbols.NIL != el_grammar.el_sentence_p(literal) " + literal;
        if (NIL == mt) {
            return literal;
        }
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        final SubLObject settings = reformulator_settings_for_gke($STRENGTHEN);
        SubLObject v_answer = literal;
        if (NIL != settings) {
            v_answer = reformulator_hub.reformulate_cycl(literal, mt, settings);
        }
        return v_answer;
    }

    public static SubLObject reformulator_settings_for_gke(final SubLObject mode) {
        if (mode.eql($LOOSEN)) {
            final SubLObject meta_predicate = constants_high.find_constant($str78$useReformulationRuleForGuidedKnow);
            SubLObject settings = NIL;
            if (NIL != valid_constantP(meta_predicate, UNPROVIDED)) {
                final SubLObject meta_predicates = list(meta_predicate);
                settings = list($META_PREDICATES, meta_predicates);
            }
            return settings;
        }
        return NIL;
    }

    public static SubLObject sentence_substitution_wffP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_assume_conjuncts_independentP$.currentBinding(thread);
        try {
            at_vars.$at_assume_conjuncts_independentP$.bind(NIL, thread);
            wffP = wff.el_wffP(sentence, mt, UNPROVIDED);
        } finally {
            at_vars.$at_assume_conjuncts_independentP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }

    public static SubLObject free_variable(final SubLObject variable, final SubLObject sentence) {
        if (NIL != formula_pattern_match.formula_matches_pattern(sentence, listS($$thereExists, variable, $list80))) {
            return third(sentence);
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(sentence, $list81)) {
            return list($$thereExists, second(sentence), free_variable(variable, third(sentence)));
        }
        return sentence;
    }

    public static SubLObject existentially_boundP(final SubLObject variable, final SubLObject sentence) {
        if (NIL != formula_pattern_match.formula_matches_pattern(sentence, listS($$thereExists, variable, $list80))) {
            return T;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(sentence, $list81)) {
            return existentially_boundP(variable, third(sentence));
        }
        return NIL;
    }

    public static SubLObject possible_sentence_substitutions(final SubLObject string, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject allow_coercionP, SubLObject generation_mt, SubLObject parsing_mt, SubLObject possibly_strip_extraneous_punctuationP, SubLObject force, SubLObject nl_preds, SubLObject string_match_options, SubLObject instance_limit) {
        if (allow_coercionP == UNPROVIDED) {
            allow_coercionP = T;
        }
        if (generation_mt == UNPROVIDED) {
            generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (parsing_mt == UNPROVIDED) {
            parsing_mt = $$EnglishMt;
        }
        if (possibly_strip_extraneous_punctuationP == UNPROVIDED) {
            possibly_strip_extraneous_punctuationP = T;
        }
        if (force == UNPROVIDED) {
            force = $NONE;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = list($$nonPlural_Generic);
        }
        if (string_match_options == UNPROVIDED) {
            string_match_options = $list85;
        }
        if (instance_limit == UNPROVIDED) {
            instance_limit = TEN_INTEGER;
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject ans = NIL;
        SubLObject isa_constraint = formula_arg_pos_isa_constraint(sentence, arg_pos, domain_mt);
        SubLObject non_wffP = NIL;
        SubLObject candidates = api_widgets.get_constrained_cycl_for_string_int(string, isa_constraint, domain_mt, generation_mt, parsing_mt, NIL, NIL, possibly_strip_extraneous_punctuationP, force, nl_preds, NIL, NIL, string_match_options, instance_limit);
        SubLObject allow_non_wffP = NIL;
        ans = substitute_terms_into_sentence(candidates, sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
        if ((NIL != allow_coercionP) && (NIL != list_utilities.empty_list_p(ans))) {
            isa_constraint = $$Thing;
            SubLObject cdolist_list_var;
            candidates = cdolist_list_var = delete_duplicates(append(candidates, api_widgets.get_constrained_cycl_for_string_int(string, isa_constraint, domain_mt, generation_mt, parsing_mt, NIL, NIL, possibly_strip_extraneous_punctuationP, force, nl_preds, NIL, NIL, string_match_options, instance_limit)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject candidate = NIL;
            candidate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_term = last(candidate, UNPROVIDED).first();
                SubLObject new_sentence = coerce_term_into_sentence(v_term, sentence, arg_pos, replace_all, domain_mt, UNPROVIDED);
                if (NIL != new_sentence) {
                    if (NIL != el_formula_p(new_sentence)) {
                        new_sentence = optimize_el_formula_variable_names(new_sentence, generation_mt, domain_mt, UNPROVIDED);
                    }
                    ans = cons(list(candidate, new_sentence), ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate = cdolist_list_var.first();
            } 
        }
        if (NIL != list_utilities.empty_list_p(ans)) {
            allow_non_wffP = T;
            ans = substitute_terms_into_sentence(candidates, sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
            if (NIL != list_utilities.non_empty_list_p(ans)) {
                non_wffP = T;
            }
        }
        return list(nreverse(ans), non_wffP);
    }

    public static SubLObject formula_arg_pos_isa_constraint(final SubLObject sentence, final SubLObject arg_pos, final SubLObject mt) {
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
        final SubLObject constraints = at_var_types.formula_variable_isa_constraints(var, replace_formula_arg_position(arg_pos, var, sentence), mt, UNPROVIDED);
        return NIL != constraints ? list_utilities.extremal(constraints, $sym88$GENERALITY_ESTIMATE_, UNPROVIDED) : $$Thing;
    }

    public static SubLObject substitute_term_into_sentence(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject try_coercionP, SubLObject allow_non_wffP, SubLObject optimize_var_namesP) {
        if (try_coercionP == UNPROVIDED) {
            try_coercionP = T;
        }
        if (allow_non_wffP == UNPROVIDED) {
            allow_non_wffP = NIL;
        }
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_sentence = cycl_utilities.expression_transform(sentence, NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == formula_has_arg_position_p(el_sentence, arg_pos))) {
            Errors.error($str92$_S_does_not_have_arg_position__S, sentence, arg_pos);
        }
        SubLObject ans = substitute_term_into_sentence_int(v_term, el_sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
        if ((NIL != try_coercionP) && (NIL == ans)) {
            ans = coerce_term_into_sentence(v_term, el_sentence, arg_pos, replace_all, domain_mt, UNPROVIDED);
        }
        if ((NIL != optimize_var_namesP) && (NIL != el_formula_p(ans))) {
            ans = optimize_el_formula_variable_names(ans, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, sentence);
        }
        return ans;
    }

    public static SubLObject substitute_terms_into_sentence(final SubLObject renderings, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, final SubLObject allow_non_wffP) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = renderings;
        SubLObject rendering = NIL;
        rendering = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = second(rendering);
            final SubLObject new_sentence = substitute_term_into_sentence_int(v_term, sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
            if (NIL != new_sentence) {
                ans = cons(list(rendering, new_sentence), ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rendering = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject substitute_term_into_sentence_int(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, final SubLObject allow_non_wffP) {
        final SubLObject replaced_term = cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED);
        SubLObject new_sentence = (NIL != replace_all) ? cycl_utilities.expression_subst(v_term, replaced_term, sentence, symbol_function(EQUAL), UNPROVIDED) : replace_formula_arg_position(arg_pos, v_term, sentence);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(new_sentence, symbol_function(EL_FORMULA_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject expression = NIL;
        expression = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != formula_pattern_match.formula_matches_pattern(expression, listS($$thereExists, v_term, $list80))) {
                new_sentence = cycl_utilities.expression_nsubst(quantified_sub_sentence(expression), expression, new_sentence, symbol_function(EQUAL), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        } 
        if (((NIL != cycl_variables.cyc_varP(replaced_term)) && (NIL != existentially_boundP(replaced_term, new_sentence))) && (NIL == list_utilities.tree_find(replaced_term, free_variable(replaced_term, new_sentence), UNPROVIDED, UNPROVIDED))) {
            new_sentence = free_variable(replaced_term, new_sentence);
        }
        if ((NIL != allow_non_wffP) || (NIL != sentence_substitution_wffP(new_sentence, domain_mt))) {
            return new_sentence;
        }
        return NIL;
    }

    public static SubLObject coerce_term_into_sentence(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject optimize_el_formula_variable_namesP) {
        if (optimize_el_formula_variable_namesP == UNPROVIDED) {
            optimize_el_formula_variable_namesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isa.isaP(v_term, $$Collection, domain_mt, UNPROVIDED)) {
            final SubLObject new_variable = czer_utilities.unique_el_var_wrt_expression(sentence, UNPROVIDED);
            SubLObject new_sentence = free_variable(cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED), sentence);
            if (NIL != replace_all) {
                new_sentence = sublis(list(bq_cons(cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED), new_variable)), new_sentence, UNPROVIDED, UNPROVIDED);
            } else {
                new_sentence = free_variable(cycl_utilities.formula_arg_position(sentence, arg_pos, UNPROVIDED), replace_formula_arg_position(arg_pos, new_variable, sentence));
            }
            final SubLObject new_literal = list($$isa, new_variable, v_term);
            thread.resetMultipleValues();
            final SubLObject uniq_new_literal = value_tables.varmap_uniquify_source_vars(new_literal, new_sentence);
            final SubLObject var_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != replace_all) {
                new_sentence = query_library_api.combine_formulas_at_position($list95, new_sentence, NIL, NIL, NIL, NIL);
                new_sentence = query_library_api.combine_formulas_at_position(new_sentence, uniq_new_literal, NIL, NIL, NIL, NIL);
            } else {
                new_sentence = query_library_api.combine_formulas_at_position(new_sentence, uniq_new_literal, butlast(arg_pos, UNPROVIDED), NIL, NIL, NIL);
            }
            final SubLObject new_variable_alias = list_utilities.alist_lookup(var_map, new_variable, UNPROVIDED, UNPROVIDED);
            new_sentence = cycl_utilities.formula_subst(new_variable, new_variable_alias, new_sentence, UNPROVIDED, UNPROVIDED);
            if (NIL != sentence_substitution_wffP(new_sentence, domain_mt)) {
                final SubLObject best_var_name = (NIL != optimize_el_formula_variable_namesP) ? optimize_el_formula_variable_name(new_variable, new_sentence, UNPROVIDED, UNPROVIDED) : cycl_variables.el_var_name(new_variable);
                final SubLObject other_vars = cycl_utilities.expression_gather(new_sentence, symbol_function($sym96$EL_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject other_var_names = Mapping.mapcar(symbol_function(EL_VAR_NAME), other_vars);
                final SubLObject unique_var_name = czer_utilities.unique_var_name_wrt(best_var_name, other_var_names);
                final SubLObject new_variable2 = correct_variable(cycl_variables.make_el_var(unique_var_name));
                final SubLObject new_sentence2 = nsublis(list(bq_cons(new_variable, new_variable2)), new_sentence, UNPROVIDED, UNPROVIDED);
                return new_sentence2;
            }
            return NIL;
        } else {
            if (NIL == isa.isaP(v_term, $$Individual, domain_mt, UNPROVIDED)) {
                return NIL;
            }
            final SubLObject new_term = kb_utilities.set_to_collection(list($$TheSet, v_term), domain_mt);
            SubLObject new_sentence = substitute_term_into_sentence_int(new_term, sentence, arg_pos, replace_all, domain_mt, NIL);
            if (NIL == new_sentence) {
                return NIL;
            }
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(new_sentence, symbol_function(LISTP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject expression = NIL;
            expression = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != formula_pattern_match.formula_matches_pattern(expression, list($$isa, $EL_VARIABLE, new_term))) {
                    final SubLObject obsolete_variable = second(expression);
                    SubLObject cdolist_list_var_$38;
                    final SubLObject arg_positions = cdolist_list_var_$38 = cycl_utilities.arg_positions_dfs(expression, new_sentence, symbol_function(EQUAL));
                    SubLObject arg_pos_$39 = NIL;
                    arg_pos_$39 = cdolist_list_var_$38.first();
                    while (NIL != cdolist_list_var_$38) {
                        if (NIL != arg_pos_$39) {
                            final SubLObject group_arg_pos = butlast(arg_pos_$39, UNPROVIDED);
                            SubLObject group = cycl_utilities.formula_arg_position(new_sentence, group_arg_pos, UNPROVIDED);
                            if (group.first().eql($$and) && (NIL != list_utilities.lengthG(group, TWO_INTEGER, UNPROVIDED))) {
                                group = remove(expression, group, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                group = cycl_utilities.formula_subst(v_term, obsolete_variable, group, symbol_function(EQUAL), UNPROVIDED);
                                if (NIL != list_utilities.lengthE(group, TWO_INTEGER, UNPROVIDED)) {
                                    group = second(group);
                                }
                                if (NIL != group_arg_pos) {
                                    new_sentence = cycl_utilities.formula_arg_position_subst(group, group_arg_pos, new_sentence);
                                } else {
                                    new_sentence = group;
                                }
                            } else {
                                final SubLObject new_literal2 = list($$equals, second(expression), v_term);
                                new_sentence = cycl_utilities.formula_arg_position_subst(new_literal2, arg_pos_$39, new_sentence);
                            }
                        } else {
                            new_sentence = list($$equals, second(new_sentence), v_term);
                        }
                        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                        arg_pos_$39 = cdolist_list_var_$38.first();
                    } 
                    if ((NIL != existentially_boundP(obsolete_variable, new_sentence)) && (NIL == list_utilities.tree_find(obsolete_variable, free_variable(obsolete_variable, new_sentence), UNPROVIDED, UNPROVIDED))) {
                        new_sentence = free_variable(obsolete_variable, new_sentence);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                expression = cdolist_list_var.first();
            } 
            if (NIL == sentence_substitution_wffP(new_sentence, domain_mt)) {
                return NIL;
            }
            return new_sentence;
        }
    }

    public static SubLObject clear_gke_memoization_state() {
        final SubLObject cs = $gke_memoization_state_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_gke_memoization_state() {
        return memoization_state.caching_state_remove_function_results_with_args($gke_memoization_state_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_memoization_state_internal() {
        final SubLObject name = $$$GKE_Memoization_State;
        return memoization_state.new_memoization_state(name, ReadWriteLocks.new_rw_lock(name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_memoization_state() {
        SubLObject caching_state = $gke_memoization_state_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GKE_MEMOIZATION_STATE, $gke_memoization_state_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GKE_MEMOIZATION_STATE);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(gke_memoization_state_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject gke_gloss_for_literal(final SubLObject literal, SubLObject domain_mt, SubLObject language_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        assert NIL != atomic_sentenceP(literal) : "el_utilities.atomic_sentenceP(literal) " + "CommonSymbols.NIL != el_utilities.atomic_sentenceP(literal) " + literal;
        final SubLObject from_kb = get_gke_gloss_from_kb(literal, domain_mt, language_mt);
        return NIL != from_kb ? from_kb : generate_gke_gloss_wrt_mt_cached(literal, domain_mt, language_mt);
    }

    public static SubLObject get_gke_gloss_from_kb(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gloss = NIL;
        final SubLObject hl_literal = narts_high.nart_substitute(literal);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(language_mt, thread);
            final SubLObject pred_var = $$gkeGlossWrtDomainMt;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(domain_mt, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(domain_mt, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$40 = NIL;
                            final SubLObject token_var_$41 = NIL;
                            while (NIL == done_var_$40) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                final SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(gaf));
                                if ((NIL != valid_$42) && cycl_utilities.formula_arg1(assertions_high.gaf_arg1(gaf), UNPROVIDED).equal(hl_literal)) {
                                    gloss = assertions_high.gaf_arg3(gaf);
                                }
                                done_var_$40 = makeBoolean(NIL == valid_$42);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL != gloss ? pph_utilities.cycl_structured_paraphrase_to_pph_javalist(gloss) : NIL;
    }

    public static SubLObject clear_generate_gke_gloss_wrt_mt_cached() {
        final SubLObject cs = $generate_gke_gloss_wrt_mt_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_generate_gke_gloss_wrt_mt_cached(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($generate_gke_gloss_wrt_mt_cached_caching_state$.getGlobalValue(), list(literal, domain_mt, language_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_gke_gloss_wrt_mt_cached_internal(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = NIL;
        final SubLObject _prev_bind_0 = constant_completion_high.$require_case_insensitive_name_uniqueness$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_16 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_17 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        final SubLObject _prev_bind_18 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
        try {
            constant_completion_high.$require_case_insensitive_name_uniqueness$.bind(NIL, thread);
            pph_vars.$paraphrase_mode$.bind($HTML, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind(NIL, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.bind(T, thread);
            pph_vars.$paraphrase_precision$.bind(NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind(T, thread);
            pph_vars.$pph_maximize_linksP$.bind(T, thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind(NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind(NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind(NIL, thread);
            pph_vars.$pph_addressee$.bind($UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind($UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
            pph_vars.$pph_blanks_for_varsP$.bind(NIL, thread);
            javalist = pph_main.generate_phrase_for_java(narts_high.nart_substitute(literal), $DEFAULT, $DECLARATIVE, language_mt, domain_mt, UNPROVIDED);
        } finally {
            pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_18, thread);
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_17, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_16, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_7, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_6, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
            constant_completion_high.$require_case_insensitive_name_uniqueness$.rebind(_prev_bind_0, thread);
        }
        return javalist;
    }

    public static SubLObject generate_gke_gloss_wrt_mt_cached(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        SubLObject caching_state = $generate_gke_gloss_wrt_mt_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GENERATE_GKE_GLOSS_WRT_MT_CACHED, $generate_gke_gloss_wrt_mt_cached_caching_state$, $int$256, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(literal, domain_mt, language_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (literal.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (domain_mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && language_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(generate_gke_gloss_wrt_mt_cached_internal(literal, domain_mt, language_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(literal, domain_mt, language_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject candidate_replacement_renderers_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject generation_mt) {
        if (generation_mt == UNPROVIDED) {
            generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject replacements = candidate_replacements_for_sentence(sentence, mt);
        SubLObject renderers = NIL;
        SubLObject problem_store = NIL;
        try {
            problem_store = inference_datastructures_problem_store.new_problem_store(NIL);
            final SubLObject local_state = gke_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$44 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                    try {
                        pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$45 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            final SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$46 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$47 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                        final SubLObject local_state_$48 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$48 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state_$48, thread);
                                            final SubLObject original_memoization_process_$50 = memoization_state.memoization_state_original_process(local_state_$48);
                                            try {
                                                SubLObject cdolist_list_var = replacements;
                                                SubLObject cons = NIL;
                                                cons = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = cons;
                                                    SubLObject key = NIL;
                                                    SubLObject terms = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list115);
                                                    key = current.first();
                                                    current = terms = current.rest();
                                                    SubLObject focal_term = cycl_utilities.formula_arg_position(sentence, key, $NOT_FOUND);
                                                    final SubLObject renderer_list = api_widgets.get_term_list_as_renderings(terms, mt, $NONE, generation_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != cycl_variables.cyc_varP(focal_term)) {
                                                        focal_term = terms.first();
                                                    }
                                                    if (focal_term != $NOT_FOUND) {
                                                        SubLObject cdolist_list_var_$51 = replacement_renderer_groves(focal_term, mt, renderer_list, problem_store);
                                                        SubLObject grove = NIL;
                                                        grove = cdolist_list_var_$51.first();
                                                        while (NIL != cdolist_list_var_$51) {
                                                            renderers = list_utilities.alist_push(renderers, key, grove, UNPROVIDED);
                                                            cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                            grove = cdolist_list_var_$51.first();
                                                        } 
                                                    }
                                                    renderers = list_utilities.alist_push(renderers, key, renderer_list, UNPROVIDED);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    cons = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state_$48, original_memoization_process_$50);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    } finally {
                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$47, thread);
                                    }
                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$46, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$45, thread);
                        }
                    } finally {
                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$44, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(problem_store);
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return renderers;
    }

    public static SubLObject candidate_replacements_for_variables(final SubLObject sentence, final SubLObject mt) {
        SubLObject ans = NIL;
        final SubLObject v_variables = sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject replacements = candidate_replacements_for_sentence(sentence, mt);
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg_positions = cycl_utilities.arg_positions_dfs(variable, sentence, UNPROVIDED);
            SubLObject variable_replacements = NIL;
            SubLObject cdolist_list_var_$55 = arg_positions;
            SubLObject arg_pos = NIL;
            arg_pos = cdolist_list_var_$55.first();
            while (NIL != cdolist_list_var_$55) {
                final SubLObject new_variable_replacements = list_utilities.alist_lookup(replacements, arg_pos, symbol_function(EQUAL), UNPROVIDED);
                if (NIL != new_variable_replacements) {
                    if (NIL == variable_replacements) {
                        variable_replacements = new_variable_replacements;
                    } else {
                        variable_replacements = intersection(variable_replacements, new_variable_replacements, UNPROVIDED, UNPROVIDED);
                    }
                }
                cdolist_list_var_$55 = cdolist_list_var_$55.rest();
                arg_pos = cdolist_list_var_$55.first();
            } 
            if (NIL != variable_replacements) {
                ans = list_utilities.alist_enter(ans, variable, variable_replacements, symbol_function(EQUAL));
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject candidate_replacements_for_arg(final SubLObject sentence, final SubLObject arg_position, final SubLObject mt) {
        return list_utilities.alist_lookup(candidate_replacements_for_sentence(sentence, mt), arg_position, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject candidate_replacements_for_sentence(final SubLObject sentence, final SubLObject mt) {
        return copy_list(candidate_replacements_for_sentence_cached(sentence, mt));
    }

    public static SubLObject clear_candidate_replacements_for_sentence_cached() {
        final SubLObject cs = $candidate_replacements_for_sentence_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_candidate_replacements_for_sentence_cached(final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($candidate_replacements_for_sentence_cached_caching_state$.getGlobalValue(), list(sentence, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject candidate_replacements_for_sentence_cached_internal(final SubLObject sentence, final SubLObject mt) {
        SubLObject ans = NIL;
        final SubLObject v_properties = $list120;
        if (NIL != el_formula_p(sentence)) {
            SubLObject pos = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pos = add(pos, ONE_INTEGER);
                SubLObject cdolist_list_var_$56;
                final SubLObject replacement_alist = cdolist_list_var_$56 = candidate_replacements_for_sentence(item, mt);
                SubLObject cons = NIL;
                cons = cdolist_list_var_$56.first();
                while (NIL != cdolist_list_var_$56) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject key = NIL;
                    SubLObject replacements = NIL;
                    destructuring_bind_must_consp(current, datum, $list121);
                    key = current.first();
                    current = current.rest();
                    SubLObject cdolist_list_var_$57;
                    replacements = cdolist_list_var_$57 = current;
                    SubLObject replacement = NIL;
                    replacement = cdolist_list_var_$57.first();
                    while (NIL != cdolist_list_var_$57) {
                        ans = list_utilities.alist_pushnew(ans, cons(pos, key), replacement, symbol_function(EQUAL), UNPROVIDED);
                        cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                        replacement = cdolist_list_var_$57.first();
                    } 
                    cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                    cons = cdolist_list_var_$56.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            final SubLObject pred = cycl_utilities.formula_arg0(sentence);
            final SubLObject vars = $list122;
            SubLObject query = listS($const123$suggestionsForPredRelativeToIsaIn, pred, vars);
            SubLObject cdolist_list_var2 = ask_utilities.query_template(vars, query, mt, v_properties);
            SubLObject result = NIL;
            result = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current2;
                final SubLObject datum2 = current2 = result;
                SubLObject replacement_coll = NIL;
                SubLObject replacement_pos = NIL;
                SubLObject constraint_coll = NIL;
                SubLObject constraint_pos = NIL;
                destructuring_bind_must_consp(current2, datum2, $list124);
                replacement_coll = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list124);
                replacement_pos = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list124);
                constraint_coll = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list124);
                constraint_pos = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject constrained_arg = cycl_utilities.formula_arg_position(sentence, list(constraint_pos), UNPROVIDED);
                    if ((NIL == cycl_variables.cyc_varP(constrained_arg)) && (NIL != isa.isaP(constrained_arg, constraint_coll, mt, UNPROVIDED))) {
                        ans = add_candidate_replacements(ans, replacement_pos, replacement_coll, mt, v_properties);
                    }
                } else {
                    cdestructuring_bind_error(datum2, $list124);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                result = cdolist_list_var2.first();
            } 
            query = listS($const125$suggestionsForPredRelativeToGenls, pred, vars);
            cdolist_list_var2 = ask_utilities.query_template(vars, query, mt, v_properties);
            result = NIL;
            result = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current2;
                final SubLObject datum2 = current2 = result;
                SubLObject replacement_coll = NIL;
                SubLObject replacement_pos = NIL;
                SubLObject constraint_coll = NIL;
                SubLObject constraint_pos = NIL;
                destructuring_bind_must_consp(current2, datum2, $list124);
                replacement_coll = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list124);
                replacement_pos = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list124);
                constraint_coll = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum2, $list124);
                constraint_pos = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject constrained_arg = cycl_utilities.formula_arg_position(sentence, list(constraint_pos), UNPROVIDED);
                    if ((NIL == cycl_variables.cyc_varP(constrained_arg)) && (NIL != genls.genlsP(constrained_arg, constraint_coll, mt, UNPROVIDED))) {
                        ans = add_candidate_replacements(ans, replacement_pos, replacement_coll, mt, v_properties);
                    }
                } else {
                    cdestructuring_bind_error(datum2, $list124);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                result = cdolist_list_var2.first();
            } 
        }
        return ans;
    }

    public static SubLObject candidate_replacements_for_sentence_cached(final SubLObject sentence, final SubLObject mt) {
        SubLObject caching_state = $candidate_replacements_for_sentence_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED, $candidate_replacements_for_sentence_cached_caching_state$, $int$2048, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(candidate_replacements_for_sentence_cached_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject add_candidate_replacements(SubLObject ans, final SubLObject rep_pos, final SubLObject rep_coll, final SubLObject mt, final SubLObject v_properties) {
        final SubLObject key = list(rep_pos);
        final SubLObject old_values = list_utilities.alist_lookup(ans, key, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject new_values = gke_get_elements(rep_coll, mt, v_properties);
        final SubLObject join_function = candidate_replacement_join_function(cae_query_search.current_cae_task());
        if (NIL != list_utilities.non_empty_list_p(old_values)) {
            ans = list_utilities.alist_enter(ans, key, funcall(join_function, old_values, new_values, symbol_function(EQUAL)), symbol_function(EQUAL));
        } else
            if (NIL != list_utilities.non_empty_list_p(new_values)) {
                ans = list_utilities.alist_enter(ans, key, new_values, symbol_function(EQUAL));
            }

        return ans;
    }

    public static SubLObject candidate_replacement_join_function(final SubLObject task) {
        return NIL != query_library_utils.query_library_should_suggestions_be_intersected(task) ? symbol_function(INTERSECTION) : symbol_function(UNION);
    }

    public static SubLObject clear_gke_get_elements() {
        final SubLObject cs = $gke_get_elements_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_gke_get_elements(final SubLObject set_or_collection, final SubLObject mt, final SubLObject v_properties) {
        return memoization_state.caching_state_remove_function_results_with_args($gke_get_elements_caching_state$.getGlobalValue(), list(set_or_collection, mt, v_properties), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_get_elements_internal(final SubLObject set_or_collection, final SubLObject mt, final SubLObject v_properties) {
        return delete_if($sym132$HL_PROTOTYPICAL_INSTANCE_, ask_utilities.query_variable($sym133$_X, list($$elementOf, $sym133$_X, set_or_collection), mt, v_properties), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_get_elements(final SubLObject set_or_collection, final SubLObject mt, final SubLObject v_properties) {
        SubLObject caching_state = $gke_get_elements_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GKE_GET_ELEMENTS, $gke_get_elements_caching_state$, $int$256, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GKE_GET_ELEMENTS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(set_or_collection, mt, v_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (set_or_collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(gke_get_elements_internal(set_or_collection, mt, v_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(set_or_collection, mt, v_properties));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject replacement_renderer_groves(final SubLObject focal_term, final SubLObject mt, final SubLObject renderer_list, final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tables = NIL;
        final SubLObject renderer_nodes = Mapping.mapcar(NEW_REPLACEMENT_TREE, renderer_list);
        final SubLObject conflation_table = replacement_renderer_tree_conflation_preds(focal_term, mt, problem_store);
        final SubLObject track_conflationP = list_utilities.non_empty_list_p(conflation_table);
        final SubLObject table_table = (NIL != track_conflationP) ? dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED) : NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            SubLObject cdolist_list_var = replacement_renderer_tree_specifications(focal_term, mt, problem_store);
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject bin_pred = NIL;
                SubLObject argnum = NIL;
                destructuring_bind_must_consp(current, datum, $list138);
                bin_pred = current.first();
                current = argnum = current.rest();
                final SubLObject table_to_conflate_to = (NIL != track_conflationP) ? find_table_to_conflate_to(bin_pred, conflation_table, table_table) : NIL;
                final SubLObject renderer_to_superiors = renderer_to_superiors_table(renderer_nodes, mt, bin_pred, argnum, problem_store, table_to_conflate_to);
                if ((NIL != track_conflationP) && (NIL == dictionary.dictionary_p(table_to_conflate_to))) {
                    dictionary.dictionary_enter(table_table, bin_pred, renderer_to_superiors);
                }
                final SubLObject item_var = renderer_to_superiors;
                if (NIL == member(item_var, tables, symbol_function(EQL), symbol_function(IDENTITY))) {
                    tables = cons(item_var, tables);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        SubLObject groves = NIL;
        SubLObject cdolist_list_var2 = tables;
        SubLObject renderer_to_superiors2 = NIL;
        renderer_to_superiors2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject var;
            final SubLObject listy_grove = var = replacement_renderer_grove(renderer_nodes, renderer_to_superiors2);
            if (NIL != var) {
                groves = cons(var, groves);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            renderer_to_superiors2 = cdolist_list_var2.first();
        } 
        return groves;
    }

    public static SubLObject find_table_to_conflate_to(final SubLObject bin_pred, final SubLObject conflation_table, final SubLObject table_table) {
        SubLObject table = NIL;
        if (NIL == table) {
            SubLObject csome_list_var = conflation_table;
            SubLObject conflation_set = NIL;
            conflation_set = csome_list_var.first();
            while ((NIL == table) && (NIL != csome_list_var)) {
                final SubLObject preds = el_set_items(conflation_set);
                if ((NIL != member(bin_pred, preds, UNPROVIDED, UNPROVIDED)) && (NIL == table)) {
                    SubLObject csome_list_var_$58 = preds;
                    SubLObject other_pred = NIL;
                    other_pred = csome_list_var_$58.first();
                    while ((NIL == table) && (NIL != csome_list_var_$58)) {
                        if (!other_pred.eql(bin_pred)) {
                            table = dictionary.dictionary_lookup_without_values(table_table, other_pred, NIL);
                            if (NIL != table) {
                                format(T, $str139$__Conflating__S_to__S_____, bin_pred, other_pred);
                            }
                        }
                        csome_list_var_$58 = csome_list_var_$58.rest();
                        other_pred = csome_list_var_$58.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                conflation_set = csome_list_var.first();
            } 
        }
        return table;
    }

    public static SubLObject replacement_tree_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_replacement_tree(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject replacement_tree_p(final SubLObject v_object) {
        return v_object.getClass() == $replacement_tree_native.class ? T : NIL;
    }

    public static SubLObject r_tree_root(final SubLObject v_object) {
        assert NIL != replacement_tree_p(v_object) : "gke_main.replacement_tree_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject r_tree_children(final SubLObject v_object) {
        assert NIL != replacement_tree_p(v_object) : "gke_main.replacement_tree_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_r_tree_root(final SubLObject v_object, final SubLObject value) {
        assert NIL != replacement_tree_p(v_object) : "gke_main.replacement_tree_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_r_tree_children(final SubLObject v_object, final SubLObject value) {
        assert NIL != replacement_tree_p(v_object) : "gke_main.replacement_tree_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_replacement_tree(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $replacement_tree_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ROOT)) {
                _csetf_r_tree_root(v_new, current_value);
            } else
                if (pcase_var.eql($CHILDREN)) {
                    _csetf_r_tree_children(v_new, current_value);
                } else {
                    Errors.error($str155$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_replacement_tree(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REPLACEMENT_TREE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ROOT, r_tree_root(obj));
        funcall(visitor_fn, obj, $SLOT, $CHILDREN, r_tree_children(obj));
        funcall(visitor_fn, obj, $END, MAKE_REPLACEMENT_TREE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_replacement_tree_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_replacement_tree(obj, visitor_fn);
    }

    public static SubLObject print_replacement_tree(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str161$_REPLACEMENT_TREE__S_, second(replacement_tree_root(v_object)));
        return v_object;
    }

    public static SubLObject new_replacement_tree(final SubLObject root, SubLObject children) {
        if (children == UNPROVIDED) {
            children = NIL;
        }
        assert NIL != listp(root) : "Types.listp(root) " + "CommonSymbols.NIL != Types.listp(root) " + root;
        final SubLObject list_var = children;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != replacement_tree_p(elem) : "gke_main.replacement_tree_p(elem) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject tree = make_replacement_tree(UNPROVIDED);
        _csetf_r_tree_root(tree, root);
        _csetf_r_tree_children(tree, children);
        return tree;
    }

    public static SubLObject replacement_tree_root(final SubLObject tree) {
        assert NIL != replacement_tree_p(tree) : "gke_main.replacement_tree_p(tree) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(tree) " + tree;
        return r_tree_root(tree);
    }

    public static SubLObject replacement_tree_children(final SubLObject tree) {
        assert NIL != replacement_tree_p(tree) : "gke_main.replacement_tree_p(tree) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(tree) " + tree;
        return r_tree_children(tree);
    }

    public static SubLObject replacement_tree_add_child(final SubLObject superior, final SubLObject renderer) {
        assert NIL != replacement_tree_p(superior) : "gke_main.replacement_tree_p(superior) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(superior) " + superior;
        assert NIL != replacement_tree_p(renderer) : "gke_main.replacement_tree_p(renderer) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(renderer) " + renderer;
        _csetf_r_tree_children(superior, cons(renderer, r_tree_children(superior)));
        return superior;
    }

    public static SubLObject replacement_renderer_grove(final SubLObject renderer_list, final SubLObject renderer_to_superiors) {
        assert NIL != list_utilities.non_dotted_list_p(renderer_list) : "list_utilities.non_dotted_list_p(renderer_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(renderer_list) " + renderer_list;
        SubLObject cdolist_list_var = renderer_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != replacement_tree_p(elem) : "gke_main.replacement_tree_p(elem) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return replacement_renderer_grove_recursive(renderer_list, renderer_to_superiors, NIL);
    }

    public static SubLObject replacement_renderer_grove_recursive(final SubLObject renderer_nodes, final SubLObject renderer_to_superiors, final SubLObject recursedP) {
        assert NIL != list_utilities.non_dotted_list_p(renderer_nodes) : "list_utilities.non_dotted_list_p(renderer_nodes) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(renderer_nodes) " + renderer_nodes;
        SubLObject cdolist_list_var = renderer_nodes;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != replacement_tree_p(elem) : "gke_main.replacement_tree_p(elem) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject remaining = copy_list(renderer_nodes);
        SubLObject still_remaining = NIL;
        SubLObject tree = NIL;
        SubLObject no_progressP = NIL;
        SubLObject depth = ZERO_INTEGER;
        final SubLObject max_depth = NIL;
        SubLObject listy_grove = NIL;
        while ((((NIL == max_depth) || (!depth.numGE(max_depth))) && (NIL == list_utilities.empty_list_p(remaining))) && (NIL == no_progressP)) {
            still_remaining = NIL;
            no_progressP = T;
            final SubLObject new_tree_level = set.new_set(symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var2 = nreverse(remaining);
            SubLObject renderer_node = NIL;
            renderer_node = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != postpone_adding_replacementP(renderer_node, tree, renderer_to_superiors)) {
                    still_remaining = cons(renderer_node, still_remaining);
                } else {
                    add_one_renderer(renderer_node, renderer_to_superiors, new_tree_level, tree);
                    no_progressP = NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                renderer_node = cdolist_list_var2.first();
            } 
            tree = list_utilities.add_to_end(new_tree_level, tree);
            remaining = still_remaining;
            depth = add(depth, ONE_INTEGER);
        } 
        final SubLObject cycleP = makeBoolean(((NIL == max_depth) || depth.numL(max_depth)) && (NIL != list_utilities.non_empty_list_p(remaining)));
        if ((NIL != cycleP) && (NIL == recursedP)) {
            break_replacement_renderer_cycles(remaining, renderer_to_superiors);
            listy_grove = replacement_renderer_grove_recursive(renderer_nodes, renderer_to_superiors, T);
        } else
            if (NIL != cycleP) {
                Errors.sublisp_break($str163$Unable_to_place__D_renderers, new SubLObject[]{ length(remaining) });
            } else
                if (depth.numG(ONE_INTEGER)) {
                    if (NIL != list_utilities.non_empty_list_p(remaining)) {
                        Errors.warn($str164$Hit_max_depth_of__D__Pruning__D_r, max_depth, length(remaining));
                    }
                    listy_grove = NIL;
                    final SubLObject set_var = tree.first();
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject root_node;
                    SubLObject listy_tree;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        root_node = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, root_node)) {
                            listy_tree = listy_replacement_tree(root_node, tree);
                            if ((NIL == $omit_suggestion_stumpsP$.getGlobalValue()) || (NIL == list_utilities.lengthLE(listy_tree, ONE_INTEGER, UNPROVIDED))) {
                                listy_grove = cons(listy_tree, listy_grove);
                            }
                        }
                    }
                }


        return listy_grove;
    }

    public static SubLObject add_one_renderer(final SubLObject renderer_node, final SubLObject renderer_to_superiors, final SubLObject new_tree_level, final SubLObject tree) {
        assert NIL != replacement_tree_p(renderer_node) : "gke_main.replacement_tree_p(renderer_node) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(renderer_node) " + renderer_node;
        final SubLObject list_var = dictionary.dictionary_keys(renderer_to_superiors);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject renderer = replacement_tree_root(renderer_node);
        final SubLObject this_term = second(renderer);
        final SubLObject traceP = NIL;
        final SubLObject superiors = dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, NIL);
        final SubLObject list_var2 = set.set_element_list(superiors);
        assert NIL != list_utilities.non_dotted_list_p(list_var2) : "list_utilities.non_dotted_list_p(list_var2) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var2) " + list_var2;
        SubLObject cdolist_list_var2 = list_var2;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != replacement_tree_p(elem2) : "gke_main.replacement_tree_p(elem2) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(elem2) " + elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        } 
        if (NIL != traceP) {
            format(T, $str165$__Placing__S_under_superiors___S_, this_term, Mapping.mapcar(SECOND, set.set_element_list(superiors)));
        }
        set.set_add(renderer_node, new_tree_level);
        SubLObject doneP = NIL;
        final SubLObject remaining_superiors = set.copy_set(superiors);
        if (NIL == doneP) {
            SubLObject end_var;
            SubLObject i;
            SubLObject tree_level;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject superior;
            SubLObject foundP;
            for (end_var = MINUS_ONE_INTEGER, i = NIL, i = number_utilities.f_1_(length(tree)); (NIL == doneP) && (!i.numLE(end_var)); doneP = set.set_emptyP(remaining_superiors) , i = add(i, MINUS_ONE_INTEGER)) {
                tree_level = nth(i, tree);
                set_contents_var = set.do_set_internal(superiors);
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    superior = set_contents.do_set_contents_next(basis_object, state);
                    if ((NIL != set_contents.do_set_contents_element_validP(state, superior)) && (NIL != set.set_memberP(superior, remaining_superiors))) {
                        foundP = NIL;
                        if (NIL != set.set_memberP(superior, tree_level)) {
                            foundP = T;
                            if (NIL != traceP) {
                                format(T, $str167$__Found__S_on_level__D___, second(superior), i);
                            }
                            if (NIL == renderer_tree_contains_rendererP(superior, renderer_node, i, tree, traceP)) {
                                if (NIL != traceP) {
                                    format(T, $str168$__Not_in_subtree__so_adding__S_un, new SubLObject[]{ this_term, second(superior), i });
                                }
                                replacement_tree_add_child(superior, renderer_node);
                                if (NIL != traceP) {
                                    format(T, $str169$___Tree_level__D_is_now__S___, i, tree_level);
                                }
                            }
                        }
                        if (NIL != foundP) {
                            set.set_remove(superior, remaining_superiors);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject renderer_tree_contains_rendererP(final SubLObject root, final SubLObject renderer, final SubLObject i, final SubLObject tree, SubLObject traceP) {
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        assert NIL != replacement_tree_p(root) : "gke_main.replacement_tree_p(root) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(root) " + root;
        assert NIL != replacement_tree_p(renderer) : "gke_main.replacement_tree_p(renderer) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(renderer) " + renderer;
        SubLObject foundP = NIL;
        final SubLObject immediate_subnodes = replacement_tree_children(root);
        if (NIL == foundP) {
            SubLObject csome_list_var = immediate_subnodes;
            SubLObject subnode = NIL;
            subnode = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (replacement_tree_root(renderer).equal(replacement_tree_root(subnode))) {
                    foundP = T;
                    if (NIL != traceP) {
                        print($str170$Found_it_, UNPROVIDED);
                    }
                } else
                    if (NIL != list_utilities.lengthG(tree, number_utilities.f_1X(i), UNPROVIDED)) {
                        foundP = renderer_tree_contains_rendererP(subnode, renderer, number_utilities.f_1X(i), tree, traceP);
                    }

                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject break_replacement_renderer_cycles(final SubLObject remaining, final SubLObject renderer_to_superiors) {
        assert NIL != list_utilities.non_dotted_list_p(remaining) : "list_utilities.non_dotted_list_p(remaining) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(remaining) " + remaining;
        SubLObject cdolist_list_var = remaining;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != replacement_tree_p(elem) : "gke_main.replacement_tree_p(elem) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject still_remaining = copy_list(remaining);
        cdolist_list_var = remaining;
        SubLObject renderer_node = NIL;
        renderer_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject renderer = replacement_tree_root(renderer_node);
            final SubLObject superiors = dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, UNPROVIDED);
            final SubLObject old_size = set.set_size(superiors);
            set_utilities.set_remove_all(still_remaining, superiors);
            final SubLObject new_size = set.set_size(dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, UNPROVIDED));
            if (old_size.numG(new_size)) {
            }
            still_remaining = delete(renderer, still_remaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            renderer_node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject listy_replacement_tree(final SubLObject root_node, final SubLObject tree) {
        SubLObject subnodes = NIL;
        if (NIL != list_utilities.non_empty_list_p(tree)) {
            SubLObject cdolist_list_var = replacement_tree_children(root_node);
            SubLObject subnode = NIL;
            subnode = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                subnodes = cons(listy_replacement_tree(subnode, tree.rest()), subnodes);
                cdolist_list_var = cdolist_list_var.rest();
                subnode = cdolist_list_var.first();
            } 
        }
        return cons(replacement_tree_root(root_node), nreverse(subnodes));
    }

    public static SubLObject postpone_adding_replacementP(final SubLObject renderer_node, final SubLObject tree, final SubLObject renderer_to_superiors) {
        assert NIL != replacement_tree_p(renderer_node) : "gke_main.replacement_tree_p(renderer_node) " + "CommonSymbols.NIL != gke_main.replacement_tree_p(renderer_node) " + renderer_node;
        SubLObject postponeP = NIL;
        final SubLObject renderer = replacement_tree_root(renderer_node);
        final SubLObject this_term = second(renderer);
        final SubLObject traceP = NIL;
        final SubLObject superiors = dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, NIL);
        final SubLObject set_contents_var = set.do_set_internal(superiors);
        SubLObject basis_object;
        SubLObject state;
        SubLObject superior;
        SubLObject foundP;
        SubLObject csome_list_var;
        SubLObject tree_level;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == postponeP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            superior = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, superior)) {
                foundP = NIL;
                if (NIL == foundP) {
                    for (csome_list_var = tree, tree_level = NIL, tree_level = csome_list_var.first(); (NIL == foundP) && (NIL != csome_list_var); foundP = set.set_memberP(superior, tree_level) , csome_list_var = csome_list_var.rest() , tree_level = csome_list_var.first()) {
                    }
                }
                if (NIL == foundP) {
                    if (NIL != traceP) {
                        format(T, $str171$__Postponing__S_because__S_is_not, this_term, superior);
                    }
                    postponeP = T;
                }
            }
        }
        return postponeP;
    }

    public static SubLObject replacement_renderer_tree_specifications(final SubLObject focal_term, final SubLObject mt, final SubLObject problem_store) {
        final SubLObject query_sentence = make_existential($sym172$_COL, simplifier.disjoin(list(listS($$suggestionGenlClassOrderedBy, focal_term, $list174), simplifier.conjoin(list($list175, listS($$isa, focal_term, $list176)), UNPROVIDED)), UNPROVIDED));
        final SubLObject template = $list177;
        return ask_utilities.query_template(template, query_sentence, mt, list($PROBLEM_STORE, problem_store, $INFERENCE_MODE, $MINIMAL, $ANSWER_LANGUAGE, $HL));
    }

    public static SubLObject replacement_renderer_tree_conflation_preds(final SubLObject focal_term, final SubLObject mt, final SubLObject problem_store) {
        final SubLObject query_sentence = make_existential($sym172$_COL, simplifier.disjoin(list(simplifier.conjoin(list($list183, listS($$genls, focal_term, $list176)), UNPROVIDED), simplifier.conjoin(list($list185, listS($$isa, focal_term, $list176)), UNPROVIDED)), UNPROVIDED));
        return ask_utilities.query_variable($sym186$_SET, query_sentence, mt, list($PROBLEM_STORE, problem_store, $INFERENCE_MODE, $MINIMAL, $ANSWER_LANGUAGE, $HL));
    }

    public static SubLObject renderer_to_superiors_table(final SubLObject renderer_nodes, final SubLObject mt, final SubLObject bin_pred, final SubLObject argnum, final SubLObject problem_store, SubLObject table) {
        if (table == UNPROVIDED) {
            table = NIL;
        }
        if (NIL == table) {
            table = dictionary.new_dictionary(symbol_function(EQL), length(renderer_nodes));
        }
        final SubLObject renderer_nodes_from_terms = dictionary.new_dictionary(symbol_function(EQL), length(renderer_nodes));
        SubLObject cdolist_list_var = renderer_nodes;
        SubLObject renderer_node = NIL;
        renderer_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter(renderer_nodes_from_terms, second(replacement_tree_root(renderer_node)), renderer_node);
            cdolist_list_var = cdolist_list_var.rest();
            renderer_node = cdolist_list_var.first();
        } 
        cdolist_list_var = renderer_nodes;
        renderer_node = NIL;
        renderer_node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject renderer = replacement_tree_root(renderer_node);
            final SubLObject this_term = second(renderer);
            final SubLObject traceP = NIL;
            final SubLObject superiors = superiors_for_renderer_term(this_term, mt, bin_pred, argnum, problem_store);
            SubLObject filtered_renderers = dictionary.dictionary_lookup_without_values(table, renderer, UNPROVIDED);
            if (NIL != traceP) {
                format(T, $str187$__Filtered_renderers___S__, filtered_renderers);
            }
            if (NIL == set.set_p(filtered_renderers)) {
                filtered_renderers = set.new_set(symbol_function(EQL), UNPROVIDED);
                dictionary.dictionary_enter(table, renderer, filtered_renderers);
            }
            SubLObject cdolist_list_var_$59 = superiors;
            SubLObject superior = NIL;
            superior = cdolist_list_var_$59.first();
            while (NIL != cdolist_list_var_$59) {
                final SubLObject renderer_node_$60 = dictionary.dictionary_lookup_without_values(renderer_nodes_from_terms, superior, UNPROVIDED);
                if (NIL != renderer_node_$60) {
                    set.set_add(renderer_node_$60, filtered_renderers);
                }
                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                superior = cdolist_list_var_$59.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            renderer_node = cdolist_list_var.first();
        } 
        return table;
    }

    public static SubLObject superiors_for_renderer_term(final SubLObject this_term, final SubLObject mt, final SubLObject bin_pred, final SubLObject argnum, final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = NIL;
        if ((NIL != indexed_term_p(this_term)) && bin_pred.eql($$genls)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(mt));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (argnum.eql(ONE_INTEGER)) {
                    superiors = genls.all_specs(this_term, UNPROVIDED, UNPROVIDED);
                } else
                    if (argnum.eql(TWO_INTEGER)) {
                        superiors = genls.all_genls(this_term, UNPROVIDED, UNPROVIDED);
                    }

            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject this_argnum = subtract(THREE_INTEGER, argnum);
            final SubLObject variable = $X;
            final SubLObject query_sentence = replace_formula_arg(this_argnum, this_term, make_binary_formula(bin_pred, variable, variable));
            SubLObject v_properties = list($PROBLEM_STORE, problem_store, $ANSWER_LANGUAGE, $HL, $INFERENCE_MODE, $MINIMAL);
            if (NIL == $use_tva_for_suggestionsP$.getGlobalValue()) {
                v_properties = putf(v_properties, $ALLOWED_MODULES, $list191);
            }
            superiors = ask_utilities.query_variable(variable, query_sentence, mt, v_properties);
        }
        return delete(this_term, superiors, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gke_subst_nl_for_inference_answer(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject binding_list = inference_kernel.inference_answer_el_bindings(inference_answer);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$61 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$62 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$63 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$64 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$65 = pph_vars.$pph_inference_answer$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
                                    final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                                    final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
                                    final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
                                    final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
                                        pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
                                        pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
                                        pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
                                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                        pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
                                        pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
                                        pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
                                        pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
                                        pph_vars.$pph_displayed_supports$.bind(NIL, thread);
                                        thread.resetMultipleValues();
                                        final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
                                        final SubLObject html_target = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$66 = pph_vars.$constant_link_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$67 = pph_vars.$html_generation_target$.currentBinding(thread);
                                        try {
                                            pph_vars.$constant_link_function$.bind(NIL != link_function ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                                            pph_vars.$html_generation_target$.bind(NIL != html_target ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                                            SubLObject cdolist_list_var = binding_list;
                                            SubLObject binding = NIL;
                                            binding = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                result = cons(gke_subst_nl_for_binding(binding), result);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                binding = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            pph_vars.$html_generation_target$.rebind(_prev_bind_1_$67, thread);
                                            pph_vars.$constant_link_function$.rebind(_prev_bind_0_$66, thread);
                                        }
                                    } finally {
                                        pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
                                        pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
                                        pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
                                        pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
                                        pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
                                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
                                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
                                        pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
                                        pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_inference_answer$.rebind(_prev_bind_0_$65, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$64, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$63, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$62, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$61, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject gke_subst_nl_for_binding(final SubLObject binding) {
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list192);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        final SubLObject java_phrase = list(pph_main.generate_phrase_for_java(value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), value);
        final SubLObject variable_string = variable_to_nl_string(variable);
        return cons(variable_string, java_phrase);
    }

    public static SubLObject el_binding_list_to_gke_binding_list(SubLObject el_binding_list, final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.empty_list_p(el_binding_list)) {
            el_binding_list = $list193;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$70 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$71 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$72 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$73 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$74 = pph_vars.$pph_inference_answer$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
                                    final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                                    final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
                                    final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
                                    final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
                                        pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
                                        pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
                                        pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
                                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                                        pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
                                        pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
                                        pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
                                        pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
                                        pph_vars.$pph_displayed_supports$.bind(NIL, thread);
                                        thread.resetMultipleValues();
                                        final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
                                        final SubLObject html_target = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$75 = pph_vars.$constant_link_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$76 = pph_vars.$html_generation_target$.currentBinding(thread);
                                        try {
                                            pph_vars.$constant_link_function$.bind(NIL != link_function ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                                            pph_vars.$html_generation_target$.bind(NIL != html_target ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                                            SubLObject cdolist_list_var = el_binding_list;
                                            SubLObject el_binding = NIL;
                                            el_binding = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                result = cons(el_binding_to_gke_binding(el_binding), result);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                el_binding = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            pph_vars.$html_generation_target$.rebind(_prev_bind_1_$76, thread);
                                            pph_vars.$constant_link_function$.rebind(_prev_bind_0_$75, thread);
                                        }
                                    } finally {
                                        pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
                                        pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
                                        pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
                                        pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
                                        pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
                                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
                                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
                                        pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
                                        pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_inference_answer$.rebind(_prev_bind_0_$74, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$73, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$72, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$71, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$70, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject el_binding_to_gke_binding(final SubLObject el_binding) {
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(el_binding, el_binding, $list192);
        variable = el_binding.first();
        final SubLObject current = value = el_binding.rest();
        final SubLObject variable_string = variable_to_nl_string(variable);
        final SubLObject pph_result = pph_main.generate_phrase_for_java(value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject java_phrase = (NIL != pph_utilities.pph_javalist_p(pph_result)) ? pph_utilities.possibly_optimize_pph_javalist_for_alphabetization(pph_result) : NIL;
        final SubLObject offer_fact_sheetP = fact_sheets.term_ok_for_fact_sheet_p(value, UNPROVIDED);
        return list(variable_string, java_phrase, value, offer_fact_sheetP);
    }

    public static SubLObject variable_to_nl_string(final SubLObject variable) {
        SubLObject variable_string = string_utilities.substring(Strings.string_downcase(string_utilities.to_string(variable), UNPROVIDED, UNPROVIDED), ONE_INTEGER, UNPROVIDED);
        variable_string = string_utilities.string_substitute($$$_, $str195$_, variable_string, UNPROVIDED);
        return pph_utilities.add_title_capitalization(variable_string);
    }

    public static SubLObject gke_start_continuable_query(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.enforceType(sentence, EL_FORMULA_P);
        SubLTrampolineFile.enforceType(mt, POSSIBLY_MT_P);
        SubLTrampolineFile.enforceType(v_properties, QUERY_PROPERTIES_P);
        final SubLObject optimized_sentence = optimize_el_formula_variable_names(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(optimized_sentence);
        final SubLObject static_properties = list_utilities.nmerge_plist(inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties), list($kw198$CONDITIONAL_SENTENCE_, conditionalP));
        final SubLObject inference = inference_kernel.new_continuable_inference(optimized_sentence, mt, static_properties);
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject special_state = special_variable_state.new_special_variable_state($list199);
        return gke_continue_query(problem_store_id, inference_id, v_properties, special_state);
    }

    public static SubLObject gke_warn(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return princ(message, StreamsLow.$standard_output$.getDynamicValue(thread));
    }

    public static SubLObject gke_continue_query(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject v_properties, SubLObject special_state) {
        if (special_state == UNPROVIDED) {
            special_state = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        SubLTrampolineFile.enforceType(v_properties, LISTP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_properties);
        if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
            final SubLObject old_process_wrapper = gethash(string_utilities.to_string(list(problem_store_id, inference_id)), $gke_query_threads$.getDynamicValue(thread), UNPROVIDED);
            final SubLObject gke_process = new_gke_process(problem_store_id, inference_id, dynamic_properties, special_state);
            final SubLObject oldest_process_wrapper = (NIL != old_process_wrapper) ? old_process_wrapper : gke_process;
            final SubLObject old_queue = process_utilities.process_wrapper_get_property(oldest_process_wrapper, $QUEUE, UNPROVIDED);
            final SubLObject results_queue = (NIL != old_queue) ? old_queue : queues.create_queue(UNPROVIDED);
            final SubLObject daemon = new_results_daemon(problem_store_id, inference_id, results_queue);
            process_utilities.process_wrapper_set_property(gke_process, $QUEUE, results_queue);
            process_utilities.process_wrapper_set_property(gke_process, $DAEMON, daemon);
            sethash(string_utilities.to_string(list(problem_store_id, inference_id)), $gke_query_threads$.getDynamicValue(thread), gke_process);
            return list(problem_store_id, inference_id);
        }
        return list(format(NIL, $str207$Error_with_query___A__, inference_datastructures_inference.inference_status(inference)));
    }

    public static SubLObject new_gke_process(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject dynamic_properties, SubLObject special_state) {
        if (special_state == UNPROVIDED) {
            special_state = NIL;
        }
        final SubLObject gke_process = process_utilities.new_process_wrapper(format(NIL, $str212$gke_query_thread__A__A, problem_store_id, inference_id), GKE_RUN_INFERENCE, list(problem_store_id, inference_id, dynamic_properties, special_state));
        return gke_process;
    }

    public static SubLObject new_results_daemon(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject queue) {
        final SubLObject daemon = process_utilities.new_process_wrapper(format(NIL, $str214$results_daemon__A__A, problem_store_id, inference_id), RESULTS_DAEMON, list(problem_store_id, inference_id, queue));
        return daemon;
    }

    public static SubLObject results_daemon(final SubLObject process_wrapper, final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(problem_store, inference_id);
        SubLObject current_answer = ZERO_INTEGER;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$79 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                    try {
                        pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$80 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            final SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$81 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$82 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                        final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$83 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                            try {
                                                if (NIL == daemon_should_run(inference, current_answer)) {
                                                    sleep(ONE_INTEGER);
                                                }
                                                while (NIL != daemon_should_run(inference, current_answer)) {
                                                    for (SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, current_answer); NIL != inference_answer; inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, current_answer)) {
                                                        current_answer = add(current_answer, ONE_INTEGER);
                                                        final SubLObject _prev_bind_0_$84 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_domain_mt$.bind(inference_datastructures_inference.inference_mt(inference), thread);
                                                            final SubLObject el_bindings = inference_kernel.inference_answer_el_bindings(inference_answer);
                                                            final SubLObject gke_bindings = el_binding_list_to_gke_binding_list(el_bindings, inference_answer);
                                                            final SubLObject source_icon_data = sources.source_icon_paths_for_inference_answer(inference_answer);
                                                            final SubLObject plist_to_enqueue = list($BINDINGS, gke_bindings, $SOURCE_ICONS, source_icon_data);
                                                            queues.enqueue(plist_to_enqueue, queue);
                                                        } finally {
                                                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$84, thread);
                                                        }
                                                    }
                                                    sleep(ONE_INTEGER);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$83, thread);
                                        }
                                    } finally {
                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                    }
                                } finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$81, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$80, thread);
                        }
                    } finally {
                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$79, thread);
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
        return NIL;
    }

    public static SubLObject daemon_should_run(final SubLObject inference, final SubLObject current_answer) {
        final SubLObject status = inference_datastructures_inference.inference_status(inference);
        final SubLObject current_count = id_index_count(inference_datastructures_inference.inference_answer_id_index(inference));
        return makeBoolean((NIL != subl_promotions.memberP(status, $daemon_should_run_inference_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || current_count.numG(current_answer));
    }

    public static SubLObject gke_run_inference(final SubLObject process_wrapper, final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject dynamic_properties, SubLObject special_state) {
        if (special_state == UNPROVIDED) {
            special_state = NIL;
        }
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(problem_store, inference_id);
        final SubLObject adjusted_dynamic_properties = (NIL != $gke_run_inference_with_adjusted_dynamic_propertiesP$.getGlobalValue()) ? list_utilities.nmerge_plist(list($MAX_TIME, NIL, $MAX_TRANSFORMATION_DEPTH, THREE_INTEGER), dynamic_properties) : dynamic_properties;
        if (NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
            if (NIL != special_state) {
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(special_state);
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(special_state));
                    SubLTrampolineFile.enforceType(special_state, SPECIAL_VARIABLE_STATE_P);
                    inference_kernel.continue_inference(inference, adjusted_dynamic_properties);
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            } else {
                inference_kernel.continue_inference(inference, adjusted_dynamic_properties);
            }
        }
        return NIL;
    }

    public static SubLObject gke_get_one_inference_result(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        final SubLObject process_wrapper = gethash(string_utilities.to_string(list(problem_store_id, inference_id)), $gke_query_threads$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != process_wrapper) {
            final SubLObject queue = process_utilities.process_wrapper_get_property(process_wrapper, $QUEUE, UNPROVIDED);
            if (NIL != queue) {
                return queues.dequeue(queue);
            }
        }
        return NIL;
    }

    public static SubLObject gke_get_inference_results(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(problem_store_id, ID_OF_VALID_PROBLEM_STORE_P);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(problem_store, inference_id);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$87 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$88 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$89 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$90 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                        final SubLObject idx_$91 = idx;
                                        if (NIL == id_index_dense_objects_empty_p(idx_$91, $SKIP)) {
                                            final SubLObject vector_var = id_index_dense_objects(idx_$91);
                                            final SubLObject backwardP_var = NIL;
                                            SubLObject length;
                                            SubLObject v_iteration;
                                            SubLObject id;
                                            SubLObject inference_answer;
                                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                inference_answer = aref(vector_var, id);
                                                if ((NIL == id_index_tombstone_p(inference_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                    if (NIL != id_index_tombstone_p(inference_answer)) {
                                                        inference_answer = $SKIP;
                                                    }
                                                    ans = cons(gke_subst_nl_for_inference_answer(inference_answer), ans);
                                                }
                                            }
                                        }
                                        final SubLObject idx_$92 = idx;
                                        if (NIL == id_index_sparse_objects_empty_p(idx_$92)) {
                                            final SubLObject cdohash_table = id_index_sparse_objects(idx_$92);
                                            SubLObject id2 = NIL;
                                            SubLObject inference_answer2 = NIL;
                                            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                    id2 = getEntryKey(cdohash_entry);
                                                    inference_answer2 = getEntryValue(cdohash_entry);
                                                    ans = cons(gke_subst_nl_for_inference_answer(inference_answer2), ans);
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator);
                                            }
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$90, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$89, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$88, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$87, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gke_inference_completeP(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        if (NIL == inference_datastructures_inference.inference_p(inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id))) {
            return T;
        }
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject status = inference_datastructures_inference.inference_status(inference);
        final SubLObject key = string_utilities.to_string(list(problem_store_id, inference_id));
        final SubLObject gke_process = gethash(key, $gke_query_threads$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject queue = process_utilities.process_wrapper_get_property(gke_process, $QUEUE, UNPROVIDED);
        final SubLObject daemon = process_utilities.process_wrapper_get_property(gke_process, $DAEMON, UNPROVIDED);
        return makeBoolean(((NIL != subl_promotions.memberP(status, $inference_done_statuses$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != queues.queue_empty_p(queue))) && (NIL != process_utilities.process_wrapper_process_completedP(daemon)));
    }

    public static SubLObject gke_get_inference_status(final SubLObject problem_store_id, final SubLObject inference_id) {
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        return inference_datastructures_inference.inference_status(inference);
    }

    public static SubLObject gke_get_inference_suspend_status(final SubLObject problem_store_id, final SubLObject inference_id) {
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject suspend_status = inference_datastructures_inference.inference_suspend_status(inference);
        return suspend_status;
    }

    public static SubLObject gke_stop_continuable_query(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject patience) {
        if (patience == UNPROVIDED) {
            patience = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        SubLTrampolineFile.enforceType(patience, NULL_OR_INTEGERP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject time_out = (NIL != patience) ? patience : $default_patience_wait_time$.getDynamicValue(thread);
        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
            inference_strategist.inference_interrupt(inference, time_out);
        }
        return NIL;
    }

    public static SubLObject gke_release_inference_resources(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(problem_store_id, INTEGERP);
        SubLTrampolineFile.enforceType(inference_id, INTEGERP);
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject key = string_utilities.to_string(list(problem_store_id, inference_id));
        inference_datastructures_problem_store.destroy_problem_store(problem_store);
        remhash(key, $gke_query_threads$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject null_or_integerp(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || v_object.isInteger());
    }

    public static SubLObject clear_cached_gke_functions() {
        clear_gke_predicate_filteredP();
        clear_gke_filtered_termP();
        clear_gke_isas_filtered_term();
        clear_gke_get_elements();
        clear_gke_memoization_state();
        clear_candidate_replacements_for_sentence_cached();
        return NIL;
    }

    public static SubLObject gke_test_queries(final SubLObject query_col) {
        return Mapping.mapcar(SECOND, ask_utilities.query_variable($sym248$_SENT, list($$thereExists, $sym249$_QUERY, listS($$and, list($$isa, $sym249$_QUERY, query_col), $list250)), $$TestVocabularyMt, UNPROVIDED));
    }

    public static SubLObject candidate_replacements_equalP(final SubLObject expected, final SubLObject actual) {
        SubLObject badP = makeBoolean(NIL == list_utilities.same_length_p(expected, actual));
        if (NIL == badP) {
            SubLObject expected_one = NIL;
            SubLObject expected_one_$95 = NIL;
            SubLObject actual_one = NIL;
            SubLObject actual_one_$96 = NIL;
            expected_one = expected;
            expected_one_$95 = expected_one.first();
            actual_one = actual;
            actual_one_$96 = actual_one.first();
            while ((NIL == badP) && ((NIL != actual_one) || (NIL != expected_one))) {
                if ((!expected_one_$95.first().equal(actual_one_$96.first())) || (NIL == list_utilities.sets_equal_equalP(expected_one_$95.rest(), actual_one_$96.rest()))) {
                    badP = T;
                }
                expected_one = expected_one.rest();
                expected_one_$95 = expected_one.first();
                actual_one = actual_one.rest();
                actual_one_$96 = actual_one.first();
            } 
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject test_candidate_replacements(final SubLObject sentence, final SubLObject mt) {
        return cycl_utilities.expression_transform(candidate_replacements_for_sentence(sentence, mt), NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject test_candidate_replacement_renderers(final SubLObject sentence, final SubLObject mt, SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(task) : "forts.fort_p(task) " + "CommonSymbols.NIL != forts.fort_p(task) " + task;
        final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
        try {
            cae_query_search.$current_cae_task$.bind(task, thread);
            return cycl_utilities.expression_transform(Mapping.mapcar(SORT_RESULT, Mapping.mapcar(REMOVE_JAVALIST_DETAIL, candidate_replacement_renderers_for_sentence(sentence, mt, UNPROVIDED))), NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
        } finally {
            cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject remove_javalist_detail(final SubLObject result) {
        return delete_javalist_detail(copy_tree(result));
    }

    public static SubLObject sort_result(final SubLObject result) {
        SubLObject arg_position = NIL;
        SubLObject groves = NIL;
        destructuring_bind_must_consp(result, result, $list269);
        arg_position = result.first();
        final SubLObject current = groves = result.rest();
        rplacd(result, sort_groves(groves));
        return result;
    }

    public static SubLObject sort_groves(final SubLObject groves) {
        return Sort.sort(Mapping.mapcar(SORT_GROVE, groves), $sym271$TERM___WITH_CONSTANT_BY_NAME, CAR);
    }

    public static SubLObject sort_grove(final SubLObject grove) {
        return Sort.sort(Mapping.mapcar(SORT_TREE, grove), $sym271$TERM___WITH_CONSTANT_BY_NAME, CAR);
    }

    public static SubLObject sort_tree(final SubLObject tree) {
        SubLObject root = NIL;
        SubLObject subtrees = NIL;
        destructuring_bind_must_consp(tree, tree, $list274);
        root = tree.first();
        final SubLObject current = subtrees = tree.rest();
        return cons(root, Sort.sort(Mapping.mapcar(SORT_TREE, subtrees), $sym271$TERM___WITH_CONSTANT_BY_NAME, CAR));
    }

    public static SubLObject delete_javalist_detail(final SubLObject result) {
        SubLObject arg_position = NIL;
        SubLObject flat_list = NIL;
        SubLObject groves = NIL;
        destructuring_bind_must_consp(result, result, $list275);
        arg_position = result.first();
        SubLObject current = result.rest();
        destructuring_bind_must_consp(current, result, $list275);
        flat_list = current.first();
        current = current.rest();
        SubLObject cdolist_list_var;
        groves = cdolist_list_var = current;
        SubLObject grove = NIL;
        grove = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$97 = grove;
            SubLObject tree = NIL;
            tree = cdolist_list_var_$97.first();
            while (NIL != cdolist_list_var_$97) {
                delete_javalist_detail_from_tree(tree);
                cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                tree = cdolist_list_var_$97.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            grove = cdolist_list_var.first();
        } 
        rplacd(result, groves);
        return result;
    }

    public static SubLObject delete_javalist_detail_from_tree(final SubLObject tree) {
        SubLObject root = NIL;
        SubLObject subtrees = NIL;
        destructuring_bind_must_consp(tree, tree, $list274);
        root = tree.first();
        final SubLObject current = subtrees = tree.rest();
        SubLObject current_$99;
        final SubLObject datum_$98 = current_$99 = root;
        SubLObject javalist = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current_$99, datum_$98, $list276);
        javalist = current_$99.first();
        current_$99 = current_$99.rest();
        destructuring_bind_must_consp(current_$99, datum_$98, $list276);
        v_term = current_$99.first();
        current_$99 = current_$99.rest();
        if (NIL == current_$99) {
            rplaca(tree, v_term);
        } else {
            cdestructuring_bind_error(datum_$98, $list276);
        }
        SubLObject cdolist_list_var = subtrees;
        SubLObject subtree = NIL;
        subtree = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            delete_javalist_detail_from_tree(subtree);
            cdolist_list_var = cdolist_list_var.rest();
            subtree = cdolist_list_var.first();
        } 
        return tree;
    }

    public static SubLObject test_candidate_replacement_renderers_for_vars(final SubLObject sentence1, final SubLObject sentence2, final SubLObject mt) {
        final SubLObject result1 = candidate_replacement_renderers_for_sentence(sentence1, narts_high.nart_substitute(mt), UNPROVIDED);
        final SubLObject result2 = candidate_replacement_renderers_for_sentence(sentence2, narts_high.nart_substitute(mt), UNPROVIDED);
        return equal(result1, result2);
    }

    public static SubLObject test_candidate_replacement_renderers_stumps(final SubLObject sentence, final SubLObject mt) {
        final SubLObject old_value = $omit_suggestion_stumpsP$.getGlobalValue();
        SubLObject no_stumps = NIL;
        SubLObject stumps = NIL;
        $omit_suggestion_stumpsP$.setGlobalValue(T);
        no_stumps = test_candidate_replacement_renderers(sentence, mt, UNPROVIDED);
        $omit_suggestion_stumpsP$.setGlobalValue(NIL);
        stumps = test_candidate_replacement_renderers(sentence, mt, UNPROVIDED);
        $omit_suggestion_stumpsP$.setGlobalValue(old_value);
        return cycl_utilities.expression_transform(list(stumps, no_stumps), NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nartify_and_substitute_term_into_sentence(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject try_coercionP, SubLObject allow_non_wffP, SubLObject optimize_var_namesP) {
        if (try_coercionP == UNPROVIDED) {
            try_coercionP = T;
        }
        if (allow_non_wffP == UNPROVIDED) {
            allow_non_wffP = NIL;
        }
        if (optimize_var_namesP == UNPROVIDED) {
            optimize_var_namesP = T;
        }
        return substitute_term_into_sentence(v_term, narts_high.nart_substitute(sentence), arg_pos, replace_all, domain_mt, try_coercionP, allow_non_wffP, optimize_var_namesP);
    }

    public static SubLObject declare_gke_main_file() {
        declareFunction(me, "get_gke_arg_options", "GET-GKE-ARG-OPTIONS", 7, 1, false);
        declareFunction(me, "get_arg_option_isa_relation", "GET-ARG-OPTION-ISA-RELATION", 6, 0, false);
        declareFunction(me, "get_arg_option_collection", "GET-ARG-OPTION-COLLECTION", 7, 0, false);
        declareFunction(me, "get_arg_option_individual", "GET-ARG-OPTION-INDIVIDUAL", 6, 0, false);
        declareFunction(me, "get_gke_expanded_items", "GET-GKE-EXPANDED-ITEMS", 3, 0, false);
        declareFunction(me, "get_gke_combine_with_is_valid_substitution", "GET-GKE-COMBINE-WITH-IS-VALID-SUBSTITUTION", 3, 1, false);
        declareFunction(me, "get_gke_cycl_formulas_for_nl_phrase", "GET-GKE-CYCL-FORMULAS-FOR-NL-PHRASE", 4, 0, false);
        declareFunction(me, "get_gke_quantifiers", "GET-GKE-QUANTIFIERS", 0, 0, false);
        declareFunction(me, "get_gke_quantifier_ranges", "GET-GKE-QUANTIFIER-RANGES", 0, 0, false);
        declareFunction(me, "gke_list_item_comparator", "GKE-LIST-ITEM-COMPARATOR", 2, 0, false);
        declareFunction(me, "gke_process_results", "GKE-PROCESS-RESULTS", 2, 2, false);
        declareFunction(me, "get_gke_specs", "GET-GKE-SPECS", 5, 1, false);
        declareFunction(me, "get_gke_genls", "GET-GKE-GENLS", 5, 0, false);
        declareFunction(me, "get_gke_spec_preds", "GET-GKE-SPEC-PREDS", 5, 0, false);
        declareFunction(me, "get_gke_genl_preds", "GET-GKE-GENL-PREDS", 5, 0, false);
        declareFunction(me, "get_gke_collection_siblings", "GET-GKE-COLLECTION-SIBLINGS", 5, 0, false);
        declareFunction(me, "get_gke_instance_siblings", "GET-GKE-INSTANCE-SIBLINGS", 5, 0, false);
        declareFunction(me, "get_gke_siblings", "GET-GKE-SIBLINGS", 5, 0, false);
        declareFunction(me, "add_self_to_quantify_over_isas", "ADD-SELF-TO-QUANTIFY-OVER-ISAS", 3, 0, false);
        declareFunction(me, "get_gke_quantify_over_isas", "GET-GKE-QUANTIFY-OVER-ISAS", 4, 0, false);
        declareFunction(me, "get_gke_isas", "GET-GKE-ISAS", 5, 0, false);
        declareFunction(me, "clear_gke_isas_filtered_term", "CLEAR-GKE-ISAS-FILTERED-TERM", 0, 0, false);
        declareFunction(me, "remove_gke_isas_filtered_term", "REMOVE-GKE-ISAS-FILTERED-TERM", 1, 1, false);
        declareFunction(me, "gke_isas_filtered_term_internal", "GKE-ISAS-FILTERED-TERM-INTERNAL", 2, 0, false);
        declareFunction(me, "gke_isas_filtered_term", "GKE-ISAS-FILTERED-TERM", 1, 1, false);
        declareFunction(me, "clear_gke_filtered_termP", "CLEAR-GKE-FILTERED-TERM?", 0, 0, false);
        declareFunction(me, "remove_gke_filtered_termP", "REMOVE-GKE-FILTERED-TERM?", 1, 1, false);
        declareFunction(me, "gke_filtered_termP_internal", "GKE-FILTERED-TERM?-INTERNAL", 2, 0, false);
        declareFunction(me, "gke_filtered_termP", "GKE-FILTERED-TERM?", 1, 1, false);
        declareFunction(me, "clear_gke_predicate_filteredP", "CLEAR-GKE-PREDICATE-FILTERED?", 0, 0, false);
        declareFunction(me, "remove_gke_predicate_filteredP", "REMOVE-GKE-PREDICATE-FILTERED?", 2, 0, false);
        declareFunction(me, "gke_predicate_filteredP_internal", "GKE-PREDICATE-FILTERED?-INTERNAL", 2, 0, false);
        declareFunction(me, "gke_predicate_filteredP", "GKE-PREDICATE-FILTERED?", 2, 0, false);
        declareFunction(me, "terms_pass_constraints", "TERMS-PASS-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "operator_terms_pass_constraints", "OPERATOR-TERMS-PASS-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "argument_terms_pass_constraints", "ARGUMENT-TERMS-PASS-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "argument_terms_pass_isa_genls_constraints", "ARGUMENT-TERMS-PASS-ISA-GENLS-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "get_gke_naut_arg_position", "GET-GKE-NAUT-ARG-POSITION", 3, 0, false);
        declareFunction(me, "get_gke_is_known", "GET-GKE-IS-KNOWN", 2, 0, false);
        declareFunction(me, "simulate_gke_query_paraphrase", "SIMULATE-GKE-QUERY-PARAPHRASE", 1, 3, false);
        declareFunction(me, "simulate_ccf_paraphrase", "SIMULATE-CCF-PARAPHRASE", 1, 2, false);
        declareFunction(me, "simulate_ccf3_paraphrase", "SIMULATE-CCF3-PARAPHRASE", 1, 2, false);
        declareFunction(me, "simulate_gke_query_paraphrase_terse", "SIMULATE-GKE-QUERY-PARAPHRASE-TERSE", 3, 0, false);
        declareFunction(me, "simulate_gke_query_paraphrase_verbose", "SIMULATE-GKE-QUERY-PARAPHRASE-VERBOSE", 3, 0, false);
        declareFunction(me, "simulate_gke3_query_paraphrase", "SIMULATE-GKE3-QUERY-PARAPHRASE", 1, 3, false);
        declareFunction(me, "simulate_gke3_paraphrase_guts", "SIMULATE-GKE3-PARAPHRASE-GUTS", 2, 0, false);
        declareFunction(me, "gke3_paraphrase_open_vars", "GKE3-PARAPHRASE-OPEN-VARS", 3, 0, false);
        declareFunction(me, "gke3_paraphrase_guts_int", "GKE3-PARAPHRASE-GUTS-INT", 3, 1, false);
        declareFunction(me, "starts_with_gke3_connectiveP", "STARTS-WITH-GKE3-CONNECTIVE?", 1, 0, false);
        declareFunction(me, "gke3_string_for_conjunction", "GKE3-STRING-FOR-CONJUNCTION", 1, 0, false);
        declareFunction(me, "simulate_gke_term_paraphrase", "SIMULATE-GKE-TERM-PARAPHRASE", 1, 2, false);
        declareFunction(me, "gke_add_cloned_literal", "GKE-ADD-CLONED-LITERAL", 3, 1, false);
        declareFunction(me, "gke_strengthen_query_sentence", "GKE-STRENGTHEN-QUERY-SENTENCE", 3, 0, false);
        declareFunction(me, "gke_remove_literal", "GKE-REMOVE-LITERAL", 3, 0, false);
        declareFunction(me, "gke_find_literal_to_clone", "GKE-FIND-LITERAL-TO-CLONE", 2, 0, false);
        declareFunction(me, "gke_find_literal_to_remove", "GKE-FIND-LITERAL-TO-REMOVE", 2, 0, false);
        declareFunction(me, "gke_find_literal_to_strengthen", "GKE-FIND-LITERAL-TO-STRENGTHEN", 2, 0, false);
        declareFunction(me, "gke_find_literal_for_arg_position", "GKE-FIND-LITERAL-FOR-ARG-POSITION", 2, 0, false);
        declareFunction(me, "gke_add_literal", "GKE-ADD-LITERAL", 4, 0, false);
        declareFunction(me, "gke_get_siblings", "GKE-GET-SIBLINGS", 3, 0, false);
        declareFunction(me, "gke_formula_arg_position", "GKE-FORMULA-ARG-POSITION", 2, 1, false);
        declareFunction(me, "gke_formula_arg_position_subst", "GKE-FORMULA-ARG-POSITION-SUBST", 3, 0, false);
        declareFunction(me, "loosen_gke_literal", "LOOSEN-GKE-LITERAL", 1, 1, false);
        declareFunction(me, "strengthen_gke_literal", "STRENGTHEN-GKE-LITERAL", 1, 1, false);
        declareFunction(me, "reformulator_settings_for_gke", "REFORMULATOR-SETTINGS-FOR-GKE", 1, 0, false);
        declareFunction(me, "sentence_substitution_wffP", "SENTENCE-SUBSTITUTION-WFF?", 2, 0, false);
        declareFunction(me, "free_variable", "FREE-VARIABLE", 2, 0, false);
        declareFunction(me, "existentially_boundP", "EXISTENTIALLY-BOUND?", 2, 0, false);
        declareFunction(me, "possible_sentence_substitutions", "POSSIBLE-SENTENCE-SUBSTITUTIONS", 5, 8, false);
        declareFunction(me, "formula_arg_pos_isa_constraint", "FORMULA-ARG-POS-ISA-CONSTRAINT", 3, 0, false);
        declareFunction(me, "substitute_term_into_sentence", "SUBSTITUTE-TERM-INTO-SENTENCE", 5, 3, false);
        declareFunction(me, "substitute_terms_into_sentence", "SUBSTITUTE-TERMS-INTO-SENTENCE", 6, 0, false);
        declareFunction(me, "substitute_term_into_sentence_int", "SUBSTITUTE-TERM-INTO-SENTENCE-INT", 6, 0, false);
        declareFunction(me, "coerce_term_into_sentence", "COERCE-TERM-INTO-SENTENCE", 5, 1, false);
        declareFunction(me, "clear_gke_memoization_state", "CLEAR-GKE-MEMOIZATION-STATE", 0, 0, false);
        declareFunction(me, "remove_gke_memoization_state", "REMOVE-GKE-MEMOIZATION-STATE", 0, 0, false);
        declareFunction(me, "gke_memoization_state_internal", "GKE-MEMOIZATION-STATE-INTERNAL", 0, 0, false);
        declareFunction(me, "gke_memoization_state", "GKE-MEMOIZATION-STATE", 0, 0, false);
        declareFunction(me, "gke_gloss_for_literal", "GKE-GLOSS-FOR-LITERAL", 1, 2, false);
        declareFunction(me, "get_gke_gloss_from_kb", "GET-GKE-GLOSS-FROM-KB", 3, 0, false);
        declareFunction(me, "clear_generate_gke_gloss_wrt_mt_cached", "CLEAR-GENERATE-GKE-GLOSS-WRT-MT-CACHED", 0, 0, false);
        declareFunction(me, "remove_generate_gke_gloss_wrt_mt_cached", "REMOVE-GENERATE-GKE-GLOSS-WRT-MT-CACHED", 3, 0, false);
        declareFunction(me, "generate_gke_gloss_wrt_mt_cached_internal", "GENERATE-GKE-GLOSS-WRT-MT-CACHED-INTERNAL", 3, 0, false);
        declareFunction(me, "generate_gke_gloss_wrt_mt_cached", "GENERATE-GKE-GLOSS-WRT-MT-CACHED", 3, 0, false);
        declareFunction(me, "candidate_replacement_renderers_for_sentence", "CANDIDATE-REPLACEMENT-RENDERERS-FOR-SENTENCE", 2, 1, false);
        declareFunction(me, "candidate_replacements_for_variables", "CANDIDATE-REPLACEMENTS-FOR-VARIABLES", 2, 0, false);
        declareFunction(me, "candidate_replacements_for_arg", "CANDIDATE-REPLACEMENTS-FOR-ARG", 3, 0, false);
        declareFunction(me, "candidate_replacements_for_sentence", "CANDIDATE-REPLACEMENTS-FOR-SENTENCE", 2, 0, false);
        declareFunction(me, "clear_candidate_replacements_for_sentence_cached", "CLEAR-CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED", 0, 0, false);
        declareFunction(me, "remove_candidate_replacements_for_sentence_cached", "REMOVE-CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED", 2, 0, false);
        declareFunction(me, "candidate_replacements_for_sentence_cached_internal", "CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "candidate_replacements_for_sentence_cached", "CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED", 2, 0, false);
        declareFunction(me, "add_candidate_replacements", "ADD-CANDIDATE-REPLACEMENTS", 5, 0, false);
        declareFunction(me, "candidate_replacement_join_function", "CANDIDATE-REPLACEMENT-JOIN-FUNCTION", 1, 0, false);
        declareFunction(me, "clear_gke_get_elements", "CLEAR-GKE-GET-ELEMENTS", 0, 0, false);
        declareFunction(me, "remove_gke_get_elements", "REMOVE-GKE-GET-ELEMENTS", 3, 0, false);
        declareFunction(me, "gke_get_elements_internal", "GKE-GET-ELEMENTS-INTERNAL", 3, 0, false);
        declareFunction(me, "gke_get_elements", "GKE-GET-ELEMENTS", 3, 0, false);
        declareFunction(me, "replacement_renderer_groves", "REPLACEMENT-RENDERER-GROVES", 4, 0, false);
        declareFunction(me, "find_table_to_conflate_to", "FIND-TABLE-TO-CONFLATE-TO", 3, 0, false);
        declareFunction(me, "replacement_tree_print_function_trampoline", "REPLACEMENT-TREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "replacement_tree_p", "REPLACEMENT-TREE-P", 1, 0, false);
        new gke_main.$replacement_tree_p$UnaryFunction();
        declareFunction(me, "r_tree_root", "R-TREE-ROOT", 1, 0, false);
        declareFunction(me, "r_tree_children", "R-TREE-CHILDREN", 1, 0, false);
        declareFunction(me, "_csetf_r_tree_root", "_CSETF-R-TREE-ROOT", 2, 0, false);
        declareFunction(me, "_csetf_r_tree_children", "_CSETF-R-TREE-CHILDREN", 2, 0, false);
        declareFunction(me, "make_replacement_tree", "MAKE-REPLACEMENT-TREE", 0, 1, false);
        declareFunction(me, "visit_defstruct_replacement_tree", "VISIT-DEFSTRUCT-REPLACEMENT-TREE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_replacement_tree_method", "VISIT-DEFSTRUCT-OBJECT-REPLACEMENT-TREE-METHOD", 2, 0, false);
        declareFunction(me, "print_replacement_tree", "PRINT-REPLACEMENT-TREE", 3, 0, false);
        declareFunction(me, "new_replacement_tree", "NEW-REPLACEMENT-TREE", 1, 1, false);
        declareFunction(me, "replacement_tree_root", "REPLACEMENT-TREE-ROOT", 1, 0, false);
        declareFunction(me, "replacement_tree_children", "REPLACEMENT-TREE-CHILDREN", 1, 0, false);
        declareFunction(me, "replacement_tree_add_child", "REPLACEMENT-TREE-ADD-CHILD", 2, 0, false);
        declareFunction(me, "replacement_renderer_grove", "REPLACEMENT-RENDERER-GROVE", 2, 0, false);
        declareFunction(me, "replacement_renderer_grove_recursive", "REPLACEMENT-RENDERER-GROVE-RECURSIVE", 3, 0, false);
        declareFunction(me, "add_one_renderer", "ADD-ONE-RENDERER", 4, 0, false);
        declareFunction(me, "renderer_tree_contains_rendererP", "RENDERER-TREE-CONTAINS-RENDERER?", 4, 1, false);
        declareFunction(me, "break_replacement_renderer_cycles", "BREAK-REPLACEMENT-RENDERER-CYCLES", 2, 0, false);
        declareFunction(me, "listy_replacement_tree", "LISTY-REPLACEMENT-TREE", 2, 0, false);
        declareFunction(me, "postpone_adding_replacementP", "POSTPONE-ADDING-REPLACEMENT?", 3, 0, false);
        declareFunction(me, "replacement_renderer_tree_specifications", "REPLACEMENT-RENDERER-TREE-SPECIFICATIONS", 3, 0, false);
        declareFunction(me, "replacement_renderer_tree_conflation_preds", "REPLACEMENT-RENDERER-TREE-CONFLATION-PREDS", 3, 0, false);
        declareFunction(me, "renderer_to_superiors_table", "RENDERER-TO-SUPERIORS-TABLE", 5, 1, false);
        declareFunction(me, "superiors_for_renderer_term", "SUPERIORS-FOR-RENDERER-TERM", 5, 0, false);
        declareFunction(me, "gke_subst_nl_for_inference_answer", "GKE-SUBST-NL-FOR-INFERENCE-ANSWER", 1, 0, false);
        declareFunction(me, "gke_subst_nl_for_binding", "GKE-SUBST-NL-FOR-BINDING", 1, 0, false);
        declareFunction(me, "el_binding_list_to_gke_binding_list", "EL-BINDING-LIST-TO-GKE-BINDING-LIST", 2, 0, false);
        declareFunction(me, "el_binding_to_gke_binding", "EL-BINDING-TO-GKE-BINDING", 1, 0, false);
        declareFunction(me, "variable_to_nl_string", "VARIABLE-TO-NL-STRING", 1, 0, false);
        declareFunction(me, "gke_start_continuable_query", "GKE-START-CONTINUABLE-QUERY", 2, 1, false);
        declareFunction(me, "gke_warn", "GKE-WARN", 1, 0, false);
        declareFunction(me, "gke_continue_query", "GKE-CONTINUE-QUERY", 3, 1, false);
        declareFunction(me, "new_gke_process", "NEW-GKE-PROCESS", 3, 1, false);
        declareFunction(me, "new_results_daemon", "NEW-RESULTS-DAEMON", 3, 0, false);
        declareFunction(me, "results_daemon", "RESULTS-DAEMON", 4, 0, false);
        declareFunction(me, "daemon_should_run", "DAEMON-SHOULD-RUN", 2, 0, false);
        declareFunction(me, "gke_run_inference", "GKE-RUN-INFERENCE", 4, 1, false);
        declareFunction(me, "gke_get_one_inference_result", "GKE-GET-ONE-INFERENCE-RESULT", 2, 0, false);
        declareFunction(me, "gke_get_inference_results", "GKE-GET-INFERENCE-RESULTS", 2, 0, false);
        declareFunction(me, "gke_inference_completeP", "GKE-INFERENCE-COMPLETE?", 2, 0, false);
        declareFunction(me, "gke_get_inference_status", "GKE-GET-INFERENCE-STATUS", 2, 0, false);
        declareFunction(me, "gke_get_inference_suspend_status", "GKE-GET-INFERENCE-SUSPEND-STATUS", 2, 0, false);
        declareFunction(me, "gke_stop_continuable_query", "GKE-STOP-CONTINUABLE-QUERY", 2, 1, false);
        declareFunction(me, "gke_release_inference_resources", "GKE-RELEASE-INFERENCE-RESOURCES", 2, 0, false);
        declareFunction(me, "null_or_integerp", "NULL-OR-INTEGERP", 1, 0, false);
        declareFunction(me, "clear_cached_gke_functions", "CLEAR-CACHED-GKE-FUNCTIONS", 0, 0, false);
        declareFunction(me, "gke_test_queries", "GKE-TEST-QUERIES", 1, 0, false);
        declareFunction(me, "candidate_replacements_equalP", "CANDIDATE-REPLACEMENTS-EQUAL?", 2, 0, false);
        declareFunction(me, "test_candidate_replacements", "TEST-CANDIDATE-REPLACEMENTS", 2, 0, false);
        declareFunction(me, "test_candidate_replacement_renderers", "TEST-CANDIDATE-REPLACEMENT-RENDERERS", 2, 1, false);
        declareFunction(me, "remove_javalist_detail", "REMOVE-JAVALIST-DETAIL", 1, 0, false);
        declareFunction(me, "sort_result", "SORT-RESULT", 1, 0, false);
        declareFunction(me, "sort_groves", "SORT-GROVES", 1, 0, false);
        declareFunction(me, "sort_grove", "SORT-GROVE", 1, 0, false);
        declareFunction(me, "sort_tree", "SORT-TREE", 1, 0, false);
        declareFunction(me, "delete_javalist_detail", "DELETE-JAVALIST-DETAIL", 1, 0, false);
        declareFunction(me, "delete_javalist_detail_from_tree", "DELETE-JAVALIST-DETAIL-FROM-TREE", 1, 0, false);
        declareFunction(me, "test_candidate_replacement_renderers_for_vars", "TEST-CANDIDATE-REPLACEMENT-RENDERERS-FOR-VARS", 3, 0, false);
        declareFunction(me, "test_candidate_replacement_renderers_stumps", "TEST-CANDIDATE-REPLACEMENT-RENDERERS-STUMPS", 2, 0, false);
        declareFunction(me, "nartify_and_substitute_term_into_sentence", "NARTIFY-AND-SUBSTITUTE-TERM-INTO-SENTENCE", 5, 3, false);
        return NIL;
    }

    public static SubLObject init_gke_main_file() {
        deflexical("*GKE-ISAS-FILTERED-TERM-CACHING-STATE*", NIL);
        deflexical("*GKE-OVERLY-GENERAL-NON-PREDICATE-TYPES*", $list27);
        deflexical("*GKE-FILTERED-TERM?-CACHING-STATE*", NIL);
        deflexical("*GKE-OVERLY-GENERAL-PREDICATE-TYPES*", $list29);
        deflexical("*GKE-PREDICATE-FILTERED?-CACHING-STATE*", NIL);
        defparameter("*USE-RBP-WFF-IN-GKE?*", T);
        deflexical("*GKE-MEMOIZATION-STATE-CACHING-STATE*", NIL);
        deflexical("*GENERATE-GKE-GLOSS-WRT-MT-CACHED-CACHING-STATE*", NIL);
        deflexical("*CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED-CACHING-STATE*", NIL);
        deflexical("*GKE-GET-ELEMENTS-CACHING-STATE*", NIL);
        deflexical("*OMIT-SUGGESTION-STUMPS?*", SubLTrampolineFile.maybeDefault($sym140$_OMIT_SUGGESTION_STUMPS__, $omit_suggestion_stumpsP$, NIL));
        defconstant("*DTP-REPLACEMENT-TREE*", REPLACEMENT_TREE);
        deflexical("*USE-TVA-FOR-SUGGESTIONS?*", SubLTrampolineFile.maybeDefault($sym188$_USE_TVA_FOR_SUGGESTIONS__, $use_tva_for_suggestionsP$, NIL));
        defparameter("*DEFAULT-PATIENCE-WAIT-TIME*", TWO_INTEGER);
        defparameter("*GKE-QUERY-THREADS*", make_hash_table(FIVE_INTEGER, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*DAEMON-SHOULD-RUN-INFERENCE-STATUSES*", $list220);
        deflexical("*GKE-RUN-INFERENCE-WITH-ADJUSTED-DYNAMIC-PROPERTIES?*", NIL);
        deflexical("*INFERENCE-DONE-STATUSES*", $list233);
        return NIL;
    }

    public static SubLObject setup_gke_main_file() {
        register_external_symbol(GET_GKE_ARG_OPTIONS);
        register_external_symbol(GET_GKE_EXPANDED_ITEMS);
        register_cyc_api_function(GET_GKE_QUANTIFIER_RANGES, NIL, $$$Get_the_quantifier_ranges, NIL, NIL);
        memoization_state.note_globally_cached_function(GKE_ISAS_FILTERED_TERM);
        memoization_state.note_globally_cached_function($sym19$GKE_FILTERED_TERM_);
        memoization_state.note_globally_cached_function($sym30$GKE_PREDICATE_FILTERED_);
        register_external_symbol(GET_GKE_NAUT_ARG_POSITION);
        register_external_symbol(GET_GKE_IS_KNOWN);
        register_external_symbol(GKE_ADD_CLONED_LITERAL);
        register_external_symbol(GKE_REMOVE_LITERAL);
        register_external_symbol(POSSIBLE_SENTENCE_SUBSTITUTIONS);
        register_external_symbol(SUBSTITUTE_TERM_INTO_SENTENCE);
        memoization_state.note_globally_cached_function(GKE_MEMOIZATION_STATE);
        register_external_symbol(GKE_GLOSS_FOR_LITERAL);
        memoization_state.note_globally_cached_function(GENERATE_GKE_GLOSS_WRT_MT_CACHED);
        register_external_symbol(CANDIDATE_REPLACEMENT_RENDERERS_FOR_SENTENCE);
        register_external_symbol(CANDIDATE_REPLACEMENTS_FOR_VARIABLES);
        register_external_symbol(CANDIDATE_REPLACEMENTS_FOR_ARG);
        memoization_state.note_globally_cached_function(CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED);
        memoization_state.note_globally_cached_function(GKE_GET_ELEMENTS);
        declare_defglobal($sym140$_OMIT_SUGGESTION_STUMPS__);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_replacement_tree$.getGlobalValue(), symbol_function(REPLACEMENT_TREE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list149);
        def_csetf(R_TREE_ROOT, _CSETF_R_TREE_ROOT);
        def_csetf(R_TREE_CHILDREN, _CSETF_R_TREE_CHILDREN);
        identity(REPLACEMENT_TREE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_replacement_tree$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REPLACEMENT_TREE_METHOD));
        note_funcall_helper_function(PRINT_REPLACEMENT_TREE);
        declare_defglobal($sym188$_USE_TVA_FOR_SUGGESTIONS__);
        register_cyc_api_function(GKE_START_CONTINUABLE_QUERY, $list201, $str202$Setup_a_query__and_immediately_re, $list203, NIL);
        register_cyc_api_function(GKE_CONTINUE_QUERY, $list209, $str210$Continue_an_existing_query__ident, $list211, NIL);
        register_cyc_api_function(GKE_GET_ONE_INFERENCE_RESULT, $list225, $$$Get_one_inference_result, $list227, NIL);
        register_cyc_api_function(GKE_GET_INFERENCE_RESULTS, $list225, $str231$get_all_the_inference_results_so_, $list232, NIL);
        register_cyc_api_function($sym234$GKE_INFERENCE_COMPLETE_, $list225, $str235$ret_t_iff_inference_is_suspended_, $list227, NIL);
        register_cyc_api_function(GKE_GET_INFERENCE_STATUS, $list225, $$$get_the_status_of_the_inference, $list227, NIL);
        register_cyc_api_function(GKE_GET_INFERENCE_SUSPEND_STATUS, $list225, $str239$get_the_suspend_status_of_the_inf, $list227, NIL);
        register_cyc_api_function(GKE_STOP_CONTINUABLE_QUERY, $list242, $str243$Find_and_stop_the_inference_, $list244, NIL);
        register_cyc_api_function(GKE_RELEASE_INFERENCE_RESOURCES, $list225, $str246$Destroy_problem_store_and_inferen, $list227, NIL);
        register_external_symbol(GKE_TEST_QUERIES);
        sunit_external.define_test_category($str252$GKE_Query_Sentence_Literal_Manipu, UNPROVIDED);
        sunit_external.define_test_suite($$$GKE_Main_Test_Suite, $list254, UNPROVIDED, UNPROVIDED);
        define_test_case_table_int(TEST_CANDIDATE_REPLACEMENTS, list(new SubLObject[]{ $TEST, $sym257$CANDIDATE_REPLACEMENTS_EQUAL_, $OWNER, NIL, $CLASSES, $list260, $KB, $FULL, $WORKING_, T }), $list264);
        define_test_case_table_int(TEST_CANDIDATE_REPLACEMENT_RENDERERS_FOR_VARS, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list260, $KB, $FULL, $WORKING_, T }), $list278);
        define_test_case_table_int(TEST_CANDIDATE_REPLACEMENT_RENDERERS_STUMPS, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list260, $KB, $FULL, $WORKING_, T }), $list280);
        define_test_case_table_int(TEST_CANDIDATE_REPLACEMENT_RENDERERS, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list260, $KB, $FULL, $WORKING_, T }), $list282);
        define_test_case_table_int(NARTIFY_AND_SUBSTITUTE_TERM_INTO_SENTENCE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list260, $KB, $FULL, $WORKING_, T }), $list284);
        define_test_case_table_int(SUBSTITUTE_TERM_INTO_SENTENCE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list260, $KB, $FULL, $WORKING_, T }), $list285);
        return NIL;
    }

    private static SubLObject _constant_282_initializer() {
        return list(list(list(list(reader_make_constant_shell(makeString("dataForValveOfEventRecordsStenosisSeverity")), makeSymbol("?CARDIAC-VALVE-DATA"), makeSymbol("?MEDICALLY-RELATED-EVENT"), list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), reader_make_constant_shell(makeString("CCFMedicalResearch-Allotment"))), list(list(list(THREE_INTEGER), list(new SubLObject[]{ list(reader_make_constant_shell(makeString("CardiacValveStenosis_critical"))), list(reader_make_constant_shell(makeString("CardiacValveStenosis_present"))), list(reader_make_constant_shell(makeString("CardiacValveStenosis_trivial"))), list(reader_make_constant_shell(makeString("CardiacValveStenosis_unknown"))), list(reader_make_constant_shell(makeString("Moderate-SevereToSevereCardiacValveStenosis")), list(list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("SeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))))), list(reader_make_constant_shell(makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), list(list(reader_make_constant_shell(makeString("ModeratePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("SeverePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis"))))), list(reader_make_constant_shell(makeString("None-CardiacValveStenosis"))), list(list(reader_make_constant_shell(makeString("MildPhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))), list(list(reader_make_constant_shell(makeString("MildToModeratePhysiologicalConditionOfTypeFn")), reader_make_constant_shell(makeString("CardiacValveStenosis")))) })))), list(list(list(reader_make_constant_shell(makeString("valveProsthesisTypeExplanted")), makeSymbol("?HEART-VALVE-REPLACEMENT"), reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000")), makeSymbol("?VALVE-PROSTHESIS")), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), reader_make_constant_shell(makeString("CCFMedicalResearch-Allotment"))), list(list(list(TWO_INTEGER), list(list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis")), list(reader_make_constant_shell(makeString("AorticAndMitralValveProsthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842007-D"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelHALL")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("AorticValveProsthesis")), list(new SubLObject[]{ reader_make_constant_shell(makeString("AorticValveMechanicalProsthesis")), list(reader_make_constant_shell(makeString("AorticSilasticBallValveProsthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1260")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2310"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2320"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3160"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842006-D"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842006-F"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842050-B"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGFN-756"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGFN-756-IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_ONXAE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXAC"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-Aortic-Biological")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1000")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700PM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2800"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9000IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_BSP100"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelTF-IDE"))) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticApex")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel503DA")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticCompositeGraft")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelXAGV")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticHighProfile")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAHP-105")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticSingleComponent")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel320")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticStabilizedGlutaraldehydeProcess")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel250")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-CConvex-Concave")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVC")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-FreestyleAorticRoot")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel995")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-MagnaAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-MosaicUltraAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel305")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-PremarketAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700PM")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-PrimaPlusStentlessAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2500P")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-ReducedAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelR500")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel150"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel242"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel300"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel350"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606366"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelA-101"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelABP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGN-751"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAJ-501"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-201"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-301"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-CUS"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10SP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVG-404"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVGJ-514"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_BiocorAortic"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_C7700"))), list(new SubLObject[]{ list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-Pericardial")), reader_make_constant_shell(makeString("AorticValveProsthesis"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1000")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700PM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2800"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9000IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX"))) }) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-3FAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1000")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticConduit")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606366")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticDisc")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelABP")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticRegent")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGFN-756-IDE")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticValvedConduit")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-CConvex-Concave")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVC")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-NotLowPorosity")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVM")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel150"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel350"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-201"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-301"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-CUS"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVG-404"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVGJ-514"))) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Bicor")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10SP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_BiocorAortic"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_BiocorMitral")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Bileaflet")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3160"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9120"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelHALL")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Allograft")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("CryolifeAorticAllograft")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("CryolifePulmonaryAllograft")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("LifenetAorticAllograft")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("LifenetPulmonaryAllograft")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("UnknownManufacturer-Allograft"))))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-Aortic-Biological")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1000")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700PM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2800"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9000IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_BSP100"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelTF-IDE"))) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-BovineOrPorcine")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-Bovine")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_7000")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-Porcine")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticStabilizedGlutaraldehydeProcess")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel250")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-PrimaPlusStentlessAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2500P")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel109411-1"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel150"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel242"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel300"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel305"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel310"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel320"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342A-V"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342R"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel350"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606306"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606366"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625-ESR-LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel995"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISU"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_995"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelXAGV"))) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB100-M"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_B100-A"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_B100-M"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_BSP100"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelTF-IDE")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-Pericardial")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900P"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900PTFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel7000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISLM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_12A"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_9000TFX"))), list(new SubLObject[]{ list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-Pericardial")), reader_make_constant_shell(makeString("AorticValveProsthesis"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1000")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700PM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2800"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9000IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX"))) }) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Heterograft")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-Equine")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9000IDE")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-Biological-Porcine")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-AorticStabilizedGlutaraldehydeProcess")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel250")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-PrimaPlusStentlessAortic")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2500P")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel109411-1"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel150"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel242"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel300"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel305"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel310"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel320"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342A-V"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342R"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel350"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606306"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606366"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625-ESR-LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel995"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISU"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_995"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelXAGV"))) })), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10SP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_4300"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("UnknownManufacturer-BiologicValve")))) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-CompositeGraft")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelXAGV")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-ExpandedCuff")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMEC-102")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-LowProfile")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISLM")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacValveProsthesis-Mechanical")), list(new SubLObject[]{ reader_make_constant_shell(makeString("AorticValveMechanicalProsthesis")), list(reader_make_constant_shell(makeString("AorticSilasticBallValveProsthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1260")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2310"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2320"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3160"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842006-D"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842006-F"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842050-B"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGFN-756"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGFN-756-IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_ONXAE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXAC"))) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Disk")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606366"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9120"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelABP")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel503DA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842007-D"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6120"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6320"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel65"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel70"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel750"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel825"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelA-101"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGN-751"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAHP-105"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAHPJ-505"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAJ-501"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-201"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-301"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-CUS"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVG-404"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVGJ-514"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelF700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelHALL"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelM-101"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBRP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMECJ-502"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMHP-105"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMJ-501"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_106"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_503DA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_AEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_Bjork-Shiley-CC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_C7700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_ONCMC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_ONXA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_ONXMC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelR500"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelS500"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("UnknownManufacturer-MechanicalValve")))) }), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-On-X")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_ONXAE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXAC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXM")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-OptiformMitralValve")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelF700")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Perimont")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900P"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Stented")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6650")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-SubAnular")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBP")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-SupraAnular")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10SP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBRP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelS500")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-TwoComponent")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel300")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-Universal")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISU")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_Photofix"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("MitralValveProsthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-ClothCoveredMitral")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6320")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-MitralUpsideDown")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2900")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-SilasticMitral")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6120")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-VascorMitralValveProstheis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342R")))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel109411-1"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel305"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel310"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342A-V"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606306"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel65"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625-ESR-LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900P"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900PTFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel70"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel7000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel750"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel825"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9120"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAHPJ-505"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB100-M"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelF700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISLM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISU"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelM-101"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBRP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMECJ-502"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMHP-105"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMJ-501"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_7000"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_BiocorMitral"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_Bjork-Shiley-CC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelS500"))) }), list(list(reader_make_constant_shell(makeString("CollectionUnionFn")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("CCFCardiacValveExistingOrExplantProsthesis")), reader_make_constant_shell(makeString("CCFCardiacValveImplantProsthesis")))), list(reader_make_constant_shell(makeString("CCFCardiacValveExistingOrExplantProsthesis"))), list(reader_make_constant_shell(makeString("CCFCardiacValveImplantProsthesis")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("BaxterHealthcareCorp"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2500P")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Beall")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("BeallSurgitool")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Bjork-shiley"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelABP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGVM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMBRP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_Bjork-Shiley-CC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelXAGV")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Braunwald-cutter")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Carbomedic"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelF700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelR500"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelS500")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Caster-hall")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Cooley-bloodwell-cutter")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Cooley-cutter")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Cross-jones"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel65"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel70")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Cutter-TheOrganization")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("DebakeySurgitool")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("EdwardsDuromedic"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3160"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9120")))), list(new SubLObject[]{ list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("EdwardsLifesciences"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel109411-1"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2700PM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2800"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel3000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606306"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel606366"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625-ESR-LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6625LP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6650"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900P"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6900PTFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel7000TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel9000IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_3300TFX"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_7000"))) }), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("FasciaLata")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Gott-daggett")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Hancock"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel150"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel242"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel250"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342A-V"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel342R")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Harken")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Homograft")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Inescu-shiley"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISLM"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelISU")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Kay-shiley")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Kay-suzuki")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Lillihei-kaster")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Magovern-cromie")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("MedicalCarbonResearchInstitute"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_ONXAE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXA"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXAC"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelONXM")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("MedtronicInc"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel305"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel310"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel995"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelHALL"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelNumber_C7700")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Omni-science")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("PulmonaryAutograft")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Smeloff-cutter"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel750"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel825"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel900")))), list(new SubLObject[]{ list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("StJudeMedical"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842006-D"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842006-F"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842007-D"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel52842050-B"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelA-101"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGFN-756"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGFN-756-IDE"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAGN-751"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAHP-105"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAHPJ-505"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAJ-501"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-201"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-301"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelAVG-CUS"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB100-M"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelB10SP"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVG-404"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelCAVGJ-514"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelM-101"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMEC-102"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMECJ-502"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMHP-105"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelMJ-501"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModelTF-IDE"))) }), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Starr-edwards"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1260"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2310"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel2320"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel6320")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Tascon"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel200"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel300"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel320"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel350")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Therapeutic"))), list(reader_make_constant_shell(makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), list(reader_make_constant_shell(makeString("CardiacValveProsthesisModel1000"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("CardiacValveProsthesis")), reader_make_constant_shell(makeString("cCFMadeBy")), reader_make_constant_shell(makeString("Wada-cutter")))) }))))), list(list(list(reader_make_constant_shell(makeString("hasDiagnosis")), makeSymbol("?DIAG"), reader_make_constant_shell(makeString("HeartRhythm"))), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), reader_make_constant_shell(makeString("CCFMedicalResearch-Allotment"))), list(list(list(TWO_INTEGER), list(new SubLObject[]{ list(reader_make_constant_shell(makeString("AbnormalAorticConduit")), list(reader_make_constant_shell(makeString("AortaArch-AbnormalConduit"))), list(reader_make_constant_shell(makeString("AscendingAorta-AbnormalConduit"))), list(reader_make_constant_shell(makeString("DescendingAorta-AbnormalConduit")), list(reader_make_constant_shell(makeString("DescendingThoracicAorta-AbnormalConduit"))))), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps")), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-AorticValve"))), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-MitralValve"))), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-PulmonaryValve"))), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-TricuspidValve")))), list(reader_make_constant_shell(makeString("Abscess")), list(reader_make_constant_shell(makeString("Abscess-AorticRoot")))), list(reader_make_constant_shell(makeString("Aneurysmal"))), list(reader_make_constant_shell(makeString("AortaArch-NormalConduit"))), list(reader_make_constant_shell(makeString("AortaAscendingRupture"))), list(reader_make_constant_shell(makeString("AortaDescendingRupture"))), list(reader_make_constant_shell(makeString("AorticArchAbnormalities"))), list(reader_make_constant_shell(makeString("AorticArchRupture"))), list(reader_make_constant_shell(makeString("Arteriosclerosis")), list(reader_make_constant_shell(makeString("Atherosclerosis")), list(reader_make_constant_shell(makeString("Atherosclerosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Atherosclerosis-Aorta"))), list(reader_make_constant_shell(makeString("Atherosclerosis-AortaArch"))), list(reader_make_constant_shell(makeString("Atherosclerosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("Atherosclerosis-DescendingAorta")), list(reader_make_constant_shell(makeString("Atherosclerosis-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("AtheromaOrAtherosclerosis")), list(reader_make_constant_shell(makeString("Atherosclerosis")), list(reader_make_constant_shell(makeString("Atherosclerosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Atherosclerosis-Aorta"))), list(reader_make_constant_shell(makeString("Atherosclerosis-AortaArch"))), list(reader_make_constant_shell(makeString("Atherosclerosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("Atherosclerosis-DescendingAorta")), list(reader_make_constant_shell(makeString("Atherosclerosis-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("Atresia")), list(reader_make_constant_shell(makeString("AorticArchAtresia"))), list(reader_make_constant_shell(makeString("Atresia-AorticValve"))), list(reader_make_constant_shell(makeString("Atresia-MitralValve"))), list(reader_make_constant_shell(makeString("Atresia-PulmonaryValve")), list(reader_make_constant_shell(makeString("AtresiaWithIntactSeptum-PulmonaryValve"))), list(reader_make_constant_shell(makeString("AtresiaWithVentricularSeptalDefect-PulmonaryValve")))), list(reader_make_constant_shell(makeString("Atresia-TricuspidValve")))), list(reader_make_constant_shell(makeString("AtrialDisorder")), list(reader_make_constant_shell(makeString("AtrialArrhythmia")), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillation"))), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("AtrialTachycardia"))), list(reader_make_constant_shell(makeString("CardiacFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("EctopicHeartbeat"))), list(reader_make_constant_shell(makeString("PrematureAtrialComplex"))), list(reader_make_constant_shell(makeString("PrematureEctopicBeats"))), list(reader_make_constant_shell(makeString("WanderingPacemaker")))), list(reader_make_constant_shell(makeString("AtrialSeptalDefectPrimum"))), list(reader_make_constant_shell(makeString("AtrialSeptalDefectSecundum"))), list(reader_make_constant_shell(makeString("AtriallyPacedHeartRhythm")))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToRightVentricle"))), list(reader_make_constant_shell(makeString("BallooningOrProlapsedCardiacValve")), list(reader_make_constant_shell(makeString("BallooningOrProlapsedCardiacValve-MitralValve"))), list(reader_make_constant_shell(makeString("BallooningOrProlapsedCardiacValve-TricuspidValve")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("Calcification")), list(reader_make_constant_shell(makeString("AnnularCalcification")), list(reader_make_constant_shell(makeString("AnnularCalcification-AorticValve"))), list(reader_make_constant_shell(makeString("AnnularCalcification-MitralValve"))), list(reader_make_constant_shell(makeString("AnnularCalcification-PulmonaryValve"))), list(reader_make_constant_shell(makeString("AnnularCalcification-TricuspidValve")))), list(reader_make_constant_shell(makeString("Calcification-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Calcification-Aorta"))), list(reader_make_constant_shell(makeString("Calcification-AortaArch"))), list(reader_make_constant_shell(makeString("Calcification-AorticRoot"))), list(reader_make_constant_shell(makeString("Calcification-AorticValve"))), list(reader_make_constant_shell(makeString("Calcification-AscendingAorta"))), list(reader_make_constant_shell(makeString("Calcification-MitralValve"))), list(reader_make_constant_shell(makeString("Calcification-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Calcification-ThoracicAorta"))), list(reader_make_constant_shell(makeString("Calcification-TricuspidValve"))) }), list(reader_make_constant_shell(makeString("ChronicCondition")), list(reader_make_constant_shell(makeString("Arthritis")), list(reader_make_constant_shell(makeString("RheumatoidArthritis")))), list(reader_make_constant_shell(makeString("ChronicArrhythmia"))), list(reader_make_constant_shell(makeString("ChronicLungDisease")), list(reader_make_constant_shell(makeString("ChronicLungDisease-Mild"))), list(reader_make_constant_shell(makeString("ChronicLungDisease-Moderate"))), list(reader_make_constant_shell(makeString("ChronicLungDisease-Severe"))), list(reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease")), list(reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease-Clinical"))), list(reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease-Pharmacologic"))))), list(reader_make_constant_shell(makeString("DiabetesMellitus"))), list(reader_make_constant_shell(makeString("GeneticCondition")), list(reader_make_constant_shell(makeString("GeneticDisorder")), list(reader_make_constant_shell(makeString("LoeysDietzSyndrome"))), list(reader_make_constant_shell(makeString("MarfansSyndrome"))))), list(reader_make_constant_shell(makeString("Hypertension")), list(reader_make_constant_shell(makeString("Hypertension-Systemic")))), list(reader_make_constant_shell(makeString("Lupus")))), list(reader_make_constant_shell(makeString("Coarctation")), list(reader_make_constant_shell(makeString("AorticCoarctation")), list(reader_make_constant_shell(makeString("AbdominalAortaCoarctation"))), list(reader_make_constant_shell(makeString("AortaArchCoarctation"))), list(reader_make_constant_shell(makeString("DescendingAortaCoarctation")), list(reader_make_constant_shell(makeString("DescendingThoracicAortaCoarctation")))))), list(reader_make_constant_shell(makeString("CongenitalCondition")), list(new SubLObject[]{ reader_make_constant_shell(makeString("CongenitalHeartDisease")), list(reader_make_constant_shell(makeString("AbsentPulmonaryArtery"))), list(reader_make_constant_shell(makeString("Aneurysm-diverticulum-MembranousSeptum-SpontaneousClosureOfIVSD"))), list(reader_make_constant_shell(makeString("AneurysmSinusValsalva"))), list(reader_make_constant_shell(makeString("AnomalousPulmonaryVenousReturn-Partial"))), list(reader_make_constant_shell(makeString("AnomalousPulmonaryVenousReturn-Total"))), list(reader_make_constant_shell(makeString("AnomalyOfSystemicDrainage-PersistentLeftSVC"))), list(reader_make_constant_shell(makeString("Aorta-rightVentricleCommunication"))), list(reader_make_constant_shell(makeString("AortopulmonaryWindow"))), list(reader_make_constant_shell(makeString("AspleniaSyndrome"))), list(reader_make_constant_shell(makeString("Atrial-ventricularCanalDefectComplete"))), list(reader_make_constant_shell(makeString("AtrialSeptalAnyeurysm-Congenital"))), list(reader_make_constant_shell(makeString("AtrialSeptalDefectPrimum"))), list(reader_make_constant_shell(makeString("AtrialSeptalDefectSecundum"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistula")), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToLeftAtrium"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToLeftVentricle"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToPulmonaryArtery"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToRightAtrium"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToUndeterminedLocation")))), list(reader_make_constant_shell(makeString("AtrioventricularMalformations"))), list(reader_make_constant_shell(makeString("CommonVentricleTypeAOrTypeC"))), list(reader_make_constant_shell(makeString("CongenitalCoronaryArteryAnomalyOtherOrMultipleCongenitalAnomalies"))), list(reader_make_constant_shell(makeString("CongenitalDoubleOrificeLeftSinus"))), list(reader_make_constant_shell(makeString("CongenitalDoubleOrificeRightSinus"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CoronaryAnomaly")), list(reader_make_constant_shell(makeString("CoronaryAnomalyFistulaEctopicOrigin"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-CircumflexFromLeftAndRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-CircumflexFromRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingAndCircumflexWithCommonOstium"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingFromRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftCircumflexArteryAbsent"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftCoronaryArteryFromRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftFromPulmonaryArtery"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftMainTrunkAbsent"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-RightFromLeft"))) }), list(reader_make_constant_shell(makeString("Criss-crossHeart"))), list(reader_make_constant_shell(makeString("Dextroversion"))), list(reader_make_constant_shell(makeString("DoubleChamberedRightVentricle"))), list(reader_make_constant_shell(makeString("DoubleOutletLeftVentricle"))), list(reader_make_constant_shell(makeString("DoubleOutletRightVentricle"))), list(reader_make_constant_shell(makeString("DoubleRightVentricle"))), list(reader_make_constant_shell(makeString("EbsteinAnomaly"))), list(reader_make_constant_shell(makeString("EndocardialFibroelastosis"))), list(reader_make_constant_shell(makeString("HypertrophicObstructiveCardiomyopathy-Congenital"))), list(reader_make_constant_shell(makeString("HypoplasticLeftHeartSyndrome"))), list(reader_make_constant_shell(makeString("HypoplasticRightHeartSyndrome"))), list(reader_make_constant_shell(makeString("IsolatedDextrocardia"))), list(reader_make_constant_shell(makeString("IsolatedLevocardiaNoSitusInversus"))), list(reader_make_constant_shell(makeString("MalpositionOfGreatVessels"))), list(reader_make_constant_shell(makeString("MalpositionOfTheHeart"))), list(reader_make_constant_shell(makeString("Mapca"))), list(reader_make_constant_shell(makeString("MultipleVentricularSeptalDefect"))), list(reader_make_constant_shell(makeString("PatentDuctusArteriosus"))), list(reader_make_constant_shell(makeString("PatentForamenOvale"))), list(reader_make_constant_shell(makeString("PolyspleniaSyndrome"))), list(reader_make_constant_shell(makeString("PulmonaryArteryStenosis"))), list(reader_make_constant_shell(makeString("PulmonaryAtrial-ventricularFistulaPulmonaryArtery-PulmonaryVein"))), list(reader_make_constant_shell(makeString("SeptalDefect-CommonAtrium"))), list(reader_make_constant_shell(makeString("SimpleDextrocardiaWithSitusInversus"))), list(reader_make_constant_shell(makeString("SinusVenosusAtrialSeptalDefect"))), list(reader_make_constant_shell(makeString("StorageDiseaseOfTheHeart"))), list(reader_make_constant_shell(makeString("SystemicVenousObstruction"))), list(reader_make_constant_shell(makeString("TetralogyOfFallot"))), list(reader_make_constant_shell(makeString("TetralogyOfFallotWithAbsentPulmonaryValve"))), list(reader_make_constant_shell(makeString("TranspositionGreatVessels-Dextro-transpositionOrLevo-transposition"))), list(reader_make_constant_shell(makeString("TranspositionGreatVesselsCorrected"))), list(reader_make_constant_shell(makeString("TruncusArteriosus"))), list(reader_make_constant_shell(makeString("VascularRing"))), list(reader_make_constant_shell(makeString("VentricularInversion"))), list(reader_make_constant_shell(makeString("VentricularSeptalDefect")), list(reader_make_constant_shell(makeString("VentricularSeptalDefect-Atrial-ventricularCanalType"))), list(reader_make_constant_shell(makeString("VentricularSeptalDefect-Membranous"))), list(reader_make_constant_shell(makeString("VentricularSeptalDefect-Muscular")))) }), list(reader_make_constant_shell(makeString("FistulaCondition-CoronaryArteriovenous"))), list(reader_make_constant_shell(makeString("FistulaCondition-CoronaryArteriovenousToRightVentricle"))), list(reader_make_constant_shell(makeString("GeneticCondition")), list(reader_make_constant_shell(makeString("GeneticDisorder")), list(reader_make_constant_shell(makeString("LoeysDietzSyndrome"))), list(reader_make_constant_shell(makeString("MarfansSyndrome")))))), list(reader_make_constant_shell(makeString("CongenitalLeftCoronaryArteryFromRight"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("ConnectiveTissueDisorder")), list(reader_make_constant_shell(makeString("Arthritis")), list(reader_make_constant_shell(makeString("RheumatoidArthritis")))), list(reader_make_constant_shell(makeString("BeurgersDisease"))), list(reader_make_constant_shell(makeString("EhlersDanlosSyndrome"))), list(reader_make_constant_shell(makeString("GiantCellAortitis"))), list(reader_make_constant_shell(makeString("KawasakiDisease"))), list(reader_make_constant_shell(makeString("Lupus"))), list(reader_make_constant_shell(makeString("PolymyalgiaRheumatica"))), list(reader_make_constant_shell(makeString("RaynaudsDisease"))), list(reader_make_constant_shell(makeString("SjogrensSyndrome"))), list(reader_make_constant_shell(makeString("VasculiticSyndrome"))), list(reader_make_constant_shell(makeString("WegenersGranulomatosis"))) }), list(reader_make_constant_shell(makeString("CoronaryArteryDisease")), list(reader_make_constant_shell(makeString("CoronaryArteryAneurysm"))), list(reader_make_constant_shell(makeString("CoronaryArteryDisease-Ischemic"))), list(reader_make_constant_shell(makeString("OtherCoronaryArteryAbnormality")))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis")), list(reader_make_constant_shell(makeString("CysticMedialNecrisis-Aorta"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-AortaArch"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-DescendingAorta")), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("DigestiveDisorder")), list(reader_make_constant_shell(makeString("DigestiveHepaticFailure"))), list(reader_make_constant_shell(makeString("HiatalHernia"))), list(reader_make_constant_shell(makeString("RefluxDisease")))), list(reader_make_constant_shell(makeString("Dilatation-PhysiologicalCondition")), list(reader_make_constant_shell(makeString("Dilatation-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Dilatation-AortaArch"))), list(reader_make_constant_shell(makeString("Dilatation-AorticRoot"))), list(reader_make_constant_shell(makeString("Dilatation-AscendingAorta"))), list(reader_make_constant_shell(makeString("Dilatation-AscendingAortaRoot"))), list(reader_make_constant_shell(makeString("Dilatation-DescendingAorta")), list(reader_make_constant_shell(makeString("Dilatation-DescendingThoracicAorta"))))), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheAorta")), list(reader_make_constant_shell(makeString("Aorta-rightVentricleCommunication"))), list(reader_make_constant_shell(makeString("AortaAneurysmOrDissection")), list(reader_make_constant_shell(makeString("AortaDissection")), list(reader_make_constant_shell(makeString("AcuteAorticDissection")), list(reader_make_constant_shell(makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("ChronicAortaDissection")), list(reader_make_constant_shell(makeString("ChronicDissection-AbdominalAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch"))), list(reader_make_constant_shell(makeString("ChronicDissection-AorticRoot"))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("Dissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch")))), list(reader_make_constant_shell(makeString("Dissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))))), list(reader_make_constant_shell(makeString("Dissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("Dissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("Dissection-DescendingThoracicAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("AorticAneurysm")), list(reader_make_constant_shell(makeString("AortaUnspecifiedAneurysm"))))), list(reader_make_constant_shell(makeString("AortaFistula")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingAorta-Bronchial")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Bronchial")))), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingAorta-Esophageal")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Esophageal")))), list(reader_make_constant_shell(makeString("FistulaCondition-ThoracicAorta-Bronchial"))), list(reader_make_constant_shell(makeString("FistulaCondition-ThoracicAorta-Esophageal")))), list(reader_make_constant_shell(makeString("AorticCoarctation")), list(reader_make_constant_shell(makeString("AbdominalAortaCoarctation"))), list(reader_make_constant_shell(makeString("AortaArchCoarctation"))), list(reader_make_constant_shell(makeString("DescendingAortaCoarctation")), list(reader_make_constant_shell(makeString("DescendingThoracicAortaCoarctation"))))), list(reader_make_constant_shell(makeString("Aortitis")), list(reader_make_constant_shell(makeString("AbdominalAortaAortitis"))), list(reader_make_constant_shell(makeString("AortaArchAortitis"))), list(reader_make_constant_shell(makeString("AscendingAortaAortitis"))), list(reader_make_constant_shell(makeString("DescendingAortaAortitis")), list(reader_make_constant_shell(makeString("DescendingThoracicAortaAortitis"))))), list(reader_make_constant_shell(makeString("Atherosclerosis-Aorta"))), list(reader_make_constant_shell(makeString("Calcification-Aorta"))), list(reader_make_constant_shell(makeString("CysticMedialNecrisis-Aorta"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheAbdominalAorta")), list(reader_make_constant_shell(makeString("AbdominalAortaAortitis"))), list(reader_make_constant_shell(makeString("AbdominalAortaCoarctation"))), list(reader_make_constant_shell(makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), list(reader_make_constant_shell(makeString("Aneurysm-AbdominalAorta")), list(reader_make_constant_shell(makeString("SaccularAneurysm-AbdominalAorta")))), list(reader_make_constant_shell(makeString("Atherosclerosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Calcification-AbdominalAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-AbdominalAorta"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Dilatation-AbdominalAorta"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Fibrosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Thrombosis-AbdominalAorta"))) }), list(reader_make_constant_shell(makeString("DiseaseOfTheAorta-NonAneurysmal"))), list(reader_make_constant_shell(makeString("DiseaseOfTheAorta-Normal"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheAorticArch")), list(reader_make_constant_shell(makeString("AortaArch-AbnormalConduit"))), list(reader_make_constant_shell(makeString("AortaArchAortitis"))), list(reader_make_constant_shell(makeString("AortaArchCoarctation"))), list(reader_make_constant_shell(makeString("AorticArchAneurysmOrDissection")), list(reader_make_constant_shell(makeString("Aneurysm-AortaArch")), list(reader_make_constant_shell(makeString("DissectingAneurysm-AortaArch"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AortaArch"))))), list(reader_make_constant_shell(makeString("AorticArchAtresia"))), list(reader_make_constant_shell(makeString("Atherosclerosis-AortaArch"))), list(reader_make_constant_shell(makeString("Calcification-AortaArch"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-AortaArch"))), list(reader_make_constant_shell(makeString("Dilatation-AortaArch"))), list(reader_make_constant_shell(makeString("Dissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch")))), list(reader_make_constant_shell(makeString("Fibrosis-AortaArch"))), list(reader_make_constant_shell(makeString("InfectionOrMycotic-AortaArch"))), list(reader_make_constant_shell(makeString("IntramuralHematoma-AortaArch"))), list(reader_make_constant_shell(makeString("PenetratingUlcer-AortaArch"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-AortaArch"))), list(reader_make_constant_shell(makeString("Trauma-AortaArch"))), list(reader_make_constant_shell(makeString("Trombosis-AortaArch"))) }), list(reader_make_constant_shell(makeString("DiseaseOfTheAorticRoot")), list(reader_make_constant_shell(makeString("Abscess-AorticRoot"))), list(reader_make_constant_shell(makeString("Aneurysm-AorticRoot")), list(reader_make_constant_shell(makeString("DissectingAneurysm-AorticRoot"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AorticRoot")))), list(reader_make_constant_shell(makeString("Calcification-AorticRoot"))), list(reader_make_constant_shell(makeString("ChronicDissection-AorticRoot"))), list(reader_make_constant_shell(makeString("Dilatation-AorticRoot"))), list(reader_make_constant_shell(makeString("Dissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))))), list(reader_make_constant_shell(makeString("Fibrosis-AorticRoot")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheAscendingAorta")), list(reader_make_constant_shell(makeString("AscendingAorta-AbnormalConduit"))), list(reader_make_constant_shell(makeString("AscendingAorta-NormalConduit"))), list(reader_make_constant_shell(makeString("AscendingAortaAneurysmOrDissection")), list(reader_make_constant_shell(makeString("Aneurysm-AscendingAorta")), list(reader_make_constant_shell(makeString("DissectingAneurysm-AscendingAorta"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AscendingAorta"))))), list(reader_make_constant_shell(makeString("AscendingAortaAortitis"))), list(reader_make_constant_shell(makeString("Atherosclerosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("Calcification-AscendingAorta"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("Dilatation-AscendingAorta"))), list(reader_make_constant_shell(makeString("Dilatation-AscendingAortaRoot"))), list(reader_make_constant_shell(makeString("DiseaseOfTheAscendingAorta-Other"))), list(reader_make_constant_shell(makeString("Dissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("Fibrosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("InfectionOrMycotic-AscendingAorta"))), list(reader_make_constant_shell(makeString("IntramuralHematoma-AscendingAorta"))), list(reader_make_constant_shell(makeString("LeakInEndograftStent-AscendingAorta"))), list(reader_make_constant_shell(makeString("PenetratingUlcer-AscendingAorta"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-AscendingAorta"))), list(reader_make_constant_shell(makeString("Thrombosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("Trauma-AscendingAorta"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheDescendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("Aneurysm-DescendingAorta")), list(reader_make_constant_shell(makeString("Aneurysm-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-DescendingAorta")), list(reader_make_constant_shell(makeString("SaccularAneurysm-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("Atherosclerosis-DescendingAorta")), list(reader_make_constant_shell(makeString("Atherosclerosis-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-DescendingAorta")), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("DescendingAorta-AbnormalConduit")), list(reader_make_constant_shell(makeString("DescendingThoracicAorta-AbnormalConduit")))), list(reader_make_constant_shell(makeString("DescendingAorta-NormalConduit")), list(reader_make_constant_shell(makeString("DescendingThoracicAorta-NormalConduit")))), list(reader_make_constant_shell(makeString("DescendingAortaAortitis")), list(reader_make_constant_shell(makeString("DescendingThoracicAortaAortitis")))), list(reader_make_constant_shell(makeString("DescendingAortaCoarctation")), list(reader_make_constant_shell(makeString("DescendingThoracicAortaCoarctation")))), list(reader_make_constant_shell(makeString("DescendingAortaThrombosis")), list(reader_make_constant_shell(makeString("DescendingThoracicAortaThrombosis")))), list(reader_make_constant_shell(makeString("Dilatation-DescendingAorta")), list(reader_make_constant_shell(makeString("Dilatation-DescendingThoracicAorta")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheDescendingThoracicAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("Aneurysm-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("Atherosclerosis-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("CysticMedialNecrosis-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("DescendingThoracicAorta-AbnormalConduit"))), list(reader_make_constant_shell(makeString("DescendingThoracicAorta-NormalConduit"))), list(reader_make_constant_shell(makeString("DescendingThoracicAortaAortitis"))), list(reader_make_constant_shell(makeString("DescendingThoracicAortaCoarctation"))), list(reader_make_constant_shell(makeString("DescendingThoracicAortaThrombosis"))), list(reader_make_constant_shell(makeString("Dilatation-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("Dissection-DescendingThoracicAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Bronchial"))), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Esophageal"))), list(reader_make_constant_shell(makeString("InfectionOrMycotic-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("IntramuralHematoma-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("PenetratingUlcer-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-ThoracicAorta"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("Trauma-DescendingThoracicAorta"))) }), list(reader_make_constant_shell(makeString("Dissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("Dissection-DescendingThoracicAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingAorta-Bronchial")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Bronchial")))), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingAorta-Esophageal")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Esophageal")))), list(reader_make_constant_shell(makeString("InfectionOrMycotic-DescendingAorta")), list(reader_make_constant_shell(makeString("InfectionOrMycotic-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("IntramuralHematoma-DescendingAorta")), list(reader_make_constant_shell(makeString("IntramuralHematoma-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("PenetratingUlcer-DescendingAorta")), list(reader_make_constant_shell(makeString("PenetratingUlcer-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("Trauma-DescendingAorta")), list(reader_make_constant_shell(makeString("Trauma-DescendingThoracicAorta")))) }), list(reader_make_constant_shell(makeString("DiseaseOfTheThoracicAbdominalAorta")), list(reader_make_constant_shell(makeString("Aneurysm-ThoracicAbdominalAorta")))), list(reader_make_constant_shell(makeString("DiseaseOfTheThoracicAorta")), list(reader_make_constant_shell(makeString("Aneurysm-ThoracicAorta")), list(reader_make_constant_shell(makeString("DissectingAneurysm-ThoracicAorta")), list(reader_make_constant_shell(makeString("DissectingAneurysm-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("Calcification-ThoracicAorta"))), list(reader_make_constant_shell(makeString("DiseaseOfTheThoracicAorta-NonAneurysmal"))), list(reader_make_constant_shell(makeString("Fibrosis-ThoracicAorta"))), list(reader_make_constant_shell(makeString("FistulaCondition-ThoracicAorta-Bronchial"))), list(reader_make_constant_shell(makeString("FistulaCondition-ThoracicAorta-Esophageal"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-ThoracicAorta")))), list(reader_make_constant_shell(makeString("Fibrosis-Aorta"))), list(reader_make_constant_shell(makeString("Thrombosis-Aorta"))) }), list(reader_make_constant_shell(makeString("EndocrineDisorder")), list(reader_make_constant_shell(makeString("DiabetesMellitus"))), list(reader_make_constant_shell(makeString("HashimotosThyroiditis"))), list(reader_make_constant_shell(makeString("Hyperthyroidism"))), list(reader_make_constant_shell(makeString("Hypothyroidism")))), list(reader_make_constant_shell(makeString("Enlarged-HeartChamberCondition"))), list(reader_make_constant_shell(makeString("Fibrosis-thickening")), list(reader_make_constant_shell(makeString("Fibrosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Fibrosis-Aorta"))), list(reader_make_constant_shell(makeString("Fibrosis-AortaArch"))), list(reader_make_constant_shell(makeString("Fibrosis-AorticRoot"))), list(reader_make_constant_shell(makeString("Fibrosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("Fibrosis-CardiacValve")), list(reader_make_constant_shell(makeString("Fibrosis-AorticValve"))), list(reader_make_constant_shell(makeString("Fibrosis-MitralValve"))), list(reader_make_constant_shell(makeString("Fibrosis-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Fibrosis-TricuspidValve")))), list(reader_make_constant_shell(makeString("Fibrosis-ThoracicAorta")))), list(reader_make_constant_shell(makeString("FistulaCondition")), list(reader_make_constant_shell(makeString("AortaFistula")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingAorta-Bronchial")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Bronchial")))), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingAorta-Esophageal")), list(reader_make_constant_shell(makeString("FistulaCondition-DescendingThoracicAorta-Esophageal")))), list(reader_make_constant_shell(makeString("FistulaCondition-ThoracicAorta-Bronchial"))), list(reader_make_constant_shell(makeString("FistulaCondition-ThoracicAorta-Esophageal")))), list(reader_make_constant_shell(makeString("AtrialVentricularFistula")), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToLeftAtrium"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToLeftVentricle"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToPulmonaryArtery"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToRightAtrium"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToUndeterminedLocation")))), list(reader_make_constant_shell(makeString("FistulaCondition-CoronaryArteriovenous"))), list(reader_make_constant_shell(makeString("FistulaCondition-CoronaryArteriovenousToRightVentricle"))), list(reader_make_constant_shell(makeString("PulmonaryAtrial-ventricularFistulaPulmonaryArtery-PulmonaryVein")))), list(reader_make_constant_shell(makeString("Giant-HeartChamberCondition"))), list(reader_make_constant_shell(makeString("HeartChamberCondition_small"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("HeartCondition")), list(reader_make_constant_shell(makeString("AcquiredHeartDisease")), list(reader_make_constant_shell(makeString("AcquiredValvularHeartDisease")), list(reader_make_constant_shell(makeString("AcquiredNonRheumaticValvularHeartDisease"))), list(reader_make_constant_shell(makeString("Endocarditis-Generic")), list(reader_make_constant_shell(makeString("Endocarditis-Morbidity")), list(reader_make_constant_shell(makeString("Endocarditis-CardiacValve")), list(reader_make_constant_shell(makeString("Endocarditis-AorticValve"))), list(reader_make_constant_shell(makeString("Endocarditis-MitralValve"))), list(reader_make_constant_shell(makeString("Endocarditis-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Endocarditis-TricuspidValve")))))), list(reader_make_constant_shell(makeString("Regurgitation-MitralValve")), list(reader_make_constant_shell(makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), list(reader_make_constant_shell(makeString("RheumaticHeartDisease"))))), list(reader_make_constant_shell(makeString("CardiacArrest"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CongenitalHeartDisease")), list(reader_make_constant_shell(makeString("AbsentPulmonaryArtery"))), list(reader_make_constant_shell(makeString("Aneurysm-diverticulum-MembranousSeptum-SpontaneousClosureOfIVSD"))), list(reader_make_constant_shell(makeString("AneurysmSinusValsalva"))), list(reader_make_constant_shell(makeString("AnomalousPulmonaryVenousReturn-Partial"))), list(reader_make_constant_shell(makeString("AnomalousPulmonaryVenousReturn-Total"))), list(reader_make_constant_shell(makeString("AnomalyOfSystemicDrainage-PersistentLeftSVC"))), list(reader_make_constant_shell(makeString("Aorta-rightVentricleCommunication"))), list(reader_make_constant_shell(makeString("AortopulmonaryWindow"))), list(reader_make_constant_shell(makeString("AspleniaSyndrome"))), list(reader_make_constant_shell(makeString("Atrial-ventricularCanalDefectComplete"))), list(reader_make_constant_shell(makeString("AtrialSeptalAnyeurysm-Congenital"))), list(reader_make_constant_shell(makeString("AtrialSeptalDefectPrimum"))), list(reader_make_constant_shell(makeString("AtrialSeptalDefectSecundum"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistula")), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToLeftAtrium"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToLeftVentricle"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToPulmonaryArtery"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToRightAtrium"))), list(reader_make_constant_shell(makeString("AtrialVentricularFistulaToUndeterminedLocation")))), list(reader_make_constant_shell(makeString("AtrioventricularMalformations"))), list(reader_make_constant_shell(makeString("CommonVentricleTypeAOrTypeC"))), list(reader_make_constant_shell(makeString("CongenitalCoronaryArteryAnomalyOtherOrMultipleCongenitalAnomalies"))), list(reader_make_constant_shell(makeString("CongenitalDoubleOrificeLeftSinus"))), list(reader_make_constant_shell(makeString("CongenitalDoubleOrificeRightSinus"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CoronaryAnomaly")), list(reader_make_constant_shell(makeString("CoronaryAnomalyFistulaEctopicOrigin"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-CircumflexFromLeftAndRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-CircumflexFromRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingAndCircumflexWithCommonOstium"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingFromRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftCircumflexArteryAbsent"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftCoronaryArteryFromRight"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftFromPulmonaryArtery"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-LeftMainTrunkAbsent"))), list(reader_make_constant_shell(makeString("CoronaryArteryAnomaly-RightFromLeft"))) }), list(reader_make_constant_shell(makeString("Criss-crossHeart"))), list(reader_make_constant_shell(makeString("Dextroversion"))), list(reader_make_constant_shell(makeString("DoubleChamberedRightVentricle"))), list(reader_make_constant_shell(makeString("DoubleOutletLeftVentricle"))), list(reader_make_constant_shell(makeString("DoubleOutletRightVentricle"))), list(reader_make_constant_shell(makeString("DoubleRightVentricle"))), list(reader_make_constant_shell(makeString("EbsteinAnomaly"))), list(reader_make_constant_shell(makeString("EndocardialFibroelastosis"))), list(reader_make_constant_shell(makeString("HypertrophicObstructiveCardiomyopathy-Congenital"))), list(reader_make_constant_shell(makeString("HypoplasticLeftHeartSyndrome"))), list(reader_make_constant_shell(makeString("HypoplasticRightHeartSyndrome"))), list(reader_make_constant_shell(makeString("IsolatedDextrocardia"))), list(reader_make_constant_shell(makeString("IsolatedLevocardiaNoSitusInversus"))), list(reader_make_constant_shell(makeString("MalpositionOfGreatVessels"))), list(reader_make_constant_shell(makeString("MalpositionOfTheHeart"))), list(reader_make_constant_shell(makeString("Mapca"))), list(reader_make_constant_shell(makeString("MultipleVentricularSeptalDefect"))), list(reader_make_constant_shell(makeString("PatentDuctusArteriosus"))), list(reader_make_constant_shell(makeString("PatentForamenOvale"))), list(reader_make_constant_shell(makeString("PolyspleniaSyndrome"))), list(reader_make_constant_shell(makeString("PulmonaryArteryStenosis"))), list(reader_make_constant_shell(makeString("PulmonaryAtrial-ventricularFistulaPulmonaryArtery-PulmonaryVein"))), list(reader_make_constant_shell(makeString("SeptalDefect-CommonAtrium"))), list(reader_make_constant_shell(makeString("SimpleDextrocardiaWithSitusInversus"))), list(reader_make_constant_shell(makeString("SinusVenosusAtrialSeptalDefect"))), list(reader_make_constant_shell(makeString("StorageDiseaseOfTheHeart"))), list(reader_make_constant_shell(makeString("SystemicVenousObstruction"))), list(reader_make_constant_shell(makeString("TetralogyOfFallot"))), list(reader_make_constant_shell(makeString("TetralogyOfFallotWithAbsentPulmonaryValve"))), list(reader_make_constant_shell(makeString("TranspositionGreatVessels-Dextro-transpositionOrLevo-transposition"))), list(reader_make_constant_shell(makeString("TranspositionGreatVesselsCorrected"))), list(reader_make_constant_shell(makeString("TruncusArteriosus"))), list(reader_make_constant_shell(makeString("VascularRing"))), list(reader_make_constant_shell(makeString("VentricularInversion"))), list(reader_make_constant_shell(makeString("VentricularSeptalDefect")), list(reader_make_constant_shell(makeString("VentricularSeptalDefect-Atrial-ventricularCanalType"))), list(reader_make_constant_shell(makeString("VentricularSeptalDefect-Membranous"))), list(reader_make_constant_shell(makeString("VentricularSeptalDefect-Muscular")))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("CoronaryAbnormality")), list(reader_make_constant_shell(makeString("CoronaryArteryAneurysm"))), list(reader_make_constant_shell(makeString("CoronaryArteryDilation"))), list(reader_make_constant_shell(makeString("CoronaryArteryEmbolus"))), list(reader_make_constant_shell(makeString("CoronaryArteryThrombosis"))), list(reader_make_constant_shell(makeString("Dissection-CoronaryArtery")), list(reader_make_constant_shell(makeString("AcuteDissection-CoronaryArtery")), list(reader_make_constant_shell(makeString("AcuteDissection-CoronaryArtery-Intraoperative")))), list(reader_make_constant_shell(makeString("ChronicDissection-CoronaryArtery")))), list(reader_make_constant_shell(makeString("MultipleCoronaryArteryAbnormalities"))), list(reader_make_constant_shell(makeString("MyocardialBridging"))), list(reader_make_constant_shell(makeString("OtherCoronaryArteryAbnormality"))) }), list(reader_make_constant_shell(makeString("HeartDisease-NonValvular")), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacArrhythmia")), list(reader_make_constant_shell(makeString("3rdDegreeAVBlock"))), list(reader_make_constant_shell(makeString("AcuteArrhythmia"))), list(reader_make_constant_shell(makeString("ArrhythmiaOrHeartBlockOrPacemakerInsertion"))), list(reader_make_constant_shell(makeString("AtrialArrhythmia")), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillation"))), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("AtrialTachycardia"))), list(reader_make_constant_shell(makeString("CardiacFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("EctopicHeartbeat"))), list(reader_make_constant_shell(makeString("PrematureAtrialComplex"))), list(reader_make_constant_shell(makeString("PrematureEctopicBeats"))), list(reader_make_constant_shell(makeString("WanderingPacemaker")))), list(reader_make_constant_shell(makeString("CardiacArrhythmia-Junctional")), list(reader_make_constant_shell(makeString("HeartRhythm_junctional_accelerated_junctional_rhythm"))), list(reader_make_constant_shell(makeString("HeartRhythm_junctional_junctional_escape_rhythm")))), list(reader_make_constant_shell(makeString("CardiacFibrillation")), list(reader_make_constant_shell(makeString("AtrialFibrillation")))), list(reader_make_constant_shell(makeString("CardiacSinusRhythm")), list(reader_make_constant_shell(makeString("Bradycardia")), list(reader_make_constant_shell(makeString("HeartBlock")), list(reader_make_constant_shell(makeString("AVBlock")), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithJunctionalEscape"))), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithVentricularEscape"))), list(reader_make_constant_shell(makeString("HeartBlock-FirstDegree"))), list(reader_make_constant_shell(makeString("HeartBlock-SecondDegree")), list(reader_make_constant_shell(makeString("HeartBlock-SecondDegree-Type1"))), list(reader_make_constant_shell(makeString("HeartBlock-SecondDegree-Type2")))), list(reader_make_constant_shell(makeString("ThirdDegreeAvBlock")))), list(reader_make_constant_shell(makeString("CompleteHeartBlock")), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithJunctionalEscape"))), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithVentricularEscape"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_complete_heart_block"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_complete_heart_block_with_junctional_escape"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_complete_heart_block_with_ventricular_escape")))), list(reader_make_constant_shell(makeString("HeartRhythm_heart_block_complete_heart_block"))))), list(reader_make_constant_shell(makeString("ParoxysmalTachycardia-Sinus"))), list(reader_make_constant_shell(makeString("SickSinusSyndrome"))), list(reader_make_constant_shell(makeString("SinusRhythm-Normal"))), list(reader_make_constant_shell(makeString("SinusTachycardia")))), list(reader_make_constant_shell(makeString("ChronicArrhythmia"))), list(reader_make_constant_shell(makeString("FibrillationFlutterTachycardiaOrHeartBlock")), list(reader_make_constant_shell(makeString("FibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillation"))), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal")))))), list(reader_make_constant_shell(makeString("Tachycardia")), list(reader_make_constant_shell(makeString("ParoxysmalTachycardia-Sinus"))), list(reader_make_constant_shell(makeString("SinusTachycardia"))), list(reader_make_constant_shell(makeString("SupraventricularTachycardia")), list(reader_make_constant_shell(makeString("AtrialTachycardia")))), list(reader_make_constant_shell(makeString("VentricularTachycardia"))))), list(reader_make_constant_shell(makeString("HeartBlock-NotComplete"))), list(reader_make_constant_shell(makeString("Paced-HeartRhythm")), list(reader_make_constant_shell(makeString("Atrial-ventricular-PacedHeartRhythm"))), list(reader_make_constant_shell(makeString("AtrialPacedRhythm"))), list(reader_make_constant_shell(makeString("AtriallyPacedHeartRhythm"))), list(reader_make_constant_shell(makeString("VentricularlyPacedHeartRhythm")))), list(reader_make_constant_shell(makeString("PermanentCardiacArrhythmia"))), list(reader_make_constant_shell(makeString("PrematureVentricularContraction"))), list(reader_make_constant_shell(makeString("VentricularArrhythmia")), list(reader_make_constant_shell(makeString("PrematureVentricularComplex"))), list(reader_make_constant_shell(makeString("VentricularTachycardiaOrFibrillation")), list(reader_make_constant_shell(makeString("VentricularFibrillation"))), list(reader_make_constant_shell(makeString("VentricularTachycardia"))))) }), list(reader_make_constant_shell(makeString("Cardiomyopathy")), list(reader_make_constant_shell(makeString("HypertrophicCardiomyopathy")), list(reader_make_constant_shell(makeString("HypertrophicCardiomyopathy-Obstructiveness-NOS"))), list(reader_make_constant_shell(makeString("HypertrophicObstructiveCardiomyopathy")), list(reader_make_constant_shell(makeString("HypertrophicObstructiveCardiomyopathy-Congenital")))), list(reader_make_constant_shell(makeString("Non-obstructiveHypertrophicCardiomyopathy")))), list(reader_make_constant_shell(makeString("IschemicCardiomyopathy"))), list(reader_make_constant_shell(makeString("RestrictiveCardiomyopathyAmyloid")))), list(reader_make_constant_shell(makeString("Pericarditis")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("HeartDisease-Other")), list(reader_make_constant_shell(makeString("CardiacEnlargement"))), list(reader_make_constant_shell(makeString("CardiacEnlargement-Questionable"))), list(reader_make_constant_shell(makeString("CardiogenicShock"))), list(reader_make_constant_shell(makeString("Cardiomyopathy")), list(reader_make_constant_shell(makeString("HypertrophicCardiomyopathy")), list(reader_make_constant_shell(makeString("HypertrophicCardiomyopathy-Obstructiveness-NOS"))), list(reader_make_constant_shell(makeString("HypertrophicObstructiveCardiomyopathy")), list(reader_make_constant_shell(makeString("HypertrophicObstructiveCardiomyopathy-Congenital")))), list(reader_make_constant_shell(makeString("Non-obstructiveHypertrophicCardiomyopathy")))), list(reader_make_constant_shell(makeString("IschemicCardiomyopathy"))), list(reader_make_constant_shell(makeString("RestrictiveCardiomyopathyAmyloid")))), list(reader_make_constant_shell(makeString("CongestiveHeartFailure"))), list(reader_make_constant_shell(makeString("DrugInducedToxicity"))), list(reader_make_constant_shell(makeString("HeartCondition-TumorOrMass"))), list(reader_make_constant_shell(makeString("HeartDisease-Other-NonTumorNonMyocarditis"))), list(reader_make_constant_shell(makeString("HeartDisease-Other-OtherNonCardiacEnlargement"))), list(reader_make_constant_shell(makeString("HeartDisease-OtherOther"))), list(reader_make_constant_shell(makeString("HypertensiveHeartDisease"))), list(reader_make_constant_shell(makeString("IatrogenicInjury"))), list(reader_make_constant_shell(makeString("LeftVentricleAneurysm"))), list(reader_make_constant_shell(makeString("Myocarditis"))), list(reader_make_constant_shell(makeString("PericardialDisease")), list(reader_make_constant_shell(makeString("PericardialEffusion"))), list(reader_make_constant_shell(makeString("Pericarditis")))), list(reader_make_constant_shell(makeString("PrimaryMyocardialDisease"))), list(reader_make_constant_shell(makeString("RadiationInducedToxicity"))), list(reader_make_constant_shell(makeString("RheumaticHeartDisease"))), list(reader_make_constant_shell(makeString("RightVentricleAneurysm"))), list(reader_make_constant_shell(makeString("SeptalHypertrophyNonHOCM"))), list(reader_make_constant_shell(makeString("ToxicallyInducediatrogenic"))), list(reader_make_constant_shell(makeString("TraumaticHeartDisease"))), list(reader_make_constant_shell(makeString("VentricularSeptalAneurysm"))) }), list(reader_make_constant_shell(makeString("HeartFailure")), list(reader_make_constant_shell(makeString("CongestiveHeartFailure")))), list(reader_make_constant_shell(makeString("HeartValveRelatedProblem")), list(reader_make_constant_shell(makeString("AcquiredValvularHeartDisease")), list(reader_make_constant_shell(makeString("AcquiredNonRheumaticValvularHeartDisease"))), list(reader_make_constant_shell(makeString("Endocarditis-Generic")), list(reader_make_constant_shell(makeString("Endocarditis-Morbidity")), list(reader_make_constant_shell(makeString("Endocarditis-CardiacValve")), list(reader_make_constant_shell(makeString("Endocarditis-AorticValve"))), list(reader_make_constant_shell(makeString("Endocarditis-MitralValve"))), list(reader_make_constant_shell(makeString("Endocarditis-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Endocarditis-TricuspidValve")))))), list(reader_make_constant_shell(makeString("Regurgitation-MitralValve")), list(reader_make_constant_shell(makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), list(reader_make_constant_shell(makeString("RheumaticHeartDisease")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheAorticValve")), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-AorticValve"))), list(reader_make_constant_shell(makeString("AnnularCalcification-AorticValve"))), list(reader_make_constant_shell(makeString("AorticValveAbnormality-NotSpecified"))), list(reader_make_constant_shell(makeString("Atresia-AorticValve"))), list(reader_make_constant_shell(makeString("Calcification-AorticValve"))), list(reader_make_constant_shell(makeString("Endocarditis-AorticValve"))), list(reader_make_constant_shell(makeString("Fibrosis-AorticValve"))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-AorticValve"))), list(reader_make_constant_shell(makeString("Regurgitation-AorticValve"))), list(reader_make_constant_shell(makeString("RheumaticValveDisease-AorticValve"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheMitralValve")), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-MitralValve"))), list(reader_make_constant_shell(makeString("AnnularCalcification-MitralValve"))), list(reader_make_constant_shell(makeString("Atresia-MitralValve"))), list(reader_make_constant_shell(makeString("BallooningOrProlapsedCardiacValve-MitralValve"))), list(reader_make_constant_shell(makeString("Calcification-MitralValve"))), list(reader_make_constant_shell(makeString("Endocarditis-MitralValve"))), list(reader_make_constant_shell(makeString("Fibrosis-MitralValve"))), list(reader_make_constant_shell(makeString("MitralValveAbnormality-NotSpecified"))), list(reader_make_constant_shell(makeString("MyxomatousDegeneration-MitralValve"))), list(reader_make_constant_shell(makeString("PapillaryMuscleDysfunction-MitralValve"))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-MitralValve"))), list(reader_make_constant_shell(makeString("Regurgitation-MitralValve")), list(reader_make_constant_shell(makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), list(reader_make_constant_shell(makeString("RheumaticValveDisease-MitralValve"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfThePulmonaryValve")), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-PulmonaryValve"))), list(reader_make_constant_shell(makeString("AnnularCalcification-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Atresia-PulmonaryValve")), list(reader_make_constant_shell(makeString("AtresiaWithIntactSeptum-PulmonaryValve"))), list(reader_make_constant_shell(makeString("AtresiaWithVentricularSeptalDefect-PulmonaryValve")))), list(reader_make_constant_shell(makeString("Calcification-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Endocarditis-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Fibrosis-PulmonaryValve"))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-PulmonaryValve"))), list(reader_make_constant_shell(makeString("PulmonaryValveAbnormality-NotSpecified"))), list(reader_make_constant_shell(makeString("Regurgitation-PulmonaryValve"))), list(reader_make_constant_shell(makeString("RheumaticValveDisease-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Stenosis-PulmonaryValve"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("DiseaseOfTheTricuspidValve")), list(reader_make_constant_shell(makeString("AbnormalNumberOfCusps-TricuspidValve"))), list(reader_make_constant_shell(makeString("AnnularCalcification-TricuspidValve"))), list(reader_make_constant_shell(makeString("Atresia-TricuspidValve"))), list(reader_make_constant_shell(makeString("BallooningOrProlapsedCardiacValve-TricuspidValve"))), list(reader_make_constant_shell(makeString("Calcification-TricuspidValve"))), list(reader_make_constant_shell(makeString("Endocarditis-TricuspidValve"))), list(reader_make_constant_shell(makeString("Fibrosis-TricuspidValve"))), list(reader_make_constant_shell(makeString("MyxomatousDegeneration-TricuspidValve"))), list(reader_make_constant_shell(makeString("PapillaryMuscleDysfunction-TricuspidValve"))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-TricuspidValve"))), list(reader_make_constant_shell(makeString("Regurgitation-TricuspidValve"))), list(reader_make_constant_shell(makeString("RheumaticValveDisease-TricuspidValve"))), list(reader_make_constant_shell(makeString("Stenosis-TricuspidValve"))), list(reader_make_constant_shell(makeString("TricuspidValveAbnormality-NotSpecified"))) }), list(reader_make_constant_shell(makeString("HeartValveDysfunction")), list(reader_make_constant_shell(makeString("CardiacValveStenosis")), list(reader_make_constant_shell(makeString("Stenosis-AorticValve"))), list(reader_make_constant_shell(makeString("Stenosis-MitralValve"))), list(reader_make_constant_shell(makeString("Stenosis-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Stenosis-TricuspidValve"))))), list(reader_make_constant_shell(makeString("RheumaticValveDisease")), list(reader_make_constant_shell(makeString("RheumaticValveDisease-AorticValve"))), list(reader_make_constant_shell(makeString("RheumaticValveDisease-MitralValve"))), list(reader_make_constant_shell(makeString("RheumaticValveDisease-PulmonaryValve"))), list(reader_make_constant_shell(makeString("RheumaticValveDisease-TricuspidValve"))))), list(reader_make_constant_shell(makeString("IschemicHeartDisease")), list(reader_make_constant_shell(makeString("CoronaryArteryDisease-Ischemic"))), list(reader_make_constant_shell(makeString("In-stentStenosis"))), list(reader_make_constant_shell(makeString("PostInfarctVentricularSeptalDefect"))), list(reader_make_constant_shell(makeString("RightVentricularInfarction")))), list(reader_make_constant_shell(makeString("VentricularDisorder")), list(reader_make_constant_shell(makeString("LeftVentricularDisorder")), list(reader_make_constant_shell(makeString("LeftVentricleAneurysm")))), list(reader_make_constant_shell(makeString("RightVentricularDisorder")), list(reader_make_constant_shell(makeString("RightVentricleAneurysm")))), list(reader_make_constant_shell(makeString("VentricularAneurysm")), list(reader_make_constant_shell(makeString("LeftVentricleAneurysm"))), list(reader_make_constant_shell(makeString("RightVentricleAneurysm")))), list(reader_make_constant_shell(makeString("VentricularArrhythmia")), list(reader_make_constant_shell(makeString("PrematureVentricularComplex"))), list(reader_make_constant_shell(makeString("VentricularTachycardiaOrFibrillation")), list(reader_make_constant_shell(makeString("VentricularFibrillation"))), list(reader_make_constant_shell(makeString("VentricularTachycardia")))))) }), list(reader_make_constant_shell(makeString("HeartRhythm")), list(reader_make_constant_shell(makeString("HeartRhythm_atrial")), list(reader_make_constant_shell(makeString("AtrialArrhythmia")), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillation"))), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("AtrialTachycardia"))), list(reader_make_constant_shell(makeString("CardiacFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("EctopicHeartbeat"))), list(reader_make_constant_shell(makeString("PrematureAtrialComplex"))), list(reader_make_constant_shell(makeString("PrematureEctopicBeats"))), list(reader_make_constant_shell(makeString("WanderingPacemaker")))), list(reader_make_constant_shell(makeString("HeartRhythm_atrial_other"))), list(reader_make_constant_shell(makeString("HeartRhythm_atrial_supraventricular_tachycardia")))), list(reader_make_constant_shell(makeString("HeartRhythm_cardiac")), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacArrhythmia")), list(reader_make_constant_shell(makeString("3rdDegreeAVBlock"))), list(reader_make_constant_shell(makeString("AcuteArrhythmia"))), list(reader_make_constant_shell(makeString("ArrhythmiaOrHeartBlockOrPacemakerInsertion"))), list(reader_make_constant_shell(makeString("AtrialArrhythmia")), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillation"))), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("AtrialTachycardia"))), list(reader_make_constant_shell(makeString("CardiacFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal"))))), list(reader_make_constant_shell(makeString("EctopicHeartbeat"))), list(reader_make_constant_shell(makeString("PrematureAtrialComplex"))), list(reader_make_constant_shell(makeString("PrematureEctopicBeats"))), list(reader_make_constant_shell(makeString("WanderingPacemaker")))), list(reader_make_constant_shell(makeString("CardiacArrhythmia-Junctional")), list(reader_make_constant_shell(makeString("HeartRhythm_junctional_accelerated_junctional_rhythm"))), list(reader_make_constant_shell(makeString("HeartRhythm_junctional_junctional_escape_rhythm")))), list(reader_make_constant_shell(makeString("CardiacFibrillation")), list(reader_make_constant_shell(makeString("AtrialFibrillation")))), list(reader_make_constant_shell(makeString("CardiacSinusRhythm")), list(reader_make_constant_shell(makeString("Bradycardia")), list(reader_make_constant_shell(makeString("HeartBlock")), list(reader_make_constant_shell(makeString("AVBlock")), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithJunctionalEscape"))), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithVentricularEscape"))), list(reader_make_constant_shell(makeString("HeartBlock-FirstDegree"))), list(reader_make_constant_shell(makeString("HeartBlock-SecondDegree")), list(reader_make_constant_shell(makeString("HeartBlock-SecondDegree-Type1"))), list(reader_make_constant_shell(makeString("HeartBlock-SecondDegree-Type2")))), list(reader_make_constant_shell(makeString("ThirdDegreeAvBlock")))), list(reader_make_constant_shell(makeString("CompleteHeartBlock")), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithJunctionalEscape"))), list(reader_make_constant_shell(makeString("HeartBlock-CompleteWithVentricularEscape"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_complete_heart_block"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_complete_heart_block_with_junctional_escape"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_complete_heart_block_with_ventricular_escape")))), list(reader_make_constant_shell(makeString("HeartRhythm_heart_block_complete_heart_block"))))), list(reader_make_constant_shell(makeString("ParoxysmalTachycardia-Sinus"))), list(reader_make_constant_shell(makeString("SickSinusSyndrome"))), list(reader_make_constant_shell(makeString("SinusRhythm-Normal"))), list(reader_make_constant_shell(makeString("SinusTachycardia")))), list(reader_make_constant_shell(makeString("ChronicArrhythmia"))), list(reader_make_constant_shell(makeString("FibrillationFlutterTachycardiaOrHeartBlock")), list(reader_make_constant_shell(makeString("FibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutter")), list(reader_make_constant_shell(makeString("AtrialFibrillation"))), list(reader_make_constant_shell(makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), list(reader_make_constant_shell(makeString("AtrialFlutter")), list(reader_make_constant_shell(makeString("AtrialFlutter-Paroxysmal")))))), list(reader_make_constant_shell(makeString("Tachycardia")), list(reader_make_constant_shell(makeString("ParoxysmalTachycardia-Sinus"))), list(reader_make_constant_shell(makeString("SinusTachycardia"))), list(reader_make_constant_shell(makeString("SupraventricularTachycardia")), list(reader_make_constant_shell(makeString("AtrialTachycardia")))), list(reader_make_constant_shell(makeString("VentricularTachycardia"))))), list(reader_make_constant_shell(makeString("HeartBlock-NotComplete"))), list(reader_make_constant_shell(makeString("Paced-HeartRhythm")), list(reader_make_constant_shell(makeString("Atrial-ventricular-PacedHeartRhythm"))), list(reader_make_constant_shell(makeString("AtrialPacedRhythm"))), list(reader_make_constant_shell(makeString("AtriallyPacedHeartRhythm"))), list(reader_make_constant_shell(makeString("VentricularlyPacedHeartRhythm")))), list(reader_make_constant_shell(makeString("PermanentCardiacArrhythmia"))), list(reader_make_constant_shell(makeString("PrematureVentricularContraction"))), list(reader_make_constant_shell(makeString("VentricularArrhythmia")), list(reader_make_constant_shell(makeString("PrematureVentricularComplex"))), list(reader_make_constant_shell(makeString("VentricularTachycardiaOrFibrillation")), list(reader_make_constant_shell(makeString("VentricularFibrillation"))), list(reader_make_constant_shell(makeString("VentricularTachycardia"))))) })), list(reader_make_constant_shell(makeString("HeartRhythm_other_pulseless_electrical_activity"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular")), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_accelerated_idioventricular"))), list(reader_make_constant_shell(makeString("HeartRhythm_ventricular_ventricular_escape"))), list(reader_make_constant_shell(makeString("VentricularArrhythmia")), list(reader_make_constant_shell(makeString("PrematureVentricularComplex"))), list(reader_make_constant_shell(makeString("VentricularTachycardiaOrFibrillation")), list(reader_make_constant_shell(makeString("VentricularFibrillation"))), list(reader_make_constant_shell(makeString("VentricularTachycardia")))))), list(reader_make_constant_shell(makeString("OtherHeartRhythmType")), list(reader_make_constant_shell(makeString("Asystole"))), list(reader_make_constant_shell(makeString("IdioventricularHeartRhythm"))))), list(reader_make_constant_shell(makeString("HematologicDisorder")), list(reader_make_constant_shell(makeString("Anemia")), list(reader_make_constant_shell(makeString("HemolyticAnemia"))))), list(reader_make_constant_shell(makeString("Hernia")), list(reader_make_constant_shell(makeString("HiatalHernia")))), list(reader_make_constant_shell(makeString("InfectedEndocardialPacingLead"))), list(reader_make_constant_shell(makeString("InfectedEpicardialPacingLead"))), list(reader_make_constant_shell(makeString("Infection")), list(reader_make_constant_shell(makeString("InfectionOrMycotic")), list(reader_make_constant_shell(makeString("InfectionOrMycotic-AortaArch"))), list(reader_make_constant_shell(makeString("InfectionOrMycotic-AscendingAorta"))), list(reader_make_constant_shell(makeString("InfectionOrMycotic-DescendingAorta")), list(reader_make_constant_shell(makeString("InfectionOrMycotic-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("InflammationCondition")), list(reader_make_constant_shell(makeString("Myocarditis"))), list(reader_make_constant_shell(makeString("Pericarditis")))), list(reader_make_constant_shell(makeString("IntramuralHematoma")), list(reader_make_constant_shell(makeString("IntramuralHematoma-AortaArch"))), list(reader_make_constant_shell(makeString("IntramuralHematoma-AscendingAorta"))), list(reader_make_constant_shell(makeString("IntramuralHematoma-DescendingAorta")), list(reader_make_constant_shell(makeString("IntramuralHematoma-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("LeakInEndograftStent-AorticArch"))), list(reader_make_constant_shell(makeString("LeakInEndograftStent-DescendingAorta"))), list(reader_make_constant_shell(makeString("LifeThreateningCondition")), list(reader_make_constant_shell(makeString("Cancer"))), list(reader_make_constant_shell(makeString("DiabetesMellitus"))), list(reader_make_constant_shell(makeString("Hepatitis"))), list(reader_make_constant_shell(makeString("ImmediatelyLifeThreateningCondition")), list(reader_make_constant_shell(makeString("CardiacArrest"))), list(reader_make_constant_shell(makeString("Stroke-PhysiologicalCondition")), list(reader_make_constant_shell(makeString("StrokeDueToBleed"))), list(reader_make_constant_shell(makeString("StrokeDueToEmbolus")))))), list(reader_make_constant_shell(makeString("MyxomatousDegeneration")), list(reader_make_constant_shell(makeString("MyxomatousDegeneration-MitralValve"))), list(reader_make_constant_shell(makeString("MyxomatousDegeneration-TricuspidValve")))), list(reader_make_constant_shell(makeString("NeurologicalAilmentCondition")), list(reader_make_constant_shell(makeString("NeurologicalDisease")), list(reader_make_constant_shell(makeString("CerebrovascularNeurologicAttack")), list(reader_make_constant_shell(makeString("Stroke-PhysiologicalCondition")), list(reader_make_constant_shell(makeString("StrokeDueToBleed"))), list(reader_make_constant_shell(makeString("StrokeDueToEmbolus")))), list(reader_make_constant_shell(makeString("TIAOrRIND")), list(reader_make_constant_shell(makeString("ReversibleIschemicNeurologicDeficit"))), list(reader_make_constant_shell(makeString("TransientIschemicAttack"))))), list(reader_make_constant_shell(makeString("DementiaOrAlzheimersDisease"))), list(reader_make_constant_shell(makeString("OtherCentralNervousSystemDisease"))))), list(reader_make_constant_shell(makeString("Normal-Condition"))), list(reader_make_constant_shell(makeString("NormalAorticValve-Condition"))), list(reader_make_constant_shell(makeString("NormalEndograftStent-AorticArch"))), list(reader_make_constant_shell(makeString("NormalEndograftStent-AscendingAorta"))), list(reader_make_constant_shell(makeString("NormalEndograftStent-DescendingAorta"))), list(reader_make_constant_shell(makeString("NormalMitralValve-Condition"))), list(reader_make_constant_shell(makeString("NormalPulmonaryValve-Condition"))), list(reader_make_constant_shell(makeString("NormalTricuspidValve-Condition"))), list(reader_make_constant_shell(makeString("OtherDiagnosis"))), list(reader_make_constant_shell(makeString("OtherDisease")), list(reader_make_constant_shell(makeString("AcuteRheumaticFever"))), list(reader_make_constant_shell(makeString("CollagenDisease"))), list(reader_make_constant_shell(makeString("ConnectiveTissueDisease-Non-marfan"))), list(reader_make_constant_shell(makeString("Dyslipidemia"))), list(reader_make_constant_shell(makeString("Immunosupressed-Condition"))), list(reader_make_constant_shell(makeString("MarfansSyndrome"))), list(reader_make_constant_shell(makeString("Obesity")), list(reader_make_constant_shell(makeString("MorbidObesity"))))), list(reader_make_constant_shell(makeString("PapillaryMuscleDysfunction")), list(reader_make_constant_shell(makeString("PapillaryMuscleDysfunction-MitralValve"))), list(reader_make_constant_shell(makeString("PapillaryMuscleDysfunction-TricuspidValve")))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction")), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-AorticValve"))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-MitralValve"))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-PulmonaryValve"))), list(reader_make_constant_shell(makeString("ProstheticValveDysfunction-TricuspidValve")))), list(reader_make_constant_shell(makeString("Pseudoaneurysm")), list(reader_make_constant_shell(makeString("AorticPseudoaneurysm")), list(reader_make_constant_shell(makeString("Pseudoaneurysm-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-AortaArch"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-AscendingAorta"))), list(reader_make_constant_shell(makeString("Pseudoaneurysm-ThoracicAorta"))))), list(reader_make_constant_shell(makeString("Regurgitation-Circulatory")), list(reader_make_constant_shell(makeString("Regurgitation-CardiacValve")), list(reader_make_constant_shell(makeString("Regurgitation-AorticValve"))), list(reader_make_constant_shell(makeString("Regurgitation-MitralValve")), list(reader_make_constant_shell(makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), list(reader_make_constant_shell(makeString("Regurgitation-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Regurgitation-TricuspidValve"))))), list(reader_make_constant_shell(makeString("RenalDisease")), list(reader_make_constant_shell(makeString("RenalFailure")), list(reader_make_constant_shell(makeString("RenalFailureRequiringDialysis"))))), list(reader_make_constant_shell(makeString("RespiratoryAilment")), list(new SubLObject[]{ reader_make_constant_shell(makeString("LungDisease")), list(reader_make_constant_shell(makeString("ChronicLungDisease")), list(reader_make_constant_shell(makeString("ChronicLungDisease-Mild"))), list(reader_make_constant_shell(makeString("ChronicLungDisease-Moderate"))), list(reader_make_constant_shell(makeString("ChronicLungDisease-Severe"))), list(reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease")), list(reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease-Clinical"))), list(reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease-Pharmacologic"))))), list(reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest"))), list(reader_make_constant_shell(makeString("PulmonaryEmbolism"))), list(reader_make_constant_shell(makeString("PulmonaryHypertension"))), list(reader_make_constant_shell(makeString("PulmonaryHypertension-Clinical"))), list(reader_make_constant_shell(makeString("PulmonaryHypertension-Primary"))), list(reader_make_constant_shell(makeString("PulmonaryHypertension-Secondary"))), list(reader_make_constant_shell(makeString("PulmonaryHypertensionWithNoPaSystolicPressureReading"))), list(reader_make_constant_shell(makeString("PulmonaryHypertensionWithPaSystolicPressureGt35"))), list(reader_make_constant_shell(makeString("PulmonaryHypertensionWithRVSystolicPressureGt35"))) })), list(reader_make_constant_shell(makeString("SkinAilment")), list(reader_make_constant_shell(makeString("Scleroderma")))), list(reader_make_constant_shell(makeString("Stenosis-Condition")), list(reader_make_constant_shell(makeString("CardiacValveStenosis")), list(reader_make_constant_shell(makeString("Stenosis-AorticValve"))), list(reader_make_constant_shell(makeString("Stenosis-MitralValve"))), list(reader_make_constant_shell(makeString("Stenosis-PulmonaryValve"))), list(reader_make_constant_shell(makeString("Stenosis-TricuspidValve")))), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan20")), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan20LessThanOrEqualTo75"))), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan75")), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan79"))))), list(reader_make_constant_shell(makeString("PulmonaryArteryStenosis")))), list(reader_make_constant_shell(makeString("SuspectedDissectingAneurysm-AbdominalAorta"))), list(reader_make_constant_shell(makeString("SuspectedDissectingAneurysm-AortaArch"))), list(reader_make_constant_shell(makeString("SuspectedDissectingAneurysm-AorticRoot"))), list(reader_make_constant_shell(makeString("SuspectedDissectingAneurysm-AscendingAorta"))), list(reader_make_constant_shell(makeString("SuspectedDissectingAneurysm-ThoracicAorta"))), list(reader_make_constant_shell(makeString("Thrombosis")), list(reader_make_constant_shell(makeString("CoronaryArteryThrombosis"))), list(reader_make_constant_shell(makeString("DescendingAortaThrombosis")), list(reader_make_constant_shell(makeString("DescendingThoracicAortaThrombosis")))), list(reader_make_constant_shell(makeString("Thrombosis-AbdominalAorta"))), list(reader_make_constant_shell(makeString("Thrombosis-Aorta"))), list(reader_make_constant_shell(makeString("Thrombosis-AscendingAorta"))), list(reader_make_constant_shell(makeString("Trombosis-AortaArch")))), list(reader_make_constant_shell(makeString("Trauma")), list(reader_make_constant_shell(makeString("Trauma-AortaArch"))), list(reader_make_constant_shell(makeString("Trauma-AscendingAorta"))), list(reader_make_constant_shell(makeString("Trauma-DescendingAorta")), list(reader_make_constant_shell(makeString("Trauma-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("TumorCondition"))), list(reader_make_constant_shell(makeString("UlcerDisease")), list(reader_make_constant_shell(makeString("AorticUlcer")), list(reader_make_constant_shell(makeString("PenetratingUlcer-AortaArch"))), list(reader_make_constant_shell(makeString("PenetratingUlcer-AscendingAorta"))), list(reader_make_constant_shell(makeString("PenetratingUlcer-DescendingAorta")), list(reader_make_constant_shell(makeString("PenetratingUlcer-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("PenetratingUlcer")), list(reader_make_constant_shell(makeString("PenetratingUlcer-AortaArch"))), list(reader_make_constant_shell(makeString("PenetratingUlcer-AscendingAorta"))), list(reader_make_constant_shell(makeString("PenetratingUlcer-DescendingAorta")), list(reader_make_constant_shell(makeString("PenetratingUlcer-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("VascularDisorder")), list(reader_make_constant_shell(makeString("Aneurysm_Or_Dissection")), list(new SubLObject[]{ reader_make_constant_shell(makeString("Aneurysm")), list(reader_make_constant_shell(makeString("Aneurysm-AbdominalAorta")), list(reader_make_constant_shell(makeString("SaccularAneurysm-AbdominalAorta")))), list(reader_make_constant_shell(makeString("Aneurysm-AortaArch")), list(reader_make_constant_shell(makeString("DissectingAneurysm-AortaArch"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AortaArch")))), list(reader_make_constant_shell(makeString("Aneurysm-AorticRoot")), list(reader_make_constant_shell(makeString("DissectingAneurysm-AorticRoot"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AorticRoot")))), list(reader_make_constant_shell(makeString("Aneurysm-AscendingAorta")), list(reader_make_constant_shell(makeString("DissectingAneurysm-AscendingAorta"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AscendingAorta")))), list(reader_make_constant_shell(makeString("Aneurysm-DescendingAorta")), list(reader_make_constant_shell(makeString("Aneurysm-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-DescendingThoracicAorta"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-DescendingAorta")), list(reader_make_constant_shell(makeString("SaccularAneurysm-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("Aneurysm-ThoracicAbdominalAorta"))), list(reader_make_constant_shell(makeString("Aneurysm-ThoracicAorta")), list(reader_make_constant_shell(makeString("DissectingAneurysm-ThoracicAorta")), list(reader_make_constant_shell(makeString("DissectingAneurysm-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("AorticAneurysm")), list(reader_make_constant_shell(makeString("AortaUnspecifiedAneurysm")))), list(reader_make_constant_shell(makeString("AtrialSeptalAneurysm")), list(reader_make_constant_shell(makeString("AtrialSeptalAnyeurysm-Congenital")))), list(reader_make_constant_shell(makeString("CoronaryArteryAneurysm"))), list(reader_make_constant_shell(makeString("DissectingAneurysm")), list(reader_make_constant_shell(makeString("DissectingAneurysm-AbdominalAorta"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-AortaArch"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-AorticRoot"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-AscendingAorta"))), list(reader_make_constant_shell(makeString("DissectingAneurysm-ThoracicAorta")), list(reader_make_constant_shell(makeString("DissectingAneurysm-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("SaccularAneurysm")), list(reader_make_constant_shell(makeString("SaccularAneurysm-AbdominalAorta"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AortaArch"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AorticRoot"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-AscendingAorta"))), list(reader_make_constant_shell(makeString("SaccularAneurysm-DescendingAorta")), list(reader_make_constant_shell(makeString("SaccularAneurysm-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("VentricularAneurysm")), list(reader_make_constant_shell(makeString("LeftVentricleAneurysm"))), list(reader_make_constant_shell(makeString("RightVentricleAneurysm")))), list(reader_make_constant_shell(makeString("VentricularSeptalAneurysm"))) }), list(reader_make_constant_shell(makeString("AortaAneurysmOrDissection")), list(reader_make_constant_shell(makeString("AortaDissection")), list(reader_make_constant_shell(makeString("AcuteAorticDissection")), list(reader_make_constant_shell(makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("ChronicAortaDissection")), list(reader_make_constant_shell(makeString("ChronicDissection-AbdominalAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch"))), list(reader_make_constant_shell(makeString("ChronicDissection-AorticRoot"))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("Dissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch")))), list(reader_make_constant_shell(makeString("Dissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))))), list(reader_make_constant_shell(makeString("Dissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("Dissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("Dissection-DescendingThoracicAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("AorticAneurysm")), list(reader_make_constant_shell(makeString("AortaUnspecifiedAneurysm"))))), list(reader_make_constant_shell(makeString("Dissection")), list(reader_make_constant_shell(makeString("AcuteDissection")), list(reader_make_constant_shell(makeString("AcuteAorticDissection")), list(reader_make_constant_shell(makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative")))), list(reader_make_constant_shell(makeString("AcuteDissection-CoronaryArtery")), list(reader_make_constant_shell(makeString("AcuteDissection-CoronaryArtery-Intraoperative")))), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch"))), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta"))), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("AortaDissection")), list(reader_make_constant_shell(makeString("AcuteAorticDissection")), list(reader_make_constant_shell(makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("ChronicAortaDissection")), list(reader_make_constant_shell(makeString("ChronicDissection-AbdominalAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch"))), list(reader_make_constant_shell(makeString("ChronicDissection-AorticRoot"))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("Dissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteDissection-AortaArch")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AortaArch")))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch")))), list(reader_make_constant_shell(makeString("Dissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot")), list(reader_make_constant_shell(makeString("AcuteDissection-AorticRoot-Intraoperative"))))), list(reader_make_constant_shell(makeString("Dissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-AscendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta")))), list(reader_make_constant_shell(makeString("Dissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), list(reader_make_constant_shell(makeString("Dissection-DescendingThoracicAorta")), list(reader_make_constant_shell(makeString("AcuteDissection-DescendingThoracicAorta")))))), list(reader_make_constant_shell(makeString("ChronicDissection")), list(reader_make_constant_shell(makeString("ChronicAortaDissection")), list(reader_make_constant_shell(makeString("ChronicDissection-AbdominalAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-AortaArch"))), list(reader_make_constant_shell(makeString("ChronicDissection-AorticRoot"))), list(reader_make_constant_shell(makeString("ChronicDissection-AscendingAorta"))), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingAorta")), list(reader_make_constant_shell(makeString("ChronicDissection-DescendingThoracicAorta"))))), list(reader_make_constant_shell(makeString("ChronicDissection-CoronaryArtery")))))), list(reader_make_constant_shell(makeString("ArterioscleroticObliterans"))), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan20")), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan20LessThanOrEqualTo75"))), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan75")), list(reader_make_constant_shell(makeString("CarotidArteryStenosisGreaterThan79"))))), list(reader_make_constant_shell(makeString("Embolus-Systemic")), list(reader_make_constant_shell(makeString("CoronaryArteryEmbolus"))), list(reader_make_constant_shell(makeString("PulmonaryEmbolism")))), list(reader_make_constant_shell(makeString("PeripheralVascularDisease"))), list(reader_make_constant_shell(makeString("PulmonaryArteryStenosis")))), list(list(reader_make_constant_shell(makeString("DiseaseAfflictingPartFn")), reader_make_constant_shell(makeString("Liver"))), list(reader_make_constant_shell(makeString("HepaticFailure")), list(reader_make_constant_shell(makeString("DigestiveHepaticFailure")))), list(reader_make_constant_shell(makeString("Hepatitis")))) })))), list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Debridement-VascularProcedure"))), reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt")), reader_make_constant_shell(makeString("CCFMedicalResearch-Allotment"))), list(list(list(TWO_INTEGER), list(list(new SubLObject[]{ reader_make_constant_shell(makeString("SurgicalProcedure")), list(reader_make_constant_shell(makeString("Allograft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AnnulusEnlarging-ValvularProcedure"))), list(reader_make_constant_shell(makeString("AnteriorToAnteriorCardiacValveChordaeTransfer"))), list(reader_make_constant_shell(makeString("AnterolateralCommissuroplasty"))), list(reader_make_constant_shell(makeString("AnteroseptalCommisuroplasty"))), list(reader_make_constant_shell(makeString("AortaProcedureOrIABPProcedure-ExceptionSpecification")), list(reader_make_constant_shell(makeString("AortaProcedure-ExceptionSpecification"))), list(reader_make_constant_shell(makeString("Intra-aorticBalloonPumpRemovalOrInsertion-ExceptionSpecification")))), list(reader_make_constant_shell(makeString("AorticAneurysmRepair-STS"))), list(reader_make_constant_shell(makeString("Biopsy-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Biopsy-Lung-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-LymphNode-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Myocardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Pericardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Pleura-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ChestWallBiopsyOfBoneMarrow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VascularBiopsy-VascularProcedure")))), list(reader_make_constant_shell(makeString("BleedingControl-Chest-SurgicalProcedure")), list(reader_make_constant_shell(makeString("EvacuationOfHematoma-ChestCavity-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum")))), list(reader_make_constant_shell(makeString("CardiacOrThoracicAortaProcedure")), list(reader_make_constant_shell(makeString("CardiacProcedure-Expanded"))), list(reader_make_constant_shell(makeString("ThoracicAortaProcedure-STS")))), list(reader_make_constant_shell(makeString("CardiacOrThoracicAortaProcedure-NonExpanded")), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacProcedure-CCF")), list(reader_make_constant_shell(makeString("AssistDeviceProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_assist_device_revision"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("AtrialProcedure-Surgical")), list(reader_make_constant_shell(makeString("AtrialAppendageExclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip"))))), list(reader_make_constant_shell(makeString("AtrialEndarterectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialExcisionOfTumor-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialExcisionProcedure-Surgical"))), list(reader_make_constant_shell(makeString("AtrialFibrillationProcedure-Surgical")), list(reader_make_constant_shell(makeString("MazeProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryVeinIsolationProcedure-Surgical"))), list(reader_make_constant_shell(makeString("RadioFrequencyAblationProcedure-Surgical")), list(reader_make_constant_shell(makeString("BipolarRadiofrequencyAblation"))), list(reader_make_constant_shell(makeString("UnipolarRadiofrequencyAblation"))))), list(reader_make_constant_shell(makeString("AtrialPlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialRepairProcedure-Surgical"))), list(reader_make_constant_shell(makeString("AtrialSeptation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialSeptectomy-SurgicalProcedure")), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon")))), list(reader_make_constant_shell(makeString("AtrialThrombectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialWallDebridement-SurgicalProcedure"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacSeptumProcedure-Surgical")), list(reader_make_constant_shell(makeString("Debridement-AtrialOrVentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-PostInfarctIvsd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SeptalMyectomy")), list(reader_make_constant_shell(makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_septum_debridement"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_septum_repair_of_atrial_septum"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_septum_repair_of_post_infarct_ventricular_septal_defect"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("CongenitalHeartProcedure-Surgical")), list(reader_make_constant_shell(makeString("AVCanalCompleteCorrectionIncludesASDPatchRepair-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Aorta-aorticConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AorticAllograft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AorticValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ArterialSwitch-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortaToDescendingAortaGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortaToPulmonaryArteryShuntWaterson-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialSeptation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CongenitalSeptalDefectRepairSurgery")), list(reader_make_constant_shell(makeString("AtrialSeptalDefectRepairProcedure-Congenital")), list(reader_make_constant_shell(makeString("AtrialSeptalDefectSutureClosure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_atrial_septal_defect_patch_closure")))), list(reader_make_constant_shell(makeString("VentricularSeptalDefectRepairProcedure-Congenital")), list(reader_make_constant_shell(makeString("VsdPatchClosure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VsdSutureClosure-SurgicalProcedure"))))), list(reader_make_constant_shell(makeString("CorrectionAnomalousVenousReturn-TotalOrPartial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CreationOfAorto-pulmonaryWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CreationPericardialMonocuspValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DamusKayStanselProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DescendingAortaToPulmonaryArteryShuntPotts-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DivisionOfAorticArchOrRemoval-VascularRing-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EnlargementIasd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ExcisionCardiacDiverticulum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftSubclavianToDescendingAortaGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationAnomalousSystemicVeinsSuperiorVenaCava-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationOfCoronaryArteryOrFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationSystemicFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("MeeShuntMelbourne-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("NorwoodProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ObliterationOfAortoPulmonaryArteryCommunication"))), list(reader_make_constant_shell(makeString("PatchOrAngioplastyOfAortaForCoarctationOrInterrupt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ProstheticAorto-pulmonaryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ProstheticGraft-AortaToPulmonaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArterioplastyOrReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArteryAllograft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArteryBanding-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RadicalAtrialSeptectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RastelliProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Re-implantationOfCoronaryArteryToAorta-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ReconstructionOfCoronaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairCleftMitralValveLeaflet-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionAnd1ReanastomosisForCoarctationOrInterruption-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionDiscreteSubvalvularMuscle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionLeftVentricularMuscle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionOfLeftAtrialMembraneCortriatrium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionRightVentricleMuscle-Infundibulectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfBlalock-taussigShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfPottsShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfWatersonShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentriclePlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricularOutflowPatch-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SubaorticStenosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SuperiorVenaCavaToPulmonaryArterGlenn-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Supra-aorticStenosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalBandingOfPulmonaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_Da_Silva_valve_repair"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_Danielson_technique"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_aorta-aortic_conduit"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_atrial_re-direction_of_venous_flow_senning_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_complete_correction_of_atrioventricular_canal_defect"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_aorto-pulmonary_window"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_pulmonary_pericardial_monocusp_valve"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_enlargement_intra-atrial_septal_defect"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_intra-atrial_baffle_mustard_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_left_subclavian_or_aortic_arch_to_descending_aorta_graft"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_ligation_systemic_vessel_fistula"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_obliteration_or_ligation_of_patent_ductus_arteriosus"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_patch_or_angioplasty_for_coarctation_or_interruption_of_aorta"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_patent_foramen_ovale_closure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_prosthetic_aorto-pulmonary_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_re-implantation_of_native_coronary_artery_to_aorta"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_and_single_reanastomosis_for_aortic_coarctation_or_interruption"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_atrial_membrane_-_radical_atrial_septectomy"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_of_supra-aortic_stenosis"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_revision_of_blalock-taussig_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_subclavian_to_pulmonary_artery_shunt_blalock-taussig"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_ascending_aorta_to_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_descending_aorta_to_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_subclavian-pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_superior_vena_cava_-_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalShunting-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downAscendingAorta-pulmonaryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downDescendingAorta-pulmonaryArteryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downPulmonaryArteryBanding-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downSubclavian-pulmonaryArteryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downSuperiorVenaPulmonaryArteryShuntWaterson-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("TricuspidValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnifocalizationOfMapcas-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnroofingOfCoronaryOstium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularSeptation-SurgicalProcedure"))) }), list(reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("CABGWithBilateralITAGraft"))), list(reader_make_constant_shell(makeString("CABGWithMultipleGrafts"))), list(reader_make_constant_shell(makeString("CabgWithSingleITAGraft"))), list(reader_make_constant_shell(makeString("SingleGraftCAGB")))), list(reader_make_constant_shell(makeString("HeartTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), list(reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))))), list(new SubLObject[]{ reader_make_constant_shell(makeString("HeartVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("Aneurysmectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Myocardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Cardiomyoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Cryoablation-VentricularTissue-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Debridement-VentricularWall-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("FistulaRepairWithPatch-LeftVentricle-rightAtrium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("MyocorSplint-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PlacementOfAcornDevice-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Subendocardial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_batista_procedure_on_right_ventricle")))), list(reader_make_constant_shell(makeString("SkeletalMuscleCellDiacrinTransplant-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_debridement_of_ventricular_outflow_tract")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_debridement_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_excision_of_tumor"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_ventricular_wall"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_resection_of_subendocardium"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_stem_cell_injection"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("TransmyocardialRevascularization-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Tri-svr-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularPlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularRepair-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))), list(reader_make_constant_shell(makeString("Ventriculotomy-SurgicalProcedure"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("OtherCardiacProcedure-Surgical")), list(reader_make_constant_shell(makeString("AnnularReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiacExplorationOnly-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiacPartialAutotransplantation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiopulmonaryBypass-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EvacuationOfHematoma-PericardiumMediastinumDueToBleed-tamponade-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("NotCardiopulmonaryBypass-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialPatch-Non-congenital-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-CoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FibrousTrigone-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfHeartWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrDebridement-CoronaryOstium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Subendocardial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Revision-PulmonaryArteryAnastomosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_cardiac-thoracic_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_other"))), list(reader_make_constant_shell(makeString("ThrombectomyFromPacingLeads-wires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnspecifiedCardiac-thoracicProcedure-SurgicalProcedure"))) }), list(reader_make_constant_shell(makeString("OtherVascularCoronaryArteryProcedure-Surgical"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("PericardialProcedure-Surgical")), list(reader_make_constant_shell(makeString("BeckPoudrage-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Pericardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Excision-PericardialCyst-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pericardiectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pericardiocentesis-drainageOfPericardialEffusion-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrDebridement-Pericardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_pericardiocentesis"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("SurgicalProcedure_eps")), list(reader_make_constant_shell(makeString("DrainageOfPacemakerWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Explant-BiventricularPacerCrtIcd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Explant-Icd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ExplantICDWithSingleChamberOrDualChamberPacing-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ExplantOfEndocardialPacemakerLead"))), list(reader_make_constant_shell(makeString("ExplantOfEpicardialPacemakerLead"))), list(reader_make_constant_shell(makeString("ExplantOfImplantableCardioverterDefibrillatorPatch"))), list(reader_make_constant_shell(makeString("Implant-BiventricularPacerCrtIcd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Implant-Icd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOrExplant-Icd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOrExplant-PermanentPacemaker-SurgicalProcedure")), list(reader_make_constant_shell(makeString("ExplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("MappingAndAblationOfAccessoryPathways-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PacemakerInsertion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("Placement-PpmicdEndocardialLead-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PlacementEpicardialLeadsNotIncludingLeftVentricular-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PlacementOfRightAtrialEpicardialPacemakerLead"))), list(reader_make_constant_shell(makeString("PlacementOfRightVentricularEpicardialPacemakerLead"))), list(reader_make_constant_shell(makeString("RemovalOfEpicardialPacingWires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RemovalOfICDLeads-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RemovalOfTemporaryEpicardialPacingWires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfPpmicdLeads-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_endocardial_pacemaker_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_epicardial_pacemaker_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_generator"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_left_ventricular_epicardial_pacing_lead"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_permanent_pacemaker"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_temporary_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_epicardial_pacing_leads_not_including_left_ventricular"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_left_ventricular_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_permanent_endocardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_right_atrial_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_right_ventricular_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_revision_of_permanent_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_thrombectomy_from_pacing_leads"))) }), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_Vineberg-Sewell_implant"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_pulmonary"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_vena_cava"))) }), list(reader_make_constant_shell(makeString("ThoracicAortaProcedure-CSQR"))), list(reader_make_constant_shell(makeString("ThoracicAortaProcedure-Surgical")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacProcedure-Surgical")), list(reader_make_constant_shell(makeString("AbortedCardiacProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AssistDeviceProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_assist_device_revision"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("AtrialProcedure-Surgical")), list(reader_make_constant_shell(makeString("AtrialAppendageExclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip"))))), list(reader_make_constant_shell(makeString("AtrialEndarterectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialExcisionOfTumor-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialExcisionProcedure-Surgical"))), list(reader_make_constant_shell(makeString("AtrialFibrillationProcedure-Surgical")), list(reader_make_constant_shell(makeString("MazeProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryVeinIsolationProcedure-Surgical"))), list(reader_make_constant_shell(makeString("RadioFrequencyAblationProcedure-Surgical")), list(reader_make_constant_shell(makeString("BipolarRadiofrequencyAblation"))), list(reader_make_constant_shell(makeString("UnipolarRadiofrequencyAblation"))))), list(reader_make_constant_shell(makeString("AtrialPlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialRepairProcedure-Surgical"))), list(reader_make_constant_shell(makeString("AtrialSeptation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialSeptectomy-SurgicalProcedure")), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon")))), list(reader_make_constant_shell(makeString("AtrialThrombectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialWallDebridement-SurgicalProcedure"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("CardiacSeptumProcedure-Surgical")), list(reader_make_constant_shell(makeString("Debridement-AtrialOrVentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-PostInfarctIvsd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SeptalMyectomy")), list(reader_make_constant_shell(makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_septum_debridement"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_septum_repair_of_atrial_septum"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_septum_repair_of_post_infarct_ventricular_septal_defect"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("CongenitalHeartProcedure-Surgical")), list(reader_make_constant_shell(makeString("AVCanalCompleteCorrectionIncludesASDPatchRepair-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Aorta-aorticConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AorticAllograft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AorticValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ArterialSwitch-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortaToDescendingAortaGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortaToPulmonaryArteryShuntWaterson-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialSeptation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CongenitalSeptalDefectRepairSurgery")), list(reader_make_constant_shell(makeString("AtrialSeptalDefectRepairProcedure-Congenital")), list(reader_make_constant_shell(makeString("AtrialSeptalDefectSutureClosure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_atrial_septal_defect_patch_closure")))), list(reader_make_constant_shell(makeString("VentricularSeptalDefectRepairProcedure-Congenital")), list(reader_make_constant_shell(makeString("VsdPatchClosure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VsdSutureClosure-SurgicalProcedure"))))), list(reader_make_constant_shell(makeString("CorrectionAnomalousVenousReturn-TotalOrPartial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CreationOfAorto-pulmonaryWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CreationPericardialMonocuspValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DamusKayStanselProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DescendingAortaToPulmonaryArteryShuntPotts-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DivisionOfAorticArchOrRemoval-VascularRing-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EnlargementIasd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ExcisionCardiacDiverticulum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftSubclavianToDescendingAortaGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationAnomalousSystemicVeinsSuperiorVenaCava-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationOfCoronaryArteryOrFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationSystemicFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("MeeShuntMelbourne-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("NorwoodProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ObliterationOfAortoPulmonaryArteryCommunication"))), list(reader_make_constant_shell(makeString("PatchOrAngioplastyOfAortaForCoarctationOrInterrupt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ProstheticAorto-pulmonaryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ProstheticGraft-AortaToPulmonaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArterioplastyOrReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArteryAllograft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArteryBanding-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RadicalAtrialSeptectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RastelliProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Re-implantationOfCoronaryArteryToAorta-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ReconstructionOfCoronaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairCleftMitralValveLeaflet-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionAnd1ReanastomosisForCoarctationOrInterruption-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionDiscreteSubvalvularMuscle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionLeftVentricularMuscle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionOfLeftAtrialMembraneCortriatrium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionRightVentricleMuscle-Infundibulectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfBlalock-taussigShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfPottsShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfWatersonShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentriclePlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricularOutflowPatch-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SubaorticStenosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SuperiorVenaCavaToPulmonaryArterGlenn-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Supra-aorticStenosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalBandingOfPulmonaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_Da_Silva_valve_repair"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_Danielson_technique"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_aorta-aortic_conduit"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_atrial_re-direction_of_venous_flow_senning_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_complete_correction_of_atrioventricular_canal_defect"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_aorto-pulmonary_window"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_pulmonary_pericardial_monocusp_valve"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_enlargement_intra-atrial_septal_defect"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_intra-atrial_baffle_mustard_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_left_subclavian_or_aortic_arch_to_descending_aorta_graft"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_ligation_systemic_vessel_fistula"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_obliteration_or_ligation_of_patent_ductus_arteriosus"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_patch_or_angioplasty_for_coarctation_or_interruption_of_aorta"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_patent_foramen_ovale_closure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_prosthetic_aorto-pulmonary_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_re-implantation_of_native_coronary_artery_to_aorta"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_and_single_reanastomosis_for_aortic_coarctation_or_interruption"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_atrial_membrane_-_radical_atrial_septectomy"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_of_supra-aortic_stenosis"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_revision_of_blalock-taussig_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_subclavian_to_pulmonary_artery_shunt_blalock-taussig"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_ascending_aorta_to_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_descending_aorta_to_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_subclavian-pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_superior_vena_cava_-_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalShunting-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downAscendingAorta-pulmonaryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downDescendingAorta-pulmonaryArteryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downPulmonaryArteryBanding-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downSubclavian-pulmonaryArteryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downSuperiorVenaPulmonaryArteryShuntWaterson-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("TricuspidValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnifocalizationOfMapcas-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnroofingOfCoronaryOstium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularSeptation-SurgicalProcedure"))) }), list(reader_make_constant_shell(makeString("Cryoablation")), list(reader_make_constant_shell(makeString("Cryoablation-VentricularTissue-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("HeartTransplantProcedure-Surgical"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), list(reader_make_constant_shell(makeString("Anuloplasty")), list(reader_make_constant_shell(makeString("AnnuloplastyWithRing")), list(reader_make_constant_shell(makeString("CompleteAnnuloplastyWithRing")))), list(reader_make_constant_shell(makeString("Anuloplasty-WithoutRing-Complete"))), list(reader_make_constant_shell(makeString("Anuloplasty-WithoutRing-Incomplete")))), list(reader_make_constant_shell(makeString("Commissuroplasty")), list(reader_make_constant_shell(makeString("Antero-posteriorCommissuroplasty"))), list(reader_make_constant_shell(makeString("Commissuroplasty-AccordingToKay-bicuspidization"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Anteroposterior"))), list(reader_make_constant_shell(makeString("Commissuroplasty-CongenitalBiscupsid"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Left-anterior"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Posteroseptal"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Right-anterior")))), list(reader_make_constant_shell(makeString("HeartValveRepairReplacementOrExploration")), list(reader_make_constant_shell(makeString("Exploration-AorticValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Exploration-MitralValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Exploration-PulmonaryValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Exploration-TricuspidValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), list(reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))))), list(reader_make_constant_shell(makeString("Plication-ValvularProcedure")), list(reader_make_constant_shell(makeString("AtrialPlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Plication-BicuspidLeaflet"))), list(reader_make_constant_shell(makeString("RightVentriclePlication-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("Reconstruction-CardiacValveRepair")), list(reader_make_constant_shell(makeString("AnnularReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RootReconstruction")))), list(reader_make_constant_shell(makeString("Reorientation-CardiacValveRepair"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_aortic_valve_aborted_repair_attempt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_mitral_valve_aborted_repair_attempt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_pulmonary_valve_aborted_repair_attempt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_tricuspid_valve_aborted_repair_attempt"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_tricuspid_valvectomy"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("HeartVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("Aneurysmectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Myocardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Cardiomyoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Cryoablation-VentricularTissue-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Debridement-VentricularWall-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("FistulaRepairWithPatch-LeftVentricle-rightAtrium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("MyocorSplint-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PlacementOfAcornDevice-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Subendocardial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_batista_procedure_on_right_ventricle")))), list(reader_make_constant_shell(makeString("SkeletalMuscleCellDiacrinTransplant-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_debridement_of_ventricular_outflow_tract")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_debridement_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_excision_of_tumor"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_ventricular_wall"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_resection_of_subendocardium"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_stem_cell_injection"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("TransmyocardialRevascularization-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Tri-svr-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularPlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularRepair-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))), list(reader_make_constant_shell(makeString("Ventriculotomy-SurgicalProcedure"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("OtherCardiacProcedure-Surgical")), list(reader_make_constant_shell(makeString("AnnularReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiacExplorationOnly-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiacPartialAutotransplantation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiopulmonaryBypass-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EvacuationOfHematoma-PericardiumMediastinumDueToBleed-tamponade-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("NotCardiopulmonaryBypass-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialPatch-Non-congenital-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-CoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FibrousTrigone-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfHeartWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrDebridement-CoronaryOstium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Subendocardial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Revision-PulmonaryArteryAnastomosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_cardiac-thoracic_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_other"))), list(reader_make_constant_shell(makeString("ThrombectomyFromPacingLeads-wires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnspecifiedCardiac-thoracicProcedure-SurgicalProcedure"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("PericardialProcedure-Surgical")), list(reader_make_constant_shell(makeString("BeckPoudrage-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Pericardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Excision-PericardialCyst-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pericardiectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pericardiocentesis-drainageOfPericardialEffusion-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrDebridement-Pericardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_pericardiocentesis"))) }), list(reader_make_constant_shell(makeString("TBLOperativeValveProcedure"))), list(reader_make_constant_shell(makeString("Valvuloplasty-MedicalProcedure")), list(reader_make_constant_shell(makeString("AorticValvuloplasty-SurgicalProcedure"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("Commissurotomy")), list(reader_make_constant_shell(makeString("Commissurotomy-Anterolateral"))), list(reader_make_constant_shell(makeString("Commissurotomy-Anteroseptal"))), list(reader_make_constant_shell(makeString("Commissurotomy-Left-anterior"))), list(reader_make_constant_shell(makeString("Commissurotomy-Left-noncoronary"))), list(reader_make_constant_shell(makeString("Commissurotomy-Posteromedial"))), list(reader_make_constant_shell(makeString("Commissurotomy-Posteroseptal"))), list(reader_make_constant_shell(makeString("Commissurotomy-Right-anterior"))), list(reader_make_constant_shell(makeString("Commissurotomy-Right-noncoronary"))), list(reader_make_constant_shell(makeString("Commissurotomy-right-left"))) }), list(reader_make_constant_shell(makeString("CusaValvuloplasty"))), list(reader_make_constant_shell(makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("TricuspidValvuloplasty-SurgicalProcedure")))), list(list(reader_make_constant_shell(makeString("CollectionIntersectionFn")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("CardiacProcedure-Surgical")), reader_make_constant_shell(makeString("RoboticSurgery"))))) }), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_alfieir_leaflet_stitch_anterior-posterior"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_augmentation_with_pericardium"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_cone_repair"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_cut_of_leaflet_bridge"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_repair_with_homograft"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_replacement"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_separation_of_fused_structures"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_shorten"))), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_sling_repair"))), list(reader_make_constant_shell(makeString("CleftRepair"))), list(reader_make_constant_shell(makeString("ConduitRelated-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Aorta-aorticConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("BentallHemashieldValvedConduit-VascularProcedure"))), list(reader_make_constant_shell(makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ReplacementWithConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("Decalcification-ValvularProcedure"))), list(reader_make_constant_shell(makeString("DevegaProcedure"))), list(reader_make_constant_shell(makeString("EdgeToEdgeRepair"))), list(reader_make_constant_shell(makeString("Exclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("AtrialAppendageExclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip")))))), list(reader_make_constant_shell(makeString("Fenestration"))), list(reader_make_constant_shell(makeString("IsolatedCABGExclusion-NonExpandedGraph")), list(new SubLObject[]{ reader_make_constant_shell(makeString("CommonConcomitantExclusion-NonExpandedGraph")), list(reader_make_constant_shell(makeString("Aneurysmectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AorticAneurysmRepair-STSNonExpandedGraph"))), list(reader_make_constant_shell(makeString("AtrialFibrillationProcedure-Surgical")), list(reader_make_constant_shell(makeString("MazeProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryVeinIsolationProcedure-Surgical"))), list(reader_make_constant_shell(makeString("RadioFrequencyAblationProcedure-Surgical")), list(reader_make_constant_shell(makeString("BipolarRadiofrequencyAblation"))), list(reader_make_constant_shell(makeString("UnipolarRadiofrequencyAblation"))))), list(reader_make_constant_shell(makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("CongenitalHeartProcedure-Surgical")), list(reader_make_constant_shell(makeString("AVCanalCompleteCorrectionIncludesASDPatchRepair-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Aorta-aorticConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AorticAllograft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AorticValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ArterialSwitch-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortaToDescendingAortaGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortaToPulmonaryArteryShuntWaterson-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AscendingAortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("AtrialSeptation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CongenitalSeptalDefectRepairSurgery")), list(reader_make_constant_shell(makeString("AtrialSeptalDefectRepairProcedure-Congenital")), list(reader_make_constant_shell(makeString("AtrialSeptalDefectSutureClosure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_atrial_septal_defect_patch_closure")))), list(reader_make_constant_shell(makeString("VentricularSeptalDefectRepairProcedure-Congenital")), list(reader_make_constant_shell(makeString("VsdPatchClosure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VsdSutureClosure-SurgicalProcedure"))))), list(reader_make_constant_shell(makeString("CorrectionAnomalousVenousReturn-TotalOrPartial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CreationOfAorto-pulmonaryWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CreationPericardialMonocuspValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DamusKayStanselProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DescendingAortaToPulmonaryArteryShuntPotts-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DivisionOfAorticArchOrRemoval-VascularRing-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EnlargementIasd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ExcisionCardiacDiverticulum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftSubclavianToDescendingAortaGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationAnomalousSystemicVeinsSuperiorVenaCava-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationOfCoronaryArteryOrFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LigationSystemicFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("MeeShuntMelbourne-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("NorwoodProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ObliterationOfAortoPulmonaryArteryCommunication"))), list(reader_make_constant_shell(makeString("PatchOrAngioplastyOfAortaForCoarctationOrInterrupt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ProstheticAorto-pulmonaryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ProstheticGraft-AortaToPulmonaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArterioplastyOrReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArteryAllograft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryArteryBanding-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RadicalAtrialSeptectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RastelliProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Re-implantationOfCoronaryArteryToAorta-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ReconstructionOfCoronaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairCleftMitralValveLeaflet-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionAnd1ReanastomosisForCoarctationOrInterruption-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionDiscreteSubvalvularMuscle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionLeftVentricularMuscle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionOfLeftAtrialMembraneCortriatrium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionRightVentricleMuscle-Infundibulectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfBlalock-taussigShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfPottsShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfWatersonShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentriclePlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricularOutflowPatch-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SubaorticStenosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SuperiorVenaCavaToPulmonaryArterGlenn-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Supra-aorticStenosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalBandingOfPulmonaryArtery-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_Da_Silva_valve_repair"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_Danielson_technique"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_aorta-aortic_conduit"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_atrial_re-direction_of_venous_flow_senning_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_complete_correction_of_atrioventricular_canal_defect"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_aorto-pulmonary_window"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_pulmonary_pericardial_monocusp_valve"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_enlargement_intra-atrial_septal_defect"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_intra-atrial_baffle_mustard_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_left_subclavian_or_aortic_arch_to_descending_aorta_graft"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_ligation_systemic_vessel_fistula"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_obliteration_or_ligation_of_patent_ductus_arteriosus"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_patch_or_angioplasty_for_coarctation_or_interruption_of_aorta"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_patent_foramen_ovale_closure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_prosthetic_aorto-pulmonary_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_re-implantation_of_native_coronary_artery_to_aorta"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_and_single_reanastomosis_for_aortic_coarctation_or_interruption"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_atrial_membrane_-_radical_atrial_septectomy"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_resection_of_supra-aortic_stenosis"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_revision_of_blalock-taussig_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_subclavian_to_pulmonary_artery_shunt_blalock-taussig"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_ascending_aorta_to_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_descending_aorta_to_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_subclavian-pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_take_down_superior_vena_cava_-_pulmonary_artery_shunt"))), list(reader_make_constant_shell(makeString("SurgicalShunting-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downAscendingAorta-pulmonaryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downDescendingAorta-pulmonaryArteryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downPulmonaryArteryBanding-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downSubclavian-pulmonaryArteryShunt-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Take-downSuperiorVenaPulmonaryArteryShuntWaterson-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("TricuspidValvuloplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnifocalizationOfMapcas-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnroofingOfCoronaryOstium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularSeptation-SurgicalProcedure"))) }), list(reader_make_constant_shell(makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("HeartTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherNonCardiacProcedure-STSNonExpandedGraph")), list(reader_make_constant_shell(makeString("OtherNonCardiacOther-STSNonExpandedGraph")), list(reader_make_constant_shell(makeString("KidneyTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("LiverTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("OtherNoncardiothoracicProcedure-Surgical")), list(reader_make_constant_shell(makeString("Resection-KommerellsDiverticulum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_noncardiothoracic_other"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_noncardiothoracic_repair_of_leg_wound")))), list(reader_make_constant_shell(makeString("PancreasTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_abdominal_drainage_of_ascites")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("OtherNonCardiacOtherThoracic-STSNonExpandedGraph")), list(reader_make_constant_shell(makeString("Decortication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DiaphragmProcedure-Surgical")), list(reader_make_constant_shell(makeString("Repair-DiaphragmaticHernia-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_diaphragm_excision_of_diaphragm")))), list(reader_make_constant_shell(makeString("LungTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("MediastinumNeckThymectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pleurodesis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryProcedure-Surgical")), list(reader_make_constant_shell(makeString("Biopsy-Lung-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Excision-LungBulla-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialPatchToLungs-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryEmbolectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Lung-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_pulmonary_valvectomy")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_chest_open"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_excision_of_tumor-mass_in_thoracic_cavity"))) }), list(reader_make_constant_shell(makeString("OtherVascularProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_pulmonary"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_vena_cava"))))), list(reader_make_constant_shell(makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pericardiectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfHeartWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_septum_repair_of_post_infarct_ventricular_septal_defect"))), list(reader_make_constant_shell(makeString("TransmyocardialRevascularization-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Tri-svr-SurgicalProcedure"))) }), list(reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), list(reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))))), list(reader_make_constant_shell(makeString("IsolatedCABGProcedure-NonExpandedGraph"))), list(reader_make_constant_shell(makeString("LeafletPatching"))), list(reader_make_constant_shell(makeString("Left-RightCommissuroplasty"))), list(reader_make_constant_shell(makeString("MycorAnuloplastySystemPlacement"))), list(reader_make_constant_shell(makeString("Myectomy")), list(reader_make_constant_shell(makeString("SeptalMyectomy")), list(reader_make_constant_shell(makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))))), list(reader_make_constant_shell(makeString("Non-coronary-LeftCommissuroplasty"))), list(reader_make_constant_shell(makeString("NoncardiacProcedure-NonExpanded"))), list(reader_make_constant_shell(makeString("PartialResection"))), list(reader_make_constant_shell(makeString("PericardialPatch")), list(reader_make_constant_shell(makeString("PericardialPatch-Non-congenital-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("PlacementOfArtificialChordae"))), list(reader_make_constant_shell(makeString("PlacementOfSubannularSuturesInTheLvot"))), list(reader_make_constant_shell(makeString("PosteromedialCommissuroplasty"))), list(reader_make_constant_shell(makeString("PrimaryProcedure"))), list(reader_make_constant_shell(makeString("ProcedurePerformedDuringReop"))), list(reader_make_constant_shell(makeString("ProstheticValveRingRemoval"))), list(reader_make_constant_shell(makeString("RedoProcedure"))), list(reader_make_constant_shell(makeString("Reimplantation"))), list(reader_make_constant_shell(makeString("Remodeling-5"))), list(reader_make_constant_shell(makeString("RemovalOfPreviousAlfieriStitch"))), list(reader_make_constant_shell(makeString("ResectionOfStenosis"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("ResectionProcedure-Surgical")), list(reader_make_constant_shell(makeString("CardiacValveRepairProcedure_resection_of_retained_leaflet"))), list(reader_make_constant_shell(makeString("CompleteResection"))), list(reader_make_constant_shell(makeString("Resection-CardiacValve"))), list(reader_make_constant_shell(makeString("Resection-KommerellsDiverticulum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Lung-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Subendocardial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ResectionOfPannus"))) }), list(reader_make_constant_shell(makeString("Resuspension"))), list(reader_make_constant_shell(makeString("ResuturingPre-existingRing"))), list(reader_make_constant_shell(makeString("Right-Non-coronaryCommissuroplasty"))), list(reader_make_constant_shell(makeString("Shaving-ValvularProcedure"))), list(reader_make_constant_shell(makeString("SlidingRepair"))), list(reader_make_constant_shell(makeString("SurgicalCardiacAssistDeviceInsertion")), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion")))), list(reader_make_constant_shell(makeString("SurgicalCardiacAssistDeviceRemoval")), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), list(reader_make_constant_shell(makeString("SurgicalProcedure-Abdominal")), list(reader_make_constant_shell(makeString("Nephrectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-Ventral-incisionalHernia-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfSpleen-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Splenectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_abdominal_drainage_of_ascites")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("SurgicalProcedureNonCongenital")), list(reader_make_constant_shell(makeString("AirwayProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_airway_resection_of_bronchus"))), list(reader_make_constant_shell(makeString("Tracheostomy-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("AorticProcedure-Surgical")), list(reader_make_constant_shell(makeString("AbdominalAortaProcedure-Surgical"))), list(reader_make_constant_shell(makeString("Aortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("BentallHemashieldValvedConduit-VascularProcedure"))), list(reader_make_constant_shell(makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ThoracicAortaProcedure-Surgical")))), list(reader_make_constant_shell(makeString("ArterioscleroticPlaqueRemoval-Procedure")), list(reader_make_constant_shell(makeString("Endarterectomy-SurgicalProcedure")), list(reader_make_constant_shell(makeString("AtrialEndarterectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EndarterectomyLaser-SurgicalProcedure"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("Endarterectomy-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("CommonCarotidArtery")))))), list(reader_make_constant_shell(makeString("AssistDeviceProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_assist_device_revision"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), list(reader_make_constant_shell(makeString("AtrialExcisionProcedure-Surgical"))), list(reader_make_constant_shell(makeString("AtrialFibrillationProcedure-Surgical")), list(reader_make_constant_shell(makeString("MazeProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryVeinIsolationProcedure-Surgical"))), list(reader_make_constant_shell(makeString("RadioFrequencyAblationProcedure-Surgical")), list(reader_make_constant_shell(makeString("BipolarRadiofrequencyAblation"))), list(reader_make_constant_shell(makeString("UnipolarRadiofrequencyAblation"))))), list(reader_make_constant_shell(makeString("AtrialWallDebridement-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("BalloonDilatation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("BypassGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("BypassGraftWithSaphenousVein-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("CABGWithBilateralITAGraft"))), list(reader_make_constant_shell(makeString("CABGWithMultipleGrafts"))), list(reader_make_constant_shell(makeString("CabgWithSingleITAGraft"))), list(reader_make_constant_shell(makeString("SingleGraftCAGB"))))), list(reader_make_constant_shell(makeString("BypassGraftWithHemashield-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CabrolFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ChestWallProcedure-Surgical")), list(reader_make_constant_shell(makeString("ChestWallBiopsyOfBoneMarrow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Debridement-RewireOfSternum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairLungOrChestWall-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SternalFractureRepair-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_chest_wall_pectus_repair"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_chest_wall_repair_of_lung-chest_wall")))), list(reader_make_constant_shell(makeString("CongenitalIntervention-MedicalProcedure"))), list(reader_make_constant_shell(makeString("CoronaryArteryProcedureNonCongenital-Surgical")), list(reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("CABGWithBilateralITAGraft"))), list(reader_make_constant_shell(makeString("CABGWithMultipleGrafts"))), list(reader_make_constant_shell(makeString("CabgWithSingleITAGraft"))), list(reader_make_constant_shell(makeString("SingleGraftCAGB")))), list(reader_make_constant_shell(makeString("OtherVascularCoronaryArteryProcedure-Surgical"))), list(list(reader_make_constant_shell(makeString("CollectionDifferenceFn")), reader_make_constant_shell(makeString("CoronaryArteryProcedureNonCongenital-Surgical")), reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))))), list(reader_make_constant_shell(makeString("CoronaryLaserProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Cryoablation")), list(reader_make_constant_shell(makeString("Cryoablation-VentricularTissue-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("Debridement-AtrialOrVentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Debridement-VascularProcedure")), list(reader_make_constant_shell(makeString("ProstheticValveDebridement")))), list(reader_make_constant_shell(makeString("DiaphragmProcedure-Surgical")), list(reader_make_constant_shell(makeString("Repair-DiaphragmaticHernia-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_diaphragm_excision_of_diaphragm")))), list(reader_make_constant_shell(makeString("EndovascularProcedure-SurgicalProcedure")), list(reader_make_constant_shell(makeString("EndovascularStentProcedure-Surgical")), list(reader_make_constant_shell(makeString("EndovascularStentGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Debranching_with_endovascular_stent_graft"))), list(reader_make_constant_shell(makeString("EndovascularStentGraftPlacementAfterLeak-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VascularProcedureName_endovascular_stent_graft_antegrade"))), list(reader_make_constant_shell(makeString("VascularProcedureName_endovascular_stent_graft_retrograde")))))), list(reader_make_constant_shell(makeString("EsophagogastricProcedure-Surgical")), list(reader_make_constant_shell(makeString("GiUnspecified-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_esophagogastric_control_bleeding")))), list(reader_make_constant_shell(makeString("Excision-Aneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Exploration-SurgicalProcedure"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), list(reader_make_constant_shell(makeString("Anuloplasty")), list(reader_make_constant_shell(makeString("AnnuloplastyWithRing")), list(reader_make_constant_shell(makeString("CompleteAnnuloplastyWithRing")))), list(reader_make_constant_shell(makeString("Anuloplasty-WithoutRing-Complete"))), list(reader_make_constant_shell(makeString("Anuloplasty-WithoutRing-Incomplete")))), list(reader_make_constant_shell(makeString("Commissuroplasty")), list(reader_make_constant_shell(makeString("Antero-posteriorCommissuroplasty"))), list(reader_make_constant_shell(makeString("Commissuroplasty-AccordingToKay-bicuspidization"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Anteroposterior"))), list(reader_make_constant_shell(makeString("Commissuroplasty-CongenitalBiscupsid"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Left-anterior"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Posteroseptal"))), list(reader_make_constant_shell(makeString("Commissuroplasty-Right-anterior")))), list(reader_make_constant_shell(makeString("HeartValveRepairReplacementOrExploration")), list(reader_make_constant_shell(makeString("Exploration-AorticValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Exploration-MitralValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Exploration-PulmonaryValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Exploration-TricuspidValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), list(reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))))), list(reader_make_constant_shell(makeString("Plication-ValvularProcedure")), list(reader_make_constant_shell(makeString("AtrialPlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Plication-BicuspidLeaflet"))), list(reader_make_constant_shell(makeString("RightVentriclePlication-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("Reconstruction-CardiacValveRepair")), list(reader_make_constant_shell(makeString("AnnularReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RootReconstruction")))), list(reader_make_constant_shell(makeString("Reorientation-CardiacValveRepair"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_aortic_valve_aborted_repair_attempt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_mitral_valve_aborted_repair_attempt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_pulmonary_valve_aborted_repair_attempt"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_tricuspid_valve_aborted_repair_attempt"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveProcedure-Surgical")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_tricuspid_valvectomy"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepairOrReplacement")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve")))))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("HeartVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("Aneurysmectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Myocardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Cardiomyoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Cryoablation-VentricularTissue-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Debridement-VentricularWall-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("FistulaRepairWithPatch-LeftVentricle-rightAtrium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("MyocorSplint-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PlacementOfAcornDevice-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Subendocardial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RightVentricleProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_batista_procedure_on_right_ventricle")))), list(reader_make_constant_shell(makeString("SkeletalMuscleCellDiacrinTransplant-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_debridement_of_ventricular_outflow_tract")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_debridement_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_excision_of_tumor"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_ventricular_wall"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_resection_of_subendocardium"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_stem_cell_injection"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), list(reader_make_constant_shell(makeString("TransmyocardialRevascularization-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Tri-svr-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularPlication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VentricularRepair-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))), list(reader_make_constant_shell(makeString("Ventriculotomy-SurgicalProcedure"))) }), list(reader_make_constant_shell(makeString("LeftAtrialAppendageProcedure-Surgical")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip"))))), list(reader_make_constant_shell(makeString("MediastinumOrNeckProcedure-Surgical")), list(reader_make_constant_shell(makeString("Biopsy-LymphNode-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EvacuationOfHematoma-ChestCavity-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EvacuationOfHematoma-Subclavicular-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("MediastinumNeckThymectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PatchPlacement-Mediastinum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_mediastinum-neck_evacuation_of_hematoma_in_subclavicular")))), list(reader_make_constant_shell(makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Nephrectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Omentopexy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherNoncardiothoracicProcedure-Surgical")), list(reader_make_constant_shell(makeString("Resection-KommerellsDiverticulum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_noncardiothoracic_other"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_noncardiothoracic_repair_of_leg_wound")))), list(reader_make_constant_shell(makeString("OtherSurgicalProcedure")), list(reader_make_constant_shell(makeString("ControlBleeding-SurgicalProcedure"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("OtherCardiacProcedure-Surgical")), list(reader_make_constant_shell(makeString("AnnularReconstruction-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiacExplorationOnly-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiacPartialAutotransplantation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CardiopulmonaryBypass-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EvacuationOfHematoma-PericardiumMediastinumDueToBleed-tamponade-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("NotCardiopulmonaryBypass-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialPatch-Non-congenital-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-CoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FibrousTrigone-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfHeartWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrDebridement-CoronaryOstium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Subendocardial-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Revision-PulmonaryArteryAnastomosis-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_cardiac-thoracic_procedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_other"))), list(reader_make_constant_shell(makeString("ThrombectomyFromPacingLeads-wires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("UnspecifiedCardiac-thoracicProcedure-SurgicalProcedure"))) })), list(reader_make_constant_shell(makeString("OtherVascularProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_pulmonary"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_vena_cava")))), list(reader_make_constant_shell(makeString("Oversewing"))), list(reader_make_constant_shell(makeString("PatchGraft-SaphenousVein-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PatchGraft-SurgicalProcedure"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("PericardialProcedure-Surgical")), list(reader_make_constant_shell(makeString("BeckPoudrage-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Biopsy-Pericardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Excision-PericardialCyst-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialWindow-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pericardiectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Pericardiocentesis-drainageOfPericardialEffusion-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrDebridement-Pericardium-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_pericardium_pericardiocentesis"))) }), list(reader_make_constant_shell(makeString("PleuraProcedure-Surgical")), list(reader_make_constant_shell(makeString("Biopsy-Pleura-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Decortication-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherPleuraProcedure-Surgical"))), list(reader_make_constant_shell(makeString("Pleurodesis-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("PulmonaryProcedure-Surgical")), list(reader_make_constant_shell(makeString("Biopsy-Lung-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Excision-LungBulla-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PericardialPatchToLungs-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PulmonaryEmbolectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Resection-Lung-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_cardiac_valve_pulmonary_valvectomy")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("RepairProcedure-Surgical")), list(reader_make_constant_shell(makeString("AtrialRepairProcedure-Surgical"))), list(reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(reader_make_constant_shell(makeString("HerniaRepairProcedure-Surgical")), list(reader_make_constant_shell(makeString("Repair-DiaphragmaticHernia-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-Ventral-incisionalHernia-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ThoracicHerniaRepair-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("NonHerniaRepairThoracic-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-CoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FibrousTrigone-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-PostInfarctIvsd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Repair-VentricularSeptum-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairLungOrChestWall-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfHeartWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfPerivalvularLeak"))), list(reader_make_constant_shell(makeString("RepairOfSpleen-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairWithRe-implantationOfAorticValve-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VascularRepairProcedure-Surgical")), list(reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AbdominalAorta")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("ThoracicAorta"))))), list(reader_make_constant_shell(makeString("Aortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairAfterPercutaneousValveReplacement-VascularProcedure"))), list(reader_make_constant_shell(makeString("RepairByButton-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairByPatchGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairByStitch-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("VentricularRepair-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))) }), list(reader_make_constant_shell(makeString("Replacement-SurgicalProcedure")), list(reader_make_constant_shell(makeString("BentallHemashieldValvedConduit-VascularProcedure"))), list(reader_make_constant_shell(makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))), list(reader_make_constant_shell(makeString("OrganTransplantProcedure-Surgical")), list(reader_make_constant_shell(makeString("HeartTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("KidneyTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("LiverTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("LungTransplantProcedure-Surgical"))), list(reader_make_constant_shell(makeString("PancreasTransplantProcedure-Surgical")))), list(reader_make_constant_shell(makeString("ReplacementWithConduit-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("ReplacementSurgicalProcedure")), list(list(reader_make_constant_shell(makeString("ReplacingFn")), reader_make_constant_shell(makeString("HeartValve"))), list(reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AorticValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve"))), list(list(reader_make_constant_shell(makeString("IsolatedIndividualTypeOfTypeFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("MitralValve")))))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("PulmonaryValve")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("HeartValveReplacement-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("TricuspidValve"))))))), list(reader_make_constant_shell(makeString("Resection-CardiacValve"))), list(reader_make_constant_shell(makeString("ResectionOfPannus"))), list(reader_make_constant_shell(makeString("Shunt-bypassGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure-Noncardiac"))), list(new SubLObject[]{ reader_make_constant_shell(makeString("SurgicalProcedure_eps")), list(reader_make_constant_shell(makeString("DrainageOfPacemakerWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Explant-BiventricularPacerCrtIcd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Explant-Icd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ExplantICDWithSingleChamberOrDualChamberPacing-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ExplantOfEndocardialPacemakerLead"))), list(reader_make_constant_shell(makeString("ExplantOfEpicardialPacemakerLead"))), list(reader_make_constant_shell(makeString("ExplantOfImplantableCardioverterDefibrillatorPatch"))), list(reader_make_constant_shell(makeString("Implant-BiventricularPacerCrtIcd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Implant-Icd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOrExplant-Icd-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOrExplant-PermanentPacemaker-SurgicalProcedure")), list(reader_make_constant_shell(makeString("ExplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("MappingAndAblationOfAccessoryPathways-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PacemakerInsertion-SurgicalProcedure")), list(reader_make_constant_shell(makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("Placement-PpmicdEndocardialLead-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PlacementEpicardialLeadsNotIncludingLeftVentricular-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PlacementOfRightAtrialEpicardialPacemakerLead"))), list(reader_make_constant_shell(makeString("PlacementOfRightVentricularEpicardialPacemakerLead"))), list(reader_make_constant_shell(makeString("RemovalOfEpicardialPacingWires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RemovalOfICDLeads-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RemovalOfTemporaryEpicardialPacingWires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RevisionOfPpmicdLeads-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_endocardial_pacemaker_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_epicardial_pacemaker_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_generator"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_left_ventricular_epicardial_pacing_lead"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_permanent_pacemaker"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_explant_of_temporary_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_epicardial_pacing_leads_not_including_left_ventricular"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_left_ventricular_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_permanent_endocardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_right_atrial_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_implant_of_right_ventricular_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_revision_of_permanent_epicardial_pacing_leads"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_eps_thrombectomy_from_pacing_leads"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("SurgicalWoundTreatment-SurgicalProcedure")), list(reader_make_constant_shell(makeString("ChestClosure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("DebridementOfOperativeWoundNotSternal-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("HematomaRemovalFromGraftHarvestSite-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RemovalOfSternalWires-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SternalRe-wire-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SternalResection-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_surgical_wound_treatment_debridement_or_rewire_of_sternum")), list(reader_make_constant_shell(makeString("SternalDebridement-SurgicalProcedure")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_surgical_wound_treatment_sternal_fixation"))) }), list(new SubLObject[]{ reader_make_constant_shell(makeString("ThoracicProcedure-Surgical")), list(reader_make_constant_shell(makeString("NonHerniaRepairThoracic-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherThoracicProcedure-Surgical"))), list(reader_make_constant_shell(makeString("RemovalOfForeignBodyMaterials-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairThoracicWound-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_chest_closure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_chest_open"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_control_bleeding"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_excision_of_tumor-mass_in_thoracic_cavity"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_not_transplant"))), list(reader_make_constant_shell(makeString("ThoracicHerniaRepair-SurgicalProcedure"))) }), list(reader_make_constant_shell(makeString("ThrombectomyOrTumorExcision-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("TumorExcision")), list(reader_make_constant_shell(makeString("AtrialExcisionOfTumor-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Excision-ValvularTumor"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), list(reader_make_constant_shell(makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), list(reader_make_constant_shell(makeString("SurgicalProcedure_thoracic_excision_of_tumor-mass_in_thoracic_cavity"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_excision_of_tumor")))), list(list(reader_make_constant_shell(makeString("RepairingFn")), reader_make_constant_shell(makeString("BloodVessel"))), list(reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AbdominalAorta")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("ThoracicAorta")))))) }), list(reader_make_constant_shell(makeString("SuturingProcedure")), list(reader_make_constant_shell(makeString("SuturingProcedure-FigureOf8")))), list(reader_make_constant_shell(makeString("TestCollectionForMV"))), list(reader_make_constant_shell(makeString("Thrombectomy")), list(reader_make_constant_shell(makeString("AtrialThrombectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), list(reader_make_constant_shell(makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract"))))), list(reader_make_constant_shell(makeString("Transfer"))), list(reader_make_constant_shell(makeString("TransferPosteriorToAnterior"))), list(reader_make_constant_shell(makeString("TransferPosteriorToPosterior"))), list(reader_make_constant_shell(makeString("VascularProcedure-OtherOrAorta")), list(reader_make_constant_shell(makeString("AorticProcedure-Surgical")), list(reader_make_constant_shell(makeString("AbdominalAortaProcedure-Surgical"))), list(reader_make_constant_shell(makeString("Aortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("BentallHemashieldValvedConduit-VascularProcedure"))), list(reader_make_constant_shell(makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ThoracicAortaProcedure-Surgical")))), list(reader_make_constant_shell(makeString("OtherVascularProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_pulmonary"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_vena_cava")))), list(reader_make_constant_shell(makeString("ThoracicAortaProcedure-STS")))), list(new SubLObject[]{ reader_make_constant_shell(makeString("VascularProcedure-Surgical")), list(reader_make_constant_shell(makeString("AorticProcedure-Surgical")), list(reader_make_constant_shell(makeString("AbdominalAortaProcedure-Surgical"))), list(reader_make_constant_shell(makeString("Aortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("BentallHemashieldValvedConduit-VascularProcedure"))), list(reader_make_constant_shell(makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ThoracicAortaProcedure-Surgical")))), list(reader_make_constant_shell(makeString("ArterioscleroticPlaqueRemoval-Procedure")), list(reader_make_constant_shell(makeString("Endarterectomy-SurgicalProcedure")), list(reader_make_constant_shell(makeString("AtrialEndarterectomy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("EndarterectomyLaser-SurgicalProcedure"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("Endarterectomy-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("CommonCarotidArtery")))))), list(reader_make_constant_shell(makeString("BalloonDilatation-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("BypassGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("BypassGraftWithSaphenousVein-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("CABGWithBilateralITAGraft"))), list(reader_make_constant_shell(makeString("CABGWithMultipleGrafts"))), list(reader_make_constant_shell(makeString("CabgWithSingleITAGraft"))), list(reader_make_constant_shell(makeString("SingleGraftCAGB"))))), list(reader_make_constant_shell(makeString("BypassGraftWithHemashield-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CabrolFistula-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("CongenitalIntervention-MedicalProcedure"))), list(reader_make_constant_shell(makeString("CoronaryArteryProcedureNonCongenital-Surgical")), list(reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("CABGWithBilateralITAGraft"))), list(reader_make_constant_shell(makeString("CABGWithMultipleGrafts"))), list(reader_make_constant_shell(makeString("CabgWithSingleITAGraft"))), list(reader_make_constant_shell(makeString("SingleGraftCAGB")))), list(reader_make_constant_shell(makeString("OtherVascularCoronaryArteryProcedure-Surgical"))), list(list(reader_make_constant_shell(makeString("CollectionDifferenceFn")), reader_make_constant_shell(makeString("CoronaryArteryProcedureNonCongenital-Surgical")), reader_make_constant_shell(makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))))), list(reader_make_constant_shell(makeString("CoronaryLaserProcedure-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Debridement-VascularProcedure")), list(reader_make_constant_shell(makeString("ProstheticValveDebridement")))), list(reader_make_constant_shell(makeString("EndovascularProcedure-SurgicalProcedure")), list(reader_make_constant_shell(makeString("EndovascularStentProcedure-Surgical")), list(reader_make_constant_shell(makeString("EndovascularStentGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Debranching_with_endovascular_stent_graft"))), list(reader_make_constant_shell(makeString("EndovascularStentGraftPlacementAfterLeak-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VascularProcedureName_endovascular_stent_graft_antegrade"))), list(reader_make_constant_shell(makeString("VascularProcedureName_endovascular_stent_graft_retrograde")))))), list(reader_make_constant_shell(makeString("GraftInsertion")), list(reader_make_constant_shell(makeString("EndovascularStentGraft-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Debranching_with_endovascular_stent_graft"))), list(reader_make_constant_shell(makeString("EndovascularStentGraftPlacementAfterLeak-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VascularProcedureName_endovascular_stent_graft_antegrade"))), list(reader_make_constant_shell(makeString("VascularProcedureName_endovascular_stent_graft_retrograde"))))), list(reader_make_constant_shell(makeString("Omentopexy-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("OtherVascularProcedure-Surgical")), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_pulmonary"))), list(reader_make_constant_shell(makeString("SurgicalProcedure_vascular_vena_cava")))), list(reader_make_constant_shell(makeString("Oversewing"))), list(reader_make_constant_shell(makeString("PatchGraft-SaphenousVein-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("PatchGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ReplacementWithConduit-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Shunt-bypassGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("ThrombectomyOrTumorExcision-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("Unroofing-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("VascularBiopsy-VascularProcedure"))), list(reader_make_constant_shell(makeString("VascularRepairProcedure-Surgical")), list(reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), list(reader_make_constant_shell(makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("AbdominalAorta")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("AneurysmRepair-SurgicalProcedure")), reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("ThoracicAorta"))))), list(reader_make_constant_shell(makeString("Aortoplasty-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairAfterPercutaneousValveReplacement-VascularProcedure"))), list(reader_make_constant_shell(makeString("RepairByButton-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairByPatchGraft-SurgicalProcedure"))), list(reader_make_constant_shell(makeString("RepairByStitch-SurgicalProcedure")))) }) }))))));
    }

    private static SubLObject _constant_285_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), makeSymbol("?PERSON")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("OsamaBinLaden")))), list(list(reader_make_constant_shell(makeString("Person")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Person")))), list(list(reader_make_constant_shell(makeString("Android")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), makeSymbol("?AGENT")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), NIL, NIL, NIL), NIL), list(list(reader_make_constant_shell(makeString("Android")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), makeSymbol("?AGENT")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), makeSymbol("?ROBOT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ROBOT"), reader_make_constant_shell(makeString("Android"))))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), NIL, NIL, NIL), NIL), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?X"), reader_make_constant_shell(makeString("OsamaBinLaden")))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), makeSymbol("?X"))), list(ONE_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("OsamaBinLaden")))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), makeSymbol("?X")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE"))), list(ONE_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("OsamaBinLaden"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), list(ONE_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), NIL), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), NIL), list(list(reader_make_constant_shell(makeString("Person")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), list(ONE_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), NIL), list(list(reader_make_constant_shell(makeString("Person")), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?EVENT"), makeSymbol("?DATE")), list(TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), NIL), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y"))), list(TWO_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Cat"))), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?X"), reader_make_constant_shell(makeString("OsamaBinLaden"))))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?WHO"), reader_make_constant_shell(makeString("Cat"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?WHO"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), makeSymbol("?WHO")))), list(TWO_INTEGER, ONE_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?WHO"), reader_make_constant_shell(makeString("Cat"))), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVENT"), reader_make_constant_shell(makeString("OsamaBinLaden"))))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y"))), list(TWO_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?X"), reader_make_constant_shell(makeString("OsamaBinLaden"))))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y"))), list(TWO_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?X"), reader_make_constant_shell(makeString("OsamaBinLaden")))), list(list(reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Z"), makeSymbol("?Y")))), list(TWO_INTEGER, ONE_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?Y"), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?X"), reader_make_constant_shell(makeString("OsamaBinLaden"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Z"), makeSymbol("?Y"))))), list(list(reader_make_constant_shell(makeString("Person")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("beneficiary")), makeSymbol("?EVENT"), makeSymbol("?WHO")), list(reader_make_constant_shell(makeString("maleficiary")), makeSymbol("?EVENT"), makeSymbol("?WHO"))), list(ONE_INTEGER, TWO_INTEGER), NIL, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("beneficiary")), makeSymbol("?EVENT"), makeSymbol("?BENEFICIARY")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?BENEFICIARY"), reader_make_constant_shell(makeString("Person")))), list(reader_make_constant_shell(makeString("maleficiary")), makeSymbol("?EVENT"), makeSymbol("?WHO")))), list(list(reader_make_constant_shell(makeString("Person")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("beneficiary")), makeSymbol("?EVENT"), makeSymbol("?WHO")), list(reader_make_constant_shell(makeString("maleficiary")), makeSymbol("?EVENT"), makeSymbol("?WHO"))), list(ONE_INTEGER, TWO_INTEGER), T, reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), T, NIL, NIL), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("beneficiary")), makeSymbol("?EVENT"), makeSymbol("?MALEFICIARY")), list(reader_make_constant_shell(makeString("maleficiary")), makeSymbol("?EVENT"), makeSymbol("?MALEFICIARY"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MALEFICIARY"), reader_make_constant_shell(makeString("Person"))))) });
    }

    @Override
    public void declareFunctions() {
        declare_gke_main_file();
    }

    @Override
    public void initializeVariables() {
        init_gke_main_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gke_main_file();
    }

    static {

















































































































































































































































































































    }

    public static final class $replacement_tree_native extends SubLStructNative {
        public SubLObject $root;

        public SubLObject $children;

        private static final SubLStructDeclNative structDecl;

        private $replacement_tree_native() {
            this.$root = Lisp.NIL;
            this.$children = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$root;
        }

        @Override
        public SubLObject getField3() {
            return this.$children;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$root = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$children = value;
        }

        static {
            structDecl = makeStructDeclNative($replacement_tree_native.class, REPLACEMENT_TREE, REPLACEMENT_TREE_P, $list143, $list144, new String[]{ "$root", "$children" }, $list145, $list146, PRINT_REPLACEMENT_TREE);
        }
    }

    public static final class $replacement_tree_p$UnaryFunction extends UnaryFunction {
        public $replacement_tree_p$UnaryFunction() {
            super(extractFunctionNamed("REPLACEMENT-TREE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return replacement_tree_p(arg1);
        }
    }
}

/**
 * Total time: 6984 ms
 */
