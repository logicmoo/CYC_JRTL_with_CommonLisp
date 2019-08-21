package com.cyc.cycjava.cycl.inference;


import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_iterators;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.ontology_layers;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$kbq_run_query_auto_destroy_enabledP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.inference.leviathan.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class leviathan extends SubLTranslatedFile {
    public static final SubLFile me = new leviathan();

    public static final String myName = "com.cyc.cycjava.cycl.inference.leviathan";

    public static final String myFingerPrint = "7a5863f587482f3cfef4070b227c575a3de5875a542c3ab309acacd66afeb1e4";

    // deflexical
    // Definitions
    private static final SubLSymbol $leviathan_directory$ = makeSymbol("*LEVIATHAN-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $leviathan_experiment_directory$ = makeSymbol("*LEVIATHAN-EXPERIMENT-DIRECTORY*");

    // deflexical
    /**
     * A set of experiment analysis and comparison metrics that's large enough to be
     * useful but small enough to be manageable.
     */
    private static final SubLSymbol $standard_leviathan_query_metrics$ = makeSymbol("*STANDARD-LEVIATHAN-QUERY-METRICS*");









    // deflexical
    private static final SubLSymbol $sorted_rule_analyses$ = makeSymbol("*SORTED-RULE-ANALYSES*");



    // defparameter
    public static final SubLSymbol $rule_bindings_to_closed_wff_pruning_enabledP$ = makeSymbol("*RULE-BINDINGS-TO-CLOSED-WFF-PRUNING-ENABLED?*");

    // defparameter
    public static final SubLSymbol $maintain_problem_creation_timesP$ = makeSymbol("*MAINTAIN-PROBLEM-CREATION-TIMES?*");



    // deflexical
    private static final SubLSymbol $leviathan_crtl_internal_time_units_per_second$ = makeSymbol("*LEVIATHAN-CRTL-INTERNAL-TIME-UNITS-PER-SECOND*");

    // defparameter
    private static final SubLSymbol $doppelganger_time_threshold$ = makeSymbol("*DOPPELGANGER-TIME-THRESHOLD*");

    // Internal Constants
    public static final SubLString $str0$_cyc_projects_inference_leviathan = makeString("/cyc/projects/inference/leviathan/");

    public static final SubLString $str1$experiments_ = makeString("experiments/");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("PROBLEM-COUNT"), makeKeyword("PROOF-COUNT"), makeKeyword("LINK-COUNT"), makeKeyword("TACTIC-COUNT"), makeKeyword("REMOVAL-LINK-COUNT"), makeKeyword("TRANSFORMATION-LINK-COUNT"), makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeKeyword("JOIN-ORDERED-LINK-COUNT"), makeKeyword("JOIN-LINK-COUNT"), makeKeyword("SPLIT-LINK-COUNT"), makeKeyword("RESTRICTION-LINK-COUNT"), makeKeyword("GOOD-PROBLEM-COUNT"), makeKeyword("NEUTRAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-PROBLEM-COUNT"), makeKeyword("NEW-ROOT-COUNT") });

    public static final SubLList $list4 = list(makeKeyword("PROBLEM-QUERIES"), makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED"), makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("PROBLEM-STORE-PROOF-COUNT"));

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-LEVIATHAN-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*LEVIATHAN-OUTLIER-TIMEOUT*"))), list(makeSymbol("INCREMENTAL"), T), list(makeSymbol("INCLUDE-RESULTS"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), makeSymbol("*LEVIATHAN-EXPERIMENT-DIRECTORY*")) });

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("DIRECTORY") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");





    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");



    public static final SubLList $list13 = list(makeSymbol("ALL-LEVIATHAN-QUERY-METRICS"));



    public static final SubLSymbol $leviathan_outlier_timeout$ = makeSymbol("*LEVIATHAN-OUTLIER-TIMEOUT*");











    public static final SubLSymbol $sym21$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    public static final SubLSymbol $sym22$FULL_FILENAME = makeUninternedSymbol("FULL-FILENAME");





    public static final SubLSymbol LEVIATHAN_EXPERIMENT_FULL_FILENAME = makeSymbol("LEVIATHAN-EXPERIMENT-FULL-FILENAME");

    public static final SubLSymbol RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");

    private static final SubLObject $$KBContentLeviathanQuery = reader_make_constant_shell(makeString("KBContentLeviathanQuery"));

    private static final SubLObject $$HALOLeviathanQuery = reader_make_constant_shell(makeString("HALOLeviathanQuery"));

    private static final SubLObject $$AutogeneratedLeviathanQuery = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery"));

    public static final SubLString $str30$data_haystacks_ = makeString("data/haystacks/");

    public static final SubLString $str31$_haystack_ = makeString("-haystack-");

    public static final SubLString $str32$_cfasl = makeString(".cfasl");

    public static final SubLSymbol CACHED_LOAD_ALL_HAYSTACKS = makeSymbol("CACHED-LOAD-ALL-HAYSTACKS");

    public static final SubLSymbol $cached_load_all_haystacks_caching_state$ = makeSymbol("*CACHED-LOAD-ALL-HAYSTACKS-CACHING-STATE*");



    private static final SubLString $$$Loading_all_haystacks = makeString("Loading all haystacks");

    private static final SubLString $$$cdolist = makeString("cdolist");

    public static final SubLSymbol $sym38$_ = makeSymbol("<");

    public static final SubLSymbol HAYSTACK_SIZE = makeSymbol("HAYSTACK-SIZE");

    public static final SubLString $str40$____Total_haystacks_ = makeString("~%~%Total haystacks:");

    public static final SubLString $str41$____Interesting_haystacks_ = makeString("~%~%Interesting haystacks:");

    public static final SubLSymbol INTERESTING_HAYSTACK_P = makeSymbol("INTERESTING-HAYSTACK-P");

    public static final SubLSymbol CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS = makeSymbol("CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS");

    public static final SubLSymbol $cached_load_all_instantiated_haystacks_caching_state$ = makeSymbol("*CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-CACHING-STATE*");

    public static final SubLString $str45$data_instantiated_haystacks_ = makeString("data/instantiated-haystacks/");

    public static final SubLString $str46$Loading_all_instantiated_haystack = makeString("Loading all instantiated haystacks");

    public static final SubLString $str47$____Total_instantiated_haystacks_ = makeString("~%~%Total instantiated haystacks: ~a");

    public static final SubLSymbol FIX_HAYSTACK_VARIABLES = makeSymbol("FIX-HAYSTACK-VARIABLES");

    public static final SubLString $str49$_a_ = makeString("~a ");

    public static final SubLSymbol CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS = makeSymbol("CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS");

    public static final SubLSymbol $cached_load_all_crippled_haystacks_caching_state$ = makeSymbol("*CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-CACHING-STATE*");

    public static final SubLString $str52$data_crippled_haystacks_ = makeString("data/crippled-haystacks/");

    public static final SubLString $$$Loading_all_crippled_haystacks = makeString("Loading all crippled haystacks");

    public static final SubLString $str54$____Total_crippled_haystacks___a = makeString("~%~%Total crippled haystacks: ~a");

    public static final SubLString $str55$Reifying_all_instantiated_haystac = makeString("Reifying all instantiated haystacks");

    public static final SubLString $$$Reifying_all_crippled_haystacks = makeString("Reifying all crippled haystacks");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list58 = list(reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled")));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLList $list60 = list(reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled")));

    private static final SubLObject $$TestVocabularyMt = reader_make_constant_shell(makeString("TestVocabularyMt"));

    private static final SubLObject $const62$softwareParameterValueInSpecifica = reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

    private static final SubLObject $const63$InferenceMaxTransformationStepsPa = reader_make_constant_shell(makeString("InferenceMaxTransformationStepsParameter"));

    public static final SubLList $list64 = list(reader_make_constant_shell(makeString("canonicalizerDirectiveForArg")), reader_make_constant_shell(makeString("softwareParameterValueInSpecification")), TWO_INTEGER, reader_make_constant_shell(makeString("LeaveSomeTermsAtEL")));

    private static final SubLObject $const65$UniversalVocabularyImplementation = reader_make_constant_shell(makeString("UniversalVocabularyImplementationMt"));

    private static final SubLObject $$InferenceAllowedRulesParameter = reader_make_constant_shell(makeString("InferenceAllowedRulesParameter"));

    public static final SubLString $str67$LeviathanHaystack_ = makeString("LeviathanHaystack-");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    public static final SubLString $$$Removing_duplicate_haystacks = makeString("Removing duplicate haystacks");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLString $str72$haystacks_20050425_focused = makeString("haystacks-20050425-focused");

    public static final SubLString $str73$haystacks_20050425_exploratory = makeString("haystacks-20050425-exploratory");

    public static final SubLList $list74 = list(reader_make_constant_shell(makeString("AutogeneratedHaystackQuery")));

    private static final SubLObject $const75$AutogeneratedLeviathanQuery_Uncri = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled"));

    public static final SubLString $str76$deep_queries_with_1_backchain = makeString("deep-queries-with-1-backchain");

    public static final SubLList $list77 = list(reader_make_constant_shell(makeString("KBContentLeviathanQuery")));

    private static final SubLObject $$KBContentLeviathanQuery_Training = reader_make_constant_shell(makeString("KBContentLeviathanQuery-Training"));

    private static final SubLObject $$KBContentLeviathanQuery_Blind = reader_make_constant_shell(makeString("KBContentLeviathanQuery-Blind"));

    private static final SubLObject $$HALOLeviathanQuery_Training = reader_make_constant_shell(makeString("HALOLeviathanQuery-Training"));

    private static final SubLObject $$HALOLeviathanQuery_Blind = reader_make_constant_shell(makeString("HALOLeviathanQuery-Blind"));

    private static final SubLObject $const82$AutogeneratedLeviathanQuery_Uncri = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled-Training"));

    private static final SubLObject $const83$AutogeneratedLeviathanQuery_Uncri = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Uncrippled-Blind"));

    private static final SubLObject $const84$AutogeneratedLeviathanQuery_Cripp = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled"));

    private static final SubLObject $const85$AutogeneratedLeviathanQuery_Cripp = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled-Training"));

    private static final SubLObject $const86$AutogeneratedLeviathanQuery_Cripp = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Crippled-Blind"));

    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    public static final SubLString $str88$Oops__off_by_one_error_in_first_n = makeString("Oops, off by one error in first-n / last-n");

    public static final SubLString $str89$could_not_unassert__a_at_Cyc_laye = makeString("could not unassert ~a at Cyc layer");

    public static final SubLString $str90$could_not_unassert__a_at_HL = makeString("could not unassert ~a at HL");

    public static final SubLString $str91$could_not_unassert__a_via_TMS = makeString("could not unassert ~a via TMS");

    public static final SubLString $str92$kb_content_training_justification = makeString("kb-content-training-justifications-rabbit-hole-20050426");

    public static final SubLString $str93$Asserting_allowed_rules_for_answe = makeString("Asserting allowed rules for answerable queries");

    public static final SubLSymbol $sym94$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLObject $$LeviathanQuery_Training = reader_make_constant_shell(makeString("LeviathanQuery-Training"));











    public static final SubLString $str102$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str107$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str108$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str109$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list110 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str111$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $sym112$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");

    private static final SubLString $$$Gathering_all_skolem_rules = makeString("Gathering all skolem rules");



    private static final SubLString $str115$Gathering_all_negative_utility_sk = makeString("Gathering all negative-utility skolem rules");

    private static final SubLSymbol TRANSFORMATION_RULE_HISTORICAL_UTILITY = makeSymbol("TRANSFORMATION-RULE-HISTORICAL-UTILITY");

    private static final SubLSymbol TRANSFORMATION_RULE_CONSIDERED_COUNT = makeSymbol("TRANSFORMATION-RULE-CONSIDERED-COUNT");

    private static final SubLSymbol TRANSFORMATION_RULE_SUCCESS_COUNT = makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");

    public static final SubLString $$$mapping_Cyc_rules = makeString("mapping Cyc rules");

    private static final SubLObject $$skolem = reader_make_constant_shell(makeString("skolem"));

    private static final SubLSymbol $sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list122 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);





    private static final SubLString $str125$_A = makeString("~A");

    private static final SubLList $list126 = list(new SubLObject[]{ makeKeyword("SUCKY-SKOLEM-RULE"), makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE"), makeKeyword("SUCKY-RULE"), makeKeyword("INERT-SKOLEM-RULE"), makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE"), makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE"), makeKeyword("INERT-RULE"), makeKeyword("UNSUCCESSFUL-FORWARD-RULE"), makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS"), makeKeyword("SUCCESSFUL-SKOLEM-RULE"), makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE"), makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE"), makeKeyword("SUCCESSFUL-FORWARD-RULE"), makeKeyword("OTHER") });

    private static final SubLSymbol $SUCKY_SKOLEM_RULE = makeKeyword("SUCKY-SKOLEM-RULE");

    private static final SubLSymbol $NEGATIVE_UTILITY_SKOLEM_RULE = makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE");

    private static final SubLSymbol $INERT_SKOLEM_RULE = makeKeyword("INERT-SKOLEM-RULE");

    private static final SubLSymbol $SUCCESSFUL_SKOLEM_RULE = makeKeyword("SUCCESSFUL-SKOLEM-RULE");

    private static final SubLSymbol $NEVER_CONSIDERED_FORWARD_SKOLEM_RULE = makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE");

    private static final SubLSymbol $NEVER_CONSIDERED_BACKWARD_SKOLEM_RULE = makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE");





    private static final SubLSymbol $BACKWARD_SUCCESSFUL_FORWARD_RULE = makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE");

    private static final SubLSymbol $BACKWARD_SUCCESSFUL_BACKWARD_RULE = makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE");

    private static final SubLSymbol $SUCCESSFUL_FORWARD_RULE = makeKeyword("SUCCESSFUL-FORWARD-RULE");

    private static final SubLSymbol $UNSUCCESSFUL_FORWARD_RULE = makeKeyword("UNSUCCESSFUL-FORWARD-RULE");

    private static final SubLSymbol $UNSUCCESSFUL_BACKWARD_RULE_WITH_DEPENDENTS = makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS");



    private static final SubLObject $const141$AutogeneratedLeviathanQuery_Train = reader_make_constant_shell(makeString("AutogeneratedLeviathanQuery-Training"));

    private static final SubLObject $$CycLQuerySpecification = reader_make_constant_shell(makeString("CycLQuerySpecification"));

    private static final SubLSymbol $kw143$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $const145$InferenceConditionalSentenceParam = reader_make_constant_shell(makeString("InferenceConditionalSentenceParameter"));

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLString $str147$pre_halo_training_rule_bindings_t = makeString("pre-halo-training-rule-bindings-to-closed-20050506");

    private static final SubLSymbol $TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");

    private static final SubLList $list149 = list(makeSymbol("RULE"), makeSymbol("BINDINGS"), makeSymbol("MT"));

    private static final SubLSymbol $rule_bindings_wff_table$ = makeSymbol("*RULE-BINDINGS-WFF-TABLE*");

    private static final SubLString $str151$_cyc_projects_inference_leviathan = makeString("/cyc/projects/inference/leviathan/data/rule-bindings-to-closed-wff-analysis.cfasl");

    private static final SubLSymbol $kw152$LOGSCALE_Y_ = makeKeyword("LOGSCALE-Y?");





    private static final SubLString $str155$Answerable_vs__Unanswerable_ = makeString("Answerable vs. Unanswerable ");

    private static final SubLList $list156 = list(makeSymbol("VALUE"), makeSymbol("EXPERIMENT"));



    private static final SubLString $str158$Oracularly_Answerable_vs__Unanswe = makeString("Oracularly Answerable vs. Unanswerable ");

    private static final SubLSymbol $problem_creation_times$ = makeSymbol("*PROBLEM-CREATION-TIMES*");

    private static final SubLString $str160$halo_queries_with_1_backchain_823 = makeString("halo-queries-with-1-backchain-823-0524");

    private static final SubLList $list161 = list(reader_make_constant_shell(makeString("HALOLeviathanQuery")));

    private static final SubLString $$$Leviathan_Training = makeString("Leviathan Training");

    private static final SubLString $str163$_0 = makeString(":0");

    private static final SubLSymbol BOUND_SYMBOL_P = makeSymbol("BOUND-SYMBOL-P");

    private static final SubLString $str165$____Basic_analysis____ = makeString("~%~%Basic analysis: ~%");

    private static final SubLString $str166$____Answerable____ = makeString("~%~%Answerable: ~%");

    private static final SubLString $str167$____Unanswerable____ = makeString("~%~%Unanswerable: ~%");

    private static final SubLString $str168$____KB_Content____ = makeString("~%~%KB Content: ~%");

    private static final SubLString $str169$____Autogenerated____ = makeString("~%~%Autogenerated: ~%");

    private static final SubLString $str170$____HALO____ = makeString("~%~%HALO: ~%");

    private static final SubLString $str171$____Answerable_KB_Content____ = makeString("~%~%Answerable KB Content: ~%");

    private static final SubLString $str172$____Answerable_Autogenerated____ = makeString("~%~%Answerable Autogenerated: ~%");

    private static final SubLString $str173$____Answerable_HALO____ = makeString("~%~%Answerable HALO: ~%");

    private static final SubLString $str174$____Unanswerable_KB_Content____ = makeString("~%~%Unanswerable KB Content: ~%");

    private static final SubLString $str175$____Unanswerable_Autogenerated___ = makeString("~%~%Unanswerable Autogenerated: ~%");

    private static final SubLString $str176$____Unanswerable_HALO____ = makeString("~%~%Unanswerable HALO: ~%");

    private static final SubLString $str177$______of_queries_answerable_in__B = makeString("~%~%# of queries answerable in (BASELINE  BOTH  EXPERIMENT): ~%");

    private static final SubLString $str178$Total___________s__s__s__ = makeString("Total:         ~s ~s ~s~%");

    private static final SubLString $str179$KB_Content______s__s__s__ = makeString("KB Content:    ~s ~s ~s~%");

    private static final SubLString $str180$Autogenerated___s__s__s__ = makeString("Autogenerated: ~s ~s ~s~%");

    private static final SubLString $str181$HALO____________s__s__s__ = makeString("HALO:          ~s ~s ~s~%");

    private static final SubLString $str182$____Key___BASELINE_VALUE__EXPERIM = makeString("~%~%Key: (BASELINE-VALUE  EXPERIMENT-VALUE  RATIO), times are expressed in seconds.~%");

    private static final SubLString $str183$____Mutually_Answerable____ = makeString("~%~%Mutually Answerable: ~%");

    private static final SubLString $str184$____Mutually_Answerable_KB_Conten = makeString("~%~%Mutually Answerable KB Content: ~%");

    private static final SubLString $str185$____Mutually_Answerable_Autogener = makeString("~%~%Mutually Answerable Autogenerated: ~%");

    private static final SubLString $str186$____Mutually_Answerable_HALO____ = makeString("~%~%Mutually Answerable HALO: ~%");



    private static final SubLString $$$Mutually_Answerable_ = makeString("Mutually Answerable ");



    private static final SubLString $str190$__ = makeString(": ");

    private static final SubLString $str191$_vs__ = makeString(" vs. ");

    private static final SubLString $str192$_n = makeString("\\n");



    private static final SubLString $$$Sorted_Queries = makeString("Sorted Queries");

    private static final SubLSymbol $BASELINE_KEY_LABEL = makeKeyword("BASELINE-KEY-LABEL");

    private static final SubLSymbol $EXPERIMENT_KEY_LABEL = makeKeyword("EXPERIMENT-KEY-LABEL");

    public static final SubLList $list197 = list(makeKeyword("KEY-LOCATION"), list(makeInteger(212), makeInteger(100)));

    private static final SubLList $list198 = list(makeSymbol("LEVIATHAN-KB-CONTENT-QUERY?"), makeSymbol("LEVIATHAN-HAYSTACK-QUERY?"), makeSymbol("LEVIATHAN-HALO-QUERY?"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list200 = list(makeKeyword("CLASSIFICATION-LABELS"), list(makeString("KB Content queries"), makeString("Autogenerated queries"), makeString("HALO queries")), makeKeyword("KEY-LOCATION"), list(makeInteger(212), makeInteger(100)));

    private static final SubLString $$$time = makeString("time");

    private static final SubLString $str202$Time__sec_ = makeString("Time (sec)");

    private static final SubLString $$$problem = makeString("problem");

    private static final SubLString $str204$__of_problems = makeString("# of problems");

    private static final SubLString $$$link = makeString("link");

    private static final SubLString $str206$__of_links = makeString("# of links");

    private static final SubLString $$$tactic = makeString("tactic");

    private static final SubLString $str208$__of_tactics = makeString("# of tactics");

    private static final SubLString $$$proof = makeString("proof");

    private static final SubLString $str210$__of_proofs = makeString("# of proofs");

    private static final SubLString $$$answer = makeString("answer");

    private static final SubLString $str212$__of_answers = makeString("# of answers");

    private static final SubLString $$$byte = makeString("byte");

    private static final SubLString $str214$__of_bytes = makeString("# of bytes");

    private static final SubLString $str215$ = makeString("");

    private static final SubLString $str216$training_823_h_queries_0602 = makeString("training-823-h-queries-0602");





    private static final SubLList $list219 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    private static final SubLSymbol $sym221$_ = makeSymbol(">");



    private static final SubLInteger $int$1000000 = makeInteger(1000000);

    private static final SubLSymbol ELAPSED_CRTL_INTERNAL_REAL_TIME_TO_ELAPSED_SECONDS = makeSymbol("ELAPSED-CRTL-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS");

    private static final SubLSymbol $NEW_ROOT_RELATIVE_TOTAL_TIMES = makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");

    private static final SubLSymbol $NEW_ROOT_RELATIVE_ANSWER_TIMES = makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");



    private static final SubLSymbol KBQ_INTERNAL_REAL_TIME_TO_SECONDS = makeSymbol("KBQ-INTERNAL-REAL-TIME-TO-SECONDS");

    private static final SubLList $list229 = list(makeKeyword("BROWSABLE?"), T);

    private static final SubLList $list230 = list(ONE_INTEGER);

    private static final SubLSymbol $sym231$_ = makeSymbol("*");

    private static final SubLSymbol SINGLE_LITERAL_PROBLEM_P = makeSymbol("SINGLE-LITERAL-PROBLEM-P");

    private static final SubLSymbol CYCL_LITERAL_P = makeSymbol("CYCL-LITERAL-P");

    private static final SubLList $list234 = list(makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), ZERO_INTEGER, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);



    private static final SubLSymbol $TRANS_UNBOUND_PREDICATE_POS = makeKeyword("TRANS-UNBOUND-PREDICATE-POS");

    private static final SubLString $str237$Doppelganging___ = makeString("Doppelganging...");

    private static final SubLString $str238$Skipping_term__A_due_to_error____ = makeString("Skipping term ~A due to error:~% ~A.~%");

    private static final SubLList $list239 = list(makeKeyword("LOWER"));

    private static final SubLList $list240 = list(reader_make_constant_shell(makeString("doppelgangers")), reader_make_constant_shell(makeString("termOfUnit")), reader_make_constant_shell(makeString("genTemplate")), reader_make_constant_shell(makeString("genTemplate-Constrained")), reader_make_constant_shell(makeString("genTemplate-QuerySentence")), reader_make_constant_shell(makeString("detailedIsaParaphrase")));

    private static final SubLString $str241$Doppelganger_ = makeString("Doppelganger-");

    private static final SubLString $str242$_ = makeString("-");

    private static final SubLSymbol DOPPELGANGER_P = makeSymbol("DOPPELGANGER-P");

    private static final SubLString $str244$Slow_assertion___s = makeString("Slow assertion: ~s");

    private static final SubLObject $$doppelgangers = reader_make_constant_shell(makeString("doppelgangers"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));







    private static final SubLString $$$doppelgangers = makeString("doppelgangers");

    private static final SubLObject $ic251 = makeGuid("c896b661-c145-11e1-9e60-00219b3ef414");

    private static final SubLList $list252 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("doppelgangers")), reader_make_constant_shell(makeString("BinaryPredicate")));

    private static final SubLList $list253 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("doppelgangers")), reader_make_constant_shell(makeString("FunctionalPredicate")));

    private static final SubLList $list254 = list(reader_make_constant_shell(makeString("comment")), reader_make_constant_shell(makeString("doppelgangers")), makeString("(#$doppelgangers ORIGINAL-TERM DOPPELGANGER) means that DOPPELGANGER was cloned from ORIGINAL-TERM."));

    private static final SubLList $list255 = list(reader_make_constant_shell(makeString("arg1QuotedIsa")), reader_make_constant_shell(makeString("doppelgangers")), reader_make_constant_shell(makeString("CycLClosedDenotationalTerm")));

    private static final SubLList $list256 = list(reader_make_constant_shell(makeString("arg2QuotedIsa")), reader_make_constant_shell(makeString("doppelgangers")), reader_make_constant_shell(makeString("CycLClosedDenotationalTerm")));

    private static final SubLList $list257 = list(reader_make_constant_shell(makeString("functionalInArgs")), reader_make_constant_shell(makeString("doppelgangers")), ONE_INTEGER);

    public static SubLObject basic_leviathan_query_metrics() {
        return remove($TIME_TO_LAST_ANSWER, inference_datastructures_enumerated_types.all_arete_query_metrics(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject standard_leviathan_query_metrics() {
        return $standard_leviathan_query_metrics$.getGlobalValue();
    }

    public static SubLObject all_leviathan_query_metrics() {
        return reverse(set_difference(inference_datastructures_enumerated_types.all_query_metrics(), $list4, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject leviathan_experiment_full_filename(final SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $leviathan_experiment_directory$.getGlobalValue();
        }
        return arete.arete_experiment_full_filename(filename, directory);
    }

    public static SubLObject run_leviathan_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list5);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list5);
            if (NIL == member(current_$1, $list6, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list5);
        }
        final SubLObject query_spec_set_tail = property_list_member($QUERY_SPEC_SET, current);
        final SubLObject query_spec_set = (NIL != query_spec_set_tail) ? cadr(query_spec_set_tail) : NIL;
        final SubLObject filename_tail = property_list_member($FILENAME, current);
        final SubLObject filename = (NIL != filename_tail) ? cadr(filename_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject overriding_query_properties_tail = property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? cadr(overriding_query_properties_tail) : NIL;
        final SubLObject metrics_tail = property_list_member($METRICS, current);
        final SubLObject metrics = (NIL != metrics_tail) ? cadr(metrics_tail) : $list13;
        final SubLObject outlier_timeout_tail = property_list_member($OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? cadr(outlier_timeout_tail) : $leviathan_outlier_timeout$;
        final SubLObject incremental_tail = property_list_member($INCREMENTAL, current);
        final SubLObject incremental = (NIL != incremental_tail) ? cadr(incremental_tail) : T;
        final SubLObject include_results_tail = property_list_member($INCLUDE_RESULTS, current);
        final SubLObject include_results = (NIL != include_results_tail) ? cadr(include_results_tail) : NIL;
        final SubLObject skip_tail = property_list_member($SKIP, current);
        final SubLObject skip = (NIL != skip_tail) ? cadr(skip_tail) : ZERO_INTEGER;
        final SubLObject count_tail = property_list_member($COUNT, current);
        final SubLObject count = (NIL != count_tail) ? cadr(count_tail) : NIL;
        final SubLObject directory_tail = property_list_member($DIRECTORY, current);
        final SubLObject directory = (NIL != directory_tail) ? cadr(directory_tail) : $leviathan_experiment_directory$.getGlobalValue();
        final SubLObject filename_var = $sym21$FILENAME_VAR;
        final SubLObject full_filename = $sym22$FULL_FILENAME;
        return list(CLET, list(list(filename_var, filename), list(full_filename, list(FWHEN, filename_var, list(LEVIATHAN_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), list(new SubLObject[]{ RUN_KBQ_EXPERIMENT, $QUERY_SPEC_SET, query_spec_set, $FILENAME, full_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $SKIP, skip, $COUNT, count }));
    }

    public static SubLObject load_leviathan_experiment(final SubLObject filename) {
        final SubLObject full_filename = leviathan_experiment_full_filename(filename, UNPROVIDED);
        return kbq_query_run.kbq_load_query_set_run(full_filename);
    }

    public static SubLObject save_leviathan_experiment(final SubLObject experiment, final SubLObject filename) {
        final SubLObject full_filename = leviathan_experiment_full_filename(filename, UNPROVIDED);
        return kbq_query_run.kbq_save_query_set_run(experiment, full_filename);
    }

    public static SubLObject leviathan_kb_content_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$KBContentLeviathanQuery, UNPROVIDED);
    }

    public static SubLObject leviathan_halo_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$HALOLeviathanQuery, UNPROVIDED);
    }

    public static SubLObject leviathan_haystack_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, $$AutogeneratedLeviathanQuery, UNPROVIDED);
    }

    public static SubLObject leviathan_kb_content_queryP(final SubLObject query) {
        return isa.isaP(query, $$KBContentLeviathanQuery, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject leviathan_halo_queryP(final SubLObject query) {
        return isa.isaP(query, $$HALOLeviathanQuery, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject leviathan_haystack_queryP(final SubLObject query) {
        return isa.isaP(query, $$AutogeneratedLeviathanQuery, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject save_haystack(final SubLObject n) {
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str30$data_haystacks_);
        final SubLObject filename = cconcatenate(directory, new SubLObject[]{ string_utilities.str(n), $str31$_haystack_, string_utilities.str(random.random($most_positive_fixnum$.getGlobalValue())), $str32$_cfasl });
        if (NIL != file_utilities.file_valid_for_writing_p(filename)) {
            final SubLObject haystack = deep_inference_generator.generate_haystack(n);
            cfasl_utilities.cfasl_save_externalized(haystack, filename);
            return haystack;
        }
        return NIL;
    }

    public static SubLObject load_haystack(final SubLObject filename) {
        final SubLObject full_pathname = cconcatenate($leviathan_directory$.getGlobalValue(), new SubLObject[]{ $str30$data_haystacks_, filename });
        return cfasl_utilities.cfasl_load(full_pathname);
    }

    public static SubLObject load_all_haystacks(SubLObject reloadP) {
        if (reloadP == UNPROVIDED) {
            reloadP = NIL;
        }
        if (NIL != reloadP) {
            clear_cached_load_all_haystacks();
        }
        return cached_load_all_haystacks();
    }

    public static SubLObject clear_cached_load_all_haystacks() {
        final SubLObject cs = $cached_load_all_haystacks_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_load_all_haystacks() {
        return memoization_state.caching_state_remove_function_results_with_args($cached_load_all_haystacks_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_load_all_haystacks_internal() {
        return load_all_haystacks_int();
    }

    public static SubLObject cached_load_all_haystacks() {
        SubLObject caching_state = $cached_load_all_haystacks_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_LOAD_ALL_HAYSTACKS, $cached_load_all_haystacks_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_load_all_haystacks_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject load_all_haystacks_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject haystacks = NIL;
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str30$data_haystacks_);
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $$$Loading_all_haystacks;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$2 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        haystacks = cons(cfasl_utilities.cfasl_load(file), haystacks);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        haystacks = list_utilities.fast_delete_duplicates(haystacks, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return Sort.sort(haystacks, symbol_function($sym38$_), HAYSTACK_SIZE);
    }

    public static SubLObject show_haystack_statistics() {
        final SubLObject haystacks = load_all_haystacks(UNPROVIDED);
        format(T, $str40$____Total_haystacks_);
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar(HAYSTACK_SIZE, haystacks), symbol_function($sym38$_), symbol_function(EQ), symbol_function($sym38$_)), UNPROVIDED);
        format(T, $str41$____Interesting_haystacks_);
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar(HAYSTACK_SIZE, list_utilities.remove_if_not(INTERESTING_HAYSTACK_P, haystacks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), symbol_function($sym38$_), symbol_function(EQ), symbol_function($sym38$_)), UNPROVIDED);
        return NIL;
    }

    public static SubLObject load_all_instantiated_haystacks(SubLObject reloadP) {
        if (reloadP == UNPROVIDED) {
            reloadP = NIL;
        }
        if (NIL != reloadP) {
            clear_cached_load_all_instantiated_haystacks();
        }
        return cached_load_all_instantiated_haystacks();
    }

    public static SubLObject clear_cached_load_all_instantiated_haystacks() {
        final SubLObject cs = $cached_load_all_instantiated_haystacks_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_load_all_instantiated_haystacks() {
        return memoization_state.caching_state_remove_function_results_with_args($cached_load_all_instantiated_haystacks_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_load_all_instantiated_haystacks_internal() {
        return load_all_instantiated_haystacks_int();
    }

    public static SubLObject cached_load_all_instantiated_haystacks() {
        SubLObject caching_state = $cached_load_all_instantiated_haystacks_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS, $cached_load_all_instantiated_haystacks_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_load_all_instantiated_haystacks_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject load_all_instantiated_haystacks_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject instantiated_haystacks = NIL;
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str45$data_instantiated_haystacks_);
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $str46$Loading_all_instantiated_haystack;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$4 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        instantiated_haystacks = cons(cfasl_utilities.cfasl_load(file), instantiated_haystacks);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        instantiated_haystacks = list_utilities.fast_delete_duplicates(instantiated_haystacks, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return Sort.sort(instantiated_haystacks, symbol_function($sym38$_), HAYSTACK_SIZE);
    }

    public static SubLObject show_instantiated_haystack_statistics() {
        final SubLObject instantiated_haystacks = load_all_instantiated_haystacks(UNPROVIDED);
        format(T, $str47$____Total_instantiated_haystacks_, length(instantiated_haystacks));
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar(HAYSTACK_SIZE, instantiated_haystacks), symbol_function($sym38$_), symbol_function(EQ), symbol_function($sym38$_)), UNPROVIDED);
        return NIL;
    }

    public static SubLObject save_good_instantiated_haystack(final SubLObject haystacks) {
        final SubLObject instantiated_haystack = deep_inference_generator.find_good_instantiated_haystack(haystacks);
        final SubLObject n = length(deep_inference_generator.haystack_rules(instantiated_haystack));
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str45$data_instantiated_haystacks_);
        final SubLObject filename = cconcatenate(directory, new SubLObject[]{ string_utilities.str(n), $str31$_haystack_, string_utilities.str(random.random($most_positive_fixnum$.getGlobalValue())), $str32$_cfasl });
        if (NIL != file_utilities.file_valid_for_writing_p(filename)) {
            cfasl_utilities.cfasl_save_externalized(instantiated_haystack, filename);
            return instantiated_haystack;
        }
        return NIL;
    }

    public static SubLObject make_haystacks_good(SubLObject min_size, SubLObject max_size) {
        if (min_size == UNPROVIDED) {
            min_size = TWO_INTEGER;
        }
        if (max_size == UNPROVIDED) {
            max_size = $most_positive_fixnum$.getGlobalValue();
        }
        SubLObject haystacks = load_all_haystacks(UNPROVIDED);
        haystacks = Mapping.mapcar(FIX_HAYSTACK_VARIABLES, list_utilities.remove_if_not(INTERESTING_HAYSTACK_P, haystacks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject big_haystacks = NIL;
        SubLObject cdolist_list_var = haystacks;
        SubLObject haystack = NIL;
        haystack = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (deep_inference_generator.haystack_size(haystack).numGE(min_size) && deep_inference_generator.haystack_size(haystack).numLE(max_size)) {
                big_haystacks = cons(haystack, big_haystacks);
            }
            cdolist_list_var = cdolist_list_var.rest();
            haystack = cdolist_list_var.first();
        } 
        haystacks = nreverse(big_haystacks);
        while (true) {
            final SubLObject good_haystack = save_good_instantiated_haystack(haystacks);
            final SubLObject n = deep_inference_generator.haystack_size(good_haystack);
            format(T, $str49$_a_, n);
            force_output(UNPROVIDED);
        } 
    }

    public static SubLObject load_all_crippled_haystacks(SubLObject reloadP) {
        if (reloadP == UNPROVIDED) {
            reloadP = NIL;
        }
        if (NIL != reloadP) {
            clear_cached_load_all_crippled_haystacks();
        }
        return cached_load_all_crippled_haystacks();
    }

    public static SubLObject clear_cached_load_all_crippled_haystacks() {
        final SubLObject cs = $cached_load_all_crippled_haystacks_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_load_all_crippled_haystacks() {
        return memoization_state.caching_state_remove_function_results_with_args($cached_load_all_crippled_haystacks_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_load_all_crippled_haystacks_internal() {
        return load_all_crippled_haystacks_int();
    }

    public static SubLObject cached_load_all_crippled_haystacks() {
        SubLObject caching_state = $cached_load_all_crippled_haystacks_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS, $cached_load_all_crippled_haystacks_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_load_all_crippled_haystacks_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject load_all_crippled_haystacks_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject crippled_haystacks = NIL;
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str52$data_crippled_haystacks_);
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $$$Loading_all_crippled_haystacks;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$6 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        crippled_haystacks = cons(cfasl_utilities.cfasl_load(file), crippled_haystacks);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        crippled_haystacks = list_utilities.fast_delete_duplicates(crippled_haystacks, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return Sort.sort(crippled_haystacks, symbol_function($sym38$_), HAYSTACK_SIZE);
    }

    public static SubLObject show_crippled_haystack_statistics() {
        final SubLObject crippled_haystacks = load_all_crippled_haystacks(UNPROVIDED);
        format(T, $str54$____Total_crippled_haystacks___a, length(crippled_haystacks));
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar(HAYSTACK_SIZE, crippled_haystacks), symbol_function($sym38$_), symbol_function(EQ), symbol_function($sym38$_)), UNPROVIDED);
        return NIL;
    }

    public static SubLObject make_haystacks_crippled(SubLObject min_size, SubLObject max_size) {
        if (min_size == UNPROVIDED) {
            min_size = TWO_INTEGER;
        }
        if (max_size == UNPROVIDED) {
            max_size = $most_positive_fixnum$.getGlobalValue();
        }
        final SubLObject instantiated_haystacks = load_all_instantiated_haystacks(UNPROVIDED);
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str52$data_crippled_haystacks_);
        while (true) {
            final SubLObject instantiated_haystack = list_utilities.random_element(instantiated_haystacks);
            final SubLObject size = deep_inference_generator.haystack_size(instantiated_haystack);
            if (size.numGE(min_size) && size.numLE(max_size)) {
                final SubLObject crippled_haystack = deep_inference_generator.cripple_haystack(instantiated_haystack);
                final SubLObject n = length(deep_inference_generator.haystack_rules(crippled_haystack));
                final SubLObject filename = cconcatenate(directory, new SubLObject[]{ string_utilities.str(n), $str31$_haystack_, string_utilities.str(random.random($most_positive_fixnum$.getGlobalValue())), $str32$_cfasl });
                if (NIL == file_utilities.file_valid_for_writing_p(filename)) {
                    continue;
                }
                cfasl_utilities.cfasl_save_externalized(crippled_haystack, filename);
                format(T, $str49$_a_, n);
                force_output(UNPROVIDED);
            }
        } 
    }

    public static SubLObject reify_all_haystacks() {
        return add(reify_all_instantiated_haystacks(), reify_all_crippled_haystacks());
    }

    public static SubLObject reify_all_instantiated_haystacks() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str45$data_instantiated_haystacks_);
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $str55$Reifying_all_instantiated_haystac;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$8 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != reify_haystack(file, T)) {
                            count = add(count, ONE_INTEGER);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$8, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject reify_all_crippled_haystacks() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject directory = cconcatenate($leviathan_directory$.getGlobalValue(), $str52$data_crippled_haystacks_);
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $$$Reifying_all_crippled_haystacks;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$10 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != reify_haystack(file, NIL)) {
                            count = add(count, ONE_INTEGER);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$10, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject reify_haystack(final SubLObject filename, final SubLObject answerableP) {
        final SubLObject haystack = cfasl_utilities.cfasl_load(filename);
        final SubLObject ist_query = deep_inference_generator.haystack_query(haystack);
        final SubLObject rules = deep_inference_generator.haystack_rules(haystack);
        final SubLObject size = deep_inference_generator.haystack_size(haystack);
        final SubLObject const_name = haystack_constant_name_from_filename(filename);
        if (NIL == constants_high.find_constant(const_name)) {
            final SubLObject query_const = ke.ke_create_now(const_name, UNPROVIDED);
            if (NIL != answerableP) {
                ke.ke_assert_now(listS($$isa, query_const, $list58), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            } else {
                ke.ke_assert_now(listS($$isa, query_const, $list60), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            }
            ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(ist_query, query_const), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
            ke.ke_assert_now(list($const62$softwareParameterValueInSpecifica, $const63$InferenceMaxTransformationStepsPa, size, query_const), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
            ke.ke_unassert_now($list64, $const65$UniversalVocabularyImplementation);
            ke.ke_assert_now(list($const62$softwareParameterValueInSpecifica, $$InferenceAllowedRulesParameter, make_el_list(rules, UNPROVIDED), query_const), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
            ke.ke_assert_now($list64, $const65$UniversalVocabularyImplementation, UNPROVIDED, UNPROVIDED);
            return query_const;
        }
        return NIL;
    }

    public static SubLObject haystack_constant_name_from_filename(final SubLObject filename) {
        return cconcatenate($str67$LeviathanHaystack_, haystack_id_string_from_filename(filename));
    }

    public static SubLObject haystack_id_string_from_filename(final SubLObject filename) {
        return string_utilities.string_upto(string_utilities.string_after(string_utilities.string_after(last(string_utilities.split_string(filename, list(CHAR_slash)), UNPROVIDED).first(), CHAR_hyphen), CHAR_hyphen), CHAR_period);
    }

    public static SubLObject haystack_id_string_from_query(final SubLObject query) {
        final SubLObject name = constants_high.constant_name(query);
        return string_utilities.string_after(name, CHAR_hyphen);
    }

    public static SubLObject haystack_size_from_query(final SubLObject query) {
        return getf(kb_query.kbq_query_properties(query), $MAX_TRANSFORMATION_DEPTH, UNPROVIDED);
    }

    public static SubLObject haystack_filename_from_query(final SubLObject query) {
        final SubLObject id_string = haystack_id_string_from_query(query);
        final SubLObject size = haystack_size_from_query(query);
        return cconcatenate($leviathan_directory$.getGlobalValue(), new SubLObject[]{ $str30$data_haystacks_, string_utilities.str(size), $str31$_haystack_, id_string, $str32$_cfasl });
    }

    public static SubLObject instantiated_haystack_filename_from_query(final SubLObject query) {
        final SubLObject id_string = haystack_id_string_from_query(query);
        final SubLObject size = haystack_size_from_query(query);
        return cconcatenate($leviathan_directory$.getGlobalValue(), new SubLObject[]{ $str45$data_instantiated_haystacks_, string_utilities.str(size), $str31$_haystack_, id_string, $str32$_cfasl });
    }

    public static SubLObject crippled_haystack_filename_from_query(final SubLObject query) {
        final SubLObject id_string = haystack_id_string_from_query(query);
        final SubLObject size = haystack_size_from_query(query);
        return cconcatenate($leviathan_directory$.getGlobalValue(), new SubLObject[]{ $str52$data_crippled_haystacks_, string_utilities.str(size), $str31$_haystack_, id_string, $str32$_cfasl });
    }

    public static SubLObject remove_haystack_files(final SubLObject query) {
        SubLObject count = ZERO_INTEGER;
        final SubLObject file1 = haystack_filename_from_query(query);
        final SubLObject file2 = instantiated_haystack_filename_from_query(query);
        final SubLObject file3 = crippled_haystack_filename_from_query(query);
        if (NIL != file_utilities.delete_file_if_exists(file1)) {
            count = add(count, ONE_INTEGER);
        }
        if (NIL != file_utilities.delete_file_if_exists(file2)) {
            count = add(count, ONE_INTEGER);
        }
        if (NIL != file_utilities.delete_file_if_exists(file3)) {
            count = add(count, ONE_INTEGER);
        }
        return count;
    }

    public static SubLObject remove_all_duplicate_haystack_files(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        count = add(count, remove_duplicate_haystack_files_int(cconcatenate($leviathan_directory$.getGlobalValue(), $str30$data_haystacks_), do_itP));
        count = add(count, remove_duplicate_haystack_files_int(cconcatenate($leviathan_directory$.getGlobalValue(), $str45$data_instantiated_haystacks_), do_itP));
        count = add(count, remove_duplicate_haystack_files_int(cconcatenate($leviathan_directory$.getGlobalValue(), $str52$data_crippled_haystacks_), do_itP));
        return count;
    }

    public static SubLObject remove_duplicate_haystack_files_int(final SubLObject directory, final SubLObject do_itP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject v_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = $$$Removing_duplicate_haystacks;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$12 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject haystack = cfasl_utilities.cfasl_load(file);
                        if (NIL != set.set_memberP(haystack, v_set)) {
                            if (NIL != do_itP) {
                                file_utilities.delete_file_if_exists(file);
                            }
                            count = add(count, ONE_INTEGER);
                        } else {
                            set.set_add(haystack, v_set);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$12, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject kill_duplicate_and_broken_reified_haystacks(SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject v_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = isa.all_fort_instances($$AutogeneratedLeviathanQuery, UNPROVIDED, UNPROVIDED);
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sentence = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        sentence = kb_query.kbq_sentence(query);
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
            dictionary_utilities.dictionary_push(v_dictionary, sentence, query);
            if ((NIL == sentence) || (NIL != set.set_memberP(sentence, v_set))) {
                if (NIL != do_itP) {
                    ke.ke_kill(query);
                    remove_haystack_files(query);
                }
                count = add(count, ONE_INTEGER);
            } else {
                set.set_add(sentence, v_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return values(v_dictionary, count);
    }

    public static SubLObject finalize_haystack_corpus() {
        SubLObject focused = NIL;
        SubLObject exploratory = NIL;
        SubLObject count = ZERO_INTEGER;
        focused = load_leviathan_experiment($str72$haystacks_20050425_focused);
        exploratory = load_leviathan_experiment($str73$haystacks_20050425_exploratory);
        final SubLObject answerable_exploratory = kbq_query_run.kbq_answerable_query_set_run(exploratory);
        SubLObject cdolist_list_var;
        final SubLObject answerable_exploratory_queries = cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(answerable_exploratory);
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = add(count, ONE_INTEGER);
            ke.ke_assert_now(listS($$isa, query, $list74), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            ke.ke_unassert_now(listS($$isa, query, $list60), $$UniversalVocabularyMt);
            ke.ke_unassert_now(listS($$isa, query, $list58), $$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        final SubLObject unanswerable_focused = kbq_query_run.kbq_unanswerable_query_set_run(focused);
        final SubLObject unanswerable_focused_queries = kbq_query_run.kbq_query_set_run_queries(unanswerable_focused);
        SubLObject cdolist_list_var2;
        final SubLObject uncrippled_unanswerable_focused_queries = cdolist_list_var2 = isa.all_instances_among($const75$AutogeneratedLeviathanQuery_Uncri, unanswerable_focused_queries, UNPROVIDED, UNPROVIDED);
        SubLObject query2 = NIL;
        query2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            count = add(count, ONE_INTEGER);
            ke.ke_assert_now(listS($$isa, query2, $list74), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            ke.ke_unassert_now(listS($$isa, query2, $list58), $$UniversalVocabularyMt);
            cdolist_list_var2 = cdolist_list_var2.rest();
            query2 = cdolist_list_var2.first();
        } 
        return count;
    }

    public static SubLObject initialize_kb_content_leviathan_queries() {
        SubLObject count = ZERO_INTEGER;
        final SubLObject deep = load_leviathan_experiment($str76$deep_queries_with_1_backchain);
        final SubLObject deep_required = kbq_query_run.kbq_unanswerable_query_set_run(deep);
        SubLObject cdolist_list_var;
        final SubLObject deep_required_queries = cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(deep_required);
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = add(count, ONE_INTEGER);
            ke.ke_assert_now(listS($$isa, query, $list77), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject determine_leviathan_training_and_blind_sets() {
        return add(new SubLObject[]{ determine_leviathan_training_and_blind_sets_int($$KBContentLeviathanQuery, $$KBContentLeviathanQuery_Training, $$KBContentLeviathanQuery_Blind), determine_leviathan_training_and_blind_sets_int($$HALOLeviathanQuery, $$HALOLeviathanQuery_Training, $$HALOLeviathanQuery_Blind), determine_leviathan_training_and_blind_sets_int($const75$AutogeneratedLeviathanQuery_Uncri, $const82$AutogeneratedLeviathanQuery_Uncri, $const83$AutogeneratedLeviathanQuery_Uncri), determine_leviathan_training_and_blind_sets_int($const84$AutogeneratedLeviathanQuery_Cripp, $const85$AutogeneratedLeviathanQuery_Cripp, $const86$AutogeneratedLeviathanQuery_Cripp) });
    }

    public static SubLObject determine_leviathan_training_and_blind_sets_int(final SubLObject unsorted_col, final SubLObject training_col, final SubLObject blind_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject queries = list_utilities.randomize_list(isa.all_fort_instances(unsorted_col, UNPROVIDED, UNPROVIDED));
        final SubLObject length = length(queries);
        final SubLObject split = round(multiply(length, $float$0_8), UNPROVIDED);
        final SubLObject training_queries = list_utilities.first_n(split, queries);
        final SubLObject blind_queries = list_utilities.last_n(subtract(length, split), queries);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != list_utilities.intersectP(training_queries, blind_queries, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str88$Oops__off_by_one_error_in_first_n);
        }
        SubLObject cdolist_list_var = training_queries;
        SubLObject query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_assert_now(list($$isa, query, training_col), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            ke.ke_unassert_now(list($$isa, query, unsorted_col), $$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        cdolist_list_var = blind_queries;
        query = NIL;
        query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_assert_now(list($$isa, query, blind_col), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            ke.ke_unassert_now(list($$isa, query, unsorted_col), $$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        } 
        return length;
    }

    public static SubLObject unassert_assertion(final SubLObject ass) {
        if (NIL != assertions_high.valid_assertion(ass, UNPROVIDED)) {
            unassert_assertion_via_cyc(ass);
            if (NIL != assertions_high.valid_assertion(ass, UNPROVIDED)) {
                Errors.warn($str89$could_not_unassert__a_at_Cyc_laye, ass);
                unassert_assertion_via_hl(ass);
                if (NIL != assertions_high.valid_assertion(ass, UNPROVIDED)) {
                    Errors.warn($str90$could_not_unassert__a_at_HL, ass);
                    unassert_assertion_via_tms(ass);
                    if (NIL != assertions_high.valid_assertion(ass, UNPROVIDED)) {
                        force_output(UNPROVIDED);
                        Errors.warn($str91$could_not_unassert__a_via_TMS, ass);
                        assertions_high.remove_assertion(ass);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject unassert_assertion_via_cyc(final SubLObject ass) {
        final SubLObject sentence = assertions_high.assertion_formula(ass);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        cyc_kernel.cyc_unassert(sentence, mt);
        return NIL;
    }

    public static SubLObject unassert_assertion_via_hl(final SubLObject ass) {
        final SubLObject cnf = assertions_high.assertion_cnf(ass);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        hl_storage_modules.hl_unassert(cnf, mt);
        return NIL;
    }

    public static SubLObject unassert_assertion_via_tms(final SubLObject ass) {
        tms.tms_remove_assertion(ass);
        return NIL;
    }

    public static SubLObject assert_allowed_rules_for_justified_queries(SubLObject justifications_rabbit_hole) {
        if (justifications_rabbit_hole == UNPROVIDED) {
            justifications_rabbit_hole = load_leviathan_experiment($str92$kb_content_training_justification);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(justifications_rabbit_hole);
        final SubLObject list_var;
        final SubLObject query_runs = list_var = kbq_query_run.kbq_query_set_run_query_runs(answerable);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str93$Asserting_allowed_rules_for_answe, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = NIL;
                query_run = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                    final SubLObject result = kbq_query_run.kbq_query_run_result(query_run);
                    final SubLObject rules = list_utilities.tree_gather(result, $sym94$RULE_ASSERTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject sentence = list($const62$softwareParameterValueInSpecifica, $$InferenceAllowedRulesParameter, bq_cons($$TheList, append(rules, NIL)), query);
                    cyc_kernel.cyc_assert(sentence, $$TestVocabularyMt, UNPROVIDED);
                    count = add(count, ONE_INTEGER);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject allowed_rules_utilities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject utilities = NIL;
        final SubLObject node_var = $$LeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$15 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$15, UNPROVIDED);
                                        while (NIL != node_var_$15) {
                                            final SubLObject tt_node_var = node_var_$15;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$27;
                                                                            for (iteration_state_$27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$27); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next(iteration_state_$27)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$27);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$29;
                                                                                            SubLObject rule;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$29 = rules;
                                                                                                            rule = NIL;
                                                                                                            rule = cdolist_list_var_$29.first();
                                                                                                            while (NIL != cdolist_list_var_$29) {
                                                                                                                utilities = cons(inference_analysis.transformation_rule_historical_utility(rule), utilities);
                                                                                                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                                                                                                rule = cdolist_list_var_$29.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                            if (rules2.isCons()) {
                                                                                                                SubLObject cdolist_list_var_$30 = rules2;
                                                                                                                SubLObject rule2 = NIL;
                                                                                                                rule2 = cdolist_list_var_$30.first();
                                                                                                                while (NIL != cdolist_list_var_$30) {
                                                                                                                    utilities = cons(inference_analysis.transformation_rule_historical_utility(rule2), utilities);
                                                                                                                    cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                                                                                    rule2 = cdolist_list_var_$30.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$27);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject cdolist_list_var_$31;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$31 = rules;
                                                                                                        rule = NIL;
                                                                                                        rule = cdolist_list_var_$31.first();
                                                                                                        while (NIL != cdolist_list_var_$31) {
                                                                                                            utilities = cons(inference_analysis.transformation_rule_historical_utility(rule), utilities);
                                                                                                            cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                                                                                                            rule = cdolist_list_var_$31.first();
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$34 = sol;
                                                                                            SubLObject query2 = NIL;
                                                                                            query2 = csome_list_var_$34.first();
                                                                                            while (NIL != csome_list_var_$34) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$32 = rules2;
                                                                                                            SubLObject rule2 = NIL;
                                                                                                            rule2 = cdolist_list_var_$32.first();
                                                                                                            while (NIL != cdolist_list_var_$32) {
                                                                                                                utilities = cons(inference_analysis.transformation_rule_historical_utility(rule2), utilities);
                                                                                                                cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                                                                                                                rule2 = cdolist_list_var_$32.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$34 = csome_list_var_$34.rest();
                                                                                                query2 = csome_list_var_$34.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$24, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$23, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$33;
                                                            final SubLObject new_list = cdolist_list_var_$33 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$33.first();
                                                            while (NIL != cdolist_list_var_$33) {
                                                                final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        SubLObject rules3;
                                                                        SubLObject cdolist_list_var_$34;
                                                                        SubLObject rule3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(query3)) {
                                                                                    rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                    if (rules3.isCons()) {
                                                                                        cdolist_list_var_$34 = rules3;
                                                                                        rule3 = NIL;
                                                                                        rule3 = cdolist_list_var_$34.first();
                                                                                        while (NIL != cdolist_list_var_$34) {
                                                                                            utilities = cons(inference_analysis.transformation_rule_historical_utility(rule3), utilities);
                                                                                            cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                                                                                            rule3 = cdolist_list_var_$34.first();
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject query4 = NIL;
                                                                            query4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(query4)) {
                                                                                        final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                        if (rules4.isCons()) {
                                                                                            SubLObject cdolist_list_var_$35 = rules4;
                                                                                            SubLObject rule4 = NIL;
                                                                                            rule4 = cdolist_list_var_$35.first();
                                                                                            while (NIL != cdolist_list_var_$35) {
                                                                                                utilities = cons(inference_analysis.transformation_rule_historical_utility(rule4), utilities);
                                                                                                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                                                                                                rule4 = cdolist_list_var_$35.first();
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                query4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$25, thread);
                                                                }
                                                                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                                                generating_fn = cdolist_list_var_$33.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$15);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$28;
                                                                            for (iteration_state_$28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$28); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next(iteration_state_$28)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$28);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$28);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$36;
                                                            final SubLObject new_list2 = cdolist_list_var_$36 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$36.first();
                                                            while (NIL != cdolist_list_var_$36) {
                                                                final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                                }
                                                                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                                                generating_fn2 = cdolist_list_var_$36.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$22, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$15 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$23, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(utilities);
    }

    public static SubLObject allowed_rules_sorted_utility_tuples() {
        SubLObject tuples = NIL;
        SubLObject list_var = NIL;
        SubLObject utility = NIL;
        SubLObject i = NIL;
        list_var = Sort.sort(allowed_rules_utilities(), symbol_function($sym38$_), UNPROVIDED);
        utility = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , utility = list_var.first() , i = add(ONE_INTEGER, i)) {
            tuples = cons(list(i, utility), tuples);
        }
        return nreverse(tuples);
    }

    public static SubLObject skolem_ruleP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.rule_assertionP(v_object)) && (NIL != cycl_utilities.assertion_find_if($sym112$FAST_REIFIED_SKOLEM_, v_object, NIL, UNPROVIDED)));
    }

    public static SubLObject all_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skolem_rules = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Gathering_all_skolem_rules;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$49 = idx;
                if (NIL == id_index_objects_empty_p(idx_$49, $SKIP)) {
                    final SubLObject idx_$50 = idx_$49;
                    if (NIL == id_index_dense_objects_empty_p(idx_$50, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$50);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject rule;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                rule = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != skolem_ruleP(rule)) {
                                    skolem_rules = cons(rule, skolem_rules);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$51 = idx_$49;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$51)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$51);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$51);
                        final SubLObject end_id = id_index_next_id(idx_$51);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != skolem_ruleP(rule2)) {
                                    skolem_rules = cons(rule2, skolem_rules);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(skolem_rules);
    }

    public static SubLObject negative_utility_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skolem_rules = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str115$Gathering_all_negative_utility_sk;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$53 = idx;
                if (NIL == id_index_objects_empty_p(idx_$53, $SKIP)) {
                    final SubLObject idx_$54 = idx_$53;
                    if (NIL == id_index_dense_objects_empty_p(idx_$54, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$54);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject rule;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                rule = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if ((NIL != skolem_ruleP(rule)) && inference_analysis.transformation_rule_historical_utility(rule).isNegative()) {
                                    skolem_rules = cons(rule, skolem_rules);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$55 = idx_$53;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$55)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$55);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$55);
                        final SubLObject end_id = id_index_next_id(idx_$55);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if ((NIL != skolem_ruleP(rule2)) && inference_analysis.transformation_rule_historical_utility(rule2).isNegative()) {
                                    skolem_rules = cons(rule2, skolem_rules);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(skolem_rules);
    }

    public static SubLObject sorted_rule_utilities(final SubLObject rules) {
        return Sort.sort(Mapping.mapcar(TRANSFORMATION_RULE_HISTORICAL_UTILITY, rules), symbol_function($sym38$_), UNPROVIDED);
    }

    public static SubLObject rule_utility_tuples(final SubLObject rules) {
        SubLObject tuples = NIL;
        final SubLObject utilities = sorted_rule_utilities(rules);
        SubLObject list_var = NIL;
        SubLObject utility = NIL;
        SubLObject i = NIL;
        list_var = utilities;
        utility = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , utility = list_var.first() , i = add(ONE_INTEGER, i)) {
            tuples = cons(list(i, utility), tuples);
        }
        return nreverse(tuples);
    }

    public static SubLObject rule_consideration_tuples(final SubLObject rules) {
        SubLObject tuples = NIL;
        final SubLObject considerations = Sort.sort(Mapping.mapcar(TRANSFORMATION_RULE_CONSIDERED_COUNT, rules), symbol_function($sym38$_), UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject count = NIL;
        SubLObject i = NIL;
        list_var = considerations;
        count = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , count = list_var.first() , i = add(ONE_INTEGER, i)) {
            tuples = cons(list(i, count), tuples);
        }
        return nreverse(tuples);
    }

    public static SubLObject rule_success_tuples(final SubLObject rules) {
        SubLObject tuples = NIL;
        final SubLObject successes = Sort.sort(Mapping.mapcar(TRANSFORMATION_RULE_SUCCESS_COUNT, rules), symbol_function($sym38$_), UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject count = NIL;
        SubLObject i = NIL;
        list_var = successes;
        count = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , count = list_var.first() , i = add(ONE_INTEGER, i)) {
            tuples = cons(list(i, count), tuples);
        }
        return nreverse(tuples);
    }

    public static SubLObject skolem_rules_used_in_justified_queries(SubLObject justifications_rabbit_hole) {
        if (justifications_rabbit_hole == UNPROVIDED) {
            justifications_rabbit_hole = load_leviathan_experiment($str92$kb_content_training_justification);
        }
        SubLObject skolem_rules = NIL;
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(justifications_rabbit_hole);
        SubLObject cdolist_list_var;
        final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(answerable);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = kbq_query_run.kbq_query_run_result(query_run);
            SubLObject cdolist_list_var_$57;
            final SubLObject rules = cdolist_list_var_$57 = list_utilities.tree_gather(result, $sym94$RULE_ASSERTION_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject rule = NIL;
            rule = cdolist_list_var_$57.first();
            while (NIL != cdolist_list_var_$57) {
                if (NIL != skolem_ruleP(rule)) {
                    skolem_rules = cons(rule, skolem_rules);
                }
                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                rule = cdolist_list_var_$57.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return nreverse(skolem_rules);
    }

    public static SubLObject skolem_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skolem_rules = NIL;
        final SubLObject node_var = $$LeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$58 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$61 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$62 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$62 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$63 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$58, UNPROVIDED);
                                        while (NIL != node_var_$58) {
                                            final SubLObject tt_node_var = node_var_$58;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$63 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$70;
                                                                            for (iteration_state_$70 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$70); iteration_state_$70 = dictionary_contents.do_dictionary_contents_next(iteration_state_$70)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$70);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$72;
                                                                                            SubLObject rule;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$72 = rules;
                                                                                                            rule = NIL;
                                                                                                            rule = cdolist_list_var_$72.first();
                                                                                                            while (NIL != cdolist_list_var_$72) {
                                                                                                                if (NIL != skolem_ruleP(rule)) {
                                                                                                                    skolem_rules = cons(rule, skolem_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                                                                                                                rule = cdolist_list_var_$72.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                            if (rules2.isCons()) {
                                                                                                                SubLObject cdolist_list_var_$73 = rules2;
                                                                                                                SubLObject rule2 = NIL;
                                                                                                                rule2 = cdolist_list_var_$73.first();
                                                                                                                while (NIL != cdolist_list_var_$73) {
                                                                                                                    if (NIL != skolem_ruleP(rule2)) {
                                                                                                                        skolem_rules = cons(rule2, skolem_rules);
                                                                                                                    }
                                                                                                                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                                                                                                                    rule2 = cdolist_list_var_$73.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$65, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$70);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$64, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject cdolist_list_var_$74;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$74 = rules;
                                                                                                        rule = NIL;
                                                                                                        rule = cdolist_list_var_$74.first();
                                                                                                        while (NIL != cdolist_list_var_$74) {
                                                                                                            if (NIL != skolem_ruleP(rule)) {
                                                                                                                skolem_rules = cons(rule, skolem_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                                                                                                            rule = cdolist_list_var_$74.first();
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$77 = sol;
                                                                                            SubLObject query2 = NIL;
                                                                                            query2 = csome_list_var_$77.first();
                                                                                            while (NIL != csome_list_var_$77) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$75 = rules2;
                                                                                                            SubLObject rule2 = NIL;
                                                                                                            rule2 = cdolist_list_var_$75.first();
                                                                                                            while (NIL != cdolist_list_var_$75) {
                                                                                                                if (NIL != skolem_ruleP(rule2)) {
                                                                                                                    skolem_rules = cons(rule2, skolem_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                                                                                                                rule2 = cdolist_list_var_$75.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$77 = csome_list_var_$77.rest();
                                                                                                query2 = csome_list_var_$77.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$67, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$66, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$76;
                                                            final SubLObject new_list = cdolist_list_var_$76 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$76.first();
                                                            while (NIL != cdolist_list_var_$76) {
                                                                final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        SubLObject rules3;
                                                                        SubLObject cdolist_list_var_$77;
                                                                        SubLObject rule3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(query3)) {
                                                                                    rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                    if (rules3.isCons()) {
                                                                                        cdolist_list_var_$77 = rules3;
                                                                                        rule3 = NIL;
                                                                                        rule3 = cdolist_list_var_$77.first();
                                                                                        while (NIL != cdolist_list_var_$77) {
                                                                                            if (NIL != skolem_ruleP(rule3)) {
                                                                                                skolem_rules = cons(rule3, skolem_rules);
                                                                                            }
                                                                                            cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                                                                                            rule3 = cdolist_list_var_$77.first();
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject query4 = NIL;
                                                                            query4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(query4)) {
                                                                                        final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                        if (rules4.isCons()) {
                                                                                            SubLObject cdolist_list_var_$78 = rules4;
                                                                                            SubLObject rule4 = NIL;
                                                                                            rule4 = cdolist_list_var_$78.first();
                                                                                            while (NIL != cdolist_list_var_$78) {
                                                                                                if (NIL != skolem_ruleP(rule4)) {
                                                                                                    skolem_rules = cons(rule4, skolem_rules);
                                                                                                }
                                                                                                cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                                                                                                rule4 = cdolist_list_var_$78.first();
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                query4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$68, thread);
                                                                }
                                                                cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                                                                generating_fn = cdolist_list_var_$76.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$64, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$63, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$69 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$58);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$71;
                                                                            for (iteration_state_$71 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$71); iteration_state_$71 = dictionary_contents.do_dictionary_contents_next(iteration_state_$71)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$71);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$71, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$71);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$70, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$79;
                                                            final SubLObject new_list2 = cdolist_list_var_$79 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$79.first();
                                                            while (NIL != cdolist_list_var_$79) {
                                                                final SubLObject _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$72, thread);
                                                                }
                                                                cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                                                                generating_fn2 = cdolist_list_var_$79.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$65, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$69, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$58 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$66, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$63, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$62, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$62, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$61, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$61, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$60, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$59, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(skolem_rules);
    }

    public static SubLObject kill_all_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject skolem_rules = list_var = all_skolem_rules();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject rule = NIL;
                rule = csome_list_var.first();
                while (NIL != csome_list_var) {
                    unassert_assertion(rule);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    rule = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return length(skolem_rules);
    }

    public static SubLObject kill_all_negative_utility_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject skolem_rules = list_var = negative_utility_skolem_rules();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject rule = NIL;
                rule = csome_list_var.first();
                while (NIL != csome_list_var) {
                    unassert_assertion(rule);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    rule = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return length(skolem_rules);
    }

    public static SubLObject inert_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inert_rules = NIL;
        final SubLObject message_var = $$$mapping_Cyc_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        sofar = add(sofar, ONE_INTEGER);
                        note_percent_progress(sofar, total);
                        if (NIL != inert_ruleP(rule)) {
                            inert_rules = cons(rule, inert_rules);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(inert_rules);
    }

    public static SubLObject inert_ruleP(final SubLObject rule) {
        if ((inference_analysis.transformation_rule_considered_count(rule).isZero() && (NIL == assertions_high.forward_ruleP(rule))) && (NIL == assertion_has_non_skolem_assertion_dependentsP(rule))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject assertion_has_non_skolem_assertion_dependentsP(final SubLObject assertion) {
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                if (NIL == deduction_handles.deduction_p(deduction)) {
                    return T;
                }
                if (NIL == assertion_utilities.gaf_assertion_with_pred_p(deductions_high.deduction_supported_object(deduction), $$skolem)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject kill_all_inert_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject inert_rules = cdolist_list_var = inert_rules();
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            eval($list122);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            unassert_assertion(rule);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str125$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return length(inert_rules);
    }

    public static SubLObject rules_that_totally_suck() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sucky_rules = NIL;
        final SubLObject message_var = $$$mapping_Cyc_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        sofar = add(sofar, ONE_INTEGER);
                        note_percent_progress(sofar, total);
                        if ((((NIL != never_successful_ruleP(rule)) && inference_analysis.transformation_rule_considered_count(rule).isPositive()) && (NIL == assertions_high.forward_ruleP(rule))) && (NIL == assertion_has_non_skolem_assertion_dependentsP(rule))) {
                            sucky_rules = cons(rule, sucky_rules);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(sucky_rules);
    }

    public static SubLObject kill_all_rules_that_totally_suck() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject sucky_rules = cdolist_list_var = rules_that_totally_suck();
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            eval($list122);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            unassert_assertion(rule);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str125$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return length(sucky_rules);
    }

    public static SubLObject never_successful_ruleP(final SubLObject rule) {
        return zerop(inference_analysis.transformation_rule_success_count(rule));
    }

    public static SubLObject successful_ruleP(final SubLObject rule) {
        return plusp(inference_analysis.transformation_rule_success_count(rule));
    }

    public static SubLObject never_considered_ruleP(final SubLObject rule) {
        return zerop(inference_analysis.transformation_rule_considered_count(rule));
    }

    public static SubLObject considered_ruleP(final SubLObject rule) {
        return plusp(inference_analysis.transformation_rule_considered_count(rule));
    }

    public static SubLObject considered_but_not_successful_ruleP(final SubLObject rule) {
        return makeBoolean((NIL != considered_ruleP(rule)) && (NIL == successful_ruleP(rule)));
    }

    public static SubLObject leviathan_rule_statistics(final SubLObject separate_out_skolemsP) {
        final SubLObject all_rules = kb_utilities.all_rules();
        final SubLObject skolem_rules = all_skolem_rules();
        final SubLObject negative_utility_skolem_rules = negative_utility_skolem_rules();
        final SubLObject inert_rules = inert_rules();
        final SubLObject sucky_rules = rules_that_totally_suck();
        return leviathan_rule_statistics_int(all_rules, skolem_rules, negative_utility_skolem_rules, inert_rules, sucky_rules, separate_out_skolemsP);
    }

    public static SubLObject rule_analysis_L(final SubLObject analysis1, final SubLObject analysis2) {
        return list_utilities.position_L(analysis1, analysis2, $sorted_rule_analyses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject leviathan_rule_statistics_int(final SubLObject all_rules, final SubLObject skolem_rules, final SubLObject negative_utility_skolem_rules, final SubLObject inert_rules, final SubLObject sucky_rules, final SubLObject separate_out_skolemsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = NIL;
        final SubLObject skolem_rules_set = set_utilities.construct_set_from_list(skolem_rules, symbol_function(EQ), UNPROVIDED);
        final SubLObject negative_utility_skolem_rules_set = set_utilities.construct_set_from_list(negative_utility_skolem_rules, symbol_function(EQ), UNPROVIDED);
        final SubLObject inert_rules_set = set_utilities.construct_set_from_list(inert_rules, symbol_function(EQ), UNPROVIDED);
        final SubLObject sucky_rules_set = set_utilities.construct_set_from_list(sucky_rules, symbol_function(EQ), UNPROVIDED);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(all_rules), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = all_rules;
                SubLObject rule = NIL;
                rule = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject skolem_ruleP = set.set_memberP(rule, skolem_rules_set);
                    final SubLObject negative_utility_skolem_ruleP = set.set_memberP(rule, negative_utility_skolem_rules_set);
                    final SubLObject inert_ruleP = set.set_memberP(rule, inert_rules_set);
                    final SubLObject sucky_ruleP = set.set_memberP(rule, sucky_rules_set);
                    SubLObject analysis = NIL;
                    if (((NIL != separate_out_skolemsP) && (NIL != negative_utility_skolem_ruleP)) && (NIL != sucky_ruleP)) {
                        analysis = $SUCKY_SKOLEM_RULE;
                    } else
                        if ((NIL != separate_out_skolemsP) && (NIL != negative_utility_skolem_ruleP)) {
                            analysis = $NEGATIVE_UTILITY_SKOLEM_RULE;
                        } else
                            if (((NIL != separate_out_skolemsP) && (NIL != skolem_ruleP)) && (NIL != inert_ruleP)) {
                                analysis = $INERT_SKOLEM_RULE;
                            } else
                                if ((NIL != separate_out_skolemsP) && (NIL != skolem_ruleP)) {
                                    if (NIL != successful_ruleP(rule)) {
                                        analysis = $SUCCESSFUL_SKOLEM_RULE;
                                    } else
                                        if (NIL != assertions_high.forward_ruleP(rule)) {
                                            analysis = $NEVER_CONSIDERED_FORWARD_SKOLEM_RULE;
                                        } else {
                                            analysis = $NEVER_CONSIDERED_BACKWARD_SKOLEM_RULE;
                                        }

                                } else
                                    if (NIL != inert_ruleP) {
                                        analysis = $INERT_RULE;
                                    } else
                                        if (NIL != sucky_ruleP) {
                                            analysis = $SUCKY_RULE;
                                        } else
                                            if (NIL != successful_ruleP(rule)) {
                                                if (NIL != assertions_high.forward_ruleP(rule)) {
                                                    analysis = $BACKWARD_SUCCESSFUL_FORWARD_RULE;
                                                } else {
                                                    analysis = $BACKWARD_SUCCESSFUL_BACKWARD_RULE;
                                                }
                                            } else
                                                if (NIL != assertions_high.forward_ruleP(rule)) {
                                                    if (NIL != assertions_high.assertion_has_dependents_p(rule)) {
                                                        analysis = $SUCCESSFUL_FORWARD_RULE;
                                                    } else {
                                                        analysis = $UNSUCCESSFUL_FORWARD_RULE;
                                                    }
                                                } else
                                                    if (NIL != assertions_high.assertion_has_dependents_p(rule)) {
                                                        analysis = $UNSUCCESSFUL_BACKWARD_RULE_WITH_DEPENDENTS;
                                                    } else {
                                                        analysis = $OTHER;
                                                    }








                    alist = cons(cons(rule, analysis), alist);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    rule = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return nreverse(alist);
    }

    public static SubLObject leviathan_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = NIL;
        final SubLObject node_var = $$LeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$97 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$98 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$99 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$100 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$102 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$105 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$97, UNPROVIDED);
                                        while (NIL != node_var_$97) {
                                            final SubLObject tt_node_var = node_var_$97;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$102 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$103 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$103 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$109;
                                                                            for (iteration_state_$109 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$109); iteration_state_$109 = dictionary_contents.do_dictionary_contents_next(iteration_state_$109)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$109);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$104 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$111;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$111 = rules;
                                                                                                            rule = NIL;
                                                                                                            rule = cdolist_list_var_$111.first();
                                                                                                            while (NIL != cdolist_list_var_$111) {
                                                                                                                item_var = rule;
                                                                                                                if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$111 = cdolist_list_var_$111.rest();
                                                                                                                rule = cdolist_list_var_$111.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                            if (rules2.isCons()) {
                                                                                                                SubLObject cdolist_list_var_$112 = rules2;
                                                                                                                SubLObject rule2 = NIL;
                                                                                                                rule2 = cdolist_list_var_$112.first();
                                                                                                                while (NIL != cdolist_list_var_$112) {
                                                                                                                    final SubLObject item_var2 = rule2;
                                                                                                                    if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                        allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                    }
                                                                                                                    cdolist_list_var_$112 = cdolist_list_var_$112.rest();
                                                                                                                    rule2 = cdolist_list_var_$112.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$104, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$109);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$103, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$113;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$113 = rules;
                                                                                                        rule = NIL;
                                                                                                        rule = cdolist_list_var_$113.first();
                                                                                                        while (NIL != cdolist_list_var_$113) {
                                                                                                            item_var = rule;
                                                                                                            if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                allowed_rules = cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                                                                                                            rule = cdolist_list_var_$113.first();
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$116 = sol;
                                                                                            SubLObject query2 = NIL;
                                                                                            query2 = csome_list_var_$116.first();
                                                                                            while (NIL != csome_list_var_$116) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$114 = rules2;
                                                                                                            SubLObject rule2 = NIL;
                                                                                                            rule2 = cdolist_list_var_$114.first();
                                                                                                            while (NIL != cdolist_list_var_$114) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$114 = cdolist_list_var_$114.rest();
                                                                                                                rule2 = cdolist_list_var_$114.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$116 = csome_list_var_$116.rest();
                                                                                                query2 = csome_list_var_$116.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$106, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$105, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$115;
                                                            final SubLObject new_list = cdolist_list_var_$115 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$115.first();
                                                            while (NIL != cdolist_list_var_$115) {
                                                                final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        SubLObject rules3;
                                                                        SubLObject cdolist_list_var_$116;
                                                                        SubLObject rule3;
                                                                        SubLObject item_var3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(query3)) {
                                                                                    rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                    if (rules3.isCons()) {
                                                                                        cdolist_list_var_$116 = rules3;
                                                                                        rule3 = NIL;
                                                                                        rule3 = cdolist_list_var_$116.first();
                                                                                        while (NIL != cdolist_list_var_$116) {
                                                                                            item_var3 = rule3;
                                                                                            if (NIL == member(item_var3, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                allowed_rules = cons(item_var3, allowed_rules);
                                                                                            }
                                                                                            cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                                                            rule3 = cdolist_list_var_$116.first();
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject query4 = NIL;
                                                                            query4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(query4)) {
                                                                                        final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                        if (rules4.isCons()) {
                                                                                            SubLObject cdolist_list_var_$117 = rules4;
                                                                                            SubLObject rule4 = NIL;
                                                                                            rule4 = cdolist_list_var_$117.first();
                                                                                            while (NIL != cdolist_list_var_$117) {
                                                                                                final SubLObject item_var4 = rule4;
                                                                                                if (NIL == member(item_var4, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                    allowed_rules = cons(item_var4, allowed_rules);
                                                                                                }
                                                                                                cdolist_list_var_$117 = cdolist_list_var_$117.rest();
                                                                                                rule4 = cdolist_list_var_$117.first();
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                query4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$107, thread);
                                                                }
                                                                cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                                                                generating_fn = cdolist_list_var_$115.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$103, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$102, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$108 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$97);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$109 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$110;
                                                                            for (iteration_state_$110 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$110); iteration_state_$110 = dictionary_contents.do_dictionary_contents_next(iteration_state_$110)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$110);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$110, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$110);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$109, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$118;
                                                            final SubLObject new_list2 = cdolist_list_var_$118 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$118.first();
                                                            while (NIL != cdolist_list_var_$118) {
                                                                final SubLObject _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$111, thread);
                                                                }
                                                                cdolist_list_var_$118 = cdolist_list_var_$118.rest();
                                                                generating_fn2 = cdolist_list_var_$118.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$104, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$108, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$97 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$105, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$102, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$101, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$101, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$100, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$100, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$99, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$98, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(allowed_rules);
    }

    public static SubLObject leviathan_kb_content_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = NIL;
        final SubLObject node_var = $$KBContentLeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$131 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$132 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$133 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$134 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$135 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$135 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$136 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$139 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$131, UNPROVIDED);
                                        while (NIL != node_var_$131) {
                                            final SubLObject tt_node_var = node_var_$131;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$136 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$137 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$143;
                                                                            for (iteration_state_$143 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$143); iteration_state_$143 = dictionary_contents.do_dictionary_contents_next(iteration_state_$143)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$143);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$138 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$145;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$145 = rules;
                                                                                                            rule = NIL;
                                                                                                            rule = cdolist_list_var_$145.first();
                                                                                                            while (NIL != cdolist_list_var_$145) {
                                                                                                                item_var = rule;
                                                                                                                if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$145 = cdolist_list_var_$145.rest();
                                                                                                                rule = cdolist_list_var_$145.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                            if (rules2.isCons()) {
                                                                                                                SubLObject cdolist_list_var_$146 = rules2;
                                                                                                                SubLObject rule2 = NIL;
                                                                                                                rule2 = cdolist_list_var_$146.first();
                                                                                                                while (NIL != cdolist_list_var_$146) {
                                                                                                                    final SubLObject item_var2 = rule2;
                                                                                                                    if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                        allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                    }
                                                                                                                    cdolist_list_var_$146 = cdolist_list_var_$146.rest();
                                                                                                                    rule2 = cdolist_list_var_$146.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$138, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$143);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$137, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$139 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$140 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$147;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$147 = rules;
                                                                                                        rule = NIL;
                                                                                                        rule = cdolist_list_var_$147.first();
                                                                                                        while (NIL != cdolist_list_var_$147) {
                                                                                                            item_var = rule;
                                                                                                            if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                allowed_rules = cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$147 = cdolist_list_var_$147.rest();
                                                                                                            rule = cdolist_list_var_$147.first();
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$150 = sol;
                                                                                            SubLObject query2 = NIL;
                                                                                            query2 = csome_list_var_$150.first();
                                                                                            while (NIL != csome_list_var_$150) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$148 = rules2;
                                                                                                            SubLObject rule2 = NIL;
                                                                                                            rule2 = cdolist_list_var_$148.first();
                                                                                                            while (NIL != cdolist_list_var_$148) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                                                                                                                rule2 = cdolist_list_var_$148.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$150 = csome_list_var_$150.rest();
                                                                                                query2 = csome_list_var_$150.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$140, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$139, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$149;
                                                            final SubLObject new_list = cdolist_list_var_$149 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$149.first();
                                                            while (NIL != cdolist_list_var_$149) {
                                                                final SubLObject _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        SubLObject rules3;
                                                                        SubLObject cdolist_list_var_$150;
                                                                        SubLObject rule3;
                                                                        SubLObject item_var3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(query3)) {
                                                                                    rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                    if (rules3.isCons()) {
                                                                                        cdolist_list_var_$150 = rules3;
                                                                                        rule3 = NIL;
                                                                                        rule3 = cdolist_list_var_$150.first();
                                                                                        while (NIL != cdolist_list_var_$150) {
                                                                                            item_var3 = rule3;
                                                                                            if (NIL == member(item_var3, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                allowed_rules = cons(item_var3, allowed_rules);
                                                                                            }
                                                                                            cdolist_list_var_$150 = cdolist_list_var_$150.rest();
                                                                                            rule3 = cdolist_list_var_$150.first();
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject query4 = NIL;
                                                                            query4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(query4)) {
                                                                                        final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                        if (rules4.isCons()) {
                                                                                            SubLObject cdolist_list_var_$151 = rules4;
                                                                                            SubLObject rule4 = NIL;
                                                                                            rule4 = cdolist_list_var_$151.first();
                                                                                            while (NIL != cdolist_list_var_$151) {
                                                                                                final SubLObject item_var4 = rule4;
                                                                                                if (NIL == member(item_var4, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                    allowed_rules = cons(item_var4, allowed_rules);
                                                                                                }
                                                                                                cdolist_list_var_$151 = cdolist_list_var_$151.rest();
                                                                                                rule4 = cdolist_list_var_$151.first();
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                query4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$141, thread);
                                                                }
                                                                cdolist_list_var_$149 = cdolist_list_var_$149.rest();
                                                                generating_fn = cdolist_list_var_$149.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$137, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$136, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$142 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$131);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$143 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$144;
                                                                            for (iteration_state_$144 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$144); iteration_state_$144 = dictionary_contents.do_dictionary_contents_next(iteration_state_$144)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$144);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$144 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$144, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$144);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$143, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$152;
                                                            final SubLObject new_list2 = cdolist_list_var_$152 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$152.first();
                                                            while (NIL != cdolist_list_var_$152) {
                                                                final SubLObject _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$145, thread);
                                                                }
                                                                cdolist_list_var_$152 = cdolist_list_var_$152.rest();
                                                                generating_fn2 = cdolist_list_var_$152.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$138, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$142, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$131 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$139, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$136, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$135, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$135, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$134, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$134, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$133, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$146 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$132, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$147 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(allowed_rules);
    }

    public static SubLObject leviathan_haystack_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = NIL;
        final SubLObject node_var = $const141$AutogeneratedLeviathanQuery_Train;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$165 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$166 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$167 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$168 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$168 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$169 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$169 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$170 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$173 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$165, UNPROVIDED);
                                        while (NIL != node_var_$165) {
                                            final SubLObject tt_node_var = node_var_$165;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$170 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$171 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$171 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$177;
                                                                            for (iteration_state_$177 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$177); iteration_state_$177 = dictionary_contents.do_dictionary_contents_next(iteration_state_$177)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$177);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$172 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$179;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$179 = rules;
                                                                                                            rule = NIL;
                                                                                                            rule = cdolist_list_var_$179.first();
                                                                                                            while (NIL != cdolist_list_var_$179) {
                                                                                                                item_var = rule;
                                                                                                                if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$179 = cdolist_list_var_$179.rest();
                                                                                                                rule = cdolist_list_var_$179.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                            if (rules2.isCons()) {
                                                                                                                SubLObject cdolist_list_var_$180 = rules2;
                                                                                                                SubLObject rule2 = NIL;
                                                                                                                rule2 = cdolist_list_var_$180.first();
                                                                                                                while (NIL != cdolist_list_var_$180) {
                                                                                                                    final SubLObject item_var2 = rule2;
                                                                                                                    if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                        allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                    }
                                                                                                                    cdolist_list_var_$180 = cdolist_list_var_$180.rest();
                                                                                                                    rule2 = cdolist_list_var_$180.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$172, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$177);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$171, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$173 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$174 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$181;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$181 = rules;
                                                                                                        rule = NIL;
                                                                                                        rule = cdolist_list_var_$181.first();
                                                                                                        while (NIL != cdolist_list_var_$181) {
                                                                                                            item_var = rule;
                                                                                                            if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                allowed_rules = cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$181 = cdolist_list_var_$181.rest();
                                                                                                            rule = cdolist_list_var_$181.first();
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$184 = sol;
                                                                                            SubLObject query2 = NIL;
                                                                                            query2 = csome_list_var_$184.first();
                                                                                            while (NIL != csome_list_var_$184) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$182 = rules2;
                                                                                                            SubLObject rule2 = NIL;
                                                                                                            rule2 = cdolist_list_var_$182.first();
                                                                                                            while (NIL != cdolist_list_var_$182) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$182 = cdolist_list_var_$182.rest();
                                                                                                                rule2 = cdolist_list_var_$182.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$184 = csome_list_var_$184.rest();
                                                                                                query2 = csome_list_var_$184.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$174, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$173, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$183;
                                                            final SubLObject new_list = cdolist_list_var_$183 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$183.first();
                                                            while (NIL != cdolist_list_var_$183) {
                                                                final SubLObject _prev_bind_0_$175 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        SubLObject rules3;
                                                                        SubLObject cdolist_list_var_$184;
                                                                        SubLObject rule3;
                                                                        SubLObject item_var3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(query3)) {
                                                                                    rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                    if (rules3.isCons()) {
                                                                                        cdolist_list_var_$184 = rules3;
                                                                                        rule3 = NIL;
                                                                                        rule3 = cdolist_list_var_$184.first();
                                                                                        while (NIL != cdolist_list_var_$184) {
                                                                                            item_var3 = rule3;
                                                                                            if (NIL == member(item_var3, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                allowed_rules = cons(item_var3, allowed_rules);
                                                                                            }
                                                                                            cdolist_list_var_$184 = cdolist_list_var_$184.rest();
                                                                                            rule3 = cdolist_list_var_$184.first();
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject query4 = NIL;
                                                                            query4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(query4)) {
                                                                                        final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                        if (rules4.isCons()) {
                                                                                            SubLObject cdolist_list_var_$185 = rules4;
                                                                                            SubLObject rule4 = NIL;
                                                                                            rule4 = cdolist_list_var_$185.first();
                                                                                            while (NIL != cdolist_list_var_$185) {
                                                                                                final SubLObject item_var4 = rule4;
                                                                                                if (NIL == member(item_var4, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                    allowed_rules = cons(item_var4, allowed_rules);
                                                                                                }
                                                                                                cdolist_list_var_$185 = cdolist_list_var_$185.rest();
                                                                                                rule4 = cdolist_list_var_$185.first();
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                query4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$175, thread);
                                                                }
                                                                cdolist_list_var_$183 = cdolist_list_var_$183.rest();
                                                                generating_fn = cdolist_list_var_$183.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$171, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$170, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$176 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$172 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$165);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$177 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$178;
                                                                            for (iteration_state_$178 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$178); iteration_state_$178 = dictionary_contents.do_dictionary_contents_next(iteration_state_$178)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$178);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$178 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$178, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$178);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$177, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$186;
                                                            final SubLObject new_list2 = cdolist_list_var_$186 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$186.first();
                                                            while (NIL != cdolist_list_var_$186) {
                                                                final SubLObject _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$179, thread);
                                                                }
                                                                cdolist_list_var_$186 = cdolist_list_var_$186.rest();
                                                                generating_fn2 = cdolist_list_var_$186.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$172, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$176, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$165 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$173, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$170, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$169, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$169, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$168, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$168, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$167, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$180 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$180, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$166, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$181 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$181, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(allowed_rules);
    }

    public static SubLObject leviathan_haystack_all_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = NIL;
        final SubLObject node_var = $$AutogeneratedLeviathanQuery;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$199 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$200 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$201 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$202 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str102$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$202 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$203 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$203 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$204 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$207 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$199, UNPROVIDED);
                                        while (NIL != node_var_$199) {
                                            final SubLObject tt_node_var = node_var_$199;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$204 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$205 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$205 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$211;
                                                                            for (iteration_state_$211 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$211); iteration_state_$211 = dictionary_contents.do_dictionary_contents_next(iteration_state_$211)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$211);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$206 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$213;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$213 = rules;
                                                                                                            rule = NIL;
                                                                                                            rule = cdolist_list_var_$213.first();
                                                                                                            while (NIL != cdolist_list_var_$213) {
                                                                                                                item_var = rule;
                                                                                                                if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$213 = cdolist_list_var_$213.rest();
                                                                                                                rule = cdolist_list_var_$213.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                            if (rules2.isCons()) {
                                                                                                                SubLObject cdolist_list_var_$214 = rules2;
                                                                                                                SubLObject rule2 = NIL;
                                                                                                                rule2 = cdolist_list_var_$214.first();
                                                                                                                while (NIL != cdolist_list_var_$214) {
                                                                                                                    final SubLObject item_var2 = rule2;
                                                                                                                    if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                        allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                    }
                                                                                                                    cdolist_list_var_$214 = cdolist_list_var_$214.rest();
                                                                                                                    rule2 = cdolist_list_var_$214.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$206, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$211);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$205, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$207 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$208 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$215;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$215 = rules;
                                                                                                        rule = NIL;
                                                                                                        rule = cdolist_list_var_$215.first();
                                                                                                        while (NIL != cdolist_list_var_$215) {
                                                                                                            item_var = rule;
                                                                                                            if (NIL == member(item_var, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                allowed_rules = cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$215 = cdolist_list_var_$215.rest();
                                                                                                            rule = cdolist_list_var_$215.first();
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$218 = sol;
                                                                                            SubLObject query2 = NIL;
                                                                                            query2 = csome_list_var_$218.first();
                                                                                            while (NIL != csome_list_var_$218) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$216 = rules2;
                                                                                                            SubLObject rule2 = NIL;
                                                                                                            rule2 = cdolist_list_var_$216.first();
                                                                                                            while (NIL != cdolist_list_var_$216) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (NIL == member(item_var2, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                    allowed_rules = cons(item_var2, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$216 = cdolist_list_var_$216.rest();
                                                                                                                rule2 = cdolist_list_var_$216.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$218 = csome_list_var_$218.rest();
                                                                                                query2 = csome_list_var_$218.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$208, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$207, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$217;
                                                            final SubLObject new_list = cdolist_list_var_$217 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$217.first();
                                                            while (NIL != cdolist_list_var_$217) {
                                                                final SubLObject _prev_bind_0_$209 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        SubLObject rules3;
                                                                        SubLObject cdolist_list_var_$218;
                                                                        SubLObject rule3;
                                                                        SubLObject item_var3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(query3)) {
                                                                                    rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                    if (rules3.isCons()) {
                                                                                        cdolist_list_var_$218 = rules3;
                                                                                        rule3 = NIL;
                                                                                        rule3 = cdolist_list_var_$218.first();
                                                                                        while (NIL != cdolist_list_var_$218) {
                                                                                            item_var3 = rule3;
                                                                                            if (NIL == member(item_var3, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                allowed_rules = cons(item_var3, allowed_rules);
                                                                                            }
                                                                                            cdolist_list_var_$218 = cdolist_list_var_$218.rest();
                                                                                            rule3 = cdolist_list_var_$218.first();
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject query4 = NIL;
                                                                            query4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(query4)) {
                                                                                        final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                        if (rules4.isCons()) {
                                                                                            SubLObject cdolist_list_var_$219 = rules4;
                                                                                            SubLObject rule4 = NIL;
                                                                                            rule4 = cdolist_list_var_$219.first();
                                                                                            while (NIL != cdolist_list_var_$219) {
                                                                                                final SubLObject item_var4 = rule4;
                                                                                                if (NIL == member(item_var4, allowed_rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                    allowed_rules = cons(item_var4, allowed_rules);
                                                                                                }
                                                                                                cdolist_list_var_$219 = cdolist_list_var_$219.rest();
                                                                                                rule4 = cdolist_list_var_$219.first();
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                query4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$209, thread);
                                                                }
                                                                cdolist_list_var_$217 = cdolist_list_var_$217.rest();
                                                                generating_fn = cdolist_list_var_$217.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$205, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$204, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$210 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$206 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$199);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$211 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$212;
                                                                            for (iteration_state_$212 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$212); iteration_state_$212 = dictionary_contents.do_dictionary_contents_next(iteration_state_$212)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$212);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$212 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$212, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$212);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$211, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str109$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$220;
                                                            final SubLObject new_list2 = cdolist_list_var_$220 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$220.first();
                                                            while (NIL != cdolist_list_var_$220) {
                                                                final SubLObject _prev_bind_0_$213 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$213, thread);
                                                                }
                                                                cdolist_list_var_$220 = cdolist_list_var_$220.rest();
                                                                generating_fn2 = cdolist_list_var_$220.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$206, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$210, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$199 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$207, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$204, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$203, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$203, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$202, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$202, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$201, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$214 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$214, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$200, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$215 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$215, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(allowed_rules);
    }

    public static SubLObject conditional_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queries = NIL;
        final SubLObject list_var = isa.all_fort_instances($$CycLQuerySpecification, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query = NIL;
                query = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject sentence = kb_query.kbq_sentences(query).first();
                    if (NIL != el_implication_p(sentence)) {
                        final SubLObject v_properties = kb_query.kbq_query_properties(query);
                        final SubLObject conditionalP = getf(v_properties, $kw143$CONDITIONAL_SENTENCE_, UNPROVIDED);
                        if (NIL != conditionalP) {
                            queries = cons(query, queries);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$233 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$233, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return nreverse(queries);
    }

    public static SubLObject queries_that_probably_ought_to_be_conditional() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queries = NIL;
        final SubLObject list_var = isa.all_fort_instances($$CycLQuerySpecification, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query = NIL;
                query = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject sentence = kb_query.kbq_sentences(query).first();
                    thread.resetMultipleValues();
                    final SubLObject right_sentence = czer_utilities.unwrap_if_ist_permissive(sentence, $$BaseKB);
                    final SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != el_implication_p(right_sentence)) {
                        final SubLObject v_properties = kb_query.kbq_query_properties(query);
                        final SubLObject conditionalP = getf(v_properties, $kw143$CONDITIONAL_SENTENCE_, UNPROVIDED);
                        if (NIL == conditionalP) {
                            queries = cons(query, queries);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$234 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$234, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return nreverse(queries);
    }

    public static SubLObject fix_queries_that_probably_ought_to_be_conditional() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject queries = list_var = queries_that_probably_ought_to_be_conditional();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query = NIL;
                query = csome_list_var.first();
                while (NIL != csome_list_var) {
                    ke.ke_assert_now(list($const62$softwareParameterValueInSpecifica, $const145$InferenceConditionalSentenceParam, $$True, query), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$235 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$235, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return length(queries);
    }

    public static SubLObject rule_bindings_to_closed_summary(SubLObject rule_bindings_to_closed) {
        if (rule_bindings_to_closed == UNPROVIDED) {
            rule_bindings_to_closed = load_leviathan_experiment($str147$pre_halo_training_rule_bindings_t);
        }
        SubLObject bound_rule_count = ZERO_INTEGER;
        SubLObject unbound_rule_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(rule_bindings_to_closed);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$236;
            final SubLObject triples = cdolist_list_var_$236 = kbq_query_run.kbq_extract_query_run_metric_value(query_run, $TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, UNPROVIDED);
            SubLObject triple = NIL;
            triple = cdolist_list_var_$236.first();
            while (NIL != cdolist_list_var_$236) {
                SubLObject current;
                final SubLObject datum = current = triple;
                SubLObject rule = NIL;
                SubLObject v_bindings = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current, datum, $list149);
                rule = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list149);
                v_bindings = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list149);
                mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != v_bindings) {
                        bound_rule_count = add(bound_rule_count, ONE_INTEGER);
                    } else {
                        unbound_rule_count = add(unbound_rule_count, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list149);
                }
                cdolist_list_var_$236 = cdolist_list_var_$236.rest();
                triple = cdolist_list_var_$236.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return values(bound_rule_count, unbound_rule_count, add(bound_rule_count, unbound_rule_count));
    }

    public static SubLObject rule_bindings_wffP(final SubLObject rule, final SubLObject v_bindings, final SubLObject mt) {
        final SubLObject open_sentence = assertions_high.assertion_formula(rule);
        final SubLObject partially_bound_sentence = bindings.apply_bindings(unification.variable_base_inversion(v_bindings), open_sentence);
        return wff.el_wffP(partially_bound_sentence, mt, UNPROVIDED);
    }

    public static SubLObject rule_bindings_wff_analysis(SubLObject rule_bindings_to_closed) {
        if (rule_bindings_to_closed == UNPROVIDED) {
            rule_bindings_to_closed = load_leviathan_experiment($str147$pre_halo_training_rule_bindings_t);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ill_formed_triples = NIL;
        final SubLObject list_var = kbq_query_run.kbq_query_set_run_query_runs(rule_bindings_to_closed);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = NIL;
                query_run = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject triples = cdolist_list_var = kbq_query_run.kbq_extract_query_run_metric_value(query_run, $TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, UNPROVIDED);
                    SubLObject triple = NIL;
                    triple = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = triple;
                        SubLObject rule = NIL;
                        SubLObject v_bindings = NIL;
                        SubLObject mt = NIL;
                        destructuring_bind_must_consp(current, datum, $list149);
                        rule = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list149);
                        v_bindings = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list149);
                        mt = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != v_bindings) {
                                final SubLObject wffP = rule_bindings_wffP(rule, v_bindings, mt);
                                if (NIL == wffP) {
                                    ill_formed_triples = cons(triple, ill_formed_triples);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list149);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        triple = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$237 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$237, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return nreverse(ill_formed_triples);
    }

    public static SubLObject initialize_rule_bindings_wff_table(SubLObject wff_analysis) {
        if (wff_analysis == UNPROVIDED) {
            wff_analysis = cfasl_utilities.cfasl_load($str151$_cyc_projects_inference_leviathan);
        }
        final SubLObject table = make_hash_table(length(wff_analysis), symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = wff_analysis;
        SubLObject triple = NIL;
        triple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = triple;
            SubLObject rule = NIL;
            SubLObject v_bindings = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list149);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list149);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject v_set = gethash_without_values(rule, table, UNPROVIDED);
                if (NIL == v_set) {
                    v_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                }
                set.set_add(cons(mt, v_bindings), v_set);
                sethash(rule, table, v_set);
            } else {
                cdestructuring_bind_error(datum, $list149);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        } 
        $rule_bindings_wff_table$.setGlobalValue(table);
        return table;
    }

    public static SubLObject rule_bindings_wff_cachedP(final SubLObject rule, final SubLObject transformation_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $rule_bindings_wff_table$.getGlobalValue()) {
            final SubLObject v_set = gethash_without_values(rule, $rule_bindings_wff_table$.getGlobalValue(), UNPROVIDED);
            if (NIL != v_set) {
                final SubLObject rule_bindings_to_closed = inference_worker_transformation.transformation_rule_bindings_to_closed(transformation_bindings);
                if ((NIL != set.set_memberP(cons(mt, rule_bindings_to_closed), v_set)) && (NIL != $rule_bindings_to_closed_wff_pruning_enabledP$.getDynamicValue(thread))) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject leviathan_generate_answerable_vs_unanswerable_comparison(final SubLObject query_set_run, final SubLObject property) {
        return plot_generation.kbq_generate_answerable_vs_unanswerable_comparison(query_set_run, property, list($kw152$LOGSCALE_Y_, T, $YLABEL, string_utilities.str(property), $PLOT_TITLE, cconcatenate($str155$Answerable_vs__Unanswerable_, format_nil.format_nil_s_no_copy(property))), UNPROVIDED);
    }

    public static SubLObject generate_all_leviathan_answerable_vs_unanswerable_comparisons(final SubLObject query_set_run) {
        SubLObject cdolist_list_var = reverse(all_leviathan_query_metrics());
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            leviathan_generate_answerable_vs_unanswerable_comparison(query_set_run, metric);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject leviathan_answerability_data(final SubLObject experiment_data, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        SubLObject pairs = NIL;
        SubLObject cdolist_list_var = experiment_data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$238 = current = datum;
            SubLObject value = NIL;
            SubLObject experiment = NIL;
            destructuring_bind_must_consp(current, datum_$238, $list156);
            value = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum_$238, $list156);
            experiment = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject filtered_experiment = (NIL != filter) ? funcall(filter, experiment) : experiment;
                final SubLObject analysis = kbq_query_run.kbq_analyze_query_set_run(filtered_experiment, UNPROVIDED);
                final SubLObject answerable_count = getf(analysis, $TOTAL_ANSWERABLE, UNPROVIDED);
                pairs = cons(list(value, answerable_count), pairs);
            } else {
                cdestructuring_bind_error(datum_$238, $list156);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return nreverse(pairs);
    }

    public static SubLObject leviathan_generate_answerability_prediction_graph(final SubLObject query_set_run, final SubLObject oracle_query_set_run, final SubLObject property) {
        return plot_generation.kbq_generate_answerability_prediction_display(query_set_run, oracle_query_set_run, property, list($kw152$LOGSCALE_Y_, T, $YLABEL, string_utilities.str(property), $PLOT_TITLE, cconcatenate($str158$Oracularly_Answerable_vs__Unanswe, format_nil.format_nil_s_no_copy(property))), UNPROVIDED);
    }

    public static SubLObject generate_all_leviathan_answerability_prediction_graphs(final SubLObject query_set_run, final SubLObject oracle_query_set_run) {
        SubLObject cdolist_list_var = reverse(all_leviathan_query_metrics());
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            leviathan_generate_answerability_prediction_graph(query_set_run, oracle_query_set_run, metric);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject leviathan_win_at_solitaire(final SubLObject query_set_run, final SubLObject oracle_query_set_run) {
        return generate_all_leviathan_answerability_prediction_graphs(query_set_run, oracle_query_set_run);
    }

    public static SubLObject clear_problem_creation_times() {
        $problem_creation_times$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject note_new_problem_created() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != $maintain_problem_creation_timesP$.getDynamicValue(thread)) {
            result = get_internal_real_time();
            $problem_creation_times$.setGlobalValue(cons(result, $problem_creation_times$.getGlobalValue()));
        }
        return result;
    }

    public static SubLObject historical_problem_creation_times() {
        final SubLObject absolute_times = reverse($problem_creation_times$.getGlobalValue());
        final SubLObject start_time = absolute_times.first();
        SubLObject relative_times = NIL;
        SubLObject cdolist_list_var = absolute_times;
        SubLObject time = NIL;
        time = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            relative_times = cons(subtract(time, start_time), relative_times);
            cdolist_list_var = cdolist_list_var.rest();
            time = cdolist_list_var.first();
        } 
        return nreverse(relative_times);
    }

    public static SubLObject initialize_halo_leviathan_queries() {
        SubLObject cdolist_list_var;
        final SubLObject shallow_halo_queries = cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(load_leviathan_experiment($str160$halo_queries_with_1_backchain_823)));
        SubLObject shallow_halo_query = NIL;
        shallow_halo_query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke.ke_unassert_now(listS($$isa, shallow_halo_query, $list161), $$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            shallow_halo_query = cdolist_list_var.first();
        } 
        return determine_leviathan_training_and_blind_sets_int($$HALOLeviathanQuery, $$HALOLeviathanQuery_Training, $$HALOLeviathanQuery_Blind);
    }

    public static SubLObject analyze_leviathan_experiment(final SubLObject experiment_denoting_symbol, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (metrics == UNPROVIDED) {
            metrics = standard_leviathan_query_metrics();
        }
        if (corpus == UNPROVIDED) {
            corpus = $$$Leviathan_Training;
        }
        if (display == UNPROVIDED) {
            display = $str163$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : "special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + "CommonSymbols.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + experiment_denoting_symbol;
        final SubLObject query_set_run = symbol_value(experiment_denoting_symbol);
        final SubLObject name = symbol_name(experiment_denoting_symbol);
        format(stream, $str165$____Basic_analysis____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(query_set_run, basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str166$____Answerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(query_set_run), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str167$____Unanswerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(query_set_run), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str168$____KB_Content____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(leviathan_kb_content_query_set_run(query_set_run), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str169$____Autogenerated____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(leviathan_haystack_query_set_run(query_set_run), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str170$____HALO____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(leviathan_halo_query_set_run(query_set_run), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str171$____Answerable_KB_Content____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(leviathan_kb_content_query_set_run(query_set_run)), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str172$____Answerable_Autogenerated____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(leviathan_haystack_query_set_run(query_set_run)), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str173$____Answerable_HALO____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(leviathan_halo_query_set_run(query_set_run)), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str174$____Unanswerable_KB_Content____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(leviathan_kb_content_query_set_run(query_set_run)), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str175$____Unanswerable_Autogenerated___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(leviathan_haystack_query_set_run(query_set_run)), basic_leviathan_query_metrics()), UNPROVIDED);
        format(stream, $str176$____Unanswerable_HALO____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(leviathan_halo_query_set_run(query_set_run)), basic_leviathan_query_metrics()), UNPROVIDED);
        SubLObject cdolist_list_var = metrics;
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            leviathan_generate_sorted_property_display(query_set_run, name, metric, corpus, display);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        } 
        return name;
    }

    public static SubLObject analyze_leviathan_experiments(final SubLObject baseline_denoting_symbol, final SubLObject experiment_denoting_symbol, SubLObject display_graphsP, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (display_graphsP == UNPROVIDED) {
            display_graphsP = T;
        }
        if (metrics == UNPROVIDED) {
            metrics = basic_leviathan_query_metrics();
        }
        if (corpus == UNPROVIDED) {
            corpus = $$$Leviathan_Training;
        }
        if (display == UNPROVIDED) {
            display = $str163$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) : "special_variable_state.bound_symbol_p(baseline_denoting_symbol) " + "CommonSymbols.NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) " + baseline_denoting_symbol;
        assert NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : "special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + "CommonSymbols.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) " + experiment_denoting_symbol;
        final SubLObject baseline = symbol_value(baseline_denoting_symbol);
        final SubLObject baseline_name = symbol_name(baseline_denoting_symbol);
        final SubLObject experiment = symbol_value(experiment_denoting_symbol);
        final SubLObject experiment_name = symbol_name(experiment_denoting_symbol);
        final SubLObject kb_content_baseline = leviathan_kb_content_query_set_run(baseline);
        final SubLObject kb_content_experiment = leviathan_kb_content_query_set_run(experiment);
        final SubLObject haystack_baseline = leviathan_haystack_query_set_run(baseline);
        final SubLObject haystack_experiment = leviathan_haystack_query_set_run(experiment);
        final SubLObject halo_baseline = leviathan_halo_query_set_run(baseline);
        final SubLObject halo_experiment = leviathan_halo_query_set_run(experiment);
        thread.resetMultipleValues();
        final SubLObject mutual_baseline = kbq_query_run.kbq_mutually_answerable_query_set_runs(baseline, experiment);
        final SubLObject mutual_experiment = thread.secondMultipleValue();
        thread.resetMultipleValues();
        format(stream, $str177$______of_queries_answerable_in__B);
        thread.resetMultipleValues();
        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(baseline, experiment);
        SubLObject mutual = thread.secondMultipleValue();
        SubLObject only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str178$Total___________s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(kb_content_baseline, kb_content_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str179$KB_Content______s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(haystack_baseline, haystack_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str180$Autogenerated___s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(halo_baseline, halo_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        format(T, $str181$HALO____________s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
        format(stream, $str182$____Key___BASELINE_VALUE__EXPERIM);
        format(stream, $str165$____Basic_analysis____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(baseline, experiment, metrics));
        format(stream, $str183$____Mutually_Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
        format(stream, $str184$____Mutually_Answerable_KB_Conten);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(leviathan_kb_content_query_set_run(mutual_baseline), leviathan_kb_content_query_set_run(mutual_experiment), metrics));
        format(stream, $str185$____Mutually_Answerable_Autogener);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(leviathan_haystack_query_set_run(mutual_baseline), leviathan_haystack_query_set_run(mutual_experiment), metrics));
        format(stream, $str186$____Mutually_Answerable_HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(leviathan_halo_query_set_run(mutual_baseline), leviathan_halo_query_set_run(mutual_experiment), metrics));
        format(stream, $str166$____Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(baseline), kbq_query_run.kbq_answerable_query_set_run(experiment), metrics));
        format(stream, $str167$____Unanswerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(baseline), kbq_query_run.kbq_unanswerable_query_set_run(experiment), metrics));
        format(stream, $str168$____KB_Content____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kb_content_baseline, kb_content_experiment, metrics));
        format(stream, $str169$____Autogenerated____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(haystack_baseline, haystack_experiment, metrics));
        format(stream, $str170$____HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(halo_baseline, halo_experiment, metrics));
        format(stream, $str171$____Answerable_KB_Content____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(kb_content_baseline), kbq_query_run.kbq_answerable_query_set_run(kb_content_experiment), metrics));
        format(stream, $str172$____Answerable_Autogenerated____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(haystack_baseline), kbq_query_run.kbq_answerable_query_set_run(haystack_experiment), metrics));
        format(stream, $str173$____Answerable_HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(halo_baseline), kbq_query_run.kbq_answerable_query_set_run(halo_experiment), metrics));
        format(stream, $str174$____Unanswerable_KB_Content____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(kb_content_baseline), kbq_query_run.kbq_unanswerable_query_set_run(kb_content_experiment), metrics));
        format(stream, $str175$____Unanswerable_Autogenerated___);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(haystack_baseline), kbq_query_run.kbq_unanswerable_query_set_run(haystack_experiment), metrics));
        format(stream, $str176$____Unanswerable_HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(halo_baseline), kbq_query_run.kbq_unanswerable_query_set_run(halo_experiment), metrics));
        if (NIL != display_graphsP) {
            SubLObject cdolist_list_var = metrics;
            SubLObject metric = NIL;
            metric = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                leviathan_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, $BOTH, cconcatenate($$$Mutually_Answerable_, corpus), display);
                leviathan_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, $BASELINE, cconcatenate($$$Mutually_Answerable_, corpus), display);
                cdolist_list_var = cdolist_list_var.rest();
                metric = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject leviathan_generate_sorted_property_comparison(final SubLObject baseline, final SubLObject experiment, final SubLObject baseline_name, final SubLObject experiment_name, final SubLObject property, SubLObject sort_by, SubLObject corpus, SubLObject display) {
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (corpus == UNPROVIDED) {
            corpus = $$$Leviathan_Training;
        }
        if (display == UNPROVIDED) {
            display = $str163$_0;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline, experiment, property, listS($PLOT_TITLE, new SubLObject[]{ cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[]{ $str190$__, format_nil.format_nil_a_no_copy(baseline_name), $str191$_vs__, format_nil.format_nil_a_no_copy(experiment_name), $str192$_n, format_nil.format_nil_a_no_copy(property) }), $XLABEL, $$$Sorted_Queries, $YLABEL, ylabel_for_property(property), $BASELINE_KEY_LABEL, baseline_name, $EXPERIMENT_KEY_LABEL, experiment_name, $list197 }), sort_by, display);
    }

    public static SubLObject leviathan_generate_sorted_property_display(final SubLObject experiment, final SubLObject name, final SubLObject property, SubLObject corpus, SubLObject display) {
        if (corpus == UNPROVIDED) {
            corpus = $$$Leviathan_Training;
        }
        if (display == UNPROVIDED) {
            display = $str163$_0;
        }
        return plot_generation.kbq_generate_sorted_property_display(experiment, property, $list198, listS($PLOT_TITLE, new SubLObject[]{ cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy(name), $str192$_n, format_nil.format_nil_a_no_copy(property) }), $XLABEL, $$$Sorted_Queries, $YLABEL, ylabel_for_property(property), $list200 }), display);
    }

    public static SubLObject ylabel_for_property(final SubLObject property) {
        final SubLObject string = symbol_name(property);
        if (NIL != string_utilities.substringP($$$time, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str202$Time__sec_;
        }
        if (NIL != string_utilities.substringP($$$problem, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str204$__of_problems;
        }
        if (NIL != string_utilities.substringP($$$link, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str206$__of_links;
        }
        if (NIL != string_utilities.substringP($$$tactic, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str208$__of_tactics;
        }
        if (NIL != string_utilities.substringP($$$proof, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str210$__of_proofs;
        }
        if (NIL != string_utilities.substringP($$$answer, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str212$__of_answers;
        }
        if (NIL != string_utilities.substringP($$$byte, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $str214$__of_bytes;
        }
        return $str215$;
    }

    public static SubLObject problem_query_relational_complexity_analysis(SubLObject experiment) {
        if (experiment == UNPROVIDED) {
            experiment = load_leviathan_experiment($str216$training_823_h_queries_0602);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject complexities = NIL;
        final SubLObject list_var = kbq_query_run.kbq_query_set_run_query_runs(experiment);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = NIL;
                query_run = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject queries = cdolist_list_var = kbq_query_run.kbq_extract_query_run_metric_value(query_run, $PROBLEM_QUERIES, UNPROVIDED);
                    SubLObject query = NIL;
                    query = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$239 = query;
                        SubLObject contextualized_clause = NIL;
                        contextualized_clause = cdolist_list_var_$239.first();
                        while (NIL != cdolist_list_var_$239) {
                            SubLObject sense = $NEG;
                            SubLObject index_var = ZERO_INTEGER;
                            SubLObject cdolist_list_var_$240 = clauses.neg_lits(contextualized_clause);
                            SubLObject contextualized_asent = NIL;
                            contextualized_asent = cdolist_list_var_$240.first();
                            while (NIL != cdolist_list_var_$240) {
                                SubLObject current;
                                final SubLObject datum = current = contextualized_asent;
                                SubLObject mt = NIL;
                                SubLObject asent = NIL;
                                destructuring_bind_must_consp(current, datum, $list219);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list219);
                                asent = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject asent_complexity = function_terms.term_relational_complexity(asent);
                                    final SubLObject mt_complexity = function_terms.term_relational_complexity(mt);
                                    final SubLObject complexity = max(asent_complexity, mt_complexity);
                                    complexities = cons(complexity, complexities);
                                } else {
                                    cdestructuring_bind_error(datum, $list219);
                                }
                                index_var = add(index_var, ONE_INTEGER);
                                cdolist_list_var_$240 = cdolist_list_var_$240.rest();
                                contextualized_asent = cdolist_list_var_$240.first();
                            } 
                            sense = $POS;
                            index_var = ZERO_INTEGER;
                            SubLObject cdolist_list_var_$241 = clauses.pos_lits(contextualized_clause);
                            contextualized_asent = NIL;
                            contextualized_asent = cdolist_list_var_$241.first();
                            while (NIL != cdolist_list_var_$241) {
                                SubLObject current;
                                final SubLObject datum = current = contextualized_asent;
                                SubLObject mt = NIL;
                                SubLObject asent = NIL;
                                destructuring_bind_must_consp(current, datum, $list219);
                                mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list219);
                                asent = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject asent_complexity = function_terms.term_relational_complexity(asent);
                                    final SubLObject mt_complexity = function_terms.term_relational_complexity(mt);
                                    final SubLObject complexity = max(asent_complexity, mt_complexity);
                                    complexities = cons(complexity, complexities);
                                } else {
                                    cdestructuring_bind_error(datum, $list219);
                                }
                                index_var = add(index_var, ONE_INTEGER);
                                cdolist_list_var_$241 = cdolist_list_var_$241.rest();
                                contextualized_asent = cdolist_list_var_$241.first();
                            } 
                            cdolist_list_var_$239 = cdolist_list_var_$239.rest();
                            contextualized_clause = cdolist_list_var_$239.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        query = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$242 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$242, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.histogram(complexities, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject problem_query_fort_analysis(SubLObject experiment) {
        if (experiment == UNPROVIDED) {
            experiment = load_leviathan_experiment($str216$training_823_h_queries_0602);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        final SubLObject list_var = kbq_query_run.kbq_query_set_run_query_runs(experiment);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = NIL;
                query_run = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject queries = cdolist_list_var = kbq_query_run.kbq_extract_query_run_metric_value(query_run, $PROBLEM_QUERIES, UNPROVIDED);
                    SubLObject query = NIL;
                    query = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$243 = cycl_utilities.expression_forts(query, NIL, UNPROVIDED, UNPROVIDED);
                        SubLObject fort = NIL;
                        fort = cdolist_list_var_$243.first();
                        while (NIL != cdolist_list_var_$243) {
                            dictionary_utilities.dictionary_increment(fort_dict, fort, UNPROVIDED);
                            cdolist_list_var_$243 = cdolist_list_var_$243.rest();
                            fort = cdolist_list_var_$243.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        query = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$244 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$244, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(dictionary_utilities.dictionary_to_alist(fort_dict), symbol_function($sym221$_), symbol_function(CDR));
    }

    public static SubLObject elapsed_crtl_internal_real_time_to_elapsed_seconds(final SubLObject elapsed) {
        return divide(elapsed, $leviathan_crtl_internal_time_units_per_second$.getGlobalValue());
    }

    public static SubLObject elapsed_crtl_internal_real_times_to_elapsed_seconds(final SubLObject elapsed_times) {
        return Mapping.mapcar(ELAPSED_CRTL_INTERNAL_REAL_TIME_TO_ELAPSED_SECONDS, elapsed_times);
    }

    public static SubLObject compute_n_way_parallelism_total_time(final SubLObject query_run, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject parallel_total_time = compute_n_way_parallelism_times(query_run, n);
        final SubLObject parallel_time_to_first_answer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return parallel_total_time;
    }

    public static SubLObject compute_n_way_parallelism_time_to_first_answer(final SubLObject query_run, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject parallel_total_time = compute_n_way_parallelism_times(query_run, n);
        final SubLObject parallel_time_to_first_answer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return parallel_time_to_first_answer;
    }

    public static SubLObject compute_n_way_parallelism_times(final SubLObject query_run, final SubLObject n) {
        final SubLObject processor_times = make_vector(n, ZERO_INTEGER);
        SubLObject time_to_first_answer = NIL;
        final SubLObject new_root_relative_total_times = kbq_query_run.kbq_query_run_property_value(query_run, $NEW_ROOT_RELATIVE_TOTAL_TIMES, UNPROVIDED);
        final SubLObject new_root_relative_answer_times = kbq_query_run.kbq_query_run_property_value(query_run, $NEW_ROOT_RELATIVE_ANSWER_TIMES, UNPROVIDED);
        final SubLObject new_root_relative_answer_dict = dictionary_utilities.new_dictionary_from_alist(new_root_relative_answer_times, UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject total_time = NIL;
        SubLObject new_root_number = NIL;
        list_var = new_root_relative_total_times;
        total_time = list_var.first();
        for (new_root_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , total_time = list_var.first() , new_root_number = add(ONE_INTEGER, new_root_number)) {
            final SubLObject processor_number = earliest_free_processor_number(processor_times);
            final SubLObject processor_time_so_far = aref(processor_times, processor_number);
            set_aref(processor_times, processor_number, add(aref(processor_times, processor_number), total_time));
            final SubLObject relative_answer_times = dictionary.dictionary_lookup(new_root_relative_answer_dict, new_root_number, UNPROVIDED);
            final SubLObject relative_first_answer_time = relative_answer_times.first();
            if (NIL != relative_first_answer_time) {
                final SubLObject new_time_to_first_answer = add(processor_time_so_far, relative_first_answer_time);
                if ((NIL == time_to_first_answer) || new_time_to_first_answer.numL(time_to_first_answer)) {
                    time_to_first_answer = new_time_to_first_answer;
                }
            }
        }
        final SubLObject max_total_time = vector_utilities.max_element(processor_times);
        return values(kbq_query_run.kbq_internal_real_time_to_seconds(max_total_time), NIL != time_to_first_answer ? kbq_query_run.kbq_internal_real_time_to_seconds(time_to_first_answer) : NIL);
    }

    public static SubLObject earliest_free_processor_number(final SubLObject processor_times) {
        SubLObject min_time = number_utilities.positive_infinity();
        SubLObject min_processor = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject time;
        for (length = length(processor_times), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            i = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            time = aref(processor_times, i);
            if (NIL != number_utilities.potentially_infinite_integer_L(time, min_time)) {
                min_time = time;
                min_processor = i;
            }
        }
        return min_processor;
    }

    public static SubLObject new_root_first_answer_times(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_answer_times = NIL;
        final SubLObject _prev_bind_0 = kbq_query_run.$kbq_internal_time_units_per_second$.currentBinding(thread);
        try {
            kbq_query_run.$kbq_internal_time_units_per_second$.bind(kbq_query_run.kbq_query_set_run_internal_time_units_per_second(query_set_run), thread);
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject query_run = NIL;
            query_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_root_relative_answer_times = kbq_query_run.kbq_query_run_property_value(query_run, $NEW_ROOT_RELATIVE_ANSWER_TIMES, UNPROVIDED);
                final SubLObject new_root_relative_first_answer_times = Mapping.mapcar(symbol_function(SECOND), new_root_relative_answer_times);
                first_answer_times = nconc(new_root_relative_first_answer_times, first_answer_times);
                cdolist_list_var = cdolist_list_var.rest();
                query_run = cdolist_list_var.first();
            } 
            first_answer_times = Mapping.mapcar(KBQ_INTERNAL_REAL_TIME_TO_SECONDS, first_answer_times);
        } finally {
            kbq_query_run.$kbq_internal_time_units_per_second$.rebind(_prev_bind_0, thread);
        }
        first_answer_times = list_utilities.sort_L(first_answer_times, UNPROVIDED);
        return first_answer_times;
    }

    public static SubLObject generate_new_root_first_answer_times_graph(final SubLObject query_set_run, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        final SubLObject first_answer_times = new_root_first_answer_times(query_set_run);
        return plot_generation.generate_line_graph_from_values(first_answer_times, plot_properties);
    }

    public static SubLObject new_root_total_times(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_times = NIL;
        final SubLObject _prev_bind_0 = kbq_query_run.$kbq_internal_time_units_per_second$.currentBinding(thread);
        try {
            kbq_query_run.$kbq_internal_time_units_per_second$.bind(kbq_query_run.kbq_query_set_run_internal_time_units_per_second(query_set_run), thread);
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject query_run = NIL;
            query_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_root_times = kbq_query_run.kbq_query_run_property_value(query_run, $NEW_ROOT_RELATIVE_TOTAL_TIMES, UNPROVIDED);
                total_times = nconc(copy_list(new_root_times), total_times);
                cdolist_list_var = cdolist_list_var.rest();
                query_run = cdolist_list_var.first();
            } 
            total_times = Mapping.mapcar(KBQ_INTERNAL_REAL_TIME_TO_SECONDS, total_times);
        } finally {
            kbq_query_run.$kbq_internal_time_units_per_second$.rebind(_prev_bind_0, thread);
        }
        total_times = list_utilities.sort_L(total_times, UNPROVIDED);
        return total_times;
    }

    public static SubLObject generate_new_root_total_times_graph(final SubLObject query_set_run, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        final SubLObject total_times = new_root_total_times(query_set_run);
        return plot_generation.generate_line_graph_from_values(total_times, plot_properties);
    }

    public static SubLObject haystack_transformation_fanout_estimate(final SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $kbq_run_query_auto_destroy_enabledP$.currentBinding(thread);
        try {
            $kbq_run_query_auto_destroy_enabledP$.bind(NIL, thread);
            kbq_query_run.kbq_run_query(haystack, all_leviathan_query_metrics(), kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), $list229, UNPROVIDED, UNPROVIDED);
        } finally {
            $kbq_run_query_auto_destroy_enabledP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject inference = inference_utilities.latest_inference();
        return inference_transformation_fanout_estimate(inference);
    }

    public static SubLObject inference_transformation_fanout_estimate(final SubLObject inference) {
        SubLObject fanouts = $list230;
        SubLObject new_root_count = ZERO_INTEGER;
        final SubLObject proof = inference_datastructures_inference.inference_first_proof(inference);
        if (NIL != proof) {
            SubLObject cdolist_list_var = inference_datastructures_proof.all_proof_subproofs(proof);
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_worker_transformation.transformation_proof_p(subproof)) {
                    final SubLObject problem = inference_datastructures_proof.proof_supported_problem(subproof);
                    final SubLObject fanout_for_this_level = problem_standard_transformation_fanout(problem);
                    fanouts = cons(fanout_for_this_level, fanouts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            } 
        }
        SubLObject fanouts_down_to_this_depth;
        SubLObject new_root_count_down_to_this_depth;
        for (fanouts_down_to_this_depth = NIL, fanouts_down_to_this_depth = fanouts; !fanouts_down_to_this_depth.isAtom(); fanouts_down_to_this_depth = fanouts_down_to_this_depth.rest()) {
            new_root_count_down_to_this_depth = apply(symbol_function($sym231$_), fanouts_down_to_this_depth);
            new_root_count = add(new_root_count, new_root_count_down_to_this_depth);
        }
        return new_root_count;
    }

    public static SubLObject problem_standard_transformation_fanout(final SubLObject problem) {
        assert NIL != inference_datastructures_problem.single_literal_problem_p(problem) : "inference_datastructures_problem.single_literal_problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.single_literal_problem_p(problem) " + problem;
        final SubLObject ist_literal = cycl_utilities.hl_to_el(inference_czer.problem_query_formula(inference_datastructures_problem.problem_query(problem)));
        return literal_standard_transformation_fanout(ist_literal);
    }

    public static SubLObject literal_standard_transformation_fanout(final SubLObject ist_literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_literal_p(ist_literal) : "cycl_grammar.cycl_literal_p(ist_literal) " + "CommonSymbols.NIL != cycl_grammar.cycl_literal_p(ist_literal) " + ist_literal;
        SubLObject fanout = ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject result = inference_kernel.new_cyc_query(ist_literal, NIL, $list234);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(root_problem);
        SubLObject transformation_tactic = NIL;
        transformation_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION)) && (NIL == inference_worker_transformation.meta_transformation_tactic_p(transformation_tactic))) && ($TRANS_UNBOUND_PREDICATE_POS != inference_datastructures_tactic.tactic_hl_module_name(transformation_tactic))) {
                final SubLObject productivity = inference_datastructures_tactic.tactic_productivity(transformation_tactic);
                final SubLObject number_of_children = inference_datastructures_enumerated_types.number_of_children_for_productivity(productivity);
                fanout = add(fanout, number_of_children);
            }
            cdolist_list_var = cdolist_list_var.rest();
            transformation_tactic = cdolist_list_var.first();
        } 
        return fanout;
    }

    public static SubLObject inference_top_level_removal_fanout(final SubLObject inference) {
        final SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
        if (NIL != root_problem) {
            return balanced_strategy_root_initial_removal_fanout(root_problem, inference_datastructures_inference.simplest_inference_strategy(inference));
        }
        return NIL;
    }

    public static SubLObject balanced_strategy_root_initial_removal_fanout(final SubLObject root_problem, final SubLObject strategy) {
        return NIL;
    }

    public static SubLObject inference_new_root_initial_removal_fanouts(final SubLObject inference) {
        final SubLObject fanouts = NIL;
        return nreverse(fanouts);
    }

    public static SubLObject enlarge_kb_via_doppelgangers(final SubLObject n, SubLObject skip) {
        if (skip == UNPROVIDED) {
            skip = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        possibly_initialize_doppelganger_vocab();
        ontology_layers.possibly_initialize_ontology_layers();
        SubLObject created = ZERO_INTEGER;
        SubLObject skipped = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str237$Doppelganging___);
                while (NIL == doneP) {
                    if (NIL == doneP) {
                        SubLObject csome_list_var = kb_utilities.all_constants();
                        SubLObject constant = NIL;
                        constant = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            SubLObject msg = NIL;
                            if (NIL == fort_unsuitable_for_doppelgangingP(constant)) {
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$245 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject created_$246 = create_doppelganger_of_constant(constant, n, skip, created, skipped);
                                            final SubLObject skipped_$247 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            created = created_$246;
                                            skipped = skipped_$247;
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$245, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (msg.isString()) {
                                    Errors.warn($str238$Skipping_term__A_due_to_error____, constant, msg);
                                }
                            }
                            if (created.numGE(n)) {
                                doneP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            constant = csome_list_var.first();
                        } 
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0_$246 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$246, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return n;
    }

    public static SubLObject fort_unsuitable_for_doppelgangingP(final SubLObject fort) {
        if (NIL == list_utilities.member_eqP(ontology_layers.fort_ontology_layer(fort), $list239)) {
            return T;
        }
        if (NIL != pph_functions.pph_phrase_fnP(fort, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject create_doppelganger_of_constant(final SubLObject constant, final SubLObject n, final SubLObject skip, SubLObject created, SubLObject skipped) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doppelganger = NIL;
        SubLObject doneP = NIL;
        SubLObject did_somethingP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = kb_accessors.all_term_assertions(constant, T);
            SubLObject as = NIL;
            as = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL == assertion_utilities.gaf_assertion_with_any_of_preds_p(as, $list240)) {
                    if (skipped.numGE(skip)) {
                        if (NIL == doppelganger) {
                            final SubLObject name = cconcatenate($str241$Doppelganger_, new SubLObject[]{ constants_high.constant_name(constant), $str242$_, string_utilities.random_string(EIGHT_INTEGER) });
                            doppelganger = cyc_kernel.cyc_create_new_ephemeral(name);
                        }
                        final SubLObject cnf = assertions_high.assertion_cnf(as);
                        final SubLObject mt = assertions_high.assertion_mt(as);
                        if ((NIL == cycl_utilities.expression_find_if(DOPPELGANGER_P, cnf, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find_if(DOPPELGANGER_P, mt, UNPROVIDED, UNPROVIDED))) {
                            final SubLObject doppelganger_cnf = cycl_utilities.expression_subst(doppelganger, constant, cnf, UNPROVIDED, UNPROVIDED);
                            final SubLObject doppelganger_mt = cycl_utilities.expression_subst(doppelganger, constant, mt, UNPROVIDED, UNPROVIDED);
                            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                                did_somethingP = T;
                                created = add(created, ONE_INTEGER);
                                note_percent_progress(created, n);
                                SubLObject time = ZERO_INTEGER;
                                final SubLObject time_var = get_internal_real_time();
                                dangerous_create_assertion(doppelganger_cnf, doppelganger_mt, assertions_high.assertion_variable_names(as), assertions_high.assertion_direction(as), assertions_high.assertion_truth(as), assertions_high.assertion_strength(as), assertions_high.get_asserted_argument(as));
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                if (time.numG($doppelganger_time_threshold$.getDynamicValue(thread))) {
                                    Errors.warn($str244$Slow_assertion___s, list(time, assertion_handles.assertion_id(as), doppelganger_cnf, doppelganger_mt));
                                }
                                if (created.numGE(n)) {
                                    doneP = T;
                                }
                            } finally {
                                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        skipped = add(skipped, ONE_INTEGER);
                    }
                }
                csome_list_var = csome_list_var.rest();
                as = csome_list_var.first();
            } 
        }
        if (NIL != did_somethingP) {
            dangerous_create_assertion(clause_utilities.make_gaf_cnf(list($$doppelgangers, constant, doppelganger)), $$BookkeepingMt, NIL, $BACKWARD, $TRUE, $DEFAULT, NIL);
        }
        return values(created, skipped);
    }

    public static SubLObject doppelganger_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $str241$Doppelganger_)));
    }

    public static SubLObject dangerous_create_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        final SubLObject internal_id = assertion_handles.make_assertion_id();
        final SubLObject assertion = assertion_handles.make_assertion_shell(internal_id);
        assertions_low.kb_create_assertion_int(assertion, internal_id, cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        return internal_id;
    }

    public static SubLObject possibly_initialize_doppelganger_vocab() {
        if (NIL == valid_constantP($$doppelgangers, UNPROVIDED)) {
            cyc_kernel.cyc_create($$$doppelgangers, $ic251);
            cyc_kernel.cyc_assert($list252, $$BaseKB, UNPROVIDED);
            cyc_kernel.cyc_assert($list253, $$BaseKB, UNPROVIDED);
            cyc_kernel.cyc_assert($list254, $$BaseKB, UNPROVIDED);
            cyc_kernel.cyc_assert($list255, $$BaseKB, UNPROVIDED);
            cyc_kernel.cyc_assert($list256, $$BaseKB, UNPROVIDED);
            cyc_kernel.cyc_assert($list257, $$BaseKB, UNPROVIDED);
        }
        return $$doppelgangers;
    }

    public static SubLObject declare_leviathan_file() {
        declareFunction(me, "basic_leviathan_query_metrics", "BASIC-LEVIATHAN-QUERY-METRICS", 0, 0, false);
        declareFunction(me, "standard_leviathan_query_metrics", "STANDARD-LEVIATHAN-QUERY-METRICS", 0, 0, false);
        declareFunction(me, "all_leviathan_query_metrics", "ALL-LEVIATHAN-QUERY-METRICS", 0, 0, false);
        declareFunction(me, "leviathan_experiment_full_filename", "LEVIATHAN-EXPERIMENT-FULL-FILENAME", 1, 1, false);
        declareMacro(me, "run_leviathan_experiment", "RUN-LEVIATHAN-EXPERIMENT");
        declareFunction(me, "load_leviathan_experiment", "LOAD-LEVIATHAN-EXPERIMENT", 1, 0, false);
        declareFunction(me, "save_leviathan_experiment", "SAVE-LEVIATHAN-EXPERIMENT", 2, 0, false);
        declareFunction(me, "leviathan_kb_content_query_set_run", "LEVIATHAN-KB-CONTENT-QUERY-SET-RUN", 1, 0, false);
        declareFunction(me, "leviathan_halo_query_set_run", "LEVIATHAN-HALO-QUERY-SET-RUN", 1, 0, false);
        declareFunction(me, "leviathan_haystack_query_set_run", "LEVIATHAN-HAYSTACK-QUERY-SET-RUN", 1, 0, false);
        declareFunction(me, "leviathan_kb_content_queryP", "LEVIATHAN-KB-CONTENT-QUERY?", 1, 0, false);
        declareFunction(me, "leviathan_halo_queryP", "LEVIATHAN-HALO-QUERY?", 1, 0, false);
        declareFunction(me, "leviathan_haystack_queryP", "LEVIATHAN-HAYSTACK-QUERY?", 1, 0, false);
        declareFunction(me, "save_haystack", "SAVE-HAYSTACK", 1, 0, false);
        declareFunction(me, "load_haystack", "LOAD-HAYSTACK", 1, 0, false);
        declareFunction(me, "load_all_haystacks", "LOAD-ALL-HAYSTACKS", 0, 1, false);
        declareFunction(me, "clear_cached_load_all_haystacks", "CLEAR-CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
        declareFunction(me, "remove_cached_load_all_haystacks", "REMOVE-CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
        declareFunction(me, "cached_load_all_haystacks_internal", "CACHED-LOAD-ALL-HAYSTACKS-INTERNAL", 0, 0, false);
        declareFunction(me, "cached_load_all_haystacks", "CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
        declareFunction(me, "load_all_haystacks_int", "LOAD-ALL-HAYSTACKS-INT", 0, 0, false);
        declareFunction(me, "show_haystack_statistics", "SHOW-HAYSTACK-STATISTICS", 0, 0, false);
        declareFunction(me, "load_all_instantiated_haystacks", "LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 1, false);
        declareFunction(me, "clear_cached_load_all_instantiated_haystacks", "CLEAR-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "remove_cached_load_all_instantiated_haystacks", "REMOVE-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "cached_load_all_instantiated_haystacks_internal", "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-INTERNAL", 0, 0, false);
        declareFunction(me, "cached_load_all_instantiated_haystacks", "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "load_all_instantiated_haystacks_int", "LOAD-ALL-INSTANTIATED-HAYSTACKS-INT", 0, 0, false);
        declareFunction(me, "show_instantiated_haystack_statistics", "SHOW-INSTANTIATED-HAYSTACK-STATISTICS", 0, 0, false);
        declareFunction(me, "save_good_instantiated_haystack", "SAVE-GOOD-INSTANTIATED-HAYSTACK", 1, 0, false);
        declareFunction(me, "make_haystacks_good", "MAKE-HAYSTACKS-GOOD", 0, 2, false);
        declareFunction(me, "load_all_crippled_haystacks", "LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 1, false);
        declareFunction(me, "clear_cached_load_all_crippled_haystacks", "CLEAR-CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "remove_cached_load_all_crippled_haystacks", "REMOVE-CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "cached_load_all_crippled_haystacks_internal", "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-INTERNAL", 0, 0, false);
        declareFunction(me, "cached_load_all_crippled_haystacks", "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "load_all_crippled_haystacks_int", "LOAD-ALL-CRIPPLED-HAYSTACKS-INT", 0, 0, false);
        declareFunction(me, "show_crippled_haystack_statistics", "SHOW-CRIPPLED-HAYSTACK-STATISTICS", 0, 0, false);
        declareFunction(me, "make_haystacks_crippled", "MAKE-HAYSTACKS-CRIPPLED", 0, 2, false);
        declareFunction(me, "reify_all_haystacks", "REIFY-ALL-HAYSTACKS", 0, 0, false);
        declareFunction(me, "reify_all_instantiated_haystacks", "REIFY-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "reify_all_crippled_haystacks", "REIFY-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        declareFunction(me, "reify_haystack", "REIFY-HAYSTACK", 2, 0, false);
        declareFunction(me, "haystack_constant_name_from_filename", "HAYSTACK-CONSTANT-NAME-FROM-FILENAME", 1, 0, false);
        declareFunction(me, "haystack_id_string_from_filename", "HAYSTACK-ID-STRING-FROM-FILENAME", 1, 0, false);
        declareFunction(me, "haystack_id_string_from_query", "HAYSTACK-ID-STRING-FROM-QUERY", 1, 0, false);
        declareFunction(me, "haystack_size_from_query", "HAYSTACK-SIZE-FROM-QUERY", 1, 0, false);
        declareFunction(me, "haystack_filename_from_query", "HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
        declareFunction(me, "instantiated_haystack_filename_from_query", "INSTANTIATED-HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
        declareFunction(me, "crippled_haystack_filename_from_query", "CRIPPLED-HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
        declareFunction(me, "remove_haystack_files", "REMOVE-HAYSTACK-FILES", 1, 0, false);
        declareFunction(me, "remove_all_duplicate_haystack_files", "REMOVE-ALL-DUPLICATE-HAYSTACK-FILES", 0, 1, false);
        declareFunction(me, "remove_duplicate_haystack_files_int", "REMOVE-DUPLICATE-HAYSTACK-FILES-INT", 2, 0, false);
        declareFunction(me, "kill_duplicate_and_broken_reified_haystacks", "KILL-DUPLICATE-AND-BROKEN-REIFIED-HAYSTACKS", 0, 1, false);
        declareFunction(me, "finalize_haystack_corpus", "FINALIZE-HAYSTACK-CORPUS", 0, 0, false);
        declareFunction(me, "initialize_kb_content_leviathan_queries", "INITIALIZE-KB-CONTENT-LEVIATHAN-QUERIES", 0, 0, false);
        declareFunction(me, "determine_leviathan_training_and_blind_sets", "DETERMINE-LEVIATHAN-TRAINING-AND-BLIND-SETS", 0, 0, false);
        declareFunction(me, "determine_leviathan_training_and_blind_sets_int", "DETERMINE-LEVIATHAN-TRAINING-AND-BLIND-SETS-INT", 3, 0, false);
        declareFunction(me, "unassert_assertion", "UNASSERT-ASSERTION", 1, 0, false);
        declareFunction(me, "unassert_assertion_via_cyc", "UNASSERT-ASSERTION-VIA-CYC", 1, 0, false);
        declareFunction(me, "unassert_assertion_via_hl", "UNASSERT-ASSERTION-VIA-HL", 1, 0, false);
        declareFunction(me, "unassert_assertion_via_tms", "UNASSERT-ASSERTION-VIA-TMS", 1, 0, false);
        declareFunction(me, "assert_allowed_rules_for_justified_queries", "ASSERT-ALLOWED-RULES-FOR-JUSTIFIED-QUERIES", 0, 1, false);
        declareFunction(me, "allowed_rules_utilities", "ALLOWED-RULES-UTILITIES", 0, 0, false);
        declareFunction(me, "allowed_rules_sorted_utility_tuples", "ALLOWED-RULES-SORTED-UTILITY-TUPLES", 0, 0, false);
        declareFunction(me, "skolem_ruleP", "SKOLEM-RULE?", 1, 0, false);
        declareFunction(me, "all_skolem_rules", "ALL-SKOLEM-RULES", 0, 0, false);
        declareFunction(me, "negative_utility_skolem_rules", "NEGATIVE-UTILITY-SKOLEM-RULES", 0, 0, false);
        declareFunction(me, "sorted_rule_utilities", "SORTED-RULE-UTILITIES", 1, 0, false);
        declareFunction(me, "rule_utility_tuples", "RULE-UTILITY-TUPLES", 1, 0, false);
        declareFunction(me, "rule_consideration_tuples", "RULE-CONSIDERATION-TUPLES", 1, 0, false);
        declareFunction(me, "rule_success_tuples", "RULE-SUCCESS-TUPLES", 1, 0, false);
        declareFunction(me, "skolem_rules_used_in_justified_queries", "SKOLEM-RULES-USED-IN-JUSTIFIED-QUERIES", 0, 1, false);
        declareFunction(me, "skolem_allowed_rules", "SKOLEM-ALLOWED-RULES", 0, 0, false);
        declareFunction(me, "kill_all_skolem_rules", "KILL-ALL-SKOLEM-RULES", 0, 0, false);
        declareFunction(me, "kill_all_negative_utility_skolem_rules", "KILL-ALL-NEGATIVE-UTILITY-SKOLEM-RULES", 0, 0, false);
        declareFunction(me, "inert_rules", "INERT-RULES", 0, 0, false);
        declareFunction(me, "inert_ruleP", "INERT-RULE?", 1, 0, false);
        declareFunction(me, "assertion_has_non_skolem_assertion_dependentsP", "ASSERTION-HAS-NON-SKOLEM-ASSERTION-DEPENDENTS?", 1, 0, false);
        declareFunction(me, "kill_all_inert_rules", "KILL-ALL-INERT-RULES", 0, 0, false);
        declareFunction(me, "rules_that_totally_suck", "RULES-THAT-TOTALLY-SUCK", 0, 0, false);
        declareFunction(me, "kill_all_rules_that_totally_suck", "KILL-ALL-RULES-THAT-TOTALLY-SUCK", 0, 0, false);
        declareFunction(me, "never_successful_ruleP", "NEVER-SUCCESSFUL-RULE?", 1, 0, false);
        declareFunction(me, "successful_ruleP", "SUCCESSFUL-RULE?", 1, 0, false);
        declareFunction(me, "never_considered_ruleP", "NEVER-CONSIDERED-RULE?", 1, 0, false);
        declareFunction(me, "considered_ruleP", "CONSIDERED-RULE?", 1, 0, false);
        declareFunction(me, "considered_but_not_successful_ruleP", "CONSIDERED-BUT-NOT-SUCCESSFUL-RULE?", 1, 0, false);
        declareFunction(me, "leviathan_rule_statistics", "LEVIATHAN-RULE-STATISTICS", 1, 0, false);
        declareFunction(me, "rule_analysis_L", "RULE-ANALYSIS-<", 2, 0, false);
        declareFunction(me, "leviathan_rule_statistics_int", "LEVIATHAN-RULE-STATISTICS-INT", 6, 0, false);
        declareFunction(me, "leviathan_allowed_rules", "LEVIATHAN-ALLOWED-RULES", 0, 0, false);
        declareFunction(me, "leviathan_kb_content_allowed_rules", "LEVIATHAN-KB-CONTENT-ALLOWED-RULES", 0, 0, false);
        declareFunction(me, "leviathan_haystack_allowed_rules", "LEVIATHAN-HAYSTACK-ALLOWED-RULES", 0, 0, false);
        declareFunction(me, "leviathan_haystack_all_allowed_rules", "LEVIATHAN-HAYSTACK-ALL-ALLOWED-RULES", 0, 0, false);
        declareFunction(me, "conditional_queries", "CONDITIONAL-QUERIES", 0, 0, false);
        declareFunction(me, "queries_that_probably_ought_to_be_conditional", "QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL", 0, 0, false);
        declareFunction(me, "fix_queries_that_probably_ought_to_be_conditional", "FIX-QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL", 0, 0, false);
        declareFunction(me, "rule_bindings_to_closed_summary", "RULE-BINDINGS-TO-CLOSED-SUMMARY", 0, 1, false);
        declareFunction(me, "rule_bindings_wffP", "RULE-BINDINGS-WFF?", 3, 0, false);
        declareFunction(me, "rule_bindings_wff_analysis", "RULE-BINDINGS-WFF-ANALYSIS", 0, 1, false);
        declareFunction(me, "initialize_rule_bindings_wff_table", "INITIALIZE-RULE-BINDINGS-WFF-TABLE", 0, 1, false);
        declareFunction(me, "rule_bindings_wff_cachedP", "RULE-BINDINGS-WFF-CACHED?", 3, 0, false);
        declareFunction(me, "leviathan_generate_answerable_vs_unanswerable_comparison", "LEVIATHAN-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 0, false);
        declareFunction(me, "generate_all_leviathan_answerable_vs_unanswerable_comparisons", "GENERATE-ALL-LEVIATHAN-ANSWERABLE-VS-UNANSWERABLE-COMPARISONS", 1, 0, false);
        declareFunction(me, "leviathan_answerability_data", "LEVIATHAN-ANSWERABILITY-DATA", 1, 1, false);
        declareFunction(me, "leviathan_generate_answerability_prediction_graph", "LEVIATHAN-GENERATE-ANSWERABILITY-PREDICTION-GRAPH", 3, 0, false);
        declareFunction(me, "generate_all_leviathan_answerability_prediction_graphs", "GENERATE-ALL-LEVIATHAN-ANSWERABILITY-PREDICTION-GRAPHS", 2, 0, false);
        declareFunction(me, "leviathan_win_at_solitaire", "LEVIATHAN-WIN-AT-SOLITAIRE", 2, 0, false);
        declareFunction(me, "clear_problem_creation_times", "CLEAR-PROBLEM-CREATION-TIMES", 0, 0, false);
        declareFunction(me, "note_new_problem_created", "NOTE-NEW-PROBLEM-CREATED", 0, 0, false);
        declareFunction(me, "historical_problem_creation_times", "HISTORICAL-PROBLEM-CREATION-TIMES", 0, 0, false);
        declareFunction(me, "initialize_halo_leviathan_queries", "INITIALIZE-HALO-LEVIATHAN-QUERIES", 0, 0, false);
        declareFunction(me, "analyze_leviathan_experiment", "ANALYZE-LEVIATHAN-EXPERIMENT", 1, 4, false);
        declareFunction(me, "analyze_leviathan_experiments", "ANALYZE-LEVIATHAN-EXPERIMENTS", 2, 5, false);
        declareFunction(me, "leviathan_generate_sorted_property_comparison", "LEVIATHAN-GENERATE-SORTED-PROPERTY-COMPARISON", 5, 3, false);
        declareFunction(me, "leviathan_generate_sorted_property_display", "LEVIATHAN-GENERATE-SORTED-PROPERTY-DISPLAY", 3, 2, false);
        declareFunction(me, "ylabel_for_property", "YLABEL-FOR-PROPERTY", 1, 0, false);
        declareFunction(me, "problem_query_relational_complexity_analysis", "PROBLEM-QUERY-RELATIONAL-COMPLEXITY-ANALYSIS", 0, 1, false);
        declareFunction(me, "problem_query_fort_analysis", "PROBLEM-QUERY-FORT-ANALYSIS", 0, 1, false);
        declareFunction(me, "elapsed_crtl_internal_real_time_to_elapsed_seconds", "ELAPSED-CRTL-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS", 1, 0, false);
        declareFunction(me, "elapsed_crtl_internal_real_times_to_elapsed_seconds", "ELAPSED-CRTL-INTERNAL-REAL-TIMES-TO-ELAPSED-SECONDS", 1, 0, false);
        declareFunction(me, "compute_n_way_parallelism_total_time", "COMPUTE-N-WAY-PARALLELISM-TOTAL-TIME", 2, 0, false);
        declareFunction(me, "compute_n_way_parallelism_time_to_first_answer", "COMPUTE-N-WAY-PARALLELISM-TIME-TO-FIRST-ANSWER", 2, 0, false);
        declareFunction(me, "compute_n_way_parallelism_times", "COMPUTE-N-WAY-PARALLELISM-TIMES", 2, 0, false);
        declareFunction(me, "earliest_free_processor_number", "EARLIEST-FREE-PROCESSOR-NUMBER", 1, 0, false);
        declareFunction(me, "new_root_first_answer_times", "NEW-ROOT-FIRST-ANSWER-TIMES", 1, 0, false);
        declareFunction(me, "generate_new_root_first_answer_times_graph", "GENERATE-NEW-ROOT-FIRST-ANSWER-TIMES-GRAPH", 1, 1, false);
        declareFunction(me, "new_root_total_times", "NEW-ROOT-TOTAL-TIMES", 1, 0, false);
        declareFunction(me, "generate_new_root_total_times_graph", "GENERATE-NEW-ROOT-TOTAL-TIMES-GRAPH", 1, 1, false);
        declareFunction(me, "haystack_transformation_fanout_estimate", "HAYSTACK-TRANSFORMATION-FANOUT-ESTIMATE", 1, 0, false);
        declareFunction(me, "inference_transformation_fanout_estimate", "INFERENCE-TRANSFORMATION-FANOUT-ESTIMATE", 1, 0, false);
        declareFunction(me, "problem_standard_transformation_fanout", "PROBLEM-STANDARD-TRANSFORMATION-FANOUT", 1, 0, false);
        declareFunction(me, "literal_standard_transformation_fanout", "LITERAL-STANDARD-TRANSFORMATION-FANOUT", 1, 0, false);
        declareFunction(me, "inference_top_level_removal_fanout", "INFERENCE-TOP-LEVEL-REMOVAL-FANOUT", 1, 0, false);
        declareFunction(me, "balanced_strategy_root_initial_removal_fanout", "BALANCED-STRATEGY-ROOT-INITIAL-REMOVAL-FANOUT", 2, 0, false);
        declareFunction(me, "inference_new_root_initial_removal_fanouts", "INFERENCE-NEW-ROOT-INITIAL-REMOVAL-FANOUTS", 1, 0, false);
        declareFunction(me, "enlarge_kb_via_doppelgangers", "ENLARGE-KB-VIA-DOPPELGANGERS", 1, 1, false);
        declareFunction(me, "fort_unsuitable_for_doppelgangingP", "FORT-UNSUITABLE-FOR-DOPPELGANGING?", 1, 0, false);
        declareFunction(me, "create_doppelganger_of_constant", "CREATE-DOPPELGANGER-OF-CONSTANT", 5, 0, false);
        declareFunction(me, "doppelganger_p", "DOPPELGANGER-P", 1, 0, false);
        declareFunction(me, "dangerous_create_assertion", "DANGEROUS-CREATE-ASSERTION", 7, 0, false);
        declareFunction(me, "possibly_initialize_doppelganger_vocab", "POSSIBLY-INITIALIZE-DOPPELGANGER-VOCAB", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_leviathan_file() {
        deflexical("*LEVIATHAN-DIRECTORY*", $str0$_cyc_projects_inference_leviathan);
        deflexical("*LEVIATHAN-EXPERIMENT-DIRECTORY*", cconcatenate($leviathan_directory$.getGlobalValue(), $str1$experiments_));
        deflexical("*STANDARD-LEVIATHAN-QUERY-METRICS*", $list3);
        deflexical("*LEVIATHAN-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
        deflexical("*CACHED-LOAD-ALL-HAYSTACKS-CACHING-STATE*", NIL);
        deflexical("*CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-CACHING-STATE*", NIL);
        deflexical("*CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-CACHING-STATE*", NIL);
        deflexical("*SORTED-RULE-ANALYSES*", $list126);
        deflexical("*RULE-BINDINGS-WFF-TABLE*", SubLTrampolineFile.maybeDefault($rule_bindings_wff_table$, $rule_bindings_wff_table$, NIL));
        defparameter("*RULE-BINDINGS-TO-CLOSED-WFF-PRUNING-ENABLED?*", NIL);
        defparameter("*MAINTAIN-PROBLEM-CREATION-TIMES?*", NIL);
        deflexical("*PROBLEM-CREATION-TIMES*", SubLTrampolineFile.maybeDefault($problem_creation_times$, $problem_creation_times$, NIL));
        deflexical("*LEVIATHAN-CRTL-INTERNAL-TIME-UNITS-PER-SECOND*", $int$1000000);
        defparameter("*DOPPELGANGER-TIME-THRESHOLD*", THREE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_leviathan_file() {
        memoization_state.note_globally_cached_function(CACHED_LOAD_ALL_HAYSTACKS);
        memoization_state.note_globally_cached_function(CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS);
        memoization_state.note_globally_cached_function(CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS);
        declare_defglobal($rule_bindings_wff_table$);
        declare_defglobal($problem_creation_times$);
        note_funcall_helper_function(DOPPELGANGER_P);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_leviathan_file();
    }

    @Override
    public void initializeVariables() {
        init_leviathan_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_leviathan_file();
    }

    static {

















































































































































































































































































    }
}

/**
 * Total time: 7561 ms
 */
