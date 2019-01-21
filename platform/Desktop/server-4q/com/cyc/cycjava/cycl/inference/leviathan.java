package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.ontology_layers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_iterators;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class leviathan extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.leviathan";
    public static final String myFingerPrint = "7a5863f587482f3cfef4070b227c575a3de5875a542c3ab309acacd66afeb1e4";
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 866L)
    private static SubLSymbol $leviathan_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 947L)
    private static SubLSymbol $leviathan_experiment_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 1167L)
    private static SubLSymbol $standard_leviathan_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 2349L)
    public static SubLSymbol $leviathan_outlier_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5494L)
    private static SubLSymbol $cached_load_all_haystacks_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 6590L)
    private static SubLSymbol $cached_load_all_instantiated_haystacks_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 8941L)
    private static SubLSymbol $cached_load_all_crippled_haystacks_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 28451L)
    private static SubLSymbol $sorted_rule_analyses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 35613L)
    private static SubLSymbol $rule_bindings_wff_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 36342L)
    public static SubLSymbol $rule_bindings_to_closed_wff_pruning_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 39427L)
    public static SubLSymbol $maintain_problem_creation_timesP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 39520L)
    private static SubLSymbol $problem_creation_times$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 53625L)
    private static SubLSymbol $leviathan_crtl_internal_time_units_per_second$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 62251L)
    private static SubLSymbol $doppelganger_time_threshold$;
    private static final SubLString $str0$_cyc_projects_inference_leviathan;
    private static final SubLString $str1$experiments_;
    private static final SubLSymbol $kw2$TIME_TO_LAST_ANSWER;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw8$QUERY_SPEC_SET;
    private static final SubLSymbol $kw9$FILENAME;
    private static final SubLSymbol $kw10$COMMENT;
    private static final SubLSymbol $kw11$OVERRIDING_QUERY_PROPERTIES;
    private static final SubLSymbol $kw12$METRICS;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$OUTLIER_TIMEOUT;
    private static final SubLSymbol $sym15$_LEVIATHAN_OUTLIER_TIMEOUT_;
    private static final SubLSymbol $kw16$INCREMENTAL;
    private static final SubLSymbol $kw17$INCLUDE_RESULTS;
    private static final SubLSymbol $kw18$SKIP;
    private static final SubLSymbol $kw19$COUNT;
    private static final SubLSymbol $kw20$DIRECTORY;
    private static final SubLSymbol $sym21$FILENAME_VAR;
    private static final SubLSymbol $sym22$FULL_FILENAME;
    private static final SubLSymbol $sym23$CLET;
    private static final SubLSymbol $sym24$FWHEN;
    private static final SubLSymbol $sym25$LEVIATHAN_EXPERIMENT_FULL_FILENAME;
    private static final SubLSymbol $sym26$RUN_KBQ_EXPERIMENT;
    private static final SubLObject $const27$KBContentLeviathanQuery;
    private static final SubLObject $const28$HALOLeviathanQuery;
    private static final SubLObject $const29$AutogeneratedLeviathanQuery;
    private static final SubLString $str30$data_haystacks_;
    private static final SubLString $str31$_haystack_;
    private static final SubLString $str32$_cfasl;
    private static final SubLSymbol $sym33$CACHED_LOAD_ALL_HAYSTACKS;
    private static final SubLSymbol $sym34$_CACHED_LOAD_ALL_HAYSTACKS_CACHING_STATE_;
    private static final SubLSymbol $sym35$DIRECTORY_P;
    private static final SubLString $str36$Loading_all_haystacks;
    private static final SubLString $str37$cdolist;
    private static final SubLSymbol $sym38$_;
    private static final SubLSymbol $sym39$HAYSTACK_SIZE;
    private static final SubLString $str40$____Total_haystacks_;
    private static final SubLString $str41$____Interesting_haystacks_;
    private static final SubLSymbol $sym42$INTERESTING_HAYSTACK_P;
    private static final SubLSymbol $sym43$CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS;
    private static final SubLSymbol $sym44$_CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS_CACHING_STATE_;
    private static final SubLString $str45$data_instantiated_haystacks_;
    private static final SubLString $str46$Loading_all_instantiated_haystack;
    private static final SubLString $str47$____Total_instantiated_haystacks_;
    private static final SubLSymbol $sym48$FIX_HAYSTACK_VARIABLES;
    private static final SubLString $str49$_a_;
    private static final SubLSymbol $sym50$CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS;
    private static final SubLSymbol $sym51$_CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS_CACHING_STATE_;
    private static final SubLString $str52$data_crippled_haystacks_;
    private static final SubLString $str53$Loading_all_crippled_haystacks;
    private static final SubLString $str54$____Total_crippled_haystacks___a;
    private static final SubLString $str55$Reifying_all_instantiated_haystac;
    private static final SubLString $str56$Reifying_all_crippled_haystacks;
    private static final SubLObject $const57$isa;
    private static final SubLList $list58;
    private static final SubLObject $const59$UniversalVocabularyMt;
    private static final SubLList $list60;
    private static final SubLObject $const61$TestVocabularyMt;
    private static final SubLObject $const62$softwareParameterValueInSpecifica;
    private static final SubLObject $const63$InferenceMaxTransformationStepsPa;
    private static final SubLList $list64;
    private static final SubLObject $const65$UniversalVocabularyImplementation;
    private static final SubLObject $const66$InferenceAllowedRulesParameter;
    private static final SubLString $str67$LeviathanHaystack_;
    private static final SubLSymbol $kw68$MAX_TRANSFORMATION_DEPTH;
    private static final SubLString $str69$Removing_duplicate_haystacks;
    private static final SubLSymbol $kw70$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym71$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str72$haystacks_20050425_focused;
    private static final SubLString $str73$haystacks_20050425_exploratory;
    private static final SubLList $list74;
    private static final SubLObject $const75$AutogeneratedLeviathanQuery_Uncri;
    private static final SubLString $str76$deep_queries_with_1_backchain;
    private static final SubLList $list77;
    private static final SubLObject $const78$KBContentLeviathanQuery_Training;
    private static final SubLObject $const79$KBContentLeviathanQuery_Blind;
    private static final SubLObject $const80$HALOLeviathanQuery_Training;
    private static final SubLObject $const81$HALOLeviathanQuery_Blind;
    private static final SubLObject $const82$AutogeneratedLeviathanQuery_Uncri;
    private static final SubLObject $const83$AutogeneratedLeviathanQuery_Uncri;
    private static final SubLObject $const84$AutogeneratedLeviathanQuery_Cripp;
    private static final SubLObject $const85$AutogeneratedLeviathanQuery_Cripp;
    private static final SubLObject $const86$AutogeneratedLeviathanQuery_Cripp;
    private static final SubLFloat $float87$0_8;
    private static final SubLString $str88$Oops__off_by_one_error_in_first_n;
    private static final SubLString $str89$could_not_unassert__a_at_Cyc_laye;
    private static final SubLString $str90$could_not_unassert__a_at_HL;
    private static final SubLString $str91$could_not_unassert__a_via_TMS;
    private static final SubLString $str92$kb_content_training_justification;
    private static final SubLString $str93$Asserting_allowed_rules_for_answe;
    private static final SubLSymbol $sym94$RULE_ASSERTION_;
    private static final SubLObject $const95$TheList;
    private static final SubLObject $const96$LeviathanQuery_Training;
    private static final SubLSymbol $kw97$BREADTH;
    private static final SubLSymbol $kw98$QUEUE;
    private static final SubLSymbol $kw99$STACK;
    private static final SubLSymbol $sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw101$ERROR;
    private static final SubLString $str102$_A_is_not_a__A;
    private static final SubLSymbol $sym103$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw104$CERROR;
    private static final SubLString $str105$continue_anyway;
    private static final SubLSymbol $kw106$WARN;
    private static final SubLString $str107$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str108$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str109$attempting_to_bind_direction_link;
    private static final SubLList $list110;
    private static final SubLString $str111$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym112$FAST_REIFIED_SKOLEM_;
    private static final SubLString $str113$Gathering_all_skolem_rules;
    private static final SubLSymbol $sym114$STRINGP;
    private static final SubLString $str115$Gathering_all_negative_utility_sk;
    private static final SubLSymbol $sym116$TRANSFORMATION_RULE_HISTORICAL_UTILITY;
    private static final SubLSymbol $sym117$TRANSFORMATION_RULE_CONSIDERED_COUNT;
    private static final SubLSymbol $sym118$TRANSFORMATION_RULE_SUCCESS_COUNT;
    private static final SubLString $str119$mapping_Cyc_rules;
    private static final SubLObject $const120$skolem;
    private static final SubLSymbol $sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym124$CSETQ;
    private static final SubLString $str125$_A;
    private static final SubLList $list126;
    private static final SubLSymbol $kw127$SUCKY_SKOLEM_RULE;
    private static final SubLSymbol $kw128$NEGATIVE_UTILITY_SKOLEM_RULE;
    private static final SubLSymbol $kw129$INERT_SKOLEM_RULE;
    private static final SubLSymbol $kw130$SUCCESSFUL_SKOLEM_RULE;
    private static final SubLSymbol $kw131$NEVER_CONSIDERED_FORWARD_SKOLEM_RULE;
    private static final SubLSymbol $kw132$NEVER_CONSIDERED_BACKWARD_SKOLEM_RULE;
    private static final SubLSymbol $kw133$INERT_RULE;
    private static final SubLSymbol $kw134$SUCKY_RULE;
    private static final SubLSymbol $kw135$BACKWARD_SUCCESSFUL_FORWARD_RULE;
    private static final SubLSymbol $kw136$BACKWARD_SUCCESSFUL_BACKWARD_RULE;
    private static final SubLSymbol $kw137$SUCCESSFUL_FORWARD_RULE;
    private static final SubLSymbol $kw138$UNSUCCESSFUL_FORWARD_RULE;
    private static final SubLSymbol $kw139$UNSUCCESSFUL_BACKWARD_RULE_WITH_DEPENDENTS;
    private static final SubLSymbol $kw140$OTHER;
    private static final SubLObject $const141$AutogeneratedLeviathanQuery_Train;
    private static final SubLObject $const142$CycLQuerySpecification;
    private static final SubLSymbol $kw143$CONDITIONAL_SENTENCE_;
    private static final SubLObject $const144$BaseKB;
    private static final SubLObject $const145$InferenceConditionalSentenceParam;
    private static final SubLObject $const146$True;
    private static final SubLString $str147$pre_halo_training_rule_bindings_t;
    private static final SubLSymbol $kw148$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$_RULE_BINDINGS_WFF_TABLE_;
    private static final SubLString $str151$_cyc_projects_inference_leviathan;
    private static final SubLSymbol $kw152$LOGSCALE_Y_;
    private static final SubLSymbol $kw153$YLABEL;
    private static final SubLSymbol $kw154$PLOT_TITLE;
    private static final SubLString $str155$Answerable_vs__Unanswerable_;
    private static final SubLList $list156;
    private static final SubLSymbol $kw157$TOTAL_ANSWERABLE;
    private static final SubLString $str158$Oracularly_Answerable_vs__Unanswe;
    private static final SubLSymbol $sym159$_PROBLEM_CREATION_TIMES_;
    private static final SubLString $str160$halo_queries_with_1_backchain_823;
    private static final SubLList $list161;
    private static final SubLString $str162$Leviathan_Training;
    private static final SubLString $str163$_0;
    private static final SubLSymbol $sym164$BOUND_SYMBOL_P;
    private static final SubLString $str165$____Basic_analysis____;
    private static final SubLString $str166$____Answerable____;
    private static final SubLString $str167$____Unanswerable____;
    private static final SubLString $str168$____KB_Content____;
    private static final SubLString $str169$____Autogenerated____;
    private static final SubLString $str170$____HALO____;
    private static final SubLString $str171$____Answerable_KB_Content____;
    private static final SubLString $str172$____Answerable_Autogenerated____;
    private static final SubLString $str173$____Answerable_HALO____;
    private static final SubLString $str174$____Unanswerable_KB_Content____;
    private static final SubLString $str175$____Unanswerable_Autogenerated___;
    private static final SubLString $str176$____Unanswerable_HALO____;
    private static final SubLString $str177$______of_queries_answerable_in__B;
    private static final SubLString $str178$Total___________s__s__s__;
    private static final SubLString $str179$KB_Content______s__s__s__;
    private static final SubLString $str180$Autogenerated___s__s__s__;
    private static final SubLString $str181$HALO____________s__s__s__;
    private static final SubLString $str182$____Key___BASELINE_VALUE__EXPERIM;
    private static final SubLString $str183$____Mutually_Answerable____;
    private static final SubLString $str184$____Mutually_Answerable_KB_Conten;
    private static final SubLString $str185$____Mutually_Answerable_Autogener;
    private static final SubLString $str186$____Mutually_Answerable_HALO____;
    private static final SubLSymbol $kw187$BOTH;
    private static final SubLString $str188$Mutually_Answerable_;
    private static final SubLSymbol $kw189$BASELINE;
    private static final SubLString $str190$__;
    private static final SubLString $str191$_vs__;
    private static final SubLString $str192$_n;
    private static final SubLSymbol $kw193$XLABEL;
    private static final SubLString $str194$Sorted_Queries;
    private static final SubLSymbol $kw195$BASELINE_KEY_LABEL;
    private static final SubLSymbol $kw196$EXPERIMENT_KEY_LABEL;
    private static final SubLList $list197;
    private static final SubLList $list198;
    private static final SubLString $str199$_;
    private static final SubLList $list200;
    private static final SubLString $str201$time;
    private static final SubLString $str202$Time__sec_;
    private static final SubLString $str203$problem;
    private static final SubLString $str204$__of_problems;
    private static final SubLString $str205$link;
    private static final SubLString $str206$__of_links;
    private static final SubLString $str207$tactic;
    private static final SubLString $str208$__of_tactics;
    private static final SubLString $str209$proof;
    private static final SubLString $str210$__of_proofs;
    private static final SubLString $str211$answer;
    private static final SubLString $str212$__of_answers;
    private static final SubLString $str213$byte;
    private static final SubLString $str214$__of_bytes;
    private static final SubLString $str215$;
    private static final SubLString $str216$training_823_h_queries_0602;
    private static final SubLSymbol $kw217$PROBLEM_QUERIES;
    private static final SubLSymbol $kw218$NEG;
    private static final SubLList $list219;
    private static final SubLSymbol $kw220$POS;
    private static final SubLSymbol $sym221$_;
    private static final SubLSymbol $sym222$CDR;
    private static final SubLInteger $int223$1000000;
    private static final SubLSymbol $sym224$ELAPSED_CRTL_INTERNAL_REAL_TIME_TO_ELAPSED_SECONDS;
    private static final SubLSymbol $kw225$NEW_ROOT_RELATIVE_TOTAL_TIMES;
    private static final SubLSymbol $kw226$NEW_ROOT_RELATIVE_ANSWER_TIMES;
    private static final SubLSymbol $sym227$SECOND;
    private static final SubLSymbol $sym228$KBQ_INTERNAL_REAL_TIME_TO_SECONDS;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLSymbol $sym231$_;
    private static final SubLSymbol $sym232$SINGLE_LITERAL_PROBLEM_P;
    private static final SubLSymbol $sym233$CYCL_LITERAL_P;
    private static final SubLList $list234;
    private static final SubLSymbol $kw235$TRANSFORMATION;
    private static final SubLSymbol $kw236$TRANS_UNBOUND_PREDICATE_POS;
    private static final SubLString $str237$Doppelganging___;
    private static final SubLString $str238$Skipping_term__A_due_to_error____;
    private static final SubLList $list239;
    private static final SubLList $list240;
    private static final SubLString $str241$Doppelganger_;
    private static final SubLString $str242$_;
    private static final SubLSymbol $sym243$DOPPELGANGER_P;
    private static final SubLString $str244$Slow_assertion___s;
    private static final SubLObject $const245$doppelgangers;
    private static final SubLObject $const246$BookkeepingMt;
    private static final SubLSymbol $kw247$BACKWARD;
    private static final SubLSymbol $kw248$TRUE;
    private static final SubLSymbol $kw249$DEFAULT;
    private static final SubLString $str250$doppelgangers;
    private static final SubLObject $ic251;
    private static final SubLList $list252;
    private static final SubLList $list253;
    private static final SubLList $list254;
    private static final SubLList $list255;
    private static final SubLList $list256;
    private static final SubLList $list257;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 1053L)
    public static SubLObject basic_leviathan_query_metrics() {
        return Sequences.remove((SubLObject)leviathan.$kw2$TIME_TO_LAST_ANSWER, inference_datastructures_enumerated_types.all_arete_query_metrics(), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 1853L)
    public static SubLObject standard_leviathan_query_metrics() {
        return leviathan.$standard_leviathan_query_metrics$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 1949L)
    public static SubLObject all_leviathan_query_metrics() {
        return Sequences.reverse(conses_high.set_difference(inference_datastructures_enumerated_types.all_query_metrics(), (SubLObject)leviathan.$list4, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 2168L)
    public static SubLObject leviathan_experiment_full_filename(final SubLObject filename, SubLObject directory) {
        if (directory == leviathan.UNPROVIDED) {
            directory = leviathan.$leviathan_experiment_directory$.getGlobalValue();
        }
        return arete.arete_experiment_full_filename(filename, directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 2516L)
    public static SubLObject run_leviathan_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)leviathan.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)leviathan.NIL;
        SubLObject current_$1 = (SubLObject)leviathan.NIL;
        while (leviathan.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)leviathan.$list5);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)leviathan.$list5);
            if (leviathan.NIL == conses_high.member(current_$1, (SubLObject)leviathan.$list6, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
                bad = (SubLObject)leviathan.T;
            }
            if (current_$1 == leviathan.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (leviathan.NIL != bad && leviathan.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list5);
        }
        final SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw8$QUERY_SPEC_SET, current);
        final SubLObject query_spec_set = (SubLObject)((leviathan.NIL != query_spec_set_tail) ? conses_high.cadr(query_spec_set_tail) : leviathan.NIL);
        final SubLObject filename_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw9$FILENAME, current);
        final SubLObject filename = (SubLObject)((leviathan.NIL != filename_tail) ? conses_high.cadr(filename_tail) : leviathan.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw10$COMMENT, current);
        final SubLObject comment = (SubLObject)((leviathan.NIL != comment_tail) ? conses_high.cadr(comment_tail) : leviathan.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw11$OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (SubLObject)((leviathan.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : leviathan.NIL);
        final SubLObject metrics_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw12$METRICS, current);
        final SubLObject metrics = (SubLObject)((leviathan.NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : leviathan.$list13);
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw14$OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (SubLObject)((leviathan.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : leviathan.$sym15$_LEVIATHAN_OUTLIER_TIMEOUT_);
        final SubLObject incremental_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw16$INCREMENTAL, current);
        final SubLObject incremental = (SubLObject)((leviathan.NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : leviathan.T);
        final SubLObject include_results_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw17$INCLUDE_RESULTS, current);
        final SubLObject include_results = (SubLObject)((leviathan.NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : leviathan.NIL);
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw18$SKIP, current);
        final SubLObject skip = (SubLObject)((leviathan.NIL != skip_tail) ? conses_high.cadr(skip_tail) : leviathan.ZERO_INTEGER);
        final SubLObject count_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw19$COUNT, current);
        final SubLObject count = (SubLObject)((leviathan.NIL != count_tail) ? conses_high.cadr(count_tail) : leviathan.NIL);
        final SubLObject directory_tail = cdestructuring_bind.property_list_member((SubLObject)leviathan.$kw20$DIRECTORY, current);
        final SubLObject directory = (leviathan.NIL != directory_tail) ? conses_high.cadr(directory_tail) : leviathan.$leviathan_experiment_directory$.getGlobalValue();
        final SubLObject filename_var = (SubLObject)leviathan.$sym21$FILENAME_VAR;
        final SubLObject full_filename = (SubLObject)leviathan.$sym22$FULL_FILENAME;
        return (SubLObject)ConsesLow.list((SubLObject)leviathan.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename), (SubLObject)ConsesLow.list(full_filename, (SubLObject)ConsesLow.list((SubLObject)leviathan.$sym24$FWHEN, filename_var, (SubLObject)ConsesLow.list((SubLObject)leviathan.$sym25$LEVIATHAN_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), (SubLObject)ConsesLow.list(new SubLObject[] { leviathan.$sym26$RUN_KBQ_EXPERIMENT, leviathan.$kw8$QUERY_SPEC_SET, query_spec_set, leviathan.$kw9$FILENAME, full_filename, leviathan.$kw10$COMMENT, comment, leviathan.$kw11$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, leviathan.$kw12$METRICS, metrics, leviathan.$kw14$OUTLIER_TIMEOUT, outlier_timeout, leviathan.$kw16$INCREMENTAL, incremental, leviathan.$kw17$INCLUDE_RESULTS, include_results, leviathan.$kw18$SKIP, skip, leviathan.$kw19$COUNT, count }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 3440L)
    public static SubLObject load_leviathan_experiment(final SubLObject filename) {
        final SubLObject full_filename = leviathan_experiment_full_filename(filename, (SubLObject)leviathan.UNPROVIDED);
        return kbq_query_run.kbq_load_query_set_run(full_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 3628L)
    public static SubLObject save_leviathan_experiment(final SubLObject experiment, final SubLObject filename) {
        final SubLObject full_filename = leviathan_experiment_full_filename(filename, (SubLObject)leviathan.UNPROVIDED);
        return kbq_query_run.kbq_save_query_set_run(experiment, full_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 3826L)
    public static SubLObject leviathan_kb_content_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, leviathan.$const27$KBContentLeviathanQuery, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 4032L)
    public static SubLObject leviathan_halo_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, leviathan.$const28$HALOLeviathanQuery, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 4184L)
    public static SubLObject leviathan_haystack_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, leviathan.$const29$AutogeneratedLeviathanQuery, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 4349L)
    public static SubLObject leviathan_kb_content_queryP(final SubLObject query) {
        return isa.isaP(query, leviathan.$const27$KBContentLeviathanQuery, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 4449L)
    public static SubLObject leviathan_halo_queryP(final SubLObject query) {
        return isa.isaP(query, leviathan.$const28$HALOLeviathanQuery, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 4538L)
    public static SubLObject leviathan_haystack_queryP(final SubLObject query) {
        return isa.isaP(query, leviathan.$const29$AutogeneratedLeviathanQuery, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 4640L)
    public static SubLObject save_haystack(final SubLObject n) {
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str30$data_haystacks_);
        final SubLObject filename = Sequences.cconcatenate(directory, new SubLObject[] { string_utilities.str(n), leviathan.$str31$_haystack_, string_utilities.str(random.random(Numbers.$most_positive_fixnum$.getGlobalValue())), leviathan.$str32$_cfasl });
        if (leviathan.NIL != file_utilities.file_valid_for_writing_p(filename)) {
            final SubLObject haystack = deep_inference_generator.generate_haystack(n);
            cfasl_utilities.cfasl_save_externalized(haystack, filename);
            return haystack;
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5176L)
    public static SubLObject load_haystack(final SubLObject filename) {
        final SubLObject full_pathname = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), new SubLObject[] { leviathan.$str30$data_haystacks_, filename });
        return cfasl_utilities.cfasl_load(full_pathname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5346L)
    public static SubLObject load_all_haystacks(SubLObject reloadP) {
        if (reloadP == leviathan.UNPROVIDED) {
            reloadP = (SubLObject)leviathan.NIL;
        }
        if (leviathan.NIL != reloadP) {
            clear_cached_load_all_haystacks();
        }
        return cached_load_all_haystacks();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5494L)
    public static SubLObject clear_cached_load_all_haystacks() {
        final SubLObject cs = leviathan.$cached_load_all_haystacks_caching_state$.getGlobalValue();
        if (leviathan.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5494L)
    public static SubLObject remove_cached_load_all_haystacks() {
        return memoization_state.caching_state_remove_function_results_with_args(leviathan.$cached_load_all_haystacks_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(leviathan.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5494L)
    public static SubLObject cached_load_all_haystacks_internal() {
        return load_all_haystacks_int();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5494L)
    public static SubLObject cached_load_all_haystacks() {
        SubLObject caching_state = leviathan.$cached_load_all_haystacks_caching_state$.getGlobalValue();
        if (leviathan.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)leviathan.$sym33$CACHED_LOAD_ALL_HAYSTACKS, (SubLObject)leviathan.$sym34$_CACHED_LOAD_ALL_HAYSTACKS_CACHING_STATE_, (SubLObject)leviathan.NIL, (SubLObject)leviathan.EQ, (SubLObject)leviathan.ZERO_INTEGER, (SubLObject)leviathan.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)leviathan.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_load_all_haystacks_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)leviathan.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5592L)
    public static SubLObject load_all_haystacks_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject haystacks = (SubLObject)leviathan.NIL;
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str30$data_haystacks_);
        assert leviathan.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)leviathan.T);
        final SubLObject progress_message_var = (SubLObject)leviathan.$str36$Loading_all_haystacks;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (leviathan.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((leviathan.NIL != progress_message_var) ? progress_message_var : leviathan.$str37$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)leviathan.NIL;
                    file = csome_list_var.first();
                    while (leviathan.NIL != csome_list_var) {
                        haystacks = (SubLObject)ConsesLow.cons(cfasl_utilities.cfasl_load(file), haystacks);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        haystacks = list_utilities.fast_delete_duplicates(haystacks, Symbols.symbol_function((SubLObject)leviathan.EQUAL), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        return Sort.sort(haystacks, Symbols.symbol_function((SubLObject)leviathan.$sym38$_), (SubLObject)leviathan.$sym39$HAYSTACK_SIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 5979L)
    public static SubLObject show_haystack_statistics() {
        final SubLObject haystacks = load_all_haystacks((SubLObject)leviathan.UNPROVIDED);
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str40$____Total_haystacks_);
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar((SubLObject)leviathan.$sym39$HAYSTACK_SIZE, haystacks), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), Symbols.symbol_function((SubLObject)leviathan.EQ), Symbols.symbol_function((SubLObject)leviathan.$sym38$_)), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str41$____Interesting_haystacks_);
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar((SubLObject)leviathan.$sym39$HAYSTACK_SIZE, list_utilities.remove_if_not((SubLObject)leviathan.$sym42$INTERESTING_HAYSTACK_P, haystacks, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), Symbols.symbol_function((SubLObject)leviathan.EQ), Symbols.symbol_function((SubLObject)leviathan.$sym38$_)), (SubLObject)leviathan.UNPROVIDED);
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 6376L)
    public static SubLObject load_all_instantiated_haystacks(SubLObject reloadP) {
        if (reloadP == leviathan.UNPROVIDED) {
            reloadP = (SubLObject)leviathan.NIL;
        }
        if (leviathan.NIL != reloadP) {
            clear_cached_load_all_instantiated_haystacks();
        }
        return cached_load_all_instantiated_haystacks();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 6590L)
    public static SubLObject clear_cached_load_all_instantiated_haystacks() {
        final SubLObject cs = leviathan.$cached_load_all_instantiated_haystacks_caching_state$.getGlobalValue();
        if (leviathan.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 6590L)
    public static SubLObject remove_cached_load_all_instantiated_haystacks() {
        return memoization_state.caching_state_remove_function_results_with_args(leviathan.$cached_load_all_instantiated_haystacks_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(leviathan.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 6590L)
    public static SubLObject cached_load_all_instantiated_haystacks_internal() {
        return load_all_instantiated_haystacks_int();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 6590L)
    public static SubLObject cached_load_all_instantiated_haystacks() {
        SubLObject caching_state = leviathan.$cached_load_all_instantiated_haystacks_caching_state$.getGlobalValue();
        if (leviathan.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)leviathan.$sym43$CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS, (SubLObject)leviathan.$sym44$_CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS_CACHING_STATE_, (SubLObject)leviathan.NIL, (SubLObject)leviathan.EQ, (SubLObject)leviathan.ZERO_INTEGER, (SubLObject)leviathan.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)leviathan.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_load_all_instantiated_haystacks_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)leviathan.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 6714L)
    public static SubLObject load_all_instantiated_haystacks_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject instantiated_haystacks = (SubLObject)leviathan.NIL;
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str45$data_instantiated_haystacks_);
        assert leviathan.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)leviathan.T);
        final SubLObject progress_message_var = (SubLObject)leviathan.$str46$Loading_all_instantiated_haystack;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (leviathan.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$4 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((leviathan.NIL != progress_message_var) ? progress_message_var : leviathan.$str37$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)leviathan.NIL;
                    file = csome_list_var.first();
                    while (leviathan.NIL != csome_list_var) {
                        instantiated_haystacks = (SubLObject)ConsesLow.cons(cfasl_utilities.cfasl_load(file), instantiated_haystacks);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        instantiated_haystacks = list_utilities.fast_delete_duplicates(instantiated_haystacks, Symbols.symbol_function((SubLObject)leviathan.EQUAL), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        return Sort.sort(instantiated_haystacks, Symbols.symbol_function((SubLObject)leviathan.$sym38$_), (SubLObject)leviathan.$sym39$HAYSTACK_SIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 7205L)
    public static SubLObject show_instantiated_haystack_statistics() {
        final SubLObject instantiated_haystacks = load_all_instantiated_haystacks((SubLObject)leviathan.UNPROVIDED);
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str47$____Total_instantiated_haystacks_, Sequences.length(instantiated_haystacks));
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar((SubLObject)leviathan.$sym39$HAYSTACK_SIZE, instantiated_haystacks), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), Symbols.symbol_function((SubLObject)leviathan.EQ), Symbols.symbol_function((SubLObject)leviathan.$sym38$_)), (SubLObject)leviathan.UNPROVIDED);
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 7534L)
    public static SubLObject save_good_instantiated_haystack(final SubLObject haystacks) {
        final SubLObject instantiated_haystack = deep_inference_generator.find_good_instantiated_haystack(haystacks);
        final SubLObject n = Sequences.length(deep_inference_generator.haystack_rules(instantiated_haystack));
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str45$data_instantiated_haystacks_);
        final SubLObject filename = Sequences.cconcatenate(directory, new SubLObject[] { string_utilities.str(n), leviathan.$str31$_haystack_, string_utilities.str(random.random(Numbers.$most_positive_fixnum$.getGlobalValue())), leviathan.$str32$_cfasl });
        if (leviathan.NIL != file_utilities.file_valid_for_writing_p(filename)) {
            cfasl_utilities.cfasl_save_externalized(instantiated_haystack, filename);
            return instantiated_haystack;
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 8061L)
    public static SubLObject make_haystacks_good(SubLObject min_size, SubLObject max_size) {
        if (min_size == leviathan.UNPROVIDED) {
            min_size = (SubLObject)leviathan.TWO_INTEGER;
        }
        if (max_size == leviathan.UNPROVIDED) {
            max_size = Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        SubLObject haystacks = load_all_haystacks((SubLObject)leviathan.UNPROVIDED);
        haystacks = Mapping.mapcar((SubLObject)leviathan.$sym48$FIX_HAYSTACK_VARIABLES, list_utilities.remove_if_not((SubLObject)leviathan.$sym42$INTERESTING_HAYSTACK_P, haystacks, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED));
        SubLObject big_haystacks = (SubLObject)leviathan.NIL;
        SubLObject cdolist_list_var = haystacks;
        SubLObject haystack = (SubLObject)leviathan.NIL;
        haystack = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            if (deep_inference_generator.haystack_size(haystack).numGE(min_size) && deep_inference_generator.haystack_size(haystack).numLE(max_size)) {
                big_haystacks = (SubLObject)ConsesLow.cons(haystack, big_haystacks);
            }
            cdolist_list_var = cdolist_list_var.rest();
            haystack = cdolist_list_var.first();
        }
        haystacks = Sequences.nreverse(big_haystacks);
        while (true) {
            final SubLObject good_haystack = save_good_instantiated_haystack(haystacks);
            final SubLObject n = deep_inference_generator.haystack_size(good_haystack);
            PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str49$_a_, n);
            streams_high.force_output((SubLObject)leviathan.UNPROVIDED);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 8743L)
    public static SubLObject load_all_crippled_haystacks(SubLObject reloadP) {
        if (reloadP == leviathan.UNPROVIDED) {
            reloadP = (SubLObject)leviathan.NIL;
        }
        if (leviathan.NIL != reloadP) {
            clear_cached_load_all_crippled_haystacks();
        }
        return cached_load_all_crippled_haystacks();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 8941L)
    public static SubLObject clear_cached_load_all_crippled_haystacks() {
        final SubLObject cs = leviathan.$cached_load_all_crippled_haystacks_caching_state$.getGlobalValue();
        if (leviathan.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 8941L)
    public static SubLObject remove_cached_load_all_crippled_haystacks() {
        return memoization_state.caching_state_remove_function_results_with_args(leviathan.$cached_load_all_crippled_haystacks_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(leviathan.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 8941L)
    public static SubLObject cached_load_all_crippled_haystacks_internal() {
        return load_all_crippled_haystacks_int();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 8941L)
    public static SubLObject cached_load_all_crippled_haystacks() {
        SubLObject caching_state = leviathan.$cached_load_all_crippled_haystacks_caching_state$.getGlobalValue();
        if (leviathan.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)leviathan.$sym50$CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS, (SubLObject)leviathan.$sym51$_CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS_CACHING_STATE_, (SubLObject)leviathan.NIL, (SubLObject)leviathan.EQ, (SubLObject)leviathan.ZERO_INTEGER, (SubLObject)leviathan.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)leviathan.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_load_all_crippled_haystacks_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)leviathan.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 9057L)
    public static SubLObject load_all_crippled_haystacks_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject crippled_haystacks = (SubLObject)leviathan.NIL;
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str52$data_crippled_haystacks_);
        assert leviathan.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)leviathan.T);
        final SubLObject progress_message_var = (SubLObject)leviathan.$str53$Loading_all_crippled_haystacks;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (leviathan.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$6 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((leviathan.NIL != progress_message_var) ? progress_message_var : leviathan.$str37$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)leviathan.NIL;
                    file = csome_list_var.first();
                    while (leviathan.NIL != csome_list_var) {
                        crippled_haystacks = (SubLObject)ConsesLow.cons(cfasl_utilities.cfasl_load(file), crippled_haystacks);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        crippled_haystacks = list_utilities.fast_delete_duplicates(crippled_haystacks, Symbols.symbol_function((SubLObject)leviathan.EQUAL), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        return Sort.sort(crippled_haystacks, Symbols.symbol_function((SubLObject)leviathan.$sym38$_), (SubLObject)leviathan.$sym39$HAYSTACK_SIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 9516L)
    public static SubLObject show_crippled_haystack_statistics() {
        final SubLObject crippled_haystacks = load_all_crippled_haystacks((SubLObject)leviathan.UNPROVIDED);
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str54$____Total_crippled_haystacks___a, Sequences.length(crippled_haystacks));
        format_nil.print_one_per_line(list_utilities.histogram(Mapping.mapcar((SubLObject)leviathan.$sym39$HAYSTACK_SIZE, crippled_haystacks), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), Symbols.symbol_function((SubLObject)leviathan.EQ), Symbols.symbol_function((SubLObject)leviathan.$sym38$_)), (SubLObject)leviathan.UNPROVIDED);
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 9821L)
    public static SubLObject make_haystacks_crippled(SubLObject min_size, SubLObject max_size) {
        if (min_size == leviathan.UNPROVIDED) {
            min_size = (SubLObject)leviathan.TWO_INTEGER;
        }
        if (max_size == leviathan.UNPROVIDED) {
            max_size = Numbers.$most_positive_fixnum$.getGlobalValue();
        }
        final SubLObject instantiated_haystacks = load_all_instantiated_haystacks((SubLObject)leviathan.UNPROVIDED);
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str52$data_crippled_haystacks_);
        while (true) {
            final SubLObject instantiated_haystack = list_utilities.random_element(instantiated_haystacks);
            final SubLObject size = deep_inference_generator.haystack_size(instantiated_haystack);
            if (size.numGE(min_size) && size.numLE(max_size)) {
                final SubLObject crippled_haystack = deep_inference_generator.cripple_haystack(instantiated_haystack);
                final SubLObject n = Sequences.length(deep_inference_generator.haystack_rules(crippled_haystack));
                final SubLObject filename = Sequences.cconcatenate(directory, new SubLObject[] { string_utilities.str(n), leviathan.$str31$_haystack_, string_utilities.str(random.random(Numbers.$most_positive_fixnum$.getGlobalValue())), leviathan.$str32$_cfasl });
                if (leviathan.NIL == file_utilities.file_valid_for_writing_p(filename)) {
                    continue;
                }
                cfasl_utilities.cfasl_save_externalized(crippled_haystack, filename);
                PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str49$_a_, n);
                streams_high.force_output((SubLObject)leviathan.UNPROVIDED);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 10681L)
    public static SubLObject reify_all_haystacks() {
        return Numbers.add(reify_all_instantiated_haystacks(), reify_all_crippled_haystacks());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 10854L)
    public static SubLObject reify_all_instantiated_haystacks() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str45$data_instantiated_haystacks_);
        assert leviathan.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)leviathan.T);
        final SubLObject progress_message_var = (SubLObject)leviathan.$str55$Reifying_all_instantiated_haystac;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (leviathan.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((leviathan.NIL != progress_message_var) ? progress_message_var : leviathan.$str37$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)leviathan.NIL;
                    file = csome_list_var.first();
                    while (leviathan.NIL != csome_list_var) {
                        if (leviathan.NIL != reify_haystack(file, (SubLObject)leviathan.T)) {
                            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$8, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 11189L)
    public static SubLObject reify_all_crippled_haystacks() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject directory = Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str52$data_crippled_haystacks_);
        assert leviathan.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)leviathan.T);
        final SubLObject progress_message_var = (SubLObject)leviathan.$str56$Reifying_all_crippled_haystacks;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (leviathan.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$10 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((leviathan.NIL != progress_message_var) ? progress_message_var : leviathan.$str37$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)leviathan.NIL;
                    file = csome_list_var.first();
                    while (leviathan.NIL != csome_list_var) {
                        if (leviathan.NIL != reify_haystack(file, (SubLObject)leviathan.NIL)) {
                            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$10, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 11514L)
    public static SubLObject reify_haystack(final SubLObject filename, final SubLObject answerableP) {
        final SubLObject haystack = cfasl_utilities.cfasl_load(filename);
        final SubLObject ist_query = deep_inference_generator.haystack_query(haystack);
        final SubLObject rules = deep_inference_generator.haystack_rules(haystack);
        final SubLObject size = deep_inference_generator.haystack_size(haystack);
        final SubLObject const_name = haystack_constant_name_from_filename(filename);
        if (leviathan.NIL == constants_high.find_constant(const_name)) {
            final SubLObject query_const = ke.ke_create_now(const_name, (SubLObject)leviathan.UNPROVIDED);
            if (leviathan.NIL != answerableP) {
                ke.ke_assert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query_const, (SubLObject)leviathan.$list58), leviathan.$const59$UniversalVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            }
            else {
                ke.ke_assert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query_const, (SubLObject)leviathan.$list60), leviathan.$const59$UniversalVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            }
            ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(ist_query, query_const), leviathan.$const61$TestVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            ke.ke_assert_now((SubLObject)ConsesLow.list(leviathan.$const62$softwareParameterValueInSpecifica, leviathan.$const63$InferenceMaxTransformationStepsPa, size, query_const), leviathan.$const61$TestVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            ke.ke_unassert_now((SubLObject)leviathan.$list64, leviathan.$const65$UniversalVocabularyImplementation);
            ke.ke_assert_now((SubLObject)ConsesLow.list(leviathan.$const62$softwareParameterValueInSpecifica, leviathan.$const66$InferenceAllowedRulesParameter, el_utilities.make_el_list(rules, (SubLObject)leviathan.UNPROVIDED), query_const), leviathan.$const61$TestVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            ke.ke_assert_now((SubLObject)leviathan.$list64, leviathan.$const65$UniversalVocabularyImplementation, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            return query_const;
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 12996L)
    public static SubLObject haystack_constant_name_from_filename(final SubLObject filename) {
        return Sequences.cconcatenate((SubLObject)leviathan.$str67$LeviathanHaystack_, haystack_id_string_from_filename(filename));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 13150L)
    public static SubLObject haystack_id_string_from_filename(final SubLObject filename) {
        return string_utilities.string_upto(string_utilities.string_after(string_utilities.string_after(conses_high.last(string_utilities.split_string(filename, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_slash)), (SubLObject)leviathan.UNPROVIDED).first(), (SubLObject)Characters.CHAR_hyphen), (SubLObject)Characters.CHAR_hyphen), (SubLObject)Characters.CHAR_period);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 13326L)
    public static SubLObject haystack_id_string_from_query(final SubLObject query) {
        final SubLObject name = constants_high.constant_name(query);
        return string_utilities.string_after(name, (SubLObject)Characters.CHAR_hyphen);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 13456L)
    public static SubLObject haystack_size_from_query(final SubLObject query) {
        return conses_high.getf(kb_query.kbq_query_properties(query), (SubLObject)leviathan.$kw68$MAX_TRANSFORMATION_DEPTH, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 13577L)
    public static SubLObject haystack_filename_from_query(final SubLObject query) {
        final SubLObject id_string = haystack_id_string_from_query(query);
        final SubLObject size = haystack_size_from_query(query);
        return Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), new SubLObject[] { leviathan.$str30$data_haystacks_, string_utilities.str(size), leviathan.$str31$_haystack_, id_string, leviathan.$str32$_cfasl });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 13843L)
    public static SubLObject instantiated_haystack_filename_from_query(final SubLObject query) {
        final SubLObject id_string = haystack_id_string_from_query(query);
        final SubLObject size = haystack_size_from_query(query);
        return Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), new SubLObject[] { leviathan.$str45$data_instantiated_haystacks_, string_utilities.str(size), leviathan.$str31$_haystack_, id_string, leviathan.$str32$_cfasl });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 14135L)
    public static SubLObject crippled_haystack_filename_from_query(final SubLObject query) {
        final SubLObject id_string = haystack_id_string_from_query(query);
        final SubLObject size = haystack_size_from_query(query);
        return Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), new SubLObject[] { leviathan.$str52$data_crippled_haystacks_, string_utilities.str(size), leviathan.$str31$_haystack_, id_string, leviathan.$str32$_cfasl });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 14419L)
    public static SubLObject remove_haystack_files(final SubLObject query) {
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject file1 = haystack_filename_from_query(query);
        final SubLObject file2 = instantiated_haystack_filename_from_query(query);
        final SubLObject file3 = crippled_haystack_filename_from_query(query);
        if (leviathan.NIL != file_utilities.delete_file_if_exists(file1)) {
            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
        }
        if (leviathan.NIL != file_utilities.delete_file_if_exists(file2)) {
            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
        }
        if (leviathan.NIL != file_utilities.delete_file_if_exists(file3)) {
            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 15032L)
    public static SubLObject remove_all_duplicate_haystack_files(SubLObject do_itP) {
        if (do_itP == leviathan.UNPROVIDED) {
            do_itP = (SubLObject)leviathan.NIL;
        }
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        count = Numbers.add(count, remove_duplicate_haystack_files_int(Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str30$data_haystacks_), do_itP));
        count = Numbers.add(count, remove_duplicate_haystack_files_int(Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str45$data_instantiated_haystacks_), do_itP));
        count = Numbers.add(count, remove_duplicate_haystack_files_int(Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str52$data_crippled_haystacks_), do_itP));
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 15514L)
    public static SubLObject remove_duplicate_haystack_files_int(final SubLObject directory, final SubLObject do_itP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject v_set = set.new_set(Symbols.symbol_function((SubLObject)leviathan.EQUAL), (SubLObject)leviathan.UNPROVIDED);
        assert leviathan.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)leviathan.T);
        final SubLObject progress_message_var = (SubLObject)leviathan.$str69$Removing_duplicate_haystacks;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (leviathan.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$12 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((leviathan.NIL != progress_message_var) ? progress_message_var : leviathan.$str37$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)leviathan.NIL;
                    file = csome_list_var.first();
                    while (leviathan.NIL != csome_list_var) {
                        final SubLObject haystack = cfasl_utilities.cfasl_load(file);
                        if (leviathan.NIL != set.set_memberP(haystack, v_set)) {
                            if (leviathan.NIL != do_itP) {
                                file_utilities.delete_file_if_exists(file);
                            }
                            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
                        }
                        else {
                            set.set_add(haystack, v_set);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$12, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 15941L)
    public static SubLObject kill_duplicate_and_broken_reified_haystacks(SubLObject do_itP) {
        if (do_itP == leviathan.UNPROVIDED) {
            do_itP = (SubLObject)leviathan.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject v_set = set.new_set(Symbols.symbol_function((SubLObject)leviathan.EQUAL), (SubLObject)leviathan.UNPROVIDED);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)leviathan.EQUAL), (SubLObject)leviathan.UNPROVIDED);
        SubLObject cdolist_list_var = isa.all_fort_instances(leviathan.$const29$AutogeneratedLeviathanQuery, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        SubLObject query = (SubLObject)leviathan.NIL;
        query = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            SubLObject sentence = (SubLObject)leviathan.NIL;
            SubLObject ignore_errors_tag = (SubLObject)leviathan.NIL;
            try {
                thread.throwStack.push(leviathan.$kw70$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)leviathan.$sym71$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        sentence = kb_query.kbq_sentence(query);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)leviathan.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)leviathan.$kw70$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            dictionary_utilities.dictionary_push(v_dictionary, sentence, query);
            if (leviathan.NIL == sentence || leviathan.NIL != set.set_memberP(sentence, v_set)) {
                if (leviathan.NIL != do_itP) {
                    ke.ke_kill(query);
                    remove_haystack_files(query);
                }
                count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
            }
            else {
                set.set_add(sentence, v_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        return Values.values(v_dictionary, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 16543L)
    public static SubLObject finalize_haystack_corpus() {
        SubLObject focused = (SubLObject)leviathan.NIL;
        SubLObject exploratory = (SubLObject)leviathan.NIL;
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        focused = load_leviathan_experiment((SubLObject)leviathan.$str72$haystacks_20050425_focused);
        exploratory = load_leviathan_experiment((SubLObject)leviathan.$str73$haystacks_20050425_exploratory);
        final SubLObject answerable_exploratory = kbq_query_run.kbq_answerable_query_set_run(exploratory);
        SubLObject cdolist_list_var;
        final SubLObject answerable_exploratory_queries = cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(answerable_exploratory);
        SubLObject query = (SubLObject)leviathan.NIL;
        query = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
            ke.ke_assert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query, (SubLObject)leviathan.$list74), leviathan.$const59$UniversalVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            ke.ke_unassert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query, (SubLObject)leviathan.$list60), leviathan.$const59$UniversalVocabularyMt);
            ke.ke_unassert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query, (SubLObject)leviathan.$list58), leviathan.$const59$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        final SubLObject unanswerable_focused = kbq_query_run.kbq_unanswerable_query_set_run(focused);
        final SubLObject unanswerable_focused_queries = kbq_query_run.kbq_query_set_run_queries(unanswerable_focused);
        SubLObject cdolist_list_var2;
        final SubLObject uncrippled_unanswerable_focused_queries = cdolist_list_var2 = isa.all_instances_among(leviathan.$const75$AutogeneratedLeviathanQuery_Uncri, unanswerable_focused_queries, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        SubLObject query2 = (SubLObject)leviathan.NIL;
        query2 = cdolist_list_var2.first();
        while (leviathan.NIL != cdolist_list_var2) {
            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
            ke.ke_assert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query2, (SubLObject)leviathan.$list74), leviathan.$const59$UniversalVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            ke.ke_unassert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query2, (SubLObject)leviathan.$list58), leviathan.$const59$UniversalVocabularyMt);
            cdolist_list_var2 = cdolist_list_var2.rest();
            query2 = cdolist_list_var2.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 18084L)
    public static SubLObject initialize_kb_content_leviathan_queries() {
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject deep = load_leviathan_experiment((SubLObject)leviathan.$str76$deep_queries_with_1_backchain);
        final SubLObject deep_required = kbq_query_run.kbq_unanswerable_query_set_run(deep);
        SubLObject cdolist_list_var;
        final SubLObject deep_required_queries = cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(deep_required);
        SubLObject query = (SubLObject)leviathan.NIL;
        query = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
            ke.ke_assert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, query, (SubLObject)leviathan.$list77), leviathan.$const59$UniversalVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 18533L)
    public static SubLObject determine_leviathan_training_and_blind_sets() {
        return Numbers.add(new SubLObject[] { determine_leviathan_training_and_blind_sets_int(leviathan.$const27$KBContentLeviathanQuery, leviathan.$const78$KBContentLeviathanQuery_Training, leviathan.$const79$KBContentLeviathanQuery_Blind), determine_leviathan_training_and_blind_sets_int(leviathan.$const28$HALOLeviathanQuery, leviathan.$const80$HALOLeviathanQuery_Training, leviathan.$const81$HALOLeviathanQuery_Blind), determine_leviathan_training_and_blind_sets_int(leviathan.$const75$AutogeneratedLeviathanQuery_Uncri, leviathan.$const82$AutogeneratedLeviathanQuery_Uncri, leviathan.$const83$AutogeneratedLeviathanQuery_Uncri), determine_leviathan_training_and_blind_sets_int(leviathan.$const84$AutogeneratedLeviathanQuery_Cripp, leviathan.$const85$AutogeneratedLeviathanQuery_Cripp, leviathan.$const86$AutogeneratedLeviathanQuery_Cripp) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 19331L)
    public static SubLObject determine_leviathan_training_and_blind_sets_int(final SubLObject unsorted_col, final SubLObject training_col, final SubLObject blind_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject queries = list_utilities.randomize_list(isa.all_fort_instances(unsorted_col, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED));
        final SubLObject length = Sequences.length(queries);
        final SubLObject split = Numbers.round(Numbers.multiply(length, (SubLObject)leviathan.$float87$0_8), (SubLObject)leviathan.UNPROVIDED);
        final SubLObject training_queries = list_utilities.first_n(split, queries);
        final SubLObject blind_queries = list_utilities.last_n(Numbers.subtract(length, split), queries);
        if (leviathan.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && leviathan.NIL != list_utilities.intersectP(training_queries, blind_queries, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            Errors.error((SubLObject)leviathan.$str88$Oops__off_by_one_error_in_first_n);
        }
        SubLObject cdolist_list_var = training_queries;
        SubLObject query = (SubLObject)leviathan.NIL;
        query = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            ke.ke_assert_now((SubLObject)ConsesLow.list(leviathan.$const57$isa, query, training_col), leviathan.$const59$UniversalVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            ke.ke_unassert_now((SubLObject)ConsesLow.list(leviathan.$const57$isa, query, unsorted_col), leviathan.$const59$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        cdolist_list_var = blind_queries;
        query = (SubLObject)leviathan.NIL;
        query = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            ke.ke_assert_now((SubLObject)ConsesLow.list(leviathan.$const57$isa, query, blind_col), leviathan.$const59$UniversalVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            ke.ke_unassert_now((SubLObject)ConsesLow.list(leviathan.$const57$isa, query, unsorted_col), leviathan.$const59$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 20206L)
    public static SubLObject unassert_assertion(final SubLObject ass) {
        if (leviathan.NIL != assertions_high.valid_assertion(ass, (SubLObject)leviathan.UNPROVIDED)) {
            unassert_assertion_via_cyc(ass);
            if (leviathan.NIL != assertions_high.valid_assertion(ass, (SubLObject)leviathan.UNPROVIDED)) {
                Errors.warn((SubLObject)leviathan.$str89$could_not_unassert__a_at_Cyc_laye, ass);
                unassert_assertion_via_hl(ass);
                if (leviathan.NIL != assertions_high.valid_assertion(ass, (SubLObject)leviathan.UNPROVIDED)) {
                    Errors.warn((SubLObject)leviathan.$str90$could_not_unassert__a_at_HL, ass);
                    unassert_assertion_via_tms(ass);
                    if (leviathan.NIL != assertions_high.valid_assertion(ass, (SubLObject)leviathan.UNPROVIDED)) {
                        streams_high.force_output((SubLObject)leviathan.UNPROVIDED);
                        Errors.warn((SubLObject)leviathan.$str91$could_not_unassert__a_via_TMS, ass);
                        assertions_high.remove_assertion(ass);
                    }
                }
            }
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 20837L)
    public static SubLObject unassert_assertion_via_cyc(final SubLObject ass) {
        final SubLObject sentence = assertions_high.assertion_formula(ass);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        cyc_kernel.cyc_unassert(sentence, mt);
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 21003L)
    public static SubLObject unassert_assertion_via_hl(final SubLObject ass) {
        final SubLObject cnf = assertions_high.assertion_cnf(ass);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        hl_storage_modules.hl_unassert(cnf, mt);
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 21153L)
    public static SubLObject unassert_assertion_via_tms(final SubLObject ass) {
        tms.tms_remove_assertion(ass);
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 21245L)
    public static SubLObject assert_allowed_rules_for_justified_queries(SubLObject justifications_rabbit_hole) {
        if (justifications_rabbit_hole == leviathan.UNPROVIDED) {
            justifications_rabbit_hole = load_leviathan_experiment((SubLObject)leviathan.$str92$kb_content_training_justification);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(justifications_rabbit_hole);
        final SubLObject list_var;
        final SubLObject query_runs = list_var = kbq_query_run.kbq_query_set_run_query_runs(answerable);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str93$Asserting_allowed_rules_for_answe, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = (SubLObject)leviathan.NIL;
                query_run = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    final SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                    final SubLObject result = kbq_query_run.kbq_query_run_result(query_run);
                    final SubLObject rules = list_utilities.tree_gather(result, (SubLObject)leviathan.$sym94$RULE_ASSERTION_, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                    final SubLObject sentence = (SubLObject)ConsesLow.list(leviathan.$const62$softwareParameterValueInSpecifica, leviathan.$const66$InferenceAllowedRulesParameter, reader.bq_cons(leviathan.$const95$TheList, ConsesLow.append(rules, (SubLObject)leviathan.NIL)), query);
                    cyc_kernel.cyc_assert(sentence, leviathan.$const61$TestVocabularyMt, (SubLObject)leviathan.UNPROVIDED);
                    count = Numbers.add(count, (SubLObject)leviathan.ONE_INTEGER);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 22154L)
    public static SubLObject allowed_rules_utilities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject utilities = (SubLObject)leviathan.NIL;
        final SubLObject node_var = leviathan.$const96$LeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$15 = node_var;
                final SubLObject deck_type = (SubLObject)leviathan.$kw99$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)leviathan.NIL;
                        final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((leviathan.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((leviathan.NIL != tv_var) ? leviathan.$sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (leviathan.NIL != tv_var && leviathan.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && leviathan.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)leviathan.$kw101$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw104$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw106$WARN)) {
                                    Errors.warn((SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)leviathan.$str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                if (leviathan.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || leviathan.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$15, (SubLObject)leviathan.UNPROVIDED);
                                        while (leviathan.NIL != node_var_$15) {
                                            final SubLObject tt_node_var = node_var_$15;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa));
                                            SubLObject module_var = (SubLObject)leviathan.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (leviathan.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$27;
                                                                            for (iteration_state_$27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$27); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next(iteration_state_$27)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$27);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (leviathan.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$29;
                                                                                            SubLObject rule;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$29 = rules;
                                                                                                            rule = (SubLObject)leviathan.NIL;
                                                                                                            rule = cdolist_list_var_$29.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$29) {
                                                                                                                utilities = (SubLObject)ConsesLow.cons(inference_analysis.transformation_rule_historical_utility(rule), utilities);
                                                                                                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                                                                                                rule = cdolist_list_var_$29.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                            query2 = csome_list_var.first();
                                                                                            while (leviathan.NIL != csome_list_var) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$30 = rules2;
                                                                                                            SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                            rule2 = cdolist_list_var_$30.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$30) {
                                                                                                                utilities = (SubLObject)ConsesLow.cons(inference_analysis.transformation_rule_historical_utility(rule2), utilities);
                                                                                                                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                                                                                rule2 = cdolist_list_var_$30.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                query2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$27);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                        if (leviathan.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)leviathan.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (leviathan.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)leviathan.NIL;
                                                                SubLObject mt2 = (SubLObject)leviathan.NIL;
                                                                SubLObject tv2 = (SubLObject)leviathan.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (leviathan.NIL == current) {
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (leviathan.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject cdolist_list_var_$31;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$31 = rules;
                                                                                                        rule = (SubLObject)leviathan.NIL;
                                                                                                        rule = cdolist_list_var_$31.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$31) {
                                                                                                            utilities = (SubLObject)ConsesLow.cons(inference_analysis.transformation_rule_historical_utility(rule), utilities);
                                                                                                            cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                                                                                                            rule = cdolist_list_var_$31.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$34 = sol;
                                                                                        SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                        query2 = csome_list_var_$34.first();
                                                                                        while (leviathan.NIL != csome_list_var_$34) {
                                                                                            if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                    final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                    if (rules2.isCons()) {
                                                                                                        SubLObject cdolist_list_var_$32 = rules2;
                                                                                                        SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                        rule2 = cdolist_list_var_$32.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$32) {
                                                                                                            utilities = (SubLObject)ConsesLow.cons(inference_analysis.transformation_rule_historical_utility(rule2), utilities);
                                                                                                            cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                                                                                                            rule2 = cdolist_list_var_$32.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            csome_list_var_$34 = csome_list_var_$34.rest();
                                                                                            query2 = csome_list_var_$34.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$24, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$23, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$33;
                                                        final SubLObject new_list = cdolist_list_var_$33 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)leviathan.NIL;
                                                        generating_fn = cdolist_list_var_$33.first();
                                                        while (leviathan.NIL != cdolist_list_var_$33) {
                                                            final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (leviathan.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject query3;
                                                                    SubLObject rules3;
                                                                    SubLObject cdolist_list_var_$34;
                                                                    SubLObject rule3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)leviathan.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state2, query3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query3)) {
                                                                                rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                if (rules3.isCons()) {
                                                                                    cdolist_list_var_$34 = rules3;
                                                                                    rule3 = (SubLObject)leviathan.NIL;
                                                                                    rule3 = cdolist_list_var_$34.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$34) {
                                                                                        utilities = (SubLObject)ConsesLow.cons(inference_analysis.transformation_rule_historical_utility(rule3), utilities);
                                                                                        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                                                                                        rule3 = cdolist_list_var_$34.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject query4 = (SubLObject)leviathan.NIL;
                                                                    query4 = csome_list_var3.first();
                                                                    while (leviathan.NIL != csome_list_var3) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query4)) {
                                                                                final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                if (rules4.isCons()) {
                                                                                    SubLObject cdolist_list_var_$35 = rules4;
                                                                                    SubLObject rule4 = (SubLObject)leviathan.NIL;
                                                                                    rule4 = cdolist_list_var_$35.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$35) {
                                                                                        utilities = (SubLObject)ConsesLow.cons(inference_analysis.transformation_rule_historical_utility(rule4), utilities);
                                                                                        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                                                                                        rule4 = cdolist_list_var_$35.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                        query4 = csome_list_var3.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$25, thread);
                                                            }
                                                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                                            generating_fn = cdolist_list_var_$33.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)));
                                            SubLObject module_var2 = (SubLObject)leviathan.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (leviathan.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$15);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$28;
                                                                            for (iteration_state_$28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$28); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next(iteration_state_$28)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$28);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (leviathan.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)leviathan.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)leviathan.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (leviathan.NIL != csome_list_var4) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$28);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$36;
                                                        final SubLObject new_list2 = cdolist_list_var_$36 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)leviathan.NIL;
                                                        generating_fn2 = cdolist_list_var_$36.first();
                                                        while (leviathan.NIL != cdolist_list_var_$36) {
                                                            final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (leviathan.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)leviathan.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)leviathan.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (leviathan.NIL != csome_list_var5) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                            }
                                                            cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                                            generating_fn2 = cdolist_list_var_$36.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$22, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$15 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$23, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)leviathan.TWO_INTEGER, (SubLObject)leviathan.$str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(utilities);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 22485L)
    public static SubLObject allowed_rules_sorted_utility_tuples() {
        SubLObject tuples = (SubLObject)leviathan.NIL;
        SubLObject list_var = (SubLObject)leviathan.NIL;
        SubLObject utility = (SubLObject)leviathan.NIL;
        SubLObject i = (SubLObject)leviathan.NIL;
        list_var = Sort.sort(allowed_rules_utilities(), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), (SubLObject)leviathan.UNPROVIDED);
        utility = list_var.first();
        for (i = (SubLObject)leviathan.ZERO_INTEGER; leviathan.NIL != list_var; list_var = list_var.rest(), utility = list_var.first(), i = Numbers.add((SubLObject)leviathan.ONE_INTEGER, i)) {
            tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i, utility), tuples);
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 22703L)
    public static SubLObject skolem_ruleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(leviathan.NIL != assertions_high.rule_assertionP(v_object) && leviathan.NIL != cycl_utilities.assertion_find_if((SubLObject)leviathan.$sym112$FAST_REIFIED_SKOLEM_, v_object, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 22874L)
    public static SubLObject all_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skolem_rules = (SubLObject)leviathan.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)leviathan.$str113$Gathering_all_skolem_rules;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)leviathan.ZERO_INTEGER;
        assert leviathan.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$49 = idx;
                if (leviathan.NIL == id_index.id_index_objects_empty_p(idx_$49, (SubLObject)leviathan.$kw18$SKIP)) {
                    final SubLObject idx_$50 = idx_$49;
                    if (leviathan.NIL == id_index.id_index_dense_objects_empty_p(idx_$50, (SubLObject)leviathan.$kw18$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$50);
                        final SubLObject backwardP_var = (SubLObject)leviathan.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject rule;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)leviathan.NIL, v_iteration = (SubLObject)leviathan.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)leviathan.ONE_INTEGER)) {
                            a_id = ((leviathan.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)leviathan.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (leviathan.NIL == id_index.id_index_tombstone_p(a_handle) || leviathan.NIL == id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP)) {
                                if (leviathan.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)leviathan.$kw18$SKIP;
                                }
                                rule = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (leviathan.NIL != skolem_ruleP(rule)) {
                                    skolem_rules = (SubLObject)ConsesLow.cons(rule, skolem_rules);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)leviathan.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$51 = idx_$49;
                    if (leviathan.NIL == id_index.id_index_sparse_objects_empty_p(idx_$51) || leviathan.NIL == id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$51);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$51);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$51);
                        final SubLObject v_default = (SubLObject)((leviathan.NIL != id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP)) ? leviathan.NIL : leviathan.$kw18$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (leviathan.NIL == id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP) || leviathan.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (leviathan.NIL != skolem_ruleP(rule2)) {
                                    skolem_rules = (SubLObject)ConsesLow.cons(rule2, skolem_rules);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)leviathan.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)leviathan.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(skolem_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 23092L)
    public static SubLObject negative_utility_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skolem_rules = (SubLObject)leviathan.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)leviathan.$str115$Gathering_all_negative_utility_sk;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)leviathan.ZERO_INTEGER;
        assert leviathan.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$53 = idx;
                if (leviathan.NIL == id_index.id_index_objects_empty_p(idx_$53, (SubLObject)leviathan.$kw18$SKIP)) {
                    final SubLObject idx_$54 = idx_$53;
                    if (leviathan.NIL == id_index.id_index_dense_objects_empty_p(idx_$54, (SubLObject)leviathan.$kw18$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$54);
                        final SubLObject backwardP_var = (SubLObject)leviathan.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject rule;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)leviathan.NIL, v_iteration = (SubLObject)leviathan.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)leviathan.ONE_INTEGER)) {
                            a_id = ((leviathan.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)leviathan.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (leviathan.NIL == id_index.id_index_tombstone_p(a_handle) || leviathan.NIL == id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP)) {
                                if (leviathan.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)leviathan.$kw18$SKIP;
                                }
                                rule = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (leviathan.NIL != skolem_ruleP(rule) && inference_analysis.transformation_rule_historical_utility(rule).isNegative()) {
                                    skolem_rules = (SubLObject)ConsesLow.cons(rule, skolem_rules);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)leviathan.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$55 = idx_$53;
                    if (leviathan.NIL == id_index.id_index_sparse_objects_empty_p(idx_$55) || leviathan.NIL == id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$55);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$55);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$55);
                        final SubLObject v_default = (SubLObject)((leviathan.NIL != id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP)) ? leviathan.NIL : leviathan.$kw18$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (leviathan.NIL == id_index.id_index_skip_tombstones_p((SubLObject)leviathan.$kw18$SKIP) || leviathan.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (leviathan.NIL != skolem_ruleP(rule2) && inference_analysis.transformation_rule_historical_utility(rule2).isNegative()) {
                                    skolem_rules = (SubLObject)ConsesLow.cons(rule2, skolem_rules);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)leviathan.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)leviathan.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(skolem_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 23406L)
    public static SubLObject sorted_rule_utilities(final SubLObject rules) {
        return Sort.sort(Mapping.mapcar((SubLObject)leviathan.$sym116$TRANSFORMATION_RULE_HISTORICAL_UTILITY, rules), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 23527L)
    public static SubLObject rule_utility_tuples(final SubLObject rules) {
        SubLObject tuples = (SubLObject)leviathan.NIL;
        final SubLObject utilities = sorted_rule_utilities(rules);
        SubLObject list_var = (SubLObject)leviathan.NIL;
        SubLObject utility = (SubLObject)leviathan.NIL;
        SubLObject i = (SubLObject)leviathan.NIL;
        list_var = utilities;
        utility = list_var.first();
        for (i = (SubLObject)leviathan.ZERO_INTEGER; leviathan.NIL != list_var; list_var = list_var.rest(), utility = list_var.first(), i = Numbers.add((SubLObject)leviathan.ONE_INTEGER, i)) {
            tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i, utility), tuples);
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 23777L)
    public static SubLObject rule_consideration_tuples(final SubLObject rules) {
        SubLObject tuples = (SubLObject)leviathan.NIL;
        final SubLObject considerations = Sort.sort(Mapping.mapcar((SubLObject)leviathan.$sym117$TRANSFORMATION_RULE_CONSIDERED_COUNT, rules), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), (SubLObject)leviathan.UNPROVIDED);
        SubLObject list_var = (SubLObject)leviathan.NIL;
        SubLObject count = (SubLObject)leviathan.NIL;
        SubLObject i = (SubLObject)leviathan.NIL;
        list_var = considerations;
        count = list_var.first();
        for (i = (SubLObject)leviathan.ZERO_INTEGER; leviathan.NIL != list_var; list_var = list_var.rest(), count = list_var.first(), i = Numbers.add((SubLObject)leviathan.ONE_INTEGER, i)) {
            tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i, count), tuples);
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 24073L)
    public static SubLObject rule_success_tuples(final SubLObject rules) {
        SubLObject tuples = (SubLObject)leviathan.NIL;
        final SubLObject successes = Sort.sort(Mapping.mapcar((SubLObject)leviathan.$sym118$TRANSFORMATION_RULE_SUCCESS_COUNT, rules), Symbols.symbol_function((SubLObject)leviathan.$sym38$_), (SubLObject)leviathan.UNPROVIDED);
        SubLObject list_var = (SubLObject)leviathan.NIL;
        SubLObject count = (SubLObject)leviathan.NIL;
        SubLObject i = (SubLObject)leviathan.NIL;
        list_var = successes;
        count = list_var.first();
        for (i = (SubLObject)leviathan.ZERO_INTEGER; leviathan.NIL != list_var; list_var = list_var.rest(), count = list_var.first(), i = Numbers.add((SubLObject)leviathan.ONE_INTEGER, i)) {
            tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(i, count), tuples);
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 24350L)
    public static SubLObject skolem_rules_used_in_justified_queries(SubLObject justifications_rabbit_hole) {
        if (justifications_rabbit_hole == leviathan.UNPROVIDED) {
            justifications_rabbit_hole = load_leviathan_experiment((SubLObject)leviathan.$str92$kb_content_training_justification);
        }
        SubLObject skolem_rules = (SubLObject)leviathan.NIL;
        final SubLObject answerable = kbq_query_run.kbq_answerable_query_set_run(justifications_rabbit_hole);
        SubLObject cdolist_list_var;
        final SubLObject query_runs = cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(answerable);
        SubLObject query_run = (SubLObject)leviathan.NIL;
        query_run = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            final SubLObject result = kbq_query_run.kbq_query_run_result(query_run);
            SubLObject cdolist_list_var_$57;
            final SubLObject rules = cdolist_list_var_$57 = list_utilities.tree_gather(result, (SubLObject)leviathan.$sym94$RULE_ASSERTION_, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
            SubLObject rule = (SubLObject)leviathan.NIL;
            rule = cdolist_list_var_$57.first();
            while (leviathan.NIL != cdolist_list_var_$57) {
                if (leviathan.NIL != skolem_ruleP(rule)) {
                    skolem_rules = (SubLObject)ConsesLow.cons(rule, skolem_rules);
                }
                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                rule = cdolist_list_var_$57.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(skolem_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 24982L)
    public static SubLObject skolem_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skolem_rules = (SubLObject)leviathan.NIL;
        final SubLObject node_var = leviathan.$const96$LeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$58 = node_var;
                final SubLObject deck_type = (SubLObject)leviathan.$kw99$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)leviathan.NIL;
                        final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$61 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((leviathan.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((leviathan.NIL != tv_var) ? leviathan.$sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (leviathan.NIL != tv_var && leviathan.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && leviathan.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)leviathan.$kw101$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw104$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw106$WARN)) {
                                    Errors.warn((SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)leviathan.$str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$62 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                if (leviathan.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || leviathan.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$62 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$63 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$58, (SubLObject)leviathan.UNPROVIDED);
                                        while (leviathan.NIL != node_var_$58) {
                                            final SubLObject tt_node_var = node_var_$58;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa));
                                            SubLObject module_var = (SubLObject)leviathan.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (leviathan.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$63 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$70;
                                                                            for (iteration_state_$70 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$70); iteration_state_$70 = dictionary_contents.do_dictionary_contents_next(iteration_state_$70)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$70);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (leviathan.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$72;
                                                                                            SubLObject rule;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$72 = rules;
                                                                                                            rule = (SubLObject)leviathan.NIL;
                                                                                                            rule = cdolist_list_var_$72.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$72) {
                                                                                                                if (leviathan.NIL != skolem_ruleP(rule)) {
                                                                                                                    skolem_rules = (SubLObject)ConsesLow.cons(rule, skolem_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                                                                                                                rule = cdolist_list_var_$72.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                            query2 = csome_list_var.first();
                                                                                            while (leviathan.NIL != csome_list_var) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$73 = rules2;
                                                                                                            SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                            rule2 = cdolist_list_var_$73.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$73) {
                                                                                                                if (leviathan.NIL != skolem_ruleP(rule2)) {
                                                                                                                    skolem_rules = (SubLObject)ConsesLow.cons(rule2, skolem_rules);
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
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$65, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$70);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$64, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                        if (leviathan.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)leviathan.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (leviathan.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)leviathan.NIL;
                                                                SubLObject mt2 = (SubLObject)leviathan.NIL;
                                                                SubLObject tv2 = (SubLObject)leviathan.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (leviathan.NIL == current) {
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (leviathan.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject cdolist_list_var_$74;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$74 = rules;
                                                                                                        rule = (SubLObject)leviathan.NIL;
                                                                                                        rule = cdolist_list_var_$74.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$74) {
                                                                                                            if (leviathan.NIL != skolem_ruleP(rule)) {
                                                                                                                skolem_rules = (SubLObject)ConsesLow.cons(rule, skolem_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                                                                                                            rule = cdolist_list_var_$74.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$77 = sol;
                                                                                        SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                        query2 = csome_list_var_$77.first();
                                                                                        while (leviathan.NIL != csome_list_var_$77) {
                                                                                            if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                    final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                    if (rules2.isCons()) {
                                                                                                        SubLObject cdolist_list_var_$75 = rules2;
                                                                                                        SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                        rule2 = cdolist_list_var_$75.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$75) {
                                                                                                            if (leviathan.NIL != skolem_ruleP(rule2)) {
                                                                                                                skolem_rules = (SubLObject)ConsesLow.cons(rule2, skolem_rules);
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
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$67, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$66, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$76;
                                                        final SubLObject new_list = cdolist_list_var_$76 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)leviathan.NIL;
                                                        generating_fn = cdolist_list_var_$76.first();
                                                        while (leviathan.NIL != cdolist_list_var_$76) {
                                                            final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (leviathan.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject query3;
                                                                    SubLObject rules3;
                                                                    SubLObject cdolist_list_var_$77;
                                                                    SubLObject rule3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)leviathan.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state2, query3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query3)) {
                                                                                rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                if (rules3.isCons()) {
                                                                                    cdolist_list_var_$77 = rules3;
                                                                                    rule3 = (SubLObject)leviathan.NIL;
                                                                                    rule3 = cdolist_list_var_$77.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$77) {
                                                                                        if (leviathan.NIL != skolem_ruleP(rule3)) {
                                                                                            skolem_rules = (SubLObject)ConsesLow.cons(rule3, skolem_rules);
                                                                                        }
                                                                                        cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                                                                                        rule3 = cdolist_list_var_$77.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject query4 = (SubLObject)leviathan.NIL;
                                                                    query4 = csome_list_var3.first();
                                                                    while (leviathan.NIL != csome_list_var3) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query4)) {
                                                                                final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                if (rules4.isCons()) {
                                                                                    SubLObject cdolist_list_var_$78 = rules4;
                                                                                    SubLObject rule4 = (SubLObject)leviathan.NIL;
                                                                                    rule4 = cdolist_list_var_$78.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$78) {
                                                                                        if (leviathan.NIL != skolem_ruleP(rule4)) {
                                                                                            skolem_rules = (SubLObject)ConsesLow.cons(rule4, skolem_rules);
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
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$68, thread);
                                                            }
                                                            cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                                                            generating_fn = cdolist_list_var_$76.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$64, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$63, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)));
                                            SubLObject module_var2 = (SubLObject)leviathan.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (leviathan.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$69 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$58);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$71;
                                                                            for (iteration_state_$71 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$71); iteration_state_$71 = dictionary_contents.do_dictionary_contents_next(iteration_state_$71)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$71);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (leviathan.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)leviathan.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)leviathan.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (leviathan.NIL != csome_list_var4) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$71, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$71);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$70, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$79;
                                                        final SubLObject new_list2 = cdolist_list_var_$79 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)leviathan.NIL;
                                                        generating_fn2 = cdolist_list_var_$79.first();
                                                        while (leviathan.NIL != cdolist_list_var_$79) {
                                                            final SubLObject _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (leviathan.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)leviathan.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)leviathan.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (leviathan.NIL != csome_list_var5) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$72, thread);
                                                            }
                                                            cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                                                            generating_fn2 = cdolist_list_var_$79.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$65, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$69, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$58 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$66, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$63, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$62, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)leviathan.TWO_INTEGER, (SubLObject)leviathan.$str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$62, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$61, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$61, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$59, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$74, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(skolem_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 25313L)
    public static SubLObject kill_all_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject skolem_rules = list_var = all_skolem_rules();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject rule = (SubLObject)leviathan.NIL;
                rule = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    unassert_assertion(rule);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    rule = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(skolem_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 25508L)
    public static SubLObject kill_all_negative_utility_skolem_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject skolem_rules = list_var = negative_utility_skolem_rules();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject rule = (SubLObject)leviathan.NIL;
                rule = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    unassert_assertion(rule);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    rule = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(skolem_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 25733L)
    public static SubLObject inert_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inert_rules = (SubLObject)leviathan.NIL;
        final SubLObject message_var = (SubLObject)leviathan.$str119$mapping_Cyc_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)leviathan.NIL; leviathan.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(leviathan.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (leviathan.NIL != valid) {
                        sofar = Numbers.add(sofar, (SubLObject)leviathan.ONE_INTEGER);
                        utilities_macros.note_percent_progress(sofar, total);
                        if (leviathan.NIL != inert_ruleP(rule)) {
                            inert_rules = (SubLObject)ConsesLow.cons(rule, inert_rules);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(inert_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 25922L)
    public static SubLObject inert_ruleP(final SubLObject rule) {
        if (inference_analysis.transformation_rule_considered_count(rule).isZero() && leviathan.NIL == assertions_high.forward_ruleP(rule) && leviathan.NIL == assertion_has_non_skolem_assertion_dependentsP(rule)) {
            return (SubLObject)leviathan.T;
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 26299L)
    public static SubLObject assertion_has_non_skolem_assertion_dependentsP(final SubLObject assertion) {
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                if (leviathan.NIL == deduction_handles.deduction_p(deduction)) {
                    return (SubLObject)leviathan.T;
                }
                if (leviathan.NIL == assertion_utilities.gaf_assertion_with_pred_p(deductions_high.deduction_supported_object(deduction), leviathan.$const120$skolem)) {
                    return (SubLObject)leviathan.T;
                }
            }
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 26570L)
    public static SubLObject kill_all_inert_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject inert_rules = cdolist_list_var = inert_rules();
        SubLObject rule = (SubLObject)leviathan.NIL;
        rule = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            SubLObject message_var = (SubLObject)leviathan.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)leviathan.$sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)leviathan.$list122);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)leviathan.$sym123$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            unassert_assertion(rule);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)leviathan.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)leviathan.$sym124$CSETQ, (SubLObject)leviathan.$sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)leviathan.$str125$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.length(inert_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 26765L)
    public static SubLObject rules_that_totally_suck() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sucky_rules = (SubLObject)leviathan.NIL;
        final SubLObject message_var = (SubLObject)leviathan.$str119$mapping_Cyc_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)leviathan.NIL; leviathan.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(leviathan.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (leviathan.NIL != valid) {
                        sofar = Numbers.add(sofar, (SubLObject)leviathan.ONE_INTEGER);
                        utilities_macros.note_percent_progress(sofar, total);
                        if (leviathan.NIL != never_successful_ruleP(rule) && inference_analysis.transformation_rule_considered_count(rule).isPositive() && leviathan.NIL == assertions_high.forward_ruleP(rule) && leviathan.NIL == assertion_has_non_skolem_assertion_dependentsP(rule)) {
                            sucky_rules = (SubLObject)ConsesLow.cons(rule, sucky_rules);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(sucky_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 27147L)
    public static SubLObject kill_all_rules_that_totally_suck() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject sucky_rules = cdolist_list_var = rules_that_totally_suck();
        SubLObject rule = (SubLObject)leviathan.NIL;
        rule = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            SubLObject message_var = (SubLObject)leviathan.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)leviathan.$sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)leviathan.$list122);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)leviathan.$sym123$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            unassert_assertion(rule);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)leviathan.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)leviathan.$sym124$CSETQ, (SubLObject)leviathan.$sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)leviathan.$str125$_A, message_var);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return Sequences.length(sucky_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 27366L)
    public static SubLObject never_successful_ruleP(final SubLObject rule) {
        return Numbers.zerop(inference_analysis.transformation_rule_success_count(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 27502L)
    public static SubLObject successful_ruleP(final SubLObject rule) {
        return Numbers.plusp(inference_analysis.transformation_rule_success_count(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 27619L)
    public static SubLObject never_considered_ruleP(final SubLObject rule) {
        return Numbers.zerop(inference_analysis.transformation_rule_considered_count(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 27745L)
    public static SubLObject considered_ruleP(final SubLObject rule) {
        return Numbers.plusp(inference_analysis.transformation_rule_considered_count(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 27865L)
    public static SubLObject considered_but_not_successful_ruleP(final SubLObject rule) {
        return (SubLObject)SubLObjectFactory.makeBoolean(leviathan.NIL != considered_ruleP(rule) && leviathan.NIL == successful_ruleP(rule));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 28020L)
    public static SubLObject leviathan_rule_statistics(final SubLObject separate_out_skolemsP) {
        final SubLObject all_rules = kb_utilities.all_rules();
        final SubLObject skolem_rules = all_skolem_rules();
        final SubLObject negative_utility_skolem_rules = negative_utility_skolem_rules();
        final SubLObject inert_rules = inert_rules();
        final SubLObject sucky_rules = rules_that_totally_suck();
        return leviathan_rule_statistics_int(all_rules, skolem_rules, negative_utility_skolem_rules, inert_rules, sucky_rules, separate_out_skolemsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 28899L)
    public static SubLObject rule_analysis_L(final SubLObject analysis1, final SubLObject analysis2) {
        return list_utilities.position_L(analysis1, analysis2, leviathan.$sorted_rule_analyses$.getGlobalValue(), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 29019L)
    public static SubLObject leviathan_rule_statistics_int(final SubLObject all_rules, final SubLObject skolem_rules, final SubLObject negative_utility_skolem_rules, final SubLObject inert_rules, final SubLObject sucky_rules, final SubLObject separate_out_skolemsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = (SubLObject)leviathan.NIL;
        final SubLObject skolem_rules_set = set_utilities.construct_set_from_list(skolem_rules, Symbols.symbol_function((SubLObject)leviathan.EQ), (SubLObject)leviathan.UNPROVIDED);
        final SubLObject negative_utility_skolem_rules_set = set_utilities.construct_set_from_list(negative_utility_skolem_rules, Symbols.symbol_function((SubLObject)leviathan.EQ), (SubLObject)leviathan.UNPROVIDED);
        final SubLObject inert_rules_set = set_utilities.construct_set_from_list(inert_rules, Symbols.symbol_function((SubLObject)leviathan.EQ), (SubLObject)leviathan.UNPROVIDED);
        final SubLObject sucky_rules_set = set_utilities.construct_set_from_list(sucky_rules, Symbols.symbol_function((SubLObject)leviathan.EQ), (SubLObject)leviathan.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(all_rules), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = all_rules;
                SubLObject rule = (SubLObject)leviathan.NIL;
                rule = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    final SubLObject skolem_ruleP = set.set_memberP(rule, skolem_rules_set);
                    final SubLObject negative_utility_skolem_ruleP = set.set_memberP(rule, negative_utility_skolem_rules_set);
                    final SubLObject inert_ruleP = set.set_memberP(rule, inert_rules_set);
                    final SubLObject sucky_ruleP = set.set_memberP(rule, sucky_rules_set);
                    SubLObject analysis = (SubLObject)leviathan.NIL;
                    if (leviathan.NIL != separate_out_skolemsP && leviathan.NIL != negative_utility_skolem_ruleP && leviathan.NIL != sucky_ruleP) {
                        analysis = (SubLObject)leviathan.$kw127$SUCKY_SKOLEM_RULE;
                    }
                    else if (leviathan.NIL != separate_out_skolemsP && leviathan.NIL != negative_utility_skolem_ruleP) {
                        analysis = (SubLObject)leviathan.$kw128$NEGATIVE_UTILITY_SKOLEM_RULE;
                    }
                    else if (leviathan.NIL != separate_out_skolemsP && leviathan.NIL != skolem_ruleP && leviathan.NIL != inert_ruleP) {
                        analysis = (SubLObject)leviathan.$kw129$INERT_SKOLEM_RULE;
                    }
                    else if (leviathan.NIL != separate_out_skolemsP && leviathan.NIL != skolem_ruleP) {
                        if (leviathan.NIL != successful_ruleP(rule)) {
                            analysis = (SubLObject)leviathan.$kw130$SUCCESSFUL_SKOLEM_RULE;
                        }
                        else if (leviathan.NIL != assertions_high.forward_ruleP(rule)) {
                            analysis = (SubLObject)leviathan.$kw131$NEVER_CONSIDERED_FORWARD_SKOLEM_RULE;
                        }
                        else {
                            analysis = (SubLObject)leviathan.$kw132$NEVER_CONSIDERED_BACKWARD_SKOLEM_RULE;
                        }
                    }
                    else if (leviathan.NIL != inert_ruleP) {
                        analysis = (SubLObject)leviathan.$kw133$INERT_RULE;
                    }
                    else if (leviathan.NIL != sucky_ruleP) {
                        analysis = (SubLObject)leviathan.$kw134$SUCKY_RULE;
                    }
                    else if (leviathan.NIL != successful_ruleP(rule)) {
                        if (leviathan.NIL != assertions_high.forward_ruleP(rule)) {
                            analysis = (SubLObject)leviathan.$kw135$BACKWARD_SUCCESSFUL_FORWARD_RULE;
                        }
                        else {
                            analysis = (SubLObject)leviathan.$kw136$BACKWARD_SUCCESSFUL_BACKWARD_RULE;
                        }
                    }
                    else if (leviathan.NIL != assertions_high.forward_ruleP(rule)) {
                        if (leviathan.NIL != assertions_high.assertion_has_dependents_p(rule)) {
                            analysis = (SubLObject)leviathan.$kw137$SUCCESSFUL_FORWARD_RULE;
                        }
                        else {
                            analysis = (SubLObject)leviathan.$kw138$UNSUCCESSFUL_FORWARD_RULE;
                        }
                    }
                    else if (leviathan.NIL != assertions_high.assertion_has_dependents_p(rule)) {
                        analysis = (SubLObject)leviathan.$kw139$UNSUCCESSFUL_BACKWARD_RULE_WITH_DEPENDENTS;
                    }
                    else {
                        analysis = (SubLObject)leviathan.$kw140$OTHER;
                    }
                    alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(rule, analysis), alist);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    rule = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$96 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 31200L)
    public static SubLObject leviathan_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = (SubLObject)leviathan.NIL;
        final SubLObject node_var = leviathan.$const96$LeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$97 = node_var;
                final SubLObject deck_type = (SubLObject)leviathan.$kw99$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$98 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)leviathan.NIL;
                        final SubLObject _prev_bind_0_$99 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$100 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((leviathan.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((leviathan.NIL != tv_var) ? leviathan.$sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (leviathan.NIL != tv_var && leviathan.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && leviathan.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)leviathan.$kw101$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw104$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw106$WARN)) {
                                    Errors.warn((SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)leviathan.$str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                if (leviathan.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || leviathan.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$102 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$105 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$97, (SubLObject)leviathan.UNPROVIDED);
                                        while (leviathan.NIL != node_var_$97) {
                                            final SubLObject tt_node_var = node_var_$97;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa));
                                            SubLObject module_var = (SubLObject)leviathan.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (leviathan.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$102 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$103 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$103 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$109;
                                                                            for (iteration_state_$109 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$109); iteration_state_$109 = dictionary_contents.do_dictionary_contents_next(iteration_state_$109)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$109);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$104 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (leviathan.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$111;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$111 = rules;
                                                                                                            rule = (SubLObject)leviathan.NIL;
                                                                                                            rule = cdolist_list_var_$111.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$111) {
                                                                                                                item_var = rule;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$111 = cdolist_list_var_$111.rest();
                                                                                                                rule = cdolist_list_var_$111.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                            query2 = csome_list_var.first();
                                                                                            while (leviathan.NIL != csome_list_var) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$112 = rules2;
                                                                                                            SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                            rule2 = cdolist_list_var_$112.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$112) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$104, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$109);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$103, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                        if (leviathan.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)leviathan.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (leviathan.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)leviathan.NIL;
                                                                SubLObject mt2 = (SubLObject)leviathan.NIL;
                                                                SubLObject tv2 = (SubLObject)leviathan.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (leviathan.NIL == current) {
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (leviathan.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$113;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$113 = rules;
                                                                                                        rule = (SubLObject)leviathan.NIL;
                                                                                                        rule = cdolist_list_var_$113.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$113) {
                                                                                                            item_var = rule;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                                                                                                            rule = cdolist_list_var_$113.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$116 = sol;
                                                                                        SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                        query2 = csome_list_var_$116.first();
                                                                                        while (leviathan.NIL != csome_list_var_$116) {
                                                                                            if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                    final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                    if (rules2.isCons()) {
                                                                                                        SubLObject cdolist_list_var_$114 = rules2;
                                                                                                        SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                        rule2 = cdolist_list_var_$114.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$114) {
                                                                                                            final SubLObject item_var2 = rule2;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$106, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$105, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$115;
                                                        final SubLObject new_list = cdolist_list_var_$115 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)leviathan.NIL;
                                                        generating_fn = cdolist_list_var_$115.first();
                                                        while (leviathan.NIL != cdolist_list_var_$115) {
                                                            final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (leviathan.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject query3;
                                                                    SubLObject rules3;
                                                                    SubLObject cdolist_list_var_$116;
                                                                    SubLObject rule3;
                                                                    SubLObject item_var3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)leviathan.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state2, query3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query3)) {
                                                                                rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                if (rules3.isCons()) {
                                                                                    cdolist_list_var_$116 = rules3;
                                                                                    rule3 = (SubLObject)leviathan.NIL;
                                                                                    rule3 = cdolist_list_var_$116.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$116) {
                                                                                        item_var3 = rule3;
                                                                                        if (leviathan.NIL == conses_high.member(item_var3, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var3, allowed_rules);
                                                                                        }
                                                                                        cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                                                        rule3 = cdolist_list_var_$116.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject query4 = (SubLObject)leviathan.NIL;
                                                                    query4 = csome_list_var3.first();
                                                                    while (leviathan.NIL != csome_list_var3) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query4)) {
                                                                                final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                if (rules4.isCons()) {
                                                                                    SubLObject cdolist_list_var_$117 = rules4;
                                                                                    SubLObject rule4 = (SubLObject)leviathan.NIL;
                                                                                    rule4 = cdolist_list_var_$117.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$117) {
                                                                                        final SubLObject item_var4 = rule4;
                                                                                        if (leviathan.NIL == conses_high.member(item_var4, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var4, allowed_rules);
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
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$107, thread);
                                                            }
                                                            cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                                                            generating_fn = cdolist_list_var_$115.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$103, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$102, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)));
                                            SubLObject module_var2 = (SubLObject)leviathan.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (leviathan.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$108 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$97);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$109 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$110;
                                                                            for (iteration_state_$110 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$110); iteration_state_$110 = dictionary_contents.do_dictionary_contents_next(iteration_state_$110)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$110);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (leviathan.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)leviathan.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)leviathan.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (leviathan.NIL != csome_list_var4) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$110, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$110);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$109, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$118;
                                                        final SubLObject new_list2 = cdolist_list_var_$118 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)leviathan.NIL;
                                                        generating_fn2 = cdolist_list_var_$118.first();
                                                        while (leviathan.NIL != cdolist_list_var_$118) {
                                                            final SubLObject _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (leviathan.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)leviathan.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)leviathan.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (leviathan.NIL != csome_list_var5) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                            cdolist_list_var_$118 = cdolist_list_var_$118.rest();
                                                            generating_fn2 = cdolist_list_var_$118.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$104, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$108, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$97 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$105, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$102, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$101, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)leviathan.TWO_INTEGER, (SubLObject)leviathan.$str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$101, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$100, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$100, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$99, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$98, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(allowed_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 31505L)
    public static SubLObject leviathan_kb_content_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = (SubLObject)leviathan.NIL;
        final SubLObject node_var = leviathan.$const78$KBContentLeviathanQuery_Training;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$131 = node_var;
                final SubLObject deck_type = (SubLObject)leviathan.$kw99$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$132 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)leviathan.NIL;
                        final SubLObject _prev_bind_0_$133 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$134 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((leviathan.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((leviathan.NIL != tv_var) ? leviathan.$sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (leviathan.NIL != tv_var && leviathan.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && leviathan.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)leviathan.$kw101$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw104$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw106$WARN)) {
                                    Errors.warn((SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)leviathan.$str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$135 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                if (leviathan.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || leviathan.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$135 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$136 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$139 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$131, (SubLObject)leviathan.UNPROVIDED);
                                        while (leviathan.NIL != node_var_$131) {
                                            final SubLObject tt_node_var = node_var_$131;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa));
                                            SubLObject module_var = (SubLObject)leviathan.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (leviathan.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$136 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$137 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$143;
                                                                            for (iteration_state_$143 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$143); iteration_state_$143 = dictionary_contents.do_dictionary_contents_next(iteration_state_$143)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$143);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$138 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (leviathan.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$145;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$145 = rules;
                                                                                                            rule = (SubLObject)leviathan.NIL;
                                                                                                            rule = cdolist_list_var_$145.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$145) {
                                                                                                                item_var = rule;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$145 = cdolist_list_var_$145.rest();
                                                                                                                rule = cdolist_list_var_$145.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                            query2 = csome_list_var.first();
                                                                                            while (leviathan.NIL != csome_list_var) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$146 = rules2;
                                                                                                            SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                            rule2 = cdolist_list_var_$146.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$146) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$138, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$143);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$137, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                        if (leviathan.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)leviathan.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (leviathan.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)leviathan.NIL;
                                                                SubLObject mt2 = (SubLObject)leviathan.NIL;
                                                                SubLObject tv2 = (SubLObject)leviathan.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (leviathan.NIL == current) {
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$139 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$140 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (leviathan.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$147;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$147 = rules;
                                                                                                        rule = (SubLObject)leviathan.NIL;
                                                                                                        rule = cdolist_list_var_$147.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$147) {
                                                                                                            item_var = rule;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$147 = cdolist_list_var_$147.rest();
                                                                                                            rule = cdolist_list_var_$147.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$150 = sol;
                                                                                        SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                        query2 = csome_list_var_$150.first();
                                                                                        while (leviathan.NIL != csome_list_var_$150) {
                                                                                            if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                    final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                    if (rules2.isCons()) {
                                                                                                        SubLObject cdolist_list_var_$148 = rules2;
                                                                                                        SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                        rule2 = cdolist_list_var_$148.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$148) {
                                                                                                            final SubLObject item_var2 = rule2;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$140, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$139, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$149;
                                                        final SubLObject new_list = cdolist_list_var_$149 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)leviathan.NIL;
                                                        generating_fn = cdolist_list_var_$149.first();
                                                        while (leviathan.NIL != cdolist_list_var_$149) {
                                                            final SubLObject _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (leviathan.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject query3;
                                                                    SubLObject rules3;
                                                                    SubLObject cdolist_list_var_$150;
                                                                    SubLObject rule3;
                                                                    SubLObject item_var3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)leviathan.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state2, query3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query3)) {
                                                                                rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                if (rules3.isCons()) {
                                                                                    cdolist_list_var_$150 = rules3;
                                                                                    rule3 = (SubLObject)leviathan.NIL;
                                                                                    rule3 = cdolist_list_var_$150.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$150) {
                                                                                        item_var3 = rule3;
                                                                                        if (leviathan.NIL == conses_high.member(item_var3, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var3, allowed_rules);
                                                                                        }
                                                                                        cdolist_list_var_$150 = cdolist_list_var_$150.rest();
                                                                                        rule3 = cdolist_list_var_$150.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject query4 = (SubLObject)leviathan.NIL;
                                                                    query4 = csome_list_var3.first();
                                                                    while (leviathan.NIL != csome_list_var3) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query4)) {
                                                                                final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                if (rules4.isCons()) {
                                                                                    SubLObject cdolist_list_var_$151 = rules4;
                                                                                    SubLObject rule4 = (SubLObject)leviathan.NIL;
                                                                                    rule4 = cdolist_list_var_$151.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$151) {
                                                                                        final SubLObject item_var4 = rule4;
                                                                                        if (leviathan.NIL == conses_high.member(item_var4, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var4, allowed_rules);
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
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$141, thread);
                                                            }
                                                            cdolist_list_var_$149 = cdolist_list_var_$149.rest();
                                                            generating_fn = cdolist_list_var_$149.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$137, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$136, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)));
                                            SubLObject module_var2 = (SubLObject)leviathan.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (leviathan.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$142 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$131);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$143 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$144;
                                                                            for (iteration_state_$144 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$144); iteration_state_$144 = dictionary_contents.do_dictionary_contents_next(iteration_state_$144)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$144);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$144 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (leviathan.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)leviathan.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)leviathan.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (leviathan.NIL != csome_list_var4) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$144, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$144);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$143, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$152;
                                                        final SubLObject new_list2 = cdolist_list_var_$152 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)leviathan.NIL;
                                                        generating_fn2 = cdolist_list_var_$152.first();
                                                        while (leviathan.NIL != cdolist_list_var_$152) {
                                                            final SubLObject _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (leviathan.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)leviathan.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)leviathan.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (leviathan.NIL != csome_list_var5) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$145, thread);
                                                            }
                                                            cdolist_list_var_$152 = cdolist_list_var_$152.rest();
                                                            generating_fn2 = cdolist_list_var_$152.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$138, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$142, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$131 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$139, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$136, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$135, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)leviathan.TWO_INTEGER, (SubLObject)leviathan.$str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$135, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$134, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$134, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$133, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$146 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$132, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$147 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(allowed_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 31830L)
    public static SubLObject leviathan_haystack_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = (SubLObject)leviathan.NIL;
        final SubLObject node_var = leviathan.$const141$AutogeneratedLeviathanQuery_Train;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$165 = node_var;
                final SubLObject deck_type = (SubLObject)leviathan.$kw99$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$166 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)leviathan.NIL;
                        final SubLObject _prev_bind_0_$167 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$168 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((leviathan.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((leviathan.NIL != tv_var) ? leviathan.$sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (leviathan.NIL != tv_var && leviathan.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && leviathan.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)leviathan.$kw101$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw104$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw106$WARN)) {
                                    Errors.warn((SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)leviathan.$str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$168 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$169 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                if (leviathan.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || leviathan.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$169 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$170 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$173 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$165, (SubLObject)leviathan.UNPROVIDED);
                                        while (leviathan.NIL != node_var_$165) {
                                            final SubLObject tt_node_var = node_var_$165;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa));
                                            SubLObject module_var = (SubLObject)leviathan.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (leviathan.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$170 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$171 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$171 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$177;
                                                                            for (iteration_state_$177 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$177); iteration_state_$177 = dictionary_contents.do_dictionary_contents_next(iteration_state_$177)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$177);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$172 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (leviathan.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$179;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$179 = rules;
                                                                                                            rule = (SubLObject)leviathan.NIL;
                                                                                                            rule = cdolist_list_var_$179.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$179) {
                                                                                                                item_var = rule;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$179 = cdolist_list_var_$179.rest();
                                                                                                                rule = cdolist_list_var_$179.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                            query2 = csome_list_var.first();
                                                                                            while (leviathan.NIL != csome_list_var) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$180 = rules2;
                                                                                                            SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                            rule2 = cdolist_list_var_$180.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$180) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$172, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$177);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$171, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                        if (leviathan.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)leviathan.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (leviathan.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)leviathan.NIL;
                                                                SubLObject mt2 = (SubLObject)leviathan.NIL;
                                                                SubLObject tv2 = (SubLObject)leviathan.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (leviathan.NIL == current) {
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$173 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$174 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (leviathan.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$181;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$181 = rules;
                                                                                                        rule = (SubLObject)leviathan.NIL;
                                                                                                        rule = cdolist_list_var_$181.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$181) {
                                                                                                            item_var = rule;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$181 = cdolist_list_var_$181.rest();
                                                                                                            rule = cdolist_list_var_$181.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$184 = sol;
                                                                                        SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                        query2 = csome_list_var_$184.first();
                                                                                        while (leviathan.NIL != csome_list_var_$184) {
                                                                                            if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                    final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                    if (rules2.isCons()) {
                                                                                                        SubLObject cdolist_list_var_$182 = rules2;
                                                                                                        SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                        rule2 = cdolist_list_var_$182.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$182) {
                                                                                                            final SubLObject item_var2 = rule2;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$174, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$173, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$183;
                                                        final SubLObject new_list = cdolist_list_var_$183 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)leviathan.NIL;
                                                        generating_fn = cdolist_list_var_$183.first();
                                                        while (leviathan.NIL != cdolist_list_var_$183) {
                                                            final SubLObject _prev_bind_0_$175 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (leviathan.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject query3;
                                                                    SubLObject rules3;
                                                                    SubLObject cdolist_list_var_$184;
                                                                    SubLObject rule3;
                                                                    SubLObject item_var3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)leviathan.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state2, query3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query3)) {
                                                                                rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                if (rules3.isCons()) {
                                                                                    cdolist_list_var_$184 = rules3;
                                                                                    rule3 = (SubLObject)leviathan.NIL;
                                                                                    rule3 = cdolist_list_var_$184.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$184) {
                                                                                        item_var3 = rule3;
                                                                                        if (leviathan.NIL == conses_high.member(item_var3, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var3, allowed_rules);
                                                                                        }
                                                                                        cdolist_list_var_$184 = cdolist_list_var_$184.rest();
                                                                                        rule3 = cdolist_list_var_$184.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject query4 = (SubLObject)leviathan.NIL;
                                                                    query4 = csome_list_var3.first();
                                                                    while (leviathan.NIL != csome_list_var3) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query4)) {
                                                                                final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                if (rules4.isCons()) {
                                                                                    SubLObject cdolist_list_var_$185 = rules4;
                                                                                    SubLObject rule4 = (SubLObject)leviathan.NIL;
                                                                                    rule4 = cdolist_list_var_$185.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$185) {
                                                                                        final SubLObject item_var4 = rule4;
                                                                                        if (leviathan.NIL == conses_high.member(item_var4, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var4, allowed_rules);
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
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$175, thread);
                                                            }
                                                            cdolist_list_var_$183 = cdolist_list_var_$183.rest();
                                                            generating_fn = cdolist_list_var_$183.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$171, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$170, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)));
                                            SubLObject module_var2 = (SubLObject)leviathan.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (leviathan.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$176 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$172 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$165);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$177 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$178;
                                                                            for (iteration_state_$178 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$178); iteration_state_$178 = dictionary_contents.do_dictionary_contents_next(iteration_state_$178)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$178);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$178 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (leviathan.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)leviathan.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)leviathan.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (leviathan.NIL != csome_list_var4) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$178, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$178);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$177, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$186;
                                                        final SubLObject new_list2 = cdolist_list_var_$186 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)leviathan.NIL;
                                                        generating_fn2 = cdolist_list_var_$186.first();
                                                        while (leviathan.NIL != cdolist_list_var_$186) {
                                                            final SubLObject _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (leviathan.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)leviathan.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)leviathan.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (leviathan.NIL != csome_list_var5) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$179, thread);
                                                            }
                                                            cdolist_list_var_$186 = cdolist_list_var_$186.rest();
                                                            generating_fn2 = cdolist_list_var_$186.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$172, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$176, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$165 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$173, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$170, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$169, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)leviathan.TWO_INTEGER, (SubLObject)leviathan.$str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$169, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$168, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$168, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$167, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$180 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$180, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$166, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$181 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$181, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(allowed_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 32157L)
    public static SubLObject leviathan_haystack_all_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allowed_rules = (SubLObject)leviathan.NIL;
        final SubLObject node_var = leviathan.$const29$AutogeneratedLeviathanQuery;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$199 = node_var;
                final SubLObject deck_type = (SubLObject)leviathan.$kw99$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$200 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)leviathan.NIL;
                        final SubLObject _prev_bind_0_$201 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$202 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((leviathan.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((leviathan.NIL != tv_var) ? leviathan.$sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (leviathan.NIL != tv_var && leviathan.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && leviathan.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)leviathan.$kw101$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw104$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)leviathan.ONE_INTEGER, (SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)leviathan.$kw106$WARN)) {
                                    Errors.warn((SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)leviathan.$str107$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)leviathan.$str105$continue_anyway, (SubLObject)leviathan.$str102$_A_is_not_a__A, tv_var, (SubLObject)leviathan.$sym103$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$202 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$203 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), thread);
                                if (leviathan.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || leviathan.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$203 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$204 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$207 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)leviathan.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$199, (SubLObject)leviathan.UNPROVIDED);
                                        while (leviathan.NIL != node_var_$199) {
                                            final SubLObject tt_node_var = node_var_$199;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa));
                                            SubLObject module_var = (SubLObject)leviathan.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (leviathan.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$204 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$205 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$205 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$211;
                                                                            for (iteration_state_$211 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$211); iteration_state_$211 = dictionary_contents.do_dictionary_contents_next(iteration_state_$211)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$211);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$206 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (leviathan.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject rules;
                                                                                            SubLObject cdolist_list_var_$213;
                                                                                            SubLObject rule;
                                                                                            SubLObject item_var;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                        rules = kb_query.kbq_allowed_rules(query);
                                                                                                        if (rules.isCons()) {
                                                                                                            cdolist_list_var_$213 = rules;
                                                                                                            rule = (SubLObject)leviathan.NIL;
                                                                                                            rule = cdolist_list_var_$213.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$213) {
                                                                                                                item_var = rule;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                                }
                                                                                                                cdolist_list_var_$213 = cdolist_list_var_$213.rest();
                                                                                                                rule = cdolist_list_var_$213.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                            query2 = csome_list_var.first();
                                                                                            while (leviathan.NIL != csome_list_var) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                        if (rules2.isCons()) {
                                                                                                            SubLObject cdolist_list_var_$214 = rules2;
                                                                                                            SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                            rule2 = cdolist_list_var_$214.first();
                                                                                                            while (leviathan.NIL != cdolist_list_var_$214) {
                                                                                                                final SubLObject item_var2 = rule2;
                                                                                                                if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                    allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$206, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$211);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$205, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                        if (leviathan.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)leviathan.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (leviathan.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)leviathan.NIL;
                                                                SubLObject mt2 = (SubLObject)leviathan.NIL;
                                                                SubLObject tv2 = (SubLObject)leviathan.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list110);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (leviathan.NIL == current) {
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$207 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$208 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (leviathan.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject query;
                                                                                        SubLObject rules;
                                                                                        SubLObject rule;
                                                                                        SubLObject item_var;
                                                                                        SubLObject cdolist_list_var_$215;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)leviathan.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            query = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (leviathan.NIL != set_contents.do_set_contents_element_validP(state, query) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query)) {
                                                                                                    rules = kb_query.kbq_allowed_rules(query);
                                                                                                    if (rules.isCons()) {
                                                                                                        cdolist_list_var_$215 = rules;
                                                                                                        rule = (SubLObject)leviathan.NIL;
                                                                                                        rule = cdolist_list_var_$215.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$215) {
                                                                                                            item_var = rule;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var, allowed_rules);
                                                                                                            }
                                                                                                            cdolist_list_var_$215 = cdolist_list_var_$215.rest();
                                                                                                            rule = cdolist_list_var_$215.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$218 = sol;
                                                                                        SubLObject query2 = (SubLObject)leviathan.NIL;
                                                                                        query2 = csome_list_var_$218.first();
                                                                                        while (leviathan.NIL != csome_list_var_$218) {
                                                                                            if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (leviathan.NIL != forts.fort_p(query2)) {
                                                                                                    final SubLObject rules2 = kb_query.kbq_allowed_rules(query2);
                                                                                                    if (rules2.isCons()) {
                                                                                                        SubLObject cdolist_list_var_$216 = rules2;
                                                                                                        SubLObject rule2 = (SubLObject)leviathan.NIL;
                                                                                                        rule2 = cdolist_list_var_$216.first();
                                                                                                        while (leviathan.NIL != cdolist_list_var_$216) {
                                                                                                            final SubLObject item_var2 = rule2;
                                                                                                            if (leviathan.NIL == conses_high.member(item_var2, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                                                allowed_rules = (SubLObject)ConsesLow.cons(item_var2, allowed_rules);
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
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$208, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$207, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list110);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$217;
                                                        final SubLObject new_list = cdolist_list_var_$217 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)leviathan.NIL;
                                                        generating_fn = cdolist_list_var_$217.first();
                                                        while (leviathan.NIL != cdolist_list_var_$217) {
                                                            final SubLObject _prev_bind_0_$209 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (leviathan.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject query3;
                                                                    SubLObject rules3;
                                                                    SubLObject cdolist_list_var_$218;
                                                                    SubLObject rule3;
                                                                    SubLObject item_var3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)leviathan.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state2, query3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query3)) {
                                                                                rules3 = kb_query.kbq_allowed_rules(query3);
                                                                                if (rules3.isCons()) {
                                                                                    cdolist_list_var_$218 = rules3;
                                                                                    rule3 = (SubLObject)leviathan.NIL;
                                                                                    rule3 = cdolist_list_var_$218.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$218) {
                                                                                        item_var3 = rule3;
                                                                                        if (leviathan.NIL == conses_high.member(item_var3, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var3, allowed_rules);
                                                                                        }
                                                                                        cdolist_list_var_$218 = cdolist_list_var_$218.rest();
                                                                                        rule3 = cdolist_list_var_$218.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject query4 = (SubLObject)leviathan.NIL;
                                                                    query4 = csome_list_var3.first();
                                                                    while (leviathan.NIL != csome_list_var3) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (leviathan.NIL != forts.fort_p(query4)) {
                                                                                final SubLObject rules4 = kb_query.kbq_allowed_rules(query4);
                                                                                if (rules4.isCons()) {
                                                                                    SubLObject cdolist_list_var_$219 = rules4;
                                                                                    SubLObject rule4 = (SubLObject)leviathan.NIL;
                                                                                    rule4 = cdolist_list_var_$219.first();
                                                                                    while (leviathan.NIL != cdolist_list_var_$219) {
                                                                                        final SubLObject item_var4 = rule4;
                                                                                        if (leviathan.NIL == conses_high.member(item_var4, allowed_rules, Symbols.symbol_function((SubLObject)leviathan.EQL), Symbols.symbol_function((SubLObject)leviathan.IDENTITY))) {
                                                                                            allowed_rules = (SubLObject)ConsesLow.cons(item_var4, allowed_rules);
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
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$209, thread);
                                                            }
                                                            cdolist_list_var_$217 = cdolist_list_var_$217.rest();
                                                            generating_fn = cdolist_list_var_$217.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$205, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$204, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(leviathan.$const57$isa)));
                                            SubLObject module_var2 = (SubLObject)leviathan.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (leviathan.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$210 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$206 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((leviathan.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(leviathan.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$199);
                                                    if (leviathan.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                        if (leviathan.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED));
                                                            if (leviathan.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (leviathan.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$211 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$212;
                                                                            for (iteration_state_$212 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); leviathan.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$212); iteration_state_$212 = dictionary_contents.do_dictionary_contents_next(iteration_state_$212)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$212);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (leviathan.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$212 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (leviathan.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)leviathan.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (leviathan.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)leviathan.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (leviathan.NIL != csome_list_var4) {
                                                                                                if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)leviathan.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$212, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$212);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$211, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)leviathan.FIVE_INTEGER, (SubLObject)leviathan.$str109$attempting_to_bind_direction_link, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (leviathan.NIL != obsolete.cnat_p(node2, (SubLObject)leviathan.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$220;
                                                        final SubLObject new_list2 = cdolist_list_var_$220 = ((leviathan.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)leviathan.NIL;
                                                        generating_fn2 = cdolist_list_var_$220.first();
                                                        while (leviathan.NIL != cdolist_list_var_$220) {
                                                            final SubLObject _prev_bind_0_$213 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (leviathan.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)leviathan.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); leviathan.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (leviathan.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)leviathan.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (leviathan.NIL != csome_list_var5) {
                                                                        if (leviathan.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)leviathan.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)leviathan.$str108$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$213, thread);
                                                            }
                                                            cdolist_list_var_$220 = cdolist_list_var_$220.rest();
                                                            generating_fn2 = cdolist_list_var_$220.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$206, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$210, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$199 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$207, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$204, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$203, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)leviathan.TWO_INTEGER, (SubLObject)leviathan.$str111$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)leviathan.UNPROVIDED)), (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$203, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$202, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$202, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$201, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$214 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$214, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$200, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$215 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$215, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(allowed_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 32502L)
    public static SubLObject conditional_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queries = (SubLObject)leviathan.NIL;
        final SubLObject list_var = isa.all_fort_instances(leviathan.$const142$CycLQuerySpecification, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query = (SubLObject)leviathan.NIL;
                query = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    final SubLObject sentence = kb_query.kbq_sentences(query).first();
                    if (leviathan.NIL != el_utilities.el_implication_p(sentence)) {
                        final SubLObject v_properties = kb_query.kbq_query_properties(query);
                        final SubLObject conditionalP = conses_high.getf(v_properties, (SubLObject)leviathan.$kw143$CONDITIONAL_SENTENCE_, (SubLObject)leviathan.UNPROVIDED);
                        if (leviathan.NIL != conditionalP) {
                            queries = (SubLObject)ConsesLow.cons(query, queries);
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$233 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$233, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 32962L)
    public static SubLObject queries_that_probably_ought_to_be_conditional() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queries = (SubLObject)leviathan.NIL;
        final SubLObject list_var = isa.all_fort_instances(leviathan.$const142$CycLQuerySpecification, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query = (SubLObject)leviathan.NIL;
                query = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    final SubLObject sentence = kb_query.kbq_sentences(query).first();
                    thread.resetMultipleValues();
                    final SubLObject right_sentence = czer_utilities.unwrap_if_ist_permissive(sentence, leviathan.$const144$BaseKB);
                    final SubLObject right_mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (leviathan.NIL != el_utilities.el_implication_p(right_sentence)) {
                        final SubLObject v_properties = kb_query.kbq_query_properties(query);
                        final SubLObject conditionalP = conses_high.getf(v_properties, (SubLObject)leviathan.$kw143$CONDITIONAL_SENTENCE_, (SubLObject)leviathan.UNPROVIDED);
                        if (leviathan.NIL == conditionalP) {
                            queries = (SubLObject)ConsesLow.cons(query, queries);
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$234 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$234, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 33549L)
    public static SubLObject fix_queries_that_probably_ought_to_be_conditional() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject queries = list_var = queries_that_probably_ought_to_be_conditional();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query = (SubLObject)leviathan.NIL;
                query = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    ke.ke_assert_now((SubLObject)ConsesLow.list(leviathan.$const62$softwareParameterValueInSpecifica, leviathan.$const145$InferenceConditionalSentenceParam, leviathan.$const146$True, query), leviathan.$const61$TestVocabularyMt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$235 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$235, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 33893L)
    public static SubLObject rule_bindings_to_closed_summary(SubLObject rule_bindings_to_closed) {
        if (rule_bindings_to_closed == leviathan.UNPROVIDED) {
            rule_bindings_to_closed = load_leviathan_experiment((SubLObject)leviathan.$str147$pre_halo_training_rule_bindings_t);
        }
        SubLObject bound_rule_count = (SubLObject)leviathan.ZERO_INTEGER;
        SubLObject unbound_rule_count = (SubLObject)leviathan.ZERO_INTEGER;
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(rule_bindings_to_closed);
        SubLObject query_run = (SubLObject)leviathan.NIL;
        query_run = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$236;
            final SubLObject triples = cdolist_list_var_$236 = kbq_query_run.kbq_extract_query_run_metric_value(query_run, (SubLObject)leviathan.$kw148$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, (SubLObject)leviathan.UNPROVIDED);
            SubLObject triple = (SubLObject)leviathan.NIL;
            triple = cdolist_list_var_$236.first();
            while (leviathan.NIL != cdolist_list_var_$236) {
                SubLObject current;
                final SubLObject datum = current = triple;
                SubLObject rule = (SubLObject)leviathan.NIL;
                SubLObject v_bindings = (SubLObject)leviathan.NIL;
                SubLObject mt = (SubLObject)leviathan.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
                rule = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
                v_bindings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
                mt = current.first();
                current = current.rest();
                if (leviathan.NIL == current) {
                    if (leviathan.NIL != v_bindings) {
                        bound_rule_count = Numbers.add(bound_rule_count, (SubLObject)leviathan.ONE_INTEGER);
                    }
                    else {
                        unbound_rule_count = Numbers.add(unbound_rule_count, (SubLObject)leviathan.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list149);
                }
                cdolist_list_var_$236 = cdolist_list_var_$236.rest();
                triple = cdolist_list_var_$236.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Values.values(bound_rule_count, unbound_rule_count, Numbers.add(bound_rule_count, unbound_rule_count));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 34609L)
    public static SubLObject rule_bindings_wffP(final SubLObject rule, final SubLObject v_bindings, final SubLObject mt) {
        final SubLObject open_sentence = assertions_high.assertion_formula(rule);
        final SubLObject partially_bound_sentence = bindings.apply_bindings(unification.variable_base_inversion(v_bindings), open_sentence);
        return wff.el_wffP(partially_bound_sentence, mt, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 34860L)
    public static SubLObject rule_bindings_wff_analysis(SubLObject rule_bindings_to_closed) {
        if (rule_bindings_to_closed == leviathan.UNPROVIDED) {
            rule_bindings_to_closed = load_leviathan_experiment((SubLObject)leviathan.$str147$pre_halo_training_rule_bindings_t);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ill_formed_triples = (SubLObject)leviathan.NIL;
        final SubLObject list_var = kbq_query_run.kbq_query_set_run_query_runs(rule_bindings_to_closed);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = (SubLObject)leviathan.NIL;
                query_run = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject triples = cdolist_list_var = kbq_query_run.kbq_extract_query_run_metric_value(query_run, (SubLObject)leviathan.$kw148$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, (SubLObject)leviathan.UNPROVIDED);
                    SubLObject triple = (SubLObject)leviathan.NIL;
                    triple = cdolist_list_var.first();
                    while (leviathan.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = triple;
                        SubLObject rule = (SubLObject)leviathan.NIL;
                        SubLObject v_bindings = (SubLObject)leviathan.NIL;
                        SubLObject mt = (SubLObject)leviathan.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
                        rule = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
                        v_bindings = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
                        mt = current.first();
                        current = current.rest();
                        if (leviathan.NIL == current) {
                            if (leviathan.NIL != v_bindings) {
                                final SubLObject wffP = rule_bindings_wffP(rule, v_bindings, mt);
                                if (leviathan.NIL == wffP) {
                                    ill_formed_triples = (SubLObject)ConsesLow.cons(triple, ill_formed_triples);
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list149);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        triple = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$237 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$237, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(ill_formed_triples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 35664L)
    public static SubLObject initialize_rule_bindings_wff_table(SubLObject wff_analysis) {
        if (wff_analysis == leviathan.UNPROVIDED) {
            wff_analysis = cfasl_utilities.cfasl_load((SubLObject)leviathan.$str151$_cyc_projects_inference_leviathan);
        }
        final SubLObject table = Hashtables.make_hash_table(Sequences.length(wff_analysis), Symbols.symbol_function((SubLObject)leviathan.EQ), (SubLObject)leviathan.UNPROVIDED);
        SubLObject cdolist_list_var = wff_analysis;
        SubLObject triple = (SubLObject)leviathan.NIL;
        triple = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = triple;
            SubLObject rule = (SubLObject)leviathan.NIL;
            SubLObject v_bindings = (SubLObject)leviathan.NIL;
            SubLObject mt = (SubLObject)leviathan.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
            rule = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list149);
            mt = current.first();
            current = current.rest();
            if (leviathan.NIL == current) {
                SubLObject v_set = Hashtables.gethash_without_values(rule, table, (SubLObject)leviathan.UNPROVIDED);
                if (leviathan.NIL == v_set) {
                    v_set = set.new_set(Symbols.symbol_function((SubLObject)leviathan.EQUAL), (SubLObject)leviathan.UNPROVIDED);
                }
                set.set_add((SubLObject)ConsesLow.cons(mt, v_bindings), v_set);
                Hashtables.sethash(rule, table, v_set);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list149);
            }
            cdolist_list_var = cdolist_list_var.rest();
            triple = cdolist_list_var.first();
        }
        leviathan.$rule_bindings_wff_table$.setGlobalValue(table);
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 36419L)
    public static SubLObject rule_bindings_wff_cachedP(final SubLObject rule, final SubLObject transformation_bindings, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (leviathan.NIL != leviathan.$rule_bindings_wff_table$.getGlobalValue()) {
            final SubLObject v_set = Hashtables.gethash_without_values(rule, leviathan.$rule_bindings_wff_table$.getGlobalValue(), (SubLObject)leviathan.UNPROVIDED);
            if (leviathan.NIL != v_set) {
                final SubLObject rule_bindings_to_closed = inference_worker_transformation.transformation_rule_bindings_to_closed(transformation_bindings);
                if (leviathan.NIL != set.set_memberP((SubLObject)ConsesLow.cons(mt, rule_bindings_to_closed), v_set) && leviathan.NIL != leviathan.$rule_bindings_to_closed_wff_pruning_enabledP$.getDynamicValue(thread)) {
                    return (SubLObject)leviathan.NIL;
                }
            }
        }
        return (SubLObject)leviathan.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 36956L)
    public static SubLObject leviathan_generate_answerable_vs_unanswerable_comparison(final SubLObject query_set_run, final SubLObject property) {
        return plot_generation.kbq_generate_answerable_vs_unanswerable_comparison(query_set_run, property, (SubLObject)ConsesLow.list((SubLObject)leviathan.$kw152$LOGSCALE_Y_, (SubLObject)leviathan.T, (SubLObject)leviathan.$kw153$YLABEL, string_utilities.str(property), (SubLObject)leviathan.$kw154$PLOT_TITLE, Sequences.cconcatenate((SubLObject)leviathan.$str155$Answerable_vs__Unanswerable_, format_nil.format_nil_s_no_copy(property))), (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 37292L)
    public static SubLObject generate_all_leviathan_answerable_vs_unanswerable_comparisons(final SubLObject query_set_run) {
        SubLObject cdolist_list_var = Sequences.reverse(all_leviathan_query_metrics());
        SubLObject metric = (SubLObject)leviathan.NIL;
        metric = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            leviathan_generate_answerable_vs_unanswerable_comparison(query_set_run, metric);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 37599L)
    public static SubLObject leviathan_answerability_data(final SubLObject experiment_data, SubLObject filter) {
        if (filter == leviathan.UNPROVIDED) {
            filter = (SubLObject)leviathan.NIL;
        }
        SubLObject pairs = (SubLObject)leviathan.NIL;
        SubLObject cdolist_list_var = experiment_data;
        SubLObject datum = (SubLObject)leviathan.NIL;
        datum = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$238 = current = datum;
            SubLObject value = (SubLObject)leviathan.NIL;
            SubLObject experiment = (SubLObject)leviathan.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$238, (SubLObject)leviathan.$list156);
            value = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$238, (SubLObject)leviathan.$list156);
            experiment = current.first();
            current = current.rest();
            if (leviathan.NIL == current) {
                final SubLObject filtered_experiment = (leviathan.NIL != filter) ? Functions.funcall(filter, experiment) : experiment;
                final SubLObject analysis = kbq_query_run.kbq_analyze_query_set_run(filtered_experiment, (SubLObject)leviathan.UNPROVIDED);
                final SubLObject answerable_count = conses_high.getf(analysis, (SubLObject)leviathan.$kw157$TOTAL_ANSWERABLE, (SubLObject)leviathan.UNPROVIDED);
                pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(value, answerable_count), pairs);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$238, (SubLObject)leviathan.$list156);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return Sequences.nreverse(pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 38252L)
    public static SubLObject leviathan_generate_answerability_prediction_graph(final SubLObject query_set_run, final SubLObject oracle_query_set_run, final SubLObject property) {
        return plot_generation.kbq_generate_answerability_prediction_display(query_set_run, oracle_query_set_run, property, (SubLObject)ConsesLow.list((SubLObject)leviathan.$kw152$LOGSCALE_Y_, (SubLObject)leviathan.T, (SubLObject)leviathan.$kw153$YLABEL, string_utilities.str(property), (SubLObject)leviathan.$kw154$PLOT_TITLE, Sequences.cconcatenate((SubLObject)leviathan.$str158$Oracularly_Answerable_vs__Unanswe, format_nil.format_nil_s_no_copy(property))), (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 38913L)
    public static SubLObject generate_all_leviathan_answerability_prediction_graphs(final SubLObject query_set_run, final SubLObject oracle_query_set_run) {
        SubLObject cdolist_list_var = Sequences.reverse(all_leviathan_query_metrics());
        SubLObject metric = (SubLObject)leviathan.NIL;
        metric = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            leviathan_generate_answerability_prediction_graph(query_set_run, oracle_query_set_run, metric);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 39245L)
    public static SubLObject leviathan_win_at_solitaire(final SubLObject query_set_run, final SubLObject oracle_query_set_run) {
        return generate_all_leviathan_answerability_prediction_graphs(query_set_run, oracle_query_set_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 39643L)
    public static SubLObject clear_problem_creation_times() {
        leviathan.$problem_creation_times$.setGlobalValue((SubLObject)leviathan.NIL);
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 39746L)
    public static SubLObject note_new_problem_created() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)leviathan.NIL;
        if (leviathan.NIL != leviathan.$maintain_problem_creation_timesP$.getDynamicValue(thread)) {
            result = Time.get_internal_real_time();
            leviathan.$problem_creation_times$.setGlobalValue((SubLObject)ConsesLow.cons(result, leviathan.$problem_creation_times$.getGlobalValue()));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 39968L)
    public static SubLObject historical_problem_creation_times() {
        final SubLObject absolute_times = Sequences.reverse(leviathan.$problem_creation_times$.getGlobalValue());
        final SubLObject start_time = absolute_times.first();
        SubLObject relative_times = (SubLObject)leviathan.NIL;
        SubLObject cdolist_list_var = absolute_times;
        SubLObject time = (SubLObject)leviathan.NIL;
        time = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            relative_times = (SubLObject)ConsesLow.cons(Numbers.subtract(time, start_time), relative_times);
            cdolist_list_var = cdolist_list_var.rest();
            time = cdolist_list_var.first();
        }
        return Sequences.nreverse(relative_times);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 40269L)
    public static SubLObject initialize_halo_leviathan_queries() {
        SubLObject cdolist_list_var;
        final SubLObject shallow_halo_queries = cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(load_leviathan_experiment((SubLObject)leviathan.$str160$halo_queries_with_1_backchain_823)));
        SubLObject shallow_halo_query = (SubLObject)leviathan.NIL;
        shallow_halo_query = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            ke.ke_unassert_now((SubLObject)ConsesLow.listS(leviathan.$const57$isa, shallow_halo_query, (SubLObject)leviathan.$list161), leviathan.$const59$UniversalVocabularyMt);
            cdolist_list_var = cdolist_list_var.rest();
            shallow_halo_query = cdolist_list_var.first();
        }
        return determine_leviathan_training_and_blind_sets_int(leviathan.$const28$HALOLeviathanQuery, leviathan.$const80$HALOLeviathanQuery_Training, leviathan.$const81$HALOLeviathanQuery_Blind);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 40848L)
    public static SubLObject analyze_leviathan_experiment(final SubLObject experiment_denoting_symbol, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (metrics == leviathan.UNPROVIDED) {
            metrics = standard_leviathan_query_metrics();
        }
        if (corpus == leviathan.UNPROVIDED) {
            corpus = (SubLObject)leviathan.$str162$Leviathan_Training;
        }
        if (display == leviathan.UNPROVIDED) {
            display = (SubLObject)leviathan.$str163$_0;
        }
        if (stream == leviathan.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert leviathan.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : experiment_denoting_symbol;
        final SubLObject query_set_run = Symbols.symbol_value(experiment_denoting_symbol);
        final SubLObject name = Symbols.symbol_name(experiment_denoting_symbol);
        PrintLow.format(stream, (SubLObject)leviathan.$str165$____Basic_analysis____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(query_set_run, basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str166$____Answerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(query_set_run), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str167$____Unanswerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(query_set_run), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str168$____KB_Content____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(leviathan_kb_content_query_set_run(query_set_run), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str169$____Autogenerated____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(leviathan_haystack_query_set_run(query_set_run), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str170$____HALO____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(leviathan_halo_query_set_run(query_set_run), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str171$____Answerable_KB_Content____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(leviathan_kb_content_query_set_run(query_set_run)), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str172$____Answerable_Autogenerated____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(leviathan_haystack_query_set_run(query_set_run)), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str173$____Answerable_HALO____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(leviathan_halo_query_set_run(query_set_run)), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str174$____Unanswerable_KB_Content____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(leviathan_kb_content_query_set_run(query_set_run)), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str175$____Unanswerable_Autogenerated___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(leviathan_haystack_query_set_run(query_set_run)), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)leviathan.$str176$____Unanswerable_HALO____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(leviathan_halo_query_set_run(query_set_run)), basic_leviathan_query_metrics()), (SubLObject)leviathan.UNPROVIDED);
        SubLObject cdolist_list_var = metrics;
        SubLObject metric = (SubLObject)leviathan.NIL;
        metric = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            leviathan_generate_sorted_property_display(query_set_run, name, metric, corpus, display);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 44091L)
    public static SubLObject analyze_leviathan_experiments(final SubLObject baseline_denoting_symbol, final SubLObject experiment_denoting_symbol, SubLObject display_graphsP, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (display_graphsP == leviathan.UNPROVIDED) {
            display_graphsP = (SubLObject)leviathan.T;
        }
        if (metrics == leviathan.UNPROVIDED) {
            metrics = basic_leviathan_query_metrics();
        }
        if (corpus == leviathan.UNPROVIDED) {
            corpus = (SubLObject)leviathan.$str162$Leviathan_Training;
        }
        if (display == leviathan.UNPROVIDED) {
            display = (SubLObject)leviathan.$str163$_0;
        }
        if (stream == leviathan.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert leviathan.NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) : baseline_denoting_symbol;
        assert leviathan.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : experiment_denoting_symbol;
        final SubLObject baseline = Symbols.symbol_value(baseline_denoting_symbol);
        final SubLObject baseline_name = Symbols.symbol_name(baseline_denoting_symbol);
        final SubLObject experiment = Symbols.symbol_value(experiment_denoting_symbol);
        final SubLObject experiment_name = Symbols.symbol_name(experiment_denoting_symbol);
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
        PrintLow.format(stream, (SubLObject)leviathan.$str177$______of_queries_answerable_in__B);
        thread.resetMultipleValues();
        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(baseline, experiment);
        SubLObject mutual = thread.secondMultipleValue();
        SubLObject only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str178$Total___________s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(kb_content_baseline, kb_content_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str179$KB_Content______s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(haystack_baseline, haystack_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str180$Autogenerated___s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(halo_baseline, halo_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)leviathan.T, (SubLObject)leviathan.$str181$HALO____________s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        PrintLow.format(stream, (SubLObject)leviathan.$str182$____Key___BASELINE_VALUE__EXPERIM);
        PrintLow.format(stream, (SubLObject)leviathan.$str165$____Basic_analysis____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(baseline, experiment, metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str183$____Mutually_Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str184$____Mutually_Answerable_KB_Conten);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(leviathan_kb_content_query_set_run(mutual_baseline), leviathan_kb_content_query_set_run(mutual_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str185$____Mutually_Answerable_Autogener);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(leviathan_haystack_query_set_run(mutual_baseline), leviathan_haystack_query_set_run(mutual_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str186$____Mutually_Answerable_HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(leviathan_halo_query_set_run(mutual_baseline), leviathan_halo_query_set_run(mutual_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str166$____Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(baseline), kbq_query_run.kbq_answerable_query_set_run(experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str167$____Unanswerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(baseline), kbq_query_run.kbq_unanswerable_query_set_run(experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str168$____KB_Content____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kb_content_baseline, kb_content_experiment, metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str169$____Autogenerated____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(haystack_baseline, haystack_experiment, metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str170$____HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(halo_baseline, halo_experiment, metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str171$____Answerable_KB_Content____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(kb_content_baseline), kbq_query_run.kbq_answerable_query_set_run(kb_content_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str172$____Answerable_Autogenerated____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(haystack_baseline), kbq_query_run.kbq_answerable_query_set_run(haystack_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str173$____Answerable_HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(halo_baseline), kbq_query_run.kbq_answerable_query_set_run(halo_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str174$____Unanswerable_KB_Content____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(kb_content_baseline), kbq_query_run.kbq_unanswerable_query_set_run(kb_content_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str175$____Unanswerable_Autogenerated___);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(haystack_baseline), kbq_query_run.kbq_unanswerable_query_set_run(haystack_experiment), metrics));
        PrintLow.format(stream, (SubLObject)leviathan.$str176$____Unanswerable_HALO____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(halo_baseline), kbq_query_run.kbq_unanswerable_query_set_run(halo_experiment), metrics));
        if (leviathan.NIL != display_graphsP) {
            SubLObject cdolist_list_var = metrics;
            SubLObject metric = (SubLObject)leviathan.NIL;
            metric = cdolist_list_var.first();
            while (leviathan.NIL != cdolist_list_var) {
                leviathan_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, (SubLObject)leviathan.$kw187$BOTH, Sequences.cconcatenate((SubLObject)leviathan.$str188$Mutually_Answerable_, corpus), display);
                leviathan_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, (SubLObject)leviathan.$kw189$BASELINE, Sequences.cconcatenate((SubLObject)leviathan.$str188$Mutually_Answerable_, corpus), display);
                cdolist_list_var = cdolist_list_var.rest();
                metric = cdolist_list_var.first();
            }
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 50538L)
    public static SubLObject leviathan_generate_sorted_property_comparison(final SubLObject baseline, final SubLObject experiment, final SubLObject baseline_name, final SubLObject experiment_name, final SubLObject property, SubLObject sort_by, SubLObject corpus, SubLObject display) {
        if (sort_by == leviathan.UNPROVIDED) {
            sort_by = (SubLObject)leviathan.$kw187$BOTH;
        }
        if (corpus == leviathan.UNPROVIDED) {
            corpus = (SubLObject)leviathan.$str162$Leviathan_Training;
        }
        if (display == leviathan.UNPROVIDED) {
            display = (SubLObject)leviathan.$str163$_0;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline, experiment, property, (SubLObject)ConsesLow.listS((SubLObject)leviathan.$kw154$PLOT_TITLE, new SubLObject[] { Sequences.cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[] { leviathan.$str190$__, format_nil.format_nil_a_no_copy(baseline_name), leviathan.$str191$_vs__, format_nil.format_nil_a_no_copy(experiment_name), leviathan.$str192$_n, format_nil.format_nil_a_no_copy(property) }), leviathan.$kw193$XLABEL, leviathan.$str194$Sorted_Queries, leviathan.$kw153$YLABEL, ylabel_for_property(property), leviathan.$kw195$BASELINE_KEY_LABEL, baseline_name, leviathan.$kw196$EXPERIMENT_KEY_LABEL, experiment_name, leviathan.$list197 }), sort_by, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 51133L)
    public static SubLObject leviathan_generate_sorted_property_display(final SubLObject experiment, final SubLObject name, final SubLObject property, SubLObject corpus, SubLObject display) {
        if (corpus == leviathan.UNPROVIDED) {
            corpus = (SubLObject)leviathan.$str162$Leviathan_Training;
        }
        if (display == leviathan.UNPROVIDED) {
            display = (SubLObject)leviathan.$str163$_0;
        }
        return plot_generation.kbq_generate_sorted_property_display(experiment, property, (SubLObject)leviathan.$list198, (SubLObject)ConsesLow.listS((SubLObject)leviathan.$kw154$PLOT_TITLE, new SubLObject[] { Sequences.cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[] { leviathan.$str199$_, format_nil.format_nil_a_no_copy(name), leviathan.$str192$_n, format_nil.format_nil_a_no_copy(property) }), leviathan.$kw193$XLABEL, leviathan.$str194$Sorted_Queries, leviathan.$kw153$YLABEL, ylabel_for_property(property), leviathan.$list200 }), display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 51711L)
    public static SubLObject ylabel_for_property(final SubLObject property) {
        final SubLObject string = Symbols.symbol_name(property);
        if (leviathan.NIL != string_utilities.substringP((SubLObject)leviathan.$str201$time, string, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.$str202$Time__sec_;
        }
        if (leviathan.NIL != string_utilities.substringP((SubLObject)leviathan.$str203$problem, string, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.$str204$__of_problems;
        }
        if (leviathan.NIL != string_utilities.substringP((SubLObject)leviathan.$str205$link, string, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.$str206$__of_links;
        }
        if (leviathan.NIL != string_utilities.substringP((SubLObject)leviathan.$str207$tactic, string, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.$str208$__of_tactics;
        }
        if (leviathan.NIL != string_utilities.substringP((SubLObject)leviathan.$str209$proof, string, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.$str210$__of_proofs;
        }
        if (leviathan.NIL != string_utilities.substringP((SubLObject)leviathan.$str211$answer, string, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.$str212$__of_answers;
        }
        if (leviathan.NIL != string_utilities.substringP((SubLObject)leviathan.$str213$byte, string, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.$str214$__of_bytes;
        }
        return (SubLObject)leviathan.$str215$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 52247L)
    public static SubLObject problem_query_relational_complexity_analysis(SubLObject experiment) {
        if (experiment == leviathan.UNPROVIDED) {
            experiment = load_leviathan_experiment((SubLObject)leviathan.$str216$training_823_h_queries_0602);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject complexities = (SubLObject)leviathan.NIL;
        final SubLObject list_var = kbq_query_run.kbq_query_set_run_query_runs(experiment);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = (SubLObject)leviathan.NIL;
                query_run = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject queries = cdolist_list_var = kbq_query_run.kbq_extract_query_run_metric_value(query_run, (SubLObject)leviathan.$kw217$PROBLEM_QUERIES, (SubLObject)leviathan.UNPROVIDED);
                    SubLObject query = (SubLObject)leviathan.NIL;
                    query = cdolist_list_var.first();
                    while (leviathan.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$239 = query;
                        SubLObject contextualized_clause = (SubLObject)leviathan.NIL;
                        contextualized_clause = cdolist_list_var_$239.first();
                        while (leviathan.NIL != cdolist_list_var_$239) {
                            SubLObject sense = (SubLObject)leviathan.$kw218$NEG;
                            SubLObject index_var = (SubLObject)leviathan.ZERO_INTEGER;
                            SubLObject cdolist_list_var_$240 = clauses.neg_lits(contextualized_clause);
                            SubLObject contextualized_asent = (SubLObject)leviathan.NIL;
                            contextualized_asent = cdolist_list_var_$240.first();
                            while (leviathan.NIL != cdolist_list_var_$240) {
                                SubLObject current;
                                final SubLObject datum = current = contextualized_asent;
                                SubLObject mt = (SubLObject)leviathan.NIL;
                                SubLObject asent = (SubLObject)leviathan.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list219);
                                mt = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list219);
                                asent = current.first();
                                current = current.rest();
                                if (leviathan.NIL == current) {
                                    final SubLObject asent_complexity = function_terms.term_relational_complexity(asent);
                                    final SubLObject mt_complexity = function_terms.term_relational_complexity(mt);
                                    final SubLObject complexity = Numbers.max(asent_complexity, mt_complexity);
                                    complexities = (SubLObject)ConsesLow.cons(complexity, complexities);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list219);
                                }
                                index_var = Numbers.add(index_var, (SubLObject)leviathan.ONE_INTEGER);
                                cdolist_list_var_$240 = cdolist_list_var_$240.rest();
                                contextualized_asent = cdolist_list_var_$240.first();
                            }
                            sense = (SubLObject)leviathan.$kw220$POS;
                            index_var = (SubLObject)leviathan.ZERO_INTEGER;
                            SubLObject cdolist_list_var_$241 = clauses.pos_lits(contextualized_clause);
                            contextualized_asent = (SubLObject)leviathan.NIL;
                            contextualized_asent = cdolist_list_var_$241.first();
                            while (leviathan.NIL != cdolist_list_var_$241) {
                                SubLObject current;
                                final SubLObject datum = current = contextualized_asent;
                                SubLObject mt = (SubLObject)leviathan.NIL;
                                SubLObject asent = (SubLObject)leviathan.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list219);
                                mt = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)leviathan.$list219);
                                asent = current.first();
                                current = current.rest();
                                if (leviathan.NIL == current) {
                                    final SubLObject asent_complexity = function_terms.term_relational_complexity(asent);
                                    final SubLObject mt_complexity = function_terms.term_relational_complexity(mt);
                                    final SubLObject complexity = Numbers.max(asent_complexity, mt_complexity);
                                    complexities = (SubLObject)ConsesLow.cons(complexity, complexities);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)leviathan.$list219);
                                }
                                index_var = Numbers.add(index_var, (SubLObject)leviathan.ONE_INTEGER);
                                cdolist_list_var_$241 = cdolist_list_var_$241.rest();
                                contextualized_asent = cdolist_list_var_$241.first();
                            }
                            cdolist_list_var_$239 = cdolist_list_var_$239.rest();
                            contextualized_clause = cdolist_list_var_$239.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        query = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$242 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$242, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.histogram(complexities, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 53107L)
    public static SubLObject problem_query_fort_analysis(SubLObject experiment) {
        if (experiment == leviathan.UNPROVIDED) {
            experiment = load_leviathan_experiment((SubLObject)leviathan.$str216$training_823_h_queries_0602);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)leviathan.EQ), (SubLObject)leviathan.UNPROVIDED);
        final SubLObject list_var = kbq_query_run.kbq_query_set_run_query_runs(experiment);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)leviathan.$str37$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject query_run = (SubLObject)leviathan.NIL;
                query_run = csome_list_var.first();
                while (leviathan.NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject queries = cdolist_list_var = kbq_query_run.kbq_extract_query_run_metric_value(query_run, (SubLObject)leviathan.$kw217$PROBLEM_QUERIES, (SubLObject)leviathan.UNPROVIDED);
                    SubLObject query = (SubLObject)leviathan.NIL;
                    query = cdolist_list_var.first();
                    while (leviathan.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$243 = cycl_utilities.expression_forts(query, (SubLObject)leviathan.NIL, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                        SubLObject fort = (SubLObject)leviathan.NIL;
                        fort = cdolist_list_var_$243.first();
                        while (leviathan.NIL != cdolist_list_var_$243) {
                            dictionary_utilities.dictionary_increment(fort_dict, fort, (SubLObject)leviathan.UNPROVIDED);
                            cdolist_list_var_$243 = cdolist_list_var_$243.rest();
                            fort = cdolist_list_var_$243.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        query = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)leviathan.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    query_run = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$244 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$244, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(dictionary_utilities.dictionary_to_alist(fort_dict), Symbols.symbol_function((SubLObject)leviathan.$sym221$_), Symbols.symbol_function((SubLObject)leviathan.$sym222$CDR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 53725L)
    public static SubLObject elapsed_crtl_internal_real_time_to_elapsed_seconds(final SubLObject elapsed) {
        return Numbers.divide(elapsed, leviathan.$leviathan_crtl_internal_time_units_per_second$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 53905L)
    public static SubLObject elapsed_crtl_internal_real_times_to_elapsed_seconds(final SubLObject elapsed_times) {
        return Mapping.mapcar((SubLObject)leviathan.$sym224$ELAPSED_CRTL_INTERNAL_REAL_TIME_TO_ELAPSED_SECONDS, elapsed_times);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 54074L)
    public static SubLObject compute_n_way_parallelism_total_time(final SubLObject query_run, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject parallel_total_time = compute_n_way_parallelism_times(query_run, n);
        final SubLObject parallel_time_to_first_answer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return parallel_total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 54369L)
    public static SubLObject compute_n_way_parallelism_time_to_first_answer(final SubLObject query_run, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject parallel_total_time = compute_n_way_parallelism_times(query_run, n);
        final SubLObject parallel_time_to_first_answer = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return parallel_time_to_first_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 54652L)
    public static SubLObject compute_n_way_parallelism_times(final SubLObject query_run, final SubLObject n) {
        final SubLObject processor_times = Vectors.make_vector(n, (SubLObject)leviathan.ZERO_INTEGER);
        SubLObject time_to_first_answer = (SubLObject)leviathan.NIL;
        final SubLObject new_root_relative_total_times = kbq_query_run.kbq_query_run_property_value(query_run, (SubLObject)leviathan.$kw225$NEW_ROOT_RELATIVE_TOTAL_TIMES, (SubLObject)leviathan.UNPROVIDED);
        final SubLObject new_root_relative_answer_times = kbq_query_run.kbq_query_run_property_value(query_run, (SubLObject)leviathan.$kw226$NEW_ROOT_RELATIVE_ANSWER_TIMES, (SubLObject)leviathan.UNPROVIDED);
        final SubLObject new_root_relative_answer_dict = dictionary_utilities.new_dictionary_from_alist(new_root_relative_answer_times, (SubLObject)leviathan.UNPROVIDED);
        SubLObject list_var = (SubLObject)leviathan.NIL;
        SubLObject total_time = (SubLObject)leviathan.NIL;
        SubLObject new_root_number = (SubLObject)leviathan.NIL;
        list_var = new_root_relative_total_times;
        total_time = list_var.first();
        for (new_root_number = (SubLObject)leviathan.ZERO_INTEGER; leviathan.NIL != list_var; list_var = list_var.rest(), total_time = list_var.first(), new_root_number = Numbers.add((SubLObject)leviathan.ONE_INTEGER, new_root_number)) {
            final SubLObject processor_number = earliest_free_processor_number(processor_times);
            final SubLObject processor_time_so_far = Vectors.aref(processor_times, processor_number);
            Vectors.set_aref(processor_times, processor_number, Numbers.add(Vectors.aref(processor_times, processor_number), total_time));
            final SubLObject relative_answer_times = dictionary.dictionary_lookup(new_root_relative_answer_dict, new_root_number, (SubLObject)leviathan.UNPROVIDED);
            final SubLObject relative_first_answer_time = relative_answer_times.first();
            if (leviathan.NIL != relative_first_answer_time) {
                final SubLObject new_time_to_first_answer = Numbers.add(processor_time_so_far, relative_first_answer_time);
                if (leviathan.NIL == time_to_first_answer || new_time_to_first_answer.numL(time_to_first_answer)) {
                    time_to_first_answer = new_time_to_first_answer;
                }
            }
        }
        final SubLObject max_total_time = vector_utilities.max_element(processor_times);
        return Values.values(kbq_query_run.kbq_internal_real_time_to_seconds(max_total_time), (SubLObject)((leviathan.NIL != time_to_first_answer) ? kbq_query_run.kbq_internal_real_time_to_seconds(time_to_first_answer) : leviathan.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 56094L)
    public static SubLObject earliest_free_processor_number(final SubLObject processor_times) {
        SubLObject min_time = number_utilities.positive_infinity();
        SubLObject min_processor = (SubLObject)leviathan.NIL;
        final SubLObject backwardP_var = (SubLObject)leviathan.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject time;
        for (length = Sequences.length(processor_times), v_iteration = (SubLObject)leviathan.NIL, v_iteration = (SubLObject)leviathan.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)leviathan.ONE_INTEGER)) {
            i = ((leviathan.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)leviathan.ONE_INTEGER) : v_iteration);
            time = Vectors.aref(processor_times, i);
            if (leviathan.NIL != number_utilities.potentially_infinite_integer_L(time, min_time)) {
                min_time = time;
                min_processor = i;
            }
        }
        return min_processor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 56462L)
    public static SubLObject new_root_first_answer_times(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_answer_times = (SubLObject)leviathan.NIL;
        final SubLObject _prev_bind_0 = kbq_query_run.$kbq_internal_time_units_per_second$.currentBinding(thread);
        try {
            kbq_query_run.$kbq_internal_time_units_per_second$.bind(kbq_query_run.kbq_query_set_run_internal_time_units_per_second(query_set_run), thread);
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject query_run = (SubLObject)leviathan.NIL;
            query_run = cdolist_list_var.first();
            while (leviathan.NIL != cdolist_list_var) {
                final SubLObject new_root_relative_answer_times = kbq_query_run.kbq_query_run_property_value(query_run, (SubLObject)leviathan.$kw226$NEW_ROOT_RELATIVE_ANSWER_TIMES, (SubLObject)leviathan.UNPROVIDED);
                final SubLObject new_root_relative_first_answer_times = Mapping.mapcar(Symbols.symbol_function((SubLObject)leviathan.$sym227$SECOND), new_root_relative_answer_times);
                first_answer_times = ConsesLow.nconc(new_root_relative_first_answer_times, first_answer_times);
                cdolist_list_var = cdolist_list_var.rest();
                query_run = cdolist_list_var.first();
            }
            first_answer_times = Mapping.mapcar((SubLObject)leviathan.$sym228$KBQ_INTERNAL_REAL_TIME_TO_SECONDS, first_answer_times);
        }
        finally {
            kbq_query_run.$kbq_internal_time_units_per_second$.rebind(_prev_bind_0, thread);
        }
        first_answer_times = list_utilities.sort_L(first_answer_times, (SubLObject)leviathan.UNPROVIDED);
        return first_answer_times;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 57186L)
    public static SubLObject generate_new_root_first_answer_times_graph(final SubLObject query_set_run, SubLObject plot_properties) {
        if (plot_properties == leviathan.UNPROVIDED) {
            plot_properties = (SubLObject)leviathan.NIL;
        }
        final SubLObject first_answer_times = new_root_first_answer_times(query_set_run);
        return plot_generation.generate_line_graph_from_values(first_answer_times, plot_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 57444L)
    public static SubLObject new_root_total_times(final SubLObject query_set_run) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_times = (SubLObject)leviathan.NIL;
        final SubLObject _prev_bind_0 = kbq_query_run.$kbq_internal_time_units_per_second$.currentBinding(thread);
        try {
            kbq_query_run.$kbq_internal_time_units_per_second$.bind(kbq_query_run.kbq_query_set_run_internal_time_units_per_second(query_set_run), thread);
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject query_run = (SubLObject)leviathan.NIL;
            query_run = cdolist_list_var.first();
            while (leviathan.NIL != cdolist_list_var) {
                final SubLObject new_root_times = kbq_query_run.kbq_query_run_property_value(query_run, (SubLObject)leviathan.$kw225$NEW_ROOT_RELATIVE_TOTAL_TIMES, (SubLObject)leviathan.UNPROVIDED);
                total_times = ConsesLow.nconc(conses_high.copy_list(new_root_times), total_times);
                cdolist_list_var = cdolist_list_var.rest();
                query_run = cdolist_list_var.first();
            }
            total_times = Mapping.mapcar((SubLObject)leviathan.$sym228$KBQ_INTERNAL_REAL_TIME_TO_SECONDS, total_times);
        }
        finally {
            kbq_query_run.$kbq_internal_time_units_per_second$.rebind(_prev_bind_0, thread);
        }
        total_times = list_utilities.sort_L(total_times, (SubLObject)leviathan.UNPROVIDED);
        return total_times;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 57963L)
    public static SubLObject generate_new_root_total_times_graph(final SubLObject query_set_run, SubLObject plot_properties) {
        if (plot_properties == leviathan.UNPROVIDED) {
            plot_properties = (SubLObject)leviathan.NIL;
        }
        final SubLObject total_times = new_root_total_times(query_set_run);
        return plot_generation.generate_line_graph_from_values(total_times, plot_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 58193L)
    public static SubLObject haystack_transformation_fanout_estimate(final SubLObject haystack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$kbq_run_query_auto_destroy_enabledP$.currentBinding(thread);
        try {
            control_vars.$kbq_run_query_auto_destroy_enabledP$.bind((SubLObject)leviathan.NIL, thread);
            kbq_query_run.kbq_run_query(haystack, all_leviathan_query_metrics(), kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), (SubLObject)leviathan.$list229, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
        }
        finally {
            control_vars.$kbq_run_query_auto_destroy_enabledP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject inference = inference_utilities.latest_inference();
        return inference_transformation_fanout_estimate(inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 58593L)
    public static SubLObject inference_transformation_fanout_estimate(final SubLObject inference) {
        SubLObject fanouts = (SubLObject)leviathan.$list230;
        SubLObject new_root_count = (SubLObject)leviathan.ZERO_INTEGER;
        final SubLObject proof = inference_datastructures_inference.inference_first_proof(inference);
        if (leviathan.NIL != proof) {
            SubLObject cdolist_list_var = inference_datastructures_proof.all_proof_subproofs(proof);
            SubLObject subproof = (SubLObject)leviathan.NIL;
            subproof = cdolist_list_var.first();
            while (leviathan.NIL != cdolist_list_var) {
                if (leviathan.NIL != inference_worker_transformation.transformation_proof_p(subproof)) {
                    final SubLObject problem = inference_datastructures_proof.proof_supported_problem(subproof);
                    final SubLObject fanout_for_this_level = problem_standard_transformation_fanout(problem);
                    fanouts = (SubLObject)ConsesLow.cons(fanout_for_this_level, fanouts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        SubLObject fanouts_down_to_this_depth;
        SubLObject new_root_count_down_to_this_depth;
        for (fanouts_down_to_this_depth = (SubLObject)leviathan.NIL, fanouts_down_to_this_depth = fanouts; !fanouts_down_to_this_depth.isAtom(); fanouts_down_to_this_depth = fanouts_down_to_this_depth.rest()) {
            new_root_count_down_to_this_depth = Functions.apply(Symbols.symbol_function((SubLObject)leviathan.$sym231$_), fanouts_down_to_this_depth);
            new_root_count = Numbers.add(new_root_count, new_root_count_down_to_this_depth);
        }
        return new_root_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 59484L)
    public static SubLObject problem_standard_transformation_fanout(final SubLObject problem) {
        assert leviathan.NIL != inference_datastructures_problem.single_literal_problem_p(problem) : problem;
        final SubLObject ist_literal = cycl_utilities.hl_to_el(inference_czer.problem_query_formula(inference_datastructures_problem.problem_query(problem)));
        return literal_standard_transformation_fanout(ist_literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 59748L)
    public static SubLObject literal_standard_transformation_fanout(final SubLObject ist_literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert leviathan.NIL != cycl_grammar.cycl_literal_p(ist_literal) : ist_literal;
        SubLObject fanout = (SubLObject)leviathan.ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject result = inference_kernel.new_cyc_query(ist_literal, (SubLObject)leviathan.NIL, (SubLObject)leviathan.$list234);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(root_problem);
        SubLObject transformation_tactic = (SubLObject)leviathan.NIL;
        transformation_tactic = cdolist_list_var.first();
        while (leviathan.NIL != cdolist_list_var) {
            if (leviathan.NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, (SubLObject)leviathan.$kw235$TRANSFORMATION) && leviathan.NIL == inference_worker_transformation.meta_transformation_tactic_p(transformation_tactic) && leviathan.$kw236$TRANS_UNBOUND_PREDICATE_POS != inference_datastructures_tactic.tactic_hl_module_name(transformation_tactic)) {
                final SubLObject productivity = inference_datastructures_tactic.tactic_productivity(transformation_tactic);
                final SubLObject number_of_children = inference_datastructures_enumerated_types.number_of_children_for_productivity(productivity);
                fanout = Numbers.add(fanout, number_of_children);
            }
            cdolist_list_var = cdolist_list_var.rest();
            transformation_tactic = cdolist_list_var.first();
        }
        return fanout;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 61074L)
    public static SubLObject inference_top_level_removal_fanout(final SubLObject inference) {
        final SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
        if (leviathan.NIL != root_problem) {
            return balanced_strategy_root_initial_removal_fanout(root_problem, inference_datastructures_inference.simplest_inference_strategy(inference));
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 61419L)
    public static SubLObject balanced_strategy_root_initial_removal_fanout(final SubLObject root_problem, final SubLObject strategy) {
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 61934L)
    public static SubLObject inference_new_root_initial_removal_fanouts(final SubLObject inference) {
        final SubLObject fanouts = (SubLObject)leviathan.NIL;
        return Sequences.nreverse(fanouts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 62485L)
    public static SubLObject enlarge_kb_via_doppelgangers(final SubLObject n, SubLObject skip) {
        if (skip == leviathan.UNPROVIDED) {
            skip = (SubLObject)leviathan.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        possibly_initialize_doppelganger_vocab();
        ontology_layers.possibly_initialize_ontology_layers();
        SubLObject created = (SubLObject)leviathan.ZERO_INTEGER;
        SubLObject skipped = (SubLObject)leviathan.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)leviathan.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)leviathan.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)leviathan.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)leviathan.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)leviathan.$str237$Doppelganging___);
                while (leviathan.NIL == doneP) {
                    if (leviathan.NIL == doneP) {
                        SubLObject csome_list_var = kb_utilities.all_constants();
                        SubLObject constant = (SubLObject)leviathan.NIL;
                        constant = csome_list_var.first();
                        while (leviathan.NIL == doneP && leviathan.NIL != csome_list_var) {
                            SubLObject msg = (SubLObject)leviathan.NIL;
                            if (leviathan.NIL == fort_unsuitable_for_doppelgangingP(constant)) {
                                try {
                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$245 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)leviathan.$sym123$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject created_$246 = create_doppelganger_of_constant(constant, n, skip, created, skipped);
                                            final SubLObject skipped_$247 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            created = created_$246;
                                            skipped = skipped_$247;
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)leviathan.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$245, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                if (msg.isString()) {
                                    Errors.warn((SubLObject)leviathan.$str238$Skipping_term__A_due_to_error____, constant, msg);
                                }
                            }
                            if (created.numGE(n)) {
                                doneP = (SubLObject)leviathan.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            constant = csome_list_var.first();
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$246 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)leviathan.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$246, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return n;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 63443L)
    public static SubLObject fort_unsuitable_for_doppelgangingP(final SubLObject fort) {
        if (leviathan.NIL == list_utilities.member_eqP(ontology_layers.fort_ontology_layer(fort), (SubLObject)leviathan.$list239)) {
            return (SubLObject)leviathan.T;
        }
        if (leviathan.NIL != pph_functions.pph_phrase_fnP(fort, (SubLObject)leviathan.UNPROVIDED)) {
            return (SubLObject)leviathan.T;
        }
        return (SubLObject)leviathan.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 63739L)
    public static SubLObject create_doppelganger_of_constant(final SubLObject constant, final SubLObject n, final SubLObject skip, SubLObject created, SubLObject skipped) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doppelganger = (SubLObject)leviathan.NIL;
        SubLObject doneP = (SubLObject)leviathan.NIL;
        SubLObject did_somethingP = (SubLObject)leviathan.NIL;
        if (leviathan.NIL == doneP) {
            SubLObject csome_list_var = kb_accessors.all_term_assertions(constant, (SubLObject)leviathan.T);
            SubLObject as = (SubLObject)leviathan.NIL;
            as = csome_list_var.first();
            while (leviathan.NIL == doneP && leviathan.NIL != csome_list_var) {
                if (leviathan.NIL == assertion_utilities.gaf_assertion_with_any_of_preds_p(as, (SubLObject)leviathan.$list240)) {
                    if (skipped.numGE(skip)) {
                        if (leviathan.NIL == doppelganger) {
                            final SubLObject name = Sequences.cconcatenate((SubLObject)leviathan.$str241$Doppelganger_, new SubLObject[] { constants_high.constant_name(constant), leviathan.$str242$_, string_utilities.random_string((SubLObject)leviathan.EIGHT_INTEGER) });
                            doppelganger = cyc_kernel.cyc_create_new_ephemeral(name);
                        }
                        final SubLObject cnf = assertions_high.assertion_cnf(as);
                        final SubLObject mt = assertions_high.assertion_mt(as);
                        if (leviathan.NIL == cycl_utilities.expression_find_if((SubLObject)leviathan.$sym243$DOPPELGANGER_P, cnf, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED) && leviathan.NIL == cycl_utilities.expression_find_if((SubLObject)leviathan.$sym243$DOPPELGANGER_P, mt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED)) {
                            final SubLObject doppelganger_cnf = cycl_utilities.expression_subst(doppelganger, constant, cnf, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                            final SubLObject doppelganger_mt = cycl_utilities.expression_subst(doppelganger, constant, mt, (SubLObject)leviathan.UNPROVIDED, (SubLObject)leviathan.UNPROVIDED);
                            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)leviathan.NIL, thread);
                                did_somethingP = (SubLObject)leviathan.T;
                                created = Numbers.add(created, (SubLObject)leviathan.ONE_INTEGER);
                                utilities_macros.note_percent_progress(created, n);
                                SubLObject time = (SubLObject)leviathan.ZERO_INTEGER;
                                final SubLObject time_var = Time.get_internal_real_time();
                                dangerous_create_assertion(doppelganger_cnf, doppelganger_mt, assertions_high.assertion_variable_names(as), assertions_high.assertion_direction(as), assertions_high.assertion_truth(as), assertions_high.assertion_strength(as), assertions_high.get_asserted_argument(as));
                                time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                if (time.numG(leviathan.$doppelganger_time_threshold$.getDynamicValue(thread))) {
                                    Errors.warn((SubLObject)leviathan.$str244$Slow_assertion___s, (SubLObject)ConsesLow.list(time, assertion_handles.assertion_id(as), doppelganger_cnf, doppelganger_mt));
                                }
                                if (created.numGE(n)) {
                                    doneP = (SubLObject)leviathan.T;
                                }
                            }
                            finally {
                                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    else {
                        skipped = Numbers.add(skipped, (SubLObject)leviathan.ONE_INTEGER);
                    }
                }
                csome_list_var = csome_list_var.rest();
                as = csome_list_var.first();
            }
        }
        if (leviathan.NIL != did_somethingP) {
            dangerous_create_assertion(clause_utilities.make_gaf_cnf((SubLObject)ConsesLow.list(leviathan.$const245$doppelgangers, constant, doppelganger)), leviathan.$const246$BookkeepingMt, (SubLObject)leviathan.NIL, (SubLObject)leviathan.$kw247$BACKWARD, (SubLObject)leviathan.$kw248$TRUE, (SubLObject)leviathan.$kw249$DEFAULT, (SubLObject)leviathan.NIL);
        }
        return Values.values(created, skipped);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 65742L)
    public static SubLObject doppelganger_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(leviathan.NIL != constant_handles.constant_p(v_object) && leviathan.NIL != string_utilities.starts_with(constants_high.constant_name(v_object), (SubLObject)leviathan.$str241$Doppelganger_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 65886L)
    public static SubLObject dangerous_create_assertion(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        final SubLObject internal_id = assertion_handles.make_assertion_id();
        final SubLObject assertion = assertion_handles.make_assertion_shell(internal_id);
        assertions_low.kb_create_assertion_int(assertion, internal_id, cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        return internal_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/leviathan.lisp", position = 66446L)
    public static SubLObject possibly_initialize_doppelganger_vocab() {
        if (leviathan.NIL == constant_handles.valid_constantP(leviathan.$const245$doppelgangers, (SubLObject)leviathan.UNPROVIDED)) {
            cyc_kernel.cyc_create((SubLObject)leviathan.$str250$doppelgangers, leviathan.$ic251);
            cyc_kernel.cyc_assert((SubLObject)leviathan.$list252, leviathan.$const144$BaseKB, (SubLObject)leviathan.UNPROVIDED);
            cyc_kernel.cyc_assert((SubLObject)leviathan.$list253, leviathan.$const144$BaseKB, (SubLObject)leviathan.UNPROVIDED);
            cyc_kernel.cyc_assert((SubLObject)leviathan.$list254, leviathan.$const144$BaseKB, (SubLObject)leviathan.UNPROVIDED);
            cyc_kernel.cyc_assert((SubLObject)leviathan.$list255, leviathan.$const144$BaseKB, (SubLObject)leviathan.UNPROVIDED);
            cyc_kernel.cyc_assert((SubLObject)leviathan.$list256, leviathan.$const144$BaseKB, (SubLObject)leviathan.UNPROVIDED);
            cyc_kernel.cyc_assert((SubLObject)leviathan.$list257, leviathan.$const144$BaseKB, (SubLObject)leviathan.UNPROVIDED);
        }
        return leviathan.$const245$doppelgangers;
    }
    
    public static SubLObject declare_leviathan_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "basic_leviathan_query_metrics", "BASIC-LEVIATHAN-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "standard_leviathan_query_metrics", "STANDARD-LEVIATHAN-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "all_leviathan_query_metrics", "ALL-LEVIATHAN-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_experiment_full_filename", "LEVIATHAN-EXPERIMENT-FULL-FILENAME", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.leviathan", "run_leviathan_experiment", "RUN-LEVIATHAN-EXPERIMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_leviathan_experiment", "LOAD-LEVIATHAN-EXPERIMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "save_leviathan_experiment", "SAVE-LEVIATHAN-EXPERIMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_kb_content_query_set_run", "LEVIATHAN-KB-CONTENT-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_halo_query_set_run", "LEVIATHAN-HALO-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_haystack_query_set_run", "LEVIATHAN-HAYSTACK-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_kb_content_queryP", "LEVIATHAN-KB-CONTENT-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_halo_queryP", "LEVIATHAN-HALO-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_haystack_queryP", "LEVIATHAN-HAYSTACK-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "save_haystack", "SAVE-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_haystack", "LOAD-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_all_haystacks", "LOAD-ALL-HAYSTACKS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "clear_cached_load_all_haystacks", "CLEAR-CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "remove_cached_load_all_haystacks", "REMOVE-CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "cached_load_all_haystacks_internal", "CACHED-LOAD-ALL-HAYSTACKS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "cached_load_all_haystacks", "CACHED-LOAD-ALL-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_all_haystacks_int", "LOAD-ALL-HAYSTACKS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "show_haystack_statistics", "SHOW-HAYSTACK-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_all_instantiated_haystacks", "LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "clear_cached_load_all_instantiated_haystacks", "CLEAR-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "remove_cached_load_all_instantiated_haystacks", "REMOVE-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "cached_load_all_instantiated_haystacks_internal", "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "cached_load_all_instantiated_haystacks", "CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_all_instantiated_haystacks_int", "LOAD-ALL-INSTANTIATED-HAYSTACKS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "show_instantiated_haystack_statistics", "SHOW-INSTANTIATED-HAYSTACK-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "save_good_instantiated_haystack", "SAVE-GOOD-INSTANTIATED-HAYSTACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "make_haystacks_good", "MAKE-HAYSTACKS-GOOD", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_all_crippled_haystacks", "LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "clear_cached_load_all_crippled_haystacks", "CLEAR-CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "remove_cached_load_all_crippled_haystacks", "REMOVE-CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "cached_load_all_crippled_haystacks_internal", "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "cached_load_all_crippled_haystacks", "CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "load_all_crippled_haystacks_int", "LOAD-ALL-CRIPPLED-HAYSTACKS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "show_crippled_haystack_statistics", "SHOW-CRIPPLED-HAYSTACK-STATISTICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "make_haystacks_crippled", "MAKE-HAYSTACKS-CRIPPLED", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "reify_all_haystacks", "REIFY-ALL-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "reify_all_instantiated_haystacks", "REIFY-ALL-INSTANTIATED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "reify_all_crippled_haystacks", "REIFY-ALL-CRIPPLED-HAYSTACKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "reify_haystack", "REIFY-HAYSTACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "haystack_constant_name_from_filename", "HAYSTACK-CONSTANT-NAME-FROM-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "haystack_id_string_from_filename", "HAYSTACK-ID-STRING-FROM-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "haystack_id_string_from_query", "HAYSTACK-ID-STRING-FROM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "haystack_size_from_query", "HAYSTACK-SIZE-FROM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "haystack_filename_from_query", "HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "instantiated_haystack_filename_from_query", "INSTANTIATED-HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "crippled_haystack_filename_from_query", "CRIPPLED-HAYSTACK-FILENAME-FROM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "remove_haystack_files", "REMOVE-HAYSTACK-FILES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "remove_all_duplicate_haystack_files", "REMOVE-ALL-DUPLICATE-HAYSTACK-FILES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "remove_duplicate_haystack_files_int", "REMOVE-DUPLICATE-HAYSTACK-FILES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "kill_duplicate_and_broken_reified_haystacks", "KILL-DUPLICATE-AND-BROKEN-REIFIED-HAYSTACKS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "finalize_haystack_corpus", "FINALIZE-HAYSTACK-CORPUS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "initialize_kb_content_leviathan_queries", "INITIALIZE-KB-CONTENT-LEVIATHAN-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "determine_leviathan_training_and_blind_sets", "DETERMINE-LEVIATHAN-TRAINING-AND-BLIND-SETS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "determine_leviathan_training_and_blind_sets_int", "DETERMINE-LEVIATHAN-TRAINING-AND-BLIND-SETS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "unassert_assertion", "UNASSERT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "unassert_assertion_via_cyc", "UNASSERT-ASSERTION-VIA-CYC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "unassert_assertion_via_hl", "UNASSERT-ASSERTION-VIA-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "unassert_assertion_via_tms", "UNASSERT-ASSERTION-VIA-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "assert_allowed_rules_for_justified_queries", "ASSERT-ALLOWED-RULES-FOR-JUSTIFIED-QUERIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "allowed_rules_utilities", "ALLOWED-RULES-UTILITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "allowed_rules_sorted_utility_tuples", "ALLOWED-RULES-SORTED-UTILITY-TUPLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "skolem_ruleP", "SKOLEM-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "all_skolem_rules", "ALL-SKOLEM-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "negative_utility_skolem_rules", "NEGATIVE-UTILITY-SKOLEM-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "sorted_rule_utilities", "SORTED-RULE-UTILITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_utility_tuples", "RULE-UTILITY-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_consideration_tuples", "RULE-CONSIDERATION-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_success_tuples", "RULE-SUCCESS-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "skolem_rules_used_in_justified_queries", "SKOLEM-RULES-USED-IN-JUSTIFIED-QUERIES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "skolem_allowed_rules", "SKOLEM-ALLOWED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "kill_all_skolem_rules", "KILL-ALL-SKOLEM-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "kill_all_negative_utility_skolem_rules", "KILL-ALL-NEGATIVE-UTILITY-SKOLEM-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "inert_rules", "INERT-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "inert_ruleP", "INERT-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "assertion_has_non_skolem_assertion_dependentsP", "ASSERTION-HAS-NON-SKOLEM-ASSERTION-DEPENDENTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "kill_all_inert_rules", "KILL-ALL-INERT-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rules_that_totally_suck", "RULES-THAT-TOTALLY-SUCK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "kill_all_rules_that_totally_suck", "KILL-ALL-RULES-THAT-TOTALLY-SUCK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "never_successful_ruleP", "NEVER-SUCCESSFUL-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "successful_ruleP", "SUCCESSFUL-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "never_considered_ruleP", "NEVER-CONSIDERED-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "considered_ruleP", "CONSIDERED-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "considered_but_not_successful_ruleP", "CONSIDERED-BUT-NOT-SUCCESSFUL-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_rule_statistics", "LEVIATHAN-RULE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_analysis_L", "RULE-ANALYSIS-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_rule_statistics_int", "LEVIATHAN-RULE-STATISTICS-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_allowed_rules", "LEVIATHAN-ALLOWED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_kb_content_allowed_rules", "LEVIATHAN-KB-CONTENT-ALLOWED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_haystack_allowed_rules", "LEVIATHAN-HAYSTACK-ALLOWED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_haystack_all_allowed_rules", "LEVIATHAN-HAYSTACK-ALL-ALLOWED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "conditional_queries", "CONDITIONAL-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "queries_that_probably_ought_to_be_conditional", "QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "fix_queries_that_probably_ought_to_be_conditional", "FIX-QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_bindings_to_closed_summary", "RULE-BINDINGS-TO-CLOSED-SUMMARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_bindings_wffP", "RULE-BINDINGS-WFF?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_bindings_wff_analysis", "RULE-BINDINGS-WFF-ANALYSIS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "initialize_rule_bindings_wff_table", "INITIALIZE-RULE-BINDINGS-WFF-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "rule_bindings_wff_cachedP", "RULE-BINDINGS-WFF-CACHED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_generate_answerable_vs_unanswerable_comparison", "LEVIATHAN-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "generate_all_leviathan_answerable_vs_unanswerable_comparisons", "GENERATE-ALL-LEVIATHAN-ANSWERABLE-VS-UNANSWERABLE-COMPARISONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_answerability_data", "LEVIATHAN-ANSWERABILITY-DATA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_generate_answerability_prediction_graph", "LEVIATHAN-GENERATE-ANSWERABILITY-PREDICTION-GRAPH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "generate_all_leviathan_answerability_prediction_graphs", "GENERATE-ALL-LEVIATHAN-ANSWERABILITY-PREDICTION-GRAPHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_win_at_solitaire", "LEVIATHAN-WIN-AT-SOLITAIRE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "clear_problem_creation_times", "CLEAR-PROBLEM-CREATION-TIMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "note_new_problem_created", "NOTE-NEW-PROBLEM-CREATED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "historical_problem_creation_times", "HISTORICAL-PROBLEM-CREATION-TIMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "initialize_halo_leviathan_queries", "INITIALIZE-HALO-LEVIATHAN-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "analyze_leviathan_experiment", "ANALYZE-LEVIATHAN-EXPERIMENT", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "analyze_leviathan_experiments", "ANALYZE-LEVIATHAN-EXPERIMENTS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_generate_sorted_property_comparison", "LEVIATHAN-GENERATE-SORTED-PROPERTY-COMPARISON", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "leviathan_generate_sorted_property_display", "LEVIATHAN-GENERATE-SORTED-PROPERTY-DISPLAY", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "ylabel_for_property", "YLABEL-FOR-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "problem_query_relational_complexity_analysis", "PROBLEM-QUERY-RELATIONAL-COMPLEXITY-ANALYSIS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "problem_query_fort_analysis", "PROBLEM-QUERY-FORT-ANALYSIS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "elapsed_crtl_internal_real_time_to_elapsed_seconds", "ELAPSED-CRTL-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "elapsed_crtl_internal_real_times_to_elapsed_seconds", "ELAPSED-CRTL-INTERNAL-REAL-TIMES-TO-ELAPSED-SECONDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "compute_n_way_parallelism_total_time", "COMPUTE-N-WAY-PARALLELISM-TOTAL-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "compute_n_way_parallelism_time_to_first_answer", "COMPUTE-N-WAY-PARALLELISM-TIME-TO-FIRST-ANSWER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "compute_n_way_parallelism_times", "COMPUTE-N-WAY-PARALLELISM-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "earliest_free_processor_number", "EARLIEST-FREE-PROCESSOR-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "new_root_first_answer_times", "NEW-ROOT-FIRST-ANSWER-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "generate_new_root_first_answer_times_graph", "GENERATE-NEW-ROOT-FIRST-ANSWER-TIMES-GRAPH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "new_root_total_times", "NEW-ROOT-TOTAL-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "generate_new_root_total_times_graph", "GENERATE-NEW-ROOT-TOTAL-TIMES-GRAPH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "haystack_transformation_fanout_estimate", "HAYSTACK-TRANSFORMATION-FANOUT-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "inference_transformation_fanout_estimate", "INFERENCE-TRANSFORMATION-FANOUT-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "problem_standard_transformation_fanout", "PROBLEM-STANDARD-TRANSFORMATION-FANOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "literal_standard_transformation_fanout", "LITERAL-STANDARD-TRANSFORMATION-FANOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "inference_top_level_removal_fanout", "INFERENCE-TOP-LEVEL-REMOVAL-FANOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "balanced_strategy_root_initial_removal_fanout", "BALANCED-STRATEGY-ROOT-INITIAL-REMOVAL-FANOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "inference_new_root_initial_removal_fanouts", "INFERENCE-NEW-ROOT-INITIAL-REMOVAL-FANOUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "enlarge_kb_via_doppelgangers", "ENLARGE-KB-VIA-DOPPELGANGERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "fort_unsuitable_for_doppelgangingP", "FORT-UNSUITABLE-FOR-DOPPELGANGING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "create_doppelganger_of_constant", "CREATE-DOPPELGANGER-OF-CONSTANT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "doppelganger_p", "DOPPELGANGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "dangerous_create_assertion", "DANGEROUS-CREATE-ASSERTION", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.leviathan", "possibly_initialize_doppelganger_vocab", "POSSIBLY-INITIALIZE-DOPPELGANGER-VOCAB", 0, 0, false);
        return (SubLObject)leviathan.NIL;
    }
    
    public static SubLObject init_leviathan_file() {
        leviathan.$leviathan_directory$ = SubLFiles.deflexical("*LEVIATHAN-DIRECTORY*", (SubLObject)leviathan.$str0$_cyc_projects_inference_leviathan);
        leviathan.$leviathan_experiment_directory$ = SubLFiles.deflexical("*LEVIATHAN-EXPERIMENT-DIRECTORY*", Sequences.cconcatenate(leviathan.$leviathan_directory$.getGlobalValue(), (SubLObject)leviathan.$str1$experiments_));
        leviathan.$standard_leviathan_query_metrics$ = SubLFiles.deflexical("*STANDARD-LEVIATHAN-QUERY-METRICS*", (SubLObject)leviathan.$list3);
        leviathan.$leviathan_outlier_timeout$ = SubLFiles.deflexical("*LEVIATHAN-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
        leviathan.$cached_load_all_haystacks_caching_state$ = SubLFiles.deflexical("*CACHED-LOAD-ALL-HAYSTACKS-CACHING-STATE*", (SubLObject)leviathan.NIL);
        leviathan.$cached_load_all_instantiated_haystacks_caching_state$ = SubLFiles.deflexical("*CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-CACHING-STATE*", (SubLObject)leviathan.NIL);
        leviathan.$cached_load_all_crippled_haystacks_caching_state$ = SubLFiles.deflexical("*CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-CACHING-STATE*", (SubLObject)leviathan.NIL);
        leviathan.$sorted_rule_analyses$ = SubLFiles.deflexical("*SORTED-RULE-ANALYSES*", (SubLObject)leviathan.$list126);
        leviathan.$rule_bindings_wff_table$ = SubLFiles.deflexical("*RULE-BINDINGS-WFF-TABLE*", (SubLObject)((leviathan.NIL != Symbols.boundp((SubLObject)leviathan.$sym150$_RULE_BINDINGS_WFF_TABLE_)) ? leviathan.$rule_bindings_wff_table$.getGlobalValue() : leviathan.NIL));
        leviathan.$rule_bindings_to_closed_wff_pruning_enabledP$ = SubLFiles.defparameter("*RULE-BINDINGS-TO-CLOSED-WFF-PRUNING-ENABLED?*", (SubLObject)leviathan.NIL);
        leviathan.$maintain_problem_creation_timesP$ = SubLFiles.defparameter("*MAINTAIN-PROBLEM-CREATION-TIMES?*", (SubLObject)leviathan.NIL);
        leviathan.$problem_creation_times$ = SubLFiles.deflexical("*PROBLEM-CREATION-TIMES*", (SubLObject)((leviathan.NIL != Symbols.boundp((SubLObject)leviathan.$sym159$_PROBLEM_CREATION_TIMES_)) ? leviathan.$problem_creation_times$.getGlobalValue() : leviathan.NIL));
        leviathan.$leviathan_crtl_internal_time_units_per_second$ = SubLFiles.deflexical("*LEVIATHAN-CRTL-INTERNAL-TIME-UNITS-PER-SECOND*", (SubLObject)leviathan.$int223$1000000);
        leviathan.$doppelganger_time_threshold$ = SubLFiles.defparameter("*DOPPELGANGER-TIME-THRESHOLD*", (SubLObject)leviathan.THREE_INTEGER);
        return (SubLObject)leviathan.NIL;
    }
    
    public static SubLObject setup_leviathan_file() {
        memoization_state.note_globally_cached_function((SubLObject)leviathan.$sym33$CACHED_LOAD_ALL_HAYSTACKS);
        memoization_state.note_globally_cached_function((SubLObject)leviathan.$sym43$CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS);
        memoization_state.note_globally_cached_function((SubLObject)leviathan.$sym50$CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS);
        subl_macro_promotions.declare_defglobal((SubLObject)leviathan.$sym150$_RULE_BINDINGS_WFF_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)leviathan.$sym159$_PROBLEM_CREATION_TIMES_);
        utilities_macros.note_funcall_helper_function((SubLObject)leviathan.$sym243$DOPPELGANGER_P);
        return (SubLObject)leviathan.NIL;
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
        me = (SubLFile)new leviathan();
        leviathan.$leviathan_directory$ = null;
        leviathan.$leviathan_experiment_directory$ = null;
        leviathan.$standard_leviathan_query_metrics$ = null;
        leviathan.$leviathan_outlier_timeout$ = null;
        leviathan.$cached_load_all_haystacks_caching_state$ = null;
        leviathan.$cached_load_all_instantiated_haystacks_caching_state$ = null;
        leviathan.$cached_load_all_crippled_haystacks_caching_state$ = null;
        leviathan.$sorted_rule_analyses$ = null;
        leviathan.$rule_bindings_wff_table$ = null;
        leviathan.$rule_bindings_to_closed_wff_pruning_enabledP$ = null;
        leviathan.$maintain_problem_creation_timesP$ = null;
        leviathan.$problem_creation_times$ = null;
        leviathan.$leviathan_crtl_internal_time_units_per_second$ = null;
        leviathan.$doppelganger_time_threshold$ = null;
        $str0$_cyc_projects_inference_leviathan = SubLObjectFactory.makeString("/cyc/projects/inference/leviathan/");
        $str1$experiments_ = SubLObjectFactory.makeString("experiments/");
        $kw2$TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ANSWER-COUNT"), SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("TOTAL-TIME"), SubLObjectFactory.makeKeyword("PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PROOF-COUNT"), SubLObjectFactory.makeKeyword("LINK-COUNT"), SubLObjectFactory.makeKeyword("TACTIC-COUNT"), SubLObjectFactory.makeKeyword("REMOVAL-LINK-COUNT"), SubLObjectFactory.makeKeyword("TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeKeyword("JOIN-ORDERED-LINK-COUNT"), SubLObjectFactory.makeKeyword("JOIN-LINK-COUNT"), SubLObjectFactory.makeKeyword("SPLIT-LINK-COUNT"), SubLObjectFactory.makeKeyword("RESTRICTION-LINK-COUNT"), SubLObjectFactory.makeKeyword("GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEW-ROOT-COUNT") });
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-QUERIES"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROOF-COUNT"));
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("QUERY-SPEC-SET"), SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("OVERRIDING-QUERY-PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METRICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-LEVIATHAN-QUERY-METRICS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTLIER-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*LEVIATHAN-OUTLIER-TIMEOUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCREMENTAL"), (SubLObject)leviathan.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-RESULTS"), (SubLObject)leviathan.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP"), (SubLObject)leviathan.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("*LEVIATHAN-EXPERIMENT-DIRECTORY*")) });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("QUERY-SPEC-SET"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), SubLObjectFactory.makeKeyword("METRICS"), SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), SubLObjectFactory.makeKeyword("INCREMENTAL"), SubLObjectFactory.makeKeyword("INCLUDE-RESULTS"), SubLObjectFactory.makeKeyword("SKIP"), SubLObjectFactory.makeKeyword("COUNT"), SubLObjectFactory.makeKeyword("DIRECTORY") });
        $kw7$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw8$QUERY_SPEC_SET = SubLObjectFactory.makeKeyword("QUERY-SPEC-SET");
        $kw9$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $kw10$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw11$OVERRIDING_QUERY_PROPERTIES = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $kw12$METRICS = SubLObjectFactory.makeKeyword("METRICS");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-LEVIATHAN-QUERY-METRICS"));
        $kw14$OUTLIER_TIMEOUT = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $sym15$_LEVIATHAN_OUTLIER_TIMEOUT_ = SubLObjectFactory.makeSymbol("*LEVIATHAN-OUTLIER-TIMEOUT*");
        $kw16$INCREMENTAL = SubLObjectFactory.makeKeyword("INCREMENTAL");
        $kw17$INCLUDE_RESULTS = SubLObjectFactory.makeKeyword("INCLUDE-RESULTS");
        $kw18$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw19$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $kw20$DIRECTORY = SubLObjectFactory.makeKeyword("DIRECTORY");
        $sym21$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym22$FULL_FILENAME = SubLObjectFactory.makeUninternedSymbol("FULL-FILENAME");
        $sym23$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym24$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym25$LEVIATHAN_EXPERIMENT_FULL_FILENAME = SubLObjectFactory.makeSymbol("LEVIATHAN-EXPERIMENT-FULL-FILENAME");
        $sym26$RUN_KBQ_EXPERIMENT = SubLObjectFactory.makeSymbol("RUN-KBQ-EXPERIMENT");
        $const27$KBContentLeviathanQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery"));
        $const28$HALOLeviathanQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery"));
        $const29$AutogeneratedLeviathanQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery"));
        $str30$data_haystacks_ = SubLObjectFactory.makeString("data/haystacks/");
        $str31$_haystack_ = SubLObjectFactory.makeString("-haystack-");
        $str32$_cfasl = SubLObjectFactory.makeString(".cfasl");
        $sym33$CACHED_LOAD_ALL_HAYSTACKS = SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-HAYSTACKS");
        $sym34$_CACHED_LOAD_ALL_HAYSTACKS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-LOAD-ALL-HAYSTACKS-CACHING-STATE*");
        $sym35$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str36$Loading_all_haystacks = SubLObjectFactory.makeString("Loading all haystacks");
        $str37$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym38$_ = SubLObjectFactory.makeSymbol("<");
        $sym39$HAYSTACK_SIZE = SubLObjectFactory.makeSymbol("HAYSTACK-SIZE");
        $str40$____Total_haystacks_ = SubLObjectFactory.makeString("~%~%Total haystacks:");
        $str41$____Interesting_haystacks_ = SubLObjectFactory.makeString("~%~%Interesting haystacks:");
        $sym42$INTERESTING_HAYSTACK_P = SubLObjectFactory.makeSymbol("INTERESTING-HAYSTACK-P");
        $sym43$CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS = SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS");
        $sym44$_CACHED_LOAD_ALL_INSTANTIATED_HAYSTACKS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-CACHING-STATE*");
        $str45$data_instantiated_haystacks_ = SubLObjectFactory.makeString("data/instantiated-haystacks/");
        $str46$Loading_all_instantiated_haystack = SubLObjectFactory.makeString("Loading all instantiated haystacks");
        $str47$____Total_instantiated_haystacks_ = SubLObjectFactory.makeString("~%~%Total instantiated haystacks: ~a");
        $sym48$FIX_HAYSTACK_VARIABLES = SubLObjectFactory.makeSymbol("FIX-HAYSTACK-VARIABLES");
        $str49$_a_ = SubLObjectFactory.makeString("~a ");
        $sym50$CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS = SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS");
        $sym51$_CACHED_LOAD_ALL_CRIPPLED_HAYSTACKS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-CACHING-STATE*");
        $str52$data_crippled_haystacks_ = SubLObjectFactory.makeString("data/crippled-haystacks/");
        $str53$Loading_all_crippled_haystacks = SubLObjectFactory.makeString("Loading all crippled haystacks");
        $str54$____Total_crippled_haystacks___a = SubLObjectFactory.makeString("~%~%Total crippled haystacks: ~a");
        $str55$Reifying_all_instantiated_haystac = SubLObjectFactory.makeString("Reifying all instantiated haystacks");
        $str56$Reifying_all_crippled_haystacks = SubLObjectFactory.makeString("Reifying all crippled haystacks");
        $const57$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list58 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled")));
        $const59$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $list60 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled")));
        $const61$TestVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $const62$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification"));
        $const63$InferenceMaxTransformationStepsPa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceMaxTransformationStepsParameter"));
        $list64 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification")), (SubLObject)leviathan.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL")));
        $const65$UniversalVocabularyImplementation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyImplementationMt"));
        $const66$InferenceAllowedRulesParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceAllowedRulesParameter"));
        $str67$LeviathanHaystack_ = SubLObjectFactory.makeString("LeviathanHaystack-");
        $kw68$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $str69$Removing_duplicate_haystacks = SubLObjectFactory.makeString("Removing duplicate haystacks");
        $kw70$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym71$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str72$haystacks_20050425_focused = SubLObjectFactory.makeString("haystacks-20050425-focused");
        $str73$haystacks_20050425_exploratory = SubLObjectFactory.makeString("haystacks-20050425-exploratory");
        $list74 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedHaystackQuery")));
        $const75$AutogeneratedLeviathanQuery_Uncri = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled"));
        $str76$deep_queries_with_1_backchain = SubLObjectFactory.makeString("deep-queries-with-1-backchain");
        $list77 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery")));
        $const78$KBContentLeviathanQuery_Training = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery-Training"));
        $const79$KBContentLeviathanQuery_Blind = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentLeviathanQuery-Blind"));
        $const80$HALOLeviathanQuery_Training = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery-Training"));
        $const81$HALOLeviathanQuery_Blind = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery-Blind"));
        $const82$AutogeneratedLeviathanQuery_Uncri = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled-Training"));
        $const83$AutogeneratedLeviathanQuery_Uncri = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Uncrippled-Blind"));
        $const84$AutogeneratedLeviathanQuery_Cripp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled"));
        $const85$AutogeneratedLeviathanQuery_Cripp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled-Training"));
        $const86$AutogeneratedLeviathanQuery_Cripp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Crippled-Blind"));
        $float87$0_8 = (SubLFloat)SubLObjectFactory.makeDouble(0.8);
        $str88$Oops__off_by_one_error_in_first_n = SubLObjectFactory.makeString("Oops, off by one error in first-n / last-n");
        $str89$could_not_unassert__a_at_Cyc_laye = SubLObjectFactory.makeString("could not unassert ~a at Cyc layer");
        $str90$could_not_unassert__a_at_HL = SubLObjectFactory.makeString("could not unassert ~a at HL");
        $str91$could_not_unassert__a_via_TMS = SubLObjectFactory.makeString("could not unassert ~a via TMS");
        $str92$kb_content_training_justification = SubLObjectFactory.makeString("kb-content-training-justifications-rabbit-hole-20050426");
        $str93$Asserting_allowed_rules_for_answe = SubLObjectFactory.makeString("Asserting allowed rules for answerable queries");
        $sym94$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $const95$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $const96$LeviathanQuery_Training = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeviathanQuery-Training"));
        $kw97$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw98$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw99$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym100$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw101$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str102$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym103$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw104$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str105$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw106$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str107$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str108$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str109$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str111$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym112$FAST_REIFIED_SKOLEM_ = SubLObjectFactory.makeSymbol("FAST-REIFIED-SKOLEM?");
        $str113$Gathering_all_skolem_rules = SubLObjectFactory.makeString("Gathering all skolem rules");
        $sym114$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str115$Gathering_all_negative_utility_sk = SubLObjectFactory.makeString("Gathering all negative-utility skolem rules");
        $sym116$TRANSFORMATION_RULE_HISTORICAL_UTILITY = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-HISTORICAL-UTILITY");
        $sym117$TRANSFORMATION_RULE_CONSIDERED_COUNT = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-CONSIDERED-COUNT");
        $sym118$TRANSFORMATION_RULE_SUCCESS_COUNT = SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");
        $str119$mapping_Cyc_rules = SubLObjectFactory.makeString("mapping Cyc rules");
        $const120$skolem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("skolem"));
        $sym121$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)leviathan.NIL);
        $sym123$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym124$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str125$_A = SubLObjectFactory.makeString("~A");
        $list126 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUCKY-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("SUCKY-RULE"), SubLObjectFactory.makeKeyword("INERT-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("INERT-RULE"), SubLObjectFactory.makeKeyword("UNSUCCESSFUL-FORWARD-RULE"), SubLObjectFactory.makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS"), SubLObjectFactory.makeKeyword("SUCCESSFUL-SKOLEM-RULE"), SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE"), SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE"), SubLObjectFactory.makeKeyword("SUCCESSFUL-FORWARD-RULE"), SubLObjectFactory.makeKeyword("OTHER") });
        $kw127$SUCKY_SKOLEM_RULE = SubLObjectFactory.makeKeyword("SUCKY-SKOLEM-RULE");
        $kw128$NEGATIVE_UTILITY_SKOLEM_RULE = SubLObjectFactory.makeKeyword("NEGATIVE-UTILITY-SKOLEM-RULE");
        $kw129$INERT_SKOLEM_RULE = SubLObjectFactory.makeKeyword("INERT-SKOLEM-RULE");
        $kw130$SUCCESSFUL_SKOLEM_RULE = SubLObjectFactory.makeKeyword("SUCCESSFUL-SKOLEM-RULE");
        $kw131$NEVER_CONSIDERED_FORWARD_SKOLEM_RULE = SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-FORWARD-SKOLEM-RULE");
        $kw132$NEVER_CONSIDERED_BACKWARD_SKOLEM_RULE = SubLObjectFactory.makeKeyword("NEVER-CONSIDERED-BACKWARD-SKOLEM-RULE");
        $kw133$INERT_RULE = SubLObjectFactory.makeKeyword("INERT-RULE");
        $kw134$SUCKY_RULE = SubLObjectFactory.makeKeyword("SUCKY-RULE");
        $kw135$BACKWARD_SUCCESSFUL_FORWARD_RULE = SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-FORWARD-RULE");
        $kw136$BACKWARD_SUCCESSFUL_BACKWARD_RULE = SubLObjectFactory.makeKeyword("BACKWARD-SUCCESSFUL-BACKWARD-RULE");
        $kw137$SUCCESSFUL_FORWARD_RULE = SubLObjectFactory.makeKeyword("SUCCESSFUL-FORWARD-RULE");
        $kw138$UNSUCCESSFUL_FORWARD_RULE = SubLObjectFactory.makeKeyword("UNSUCCESSFUL-FORWARD-RULE");
        $kw139$UNSUCCESSFUL_BACKWARD_RULE_WITH_DEPENDENTS = SubLObjectFactory.makeKeyword("UNSUCCESSFUL-BACKWARD-RULE-WITH-DEPENDENTS");
        $kw140$OTHER = SubLObjectFactory.makeKeyword("OTHER");
        $const141$AutogeneratedLeviathanQuery_Train = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AutogeneratedLeviathanQuery-Training"));
        $const142$CycLQuerySpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification"));
        $kw143$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $const144$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const145$InferenceConditionalSentenceParam = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceConditionalSentenceParameter"));
        $const146$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $str147$pre_halo_training_rule_bindings_t = SubLObjectFactory.makeString("pre-halo-training-rule-bindings-to-closed-20050506");
        $kw148$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym150$_RULE_BINDINGS_WFF_TABLE_ = SubLObjectFactory.makeSymbol("*RULE-BINDINGS-WFF-TABLE*");
        $str151$_cyc_projects_inference_leviathan = SubLObjectFactory.makeString("/cyc/projects/inference/leviathan/data/rule-bindings-to-closed-wff-analysis.cfasl");
        $kw152$LOGSCALE_Y_ = SubLObjectFactory.makeKeyword("LOGSCALE-Y?");
        $kw153$YLABEL = SubLObjectFactory.makeKeyword("YLABEL");
        $kw154$PLOT_TITLE = SubLObjectFactory.makeKeyword("PLOT-TITLE");
        $str155$Answerable_vs__Unanswerable_ = SubLObjectFactory.makeString("Answerable vs. Unanswerable ");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPERIMENT"));
        $kw157$TOTAL_ANSWERABLE = SubLObjectFactory.makeKeyword("TOTAL-ANSWERABLE");
        $str158$Oracularly_Answerable_vs__Unanswe = SubLObjectFactory.makeString("Oracularly Answerable vs. Unanswerable ");
        $sym159$_PROBLEM_CREATION_TIMES_ = SubLObjectFactory.makeSymbol("*PROBLEM-CREATION-TIMES*");
        $str160$halo_queries_with_1_backchain_823 = SubLObjectFactory.makeString("halo-queries-with-1-backchain-823-0524");
        $list161 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HALOLeviathanQuery")));
        $str162$Leviathan_Training = SubLObjectFactory.makeString("Leviathan Training");
        $str163$_0 = SubLObjectFactory.makeString(":0");
        $sym164$BOUND_SYMBOL_P = SubLObjectFactory.makeSymbol("BOUND-SYMBOL-P");
        $str165$____Basic_analysis____ = SubLObjectFactory.makeString("~%~%Basic analysis: ~%");
        $str166$____Answerable____ = SubLObjectFactory.makeString("~%~%Answerable: ~%");
        $str167$____Unanswerable____ = SubLObjectFactory.makeString("~%~%Unanswerable: ~%");
        $str168$____KB_Content____ = SubLObjectFactory.makeString("~%~%KB Content: ~%");
        $str169$____Autogenerated____ = SubLObjectFactory.makeString("~%~%Autogenerated: ~%");
        $str170$____HALO____ = SubLObjectFactory.makeString("~%~%HALO: ~%");
        $str171$____Answerable_KB_Content____ = SubLObjectFactory.makeString("~%~%Answerable KB Content: ~%");
        $str172$____Answerable_Autogenerated____ = SubLObjectFactory.makeString("~%~%Answerable Autogenerated: ~%");
        $str173$____Answerable_HALO____ = SubLObjectFactory.makeString("~%~%Answerable HALO: ~%");
        $str174$____Unanswerable_KB_Content____ = SubLObjectFactory.makeString("~%~%Unanswerable KB Content: ~%");
        $str175$____Unanswerable_Autogenerated___ = SubLObjectFactory.makeString("~%~%Unanswerable Autogenerated: ~%");
        $str176$____Unanswerable_HALO____ = SubLObjectFactory.makeString("~%~%Unanswerable HALO: ~%");
        $str177$______of_queries_answerable_in__B = SubLObjectFactory.makeString("~%~%# of queries answerable in (BASELINE  BOTH  EXPERIMENT): ~%");
        $str178$Total___________s__s__s__ = SubLObjectFactory.makeString("Total:         ~s ~s ~s~%");
        $str179$KB_Content______s__s__s__ = SubLObjectFactory.makeString("KB Content:    ~s ~s ~s~%");
        $str180$Autogenerated___s__s__s__ = SubLObjectFactory.makeString("Autogenerated: ~s ~s ~s~%");
        $str181$HALO____________s__s__s__ = SubLObjectFactory.makeString("HALO:          ~s ~s ~s~%");
        $str182$____Key___BASELINE_VALUE__EXPERIM = SubLObjectFactory.makeString("~%~%Key: (BASELINE-VALUE  EXPERIMENT-VALUE  RATIO), times are expressed in seconds.~%");
        $str183$____Mutually_Answerable____ = SubLObjectFactory.makeString("~%~%Mutually Answerable: ~%");
        $str184$____Mutually_Answerable_KB_Conten = SubLObjectFactory.makeString("~%~%Mutually Answerable KB Content: ~%");
        $str185$____Mutually_Answerable_Autogener = SubLObjectFactory.makeString("~%~%Mutually Answerable Autogenerated: ~%");
        $str186$____Mutually_Answerable_HALO____ = SubLObjectFactory.makeString("~%~%Mutually Answerable HALO: ~%");
        $kw187$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $str188$Mutually_Answerable_ = SubLObjectFactory.makeString("Mutually Answerable ");
        $kw189$BASELINE = SubLObjectFactory.makeKeyword("BASELINE");
        $str190$__ = SubLObjectFactory.makeString(": ");
        $str191$_vs__ = SubLObjectFactory.makeString(" vs. ");
        $str192$_n = SubLObjectFactory.makeString("\\n");
        $kw193$XLABEL = SubLObjectFactory.makeKeyword("XLABEL");
        $str194$Sorted_Queries = SubLObjectFactory.makeString("Sorted Queries");
        $kw195$BASELINE_KEY_LABEL = SubLObjectFactory.makeKeyword("BASELINE-KEY-LABEL");
        $kw196$EXPERIMENT_KEY_LABEL = SubLObjectFactory.makeKeyword("EXPERIMENT-KEY-LABEL");
        $list197 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeInteger(100)));
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVIATHAN-KB-CONTENT-QUERY?"), (SubLObject)SubLObjectFactory.makeSymbol("LEVIATHAN-HAYSTACK-QUERY?"), (SubLObject)SubLObjectFactory.makeSymbol("LEVIATHAN-HALO-QUERY?"));
        $str199$_ = SubLObjectFactory.makeString(" ");
        $list200 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASSIFICATION-LABELS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("KB Content queries"), (SubLObject)SubLObjectFactory.makeString("Autogenerated queries"), (SubLObject)SubLObjectFactory.makeString("HALO queries")), (SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeInteger(100)));
        $str201$time = SubLObjectFactory.makeString("time");
        $str202$Time__sec_ = SubLObjectFactory.makeString("Time (sec)");
        $str203$problem = SubLObjectFactory.makeString("problem");
        $str204$__of_problems = SubLObjectFactory.makeString("# of problems");
        $str205$link = SubLObjectFactory.makeString("link");
        $str206$__of_links = SubLObjectFactory.makeString("# of links");
        $str207$tactic = SubLObjectFactory.makeString("tactic");
        $str208$__of_tactics = SubLObjectFactory.makeString("# of tactics");
        $str209$proof = SubLObjectFactory.makeString("proof");
        $str210$__of_proofs = SubLObjectFactory.makeString("# of proofs");
        $str211$answer = SubLObjectFactory.makeString("answer");
        $str212$__of_answers = SubLObjectFactory.makeString("# of answers");
        $str213$byte = SubLObjectFactory.makeString("byte");
        $str214$__of_bytes = SubLObjectFactory.makeString("# of bytes");
        $str215$ = SubLObjectFactory.makeString("");
        $str216$training_823_h_queries_0602 = SubLObjectFactory.makeString("training-823-h-queries-0602");
        $kw217$PROBLEM_QUERIES = SubLObjectFactory.makeKeyword("PROBLEM-QUERIES");
        $kw218$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw220$POS = SubLObjectFactory.makeKeyword("POS");
        $sym221$_ = SubLObjectFactory.makeSymbol(">");
        $sym222$CDR = SubLObjectFactory.makeSymbol("CDR");
        $int223$1000000 = SubLObjectFactory.makeInteger(1000000);
        $sym224$ELAPSED_CRTL_INTERNAL_REAL_TIME_TO_ELAPSED_SECONDS = SubLObjectFactory.makeSymbol("ELAPSED-CRTL-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS");
        $kw225$NEW_ROOT_RELATIVE_TOTAL_TIMES = SubLObjectFactory.makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");
        $kw226$NEW_ROOT_RELATIVE_ANSWER_TIMES = SubLObjectFactory.makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");
        $sym227$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym228$KBQ_INTERNAL_REAL_TIME_TO_SECONDS = SubLObjectFactory.makeSymbol("KBQ-INTERNAL-REAL-TIME-TO-SECONDS");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)leviathan.T);
        $list230 = ConsesLow.list((SubLObject)leviathan.ONE_INTEGER);
        $sym231$_ = SubLObjectFactory.makeSymbol("*");
        $sym232$SINGLE_LITERAL_PROBLEM_P = SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-P");
        $sym233$CYCL_LITERAL_P = SubLObjectFactory.makeSymbol("CYCL-LITERAL-P");
        $list234 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)leviathan.T, (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)leviathan.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)leviathan.ONE_INTEGER);
        $kw235$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $kw236$TRANS_UNBOUND_PREDICATE_POS = SubLObjectFactory.makeKeyword("TRANS-UNBOUND-PREDICATE-POS");
        $str237$Doppelganging___ = SubLObjectFactory.makeString("Doppelganging...");
        $str238$Skipping_term__A_due_to_error____ = SubLObjectFactory.makeString("Skipping term ~A due to error:~% ~A.~%");
        $list239 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOWER"));
        $list240 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("detailedIsaParaphrase")));
        $str241$Doppelganger_ = SubLObjectFactory.makeString("Doppelganger-");
        $str242$_ = SubLObjectFactory.makeString("-");
        $sym243$DOPPELGANGER_P = SubLObjectFactory.makeSymbol("DOPPELGANGER-P");
        $str244$Slow_assertion___s = SubLObjectFactory.makeString("Slow assertion: ~s");
        $const245$doppelgangers = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers"));
        $const246$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $kw247$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw248$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw249$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str250$doppelgangers = SubLObjectFactory.makeString("doppelgangers");
        $ic251 = (SubLObject)SubLObjectFactory.makeGuid("c896b661-c145-11e1-9e60-00219b3ef414");
        $list252 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")));
        $list253 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionalPredicate")));
        $list254 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers")), (SubLObject)SubLObjectFactory.makeString("(#$doppelgangers ORIGINAL-TERM DOPPELGANGER) means that DOPPELGANGER was cloned from ORIGINAL-TERM."));
        $list255 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLClosedDenotationalTerm")));
        $list256 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2QuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLClosedDenotationalTerm")));
        $list257 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionalInArgs")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doppelgangers")), (SubLObject)leviathan.ONE_INTEGER);
    }
}

/*

	Total time: 7561 ms
	
*/